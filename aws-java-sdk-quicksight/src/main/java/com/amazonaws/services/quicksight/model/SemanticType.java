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
 * A structure that represents a semantic type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SemanticType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SemanticType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The semantic type name.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The semantic type sub type name.
     * </p>
     */
    private String subTypeName;
    /**
     * <p>
     * The semantic type parameters.
     * </p>
     */
    private java.util.Map<String, String> typeParameters;
    /**
     * <p>
     * The semantic type truthy cell value.
     * </p>
     */
    private String truthyCellValue;
    /**
     * <p>
     * The other names or aliases for the true cell value.
     * </p>
     */
    private java.util.List<String> truthyCellValueSynonyms;
    /**
     * <p>
     * The semantic type falsey cell value.
     * </p>
     */
    private String falseyCellValue;
    /**
     * <p>
     * The other names or aliases for the false cell value.
     * </p>
     */
    private java.util.List<String> falseyCellValueSynonyms;

    /**
     * <p>
     * The semantic type name.
     * </p>
     * 
     * @param typeName
     *        The semantic type name.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The semantic type name.
     * </p>
     * 
     * @return The semantic type name.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The semantic type name.
     * </p>
     * 
     * @param typeName
     *        The semantic type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticType withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The semantic type sub type name.
     * </p>
     * 
     * @param subTypeName
     *        The semantic type sub type name.
     */

    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }

    /**
     * <p>
     * The semantic type sub type name.
     * </p>
     * 
     * @return The semantic type sub type name.
     */

    public String getSubTypeName() {
        return this.subTypeName;
    }

    /**
     * <p>
     * The semantic type sub type name.
     * </p>
     * 
     * @param subTypeName
     *        The semantic type sub type name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticType withSubTypeName(String subTypeName) {
        setSubTypeName(subTypeName);
        return this;
    }

    /**
     * <p>
     * The semantic type parameters.
     * </p>
     * 
     * @return The semantic type parameters.
     */

    public java.util.Map<String, String> getTypeParameters() {
        return typeParameters;
    }

    /**
     * <p>
     * The semantic type parameters.
     * </p>
     * 
     * @param typeParameters
     *        The semantic type parameters.
     */

    public void setTypeParameters(java.util.Map<String, String> typeParameters) {
        this.typeParameters = typeParameters;
    }

    /**
     * <p>
     * The semantic type parameters.
     * </p>
     * 
     * @param typeParameters
     *        The semantic type parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticType withTypeParameters(java.util.Map<String, String> typeParameters) {
        setTypeParameters(typeParameters);
        return this;
    }

    /**
     * Add a single TypeParameters entry
     *
     * @see SemanticType#withTypeParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SemanticType addTypeParametersEntry(String key, String value) {
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

    public SemanticType clearTypeParametersEntries() {
        this.typeParameters = null;
        return this;
    }

    /**
     * <p>
     * The semantic type truthy cell value.
     * </p>
     * 
     * @param truthyCellValue
     *        The semantic type truthy cell value.
     */

    public void setTruthyCellValue(String truthyCellValue) {
        this.truthyCellValue = truthyCellValue;
    }

    /**
     * <p>
     * The semantic type truthy cell value.
     * </p>
     * 
     * @return The semantic type truthy cell value.
     */

    public String getTruthyCellValue() {
        return this.truthyCellValue;
    }

    /**
     * <p>
     * The semantic type truthy cell value.
     * </p>
     * 
     * @param truthyCellValue
     *        The semantic type truthy cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticType withTruthyCellValue(String truthyCellValue) {
        setTruthyCellValue(truthyCellValue);
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the true cell value.
     * </p>
     * 
     * @return The other names or aliases for the true cell value.
     */

    public java.util.List<String> getTruthyCellValueSynonyms() {
        return truthyCellValueSynonyms;
    }

    /**
     * <p>
     * The other names or aliases for the true cell value.
     * </p>
     * 
     * @param truthyCellValueSynonyms
     *        The other names or aliases for the true cell value.
     */

    public void setTruthyCellValueSynonyms(java.util.Collection<String> truthyCellValueSynonyms) {
        if (truthyCellValueSynonyms == null) {
            this.truthyCellValueSynonyms = null;
            return;
        }

        this.truthyCellValueSynonyms = new java.util.ArrayList<String>(truthyCellValueSynonyms);
    }

    /**
     * <p>
     * The other names or aliases for the true cell value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTruthyCellValueSynonyms(java.util.Collection)} or
     * {@link #withTruthyCellValueSynonyms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param truthyCellValueSynonyms
     *        The other names or aliases for the true cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticType withTruthyCellValueSynonyms(String... truthyCellValueSynonyms) {
        if (this.truthyCellValueSynonyms == null) {
            setTruthyCellValueSynonyms(new java.util.ArrayList<String>(truthyCellValueSynonyms.length));
        }
        for (String ele : truthyCellValueSynonyms) {
            this.truthyCellValueSynonyms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the true cell value.
     * </p>
     * 
     * @param truthyCellValueSynonyms
     *        The other names or aliases for the true cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticType withTruthyCellValueSynonyms(java.util.Collection<String> truthyCellValueSynonyms) {
        setTruthyCellValueSynonyms(truthyCellValueSynonyms);
        return this;
    }

    /**
     * <p>
     * The semantic type falsey cell value.
     * </p>
     * 
     * @param falseyCellValue
     *        The semantic type falsey cell value.
     */

    public void setFalseyCellValue(String falseyCellValue) {
        this.falseyCellValue = falseyCellValue;
    }

    /**
     * <p>
     * The semantic type falsey cell value.
     * </p>
     * 
     * @return The semantic type falsey cell value.
     */

    public String getFalseyCellValue() {
        return this.falseyCellValue;
    }

    /**
     * <p>
     * The semantic type falsey cell value.
     * </p>
     * 
     * @param falseyCellValue
     *        The semantic type falsey cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticType withFalseyCellValue(String falseyCellValue) {
        setFalseyCellValue(falseyCellValue);
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the false cell value.
     * </p>
     * 
     * @return The other names or aliases for the false cell value.
     */

    public java.util.List<String> getFalseyCellValueSynonyms() {
        return falseyCellValueSynonyms;
    }

    /**
     * <p>
     * The other names or aliases for the false cell value.
     * </p>
     * 
     * @param falseyCellValueSynonyms
     *        The other names or aliases for the false cell value.
     */

    public void setFalseyCellValueSynonyms(java.util.Collection<String> falseyCellValueSynonyms) {
        if (falseyCellValueSynonyms == null) {
            this.falseyCellValueSynonyms = null;
            return;
        }

        this.falseyCellValueSynonyms = new java.util.ArrayList<String>(falseyCellValueSynonyms);
    }

    /**
     * <p>
     * The other names or aliases for the false cell value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFalseyCellValueSynonyms(java.util.Collection)} or
     * {@link #withFalseyCellValueSynonyms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param falseyCellValueSynonyms
     *        The other names or aliases for the false cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticType withFalseyCellValueSynonyms(String... falseyCellValueSynonyms) {
        if (this.falseyCellValueSynonyms == null) {
            setFalseyCellValueSynonyms(new java.util.ArrayList<String>(falseyCellValueSynonyms.length));
        }
        for (String ele : falseyCellValueSynonyms) {
            this.falseyCellValueSynonyms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the false cell value.
     * </p>
     * 
     * @param falseyCellValueSynonyms
     *        The other names or aliases for the false cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SemanticType withFalseyCellValueSynonyms(java.util.Collection<String> falseyCellValueSynonyms) {
        setFalseyCellValueSynonyms(falseyCellValueSynonyms);
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
            sb.append("TypeParameters: ").append(getTypeParameters()).append(",");
        if (getTruthyCellValue() != null)
            sb.append("TruthyCellValue: ").append("***Sensitive Data Redacted***").append(",");
        if (getTruthyCellValueSynonyms() != null)
            sb.append("TruthyCellValueSynonyms: ").append("***Sensitive Data Redacted***").append(",");
        if (getFalseyCellValue() != null)
            sb.append("FalseyCellValue: ").append("***Sensitive Data Redacted***").append(",");
        if (getFalseyCellValueSynonyms() != null)
            sb.append("FalseyCellValueSynonyms: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SemanticType == false)
            return false;
        SemanticType other = (SemanticType) obj;
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
        if (other.getTruthyCellValue() == null ^ this.getTruthyCellValue() == null)
            return false;
        if (other.getTruthyCellValue() != null && other.getTruthyCellValue().equals(this.getTruthyCellValue()) == false)
            return false;
        if (other.getTruthyCellValueSynonyms() == null ^ this.getTruthyCellValueSynonyms() == null)
            return false;
        if (other.getTruthyCellValueSynonyms() != null && other.getTruthyCellValueSynonyms().equals(this.getTruthyCellValueSynonyms()) == false)
            return false;
        if (other.getFalseyCellValue() == null ^ this.getFalseyCellValue() == null)
            return false;
        if (other.getFalseyCellValue() != null && other.getFalseyCellValue().equals(this.getFalseyCellValue()) == false)
            return false;
        if (other.getFalseyCellValueSynonyms() == null ^ this.getFalseyCellValueSynonyms() == null)
            return false;
        if (other.getFalseyCellValueSynonyms() != null && other.getFalseyCellValueSynonyms().equals(this.getFalseyCellValueSynonyms()) == false)
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
        hashCode = prime * hashCode + ((getTruthyCellValue() == null) ? 0 : getTruthyCellValue().hashCode());
        hashCode = prime * hashCode + ((getTruthyCellValueSynonyms() == null) ? 0 : getTruthyCellValueSynonyms().hashCode());
        hashCode = prime * hashCode + ((getFalseyCellValue() == null) ? 0 : getFalseyCellValue().hashCode());
        hashCode = prime * hashCode + ((getFalseyCellValueSynonyms() == null) ? 0 : getFalseyCellValueSynonyms().hashCode());
        return hashCode;
    }

    @Override
    public SemanticType clone() {
        try {
            return (SemanticType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SemanticTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
