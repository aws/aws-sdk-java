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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about free trial device minutes for an AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/TrialMinutes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialMinutes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of free trial minutes that the account started with.
     * </p>
     */
    private Double total;
    /**
     * <p>
     * The number of free trial minutes remaining in the account.
     * </p>
     */
    private Double remaining;

    /**
     * <p>
     * The total number of free trial minutes that the account started with.
     * </p>
     * 
     * @param total
     *        The total number of free trial minutes that the account started with.
     */

    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of free trial minutes that the account started with.
     * </p>
     * 
     * @return The total number of free trial minutes that the account started with.
     */

    public Double getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total number of free trial minutes that the account started with.
     * </p>
     * 
     * @param total
     *        The total number of free trial minutes that the account started with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialMinutes withTotal(Double total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * The number of free trial minutes remaining in the account.
     * </p>
     * 
     * @param remaining
     *        The number of free trial minutes remaining in the account.
     */

    public void setRemaining(Double remaining) {
        this.remaining = remaining;
    }

    /**
     * <p>
     * The number of free trial minutes remaining in the account.
     * </p>
     * 
     * @return The number of free trial minutes remaining in the account.
     */

    public Double getRemaining() {
        return this.remaining;
    }

    /**
     * <p>
     * The number of free trial minutes remaining in the account.
     * </p>
     * 
     * @param remaining
     *        The number of free trial minutes remaining in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialMinutes withRemaining(Double remaining) {
        setRemaining(remaining);
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
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getRemaining() != null)
            sb.append("Remaining: ").append(getRemaining());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialMinutes == false)
            return false;
        TrialMinutes other = (TrialMinutes) obj;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getRemaining() == null ^ this.getRemaining() == null)
            return false;
        if (other.getRemaining() != null && other.getRemaining().equals(this.getRemaining()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getRemaining() == null) ? 0 : getRemaining().hashCode());
        return hashCode;
    }

    @Override
    public TrialMinutes clone() {
        try {
            return (TrialMinutes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.TrialMinutesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
