/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a put integration request.
 * </p>
 */
public class PutIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a put integration request's API identifier.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * Specifies a put integration request's resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Specifies a put integration request's HTTP method.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * Specifies a put integration input's type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specifies a put integration HTTP method. When the integration type is HTTP or AWS, this field is required.
     * </p>
     */
    private String integrationHttpMethod;
    /**
     * <p>
     * Specifies a put integration input's Uniform Resource Identifier (URI). When the integration type is HTTP or AWS,
     * this field is required. For integration with Lambda as an AWS service proxy, this value is of the
     * 'arn:aws:apigateway:&lt;region&gt;:lambda:path/2015-03-31/functions/&lt;functionArn&gt;/invocations' format.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * Specifies whether credentials are required for a put integration.
     * </p>
     */
    private String credentials;
    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the method request to the back end. The key is
     * an integration request parameter name and the associated value is a method request parameter value or static
     * value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request
     * parameter value must match the pattern of <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> must be a valid and unique method request parameter name.
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
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the <code>requestTemplates</code> property on the Integration
     * resource. There are three valid values: <code>WHEN_NO_MATCH</code>, <code>WHEN_NO_TEMPLATES</code>, and
     * <code>NEVER</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WHEN_NO_MATCH</code> passes the request body for unmapped content types through to the integration back end
     * without transformation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code> rejects unmapped content types with an HTTP 415 'Unsupported Media Type' response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WHEN_NO_TEMPLATES</code> allows pass-through when the integration has NO content types mapped to templates.
     * However if there is at least one content type defined, unmapped content types will be rejected with the same 415
     * response.
     * </p>
     * </li>
     * </ul>
     */
    private String passthroughBehavior;
    /**
     * <p>
     * Specifies a put integration input's cache namespace.
     * </p>
     */
    private String cacheNamespace;
    /**
     * <p>
     * Specifies a put integration input's cache key parameters.
     * </p>
     */
    private java.util.List<String> cacheKeyParameters;
    /**
     * <p>
     * Specifies how to handle request payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed through from the method request to
     * integration request without modification, provided that the <code>passthroughBehaviors</code> is configured to
     * support payload pass-through.
     * </p>
     */
    private String contentHandling;

    /**
     * <p>
     * Specifies a put integration request's API identifier.
     * </p>
     * 
     * @param restApiId
     *        Specifies a put integration request's API identifier.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * Specifies a put integration request's API identifier.
     * </p>
     * 
     * @return Specifies a put integration request's API identifier.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * Specifies a put integration request's API identifier.
     * </p>
     * 
     * @param restApiId
     *        Specifies a put integration request's API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * Specifies a put integration request's resource ID.
     * </p>
     * 
     * @param resourceId
     *        Specifies a put integration request's resource ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Specifies a put integration request's resource ID.
     * </p>
     * 
     * @return Specifies a put integration request's resource ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Specifies a put integration request's resource ID.
     * </p>
     * 
     * @param resourceId
     *        Specifies a put integration request's resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Specifies a put integration request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        Specifies a put integration request's HTTP method.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * Specifies a put integration request's HTTP method.
     * </p>
     * 
     * @return Specifies a put integration request's HTTP method.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * Specifies a put integration request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        Specifies a put integration request's HTTP method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * Specifies a put integration input's type.
     * </p>
     * 
     * @param type
     *        Specifies a put integration input's type.
     * @see IntegrationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies a put integration input's type.
     * </p>
     * 
     * @return Specifies a put integration input's type.
     * @see IntegrationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies a put integration input's type.
     * </p>
     * 
     * @param type
     *        Specifies a put integration input's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public PutIntegrationRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies a put integration input's type.
     * </p>
     * 
     * @param type
     *        Specifies a put integration input's type.
     * @see IntegrationType
     */

    public void setType(IntegrationType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies a put integration input's type.
     * </p>
     * 
     * @param type
     *        Specifies a put integration input's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public PutIntegrationRequest withType(IntegrationType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies a put integration HTTP method. When the integration type is HTTP or AWS, this field is required.
     * </p>
     * 
     * @param integrationHttpMethod
     *        Specifies a put integration HTTP method. When the integration type is HTTP or AWS, this field is required.
     */

    public void setIntegrationHttpMethod(String integrationHttpMethod) {
        this.integrationHttpMethod = integrationHttpMethod;
    }

    /**
     * <p>
     * Specifies a put integration HTTP method. When the integration type is HTTP or AWS, this field is required.
     * </p>
     * 
     * @return Specifies a put integration HTTP method. When the integration type is HTTP or AWS, this field is
     *         required.
     */

    public String getIntegrationHttpMethod() {
        return this.integrationHttpMethod;
    }

    /**
     * <p>
     * Specifies a put integration HTTP method. When the integration type is HTTP or AWS, this field is required.
     * </p>
     * 
     * @param integrationHttpMethod
     *        Specifies a put integration HTTP method. When the integration type is HTTP or AWS, this field is required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withIntegrationHttpMethod(String integrationHttpMethod) {
        setIntegrationHttpMethod(integrationHttpMethod);
        return this;
    }

    /**
     * <p>
     * Specifies a put integration input's Uniform Resource Identifier (URI). When the integration type is HTTP or AWS,
     * this field is required. For integration with Lambda as an AWS service proxy, this value is of the
     * 'arn:aws:apigateway:&lt;region&gt;:lambda:path/2015-03-31/functions/&lt;functionArn&gt;/invocations' format.
     * </p>
     * 
     * @param uri
     *        Specifies a put integration input's Uniform Resource Identifier (URI). When the integration type is HTTP
     *        or AWS, this field is required. For integration with Lambda as an AWS service proxy, this value is of the
     *        'arn:aws:apigateway:&lt;region&gt;:lambda:path/2015-03-31/functions/&lt;functionArn&gt;/invocations'
     *        format.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * Specifies a put integration input's Uniform Resource Identifier (URI). When the integration type is HTTP or AWS,
     * this field is required. For integration with Lambda as an AWS service proxy, this value is of the
     * 'arn:aws:apigateway:&lt;region&gt;:lambda:path/2015-03-31/functions/&lt;functionArn&gt;/invocations' format.
     * </p>
     * 
     * @return Specifies a put integration input's Uniform Resource Identifier (URI). When the integration type is HTTP
     *         or AWS, this field is required. For integration with Lambda as an AWS service proxy, this value is of the
     *         'arn:aws:apigateway:&lt;region&gt;:lambda:path/2015-03-31/functions/&lt;functionArn&gt;/invocations'
     *         format.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * Specifies a put integration input's Uniform Resource Identifier (URI). When the integration type is HTTP or AWS,
     * this field is required. For integration with Lambda as an AWS service proxy, this value is of the
     * 'arn:aws:apigateway:&lt;region&gt;:lambda:path/2015-03-31/functions/&lt;functionArn&gt;/invocations' format.
     * </p>
     * 
     * @param uri
     *        Specifies a put integration input's Uniform Resource Identifier (URI). When the integration type is HTTP
     *        or AWS, this field is required. For integration with Lambda as an AWS service proxy, this value is of the
     *        'arn:aws:apigateway:&lt;region&gt;:lambda:path/2015-03-31/functions/&lt;functionArn&gt;/invocations'
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * Specifies whether credentials are required for a put integration.
     * </p>
     * 
     * @param credentials
     *        Specifies whether credentials are required for a put integration.
     */

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * Specifies whether credentials are required for a put integration.
     * </p>
     * 
     * @return Specifies whether credentials are required for a put integration.
     */

    public String getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * Specifies whether credentials are required for a put integration.
     * </p>
     * 
     * @param credentials
     *        Specifies whether credentials are required for a put integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withCredentials(String credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the method request to the back end. The key is
     * an integration request parameter name and the associated value is a method request parameter value or static
     * value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request
     * parameter value must match the pattern of <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> must be a valid and unique method request parameter name.
     * </p>
     * 
     * @return A key-value map specifying request parameters that are passed from the method request to the back end.
     *         The key is an integration request parameter name and the associated value is a method request parameter
     *         value or static value that must be enclosed within single quotes and pre-encoded as required by the back
     *         end. The method request parameter value must match the pattern of
     *         <code>method.request.{location}.{name}</code>, where <code>location</code> is <code>querystring</code>,
     *         <code>path</code>, or <code>header</code> and <code>name</code> must be a valid and unique method request
     *         parameter name.
     */

    public java.util.Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the method request to the back end. The key is
     * an integration request parameter name and the associated value is a method request parameter value or static
     * value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request
     * parameter value must match the pattern of <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> must be a valid and unique method request parameter name.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map specifying request parameters that are passed from the method request to the back end. The
     *        key is an integration request parameter name and the associated value is a method request parameter value
     *        or static value that must be enclosed within single quotes and pre-encoded as required by the back end.
     *        The method request parameter value must match the pattern of <code>method.request.{location}.{name}</code>
     *        , where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     *        <code>name</code> must be a valid and unique method request parameter name.
     */

    public void setRequestParameters(java.util.Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * A key-value map specifying request parameters that are passed from the method request to the back end. The key is
     * an integration request parameter name and the associated value is a method request parameter value or static
     * value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request
     * parameter value must match the pattern of <code>method.request.{location}.{name}</code>, where
     * <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     * <code>name</code> must be a valid and unique method request parameter name.
     * </p>
     * 
     * @param requestParameters
     *        A key-value map specifying request parameters that are passed from the method request to the back end. The
     *        key is an integration request parameter name and the associated value is a method request parameter value
     *        or static value that must be enclosed within single quotes and pre-encoded as required by the back end.
     *        The method request parameter value must match the pattern of <code>method.request.{location}.{name}</code>
     *        , where <code>location</code> is <code>querystring</code>, <code>path</code>, or <code>header</code> and
     *        <code>name</code> must be a valid and unique method request parameter name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withRequestParameters(java.util.Map<String, String> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    public PutIntegrationRequest addRequestParametersEntry(String key, String value) {
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

    public PutIntegrationRequest clearRequestParametersEntries() {
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

    public PutIntegrationRequest withRequestTemplates(java.util.Map<String, String> requestTemplates) {
        setRequestTemplates(requestTemplates);
        return this;
    }

    public PutIntegrationRequest addRequestTemplatesEntry(String key, String value) {
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

    public PutIntegrationRequest clearRequestTemplatesEntries() {
        this.requestTemplates = null;
        return this;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the <code>requestTemplates</code> property on the Integration
     * resource. There are three valid values: <code>WHEN_NO_MATCH</code>, <code>WHEN_NO_TEMPLATES</code>, and
     * <code>NEVER</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WHEN_NO_MATCH</code> passes the request body for unmapped content types through to the integration back end
     * without transformation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code> rejects unmapped content types with an HTTP 415 'Unsupported Media Type' response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WHEN_NO_TEMPLATES</code> allows pass-through when the integration has NO content types mapped to templates.
     * However if there is at least one content type defined, unmapped content types will be rejected with the same 415
     * response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param passthroughBehavior
     *        Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request,
     *        and the available mapping templates specified as the <code>requestTemplates</code> property on the
     *        Integration resource. There are three valid values: <code>WHEN_NO_MATCH</code>,
     *        <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>WHEN_NO_MATCH</code> passes the request body for unmapped content types through to the integration
     *        back end without transformation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEVER</code> rejects unmapped content types with an HTTP 415 'Unsupported Media Type' response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WHEN_NO_TEMPLATES</code> allows pass-through when the integration has NO content types mapped to
     *        templates. However if there is at least one content type defined, unmapped content types will be rejected
     *        with the same 415 response.
     *        </p>
     *        </li>
     */

    public void setPassthroughBehavior(String passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the <code>requestTemplates</code> property on the Integration
     * resource. There are three valid values: <code>WHEN_NO_MATCH</code>, <code>WHEN_NO_TEMPLATES</code>, and
     * <code>NEVER</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WHEN_NO_MATCH</code> passes the request body for unmapped content types through to the integration back end
     * without transformation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code> rejects unmapped content types with an HTTP 415 'Unsupported Media Type' response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WHEN_NO_TEMPLATES</code> allows pass-through when the integration has NO content types mapped to templates.
     * However if there is at least one content type defined, unmapped content types will be rejected with the same 415
     * response.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the pass-through behavior for incoming requests based on the Content-Type header in the
     *         request, and the available mapping templates specified as the <code>requestTemplates</code> property on
     *         the Integration resource. There are three valid values: <code>WHEN_NO_MATCH</code>,
     *         <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>WHEN_NO_MATCH</code> passes the request body for unmapped content types through to the integration
     *         back end without transformation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEVER</code> rejects unmapped content types with an HTTP 415 'Unsupported Media Type' response.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WHEN_NO_TEMPLATES</code> allows pass-through when the integration has NO content types mapped to
     *         templates. However if there is at least one content type defined, unmapped content types will be rejected
     *         with the same 415 response.
     *         </p>
     *         </li>
     */

    public String getPassthroughBehavior() {
        return this.passthroughBehavior;
    }

    /**
     * <p>
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and
     * the available mapping templates specified as the <code>requestTemplates</code> property on the Integration
     * resource. There are three valid values: <code>WHEN_NO_MATCH</code>, <code>WHEN_NO_TEMPLATES</code>, and
     * <code>NEVER</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>WHEN_NO_MATCH</code> passes the request body for unmapped content types through to the integration back end
     * without transformation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEVER</code> rejects unmapped content types with an HTTP 415 'Unsupported Media Type' response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WHEN_NO_TEMPLATES</code> allows pass-through when the integration has NO content types mapped to templates.
     * However if there is at least one content type defined, unmapped content types will be rejected with the same 415
     * response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param passthroughBehavior
     *        Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request,
     *        and the available mapping templates specified as the <code>requestTemplates</code> property on the
     *        Integration resource. There are three valid values: <code>WHEN_NO_MATCH</code>,
     *        <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>WHEN_NO_MATCH</code> passes the request body for unmapped content types through to the integration
     *        back end without transformation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEVER</code> rejects unmapped content types with an HTTP 415 'Unsupported Media Type' response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WHEN_NO_TEMPLATES</code> allows pass-through when the integration has NO content types mapped to
     *        templates. However if there is at least one content type defined, unmapped content types will be rejected
     *        with the same 415 response.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withPassthroughBehavior(String passthroughBehavior) {
        setPassthroughBehavior(passthroughBehavior);
        return this;
    }

    /**
     * <p>
     * Specifies a put integration input's cache namespace.
     * </p>
     * 
     * @param cacheNamespace
     *        Specifies a put integration input's cache namespace.
     */

    public void setCacheNamespace(String cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
    }

    /**
     * <p>
     * Specifies a put integration input's cache namespace.
     * </p>
     * 
     * @return Specifies a put integration input's cache namespace.
     */

    public String getCacheNamespace() {
        return this.cacheNamespace;
    }

    /**
     * <p>
     * Specifies a put integration input's cache namespace.
     * </p>
     * 
     * @param cacheNamespace
     *        Specifies a put integration input's cache namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withCacheNamespace(String cacheNamespace) {
        setCacheNamespace(cacheNamespace);
        return this;
    }

    /**
     * <p>
     * Specifies a put integration input's cache key parameters.
     * </p>
     * 
     * @return Specifies a put integration input's cache key parameters.
     */

    public java.util.List<String> getCacheKeyParameters() {
        return cacheKeyParameters;
    }

    /**
     * <p>
     * Specifies a put integration input's cache key parameters.
     * </p>
     * 
     * @param cacheKeyParameters
     *        Specifies a put integration input's cache key parameters.
     */

    public void setCacheKeyParameters(java.util.Collection<String> cacheKeyParameters) {
        if (cacheKeyParameters == null) {
            this.cacheKeyParameters = null;
            return;
        }

        this.cacheKeyParameters = new java.util.ArrayList<String>(cacheKeyParameters);
    }

    /**
     * <p>
     * Specifies a put integration input's cache key parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheKeyParameters(java.util.Collection)} or {@link #withCacheKeyParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param cacheKeyParameters
     *        Specifies a put integration input's cache key parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withCacheKeyParameters(String... cacheKeyParameters) {
        if (this.cacheKeyParameters == null) {
            setCacheKeyParameters(new java.util.ArrayList<String>(cacheKeyParameters.length));
        }
        for (String ele : cacheKeyParameters) {
            this.cacheKeyParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a put integration input's cache key parameters.
     * </p>
     * 
     * @param cacheKeyParameters
     *        Specifies a put integration input's cache key parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withCacheKeyParameters(java.util.Collection<String> cacheKeyParameters) {
        setCacheKeyParameters(cacheKeyParameters);
        return this;
    }

    /**
     * <p>
     * Specifies how to handle request payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed through from the method request to
     * integration request without modification, provided that the <code>passthroughBehaviors</code> is configured to
     * support payload pass-through.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle request payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the request payload will be passed through from the method request to
     *        integration request without modification, provided that the <code>passthroughBehaviors</code> is
     *        configured to support payload pass-through.
     * @see ContentHandlingStrategy
     */

    public void setContentHandling(String contentHandling) {
        this.contentHandling = contentHandling;
    }

    /**
     * <p>
     * Specifies how to handle request payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed through from the method request to
     * integration request without modification, provided that the <code>passthroughBehaviors</code> is configured to
     * support payload pass-through.
     * </p>
     * 
     * @return Specifies how to handle request payload content type conversions. Supported values are
     *         <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the
     *         corresponding binary blob.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If this property is not defined, the request payload will be passed through from the method request to
     *         integration request without modification, provided that the <code>passthroughBehaviors</code> is
     *         configured to support payload pass-through.
     * @see ContentHandlingStrategy
     */

    public String getContentHandling() {
        return this.contentHandling;
    }

    /**
     * <p>
     * Specifies how to handle request payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed through from the method request to
     * integration request without modification, provided that the <code>passthroughBehaviors</code> is configured to
     * support payload pass-through.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle request payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the request payload will be passed through from the method request to
     *        integration request without modification, provided that the <code>passthroughBehaviors</code> is
     *        configured to support payload pass-through.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public PutIntegrationRequest withContentHandling(String contentHandling) {
        setContentHandling(contentHandling);
        return this;
    }

    /**
     * <p>
     * Specifies how to handle request payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed through from the method request to
     * integration request without modification, provided that the <code>passthroughBehaviors</code> is configured to
     * support payload pass-through.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle request payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the request payload will be passed through from the method request to
     *        integration request without modification, provided that the <code>passthroughBehaviors</code> is
     *        configured to support payload pass-through.
     * @see ContentHandlingStrategy
     */

    public void setContentHandling(ContentHandlingStrategy contentHandling) {
        this.contentHandling = contentHandling.toString();
    }

    /**
     * <p>
     * Specifies how to handle request payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the request payload will be passed through from the method request to
     * integration request without modification, provided that the <code>passthroughBehaviors</code> is configured to
     * support payload pass-through.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle request payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a request payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a request payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the request payload will be passed through from the method request to
     *        integration request without modification, provided that the <code>passthroughBehaviors</code> is
     *        configured to support payload pass-through.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public PutIntegrationRequest withContentHandling(ContentHandlingStrategy contentHandling) {
        setContentHandling(contentHandling);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: " + getHttpMethod() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getIntegrationHttpMethod() != null)
            sb.append("IntegrationHttpMethod: " + getIntegrationHttpMethod() + ",");
        if (getUri() != null)
            sb.append("Uri: " + getUri() + ",");
        if (getCredentials() != null)
            sb.append("Credentials: " + getCredentials() + ",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: " + getRequestParameters() + ",");
        if (getRequestTemplates() != null)
            sb.append("RequestTemplates: " + getRequestTemplates() + ",");
        if (getPassthroughBehavior() != null)
            sb.append("PassthroughBehavior: " + getPassthroughBehavior() + ",");
        if (getCacheNamespace() != null)
            sb.append("CacheNamespace: " + getCacheNamespace() + ",");
        if (getCacheKeyParameters() != null)
            sb.append("CacheKeyParameters: " + getCacheKeyParameters() + ",");
        if (getContentHandling() != null)
            sb.append("ContentHandling: " + getContentHandling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutIntegrationRequest == false)
            return false;
        PutIntegrationRequest other = (PutIntegrationRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getIntegrationHttpMethod() == null ^ this.getIntegrationHttpMethod() == null)
            return false;
        if (other.getIntegrationHttpMethod() != null && other.getIntegrationHttpMethod().equals(this.getIntegrationHttpMethod()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null && other.getRequestParameters().equals(this.getRequestParameters()) == false)
            return false;
        if (other.getRequestTemplates() == null ^ this.getRequestTemplates() == null)
            return false;
        if (other.getRequestTemplates() != null && other.getRequestTemplates().equals(this.getRequestTemplates()) == false)
            return false;
        if (other.getPassthroughBehavior() == null ^ this.getPassthroughBehavior() == null)
            return false;
        if (other.getPassthroughBehavior() != null && other.getPassthroughBehavior().equals(this.getPassthroughBehavior()) == false)
            return false;
        if (other.getCacheNamespace() == null ^ this.getCacheNamespace() == null)
            return false;
        if (other.getCacheNamespace() != null && other.getCacheNamespace().equals(this.getCacheNamespace()) == false)
            return false;
        if (other.getCacheKeyParameters() == null ^ this.getCacheKeyParameters() == null)
            return false;
        if (other.getCacheKeyParameters() != null && other.getCacheKeyParameters().equals(this.getCacheKeyParameters()) == false)
            return false;
        if (other.getContentHandling() == null ^ this.getContentHandling() == null)
            return false;
        if (other.getContentHandling() != null && other.getContentHandling().equals(this.getContentHandling()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIntegrationHttpMethod() == null) ? 0 : getIntegrationHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestTemplates() == null) ? 0 : getRequestTemplates().hashCode());
        hashCode = prime * hashCode + ((getPassthroughBehavior() == null) ? 0 : getPassthroughBehavior().hashCode());
        hashCode = prime * hashCode + ((getCacheNamespace() == null) ? 0 : getCacheNamespace().hashCode());
        hashCode = prime * hashCode + ((getCacheKeyParameters() == null) ? 0 : getCacheKeyParameters().hashCode());
        hashCode = prime * hashCode + ((getContentHandling() == null) ? 0 : getContentHandling().hashCode());
        return hashCode;
    }

    @Override
    public PutIntegrationRequest clone() {
        return (PutIntegrationRequest) super.clone();
    }
}
