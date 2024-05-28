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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/CreateEventDataStore" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventDataStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the event data store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The advanced event selectors to use to select the events for the data store. You can configure up to five
     * advanced event selectors for each event data store.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to log CloudTrail events, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced"
     * >Log events by using advanced event selectors</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to include Config configuration items in your
     * event data store, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config"
     * >Create an event data store for Config configuration items</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to include non-Amazon Web Services events in your
     * event data store, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration"
     * >Create an integration to log events from outside Amazon Web Services</a> in the CloudTrail User Guide.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AdvancedEventSelector> advancedEventSelectors;
    /**
     * <p>
     * Specifies whether the event data store includes events from all Regions, or only from the Region in which the
     * event data store is created.
     * </p>
     */
    private Boolean multiRegionEnabled;
    /**
     * <p>
     * Specifies whether an event data store collects events logged for an organization in Organizations.
     * </p>
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
     * If you plan to copy trail events to this event data store, we recommend that you consider both the age of the
     * events that you want to copy as well as how long you want to keep the copied events in your event data store. For
     * example, if you copy trail events that are 5 years old and specify a retention period of 7 years, the event data
     * store will retain those events for two years.
     * </p>
     * </note>
     */
    private Integer retentionPeriod;
    /**
     * <p>
     * Specifies whether termination protection is enabled for the event data store. If termination protection is
     * enabled, you cannot delete the event data store until termination protection is disabled.
     * </p>
     */
    private Boolean terminationProtectionEnabled;

    private com.amazonaws.internal.SdkInternalList<Tag> tagsList;
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
     * <p>
     * Specifies whether the event data store should start ingesting live events. The default is true.
     * </p>
     */
    private Boolean startIngestion;
    /**
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
     * The default value is <code>EXTENDABLE_RETENTION_PRICING</code>.
     * </p>
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

    public CreateEventDataStoreRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The advanced event selectors to use to select the events for the data store. You can configure up to five
     * advanced event selectors for each event data store.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to log CloudTrail events, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced"
     * >Log events by using advanced event selectors</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to include Config configuration items in your
     * event data store, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config"
     * >Create an event data store for Config configuration items</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to include non-Amazon Web Services events in your
     * event data store, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration"
     * >Create an integration to log events from outside Amazon Web Services</a> in the CloudTrail User Guide.
     * </p>
     * 
     * @return The advanced event selectors to use to select the events for the data store. You can configure up to five
     *         advanced event selectors for each event data store.</p>
     *         <p>
     *         For more information about how to use advanced event selectors to log CloudTrail events, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced"
     *         >Log events by using advanced event selectors</a> in the CloudTrail User Guide.
     *         </p>
     *         <p>
     *         For more information about how to use advanced event selectors to include Config configuration items in
     *         your event data store, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config"
     *         >Create an event data store for Config configuration items</a> in the CloudTrail User Guide.
     *         </p>
     *         <p>
     *         For more information about how to use advanced event selectors to include non-Amazon Web Services events
     *         in your event data store, see <a href=
     *         "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration"
     *         >Create an integration to log events from outside Amazon Web Services</a> in the CloudTrail User Guide.
     */

    public java.util.List<AdvancedEventSelector> getAdvancedEventSelectors() {
        if (advancedEventSelectors == null) {
            advancedEventSelectors = new com.amazonaws.internal.SdkInternalList<AdvancedEventSelector>();
        }
        return advancedEventSelectors;
    }

    /**
     * <p>
     * The advanced event selectors to use to select the events for the data store. You can configure up to five
     * advanced event selectors for each event data store.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to log CloudTrail events, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced"
     * >Log events by using advanced event selectors</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to include Config configuration items in your
     * event data store, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config"
     * >Create an event data store for Config configuration items</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to include non-Amazon Web Services events in your
     * event data store, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration"
     * >Create an integration to log events from outside Amazon Web Services</a> in the CloudTrail User Guide.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors to use to select the events for the data store. You can configure up to five
     *        advanced event selectors for each event data store.</p>
     *        <p>
     *        For more information about how to use advanced event selectors to log CloudTrail events, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced"
     *        >Log events by using advanced event selectors</a> in the CloudTrail User Guide.
     *        </p>
     *        <p>
     *        For more information about how to use advanced event selectors to include Config configuration items in
     *        your event data store, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config"
     *        >Create an event data store for Config configuration items</a> in the CloudTrail User Guide.
     *        </p>
     *        <p>
     *        For more information about how to use advanced event selectors to include non-Amazon Web Services events
     *        in your event data store, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration"
     *        >Create an integration to log events from outside Amazon Web Services</a> in the CloudTrail User Guide.
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
     * The advanced event selectors to use to select the events for the data store. You can configure up to five
     * advanced event selectors for each event data store.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to log CloudTrail events, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced"
     * >Log events by using advanced event selectors</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to include Config configuration items in your
     * event data store, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config"
     * >Create an event data store for Config configuration items</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to include non-Amazon Web Services events in your
     * event data store, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration"
     * >Create an integration to log events from outside Amazon Web Services</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdvancedEventSelectors(java.util.Collection)} or
     * {@link #withAdvancedEventSelectors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors to use to select the events for the data store. You can configure up to five
     *        advanced event selectors for each event data store.</p>
     *        <p>
     *        For more information about how to use advanced event selectors to log CloudTrail events, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced"
     *        >Log events by using advanced event selectors</a> in the CloudTrail User Guide.
     *        </p>
     *        <p>
     *        For more information about how to use advanced event selectors to include Config configuration items in
     *        your event data store, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config"
     *        >Create an event data store for Config configuration items</a> in the CloudTrail User Guide.
     *        </p>
     *        <p>
     *        For more information about how to use advanced event selectors to include non-Amazon Web Services events
     *        in your event data store, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration"
     *        >Create an integration to log events from outside Amazon Web Services</a> in the CloudTrail User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreRequest withAdvancedEventSelectors(AdvancedEventSelector... advancedEventSelectors) {
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
     * The advanced event selectors to use to select the events for the data store. You can configure up to five
     * advanced event selectors for each event data store.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to log CloudTrail events, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced"
     * >Log events by using advanced event selectors</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to include Config configuration items in your
     * event data store, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config"
     * >Create an event data store for Config configuration items</a> in the CloudTrail User Guide.
     * </p>
     * <p>
     * For more information about how to use advanced event selectors to include non-Amazon Web Services events in your
     * event data store, see <a href=
     * "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration"
     * >Create an integration to log events from outside Amazon Web Services</a> in the CloudTrail User Guide.
     * </p>
     * 
     * @param advancedEventSelectors
     *        The advanced event selectors to use to select the events for the data store. You can configure up to five
     *        advanced event selectors for each event data store.</p>
     *        <p>
     *        For more information about how to use advanced event selectors to log CloudTrail events, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced"
     *        >Log events by using advanced event selectors</a> in the CloudTrail User Guide.
     *        </p>
     *        <p>
     *        For more information about how to use advanced event selectors to include Config configuration items in
     *        your event data store, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-eds-config"
     *        >Create an event data store for Config configuration items</a> in the CloudTrail User Guide.
     *        </p>
     *        <p>
     *        For more information about how to use advanced event selectors to include non-Amazon Web Services events
     *        in your event data store, see <a href=
     *        "https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-lake-cli.html#lake-cli-create-integration"
     *        >Create an integration to log events from outside Amazon Web Services</a> in the CloudTrail User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreRequest withAdvancedEventSelectors(java.util.Collection<AdvancedEventSelector> advancedEventSelectors) {
        setAdvancedEventSelectors(advancedEventSelectors);
        return this;
    }

    /**
     * <p>
     * Specifies whether the event data store includes events from all Regions, or only from the Region in which the
     * event data store is created.
     * </p>
     * 
     * @param multiRegionEnabled
     *        Specifies whether the event data store includes events from all Regions, or only from the Region in which
     *        the event data store is created.
     */

    public void setMultiRegionEnabled(Boolean multiRegionEnabled) {
        this.multiRegionEnabled = multiRegionEnabled;
    }

    /**
     * <p>
     * Specifies whether the event data store includes events from all Regions, or only from the Region in which the
     * event data store is created.
     * </p>
     * 
     * @return Specifies whether the event data store includes events from all Regions, or only from the Region in which
     *         the event data store is created.
     */

    public Boolean getMultiRegionEnabled() {
        return this.multiRegionEnabled;
    }

    /**
     * <p>
     * Specifies whether the event data store includes events from all Regions, or only from the Region in which the
     * event data store is created.
     * </p>
     * 
     * @param multiRegionEnabled
     *        Specifies whether the event data store includes events from all Regions, or only from the Region in which
     *        the event data store is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreRequest withMultiRegionEnabled(Boolean multiRegionEnabled) {
        setMultiRegionEnabled(multiRegionEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the event data store includes events from all Regions, or only from the Region in which the
     * event data store is created.
     * </p>
     * 
     * @return Specifies whether the event data store includes events from all Regions, or only from the Region in which
     *         the event data store is created.
     */

    public Boolean isMultiRegionEnabled() {
        return this.multiRegionEnabled;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events logged for an organization in Organizations.
     * </p>
     * 
     * @param organizationEnabled
     *        Specifies whether an event data store collects events logged for an organization in Organizations.
     */

    public void setOrganizationEnabled(Boolean organizationEnabled) {
        this.organizationEnabled = organizationEnabled;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events logged for an organization in Organizations.
     * </p>
     * 
     * @return Specifies whether an event data store collects events logged for an organization in Organizations.
     */

    public Boolean getOrganizationEnabled() {
        return this.organizationEnabled;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events logged for an organization in Organizations.
     * </p>
     * 
     * @param organizationEnabled
     *        Specifies whether an event data store collects events logged for an organization in Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreRequest withOrganizationEnabled(Boolean organizationEnabled) {
        setOrganizationEnabled(organizationEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether an event data store collects events logged for an organization in Organizations.
     * </p>
     * 
     * @return Specifies whether an event data store collects events logged for an organization in Organizations.
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
     * If you plan to copy trail events to this event data store, we recommend that you consider both the age of the
     * events that you want to copy as well as how long you want to keep the copied events in your event data store. For
     * example, if you copy trail events that are 5 years old and specify a retention period of 7 years, the event data
     * store will retain those events for two years.
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
     *        If you plan to copy trail events to this event data store, we recommend that you consider both the age of
     *        the events that you want to copy as well as how long you want to keep the copied events in your event data
     *        store. For example, if you copy trail events that are 5 years old and specify a retention period of 7
     *        years, the event data store will retain those events for two years.
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
     * If you plan to copy trail events to this event data store, we recommend that you consider both the age of the
     * events that you want to copy as well as how long you want to keep the copied events in your event data store. For
     * example, if you copy trail events that are 5 years old and specify a retention period of 7 years, the event data
     * store will retain those events for two years.
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
     *         If you plan to copy trail events to this event data store, we recommend that you consider both the age of
     *         the events that you want to copy as well as how long you want to keep the copied events in your event
     *         data store. For example, if you copy trail events that are 5 years old and specify a retention period of
     *         7 years, the event data store will retain those events for two years.
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
     * If you plan to copy trail events to this event data store, we recommend that you consider both the age of the
     * events that you want to copy as well as how long you want to keep the copied events in your event data store. For
     * example, if you copy trail events that are 5 years old and specify a retention period of 7 years, the event data
     * store will retain those events for two years.
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
     *        If you plan to copy trail events to this event data store, we recommend that you consider both the age of
     *        the events that you want to copy as well as how long you want to keep the copied events in your event data
     *        store. For example, if you copy trail events that are 5 years old and specify a retention period of 7
     *        years, the event data store will retain those events for two years.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreRequest withRetentionPeriod(Integer retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * Specifies whether termination protection is enabled for the event data store. If termination protection is
     * enabled, you cannot delete the event data store until termination protection is disabled.
     * </p>
     * 
     * @param terminationProtectionEnabled
     *        Specifies whether termination protection is enabled for the event data store. If termination protection is
     *        enabled, you cannot delete the event data store until termination protection is disabled.
     */

    public void setTerminationProtectionEnabled(Boolean terminationProtectionEnabled) {
        this.terminationProtectionEnabled = terminationProtectionEnabled;
    }

    /**
     * <p>
     * Specifies whether termination protection is enabled for the event data store. If termination protection is
     * enabled, you cannot delete the event data store until termination protection is disabled.
     * </p>
     * 
     * @return Specifies whether termination protection is enabled for the event data store. If termination protection
     *         is enabled, you cannot delete the event data store until termination protection is disabled.
     */

    public Boolean getTerminationProtectionEnabled() {
        return this.terminationProtectionEnabled;
    }

    /**
     * <p>
     * Specifies whether termination protection is enabled for the event data store. If termination protection is
     * enabled, you cannot delete the event data store until termination protection is disabled.
     * </p>
     * 
     * @param terminationProtectionEnabled
     *        Specifies whether termination protection is enabled for the event data store. If termination protection is
     *        enabled, you cannot delete the event data store until termination protection is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreRequest withTerminationProtectionEnabled(Boolean terminationProtectionEnabled) {
        setTerminationProtectionEnabled(terminationProtectionEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether termination protection is enabled for the event data store. If termination protection is
     * enabled, you cannot delete the event data store until termination protection is disabled.
     * </p>
     * 
     * @return Specifies whether termination protection is enabled for the event data store. If termination protection
     *         is enabled, you cannot delete the event data store until termination protection is disabled.
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

    public CreateEventDataStoreRequest withTagsList(Tag... tagsList) {
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

    public CreateEventDataStoreRequest withTagsList(java.util.Collection<Tag> tagsList) {
        setTagsList(tagsList);
        return this;
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

    public CreateEventDataStoreRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the event data store should start ingesting live events. The default is true.
     * </p>
     * 
     * @param startIngestion
     *        Specifies whether the event data store should start ingesting live events. The default is true.
     */

    public void setStartIngestion(Boolean startIngestion) {
        this.startIngestion = startIngestion;
    }

    /**
     * <p>
     * Specifies whether the event data store should start ingesting live events. The default is true.
     * </p>
     * 
     * @return Specifies whether the event data store should start ingesting live events. The default is true.
     */

    public Boolean getStartIngestion() {
        return this.startIngestion;
    }

    /**
     * <p>
     * Specifies whether the event data store should start ingesting live events. The default is true.
     * </p>
     * 
     * @param startIngestion
     *        Specifies whether the event data store should start ingesting live events. The default is true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDataStoreRequest withStartIngestion(Boolean startIngestion) {
        setStartIngestion(startIngestion);
        return this;
    }

    /**
     * <p>
     * Specifies whether the event data store should start ingesting live events. The default is true.
     * </p>
     * 
     * @return Specifies whether the event data store should start ingesting live events. The default is true.
     */

    public Boolean isStartIngestion() {
        return this.startIngestion;
    }

    /**
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
     * The default value is <code>EXTENDABLE_RETENTION_PRICING</code>.
     * </p>
     * <p>
     * For more information about CloudTrail pricing, see <a href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail
     * Pricing</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html">Managing
     * CloudTrail Lake costs</a>.
     * </p>
     * 
     * @param billingMode
     *        The billing mode for the event data store determines the cost for ingesting events and the default and
     *        maximum retention period for the event data store.</p>
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
     *        The default value is <code>EXTENDABLE_RETENTION_PRICING</code>.
     *        </p>
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
     * The default value is <code>EXTENDABLE_RETENTION_PRICING</code>.
     * </p>
     * <p>
     * For more information about CloudTrail pricing, see <a href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail
     * Pricing</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html">Managing
     * CloudTrail Lake costs</a>.
     * </p>
     * 
     * @return The billing mode for the event data store determines the cost for ingesting events and the default and
     *         maximum retention period for the event data store.</p>
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
     *         The default value is <code>EXTENDABLE_RETENTION_PRICING</code>.
     *         </p>
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
     * The default value is <code>EXTENDABLE_RETENTION_PRICING</code>.
     * </p>
     * <p>
     * For more information about CloudTrail pricing, see <a href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail
     * Pricing</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html">Managing
     * CloudTrail Lake costs</a>.
     * </p>
     * 
     * @param billingMode
     *        The billing mode for the event data store determines the cost for ingesting events and the default and
     *        maximum retention period for the event data store.</p>
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
     *        The default value is <code>EXTENDABLE_RETENTION_PRICING</code>.
     *        </p>
     *        <p>
     *        For more information about CloudTrail pricing, see <a
     *        href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail Pricing</a> and <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html"
     *        >Managing CloudTrail Lake costs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public CreateEventDataStoreRequest withBillingMode(String billingMode) {
        setBillingMode(billingMode);
        return this;
    }

    /**
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
     * The default value is <code>EXTENDABLE_RETENTION_PRICING</code>.
     * </p>
     * <p>
     * For more information about CloudTrail pricing, see <a href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail
     * Pricing</a> and <a
     * href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html">Managing
     * CloudTrail Lake costs</a>.
     * </p>
     * 
     * @param billingMode
     *        The billing mode for the event data store determines the cost for ingesting events and the default and
     *        maximum retention period for the event data store.</p>
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
     *        The default value is <code>EXTENDABLE_RETENTION_PRICING</code>.
     *        </p>
     *        <p>
     *        For more information about CloudTrail pricing, see <a
     *        href="http://aws.amazon.com/cloudtrail/pricing/">CloudTrail Pricing</a> and <a
     *        href="https://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-lake-manage-costs.html"
     *        >Managing CloudTrail Lake costs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public CreateEventDataStoreRequest withBillingMode(BillingMode billingMode) {
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
        if (getTagsList() != null)
            sb.append("TagsList: ").append(getTagsList()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getStartIngestion() != null)
            sb.append("StartIngestion: ").append(getStartIngestion()).append(",");
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

        if (obj instanceof CreateEventDataStoreRequest == false)
            return false;
        CreateEventDataStoreRequest other = (CreateEventDataStoreRequest) obj;
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
        if (other.getTagsList() == null ^ this.getTagsList() == null)
            return false;
        if (other.getTagsList() != null && other.getTagsList().equals(this.getTagsList()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getStartIngestion() == null ^ this.getStartIngestion() == null)
            return false;
        if (other.getStartIngestion() != null && other.getStartIngestion().equals(this.getStartIngestion()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAdvancedEventSelectors() == null) ? 0 : getAdvancedEventSelectors().hashCode());
        hashCode = prime * hashCode + ((getMultiRegionEnabled() == null) ? 0 : getMultiRegionEnabled().hashCode());
        hashCode = prime * hashCode + ((getOrganizationEnabled() == null) ? 0 : getOrganizationEnabled().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getTerminationProtectionEnabled() == null) ? 0 : getTerminationProtectionEnabled().hashCode());
        hashCode = prime * hashCode + ((getTagsList() == null) ? 0 : getTagsList().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getStartIngestion() == null) ? 0 : getStartIngestion().hashCode());
        hashCode = prime * hashCode + ((getBillingMode() == null) ? 0 : getBillingMode().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventDataStoreRequest clone() {
        return (CreateEventDataStoreRequest) super.clone();
    }

}
