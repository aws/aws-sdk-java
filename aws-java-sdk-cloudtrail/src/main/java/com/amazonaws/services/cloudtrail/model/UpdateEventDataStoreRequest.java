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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/UpdateEventDataStore" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEventDataStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN (or the ID suffix of the ARN) of the event data store that you want to update.
     * </p>
     */
    private String eventDataStore;
    /**
     * <p>
     * The event data store name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The advanced event selectors used to select events for the event data store. You can configure up to five
     * advanced event selectors for each event data store.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AdvancedEventSelector> advancedEventSelectors;
    /**
     * <p>
     * Specifies whether an event data store collects events from all Regions, or only from the Region in which it was
     * created.
     * </p>
     */
    private Boolean multiRegionEnabled;
    /**
     * <p>
     * Specifies whether an event data store collects events logged for an organization in Organizations.
     * </p>
     * <note>
     * <p>
     * Only the management account for the organization can convert an organization event data store to a
     * non-organization event data store, or convert a non-organization event data store to an organization event data
     * store.
     * </p>
     * </note>
     */
    private Boolean organizationEnabled;
    /**
     * <p>
     * The retention period of the event data store, in days. If <code>BillingMode</code> is set to
     * <code>EXTENDABLE_RETENTION_PRICING</code>, you can set a retention period of up to 3653 days, the equivalent of
     * 10 years. If <code>BillingMode</code> is set to <code>FIXED_RETENTION_PRICING</code>, you can set a retention
     * period of up to 2557 days, the equivalent of seven years.
     * </p>
     * <p>
     * CloudTrail Lake determines whether to retain an event by checking if the <code>eventTime</code> of the event is
     * within the specified retention period. For example, if you set a retention period of 90 days, CloudTrail will
     * remove events when the <code>eventTime</code> is older than 90 days.
     * </p>
     * <note>
     * <p>
     * If you decrease the retention period of an event data store, CloudTrail will remove any events with an
     * <code>eventTime</code> older than the new retention period. For example, if the previous retention period was 365
     * days and you decrease it to 100 days, CloudTrail will remove events with an <code>eventTime</code> older than 100
     * days.
     * </p>
     * </note>
     */
    private Integer retentionPeriod;
    /**
     * <p>
     * Indicates that termination protection is enabled and the event data store cannot be automatically deleted.
     * </p>
     */
    private Boolean terminationProtectionEnabled;
    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the events delivered by CloudTrail. The value can be an alias name
     * prefixed by <code>alias/</code>, a fully specified ARN to an alias, a fully specified ARN to a key, or a globally
     * unique identifier.
     * </p>
     * <important>
     * <p>
     * Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents CloudTrail from
     * logging events to the event data store, and prevents users from querying the data in the event data store that
     * was encrypted with the key. After you associate an event data store with a KMS key, the KMS key cannot be removed
     * or changed. Before you disable or delete a KMS key that you are using with an event data store, delete or back up
     * your event data store.
     * </p>
     * </important>
     * <p>
     * CloudTrail also supports KMS multi-Region keys. For more information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Using multi-Region
     * keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;
    /**
     * <note>
     * <p>
     * You can't change the billing mode from <code>EXTENDABLE_RETENTION_PRICING</code> to
     * <code>FIXED_RETENTION_PRICING</code>. If <code>BillingMode</code> is set to
     * <code>EXTENDABLE_RETENTION_PRICING</code> and you want to use <code>FIXED_RETENTION_PRICING</code> instead,
     * you'll need to stop ingestion on the event data store and create a new event data store that uses
     * <code>FIXED_RETENTION_PRICING</code>.
     * </p>
     * </note>
     * <p>
     * The billing mode for the event data store determines the cost for ingesting events and the default and maximum
     * retention period for the event data store.
     * </p>
     * <p>
     * The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EXTENDABLE_RETENTION_PRICING</code> - This billing mode is generally recommended if you want a flexible
     * retention period of up to 3653 days (about 10 years). The default retention period for this billing mode is 366
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIXED_RETENTION_PRICING</code> - This billing mode is recommended if you expect to ingest more than 25 TB
     * of event data per month and need a retention period of up to 2557 days (about 7 years). The default retention
     * period for this billing mode is 2557 days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CloudTrail pricing, see <a href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail
     * Pricing</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html">Managing
     * CloudTrail Lake costs</a>.
     * </p>
     */
    private String billingMode;

    /**
     * <p>
     * The ARN (or the ID suffix of the ARN) of the event data store that you want to update.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or the ID suffix of the ARN) of the event data store that you want to update.
     */

    public void setEventDataStore(String eventDataStore) {
        this.eventDataStore = eventDataStore;
    }

    /**
     * <p>
     * The ARN (or the ID suffix of the ARN) of the event data store that you want to update.
     * </p>
     * 
     * @return The ARN (or the ID suffix of the ARN) of the event data store that you want to update.
     */

    public String getEventDataStore() {
        return this.eventDataStore;
    }

    /**
     * <p>
     * The ARN (or the ID suffix of the ARN) of the event data store that you want to update.
     * </p>
     * 
     * @param eventDataStore
     *        The ARN (or the ID suffix of the ARN) of the event data store that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreRequest withEventDataStore(String eventDataStore) {
        setEventDataStore(eventDataStore);
        return this;
    }

    /**
     * <p>
     * The event data store name.
     * </p>
     * 
     * @param name
     *        The event data store name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The event data store name.
     * </p>
     * 
     * @return The event data store name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The event data store name.
     * </p>
     * 
     * @param name
     *        The event data store name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The advanced event selectors used to select events for the event data store. You can configure up to five
     * advanced event selectors for each event data store.
     * </p>
     * 
     * @return The advanced event selectors used to select events for the event data store. You can configure up to five
     *         advanced event selectors for each event data store.
     */

    public java.util.List<AdvancedEventSelector> getAdvancedEventSelectors() {
        if (advancedEventSelectors == null) {
            advancedEventSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>();
        }
        return advancedEventSelectors;
    }

    /**
     * <p>
     * The advanced event selectors used to select events for the event data store. You can configure up to five
     * advanced event selectors for each event data store.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors used to select events for the event data store. You can configure up to five
     *        advanced event selectors for each event data store.
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
     * The advanced event selectors used to select events for the event data store. You can configure up to five
     * advanced event selectors for each event data store.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdvancedEventSelectors(java.util.Collection)} or
     * {@link #withAdvancedEventSelectors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors used to select events for the event data store. You can configure up to five
     *        advanced event selectors for each event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreRequest withAdvancedEventSelectors(AdvancedEventSelector... advancedEventSelectors) {
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
     * The advanced event selectors used to select events for the event data store. You can configure up to five
     * advanced event selectors for each event data store.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors used to select events for the event data store. You can configure up to five
     *        advanced event selectors for each event data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreRequest withAdvancedEventSelectors(java.util.Collection<AdvancedEventSelector> advancedEventSelectors) {
        setAdvancedEventSelectors(advancedEventSelectors);
        return this;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events from all Regions, or only from the Region in which it was
     * created.
     * </p>
     * 
     * @param multiRegionEnabled
     *        Specifies whether an event data store collects events from all Regions, or only from the Region in which
     *        it was created.
     */

    public void setMultiRegionEnabled(Boolean multiRegionEnabled) {
        this.multiRegionEnabled = multiRegionEnabled;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events from all Regions, or only from the Region in which it was
     * created.
     * </p>
     * 
     * @return Specifies whether an event data store collects events from all Regions, or only from the Region in which
     *         it was created.
     */

    public Boolean getMultiRegionEnabled() {
        return this.multiRegionEnabled;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events from all Regions, or only from the Region in which it was
     * created.
     * </p>
     * 
     * @param multiRegionEnabled
     *        Specifies whether an event data store collects events from all Regions, or only from the Region in which
     *        it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreRequest withMultiRegionEnabled(Boolean multiRegionEnabled) {
        setMultiRegionEnabled(multiRegionEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events from all Regions, or only from the Region in which it was
     * created.
     * </p>
     * 
     * @return Specifies whether an event data store collects events from all Regions, or only from the Region in which
     *         it was created.
     */

    public Boolean isMultiRegionEnabled() {
        return this.multiRegionEnabled;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events logged for an organization in Organizations.
     * </p>
     * <note>
     * <p>
     * Only the management account for the organization can convert an organization event data store to a
     * non-organization event data store, or convert a non-organization event data store to an organization event data
     * store.
     * </p>
     * </note>
     * 
     * @param organizationEnabled
     *        Specifies whether an event data store collects events logged for an organization in Organizations.</p>
     *        <note>
     *        <p>
     *        Only the management account for the organization can convert an organization event data store to a
     *        non-organization event data store, or convert a non-organization event data store to an organization event
     *        data store.
     *        </p>
     */

    public void setOrganizationEnabled(Boolean organizationEnabled) {
        this.organizationEnabled = organizationEnabled;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events logged for an organization in Organizations.
     * </p>
     * <note>
     * <p>
     * Only the management account for the organization can convert an organization event data store to a
     * non-organization event data store, or convert a non-organization event data store to an organization event data
     * store.
     * </p>
     * </note>
     * 
     * @return Specifies whether an event data store collects events logged for an organization in Organizations.</p>
     *         <note>
     *         <p>
     *         Only the management account for the organization can convert an organization event data store to a
     *         non-organization event data store, or convert a non-organization event data store to an organization
     *         event data store.
     *         </p>
     */

    public Boolean getOrganizationEnabled() {
        return this.organizationEnabled;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events logged for an organization in Organizations.
     * </p>
     * <note>
     * <p>
     * Only the management account for the organization can convert an organization event data store to a
     * non-organization event data store, or convert a non-organization event data store to an organization event data
     * store.
     * </p>
     * </note>
     * 
     * @param organizationEnabled
     *        Specifies whether an event data store collects events logged for an organization in Organizations.</p>
     *        <note>
     *        <p>
     *        Only the management account for the organization can convert an organization event data store to a
     *        non-organization event data store, or convert a non-organization event data store to an organization event
     *        data store.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreRequest withOrganizationEnabled(Boolean organizationEnabled) {
        setOrganizationEnabled(organizationEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events logged for an organization in Organizations.
     * </p>
     * <note>
     * <p>
     * Only the management account for the organization can convert an organization event data store to a
     * non-organization event data store, or convert a non-organization event data store to an organization event data
     * store.
     * </p>
     * </note>
     * 
     * @return Specifies whether an event data store collects events logged for an organization in Organizations.</p>
     *         <note>
     *         <p>
     *         Only the management account for the organization can convert an organization event data store to a
     *         non-organization event data store, or convert a non-organization event data store to an organization
     *         event data store.
     *         </p>
     */

    public Boolean isOrganizationEnabled() {
        return this.organizationEnabled;
    }

    /**
     * <p>
     * The retention period of the event data store, in days. If <code>BillingMode</code> is set to
     * <code>EXTENDABLE_RETENTION_PRICING</code>, you can set a retention period of up to 3653 days, the equivalent of
     * 10 years. If <code>BillingMode</code> is set to <code>FIXED_RETENTION_PRICING</code>, you can set a retention
     * period of up to 2557 days, the equivalent of seven years.
     * </p>
     * <p>
     * CloudTrail Lake determines whether to retain an event by checking if the <code>eventTime</code> of the event is
     * within the specified retention period. For example, if you set a retention period of 90 days, CloudTrail will
     * remove events when the <code>eventTime</code> is older than 90 days.
     * </p>
     * <note>
     * <p>
     * If you decrease the retention period of an event data store, CloudTrail will remove any events with an
     * <code>eventTime</code> older than the new retention period. For example, if the previous retention period was 365
     * days and you decrease it to 100 days, CloudTrail will remove events with an <code>eventTime</code> older than 100
     * days.
     * </p>
     * </note>
     * 
     * @param retentionPeriod
     *        The retention period of the event data store, in days. If <code>BillingMode</code> is set to
     *        <code>EXTENDABLE_RETENTION_PRICING</code>, you can set a retention period of up to 3653 days, the
     *        equivalent of 10 years. If <code>BillingMode</code> is set to <code>FIXED_RETENTION_PRICING</code>, you
     *        can set a retention period of up to 2557 days, the equivalent of seven years.</p>
     *        <p>
     *        CloudTrail Lake determines whether to retain an event by checking if the <code>eventTime</code> of the
     *        event is within the specified retention period. For example, if you set a retention period of 90 days,
     *        CloudTrail will remove events when the <code>eventTime</code> is older than 90 days.
     *        </p>
     *        <note>
     *        <p>
     *        If you decrease the retention period of an event data store, CloudTrail will remove any events with an
     *        <code>eventTime</code> older than the new retention period. For example, if the previous retention period
     *        was 365 days and you decrease it to 100 days, CloudTrail will remove events with an <code>eventTime</code>
     *        older than 100 days.
     *        </p>
     */

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The retention period of the event data store, in days. If <code>BillingMode</code> is set to
     * <code>EXTENDABLE_RETENTION_PRICING</code>, you can set a retention period of up to 3653 days, the equivalent of
     * 10 years. If <code>BillingMode</code> is set to <code>FIXED_RETENTION_PRICING</code>, you can set a retention
     * period of up to 2557 days, the equivalent of seven years.
     * </p>
     * <p>
     * CloudTrail Lake determines whether to retain an event by checking if the <code>eventTime</code> of the event is
     * within the specified retention period. For example, if you set a retention period of 90 days, CloudTrail will
     * remove events when the <code>eventTime</code> is older than 90 days.
     * </p>
     * <note>
     * <p>
     * If you decrease the retention period of an event data store, CloudTrail will remove any events with an
     * <code>eventTime</code> older than the new retention period. For example, if the previous retention period was 365
     * days and you decrease it to 100 days, CloudTrail will remove events with an <code>eventTime</code> older than 100
     * days.
     * </p>
     * </note>
     * 
     * @return The retention period of the event data store, in days. If <code>BillingMode</code> is set to
     *         <code>EXTENDABLE_RETENTION_PRICING</code>, you can set a retention period of up to 3653 days, the
     *         equivalent of 10 years. If <code>BillingMode</code> is set to <code>FIXED_RETENTION_PRICING</code>, you
     *         can set a retention period of up to 2557 days, the equivalent of seven years.</p>
     *         <p>
     *         CloudTrail Lake determines whether to retain an event by checking if the <code>eventTime</code> of the
     *         event is within the specified retention period. For example, if you set a retention period of 90 days,
     *         CloudTrail will remove events when the <code>eventTime</code> is older than 90 days.
     *         </p>
     *         <note>
     *         <p>
     *         If you decrease the retention period of an event data store, CloudTrail will remove any events with an
     *         <code>eventTime</code> older than the new retention period. For example, if the previous retention period
     *         was 365 days and you decrease it to 100 days, CloudTrail will remove events with an
     *         <code>eventTime</code> older than 100 days.
     *         </p>
     */

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The retention period of the event data store, in days. If <code>BillingMode</code> is set to
     * <code>EXTENDABLE_RETENTION_PRICING</code>, you can set a retention period of up to 3653 days, the equivalent of
     * 10 years. If <code>BillingMode</code> is set to <code>FIXED_RETENTION_PRICING</code>, you can set a retention
     * period of up to 2557 days, the equivalent of seven years.
     * </p>
     * <p>
     * CloudTrail Lake determines whether to retain an event by checking if the <code>eventTime</code> of the event is
     * within the specified retention period. For example, if you set a retention period of 90 days, CloudTrail will
     * remove events when the <code>eventTime</code> is older than 90 days.
     * </p>
     * <note>
     * <p>
     * If you decrease the retention period of an event data store, CloudTrail will remove any events with an
     * <code>eventTime</code> older than the new retention period. For example, if the previous retention period was 365
     * days and you decrease it to 100 days, CloudTrail will remove events with an <code>eventTime</code> older than 100
     * days.
     * </p>
     * </note>
     * 
     * @param retentionPeriod
     *        The retention period of the event data store, in days. If <code>BillingMode</code> is set to
     *        <code>EXTENDABLE_RETENTION_PRICING</code>, you can set a retention period of up to 3653 days, the
     *        equivalent of 10 years. If <code>BillingMode</code> is set to <code>FIXED_RETENTION_PRICING</code>, you
     *        can set a retention period of up to 2557 days, the equivalent of seven years.</p>
     *        <p>
     *        CloudTrail Lake determines whether to retain an event by checking if the <code>eventTime</code> of the
     *        event is within the specified retention period. For example, if you set a retention period of 90 days,
     *        CloudTrail will remove events when the <code>eventTime</code> is older than 90 days.
     *        </p>
     *        <note>
     *        <p>
     *        If you decrease the retention period of an event data store, CloudTrail will remove any events with an
     *        <code>eventTime</code> older than the new retention period. For example, if the previous retention period
     *        was 365 days and you decrease it to 100 days, CloudTrail will remove events with an <code>eventTime</code>
     *        older than 100 days.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreRequest withRetentionPeriod(Integer retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * Indicates that termination protection is enabled and the event data store cannot be automatically deleted.
     * </p>
     * 
     * @param terminationProtectionEnabled
     *        Indicates that termination protection is enabled and the event data store cannot be automatically deleted.
     */

    public void setTerminationProtectionEnabled(Boolean terminationProtectionEnabled) {
        this.terminationProtectionEnabled = terminationProtectionEnabled;
    }

    /**
     * <p>
     * Indicates that termination protection is enabled and the event data store cannot be automatically deleted.
     * </p>
     * 
     * @return Indicates that termination protection is enabled and the event data store cannot be automatically
     *         deleted.
     */

    public Boolean getTerminationProtectionEnabled() {
        return this.terminationProtectionEnabled;
    }

    /**
     * <p>
     * Indicates that termination protection is enabled and the event data store cannot be automatically deleted.
     * </p>
     * 
     * @param terminationProtectionEnabled
     *        Indicates that termination protection is enabled and the event data store cannot be automatically deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreRequest withTerminationProtectionEnabled(Boolean terminationProtectionEnabled) {
        setTerminationProtectionEnabled(terminationProtectionEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates that termination protection is enabled and the event data store cannot be automatically deleted.
     * </p>
     * 
     * @return Indicates that termination protection is enabled and the event data store cannot be automatically
     *         deleted.
     */

    public Boolean isTerminationProtectionEnabled() {
        return this.terminationProtectionEnabled;
    }

    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the events delivered by CloudTrail. The value can be an alias name
     * prefixed by <code>alias/</code>, a fully specified ARN to an alias, a fully specified ARN to a key, or a globally
     * unique identifier.
     * </p>
     * <important>
     * <p>
     * Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents CloudTrail from
     * logging events to the event data store, and prevents users from querying the data in the event data store that
     * was encrypted with the key. After you associate an event data store with a KMS key, the KMS key cannot be removed
     * or changed. Before you disable or delete a KMS key that you are using with an event data store, delete or back up
     * your event data store.
     * </p>
     * </important>
     * <p>
     * CloudTrail also supports KMS multi-Region keys. For more information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Using multi-Region
     * keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        Specifies the KMS key ID to use to encrypt the events delivered by CloudTrail. The value can be an alias
     *        name prefixed by <code>alias/</code>, a fully specified ARN to an alias, a fully specified ARN to a key,
     *        or a globally unique identifier.</p> <important>
     *        <p>
     *        Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents CloudTrail from
     *        logging events to the event data store, and prevents users from querying the data in the event data store
     *        that was encrypted with the key. After you associate an event data store with a KMS key, the KMS key
     *        cannot be removed or changed. Before you disable or delete a KMS key that you are using with an event data
     *        store, delete or back up your event data store.
     *        </p>
     *        </important>
     *        <p>
     *        CloudTrail also supports KMS multi-Region keys. For more information about multi-Region keys, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Using
     *        multi-Region keys</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:kms:us-east-2:123456789012:alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the events delivered by CloudTrail. The value can be an alias name
     * prefixed by <code>alias/</code>, a fully specified ARN to an alias, a fully specified ARN to a key, or a globally
     * unique identifier.
     * </p>
     * <important>
     * <p>
     * Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents CloudTrail from
     * logging events to the event data store, and prevents users from querying the data in the event data store that
     * was encrypted with the key. After you associate an event data store with a KMS key, the KMS key cannot be removed
     * or changed. Before you disable or delete a KMS key that you are using with an event data store, delete or back up
     * your event data store.
     * </p>
     * </important>
     * <p>
     * CloudTrail also supports KMS multi-Region keys. For more information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Using multi-Region
     * keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the KMS key ID to use to encrypt the events delivered by CloudTrail. The value can be an alias
     *         name prefixed by <code>alias/</code>, a fully specified ARN to an alias, a fully specified ARN to a key,
     *         or a globally unique identifier.</p> <important>
     *         <p>
     *         Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents CloudTrail
     *         from logging events to the event data store, and prevents users from querying the data in the event data
     *         store that was encrypted with the key. After you associate an event data store with a KMS key, the KMS
     *         key cannot be removed or changed. Before you disable or delete a KMS key that you are using with an event
     *         data store, delete or back up your event data store.
     *         </p>
     *         </important>
     *         <p>
     *         CloudTrail also supports KMS multi-Region keys. For more information about multi-Region keys, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Using
     *         multi-Region keys</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         <p>
     *         Examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>alias/MyAliasName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:kms:us-east-2:123456789012:alias/MyAliasName</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key ID to use to encrypt the events delivered by CloudTrail. The value can be an alias name
     * prefixed by <code>alias/</code>, a fully specified ARN to an alias, a fully specified ARN to a key, or a globally
     * unique identifier.
     * </p>
     * <important>
     * <p>
     * Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents CloudTrail from
     * logging events to the event data store, and prevents users from querying the data in the event data store that
     * was encrypted with the key. After you associate an event data store with a KMS key, the KMS key cannot be removed
     * or changed. Before you disable or delete a KMS key that you are using with an event data store, delete or back up
     * your event data store.
     * </p>
     * </important>
     * <p>
     * CloudTrail also supports KMS multi-Region keys. For more information about multi-Region keys, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Using multi-Region
     * keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * Examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:alias/MyAliasName</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12345678-1234-1234-1234-123456789012</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        Specifies the KMS key ID to use to encrypt the events delivered by CloudTrail. The value can be an alias
     *        name prefixed by <code>alias/</code>, a fully specified ARN to an alias, a fully specified ARN to a key,
     *        or a globally unique identifier.</p> <important>
     *        <p>
     *        Disabling or deleting the KMS key, or removing CloudTrail permissions on the key, prevents CloudTrail from
     *        logging events to the event data store, and prevents users from querying the data in the event data store
     *        that was encrypted with the key. After you associate an event data store with a KMS key, the KMS key
     *        cannot be removed or changed. Before you disable or delete a KMS key that you are using with an event data
     *        store, delete or back up your event data store.
     *        </p>
     *        </important>
     *        <p>
     *        CloudTrail also supports KMS multi-Region keys. For more information about multi-Region keys, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-overview.html">Using
     *        multi-Region keys</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        <p>
     *        Examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:kms:us-east-2:123456789012:alias/MyAliasName</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:aws:kms:us-east-2:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEventDataStoreRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <note>
     * <p>
     * You can't change the billing mode from <code>EXTENDABLE_RETENTION_PRICING</code> to
     * <code>FIXED_RETENTION_PRICING</code>. If <code>BillingMode</code> is set to
     * <code>EXTENDABLE_RETENTION_PRICING</code> and you want to use <code>FIXED_RETENTION_PRICING</code> instead,
     * you'll need to stop ingestion on the event data store and create a new event data store that uses
     * <code>FIXED_RETENTION_PRICING</code>.
     * </p>
     * </note>
     * <p>
     * The billing mode for the event data store determines the cost for ingesting events and the default and maximum
     * retention period for the event data store.
     * </p>
     * <p>
     * The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EXTENDABLE_RETENTION_PRICING</code> - This billing mode is generally recommended if you want a flexible
     * retention period of up to 3653 days (about 10 years). The default retention period for this billing mode is 366
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIXED_RETENTION_PRICING</code> - This billing mode is recommended if you expect to ingest more than 25 TB
     * of event data per month and need a retention period of up to 2557 days (about 7 years). The default retention
     * period for this billing mode is 2557 days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CloudTrail pricing, see <a href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail
     * Pricing</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html">Managing
     * CloudTrail Lake costs</a>.
     * </p>
     * 
     * @param billingMode
     *        <p>
     *        You can't change the billing mode from <code>EXTENDABLE_RETENTION_PRICING</code> to
     *        <code>FIXED_RETENTION_PRICING</code>. If <code>BillingMode</code> is set to
     *        <code>EXTENDABLE_RETENTION_PRICING</code> and you want to use <code>FIXED_RETENTION_PRICING</code>
     *        instead, you'll need to stop ingestion on the event data store and create a new event data store that uses
     *        <code>FIXED_RETENTION_PRICING</code>.
     *        </p>
     *        </note>
     *        <p>
     *        The billing mode for the event data store determines the cost for ingesting events and the default and
     *        maximum retention period for the event data store.
     *        </p>
     *        <p>
     *        The following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EXTENDABLE_RETENTION_PRICING</code> - This billing mode is generally recommended if you want a
     *        flexible retention period of up to 3653 days (about 10 years). The default retention period for this
     *        billing mode is 366 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FIXED_RETENTION_PRICING</code> - This billing mode is recommended if you expect to ingest more than
     *        25 TB of event data per month and need a retention period of up to 2557 days (about 7 years). The default
     *        retention period for this billing mode is 2557 days.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CloudTrail pricing, see <a
     *        href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail Pricing</a> and <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html"
     *        >Managing CloudTrail Lake costs</a>.
     * @see BillingMode
     */

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    /**
     * <note>
     * <p>
     * You can't change the billing mode from <code>EXTENDABLE_RETENTION_PRICING</code> to
     * <code>FIXED_RETENTION_PRICING</code>. If <code>BillingMode</code> is set to
     * <code>EXTENDABLE_RETENTION_PRICING</code> and you want to use <code>FIXED_RETENTION_PRICING</code> instead,
     * you'll need to stop ingestion on the event data store and create a new event data store that uses
     * <code>FIXED_RETENTION_PRICING</code>.
     * </p>
     * </note>
     * <p>
     * The billing mode for the event data store determines the cost for ingesting events and the default and maximum
     * retention period for the event data store.
     * </p>
     * <p>
     * The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EXTENDABLE_RETENTION_PRICING</code> - This billing mode is generally recommended if you want a flexible
     * retention period of up to 3653 days (about 10 years). The default retention period for this billing mode is 366
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIXED_RETENTION_PRICING</code> - This billing mode is recommended if you expect to ingest more than 25 TB
     * of event data per month and need a retention period of up to 2557 days (about 7 years). The default retention
     * period for this billing mode is 2557 days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CloudTrail pricing, see <a href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail
     * Pricing</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html">Managing
     * CloudTrail Lake costs</a>.
     * </p>
     * 
     * @return <p>
     *         You can't change the billing mode from <code>EXTENDABLE_RETENTION_PRICING</code> to
     *         <code>FIXED_RETENTION_PRICING</code>. If <code>BillingMode</code> is set to
     *         <code>EXTENDABLE_RETENTION_PRICING</code> and you want to use <code>FIXED_RETENTION_PRICING</code>
     *         instead, you'll need to stop ingestion on the event data store and create a new event data store that
     *         uses <code>FIXED_RETENTION_PRICING</code>.
     *         </p>
     *         </note>
     *         <p>
     *         The billing mode for the event data store determines the cost for ingesting events and the default and
     *         maximum retention period for the event data store.
     *         </p>
     *         <p>
     *         The following are the possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EXTENDABLE_RETENTION_PRICING</code> - This billing mode is generally recommended if you want a
     *         flexible retention period of up to 3653 days (about 10 years). The default retention period for this
     *         billing mode is 366 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FIXED_RETENTION_PRICING</code> - This billing mode is recommended if you expect to ingest more than
     *         25 TB of event data per month and need a retention period of up to 2557 days (about 7 years). The default
     *         retention period for this billing mode is 2557 days.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about CloudTrail pricing, see <a
     *         href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail Pricing</a> and <a
     *         href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html"
     *         >Managing CloudTrail Lake costs</a>.
     * @see BillingMode
     */

    public String getBillingMode() {
        return this.billingMode;
    }

    /**
     * <note>
     * <p>
     * You can't change the billing mode from <code>EXTENDABLE_RETENTION_PRICING</code> to
     * <code>FIXED_RETENTION_PRICING</code>. If <code>BillingMode</code> is set to
     * <code>EXTENDABLE_RETENTION_PRICING</code> and you want to use <code>FIXED_RETENTION_PRICING</code> instead,
     * you'll need to stop ingestion on the event data store and create a new event data store that uses
     * <code>FIXED_RETENTION_PRICING</code>.
     * </p>
     * </note>
     * <p>
     * The billing mode for the event data store determines the cost for ingesting events and the default and maximum
     * retention period for the event data store.
     * </p>
     * <p>
     * The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EXTENDABLE_RETENTION_PRICING</code> - This billing mode is generally recommended if you want a flexible
     * retention period of up to 3653 days (about 10 years). The default retention period for this billing mode is 366
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIXED_RETENTION_PRICING</code> - This billing mode is recommended if you expect to ingest more than 25 TB
     * of event data per month and need a retention period of up to 2557 days (about 7 years). The default retention
     * period for this billing mode is 2557 days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CloudTrail pricing, see <a href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail
     * Pricing</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html">Managing
     * CloudTrail Lake costs</a>.
     * </p>
     * 
     * @param billingMode
     *        <p>
     *        You can't change the billing mode from <code>EXTENDABLE_RETENTION_PRICING</code> to
     *        <code>FIXED_RETENTION_PRICING</code>. If <code>BillingMode</code> is set to
     *        <code>EXTENDABLE_RETENTION_PRICING</code> and you want to use <code>FIXED_RETENTION_PRICING</code>
     *        instead, you'll need to stop ingestion on the event data store and create a new event data store that uses
     *        <code>FIXED_RETENTION_PRICING</code>.
     *        </p>
     *        </note>
     *        <p>
     *        The billing mode for the event data store determines the cost for ingesting events and the default and
     *        maximum retention period for the event data store.
     *        </p>
     *        <p>
     *        The following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EXTENDABLE_RETENTION_PRICING</code> - This billing mode is generally recommended if you want a
     *        flexible retention period of up to 3653 days (about 10 years). The default retention period for this
     *        billing mode is 366 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FIXED_RETENTION_PRICING</code> - This billing mode is recommended if you expect to ingest more than
     *        25 TB of event data per month and need a retention period of up to 2557 days (about 7 years). The default
     *        retention period for this billing mode is 2557 days.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CloudTrail pricing, see <a
     *        href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail Pricing</a> and <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html"
     *        >Managing CloudTrail Lake costs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public UpdateEventDataStoreRequest withBillingMode(String billingMode) {
        setBillingMode(billingMode);
        return this;
    }

    /**
     * <note>
     * <p>
     * You can't change the billing mode from <code>EXTENDABLE_RETENTION_PRICING</code> to
     * <code>FIXED_RETENTION_PRICING</code>. If <code>BillingMode</code> is set to
     * <code>EXTENDABLE_RETENTION_PRICING</code> and you want to use <code>FIXED_RETENTION_PRICING</code> instead,
     * you'll need to stop ingestion on the event data store and create a new event data store that uses
     * <code>FIXED_RETENTION_PRICING</code>.
     * </p>
     * </note>
     * <p>
     * The billing mode for the event data store determines the cost for ingesting events and the default and maximum
     * retention period for the event data store.
     * </p>
     * <p>
     * The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EXTENDABLE_RETENTION_PRICING</code> - This billing mode is generally recommended if you want a flexible
     * retention period of up to 3653 days (about 10 years). The default retention period for this billing mode is 366
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FIXED_RETENTION_PRICING</code> - This billing mode is recommended if you expect to ingest more than 25 TB
     * of event data per month and need a retention period of up to 2557 days (about 7 years). The default retention
     * period for this billing mode is 2557 days.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about CloudTrail pricing, see <a href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail
     * Pricing</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html">Managing
     * CloudTrail Lake costs</a>.
     * </p>
     * 
     * @param billingMode
     *        <p>
     *        You can't change the billing mode from <code>EXTENDABLE_RETENTION_PRICING</code> to
     *        <code>FIXED_RETENTION_PRICING</code>. If <code>BillingMode</code> is set to
     *        <code>EXTENDABLE_RETENTION_PRICING</code> and you want to use <code>FIXED_RETENTION_PRICING</code>
     *        instead, you'll need to stop ingestion on the event data store and create a new event data store that uses
     *        <code>FIXED_RETENTION_PRICING</code>.
     *        </p>
     *        </note>
     *        <p>
     *        The billing mode for the event data store determines the cost for ingesting events and the default and
     *        maximum retention period for the event data store.
     *        </p>
     *        <p>
     *        The following are the possible values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EXTENDABLE_RETENTION_PRICING</code> - This billing mode is generally recommended if you want a
     *        flexible retention period of up to 3653 days (about 10 years). The default retention period for this
     *        billing mode is 366 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FIXED_RETENTION_PRICING</code> - This billing mode is recommended if you expect to ingest more than
     *        25 TB of event data per month and need a retention period of up to 2557 days (about 7 years). The default
     *        retention period for this billing mode is 2557 days.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about CloudTrail pricing, see <a
     *        href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail Pricing</a> and <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html"
     *        >Managing CloudTrail Lake costs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public UpdateEventDataStoreRequest withBillingMode(BillingMode billingMode) {
        this.billingMode = billingMode.toString();
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
        if (getEventDataStore() != null)
            sb.append("EventDataStore: ").append(getEventDataStore()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getBillingMode() != null)
            sb.append("BillingMode: ").append(getBillingMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEventDataStoreRequest == false)
            return false;
        UpdateEventDataStoreRequest other = (UpdateEventDataStoreRequest) obj;
        if (other.getEventDataStore() == null ^ this.getEventDataStore() == null)
            return false;
        if (other.getEventDataStore() != null && other.getEventDataStore().equals(this.getEventDataStore()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getBillingMode() == null ^ this.getBillingMode() == null)
            return false;
        if (other.getBillingMode() != null && other.getBillingMode().equals(this.getBillingMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventDataStore() == null) ? 0 : getEventDataStore().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAdvancedEventSelectors() == null) ? 0 : getAdvancedEventSelectors().hashCode());
        hashCode = prime * hashCode + ((getMultiRegionEnabled() == null) ? 0 : getMultiRegionEnabled().hashCode());
        hashCode = prime * hashCode + ((getOrganizationEnabled() == null) ? 0 : getOrganizationEnabled().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getTerminationProtectionEnabled() == null) ? 0 : getTerminationProtectionEnabled().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getBillingMode() == null) ? 0 : getBillingMode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEventDataStoreRequest clone() {
        return (UpdateEventDataStoreRequest) super.clone();
    }

}
