## En el solution arquitect 
Tengo un cliente que tiene la necesidad de construir una plataforma de educacion online y lo que quiere es que esa aplicacion tenga una latencia de dos digitos a todas sus posibles usuarios hispanoablantes. Y quiere que su arquitectura este basada en microservicios, considerando la parte de ciseguridad y que sea rentable. Qué solucion de arquitectura le recomiendarias?

Lo puedo alojar en un s3 si es el frontend estatico y configurar el cloudflare su cdn y destribuyo su contenido (solo es rentable)

En c2 dentro de la instancia tengo mis microservicios, si los tengo en contenedores

### Herramientas para comandos en AWS
* El de gente al amor al arte
* https://awsclibuilder.com/home
* El del mismo AWS
* https://docs.aws.amazon.com/cli/latest/
### Material de interes
* https://drive.google.com/drive/folders/15ymlmiwnQNAjQxELsu3jITuV6mRP30lD
## Creando bucket S3
Los nombres son unicos en el mundo y mas alla de poner publico en configuraciones del bucket hay que ir a esta pagina:
bucket policy for static website 

Dale ojeada al nombre:
https://docs.aws.amazon.com/AmazonS3/latest/userguide/WebsiteAccessPermissionsReqd.html 
ARN del bucket

arn:aws:s3:::aplicaciones-open-source
```JSON
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "PublicReadGetObject",
            "Effect": "Allow",
            "Principal": "*",
            "Action": "s3:GetObject",
            "Resource": "arn:aws:s3:::aplicaciones-open-source/*"
        }
    ]
}
```
## Creando maquina virtual c2
Para levantar una c2 necesitamos una Virtual Private Cloud (VPC) en una red, VPC es como una ip
