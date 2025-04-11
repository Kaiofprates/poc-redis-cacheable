#!/bin/bash

COMPOSE_FILE="docker-compose.yml"
SERVICE_NAME="redis"

start() {
  echo "🚀 Iniciando Redis com docker-compose..."
  docker-compose -f $COMPOSE_FILE up -d $SERVICE_NAME
  echo "✅ Redis iniciado em background."

  if [[ "$1" == "--cli" ]]; then
    echo "💻 Abrindo terminal Redis (redis-cli)..."
    docker-compose -f $COMPOSE_FILE exec $SERVICE_NAME redis-cli
  fi
}

stop() {
  echo "🧹 Parando e removendo container Redis..."
  docker-compose -f $COMPOSE_FILE stop $SERVICE_NAME
  docker-compose -f $COMPOSE_FILE rm -f $SERVICE_NAME
  echo "✅ Container Redis removido."
}

restart() {
  stop
  start
}

case "$1" in
  start)
    start $2
    ;;
  stop)
    stop
    ;;
  restart)
    restart
    ;;
  *)
    echo "Uso: $0 {start|stop|restart} [--cli]"
    exit 1
    ;;
esac
