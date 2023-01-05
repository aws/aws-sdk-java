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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The association between a monitor, threshold, and list of subscribers used to deliver notifications about anomalies
 * detected by a monitor that exceeds a threshold. The content consists of the detailed metadata and the current status
 * of the <code>AnomalySubscription</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/AnomalySubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalySubscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>AnomalySubscription</code> Amazon Resource Name (ARN).
     * </p>
     */
    private String subscriptionArn;
    /**
     * <p>
     * Your unique account identifier.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * A list of cost anomaly monitors.
     * </p>
     */
    private java.util.List<String> monitorArnList;
    /**
     * <p>
     * A list of subscribers to notify.
     * </p>
     */
    private java.util.List<Subscriber> subscribers;
    /**
     * <p>
     * (deprecated)
     * </p>
     * <p>
     * The dollar value that triggers a notification if the threshold is exceeded.
     * </p>
     * <p>
     * This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued use of Threshold will
     * be treated as shorthand syntax for a ThresholdExpression.
     * </p>
     * <p>
     * One of Threshold or ThresholdExpression is required for this resource.
     * </p>
     */
    @Deprecated
    private Double threshold;
    /**
     * <p>
     * The frequency that anomaly reports are sent over email.
     * </p>
     */
    private String frequency;
    /**
     * <p>
     * The name for the subscription.
     * </p>
     */
    private String subscriptionName;
    /**
     * <p>
     * An <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object used to specify the anomalies that you want to generate alerts for. This supports dimensions and nested
     * expressions. The supported dimensions are <code>ANOMALY_TOTAL_IMPACT_ABSOLUTE</code> and
     * <code>ANOMALY_TOTAL_IMPACT_PERCENTAGE</code>. The supported nested expression types are <code>AND</code> and
     * <code>OR</code>. The match option <code>GREATER_THAN_OR_EQUAL</code> is required. Values must be numbers between
     * 0 and 10,000,000,000.
     * </p>
     * <p>
     * One of Threshold or ThresholdExpression is required for this resource.
     * </p>
     * <p>
     * The following are examples of valid ThresholdExpressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Absolute threshold:
     * <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Percentage threshold:
     * <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AND</code> two thresholds together:
     * <code>{ "And": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> two thresholds together:
     * <code>{ "Or": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     * </p>
     * </li>
     * </ul>
     */
    private Expression thresholdExpression;

    /**
     * <p>
     * The <code>AnomalySubscription</code> Amazon Resource Name (ARN).
     * </p>
     * 
     * @param subscriptionArn
     *        The <code>AnomalySubscription</code> Amazon Resource Name (ARN).
     */

    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }

    /**
     * <p>
     * The <code>AnomalySubscription</code> Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The <code>AnomalySubscription</code> Amazon Resource Name (ARN).
     */

    public String getSubscriptionArn() {
        return this.subscriptionArn;
    }

    /**
     * <p>
     * The <code>AnomalySubscription</code> Amazon Resource Name (ARN).
     * </p>
     * 
     * @param subscriptionArn
     *        The <code>AnomalySubscription</code> Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySubscription withSubscriptionArn(String subscriptionArn) {
        setSubscriptionArn(subscriptionArn);
        return this;
    }

    /**
     * <p>
     * Your unique account identifier.
     * </p>
     * 
     * @param accountId
     *        Your unique account identifier.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Your unique account identifier.
     * </p>
     * 
     * @return Your unique account identifier.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Your unique account identifier.
     * </p>
     * 
     * @param accountId
     *        Your unique account identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySubscription withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * A list of cost anomaly monitors.
     * </p>
     * 
     * @return A list of cost anomaly monitors.
     */

    public java.util.List<String> getMonitorArnList() {
        return monitorArnList;
    }

    /**
     * <p>
     * A list of cost anomaly monitors.
     * </p>
     * 
     * @param monitorArnList
     *        A list of cost anomaly monitors.
     */

    public void setMonitorArnList(java.util.Collection<String> monitorArnList) {
        if (monitorArnList == null) {
            this.monitorArnList = null;
            return;
        }

        this.monitorArnList = new java.util.ArrayList<String>(monitorArnList);
    }

    /**
     * <p>
     * A list of cost anomaly monitors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitorArnList(java.util.Collection)} or {@link #withMonitorArnList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param monitorArnList
     *        A list of cost anomaly monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySubscription withMonitorArnList(String... monitorArnList) {
        if (this.monitorArnList == null) {
            setMonitorArnList(new java.util.ArrayList<String>(monitorArnList.length));
        }
        for (String ele : monitorArnList) {
            this.monitorArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cost anomaly monitors.
     * </p>
     * 
     * @param monitorArnList
     *        A list of cost anomaly monitors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySubscription withMonitorArnList(java.util.Collection<String> monitorArnList) {
        setMonitorArnList(monitorArnList);
        return this;
    }

    /**
     * <p>
     * A list of subscribers to notify.
     * </p>
     * 
     * @return A list of subscribers to notify.
     */

    public java.util.List<Subscriber> getSubscribers() {
        return subscribers;
    }

    /**
     * <p>
     * A list of subscribers to notify.
     * </p>
     * 
     * @param subscribers
     *        A list of subscribers to notify.
     */

    public void setSubscribers(java.util.Collection<Subscriber> subscribers) {
        if (subscribers == null) {
            this.subscribers = null;
            return;
        }

        this.subscribers = new java.util.ArrayList<Subscriber>(subscribers);
    }

    /**
     * <p>
     * A list of subscribers to notify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscribers(java.util.Collection)} or {@link #withSubscribers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subscribers
     *        A list of subscribers to notify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySubscription withSubscribers(Subscriber... subscribers) {
        if (this.subscribers == null) {
            setSubscribers(new java.util.ArrayList<Subscriber>(subscribers.length));
        }
        for (Subscriber ele : subscribers) {
            this.subscribers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subscribers to notify.
     * </p>
     * 
     * @param subscribers
     *        A list of subscribers to notify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySubscription withSubscribers(java.util.Collection<Subscriber> subscribers) {
        setSubscribers(subscribers);
        return this;
    }

    /**
     * <p>
     * (deprecated)
     * </p>
     * <p>
     * The dollar value that triggers a notification if the threshold is exceeded.
     * </p>
     * <p>
     * This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued use of Threshold will
     * be treated as shorthand syntax for a ThresholdExpression.
     * </p>
     * <p>
     * One of Threshold or ThresholdExpression is required for this resource.
     * </p>
     * 
     * @param threshold
     *        (deprecated)</p>
     *        <p>
     *        The dollar value that triggers a notification if the threshold is exceeded.
     *        </p>
     *        <p>
     *        This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued use of
     *        Threshold will be treated as shorthand syntax for a ThresholdExpression.
     *        </p>
     *        <p>
     *        One of Threshold or ThresholdExpression is required for this resource.
     */
    @Deprecated
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * (deprecated)
     * </p>
     * <p>
     * The dollar value that triggers a notification if the threshold is exceeded.
     * </p>
     * <p>
     * This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued use of Threshold will
     * be treated as shorthand syntax for a ThresholdExpression.
     * </p>
     * <p>
     * One of Threshold or ThresholdExpression is required for this resource.
     * </p>
     * 
     * @return (deprecated)</p>
     *         <p>
     *         The dollar value that triggers a notification if the threshold is exceeded.
     *         </p>
     *         <p>
     *         This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued use of
     *         Threshold will be treated as shorthand syntax for a ThresholdExpression.
     *         </p>
     *         <p>
     *         One of Threshold or ThresholdExpression is required for this resource.
     */
    @Deprecated
    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * (deprecated)
     * </p>
     * <p>
     * The dollar value that triggers a notification if the threshold is exceeded.
     * </p>
     * <p>
     * This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued use of Threshold will
     * be treated as shorthand syntax for a ThresholdExpression.
     * </p>
     * <p>
     * One of Threshold or ThresholdExpression is required for this resource.
     * </p>
     * 
     * @param threshold
     *        (deprecated)</p>
     *        <p>
     *        The dollar value that triggers a notification if the threshold is exceeded.
     *        </p>
     *        <p>
     *        This field has been deprecated. To specify a threshold, use ThresholdExpression. Continued use of
     *        Threshold will be treated as shorthand syntax for a ThresholdExpression.
     *        </p>
     *        <p>
     *        One of Threshold or ThresholdExpression is required for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public AnomalySubscription withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The frequency that anomaly reports are sent over email.
     * </p>
     * 
     * @param frequency
     *        The frequency that anomaly reports are sent over email.
     * @see AnomalySubscriptionFrequency
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The frequency that anomaly reports are sent over email.
     * </p>
     * 
     * @return The frequency that anomaly reports are sent over email.
     * @see AnomalySubscriptionFrequency
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * The frequency that anomaly reports are sent over email.
     * </p>
     * 
     * @param frequency
     *        The frequency that anomaly reports are sent over email.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalySubscriptionFrequency
     */

    public AnomalySubscription withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * The frequency that anomaly reports are sent over email.
     * </p>
     * 
     * @param frequency
     *        The frequency that anomaly reports are sent over email.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalySubscriptionFrequency
     */

    public AnomalySubscription withFrequency(AnomalySubscriptionFrequency frequency) {
        this.frequency = frequency.toString();
        return this;
    }

    /**
     * <p>
     * The name for the subscription.
     * </p>
     * 
     * @param subscriptionName
     *        The name for the subscription.
     */

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The name for the subscription.
     * </p>
     * 
     * @return The name for the subscription.
     */

    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * <p>
     * The name for the subscription.
     * </p>
     * 
     * @param subscriptionName
     *        The name for the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySubscription withSubscriptionName(String subscriptionName) {
        setSubscriptionName(subscriptionName);
        return this;
    }

    /**
     * <p>
     * An <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object used to specify the anomalies that you want to generate alerts for. This supports dimensions and nested
     * expressions. The supported dimensions are <code>ANOMALY_TOTAL_IMPACT_ABSOLUTE</code> and
     * <code>ANOMALY_TOTAL_IMPACT_PERCENTAGE</code>. The supported nested expression types are <code>AND</code> and
     * <code>OR</code>. The match option <code>GREATER_THAN_OR_EQUAL</code> is required. Values must be numbers between
     * 0 and 10,000,000,000.
     * </p>
     * <p>
     * One of Threshold or ThresholdExpression is required for this resource.
     * </p>
     * <p>
     * The following are examples of valid ThresholdExpressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Absolute threshold:
     * <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Percentage threshold:
     * <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AND</code> two thresholds together:
     * <code>{ "And": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> two thresholds together:
     * <code>{ "Or": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param thresholdExpression
     *        An <a href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">
     *        Expression</a> object used to specify the anomalies that you want to generate alerts for. This supports
     *        dimensions and nested expressions. The supported dimensions are <code>ANOMALY_TOTAL_IMPACT_ABSOLUTE</code>
     *        and <code>ANOMALY_TOTAL_IMPACT_PERCENTAGE</code>. The supported nested expression types are
     *        <code>AND</code> and <code>OR</code>. The match option <code>GREATER_THAN_OR_EQUAL</code> is required.
     *        Values must be numbers between 0 and 10,000,000,000.</p>
     *        <p>
     *        One of Threshold or ThresholdExpression is required for this resource.
     *        </p>
     *        <p>
     *        The following are examples of valid ThresholdExpressions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Absolute threshold:
     *        <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Percentage threshold:
     *        <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AND</code> two thresholds together:
     *        <code>{ "And": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code> two thresholds together:
     *        <code>{ "Or": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     *        </p>
     *        </li>
     */

    public void setThresholdExpression(Expression thresholdExpression) {
        this.thresholdExpression = thresholdExpression;
    }

    /**
     * <p>
     * An <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object used to specify the anomalies that you want to generate alerts for. This supports dimensions and nested
     * expressions. The supported dimensions are <code>ANOMALY_TOTAL_IMPACT_ABSOLUTE</code> and
     * <code>ANOMALY_TOTAL_IMPACT_PERCENTAGE</code>. The supported nested expression types are <code>AND</code> and
     * <code>OR</code>. The match option <code>GREATER_THAN_OR_EQUAL</code> is required. Values must be numbers between
     * 0 and 10,000,000,000.
     * </p>
     * <p>
     * One of Threshold or ThresholdExpression is required for this resource.
     * </p>
     * <p>
     * The following are examples of valid ThresholdExpressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Absolute threshold:
     * <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Percentage threshold:
     * <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AND</code> two thresholds together:
     * <code>{ "And": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> two thresholds together:
     * <code>{ "Or": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return An <a
     *         href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression
     *         </a> object used to specify the anomalies that you want to generate alerts for. This supports dimensions
     *         and nested expressions. The supported dimensions are <code>ANOMALY_TOTAL_IMPACT_ABSOLUTE</code> and
     *         <code>ANOMALY_TOTAL_IMPACT_PERCENTAGE</code>. The supported nested expression types are <code>AND</code>
     *         and <code>OR</code>. The match option <code>GREATER_THAN_OR_EQUAL</code> is required. Values must be
     *         numbers between 0 and 10,000,000,000.</p>
     *         <p>
     *         One of Threshold or ThresholdExpression is required for this resource.
     *         </p>
     *         <p>
     *         The following are examples of valid ThresholdExpressions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Absolute threshold:
     *         <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Percentage threshold:
     *         <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AND</code> two thresholds together:
     *         <code>{ "And": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OR</code> two thresholds together:
     *         <code>{ "Or": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     *         </p>
     *         </li>
     */

    public Expression getThresholdExpression() {
        return this.thresholdExpression;
    }

    /**
     * <p>
     * An <a
     * href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">Expression</a>
     * object used to specify the anomalies that you want to generate alerts for. This supports dimensions and nested
     * expressions. The supported dimensions are <code>ANOMALY_TOTAL_IMPACT_ABSOLUTE</code> and
     * <code>ANOMALY_TOTAL_IMPACT_PERCENTAGE</code>. The supported nested expression types are <code>AND</code> and
     * <code>OR</code>. The match option <code>GREATER_THAN_OR_EQUAL</code> is required. Values must be numbers between
     * 0 and 10,000,000,000.
     * </p>
     * <p>
     * One of Threshold or ThresholdExpression is required for this resource.
     * </p>
     * <p>
     * The following are examples of valid ThresholdExpressions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Absolute threshold:
     * <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Percentage threshold:
     * <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AND</code> two thresholds together:
     * <code>{ "And": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OR</code> two thresholds together:
     * <code>{ "Or": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param thresholdExpression
     *        An <a href="https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html">
     *        Expression</a> object used to specify the anomalies that you want to generate alerts for. This supports
     *        dimensions and nested expressions. The supported dimensions are <code>ANOMALY_TOTAL_IMPACT_ABSOLUTE</code>
     *        and <code>ANOMALY_TOTAL_IMPACT_PERCENTAGE</code>. The supported nested expression types are
     *        <code>AND</code> and <code>OR</code>. The match option <code>GREATER_THAN_OR_EQUAL</code> is required.
     *        Values must be numbers between 0 and 10,000,000,000.</p>
     *        <p>
     *        One of Threshold or ThresholdExpression is required for this resource.
     *        </p>
     *        <p>
     *        The following are examples of valid ThresholdExpressions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Absolute threshold:
     *        <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Percentage threshold:
     *        <code>{ "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AND</code> two thresholds together:
     *        <code>{ "And": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OR</code> two thresholds together:
     *        <code>{ "Or": [ { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_ABSOLUTE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } }, { "Dimensions": { "Key": "ANOMALY_TOTAL_IMPACT_PERCENTAGE", "MatchOptions": [ "GREATER_THAN_OR_EQUAL" ], "Values": [ "100" ] } } ] }</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalySubscription withThresholdExpression(Expression thresholdExpression) {
        setThresholdExpression(thresholdExpression);
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
        if (getSubscriptionArn() != null)
            sb.append("SubscriptionArn: ").append(getSubscriptionArn()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getMonitorArnList() != null)
            sb.append("MonitorArnList: ").append(getMonitorArnList()).append(",");
        if (getSubscribers() != null)
            sb.append("Subscribers: ").append(getSubscribers()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: ").append(getSubscriptionName()).append(",");
        if (getThresholdExpression() != null)
            sb.append("ThresholdExpression: ").append(getThresholdExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalySubscription == false)
            return false;
        AnomalySubscription other = (AnomalySubscription) obj;
        if (other.getSubscriptionArn() == null ^ this.getSubscriptionArn() == null)
            return false;
        if (other.getSubscriptionArn() != null && other.getSubscriptionArn().equals(this.getSubscriptionArn()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getMonitorArnList() == null ^ this.getMonitorArnList() == null)
            return false;
        if (other.getMonitorArnList() != null && other.getMonitorArnList().equals(this.getMonitorArnList()) == false)
            return false;
        if (other.getSubscribers() == null ^ this.getSubscribers() == null)
            return false;
        if (other.getSubscribers() != null && other.getSubscribers().equals(this.getSubscribers()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        if (other.getThresholdExpression() == null ^ this.getThresholdExpression() == null)
            return false;
        if (other.getThresholdExpression() != null && other.getThresholdExpression().equals(this.getThresholdExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionArn() == null) ? 0 : getSubscriptionArn().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getMonitorArnList() == null) ? 0 : getMonitorArnList().hashCode());
        hashCode = prime * hashCode + ((getSubscribers() == null) ? 0 : getSubscribers().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        hashCode = prime * hashCode + ((getThresholdExpression() == null) ? 0 : getThresholdExpression().hashCode());
        return hashCode;
    }

    @Override
    public AnomalySubscription clone() {
        try {
            return (AnomalySubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.AnomalySubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
