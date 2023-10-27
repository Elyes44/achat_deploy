# Use an official Node runtime as the base image
#FROM node:18.17

# Set the working directory in the container
#WORKDIR /app

# Copy package.json and package-lock.json
#COPY package*.json ./

#RUN npm install -g npm@10.2.1

# Install application dependencies
#RUN npm install --legacy-peer-deps --force

# Copy the rest of the application source code
#COPY . .

# Build the Angular app
#RUN npm run build

# Expose a port (if your application runs on a specific port)
#EXPOSE 80

# Start the Angular app
#CMD ["npm", "start"]  
# This is needed to build and compile our code 
# while generating the docker image
FROM node AS build
# Create a Virtual directory inside the docker image
WORKDIR /dist/src/app
# Copy files to virtual directory
COPY package.json package-lock.json ./
# Run command in Virtual directory
RUN npm cache clean --force
# Copy files from local machine to virtual directory in docker image
COPY . .
RUN npm install --legacy-peer-deps --force
RUN npm run build --prod


### STAGE 2:RUN ###
# Defining nginx image to be used
FROM nginx:latest AS ngi
# Copying compiled code and nginx config to different folder
# NOTE: This path may change according to your project's output folder 
COPY --from=build /dist/crudtuto-Front /usr/share/nginx/html
COPY /nginx.conf  /etc/nginx/conf.d/default.conf
# Exposing a port, here it means that inside the container 
# the app will be using Port 80 while running
EXPOSE 80
