# PoC_ECR
Aplicacion Spring Boot , Dockerizada y llevada a ECR de AWS

Para llevar a cabo la puesta en marcha de nuestra PoC es necesario que tengamos instalado el CLI de AWS y  tener un usuario con privilegios de para acceder al servicio de ECR.


La instalación de CLI de AWS, que nos permitirá interactuar desde una consola local con la cuenta de AWS que tengamos, y para crear el usuario , nos dirigimos a la session en AWS del servicio IAM , donde crearemos un usuario y le adicionamos a este, un Access Key, este lo almacenaremos cuidadosamente, y por medio de este nos logearemos con los servicios de AWS.

Para este sección de Login, próximamente tendremos un repo con esta guia, por el momento en necesario ya tener login con AWS desde la consola.

Les comparto una guia sencilla para ECS https://medium.com/@ariklevliber/aws-fargate-from-start-to-finish-for-a-nodejs-app-9a0e5fbf6361
