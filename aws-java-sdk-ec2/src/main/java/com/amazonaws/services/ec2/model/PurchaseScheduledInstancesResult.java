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

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of PurchaseScheduledInstances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseScheduledInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the Scheduled Instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ScheduledInstance> scheduledInstanceSet;

    /**
     * <p>
     * Information about the Scheduled Instances.
     * </p>
     * 
     * @return Information about the Scheduled Instances.
     */

    public java.util.List<ScheduledInstance> getScheduledInstanceSet() {
        if (scheduledInstanceSet == null) {
            scheduledInstanceSet = new com.amazonaws.internal.SdkInternalList<ScheduledInstance>();
        }
        return scheduledInstanceSet;
    }

    /**
     * <p>
     * Information about the Scheduled Instances.
     * </p>
     * 
     * @param scheduledInstanceSet
     *        Information about the Scheduled Instances.
     */

    public void setScheduledInstanceSet(java.util.Collection<ScheduledInstance> scheduledInstanceSet) {
        if (scheduledInstanceSet == null) {
            this.scheduledInstanceSet = null;
            return;
        }

        this.scheduledInstanceSet = new com.amazonaws.internal.SdkInternalList<ScheduledInstance>(scheduledInstanceSet);
    }

    /**
     * <p>
     * Information about the Scheduled Instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledInstanceSet(java.util.Collection)} or {@link #withScheduledInstanceSet(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scheduledInstanceSet
     *        Information about the Scheduled Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseScheduledInstancesResult withScheduledInstanceSet(ScheduledInstance... scheduledInstanceSet) {
        if (this.scheduledInstanceSet == null) {
            setScheduledInstanceSet(new com.amazonaws.internal.SdkInternalList<ScheduledInstance>(scheduledInstanceSet.length));
        }
        for (ScheduledInstance ele : scheduledInstanceSet) {
            this.scheduledInstanceSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Scheduled Instances.
     * </p>
     * 
     * @param scheduledInstanceSet
     *        Information about the Scheduled Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseScheduledInstancesResult withScheduledInstanceSet(java.util.Collection<ScheduledInstance> scheduledInstanceSet) {
        setScheduledInstanceSet(scheduledInstanceSet);
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
        if (getScheduledInstanceSet() != null)
            sb.append("ScheduledInstanceSet: ").append(getScheduledInstanceSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseScheduledInstancesResult == false)
            return false;
        PurchaseScheduledInstancesResult other = (PurchaseScheduledInstancesResult) obj;
        if (other.getScheduledInstanceSet() == null ^ this.getScheduledInstanceSet() == null)
            return false;
        if (other.getScheduledInstanceSet() != null && other.getScheduledInstanceSet().equals(this.getScheduledInstanceSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduledInstanceSet() == null) ? 0 : getScheduledInstanceSet().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseScheduledInstancesResult clone() {
        try {
            return (PurchaseScheduledInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
