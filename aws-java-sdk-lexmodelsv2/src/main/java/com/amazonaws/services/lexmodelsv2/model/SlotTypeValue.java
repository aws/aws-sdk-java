/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Each slot type can have a set of values. Each <code>SlotTypeValue</code> represents a value that the slot type can
 * take.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SlotTypeValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotTypeValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the slot type entry.
     * </p>
     */
    private SampleValue sampleValue;
    /**
     * <p>
     * Additional values releated to the slot type entry.
     * </p>
     */
    private java.util.List<SampleValue> synonyms;

    /**
     * <p>
     * The value of the slot type entry.
     * </p>
     * 
     * @param sampleValue
     *        The value of the slot type entry.
     */

    public void setSampleValue(SampleValue sampleValue) {
        this.sampleValue = sampleValue;
    }

    /**
     * <p>
     * The value of the slot type entry.
     * </p>
     * 
     * @return The value of the slot type entry.
     */

    public SampleValue getSampleValue() {
        return this.sampleValue;
    }

    /**
     * <p>
     * The value of the slot type entry.
     * </p>
     * 
     * @param sampleValue
     *        The value of the slot type entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeValue withSampleValue(SampleValue sampleValue) {
        setSampleValue(sampleValue);
        return this;
    }

    /**
     * <p>
     * Additional values releated to the slot type entry.
     * </p>
     * 
     * @return Additional values releated to the slot type entry.
     */

    public java.util.List<SampleValue> getSynonyms() {
        return synonyms;
    }

    /**
     * <p>
     * Additional values releated to the slot type entry.
     * </p>
     * 
     * @param synonyms
     *        Additional values releated to the slot type entry.
     */

    public void setSynonyms(java.util.Collection<SampleValue> synonyms) {
        if (synonyms == null) {
            this.synonyms = null;
            return;
        }

        this.synonyms = new java.util.ArrayList<SampleValue>(synonyms);
    }

    /**
     * <p>
     * Additional values releated to the slot type entry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSynonyms(java.util.Collection)} or {@link #withSynonyms(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param synonyms
     *        Additional values releated to the slot type entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeValue withSynonyms(SampleValue... synonyms) {
        if (this.synonyms == null) {
            setSynonyms(new java.util.ArrayList<SampleValue>(synonyms.length));
        }
        for (SampleValue ele : synonyms) {
            this.synonyms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional values releated to the slot type entry.
     * </p>
     * 
     * @param synonyms
     *        Additional values releated to the slot type entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlotTypeValue withSynonyms(java.util.Collection<SampleValue> synonyms) {
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
        if (getSampleValue() != null)
            sb.append("SampleValue: ").append(getSampleValue()).append(",");
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

        if (obj instanceof SlotTypeValue == false)
            return false;
        SlotTypeValue other = (SlotTypeValue) obj;
        if (other.getSampleValue() == null ^ this.getSampleValue() == null)
            return false;
        if (other.getSampleValue() != null && other.getSampleValue().equals(this.getSampleValue()) == false)
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

        hashCode = prime * hashCode + ((getSampleValue() == null) ? 0 : getSampleValue().hashCode());
        hashCode = prime * hashCode + ((getSynonyms() == null) ? 0 : getSynonyms().hashCode());
        return hashCode;
    }

    @Override
    public SlotTypeValue clone() {
        try {
            return (SlotTypeValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SlotTypeValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
