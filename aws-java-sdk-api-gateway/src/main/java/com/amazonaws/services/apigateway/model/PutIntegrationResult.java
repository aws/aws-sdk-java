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

/**
 * <p>
 * Represents an HTTP, HTTP_PROXY, AWS, AWS_PROXY, or Mock integration.
 * </p>
 * <div class="remarks">In the API Gateway console, the built-in Lambda integration is an AWS integration.</div> <div
 * class="seeAlso"> <a
 * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an API</a>, <a
 * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/.html"/> </div>
 */
public class PutIntegrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back end,
     * <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually invoking the back
     * end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or <code>AWS_PROXY</code> for
     * integrating with the Lambda proxy integration type.
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
     * Specifies the integration's Uniform Resource Identifier (URI). For HTTP integrations, the URI must be a fully
     * formed, encoded HTTP(S) URL according to the <a href="https://www.ietf.org/rfc/rfc3986.txt"
     * target="_blank">RFC-3986 specification</a>. For AWS integrations, the URI should be of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}</code>.
     * <code>Region</code>, <code>subdomain</code> and <code>service</code> are used to determine the right endpoint.
     * For AWS services that use the <code>Action=</code> query string parameter, <code>service_api</code> should be a
     * valid action for the desired service. For RESTful AWS service APIs, <code>path</code> is used to indicate that
     * the remaining substring in the URI should be treated as the path to the resource, including the initial
     * <code>/</code>.
     * </p>
     */
    private String uri;
    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for Amazon API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string
     * <code>arn:aws:iam::\*:user/\*</code>. To use resource-based permissions on supported AWS services, specify null.
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
     * <div>
     * <p>
     * Specifies how the method request body of an unmapped content type will be passed through the integration request
     * to the back end without transformation. A content type is unmapped if no mapping template is defined in the
     * integration or the content type does not match any of the mapped content types, as specified in
     * <code>requestTemplates</code>. There are three valid values: <code>WHEN_NO_MATCH</code>,
     * <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>.
     * </p>
     * <ul>
     * <li> <code>WHEN_NO_MATCH</code> passes the method request body through the integration request to the back end
     * without transformation when the method request content type does not match any content type associated with the
     * mapping templates defined in the integration request.</li>
     * <li> <code>WHEN_NO_TEMPLATES</code> passes the method request body through the integration request to the back end
     * without transformation when no mapping template is defined in the integration request. If a template is defined
     * when this option is selected, the method request of an unmapped content-type will be rejected with an HTTP
     * <code>415 Unsupported Media Type</code> response.</li>
     * <li> <code>NEVER</code> rejects the method request with an HTTP <code>415 Unsupported Media Type</code> response
     * when either the method request content type does not match any content type associated with the mapping templates
     * defined in the integration request or no mapping template is defined in the integration request.</li>
     * </ul>
     * </div>
     */
    private String passthroughBehavior;
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
     * <div class="remarks">
     * <p/>
     * <h4>Example: Get integration responses of a method</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns <code>200 OK</code> status and a payload as follows:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an API</a>
     * </div>
     */
    private java.util.Map<String, IntegrationResponse> integrationResponses;

    /**
     * <p>
     * Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back end,
     * <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually invoking the back
     * end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or <code>AWS_PROXY</code> for
     * integrating with the Lambda proxy integration type.
     * </p>
     * 
     * @param type
     *        Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back
     *        end, <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually
     *        invoking the back end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or
     *        <code>AWS_PROXY</code> for integrating with the Lambda proxy integration type.
     * @see IntegrationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back end,
     * <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually invoking the back
     * end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or <code>AWS_PROXY</code> for
     * integrating with the Lambda proxy integration type.
     * </p>
     * 
     * @return Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back
     *         end, <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually
     *         invoking the back end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or
     *         <code>AWS_PROXY</code> for integrating with the Lambda proxy integration type.
     * @see IntegrationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back end,
     * <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually invoking the back
     * end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or <code>AWS_PROXY</code> for
     * integrating with the Lambda proxy integration type.
     * </p>
     * 
     * @param type
     *        Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back
     *        end, <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually
     *        invoking the back end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or
     *        <code>AWS_PROXY</code> for integrating with the Lambda proxy integration type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public PutIntegrationResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back end,
     * <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually invoking the back
     * end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or <code>AWS_PROXY</code> for
     * integrating with the Lambda proxy integration type.
     * </p>
     * 
     * @param type
     *        Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back
     *        end, <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually
     *        invoking the back end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or
     *        <code>AWS_PROXY</code> for integrating with the Lambda proxy integration type.
     * @see IntegrationType
     */

    public void setType(IntegrationType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back end,
     * <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually invoking the back
     * end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or <code>AWS_PROXY</code> for
     * integrating with the Lambda proxy integration type.
     * </p>
     * 
     * @param type
     *        Specifies the integration's type. The valid value is <code>HTTP</code> for integrating with an HTTP back
     *        end, <code>AWS</code> for any AWS service endpoints, <code>MOCK</code> for testing without actually
     *        invoking the back end, <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration, or
     *        <code>AWS_PROXY</code> for integrating with the Lambda proxy integration type.
     * @return Returns a reference to this object so that method calls can be chained together.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResult withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's Uniform Resource Identifier (URI). For HTTP integrations, the URI must be a fully
     * formed, encoded HTTP(S) URL according to the <a href="https://www.ietf.org/rfc/rfc3986.txt"
     * target="_blank">RFC-3986 specification</a>. For AWS integrations, the URI should be of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}</code>.
     * <code>Region</code>, <code>subdomain</code> and <code>service</code> are used to determine the right endpoint.
     * For AWS services that use the <code>Action=</code> query string parameter, <code>service_api</code> should be a
     * valid action for the desired service. For RESTful AWS service APIs, <code>path</code> is used to indicate that
     * the remaining substring in the URI should be treated as the path to the resource, including the initial
     * <code>/</code>.
     * </p>
     * 
     * @param uri
     *        Specifies the integration's Uniform Resource Identifier (URI). For HTTP integrations, the URI must be a
     *        fully formed, encoded HTTP(S) URL according to the <a href="https://www.ietf.org/rfc/rfc3986.txt"
     *        target="_blank">RFC-3986 specification</a>. For AWS integrations, the URI should be of the form
     *        <code>arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}</code>.
     *        <code>Region</code>, <code>subdomain</code> and <code>service</code> are used to determine the right
     *        endpoint. For AWS services that use the <code>Action=</code> query string parameter,
     *        <code>service_api</code> should be a valid action for the desired service. For RESTful AWS service APIs,
     *        <code>path</code> is used to indicate that the remaining substring in the URI should be treated as the
     *        path to the resource, including the initial <code>/</code>.
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * Specifies the integration's Uniform Resource Identifier (URI). For HTTP integrations, the URI must be a fully
     * formed, encoded HTTP(S) URL according to the <a href="https://www.ietf.org/rfc/rfc3986.txt"
     * target="_blank">RFC-3986 specification</a>. For AWS integrations, the URI should be of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}</code>.
     * <code>Region</code>, <code>subdomain</code> and <code>service</code> are used to determine the right endpoint.
     * For AWS services that use the <code>Action=</code> query string parameter, <code>service_api</code> should be a
     * valid action for the desired service. For RESTful AWS service APIs, <code>path</code> is used to indicate that
     * the remaining substring in the URI should be treated as the path to the resource, including the initial
     * <code>/</code>.
     * </p>
     * 
     * @return Specifies the integration's Uniform Resource Identifier (URI). For HTTP integrations, the URI must be a
     *         fully formed, encoded HTTP(S) URL according to the <a href="https://www.ietf.org/rfc/rfc3986.txt"
     *         target="_blank">RFC-3986 specification</a>. For AWS integrations, the URI should be of the form
     *         <code>arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}</code>.
     *         <code>Region</code>, <code>subdomain</code> and <code>service</code> are used to determine the right
     *         endpoint. For AWS services that use the <code>Action=</code> query string parameter,
     *         <code>service_api</code> should be a valid action for the desired service. For RESTful AWS service APIs,
     *         <code>path</code> is used to indicate that the remaining substring in the URI should be treated as the
     *         path to the resource, including the initial <code>/</code>.
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * Specifies the integration's Uniform Resource Identifier (URI). For HTTP integrations, the URI must be a fully
     * formed, encoded HTTP(S) URL according to the <a href="https://www.ietf.org/rfc/rfc3986.txt"
     * target="_blank">RFC-3986 specification</a>. For AWS integrations, the URI should be of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}</code>.
     * <code>Region</code>, <code>subdomain</code> and <code>service</code> are used to determine the right endpoint.
     * For AWS services that use the <code>Action=</code> query string parameter, <code>service_api</code> should be a
     * valid action for the desired service. For RESTful AWS service APIs, <code>path</code> is used to indicate that
     * the remaining substring in the URI should be treated as the path to the resource, including the initial
     * <code>/</code>.
     * </p>
     * 
     * @param uri
     *        Specifies the integration's Uniform Resource Identifier (URI). For HTTP integrations, the URI must be a
     *        fully formed, encoded HTTP(S) URL according to the <a href="https://www.ietf.org/rfc/rfc3986.txt"
     *        target="_blank">RFC-3986 specification</a>. For AWS integrations, the URI should be of the form
     *        <code>arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}</code>.
     *        <code>Region</code>, <code>subdomain</code> and <code>service</code> are used to determine the right
     *        endpoint. For AWS services that use the <code>Action=</code> query string parameter,
     *        <code>service_api</code> should be a valid action for the desired service. For RESTful AWS service APIs,
     *        <code>path</code> is used to indicate that the remaining substring in the URI should be treated as the
     *        path to the resource, including the initial <code>/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResult withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for Amazon API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string
     * <code>arn:aws:iam::\*:user/\*</code>. To use resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @param credentials
     *        Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     *        available. To specify an IAM Role for Amazon API Gateway to assume, use the role's Amazon Resource Name
     *        (ARN). To require that the caller's identity be passed through from the request, specify the string
     *        <code>arn:aws:iam::\*:user/\*</code>. To use resource-based permissions on supported AWS services, specify
     *        null.
     */

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for Amazon API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string
     * <code>arn:aws:iam::\*:user/\*</code>. To use resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @return Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     *         available. To specify an IAM Role for Amazon API Gateway to assume, use the role's Amazon Resource Name
     *         (ARN). To require that the caller's identity be passed through from the request, specify the string
     *         <code>arn:aws:iam::\*:user/\*</code>. To use resource-based permissions on supported AWS services,
     *         specify null.
     */

    public String getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     * available. To specify an IAM Role for Amazon API Gateway to assume, use the role's Amazon Resource Name (ARN). To
     * require that the caller's identity be passed through from the request, specify the string
     * <code>arn:aws:iam::\*:user/\*</code>. To use resource-based permissions on supported AWS services, specify null.
     * </p>
     * 
     * @param credentials
     *        Specifies the credentials required for the integration, if any. For AWS integrations, three options are
     *        available. To specify an IAM Role for Amazon API Gateway to assume, use the role's Amazon Resource Name
     *        (ARN). To require that the caller's identity be passed through from the request, specify the string
     *        <code>arn:aws:iam::\*:user/\*</code>. To use resource-based permissions on supported AWS services, specify
     *        null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResult withCredentials(String credentials) {
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

    public PutIntegrationResult withRequestParameters(java.util.Map<String, String> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    public PutIntegrationResult addRequestParametersEntry(String key, String value) {
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

    public PutIntegrationResult clearRequestParametersEntries() {
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

    public PutIntegrationResult withRequestTemplates(java.util.Map<String, String> requestTemplates) {
        setRequestTemplates(requestTemplates);
        return this;
    }

    public PutIntegrationResult addRequestTemplatesEntry(String key, String value) {
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

    public PutIntegrationResult clearRequestTemplatesEntries() {
        this.requestTemplates = null;
        return this;
    }

    /**
     * <div>
     * <p>
     * Specifies how the method request body of an unmapped content type will be passed through the integration request
     * to the back end without transformation. A content type is unmapped if no mapping template is defined in the
     * integration or the content type does not match any of the mapped content types, as specified in
     * <code>requestTemplates</code>. There are three valid values: <code>WHEN_NO_MATCH</code>,
     * <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>.
     * </p>
     * <ul>
     * <li> <code>WHEN_NO_MATCH</code> passes the method request body through the integration request to the back end
     * without transformation when the method request content type does not match any content type associated with the
     * mapping templates defined in the integration request.</li>
     * <li> <code>WHEN_NO_TEMPLATES</code> passes the method request body through the integration request to the back end
     * without transformation when no mapping template is defined in the integration request. If a template is defined
     * when this option is selected, the method request of an unmapped content-type will be rejected with an HTTP
     * <code>415 Unsupported Media Type</code> response.</li>
     * <li> <code>NEVER</code> rejects the method request with an HTTP <code>415 Unsupported Media Type</code> response
     * when either the method request content type does not match any content type associated with the mapping templates
     * defined in the integration request or no mapping template is defined in the integration request.</li>
     * </ul>
     * </div>
     * 
     * @param passthroughBehavior
     *        <p>
     *        Specifies how the method request body of an unmapped content type will be passed through the integration
     *        request to the back end without transformation. A content type is unmapped if no mapping template is
     *        defined in the integration or the content type does not match any of the mapped content types, as
     *        specified in <code>requestTemplates</code>. There are three valid values: <code>WHEN_NO_MATCH</code>,
     *        <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>.
     *        </p>
     *        <ul>
     *        <li> <code>WHEN_NO_MATCH</code> passes the method request body through the integration request to the back
     *        end without transformation when the method request content type does not match any content type associated
     *        with the mapping templates defined in the integration request.</li>
     *        <li> <code>WHEN_NO_TEMPLATES</code> passes the method request body through the integration request to the
     *        back end without transformation when no mapping template is defined in the integration request. If a
     *        template is defined when this option is selected, the method request of an unmapped content-type will be
     *        rejected with an HTTP <code>415 Unsupported Media Type</code> response.</li>
     *        <li> <code>NEVER</code> rejects the method request with an HTTP <code>415 Unsupported Media Type</code>
     *        response when either the method request content type does not match any content type associated with the
     *        mapping templates defined in the integration request or no mapping template is defined in the integration
     *        request.</li>
     *        </ul>
     */

    public void setPassthroughBehavior(String passthroughBehavior) {
        this.passthroughBehavior = passthroughBehavior;
    }

    /**
     * <div>
     * <p>
     * Specifies how the method request body of an unmapped content type will be passed through the integration request
     * to the back end without transformation. A content type is unmapped if no mapping template is defined in the
     * integration or the content type does not match any of the mapped content types, as specified in
     * <code>requestTemplates</code>. There are three valid values: <code>WHEN_NO_MATCH</code>,
     * <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>.
     * </p>
     * <ul>
     * <li> <code>WHEN_NO_MATCH</code> passes the method request body through the integration request to the back end
     * without transformation when the method request content type does not match any content type associated with the
     * mapping templates defined in the integration request.</li>
     * <li> <code>WHEN_NO_TEMPLATES</code> passes the method request body through the integration request to the back end
     * without transformation when no mapping template is defined in the integration request. If a template is defined
     * when this option is selected, the method request of an unmapped content-type will be rejected with an HTTP
     * <code>415 Unsupported Media Type</code> response.</li>
     * <li> <code>NEVER</code> rejects the method request with an HTTP <code>415 Unsupported Media Type</code> response
     * when either the method request content type does not match any content type associated with the mapping templates
     * defined in the integration request or no mapping template is defined in the integration request.</li>
     * </ul>
     * </div>
     * 
     * @return <p>
     *         Specifies how the method request body of an unmapped content type will be passed through the integration
     *         request to the back end without transformation. A content type is unmapped if no mapping template is
     *         defined in the integration or the content type does not match any of the mapped content types, as
     *         specified in <code>requestTemplates</code>. There are three valid values: <code>WHEN_NO_MATCH</code>,
     *         <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>.
     *         </p>
     *         <ul>
     *         <li> <code>WHEN_NO_MATCH</code> passes the method request body through the integration request to the back
     *         end without transformation when the method request content type does not match any content type
     *         associated with the mapping templates defined in the integration request.</li>
     *         <li> <code>WHEN_NO_TEMPLATES</code> passes the method request body through the integration request to the
     *         back end without transformation when no mapping template is defined in the integration request. If a
     *         template is defined when this option is selected, the method request of an unmapped content-type will be
     *         rejected with an HTTP <code>415 Unsupported Media Type</code> response.</li>
     *         <li> <code>NEVER</code> rejects the method request with an HTTP <code>415 Unsupported Media Type</code>
     *         response when either the method request content type does not match any content type associated with the
     *         mapping templates defined in the integration request or no mapping template is defined in the integration
     *         request.</li>
     *         </ul>
     */

    public String getPassthroughBehavior() {
        return this.passthroughBehavior;
    }

    /**
     * <div>
     * <p>
     * Specifies how the method request body of an unmapped content type will be passed through the integration request
     * to the back end without transformation. A content type is unmapped if no mapping template is defined in the
     * integration or the content type does not match any of the mapped content types, as specified in
     * <code>requestTemplates</code>. There are three valid values: <code>WHEN_NO_MATCH</code>,
     * <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>.
     * </p>
     * <ul>
     * <li> <code>WHEN_NO_MATCH</code> passes the method request body through the integration request to the back end
     * without transformation when the method request content type does not match any content type associated with the
     * mapping templates defined in the integration request.</li>
     * <li> <code>WHEN_NO_TEMPLATES</code> passes the method request body through the integration request to the back end
     * without transformation when no mapping template is defined in the integration request. If a template is defined
     * when this option is selected, the method request of an unmapped content-type will be rejected with an HTTP
     * <code>415 Unsupported Media Type</code> response.</li>
     * <li> <code>NEVER</code> rejects the method request with an HTTP <code>415 Unsupported Media Type</code> response
     * when either the method request content type does not match any content type associated with the mapping templates
     * defined in the integration request or no mapping template is defined in the integration request.</li>
     * </ul>
     * </div>
     * 
     * @param passthroughBehavior
     *        <p>
     *        Specifies how the method request body of an unmapped content type will be passed through the integration
     *        request to the back end without transformation. A content type is unmapped if no mapping template is
     *        defined in the integration or the content type does not match any of the mapped content types, as
     *        specified in <code>requestTemplates</code>. There are three valid values: <code>WHEN_NO_MATCH</code>,
     *        <code>WHEN_NO_TEMPLATES</code>, and <code>NEVER</code>.
     *        </p>
     *        <ul>
     *        <li> <code>WHEN_NO_MATCH</code> passes the method request body through the integration request to the back
     *        end without transformation when the method request content type does not match any content type associated
     *        with the mapping templates defined in the integration request.</li>
     *        <li> <code>WHEN_NO_TEMPLATES</code> passes the method request body through the integration request to the
     *        back end without transformation when no mapping template is defined in the integration request. If a
     *        template is defined when this option is selected, the method request of an unmapped content-type will be
     *        rejected with an HTTP <code>415 Unsupported Media Type</code> response.</li>
     *        <li> <code>NEVER</code> rejects the method request with an HTTP <code>415 Unsupported Media Type</code>
     *        response when either the method request content type does not match any content type associated with the
     *        mapping templates defined in the integration request or no mapping template is defined in the integration
     *        request.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResult withPassthroughBehavior(String passthroughBehavior) {
        setPassthroughBehavior(passthroughBehavior);
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

    public PutIntegrationResult withContentHandling(String contentHandling) {
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

    public PutIntegrationResult withContentHandling(ContentHandlingStrategy contentHandling) {
        setContentHandling(contentHandling);
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
     * @return Returns a reference to this object so that method calls can be chained together.
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

    public void setCacheKeyParameters(java.util.Collection<String> cacheKeyParameters) {
        if (cacheKeyParameters == null) {
            this.cacheKeyParameters = null;
            return;
        }

        this.cacheKeyParameters = new java.util.ArrayList<String>(cacheKeyParameters);
    }

    /**
     * <p>
     * Specifies the integration's cache key parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCacheKeyParameters(java.util.Collection)} or {@link #withCacheKeyParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param cacheKeyParameters
     *        Specifies the integration's cache key parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResult withCacheKeyParameters(String... cacheKeyParameters) {
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
     * Specifies the integration's cache key parameters.
     * </p>
     * 
     * @param cacheKeyParameters
     *        Specifies the integration's cache key parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResult withCacheKeyParameters(java.util.Collection<String> cacheKeyParameters) {
        setCacheKeyParameters(cacheKeyParameters);
        return this;
    }

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example: Get integration responses of a method</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns <code>200 OK</code> status and a payload as follows:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an API</a>
     * </div>
     * 
     * @return Specifies the integration's responses.
     *         </p>
     *         <div class="remarks">
     *         <p/>
     *         <h4>Example: Get integration responses of a method</h4>
     *         <h5>Request</h5>
     *         <p/>
     * 
     *         <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     *         <h5>Response</h5>
     *         <p>
     *         The successful response returns <code>200 OK</code> status and a payload as follows:
     *         </p>
     * 
     *         <pre>
     * <code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     *         <p/>
     *         </div> <div class="seeAlso"> <a
     *         href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an
     *         API</a>
     */

    public java.util.Map<String, IntegrationResponse> getIntegrationResponses() {
        return integrationResponses;
    }

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example: Get integration responses of a method</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns <code>200 OK</code> status and a payload as follows:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an API</a>
     * </div>
     * 
     * @param integrationResponses
     *        Specifies the integration's responses.
     *        </p>
     *        <div class="remarks">
     *        <p/>
     *        <h4>Example: Get integration responses of a method</h4>
     *        <h5>Request</h5>
     *        <p/>
     * 
     *        <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     *        <h5>Response</h5>
     *        <p>
     *        The successful response returns <code>200 OK</code> status and a payload as follows:
     *        </p>
     * 
     *        <pre>
     * <code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     *        <p/>
     *        </div> <div class="seeAlso"> <a
     *        href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an
     *        API</a>
     */

    public void setIntegrationResponses(java.util.Map<String, IntegrationResponse> integrationResponses) {
        this.integrationResponses = integrationResponses;
    }

    /**
     * <p>
     * Specifies the integration's responses.
     * </p>
     * <div class="remarks">
     * <p/>
     * <h4>Example: Get integration responses of a method</h4>
     * <h5>Request</h5>
     * <p/>
     * 
     * <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     * <h5>Response</h5>
     * <p>
     * The successful response returns <code>200 OK</code> status and a payload as follows:
     * </p>
     * 
     * <pre>
     * <code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     * <p/>
     * </div> <div class="seeAlso"> <a
     * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an API</a>
     * </div>
     * 
     * @param integrationResponses
     *        Specifies the integration's responses.
     *        </p>
     *        <div class="remarks">
     *        <p/>
     *        <h4>Example: Get integration responses of a method</h4>
     *        <h5>Request</h5>
     *        <p/>
     * 
     *        <pre>
     * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160607T191449Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160607/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
     * </pre>
     * 
     *        <h5>Response</h5>
     *        <p>
     *        The successful response returns <code>200 OK</code> status and a payload as follows:
     *        </p>
     * 
     *        <pre>
     * <code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "$util.urlDecode(\"%3CkinesisStreams%3E#foreach($stream in $input.path('$.StreamNames'))%3Cstream%3E%3Cname%3E$stream%3C/name%3E%3C/stream%3E#end%3C/kinesisStreams%3E\")\n" }, "statusCode": "200" }</code>
     * </pre>
     *        <p/>
     *        </div> <div class="seeAlso"> <a
     *        href="http://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an
     *        API</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResult withIntegrationResponses(java.util.Map<String, IntegrationResponse> integrationResponses) {
        setIntegrationResponses(integrationResponses);
        return this;
    }

    public PutIntegrationResult addIntegrationResponsesEntry(String key, IntegrationResponse value) {
        if (null == this.integrationResponses) {
            this.integrationResponses = new java.util.HashMap<String, IntegrationResponse>();
        }
        if (this.integrationResponses.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.integrationResponses.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IntegrationResponses.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResult clearIntegrationResponsesEntries() {
        this.integrationResponses = null;
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
        if (getPassthroughBehavior() != null)
            sb.append("PassthroughBehavior: " + getPassthroughBehavior() + ",");
        if (getContentHandling() != null)
            sb.append("ContentHandling: " + getContentHandling() + ",");
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
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
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
        if (other.getContentHandling() == null ^ this.getContentHandling() == null)
            return false;
        if (other.getContentHandling() != null && other.getContentHandling().equals(this.getContentHandling()) == false)
            return false;
        if (other.getCacheNamespace() == null ^ this.getCacheNamespace() == null)
            return false;
        if (other.getCacheNamespace() != null && other.getCacheNamespace().equals(this.getCacheNamespace()) == false)
            return false;
        if (other.getCacheKeyParameters() == null ^ this.getCacheKeyParameters() == null)
            return false;
        if (other.getCacheKeyParameters() != null && other.getCacheKeyParameters().equals(this.getCacheKeyParameters()) == false)
            return false;
        if (other.getIntegrationResponses() == null ^ this.getIntegrationResponses() == null)
            return false;
        if (other.getIntegrationResponses() != null && other.getIntegrationResponses().equals(this.getIntegrationResponses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestTemplates() == null) ? 0 : getRequestTemplates().hashCode());
        hashCode = prime * hashCode + ((getPassthroughBehavior() == null) ? 0 : getPassthroughBehavior().hashCode());
        hashCode = prime * hashCode + ((getContentHandling() == null) ? 0 : getContentHandling().hashCode());
        hashCode = prime * hashCode + ((getCacheNamespace() == null) ? 0 : getCacheNamespace().hashCode());
        hashCode = prime * hashCode + ((getCacheKeyParameters() == null) ? 0 : getCacheKeyParameters().hashCode());
        hashCode = prime * hashCode + ((getIntegrationResponses() == null) ? 0 : getIntegrationResponses().hashCode());
        return hashCode;
    }

    @Override
    public PutIntegrationResult clone() {
        try {
            return (PutIntegrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
