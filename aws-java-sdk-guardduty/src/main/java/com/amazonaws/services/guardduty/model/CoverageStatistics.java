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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the coverage statistics for a resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CoverageStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageStatistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents coverage statistics for EKS clusters aggregated by resource type.
     * </p>
     */
    private java.util.Map<String, Long> countByResourceType;
    /**
     * <p>
     * Represents coverage statistics for EKS clusters aggregated by coverage status.
     * </p>
     */
    private java.util.Map<String, Long> countByCoverageStatus;

    /**
     * <p>
     * Represents coverage statistics for EKS clusters aggregated by resource type.
     * </p>
     * 
     * @return Represents coverage statistics for EKS clusters aggregated by resource type.
     */

    public java.util.Map<String, Long> getCountByResourceType() {
        return countByResourceType;
    }

    /**
     * <p>
     * Represents coverage statistics for EKS clusters aggregated by resource type.
     * </p>
     * 
     * @param countByResourceType
     *        Represents coverage statistics for EKS clusters aggregated by resource type.
     */

    public void setCountByResourceType(java.util.Map<String, Long> countByResourceType) {
        this.countByResourceType = countByResourceType;
    }

    /**
     * <p>
     * Represents coverage statistics for EKS clusters aggregated by resource type.
     * </p>
     * 
     * @param countByResourceType
     *        Represents coverage statistics for EKS clusters aggregated by resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageStatistics withCountByResourceType(java.util.Map<String, Long> countByResourceType) {
        setCountByResourceType(countByResourceType);
        return this;
    }

    /**
     * Add a single CountByResourceType entry
     *
     * @see CoverageStatistics#withCountByResourceType
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CoverageStatistics addCountByResourceTypeEntry(String key, Long value) {
        if (null == this.countByResourceType) {
            this.countByResourceType = new java.util.HashMap<String, Long>();
        }
        if (this.countByResourceType.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.countByResourceType.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CountByResourceType.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageStatistics clearCountByResourceTypeEntries() {
        this.countByResourceType = null;
        return this;
    }

    /**
     * <p>
     * Represents coverage statistics for EKS clusters aggregated by coverage status.
     * </p>
     * 
     * @return Represents coverage statistics for EKS clusters aggregated by coverage status.
     */

    public java.util.Map<String, Long> getCountByCoverageStatus() {
        return countByCoverageStatus;
    }

    /**
     * <p>
     * Represents coverage statistics for EKS clusters aggregated by coverage status.
     * </p>
     * 
     * @param countByCoverageStatus
     *        Represents coverage statistics for EKS clusters aggregated by coverage status.
     */

    public void setCountByCoverageStatus(java.util.Map<String, Long> countByCoverageStatus) {
        this.countByCoverageStatus = countByCoverageStatus;
    }

    /**
     * <p>
     * Represents coverage statistics for EKS clusters aggregated by coverage status.
     * </p>
     * 
     * @param countByCoverageStatus
     *        Represents coverage statistics for EKS clusters aggregated by coverage status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageStatistics withCountByCoverageStatus(java.util.Map<String, Long> countByCoverageStatus) {
        setCountByCoverageStatus(countByCoverageStatus);
        return this;
    }

    /**
     * Add a single CountByCoverageStatus entry
     *
     * @see CoverageStatistics#withCountByCoverageStatus
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CoverageStatistics addCountByCoverageStatusEntry(String key, Long value) {
        if (null == this.countByCoverageStatus) {
            this.countByCoverageStatus = new java.util.HashMap<String, Long>();
        }
        if (this.countByCoverageStatus.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.countByCoverageStatus.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CountByCoverageStatus.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageStatistics clearCountByCoverageStatusEntries() {
        this.countByCoverageStatus = null;
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
        if (getCountByResourceType() != null)
            sb.append("CountByResourceType: ").append(getCountByResourceType()).append(",");
        if (getCountByCoverageStatus() != null)
            sb.append("CountByCoverageStatus: ").append(getCountByCoverageStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageStatistics == false)
            return false;
        CoverageStatistics other = (CoverageStatistics) obj;
        if (other.getCountByResourceType() == null ^ this.getCountByResourceType() == null)
            return false;
        if (other.getCountByResourceType() != null && other.getCountByResourceType().equals(this.getCountByResourceType()) == false)
            return false;
        if (other.getCountByCoverageStatus() == null ^ this.getCountByCoverageStatus() == null)
            return false;
        if (other.getCountByCoverageStatus() != null && other.getCountByCoverageStatus().equals(this.getCountByCoverageStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountByResourceType() == null) ? 0 : getCountByResourceType().hashCode());
        hashCode = prime * hashCode + ((getCountByCoverageStatus() == null) ? 0 : getCountByCoverageStatus().hashCode());
        return hashCode;
    }

    @Override
    public CoverageStatistics clone() {
        try {
            return (CoverageStatistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.CoverageStatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
