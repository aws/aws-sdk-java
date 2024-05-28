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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of required step capabilities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StepRequiredCapabilities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepRequiredCapabilities implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The capability amounts that the step requires.
     * </p>
     */
    private java.util.List<StepAmountCapability> amounts;
    /**
     * <p>
     * The capability attributes that the step requires.
     * </p>
     */
    private java.util.List<StepAttributeCapability> attributes;

    /**
     * <p>
     * The capability amounts that the step requires.
     * </p>
     * 
     * @return The capability amounts that the step requires.
     */

    public java.util.List<StepAmountCapability> getAmounts() {
        return amounts;
    }

    /**
     * <p>
     * The capability amounts that the step requires.
     * </p>
     * 
     * @param amounts
     *        The capability amounts that the step requires.
     */

    public void setAmounts(java.util.Collection<StepAmountCapability> amounts) {
        if (amounts == null) {
            this.amounts = null;
            return;
        }

        this.amounts = new java.util.ArrayList<StepAmountCapability>(amounts);
    }

    /**
     * <p>
     * The capability amounts that the step requires.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAmounts(java.util.Collection)} or {@link #withAmounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param amounts
     *        The capability amounts that the step requires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepRequiredCapabilities withAmounts(StepAmountCapability... amounts) {
        if (this.amounts == null) {
            setAmounts(new java.util.ArrayList<StepAmountCapability>(amounts.length));
        }
        for (StepAmountCapability ele : amounts) {
            this.amounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capability amounts that the step requires.
     * </p>
     * 
     * @param amounts
     *        The capability amounts that the step requires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepRequiredCapabilities withAmounts(java.util.Collection<StepAmountCapability> amounts) {
        setAmounts(amounts);
        return this;
    }

    /**
     * <p>
     * The capability attributes that the step requires.
     * </p>
     * 
     * @return The capability attributes that the step requires.
     */

    public java.util.List<StepAttributeCapability> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The capability attributes that the step requires.
     * </p>
     * 
     * @param attributes
     *        The capability attributes that the step requires.
     */

    public void setAttributes(java.util.Collection<StepAttributeCapability> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<StepAttributeCapability>(attributes);
    }

    /**
     * <p>
     * The capability attributes that the step requires.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The capability attributes that the step requires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepRequiredCapabilities withAttributes(StepAttributeCapability... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<StepAttributeCapability>(attributes.length));
        }
        for (StepAttributeCapability ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capability attributes that the step requires.
     * </p>
     * 
     * @param attributes
     *        The capability attributes that the step requires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepRequiredCapabilities withAttributes(java.util.Collection<StepAttributeCapability> attributes) {
        setAttributes(attributes);
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
        if (getAmounts() != null)
            sb.append("Amounts: ").append(getAmounts()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepRequiredCapabilities == false)
            return false;
        StepRequiredCapabilities other = (StepRequiredCapabilities) obj;
        if (other.getAmounts() == null ^ this.getAmounts() == null)
            return false;
        if (other.getAmounts() != null && other.getAmounts().equals(this.getAmounts()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmounts() == null) ? 0 : getAmounts().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public StepRequiredCapabilities clone() {
        try {
            return (StepRequiredCapabilities) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.StepRequiredCapabilitiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
