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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The reference rule that partially matches the <code>ViolationTarget</code> rule and violation reason.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PartialMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartialMatch implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The reference rule from the primary security group of the Firewall Manager policy.
     * </p>
     */
    private String reference;
    /**
     * <p>
     * The violation reason.
     * </p>
     */
    private java.util.List<String> targetViolationReasons;

    /**
     * <p>
     * The reference rule from the primary security group of the Firewall Manager policy.
     * </p>
     * 
     * @param reference
     *        The reference rule from the primary security group of the Firewall Manager policy.
     */

    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * <p>
     * The reference rule from the primary security group of the Firewall Manager policy.
     * </p>
     * 
     * @return The reference rule from the primary security group of the Firewall Manager policy.
     */

    public String getReference() {
        return this.reference;
    }

    /**
     * <p>
     * The reference rule from the primary security group of the Firewall Manager policy.
     * </p>
     * 
     * @param reference
     *        The reference rule from the primary security group of the Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartialMatch withReference(String reference) {
        setReference(reference);
        return this;
    }

    /**
     * <p>
     * The violation reason.
     * </p>
     * 
     * @return The violation reason.
     */

    public java.util.List<String> getTargetViolationReasons() {
        return targetViolationReasons;
    }

    /**
     * <p>
     * The violation reason.
     * </p>
     * 
     * @param targetViolationReasons
     *        The violation reason.
     */

    public void setTargetViolationReasons(java.util.Collection<String> targetViolationReasons) {
        if (targetViolationReasons == null) {
            this.targetViolationReasons = null;
            return;
        }

        this.targetViolationReasons = new java.util.ArrayList<String>(targetViolationReasons);
    }

    /**
     * <p>
     * The violation reason.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetViolationReasons(java.util.Collection)} or
     * {@link #withTargetViolationReasons(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetViolationReasons
     *        The violation reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartialMatch withTargetViolationReasons(String... targetViolationReasons) {
        if (this.targetViolationReasons == null) {
            setTargetViolationReasons(new java.util.ArrayList<String>(targetViolationReasons.length));
        }
        for (String ele : targetViolationReasons) {
            this.targetViolationReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The violation reason.
     * </p>
     * 
     * @param targetViolationReasons
     *        The violation reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PartialMatch withTargetViolationReasons(java.util.Collection<String> targetViolationReasons) {
        setTargetViolationReasons(targetViolationReasons);
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
        if (getReference() != null)
            sb.append("Reference: ").append(getReference()).append(",");
        if (getTargetViolationReasons() != null)
            sb.append("TargetViolationReasons: ").append(getTargetViolationReasons());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PartialMatch == false)
            return false;
        PartialMatch other = (PartialMatch) obj;
        if (other.getReference() == null ^ this.getReference() == null)
            return false;
        if (other.getReference() != null && other.getReference().equals(this.getReference()) == false)
            return false;
        if (other.getTargetViolationReasons() == null ^ this.getTargetViolationReasons() == null)
            return false;
        if (other.getTargetViolationReasons() != null && other.getTargetViolationReasons().equals(this.getTargetViolationReasons()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReference() == null) ? 0 : getReference().hashCode());
        hashCode = prime * hashCode + ((getTargetViolationReasons() == null) ? 0 : getTargetViolationReasons().hashCode());
        return hashCode;
    }

    @Override
    public PartialMatch clone() {
        try {
            return (PartialMatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.PartialMatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
