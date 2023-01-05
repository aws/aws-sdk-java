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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single metric data query to include in a batch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/BatchGetMetricDataQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetMetricDataQuery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The query identifier.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The query namespace - e.g. <code>VDM</code>
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The queried metric. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND</code> – Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to the
     * mailbox simulator and emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Complaints received for your account. This excludes complaints from the mailbox
     * simulator, those originating from your account-level suppression list (if enabled), and those for emails
     * addressed to more than one recipient
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERMANENT_BOUNCE</code> – Permanent bounces - i.e. feedback received for emails sent to non-existent
     * mailboxes. Excludes bounces from the mailbox simulator, those originating from your account-level suppression
     * list (if enabled), and those for emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSIENT_BOUNCE</code> – Transient bounces - i.e. feedback received for delivery failures excluding issues
     * with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPEN</code> – Unique open events for emails including open trackers. Excludes opens for emails addressed to
     * more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLICK</code> – Unique click events for emails including wrapped links. Excludes clicks for emails addressed
     * to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY</code> – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
     * simulator and for emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_OPEN</code> – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
     * simulator, for emails addressed to more than one recipient, and emails without open trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_CLICK</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     * mailbox simulator, for emails addressed to more than one recipient, and emails without click trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_COMPLAINT</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     * mailbox simulator, for emails addressed to more than one recipient, and emails addressed to recipients hosted by
     * ISPs with which Amazon SES does not have a feedback loop agreement.
     * </p>
     * </li>
     * </ul>
     */
    private String metric;
    /**
     * <p>
     * An object that contains mapping between <code>MetricDimensionName</code> and <code>MetricDimensionValue</code> to
     * filter metrics by.
     * </p>
     */
    private java.util.Map<String, String> dimensions;
    /**
     * <p>
     * Represents the start date for the query interval.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * Represents the end date for the query interval.
     * </p>
     */
    private java.util.Date endDate;

    /**
     * <p>
     * The query identifier.
     * </p>
     * 
     * @param id
     *        The query identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The query identifier.
     * </p>
     * 
     * @return The query identifier.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The query identifier.
     * </p>
     * 
     * @param id
     *        The query identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataQuery withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The query namespace - e.g. <code>VDM</code>
     * </p>
     * 
     * @param namespace
     *        The query namespace - e.g. <code>VDM</code>
     * @see MetricNamespace
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The query namespace - e.g. <code>VDM</code>
     * </p>
     * 
     * @return The query namespace - e.g. <code>VDM</code>
     * @see MetricNamespace
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The query namespace - e.g. <code>VDM</code>
     * </p>
     * 
     * @param namespace
     *        The query namespace - e.g. <code>VDM</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricNamespace
     */

    public BatchGetMetricDataQuery withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The query namespace - e.g. <code>VDM</code>
     * </p>
     * 
     * @param namespace
     *        The query namespace - e.g. <code>VDM</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricNamespace
     */

    public BatchGetMetricDataQuery withNamespace(MetricNamespace namespace) {
        this.namespace = namespace.toString();
        return this;
    }

    /**
     * <p>
     * The queried metric. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND</code> – Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to the
     * mailbox simulator and emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Complaints received for your account. This excludes complaints from the mailbox
     * simulator, those originating from your account-level suppression list (if enabled), and those for emails
     * addressed to more than one recipient
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERMANENT_BOUNCE</code> – Permanent bounces - i.e. feedback received for emails sent to non-existent
     * mailboxes. Excludes bounces from the mailbox simulator, those originating from your account-level suppression
     * list (if enabled), and those for emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSIENT_BOUNCE</code> – Transient bounces - i.e. feedback received for delivery failures excluding issues
     * with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPEN</code> – Unique open events for emails including open trackers. Excludes opens for emails addressed to
     * more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLICK</code> – Unique click events for emails including wrapped links. Excludes clicks for emails addressed
     * to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY</code> – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
     * simulator and for emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_OPEN</code> – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
     * simulator, for emails addressed to more than one recipient, and emails without open trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_CLICK</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     * mailbox simulator, for emails addressed to more than one recipient, and emails without click trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_COMPLAINT</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     * mailbox simulator, for emails addressed to more than one recipient, and emails addressed to recipients hosted by
     * ISPs with which Amazon SES does not have a feedback loop agreement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        The queried metric. This can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SEND</code> – Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to
     *        the mailbox simulator and emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLAINT</code> – Complaints received for your account. This excludes complaints from the mailbox
     *        simulator, those originating from your account-level suppression list (if enabled), and those for emails
     *        addressed to more than one recipient
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERMANENT_BOUNCE</code> – Permanent bounces - i.e. feedback received for emails sent to non-existent
     *        mailboxes. Excludes bounces from the mailbox simulator, those originating from your account-level
     *        suppression list (if enabled), and those for emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRANSIENT_BOUNCE</code> – Transient bounces - i.e. feedback received for delivery failures excluding
     *        issues with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for emails
     *        addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPEN</code> – Unique open events for emails including open trackers. Excludes opens for emails
     *        addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLICK</code> – Unique click events for emails including wrapped links. Excludes clicks for emails
     *        addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *        mailbox simulator and for emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY_OPEN</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *        mailbox simulator, for emails addressed to more than one recipient, and emails without open trackers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY_CLICK</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *        mailbox simulator, for emails addressed to more than one recipient, and emails without click trackers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY_COMPLAINT</code> – Successful deliveries for email sending attempts. Excludes deliveries to
     *        the mailbox simulator, for emails addressed to more than one recipient, and emails addressed to recipients
     *        hosted by ISPs with which Amazon SES does not have a feedback loop agreement.
     *        </p>
     *        </li>
     * @see Metric
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The queried metric. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND</code> – Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to the
     * mailbox simulator and emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Complaints received for your account. This excludes complaints from the mailbox
     * simulator, those originating from your account-level suppression list (if enabled), and those for emails
     * addressed to more than one recipient
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERMANENT_BOUNCE</code> – Permanent bounces - i.e. feedback received for emails sent to non-existent
     * mailboxes. Excludes bounces from the mailbox simulator, those originating from your account-level suppression
     * list (if enabled), and those for emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSIENT_BOUNCE</code> – Transient bounces - i.e. feedback received for delivery failures excluding issues
     * with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPEN</code> – Unique open events for emails including open trackers. Excludes opens for emails addressed to
     * more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLICK</code> – Unique click events for emails including wrapped links. Excludes clicks for emails addressed
     * to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY</code> – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
     * simulator and for emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_OPEN</code> – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
     * simulator, for emails addressed to more than one recipient, and emails without open trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_CLICK</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     * mailbox simulator, for emails addressed to more than one recipient, and emails without click trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_COMPLAINT</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     * mailbox simulator, for emails addressed to more than one recipient, and emails addressed to recipients hosted by
     * ISPs with which Amazon SES does not have a feedback loop agreement.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The queried metric. This can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SEND</code> – Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to
     *         the mailbox simulator and emails addressed to more than one recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLAINT</code> – Complaints received for your account. This excludes complaints from the mailbox
     *         simulator, those originating from your account-level suppression list (if enabled), and those for emails
     *         addressed to more than one recipient
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PERMANENT_BOUNCE</code> – Permanent bounces - i.e. feedback received for emails sent to
     *         non-existent mailboxes. Excludes bounces from the mailbox simulator, those originating from your
     *         account-level suppression list (if enabled), and those for emails addressed to more than one recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TRANSIENT_BOUNCE</code> – Transient bounces - i.e. feedback received for delivery failures
     *         excluding issues with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for
     *         emails addressed to more than one recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPEN</code> – Unique open events for emails including open trackers. Excludes opens for emails
     *         addressed to more than one recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CLICK</code> – Unique click events for emails including wrapped links. Excludes clicks for emails
     *         addressed to more than one recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELIVERY</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *         mailbox simulator and for emails addressed to more than one recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELIVERY_OPEN</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *         mailbox simulator, for emails addressed to more than one recipient, and emails without open trackers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELIVERY_CLICK</code> – Successful deliveries for email sending attempts. Excludes deliveries to
     *         the mailbox simulator, for emails addressed to more than one recipient, and emails without click
     *         trackers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELIVERY_COMPLAINT</code> – Successful deliveries for email sending attempts. Excludes deliveries
     *         to the mailbox simulator, for emails addressed to more than one recipient, and emails addressed to
     *         recipients hosted by ISPs with which Amazon SES does not have a feedback loop agreement.
     *         </p>
     *         </li>
     * @see Metric
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The queried metric. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND</code> – Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to the
     * mailbox simulator and emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Complaints received for your account. This excludes complaints from the mailbox
     * simulator, those originating from your account-level suppression list (if enabled), and those for emails
     * addressed to more than one recipient
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERMANENT_BOUNCE</code> – Permanent bounces - i.e. feedback received for emails sent to non-existent
     * mailboxes. Excludes bounces from the mailbox simulator, those originating from your account-level suppression
     * list (if enabled), and those for emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSIENT_BOUNCE</code> – Transient bounces - i.e. feedback received for delivery failures excluding issues
     * with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPEN</code> – Unique open events for emails including open trackers. Excludes opens for emails addressed to
     * more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLICK</code> – Unique click events for emails including wrapped links. Excludes clicks for emails addressed
     * to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY</code> – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
     * simulator and for emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_OPEN</code> – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
     * simulator, for emails addressed to more than one recipient, and emails without open trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_CLICK</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     * mailbox simulator, for emails addressed to more than one recipient, and emails without click trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_COMPLAINT</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     * mailbox simulator, for emails addressed to more than one recipient, and emails addressed to recipients hosted by
     * ISPs with which Amazon SES does not have a feedback loop agreement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        The queried metric. This can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SEND</code> – Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to
     *        the mailbox simulator and emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLAINT</code> – Complaints received for your account. This excludes complaints from the mailbox
     *        simulator, those originating from your account-level suppression list (if enabled), and those for emails
     *        addressed to more than one recipient
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERMANENT_BOUNCE</code> – Permanent bounces - i.e. feedback received for emails sent to non-existent
     *        mailboxes. Excludes bounces from the mailbox simulator, those originating from your account-level
     *        suppression list (if enabled), and those for emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRANSIENT_BOUNCE</code> – Transient bounces - i.e. feedback received for delivery failures excluding
     *        issues with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for emails
     *        addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPEN</code> – Unique open events for emails including open trackers. Excludes opens for emails
     *        addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLICK</code> – Unique click events for emails including wrapped links. Excludes clicks for emails
     *        addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *        mailbox simulator and for emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY_OPEN</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *        mailbox simulator, for emails addressed to more than one recipient, and emails without open trackers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY_CLICK</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *        mailbox simulator, for emails addressed to more than one recipient, and emails without click trackers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY_COMPLAINT</code> – Successful deliveries for email sending attempts. Excludes deliveries to
     *        the mailbox simulator, for emails addressed to more than one recipient, and emails addressed to recipients
     *        hosted by ISPs with which Amazon SES does not have a feedback loop agreement.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Metric
     */

    public BatchGetMetricDataQuery withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The queried metric. This can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND</code> – Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to the
     * mailbox simulator and emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLAINT</code> – Complaints received for your account. This excludes complaints from the mailbox
     * simulator, those originating from your account-level suppression list (if enabled), and those for emails
     * addressed to more than one recipient
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PERMANENT_BOUNCE</code> – Permanent bounces - i.e. feedback received for emails sent to non-existent
     * mailboxes. Excludes bounces from the mailbox simulator, those originating from your account-level suppression
     * list (if enabled), and those for emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TRANSIENT_BOUNCE</code> – Transient bounces - i.e. feedback received for delivery failures excluding issues
     * with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPEN</code> – Unique open events for emails including open trackers. Excludes opens for emails addressed to
     * more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLICK</code> – Unique click events for emails including wrapped links. Excludes clicks for emails addressed
     * to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY</code> – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
     * simulator and for emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_OPEN</code> – Successful deliveries for email sending attempts. Excludes deliveries to the mailbox
     * simulator, for emails addressed to more than one recipient, and emails without open trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_CLICK</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     * mailbox simulator, for emails addressed to more than one recipient, and emails without click trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY_COMPLAINT</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     * mailbox simulator, for emails addressed to more than one recipient, and emails addressed to recipients hosted by
     * ISPs with which Amazon SES does not have a feedback loop agreement.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        The queried metric. This can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SEND</code> – Emails sent eligible for tracking in the VDM dashboard. This excludes emails sent to
     *        the mailbox simulator and emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLAINT</code> – Complaints received for your account. This excludes complaints from the mailbox
     *        simulator, those originating from your account-level suppression list (if enabled), and those for emails
     *        addressed to more than one recipient
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PERMANENT_BOUNCE</code> – Permanent bounces - i.e. feedback received for emails sent to non-existent
     *        mailboxes. Excludes bounces from the mailbox simulator, those originating from your account-level
     *        suppression list (if enabled), and those for emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TRANSIENT_BOUNCE</code> – Transient bounces - i.e. feedback received for delivery failures excluding
     *        issues with non-existent mailboxes. Excludes bounces from the mailbox simulator, and those for emails
     *        addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPEN</code> – Unique open events for emails including open trackers. Excludes opens for emails
     *        addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLICK</code> – Unique click events for emails including wrapped links. Excludes clicks for emails
     *        addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *        mailbox simulator and for emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY_OPEN</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *        mailbox simulator, for emails addressed to more than one recipient, and emails without open trackers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY_CLICK</code> – Successful deliveries for email sending attempts. Excludes deliveries to the
     *        mailbox simulator, for emails addressed to more than one recipient, and emails without click trackers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY_COMPLAINT</code> – Successful deliveries for email sending attempts. Excludes deliveries to
     *        the mailbox simulator, for emails addressed to more than one recipient, and emails addressed to recipients
     *        hosted by ISPs with which Amazon SES does not have a feedback loop agreement.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Metric
     */

    public BatchGetMetricDataQuery withMetric(Metric metric) {
        this.metric = metric.toString();
        return this;
    }

    /**
     * <p>
     * An object that contains mapping between <code>MetricDimensionName</code> and <code>MetricDimensionValue</code> to
     * filter metrics by.
     * </p>
     * 
     * @return An object that contains mapping between <code>MetricDimensionName</code> and
     *         <code>MetricDimensionValue</code> to filter metrics by.
     */

    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * An object that contains mapping between <code>MetricDimensionName</code> and <code>MetricDimensionValue</code> to
     * filter metrics by.
     * </p>
     * 
     * @param dimensions
     *        An object that contains mapping between <code>MetricDimensionName</code> and
     *        <code>MetricDimensionValue</code> to filter metrics by.
     */

    public void setDimensions(java.util.Map<String, String> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * An object that contains mapping between <code>MetricDimensionName</code> and <code>MetricDimensionValue</code> to
     * filter metrics by.
     * </p>
     * 
     * @param dimensions
     *        An object that contains mapping between <code>MetricDimensionName</code> and
     *        <code>MetricDimensionValue</code> to filter metrics by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataQuery withDimensions(java.util.Map<String, String> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * Add a single Dimensions entry
     *
     * @see BatchGetMetricDataQuery#withDimensions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataQuery addDimensionsEntry(String key, String value) {
        if (null == this.dimensions) {
            this.dimensions = new java.util.HashMap<String, String>();
        }
        if (this.dimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Dimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataQuery clearDimensionsEntries() {
        this.dimensions = null;
        return this;
    }

    /**
     * <p>
     * Represents the start date for the query interval.
     * </p>
     * 
     * @param startDate
     *        Represents the start date for the query interval.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * Represents the start date for the query interval.
     * </p>
     * 
     * @return Represents the start date for the query interval.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * Represents the start date for the query interval.
     * </p>
     * 
     * @param startDate
     *        Represents the start date for the query interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataQuery withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * Represents the end date for the query interval.
     * </p>
     * 
     * @param endDate
     *        Represents the end date for the query interval.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * Represents the end date for the query interval.
     * </p>
     * 
     * @return Represents the end date for the query interval.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * Represents the end date for the query interval.
     * </p>
     * 
     * @param endDate
     *        Represents the end date for the query interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMetricDataQuery withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetMetricDataQuery == false)
            return false;
        BatchGetMetricDataQuery other = (BatchGetMetricDataQuery) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetMetricDataQuery clone() {
        try {
            return (BatchGetMetricDataQuery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.BatchGetMetricDataQueryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
