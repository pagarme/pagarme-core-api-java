# Getting started

Pagarme API

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

## How to Use

The following section explains how to use the PagarmeCoreApi library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *PagarmeCoreApiLib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

Clicking the ``` Add ``` button will open a dialog where you need to specify PagarmeCoreApi in ``` Group Id ``` and PagarmeCoreApiLib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=PagarmeCoreApi-Java&workspaceName=PagarmeCoreApi&projectName=PagarmeCoreApiLib&rootNamespace=me.pagar.api)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *PagarmeCoreApiLib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| basicAuthUserName | The username to use with basic authentication |
| basicAuthPassword | The password to use with basic authentication |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String basicAuthUserName = "basicAuthUserName"; // The username to use with basic authentication
String basicAuthPassword = "basicAuthPassword"; // The password to use with basic authentication

PagarmeCoreApiClient client = new PagarmeCoreApiClient(basicAuthUserName, basicAuthPassword);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [SubscriptionsController](#subscriptions_controller)
* [OrdersController](#orders_controller)
* [PlansController](#plans_controller)
* [InvoicesController](#invoices_controller)
* [CustomersController](#customers_controller)
* [ChargesController](#charges_controller)
* [RecipientsController](#recipients_controller)
* [TokensController](#tokens_controller)
* [TransfersController](#transfers_controller)
* [TransactionsController](#transactions_controller)

## <a name="subscriptions_controller"></a>![Class: ](https://apidocs.io/img/class.png "me.pagar.api.controllers.SubscriptionsController") SubscriptionsController

### Get singleton instance

The singleton instance of the ``` SubscriptionsController ``` class can be accessed from the API Client.

```java
SubscriptionsController subscriptions = client.getSubscriptions();
```

### <a name="update_subscription_card_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateSubscriptionCardAsync") updateSubscriptionCardAsync

> Updates the credit card from a subscription


```java
void updateSubscriptionCardAsync(
        final String subscriptionId,
        final UpdateSubscriptionCardRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| body |  ``` Required ```  | Request for updating a card |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionCardRequest body = new UpdateSubscriptionCardRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionCardAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_an_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.createAnUsageAsync") createAnUsageAsync

> Create Usage


```java
void createAnUsageAsync(
        final String subscriptionId,
        final String itemId,
        final String idempotencyKey,
        final APICallBack<GetUsageResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| itemId |  ``` Required ```  | Item id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String itemId = "item_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
subscriptions.createAnUsageAsync(subscriptionId, itemId, idempotencyKey, new APICallBack<GetUsageResponse>() {
    public void onSuccess(HttpContext context, GetUsageResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_subscription_payment_method_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateSubscriptionPaymentMethodAsync") updateSubscriptionPaymentMethodAsync

> Updates the payment method from a subscription


```java
void updateSubscriptionPaymentMethodAsync(
        final String subscriptionId,
        final UpdateSubscriptionPaymentMethodRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| body |  ``` Required ```  | Request for updating the paymentmethod from a subscription |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionPaymentMethodRequest body = new UpdateSubscriptionPaymentMethodRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionPaymentMethodAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.createSubscriptionItemAsync") createSubscriptionItemAsync

> Creates a new Subscription item


```java
void createSubscriptionItemAsync(
        final String subscriptionId,
        final CreateSubscriptionItemRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| body |  ``` Required ```  | Request for creating a subscription item |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    CreateSubscriptionItemRequest body = new CreateSubscriptionItemRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.createSubscriptionItemAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetSubscriptionItemResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getSubscriptionItemAsync") getSubscriptionItemAsync

> Get Subscription Item


```java
void getSubscriptionItemAsync(
        final String subscriptionId,
        final String itemId,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| itemId |  ``` Required ```  | Item id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String itemId = "item_id";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionItemAsync(subscriptionId, itemId, new APICallBack<GetSubscriptionItemResponse>() {
    public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_subscription_affiliation_id_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateSubscriptionAffiliationIdAsync") updateSubscriptionAffiliationIdAsync

> UpdateSubscriptionAffiliationId


```java
void updateSubscriptionAffiliationIdAsync(
        final String subscriptionId,
        final UpdateSubscriptionAffiliationIdRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | Request for updating a subscription affiliation id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionAffiliationIdRequest body = new UpdateSubscriptionAffiliationIdRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionAffiliationIdAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_increments_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getIncrementsAsync") getIncrementsAsync

> GetIncrements


```java
void getIncrementsAsync(
        final String subscriptionId,
        final Integer page,
        final Integer size,
        final APICallBack<ListIncrementsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
String subscriptionId = "subscription_id";
Integer page = 20;
Integer size = 20;
// Invoking the API call with sample inputs
subscriptions.getIncrementsAsync(subscriptionId, page, size, new APICallBack<ListIncrementsResponse>() {
    public void onSuccess(HttpContext context, ListIncrementsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_subscription_due_days_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateSubscriptionDueDaysAsync") updateSubscriptionDueDaysAsync

> Updates the boleto due days from a subscription


```java
void updateSubscriptionDueDaysAsync(
        final String subscriptionId,
        final UpdateSubscriptionDueDaysRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| body |  ``` Required ```  | TODO: Add a parameter description |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionDueDaysRequest body = new UpdateSubscriptionDueDaysRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionDueDaysAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_subscription_start_at_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateSubscriptionStartAtAsync") updateSubscriptionStartAtAsync

> Updates the start at date from a subscription


```java
void updateSubscriptionStartAtAsync(
        final String subscriptionId,
        final UpdateSubscriptionStartAtRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| body |  ``` Required ```  | Request for updating the subscription start date |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionStartAtRequest body = new UpdateSubscriptionStartAtRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionStartAtAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_subscription_cycle_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getSubscriptionCycleByIdAsync") getSubscriptionCycleByIdAsync

> GetSubscriptionCycleById


```java
void getSubscriptionCycleByIdAsync(
        final String subscriptionId,
        final String cycleId,
        final APICallBack<GetPeriodResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| cycleId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String cycleId = "cycleId";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionCycleByIdAsync(subscriptionId, cycleId, new APICallBack<GetPeriodResponse>() {
    public void onSuccess(HttpContext context, GetPeriodResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_discount_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.deleteDiscountAsync") deleteDiscountAsync

> Deletes a discount


```java
void deleteDiscountAsync(
        final String subscriptionId,
        final String discountId,
        final String idempotencyKey,
        final APICallBack<GetDiscountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| discountId |  ``` Required ```  | Discount Id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String discountId = "discount_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
subscriptions.deleteDiscountAsync(subscriptionId, discountId, idempotencyKey, new APICallBack<GetDiscountResponse>() {
    public void onSuccess(HttpContext context, GetDiscountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_subscription_items_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getSubscriptionItemsAsync") getSubscriptionItemsAsync

> Get Subscription Items


```java
void getSubscriptionItemsAsync(
        final String subscriptionId,
        final Integer page,
        final Integer size,
        final String name,
        final String code,
        final String status,
        final String description,
        final String createdSince,
        final String createdUntil,
        final APICallBack<ListSubscriptionItemsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| name |  ``` Optional ```  | The item name |
| code |  ``` Optional ```  | Identification code in the client system |
| status |  ``` Optional ```  | The item statis |
| description |  ``` Optional ```  | The item description |
| createdSince |  ``` Optional ```  | Filter for item's creation date start range |
| createdUntil |  ``` Optional ```  | Filter for item's creation date end range |


#### Example Usage

```java
String subscriptionId = "subscription_id";
Integer page = 20;
Integer size = 20;
String name = "name";
String code = "code";
String status = "status";
String description = "description";
String createdSince = "created_since";
String createdUntil = "created_until";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionItemsAsync(subscriptionId, page, size, name, code, status, description, createdSince, createdUntil, new APICallBack<ListSubscriptionItemsResponse>() {
    public void onSuccess(HttpContext context, ListSubscriptionItemsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateSubscriptionItemAsync") updateSubscriptionItemAsync

> Updates a subscription item


```java
void updateSubscriptionItemAsync(
        final String subscriptionId,
        final String itemId,
        final UpdateSubscriptionItemRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| itemId |  ``` Required ```  | Item id |
| body |  ``` Required ```  | Request for updating a subscription item |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    String itemId = "item_id";
    UpdateSubscriptionItemRequest body = new UpdateSubscriptionItemRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionItemAsync(subscriptionId, itemId, body, idempotencyKey, new APICallBack<GetSubscriptionItemResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.createSubscriptionAsync") createSubscriptionAsync

> Creates a new subscription


```java
void createSubscriptionAsync(
        final CreateSubscriptionRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a subscription |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    CreateSubscriptionRequest body = new CreateSubscriptionRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.createSubscriptionAsync(body, idempotencyKey, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_discount_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getDiscountByIdAsync") getDiscountByIdAsync

> GetDiscountById


```java
void getDiscountByIdAsync(
        final String subscriptionId,
        final String discountId,
        final APICallBack<GetDiscountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| discountId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String discountId = "discountId";
// Invoking the API call with sample inputs
subscriptions.getDiscountByIdAsync(subscriptionId, discountId, new APICallBack<GetDiscountResponse>() {
    public void onSuccess(HttpContext context, GetDiscountResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_subscription_billing_date_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateSubscriptionBillingDateAsync") updateSubscriptionBillingDateAsync

> Updates the billing date from a subscription


```java
void updateSubscriptionBillingDateAsync(
        final String subscriptionId,
        final UpdateSubscriptionBillingDateRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| body |  ``` Required ```  | Request for updating the subscription billing date |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionBillingDateRequest body = new UpdateSubscriptionBillingDateRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionBillingDateAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_latest_period_end_at_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateLatestPeriodEndAtAsync") updateLatestPeriodEndAtAsync

> UpdateLatestPeriodEndAt


```java
void updateLatestPeriodEndAtAsync(
        final String subscriptionId,
        final UpdateCurrentCycleEndDateRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | Request for updating the end date of the current signature cycle |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateCurrentCycleEndDateRequest body = new UpdateCurrentCycleEndDateRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateLatestPeriodEndAtAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_discount_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.createDiscountAsync") createDiscountAsync

> Creates a discount


```java
void createDiscountAsync(
        final String subscriptionId,
        final CreateDiscountRequest body,
        final String idempotencyKey,
        final APICallBack<GetDiscountResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| body |  ``` Required ```  | Request for creating a discount |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    CreateDiscountRequest body = new CreateDiscountRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.createDiscountAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetDiscountResponse>() {
        public void onSuccess(HttpContext context, GetDiscountResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.deleteUsageAsync") deleteUsageAsync

> Deletes a usage


```java
void deleteUsageAsync(
        final String subscriptionId,
        final String itemId,
        final String usageId,
        final String idempotencyKey,
        final APICallBack<GetUsageResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| itemId |  ``` Required ```  | The subscription item id |
| usageId |  ``` Required ```  | The usage id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String itemId = "item_id";
String usageId = "usage_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
subscriptions.deleteUsageAsync(subscriptionId, itemId, usageId, idempotencyKey, new APICallBack<GetUsageResponse>() {
    public void onSuccess(HttpContext context, GetUsageResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_usages_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getUsagesAsync") getUsagesAsync

> Lists all usages from a subscription item


```java
void getUsagesAsync(
        final String subscriptionId,
        final String itemId,
        final Integer page,
        final Integer size,
        final String code,
        final String group,
        final DateTime usedSince,
        final DateTime usedUntil,
        final APICallBack<ListUsagesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| itemId |  ``` Required ```  | The subscription item id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| code |  ``` Optional ```  | Identification code in the client system |
| group |  ``` Optional ```  | Identification group in the client system |
| usedSince |  ``` Optional ```  | TODO: Add a parameter description |
| usedUntil |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String itemId = "item_id";
Integer page = 20;
Integer size = 20;
String code = "code";
String group = "group";
DateTime usedSince = new Date();
DateTime usedUntil = new Date();
// Invoking the API call with sample inputs
subscriptions.getUsagesAsync(subscriptionId, itemId, page, size, code, group, usedSince, usedUntil, new APICallBack<ListUsagesResponse>() {
    public void onSuccess(HttpContext context, ListUsagesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_current_cycle_status_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateCurrentCycleStatusAsync") updateCurrentCycleStatusAsync

> UpdateCurrentCycleStatus


```java
void updateCurrentCycleStatusAsync(
        final String subscriptionId,
        final UpdateCurrentCycleStatusRequest body,
        final String idempotencyKey,
        final APICallBack<Object> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| body |  ``` Required ```  | Request for updating the end date of the subscription current status |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateCurrentCycleStatusRequest body = new UpdateCurrentCycleStatusRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateCurrentCycleStatusAsync(subscriptionId, body, idempotencyKey, new APICallBack<void>() {
        public void onSuccess(HttpContext context, void response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="cancel_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.cancelSubscriptionAsync") cancelSubscriptionAsync

> Cancels a subscription


```java
void cancelSubscriptionAsync(
        final String subscriptionId,
        final String idempotencyKey,
        final CreateCancelSubscriptionRequest body,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |
| body |  ``` Optional ```  | Request for cancelling a subscription |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    String idempotencyKey = "idempotency-key";
    CreateCancelSubscriptionRequest body = new CreateCancelSubscriptionRequest();
    // Invoking the API call with sample inputs
    subscriptions.cancelSubscriptionAsync(subscriptionId, idempotencyKey, body, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_increment_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.createIncrementAsync") createIncrementAsync

> Creates a increment


```java
void createIncrementAsync(
        final String subscriptionId,
        final CreateIncrementRequest body,
        final String idempotencyKey,
        final APICallBack<GetIncrementResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| body |  ``` Required ```  | Request for creating a increment |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    CreateIncrementRequest body = new CreateIncrementRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.createIncrementAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetIncrementResponse>() {
        public void onSuccess(HttpContext context, GetIncrementResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_subscription_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateSubscriptionMetadataAsync") updateSubscriptionMetadataAsync

> Updates the metadata from a subscription


```java
void updateSubscriptionMetadataAsync(
        final String subscriptionId,
        final UpdateMetadataRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| body |  ``` Required ```  | Request for updating the subscrption metadata |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateMetadataRequest body = new UpdateMetadataRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionMetadataAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_discounts_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getDiscountsAsync") getDiscountsAsync

> GetDiscounts


```java
void getDiscountsAsync(
        final String subscriptionId,
        final int page,
        final int size,
        final APICallBack<ListDiscountsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription id |
| page |  ``` Required ```  | Page number |
| size |  ``` Required ```  | Page size |


#### Example Usage

```java
String subscriptionId = "subscription_id";
int page = 20;
int size = 20;
// Invoking the API call with sample inputs
subscriptions.getDiscountsAsync(subscriptionId, page, size, new APICallBack<ListDiscountsResponse>() {
    public void onSuccess(HttpContext context, ListDiscountsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_subscription_minium_price_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateSubscriptionMiniumPriceAsync") updateSubscriptionMiniumPriceAsync

> Atualização do valor mínimo da assinatura


```java
void updateSubscriptionMiniumPriceAsync(
        final String subscriptionId,
        final UpdateSubscriptionMinimumPriceRequest body,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| body |  ``` Required ```  | Request da requisição com o valor mínimo que será configurado |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    UpdateSubscriptionMinimumPriceRequest body = new UpdateSubscriptionMinimumPriceRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    subscriptions.updateSubscriptionMiniumPriceAsync(subscriptionId, body, idempotencyKey, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_split_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.updateSplitSubscriptionAsync") updateSplitSubscriptionAsync

> UpdateSplitSubscription


```java
void updateSplitSubscriptionAsync(
        final String id,
        final UpdateSubscriptionSplitRequest body,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | Subscription's id |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String id = "id";
    UpdateSubscriptionSplitRequest body = new UpdateSubscriptionSplitRequest();
    // Invoking the API call with sample inputs
    subscriptions.updateSplitSubscriptionAsync(id, body, new APICallBack<GetSubscriptionResponse>() {
        public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_subscriptions_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getSubscriptionsAsync") getSubscriptionsAsync

> Gets all subscriptions


```java
void getSubscriptionsAsync(
        final Integer page,
        final Integer size,
        final String code,
        final String billingType,
        final String customerId,
        final String planId,
        final String cardId,
        final String status,
        final DateTime nextBillingSince,
        final DateTime nextBillingUntil,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListSubscriptionsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| code |  ``` Optional ```  | Filter for subscription's code |
| billingType |  ``` Optional ```  | Filter for subscription's billing type |
| customerId |  ``` Optional ```  | Filter for subscription's customer id |
| planId |  ``` Optional ```  | Filter for subscription's plan id |
| cardId |  ``` Optional ```  | Filter for subscription's card id |
| status |  ``` Optional ```  | Filter for subscription's status |
| nextBillingSince |  ``` Optional ```  | Filter for subscription's next billing date start range |
| nextBillingUntil |  ``` Optional ```  | Filter for subscription's next billing date end range |
| createdSince |  ``` Optional ```  | Filter for subscription's creation date start range |
| createdUntil |  ``` Optional ```  | Filter for subscriptions creation date end range |


#### Example Usage

```java
Integer page = 20;
Integer size = 20;
String code = "code";
String billingType = "billing_type";
String customerId = "customer_id";
String planId = "plan_id";
String cardId = "card_id";
String status = "status";
DateTime nextBillingSince = new Date();
DateTime nextBillingUntil = new Date();
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
subscriptions.getSubscriptionsAsync(page, size, code, billingType, customerId, planId, cardId, status, nextBillingSince, nextBillingUntil, createdSince, createdUntil, new APICallBack<ListSubscriptionsResponse>() {
    public void onSuccess(HttpContext context, ListSubscriptionsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getSubscriptionAsync") getSubscriptionAsync

> Gets a subscription


```java
void getSubscriptionAsync(
        final String subscriptionId,
        final APICallBack<GetSubscriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionAsync(subscriptionId, new APICallBack<GetSubscriptionResponse>() {
    public void onSuccess(HttpContext context, GetSubscriptionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_increment_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.deleteIncrementAsync") deleteIncrementAsync

> Deletes a increment


```java
void deleteIncrementAsync(
        final String subscriptionId,
        final String incrementId,
        final String idempotencyKey,
        final APICallBack<GetIncrementResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| incrementId |  ``` Required ```  | Increment id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String incrementId = "increment_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
subscriptions.deleteIncrementAsync(subscriptionId, incrementId, idempotencyKey, new APICallBack<GetIncrementResponse>() {
    public void onSuccess(HttpContext context, GetIncrementResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_increment_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getIncrementByIdAsync") getIncrementByIdAsync

> GetIncrementById


```java
void getIncrementByIdAsync(
        final String subscriptionId,
        final String incrementId,
        final APICallBack<GetIncrementResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription Id |
| incrementId |  ``` Required ```  | The increment Id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String incrementId = "increment_id";
// Invoking the API call with sample inputs
subscriptions.getIncrementByIdAsync(subscriptionId, incrementId, new APICallBack<GetIncrementResponse>() {
    public void onSuccess(HttpContext context, GetIncrementResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_subscription_cycles_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getSubscriptionCyclesAsync") getSubscriptionCyclesAsync

> GetSubscriptionCycles


```java
void getSubscriptionCyclesAsync(
        final String subscriptionId,
        final String page,
        final String size,
        final APICallBack<ListCyclesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| page |  ``` Required ```  | Page number |
| size |  ``` Required ```  | Page size |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String page = "page";
String size = "size";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionCyclesAsync(subscriptionId, page, size, new APICallBack<ListCyclesResponse>() {
    public void onSuccess(HttpContext context, ListCyclesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="renew_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.renewSubscriptionAsync") renewSubscriptionAsync

> RenewSubscription


```java
void renewSubscriptionAsync(
        final String subscriptionId,
        final String idempotencyKey,
        final APICallBack<GetPeriodResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | TODO: Add a parameter description |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
subscriptions.renewSubscriptionAsync(subscriptionId, idempotencyKey, new APICallBack<GetPeriodResponse>() {
    public void onSuccess(HttpContext context, GetPeriodResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_subscription_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.deleteSubscriptionItemAsync") deleteSubscriptionItemAsync

> Deletes a subscription item


```java
void deleteSubscriptionItemAsync(
        final String subscriptionId,
        final String subscriptionItemId,
        final String idempotencyKey,
        final APICallBack<GetSubscriptionItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription id |
| subscriptionItemId |  ``` Required ```  | Subscription item id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String subscriptionItemId = "subscription_item_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
subscriptions.deleteSubscriptionItemAsync(subscriptionId, subscriptionItemId, idempotencyKey, new APICallBack<GetSubscriptionItemResponse>() {
    public void onSuccess(HttpContext context, GetSubscriptionItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_usage_report_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.SubscriptionsController.getUsageReportAsync") getUsageReportAsync

> GetUsageReport


```java
void getUsageReportAsync(
        final String subscriptionId,
        final String periodId,
        final APICallBack<GetUsageReportResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | The subscription Id |
| periodId |  ``` Required ```  | The period Id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
String periodId = "period_id";
// Invoking the API call with sample inputs
subscriptions.getUsageReportAsync(subscriptionId, periodId, new APICallBack<GetUsageReportResponse>() {
    public void onSuccess(HttpContext context, GetUsageReportResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



[Back to List of Controllers](#list_of_controllers)

## <a name="orders_controller"></a>![Class: ](https://apidocs.io/img/class.png "me.pagar.api.controllers.OrdersController") OrdersController

### Get singleton instance

The singleton instance of the ``` OrdersController ``` class can be accessed from the API Client.

```java
OrdersController orders = client.getOrders();
```

### <a name="get_orders_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.OrdersController.getOrdersAsync") getOrdersAsync

> Gets all orders


```java
void getOrdersAsync(
        final Integer page,
        final Integer size,
        final String code,
        final String status,
        final DateTime createdSince,
        final DateTime createdUntil,
        final String customerId,
        final APICallBack<ListOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| code |  ``` Optional ```  | Filter for order's code |
| status |  ``` Optional ```  | Filter for order's status |
| createdSince |  ``` Optional ```  | Filter for order's creation date start range |
| createdUntil |  ``` Optional ```  | Filter for order's creation date end range |
| customerId |  ``` Optional ```  | Filter for order's customer id |


#### Example Usage

```java
Integer page = 20;
Integer size = 20;
String code = "code";
String status = "status";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
String customerId = "customer_id";
// Invoking the API call with sample inputs
orders.getOrdersAsync(page, size, code, status, createdSince, createdUntil, customerId, new APICallBack<ListOrderResponse>() {
    public void onSuccess(HttpContext context, ListOrderResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_order_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.OrdersController.createOrderAsync") createOrderAsync

> Creates a new Order


```java
void createOrderAsync(
        final CreateOrderRequest body,
        final String idempotencyKey,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating an order |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    CreateOrderRequest body = new CreateOrderRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    orders.createOrderAsync(body, idempotencyKey, new APICallBack<GetOrderResponse>() {
        public void onSuccess(HttpContext context, GetOrderResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_order_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.OrdersController.createOrderItemAsync") createOrderItemAsync

> CreateOrderItem


```java
void createOrderItemAsync(
        final String orderId,
        final CreateOrderItemRequest body,
        final String idempotencyKey,
        final APICallBack<GetOrderItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order Id |
| body |  ``` Required ```  | Order Item Model |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String orderId = "orderId";
    CreateOrderItemRequest body = new CreateOrderItemRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    orders.createOrderItemAsync(orderId, body, idempotencyKey, new APICallBack<GetOrderItemResponse>() {
        public void onSuccess(HttpContext context, GetOrderItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_order_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.OrdersController.getOrderItemAsync") getOrderItemAsync

> GetOrderItem


```java
void getOrderItemAsync(
        final String orderId,
        final String itemId,
        final APICallBack<GetOrderItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order Id |
| itemId |  ``` Required ```  | Item Id |


#### Example Usage

```java
String orderId = "orderId";
String itemId = "itemId";
// Invoking the API call with sample inputs
orders.getOrderItemAsync(orderId, itemId, new APICallBack<GetOrderItemResponse>() {
    public void onSuccess(HttpContext context, GetOrderItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_order_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.OrdersController.deleteOrderItemAsync") deleteOrderItemAsync

> DeleteOrderItem


```java
void deleteOrderItemAsync(
        final String orderId,
        final String itemId,
        final String idempotencyKey,
        final APICallBack<GetOrderItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order Id |
| itemId |  ``` Required ```  | Item Id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String orderId = "orderId";
String itemId = "itemId";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
orders.deleteOrderItemAsync(orderId, itemId, idempotencyKey, new APICallBack<GetOrderItemResponse>() {
    public void onSuccess(HttpContext context, GetOrderItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_order_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.OrdersController.updateOrderMetadataAsync") updateOrderMetadataAsync

> Updates the metadata from an order


```java
void updateOrderMetadataAsync(
        final String orderId,
        final UpdateMetadataRequest body,
        final String idempotencyKey,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | The order id |
| body |  ``` Required ```  | Request for updating the order metadata |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String orderId = "order_id";
    UpdateMetadataRequest body = new UpdateMetadataRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    orders.updateOrderMetadataAsync(orderId, body, idempotencyKey, new APICallBack<GetOrderResponse>() {
        public void onSuccess(HttpContext context, GetOrderResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_all_order_items_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.OrdersController.deleteAllOrderItemsAsync") deleteAllOrderItemsAsync

> DeleteAllOrderItems


```java
void deleteAllOrderItemsAsync(
        final String orderId,
        final String idempotencyKey,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order Id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String orderId = "orderId";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
orders.deleteAllOrderItemsAsync(orderId, idempotencyKey, new APICallBack<GetOrderResponse>() {
    public void onSuccess(HttpContext context, GetOrderResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_order_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.OrdersController.updateOrderItemAsync") updateOrderItemAsync

> UpdateOrderItem


```java
void updateOrderItemAsync(
        final String orderId,
        final String itemId,
        final UpdateOrderItemRequest body,
        final String idempotencyKey,
        final APICallBack<GetOrderItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order Id |
| itemId |  ``` Required ```  | Item Id |
| body |  ``` Required ```  | Item Model |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String orderId = "orderId";
    String itemId = "itemId";
    UpdateOrderItemRequest body = new UpdateOrderItemRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    orders.updateOrderItemAsync(orderId, itemId, body, idempotencyKey, new APICallBack<GetOrderItemResponse>() {
        public void onSuccess(HttpContext context, GetOrderItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="close_order_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.OrdersController.closeOrderAsync") closeOrderAsync

> CloseOrder


```java
void closeOrderAsync(
        final String id,
        final UpdateOrderStatusRequest body,
        final String idempotencyKey,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | Order Id |
| body |  ``` Required ```  | Update Order Model |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String id = "id";
    UpdateOrderStatusRequest body = new UpdateOrderStatusRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    orders.closeOrderAsync(id, body, idempotencyKey, new APICallBack<GetOrderResponse>() {
        public void onSuccess(HttpContext context, GetOrderResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_order_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.OrdersController.getOrderAsync") getOrderAsync

> Gets an order


```java
void getOrderAsync(
        final String orderId,
        final APICallBack<GetOrderResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| orderId |  ``` Required ```  | Order id |


#### Example Usage

```java
String orderId = "order_id";
// Invoking the API call with sample inputs
orders.getOrderAsync(orderId, new APICallBack<GetOrderResponse>() {
    public void onSuccess(HttpContext context, GetOrderResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



[Back to List of Controllers](#list_of_controllers)

## <a name="plans_controller"></a>![Class: ](https://apidocs.io/img/class.png "me.pagar.api.controllers.PlansController") PlansController

### Get singleton instance

The singleton instance of the ``` PlansController ``` class can be accessed from the API Client.

```java
PlansController plans = client.getPlans();
```

### <a name="get_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.PlansController.getPlanAsync") getPlanAsync

> Gets a plan


```java
void getPlanAsync(
        final String planId,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |


#### Example Usage

```java
String planId = "plan_id";
// Invoking the API call with sample inputs
plans.getPlanAsync(planId, new APICallBack<GetPlanResponse>() {
    public void onSuccess(HttpContext context, GetPlanResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.PlansController.createPlanAsync") createPlanAsync

> Creates a new plan


```java
void createPlanAsync(
        final CreatePlanRequest body,
        final String idempotencyKey,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a plan |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    CreatePlanRequest body = new CreatePlanRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    plans.createPlanAsync(body, idempotencyKey, new APICallBack<GetPlanResponse>() {
        public void onSuccess(HttpContext context, GetPlanResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.PlansController.updatePlanAsync") updatePlanAsync

> Updates a plan


```java
void updatePlanAsync(
        final String planId,
        final UpdatePlanRequest body,
        final String idempotencyKey,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| body |  ``` Required ```  | Request for updating a plan |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String planId = "plan_id";
    UpdatePlanRequest body = new UpdatePlanRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    plans.updatePlanAsync(planId, body, idempotencyKey, new APICallBack<GetPlanResponse>() {
        public void onSuccess(HttpContext context, GetPlanResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.PlansController.getPlanItemAsync") getPlanItemAsync

> Gets a plan item


```java
void getPlanItemAsync(
        final String planId,
        final String planItemId,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| planItemId |  ``` Required ```  | Plan item id |


#### Example Usage

```java
String planId = "plan_id";
String planItemId = "plan_item_id";
// Invoking the API call with sample inputs
plans.getPlanItemAsync(planId, planItemId, new APICallBack<GetPlanItemResponse>() {
    public void onSuccess(HttpContext context, GetPlanItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.PlansController.createPlanItemAsync") createPlanItemAsync

> Adds a new item to a plan


```java
void createPlanItemAsync(
        final String planId,
        final CreatePlanItemRequest body,
        final String idempotencyKey,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| body |  ``` Required ```  | Request for creating a plan item |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String planId = "plan_id";
    CreatePlanItemRequest body = new CreatePlanItemRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    plans.createPlanItemAsync(planId, body, idempotencyKey, new APICallBack<GetPlanItemResponse>() {
        public void onSuccess(HttpContext context, GetPlanItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_plans_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.PlansController.getPlansAsync") getPlansAsync

> Gets all plans


```java
void getPlansAsync(
        final Integer page,
        final Integer size,
        final String name,
        final String status,
        final String billingType,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListPlansResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| name |  ``` Optional ```  | Filter for Plan's name |
| status |  ``` Optional ```  | Filter for Plan's status |
| billingType |  ``` Optional ```  | Filter for plan's billing type |
| createdSince |  ``` Optional ```  | Filter for plan's creation date start range |
| createdUntil |  ``` Optional ```  | Filter for plan's creation date end range |


#### Example Usage

```java
Integer page = 20;
Integer size = 20;
String name = "name";
String status = "status";
String billingType = "billing_type";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
plans.getPlansAsync(page, size, name, status, billingType, createdSince, createdUntil, new APICallBack<ListPlansResponse>() {
    public void onSuccess(HttpContext context, ListPlansResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_plan_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.PlansController.deletePlanAsync") deletePlanAsync

> Deletes a plan


```java
void deletePlanAsync(
        final String planId,
        final String idempotencyKey,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String planId = "plan_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
plans.deletePlanAsync(planId, idempotencyKey, new APICallBack<GetPlanResponse>() {
    public void onSuccess(HttpContext context, GetPlanResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_plan_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.PlansController.updatePlanMetadataAsync") updatePlanMetadataAsync

> Updates the metadata from a plan


```java
void updatePlanMetadataAsync(
        final String planId,
        final UpdateMetadataRequest body,
        final String idempotencyKey,
        final APICallBack<GetPlanResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | The plan id |
| body |  ``` Required ```  | Request for updating the plan metadata |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String planId = "plan_id";
    UpdateMetadataRequest body = new UpdateMetadataRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    plans.updatePlanMetadataAsync(planId, body, idempotencyKey, new APICallBack<GetPlanResponse>() {
        public void onSuccess(HttpContext context, GetPlanResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.PlansController.updatePlanItemAsync") updatePlanItemAsync

> Updates a plan item


```java
void updatePlanItemAsync(
        final String planId,
        final String planItemId,
        final UpdatePlanItemRequest body,
        final String idempotencyKey,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| planItemId |  ``` Required ```  | Plan item id |
| body |  ``` Required ```  | Request for updating the plan item |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String planId = "plan_id";
    String planItemId = "plan_item_id";
    UpdatePlanItemRequest body = new UpdatePlanItemRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    plans.updatePlanItemAsync(planId, planItemId, body, idempotencyKey, new APICallBack<GetPlanItemResponse>() {
        public void onSuccess(HttpContext context, GetPlanItemResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_plan_item_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.PlansController.deletePlanItemAsync") deletePlanItemAsync

> Removes an item from a plan


```java
void deletePlanItemAsync(
        final String planId,
        final String planItemId,
        final String idempotencyKey,
        final APICallBack<GetPlanItemResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| planId |  ``` Required ```  | Plan id |
| planItemId |  ``` Required ```  | Plan item id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String planId = "plan_id";
String planItemId = "plan_item_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
plans.deletePlanItemAsync(planId, planItemId, idempotencyKey, new APICallBack<GetPlanItemResponse>() {
    public void onSuccess(HttpContext context, GetPlanItemResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



[Back to List of Controllers](#list_of_controllers)

## <a name="invoices_controller"></a>![Class: ](https://apidocs.io/img/class.png "me.pagar.api.controllers.InvoicesController") InvoicesController

### Get singleton instance

The singleton instance of the ``` InvoicesController ``` class can be accessed from the API Client.

```java
InvoicesController invoices = client.getInvoices();
```

### <a name="cancel_invoice_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.InvoicesController.cancelInvoiceAsync") cancelInvoiceAsync

> Cancels an invoice


```java
void cancelInvoiceAsync(
        final String invoiceId,
        final String idempotencyKey,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | Invoice id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String invoiceId = "invoice_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
invoices.cancelInvoiceAsync(invoiceId, idempotencyKey, new APICallBack<GetInvoiceResponse>() {
    public void onSuccess(HttpContext context, GetInvoiceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_invoice_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.InvoicesController.getInvoiceAsync") getInvoiceAsync

> Gets an invoice


```java
void getInvoiceAsync(
        final String invoiceId,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | Invoice Id |


#### Example Usage

```java
String invoiceId = "invoice_id";
// Invoking the API call with sample inputs
invoices.getInvoiceAsync(invoiceId, new APICallBack<GetInvoiceResponse>() {
    public void onSuccess(HttpContext context, GetInvoiceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_invoice_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.InvoicesController.createInvoiceAsync") createInvoiceAsync

> Create an Invoice


```java
void createInvoiceAsync(
        final String subscriptionId,
        final String cycleId,
        final String idempotencyKey,
        final CreateInvoiceRequest body,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |
| cycleId |  ``` Required ```  | Cycle Id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |
| body |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String subscriptionId = "subscription_id";
    String cycleId = "cycle_id";
    String idempotencyKey = "idempotency-key";
    CreateInvoiceRequest body = new CreateInvoiceRequest();
    // Invoking the API call with sample inputs
    invoices.createInvoiceAsync(subscriptionId, cycleId, idempotencyKey, body, new APICallBack<GetInvoiceResponse>() {
        public void onSuccess(HttpContext context, GetInvoiceResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_invoice_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.InvoicesController.updateInvoiceMetadataAsync") updateInvoiceMetadataAsync

> Updates the metadata from an invoice


```java
void updateInvoiceMetadataAsync(
        final String invoiceId,
        final UpdateMetadataRequest body,
        final String idempotencyKey,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | The invoice id |
| body |  ``` Required ```  | Request for updating the invoice metadata |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String invoiceId = "invoice_id";
    UpdateMetadataRequest body = new UpdateMetadataRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    invoices.updateInvoiceMetadataAsync(invoiceId, body, idempotencyKey, new APICallBack<GetInvoiceResponse>() {
        public void onSuccess(HttpContext context, GetInvoiceResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_invoices_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.InvoicesController.getInvoicesAsync") getInvoicesAsync

> Gets all invoices


```java
void getInvoicesAsync(
        final Integer page,
        final Integer size,
        final String code,
        final String customerId,
        final String subscriptionId,
        final DateTime createdSince,
        final DateTime createdUntil,
        final String status,
        final DateTime dueSince,
        final DateTime dueUntil,
        final String customerDocument,
        final APICallBack<ListInvoicesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| code |  ``` Optional ```  | Filter for Invoice's code |
| customerId |  ``` Optional ```  | Filter for Invoice's customer id |
| subscriptionId |  ``` Optional ```  | Filter for Invoice's subscription id |
| createdSince |  ``` Optional ```  | Filter for Invoice's creation date start range |
| createdUntil |  ``` Optional ```  | Filter for Invoices creation date end range |
| status |  ``` Optional ```  | Filter for Invoice's status |
| dueSince |  ``` Optional ```  | Filter for Invoice's due date start range |
| dueUntil |  ``` Optional ```  | Filter for Invoice's due date end range |
| customerDocument |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
Integer page = 20;
Integer size = 20;
String code = "code";
String customerId = "customer_id";
String subscriptionId = "subscription_id";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
String status = "status";
DateTime dueSince = new Date();
DateTime dueUntil = new Date();
String customerDocument = "customer_document";
// Invoking the API call with sample inputs
invoices.getInvoicesAsync(page, size, code, customerId, subscriptionId, createdSince, createdUntil, status, dueSince, dueUntil, customerDocument, new APICallBack<ListInvoicesResponse>() {
    public void onSuccess(HttpContext context, ListInvoicesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_partial_invoice_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.InvoicesController.getPartialInvoiceAsync") getPartialInvoiceAsync

> GetPartialInvoice


```java
void getPartialInvoiceAsync(
        final String subscriptionId,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionId |  ``` Required ```  | Subscription Id |


#### Example Usage

```java
String subscriptionId = "subscription_id";
// Invoking the API call with sample inputs
invoices.getPartialInvoiceAsync(subscriptionId, new APICallBack<GetInvoiceResponse>() {
    public void onSuccess(HttpContext context, GetInvoiceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_invoice_status_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.InvoicesController.updateInvoiceStatusAsync") updateInvoiceStatusAsync

> Updates the status from an invoice


```java
void updateInvoiceStatusAsync(
        final String invoiceId,
        final UpdateInvoiceStatusRequest body,
        final String idempotencyKey,
        final APICallBack<GetInvoiceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| invoiceId |  ``` Required ```  | Invoice Id |
| body |  ``` Required ```  | Request for updating an invoice's status |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String invoiceId = "invoice_id";
    UpdateInvoiceStatusRequest body = new UpdateInvoiceStatusRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    invoices.updateInvoiceStatusAsync(invoiceId, body, idempotencyKey, new APICallBack<GetInvoiceResponse>() {
        public void onSuccess(HttpContext context, GetInvoiceResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



[Back to List of Controllers](#list_of_controllers)

## <a name="customers_controller"></a>![Class: ](https://apidocs.io/img/class.png "me.pagar.api.controllers.CustomersController") CustomersController

### Get singleton instance

The singleton instance of the ``` CustomersController ``` class can be accessed from the API Client.

```java
CustomersController customers = client.getCustomers();
```

### <a name="delete_card_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.deleteCardAsync") deleteCardAsync

> Delete a customer's card


```java
void deleteCardAsync(
        final String customerId,
        final String cardId,
        final String idempotencyKey,
        final APICallBack<GetCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| cardId |  ``` Required ```  | Card Id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String customerId = "customer_id";
String cardId = "card_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
customers.deleteCardAsync(customerId, cardId, idempotencyKey, new APICallBack<GetCardResponse>() {
    public void onSuccess(HttpContext context, GetCardResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_address_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.updateAddressAsync") updateAddressAsync

> Updates an address


```java
void updateAddressAsync(
        final String customerId,
        final String addressId,
        final UpdateAddressRequest body,
        final String idempotencyKey,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| addressId |  ``` Required ```  | Address Id |
| body |  ``` Required ```  | Request for updating an address |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    String addressId = "address_id";
    UpdateAddressRequest body = new UpdateAddressRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    customers.updateAddressAsync(customerId, addressId, body, idempotencyKey, new APICallBack<GetAddressResponse>() {
        public void onSuccess(HttpContext context, GetAddressResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_address_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.getAddressAsync") getAddressAsync

> Get a customer's address


```java
void getAddressAsync(
        final String customerId,
        final String addressId,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| addressId |  ``` Required ```  | Address Id |


#### Example Usage

```java
String customerId = "customer_id";
String addressId = "address_id";
// Invoking the API call with sample inputs
customers.getAddressAsync(customerId, addressId, new APICallBack<GetAddressResponse>() {
    public void onSuccess(HttpContext context, GetAddressResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_access_tokens_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.getAccessTokensAsync") getAccessTokensAsync

> Get all access tokens from a customer


```java
void getAccessTokensAsync(
        final String customerId,
        final Integer page,
        final Integer size,
        final APICallBack<ListAccessTokensResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
String customerId = "customer_id";
Integer page = 20;
Integer size = 20;
// Invoking the API call with sample inputs
customers.getAccessTokensAsync(customerId, page, size, new APICallBack<ListAccessTokensResponse>() {
    public void onSuccess(HttpContext context, ListAccessTokensResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.updateCustomerAsync") updateCustomerAsync

> Updates a customer


```java
void updateCustomerAsync(
        final String customerId,
        final UpdateCustomerRequest body,
        final String idempotencyKey,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| body |  ``` Required ```  | Request for updating a customer |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    UpdateCustomerRequest body = new UpdateCustomerRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    customers.updateCustomerAsync(customerId, body, idempotencyKey, new APICallBack<GetCustomerResponse>() {
        public void onSuccess(HttpContext context, GetCustomerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="renew_card_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.renewCardAsync") renewCardAsync

> Renew a card


```java
void renewCardAsync(
        final String customerId,
        final String cardId,
        final String idempotencyKey,
        final APICallBack<GetCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| cardId |  ``` Required ```  | Card Id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String customerId = "customer_id";
String cardId = "card_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
customers.renewCardAsync(customerId, cardId, idempotencyKey, new APICallBack<GetCardResponse>() {
    public void onSuccess(HttpContext context, GetCardResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_customers_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.getCustomersAsync") getCustomersAsync

> Get all Customers


```java
void getCustomersAsync(
        final String name,
        final String document,
        final Integer page,
        final Integer size,
        final String email,
        final String code,
        final APICallBack<ListCustomersResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Optional ```  | Name of the Customer |
| document |  ``` Optional ```  | Document of the Customer |
| page |  ``` Optional ```  ``` DefaultValue ```  | Current page the the search |
| size |  ``` Optional ```  ``` DefaultValue ```  | Quantity pages of the search |
| email |  ``` Optional ```  | Customer's email |
| code |  ``` Optional ```  | Customer's code |


#### Example Usage

```java
String name = "name";
String document = "document";
Integer page = 1;
Integer size = 10;
String email = "email";
String code = "Code";
// Invoking the API call with sample inputs
customers.getCustomersAsync(name, document, page, size, email, code, new APICallBack<ListCustomersResponse>() {
    public void onSuccess(HttpContext context, ListCustomersResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_access_tokens_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.deleteAccessTokensAsync") deleteAccessTokensAsync

> Delete a Customer's access tokens


```java
void deleteAccessTokensAsync(
        final String customerId,
        final APICallBack<ListAccessTokensResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |


#### Example Usage

```java
String customerId = "customer_id";
// Invoking the API call with sample inputs
customers.deleteAccessTokensAsync(customerId, new APICallBack<ListAccessTokensResponse>() {
    public void onSuccess(HttpContext context, ListAccessTokensResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.getCustomerAsync") getCustomerAsync

> Get a customer


```java
void getCustomerAsync(
        final String customerId,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |


#### Example Usage

```java
String customerId = "customer_id";
// Invoking the API call with sample inputs
customers.getCustomerAsync(customerId, new APICallBack<GetCustomerResponse>() {
    public void onSuccess(HttpContext context, GetCustomerResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_card_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.updateCardAsync") updateCardAsync

> Updates a card


```java
void updateCardAsync(
        final String customerId,
        final String cardId,
        final UpdateCardRequest body,
        final String idempotencyKey,
        final APICallBack<GetCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| cardId |  ``` Required ```  | Card id |
| body |  ``` Required ```  | Request for updating a card |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    String cardId = "card_id";
    UpdateCardRequest body = new UpdateCardRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    customers.updateCardAsync(customerId, cardId, body, idempotencyKey, new APICallBack<GetCardResponse>() {
        public void onSuccess(HttpContext context, GetCardResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_address_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.deleteAddressAsync") deleteAddressAsync

> Delete a Customer's address


```java
void deleteAddressAsync(
        final String customerId,
        final String addressId,
        final String idempotencyKey,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| addressId |  ``` Required ```  | Address Id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String customerId = "customer_id";
String addressId = "address_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
customers.deleteAddressAsync(customerId, addressId, idempotencyKey, new APICallBack<GetAddressResponse>() {
    public void onSuccess(HttpContext context, GetAddressResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_access_token_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.createAccessTokenAsync") createAccessTokenAsync

> Creates a access token for a customer


```java
void createAccessTokenAsync(
        final String customerId,
        final CreateAccessTokenRequest body,
        final String idempotencyKey,
        final APICallBack<GetAccessTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| body |  ``` Required ```  | Request for creating a access token |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    CreateAccessTokenRequest body = new CreateAccessTokenRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    customers.createAccessTokenAsync(customerId, body, idempotencyKey, new APICallBack<GetAccessTokenResponse>() {
        public void onSuccess(HttpContext context, GetAccessTokenResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_address_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.createAddressAsync") createAddressAsync

> Creates a new address for a customer


```java
void createAddressAsync(
        final String customerId,
        final CreateAddressRequest body,
        final String idempotencyKey,
        final APICallBack<GetAddressResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| body |  ``` Required ```  | Request for creating an address |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    CreateAddressRequest body = new CreateAddressRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    customers.createAddressAsync(customerId, body, idempotencyKey, new APICallBack<GetAddressResponse>() {
        public void onSuccess(HttpContext context, GetAddressResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_cards_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.getCardsAsync") getCardsAsync

> Get all cards from a customer


```java
void getCardsAsync(
        final String customerId,
        final Integer page,
        final Integer size,
        final APICallBack<ListCardsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
String customerId = "customer_id";
Integer page = 234;
Integer size = 234;
// Invoking the API call with sample inputs
customers.getCardsAsync(customerId, page, size, new APICallBack<ListCardsResponse>() {
    public void onSuccess(HttpContext context, ListCardsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_customer_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.updateCustomerMetadataAsync") updateCustomerMetadataAsync

> Updates the metadata a customer


```java
void updateCustomerMetadataAsync(
        final String customerId,
        final UpdateMetadataRequest body,
        final String idempotencyKey,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | The customer id |
| body |  ``` Required ```  | Request for updating the customer metadata |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    UpdateMetadataRequest body = new UpdateMetadataRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    customers.updateCustomerMetadataAsync(customerId, body, idempotencyKey, new APICallBack<GetCustomerResponse>() {
        public void onSuccess(HttpContext context, GetCustomerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_card_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.getCardAsync") getCardAsync

> Get a customer's card


```java
void getCardAsync(
        final String customerId,
        final String cardId,
        final APICallBack<GetCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| cardId |  ``` Required ```  | Card id |


#### Example Usage

```java
String customerId = "customer_id";
String cardId = "card_id";
// Invoking the API call with sample inputs
customers.getCardAsync(customerId, cardId, new APICallBack<GetCardResponse>() {
    public void onSuccess(HttpContext context, GetCardResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="delete_access_token_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.deleteAccessTokenAsync") deleteAccessTokenAsync

> Delete a customer's access token


```java
void deleteAccessTokenAsync(
        final String customerId,
        final String tokenId,
        final String idempotencyKey,
        final APICallBack<GetAccessTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| tokenId |  ``` Required ```  | Token Id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String customerId = "customer_id";
String tokenId = "token_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
customers.deleteAccessTokenAsync(customerId, tokenId, idempotencyKey, new APICallBack<GetAccessTokenResponse>() {
    public void onSuccess(HttpContext context, GetAccessTokenResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_access_token_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.getAccessTokenAsync") getAccessTokenAsync

> Get a Customer's access token


```java
void getAccessTokenAsync(
        final String customerId,
        final String tokenId,
        final APICallBack<GetAccessTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer Id |
| tokenId |  ``` Required ```  | Token Id |


#### Example Usage

```java
String customerId = "customer_id";
String tokenId = "token_id";
// Invoking the API call with sample inputs
customers.getAccessTokenAsync(customerId, tokenId, new APICallBack<GetAccessTokenResponse>() {
    public void onSuccess(HttpContext context, GetAccessTokenResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_addresses_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.getAddressesAsync") getAddressesAsync

> Gets all adressess from a customer


```java
void getAddressesAsync(
        final String customerId,
        final Integer page,
        final Integer size,
        final APICallBack<ListAddressesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
String customerId = "customer_id";
Integer page = 234;
Integer size = 234;
// Invoking the API call with sample inputs
customers.getAddressesAsync(customerId, page, size, new APICallBack<ListAddressesResponse>() {
    public void onSuccess(HttpContext context, ListAddressesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_customer_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.createCustomerAsync") createCustomerAsync

> Creates a new customer


```java
void createCustomerAsync(
        final CreateCustomerRequest body,
        final String idempotencyKey,
        final APICallBack<GetCustomerResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a customer |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    CreateCustomerRequest body = new CreateCustomerRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    customers.createCustomerAsync(body, idempotencyKey, new APICallBack<GetCustomerResponse>() {
        public void onSuccess(HttpContext context, GetCustomerResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_card_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.CustomersController.createCardAsync") createCardAsync

> Creates a new card for a customer


```java
void createCardAsync(
        final String customerId,
        final CreateCardRequest body,
        final String idempotencyKey,
        final APICallBack<GetCardResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| customerId |  ``` Required ```  | Customer id |
| body |  ``` Required ```  | Request for creating a card |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String customerId = "customer_id";
    CreateCardRequest body = new CreateCardRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    customers.createCardAsync(customerId, body, idempotencyKey, new APICallBack<GetCardResponse>() {
        public void onSuccess(HttpContext context, GetCardResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



[Back to List of Controllers](#list_of_controllers)

## <a name="charges_controller"></a>![Class: ](https://apidocs.io/img/class.png "me.pagar.api.controllers.ChargesController") ChargesController

### Get singleton instance

The singleton instance of the ``` ChargesController ``` class can be accessed from the API Client.

```java
ChargesController charges = client.getCharges();
```

### <a name="capture_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.captureChargeAsync") captureChargeAsync

> Captures a charge


```java
void captureChargeAsync(
        final String chargeId,
        final String idempotencyKey,
        final CreateCaptureChargeRequest body,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |
| body |  ``` Optional ```  | Request for capturing a charge |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    String idempotencyKey = "idempotency-key";
    CreateCaptureChargeRequest body = new CreateCaptureChargeRequest();
    // Invoking the API call with sample inputs
    charges.captureChargeAsync(chargeId, idempotencyKey, body, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_charge_transactions_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.getChargeTransactionsAsync") getChargeTransactionsAsync

> GetChargeTransactions


```java
void getChargeTransactionsAsync(
        final String chargeId,
        final Integer page,
        final Integer size,
        final APICallBack<ListChargeTransactionsResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge Id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
String chargeId = "charge_id";
Integer page = 234;
Integer size = 234;
// Invoking the API call with sample inputs
charges.getChargeTransactionsAsync(chargeId, page, size, new APICallBack<ListChargeTransactionsResponse>() {
    public void onSuccess(HttpContext context, ListChargeTransactionsResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_charges_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.getChargesAsync") getChargesAsync

> Lists all charges


```java
void getChargesAsync(
        final Integer page,
        final Integer size,
        final String code,
        final String status,
        final String paymentMethod,
        final String customerId,
        final String orderId,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListChargesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| code |  ``` Optional ```  | Filter for charge's code |
| status |  ``` Optional ```  | Filter for charge's status |
| paymentMethod |  ``` Optional ```  | Filter for charge's payment method |
| customerId |  ``` Optional ```  | Filter for charge's customer id |
| orderId |  ``` Optional ```  | Filter for charge's order id |
| createdSince |  ``` Optional ```  | Filter for the beginning of the range for charge's creation |
| createdUntil |  ``` Optional ```  | Filter for the end of the range for charge's creation |


#### Example Usage

```java
Integer page = 234;
Integer size = 234;
String code = "code";
String status = "status";
String paymentMethod = "payment_method";
String customerId = "customer_id";
String orderId = "order_id";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
charges.getChargesAsync(page, size, code, status, paymentMethod, customerId, orderId, createdSince, createdUntil, new APICallBack<ListChargesResponse>() {
    public void onSuccess(HttpContext context, ListChargesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_charge_payment_method_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.updateChargePaymentMethodAsync") updateChargePaymentMethodAsync

> Updates a charge's payment method


```java
void updateChargePaymentMethodAsync(
        final String chargeId,
        final UpdateChargePaymentMethodRequest body,
        final String idempotencyKey,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| body |  ``` Required ```  | Request for updating the payment method from a charge |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    UpdateChargePaymentMethodRequest body = new UpdateChargePaymentMethodRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    charges.updateChargePaymentMethodAsync(chargeId, body, idempotencyKey, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_charge_due_date_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.updateChargeDueDateAsync") updateChargeDueDateAsync

> Updates the due date from a charge


```java
void updateChargeDueDateAsync(
        final String chargeId,
        final UpdateChargeDueDateRequest body,
        final String idempotencyKey,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge Id |
| body |  ``` Required ```  | Request for updating the due date |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    UpdateChargeDueDateRequest body = new UpdateChargeDueDateRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    charges.updateChargeDueDateAsync(chargeId, body, idempotencyKey, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="confirm_payment_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.confirmPaymentAsync") confirmPaymentAsync

> ConfirmPayment


```java
void confirmPaymentAsync(
        final String chargeId,
        final String idempotencyKey,
        final CreateConfirmPaymentRequest body,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | TODO: Add a parameter description |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |
| body |  ``` Optional ```  | Request for confirm payment |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    String idempotencyKey = "idempotency-key";
    CreateConfirmPaymentRequest body = new CreateConfirmPaymentRequest();
    // Invoking the API call with sample inputs
    charges.confirmPaymentAsync(chargeId, idempotencyKey, body, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.getChargeAsync") getChargeAsync

> Get a charge from its id


```java
void getChargeAsync(
        final String chargeId,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |


#### Example Usage

```java
String chargeId = "charge_id";
// Invoking the API call with sample inputs
charges.getChargeAsync(chargeId, new APICallBack<GetChargeResponse>() {
    public void onSuccess(HttpContext context, GetChargeResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="retry_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.retryChargeAsync") retryChargeAsync

> Retries a charge


```java
void retryChargeAsync(
        final String chargeId,
        final String idempotencyKey,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String chargeId = "charge_id";
String idempotencyKey = "idempotency-key";
// Invoking the API call with sample inputs
charges.retryChargeAsync(chargeId, idempotencyKey, new APICallBack<GetChargeResponse>() {
    public void onSuccess(HttpContext context, GetChargeResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_charge_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.updateChargeMetadataAsync") updateChargeMetadataAsync

> Updates the metadata from a charge


```java
void updateChargeMetadataAsync(
        final String chargeId,
        final UpdateMetadataRequest body,
        final String idempotencyKey,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | The charge id |
| body |  ``` Required ```  | Request for updating the charge metadata |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    UpdateMetadataRequest body = new UpdateMetadataRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    charges.updateChargeMetadataAsync(chargeId, body, idempotencyKey, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_charge_card_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.updateChargeCardAsync") updateChargeCardAsync

> Updates the card from a charge


```java
void updateChargeCardAsync(
        final String chargeId,
        final UpdateChargeCardRequest body,
        final String idempotencyKey,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| body |  ``` Required ```  | Request for updating a charge's card |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    UpdateChargeCardRequest body = new UpdateChargeCardRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    charges.updateChargeCardAsync(chargeId, body, idempotencyKey, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="cancel_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.cancelChargeAsync") cancelChargeAsync

> Cancel a charge


```java
void cancelChargeAsync(
        final String chargeId,
        final String idempotencyKey,
        final CreateCancelChargeRequest body,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| chargeId |  ``` Required ```  | Charge id |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |
| body |  ``` Optional ```  | Request for cancelling a charge |


#### Example Usage

```java
try {
    String chargeId = "charge_id";
    String idempotencyKey = "idempotency-key";
    CreateCancelChargeRequest body = new CreateCancelChargeRequest();
    // Invoking the API call with sample inputs
    charges.cancelChargeAsync(chargeId, idempotencyKey, body, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_charges_summary_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.getChargesSummaryAsync") getChargesSummaryAsync

> GetChargesSummary


```java
void getChargesSummaryAsync(
        final String status,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<GetChargesSummaryResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| status |  ``` Required ```  | TODO: Add a parameter description |
| createdSince |  ``` Optional ```  | TODO: Add a parameter description |
| createdUntil |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String status = "status";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
charges.getChargesSummaryAsync(status, createdSince, createdUntil, new APICallBack<GetChargesSummaryResponse>() {
    public void onSuccess(HttpContext context, GetChargesSummaryResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_charge_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.ChargesController.createChargeAsync") createChargeAsync

> Creates a new charge


```java
void createChargeAsync(
        final CreateChargeRequest body,
        final String idempotencyKey,
        final APICallBack<GetChargeResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Request for creating a charge |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    CreateChargeRequest body = new CreateChargeRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    charges.createChargeAsync(body, idempotencyKey, new APICallBack<GetChargeResponse>() {
        public void onSuccess(HttpContext context, GetChargeResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



[Back to List of Controllers](#list_of_controllers)

## <a name="recipients_controller"></a>![Class: ](https://apidocs.io/img/class.png "me.pagar.api.controllers.RecipientsController") RecipientsController

### Get singleton instance

The singleton instance of the ``` RecipientsController ``` class can be accessed from the API Client.

```java
RecipientsController recipients = client.getRecipients();
```

### <a name="get_transfer_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getTransferAsync") getTransferAsync

> Gets a transfer


```java
void getTransferAsync(
        final String recipientId,
        final String transferId,
        final APICallBack<GetTransferResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| transferId |  ``` Required ```  | Transfer id |


#### Example Usage

```java
String recipientId = "recipient_id";
String transferId = "transfer_id";
// Invoking the API call with sample inputs
recipients.getTransferAsync(recipientId, transferId, new APICallBack<GetTransferResponse>() {
    public void onSuccess(HttpContext context, GetTransferResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_recipient_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getRecipientAsync") getRecipientAsync

> Retrieves recipient information


```java
void getRecipientAsync(
        final String recipientId,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipiend id |


#### Example Usage

```java
String recipientId = "recipient_id";
// Invoking the API call with sample inputs
recipients.getRecipientAsync(recipientId, new APICallBack<GetRecipientResponse>() {
    public void onSuccess(HttpContext context, GetRecipientResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_recipient_metadata_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.updateRecipientMetadataAsync") updateRecipientMetadataAsync

> Updates recipient metadata


```java
void updateRecipientMetadataAsync(
        final String recipientId,
        final UpdateMetadataRequest body,
        final String idempotencyKey,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| body |  ``` Required ```  | Metadata |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    UpdateMetadataRequest body = new UpdateMetadataRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    recipients.updateRecipientMetadataAsync(recipientId, body, idempotencyKey, new APICallBack<GetRecipientResponse>() {
        public void onSuccess(HttpContext context, GetRecipientResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_transfer_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.createTransferAsync") createTransferAsync

> Creates a transfer for a recipient


```java
void createTransferAsync(
        final String recipientId,
        final CreateTransferRequest body,
        final String idempotencyKey,
        final APICallBack<GetTransferResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient Id |
| body |  ``` Required ```  | Transfer data |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    CreateTransferRequest body = new CreateTransferRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    recipients.createTransferAsync(recipientId, body, idempotencyKey, new APICallBack<GetTransferResponse>() {
        public void onSuccess(HttpContext context, GetTransferResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_automatic_anticipation_settings_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.updateAutomaticAnticipationSettingsAsync") updateAutomaticAnticipationSettingsAsync

> Updates recipient metadata


```java
void updateAutomaticAnticipationSettingsAsync(
        final String recipientId,
        final UpdateAutomaticAnticipationSettingsRequest body,
        final String idempotencyKey,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| body |  ``` Required ```  | Metadata |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    UpdateAutomaticAnticipationSettingsRequest body = new UpdateAutomaticAnticipationSettingsRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    recipients.updateAutomaticAnticipationSettingsAsync(recipientId, body, idempotencyKey, new APICallBack<GetRecipientResponse>() {
        public void onSuccess(HttpContext context, GetRecipientResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_balance_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getBalanceAsync") getBalanceAsync

> Get balance information for a recipient


```java
void getBalanceAsync(
        final String recipientId,
        final APICallBack<GetBalanceResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |


#### Example Usage

```java
String recipientId = "recipient_id";
// Invoking the API call with sample inputs
recipients.getBalanceAsync(recipientId, new APICallBack<GetBalanceResponse>() {
    public void onSuccess(HttpContext context, GetBalanceResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_anticipations_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getAnticipationsAsync") getAnticipationsAsync

> Retrieves a paginated list of anticipations from a recipient


```java
void getAnticipationsAsync(
        final String recipientId,
        final Integer page,
        final Integer size,
        final String status,
        final String timeframe,
        final DateTime paymentDateSince,
        final DateTime paymentDateUntil,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListAnticipationResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| status |  ``` Optional ```  | Filter for anticipation status |
| timeframe |  ``` Optional ```  | Filter for anticipation timeframe |
| paymentDateSince |  ``` Optional ```  | Filter for start range for anticipation payment date |
| paymentDateUntil |  ``` Optional ```  | Filter for end range for anticipation payment date |
| createdSince |  ``` Optional ```  | Filter for start range for anticipation creation date |
| createdUntil |  ``` Optional ```  | Filter for end range for anticipation creation date |


#### Example Usage

```java
String recipientId = "recipient_id";
Integer page = 234;
Integer size = 234;
String status = "status";
String timeframe = "timeframe";
DateTime paymentDateSince = new Date();
DateTime paymentDateUntil = new Date();
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
recipients.getAnticipationsAsync(recipientId, page, size, status, timeframe, paymentDateSince, paymentDateUntil, createdSince, createdUntil, new APICallBack<ListAnticipationResponse>() {
    public void onSuccess(HttpContext context, ListAnticipationResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_withdraw_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getWithdrawByIdAsync") getWithdrawByIdAsync

> GetWithdrawById


```java
void getWithdrawByIdAsync(
        final String recipientId,
        final String withdrawalId,
        final APICallBack<GetWithdrawResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | TODO: Add a parameter description |
| withdrawalId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String recipientId = "recipient_id";
String withdrawalId = "withdrawal_id";
// Invoking the API call with sample inputs
recipients.getWithdrawByIdAsync(recipientId, withdrawalId, new APICallBack<GetWithdrawResponse>() {
    public void onSuccess(HttpContext context, GetWithdrawResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_withdraw_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.createWithdrawAsync") createWithdrawAsync

> CreateWithdraw


```java
void createWithdrawAsync(
        final String recipientId,
        final CreateWithdrawRequest body,
        final APICallBack<GetWithdrawResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | TODO: Add a parameter description |
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    CreateWithdrawRequest body = new CreateWithdrawRequest();
    // Invoking the API call with sample inputs
    recipients.createWithdrawAsync(recipientId, body, new APICallBack<GetWithdrawResponse>() {
        public void onSuccess(HttpContext context, GetWithdrawResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_recipient_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.updateRecipientAsync") updateRecipientAsync

> Updates a recipient


```java
void updateRecipientAsync(
        final String recipientId,
        final UpdateRecipientRequest body,
        final String idempotencyKey,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| body |  ``` Required ```  | Recipient data |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    UpdateRecipientRequest body = new UpdateRecipientRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    recipients.updateRecipientAsync(recipientId, body, idempotencyKey, new APICallBack<GetRecipientResponse>() {
        public void onSuccess(HttpContext context, GetRecipientResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_anticipation_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.createAnticipationAsync") createAnticipationAsync

> Creates an anticipation


```java
void createAnticipationAsync(
        final String recipientId,
        final CreateAnticipationRequest body,
        final String idempotencyKey,
        final APICallBack<GetAnticipationResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| body |  ``` Required ```  | Anticipation data |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    CreateAnticipationRequest body = new CreateAnticipationRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    recipients.createAnticipationAsync(recipientId, body, idempotencyKey, new APICallBack<GetAnticipationResponse>() {
        public void onSuccess(HttpContext context, GetAnticipationResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_recipient_default_bank_account_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.updateRecipientDefaultBankAccountAsync") updateRecipientDefaultBankAccountAsync

> Updates the default bank account from a recipient


```java
void updateRecipientDefaultBankAccountAsync(
        final String recipientId,
        final UpdateRecipientBankAccountRequest body,
        final String idempotencyKey,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| body |  ``` Required ```  | Bank account data |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    UpdateRecipientBankAccountRequest body = new UpdateRecipientBankAccountRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    recipients.updateRecipientDefaultBankAccountAsync(recipientId, body, idempotencyKey, new APICallBack<GetRecipientResponse>() {
        public void onSuccess(HttpContext context, GetRecipientResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_recipient_by_code_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getRecipientByCodeAsync") getRecipientByCodeAsync

> Retrieves recipient information


```java
void getRecipientByCodeAsync(
        final String code,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| code |  ``` Required ```  | Recipient code |


#### Example Usage

```java
String code = "code";
// Invoking the API call with sample inputs
recipients.getRecipientByCodeAsync(code, new APICallBack<GetRecipientResponse>() {
    public void onSuccess(HttpContext context, GetRecipientResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_anticipation_limits_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getAnticipationLimitsAsync") getAnticipationLimitsAsync

> Gets the anticipation limits for a recipient


```java
void getAnticipationLimitsAsync(
        final String recipientId,
        final String timeframe,
        final DateTime paymentDate,
        final APICallBack<GetAnticipationLimitResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| timeframe |  ``` Required ```  | Timeframe |
| paymentDate |  ``` Required ```  | Anticipation payment date |


#### Example Usage

```java
String recipientId = "recipient_id";
String timeframe = "timeframe";
DateTime paymentDate = new Date();
// Invoking the API call with sample inputs
recipients.getAnticipationLimitsAsync(recipientId, timeframe, paymentDate, new APICallBack<GetAnticipationLimitResponse>() {
    public void onSuccess(HttpContext context, GetAnticipationLimitResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_recipients_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getRecipientsAsync") getRecipientsAsync

> Retrieves paginated recipients information


```java
void getRecipientsAsync(
        final Integer page,
        final Integer size,
        final APICallBack<ListRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |


#### Example Usage

```java
Integer page = 234;
Integer size = 234;
// Invoking the API call with sample inputs
recipients.getRecipientsAsync(page, size, new APICallBack<ListRecipientResponse>() {
    public void onSuccess(HttpContext context, ListRecipientResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="create_recipient_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.createRecipientAsync") createRecipientAsync

> Creates a new recipient


```java
void createRecipientAsync(
        final CreateRecipientRequest body,
        final String idempotencyKey,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | Recipient data |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    CreateRecipientRequest body = new CreateRecipientRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    recipients.createRecipientAsync(body, idempotencyKey, new APICallBack<GetRecipientResponse>() {
        public void onSuccess(HttpContext context, GetRecipientResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_transfers_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getTransfersAsync") getTransfersAsync

> Gets a paginated list of transfers for the recipient


```java
void getTransfersAsync(
        final String recipientId,
        final Integer page,
        final Integer size,
        final String status,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListTransferResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| page |  ``` Optional ```  | Page number |
| size |  ``` Optional ```  | Page size |
| status |  ``` Optional ```  | Filter for transfer status |
| createdSince |  ``` Optional ```  | Filter for start range of transfer creation date |
| createdUntil |  ``` Optional ```  | Filter for end range of transfer creation date |


#### Example Usage

```java
String recipientId = "recipient_id";
Integer page = 234;
Integer size = 234;
String status = "status";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
recipients.getTransfersAsync(recipientId, page, size, status, createdSince, createdUntil, new APICallBack<ListTransferResponse>() {
    public void onSuccess(HttpContext context, ListTransferResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_withdrawals_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getWithdrawalsAsync") getWithdrawalsAsync

> Gets a paginated list of transfers for the recipient


```java
void getWithdrawalsAsync(
        final String recipientId,
        final Integer page,
        final Integer size,
        final String status,
        final DateTime createdSince,
        final DateTime createdUntil,
        final APICallBack<ListWithdrawals> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | TODO: Add a parameter description |
| page |  ``` Optional ```  | TODO: Add a parameter description |
| size |  ``` Optional ```  | TODO: Add a parameter description |
| status |  ``` Optional ```  | TODO: Add a parameter description |
| createdSince |  ``` Optional ```  | TODO: Add a parameter description |
| createdUntil |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String recipientId = "recipient_id";
Integer page = 234;
Integer size = 234;
String status = "status";
DateTime createdSince = new Date();
DateTime createdUntil = new Date();
// Invoking the API call with sample inputs
recipients.getWithdrawalsAsync(recipientId, page, size, status, createdSince, createdUntil, new APICallBack<ListWithdrawals>() {
    public void onSuccess(HttpContext context, ListWithdrawals response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_anticipation_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getAnticipationAsync") getAnticipationAsync

> Gets an anticipation


```java
void getAnticipationAsync(
        final String recipientId,
        final String anticipationId,
        final APICallBack<GetAnticipationResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient id |
| anticipationId |  ``` Required ```  | Anticipation id |


#### Example Usage

```java
String recipientId = "recipient_id";
String anticipationId = "anticipation_id";
// Invoking the API call with sample inputs
recipients.getAnticipationAsync(recipientId, anticipationId, new APICallBack<GetAnticipationResponse>() {
    public void onSuccess(HttpContext context, GetAnticipationResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="update_recipient_transfer_settings_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.updateRecipientTransferSettingsAsync") updateRecipientTransferSettingsAsync

> UpdateRecipientTransferSettings


```java
void updateRecipientTransferSettingsAsync(
        final String recipientId,
        final UpdateTransferSettingsRequest body,
        final String idempotencyKey,
        final APICallBack<GetRecipientResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recipientId |  ``` Required ```  | Recipient Identificator |
| body |  ``` Required ```  | TODO: Add a parameter description |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String recipientId = "recipient_id";
    UpdateTransferSettingsRequest body = new UpdateTransferSettingsRequest();
    String idempotencyKey = "idempotency-key";
    // Invoking the API call with sample inputs
    recipients.updateRecipientTransferSettingsAsync(recipientId, body, idempotencyKey, new APICallBack<GetRecipientResponse>() {
        public void onSuccess(HttpContext context, GetRecipientResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_default_recipient_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.RecipientsController.getDefaultRecipientAsync") getDefaultRecipientAsync

> GetDefaultRecipient


```java
void getDefaultRecipientAsync(final APICallBack<GetRecipientResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
recipients.getDefaultRecipientAsync(new APICallBack<GetRecipientResponse>() {
    public void onSuccess(HttpContext context, GetRecipientResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



[Back to List of Controllers](#list_of_controllers)

## <a name="tokens_controller"></a>![Class: ](https://apidocs.io/img/class.png "me.pagar.api.controllers.TokensController") TokensController

### Get singleton instance

The singleton instance of the ``` TokensController ``` class can be accessed from the API Client.

```java
TokensController tokens = client.getTokens();
```

### <a name="create_token_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.TokensController.createTokenAsync") createTokenAsync

> *Tags:*  ``` Skips Authentication ``` 

> CreateToken


```java
void createTokenAsync(
        final String publicKey,
        final CreateTokenRequest body,
        final String idempotencyKey,
        final String appId,
        final APICallBack<GetTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| publicKey |  ``` Required ```  | Public key |
| body |  ``` Required ```  | Request for creating a token |
| idempotencyKey |  ``` Optional ```  | TODO: Add a parameter description |
| appId |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String publicKey = "public_key";
    CreateTokenRequest body = new CreateTokenRequest();
    String idempotencyKey = "idempotency-key";
    String appId = "appId";
    // Invoking the API call with sample inputs
    tokens.createTokenAsync(publicKey, body, idempotencyKey, appId, new APICallBack<GetTokenResponse>() {
        public void onSuccess(HttpContext context, GetTokenResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_token_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.TokensController.getTokenAsync") getTokenAsync

> *Tags:*  ``` Skips Authentication ``` 

> Gets a token from its id


```java
void getTokenAsync(
        final String id,
        final String publicKey,
        final String appId,
        final APICallBack<GetTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | Token id |
| publicKey |  ``` Required ```  | Public key |
| appId |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
String id = "id";
String publicKey = "public_key";
String appId = "appId";
// Invoking the API call with sample inputs
tokens.getTokenAsync(id, publicKey, appId, new APICallBack<GetTokenResponse>() {
    public void onSuccess(HttpContext context, GetTokenResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



[Back to List of Controllers](#list_of_controllers)

## <a name="transfers_controller"></a>![Class: ](https://apidocs.io/img/class.png "me.pagar.api.controllers.TransfersController") TransfersController

### Get singleton instance

The singleton instance of the ``` TransfersController ``` class can be accessed from the API Client.

```java
TransfersController transfers = client.getTransfers();
```

### <a name="get_transfers1_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.TransfersController.getTransfers1Async") getTransfers1Async

> Gets all transfers


```java
void getTransfers1Async(final APICallBack<ListTransfers> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
transfers.getTransfers1Async(new APICallBack<ListTransfers>() {
    public void onSuccess(HttpContext context, ListTransfers response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="get_transfer_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.TransfersController.getTransferByIdAsync") getTransferByIdAsync

> GetTransferById


```java
void getTransferByIdAsync(
        final String transferId,
        final APICallBack<GetTransfer> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| transferId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String transferId = "transfer_id";
// Invoking the API call with sample inputs
transfers.getTransferByIdAsync(transferId, new APICallBack<GetTransfer>() {
    public void onSuccess(HttpContext context, GetTransfer response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



### <a name="post_create_transfer_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.TransfersController.postCreateTransferAsync") postCreateTransferAsync

> CreateTransfer


```java
void postCreateTransferAsync(
        final CreateTransfer body,
        final APICallBack<GetTransfer> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    CreateTransfer body = new CreateTransfer();
    // Invoking the API call with sample inputs
    transfers.postCreateTransferAsync(body, new APICallBack<GetTransfer>() {
        public void onSuccess(HttpContext context, GetTransfer response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



[Back to List of Controllers](#list_of_controllers)

## <a name="transactions_controller"></a>![Class: ](https://apidocs.io/img/class.png "me.pagar.api.controllers.TransactionsController") TransactionsController

### Get singleton instance

The singleton instance of the ``` TransactionsController ``` class can be accessed from the API Client.

```java
TransactionsController transactions = client.getTransactions();
```

### <a name="get_transaction_async"></a>![Method: ](https://apidocs.io/img/method.png "me.pagar.api.controllers.TransactionsController.getTransactionAsync") getTransactionAsync

> GetTransaction


```java
void getTransactionAsync(
        final String transactionId,
        final APICallBack<GetTransactionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| transactionId |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String transactionId = "transaction_id";
// Invoking the API call with sample inputs
transactions.getTransactionAsync(transactionId, new APICallBack<GetTransactionResponse>() {
    public void onSuccess(HttpContext context, GetTransactionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Invalid request |
| 401 | Invalid API key |
| 404 | An informed resource was not found |
| 412 | Business validation error |
| 422 | Contract validation error |
| 500 | Internal server error |



[Back to List of Controllers](#list_of_controllers)



