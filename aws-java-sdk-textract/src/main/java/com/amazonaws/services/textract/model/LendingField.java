/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Holds the normalized key-value pairs returned by AnalyzeDocument, including the document type, detected text, and
 * geometry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/LendingField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LendingField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the lending document.
     * </p>
     */
    private String type;

    private LendingDetection keyDetection;
    /**
     * <p>
     * An array of LendingDetection objects.
     * </p>
     */
    private java.util.List<LendingDetection> valueDetections;

    /**
     * <p>
     * The type of the lending document.
     * </p>
     * 
     * @param type
     *        The type of the lending document.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the lending document.
     * </p>
     * 
     * @return The type of the lending document.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the lending document.
     * </p>
     * 
     * @param type
     *        The type of the lending document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingField withType(String type) {
        setType(type);
        return this;
    }

    /**
     * @param keyDetection
     */

    public void setKeyDetection(LendingDetection keyDetection) {
        this.keyDetection = keyDetection;
    }

    /**
     * @return
     */

    public LendingDetection getKeyDetection() {
        return this.keyDetection;
    }

    /**
     * @param keyDetection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingField withKeyDetection(LendingDetection keyDetection) {
        setKeyDetection(keyDetection);
        return this;
    }

    /**
     * <p>
     * An array of LendingDetection objects.
     * </p>
     * 
     * @return An array of LendingDetection objects.
     */

    public java.util.List<LendingDetection> getValueDetections() {
        return valueDetections;
    }

    /**
     * <p>
     * An array of LendingDetection objects.
     * </p>
     * 
     * @param valueDetections
     *        An array of LendingDetection objects.
     */

    public void setValueDetections(java.util.Collection<LendingDetection> valueDetections) {
        if (valueDetections == null) {
            this.valueDetections = null;
            return;
        }

        this.valueDetections = new java.util.ArrayList<LendingDetection>(valueDetections);
    }

    /**
     * <p>
     * An array of LendingDetection objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValueDetections(java.util.Collection)} or {@link #withValueDetections(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param valueDetections
     *        An array of LendingDetection objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingField withValueDetections(LendingDetection... valueDetections) {
        if (this.valueDetections == null) {
            setValueDetections(new java.util.ArrayList<LendingDetection>(valueDetections.length));
        }
        for (LendingDetection ele : valueDetections) {
            this.valueDetections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of LendingDetection objects.
     * </p>
     * 
     * @param valueDetections
     *        An array of LendingDetection objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LendingField withValueDetections(java.util.Collection<LendingDetection> valueDetections) {
        setValueDetections(valueDetections);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getKeyDetection() != null)
            sb.append("KeyDetection: ").append(getKeyDetection()).append(",");
        if (getValueDetections() != null)
            sb.append("ValueDetections: ").append(getValueDetections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LendingField == false)
            return false;
        LendingField other = (LendingField) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKeyDetection() == null ^ this.getKeyDetection() == null)
            return false;
        if (other.getKeyDetection() != null && other.getKeyDetection().equals(this.getKeyDetection()) == false)
            return false;
        if (other.getValueDetections() == null ^ this.getValueDetections() == null)
            return false;
        if (other.getValueDetections() != null && other.getValueDetections().equals(this.getValueDetections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKeyDetection() == null) ? 0 : getKeyDetection().hashCode());
        hashCode = prime * hashCode + ((getValueDetections() == null) ? 0 : getValueDetections().hashCode());
        return hashCode;
    }

    @Override
    public LendingField clone() {
        try {
            return (LendingField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.LendingFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
