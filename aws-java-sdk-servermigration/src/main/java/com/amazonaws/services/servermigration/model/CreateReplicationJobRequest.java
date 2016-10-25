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
public class CreateReplicationJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String serverId;

    private java.util.Date seedReplicationTime;

    private Integer frequency;

    private String licenseType;

    private String roleName;

    private String description;

    /**
     * @param serverId
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * @return
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * @param serverId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationJobRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * @param seedReplicationTime
     */

    public void setSeedReplicationTime(java.util.Date seedReplicationTime) {
        this.seedReplicationTime = seedReplicationTime;
    }

    /**
     * @return
     */

    public java.util.Date getSeedReplicationTime() {
        return this.seedReplicationTime;
    }

    /**
     * @param seedReplicationTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReplicationJobRequest withSeedReplicationTime(java.util.Date seedReplicationTime) {
        setSeedReplicationTime(seedReplicationTime);
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

    public CreateReplicationJobRequest withFrequency(Integer frequency) {
        setFrequency(frequency);
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

    public CreateReplicationJobRequest withLicenseType(String licenseType) {
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

    public CreateReplicationJobRequest withLicenseType(LicenseType licenseType) {
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

    public CreateReplicationJobRequest withRoleName(String roleName) {
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

    public CreateReplicationJobRequest withDescription(String description) {
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
        if (getServerId() != null)
            sb.append("ServerId: " + getServerId() + ",");
        if (getSeedReplicationTime() != null)
            sb.append("SeedReplicationTime: " + getSeedReplicationTime() + ",");
        if (getFrequency() != null)
            sb.append("Frequency: " + getFrequency() + ",");
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

        if (obj instanceof CreateReplicationJobRequest == false)
            return false;
        CreateReplicationJobRequest other = (CreateReplicationJobRequest) obj;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getSeedReplicationTime() == null ^ this.getSeedReplicationTime() == null)
            return false;
        if (other.getSeedReplicationTime() != null && other.getSeedReplicationTime().equals(this.getSeedReplicationTime()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
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

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getSeedReplicationTime() == null) ? 0 : getSeedReplicationTime().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateReplicationJobRequest clone() {
        return (CreateReplicationJobRequest) super.clone();
    }
}
