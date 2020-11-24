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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/AdvancedEventSelector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedEventSelector implements Serializable, Cloneable, StructuredPojo {

    private String name;

    private com.amazonaws.internal.SdkInternalList<AdvancedFieldSelector> fieldSelectors;

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedEventSelector withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<AdvancedFieldSelector> getFieldSelectors() {
        if (fieldSelectors == null) {
            fieldSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedFieldSelector>();
        }
        return fieldSelectors;
    }

    /**
     * @param fieldSelectors
     */

    public void setFieldSelectors(java.util.Collection<AdvancedFieldSelector> fieldSelectors) {
        if (fieldSelectors == null) {
            this.fieldSelectors = null;
            return;
        }

        this.fieldSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedFieldSelector>(fieldSelectors);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldSelectors(java.util.Collection)} or {@link #withFieldSelectors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fieldSelectors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedEventSelector withFieldSelectors(AdvancedFieldSelector... fieldSelectors) {
        if (this.fieldSelectors == null) {
            setFieldSelectors(new com.amazonaws.internal.SdkInternalList<AdvancedFieldSelector>(fieldSelectors.length));
        }
        for (AdvancedFieldSelector ele : fieldSelectors) {
            this.fieldSelectors.add(ele);
        }
        return this;
    }

    /**
     * @param fieldSelectors
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedEventSelector withFieldSelectors(java.util.Collection<AdvancedFieldSelector> fieldSelectors) {
        setFieldSelectors(fieldSelectors);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFieldSelectors() != null)
            sb.append("FieldSelectors: ").append(getFieldSelectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedEventSelector == false)
            return false;
        AdvancedEventSelector other = (AdvancedEventSelector) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFieldSelectors() == null ^ this.getFieldSelectors() == null)
            return false;
        if (other.getFieldSelectors() != null && other.getFieldSelectors().equals(this.getFieldSelectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFieldSelectors() == null) ? 0 : getFieldSelectors().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedEventSelector clone() {
        try {
            return (AdvancedEventSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.AdvancedEventSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
