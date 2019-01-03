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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A gateway response of a given response type and status code, with optional response parameters and mapping templates.
 * </p>
 * <div class="remarks"> For more information about valid gateway response types, see <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html">Gateway
 * Response Types Supported by API Gateway</a> <div class="example"> <h4>Example: Get a Gateway Response of a given
 * response type</h4> <h5>Request</h5>
 * <p>
 * This example shows how to get a gateway response of the <code>MISSING_AUTHENTICATION_TOKEN</code> type.
 * </p>
 * 
 * <pre>
 * <code>GET /restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN HTTP/1.1 Host: beta-apigateway.us-east-1.amazonaws.com Content-Type: application/json X-Amz-Date: 20170503T202516Z Authorization: AWS4-HMAC-SHA256 Credential={access-key-id}/20170503/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature=1b52460e3159c1a26cff29093855d50ea141c1c5b937528fecaf60f51129697a Cache-Control: no-cache Postman-Token: 3b2a1ce9-c848-2e26-2e2f-9c2caefbed45 </code>
 * </pre>
 * <p>
 * The response type is specified as a URL path.
 * </p>
 * <h5>Response</h5>
 * <p>
 * The successful operation returns the <code>200 OK</code> status code and a payload similar to the following:
 * </p>
 * 
 * <pre>
 * <code>{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-gatewayresponse-{rel}.html", "name": "gatewayresponse", "templated": true }, "self": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, "gatewayresponse:delete": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" } }, "defaultResponse": false, "responseParameters": { "gatewayresponse.header.x-request-path": "method.request.path.petId", "gatewayresponse.header.Access-Control-Allow-Origin": "&apos;a.b.c&apos;", "gatewayresponse.header.x-request-query": "method.request.querystring.q", "gatewayresponse.header.x-request-header": "method.request.header.Accept" }, "responseTemplates": { "application/json": "{\n \"message\": $context.error.messageString,\n \"type\": \"$context.error.responseType\",\n \"stage\": \"$context.stage\",\n \"resourcePath\": \"$context.resourcePath\",\n \"stageVariables.a\": \"$stageVariables.a\",\n \"statusCode\": \"&apos;404&apos;\"\n}" }, "responseType": "MISSING_AUTHENTICATION_TOKEN", "statusCode": "404" }</code>
 * </pre>
 * <p>
 * </p>
 * </div> </div> <div class="seeAlso"> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/customize-gateway-responses.html">Customize
 * Gateway Responses</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     */
    private String responseType;
    /**
     * <p>
     * The HTTP status code for this <a>GatewayResponse</a>.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string map of
     * key-value pairs.
     * </p>
     */
    private java.util.Map<String, String> responseParameters;
    /**
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     */
    private java.util.Map<String, String> responseTemplates;
    /**
     * <p>
     * A Boolean flag to indicate whether this <a>GatewayResponse</a> is the default gateway response (<code>true</code>
     * ) or not (<code>false</code>). A default gateway response is one generated by API Gateway without any
     * customization by an API developer.
     * </p>
     */
    private Boolean defaultResponse;

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * 
     * @param responseType
     *        The response type of the associated <a>GatewayResponse</a>. Valid values are
     *        <ul>
     *        <li>ACCESS_DENIED</li>
     *        <li>API_CONFIGURATION_ERROR</li>
     *        <li>AUTHORIZER_FAILURE</li>
     *        <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *        <li>BAD_REQUEST_PARAMETERS</li>
     *        <li>BAD_REQUEST_BODY</li>
     *        <li>DEFAULT_4XX</li>
     *        <li>DEFAULT_5XX</li>
     *        <li>EXPIRED_TOKEN</li>
     *        <li>INVALID_SIGNATURE</li>
     *        <li>INTEGRATION_FAILURE</li>
     *        <li>INTEGRATION_TIMEOUT</li>
     *        <li>INVALID_API_KEY</li>
     *        <li>MISSING_AUTHENTICATION_TOKEN</li>
     *        <li>QUOTA_EXCEEDED</li>
     *        <li>REQUEST_TOO_LARGE</li>
     *        <li>RESOURCE_NOT_FOUND</li>
     *        <li>THROTTLED</li>
     *        <li>UNAUTHORIZED</li>
     *        <li>UNSUPPORTED_MEDIA_TYPE</li>
     *        </ul>
     * @see GatewayResponseType
     */

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * 
     * @return The response type of the associated <a>GatewayResponse</a>. Valid values are
     *         <ul>
     *         <li>ACCESS_DENIED</li>
     *         <li>API_CONFIGURATION_ERROR</li>
     *         <li>AUTHORIZER_FAILURE</li>
     *         <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *         <li>BAD_REQUEST_PARAMETERS</li>
     *         <li>BAD_REQUEST_BODY</li>
     *         <li>DEFAULT_4XX</li>
     *         <li>DEFAULT_5XX</li>
     *         <li>EXPIRED_TOKEN</li>
     *         <li>INVALID_SIGNATURE</li>
     *         <li>INTEGRATION_FAILURE</li>
     *         <li>INTEGRATION_TIMEOUT</li>
     *         <li>INVALID_API_KEY</li>
     *         <li>MISSING_AUTHENTICATION_TOKEN</li>
     *         <li>QUOTA_EXCEEDED</li>
     *         <li>REQUEST_TOO_LARGE</li>
     *         <li>RESOURCE_NOT_FOUND</li>
     *         <li>THROTTLED</li>
     *         <li>UNAUTHORIZED</li>
     *         <li>UNSUPPORTED_MEDIA_TYPE</li>
     *         </ul>
     * @see GatewayResponseType
     */

    public String getResponseType() {
        return this.responseType;
    }

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * 
     * @param responseType
     *        The response type of the associated <a>GatewayResponse</a>. Valid values are
     *        <ul>
     *        <li>ACCESS_DENIED</li>
     *        <li>API_CONFIGURATION_ERROR</li>
     *        <li>AUTHORIZER_FAILURE</li>
     *        <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *        <li>BAD_REQUEST_PARAMETERS</li>
     *        <li>BAD_REQUEST_BODY</li>
     *        <li>DEFAULT_4XX</li>
     *        <li>DEFAULT_5XX</li>
     *        <li>EXPIRED_TOKEN</li>
     *        <li>INVALID_SIGNATURE</li>
     *        <li>INTEGRATION_FAILURE</li>
     *        <li>INTEGRATION_TIMEOUT</li>
     *        <li>INVALID_API_KEY</li>
     *        <li>MISSING_AUTHENTICATION_TOKEN</li>
     *        <li>QUOTA_EXCEEDED</li>
     *        <li>REQUEST_TOO_LARGE</li>
     *        <li>RESOURCE_NOT_FOUND</li>
     *        <li>THROTTLED</li>
     *        <li>UNAUTHORIZED</li>
     *        <li>UNSUPPORTED_MEDIA_TYPE</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayResponseType
     */

    public GatewayResponse withResponseType(String responseType) {
        setResponseType(responseType);
        return this;
    }

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * 
     * @param responseType
     *        The response type of the associated <a>GatewayResponse</a>. Valid values are
     *        <ul>
     *        <li>ACCESS_DENIED</li>
     *        <li>API_CONFIGURATION_ERROR</li>
     *        <li>AUTHORIZER_FAILURE</li>
     *        <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *        <li>BAD_REQUEST_PARAMETERS</li>
     *        <li>BAD_REQUEST_BODY</li>
     *        <li>DEFAULT_4XX</li>
     *        <li>DEFAULT_5XX</li>
     *        <li>EXPIRED_TOKEN</li>
     *        <li>INVALID_SIGNATURE</li>
     *        <li>INTEGRATION_FAILURE</li>
     *        <li>INTEGRATION_TIMEOUT</li>
     *        <li>INVALID_API_KEY</li>
     *        <li>MISSING_AUTHENTICATION_TOKEN</li>
     *        <li>QUOTA_EXCEEDED</li>
     *        <li>REQUEST_TOO_LARGE</li>
     *        <li>RESOURCE_NOT_FOUND</li>
     *        <li>THROTTLED</li>
     *        <li>UNAUTHORIZED</li>
     *        <li>UNSUPPORTED_MEDIA_TYPE</li>
     *        </ul>
     * @see GatewayResponseType
     */

    public void setResponseType(GatewayResponseType responseType) {
        withResponseType(responseType);
    }

    /**
     * <p>
     * The response type of the associated <a>GatewayResponse</a>. Valid values are
     * <ul>
     * <li>ACCESS_DENIED</li>
     * <li>API_CONFIGURATION_ERROR</li>
     * <li>AUTHORIZER_FAILURE</li>
     * <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     * <li>BAD_REQUEST_PARAMETERS</li>
     * <li>BAD_REQUEST_BODY</li>
     * <li>DEFAULT_4XX</li>
     * <li>DEFAULT_5XX</li>
     * <li>EXPIRED_TOKEN</li>
     * <li>INVALID_SIGNATURE</li>
     * <li>INTEGRATION_FAILURE</li>
     * <li>INTEGRATION_TIMEOUT</li>
     * <li>INVALID_API_KEY</li>
     * <li>MISSING_AUTHENTICATION_TOKEN</li>
     * <li>QUOTA_EXCEEDED</li>
     * <li>REQUEST_TOO_LARGE</li>
     * <li>RESOURCE_NOT_FOUND</li>
     * <li>THROTTLED</li>
     * <li>UNAUTHORIZED</li>
     * <li>UNSUPPORTED_MEDIA_TYPE</li>
     * </ul>
     * </p>
     * 
     * @param responseType
     *        The response type of the associated <a>GatewayResponse</a>. Valid values are
     *        <ul>
     *        <li>ACCESS_DENIED</li>
     *        <li>API_CONFIGURATION_ERROR</li>
     *        <li>AUTHORIZER_FAILURE</li>
     *        <li>AUTHORIZER_CONFIGURATION_ERROR</li>
     *        <li>BAD_REQUEST_PARAMETERS</li>
     *        <li>BAD_REQUEST_BODY</li>
     *        <li>DEFAULT_4XX</li>
     *        <li>DEFAULT_5XX</li>
     *        <li>EXPIRED_TOKEN</li>
     *        <li>INVALID_SIGNATURE</li>
     *        <li>INTEGRATION_FAILURE</li>
     *        <li>INTEGRATION_TIMEOUT</li>
     *        <li>INVALID_API_KEY</li>
     *        <li>MISSING_AUTHENTICATION_TOKEN</li>
     *        <li>QUOTA_EXCEEDED</li>
     *        <li>REQUEST_TOO_LARGE</li>
     *        <li>RESOURCE_NOT_FOUND</li>
     *        <li>THROTTLED</li>
     *        <li>UNAUTHORIZED</li>
     *        <li>UNSUPPORTED_MEDIA_TYPE</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayResponseType
     */

    public GatewayResponse withResponseType(GatewayResponseType responseType) {
        this.responseType = responseType.toString();
        return this;
    }

    /**
     * <p>
     * The HTTP status code for this <a>GatewayResponse</a>.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code for this <a>GatewayResponse</a>.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The HTTP status code for this <a>GatewayResponse</a>.
     * </p>
     * 
     * @return The HTTP status code for this <a>GatewayResponse</a>.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The HTTP status code for this <a>GatewayResponse</a>.
     * </p>
     * 
     * @param statusCode
     *        The HTTP status code for this <a>GatewayResponse</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayResponse withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string map of
     * key-value pairs.
     * </p>
     * 
     * @return Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a
     *         string-to-string map of key-value pairs.
     */

    public java.util.Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string map of
     * key-value pairs.
     * </p>
     * 
     * @param responseParameters
     *        Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string
     *        map of key-value pairs.
     */

    public void setResponseParameters(java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string map of
     * key-value pairs.
     * </p>
     * 
     * @param responseParameters
     *        Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string
     *        map of key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayResponse withResponseParameters(java.util.Map<String, String> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    public GatewayResponse addResponseParametersEntry(String key, String value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, String>();
        }
        if (this.responseParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayResponse clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     * 
     * @return Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     */

    public java.util.Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     * 
     * @param responseTemplates
     *        Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     */

    public void setResponseTemplates(java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    /**
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     * 
     * @param responseTemplates
     *        Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayResponse withResponseTemplates(java.util.Map<String, String> responseTemplates) {
        setResponseTemplates(responseTemplates);
        return this;
    }

    public GatewayResponse addResponseTemplatesEntry(String key, String value) {
        if (null == this.responseTemplates) {
            this.responseTemplates = new java.util.HashMap<String, String>();
        }
        if (this.responseTemplates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseTemplates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseTemplates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayResponse clearResponseTemplatesEntries() {
        this.responseTemplates = null;
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether this <a>GatewayResponse</a> is the default gateway response (<code>true</code>
     * ) or not (<code>false</code>). A default gateway response is one generated by API Gateway without any
     * customization by an API developer.
     * </p>
     * 
     * @param defaultResponse
     *        A Boolean flag to indicate whether this <a>GatewayResponse</a> is the default gateway response (
     *        <code>true</code>) or not (<code>false</code>). A default gateway response is one generated by API Gateway
     *        without any customization by an API developer.
     */

    public void setDefaultResponse(Boolean defaultResponse) {
        this.defaultResponse = defaultResponse;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether this <a>GatewayResponse</a> is the default gateway response (<code>true</code>
     * ) or not (<code>false</code>). A default gateway response is one generated by API Gateway without any
     * customization by an API developer.
     * </p>
     * 
     * @return A Boolean flag to indicate whether this <a>GatewayResponse</a> is the default gateway response (
     *         <code>true</code>) or not (<code>false</code>). A default gateway response is one generated by API
     *         Gateway without any customization by an API developer.
     */

    public Boolean getDefaultResponse() {
        return this.defaultResponse;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether this <a>GatewayResponse</a> is the default gateway response (<code>true</code>
     * ) or not (<code>false</code>). A default gateway response is one generated by API Gateway without any
     * customization by an API developer.
     * </p>
     * 
     * @param defaultResponse
     *        A Boolean flag to indicate whether this <a>GatewayResponse</a> is the default gateway response (
     *        <code>true</code>) or not (<code>false</code>). A default gateway response is one generated by API Gateway
     *        without any customization by an API developer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayResponse withDefaultResponse(Boolean defaultResponse) {
        setDefaultResponse(defaultResponse);
        return this;
    }

    /**
     * <p>
     * A Boolean flag to indicate whether this <a>GatewayResponse</a> is the default gateway response (<code>true</code>
     * ) or not (<code>false</code>). A default gateway response is one generated by API Gateway without any
     * customization by an API developer.
     * </p>
     * 
     * @return A Boolean flag to indicate whether this <a>GatewayResponse</a> is the default gateway response (
     *         <code>true</code>) or not (<code>false</code>). A default gateway response is one generated by API
     *         Gateway without any customization by an API developer.
     */

    public Boolean isDefaultResponse() {
        return this.defaultResponse;
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
        if (getResponseType() != null)
            sb.append("ResponseType: ").append(getResponseType()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: ").append(getResponseParameters()).append(",");
        if (getResponseTemplates() != null)
            sb.append("ResponseTemplates: ").append(getResponseTemplates()).append(",");
        if (getDefaultResponse() != null)
            sb.append("DefaultResponse: ").append(getDefaultResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayResponse == false)
            return false;
        GatewayResponse other = (GatewayResponse) obj;
        if (other.getResponseType() == null ^ this.getResponseType() == null)
            return false;
        if (other.getResponseType() != null && other.getResponseType().equals(this.getResponseType()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getResponseTemplates() == null ^ this.getResponseTemplates() == null)
            return false;
        if (other.getResponseTemplates() != null && other.getResponseTemplates().equals(this.getResponseTemplates()) == false)
            return false;
        if (other.getDefaultResponse() == null ^ this.getDefaultResponse() == null)
            return false;
        if (other.getDefaultResponse() != null && other.getDefaultResponse().equals(this.getDefaultResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResponseType() == null) ? 0 : getResponseType().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getResponseTemplates() == null) ? 0 : getResponseTemplates().hashCode());
        hashCode = prime * hashCode + ((getDefaultResponse() == null) ? 0 : getDefaultResponse().hashCode());
        return hashCode;
    }

    @Override
    public GatewayResponse clone() {
        try {
            return (GatewayResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.GatewayResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
