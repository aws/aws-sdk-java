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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The set of Regions that your Incident Manager data will be replicated to and the KMS key used to encrypt the data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ReplicationSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details about who created the replication set.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * When the replication set was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * Determines if the replication set deletion protection is enabled or not. If deletion protection is enabled, you
     * can't delete the last Region in the replication set.
     * </p>
     */
    private Boolean deletionProtected;
    /**
     * <p>
     * Who last modified the replication set.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * When the replication set was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The map between each Region in your replication set and the KMS key that is used to encrypt the data in that
     * Region.
     * </p>
     */
    private java.util.Map<String, RegionInfo> regionMap;
    /**
     * <p>
     * The status of the replication set. If the replication set is still pending, you can't use Incident Manager
     * functionality.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Details about who created the replication set.
     * </p>
     * 
     * @param createdBy
     *        Details about who created the replication set.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Details about who created the replication set.
     * </p>
     * 
     * @return Details about who created the replication set.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Details about who created the replication set.
     * </p>
     * 
     * @param createdBy
     *        Details about who created the replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSet withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * When the replication set was created.
     * </p>
     * 
     * @param createdTime
     *        When the replication set was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the replication set was created.
     * </p>
     * 
     * @return When the replication set was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * When the replication set was created.
     * </p>
     * 
     * @param createdTime
     *        When the replication set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSet withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * Determines if the replication set deletion protection is enabled or not. If deletion protection is enabled, you
     * can't delete the last Region in the replication set.
     * </p>
     * 
     * @param deletionProtected
     *        Determines if the replication set deletion protection is enabled or not. If deletion protection is
     *        enabled, you can't delete the last Region in the replication set.
     */

    public void setDeletionProtected(Boolean deletionProtected) {
        this.deletionProtected = deletionProtected;
    }

    /**
     * <p>
     * Determines if the replication set deletion protection is enabled or not. If deletion protection is enabled, you
     * can't delete the last Region in the replication set.
     * </p>
     * 
     * @return Determines if the replication set deletion protection is enabled or not. If deletion protection is
     *         enabled, you can't delete the last Region in the replication set.
     */

    public Boolean getDeletionProtected() {
        return this.deletionProtected;
    }

    /**
     * <p>
     * Determines if the replication set deletion protection is enabled or not. If deletion protection is enabled, you
     * can't delete the last Region in the replication set.
     * </p>
     * 
     * @param deletionProtected
     *        Determines if the replication set deletion protection is enabled or not. If deletion protection is
     *        enabled, you can't delete the last Region in the replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSet withDeletionProtected(Boolean deletionProtected) {
        setDeletionProtected(deletionProtected);
        return this;
    }

    /**
     * <p>
     * Determines if the replication set deletion protection is enabled or not. If deletion protection is enabled, you
     * can't delete the last Region in the replication set.
     * </p>
     * 
     * @return Determines if the replication set deletion protection is enabled or not. If deletion protection is
     *         enabled, you can't delete the last Region in the replication set.
     */

    public Boolean isDeletionProtected() {
        return this.deletionProtected;
    }

    /**
     * <p>
     * Who last modified the replication set.
     * </p>
     * 
     * @param lastModifiedBy
     *        Who last modified the replication set.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the replication set.
     * </p>
     * 
     * @return Who last modified the replication set.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the replication set.
     * </p>
     * 
     * @param lastModifiedBy
     *        Who last modified the replication set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSet withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * When the replication set was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the replication set was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the replication set was last updated.
     * </p>
     * 
     * @return When the replication set was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the replication set was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the replication set was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSet withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The map between each Region in your replication set and the KMS key that is used to encrypt the data in that
     * Region.
     * </p>
     * 
     * @return The map between each Region in your replication set and the KMS key that is used to encrypt the data in
     *         that Region.
     */

    public java.util.Map<String, RegionInfo> getRegionMap() {
        return regionMap;
    }

    /**
     * <p>
     * The map between each Region in your replication set and the KMS key that is used to encrypt the data in that
     * Region.
     * </p>
     * 
     * @param regionMap
     *        The map between each Region in your replication set and the KMS key that is used to encrypt the data in
     *        that Region.
     */

    public void setRegionMap(java.util.Map<String, RegionInfo> regionMap) {
        this.regionMap = regionMap;
    }

    /**
     * <p>
     * The map between each Region in your replication set and the KMS key that is used to encrypt the data in that
     * Region.
     * </p>
     * 
     * @param regionMap
     *        The map between each Region in your replication set and the KMS key that is used to encrypt the data in
     *        that Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSet withRegionMap(java.util.Map<String, RegionInfo> regionMap) {
        setRegionMap(regionMap);
        return this;
    }

    /**
     * Add a single RegionMap entry
     *
     * @see ReplicationSet#withRegionMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSet addRegionMapEntry(String key, RegionInfo value) {
        if (null == this.regionMap) {
            this.regionMap = new java.util.HashMap<String, RegionInfo>();
        }
        if (this.regionMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.regionMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RegionMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationSet clearRegionMapEntries() {
        this.regionMap = null;
        return this;
    }

    /**
     * <p>
     * The status of the replication set. If the replication set is still pending, you can't use Incident Manager
     * functionality.
     * </p>
     * 
     * @param status
     *        The status of the replication set. If the replication set is still pending, you can't use Incident Manager
     *        functionality.
     * @see ReplicationSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the replication set. If the replication set is still pending, you can't use Incident Manager
     * functionality.
     * </p>
     * 
     * @return The status of the replication set. If the replication set is still pending, you can't use Incident
     *         Manager functionality.
     * @see ReplicationSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the replication set. If the replication set is still pending, you can't use Incident Manager
     * functionality.
     * </p>
     * 
     * @param status
     *        The status of the replication set. If the replication set is still pending, you can't use Incident Manager
     *        functionality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationSetStatus
     */

    public ReplicationSet withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the replication set. If the replication set is still pending, you can't use Incident Manager
     * functionality.
     * </p>
     * 
     * @param status
     *        The status of the replication set. If the replication set is still pending, you can't use Incident Manager
     *        functionality.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationSetStatus
     */

    public ReplicationSet withStatus(ReplicationSetStatus status) {
        this.status = status.toString();
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getDeletionProtected() != null)
            sb.append("DeletionProtected: ").append(getDeletionProtected()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getRegionMap() != null)
            sb.append("RegionMap: ").append(getRegionMap()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationSet == false)
            return false;
        ReplicationSet other = (ReplicationSet) obj;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getDeletionProtected() == null ^ this.getDeletionProtected() == null)
            return false;
        if (other.getDeletionProtected() != null && other.getDeletionProtected().equals(this.getDeletionProtected()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getRegionMap() == null ^ this.getRegionMap() == null)
            return false;
        if (other.getRegionMap() != null && other.getRegionMap().equals(this.getRegionMap()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtected() == null) ? 0 : getDeletionProtected().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getRegionMap() == null) ? 0 : getRegionMap().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationSet clone() {
        try {
            return (ReplicationSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.ReplicationSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
