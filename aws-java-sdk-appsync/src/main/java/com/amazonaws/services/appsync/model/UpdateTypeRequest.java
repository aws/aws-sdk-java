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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The new type name.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The new definition.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The new type format: SDL or JSON.
     * </p>
     */
    private String format;

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @return The API ID.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTypeRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The new type name.
     * </p>
     * 
     * @param typeName
     *        The new type name.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The new type name.
     * </p>
     * 
     * @return The new type name.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The new type name.
     * </p>
     * 
     * @param typeName
     *        The new type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTypeRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The new definition.
     * </p>
     * 
     * @param definition
     *        The new definition.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The new definition.
     * </p>
     * 
     * @return The new definition.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The new definition.
     * </p>
     * 
     * @param definition
     *        The new definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTypeRequest withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The new type format: SDL or JSON.
     * </p>
     * 
     * @param format
     *        The new type format: SDL or JSON.
     * @see TypeDefinitionFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The new type format: SDL or JSON.
     * </p>
     * 
     * @return The new type format: SDL or JSON.
     * @see TypeDefinitionFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The new type format: SDL or JSON.
     * </p>
     * 
     * @param format
     *        The new type format: SDL or JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypeDefinitionFormat
     */

    public UpdateTypeRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The new type format: SDL or JSON.
     * </p>
     * 
     * @param format
     *        The new type format: SDL or JSON.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypeDefinitionFormat
     */

    public UpdateTypeRequest withFormat(TypeDefinitionFormat format) {
        this.format = format.toString();
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTypeRequest == false)
            return false;
        UpdateTypeRequest other = (UpdateTypeRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTypeRequest clone() {
        return (UpdateTypeRequest) super.clone();
    }

}
