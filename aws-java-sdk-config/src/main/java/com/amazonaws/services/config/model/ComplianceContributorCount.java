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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of AWS resources or AWS Config rules responsible for the current compliance of the item, up to a maximum
 * number.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ComplianceContributorCount" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceContributorCount implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
     * </p>
     */
    private Integer cappedCount;
    /**
     * <p>
     * Indicates whether the maximum count is reached.
     * </p>
     */
    private Boolean capExceeded;

    /**
     * <p>
     * The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
     * </p>
     * 
     * @param cappedCount
     *        The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
     */

    public void setCappedCount(Integer cappedCount) {
        this.cappedCount = cappedCount;
    }

    /**
     * <p>
     * The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
     * </p>
     * 
     * @return The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
     */

    public Integer getCappedCount() {
        return this.cappedCount;
    }

    /**
     * <p>
     * The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
     * </p>
     * 
     * @param cappedCount
     *        The number of AWS resources or AWS Config rules responsible for the current compliance of the item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceContributorCount withCappedCount(Integer cappedCount) {
        setCappedCount(cappedCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether the maximum count is reached.
     * </p>
     * 
     * @param capExceeded
     *        Indicates whether the maximum count is reached.
     */

    public void setCapExceeded(Boolean capExceeded) {
        this.capExceeded = capExceeded;
    }

    /**
     * <p>
     * Indicates whether the maximum count is reached.
     * </p>
     * 
     * @return Indicates whether the maximum count is reached.
     */

    public Boolean getCapExceeded() {
        return this.capExceeded;
    }

    /**
     * <p>
     * Indicates whether the maximum count is reached.
     * </p>
     * 
     * @param capExceeded
     *        Indicates whether the maximum count is reached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComplianceContributorCount withCapExceeded(Boolean capExceeded) {
        setCapExceeded(capExceeded);
        return this;
    }

    /**
     * <p>
     * Indicates whether the maximum count is reached.
     * </p>
     * 
     * @return Indicates whether the maximum count is reached.
     */

    public Boolean isCapExceeded() {
        return this.capExceeded;
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
        if (getCappedCount() != null)
            sb.append("CappedCount: ").append(getCappedCount()).append(",");
        if (getCapExceeded() != null)
            sb.append("CapExceeded: ").append(getCapExceeded());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComplianceContributorCount == false)
            return false;
        ComplianceContributorCount other = (ComplianceContributorCount) obj;
        if (other.getCappedCount() == null ^ this.getCappedCount() == null)
            return false;
        if (other.getCappedCount() != null && other.getCappedCount().equals(this.getCappedCount()) == false)
            return false;
        if (other.getCapExceeded() == null ^ this.getCapExceeded() == null)
            return false;
        if (other.getCapExceeded() != null && other.getCapExceeded().equals(this.getCapExceeded()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCappedCount() == null) ? 0 : getCappedCount().hashCode());
        hashCode = prime * hashCode + ((getCapExceeded() == null) ? 0 : getCapExceeded().hashCode());
        return hashCode;
    }

    @Override
    public ComplianceContributorCount clone() {
        try {
            return (ComplianceContributorCount) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ComplianceContributorCountMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
