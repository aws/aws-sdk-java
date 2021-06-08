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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDetectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the detector was created.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * The publishing frequency of the finding.
     * </p>
     */
    private String findingPublishingFrequency;
    /**
     * <p>
     * The GuardDuty service role.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * The detector status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The last-updated timestamp for the detector.
     * </p>
     */
    private String updatedAt;
    /**
     * <p>
     * Describes which data sources are enabled for the detector.
     * </p>
     */
    private DataSourceConfigurationsResult dataSources;
    /**
     * <p>
     * The tags of the detector resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The timestamp of when the detector was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the detector was created.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the detector was created.
     * </p>
     * 
     * @return The timestamp of when the detector was created.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the detector was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the detector was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorResult withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The publishing frequency of the finding.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        The publishing frequency of the finding.
     * @see FindingPublishingFrequency
     */

    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * <p>
     * The publishing frequency of the finding.
     * </p>
     * 
     * @return The publishing frequency of the finding.
     * @see FindingPublishingFrequency
     */

    public String getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }

    /**
     * <p>
     * The publishing frequency of the finding.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        The publishing frequency of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public GetDetectorResult withFindingPublishingFrequency(String findingPublishingFrequency) {
        setFindingPublishingFrequency(findingPublishingFrequency);
        return this;
    }

    /**
     * <p>
     * The publishing frequency of the finding.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        The publishing frequency of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public GetDetectorResult withFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The GuardDuty service role.
     * </p>
     * 
     * @param serviceRole
     *        The GuardDuty service role.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The GuardDuty service role.
     * </p>
     * 
     * @return The GuardDuty service role.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The GuardDuty service role.
     * </p>
     * 
     * @param serviceRole
     *        The GuardDuty service role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorResult withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * The detector status.
     * </p>
     * 
     * @param status
     *        The detector status.
     * @see DetectorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The detector status.
     * </p>
     * 
     * @return The detector status.
     * @see DetectorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The detector status.
     * </p>
     * 
     * @param status
     *        The detector status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectorStatus
     */

    public GetDetectorResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The detector status.
     * </p>
     * 
     * @param status
     *        The detector status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetectorStatus
     */

    public GetDetectorResult withStatus(DetectorStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The last-updated timestamp for the detector.
     * </p>
     * 
     * @param updatedAt
     *        The last-updated timestamp for the detector.
     */

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The last-updated timestamp for the detector.
     * </p>
     * 
     * @return The last-updated timestamp for the detector.
     */

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The last-updated timestamp for the detector.
     * </p>
     * 
     * @param updatedAt
     *        The last-updated timestamp for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorResult withUpdatedAt(String updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Describes which data sources are enabled for the detector.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources are enabled for the detector.
     */

    public void setDataSources(DataSourceConfigurationsResult dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * <p>
     * Describes which data sources are enabled for the detector.
     * </p>
     * 
     * @return Describes which data sources are enabled for the detector.
     */

    public DataSourceConfigurationsResult getDataSources() {
        return this.dataSources;
    }

    /**
     * <p>
     * Describes which data sources are enabled for the detector.
     * </p>
     * 
     * @param dataSources
     *        Describes which data sources are enabled for the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorResult withDataSources(DataSourceConfigurationsResult dataSources) {
        setDataSources(dataSources);
        return this;
    }

    /**
     * <p>
     * The tags of the detector resource.
     * </p>
     * 
     * @return The tags of the detector resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the detector resource.
     * </p>
     * 
     * @param tags
     *        The tags of the detector resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the detector resource.
     * </p>
     * 
     * @param tags
     *        The tags of the detector resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetDetectorResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetDetectorResult addTagsEntry(String key, String value) {
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

    public GetDetectorResult clearTagsEntries() {
        this.tags = null;
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getFindingPublishingFrequency() != null)
            sb.append("FindingPublishingFrequency: ").append(getFindingPublishingFrequency()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getDataSources() != null)
            sb.append("DataSources: ").append(getDataSources()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDetectorResult == false)
            return false;
        GetDetectorResult other = (GetDetectorResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getFindingPublishingFrequency() == null ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null && other.getFindingPublishingFrequency().equals(this.getFindingPublishingFrequency()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getDataSources() == null ^ this.getDataSources() == null)
            return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetDetectorResult clone() {
        try {
            return (GetDetectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
