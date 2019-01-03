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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status information about the aggregated associations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InstanceAggregatedAssociationOverview"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceAggregatedAssociationOverview implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Detailed status information about the aggregated associations.
     * </p>
     */
    private String detailedStatus;
    /**
     * <p>
     * The number of associations for the instance(s).
     * </p>
     */
    private java.util.Map<String, Integer> instanceAssociationStatusAggregatedCount;

    /**
     * <p>
     * Detailed status information about the aggregated associations.
     * </p>
     * 
     * @param detailedStatus
     *        Detailed status information about the aggregated associations.
     */

    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the aggregated associations.
     * </p>
     * 
     * @return Detailed status information about the aggregated associations.
     */

    public String getDetailedStatus() {
        return this.detailedStatus;
    }

    /**
     * <p>
     * Detailed status information about the aggregated associations.
     * </p>
     * 
     * @param detailedStatus
     *        Detailed status information about the aggregated associations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAggregatedAssociationOverview withDetailedStatus(String detailedStatus) {
        setDetailedStatus(detailedStatus);
        return this;
    }

    /**
     * <p>
     * The number of associations for the instance(s).
     * </p>
     * 
     * @return The number of associations for the instance(s).
     */

    public java.util.Map<String, Integer> getInstanceAssociationStatusAggregatedCount() {
        return instanceAssociationStatusAggregatedCount;
    }

    /**
     * <p>
     * The number of associations for the instance(s).
     * </p>
     * 
     * @param instanceAssociationStatusAggregatedCount
     *        The number of associations for the instance(s).
     */

    public void setInstanceAssociationStatusAggregatedCount(java.util.Map<String, Integer> instanceAssociationStatusAggregatedCount) {
        this.instanceAssociationStatusAggregatedCount = instanceAssociationStatusAggregatedCount;
    }

    /**
     * <p>
     * The number of associations for the instance(s).
     * </p>
     * 
     * @param instanceAssociationStatusAggregatedCount
     *        The number of associations for the instance(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAggregatedAssociationOverview withInstanceAssociationStatusAggregatedCount(
            java.util.Map<String, Integer> instanceAssociationStatusAggregatedCount) {
        setInstanceAssociationStatusAggregatedCount(instanceAssociationStatusAggregatedCount);
        return this;
    }

    public InstanceAggregatedAssociationOverview addInstanceAssociationStatusAggregatedCountEntry(String key, Integer value) {
        if (null == this.instanceAssociationStatusAggregatedCount) {
            this.instanceAssociationStatusAggregatedCount = new java.util.HashMap<String, Integer>();
        }
        if (this.instanceAssociationStatusAggregatedCount.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.instanceAssociationStatusAggregatedCount.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InstanceAssociationStatusAggregatedCount.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceAggregatedAssociationOverview clearInstanceAssociationStatusAggregatedCountEntries() {
        this.instanceAssociationStatusAggregatedCount = null;
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
        if (getDetailedStatus() != null)
            sb.append("DetailedStatus: ").append(getDetailedStatus()).append(",");
        if (getInstanceAssociationStatusAggregatedCount() != null)
            sb.append("InstanceAssociationStatusAggregatedCount: ").append(getInstanceAssociationStatusAggregatedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceAggregatedAssociationOverview == false)
            return false;
        InstanceAggregatedAssociationOverview other = (InstanceAggregatedAssociationOverview) obj;
        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null)
            return false;
        if (other.getDetailedStatus() != null && other.getDetailedStatus().equals(this.getDetailedStatus()) == false)
            return false;
        if (other.getInstanceAssociationStatusAggregatedCount() == null ^ this.getInstanceAssociationStatusAggregatedCount() == null)
            return false;
        if (other.getInstanceAssociationStatusAggregatedCount() != null
                && other.getInstanceAssociationStatusAggregatedCount().equals(this.getInstanceAssociationStatusAggregatedCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        hashCode = prime * hashCode + ((getInstanceAssociationStatusAggregatedCount() == null) ? 0 : getInstanceAssociationStatusAggregatedCount().hashCode());
        return hashCode;
    }

    @Override
    public InstanceAggregatedAssociationOverview clone() {
        try {
            return (InstanceAggregatedAssociationOverview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InstanceAggregatedAssociationOverviewMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
