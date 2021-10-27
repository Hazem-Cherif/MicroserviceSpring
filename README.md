How to run?

Build all modules:
1- clean install for all the springboot projects.
DOCKER
2- build all the spring boot project with docker build - t microserviceName .
if you want to run one by one : docker run -p portname -t microservicename .
to run all the projects at the same time :
cd composeboard
cd docker-compose-userboard-app
cmd docker-compose up 





Important endpoints
http://localhost:8762 - Gateway (login/password: user/user)
http://localhost:8761 - Eureka Dashboard
http://localhost:3000/user
http://localhost:3001/certification 
http://localhost:3002/cours
http://localhost:3003/microskills
http://localhost:3004/user-node
