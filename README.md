# Business Rule Engine

-Business Rule Engine - Sample application to apply rules based on product type. 


## Execution Flow
- Taking the makePayment.json as a sample input source.
- Read all applicable rules from repository.
- Execute all configured rules and based on mathcing criteria apply respective rule.
- Return all applied rules against products sent.

## Possible Improvement
- Dependency Injection.
- Handling of custome rules, which can not be configured in Json.
- Rule logic storage - currently all rules are stored in local data structures, these could be pushed to a central database from where all applicable rules against a product can be picked up.
- Error handling and logging.
- More Unit Tests.
