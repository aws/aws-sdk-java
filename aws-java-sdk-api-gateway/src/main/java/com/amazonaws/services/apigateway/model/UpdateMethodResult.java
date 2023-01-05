/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents a client-facing interface by which the client calls the API to access back-end resources. A Method
 * resource is integrated with an Integration resource. Both consist of a request and one or more responses. The method
 * request takes the client input that is passed to the back end through the integration request. A method response
 * returns the output from the back end to the client through an integration response. A method request is embodied in a
 * Method resource, whereas an integration request is embodied in an Integration resource. On the other hand, a method
 * response is represented by a MethodResponse resource, whereas an integration response is represented by an
 * IntegrationResponse resource.
 * </p>
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
     * The identifier of an Authorizer to use on this method. The <code>authorizationType</code> must be
     * <code>CUSTOM</code>.
     * </p>
     */
    private String authorizerId;
    /**
     * <p>
     * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     * </p>
     */
    private Boolean apiKeyRequired;
    /**
     * <p>
     * The identifier of a RequestValidator for request validation.
     * </p>
     */
    private String requestValidatorId;
    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in the <code>PetStore</code> example.
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
     * request parameter names defined here are available in Integration to be mapped to integration request parameters
     * or templates.
     * </p>
     */
    private java.util.Map<String, Boolean> requestParameters;
    /**
     * <p>
     * A key-value map specifying data schemas, represented by Model resources, (as the mapped value) of the request
     * payloads of given content types (as the mapping key).
     * </p>
     */
    private java.util.Map<String, String> requestModels;
    /**
     * <p>
     * Gets a method response associated with a given HTTP status code.
     * </p>
     */
    private java.util.Map<String, MethodResponse> methodResponses;
    /**
     * <p>
     * Gets the method's integration responsible for passing the client-submitted request to the back end and performing
     * necessary transformations to make the request compliant with the back end.
     * </p>
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
     * The identifier of an Authorizer to use on this method. The <code>authorizationType</code> must be
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @param authorizerId
     *        The identifier of an Authorizer to use on this method. The <code>authorizationType</code> must be
     *        <code>CUSTOM</code>.
     */

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * <p>
     * The identifier of an Authorizer to use on this method. The <code>authorizationType</code> must be
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @return The identifier of an Authorizer to use on this method. The <code>authorizationType</code> must be
     *         <code>CUSTOM</code>.
     */

    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * <p>
     * The identifier of an Authorizer to use on this method. The <code>authorizationType</code> must be
     * <code>CUSTOM</code>.
     * </p>
     * 
     * @param authorizerId
     *        The identifier of an Authorizer to use on this method. The <code>authorizationType</code> must be
     *        <code>CUSTOM</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withAuthorizerId(String authorizerId) {
        setAuthorizerId(authorizerId);
        return this;
    }

    /**
     * <p>
     * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     * </p>
     * 
     * @param apiKeyRequired
     *        A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     */

    public void setApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    /**
     * <p>
     * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     * </p>
     * 
     * @return A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     */

    public Boolean getApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     * </p>
     * 
     * @param apiKeyRequired
     *        A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withApiKeyRequired(Boolean apiKeyRequired) {
        setApiKeyRequired(apiKeyRequired);
        return this;
    }

    /**
     * <p>
     * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     * </p>
     * 
     * @return A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     */

    public Boolean isApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * The identifier of a RequestValidator for request validation.
     * </p>
     * 
     * @param requestValidatorId
     *        The identifier of a RequestValidator for request validation.
     */

    public void setRequestValidatorId(String requestValidatorId) {
        this.requestValidatorId = requestValidatorId;
    }

    /**
     * <p>
     * The identifier of a RequestValidator for request validation.
     * </p>
     * 
     * @return The identifier of a RequestValidator for request validation.
     */

    public String getRequestValidatorId() {
        return this.requestValidatorId;
    }

    /**
     * <p>
     * The identifier of a RequestValidator for request validation.
     * </p>
     * 
     * @param requestValidatorId
     *        The identifier of a RequestValidator for request validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withRequestValidatorId(String requestValidatorId) {
        setRequestValidatorId(requestValidatorId);
        return this;
    }

    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in the <code>PetStore</code> example.
     * </p>
     * 
     * @param operationName
     *        A human-friendly operation identifier for the method. For example, you can assign the
     *        <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in the
     *        <code>PetStore</code> example.
     */

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in the <code>PetStore</code> example.
     * </p>
     * 
     * @return A human-friendly operation identifier for the method. For example, you can assign the
     *         <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in the
     *         <code>PetStore</code> example.
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     * <p>
     * A human-friendly operation identifier for the method. For example, you can assign the <code>operationName</code>
     * of <code>ListPets</code> for the <code>GET /pets</code> method in the <code>PetStore</code> example.
     * </p>
     * 
     * @param operationName
     *        A human-friendly operation identifier for the method. For example, you can assign the
     *        <code>operationName</code> of <code>ListPets</code> for the <code>GET /pets</code> method in the
     *        <code>PetStore</code> example.
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
     * request parameter names defined here are available in Integration to be mapped to integration request parameters
     * or templates.
     * </p>
     * 
     * @return A key-value map defining required or optional method request parameters that can be accepted by API
     *         Gateway. A key is a method request parameter name matching the pattern of
     *         <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *         <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *         value associated with the key is a Boolean flag indicating whether the parameter is required (
     *         <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *         available in Integration to be mapped to integration request parameters or templates.
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
     * request parameter names defined here are available in Integration to be mapped to integration request parameters
     * or templates.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map defining required or optional method request parameters that can be accepted by API
     *        Gateway. A key is a method request parameter name matching the pattern of
     *        <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *        <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *        value associated with the key is a Boolean flag indicating whether the parameter is required (
     *        <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *        available in Integration to be mapped to integration request parameters or templates.
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
     * request parameter names defined here are available in Integration to be mapped to integration request parameters
     * or templates.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map defining required or optional method request parameters that can be accepted by API
     *        Gateway. A key is a method request parameter name matching the pattern of
     *        <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *        <code>path</code>, or <code>header</code> and <code>name</code> is a valid and unique parameter name. The
     *        value associated with the key is a Boolean flag indicating whether the parameter is required (
     *        <code>true</code>) or optional (<code>false</code>). The method request parameter names defined here are
     *        available in Integration to be mapped to integration request parameters or templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withRequestParameters(java.util.Map<String, Boolean> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    /**
     * Add a single RequestParameters entry
     *
     * @see UpdateMethodResult#withRequestParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * A key-value map specifying data schemas, represented by Model resources, (as the mapped value) of the request
     * payloads of given content types (as the mapping key).
     * </p>
     * 
     * @return A key-value map specifying data schemas, represented by Model resources, (as the mapped value) of the
     *         request payloads of given content types (as the mapping key).
     */

    public java.util.Map<String, String> getRequestModels() {
        return requestModels;
    }

    /**
     * <p>
     * A key-value map specifying data schemas, represented by Model resources, (as the mapped value) of the request
     * payloads of given content types (as the mapping key).
     * </p>
     * 
     * @param requestModels
     *        A key-value map specifying data schemas, represented by Model resources, (as the mapped value) of the
     *        request payloads of given content types (as the mapping key).
     */

    public void setRequestModels(java.util.Map<String, String> requestModels) {
        this.requestModels = requestModels;
    }

    /**
     * <p>
     * A key-value map specifying data schemas, represented by Model resources, (as the mapped value) of the request
     * payloads of given content types (as the mapping key).
     * </p>
     * 
     * @param requestModels
     *        A key-value map specifying data schemas, represented by Model resources, (as the mapped value) of the
     *        request payloads of given content types (as the mapping key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withRequestModels(java.util.Map<String, String> requestModels) {
        setRequestModels(requestModels);
        return this;
    }

    /**
     * Add a single RequestModels entry
     *
     * @see UpdateMethodResult#withRequestModels
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * 
     * @return Gets a method response associated with a given HTTP status code.
     */

    public java.util.Map<String, MethodResponse> getMethodResponses() {
        return methodResponses;
    }

    /**
     * <p>
     * Gets a method response associated with a given HTTP status code.
     * </p>
     * 
     * @param methodResponses
     *        Gets a method response associated with a given HTTP status code.
     */

    public void setMethodResponses(java.util.Map<String, MethodResponse> methodResponses) {
        this.methodResponses = methodResponses;
    }

    /**
     * <p>
     * Gets a method response associated with a given HTTP status code.
     * </p>
     * 
     * @param methodResponses
     *        Gets a method response associated with a given HTTP status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMethodResult withMethodResponses(java.util.Map<String, MethodResponse> methodResponses) {
        setMethodResponses(methodResponses);
        return this;
    }

    /**
     * Add a single MethodResponses entry
     *
     * @see UpdateMethodResult#withMethodResponses
     * @returns a reference to this object so that method calls can be chained together.
     */

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
     * 
     * @param methodIntegration
     *        Gets the method's integration responsible for passing the client-submitted request to the back end and
     *        performing necessary transformations to make the request compliant with the back end.
     */

    public void setMethodIntegration(Integration methodIntegration) {
        this.methodIntegration = methodIntegration;
    }

    /**
     * <p>
     * Gets the method's integration responsible for passing the client-submitted request to the back end and performing
     * necessary transformations to make the request compliant with the back end.
     * </p>
     * 
     * @return Gets the method's integration responsible for passing the client-submitted request to the back end and
     *         performing necessary transformations to make the request compliant with the back end.
     */

    public Integration getMethodIntegration() {
        return this.methodIntegration;
    }

    /**
     * <p>
     * Gets the method's integration responsible for passing the client-submitted request to the back end and performing
     * necessary transformations to make the request compliant with the back end.
     * </p>
     * 
     * @param methodIntegration
     *        Gets the method's integration responsible for passing the client-submitted request to the back end and
     *        performing necessary transformations to make the request compliant with the back end.
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
