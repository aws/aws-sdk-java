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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that describes workflow billing details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/BillingDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BillingDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Billed memory consumption of your workflow, in MB.
     * </p>
     */
    private Long billedMemoryUsedInMB;
    /**
     * <p>
     * Billed duration of your workflow, in milliseconds.
     * </p>
     */
    private Long billedDurationInMilliseconds;

    /**
     * <p>
     * Billed memory consumption of your workflow, in MB.
     * </p>
     * 
     * @param billedMemoryUsedInMB
     *        Billed memory consumption of your workflow, in MB.
     */

    public void setBilledMemoryUsedInMB(Long billedMemoryUsedInMB) {
        this.billedMemoryUsedInMB = billedMemoryUsedInMB;
    }

    /**
     * <p>
     * Billed memory consumption of your workflow, in MB.
     * </p>
     * 
     * @return Billed memory consumption of your workflow, in MB.
     */

    public Long getBilledMemoryUsedInMB() {
        return this.billedMemoryUsedInMB;
    }

    /**
     * <p>
     * Billed memory consumption of your workflow, in MB.
     * </p>
     * 
     * @param billedMemoryUsedInMB
     *        Billed memory consumption of your workflow, in MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingDetails withBilledMemoryUsedInMB(Long billedMemoryUsedInMB) {
        setBilledMemoryUsedInMB(billedMemoryUsedInMB);
        return this;
    }

    /**
     * <p>
     * Billed duration of your workflow, in milliseconds.
     * </p>
     * 
     * @param billedDurationInMilliseconds
     *        Billed duration of your workflow, in milliseconds.
     */

    public void setBilledDurationInMilliseconds(Long billedDurationInMilliseconds) {
        this.billedDurationInMilliseconds = billedDurationInMilliseconds;
    }

    /**
     * <p>
     * Billed duration of your workflow, in milliseconds.
     * </p>
     * 
     * @return Billed duration of your workflow, in milliseconds.
     */

    public Long getBilledDurationInMilliseconds() {
        return this.billedDurationInMilliseconds;
    }

    /**
     * <p>
     * Billed duration of your workflow, in milliseconds.
     * </p>
     * 
     * @param billedDurationInMilliseconds
     *        Billed duration of your workflow, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingDetails withBilledDurationInMilliseconds(Long billedDurationInMilliseconds) {
        setBilledDurationInMilliseconds(billedDurationInMilliseconds);
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
        if (getBilledMemoryUsedInMB() != null)
            sb.append("BilledMemoryUsedInMB: ").append(getBilledMemoryUsedInMB()).append(",");
        if (getBilledDurationInMilliseconds() != null)
            sb.append("BilledDurationInMilliseconds: ").append(getBilledDurationInMilliseconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BillingDetails == false)
            return false;
        BillingDetails other = (BillingDetails) obj;
        if (other.getBilledMemoryUsedInMB() == null ^ this.getBilledMemoryUsedInMB() == null)
            return false;
        if (other.getBilledMemoryUsedInMB() != null && other.getBilledMemoryUsedInMB().equals(this.getBilledMemoryUsedInMB()) == false)
            return false;
        if (other.getBilledDurationInMilliseconds() == null ^ this.getBilledDurationInMilliseconds() == null)
            return false;
        if (other.getBilledDurationInMilliseconds() != null && other.getBilledDurationInMilliseconds().equals(this.getBilledDurationInMilliseconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBilledMemoryUsedInMB() == null) ? 0 : getBilledMemoryUsedInMB().hashCode());
        hashCode = prime * hashCode + ((getBilledDurationInMilliseconds() == null) ? 0 : getBilledDurationInMilliseconds().hashCode());
        return hashCode;
    }

    @Override
    public BillingDetails clone() {
        try {
            return (BillingDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.BillingDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
