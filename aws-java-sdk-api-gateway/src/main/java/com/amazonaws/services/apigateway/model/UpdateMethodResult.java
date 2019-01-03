/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents a client-facing interface by which the client calls the API to access back-end resources. A <b>Method</b>
 * resource is integrated with an <a>Integration</a> resource. Both consist of a request and one or more responses. The
 * method request takes the client input that is passed to the back end through the integration request. A method
 * response returns the output from the back end to the client through an integration response. A method request is
 * embodied in a <b>Method</b> resource, whereas an integration request is embodied in an <a>Integration</a> resource.
 * On the other hand, a method response is represented by a <a>MethodResponse</a> resource, whereas an integration
 * response is represented by an <a>IntegrationResponse</a> resource.
 * </p>
 * <div class="remarks">
 * <p/>
 * <h4>Example: Retrive the GET method on a specified resource</h4>
 * <h5>Request</h5>
 * <p>
 * The following example request retrieves the information about the GET method on an API resource (
 * <code>3kzxbg5sa2</code>) of an API (<code>fugvjdxtri</code>).
 * </p>
 * 
 * <pre>
 * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160603T210259Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160603/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
 * </pre>
 * 
 * <h5>Response</h5>
 * <p>
 * The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
 * </p>
 * 
 * <pre>
 * <code>{ "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-{rel}.html", "name": "method", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true } ], "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET", "name": "GET", "title": "GET" }, "integration:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "method:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET" }, "method:integration": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "method:responses": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "name": "200", "title": "200" }, "method:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET" }, "methodresponse:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/{status_code}", "templated": true } }, "apiKeyRequired": true, "authorizationType": "NONE", "httpMethod": "GET", "_embedded": { "method:integration": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integration:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integration:responses": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "3kzxbg5sa2", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestParameters": { "integration.request.header.Content-Type": "'application/x-amz-json-1.1'" }, "requestTemplates": { "application/json": "{\n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-east-1:kinesis:action/ListStreams", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E%23foreach(%24stream%20in%20%24input.path(%27%24.StreamNames%27))%3Cstream%3E%3Cname%3E%24stream%3C%2Fname%3E%3C%2Fstream%3E%23end%3C%2FkinesisStreams%3E\")" }, "statusCode": "200" } } }, "method:responses": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "name": "200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.Content-Type": false }, "statusCode": "200" } } }</code>
 * </pre>
 * <p>
 * In the example above, the response template for the <code>200 OK</code> response maps the JSON output from the
 * <code>ListStreams</code> action in the back end to an XML output. The mapping template is URL-encoded as
 * <code>%3CkinesisStreams%3E%23foreach(%24stream%20in%20%24input.path(%27%24.StreamNames%27))%3Cstream%3E%3Cname%3E%24stream%3C%2Fname%3E%3C%2Fstream%3E%23end%3C%2FkinesisStreams%3E</code>
 * and the output is decoded using the <a href=
 * "https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#util-templat-reference"
 * >$util.urlDecode()</a> helper function.
 * </p>
 * </div> <div class="seeAlso"> <a>MethodResponse</a>, <a>Integration</a>, <a>IntegrationResponse</a>, <a>Resource</a>,
 * <a href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-method-settings.html">Set up an API's
 * method</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMethodResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The method's HTTP verb.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code> for
     * using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or <code>COGNITO_USER_POOLS</code>
     * for using a Cognito user pool.
     * </p>
     */
    private String authorizationType;
    /**
     * <p>
     * The identifier of an <a>Authorizer</a> to use on this method. The <code>authorizationType</code> must be
     * <code>CUSTOM</code>.
     * </p>
     */
    private String authorizerId;
    /**
     * <p>
     * A boolean flag specifying whether a valid <a>ApiKey</a> is required to invoke this method.
     * </p>
     */
    private Boolean apiKeyRequired;
    /**
     * <p>
     * The identifier of a <a>RequestValidator</a> for request validation.
     * </p>
     */
    private String requestValidatorId;
    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     * href="https://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     * </p>
     */
    private String operationName;
    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A
     * key is a method request parameter name matching the pattern of <code>method.request.{location}.{name}</code>,
     * where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> is a valid and unique parameter name. The value associated with the key is a Boolean flag
     * indicating whether the parameter is required (<code>true</code>) or optional (<code>false</code>). The method
     * request parameter names defined here are available in <a>Integration</a> to be mapped to integration request
     * parameters or templates.
     * </p>
     */
    private java.util.Map<String, Boolean> requestParameters;
    /**
     * <p>
     * A key-value map specifying data schemas, represented by <a>Model</a> resources, (as the mapped value) of the
     * request payloads of given content types (as the mapping key).
     * </p>
     */
    private java.util.Map<String, String> requestModels;
    /**
     * <p>
     * Gets a method response associated with a given HTTP status code.
     * </p>
     * <div class="remarks">
     * <p>
     * The collection of method responses are encapsulated in a key-value map, where the key is a response's HTTP status
     * code and the value is a <a>MethodResponse</a> resource that specifies the response returned to the caller from
     * the back end through the integration response.
     * </p>
     * <h4>Example: Get a 200 OK response of a GET method</h4> <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T215008Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.operator": false, "method.response.header.operand_2": false, "method.response.header.operand_1": false }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-method-response.html">AWS CLI</a> </div>
     */
    private java.util.Map<String, MethodResponse> methodResponses;
    /**
     * <p>
     * Gets the method's integration responsible for passing the client-submitted request to the back end and performing
     * necessary transformations to make the request compliant with the back end.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example:</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T213210Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true } ], "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:responses": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "0cjtch", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestTemplates": { "application/json": "{\n \"a\": \"$input.params('operand1')\",\n \"b\": \"$input.params('operand2')\", \n \"op\": \"$input.params('operator')\" \n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-west-2:lambda:path//2015-03-31/functions/arn:aws:lambda:us-west-2:123456789012:function:Calc/invocations", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.operator": "integration.response.body.op", "method.response.header.operand_2": "integration.response.body.b", "method.response.header.operand_1": "integration.response.body.a" }, "responseTemplates": { "application/json": "#set($res = $input.path('$'))\n{\n \"result\": \"$res.a, $res.b, $res.op => $res.c\",\n \"a\" : \"$res.a\",\n \"b\" : \"$res.b\",\n \"op\" : \"$res.op\",\n \"c\" : \"$res.c\"\n}" }, "selectionPattern": "", "statusCode": "200" } } }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-integration.html">AWS CLI</a> </div>
     */
    private Integration methodIntegration;
    /**
     * <p>
     * A list of authorization scopes configured on the method. The scopes are used with a
     * <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by
     * matching the method scopes against the scopes parsed from the access token in the incoming request. The method
     * invocation is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the
     * invocation is not authorized. When the method scope is configured, the client must provide an access token
     * instead of an identity token for authorization purposes.
     * </p>
     */
    private java.util.List<String> authorizationScopes;

    /**
     * <p>
     * The method's HTTP verb.
     * </p>
     * 
     * @param httpMethod
     *        The method's HTTP verb.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * The method's HTTP verb.
     * </p>
     * 
     * @return The method's HTTP verb.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * The method's HTTP verb.
     * </p>
     * 
     * @param httpMethod
     *        The method's HTTP verb.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code> for
     * using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or <code>COGNITO_USER_POOLS</code>
     * for using a Cognito user pool.
     * </p>
     * 
     * @param authorizationType
     *        The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code>
     *        for using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or
     *        <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
     */

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code> for
     * using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or <code>COGNITO_USER_POOLS</code>
     * for using a Cognito user pool.
     * </p>
     * 
     * @return The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code>
     *         for using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or
     *         <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
     */

    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * <p>
     * The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code> for
     * using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or <code>COGNITO_USER_POOLS</code>
     * for using a Cognito user pool.
     * </p>
     * 
     * @param authorizationType
     *        The method's authorization type. Valid values are <code>NONE</code> for open access, <code>AWS_IAM</code>
     *        for using AWS IAM permissions, <code>CUSTOM</code> for using a custom authorizer, or
     *        <code>COGNITO_USER_POOLS</code> for using a Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withAuthorizationType(String authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    /**
     * <p>
     * The identifier of an <a>Authorizer</a> to use on this method. The <code>authorizationType</code> must be
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @param authorizerId
     *        The identifier of an <a>Authorizer</a> to use on this method. The <code>authorizationType</code> must be
     *        <code>CUSTOM</code>.
     */

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * <p>
     * The identifier of an <a>Authorizer</a> to use on this method. The <code>authorizationType</code> must be
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @return The identifier of an <a>Authorizer</a> to use on this method. The <code>authorizationType</code> must be
     *         <code>CUSTOM</code>.
     */

    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * <p>
     * The identifier of an <a>Authorizer</a> to use on this method. The <code>authorizationType</code> must be
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @param authorizerId
     *        The identifier of an <a>Authorizer</a> to use on this method. The <code>authorizationType</code> must be
     *        <code>CUSTOM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withAuthorizerId(String authorizerId) {
        setAuthorizerId(authorizerId);
        return this;
    }

    /**
     * <p>
     * A boolean flag specifying whether a valid <a>ApiKey</a> is required to invoke this method.
     * </p>
     * 
     * @param apiKeyRequired
     *        A boolean flag specifying whether a valid <a>ApiKey</a> is required to invoke this method.
     */

    public void setApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    /**
     * <p>
     * A boolean flag specifying whether a valid <a>ApiKey</a> is required to invoke this method.
     * </p>
     * 
     * @return A boolean flag specifying whether a valid <a>ApiKey</a> is required to invoke this method.
     */

    public Boolean getApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * A boolean flag specifying whether a valid <a>ApiKey</a> is required to invoke this method.
     * </p>
     * 
     * @param apiKeyRequired
     *        A boolean flag specifying whether a valid <a>ApiKey</a> is required to invoke this method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withApiKeyRequired(Boolean apiKeyRequired) {
        setApiKeyRequired(apiKeyRequired);
        return this;
    }

    /**
     * <p>
     * A boolean flag specifying whether a valid <a>ApiKey</a> is required to invoke this method.
     * </p>
     * 
     * @return A boolean flag specifying whether a valid <a>ApiKey</a> is required to invoke this method.
     */

    public Boolean isApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * The identifier of a <a>RequestValidator</a> for request validation.
     * </p>
     * 
     * @param requestValidatorId
     *        The identifier of a <a>RequestValidator</a> for request validation.
     */

    public void setRequestValidatorId(String requestValidatorId) {
        this.requestValidatorId = requestValidatorId;
    }

    /**
     * <p>
     * The identifier of a <a>RequestValidator</a> for request validation.
     * </p>
     * 
     * @return The identifier of a <a>RequestValidator</a> for request validation.
     */

    public String getRequestValidatorId() {
        return this.requestValidatorId;
    }

    /**
     * <p>
     * The identifier of a <a>RequestValidator</a> for request validation.
     * </p>
     * 
     * @param requestValidatorId
     *        The identifier of a <a>RequestValidator</a> for request validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withRequestValidatorId(String requestValidatorId) {
        setRequestValidatorId(requestValidatorId);
        return this;
    }

    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     * href="https://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     * </p>
     * 
     * @param operationName
     *        A human-friendly operation identifier for the method. For example, you can assign the
     *        <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     *        href="https://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     */

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     * href="https://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     * </p>
     * 
     * @return A human-friendly operation identifier for the method. For example, you can assign the
     *         <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     *         href="https://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     * href="https://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     * </p>
     * 
     * @param operationName
     *        A human-friendly operation identifier for the method. For example, you can assign the
     *        <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in <a
     *        href="https://petstore-demo-endpoint.execute-api.com/petstore/pets">PetStore</a> example.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withOperationName(String operationName) {
        setOperationName(operationName);
        return this;
    }

    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A
     * key is a method request parameter name matching the pattern of <code>method.request.{location}.{name}</code>,
     * where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> is a valid and unique parameter name. The value associated with the key is a Boolean flag
     * indicating whether the parameter is required (<code>true</code>) or optional (<code>false</code>). The method
     * request parameter names defined here are available in <a>Integration</a> to be mapped to integration request
     * parameters or templates.
     * </p>
     * 
     * @return A key-value map defining required or optional method request parameters that can be accepted by API
     *         Gateway. A key is a method request parameter name matching the pattern of
     *         <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *         <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *         value associated with the key is a Boolean flag indicating whether the parameter is required (
     *         <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *         available in <a>Integration</a> to be mapped to integration request parameters or templates.
     */

    public java.util.Map<String, Boolean> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A
     * key is a method request parameter name matching the pattern of <code>method.request.{location}.{name}</code>,
     * where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> is a valid and unique parameter name. The value associated with the key is a Boolean flag
     * indicating whether the parameter is required (<code>true</code>) or optional (<code>false</code>). The method
     * request parameter names defined here are available in <a>Integration</a> to be mapped to integration request
     * parameters or templates.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map defining required or optional method request parameters that can be accepted by API
     *        Gateway. A key is a method request parameter name matching the pattern of
     *        <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *        <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *        value associated with the key is a Boolean flag indicating whether the parameter is required (
     *        <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *        available in <a>Integration</a> to be mapped to integration request parameters or templates.
     */

    public void setRequestParameters(java.util.Map<String, Boolean> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * A key-value map defining required or optional method request parameters that can be accepted by API Gateway. A
     * key is a method request parameter name matching the pattern of <code>method.request.{location}.{name}</code>,
     * where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> is a valid and unique parameter name. The value associated with the key is a Boolean flag
     * indicating whether the parameter is required (<code>true</code>) or optional (<code>false</code>). The method
     * request parameter names defined here are available in <a>Integration</a> to be mapped to integration request
     * parameters or templates.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map defining required or optional method request parameters that can be accepted by API
     *        Gateway. A key is a method request parameter name matching the pattern of
     *        <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *        <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *        value associated with the key is a Boolean flag indicating whether the parameter is required (
     *        <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *        available in <a>Integration</a> to be mapped to integration request parameters or templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withRequestParameters(java.util.Map<String, Boolean> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    public UpdateMethodResult addRequestParametersEntry(String key, Boolean value) {
        if (null == this.requestParameters) {
            this.requestParameters = new java.util.HashMap<String, Boolean>();
        }
        if (this.requestParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult clearRequestParametersEntries() {
        this.requestParameters = null;
        return this;
    }

    /**
     * <p>
     * A key-value map specifying data schemas, represented by <a>Model</a> resources, (as the mapped value) of the
     * request payloads of given content types (as the mapping key).
     * </p>
     * 
     * @return A key-value map specifying data schemas, represented by <a>Model</a> resources, (as the mapped value) of
     *         the request payloads of given content types (as the mapping key).
     */

    public java.util.Map<String, String> getRequestModels() {
        return requestModels;
    }

    /**
     * <p>
     * A key-value map specifying data schemas, represented by <a>Model</a> resources, (as the mapped value) of the
     * request payloads of given content types (as the mapping key).
     * </p>
     * 
     * @param requestModels
     *        A key-value map specifying data schemas, represented by <a>Model</a> resources, (as the mapped value) of
     *        the request payloads of given content types (as the mapping key).
     */

    public void setRequestModels(java.util.Map<String, String> requestModels) {
        this.requestModels = requestModels;
    }

    /**
     * <p>
     * A key-value map specifying data schemas, represented by <a>Model</a> resources, (as the mapped value) of the
     * request payloads of given content types (as the mapping key).
     * </p>
     * 
     * @param requestModels
     *        A key-value map specifying data schemas, represented by <a>Model</a> resources, (as the mapped value) of
     *        the request payloads of given content types (as the mapping key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withRequestModels(java.util.Map<String, String> requestModels) {
        setRequestModels(requestModels);
        return this;
    }

    public UpdateMethodResult addRequestModelsEntry(String key, String value) {
        if (null == this.requestModels) {
            this.requestModels = new java.util.HashMap<String, String>();
        }
        if (this.requestModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestModels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult clearRequestModelsEntries() {
        this.requestModels = null;
        return this;
    }

    /**
     * <p>
     * Gets a method response associated with a given HTTP status code.
     * </p>
     * <div class="remarks">
     * <p>
     * The collection of method responses are encapsulated in a key-value map, where the key is a response's HTTP status
     * code and the value is a <a>MethodResponse</a> resource that specifies the response returned to the caller from
     * the back end through the integration response.
     * </p>
     * <h4>Example: Get a 200 OK response of a GET method</h4> <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T215008Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.operator": false, "method.response.header.operand_2": false, "method.response.header.operand_1": false }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-method-response.html">AWS CLI</a> </div>
     * 
     * @return Gets a method response associated with a given HTTP status code.
     *         </p>
     *         <div class="remarks">
     *         <p>
     *         The collection of method responses are encapsulated in a key-value map, where the key is a response's
     *         HTTP status code and the value is a <a>MethodResponse</a> resource that specifies the response returned
     *         to the caller from the back end through the integration response.
     *         </p>
     *         <h4>Example: Get a 200 OK response of a GET method</h4> <h5>Request</h5>
     *         <p/>
     * 
     *         <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T215008Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     *         <h5>Response</h5>
     *         <p>
     *         The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     *         </p>
     * 
     *         <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.operator": false, "method.response.header.operand_2": false, "method.response.header.operand_1": false }, "statusCode": "200" }</code>
     * </pre>
     *         <p/>
     *         </div> <div class="seeAlso"> <a
     *         href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-method-response.html">AWS CLI</a>
     */

    public java.util.Map<String, MethodResponse> getMethodResponses() {
        return methodResponses;
    }

    /**
     * <p>
     * Gets a method response associated with a given HTTP status code.
     * </p>
     * <div class="remarks">
     * <p>
     * The collection of method responses are encapsulated in a key-value map, where the key is a response's HTTP status
     * code and the value is a <a>MethodResponse</a> resource that specifies the response returned to the caller from
     * the back end through the integration response.
     * </p>
     * <h4>Example: Get a 200 OK response of a GET method</h4> <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T215008Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.operator": false, "method.response.header.operand_2": false, "method.response.header.operand_1": false }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-method-response.html">AWS CLI</a> </div>
     * 
     * @param methodResponses
     *        Gets a method response associated with a given HTTP status code.
     *        </p>
     *        <div class="remarks">
     *        <p>
     *        The collection of method responses are encapsulated in a key-value map, where the key is a response's HTTP
     *        status code and the value is a <a>MethodResponse</a> resource that specifies the response returned to the
     *        caller from the back end through the integration response.
     *        </p>
     *        <h4>Example: Get a 200 OK response of a GET method</h4> <h5>Request</h5>
     *        <p/>
     * 
     *        <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T215008Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     *        <h5>Response</h5>
     *        <p>
     *        The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     *        </p>
     * 
     *        <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.operator": false, "method.response.header.operand_2": false, "method.response.header.operand_1": false }, "statusCode": "200" }</code>
     * </pre>
     *        <p/>
     *        </div> <div class="seeAlso"> <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-method-response.html">AWS CLI</a>
     */

    public void setMethodResponses(java.util.Map<String, MethodResponse> methodResponses) {
        this.methodResponses = methodResponses;
    }

    /**
     * <p>
     * Gets a method response associated with a given HTTP status code.
     * </p>
     * <div class="remarks">
     * <p>
     * The collection of method responses are encapsulated in a key-value map, where the key is a response's HTTP status
     * code and the value is a <a>MethodResponse</a> resource that specifies the response returned to the caller from
     * the back end through the integration response.
     * </p>
     * <h4>Example: Get a 200 OK response of a GET method</h4> <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T215008Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.operator": false, "method.response.header.operand_2": false, "method.response.header.operand_1": false }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-method-response.html">AWS CLI</a> </div>
     * 
     * @param methodResponses
     *        Gets a method response associated with a given HTTP status code.
     *        </p>
     *        <div class="remarks">
     *        <p>
     *        The collection of method responses are encapsulated in a key-value map, where the key is a response's HTTP
     *        status code and the value is a <a>MethodResponse</a> resource that specifies the response returned to the
     *        caller from the back end through the integration response.
     *        </p>
     *        <h4>Example: Get a 200 OK response of a GET method</h4> <h5>Request</h5>
     *        <p/>
     * 
     *        <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T215008Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     *        <h5>Response</h5>
     *        <p>
     *        The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     *        </p>
     * 
     *        <pre>
     * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.operator": false, "method.response.header.operand_2": false, "method.response.header.operand_1": false }, "statusCode": "200" }</code>
     * </pre>
     *        <p/>
     *        </div> <div class="seeAlso"> <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-method-response.html">AWS CLI</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withMethodResponses(java.util.Map<String, MethodResponse> methodResponses) {
        setMethodResponses(methodResponses);
        return this;
    }

    public UpdateMethodResult addMethodResponsesEntry(String key, MethodResponse value) {
        if (null == this.methodResponses) {
            this.methodResponses = new java.util.HashMap<String, MethodResponse>();
        }
        if (this.methodResponses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.methodResponses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MethodResponses.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult clearMethodResponsesEntries() {
        this.methodResponses = null;
        return this;
    }

    /**
     * <p>
     * Gets the method's integration responsible for passing the client-submitted request to the back end and performing
     * necessary transformations to make the request compliant with the back end.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example:</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T213210Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true } ], "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:responses": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "0cjtch", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestTemplates": { "application/json": "{\n \"a\": \"$input.params('operand1')\",\n \"b\": \"$input.params('operand2')\", \n \"op\": \"$input.params('operator')\" \n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-west-2:lambda:path//2015-03-31/functions/arn:aws:lambda:us-west-2:123456789012:function:Calc/invocations", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.operator": "integration.response.body.op", "method.response.header.operand_2": "integration.response.body.b", "method.response.header.operand_1": "integration.response.body.a" }, "responseTemplates": { "application/json": "#set($res = $input.path('$'))\n{\n \"result\": \"$res.a, $res.b, $res.op => $res.c\",\n \"a\" : \"$res.a\",\n \"b\" : \"$res.b\",\n \"op\" : \"$res.op\",\n \"c\" : \"$res.c\"\n}" }, "selectionPattern": "", "statusCode": "200" } } }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-integration.html">AWS CLI</a> </div>
     * 
     * @param methodIntegration
     *        Gets the method's integration responsible for passing the client-submitted request to the back end and
     *        performing necessary transformations to make the request compliant with the back end.
     *        </p>
     *        <div class="remarks">
     *        <p/>
     *        <h4>Example:</h4>
     *        <h5>Request</h5>
     *        <p/>
     * 
     *        <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T213210Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     *        <h5>Response</h5>
     *        <p>
     *        The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     *        </p>
     * 
     *        <pre>
     * <code>{ "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true } ], "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:responses": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "0cjtch", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestTemplates": { "application/json": "{\n \"a\": \"$input.params('operand1')\",\n \"b\": \"$input.params('operand2')\", \n \"op\": \"$input.params('operator')\" \n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-west-2:lambda:path//2015-03-31/functions/arn:aws:lambda:us-west-2:123456789012:function:Calc/invocations", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.operator": "integration.response.body.op", "method.response.header.operand_2": "integration.response.body.b", "method.response.header.operand_1": "integration.response.body.a" }, "responseTemplates": { "application/json": "#set($res = $input.path('$'))\n{\n \"result\": \"$res.a, $res.b, $res.op => $res.c\",\n \"a\" : \"$res.a\",\n \"b\" : \"$res.b\",\n \"op\" : \"$res.op\",\n \"c\" : \"$res.c\"\n}" }, "selectionPattern": "", "statusCode": "200" } } }</code>
     * </pre>
     *        <p/>
     *        </div> <div class="seeAlso"> <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-integration.html">AWS CLI</a>
     */

    public void setMethodIntegration(Integration methodIntegration) {
        this.methodIntegration = methodIntegration;
    }

    /**
     * <p>
     * Gets the method's integration responsible for passing the client-submitted request to the back end and performing
     * necessary transformations to make the request compliant with the back end.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example:</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T213210Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true } ], "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:responses": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "0cjtch", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestTemplates": { "application/json": "{\n \"a\": \"$input.params('operand1')\",\n \"b\": \"$input.params('operand2')\", \n \"op\": \"$input.params('operator')\" \n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-west-2:lambda:path//2015-03-31/functions/arn:aws:lambda:us-west-2:123456789012:function:Calc/invocations", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.operator": "integration.response.body.op", "method.response.header.operand_2": "integration.response.body.b", "method.response.header.operand_1": "integration.response.body.a" }, "responseTemplates": { "application/json": "#set($res = $input.path('$'))\n{\n \"result\": \"$res.a, $res.b, $res.op => $res.c\",\n \"a\" : \"$res.a\",\n \"b\" : \"$res.b\",\n \"op\" : \"$res.op\",\n \"c\" : \"$res.c\"\n}" }, "selectionPattern": "", "statusCode": "200" } } }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-integration.html">AWS CLI</a> </div>
     * 
     * @return Gets the method's integration responsible for passing the client-submitted request to the back end and
     *         performing necessary transformations to make the request compliant with the back end.
     *         </p>
     *         <div class="remarks">
     *         <p/>
     *         <h4>Example:</h4>
     *         <h5>Request</h5>
     *         <p/>
     * 
     *         <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T213210Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     *         <h5>Response</h5>
     *         <p>
     *         The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     *         </p>
     * 
     *         <pre>
     * <code>{ "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true } ], "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:responses": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "0cjtch", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestTemplates": { "application/json": "{\n \"a\": \"$input.params('operand1')\",\n \"b\": \"$input.params('operand2')\", \n \"op\": \"$input.params('operator')\" \n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-west-2:lambda:path//2015-03-31/functions/arn:aws:lambda:us-west-2:123456789012:function:Calc/invocations", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.operator": "integration.response.body.op", "method.response.header.operand_2": "integration.response.body.b", "method.response.header.operand_1": "integration.response.body.a" }, "responseTemplates": { "application/json": "#set($res = $input.path('$'))\n{\n \"result\": \"$res.a, $res.b, $res.op => $res.c\",\n \"a\" : \"$res.a\",\n \"b\" : \"$res.b\",\n \"op\" : \"$res.op\",\n \"c\" : \"$res.c\"\n}" }, "selectionPattern": "", "statusCode": "200" } } }</code>
     * </pre>
     *         <p/>
     *         </div> <div class="seeAlso"> <a
     *         href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-integration.html">AWS CLI</a>
     */

    public Integration getMethodIntegration() {
        return this.methodIntegration;
    }

    /**
     * <p>
     * Gets the method's integration responsible for passing the client-submitted request to the back end and performing
     * necessary transformations to make the request compliant with the back end.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example:</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T213210Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true } ], "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:responses": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "0cjtch", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestTemplates": { "application/json": "{\n \"a\": \"$input.params('operand1')\",\n \"b\": \"$input.params('operand2')\", \n \"op\": \"$input.params('operator')\" \n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-west-2:lambda:path//2015-03-31/functions/arn:aws:lambda:us-west-2:123456789012:function:Calc/invocations", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.operator": "integration.response.body.op", "method.response.header.operand_2": "integration.response.body.b", "method.response.header.operand_1": "integration.response.body.a" }, "responseTemplates": { "application/json": "#set($res = $input.path('$'))\n{\n \"result\": \"$res.a, $res.b, $res.op => $res.c\",\n \"a\" : \"$res.a\",\n \"b\" : \"$res.b\",\n \"op\" : \"$res.op\",\n \"c\" : \"$res.c\"\n}" }, "selectionPattern": "", "statusCode": "200" } } }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-integration.html">AWS CLI</a> </div>
     * 
     * @param methodIntegration
     *        Gets the method's integration responsible for passing the client-submitted request to the back end and
     *        performing necessary transformations to make the request compliant with the back end.
     *        </p>
     *        <div class="remarks">
     *        <p/>
     *        <h4>Example:</h4>
     *        <h5>Request</h5>
     *        <p/>
     * 
     *        <pre>
     * <code>GET /restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com Content-Length: 117 X-Amz-Date: 20160613T213210Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160613/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
     * </pre>
     * 
     *        <h5>Response</h5>
     *        <p>
     *        The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
     *        </p>
     * 
     *        <pre>
     * <code>{ "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true } ], "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integration:responses": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "0cjtch", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestTemplates": { "application/json": "{\n \"a\": \"$input.params('operand1')\",\n \"b\": \"$input.params('operand2')\", \n \"op\": \"$input.params('operator')\" \n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-west-2:lambda:path//2015-03-31/functions/arn:aws:lambda:us-west-2:123456789012:function:Calc/invocations", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/uojnr9hd57/resources/0cjtch/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.operator": "integration.response.body.op", "method.response.header.operand_2": "integration.response.body.b", "method.response.header.operand_1": "integration.response.body.a" }, "responseTemplates": { "application/json": "#set($res = $input.path('$'))\n{\n \"result\": \"$res.a, $res.b, $res.op => $res.c\",\n \"a\" : \"$res.a\",\n \"b\" : \"$res.b\",\n \"op\" : \"$res.op\",\n \"c\" : \"$res.c\"\n}" }, "selectionPattern": "", "statusCode": "200" } } }</code>
     * </pre>
     *        <p/>
     *        </div> <div class="seeAlso"> <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-integration.html">AWS CLI</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withMethodIntegration(Integration methodIntegration) {
        setMethodIntegration(methodIntegration);
        return this;
    }

    /**
     * <p>
     * A list of authorization scopes configured on the method. The scopes are used with a
     * <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by
     * matching the method scopes against the scopes parsed from the access token in the incoming request. The method
     * invocation is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the
     * invocation is not authorized. When the method scope is configured, the client must provide an access token
     * instead of an identity token for authorization purposes.
     * </p>
     * 
     * @return A list of authorization scopes configured on the method. The scopes are used with a
     *         <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by
     *         matching the method scopes against the scopes parsed from the access token in the incoming request. The
     *         method invocation is authorized if any method scopes matches a claimed scope in the access token.
     *         Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide
     *         an access token instead of an identity token for authorization purposes.
     */

    public java.util.List<String> getAuthorizationScopes() {
        return authorizationScopes;
    }

    /**
     * <p>
     * A list of authorization scopes configured on the method. The scopes are used with a
     * <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by
     * matching the method scopes against the scopes parsed from the access token in the incoming request. The method
     * invocation is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the
     * invocation is not authorized. When the method scope is configured, the client must provide an access token
     * instead of an identity token for authorization purposes.
     * </p>
     * 
     * @param authorizationScopes
     *        A list of authorization scopes configured on the method. The scopes are used with a
     *        <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by
     *        matching the method scopes against the scopes parsed from the access token in the incoming request. The
     *        method invocation is authorized if any method scopes matches a claimed scope in the access token.
     *        Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide
     *        an access token instead of an identity token for authorization purposes.
     */

    public void setAuthorizationScopes(java.util.Collection<String> authorizationScopes) {
        if (authorizationScopes == null) {
            this.authorizationScopes = null;
            return;
        }

        this.authorizationScopes = new java.util.ArrayList<String>(authorizationScopes);
    }

    /**
     * <p>
     * A list of authorization scopes configured on the method. The scopes are used with a
     * <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by
     * matching the method scopes against the scopes parsed from the access token in the incoming request. The method
     * invocation is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the
     * invocation is not authorized. When the method scope is configured, the client must provide an access token
     * instead of an identity token for authorization purposes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizationScopes(java.util.Collection)} or {@link #withAuthorizationScopes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param authorizationScopes
     *        A list of authorization scopes configured on the method. The scopes are used with a
     *        <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by
     *        matching the method scopes against the scopes parsed from the access token in the incoming request. The
     *        method invocation is authorized if any method scopes matches a claimed scope in the access token.
     *        Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide
     *        an access token instead of an identity token for authorization purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withAuthorizationScopes(String... authorizationScopes) {
        if (this.authorizationScopes == null) {
            setAuthorizationScopes(new java.util.ArrayList<String>(authorizationScopes.length));
        }
        for (String ele : authorizationScopes) {
            this.authorizationScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of authorization scopes configured on the method. The scopes are used with a
     * <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by
     * matching the method scopes against the scopes parsed from the access token in the incoming request. The method
     * invocation is authorized if any method scopes matches a claimed scope in the access token. Otherwise, the
     * invocation is not authorized. When the method scope is configured, the client must provide an access token
     * instead of an identity token for authorization purposes.
     * </p>
     * 
     * @param authorizationScopes
     *        A list of authorization scopes configured on the method. The scopes are used with a
     *        <code>COGNITO_USER_POOLS</code> authorizer to authorize the method invocation. The authorization works by
     *        matching the method scopes against the scopes parsed from the access token in the incoming request. The
     *        method invocation is authorized if any method scopes matches a claimed scope in the access token.
     *        Otherwise, the invocation is not authorized. When the method scope is configured, the client must provide
     *        an access token instead of an identity token for authorization purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withAuthorizationScopes(java.util.Collection<String> authorizationScopes) {
        setAuthorizationScopes(authorizationScopes);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: ").append(getHttpMethod()).append(",");
        if (getAuthorizationType() != null)
            sb.append("AuthorizationType: ").append(getAuthorizationType()).append(",");
        if (getAuthorizerId() != null)
            sb.append("AuthorizerId: ").append(getAuthorizerId()).append(",");
        if (getApiKeyRequired() != null)
            sb.append("ApiKeyRequired: ").append(getApiKeyRequired()).append(",");
        if (getRequestValidatorId() != null)
            sb.append("RequestValidatorId: ").append(getRequestValidatorId()).append(",");
        if (getOperationName() != null)
            sb.append("OperationName: ").append(getOperationName()).append(",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: ").append(getRequestParameters()).append(",");
        if (getRequestModels() != null)
            sb.append("RequestModels: ").append(getRequestModels()).append(",");
        if (getMethodResponses() != null)
            sb.append("MethodResponses: ").append(getMethodResponses()).append(",");
        if (getMethodIntegration() != null)
            sb.append("MethodIntegration: ").append(getMethodIntegration()).append(",");
        if (getAuthorizationScopes() != null)
            sb.append("AuthorizationScopes: ").append(getAuthorizationScopes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMethodResult == false)
            return false;
        UpdateMethodResult other = (UpdateMethodResult) obj;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false)
            return false;
        if (other.getAuthorizerId() == null ^ this.getAuthorizerId() == null)
            return false;
        if (other.getAuthorizerId() != null && other.getAuthorizerId().equals(this.getAuthorizerId()) == false)
            return false;
        if (other.getApiKeyRequired() == null ^ this.getApiKeyRequired() == null)
            return false;
        if (other.getApiKeyRequired() != null && other.getApiKeyRequired().equals(this.getApiKeyRequired()) == false)
            return false;
        if (other.getRequestValidatorId() == null ^ this.getRequestValidatorId() == null)
            return false;
        if (other.getRequestValidatorId() != null && other.getRequestValidatorId().equals(this.getRequestValidatorId()) == false)
            return false;
        if (other.getOperationName() == null ^ this.getOperationName() == null)
            return false;
        if (other.getOperationName() != null && other.getOperationName().equals(this.getOperationName()) == false)
            return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null && other.getRequestParameters().equals(this.getRequestParameters()) == false)
            return false;
        if (other.getRequestModels() == null ^ this.getRequestModels() == null)
            return false;
        if (other.getRequestModels() != null && other.getRequestModels().equals(this.getRequestModels()) == false)
            return false;
        if (other.getMethodResponses() == null ^ this.getMethodResponses() == null)
            return false;
        if (other.getMethodResponses() != null && other.getMethodResponses().equals(this.getMethodResponses()) == false)
            return false;
        if (other.getMethodIntegration() == null ^ this.getMethodIntegration() == null)
            return false;
        if (other.getMethodIntegration() != null && other.getMethodIntegration().equals(this.getMethodIntegration()) == false)
            return false;
        if (other.getAuthorizationScopes() == null ^ this.getAuthorizationScopes() == null)
            return false;
        if (other.getAuthorizationScopes() != null && other.getAuthorizationScopes().equals(this.getAuthorizationScopes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerId() == null) ? 0 : getAuthorizerId().hashCode());
        hashCode = prime * hashCode + ((getApiKeyRequired() == null) ? 0 : getApiKeyRequired().hashCode());
        hashCode = prime * hashCode + ((getRequestValidatorId() == null) ? 0 : getRequestValidatorId().hashCode());
        hashCode = prime * hashCode + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestModels() == null) ? 0 : getRequestModels().hashCode());
        hashCode = prime * hashCode + ((getMethodResponses() == null) ? 0 : getMethodResponses().hashCode());
        hashCode = prime * hashCode + ((getMethodIntegration() == null) ? 0 : getMethodIntegration().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationScopes() == null) ? 0 : getAuthorizationScopes().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMethodResult clone() {
        try {
            return (UpdateMethodResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
