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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an Amazon RDS event notification subscription. The subscription allows Amazon RDS to post events to an
 * SNS topic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsEventSubscriptionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsEventSubscriptionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the account that is associated with the event notification subscription.
     * </p>
     */
    private String custSubscriptionId;
    /**
     * <p>
     * The identifier of the event notification subscription.
     * </p>
     */
    private String customerAwsId;
    /**
     * <p>
     * Whether the event notification subscription is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The list of event categories for the event notification subscription.
     * </p>
     */
    private java.util.List<String> eventCategoriesList;
    /**
     * <p>
     * The ARN of the event notification subscription.
     * </p>
     */
    private String eventSubscriptionArn;
    /**
     * <p>
     * The ARN of the SNS topic to post the event notifications to.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * A list of source identifiers for the event notification subscription.
     * </p>
     */
    private java.util.List<String> sourceIdsList;
    /**
     * <p>
     * The source type for the event notification subscription.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The status of the event notification subscription.
     * </p>
     * <p>
     * Valid values: <code>creating</code> | <code>modifying</code> | <code>deleting</code> | <code>active</code> |
     * <code>no-permission</code> | <code>topic-not-exist</code>
     * </p>
     */
    private String status;
    /**
     * <p>
     * The datetime when the event notification subscription was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     */
    private String subscriptionCreationTime;

    /**
     * <p>
     * The identifier of the account that is associated with the event notification subscription.
     * </p>
     * 
     * @param custSubscriptionId
     *        The identifier of the account that is associated with the event notification subscription.
     */

    public void setCustSubscriptionId(String custSubscriptionId) {
        this.custSubscriptionId = custSubscriptionId;
    }

    /**
     * <p>
     * The identifier of the account that is associated with the event notification subscription.
     * </p>
     * 
     * @return The identifier of the account that is associated with the event notification subscription.
     */

    public String getCustSubscriptionId() {
        return this.custSubscriptionId;
    }

    /**
     * <p>
     * The identifier of the account that is associated with the event notification subscription.
     * </p>
     * 
     * @param custSubscriptionId
     *        The identifier of the account that is associated with the event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withCustSubscriptionId(String custSubscriptionId) {
        setCustSubscriptionId(custSubscriptionId);
        return this;
    }

    /**
     * <p>
     * The identifier of the event notification subscription.
     * </p>
     * 
     * @param customerAwsId
     *        The identifier of the event notification subscription.
     */

    public void setCustomerAwsId(String customerAwsId) {
        this.customerAwsId = customerAwsId;
    }

    /**
     * <p>
     * The identifier of the event notification subscription.
     * </p>
     * 
     * @return The identifier of the event notification subscription.
     */

    public String getCustomerAwsId() {
        return this.customerAwsId;
    }

    /**
     * <p>
     * The identifier of the event notification subscription.
     * </p>
     * 
     * @param customerAwsId
     *        The identifier of the event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withCustomerAwsId(String customerAwsId) {
        setCustomerAwsId(customerAwsId);
        return this;
    }

    /**
     * <p>
     * Whether the event notification subscription is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether the event notification subscription is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether the event notification subscription is enabled.
     * </p>
     * 
     * @return Whether the event notification subscription is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Whether the event notification subscription is enabled.
     * </p>
     * 
     * @param enabled
     *        Whether the event notification subscription is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Whether the event notification subscription is enabled.
     * </p>
     * 
     * @return Whether the event notification subscription is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The list of event categories for the event notification subscription.
     * </p>
     * 
     * @return The list of event categories for the event notification subscription.
     */

    public java.util.List<String> getEventCategoriesList() {
        return eventCategoriesList;
    }

    /**
     * <p>
     * The list of event categories for the event notification subscription.
     * </p>
     * 
     * @param eventCategoriesList
     *        The list of event categories for the event notification subscription.
     */

    public void setEventCategoriesList(java.util.Collection<String> eventCategoriesList) {
        if (eventCategoriesList == null) {
            this.eventCategoriesList = null;
            return;
        }

        this.eventCategoriesList = new java.util.ArrayList<String>(eventCategoriesList);
    }

    /**
     * <p>
     * The list of event categories for the event notification subscription.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategoriesList(java.util.Collection)} or {@link #withEventCategoriesList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param eventCategoriesList
     *        The list of event categories for the event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withEventCategoriesList(String... eventCategoriesList) {
        if (this.eventCategoriesList == null) {
            setEventCategoriesList(new java.util.ArrayList<String>(eventCategoriesList.length));
        }
        for (String ele : eventCategoriesList) {
            this.eventCategoriesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of event categories for the event notification subscription.
     * </p>
     * 
     * @param eventCategoriesList
     *        The list of event categories for the event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withEventCategoriesList(java.util.Collection<String> eventCategoriesList) {
        setEventCategoriesList(eventCategoriesList);
        return this;
    }

    /**
     * <p>
     * The ARN of the event notification subscription.
     * </p>
     * 
     * @param eventSubscriptionArn
     *        The ARN of the event notification subscription.
     */

    public void setEventSubscriptionArn(String eventSubscriptionArn) {
        this.eventSubscriptionArn = eventSubscriptionArn;
    }

    /**
     * <p>
     * The ARN of the event notification subscription.
     * </p>
     * 
     * @return The ARN of the event notification subscription.
     */

    public String getEventSubscriptionArn() {
        return this.eventSubscriptionArn;
    }

    /**
     * <p>
     * The ARN of the event notification subscription.
     * </p>
     * 
     * @param eventSubscriptionArn
     *        The ARN of the event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withEventSubscriptionArn(String eventSubscriptionArn) {
        setEventSubscriptionArn(eventSubscriptionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the SNS topic to post the event notifications to.
     * </p>
     * 
     * @param snsTopicArn
     *        The ARN of the SNS topic to post the event notifications to.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic to post the event notifications to.
     * </p>
     * 
     * @return The ARN of the SNS topic to post the event notifications to.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic to post the event notifications to.
     * </p>
     * 
     * @param snsTopicArn
     *        The ARN of the SNS topic to post the event notifications to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * A list of source identifiers for the event notification subscription.
     * </p>
     * 
     * @return A list of source identifiers for the event notification subscription.
     */

    public java.util.List<String> getSourceIdsList() {
        return sourceIdsList;
    }

    /**
     * <p>
     * A list of source identifiers for the event notification subscription.
     * </p>
     * 
     * @param sourceIdsList
     *        A list of source identifiers for the event notification subscription.
     */

    public void setSourceIdsList(java.util.Collection<String> sourceIdsList) {
        if (sourceIdsList == null) {
            this.sourceIdsList = null;
            return;
        }

        this.sourceIdsList = new java.util.ArrayList<String>(sourceIdsList);
    }

    /**
     * <p>
     * A list of source identifiers for the event notification subscription.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceIdsList(java.util.Collection)} or {@link #withSourceIdsList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceIdsList
     *        A list of source identifiers for the event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withSourceIdsList(String... sourceIdsList) {
        if (this.sourceIdsList == null) {
            setSourceIdsList(new java.util.ArrayList<String>(sourceIdsList.length));
        }
        for (String ele : sourceIdsList) {
            this.sourceIdsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of source identifiers for the event notification subscription.
     * </p>
     * 
     * @param sourceIdsList
     *        A list of source identifiers for the event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withSourceIdsList(java.util.Collection<String> sourceIdsList) {
        setSourceIdsList(sourceIdsList);
        return this;
    }

    /**
     * <p>
     * The source type for the event notification subscription.
     * </p>
     * 
     * @param sourceType
     *        The source type for the event notification subscription.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type for the event notification subscription.
     * </p>
     * 
     * @return The source type for the event notification subscription.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type for the event notification subscription.
     * </p>
     * 
     * @param sourceType
     *        The source type for the event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The status of the event notification subscription.
     * </p>
     * <p>
     * Valid values: <code>creating</code> | <code>modifying</code> | <code>deleting</code> | <code>active</code> |
     * <code>no-permission</code> | <code>topic-not-exist</code>
     * </p>
     * 
     * @param status
     *        The status of the event notification subscription.</p>
     *        <p>
     *        Valid values: <code>creating</code> | <code>modifying</code> | <code>deleting</code> | <code>active</code>
     *        | <code>no-permission</code> | <code>topic-not-exist</code>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the event notification subscription.
     * </p>
     * <p>
     * Valid values: <code>creating</code> | <code>modifying</code> | <code>deleting</code> | <code>active</code> |
     * <code>no-permission</code> | <code>topic-not-exist</code>
     * </p>
     * 
     * @return The status of the event notification subscription.</p>
     *         <p>
     *         Valid values: <code>creating</code> | <code>modifying</code> | <code>deleting</code> |
     *         <code>active</code> | <code>no-permission</code> | <code>topic-not-exist</code>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the event notification subscription.
     * </p>
     * <p>
     * Valid values: <code>creating</code> | <code>modifying</code> | <code>deleting</code> | <code>active</code> |
     * <code>no-permission</code> | <code>topic-not-exist</code>
     * </p>
     * 
     * @param status
     *        The status of the event notification subscription.</p>
     *        <p>
     *        Valid values: <code>creating</code> | <code>modifying</code> | <code>deleting</code> | <code>active</code>
     *        | <code>no-permission</code> | <code>topic-not-exist</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The datetime when the event notification subscription was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param subscriptionCreationTime
     *        The datetime when the event notification subscription was created.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     */

    public void setSubscriptionCreationTime(String subscriptionCreationTime) {
        this.subscriptionCreationTime = subscriptionCreationTime;
    }

    /**
     * <p>
     * The datetime when the event notification subscription was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The datetime when the event notification subscription was created.</p>
     *         <p>
     *         This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *         <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *         maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *         <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *         </p>
     *         </li>
     */

    public String getSubscriptionCreationTime() {
        return this.subscriptionCreationTime;
    }

    /**
     * <p>
     * The datetime when the event notification subscription was created.
     * </p>
     * <p>
     * This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     * <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a maximum of 9
     * digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example, <code>2024-01-04T15:25:10.123456789+17:59</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param subscriptionCreationTime
     *        The datetime when the event notification subscription was created.</p>
     *        <p>
     *        This field accepts only the specified formats. Timestamps can end with <code>Z</code> or
     *        <code>("+" / "-") time-hour [":" time-minute]</code>. The time-secfrac after seconds is limited to a
     *        maximum of 9 digits. The offset is bounded by +/-18:00. Here are valid timestamp formats with examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SSZ</code> (for example, <code>2019-01-31T23:00:00Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmmZ</code> (for example, <code>2019-01-31T23:00:00.123456789Z</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS+HH:MM</code> (for example, <code>2024-01-04T15:25:10+17:59</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS-HHMM</code> (for example, <code>2024-01-04T15:25:10-1759</code>)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>YYYY-MM-DDTHH:MM:SS.mmmmmmmmm+HH:MM</code> (for example,
     *        <code>2024-01-04T15:25:10.123456789+17:59</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsEventSubscriptionDetails withSubscriptionCreationTime(String subscriptionCreationTime) {
        setSubscriptionCreationTime(subscriptionCreationTime);
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
        if (getCustSubscriptionId() != null)
            sb.append("CustSubscriptionId: ").append(getCustSubscriptionId()).append(",");
        if (getCustomerAwsId() != null)
            sb.append("CustomerAwsId: ").append(getCustomerAwsId()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getEventCategoriesList() != null)
            sb.append("EventCategoriesList: ").append(getEventCategoriesList()).append(",");
        if (getEventSubscriptionArn() != null)
            sb.append("EventSubscriptionArn: ").append(getEventSubscriptionArn()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSourceIdsList() != null)
            sb.append("SourceIdsList: ").append(getSourceIdsList()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubscriptionCreationTime() != null)
            sb.append("SubscriptionCreationTime: ").append(getSubscriptionCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsEventSubscriptionDetails == false)
            return false;
        AwsRdsEventSubscriptionDetails other = (AwsRdsEventSubscriptionDetails) obj;
        if (other.getCustSubscriptionId() == null ^ this.getCustSubscriptionId() == null)
            return false;
        if (other.getCustSubscriptionId() != null && other.getCustSubscriptionId().equals(this.getCustSubscriptionId()) == false)
            return false;
        if (other.getCustomerAwsId() == null ^ this.getCustomerAwsId() == null)
            return false;
        if (other.getCustomerAwsId() != null && other.getCustomerAwsId().equals(this.getCustomerAwsId()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getEventCategoriesList() == null ^ this.getEventCategoriesList() == null)
            return false;
        if (other.getEventCategoriesList() != null && other.getEventCategoriesList().equals(this.getEventCategoriesList()) == false)
            return false;
        if (other.getEventSubscriptionArn() == null ^ this.getEventSubscriptionArn() == null)
            return false;
        if (other.getEventSubscriptionArn() != null && other.getEventSubscriptionArn().equals(this.getEventSubscriptionArn()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSourceIdsList() == null ^ this.getSourceIdsList() == null)
            return false;
        if (other.getSourceIdsList() != null && other.getSourceIdsList().equals(this.getSourceIdsList()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubscriptionCreationTime() == null ^ this.getSubscriptionCreationTime() == null)
            return false;
        if (other.getSubscriptionCreationTime() != null && other.getSubscriptionCreationTime().equals(this.getSubscriptionCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustSubscriptionId() == null) ? 0 : getCustSubscriptionId().hashCode());
        hashCode = prime * hashCode + ((getCustomerAwsId() == null) ? 0 : getCustomerAwsId().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getEventCategoriesList() == null) ? 0 : getEventCategoriesList().hashCode());
        hashCode = prime * hashCode + ((getEventSubscriptionArn() == null) ? 0 : getEventSubscriptionArn().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSourceIdsList() == null) ? 0 : getSourceIdsList().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionCreationTime() == null) ? 0 : getSubscriptionCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsEventSubscriptionDetails clone() {
        try {
            return (AwsRdsEventSubscriptionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsEventSubscriptionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
