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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the Capacity Reservation usage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceUsage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceUsage implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AWS account that is making use of the Capacity Reservation.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The number of instances the AWS account currently has in the Capacity Reservation.
     * </p>
     */
    private Integer usedInstanceCount;

    /**
     * <p>
     * The ID of the AWS account that is making use of the Capacity Reservation.
     * </p>
     * 
     * @param accountId
     *        The ID of the AWS account that is making use of the Capacity Reservation.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the AWS account that is making use of the Capacity Reservation.
     * </p>
     * 
     * @return The ID of the AWS account that is making use of the Capacity Reservation.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the AWS account that is making use of the Capacity Reservation.
     * </p>
     * 
     * @param accountId
     *        The ID of the AWS account that is making use of the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceUsage withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The number of instances the AWS account currently has in the Capacity Reservation.
     * </p>
     * 
     * @param usedInstanceCount
     *        The number of instances the AWS account currently has in the Capacity Reservation.
     */

    public void setUsedInstanceCount(Integer usedInstanceCount) {
        this.usedInstanceCount = usedInstanceCount;
    }

    /**
     * <p>
     * The number of instances the AWS account currently has in the Capacity Reservation.
     * </p>
     * 
     * @return The number of instances the AWS account currently has in the Capacity Reservation.
     */

    public Integer getUsedInstanceCount() {
        return this.usedInstanceCount;
    }

    /**
     * <p>
     * The number of instances the AWS account currently has in the Capacity Reservation.
     * </p>
     * 
     * @param usedInstanceCount
     *        The number of instances the AWS account currently has in the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceUsage withUsedInstanceCount(Integer usedInstanceCount) {
        setUsedInstanceCount(usedInstanceCount);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getUsedInstanceCount() != null)
            sb.append("UsedInstanceCount: ").append(getUsedInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceUsage == false)
            return false;
        InstanceUsage other = (InstanceUsage) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUsedInstanceCount() == null ^ this.getUsedInstanceCount() == null)
            return false;
        if (other.getUsedInstanceCount() != null && other.getUsedInstanceCount().equals(this.getUsedInstanceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUsedInstanceCount() == null) ? 0 : getUsedInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public InstanceUsage clone() {
        try {
            return (InstanceUsage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
