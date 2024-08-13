## Spring Boot 3 - CSRF
## API Reference

### Csrf Controller

```http
  GET api/v1/csrf/create
```
#### Response
```http
  {
    "token": "yULMtwdRXrcsFwEIThF3T4ZzMEkcUTPd4rDIbeIf2-xUIR9LrHWugDIzZ4YBczRqezxDLr5AHXF4NQHw1YjxXYd97I8xF30q",
    "headerName": "X-XSRF-TOKEN",
    "parameterName": "_csrf"
  }
```

### Service Controller

```http
  POST api/v1/service/hello
```
#### Request Header
```http
  {
    "X-XSRF-TOKEN": "yULMtwdRXrcsFwEIThF3T4ZzMEkcUTPd4rDIbeIf2-xUIR9LrHWugDIzZ4YBczRqezxDLr5AHXF4NQHw1YjxXYd97I8xF30q"
  }
```
