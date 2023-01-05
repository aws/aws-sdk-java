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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/CreateApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Application aggregated status.
     * </p>
     */
    private ApplicationAggregatedStatus applicationAggregatedStatus;
    /**
     * <p>
     * Application ID.
     * </p>
     */
    private String applicationID;
    /**
     * <p>
     * Application ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Application creation dateTime.
     * </p>
     */
    private String creationDateTime;
    /**
     * <p>
     * Application description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Application archival status.
     * </p>
     */
    private Boolean isArchived;
    /**
     * <p>
     * Application last modified dateTime.
     * </p>
     */
    private String lastModifiedDateTime;
    /**
     * <p>
     * Application name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Application tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Application wave ID.
     * </p>
     */
    private String waveID;

    /**
     * <p>
     * Application aggregated status.
     * </p>
     * 
     * @param applicationAggregatedStatus
     *        Application aggregated status.
     */

    public void setApplicationAggregatedStatus(ApplicationAggregatedStatus applicationAggregatedStatus) {
        this.applicationAggregatedStatus = applicationAggregatedStatus;
    }

    /**
     * <p>
     * Application aggregated status.
     * </p>
     * 
     * @return Application aggregated status.
     */

    public ApplicationAggregatedStatus getApplicationAggregatedStatus() {
        return this.applicationAggregatedStatus;
    }

    /**
     * <p>
     * Application aggregated status.
     * </p>
     * 
     * @param applicationAggregatedStatus
     *        Application aggregated status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withApplicationAggregatedStatus(ApplicationAggregatedStatus applicationAggregatedStatus) {
        setApplicationAggregatedStatus(applicationAggregatedStatus);
        return this;
    }

    /**
     * <p>
     * Application ID.
     * </p>
     * 
     * @param applicationID
     *        Application ID.
     */

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    /**
     * <p>
     * Application ID.
     * </p>
     * 
     * @return Application ID.
     */

    public String getApplicationID() {
        return this.applicationID;
    }

    /**
     * <p>
     * Application ID.
     * </p>
     * 
     * @param applicationID
     *        Application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withApplicationID(String applicationID) {
        setApplicationID(applicationID);
        return this;
    }

    /**
     * <p>
     * Application ARN.
     * </p>
     * 
     * @param arn
     *        Application ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Application ARN.
     * </p>
     * 
     * @return Application ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Application ARN.
     * </p>
     * 
     * @param arn
     *        Application ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Application creation dateTime.
     * </p>
     * 
     * @param creationDateTime
     *        Application creation dateTime.
     */

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * Application creation dateTime.
     * </p>
     * 
     * @return Application creation dateTime.
     */

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * Application creation dateTime.
     * </p>
     * 
     * @param creationDateTime
     *        Application creation dateTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withCreationDateTime(String creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * Application description.
     * </p>
     * 
     * @param description
     *        Application description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Application description.
     * </p>
     * 
     * @return Application description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Application description.
     * </p>
     * 
     * @param description
     *        Application description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Application archival status.
     * </p>
     * 
     * @param isArchived
     *        Application archival status.
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Application archival status.
     * </p>
     * 
     * @return Application archival status.
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Application archival status.
     * </p>
     * 
     * @param isArchived
     *        Application archival status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * <p>
     * Application archival status.
     * </p>
     * 
     * @return Application archival status.
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Application last modified dateTime.
     * </p>
     * 
     * @param lastModifiedDateTime
     *        Application last modified dateTime.
     */

    public void setLastModifiedDateTime(String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    /**
     * <p>
     * Application last modified dateTime.
     * </p>
     * 
     * @return Application last modified dateTime.
     */

    public String getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * <p>
     * Application last modified dateTime.
     * </p>
     * 
     * @param lastModifiedDateTime
     *        Application last modified dateTime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withLastModifiedDateTime(String lastModifiedDateTime) {
        setLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /**
     * <p>
     * Application name.
     * </p>
     * 
     * @param name
     *        Application name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Application name.
     * </p>
     * 
     * @return Application name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Application name.
     * </p>
     * 
     * @param name
     *        Application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Application tags.
     * </p>
     * 
     * @return Application tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Application tags.
     * </p>
     * 
     * @param tags
     *        Application tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Application tags.
     * </p>
     * 
     * @param tags
     *        Application tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateApplicationResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult addTagsEntry(String key, String value) {
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

    public CreateApplicationResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Application wave ID.
     * </p>
     * 
     * @param waveID
     *        Application wave ID.
     */

    public void setWaveID(String waveID) {
        this.waveID = waveID;
    }

    /**
     * <p>
     * Application wave ID.
     * </p>
     * 
     * @return Application wave ID.
     */

    public String getWaveID() {
        return this.waveID;
    }

    /**
     * <p>
     * Application wave ID.
     * </p>
     * 
     * @param waveID
     *        Application wave ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationResult withWaveID(String waveID) {
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
        if (getApplicationAggregatedStatus() != null)
            sb.append("ApplicationAggregatedStatus: ").append(getApplicationAggregatedStatus()).append(",");
        if (getApplicationID() != null)
            sb.append("ApplicationID: ").append(getApplicationID()).append(",");
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

        if (obj instanceof CreateApplicationResult == false)
            return false;
        CreateApplicationResult other = (CreateApplicationResult) obj;
        if (other.getApplicationAggregatedStatus() == null ^ this.getApplicationAggregatedStatus() == null)
            return false;
        if (other.getApplicationAggregatedStatus() != null && other.getApplicationAggregatedStatus().equals(this.getApplicationAggregatedStatus()) == false)
            return false;
        if (other.getApplicationID() == null ^ this.getApplicationID() == null)
            return false;
        if (other.getApplicationID() != null && other.getApplicationID().equals(this.getApplicationID()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getApplicationAggregatedStatus() == null) ? 0 : getApplicationAggregatedStatus().hashCode());
        hashCode = prime * hashCode + ((getApplicationID() == null) ? 0 : getApplicationID().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDateTime() == null) ? 0 : getLastModifiedDateTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWaveID() == null) ? 0 : getWaveID().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationResult clone() {
        try {
            return (CreateApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
