/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a HTTP, AWS, or Mock integration.
 * </p>
 */
public class PutIntegrationResult implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the integration's type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * Specifies the integration's Uniform Resource Identifier (URI). For HTTP
     * integrations, the URI must be a fully formed, encoded HTTP(S) URL
     * according to the <a target="_blank"
     * href="https://www.ietf.org/rfc/rfc3986.txt">RFC-3986 specification</a>.
     * For AWS integrations, the URI should be of the form
     * <code>arn:aws:apigateway:{region}:{service}:{path|action}/{service_api}</code>. <code>Region</code> and <code>service</code> are used to determine the
     * right endpoint. For AWS services that use the <code>Action=</code> query
     * string parameter, <code>service_api</code> should be a valid action for
     * the desired service. For RESTful AWS service APIs, <code>path</code> is
     * used to indicate that the remaining substring in the URI should be
     * treated as the path to the resource, including the initial <code>/</code>
     * .
     * </p>
     */
    private String uri;
    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for
     * Amazon API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To require that the caller's identity be passed through from the request,
     * specify the string <code>arn:aws:iam::\*:user/\*</code>. To use
     * resource-based permissions on supported AWS services, specify null.
     * </p>
     */
    private String credentials;
    /**
     * <p>
     * Represents requests parameters that are sent with the backend request.
     * Request parameters are represented as a key/value map, with a destination
     * as the key and a source as the value. A source must match an existing
     * method request parameter, or a static value. Static values must be
     * enclosed with single quotes, and be pre-encoded based on their
     * destination in the request. The destination must match the pattern
     * <code>integration.request.{location}.{name}</code>, where
     * <code>location</code> is either querystring, path, or header.
     * <code>name</code> must be a valid, unique parameter name.
     * </p>
     */
    private java.util.Map<String, String> requestParameters;
    /**
     * <p>
     * Specifies the integration's request templates.
     * </p>
     */
    private java.util.Map<String, String> requestTemplates;
    /**
     * <p>
     * Specifies the integration's cache namespace.
     * </p>
     */
    private String cacheNamespace;
    /**
     * <p>
     * Specifies the integration's cache key parameters.
     * </p>
     */
    private java.util.List<String> cacheKeyParameters;
    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     */
    private java.util.Map<String, IntegrationResponse> integrationResponses;

    /**
     * <p>
     * Specifies the integration's type.
     * </p>
     * 
     * @param type
     *        Specifies the integration's type.
     * @see IntegrationType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the integration's type.
     * </p>
     * 
     * @return Specifies the integration's type.
     * @see IntegrationType
     */
    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the integration's type.
     * </p>
     * 
     * @param type
     *        Specifies the integration's type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public PutIntegrationResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's type.
     * </p>
     * 
     * @param type
     *        Specifies the integration's type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public void setType(IntegrationType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies the integration's type.
     * </p>
     * 
     * @param type
     *        Specifies the integration's type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see IntegrationType
     */
    public PutIntegrationResult withType(IntegrationType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * 
     * @param httpMethod
     *        Specifies the integration's HTTP method type.
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * 
     * @return Specifies the integration's HTTP method type.
     */
    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * Specifies the integration's HTTP method type.
     * </p>
     * 
     * @param httpMethod
     *        Specifies the integration's HTTP method type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutIntegrationResult withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's Uniform Resource Identifier (URI). For HTTP
     * integrations, the URI must be a fully formed, encoded HTTP(S) URL
     * according to the <a target="_blank"
     * href="https://www.ietf.org/rfc/rfc3986.txt">RFC-3986 specification</a>.
     * For AWS integrations, the URI should be of the form
     * <code>arn:aws:apigateway:{region}:{service}:{path|action}/{service_api}</code>. <code>Region</code> and <code>service</code> are used to determine the
     * right endpoint. For AWS services that use the <code>Action=</code> query
     * string parameter, <code>service_api</code> should be a valid action for
     * the desired service. For RESTful AWS service APIs, <code>path</code> is
     * used to indicate that the remaining substring in the URI should be
     * treated as the path to the resource, including the initial <code>/</code>
     * .
     * </p>
     * 
     * @param uri
     *        Specifies the integration's Uniform Resource Identifier (URI). For
     *        HTTP integrations, the URI must be a fully formed, encoded HTTP(S)
     *        URL according to the <a target="_blank"
     *        href="https://www.ietf.org/rfc/rfc3986.txt">RFC-3986
     *        specification</a>. For AWS integrations, the URI should be of the
     *        form
     *        <code>arn:aws:apigateway:{region}:{service}:{path|action}/{service_api}</code>
     *        . <code>Region</code> and <code>service</code> are used to
     *        determine the right endpoint. For AWS services that use the
     *        <code>Action=</code> query string parameter,
     *        <code>service_api</code> should be a valid action for the desired
     *        service. For RESTful AWS service APIs, <code>path</code> is used
     *        to indicate that the remaining substring in the URI should be
     *        treated as the path to the resource, including the initial
     *        <code>/</code>.
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * Specifies the integration's Uniform Resource Identifier (URI). For HTTP
     * integrations, the URI must be a fully formed, encoded HTTP(S) URL
     * according to the <a target="_blank"
     * href="https://www.ietf.org/rfc/rfc3986.txt">RFC-3986 specification</a>.
     * For AWS integrations, the URI should be of the form
     * <code>arn:aws:apigateway:{region}:{service}:{path|action}/{service_api}</code>. <code>Region</code> and <code>service</code> are used to determine the
     * right endpoint. For AWS services that use the <code>Action=</code> query
     * string parameter, <code>service_api</code> should be a valid action for
     * the desired service. For RESTful AWS service APIs, <code>path</code> is
     * used to indicate that the remaining substring in the URI should be
     * treated as the path to the resource, including the initial <code>/</code>
     * .
     * </p>
     * 
     * @return Specifies the integration's Uniform Resource Identifier (URI).
     *         For HTTP integrations, the URI must be a fully formed, encoded
     *         HTTP(S) URL according to the <a target="_blank"
     *         href="https://www.ietf.org/rfc/rfc3986.txt">RFC-3986
     *         specification</a>. For AWS integrations, the URI should be of the
     *         form
     *         <code>arn:aws:apigateway:{region}:{service}:{path|action}/{service_api}</code>
     *         . <code>Region</code> and <code>service</code> are used to
     *         determine the right endpoint. For AWS services that use the
     *         <code>Action=</code> query string parameter,
     *         <code>service_api</code> should be a valid action for the desired
     *         service. For RESTful AWS service APIs, <code>path</code> is used
     *         to indicate that the remaining substring in the URI should be
     *         treated as the path to the resource, including the initial
     *         <code>/</code>.
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * Specifies the integration's Uniform Resource Identifier (URI). For HTTP
     * integrations, the URI must be a fully formed, encoded HTTP(S) URL
     * according to the <a target="_blank"
     * href="https://www.ietf.org/rfc/rfc3986.txt">RFC-3986 specification</a>.
     * For AWS integrations, the URI should be of the form
     * <code>arn:aws:apigateway:{region}:{service}:{path|action}/{service_api}</code>. <code>Region</code> and <code>service</code> are used to determine the
     * right endpoint. For AWS services that use the <code>Action=</code> query
     * string parameter, <code>service_api</code> should be a valid action for
     * the desired service. For RESTful AWS service APIs, <code>path</code> is
     * used to indicate that the remaining substring in the URI should be
     * treated as the path to the resource, including the initial <code>/</code>
     * .
     * </p>
     * 
     * @param uri
     *        Specifies the integration's Uniform Resource Identifier (URI). For
     *        HTTP integrations, the URI must be a fully formed, encoded HTTP(S)
     *        URL according to the <a target="_blank"
     *        href="https://www.ietf.org/rfc/rfc3986.txt">RFC-3986
     *        specification</a>. For AWS integrations, the URI should be of the
     *        form
     *        <code>arn:aws:apigateway:{region}:{service}:{path|action}/{service_api}</code>
     *        . <code>Region</code> and <code>service</code> are used to
     *        determine the right endpoint. For AWS services that use the
     *        <code>Action=</code> query string parameter,
     *        <code>service_api</code> should be a valid action for the desired
     *        service. For RESTful AWS service APIs, <code>path</code> is used
     *        to indicate that the remaining substring in the URI should be
     *        treated as the path to the resource, including the initial
     *        <code>/</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutIntegrationResult withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for
     * Amazon API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To require that the caller's identity be passed through from the request,
     * specify the string <code>arn:aws:iam::\*:user/\*</code>. To use
     * resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @param credentials
     *        Specifies the credentials required for the integration, if any.
     *        For AWS integrations, three options are available. To specify an
     *        IAM Role for Amazon API Gateway to assume, use the role's Amazon
     *        Resource Name (ARN). To require that the caller's identity be
     *        passed through from the request, specify the string
     *        <code>arn:aws:iam::\*:user/\*</code>. To use resource-based
     *        permissions on supported AWS services, specify null.
     */
    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for
     * Amazon API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To require that the caller's identity be passed through from the request,
     * specify the string <code>arn:aws:iam::\*:user/\*</code>. To use
     * resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @return Specifies the credentials required for the integration, if any.
     *         For AWS integrations, three options are available. To specify an
     *         IAM Role for Amazon API Gateway to assume, use the role's Amazon
     *         Resource Name (ARN). To require that the caller's identity be
     *         passed through from the request, specify the string
     *         <code>arn:aws:iam::\*:user/\*</code>. To use resource-based
     *         permissions on supported AWS services, specify null.
     */
    public String getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS
     * integrations, three options are available. To specify an IAM Role for
     * Amazon API Gateway to assume, use the role's Amazon Resource Name (ARN).
     * To require that the caller's identity be passed through from the request,
     * specify the string <code>arn:aws:iam::\*:user/\*</code>. To use
     * resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @param credentials
     *        Specifies the credentials required for the integration, if any.
     *        For AWS integrations, three options are available. To specify an
     *        IAM Role for Amazon API Gateway to assume, use the role's Amazon
     *        Resource Name (ARN). To require that the caller's identity be
     *        passed through from the request, specify the string
     *        <code>arn:aws:iam::\*:user/\*</code>. To use resource-based
     *        permissions on supported AWS services, specify null.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutIntegrationResult withCredentials(String credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * Represents requests parameters that are sent with the backend request.
     * Request parameters are represented as a key/value map, with a destination
     * as the key and a source as the value. A source must match an existing
     * method request parameter, or a static value. Static values must be
     * enclosed with single quotes, and be pre-encoded based on their
     * destination in the request. The destination must match the pattern
     * <code>integration.request.{location}.{name}</code>, where
     * <code>location</code> is either querystring, path, or header.
     * <code>name</code> must be a valid, unique parameter name.
     * </p>
     * 
     * @return Represents requests parameters that are sent with the backend
     *         request. Request parameters are represented as a key/value map,
     *         with a destination as the key and a source as the value. A source
     *         must match an existing method request parameter, or a static
     *         value. Static values must be enclosed with single quotes, and be
     *         pre-encoded based on their destination in the request. The
     *         destination must match the pattern
     *         <code>integration.request.{location}.{name}</code>, where
     *         <code>location</code> is either querystring, path, or header.
     *         <code>name</code> must be a valid, unique parameter name.
     */
    public java.util.Map<String, String> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * Represents requests parameters that are sent with the backend request.
     * Request parameters are represented as a key/value map, with a destination
     * as the key and a source as the value. A source must match an existing
     * method request parameter, or a static value. Static values must be
     * enclosed with single quotes, and be pre-encoded based on their
     * destination in the request. The destination must match the pattern
     * <code>integration.request.{location}.{name}</code>, where
     * <code>location</code> is either querystring, path, or header.
     * <code>name</code> must be a valid, unique parameter name.
     * </p>
     * 
     * @param requestParameters
     *        Represents requests parameters that are sent with the backend
     *        request. Request parameters are represented as a key/value map,
     *        with a destination as the key and a source as the value. A source
     *        must match an existing method request parameter, or a static
     *        value. Static values must be enclosed with single quotes, and be
     *        pre-encoded based on their destination in the request. The
     *        destination must match the pattern
     *        <code>integration.request.{location}.{name}</code>, where
     *        <code>location</code> is either querystring, path, or header.
     *        <code>name</code> must be a valid, unique parameter name.
     */
    public void setRequestParameters(
            java.util.Map<String, String> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * Represents requests parameters that are sent with the backend request.
     * Request parameters are represented as a key/value map, with a destination
     * as the key and a source as the value. A source must match an existing
     * method request parameter, or a static value. Static values must be
     * enclosed with single quotes, and be pre-encoded based on their
     * destination in the request. The destination must match the pattern
     * <code>integration.request.{location}.{name}</code>, where
     * <code>location</code> is either querystring, path, or header.
     * <code>name</code> must be a valid, unique parameter name.
     * </p>
     * 
     * @param requestParameters
     *        Represents requests parameters that are sent with the backend
     *        request. Request parameters are represented as a key/value map,
     *        with a destination as the key and a source as the value. A source
     *        must match an existing method request parameter, or a static
     *        value. Static values must be enclosed with single quotes, and be
     *        pre-encoded based on their destination in the request. The
     *        destination must match the pattern
     *        <code>integration.request.{location}.{name}</code>, where
     *        <code>location</code> is either querystring, path, or header.
     *        <code>name</code> must be a valid, unique parameter name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutIntegrationResult withRequestParameters(
            java.util.Map<String, String> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    public PutIntegrationResult addRequestParametersEntry(String key,
            String value) {
        if (null == this.requestParameters) {
            this.requestParameters = new java.util.HashMap<String, String>();
        }
        if (this.requestParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.requestParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestParameters. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public PutIntegrationResult clearRequestParametersEntries() {
        this.requestParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the integration's request templates.
     * </p>
     * 
     * @return Specifies the integration's request templates.
     */
    public java.util.Map<String, String> getRequestTemplates() {
        return requestTemplates;
    }

    /**
     * <p>
     * Specifies the integration's request templates.
     * </p>
     * 
     * @param requestTemplates
     *        Specifies the integration's request templates.
     */
    public void setRequestTemplates(
            java.util.Map<String, String> requestTemplates) {
        this.requestTemplates = requestTemplates;
    }

    /**
     * <p>
     * Specifies the integration's request templates.
     * </p>
     * 
     * @param requestTemplates
     *        Specifies the integration's request templates.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutIntegrationResult withRequestTemplates(
            java.util.Map<String, String> requestTemplates) {
        setRequestTemplates(requestTemplates);
        return this;
    }

    public PutIntegrationResult addRequestTemplatesEntry(String key,
            String value) {
        if (null == this.requestTemplates) {
            this.requestTemplates = new java.util.HashMap<String, String>();
        }
        if (this.requestTemplates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.requestTemplates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestTemplates. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public PutIntegrationResult clearRequestTemplatesEntries() {
        this.requestTemplates = null;
        return this;
    }

    /**
     * <p>
     * Specifies the integration's cache namespace.
     * </p>
     * 
     * @param cacheNamespace
     *        Specifies the integration's cache namespace.
     */
    public void setCacheNamespace(String cacheNamespace) {
        this.cacheNamespace = cacheNamespace;
    }

    /**
     * <p>
     * Specifies the integration's cache namespace.
     * </p>
     * 
     * @return Specifies the integration's cache namespace.
     */
    public String getCacheNamespace() {
        return this.cacheNamespace;
    }

    /**
     * <p>
     * Specifies the integration's cache namespace.
     * </p>
     * 
     * @param cacheNamespace
     *        Specifies the integration's cache namespace.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutIntegrationResult withCacheNamespace(String cacheNamespace) {
        setCacheNamespace(cacheNamespace);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's cache key parameters.
     * </p>
     * 
     * @return Specifies the integration's cache key parameters.
     */
    public java.util.List<String> getCacheKeyParameters() {
        return cacheKeyParameters;
    }

    /**
     * <p>
     * Specifies the integration's cache key parameters.
     * </p>
     * 
     * @param cacheKeyParameters
     *        Specifies the integration's cache key parameters.
     */
    public void setCacheKeyParameters(
            java.util.Collection<String> cacheKeyParameters) {
        if (cacheKeyParameters == null) {
            this.cacheKeyParameters = null;
            return;
        }

        this.cacheKeyParameters = new java.util.ArrayList<String>(
                cacheKeyParameters);
    }

    /**
     * <p>
     * Specifies the integration's cache key parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCacheKeyParameters(java.util.Collection)} or
     * {@link #withCacheKeyParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param cacheKeyParameters
     *        Specifies the integration's cache key parameters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutIntegrationResult withCacheKeyParameters(
            String... cacheKeyParameters) {
        if (this.cacheKeyParameters == null) {
            setCacheKeyParameters(new java.util.ArrayList<String>(
                    cacheKeyParameters.length));
        }
        for (String ele : cacheKeyParameters) {
            this.cacheKeyParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the integration's cache key parameters.
     * </p>
     * 
     * @param cacheKeyParameters
     *        Specifies the integration's cache key parameters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutIntegrationResult withCacheKeyParameters(
            java.util.Collection<String> cacheKeyParameters) {
        setCacheKeyParameters(cacheKeyParameters);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * 
     * @return Specifies the integration's responses.
     */
    public java.util.Map<String, IntegrationResponse> getIntegrationResponses() {
        return integrationResponses;
    }

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * 
     * @param integrationResponses
     *        Specifies the integration's responses.
     */
    public void setIntegrationResponses(
            java.util.Map<String, IntegrationResponse> integrationResponses) {
        this.integrationResponses = integrationResponses;
    }

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * 
     * @param integrationResponses
     *        Specifies the integration's responses.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public PutIntegrationResult withIntegrationResponses(
            java.util.Map<String, IntegrationResponse> integrationResponses) {
        setIntegrationResponses(integrationResponses);
        return this;
    }

    public PutIntegrationResult addIntegrationResponsesEntry(String key,
            IntegrationResponse value) {
        if (null == this.integrationResponses) {
            this.integrationResponses = new java.util.HashMap<String, IntegrationResponse>();
        }
        if (this.integrationResponses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.integrationResponses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IntegrationResponses. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public PutIntegrationResult clearIntegrationResponsesEntries() {
        this.integrationResponses = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: " + getHttpMethod() + ",");
        if (getUri() != null)
            sb.append("Uri: " + getUri() + ",");
        if (getCredentials() != null)
            sb.append("Credentials: " + getCredentials() + ",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: " + getRequestParameters() + ",");
        if (getRequestTemplates() != null)
            sb.append("RequestTemplates: " + getRequestTemplates() + ",");
        if (getCacheNamespace() != null)
            sb.append("CacheNamespace: " + getCacheNamespace() + ",");
        if (getCacheKeyParameters() != null)
            sb.append("CacheKeyParameters: " + getCacheKeyParameters() + ",");
        if (getIntegrationResponses() != null)
            sb.append("IntegrationResponses: " + getIntegrationResponses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutIntegrationResult == false)
            return false;
        PutIntegrationResult other = (PutIntegrationResult) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null
                && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null
                && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null
                && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getRequestParameters() == null
                ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null
                && other.getRequestParameters().equals(
                        this.getRequestParameters()) == false)
            return false;
        if (other.getRequestTemplates() == null
                ^ this.getRequestTemplates() == null)
            return false;
        if (other.getRequestTemplates() != null
                && other.getRequestTemplates().equals(
                        this.getRequestTemplates()) == false)
            return false;
        if (other.getCacheNamespace() == null
                ^ this.getCacheNamespace() == null)
            return false;
        if (other.getCacheNamespace() != null
                && other.getCacheNamespace().equals(this.getCacheNamespace()) == false)
            return false;
        if (other.getCacheKeyParameters() == null
                ^ this.getCacheKeyParameters() == null)
            return false;
        if (other.getCacheKeyParameters() != null
                && other.getCacheKeyParameters().equals(
                        this.getCacheKeyParameters()) == false)
            return false;
        if (other.getIntegrationResponses() == null
                ^ this.getIntegrationResponses() == null)
            return false;
        if (other.getIntegrationResponses() != null
                && other.getIntegrationResponses().equals(
                        this.getIntegrationResponses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode
                + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode
                + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime
                * hashCode
                + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestParameters() == null) ? 0
                        : getRequestParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestTemplates() == null) ? 0 : getRequestTemplates()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheNamespace() == null) ? 0 : getCacheNamespace()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheKeyParameters() == null) ? 0
                        : getCacheKeyParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getIntegrationResponses() == null) ? 0
                        : getIntegrationResponses().hashCode());
        return hashCode;
    }

    @Override
    public PutIntegrationResult clone() {
        try {
            return (PutIntegrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}