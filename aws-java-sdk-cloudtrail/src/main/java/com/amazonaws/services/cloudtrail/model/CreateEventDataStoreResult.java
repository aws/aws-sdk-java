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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateEventDataStore" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventDataStoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the event data store.
     * </p>
     */
    private String eventDataStoreArn;
    /**
     * <p>
     * The name of the event data store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of event data store creation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The advanced event selectors that were used to select the events for the data store.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AdvancedEventSelector> advancedEventSelectors;
    /**
     * <p>
     * Indicates whether the event data store collects events from all regions, or only from the region in which it was
     * created.
     * </p>
     */
    private Boolean multiRegionEnabled;
    /**
     * <p>
     * Indicates whether an event data store is collecting logged events for an organization in Organizations.
     * </p>
     */
    private Boolean organizationEnabled;
    /**
     * <p>
     * The retention period of an event data store, in days.
     * </p>
     */
    private Integer retentionPeriod;
    /**
     * <p>
     * Indicates whether termination protection is enabled for the event data store.
     * </p>
     */
    private Boolean terminationProtectionEnabled;

    private com.amazonaws.internal.SdkInternalList<Tag> tagsList;
    /**
     * <p>
     * The timestamp that shows when the event data store was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The timestamp that shows when an event data store was updated, if applicable. <code>UpdatedTimestamp</code> is
     * always either the same or newer than the time shown in <code>CreatedTimestamp</code>.
     * </p>
     */
    private java.util.Date updatedTimestamp;
    /**
     * <p>
     * Specifies the KMS key ID that encrypts the events delivered by CloudTrail. The value is a fully specified ARN to
     * a KMS key in the following format.
     * </p>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The ARN of the event data store.
     * </p>
     * 
     * @param eventDataStoreArn
     *        The ARN of the event data store.
     */

    public void setEventDataStoreArn(String eventDataStoreArn) {
        this.eventDataStoreArn = eventDataStoreArn;
    }

    /**
     * <p>
     * The ARN of the event data store.
     * </p>
     * 
     * @return The ARN of the event data store.
     */

    public String getEventDataStoreArn() {
        return this.eventDataStoreArn;
    }

    /**
     * <p>
     * The ARN of the event data store.
     * </p>
     * 
     * @param eventDataStoreArn
     *        The ARN of the event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withEventDataStoreArn(String eventDataStoreArn) {
        setEventDataStoreArn(eventDataStoreArn);
        return this;
    }

    /**
     * <p>
     * The name of the event data store.
     * </p>
     * 
     * @param name
     *        The name of the event data store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event data store.
     * </p>
     * 
     * @return The name of the event data store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event data store.
     * </p>
     * 
     * @param name
     *        The name of the event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of event data store creation.
     * </p>
     * 
     * @param status
     *        The status of event data store creation.
     * @see EventDataStoreStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of event data store creation.
     * </p>
     * 
     * @return The status of event data store creation.
     * @see EventDataStoreStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of event data store creation.
     * </p>
     * 
     * @param status
     *        The status of event data store creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventDataStoreStatus
     */

    public CreateEventDataStoreResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of event data store creation.
     * </p>
     * 
     * @param status
     *        The status of event data store creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventDataStoreStatus
     */

    public CreateEventDataStoreResult withStatus(EventDataStoreStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The advanced event selectors that were used to select the events for the data store.
     * </p>
     * 
     * @return The advanced event selectors that were used to select the events for the data store.
     */

    public java.util.List<AdvancedEventSelector> getAdvancedEventSelectors() {
        if (advancedEventSelectors == null) {
            advancedEventSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>();
        }
        return advancedEventSelectors;
    }

    /**
     * <p>
     * The advanced event selectors that were used to select the events for the data store.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that were used to select the events for the data store.
     */

    public void setAdvancedEventSelectors(java.util.Collection<AdvancedEventSelector> advancedEventSelectors) {
        if (advancedEventSelectors == null) {
            this.advancedEventSelectors = null;
            return;
        }

        this.advancedEventSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>(advancedEventSelectors);
    }

    /**
     * <p>
     * The advanced event selectors that were used to select the events for the data store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdvancedEventSelectors(java.util.Collection)} or
     * {@link #withAdvancedEventSelectors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that were used to select the events for the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withAdvancedEventSelectors(AdvancedEventSelector... advancedEventSelectors) {
        if (this.advancedEventSelectors == null) {
            setAdvancedEventSelectors(new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>(advancedEventSelectors.length));
        }
        for (AdvancedEventSelector ele : advancedEventSelectors) {
            this.advancedEventSelectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The advanced event selectors that were used to select the events for the data store.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that were used to select the events for the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withAdvancedEventSelectors(java.util.Collection<AdvancedEventSelector> advancedEventSelectors) {
        setAdvancedEventSelectors(advancedEventSelectors);
        return this;
    }

    /**
     * <p>
     * Indicates whether the event data store collects events from all regions, or only from the region in which it was
     * created.
     * </p>
     * 
     * @param multiRegionEnabled
     *        Indicates whether the event data store collects events from all regions, or only from the region in which
     *        it was created.
     */

    public void setMultiRegionEnabled(Boolean multiRegionEnabled) {
        this.multiRegionEnabled = multiRegionEnabled;
    }

    /**
     * <p>
     * Indicates whether the event data store collects events from all regions, or only from the region in which it was
     * created.
     * </p>
     * 
     * @return Indicates whether the event data store collects events from all regions, or only from the region in which
     *         it was created.
     */

    public Boolean getMultiRegionEnabled() {
        return this.multiRegionEnabled;
    }

    /**
     * <p>
     * Indicates whether the event data store collects events from all regions, or only from the region in which it was
     * created.
     * </p>
     * 
     * @param multiRegionEnabled
     *        Indicates whether the event data store collects events from all regions, or only from the region in which
     *        it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withMultiRegionEnabled(Boolean multiRegionEnabled) {
        setMultiRegionEnabled(multiRegionEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the event data store collects events from all regions, or only from the region in which it was
     * created.
     * </p>
     * 
     * @return Indicates whether the event data store collects events from all regions, or only from the region in which
     *         it was created.
     */

    public Boolean isMultiRegionEnabled() {
        return this.multiRegionEnabled;
    }

    /**
     * <p>
     * Indicates whether an event data store is collecting logged events for an organization in Organizations.
     * </p>
     * 
     * @param organizationEnabled
     *        Indicates whether an event data store is collecting logged events for an organization in Organizations.
     */

    public void setOrganizationEnabled(Boolean organizationEnabled) {
        this.organizationEnabled = organizationEnabled;
    }

    /**
     * <p>
     * Indicates whether an event data store is collecting logged events for an organization in Organizations.
     * </p>
     * 
     * @return Indicates whether an event data store is collecting logged events for an organization in Organizations.
     */

    public Boolean getOrganizationEnabled() {
        return this.organizationEnabled;
    }

    /**
     * <p>
     * Indicates whether an event data store is collecting logged events for an organization in Organizations.
     * </p>
     * 
     * @param organizationEnabled
     *        Indicates whether an event data store is collecting logged events for an organization in Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withOrganizationEnabled(Boolean organizationEnabled) {
        setOrganizationEnabled(organizationEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether an event data store is collecting logged events for an organization in Organizations.
     * </p>
     * 
     * @return Indicates whether an event data store is collecting logged events for an organization in Organizations.
     */

    public Boolean isOrganizationEnabled() {
        return this.organizationEnabled;
    }

    /**
     * <p>
     * The retention period of an event data store, in days.
     * </p>
     * 
     * @param retentionPeriod
     *        The retention period of an event data store, in days.
     */

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The retention period of an event data store, in days.
     * </p>
     * 
     * @return The retention period of an event data store, in days.
     */

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The retention period of an event data store, in days.
     * </p>
     * 
     * @param retentionPeriod
     *        The retention period of an event data store, in days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withRetentionPeriod(Integer retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * Indicates whether termination protection is enabled for the event data store.
     * </p>
     * 
     * @param terminationProtectionEnabled
     *        Indicates whether termination protection is enabled for the event data store.
     */

    public void setTerminationProtectionEnabled(Boolean terminationProtectionEnabled) {
        this.terminationProtectionEnabled = terminationProtectionEnabled;
    }

    /**
     * <p>
     * Indicates whether termination protection is enabled for the event data store.
     * </p>
     * 
     * @return Indicates whether termination protection is enabled for the event data store.
     */

    public Boolean getTerminationProtectionEnabled() {
        return this.terminationProtectionEnabled;
    }

    /**
     * <p>
     * Indicates whether termination protection is enabled for the event data store.
     * </p>
     * 
     * @param terminationProtectionEnabled
     *        Indicates whether termination protection is enabled for the event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withTerminationProtectionEnabled(Boolean terminationProtectionEnabled) {
        setTerminationProtectionEnabled(terminationProtectionEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether termination protection is enabled for the event data store.
     * </p>
     * 
     * @return Indicates whether termination protection is enabled for the event data store.
     */

    public Boolean isTerminationProtectionEnabled() {
        return this.terminationProtectionEnabled;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTagsList() {
        if (tagsList == null) {
            tagsList = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tagsList;
    }

    /**
     * @param tagsList
     */

    public void setTagsList(java.util.Collection<Tag> tagsList) {
        if (tagsList == null) {
            this.tagsList = null;
            return;
        }

        this.tagsList = new com.amazonaws.internal.SdkInternalList<Tag>(tagsList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagsList(java.util.Collection)} or {@link #withTagsList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagsList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withTagsList(Tag... tagsList) {
        if (this.tagsList == null) {
            setTagsList(new com.amazonaws.internal.SdkInternalList<Tag>(tagsList.length));
        }
        for (Tag ele : tagsList) {
            this.tagsList.add(ele);
        }
        return this;
    }

    /**
     * @param tagsList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withTagsList(java.util.Collection<Tag> tagsList) {
        setTagsList(tagsList);
        return this;
    }

    /**
     * <p>
     * The timestamp that shows when the event data store was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp that shows when the event data store was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp that shows when the event data store was created.
     * </p>
     * 
     * @return The timestamp that shows when the event data store was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp that shows when the event data store was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp that shows when the event data store was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp that shows when an event data store was updated, if applicable. <code>UpdatedTimestamp</code> is
     * always either the same or newer than the time shown in <code>CreatedTimestamp</code>.
     * </p>
     * 
     * @param updatedTimestamp
     *        The timestamp that shows when an event data store was updated, if applicable.
     *        <code>UpdatedTimestamp</code> is always either the same or newer than the time shown in
     *        <code>CreatedTimestamp</code>.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The timestamp that shows when an event data store was updated, if applicable. <code>UpdatedTimestamp</code> is
     * always either the same or newer than the time shown in <code>CreatedTimestamp</code>.
     * </p>
     * 
     * @return The timestamp that shows when an event data store was updated, if applicable.
     *         <code>UpdatedTimestamp</code> is always either the same or newer than the time shown in
     *         <code>CreatedTimestamp</code>.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The timestamp that shows when an event data store was updated, if applicable. <code>UpdatedTimestamp</code> is
     * always either the same or newer than the time shown in <code>CreatedTimestamp</code>.
     * </p>
     * 
     * @param updatedTimestamp
     *        The timestamp that shows when an event data store was updated, if applicable.
     *        <code>UpdatedTimestamp</code> is always either the same or newer than the time shown in
     *        <code>CreatedTimestamp</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
        return this;
    }

    /**
     * <p>
     * Specifies the KMS key ID that encrypts the events delivered by CloudTrail. The value is a fully specified ARN to
     * a KMS key in the following format.
     * </p>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param kmsKeyId
     *        Specifies the KMS key ID that encrypts the events delivered by CloudTrail. The value is a fully specified
     *        ARN to a KMS key in the following format.</p>
     *        <p>
     *        <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key ID that encrypts the events delivered by CloudTrail. The value is a fully specified ARN to
     * a KMS key in the following format.
     * </p>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @return Specifies the KMS key ID that encrypts the events delivered by CloudTrail. The value is a fully specified
     *         ARN to a KMS key in the following format.</p>
     *         <p>
     *         <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key ID that encrypts the events delivered by CloudTrail. The value is a fully specified ARN to
     * a KMS key in the following format.
     * </p>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param kmsKeyId
     *        Specifies the KMS key ID that encrypts the events delivered by CloudTrail. The value is a fully specified
     *        ARN to a KMS key in the following format.</p>
     *        <p>
     *        <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getEventDataStoreArn() != null)
            sb.append("EventDataStoreArn: ").append(getEventDataStoreArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAdvancedEventSelectors() != null)
            sb.append("AdvancedEventSelectors: ").append(getAdvancedEventSelectors()).append(",");
        if (getMultiRegionEnabled() != null)
            sb.append("MultiRegionEnabled: ").append(getMultiRegionEnabled()).append(",");
        if (getOrganizationEnabled() != null)
            sb.append("OrganizationEnabled: ").append(getOrganizationEnabled()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getTerminationProtectionEnabled() != null)
            sb.append("TerminationProtectionEnabled: ").append(getTerminationProtectionEnabled()).append(",");
        if (getTagsList() != null)
            sb.append("TagsList: ").append(getTagsList()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventDataStoreResult == false)
            return false;
        CreateEventDataStoreResult other = (CreateEventDataStoreResult) obj;
        if (other.getEventDataStoreArn() == null ^ this.getEventDataStoreArn() == null)
            return false;
        if (other.getEventDataStoreArn() != null && other.getEventDataStoreArn().equals(this.getEventDataStoreArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAdvancedEventSelectors() == null ^ this.getAdvancedEventSelectors() == null)
            return false;
        if (other.getAdvancedEventSelectors() != null && other.getAdvancedEventSelectors().equals(this.getAdvancedEventSelectors()) == false)
            return false;
        if (other.getMultiRegionEnabled() == null ^ this.getMultiRegionEnabled() == null)
            return false;
        if (other.getMultiRegionEnabled() != null && other.getMultiRegionEnabled().equals(this.getMultiRegionEnabled()) == false)
            return false;
        if (other.getOrganizationEnabled() == null ^ this.getOrganizationEnabled() == null)
            return false;
        if (other.getOrganizationEnabled() != null && other.getOrganizationEnabled().equals(this.getOrganizationEnabled()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getTerminationProtectionEnabled() == null ^ this.getTerminationProtectionEnabled() == null)
            return false;
        if (other.getTerminationProtectionEnabled() != null && other.getTerminationProtectionEnabled().equals(this.getTerminationProtectionEnabled()) == false)
            return false;
        if (other.getTagsList() == null ^ this.getTagsList() == null)
            return false;
        if (other.getTagsList() != null && other.getTagsList().equals(this.getTagsList()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventDataStoreArn() == null) ? 0 : getEventDataStoreArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAdvancedEventSelectors() == null) ? 0 : getAdvancedEventSelectors().hashCode());
        hashCode = prime * hashCode + ((getMultiRegionEnabled() == null) ? 0 : getMultiRegionEnabled().hashCode());
        hashCode = prime * hashCode + ((getOrganizationEnabled() == null) ? 0 : getOrganizationEnabled().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getTerminationProtectionEnabled() == null) ? 0 : getTerminationProtectionEnabled().hashCode());
        hashCode = prime * hashCode + ((getTagsList() == null) ? 0 : getTagsList().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventDataStoreResult clone() {
        try {
            return (CreateEventDataStoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
