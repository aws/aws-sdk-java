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
 * The details for worker capabilities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/WorkerCapabilities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerCapabilities implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The worker capabilities amounts on a list of worker capabilities.
     * </p>
     */
    private java.util.List<WorkerAmountCapability> amounts;
    /**
     * <p>
     * The worker attribute capabilities in the list of attribute capabilities.
     * </p>
     */
    private java.util.List<WorkerAttributeCapability> attributes;

    /**
     * <p>
     * The worker capabilities amounts on a list of worker capabilities.
     * </p>
     * 
     * @return The worker capabilities amounts on a list of worker capabilities.
     */

    public java.util.List<WorkerAmountCapability> getAmounts() {
        return amounts;
    }

    /**
     * <p>
     * The worker capabilities amounts on a list of worker capabilities.
     * </p>
     * 
     * @param amounts
     *        The worker capabilities amounts on a list of worker capabilities.
     */

    public void setAmounts(java.util.Collection<WorkerAmountCapability> amounts) {
        if (amounts == null) {
            this.amounts = null;
            return;
        }

        this.amounts = new java.util.ArrayList<WorkerAmountCapability>(amounts);
    }

    /**
     * <p>
     * The worker capabilities amounts on a list of worker capabilities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAmounts(java.util.Collection)} or {@link #withAmounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param amounts
     *        The worker capabilities amounts on a list of worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerCapabilities withAmounts(WorkerAmountCapability... amounts) {
        if (this.amounts == null) {
            setAmounts(new java.util.ArrayList<WorkerAmountCapability>(amounts.length));
        }
        for (WorkerAmountCapability ele : amounts) {
            this.amounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The worker capabilities amounts on a list of worker capabilities.
     * </p>
     * 
     * @param amounts
     *        The worker capabilities amounts on a list of worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerCapabilities withAmounts(java.util.Collection<WorkerAmountCapability> amounts) {
        setAmounts(amounts);
        return this;
    }

    /**
     * <p>
     * The worker attribute capabilities in the list of attribute capabilities.
     * </p>
     * 
     * @return The worker attribute capabilities in the list of attribute capabilities.
     */

    public java.util.List<WorkerAttributeCapability> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * The worker attribute capabilities in the list of attribute capabilities.
     * </p>
     * 
     * @param attributes
     *        The worker attribute capabilities in the list of attribute capabilities.
     */

    public void setAttributes(java.util.Collection<WorkerAttributeCapability> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<WorkerAttributeCapability>(attributes);
    }

    /**
     * <p>
     * The worker attribute capabilities in the list of attribute capabilities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The worker attribute capabilities in the list of attribute capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerCapabilities withAttributes(WorkerAttributeCapability... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<WorkerAttributeCapability>(attributes.length));
        }
        for (WorkerAttributeCapability ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The worker attribute capabilities in the list of attribute capabilities.
     * </p>
     * 
     * @param attributes
     *        The worker attribute capabilities in the list of attribute capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerCapabilities withAttributes(java.util.Collection<WorkerAttributeCapability> attributes) {
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

        if (obj instanceof WorkerCapabilities == false)
            return false;
        WorkerCapabilities other = (WorkerCapabilities) obj;
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
    public WorkerCapabilities clone() {
        try {
            return (WorkerCapabilities) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.WorkerCapabilitiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
