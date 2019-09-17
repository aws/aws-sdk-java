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
package com.amazonaws.services.worklink.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/worklink-2018-09-25/FleetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The time when the fleet was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The time when the fleet was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The name of the fleet.
     * </p>
     */
    private String fleetName;
    /**
     * <p>
     * The name to display.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The identifier used by users to sign into the Amazon WorkLink app.
     * </p>
     */
    private String companyCode;
    /**
     * <p>
     * The status of the fleet.
     * </p>
     */
    private String fleetStatus;

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The ARN of the fleet.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @return The ARN of the fleet.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The ARN of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The time when the fleet was created.
     * </p>
     * 
     * @param createdTime
     *        The time when the fleet was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time when the fleet was created.
     * </p>
     * 
     * @return The time when the fleet was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time when the fleet was created.
     * </p>
     * 
     * @param createdTime
     *        The time when the fleet was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The time when the fleet was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the fleet was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the fleet was last updated.
     * </p>
     * 
     * @return The time when the fleet was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the fleet was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the fleet was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet.
     */

    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @return The name of the fleet.
     */

    public String getFleetName() {
        return this.fleetName;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param fleetName
     *        The name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withFleetName(String fleetName) {
        setFleetName(fleetName);
        return this;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * 
     * @param displayName
     *        The name to display.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * 
     * @return The name to display.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name to display.
     * </p>
     * 
     * @param displayName
     *        The name to display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The identifier used by users to sign into the Amazon WorkLink app.
     * </p>
     * 
     * @param companyCode
     *        The identifier used by users to sign into the Amazon WorkLink app.
     */

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /**
     * <p>
     * The identifier used by users to sign into the Amazon WorkLink app.
     * </p>
     * 
     * @return The identifier used by users to sign into the Amazon WorkLink app.
     */

    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * <p>
     * The identifier used by users to sign into the Amazon WorkLink app.
     * </p>
     * 
     * @param companyCode
     *        The identifier used by users to sign into the Amazon WorkLink app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSummary withCompanyCode(String companyCode) {
        setCompanyCode(companyCode);
        return this;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @param fleetStatus
     *        The status of the fleet.
     * @see FleetStatus
     */

    public void setFleetStatus(String fleetStatus) {
        this.fleetStatus = fleetStatus;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @return The status of the fleet.
     * @see FleetStatus
     */

    public String getFleetStatus() {
        return this.fleetStatus;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @param fleetStatus
     *        The status of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatus
     */

    public FleetSummary withFleetStatus(String fleetStatus) {
        setFleetStatus(fleetStatus);
        return this;
    }

    /**
     * <p>
     * The status of the fleet.
     * </p>
     * 
     * @param fleetStatus
     *        The status of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatus
     */

    public FleetSummary withFleetStatus(FleetStatus fleetStatus) {
        this.fleetStatus = fleetStatus.toString();
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
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getFleetName() != null)
            sb.append("FleetName: ").append(getFleetName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getCompanyCode() != null)
            sb.append("CompanyCode: ").append(getCompanyCode()).append(",");
        if (getFleetStatus() != null)
            sb.append("FleetStatus: ").append(getFleetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetSummary == false)
            return false;
        FleetSummary other = (FleetSummary) obj;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getFleetName() == null ^ this.getFleetName() == null)
            return false;
        if (other.getFleetName() != null && other.getFleetName().equals(this.getFleetName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getCompanyCode() == null ^ this.getCompanyCode() == null)
            return false;
        if (other.getCompanyCode() != null && other.getCompanyCode().equals(this.getCompanyCode()) == false)
            return false;
        if (other.getFleetStatus() == null ^ this.getFleetStatus() == null)
            return false;
        if (other.getFleetStatus() != null && other.getFleetStatus().equals(this.getFleetStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getFleetName() == null) ? 0 : getFleetName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getCompanyCode() == null) ? 0 : getCompanyCode().hashCode());
        hashCode = prime * hashCode + ((getFleetStatus() == null) ? 0 : getFleetStatus().hashCode());
        return hashCode;
    }

    @Override
    public FleetSummary clone() {
        try {
            return (FleetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.worklink.model.transform.FleetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
