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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateEventDataStore" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEventDataStoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The status of an event data store.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The advanced event selectors that are applied to the event data store.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AdvancedEventSelector> advancedEventSelectors;
    /**
     * <p>
     * Indicates whether the event data store includes events from all Regions, or only from the Region in which it was
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
     * The retention period, in days.
     * </p>
     */
    private Integer retentionPeriod;
    /**
     * <p>
     * Indicates whether termination protection is enabled for the event data store.
     * </p>
     */
    private Boolean terminationProtectionEnabled;
    /**
     * <p>
     * The timestamp that shows when an event data store was first created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The timestamp that shows when the event data store was last updated. <code>UpdatedTimestamp</code> is always
     * either the same or newer than the time shown in <code>CreatedTimestamp</code>.
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
     * The billing mode for the event data store.
     * </p>
     */
    private String billingMode;
    /**
     * <p>
     * Indicates the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html">Lake
     * query federation</a> status. The status is <code>ENABLED</code> if Lake query federation is enabled, or
     * <code>DISABLED</code> if Lake query federation is disabled. You cannot delete an event data store if the
     * <code>FederationStatus</code> is <code>ENABLED</code>.
     * </p>
     */
    private String federationStatus;
    /**
     * <p>
     * If Lake query federation is enabled, provides the ARN of the federation role used to access the resources for the
     * federated event data store.
     * </p>
     */
    private String federationRoleArn;

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

    public UpdateEventDataStoreResult withEventDataStoreArn(String eventDataStoreArn) {
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

    public UpdateEventDataStoreResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of an event data store.
     * </p>
     * 
     * @param status
     *        The status of an event data store.
     * @see EventDataStoreStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of an event data store.
     * </p>
     * 
     * @return The status of an event data store.
     * @see EventDataStoreStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of an event data store.
     * </p>
     * 
     * @param status
     *        The status of an event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventDataStoreStatus
     */

    public UpdateEventDataStoreResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of an event data store.
     * </p>
     * 
     * @param status
     *        The status of an event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventDataStoreStatus
     */

    public UpdateEventDataStoreResult withStatus(EventDataStoreStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The advanced event selectors that are applied to the event data store.
     * </p>
     * 
     * @return The advanced event selectors that are applied to the event data store.
     */

    public java.util.List<AdvancedEventSelector> getAdvancedEventSelectors() {
        if (advancedEventSelectors == null) {
            advancedEventSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>();
        }
        return advancedEventSelectors;
    }

    /**
     * <p>
     * The advanced event selectors that are applied to the event data store.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that are applied to the event data store.
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
     * The advanced event selectors that are applied to the event data store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdvancedEventSelectors(java.util.Collection)} or
     * {@link #withAdvancedEventSelectors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that are applied to the event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreResult withAdvancedEventSelectors(AdvancedEventSelector... advancedEventSelectors) {
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
     * The advanced event selectors that are applied to the event data store.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors that are applied to the event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreResult withAdvancedEventSelectors(java.util.Collection<AdvancedEventSelector> advancedEventSelectors) {
        setAdvancedEventSelectors(advancedEventSelectors);
        return this;
    }

    /**
     * <p>
     * Indicates whether the event data store includes events from all Regions, or only from the Region in which it was
     * created.
     * </p>
     * 
     * @param multiRegionEnabled
     *        Indicates whether the event data store includes events from all Regions, or only from the Region in which
     *        it was created.
     */

    public void setMultiRegionEnabled(Boolean multiRegionEnabled) {
        this.multiRegionEnabled = multiRegionEnabled;
    }

    /**
     * <p>
     * Indicates whether the event data store includes events from all Regions, or only from the Region in which it was
     * created.
     * </p>
     * 
     * @return Indicates whether the event data store includes events from all Regions, or only from the Region in which
     *         it was created.
     */

    public Boolean getMultiRegionEnabled() {
        return this.multiRegionEnabled;
    }

    /**
     * <p>
     * Indicates whether the event data store includes events from all Regions, or only from the Region in which it was
     * created.
     * </p>
     * 
     * @param multiRegionEnabled
     *        Indicates whether the event data store includes events from all Regions, or only from the Region in which
     *        it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreResult withMultiRegionEnabled(Boolean multiRegionEnabled) {
        setMultiRegionEnabled(multiRegionEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether the event data store includes events from all Regions, or only from the Region in which it was
     * created.
     * </p>
     * 
     * @return Indicates whether the event data store includes events from all Regions, or only from the Region in which
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

    public UpdateEventDataStoreResult withOrganizationEnabled(Boolean organizationEnabled) {
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
     * The retention period, in days.
     * </p>
     * 
     * @param retentionPeriod
     *        The retention period, in days.
     */

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The retention period, in days.
     * </p>
     * 
     * @return The retention period, in days.
     */

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The retention period, in days.
     * </p>
     * 
     * @param retentionPeriod
     *        The retention period, in days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreResult withRetentionPeriod(Integer retentionPeriod) {
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

    public UpdateEventDataStoreResult withTerminationProtectionEnabled(Boolean terminationProtectionEnabled) {
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
     * <p>
     * The timestamp that shows when an event data store was first created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp that shows when an event data store was first created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp that shows when an event data store was first created.
     * </p>
     * 
     * @return The timestamp that shows when an event data store was first created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp that shows when an event data store was first created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp that shows when an event data store was first created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp that shows when the event data store was last updated. <code>UpdatedTimestamp</code> is always
     * either the same or newer than the time shown in <code>CreatedTimestamp</code>.
     * </p>
     * 
     * @param updatedTimestamp
     *        The timestamp that shows when the event data store was last updated. <code>UpdatedTimestamp</code> is
     *        always either the same or newer than the time shown in <code>CreatedTimestamp</code>.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The timestamp that shows when the event data store was last updated. <code>UpdatedTimestamp</code> is always
     * either the same or newer than the time shown in <code>CreatedTimestamp</code>.
     * </p>
     * 
     * @return The timestamp that shows when the event data store was last updated. <code>UpdatedTimestamp</code> is
     *         always either the same or newer than the time shown in <code>CreatedTimestamp</code>.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The timestamp that shows when the event data store was last updated. <code>UpdatedTimestamp</code> is always
     * either the same or newer than the time shown in <code>CreatedTimestamp</code>.
     * </p>
     * 
     * @param updatedTimestamp
     *        The timestamp that shows when the event data store was last updated. <code>UpdatedTimestamp</code> is
     *        always either the same or newer than the time shown in <code>CreatedTimestamp</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreResult withUpdatedTimestamp(java.util.Date updatedTimestamp) {
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

    public UpdateEventDataStoreResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The billing mode for the event data store.
     * </p>
     * 
     * @param billingMode
     *        The billing mode for the event data store.
     * @see BillingMode
     */

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    /**
     * <p>
     * The billing mode for the event data store.
     * </p>
     * 
     * @return The billing mode for the event data store.
     * @see BillingMode
     */

    public String getBillingMode() {
        return this.billingMode;
    }

    /**
     * <p>
     * The billing mode for the event data store.
     * </p>
     * 
     * @param billingMode
     *        The billing mode for the event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public UpdateEventDataStoreResult withBillingMode(String billingMode) {
        setBillingMode(billingMode);
        return this;
    }

    /**
     * <p>
     * The billing mode for the event data store.
     * </p>
     * 
     * @param billingMode
     *        The billing mode for the event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public UpdateEventDataStoreResult withBillingMode(BillingMode billingMode) {
        this.billingMode = billingMode.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html">Lake
     * query federation</a> status. The status is <code>ENABLED</code> if Lake query federation is enabled, or
     * <code>DISABLED</code> if Lake query federation is disabled. You cannot delete an event data store if the
     * <code>FederationStatus</code> is <code>ENABLED</code>.
     * </p>
     * 
     * @param federationStatus
     *        Indicates the <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html">Lake query
     *        federation</a> status. The status is <code>ENABLED</code> if Lake query federation is enabled, or
     *        <code>DISABLED</code> if Lake query federation is disabled. You cannot delete an event data store if the
     *        <code>FederationStatus</code> is <code>ENABLED</code>.
     * @see FederationStatus
     */

    public void setFederationStatus(String federationStatus) {
        this.federationStatus = federationStatus;
    }

    /**
     * <p>
     * Indicates the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html">Lake
     * query federation</a> status. The status is <code>ENABLED</code> if Lake query federation is enabled, or
     * <code>DISABLED</code> if Lake query federation is disabled. You cannot delete an event data store if the
     * <code>FederationStatus</code> is <code>ENABLED</code>.
     * </p>
     * 
     * @return Indicates the <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html">Lake query
     *         federation</a> status. The status is <code>ENABLED</code> if Lake query federation is enabled, or
     *         <code>DISABLED</code> if Lake query federation is disabled. You cannot delete an event data store if the
     *         <code>FederationStatus</code> is <code>ENABLED</code>.
     * @see FederationStatus
     */

    public String getFederationStatus() {
        return this.federationStatus;
    }

    /**
     * <p>
     * Indicates the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html">Lake
     * query federation</a> status. The status is <code>ENABLED</code> if Lake query federation is enabled, or
     * <code>DISABLED</code> if Lake query federation is disabled. You cannot delete an event data store if the
     * <code>FederationStatus</code> is <code>ENABLED</code>.
     * </p>
     * 
     * @param federationStatus
     *        Indicates the <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html">Lake query
     *        federation</a> status. The status is <code>ENABLED</code> if Lake query federation is enabled, or
     *        <code>DISABLED</code> if Lake query federation is disabled. You cannot delete an event data store if the
     *        <code>FederationStatus</code> is <code>ENABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationStatus
     */

    public UpdateEventDataStoreResult withFederationStatus(String federationStatus) {
        setFederationStatus(federationStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the <a href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html">Lake
     * query federation</a> status. The status is <code>ENABLED</code> if Lake query federation is enabled, or
     * <code>DISABLED</code> if Lake query federation is disabled. You cannot delete an event data store if the
     * <code>FederationStatus</code> is <code>ENABLED</code>.
     * </p>
     * 
     * @param federationStatus
     *        Indicates the <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-federation.html">Lake query
     *        federation</a> status. The status is <code>ENABLED</code> if Lake query federation is enabled, or
     *        <code>DISABLED</code> if Lake query federation is disabled. You cannot delete an event data store if the
     *        <code>FederationStatus</code> is <code>ENABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FederationStatus
     */

    public UpdateEventDataStoreResult withFederationStatus(FederationStatus federationStatus) {
        this.federationStatus = federationStatus.toString();
        return this;
    }

    /**
     * <p>
     * If Lake query federation is enabled, provides the ARN of the federation role used to access the resources for the
     * federated event data store.
     * </p>
     * 
     * @param federationRoleArn
     *        If Lake query federation is enabled, provides the ARN of the federation role used to access the resources
     *        for the federated event data store.
     */

    public void setFederationRoleArn(String federationRoleArn) {
        this.federationRoleArn = federationRoleArn;
    }

    /**
     * <p>
     * If Lake query federation is enabled, provides the ARN of the federation role used to access the resources for the
     * federated event data store.
     * </p>
     * 
     * @return If Lake query federation is enabled, provides the ARN of the federation role used to access the resources
     *         for the federated event data store.
     */

    public String getFederationRoleArn() {
        return this.federationRoleArn;
    }

    /**
     * <p>
     * If Lake query federation is enabled, provides the ARN of the federation role used to access the resources for the
     * federated event data store.
     * </p>
     * 
     * @param federationRoleArn
     *        If Lake query federation is enabled, provides the ARN of the federation role used to access the resources
     *        for the federated event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreResult withFederationRoleArn(String federationRoleArn) {
        setFederationRoleArn(federationRoleArn);
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
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getBillingMode() != null)
            sb.append("BillingMode: ").append(getBillingMode()).append(",");
        if (getFederationStatus() != null)
            sb.append("FederationStatus: ").append(getFederationStatus()).append(",");
        if (getFederationRoleArn() != null)
            sb.append("FederationRoleArn: ").append(getFederationRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEventDataStoreResult == false)
            return false;
        UpdateEventDataStoreResult other = (UpdateEventDataStoreResult) obj;
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
        if (other.getBillingMode() == null ^ this.getBillingMode() == null)
            return false;
        if (other.getBillingMode() != null && other.getBillingMode().equals(this.getBillingMode()) == false)
            return false;
        if (other.getFederationStatus() == null ^ this.getFederationStatus() == null)
            return false;
        if (other.getFederationStatus() != null && other.getFederationStatus().equals(this.getFederationStatus()) == false)
            return false;
        if (other.getFederationRoleArn() == null ^ this.getFederationRoleArn() == null)
            return false;
        if (other.getFederationRoleArn() != null && other.getFederationRoleArn().equals(this.getFederationRoleArn()) == false)
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
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getBillingMode() == null) ? 0 : getBillingMode().hashCode());
        hashCode = prime * hashCode + ((getFederationStatus() == null) ? 0 : getFederationStatus().hashCode());
        hashCode = prime * hashCode + ((getFederationRoleArn() == null) ? 0 : getFederationRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEventDataStoreResult clone() {
        try {
            return (UpdateEventDataStoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
