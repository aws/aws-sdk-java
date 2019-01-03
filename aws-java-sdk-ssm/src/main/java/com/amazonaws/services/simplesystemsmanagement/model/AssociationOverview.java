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
 * Information about the association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AssociationOverview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationOverview implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the association. Status can be: Pending, Success, or Failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed status of the association.
     * </p>
     */
    private String detailedStatus;
    /**
     * <p>
     * Returns the number of targets for the association status. For example, if you created an association with two
     * instances, and one of them was successful, this would return the count of instances by status.
     * </p>
     */
    private java.util.Map<String, Integer> associationStatusAggregatedCount;

    /**
     * <p>
     * The status of the association. Status can be: Pending, Success, or Failed.
     * </p>
     * 
     * @param status
     *        The status of the association. Status can be: Pending, Success, or Failed.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the association. Status can be: Pending, Success, or Failed.
     * </p>
     * 
     * @return The status of the association. Status can be: Pending, Success, or Failed.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the association. Status can be: Pending, Success, or Failed.
     * </p>
     * 
     * @param status
     *        The status of the association. Status can be: Pending, Success, or Failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationOverview withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A detailed status of the association.
     * </p>
     * 
     * @param detailedStatus
     *        A detailed status of the association.
     */

    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    /**
     * <p>
     * A detailed status of the association.
     * </p>
     * 
     * @return A detailed status of the association.
     */

    public String getDetailedStatus() {
        return this.detailedStatus;
    }

    /**
     * <p>
     * A detailed status of the association.
     * </p>
     * 
     * @param detailedStatus
     *        A detailed status of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationOverview withDetailedStatus(String detailedStatus) {
        setDetailedStatus(detailedStatus);
        return this;
    }

    /**
     * <p>
     * Returns the number of targets for the association status. For example, if you created an association with two
     * instances, and one of them was successful, this would return the count of instances by status.
     * </p>
     * 
     * @return Returns the number of targets for the association status. For example, if you created an association with
     *         two instances, and one of them was successful, this would return the count of instances by status.
     */

    public java.util.Map<String, Integer> getAssociationStatusAggregatedCount() {
        return associationStatusAggregatedCount;
    }

    /**
     * <p>
     * Returns the number of targets for the association status. For example, if you created an association with two
     * instances, and one of them was successful, this would return the count of instances by status.
     * </p>
     * 
     * @param associationStatusAggregatedCount
     *        Returns the number of targets for the association status. For example, if you created an association with
     *        two instances, and one of them was successful, this would return the count of instances by status.
     */

    public void setAssociationStatusAggregatedCount(java.util.Map<String, Integer> associationStatusAggregatedCount) {
        this.associationStatusAggregatedCount = associationStatusAggregatedCount;
    }

    /**
     * <p>
     * Returns the number of targets for the association status. For example, if you created an association with two
     * instances, and one of them was successful, this would return the count of instances by status.
     * </p>
     * 
     * @param associationStatusAggregatedCount
     *        Returns the number of targets for the association status. For example, if you created an association with
     *        two instances, and one of them was successful, this would return the count of instances by status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationOverview withAssociationStatusAggregatedCount(java.util.Map<String, Integer> associationStatusAggregatedCount) {
        setAssociationStatusAggregatedCount(associationStatusAggregatedCount);
        return this;
    }

    public AssociationOverview addAssociationStatusAggregatedCountEntry(String key, Integer value) {
        if (null == this.associationStatusAggregatedCount) {
            this.associationStatusAggregatedCount = new java.util.HashMap<String, Integer>();
        }
        if (this.associationStatusAggregatedCount.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.associationStatusAggregatedCount.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AssociationStatusAggregatedCount.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationOverview clearAssociationStatusAggregatedCountEntries() {
        this.associationStatusAggregatedCount = null;
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDetailedStatus() != null)
            sb.append("DetailedStatus: ").append(getDetailedStatus()).append(",");
        if (getAssociationStatusAggregatedCount() != null)
            sb.append("AssociationStatusAggregatedCount: ").append(getAssociationStatusAggregatedCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationOverview == false)
            return false;
        AssociationOverview other = (AssociationOverview) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetailedStatus() == null ^ this.getDetailedStatus() == null)
            return false;
        if (other.getDetailedStatus() != null && other.getDetailedStatus().equals(this.getDetailedStatus()) == false)
            return false;
        if (other.getAssociationStatusAggregatedCount() == null ^ this.getAssociationStatusAggregatedCount() == null)
            return false;
        if (other.getAssociationStatusAggregatedCount() != null
                && other.getAssociationStatusAggregatedCount().equals(this.getAssociationStatusAggregatedCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetailedStatus() == null) ? 0 : getDetailedStatus().hashCode());
        hashCode = prime * hashCode + ((getAssociationStatusAggregatedCount() == null) ? 0 : getAssociationStatusAggregatedCount().hashCode());
        return hashCode;
    }

    @Override
    public AssociationOverview clone() {
        try {
            return (AssociationOverview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AssociationOverviewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
