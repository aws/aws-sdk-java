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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The connection ID.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The type of the network connection to the integration endpoint. Currently the only valid value is INTERNET, for
     * connections through the public routable internet.
     * </p>
     */
    private String connectionType;
    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and
     * CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     */
    private String contentHandlingStrategy;
    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/*.
     * To use resource-based permissions on supported AWS services, specify null.
     * </p>
     */
    private String credentialsArn;
    /**
     * <p>
     * The description of the integration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     */
    private String integrationMethod;
    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service action, including the Lambda
     * function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS integration.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client
     * request passed through as-is. This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as
     * HTTP custom integration.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating route or method request with an HTTP endpoint, with the client request passed through
     * as-is. This is also referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any
     * backend.
     * </p>
     */
    private String integrationType;
    /**
     * <p>
     * For a Lambda proxy integration, this is the URI of the Lambda function.
     * </p>
     */
    private String integrationUri;
    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the requestTemplates property on the Integration resource. There are
     * three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without
     * transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if
     * there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     */
    private String passthroughBehavior;
    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the method request to the backend. The key is
     * an integration request parameter name and the associated value is a method request parameter value or static
     * value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request
     * parameter value must match the pattern of method.request.{location}.{name} , where {location} is querystring,
     * path, or header; and {name} must be a valid and unique method request parameter name.
     * </p>
     */
    private java.util.Map<String, String> requestParameters;
    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request payload based on the value of the
     * Content-Type header sent by the client. The content type value is the key in this map, and the template (as a
     * String) is the value.
     * </p>
     */
    private java.util.Map<String, String> requestTemplates;
    /**
     * <p>
     * The template selection expression for the integration.
     * </p>
     */
    private String templateSelectionExpression;
    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
     * </p>
     */
    private Integer timeoutInMillis;

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @return The API identifier.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The connection ID.
     * </p>
     * 
     * @param connectionId
     *        The connection ID.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The connection ID.
     * </p>
     * 
     * @return The connection ID.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The connection ID.
     * </p>
     * 
     * @param connectionId
     *        The connection ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Currently the only valid value is INTERNET, for
     * connections through the public routable internet.
     * </p>
     * 
     * @param connectionType
     *        The type of the network connection to the integration endpoint. Currently the only valid value is
     *        INTERNET, for connections through the public routable internet.
     * @see ConnectionType
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Currently the only valid value is INTERNET, for
     * connections through the public routable internet.
     * </p>
     * 
     * @return The type of the network connection to the integration endpoint. Currently the only valid value is
     *         INTERNET, for connections through the public routable internet.
     * @see ConnectionType
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Currently the only valid value is INTERNET, for
     * connections through the public routable internet.
     * </p>
     * 
     * @param connectionType
     *        The type of the network connection to the integration endpoint. Currently the only valid value is
     *        INTERNET, for connections through the public routable internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public CreateIntegrationRequest withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. Currently the only valid value is INTERNET, for
     * connections through the public routable internet.
     * </p>
     * 
     * @param connectionType
     *        The type of the network connection to the integration endpoint. Currently the only valid value is
     *        INTERNET, for connections through the public routable internet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public CreateIntegrationRequest withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and
     * CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @param contentHandlingStrategy
     *        Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY
     *        and CONVERT_TO_TEXT, with the following behaviors:</p>
     *        <p>
     *        CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *        blob.
     *        </p>
     *        <p>
     *        CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the route response or method response without modification.
     * @see ContentHandlingStrategy
     */

    public void setContentHandlingStrategy(String contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and
     * CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @return Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY
     *         and CONVERT_TO_TEXT, with the following behaviors:</p>
     *         <p>
     *         CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *         blob.
     *         </p>
     *         <p>
     *         CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *         </p>
     *         <p>
     *         If this property is not defined, the response payload will be passed through from the integration
     *         response to the route response or method response without modification.
     * @see ContentHandlingStrategy
     */

    public String getContentHandlingStrategy() {
        return this.contentHandlingStrategy;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and
     * CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @param contentHandlingStrategy
     *        Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY
     *        and CONVERT_TO_TEXT, with the following behaviors:</p>
     *        <p>
     *        CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *        blob.
     *        </p>
     *        <p>
     *        CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the route response or method response without modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public CreateIntegrationRequest withContentHandlingStrategy(String contentHandlingStrategy) {
        setContentHandlingStrategy(contentHandlingStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and
     * CONVERT_TO_TEXT, with the following behaviors:
     * </p>
     * <p>
     * CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob.
     * </p>
     * <p>
     * CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * route response or method response without modification.
     * </p>
     * 
     * @param contentHandlingStrategy
     *        Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY
     *        and CONVERT_TO_TEXT, with the following behaviors:</p>
     *        <p>
     *        CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary
     *        blob.
     *        </p>
     *        <p>
     *        CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the route response or method response without modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public CreateIntegrationRequest withContentHandlingStrategy(ContentHandlingStrategy contentHandlingStrategy) {
        this.contentHandlingStrategy = contentHandlingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/*.
     * To use resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @param credentialsArn
     *        Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     *        available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     *        require that the caller's identity be passed through from the request, specify the string
     *        arn:aws:iam::*:user/*. To use resource-based permissions on supported AWS services, specify null.
     */

    public void setCredentialsArn(String credentialsArn) {
        this.credentialsArn = credentialsArn;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/*.
     * To use resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @return Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     *         available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN).
     *         To require that the caller's identity be passed through from the request, specify the string
     *         arn:aws:iam::*:user/*. To use resource-based permissions on supported AWS services, specify null.
     */

    public String getCredentialsArn() {
        return this.credentialsArn;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/*.
     * To use resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @param credentialsArn
     *        Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     *        available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     *        require that the caller's identity be passed through from the request, specify the string
     *        arn:aws:iam::*:user/*. To use resource-based permissions on supported AWS services, specify null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withCredentialsArn(String credentialsArn) {
        setCredentialsArn(credentialsArn);
        return this;
    }

    /**
     * <p>
     * The description of the integration.
     * </p>
     * 
     * @param description
     *        The description of the integration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the integration.
     * </p>
     * 
     * @return The description of the integration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the integration.
     * </p>
     * 
     * @param description
     *        The description of the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * 
     * @param integrationMethod
     *        Specifies the integration's HTTP method type.
     */

    public void setIntegrationMethod(String integrationMethod) {
        this.integrationMethod = integrationMethod;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * 
     * @return Specifies the integration's HTTP method type.
     */

    public String getIntegrationMethod() {
        return this.integrationMethod;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * 
     * @param integrationMethod
     *        Specifies the integration's HTTP method type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withIntegrationMethod(String integrationMethod) {
        setIntegrationMethod(integrationMethod);
        return this;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service action, including the Lambda
     * function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS integration.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client
     * request passed through as-is. This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as
     * HTTP custom integration.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating route or method request with an HTTP endpoint, with the client request passed through
     * as-is. This is also referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any
     * backend.
     * </p>
     * 
     * @param integrationType
     *        The integration type of an integration. One of the following:</p>
     *        <p>
     *        AWS: for integrating the route or method request with an AWS service action, including the Lambda
     *        function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda
     *        custom integration. With any other AWS service action, this is known as AWS integration.
     *        </p>
     *        <p>
     *        AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the
     *        client request passed through as-is. This integration is also referred to as Lambda proxy integration.
     *        </p>
     *        <p>
     *        HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred
     *        to as HTTP custom integration.
     *        </p>
     *        <p>
     *        HTTP_PROXY: for integrating route or method request with an HTTP endpoint, with the client request passed
     *        through as-is. This is also referred to as HTTP proxy integration.
     *        </p>
     *        <p>
     *        MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without
     *        invoking any backend.
     * @see IntegrationType
     */

    public void setIntegrationType(String integrationType) {
        this.integrationType = integrationType;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service action, including the Lambda
     * function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS integration.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client
     * request passed through as-is. This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as
     * HTTP custom integration.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating route or method request with an HTTP endpoint, with the client request passed through
     * as-is. This is also referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any
     * backend.
     * </p>
     * 
     * @return The integration type of an integration. One of the following:</p>
     *         <p>
     *         AWS: for integrating the route or method request with an AWS service action, including the Lambda
     *         function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda
     *         custom integration. With any other AWS service action, this is known as AWS integration.
     *         </p>
     *         <p>
     *         AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the
     *         client request passed through as-is. This integration is also referred to as Lambda proxy integration.
     *         </p>
     *         <p>
     *         HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also
     *         referred to as HTTP custom integration.
     *         </p>
     *         <p>
     *         HTTP_PROXY: for integrating route or method request with an HTTP endpoint, with the client request passed
     *         through as-is. This is also referred to as HTTP proxy integration.
     *         </p>
     *         <p>
     *         MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without
     *         invoking any backend.
     * @see IntegrationType
     */

    public String getIntegrationType() {
        return this.integrationType;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service action, including the Lambda
     * function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS integration.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client
     * request passed through as-is. This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as
     * HTTP custom integration.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating route or method request with an HTTP endpoint, with the client request passed through
     * as-is. This is also referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any
     * backend.
     * </p>
     * 
     * @param integrationType
     *        The integration type of an integration. One of the following:</p>
     *        <p>
     *        AWS: for integrating the route or method request with an AWS service action, including the Lambda
     *        function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda
     *        custom integration. With any other AWS service action, this is known as AWS integration.
     *        </p>
     *        <p>
     *        AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the
     *        client request passed through as-is. This integration is also referred to as Lambda proxy integration.
     *        </p>
     *        <p>
     *        HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred
     *        to as HTTP custom integration.
     *        </p>
     *        <p>
     *        HTTP_PROXY: for integrating route or method request with an HTTP endpoint, with the client request passed
     *        through as-is. This is also referred to as HTTP proxy integration.
     *        </p>
     *        <p>
     *        MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without
     *        invoking any backend.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public CreateIntegrationRequest withIntegrationType(String integrationType) {
        setIntegrationType(integrationType);
        return this;
    }

    /**
     * <p>
     * The integration type of an integration. One of the following:
     * </p>
     * <p>
     * AWS: for integrating the route or method request with an AWS service action, including the Lambda
     * function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom
     * integration. With any other AWS service action, this is known as AWS integration.
     * </p>
     * <p>
     * AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client
     * request passed through as-is. This integration is also referred to as Lambda proxy integration.
     * </p>
     * <p>
     * HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as
     * HTTP custom integration.
     * </p>
     * <p>
     * HTTP_PROXY: for integrating route or method request with an HTTP endpoint, with the client request passed through
     * as-is. This is also referred to as HTTP proxy integration.
     * </p>
     * <p>
     * MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any
     * backend.
     * </p>
     * 
     * @param integrationType
     *        The integration type of an integration. One of the following:</p>
     *        <p>
     *        AWS: for integrating the route or method request with an AWS service action, including the Lambda
     *        function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda
     *        custom integration. With any other AWS service action, this is known as AWS integration.
     *        </p>
     *        <p>
     *        AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the
     *        client request passed through as-is. This integration is also referred to as Lambda proxy integration.
     *        </p>
     *        <p>
     *        HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred
     *        to as HTTP custom integration.
     *        </p>
     *        <p>
     *        HTTP_PROXY: for integrating route or method request with an HTTP endpoint, with the client request passed
     *        through as-is. This is also referred to as HTTP proxy integration.
     *        </p>
     *        <p>
     *        MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without
     *        invoking any backend.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public CreateIntegrationRequest withIntegrationType(IntegrationType integrationType) {
        this.integrationType = integrationType.toString();
        return this;
    }

    /**
     * <p>
     * For a Lambda proxy integration, this is the URI of the Lambda function.
     * </p>
     * 
     * @param integrationUri
     *        For a Lambda proxy integration, this is the URI of the Lambda function.
     */

    public void setIntegrationUri(String integrationUri) {
        this.integrationUri = integrationUri;
    }

    /**
     * <p>
     * For a Lambda proxy integration, this is the URI of the Lambda function.
     * </p>
     * 
     * @return For a Lambda proxy integration, this is the URI of the Lambda function.
     */

    public String getIntegrationUri() {
        return this.integrationUri;
    }

    /**
     * <p>
     * For a Lambda proxy integration, this is the URI of the Lambda function.
     * </p>
     * 
     * @param integrationUri
     *        For a Lambda proxy integration, this is the URI of the Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withIntegrationUri(String integrationUri) {
        setIntegrationUri(integrationUri);
        return this;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the requestTemplates property on the Integration resource. There are
     * three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without
     * transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if
     * there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * 
     * @param passthroughBehavior
     *        Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request,
     *        and the available mapping templates specified as the requestTemplates property on the Integration
     *        resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.</p>
     *        <p>
     *        WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend
     *        without transformation.
     *        </p>
     *        <p>
     *        NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     *        </p>
     *        <p>
     *        WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates.
     *        However, if there is at least one content type defined, unmapped content types will be rejected with the
     *        same HTTP 415 Unsupported Media Type response.
     * @see PassthroughBehavior
     */

    public void setPassthroughBehavior(String passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the requestTemplates property on the Integration resource. There are
     * three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without
     * transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if
     * there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * 
     * @return Specifies the pass-through behavior for incoming requests based on the Content-Type header in the
     *         request, and the available mapping templates specified as the requestTemplates property on the
     *         Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.</p>
     *         <p>
     *         WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend
     *         without transformation.
     *         </p>
     *         <p>
     *         NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     *         </p>
     *         <p>
     *         WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates.
     *         However, if there is at least one content type defined, unmapped content types will be rejected with the
     *         same HTTP 415 Unsupported Media Type response.
     * @see PassthroughBehavior
     */

    public String getPassthroughBehavior() {
        return this.passthroughBehavior;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the requestTemplates property on the Integration resource. There are
     * three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without
     * transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if
     * there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * 
     * @param passthroughBehavior
     *        Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request,
     *        and the available mapping templates specified as the requestTemplates property on the Integration
     *        resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.</p>
     *        <p>
     *        WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend
     *        without transformation.
     *        </p>
     *        <p>
     *        NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     *        </p>
     *        <p>
     *        WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates.
     *        However, if there is at least one content type defined, unmapped content types will be rejected with the
     *        same HTTP 415 Unsupported Media Type response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PassthroughBehavior
     */

    public CreateIntegrationRequest withPassthroughBehavior(String passthroughBehavior) {
        setPassthroughBehavior(passthroughBehavior);
        return this;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the requestTemplates property on the Integration resource. There are
     * three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.
     * </p>
     * <p>
     * WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without
     * transformation.
     * </p>
     * <p>
     * NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     * </p>
     * <p>
     * WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if
     * there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415
     * Unsupported Media Type response.
     * </p>
     * 
     * @param passthroughBehavior
     *        Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request,
     *        and the available mapping templates specified as the requestTemplates property on the Integration
     *        resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.</p>
     *        <p>
     *        WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend
     *        without transformation.
     *        </p>
     *        <p>
     *        NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response.
     *        </p>
     *        <p>
     *        WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates.
     *        However, if there is at least one content type defined, unmapped content types will be rejected with the
     *        same HTTP 415 Unsupported Media Type response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PassthroughBehavior
     */

    public CreateIntegrationRequest withPassthroughBehavior(PassthroughBehavior passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior.toString();
        return this;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the method request to the backend. The key is
     * an integration request parameter name and the associated value is a method request parameter value or static
     * value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request
     * parameter value must match the pattern of method.request.{location}.{name} , where {location} is querystring,
     * path, or header; and {name} must be a valid and unique method request parameter name.
     * </p>
     * 
     * @return A key-value map specifying request parameters that are passed from the method request to the backend. The
     *         key is an integration request parameter name and the associated value is a method request parameter value
     *         or static value that must be enclosed within single quotes and pre-encoded as required by the backend.
     *         The method request parameter value must match the pattern of method.request.{location}.{name} , where
     *         {location} is querystring, path, or header; and {name} must be a valid and unique method request
     *         parameter name.
     */

    public java.util.Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the method request to the backend. The key is
     * an integration request parameter name and the associated value is a method request parameter value or static
     * value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request
     * parameter value must match the pattern of method.request.{location}.{name} , where {location} is querystring,
     * path, or header; and {name} must be a valid and unique method request parameter name.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map specifying request parameters that are passed from the method request to the backend. The
     *        key is an integration request parameter name and the associated value is a method request parameter value
     *        or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The
     *        method request parameter value must match the pattern of method.request.{location}.{name} , where
     *        {location} is querystring, path, or header; and {name} must be a valid and unique method request parameter
     *        name.
     */

    public void setRequestParameters(java.util.Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the method request to the backend. The key is
     * an integration request parameter name and the associated value is a method request parameter value or static
     * value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request
     * parameter value must match the pattern of method.request.{location}.{name} , where {location} is querystring,
     * path, or header; and {name} must be a valid and unique method request parameter name.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map specifying request parameters that are passed from the method request to the backend. The
     *        key is an integration request parameter name and the associated value is a method request parameter value
     *        or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The
     *        method request parameter value must match the pattern of method.request.{location}.{name} , where
     *        {location} is querystring, path, or header; and {name} must be a valid and unique method request parameter
     *        name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withRequestParameters(java.util.Map<String, String> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    public CreateIntegrationRequest addRequestParametersEntry(String key, String value) {
        if (null == this.requestParameters) {
            this.requestParameters = new java.util.HashMap<String, String>();
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

    public CreateIntegrationRequest clearRequestParametersEntries() {
        this.requestParameters = null;
        return this;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request payload based on the value of the
     * Content-Type header sent by the client. The content type value is the key in this map, and the template (as a
     * String) is the value.
     * </p>
     * 
     * @return Represents a map of Velocity templates that are applied on the request payload based on the value of the
     *         Content-Type header sent by the client. The content type value is the key in this map, and the template
     *         (as a String) is the value.
     */

    public java.util.Map<String, String> getRequestTemplates() {
        return requestTemplates;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request payload based on the value of the
     * Content-Type header sent by the client. The content type value is the key in this map, and the template (as a
     * String) is the value.
     * </p>
     * 
     * @param requestTemplates
     *        Represents a map of Velocity templates that are applied on the request payload based on the value of the
     *        Content-Type header sent by the client. The content type value is the key in this map, and the template
     *        (as a String) is the value.
     */

    public void setRequestTemplates(java.util.Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
    }

    /**
     * <p>
     * Represents a map of Velocity templates that are applied on the request payload based on the value of the
     * Content-Type header sent by the client. The content type value is the key in this map, and the template (as a
     * String) is the value.
     * </p>
     * 
     * @param requestTemplates
     *        Represents a map of Velocity templates that are applied on the request payload based on the value of the
     *        Content-Type header sent by the client. The content type value is the key in this map, and the template
     *        (as a String) is the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withRequestTemplates(java.util.Map<String, String> requestTemplates) {
        setRequestTemplates(requestTemplates);
        return this;
    }

    public CreateIntegrationRequest addRequestTemplatesEntry(String key, String value) {
        if (null == this.requestTemplates) {
            this.requestTemplates = new java.util.HashMap<String, String>();
        }
        if (this.requestTemplates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestTemplates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestTemplates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest clearRequestTemplatesEntries() {
        this.requestTemplates = null;
        return this;
    }

    /**
     * <p>
     * The template selection expression for the integration.
     * </p>
     * 
     * @param templateSelectionExpression
     *        The template selection expression for the integration.
     */

    public void setTemplateSelectionExpression(String templateSelectionExpression) {
        this.templateSelectionExpression = templateSelectionExpression;
    }

    /**
     * <p>
     * The template selection expression for the integration.
     * </p>
     * 
     * @return The template selection expression for the integration.
     */

    public String getTemplateSelectionExpression() {
        return this.templateSelectionExpression;
    }

    /**
     * <p>
     * The template selection expression for the integration.
     * </p>
     * 
     * @param templateSelectionExpression
     *        The template selection expression for the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withTemplateSelectionExpression(String templateSelectionExpression) {
        setTemplateSelectionExpression(templateSelectionExpression);
        return this;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
     * </p>
     * 
     * @param timeoutInMillis
     *        Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
     */

    public void setTimeoutInMillis(Integer timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
     * </p>
     * 
     * @return Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29
     *         seconds.
     */

    public Integer getTimeoutInMillis() {
        return this.timeoutInMillis;
    }

    /**
     * <p>
     * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
     * </p>
     * 
     * @param timeoutInMillis
     *        Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withTimeoutInMillis(Integer timeoutInMillis) {
        setTimeoutInMillis(timeoutInMillis);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType()).append(",");
        if (getContentHandlingStrategy() != null)
            sb.append("ContentHandlingStrategy: ").append(getContentHandlingStrategy()).append(",");
        if (getCredentialsArn() != null)
            sb.append("CredentialsArn: ").append(getCredentialsArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIntegrationMethod() != null)
            sb.append("IntegrationMethod: ").append(getIntegrationMethod()).append(",");
        if (getIntegrationType() != null)
            sb.append("IntegrationType: ").append(getIntegrationType()).append(",");
        if (getIntegrationUri() != null)
            sb.append("IntegrationUri: ").append(getIntegrationUri()).append(",");
        if (getPassthroughBehavior() != null)
            sb.append("PassthroughBehavior: ").append(getPassthroughBehavior()).append(",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: ").append(getRequestParameters()).append(",");
        if (getRequestTemplates() != null)
            sb.append("RequestTemplates: ").append(getRequestTemplates()).append(",");
        if (getTemplateSelectionExpression() != null)
            sb.append("TemplateSelectionExpression: ").append(getTemplateSelectionExpression()).append(",");
        if (getTimeoutInMillis() != null)
            sb.append("TimeoutInMillis: ").append(getTimeoutInMillis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIntegrationRequest == false)
            return false;
        CreateIntegrationRequest other = (CreateIntegrationRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getContentHandlingStrategy() == null ^ this.getContentHandlingStrategy() == null)
            return false;
        if (other.getContentHandlingStrategy() != null && other.getContentHandlingStrategy().equals(this.getContentHandlingStrategy()) == false)
            return false;
        if (other.getCredentialsArn() == null ^ this.getCredentialsArn() == null)
            return false;
        if (other.getCredentialsArn() != null && other.getCredentialsArn().equals(this.getCredentialsArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIntegrationMethod() == null ^ this.getIntegrationMethod() == null)
            return false;
        if (other.getIntegrationMethod() != null && other.getIntegrationMethod().equals(this.getIntegrationMethod()) == false)
            return false;
        if (other.getIntegrationType() == null ^ this.getIntegrationType() == null)
            return false;
        if (other.getIntegrationType() != null && other.getIntegrationType().equals(this.getIntegrationType()) == false)
            return false;
        if (other.getIntegrationUri() == null ^ this.getIntegrationUri() == null)
            return false;
        if (other.getIntegrationUri() != null && other.getIntegrationUri().equals(this.getIntegrationUri()) == false)
            return false;
        if (other.getPassthroughBehavior() == null ^ this.getPassthroughBehavior() == null)
            return false;
        if (other.getPassthroughBehavior() != null && other.getPassthroughBehavior().equals(this.getPassthroughBehavior()) == false)
            return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null && other.getRequestParameters().equals(this.getRequestParameters()) == false)
            return false;
        if (other.getRequestTemplates() == null ^ this.getRequestTemplates() == null)
            return false;
        if (other.getRequestTemplates() != null && other.getRequestTemplates().equals(this.getRequestTemplates()) == false)
            return false;
        if (other.getTemplateSelectionExpression() == null ^ this.getTemplateSelectionExpression() == null)
            return false;
        if (other.getTemplateSelectionExpression() != null && other.getTemplateSelectionExpression().equals(this.getTemplateSelectionExpression()) == false)
            return false;
        if (other.getTimeoutInMillis() == null ^ this.getTimeoutInMillis() == null)
            return false;
        if (other.getTimeoutInMillis() != null && other.getTimeoutInMillis().equals(this.getTimeoutInMillis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode + ((getContentHandlingStrategy() == null) ? 0 : getContentHandlingStrategy().hashCode());
        hashCode = prime * hashCode + ((getCredentialsArn() == null) ? 0 : getCredentialsArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIntegrationMethod() == null) ? 0 : getIntegrationMethod().hashCode());
        hashCode = prime * hashCode + ((getIntegrationType() == null) ? 0 : getIntegrationType().hashCode());
        hashCode = prime * hashCode + ((getIntegrationUri() == null) ? 0 : getIntegrationUri().hashCode());
        hashCode = prime * hashCode + ((getPassthroughBehavior() == null) ? 0 : getPassthroughBehavior().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestTemplates() == null) ? 0 : getRequestTemplates().hashCode());
        hashCode = prime * hashCode + ((getTemplateSelectionExpression() == null) ? 0 : getTemplateSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMillis() == null) ? 0 : getTimeoutInMillis().hashCode());
        return hashCode;
    }

    @Override
    public CreateIntegrationRequest clone() {
        return (CreateIntegrationRequest) super.clone();
    }

}
