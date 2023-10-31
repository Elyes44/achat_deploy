FROM node AS build
WORKDIR /usr/src/app
COPY package.json package-lock.json ./
#RUN npm cache clean --force
RUN npm install
#--legacy-peer-deps
COPY . .
RUN npm run build --prod



FROM nginx:latest-alpine
COPY --from=build /usr/src/app/dist/crudtuto-Front /usr/share/nginx/html
#COPY /nginx.conf  /etc/nginx/conf.d/default.conf
#EXPOSE 80
