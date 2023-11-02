FROM node AS build
WORKDIR /usr/src/app
COPY package.json package-lock.json ./
RUN npm install --legacy-peer-deps --force
COPY . .
RUN npm run build --prod

FROM nginx:latest
COPY --from=build /usr/src/app/dist/crudtuto-Front /usr/share/nginx/html
