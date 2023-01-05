/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateWave" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWaveResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Wave ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Wave creation dateTime.
     * </p>
     */
    private String creationDateTime;
    /**
     * <p>
     * Wave description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Wave archival status.
     * </p>
     */
    private Boolean isArchived;
    /**
     * <p>
     * Wave last modified dateTime.
     * </p>
     */
    private String lastModifiedDateTime;
    /**
     * <p>
     * Wave name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Wave tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Wave aggregated status.
     * </p>
     */
    private WaveAggregatedStatus waveAggregatedStatus;
    /**
     * <p>
     * Wave ID.
     * </p>
     */
    private String waveID;

    /**
     * <p>
     * Wave ARN.
     * </p>
     * 
     * @param arn
     *        Wave ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Wave ARN.
     * </p>
     * 
     * @return Wave ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Wave ARN.
     * </p>
     * 
     * @param arn
     *        Wave ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Wave creation dateTime.
     * </p>
     * 
     * @param creationDateTime
     *        Wave creation dateTime.
     */

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * Wave creation dateTime.
     * </p>
     * 
     * @return Wave creation dateTime.
     */

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * Wave creation dateTime.
     * </p>
     * 
     * @param creationDateTime
     *        Wave creation dateTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult withCreationDateTime(String creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * Wave description.
     * </p>
     * 
     * @param description
     *        Wave description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Wave description.
     * </p>
     * 
     * @return Wave description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Wave description.
     * </p>
     * 
     * @param description
     *        Wave description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Wave archival status.
     * </p>
     * 
     * @param isArchived
     *        Wave archival status.
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Wave archival status.
     * </p>
     * 
     * @return Wave archival status.
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Wave archival status.
     * </p>
     * 
     * @param isArchived
     *        Wave archival status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * <p>
     * Wave archival status.
     * </p>
     * 
     * @return Wave archival status.
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Wave last modified dateTime.
     * </p>
     * 
     * @param lastModifiedDateTime
     *        Wave last modified dateTime.
     */

    public void setLastModifiedDateTime(String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    /**
     * <p>
     * Wave last modified dateTime.
     * </p>
     * 
     * @return Wave last modified dateTime.
     */

    public String getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * <p>
     * Wave last modified dateTime.
     * </p>
     * 
     * @param lastModifiedDateTime
     *        Wave last modified dateTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult withLastModifiedDateTime(String lastModifiedDateTime) {
        setLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /**
     * <p>
     * Wave name.
     * </p>
     * 
     * @param name
     *        Wave name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Wave name.
     * </p>
     * 
     * @return Wave name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Wave name.
     * </p>
     * 
     * @param name
     *        Wave name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Wave tags.
     * </p>
     * 
     * @return Wave tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Wave tags.
     * </p>
     * 
     * @param tags
     *        Wave tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Wave tags.
     * </p>
     * 
     * @param tags
     *        Wave tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWaveResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Wave aggregated status.
     * </p>
     * 
     * @param waveAggregatedStatus
     *        Wave aggregated status.
     */

    public void setWaveAggregatedStatus(WaveAggregatedStatus waveAggregatedStatus) {
        this.waveAggregatedStatus = waveAggregatedStatus;
    }

    /**
     * <p>
     * Wave aggregated status.
     * </p>
     * 
     * @return Wave aggregated status.
     */

    public WaveAggregatedStatus getWaveAggregatedStatus() {
        return this.waveAggregatedStatus;
    }

    /**
     * <p>
     * Wave aggregated status.
     * </p>
     * 
     * @param waveAggregatedStatus
     *        Wave aggregated status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult withWaveAggregatedStatus(WaveAggregatedStatus waveAggregatedStatus) {
        setWaveAggregatedStatus(waveAggregatedStatus);
        return this;
    }

    /**
     * <p>
     * Wave ID.
     * </p>
     * 
     * @param waveID
     *        Wave ID.
     */

    public void setWaveID(String waveID) {
        this.waveID = waveID;
    }

    /**
     * <p>
     * Wave ID.
     * </p>
     * 
     * @return Wave ID.
     */

    public String getWaveID() {
        return this.waveID;
    }

    /**
     * <p>
     * Wave ID.
     * </p>
     * 
     * @param waveID
     *        Wave ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWaveResult withWaveID(String waveID) {
        setWaveID(waveID);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIsArchived() != null)
            sb.append("IsArchived: ").append(getIsArchived()).append(",");
        if (getLastModifiedDateTime() != null)
            sb.append("LastModifiedDateTime: ").append(getLastModifiedDateTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getWaveAggregatedStatus() != null)
            sb.append("WaveAggregatedStatus: ").append(getWaveAggregatedStatus()).append(",");
        if (getWaveID() != null)
            sb.append("WaveID: ").append(getWaveID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWaveResult == false)
            return false;
        CreateWaveResult other = (CreateWaveResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIsArchived() == null ^ this.getIsArchived() == null)
            return false;
        if (other.getIsArchived() != null && other.getIsArchived().equals(this.getIsArchived()) == false)
            return false;
        if (other.getLastModifiedDateTime() == null ^ this.getLastModifiedDateTime() == null)
            return false;
        if (other.getLastModifiedDateTime() != null && other.getLastModifiedDateTime().equals(this.getLastModifiedDateTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWaveAggregatedStatus() == null ^ this.getWaveAggregatedStatus() == null)
            return false;
        if (other.getWaveAggregatedStatus() != null && other.getWaveAggregatedStatus().equals(this.getWaveAggregatedStatus()) == false)
            return false;
        if (other.getWaveID() == null ^ this.getWaveID() == null)
            return false;
        if (other.getWaveID() != null && other.getWaveID().equals(this.getWaveID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDateTime() == null) ? 0 : getLastModifiedDateTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWaveAggregatedStatus() == null) ? 0 : getWaveAggregatedStatus().hashCode());
        hashCode = prime * hashCode + ((getWaveID() == null) ? 0 : getWaveID().hashCode());
        return hashCode;
    }

    @Override
    public CreateWaveResult clone() {
        try {
            return (CreateWaveResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
