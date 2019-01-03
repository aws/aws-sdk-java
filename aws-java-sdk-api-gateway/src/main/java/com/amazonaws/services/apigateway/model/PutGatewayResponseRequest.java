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
 * Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the given
 * <a>RestApi</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutGatewayResponseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required]
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
     * </p>
     */
    private String responseType;
    /** The HTTP status code of the <a>GatewayResponse</a>. */
    private String statusCode;
    /**
     * <p>
     * <p>
     * Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string map of
     * key-value pairs.
     * </p>
     * </p>
     */
    private java.util.Map<String, String> responseParameters;
    /**
     * <p>
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     * </p>
     */
    private java.util.Map<String, String> responseTemplates;

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

    public PutGatewayResponseRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required]
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
     * </p>
     * 
     * @param responseType
     *        [Required]
     *        <p>
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
     *        </p>
     * @see GatewayResponseType
     */

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    /**
     * <p>
     * [Required]
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
     * </p>
     * 
     * @return [Required]
     *         <p>
     *         The response type of the associated <a>GatewayResponse</a>. Valid values are
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
     *         </p>
     * @see GatewayResponseType
     */

    public String getResponseType() {
        return this.responseType;
    }

    /**
     * <p>
     * [Required]
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
     * </p>
     * 
     * @param responseType
     *        [Required]
     *        <p>
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
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayResponseType
     */

    public PutGatewayResponseRequest withResponseType(String responseType) {
        setResponseType(responseType);
        return this;
    }

    /**
     * <p>
     * [Required]
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
     * </p>
     * 
     * @param responseType
     *        [Required]
     *        <p>
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
     *        </p>
     * @see GatewayResponseType
     */

    public void setResponseType(GatewayResponseType responseType) {
        withResponseType(responseType);
    }

    /**
     * <p>
     * [Required]
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
     * </p>
     * 
     * @param responseType
     *        [Required]
     *        <p>
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
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GatewayResponseType
     */

    public PutGatewayResponseRequest withResponseType(GatewayResponseType responseType) {
        this.responseType = responseType.toString();
        return this;
    }

    /**
     * The HTTP status code of the <a>GatewayResponse</a>.
     * 
     * @param statusCode
     *        The HTTP status code of the <a>GatewayResponse</a>.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * The HTTP status code of the <a>GatewayResponse</a>.
     * 
     * @return The HTTP status code of the <a>GatewayResponse</a>.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * The HTTP status code of the <a>GatewayResponse</a>.
     * 
     * @param statusCode
     *        The HTTP status code of the <a>GatewayResponse</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGatewayResponseRequest withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * <p>
     * Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string map of
     * key-value pairs.
     * </p>
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
     * <p>
     * Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string map of
     * key-value pairs.
     * </p>
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
     * <p>
     * Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string map of
     * key-value pairs.
     * </p>
     * </p>
     * 
     * @param responseParameters
     *        Response parameters (paths, query strings and headers) of the <a>GatewayResponse</a> as a string-to-string
     *        map of key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGatewayResponseRequest withResponseParameters(java.util.Map<String, String> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    public PutGatewayResponseRequest addResponseParametersEntry(String key, String value) {
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

    public PutGatewayResponseRequest clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     * </p>
     * 
     * @return Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     */

    public java.util.Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * <p>
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
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
     * <p>
     * Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * </p>
     * </p>
     * 
     * @param responseTemplates
     *        Response templates of the <a>GatewayResponse</a> as a string-to-string map of key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGatewayResponseRequest withResponseTemplates(java.util.Map<String, String> responseTemplates) {
        setResponseTemplates(responseTemplates);
        return this;
    }

    public PutGatewayResponseRequest addResponseTemplatesEntry(String key, String value) {
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

    public PutGatewayResponseRequest clearResponseTemplatesEntries() {
        this.responseTemplates = null;
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
        if (getResponseType() != null)
            sb.append("ResponseType: ").append(getResponseType()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: ").append(getResponseParameters()).append(",");
        if (getResponseTemplates() != null)
            sb.append("ResponseTemplates: ").append(getResponseTemplates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutGatewayResponseRequest == false)
            return false;
        PutGatewayResponseRequest other = (PutGatewayResponseRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getResponseType() == null) ? 0 : getResponseType().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getResponseTemplates() == null) ? 0 : getResponseTemplates().hashCode());
        return hashCode;
    }

    @Override
    public PutGatewayResponseRequest clone() {
        return (PutGatewayResponseRequest) super.clone();
    }

}
