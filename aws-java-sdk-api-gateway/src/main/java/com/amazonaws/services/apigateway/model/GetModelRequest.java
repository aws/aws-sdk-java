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
 * Request to list information about a model in an existing <a>RestApi</a> resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] The name of the model as an identifier.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * A query parameter of a Boolean value to resolve (<code>true</code>) all external model references and returns a
     * flattened model schema or not (<code>false</code>) The default is <code>false</code>.
     * </p>
     */
    private Boolean flatten;

    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     * </p>
     * 
     * @param restApiId
     *        [Required] The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     * </p>
     * 
     * @return [Required] The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     * </p>
     * 
     * @param restApiId
     *        [Required] The <a>RestApi</a> identifier under which the <a>Model</a> exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] The name of the model as an identifier.
     * </p>
     * 
     * @param modelName
     *        [Required] The name of the model as an identifier.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * [Required] The name of the model as an identifier.
     * </p>
     * 
     * @return [Required] The name of the model as an identifier.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * [Required] The name of the model as an identifier.
     * </p>
     * 
     * @param modelName
     *        [Required] The name of the model as an identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelRequest withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * A query parameter of a Boolean value to resolve (<code>true</code>) all external model references and returns a
     * flattened model schema or not (<code>false</code>) The default is <code>false</code>.
     * </p>
     * 
     * @param flatten
     *        A query parameter of a Boolean value to resolve (<code>true</code>) all external model references and
     *        returns a flattened model schema or not (<code>false</code>) The default is <code>false</code>.
     */

    public void setFlatten(Boolean flatten) {
        this.flatten = flatten;
    }

    /**
     * <p>
     * A query parameter of a Boolean value to resolve (<code>true</code>) all external model references and returns a
     * flattened model schema or not (<code>false</code>) The default is <code>false</code>.
     * </p>
     * 
     * @return A query parameter of a Boolean value to resolve (<code>true</code>) all external model references and
     *         returns a flattened model schema or not (<code>false</code>) The default is <code>false</code>.
     */

    public Boolean getFlatten() {
        return this.flatten;
    }

    /**
     * <p>
     * A query parameter of a Boolean value to resolve (<code>true</code>) all external model references and returns a
     * flattened model schema or not (<code>false</code>) The default is <code>false</code>.
     * </p>
     * 
     * @param flatten
     *        A query parameter of a Boolean value to resolve (<code>true</code>) all external model references and
     *        returns a flattened model schema or not (<code>false</code>) The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelRequest withFlatten(Boolean flatten) {
        setFlatten(flatten);
        return this;
    }

    /**
     * <p>
     * A query parameter of a Boolean value to resolve (<code>true</code>) all external model references and returns a
     * flattened model schema or not (<code>false</code>) The default is <code>false</code>.
     * </p>
     * 
     * @return A query parameter of a Boolean value to resolve (<code>true</code>) all external model references and
     *         returns a flattened model schema or not (<code>false</code>) The default is <code>false</code>.
     */

    public Boolean isFlatten() {
        return this.flatten;
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getFlatten() != null)
            sb.append("Flatten: ").append(getFlatten());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetModelRequest == false)
            return false;
        GetModelRequest other = (GetModelRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getFlatten() == null ^ this.getFlatten() == null)
            return false;
        if (other.getFlatten() != null && other.getFlatten().equals(this.getFlatten()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getFlatten() == null) ? 0 : getFlatten().hashCode());
        return hashCode;
    }

    @Override
    public GetModelRequest clone() {
        return (GetModelRequest) super.clone();
    }

}
