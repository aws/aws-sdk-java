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
 * Represents a method response of a given HTTP status code returned to the client. The method response is passed from
 * the back end through the associated integration response that can be transformed using a mapping template.
 * </p>
 * <div class="remarks">
 * <p/>
 * <h4>Example: A <b>MethodResponse</b> instance of an API</h4>
 * <h5>Request</h5>
 * <p>
 * The example request retrieves a <b>MethodResponse</b> of the 200 status code.
 * </p>
 * 
 * <pre>
 * <code>GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160603T222952Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160603/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}</code>
 * </pre>
 * 
 * <h5>Response</h5>
 * <p>
 * The successful response returns <code>200 OK</code> status and a payload as follows:
 * </p>
 * 
 * <pre>
 * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.Content-Type": false }, "statusCode": "200" }</code>
 * </pre>
 * <p/>
 * </div> <div class="seeAlso"> <a>Method</a>, <a>IntegrationResponse</a>, <a>Integration</a> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an API</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MethodResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The method response's status code.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * A key-value map specifying required or optional response parameters that API Gateway can send back to the caller.
     * A key defines a method response header and the value specifies whether the associated method response header is
     * required or not. The expression of the key must match the pattern <code>method.response.header.{name}</code>,
     * where <code>name</code> is a valid and unique header name. API Gateway passes certain integration response data
     * to the method response headers specified here according to the mapping you prescribe in the API's
     * <a>IntegrationResponse</a>. The integration response data that can be mapped include an integration response
     * header expressed in <code>integration.response.header.{name}</code>, a static value enclosed within a pair of
     * single quotes (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response payload in
     * the form of <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a
     * valid JSON expression without the <code>$</code> prefix.)
     * </p>
     */
    private java.util.Map<String, Boolean> responseParameters;
    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's content-type. Response models are represented as a
     * key/value map, with a content-type as the key and a <a>Model</a> name as the value.
     * </p>
     */
    private java.util.Map<String, String> responseModels;

    /**
     * <p>
     * The method response's status code.
     * </p>
     * 
     * @param statusCode
     *        The method response's status code.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The method response's status code.
     * </p>
     * 
     * @return The method response's status code.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The method response's status code.
     * </p>
     * 
     * @param statusCode
     *        The method response's status code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodResponse withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that API Gateway can send back to the caller.
     * A key defines a method response header and the value specifies whether the associated method response header is
     * required or not. The expression of the key must match the pattern <code>method.response.header.{name}</code>,
     * where <code>name</code> is a valid and unique header name. API Gateway passes certain integration response data
     * to the method response headers specified here according to the mapping you prescribe in the API's
     * <a>IntegrationResponse</a>. The integration response data that can be mapped include an integration response
     * header expressed in <code>integration.response.header.{name}</code>, a static value enclosed within a pair of
     * single quotes (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response payload in
     * the form of <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a
     * valid JSON expression without the <code>$</code> prefix.)
     * </p>
     * 
     * @return A key-value map specifying required or optional response parameters that API Gateway can send back to the
     *         caller. A key defines a method response header and the value specifies whether the associated method
     *         response header is required or not. The expression of the key must match the pattern
     *         <code>method.response.header.{name}</code>, where <code>name</code> is a valid and unique header name.
     *         API Gateway passes certain integration response data to the method response headers specified here
     *         according to the mapping you prescribe in the API's <a>IntegrationResponse</a>. The integration response
     *         data that can be mapped include an integration response header expressed in
     *         <code>integration.response.header.{name}</code>, a static value enclosed within a pair of single quotes
     *         (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response payload in the
     *         form of <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a
     *         valid JSON expression without the <code>$</code> prefix.)
     */

    public java.util.Map<String, Boolean> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that API Gateway can send back to the caller.
     * A key defines a method response header and the value specifies whether the associated method response header is
     * required or not. The expression of the key must match the pattern <code>method.response.header.{name}</code>,
     * where <code>name</code> is a valid and unique header name. API Gateway passes certain integration response data
     * to the method response headers specified here according to the mapping you prescribe in the API's
     * <a>IntegrationResponse</a>. The integration response data that can be mapped include an integration response
     * header expressed in <code>integration.response.header.{name}</code>, a static value enclosed within a pair of
     * single quotes (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response payload in
     * the form of <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a
     * valid JSON expression without the <code>$</code> prefix.)
     * </p>
     * 
     * @param responseParameters
     *        A key-value map specifying required or optional response parameters that API Gateway can send back to the
     *        caller. A key defines a method response header and the value specifies whether the associated method
     *        response header is required or not. The expression of the key must match the pattern
     *        <code>method.response.header.{name}</code>, where <code>name</code> is a valid and unique header name. API
     *        Gateway passes certain integration response data to the method response headers specified here according
     *        to the mapping you prescribe in the API's <a>IntegrationResponse</a>. The integration response data that
     *        can be mapped include an integration response header expressed in
     *        <code>integration.response.header.{name}</code>, a static value enclosed within a pair of single quotes
     *        (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response payload in the
     *        form of <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a
     *        valid JSON expression without the <code>$</code> prefix.)
     */

    public void setResponseParameters(java.util.Map<String, Boolean> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying required or optional response parameters that API Gateway can send back to the caller.
     * A key defines a method response header and the value specifies whether the associated method response header is
     * required or not. The expression of the key must match the pattern <code>method.response.header.{name}</code>,
     * where <code>name</code> is a valid and unique header name. API Gateway passes certain integration response data
     * to the method response headers specified here according to the mapping you prescribe in the API's
     * <a>IntegrationResponse</a>. The integration response data that can be mapped include an integration response
     * header expressed in <code>integration.response.header.{name}</code>, a static value enclosed within a pair of
     * single quotes (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response payload in
     * the form of <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a
     * valid JSON expression without the <code>$</code> prefix.)
     * </p>
     * 
     * @param responseParameters
     *        A key-value map specifying required or optional response parameters that API Gateway can send back to the
     *        caller. A key defines a method response header and the value specifies whether the associated method
     *        response header is required or not. The expression of the key must match the pattern
     *        <code>method.response.header.{name}</code>, where <code>name</code> is a valid and unique header name. API
     *        Gateway passes certain integration response data to the method response headers specified here according
     *        to the mapping you prescribe in the API's <a>IntegrationResponse</a>. The integration response data that
     *        can be mapped include an integration response header expressed in
     *        <code>integration.response.header.{name}</code>, a static value enclosed within a pair of single quotes
     *        (e.g., <code>'application/json'</code>), or a JSON expression from the back-end response payload in the
     *        form of <code>integration.response.body.{JSON-expression}</code>, where <code>JSON-expression</code> is a
     *        valid JSON expression without the <code>$</code> prefix.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodResponse withResponseParameters(java.util.Map<String, Boolean> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    public MethodResponse addResponseParametersEntry(String key, Boolean value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, Boolean>();
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

    public MethodResponse clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's content-type. Response models are represented as a
     * key/value map, with a content-type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @return Specifies the <a>Model</a> resources used for the response's content-type. Response models are
     *         represented as a key/value map, with a content-type as the key and a <a>Model</a> name as the value.
     */

    public java.util.Map<String, String> getResponseModels() {
        return responseModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's content-type. Response models are represented as a
     * key/value map, with a content-type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param responseModels
     *        Specifies the <a>Model</a> resources used for the response's content-type. Response models are represented
     *        as a key/value map, with a content-type as the key and a <a>Model</a> name as the value.
     */

    public void setResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's content-type. Response models are represented as a
     * key/value map, with a content-type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param responseModels
     *        Specifies the <a>Model</a> resources used for the response's content-type. Response models are represented
     *        as a key/value map, with a content-type as the key and a <a>Model</a> name as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodResponse withResponseModels(java.util.Map<String, String> responseModels) {
        setResponseModels(responseModels);
        return this;
    }

    public MethodResponse addResponseModelsEntry(String key, String value) {
        if (null == this.responseModels) {
            this.responseModels = new java.util.HashMap<String, String>();
        }
        if (this.responseModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.responseModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseModels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MethodResponse clearResponseModelsEntries() {
        this.responseModels = null;
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
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: ").append(getResponseParameters()).append(",");
        if (getResponseModels() != null)
            sb.append("ResponseModels: ").append(getResponseModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MethodResponse == false)
            return false;
        MethodResponse other = (MethodResponse) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getResponseModels() == null ^ this.getResponseModels() == null)
            return false;
        if (other.getResponseModels() != null && other.getResponseModels().equals(this.getResponseModels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getResponseModels() == null) ? 0 : getResponseModels().hashCode());
        return hashCode;
    }

    @Override
    public MethodResponse clone() {
        try {
            return (MethodResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigateway.model.transform.MethodResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
