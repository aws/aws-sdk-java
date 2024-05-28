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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about provisioning resources for an DMS serverless replication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ProvisionData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current provisioning state
     * </p>
     */
    private String provisionState;
    /**
     * <p>
     * The number of capacity units the replication is using.
     * </p>
     */
    private Integer provisionedCapacityUnits;
    /**
     * <p>
     * The timestamp when DMS provisioned replication resources.
     * </p>
     */
    private java.util.Date dateProvisioned;
    /**
     * <p>
     * Whether the new provisioning is available to the replication.
     * </p>
     */
    private Boolean isNewProvisioningAvailable;
    /**
     * <p>
     * The timestamp when provisioning became available.
     * </p>
     */
    private java.util.Date dateNewProvisioningDataAvailable;
    /**
     * <p>
     * A message describing the reason that DMS provisioned new resources for the serverless replication.
     * </p>
     */
    private String reasonForNewProvisioningData;

    /**
     * <p>
     * The current provisioning state
     * </p>
     * 
     * @param provisionState
     *        The current provisioning state
     */

    public void setProvisionState(String provisionState) {
        this.provisionState = provisionState;
    }

    /**
     * <p>
     * The current provisioning state
     * </p>
     * 
     * @return The current provisioning state
     */

    public String getProvisionState() {
        return this.provisionState;
    }

    /**
     * <p>
     * The current provisioning state
     * </p>
     * 
     * @param provisionState
     *        The current provisioning state
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionData withProvisionState(String provisionState) {
        setProvisionState(provisionState);
        return this;
    }

    /**
     * <p>
     * The number of capacity units the replication is using.
     * </p>
     * 
     * @param provisionedCapacityUnits
     *        The number of capacity units the replication is using.
     */

    public void setProvisionedCapacityUnits(Integer provisionedCapacityUnits) {
        this.provisionedCapacityUnits = provisionedCapacityUnits;
    }

    /**
     * <p>
     * The number of capacity units the replication is using.
     * </p>
     * 
     * @return The number of capacity units the replication is using.
     */

    public Integer getProvisionedCapacityUnits() {
        return this.provisionedCapacityUnits;
    }

    /**
     * <p>
     * The number of capacity units the replication is using.
     * </p>
     * 
     * @param provisionedCapacityUnits
     *        The number of capacity units the replication is using.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionData withProvisionedCapacityUnits(Integer provisionedCapacityUnits) {
        setProvisionedCapacityUnits(provisionedCapacityUnits);
        return this;
    }

    /**
     * <p>
     * The timestamp when DMS provisioned replication resources.
     * </p>
     * 
     * @param dateProvisioned
     *        The timestamp when DMS provisioned replication resources.
     */

    public void setDateProvisioned(java.util.Date dateProvisioned) {
        this.dateProvisioned = dateProvisioned;
    }

    /**
     * <p>
     * The timestamp when DMS provisioned replication resources.
     * </p>
     * 
     * @return The timestamp when DMS provisioned replication resources.
     */

    public java.util.Date getDateProvisioned() {
        return this.dateProvisioned;
    }

    /**
     * <p>
     * The timestamp when DMS provisioned replication resources.
     * </p>
     * 
     * @param dateProvisioned
     *        The timestamp when DMS provisioned replication resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionData withDateProvisioned(java.util.Date dateProvisioned) {
        setDateProvisioned(dateProvisioned);
        return this;
    }

    /**
     * <p>
     * Whether the new provisioning is available to the replication.
     * </p>
     * 
     * @param isNewProvisioningAvailable
     *        Whether the new provisioning is available to the replication.
     */

    public void setIsNewProvisioningAvailable(Boolean isNewProvisioningAvailable) {
        this.isNewProvisioningAvailable = isNewProvisioningAvailable;
    }

    /**
     * <p>
     * Whether the new provisioning is available to the replication.
     * </p>
     * 
     * @return Whether the new provisioning is available to the replication.
     */

    public Boolean getIsNewProvisioningAvailable() {
        return this.isNewProvisioningAvailable;
    }

    /**
     * <p>
     * Whether the new provisioning is available to the replication.
     * </p>
     * 
     * @param isNewProvisioningAvailable
     *        Whether the new provisioning is available to the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionData withIsNewProvisioningAvailable(Boolean isNewProvisioningAvailable) {
        setIsNewProvisioningAvailable(isNewProvisioningAvailable);
        return this;
    }

    /**
     * <p>
     * Whether the new provisioning is available to the replication.
     * </p>
     * 
     * @return Whether the new provisioning is available to the replication.
     */

    public Boolean isNewProvisioningAvailable() {
        return this.isNewProvisioningAvailable;
    }

    /**
     * <p>
     * The timestamp when provisioning became available.
     * </p>
     * 
     * @param dateNewProvisioningDataAvailable
     *        The timestamp when provisioning became available.
     */

    public void setDateNewProvisioningDataAvailable(java.util.Date dateNewProvisioningDataAvailable) {
        this.dateNewProvisioningDataAvailable = dateNewProvisioningDataAvailable;
    }

    /**
     * <p>
     * The timestamp when provisioning became available.
     * </p>
     * 
     * @return The timestamp when provisioning became available.
     */

    public java.util.Date getDateNewProvisioningDataAvailable() {
        return this.dateNewProvisioningDataAvailable;
    }

    /**
     * <p>
     * The timestamp when provisioning became available.
     * </p>
     * 
     * @param dateNewProvisioningDataAvailable
     *        The timestamp when provisioning became available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionData withDateNewProvisioningDataAvailable(java.util.Date dateNewProvisioningDataAvailable) {
        setDateNewProvisioningDataAvailable(dateNewProvisioningDataAvailable);
        return this;
    }

    /**
     * <p>
     * A message describing the reason that DMS provisioned new resources for the serverless replication.
     * </p>
     * 
     * @param reasonForNewProvisioningData
     *        A message describing the reason that DMS provisioned new resources for the serverless replication.
     */

    public void setReasonForNewProvisioningData(String reasonForNewProvisioningData) {
        this.reasonForNewProvisioningData = reasonForNewProvisioningData;
    }

    /**
     * <p>
     * A message describing the reason that DMS provisioned new resources for the serverless replication.
     * </p>
     * 
     * @return A message describing the reason that DMS provisioned new resources for the serverless replication.
     */

    public String getReasonForNewProvisioningData() {
        return this.reasonForNewProvisioningData;
    }

    /**
     * <p>
     * A message describing the reason that DMS provisioned new resources for the serverless replication.
     * </p>
     * 
     * @param reasonForNewProvisioningData
     *        A message describing the reason that DMS provisioned new resources for the serverless replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisionData withReasonForNewProvisioningData(String reasonForNewProvisioningData) {
        setReasonForNewProvisioningData(reasonForNewProvisioningData);
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
        if (getProvisionState() != null)
            sb.append("ProvisionState: ").append(getProvisionState()).append(",");
        if (getProvisionedCapacityUnits() != null)
            sb.append("ProvisionedCapacityUnits: ").append(getProvisionedCapacityUnits()).append(",");
        if (getDateProvisioned() != null)
            sb.append("DateProvisioned: ").append(getDateProvisioned()).append(",");
        if (getIsNewProvisioningAvailable() != null)
            sb.append("IsNewProvisioningAvailable: ").append(getIsNewProvisioningAvailable()).append(",");
        if (getDateNewProvisioningDataAvailable() != null)
            sb.append("DateNewProvisioningDataAvailable: ").append(getDateNewProvisioningDataAvailable()).append(",");
        if (getReasonForNewProvisioningData() != null)
            sb.append("ReasonForNewProvisioningData: ").append(getReasonForNewProvisioningData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisionData == false)
            return false;
        ProvisionData other = (ProvisionData) obj;
        if (other.getProvisionState() == null ^ this.getProvisionState() == null)
            return false;
        if (other.getProvisionState() != null && other.getProvisionState().equals(this.getProvisionState()) == false)
            return false;
        if (other.getProvisionedCapacityUnits() == null ^ this.getProvisionedCapacityUnits() == null)
            return false;
        if (other.getProvisionedCapacityUnits() != null && other.getProvisionedCapacityUnits().equals(this.getProvisionedCapacityUnits()) == false)
            return false;
        if (other.getDateProvisioned() == null ^ this.getDateProvisioned() == null)
            return false;
        if (other.getDateProvisioned() != null && other.getDateProvisioned().equals(this.getDateProvisioned()) == false)
            return false;
        if (other.getIsNewProvisioningAvailable() == null ^ this.getIsNewProvisioningAvailable() == null)
            return false;
        if (other.getIsNewProvisioningAvailable() != null && other.getIsNewProvisioningAvailable().equals(this.getIsNewProvisioningAvailable()) == false)
            return false;
        if (other.getDateNewProvisioningDataAvailable() == null ^ this.getDateNewProvisioningDataAvailable() == null)
            return false;
        if (other.getDateNewProvisioningDataAvailable() != null
                && other.getDateNewProvisioningDataAvailable().equals(this.getDateNewProvisioningDataAvailable()) == false)
            return false;
        if (other.getReasonForNewProvisioningData() == null ^ this.getReasonForNewProvisioningData() == null)
            return false;
        if (other.getReasonForNewProvisioningData() != null && other.getReasonForNewProvisioningData().equals(this.getReasonForNewProvisioningData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionState() == null) ? 0 : getProvisionState().hashCode());
        hashCode = prime * hashCode + ((getProvisionedCapacityUnits() == null) ? 0 : getProvisionedCapacityUnits().hashCode());
        hashCode = prime * hashCode + ((getDateProvisioned() == null) ? 0 : getDateProvisioned().hashCode());
        hashCode = prime * hashCode + ((getIsNewProvisioningAvailable() == null) ? 0 : getIsNewProvisioningAvailable().hashCode());
        hashCode = prime * hashCode + ((getDateNewProvisioningDataAvailable() == null) ? 0 : getDateNewProvisioningDataAvailable().hashCode());
        hashCode = prime * hashCode + ((getReasonForNewProvisioningData() == null) ? 0 : getReasonForNewProvisioningData().hashCode());
        return hashCode;
    }

    @Override
    public ProvisionData clone() {
        try {
            return (ProvisionData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ProvisionDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
