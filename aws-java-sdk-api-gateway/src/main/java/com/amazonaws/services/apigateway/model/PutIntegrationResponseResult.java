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
 * Represents an integration response. The status code must map to an existing <a>MethodResponse</a>, and parameters and
 * templates can be used to transform the back-end response.
 * </p>
 * <div class="seeAlso"> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html">Creating an API</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutIntegrationResponseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to an existing <a>MethodResponse</a>.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an integration response based on the response
     * from the back end. For example, if the success response returns nothing and the error response returns some
     * string, you could use the <code>.+</code> regex to match error response. However, make sure that the error
     * response does not contain any newline (<code>\n</code>) character in such cases. If the back end is an AWS Lambda
     * function, the AWS Lambda function error header is matched. For all other HTTP and AWS back ends, the HTTP status
     * code is matched.
     * </p>
     */
    private String selectionPattern;
    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the back end. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a
     * valid and unique header name. The mapped non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or <code>integration.response.body.{JSON-expression}</code>,
     * where <code>name</code> is a valid and unique response header name and <code>JSON-expression</code> is a valid
     * JSON expression without the <code>$</code> prefix.
     * </p>
     */
    private java.util.Map<String, String> responseParameters;
    /**
     * <p>
     * Specifies the templates used to transform the integration response body. Response templates are represented as a
     * key/value map, with a content-type as the key and a template as the value.
     * </p>
     */
    private java.util.Map<String, String> responseTemplates;
    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     */
    private String contentHandling;

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to an existing <a>MethodResponse</a>.
     * </p>
     * 
     * @param statusCode
     *        Specifies the status code that is used to map the integration response to an existing
     *        <a>MethodResponse</a>.
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to an existing <a>MethodResponse</a>.
     * </p>
     * 
     * @return Specifies the status code that is used to map the integration response to an existing
     *         <a>MethodResponse</a>.
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * Specifies the status code that is used to map the integration response to an existing <a>MethodResponse</a>.
     * </p>
     * 
     * @param statusCode
     *        Specifies the status code that is used to map the integration response to an existing
     *        <a>MethodResponse</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseResult withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an integration response based on the response
     * from the back end. For example, if the success response returns nothing and the error response returns some
     * string, you could use the <code>.+</code> regex to match error response. However, make sure that the error
     * response does not contain any newline (<code>\n</code>) character in such cases. If the back end is an AWS Lambda
     * function, the AWS Lambda function error header is matched. For all other HTTP and AWS back ends, the HTTP status
     * code is matched.
     * </p>
     * 
     * @param selectionPattern
     *        Specifies the regular expression (regex) pattern used to choose an integration response based on the
     *        response from the back end. For example, if the success response returns nothing and the error response
     *        returns some string, you could use the <code>.+</code> regex to match error response. However, make sure
     *        that the error response does not contain any newline (<code>\n</code>) character in such cases. If the
     *        back end is an AWS Lambda function, the AWS Lambda function error header is matched. For all other HTTP
     *        and AWS back ends, the HTTP status code is matched.
     */

    public void setSelectionPattern(String selectionPattern) {
        this.selectionPattern = selectionPattern;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an integration response based on the response
     * from the back end. For example, if the success response returns nothing and the error response returns some
     * string, you could use the <code>.+</code> regex to match error response. However, make sure that the error
     * response does not contain any newline (<code>\n</code>) character in such cases. If the back end is an AWS Lambda
     * function, the AWS Lambda function error header is matched. For all other HTTP and AWS back ends, the HTTP status
     * code is matched.
     * </p>
     * 
     * @return Specifies the regular expression (regex) pattern used to choose an integration response based on the
     *         response from the back end. For example, if the success response returns nothing and the error response
     *         returns some string, you could use the <code>.+</code> regex to match error response. However, make sure
     *         that the error response does not contain any newline (<code>\n</code>) character in such cases. If the
     *         back end is an AWS Lambda function, the AWS Lambda function error header is matched. For all other HTTP
     *         and AWS back ends, the HTTP status code is matched.
     */

    public String getSelectionPattern() {
        return this.selectionPattern;
    }

    /**
     * <p>
     * Specifies the regular expression (regex) pattern used to choose an integration response based on the response
     * from the back end. For example, if the success response returns nothing and the error response returns some
     * string, you could use the <code>.+</code> regex to match error response. However, make sure that the error
     * response does not contain any newline (<code>\n</code>) character in such cases. If the back end is an AWS Lambda
     * function, the AWS Lambda function error header is matched. For all other HTTP and AWS back ends, the HTTP status
     * code is matched.
     * </p>
     * 
     * @param selectionPattern
     *        Specifies the regular expression (regex) pattern used to choose an integration response based on the
     *        response from the back end. For example, if the success response returns nothing and the error response
     *        returns some string, you could use the <code>.+</code> regex to match error response. However, make sure
     *        that the error response does not contain any newline (<code>\n</code>) character in such cases. If the
     *        back end is an AWS Lambda function, the AWS Lambda function error header is matched. For all other HTTP
     *        and AWS back ends, the HTTP status code is matched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseResult withSelectionPattern(String selectionPattern) {
        setSelectionPattern(selectionPattern);
        return this;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the back end. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a
     * valid and unique header name. The mapped non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or <code>integration.response.body.{JSON-expression}</code>,
     * where <code>name</code> is a valid and unique response header name and <code>JSON-expression</code> is a valid
     * JSON expression without the <code>$</code> prefix.
     * </p>
     * 
     * @return A key-value map specifying response parameters that are passed to the method response from the back end.
     *         The key is a method response header parameter name and the mapped value is an integration response header
     *         value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration
     *         response body. The mapping key must match the pattern of <code>method.response.header.{name}</code>,
     *         where <code>name</code> is a valid and unique header name. The mapped non-static value must match the
     *         pattern of <code>integration.response.header.{name}</code> or
     *         <code>integration.response.body.{JSON-expression}</code>, where <code>name</code> is a valid and unique
     *         response header name and <code>JSON-expression</code> is a valid JSON expression without the
     *         <code>$</code> prefix.
     */

    public java.util.Map<String, String> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the back end. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a
     * valid and unique header name. The mapped non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or <code>integration.response.body.{JSON-expression}</code>,
     * where <code>name</code> is a valid and unique response header name and <code>JSON-expression</code> is a valid
     * JSON expression without the <code>$</code> prefix.
     * </p>
     * 
     * @param responseParameters
     *        A key-value map specifying response parameters that are passed to the method response from the back end.
     *        The key is a method response header parameter name and the mapped value is an integration response header
     *        value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration
     *        response body. The mapping key must match the pattern of <code>method.response.header.{name}</code>, where
     *        <code>name</code> is a valid and unique header name. The mapped non-static value must match the pattern of
     *        <code>integration.response.header.{name}</code> or
     *        <code>integration.response.body.{JSON-expression}</code>, where <code>name</code> is a valid and unique
     *        response header name and <code>JSON-expression</code> is a valid JSON expression without the
     *        <code>$</code> prefix.
     */

    public void setResponseParameters(java.util.Map<String, String> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * A key-value map specifying response parameters that are passed to the method response from the back end. The key
     * is a method response header parameter name and the mapped value is an integration response header value, a static
     * value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The
     * mapping key must match the pattern of <code>method.response.header.{name}</code>, where <code>name</code> is a
     * valid and unique header name. The mapped non-static value must match the pattern of
     * <code>integration.response.header.{name}</code> or <code>integration.response.body.{JSON-expression}</code>,
     * where <code>name</code> is a valid and unique response header name and <code>JSON-expression</code> is a valid
     * JSON expression without the <code>$</code> prefix.
     * </p>
     * 
     * @param responseParameters
     *        A key-value map specifying response parameters that are passed to the method response from the back end.
     *        The key is a method response header parameter name and the mapped value is an integration response header
     *        value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration
     *        response body. The mapping key must match the pattern of <code>method.response.header.{name}</code>, where
     *        <code>name</code> is a valid and unique header name. The mapped non-static value must match the pattern of
     *        <code>integration.response.header.{name}</code> or
     *        <code>integration.response.body.{JSON-expression}</code>, where <code>name</code> is a valid and unique
     *        response header name and <code>JSON-expression</code> is a valid JSON expression without the
     *        <code>$</code> prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseResult withResponseParameters(java.util.Map<String, String> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    public PutIntegrationResponseResult addResponseParametersEntry(String key, String value) {
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

    public PutIntegrationResponseResult clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the templates used to transform the integration response body. Response templates are represented as a
     * key/value map, with a content-type as the key and a template as the value.
     * </p>
     * 
     * @return Specifies the templates used to transform the integration response body. Response templates are
     *         represented as a key/value map, with a content-type as the key and a template as the value.
     */

    public java.util.Map<String, String> getResponseTemplates() {
        return responseTemplates;
    }

    /**
     * <p>
     * Specifies the templates used to transform the integration response body. Response templates are represented as a
     * key/value map, with a content-type as the key and a template as the value.
     * </p>
     * 
     * @param responseTemplates
     *        Specifies the templates used to transform the integration response body. Response templates are
     *        represented as a key/value map, with a content-type as the key and a template as the value.
     */

    public void setResponseTemplates(java.util.Map<String, String> responseTemplates) {
        this.responseTemplates = responseTemplates;
    }

    /**
     * <p>
     * Specifies the templates used to transform the integration response body. Response templates are represented as a
     * key/value map, with a content-type as the key and a template as the value.
     * </p>
     * 
     * @param responseTemplates
     *        Specifies the templates used to transform the integration response body. Response templates are
     *        represented as a key/value map, with a content-type as the key and a template as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutIntegrationResponseResult withResponseTemplates(java.util.Map<String, String> responseTemplates) {
        setResponseTemplates(responseTemplates);
        return this;
    }

    public PutIntegrationResponseResult addResponseTemplatesEntry(String key, String value) {
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

    public PutIntegrationResponseResult clearResponseTemplatesEntries() {
        this.responseTemplates = null;
        return this;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle response payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the method response without modification.
     * @see ContentHandlingStrategy
     */

    public void setContentHandling(String contentHandling) {
        this.contentHandling = contentHandling;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     * 
     * @return Specifies how to handle response payload content type conversions. Supported values are
     *         <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the
     *         corresponding binary blob.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If this property is not defined, the response payload will be passed through from the integration
     *         response to the method response without modification.
     * @see ContentHandlingStrategy
     */

    public String getContentHandling() {
        return this.contentHandling;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle response payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the method response without modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public PutIntegrationResponseResult withContentHandling(String contentHandling) {
        setContentHandling(contentHandling);
        return this;
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle response payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the method response without modification.
     * @see ContentHandlingStrategy
     */

    public void setContentHandling(ContentHandlingStrategy contentHandling) {
        withContentHandling(contentHandling);
    }

    /**
     * <p>
     * Specifies how to handle response payload content type conversions. Supported values are
     * <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the corresponding
     * binary blob.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If this property is not defined, the response payload will be passed through from the integration response to the
     * method response without modification.
     * </p>
     * 
     * @param contentHandling
     *        Specifies how to handle response payload content type conversions. Supported values are
     *        <code>CONVERT_TO_BINARY</code> and <code>CONVERT_TO_TEXT</code>, with the following behaviors:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_BINARY</code>: Converts a response payload from a Base64-encoded string to the
     *        corresponding binary blob.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONVERT_TO_TEXT</code>: Converts a response payload from a binary blob to a Base64-encoded string.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If this property is not defined, the response payload will be passed through from the integration response
     *        to the method response without modification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentHandlingStrategy
     */

    public PutIntegrationResponseResult withContentHandling(ContentHandlingStrategy contentHandling) {
        this.contentHandling = contentHandling.toString();
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
        if (getSelectionPattern() != null)
            sb.append("SelectionPattern: ").append(getSelectionPattern()).append(",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: ").append(getResponseParameters()).append(",");
        if (getResponseTemplates() != null)
            sb.append("ResponseTemplates: ").append(getResponseTemplates()).append(",");
        if (getContentHandling() != null)
            sb.append("ContentHandling: ").append(getContentHandling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutIntegrationResponseResult == false)
            return false;
        PutIntegrationResponseResult other = (PutIntegrationResponseResult) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getSelectionPattern() == null ^ this.getSelectionPattern() == null)
            return false;
        if (other.getSelectionPattern() != null && other.getSelectionPattern().equals(this.getSelectionPattern()) == false)
            return false;
        if (other.getResponseParameters() == null ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null && other.getResponseParameters().equals(this.getResponseParameters()) == false)
            return false;
        if (other.getResponseTemplates() == null ^ this.getResponseTemplates() == null)
            return false;
        if (other.getResponseTemplates() != null && other.getResponseTemplates().equals(this.getResponseTemplates()) == false)
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

        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getSelectionPattern() == null) ? 0 : getSelectionPattern().hashCode());
        hashCode = prime * hashCode + ((getResponseParameters() == null) ? 0 : getResponseParameters().hashCode());
        hashCode = prime * hashCode + ((getResponseTemplates() == null) ? 0 : getResponseTemplates().hashCode());
        hashCode = prime * hashCode + ((getContentHandling() == null) ? 0 : getContentHandling().hashCode());
        return hashCode;
    }

    @Override
    public PutIntegrationResponseResult clone() {
        try {
            return (PutIntegrationResponseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
