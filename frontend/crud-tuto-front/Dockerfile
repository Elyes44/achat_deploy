FROM node:18.16 as build
WORKDIR /app
COPY . .
RUN npm install
RUN npm run build --prod
FROM nginx:alpine
COPY --from=build /app/dist/angular-app /usr/share/nginx/html
EXPOSE 8060
