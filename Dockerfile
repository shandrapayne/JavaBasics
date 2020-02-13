FROM java:8
ENV SCRIPT AddMeTogether
WORKDIR /app
COPY . .
CMD ["/app/startup.sh"]