FROM python:3.9-slim


RUN pip install Flask

COPY app.py .
COPY config.cfg /config/config.cfg
CMD ["flask", "run", "--host=0.0.0.0"]
