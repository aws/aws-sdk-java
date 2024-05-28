/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that represents a semantic entity type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SemanticEntityType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SemanticEntityType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The semantic entity type name.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The semantic entity sub type name.
     * </p>
     */
    private String subTypeName;
    /**
     * <p>
     * The semantic entity type parameters.
     * </p>
     */
    private java.util.Map<String, String> typeParameters;

    /**
     * <p>
     * The semantic entity type name.
     * </p>
     * 
     * @param typeName
     *        The semantic entity type name.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The semantic entity type name.
     * </p>
     * 
     * @return The semantic entity type name.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The semantic entity type name.
     * </p>
     * 
     * @param typeName
     *        The semantic entity type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticEntityType withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The semantic entity sub type name.
     * </p>
     * 
     * @param subTypeName
     *        The semantic entity sub type name.
     */

    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }

    /**
     * <p>
     * The semantic entity sub type name.
     * </p>
     * 
     * @return The semantic entity sub type name.
     */

    public String getSubTypeName() {
        return this.subTypeName;
    }

    /**
     * <p>
     * The semantic entity sub type name.
     * </p>
     * 
     * @param subTypeName
     *        The semantic entity sub type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticEntityType withSubTypeName(String subTypeName) {
        setSubTypeName(subTypeName);
        return this;
    }

    /**
     * <p>
     * The semantic entity type parameters.
     * </p>
     * 
     * @return The semantic entity type parameters.
     */

    public java.util.Map<String, String> getTypeParameters() {
        return typeParameters;
    }

    /**
     * <p>
     * The semantic entity type parameters.
     * </p>
     * 
     * @param typeParameters
     *        The semantic entity type parameters.
     */

    public void setTypeParameters(java.util.Map<String, String> typeParameters) {
        this.typeParameters = typeParameters;
    }

    /**
     * <p>
     * The semantic entity type parameters.
     * </p>
     * 
     * @param typeParameters
     *        The semantic entity type parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticEntityType withTypeParameters(java.util.Map<String, String> typeParameters) {
        setTypeParameters(typeParameters);
        return this;
    }

    /**
     * Add a single TypeParameters entry
     *
     * @see SemanticEntityType#withTypeParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SemanticEntityType addTypeParametersEntry(String key, String value) {
        if (null == this.typeParameters) {
            this.typeParameters = new java.util.HashMap<String, String>();
        }
        if (this.typeParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.typeParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TypeParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticEntityType clearTypeParametersEntries() {
        this.typeParameters = null;
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
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getSubTypeName() != null)
            sb.append("SubTypeName: ").append(getSubTypeName()).append(",");
        if (getTypeParameters() != null)
            sb.append("TypeParameters: ").append(getTypeParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SemanticEntityType == false)
            return false;
        SemanticEntityType other = (SemanticEntityType) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getSubTypeName() == null ^ this.getSubTypeName() == null)
            return false;
        if (other.getSubTypeName() != null && other.getSubTypeName().equals(this.getSubTypeName()) == false)
            return false;
        if (other.getTypeParameters() == null ^ this.getTypeParameters() == null)
            return false;
        if (other.getTypeParameters() != null && other.getTypeParameters().equals(this.getTypeParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getSubTypeName() == null) ? 0 : getSubTypeName().hashCode());
        hashCode = prime * hashCode + ((getTypeParameters() == null) ? 0 : getTypeParameters().hashCode());
        return hashCode;
    }

    @Override
    public SemanticEntityType clone() {
        try {
            return (SemanticEntityType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SemanticEntityTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
