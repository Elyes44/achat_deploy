# Use an official Node runtime as the base image
FROM node:18.17

# Set the working directory in the container
WORKDIR /app

# Copy package.json and package-lock.json
COPY package*.json ./

RUN npm install -g npm@10.2.1

# Install application dependencies
RUN npm install --legacy-peer-deps --force

# Copy the rest of the application source code
COPY . .

# Build the Angular app
RUN npm run build

# Expose a port (if your application runs on a specific port)
EXPOSE 80

# Start the Angular app
CMD ["npm", "start"]
