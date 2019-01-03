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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Each slot type can have a set of values. Each enumeration value represents a value the slot type can take.
 * </p>
 * <p>
 * For example, a pizza ordering bot could have a slot type that specifies the type of crust that the pizza should have.
 * The slot type could include the values
 * </p>
 * <ul>
 * <li>
 * <p>
 * thick
 * </p>
 * </li>
 * <li>
 * <p>
 * thin
 * </p>
 * </li>
 * <li>
 * <p>
 * stuffed
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/EnumerationValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnumerationValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the slot type.
     * </p>
     */
    private String value;
    /**
     * <p>
     * Additional values related to the slot type value.
     * </p>
     */
    private java.util.List<String> synonyms;

    /**
     * <p>
     * The value of the slot type.
     * </p>
     * 
     * @param value
     *        The value of the slot type.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the slot type.
     * </p>
     * 
     * @return The value of the slot type.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the slot type.
     * </p>
     * 
     * @param value
     *        The value of the slot type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumerationValue withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Additional values related to the slot type value.
     * </p>
     * 
     * @return Additional values related to the slot type value.
     */

    public java.util.List<String> getSynonyms() {
        return synonyms;
    }

    /**
     * <p>
     * Additional values related to the slot type value.
     * </p>
     * 
     * @param synonyms
     *        Additional values related to the slot type value.
     */

    public void setSynonyms(java.util.Collection<String> synonyms) {
        if (synonyms == null) {
            this.synonyms = null;
            return;
        }

        this.synonyms = new java.util.ArrayList<String>(synonyms);
    }

    /**
     * <p>
     * Additional values related to the slot type value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSynonyms(java.util.Collection)} or {@link #withSynonyms(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param synonyms
     *        Additional values related to the slot type value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumerationValue withSynonyms(String... synonyms) {
        if (this.synonyms == null) {
            setSynonyms(new java.util.ArrayList<String>(synonyms.length));
        }
        for (String ele : synonyms) {
            this.synonyms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional values related to the slot type value.
     * </p>
     * 
     * @param synonyms
     *        Additional values related to the slot type value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnumerationValue withSynonyms(java.util.Collection<String> synonyms) {
        setSynonyms(synonyms);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getSynonyms() != null)
            sb.append("Synonyms: ").append(getSynonyms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnumerationValue == false)
            return false;
        EnumerationValue other = (EnumerationValue) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getSynonyms() == null ^ this.getSynonyms() == null)
            return false;
        if (other.getSynonyms() != null && other.getSynonyms().equals(this.getSynonyms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getSynonyms() == null) ? 0 : getSynonyms().hashCode());
        return hashCode;
    }

    @Override
    public EnumerationValue clone() {
        try {
            return (EnumerationValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelbuilding.model.transform.EnumerationValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
