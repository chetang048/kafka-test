# Getting Started

### Sample Post Request 
Sample Curl Post Request for producing `game progress events` :

* `curl -X POST "http://localhost:8080/progress" -H "accept: */*" -H "Content-Type: application/json" -d "{\"userId\":1,\"gameId\":2,\"level\":3,\"role\":\"ADMIN\",\"timeSpent\":4,\"completionPercent\":100}"`

  