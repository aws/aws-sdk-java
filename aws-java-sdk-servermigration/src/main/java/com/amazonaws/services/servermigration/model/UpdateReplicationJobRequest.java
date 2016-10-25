/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateReplicationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String replicationJobId;

    private Integer frequency;

    private java.util.Date nextReplicationRunStartTime;

    private String licenseType;

    private String roleName;

    private String description;

    /**
     * @param replicationJobId
     */

    public void setReplicationJobId(String replicationJobId) {
        this.replicationJobId = replicationJobId;
    }

    /**
     * @return
     */

    public String getReplicationJobId() {
        return this.replicationJobId;
    }

    /**
     * @param replicationJobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withReplicationJobId(String replicationJobId) {
        setReplicationJobId(replicationJobId);
        return this;
    }

    /**
     * @param frequency
     */

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * @return
     */

    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * @param frequency
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withFrequency(Integer frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * @param nextReplicationRunStartTime
     */

    public void setNextReplicationRunStartTime(java.util.Date nextReplicationRunStartTime) {
        this.nextReplicationRunStartTime = nextReplicationRunStartTime;
    }

    /**
     * @return
     */

    public java.util.Date getNextReplicationRunStartTime() {
        return this.nextReplicationRunStartTime;
    }

    /**
     * @param nextReplicationRunStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withNextReplicationRunStartTime(java.util.Date nextReplicationRunStartTime) {
        setNextReplicationRunStartTime(nextReplicationRunStartTime);
        return this;
    }

    /**
     * @param licenseType
     * @see LicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * @return
     * @see LicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * @param licenseType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public UpdateReplicationJobRequest withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * @param licenseType
     * @see LicenseType
     */

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType.toString();
    }

    /**
     * @param licenseType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public UpdateReplicationJobRequest withLicenseType(LicenseType licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * @param roleName
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @param roleName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReplicationJobRequest withDescription(String description) {
        setDescription(description);
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
        if (getReplicationJobId() != null)
            sb.append("ReplicationJobId: " + getReplicationJobId() + ",");
        if (getFrequency() != null)
            sb.append("Frequency: " + getFrequency() + ",");
        if (getNextReplicationRunStartTime() != null)
            sb.append("NextReplicationRunStartTime: " + getNextReplicationRunStartTime() + ",");
        if (getLicenseType() != null)
            sb.append("LicenseType: " + getLicenseType() + ",");
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReplicationJobRequest == false)
            return false;
        UpdateReplicationJobRequest other = (UpdateReplicationJobRequest) obj;
        if (other.getReplicationJobId() == null ^ this.getReplicationJobId() == null)
            return false;
        if (other.getReplicationJobId() != null && other.getReplicationJobId().equals(this.getReplicationJobId()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getNextReplicationRunStartTime() == null ^ this.getNextReplicationRunStartTime() == null)
            return false;
        if (other.getNextReplicationRunStartTime() != null && other.getNextReplicationRunStartTime().equals(this.getNextReplicationRunStartTime()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationJobId() == null) ? 0 : getReplicationJobId().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getNextReplicationRunStartTime() == null) ? 0 : getNextReplicationRunStartTime().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReplicationJobRequest clone() {
        return (UpdateReplicationJobRequest) super.clone();
    }
}
