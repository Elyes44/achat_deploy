# Use the official Node.js image as the base image
FROM node:16-alpine AS build

# Set the working directory
WORKDIR /app

# Copy the package.json and package-lock.json files to the container
COPY package*.json ./

# Install project dependencies
RUN npm install --force

# Copy the rest of the application code to the container
COPY . .

# Build the Angular app for production
RUN npm run build

# Your Dockerfile continues with the setup for your NGINX or other server
