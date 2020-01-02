/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.schemas.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/schemas-2019-12-02/UpdateSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSchemaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the client token.
     * </p>
     */
    private String clientTokenId;
    /**
     * <p>
     * The source of the schema definition.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The description of the schema.
     * </p>
     */
    private String description;

    private String registryName;

    private String schemaName;
    /**
     * <p>
     * The schema type for the events schema.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the client token.
     * </p>
     * 
     * @param clientTokenId
     *        The ID of the client token.
     */

    public void setClientTokenId(String clientTokenId) {
        this.clientTokenId = clientTokenId;
    }

    /**
     * <p>
     * The ID of the client token.
     * </p>
     * 
     * @return The ID of the client token.
     */

    public String getClientTokenId() {
        return this.clientTokenId;
    }

    /**
     * <p>
     * The ID of the client token.
     * </p>
     * 
     * @param clientTokenId
     *        The ID of the client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaRequest withClientTokenId(String clientTokenId) {
        setClientTokenId(clientTokenId);
        return this;
    }

    /**
     * <p>
     * The source of the schema definition.
     * </p>
     * 
     * @param content
     *        The source of the schema definition.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The source of the schema definition.
     * </p>
     * 
     * @return The source of the schema definition.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The source of the schema definition.
     * </p>
     * 
     * @param content
     *        The source of the schema definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The description of the schema.
     * </p>
     * 
     * @param description
     *        The description of the schema.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the schema.
     * </p>
     * 
     * @return The description of the schema.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the schema.
     * </p>
     * 
     * @param description
     *        The description of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param registryName
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * @return
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * @param registryName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaRequest withRegistryName(String registryName) {
        setRegistryName(registryName);
        return this;
    }

    /**
     * @param schemaName
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * @return
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * @param schemaName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSchemaRequest withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The schema type for the events schema.
     * </p>
     * 
     * @param type
     *        The schema type for the events schema.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The schema type for the events schema.
     * </p>
     * 
     * @return The schema type for the events schema.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The schema type for the events schema.
     * </p>
     * 
     * @param type
     *        The schema type for the events schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public UpdateSchemaRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The schema type for the events schema.
     * </p>
     * 
     * @param type
     *        The schema type for the events schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public UpdateSchemaRequest withType(Type type) {
        this.type = type.toString();
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
        if (getClientTokenId() != null)
            sb.append("ClientTokenId: ").append(getClientTokenId()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSchemaRequest == false)
            return false;
        UpdateSchemaRequest other = (UpdateSchemaRequest) obj;
        if (other.getClientTokenId() == null ^ this.getClientTokenId() == null)
            return false;
        if (other.getClientTokenId() != null && other.getClientTokenId().equals(this.getClientTokenId()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientTokenId() == null) ? 0 : getClientTokenId().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSchemaRequest clone() {
        return (UpdateSchemaRequest) super.clone();
    }

}
