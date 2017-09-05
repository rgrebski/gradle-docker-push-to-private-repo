# gradle-docker-push-to-private-repo
Sample project showing how to push Docker images to private DockerHub repository using Circle CI<br>

See related post: <br>
http://www.stepwise.pl/blog/pushing-docker-images-private-repository-circle-ci


## Quick Start:
1)  Run
```bash
docker run -p 8080:8080 --rm rgrebski/gradle-docker-push-to-private-repo:v.0.1.0
```
2)  Open <a href="http://localhost:8080">http://localhost:8080</a>

## Using the code on your Circle CI account:
If you want to try the code yourself please set *DOCKER_USERNAME* and *DOCKER_PASSWORD* in circleCI project environment variables.
