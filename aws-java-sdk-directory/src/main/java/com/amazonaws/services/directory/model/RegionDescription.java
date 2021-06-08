/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The replicated Region information for a directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/RegionDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The name of the Region. For example, <code>us-east-1</code>.
     * </p>
     */
    private String regionName;
    /**
     * <p>
     * Specifies whether the Region is the primary Region or an additional Region.
     * </p>
     */
    private String regionType;
    /**
     * <p>
     * The status of the replication process for the specified Region.
     * </p>
     */
    private String status;

    private DirectoryVpcSettings vpcSettings;
    /**
     * <p>
     * The desired number of domain controllers in the specified Region for the specified directory.
     * </p>
     */
    private Integer desiredNumberOfDomainControllers;
    /**
     * <p>
     * Specifies when the Region replication began.
     * </p>
     */
    private java.util.Date launchTime;
    /**
     * <p>
     * The date and time that the Region status was last updated.
     * </p>
     */
    private java.util.Date statusLastUpdatedDateTime;
    /**
     * <p>
     * The date and time that the Region description was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @return The identifier of the directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionDescription withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The name of the Region. For example, <code>us-east-1</code>.
     * </p>
     * 
     * @param regionName
     *        The name of the Region. For example, <code>us-east-1</code>.
     */

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * <p>
     * The name of the Region. For example, <code>us-east-1</code>.
     * </p>
     * 
     * @return The name of the Region. For example, <code>us-east-1</code>.
     */

    public String getRegionName() {
        return this.regionName;
    }

    /**
     * <p>
     * The name of the Region. For example, <code>us-east-1</code>.
     * </p>
     * 
     * @param regionName
     *        The name of the Region. For example, <code>us-east-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionDescription withRegionName(String regionName) {
        setRegionName(regionName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Region is the primary Region or an additional Region.
     * </p>
     * 
     * @param regionType
     *        Specifies whether the Region is the primary Region or an additional Region.
     * @see RegionType
     */

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    /**
     * <p>
     * Specifies whether the Region is the primary Region or an additional Region.
     * </p>
     * 
     * @return Specifies whether the Region is the primary Region or an additional Region.
     * @see RegionType
     */

    public String getRegionType() {
        return this.regionType;
    }

    /**
     * <p>
     * Specifies whether the Region is the primary Region or an additional Region.
     * </p>
     * 
     * @param regionType
     *        Specifies whether the Region is the primary Region or an additional Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionType
     */

    public RegionDescription withRegionType(String regionType) {
        setRegionType(regionType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Region is the primary Region or an additional Region.
     * </p>
     * 
     * @param regionType
     *        Specifies whether the Region is the primary Region or an additional Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionType
     */

    public RegionDescription withRegionType(RegionType regionType) {
        this.regionType = regionType.toString();
        return this;
    }

    /**
     * <p>
     * The status of the replication process for the specified Region.
     * </p>
     * 
     * @param status
     *        The status of the replication process for the specified Region.
     * @see DirectoryStage
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the replication process for the specified Region.
     * </p>
     * 
     * @return The status of the replication process for the specified Region.
     * @see DirectoryStage
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the replication process for the specified Region.
     * </p>
     * 
     * @param status
     *        The status of the replication process for the specified Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryStage
     */

    public RegionDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the replication process for the specified Region.
     * </p>
     * 
     * @param status
     *        The status of the replication process for the specified Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DirectoryStage
     */

    public RegionDescription withStatus(DirectoryStage status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @param vpcSettings
     */

    public void setVpcSettings(DirectoryVpcSettings vpcSettings) {
        this.vpcSettings = vpcSettings;
    }

    /**
     * @return
     */

    public DirectoryVpcSettings getVpcSettings() {
        return this.vpcSettings;
    }

    /**
     * @param vpcSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionDescription withVpcSettings(DirectoryVpcSettings vpcSettings) {
        setVpcSettings(vpcSettings);
        return this;
    }

    /**
     * <p>
     * The desired number of domain controllers in the specified Region for the specified directory.
     * </p>
     * 
     * @param desiredNumberOfDomainControllers
     *        The desired number of domain controllers in the specified Region for the specified directory.
     */

    public void setDesiredNumberOfDomainControllers(Integer desiredNumberOfDomainControllers) {
        this.desiredNumberOfDomainControllers = desiredNumberOfDomainControllers;
    }

    /**
     * <p>
     * The desired number of domain controllers in the specified Region for the specified directory.
     * </p>
     * 
     * @return The desired number of domain controllers in the specified Region for the specified directory.
     */

    public Integer getDesiredNumberOfDomainControllers() {
        return this.desiredNumberOfDomainControllers;
    }

    /**
     * <p>
     * The desired number of domain controllers in the specified Region for the specified directory.
     * </p>
     * 
     * @param desiredNumberOfDomainControllers
     *        The desired number of domain controllers in the specified Region for the specified directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionDescription withDesiredNumberOfDomainControllers(Integer desiredNumberOfDomainControllers) {
        setDesiredNumberOfDomainControllers(desiredNumberOfDomainControllers);
        return this;
    }

    /**
     * <p>
     * Specifies when the Region replication began.
     * </p>
     * 
     * @param launchTime
     *        Specifies when the Region replication began.
     */

    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * <p>
     * Specifies when the Region replication began.
     * </p>
     * 
     * @return Specifies when the Region replication began.
     */

    public java.util.Date getLaunchTime() {
        return this.launchTime;
    }

    /**
     * <p>
     * Specifies when the Region replication began.
     * </p>
     * 
     * @param launchTime
     *        Specifies when the Region replication began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionDescription withLaunchTime(java.util.Date launchTime) {
        setLaunchTime(launchTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the Region status was last updated.
     * </p>
     * 
     * @param statusLastUpdatedDateTime
     *        The date and time that the Region status was last updated.
     */

    public void setStatusLastUpdatedDateTime(java.util.Date statusLastUpdatedDateTime) {
        this.statusLastUpdatedDateTime = statusLastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the Region status was last updated.
     * </p>
     * 
     * @return The date and time that the Region status was last updated.
     */

    public java.util.Date getStatusLastUpdatedDateTime() {
        return this.statusLastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the Region status was last updated.
     * </p>
     * 
     * @param statusLastUpdatedDateTime
     *        The date and time that the Region status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionDescription withStatusLastUpdatedDateTime(java.util.Date statusLastUpdatedDateTime) {
        setStatusLastUpdatedDateTime(statusLastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the Region description was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the Region description was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the Region description was last updated.
     * </p>
     * 
     * @return The date and time that the Region description was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the Region description was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the Region description was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionDescription withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getRegionName() != null)
            sb.append("RegionName: ").append(getRegionName()).append(",");
        if (getRegionType() != null)
            sb.append("RegionType: ").append(getRegionType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVpcSettings() != null)
            sb.append("VpcSettings: ").append(getVpcSettings()).append(",");
        if (getDesiredNumberOfDomainControllers() != null)
            sb.append("DesiredNumberOfDomainControllers: ").append(getDesiredNumberOfDomainControllers()).append(",");
        if (getLaunchTime() != null)
            sb.append("LaunchTime: ").append(getLaunchTime()).append(",");
        if (getStatusLastUpdatedDateTime() != null)
            sb.append("StatusLastUpdatedDateTime: ").append(getStatusLastUpdatedDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegionDescription == false)
            return false;
        RegionDescription other = (RegionDescription) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getRegionName() == null ^ this.getRegionName() == null)
            return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false)
            return false;
        if (other.getRegionType() == null ^ this.getRegionType() == null)
            return false;
        if (other.getRegionType() != null && other.getRegionType().equals(this.getRegionType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVpcSettings() == null ^ this.getVpcSettings() == null)
            return false;
        if (other.getVpcSettings() != null && other.getVpcSettings().equals(this.getVpcSettings()) == false)
            return false;
        if (other.getDesiredNumberOfDomainControllers() == null ^ this.getDesiredNumberOfDomainControllers() == null)
            return false;
        if (other.getDesiredNumberOfDomainControllers() != null
                && other.getDesiredNumberOfDomainControllers().equals(this.getDesiredNumberOfDomainControllers()) == false)
            return false;
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null)
            return false;
        if (other.getLaunchTime() != null && other.getLaunchTime().equals(this.getLaunchTime()) == false)
            return false;
        if (other.getStatusLastUpdatedDateTime() == null ^ this.getStatusLastUpdatedDateTime() == null)
            return false;
        if (other.getStatusLastUpdatedDateTime() != null && other.getStatusLastUpdatedDateTime().equals(this.getStatusLastUpdatedDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode());
        hashCode = prime * hashCode + ((getRegionType() == null) ? 0 : getRegionType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVpcSettings() == null) ? 0 : getVpcSettings().hashCode());
        hashCode = prime * hashCode + ((getDesiredNumberOfDomainControllers() == null) ? 0 : getDesiredNumberOfDomainControllers().hashCode());
        hashCode = prime * hashCode + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode());
        hashCode = prime * hashCode + ((getStatusLastUpdatedDateTime() == null) ? 0 : getStatusLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public RegionDescription clone() {
        try {
            return (RegionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.RegionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
