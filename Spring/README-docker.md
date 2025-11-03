# Docker usage for demo Spring Boot app

Build the image (from repository root):

```bash
docker build -t demo-app Spring/
```

Run the container (maps port 8080):

```bash
docker run --rm -p 8080:8080 demo-app
```

Notes:
- The Dockerfile uses a multi-stage build: Maven in the first stage to produce the fat jar, then a slim JRE image to run it.
- If your project produces a differently named jar, the COPY in the Dockerfile copies any jar from `target/` to `/app/app.jar`.
