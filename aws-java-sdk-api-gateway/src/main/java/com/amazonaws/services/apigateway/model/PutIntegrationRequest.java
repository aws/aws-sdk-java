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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets up a method's integration.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] Specifies a put integration request's resource ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * [Required] Specifies a put integration request's HTTP method.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * [Required] Specifies a put integration input's type.
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
     * Specifies Uniform Resource Identifier (URI) of the integration endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI must be a fully formed, encoded HTTP(S)
     * URL according to the <a target="_blank" href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986
     * specification</a>, for either standard integration, where <code>connectionType</code> is not
     * <code>VPC_LINK</code>, or private integration, where <code>connectionType</code> is <code>VPC_LINK</code>. For a
     * private HTTP integration, the URI is not used for routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>. Here,
     * <code>{Region}</code> is the API Gateway region (e.g., <code>us-east-1</code>); <code>{service}</code> is the
     * name of the integrated AWS service (e.g., <code>s3</code>); and <code>{subdomain}</code> is a designated
     * subdomain supported by certain AWS service for fast host-name lookup. <code>action</code> can be used for an AWS
     * service action-based API, using an <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The
     * ensuing <code>{service_api}</code> refers to a supported action <code>{name}</code> plus any required input
     * parameters. Alternatively, <code>path</code> can be used for an AWS service path-based API. The ensuing
     * <code>service_api</code> refers to the path to an AWS service resource, including the region of the integrated
     * AWS service, if applicable. For example, for integration with the S3 API of
     * <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>, the
     * <code>uri</code> can be either
     * <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code> or
     * <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     * </p>
     * </li>
     * </ul>
     */
    private String uri;
    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code> for
     * connections through the public routable internet or <code>VPC_LINK</code> for private connections between API
     * Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * </p>
     */
    private String connectionType;
    /**
     * <p>
     * The (<a href="https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"><code>id</code></a>) of
     * the <a>VpcLink</a> used for the integration when <code>connectionType=VPC_LINK</code> and undefined, otherwise.
     * </p>
     */
    private String connectionId;
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
     * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
     * </p>
     */
    private Integer timeoutInMillis;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] Specifies a put integration request's resource ID.
     * </p>
     * 
     * @param resourceId
     *        [Required] Specifies a put integration request's resource ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * [Required] Specifies a put integration request's resource ID.
     * </p>
     * 
     * @return [Required] Specifies a put integration request's resource ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * [Required] Specifies a put integration request's resource ID.
     * </p>
     * 
     * @param resourceId
     *        [Required] Specifies a put integration request's resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * [Required] Specifies a put integration request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        [Required] Specifies a put integration request's HTTP method.
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * [Required] Specifies a put integration request's HTTP method.
     * </p>
     * 
     * @return [Required] Specifies a put integration request's HTTP method.
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * [Required] Specifies a put integration request's HTTP method.
     * </p>
     * 
     * @param httpMethod
     *        [Required] Specifies a put integration request's HTTP method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * [Required] Specifies a put integration input's type.
     * </p>
     * 
     * @param type
     *        [Required] Specifies a put integration input's type.
     * @see IntegrationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * [Required] Specifies a put integration input's type.
     * </p>
     * 
     * @return [Required] Specifies a put integration input's type.
     * @see IntegrationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * [Required] Specifies a put integration input's type.
     * </p>
     * 
     * @param type
     *        [Required] Specifies a put integration input's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public PutIntegrationRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * [Required] Specifies a put integration input's type.
     * </p>
     * 
     * @param type
     *        [Required] Specifies a put integration input's type.
     * @see IntegrationType
     */

    public void setType(IntegrationType type) {
        withType(type);
    }

    /**
     * <p>
     * [Required] Specifies a put integration input's type.
     * </p>
     * 
     * @param type
     *        [Required] Specifies a put integration input's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationType
     */

    public PutIntegrationRequest withType(IntegrationType type) {
        this.type = type.toString();
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
     * Specifies Uniform Resource Identifier (URI) of the integration endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI must be a fully formed, encoded HTTP(S)
     * URL according to the <a target="_blank" href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986
     * specification</a>, for either standard integration, where <code>connectionType</code> is not
     * <code>VPC_LINK</code>, or private integration, where <code>connectionType</code> is <code>VPC_LINK</code>. For a
     * private HTTP integration, the URI is not used for routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>. Here,
     * <code>{Region}</code> is the API Gateway region (e.g., <code>us-east-1</code>); <code>{service}</code> is the
     * name of the integrated AWS service (e.g., <code>s3</code>); and <code>{subdomain}</code> is a designated
     * subdomain supported by certain AWS service for fast host-name lookup. <code>action</code> can be used for an AWS
     * service action-based API, using an <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The
     * ensuing <code>{service_api}</code> refers to a supported action <code>{name}</code> plus any required input
     * parameters. Alternatively, <code>path</code> can be used for an AWS service path-based API. The ensuing
     * <code>service_api</code> refers to the path to an AWS service resource, including the region of the integrated
     * AWS service, if applicable. For example, for integration with the S3 API of
     * <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>, the
     * <code>uri</code> can be either
     * <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code> or
     * <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param uri
     *        Specifies Uniform Resource Identifier (URI) of the integration endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI must be a fully formed, encoded
     *        HTTP(S) URL according to the <a target="_blank"
     *        href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986 specification</a>, for either
     *        standard integration, where <code>connectionType</code> is not <code>VPC_LINK</code>, or private
     *        integration, where <code>connectionType</code> is <code>VPC_LINK</code>. For a private HTTP integration,
     *        the URI is not used for routing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is of the form
     *        <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>. Here,
     *        <code>{Region}</code> is the API Gateway region (e.g., <code>us-east-1</code>); <code>{service}</code> is
     *        the name of the integrated AWS service (e.g., <code>s3</code>); and <code>{subdomain}</code> is a
     *        designated subdomain supported by certain AWS service for fast host-name lookup. <code>action</code> can
     *        be used for an AWS service action-based API, using an
     *        <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The ensuing
     *        <code>{service_api}</code> refers to a supported action <code>{name}</code> plus any required input
     *        parameters. Alternatively, <code>path</code> can be used for an AWS service path-based API. The ensuing
     *        <code>service_api</code> refers to the path to an AWS service resource, including the region of the
     *        integrated AWS service, if applicable. For example, for integration with the S3 API of
     *        <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>,
     *        the <code>uri</code> can be either
     *        <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code> or
     *        <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     *        </p>
     *        </li>
     */

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * Specifies Uniform Resource Identifier (URI) of the integration endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI must be a fully formed, encoded HTTP(S)
     * URL according to the <a target="_blank" href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986
     * specification</a>, for either standard integration, where <code>connectionType</code> is not
     * <code>VPC_LINK</code>, or private integration, where <code>connectionType</code> is <code>VPC_LINK</code>. For a
     * private HTTP integration, the URI is not used for routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>. Here,
     * <code>{Region}</code> is the API Gateway region (e.g., <code>us-east-1</code>); <code>{service}</code> is the
     * name of the integrated AWS service (e.g., <code>s3</code>); and <code>{subdomain}</code> is a designated
     * subdomain supported by certain AWS service for fast host-name lookup. <code>action</code> can be used for an AWS
     * service action-based API, using an <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The
     * ensuing <code>{service_api}</code> refers to a supported action <code>{name}</code> plus any required input
     * parameters. Alternatively, <code>path</code> can be used for an AWS service path-based API. The ensuing
     * <code>service_api</code> refers to the path to an AWS service resource, including the region of the integrated
     * AWS service, if applicable. For example, for integration with the S3 API of
     * <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>, the
     * <code>uri</code> can be either
     * <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code> or
     * <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies Uniform Resource Identifier (URI) of the integration endpoint.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI must be a fully formed, encoded
     *         HTTP(S) URL according to the <a target="_blank"
     *         href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986 specification</a>, for either
     *         standard integration, where <code>connectionType</code> is not <code>VPC_LINK</code>, or private
     *         integration, where <code>connectionType</code> is <code>VPC_LINK</code>. For a private HTTP integration,
     *         the URI is not used for routing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is of the form
     *         <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>. Here,
     *         <code>{Region}</code> is the API Gateway region (e.g., <code>us-east-1</code>); <code>{service}</code> is
     *         the name of the integrated AWS service (e.g., <code>s3</code>); and <code>{subdomain}</code> is a
     *         designated subdomain supported by certain AWS service for fast host-name lookup. <code>action</code> can
     *         be used for an AWS service action-based API, using an
     *         <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The ensuing
     *         <code>{service_api}</code> refers to a supported action <code>{name}</code> plus any required input
     *         parameters. Alternatively, <code>path</code> can be used for an AWS service path-based API. The ensuing
     *         <code>service_api</code> refers to the path to an AWS service resource, including the region of the
     *         integrated AWS service, if applicable. For example, for integration with the S3 API of
     *         <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>,
     *         the <code>uri</code> can be either
     *         <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code> or
     *         <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     *         </p>
     *         </li>
     */

    public String getUri() {
        return this.uri;
    }

    /**
     * <p>
     * Specifies Uniform Resource Identifier (URI) of the integration endpoint.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI must be a fully formed, encoded HTTP(S)
     * URL according to the <a target="_blank" href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986
     * specification</a>, for either standard integration, where <code>connectionType</code> is not
     * <code>VPC_LINK</code>, or private integration, where <code>connectionType</code> is <code>VPC_LINK</code>. For a
     * private HTTP integration, the URI is not used for routing.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is of the form
     * <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>. Here,
     * <code>{Region}</code> is the API Gateway region (e.g., <code>us-east-1</code>); <code>{service}</code> is the
     * name of the integrated AWS service (e.g., <code>s3</code>); and <code>{subdomain}</code> is a designated
     * subdomain supported by certain AWS service for fast host-name lookup. <code>action</code> can be used for an AWS
     * service action-based API, using an <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The
     * ensuing <code>{service_api}</code> refers to a supported action <code>{name}</code> plus any required input
     * parameters. Alternatively, <code>path</code> can be used for an AWS service path-based API. The ensuing
     * <code>service_api</code> refers to the path to an AWS service resource, including the region of the integrated
     * AWS service, if applicable. For example, for integration with the S3 API of
     * <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>, the
     * <code>uri</code> can be either
     * <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code> or
     * <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param uri
     *        Specifies Uniform Resource Identifier (URI) of the integration endpoint.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>HTTP</code> or <code>HTTP_PROXY</code> integrations, the URI must be a fully formed, encoded
     *        HTTP(S) URL according to the <a target="_blank"
     *        href="https://en.wikipedia.org/wiki/Uniform_Resource_Identifier">RFC-3986 specification</a>, for either
     *        standard integration, where <code>connectionType</code> is not <code>VPC_LINK</code>, or private
     *        integration, where <code>connectionType</code> is <code>VPC_LINK</code>. For a private HTTP integration,
     *        the URI is not used for routing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>AWS</code> or <code>AWS_PROXY</code> integrations, the URI is of the form
     *        <code>arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}</code>. Here,
     *        <code>{Region}</code> is the API Gateway region (e.g., <code>us-east-1</code>); <code>{service}</code> is
     *        the name of the integrated AWS service (e.g., <code>s3</code>); and <code>{subdomain}</code> is a
     *        designated subdomain supported by certain AWS service for fast host-name lookup. <code>action</code> can
     *        be used for an AWS service action-based API, using an
     *        <code>Action={name}&amp;{p1}={v1}&amp;p2={v2}...</code> query string. The ensuing
     *        <code>{service_api}</code> refers to a supported action <code>{name}</code> plus any required input
     *        parameters. Alternatively, <code>path</code> can be used for an AWS service path-based API. The ensuing
     *        <code>service_api</code> refers to the path to an AWS service resource, including the region of the
     *        integrated AWS service, if applicable. For example, for integration with the S3 API of
     *        <code><a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectGET.html">GetObject</a></code>,
     *        the <code>uri</code> can be either
     *        <code>arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}</code> or
     *        <code>arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withUri(String uri) {
        setUri(uri);
        return this;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code> for
     * connections through the public routable internet or <code>VPC_LINK</code> for private connections between API
     * Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * </p>
     * 
     * @param connectionType
     *        The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code>
     *        for connections through the public routable internet or <code>VPC_LINK</code> for private connections
     *        between API Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * @see ConnectionType
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code> for
     * connections through the public routable internet or <code>VPC_LINK</code> for private connections between API
     * Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * </p>
     * 
     * @return The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code>
     *         for connections through the public routable internet or <code>VPC_LINK</code> for private connections
     *         between API Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * @see ConnectionType
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code> for
     * connections through the public routable internet or <code>VPC_LINK</code> for private connections between API
     * Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * </p>
     * 
     * @param connectionType
     *        The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code>
     *        for connections through the public routable internet or <code>VPC_LINK</code> for private connections
     *        between API Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public PutIntegrationRequest withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code> for
     * connections through the public routable internet or <code>VPC_LINK</code> for private connections between API
     * Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * </p>
     * 
     * @param connectionType
     *        The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code>
     *        for connections through the public routable internet or <code>VPC_LINK</code> for private connections
     *        between API Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * @see ConnectionType
     */

    public void setConnectionType(ConnectionType connectionType) {
        withConnectionType(connectionType);
    }

    /**
     * <p>
     * The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code> for
     * connections through the public routable internet or <code>VPC_LINK</code> for private connections between API
     * Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * </p>
     * 
     * @param connectionType
     *        The type of the network connection to the integration endpoint. The valid value is <code>INTERNET</code>
     *        for connections through the public routable internet or <code>VPC_LINK</code> for private connections
     *        between API Gateway and a network load balancer in a VPC. The default value is <code>INTERNET</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public PutIntegrationRequest withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
        return this;
    }

    /**
     * <p>
     * The (<a href="https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"><code>id</code></a>) of
     * the <a>VpcLink</a> used for the integration when <code>connectionType=VPC_LINK</code> and undefined, otherwise.
     * </p>
     * 
     * @param connectionId
     *        The (<a href="https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"><code>id</code>
     *        </a>) of the <a>VpcLink</a> used for the integration when <code>connectionType=VPC_LINK</code> and
     *        undefined, otherwise.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The (<a href="https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"><code>id</code></a>) of
     * the <a>VpcLink</a> used for the integration when <code>connectionType=VPC_LINK</code> and undefined, otherwise.
     * </p>
     * 
     * @return The (<a href="https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"><code>id</code>
     *         </a>) of the <a>VpcLink</a> used for the integration when <code>connectionType=VPC_LINK</code> and
     *         undefined, otherwise.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The (<a href="https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"><code>id</code></a>) of
     * the <a>VpcLink</a> used for the integration when <code>connectionType=VPC_LINK</code> and undefined, otherwise.
     * </p>
     * 
     * @param connectionId
     *        The (<a href="https://docs.aws.amazon.com/apigateway/api-reference/resource/vpc-link/#id"><code>id</code>
     *        </a>) of the <a>VpcLink</a> used for the integration when <code>connectionType=VPC_LINK</code> and
     *        undefined, otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
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
        withContentHandling(contentHandling);
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
        this.contentHandling = contentHandling.toString();
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

    public PutIntegrationRequest withTimeoutInMillis(Integer timeoutInMillis) {
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
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: ").append(getHttpMethod()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getIntegrationHttpMethod() != null)
            sb.append("IntegrationHttpMethod: ").append(getIntegrationHttpMethod()).append(",");
        if (getUri() != null)
            sb.append("Uri: ").append(getUri()).append(",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType()).append(",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: ").append(getRequestParameters()).append(",");
        if (getRequestTemplates() != null)
            sb.append("RequestTemplates: ").append(getRequestTemplates()).append(",");
        if (getPassthroughBehavior() != null)
            sb.append("PassthroughBehavior: ").append(getPassthroughBehavior()).append(",");
        if (getCacheNamespace() != null)
            sb.append("CacheNamespace: ").append(getCacheNamespace()).append(",");
        if (getCacheKeyParameters() != null)
            sb.append("CacheKeyParameters: ").append(getCacheKeyParameters()).append(",");
        if (getContentHandling() != null)
            sb.append("ContentHandling: ").append(getContentHandling()).append(",");
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
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
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

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIntegrationHttpMethod() == null) ? 0 : getIntegrationHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestTemplates() == null) ? 0 : getRequestTemplates().hashCode());
        hashCode = prime * hashCode + ((getPassthroughBehavior() == null) ? 0 : getPassthroughBehavior().hashCode());
        hashCode = prime * hashCode + ((getCacheNamespace() == null) ? 0 : getCacheNamespace().hashCode());
        hashCode = prime * hashCode + ((getCacheKeyParameters() == null) ? 0 : getCacheKeyParameters().hashCode());
        hashCode = prime * hashCode + ((getContentHandling() == null) ? 0 : getContentHandling().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMillis() == null) ? 0 : getTimeoutInMillis().hashCode());
        return hashCode;
    }

    @Override
    public PutIntegrationRequest clone() {
        return (PutIntegrationRequest) super.clone();
    }

}
