Este projeto usa Redis como cache com Spring Boot, e inclui suporte a configuração via `application.yml`, cache TTL, e uso de `@Cacheable`.

## 🚀 Tecnologias

- Java 17+ (ou 22, se for o caso)
- Spring Boot
- Redis
- Docker
- GitHub CLI

### start no cluster Redis (docker)
```sh
$ ./local-enviroment/start-container.sh start --cli
```