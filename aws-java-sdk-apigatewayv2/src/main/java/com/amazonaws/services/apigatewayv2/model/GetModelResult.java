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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The content-type for the model, for example, "application/json".
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The description of the model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The model identifier.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * The name of the model. Must be alphanumeric.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
     * </p>
     */
    private String schema;

    /**
     * <p>
     * The content-type for the model, for example, "application/json".
     * </p>
     * 
     * @param contentType
     *        The content-type for the model, for example, "application/json".
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content-type for the model, for example, "application/json".
     * </p>
     * 
     * @return The content-type for the model, for example, "application/json".
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content-type for the model, for example, "application/json".
     * </p>
     * 
     * @param contentType
     *        The content-type for the model, for example, "application/json".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelResult withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     * 
     * @param description
     *        The description of the model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     * 
     * @return The description of the model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the model.
     * </p>
     * 
     * @param description
     *        The description of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The model identifier.
     * </p>
     * 
     * @param modelId
     *        The model identifier.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The model identifier.
     * </p>
     * 
     * @return The model identifier.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The model identifier.
     * </p>
     * 
     * @param modelId
     *        The model identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelResult withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The name of the model. Must be alphanumeric.
     * </p>
     * 
     * @param name
     *        The name of the model. Must be alphanumeric.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the model. Must be alphanumeric.
     * </p>
     * 
     * @return The name of the model. Must be alphanumeric.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the model. Must be alphanumeric.
     * </p>
     * 
     * @param name
     *        The name of the model. Must be alphanumeric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
     * </p>
     * 
     * @param schema
     *        The schema for the model. For application/json models, this should be JSON schema draft 4 model.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
     * </p>
     * 
     * @return The schema for the model. For application/json models, this should be JSON schema draft 4 model.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
     * </p>
     * 
     * @param schema
     *        The schema for the model. For application/json models, this should be JSON schema draft 4 model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetModelResult withSchema(String schema) {
        setSchema(schema);
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
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetModelResult == false)
            return false;
        GetModelResult other = (GetModelResult) obj;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        return hashCode;
    }

    @Override
    public GetModelResult clone() {
        try {
            return (GetModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
