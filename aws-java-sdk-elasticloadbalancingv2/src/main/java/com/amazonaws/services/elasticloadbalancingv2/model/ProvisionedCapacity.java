/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ProvisionedCapacity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedCapacity implements Serializable, Cloneable {

    private Integer minimumLBCapacityUnits;

    private String status;

    private Integer decreasesRemaining;

    private java.util.Date lastModifiedTime;

    /**
     * @param minimumLBCapacityUnits
     */

    public void setMinimumLBCapacityUnits(Integer minimumLBCapacityUnits) {
        this.minimumLBCapacityUnits = minimumLBCapacityUnits;
    }

    /**
     * @return
     */

    public Integer getMinimumLBCapacityUnits() {
        return this.minimumLBCapacityUnits;
    }

    /**
     * @param minimumLBCapacityUnits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedCapacity withMinimumLBCapacityUnits(Integer minimumLBCapacityUnits) {
        setMinimumLBCapacityUnits(minimumLBCapacityUnits);
        return this;
    }

    /**
     * @param status
     * @see ProvisionedCapacityStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return
     * @see ProvisionedCapacityStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedCapacityStatus
     */

    public ProvisionedCapacity withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisionedCapacityStatus
     */

    public ProvisionedCapacity withStatus(ProvisionedCapacityStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param decreasesRemaining
     */

    public void setDecreasesRemaining(Integer decreasesRemaining) {
        this.decreasesRemaining = decreasesRemaining;
    }

    /**
     * @return
     */

    public Integer getDecreasesRemaining() {
        return this.decreasesRemaining;
    }

    /**
     * @param decreasesRemaining
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedCapacity withDecreasesRemaining(Integer decreasesRemaining) {
        setDecreasesRemaining(decreasesRemaining);
        return this;
    }

    /**
     * @param lastModifiedTime
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * @return
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @param lastModifiedTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionedCapacity withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinimumLBCapacityUnits() != null)
            sb.append("MinimumLBCapacityUnits: ").append(getMinimumLBCapacityUnits()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDecreasesRemaining() != null)
            sb.append("DecreasesRemaining: ").append(getDecreasesRemaining()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionedCapacity == false)
            return false;
        ProvisionedCapacity other = (ProvisionedCapacity) obj;
        if (other.getMinimumLBCapacityUnits() == null ^ this.getMinimumLBCapacityUnits() == null)
            return false;
        if (other.getMinimumLBCapacityUnits() != null && other.getMinimumLBCapacityUnits().equals(this.getMinimumLBCapacityUnits()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDecreasesRemaining() == null ^ this.getDecreasesRemaining() == null)
            return false;
        if (other.getDecreasesRemaining() != null && other.getDecreasesRemaining().equals(this.getDecreasesRemaining()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinimumLBCapacityUnits() == null) ? 0 : getMinimumLBCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDecreasesRemaining() == null) ? 0 : getDecreasesRemaining().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionedCapacity clone() {
        try {
            return (ProvisionedCapacity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
