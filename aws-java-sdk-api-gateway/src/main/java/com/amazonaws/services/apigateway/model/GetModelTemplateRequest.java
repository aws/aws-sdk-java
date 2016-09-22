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
 * Request to generate a sample mapping template used to transform the payload.
 * </p>
 */
public class GetModelTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the <a>RestApi</a> under which the model exists.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the model for which to generate a template.
     * </p>
     */
    private String modelName;

    /**
     * <p>
     * The ID of the <a>RestApi</a> under which the model exists.
     * </p>
     * 
     * @param restApiId
     *        The ID of the <a>RestApi</a> under which the model exists.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The ID of the <a>RestApi</a> under which the model exists.
     * </p>
     * 
     * @return The ID of the <a>RestApi</a> under which the model exists.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The ID of the <a>RestApi</a> under which the model exists.
     * </p>
     * 
     * @param restApiId
     *        The ID of the <a>RestApi</a> under which the model exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelTemplateRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the model for which to generate a template.
     * </p>
     * 
     * @param modelName
     *        The name of the model for which to generate a template.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model for which to generate a template.
     * </p>
     * 
     * @return The name of the model for which to generate a template.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model for which to generate a template.
     * </p>
     * 
     * @param modelName
     *        The name of the model for which to generate a template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelTemplateRequest withModelName(String modelName) {
        setModelName(modelName);
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
        if (getModelName() != null)
            sb.append("ModelName: " + getModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetModelTemplateRequest == false)
            return false;
        GetModelTemplateRequest other = (GetModelTemplateRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        return hashCode;
    }

    @Override
    public GetModelTemplateRequest clone() {
        return (GetModelTemplateRequest) super.clone();
    }
}
