
### DEV containers
```bash
docker-compose -f docker-compose.yml up -d
docker-compose -f docker-compose.yml down
```

### UAT containers
```bash
docker-compose -f docker-compose.yml -f docker-compose.uat.yml up -d
docker-compose -f docker-compose.yml -f docker-compose.uat.yml down
```