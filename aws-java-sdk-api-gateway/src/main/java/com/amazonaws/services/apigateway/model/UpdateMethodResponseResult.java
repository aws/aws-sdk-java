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
 * Represents a method response. Amazon API Gateway sends back the status code
 * to the caller as the HTTP status code. Parameters and models can be used to
 * transform the response from the method's integration.
 * </p>
 */
public class UpdateMethodResponseResult implements Serializable, Cloneable {

    /**
     * <p>
     * The method response's status code.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * Represents response parameters that can be sent back to the caller by
     * Amazon API Gateway. Response parameters are represented as a key/value
     * map, with a destination as the key and a boolean flag as the value, which
     * is used to specify whether the parameter is required. A destination must
     * match the pattern <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid, unique header name. Destinations specified
     * here are available to the integration for mapping from integration
     * response parameters.
     * </p>
     */
    private java.util.Map<String, Boolean> responseParameters;
    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's
     * content-type. Response models are represented as a key/value map, with a
     * content-type as the key and a <a>Model</a> name as the value.
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateMethodResponseResult withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * Represents response parameters that can be sent back to the caller by
     * Amazon API Gateway. Response parameters are represented as a key/value
     * map, with a destination as the key and a boolean flag as the value, which
     * is used to specify whether the parameter is required. A destination must
     * match the pattern <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid, unique header name. Destinations specified
     * here are available to the integration for mapping from integration
     * response parameters.
     * </p>
     * 
     * @return Represents response parameters that can be sent back to the
     *         caller by Amazon API Gateway. Response parameters are represented
     *         as a key/value map, with a destination as the key and a boolean
     *         flag as the value, which is used to specify whether the parameter
     *         is required. A destination must match the pattern
     *         <code>method.response.header.{name}</code>, where
     *         <code>name</code> is a valid, unique header name. Destinations
     *         specified here are available to the integration for mapping from
     *         integration response parameters.
     */
    public java.util.Map<String, Boolean> getResponseParameters() {
        return responseParameters;
    }

    /**
     * <p>
     * Represents response parameters that can be sent back to the caller by
     * Amazon API Gateway. Response parameters are represented as a key/value
     * map, with a destination as the key and a boolean flag as the value, which
     * is used to specify whether the parameter is required. A destination must
     * match the pattern <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid, unique header name. Destinations specified
     * here are available to the integration for mapping from integration
     * response parameters.
     * </p>
     * 
     * @param responseParameters
     *        Represents response parameters that can be sent back to the caller
     *        by Amazon API Gateway. Response parameters are represented as a
     *        key/value map, with a destination as the key and a boolean flag as
     *        the value, which is used to specify whether the parameter is
     *        required. A destination must match the pattern
     *        <code>method.response.header.{name}</code>, where
     *        <code>name</code> is a valid, unique header name. Destinations
     *        specified here are available to the integration for mapping from
     *        integration response parameters.
     */
    public void setResponseParameters(
            java.util.Map<String, Boolean> responseParameters) {
        this.responseParameters = responseParameters;
    }

    /**
     * <p>
     * Represents response parameters that can be sent back to the caller by
     * Amazon API Gateway. Response parameters are represented as a key/value
     * map, with a destination as the key and a boolean flag as the value, which
     * is used to specify whether the parameter is required. A destination must
     * match the pattern <code>method.response.header.{name}</code>, where
     * <code>name</code> is a valid, unique header name. Destinations specified
     * here are available to the integration for mapping from integration
     * response parameters.
     * </p>
     * 
     * @param responseParameters
     *        Represents response parameters that can be sent back to the caller
     *        by Amazon API Gateway. Response parameters are represented as a
     *        key/value map, with a destination as the key and a boolean flag as
     *        the value, which is used to specify whether the parameter is
     *        required. A destination must match the pattern
     *        <code>method.response.header.{name}</code>, where
     *        <code>name</code> is a valid, unique header name. Destinations
     *        specified here are available to the integration for mapping from
     *        integration response parameters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateMethodResponseResult withResponseParameters(
            java.util.Map<String, Boolean> responseParameters) {
        setResponseParameters(responseParameters);
        return this;
    }

    public UpdateMethodResponseResult addResponseParametersEntry(String key,
            Boolean value) {
        if (null == this.responseParameters) {
            this.responseParameters = new java.util.HashMap<String, Boolean>();
        }
        if (this.responseParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.responseParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseParameters. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public UpdateMethodResponseResult clearResponseParametersEntries() {
        this.responseParameters = null;
        return this;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's
     * content-type. Response models are represented as a key/value map, with a
     * content-type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @return Specifies the <a>Model</a> resources used for the response's
     *         content-type. Response models are represented as a key/value map,
     *         with a content-type as the key and a <a>Model</a> name as the
     *         value.
     */
    public java.util.Map<String, String> getResponseModels() {
        return responseModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's
     * content-type. Response models are represented as a key/value map, with a
     * content-type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param responseModels
     *        Specifies the <a>Model</a> resources used for the response's
     *        content-type. Response models are represented as a key/value map,
     *        with a content-type as the key and a <a>Model</a> name as the
     *        value.
     */
    public void setResponseModels(java.util.Map<String, String> responseModels) {
        this.responseModels = responseModels;
    }

    /**
     * <p>
     * Specifies the <a>Model</a> resources used for the response's
     * content-type. Response models are represented as a key/value map, with a
     * content-type as the key and a <a>Model</a> name as the value.
     * </p>
     * 
     * @param responseModels
     *        Specifies the <a>Model</a> resources used for the response's
     *        content-type. Response models are represented as a key/value map,
     *        with a content-type as the key and a <a>Model</a> name as the
     *        value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public UpdateMethodResponseResult withResponseModels(
            java.util.Map<String, String> responseModels) {
        setResponseModels(responseModels);
        return this;
    }

    public UpdateMethodResponseResult addResponseModelsEntry(String key,
            String value) {
        if (null == this.responseModels) {
            this.responseModels = new java.util.HashMap<String, String>();
        }
        if (this.responseModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.responseModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResponseModels. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */
    public UpdateMethodResponseResult clearResponseModelsEntries() {
        this.responseModels = null;
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
        if (getStatusCode() != null)
            sb.append("StatusCode: " + getStatusCode() + ",");
        if (getResponseParameters() != null)
            sb.append("ResponseParameters: " + getResponseParameters() + ",");
        if (getResponseModels() != null)
            sb.append("ResponseModels: " + getResponseModels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMethodResponseResult == false)
            return false;
        UpdateMethodResponseResult other = (UpdateMethodResponseResult) obj;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null
                && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getResponseParameters() == null
                ^ this.getResponseParameters() == null)
            return false;
        if (other.getResponseParameters() != null
                && other.getResponseParameters().equals(
                        this.getResponseParameters()) == false)
            return false;
        if (other.getResponseModels() == null
                ^ this.getResponseModels() == null)
            return false;
        if (other.getResponseModels() != null
                && other.getResponseModels().equals(this.getResponseModels()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseParameters() == null) ? 0
                        : getResponseParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getResponseModels() == null) ? 0 : getResponseModels()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateMethodResponseResult clone() {
        try {
            return (UpdateMethodResponseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}