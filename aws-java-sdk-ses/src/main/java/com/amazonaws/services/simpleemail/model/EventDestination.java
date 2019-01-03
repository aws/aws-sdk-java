/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about the event destination that the specified email sending events will be published to.
 * </p>
 * <note>
 * <p>
 * When you create or update an event destination, you must provide one, and only one, destination. The destination can
 * be Amazon CloudWatch, Amazon Kinesis Firehose or Amazon Simple Notification Service (Amazon SNS).
 * </p>
 * </note>
 * <p>
 * Event destinations are associated with configuration sets, which enable you to publish email sending events to Amazon
 * CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS). For information about using
 * configuration sets, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html">Amazon SES Developer
 * Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/EventDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventDestination implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the event destination. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * Sets whether Amazon SES publishes events to this destination when you send an email with the associated
     * configuration set. Set to <code>true</code> to enable publishing to this destination; set to <code>false</code>
     * to prevent publishing to this destination. The default value is <code>false</code>.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> matchingEventTypes;
    /**
     * <p>
     * An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose
     * event destination.
     * </p>
     */
    private KinesisFirehoseDestination kinesisFirehoseDestination;
    /**
     * <p>
     * An object that contains the names, default values, and sources of the dimensions associated with an Amazon
     * CloudWatch event destination.
     * </p>
     */
    private CloudWatchDestination cloudWatchDestination;
    /**
     * <p>
     * An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event
     * destination.
     * </p>
     */
    private SNSDestination sNSDestination;

    /**
     * <p>
     * The name of the event destination. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the event destination. The name must:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Contain less than 64 characters.
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event destination. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the event destination. The name must:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contain less than 64 characters.
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event destination. The name must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain less than 64 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the event destination. The name must:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Contain less than 64 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestination withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SES publishes events to this destination when you send an email with the associated
     * configuration set. Set to <code>true</code> to enable publishing to this destination; set to <code>false</code>
     * to prevent publishing to this destination. The default value is <code>false</code>.
     * </p>
     * 
     * @param enabled
     *        Sets whether Amazon SES publishes events to this destination when you send an email with the associated
     *        configuration set. Set to <code>true</code> to enable publishing to this destination; set to
     *        <code>false</code> to prevent publishing to this destination. The default value is <code>false</code>.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES publishes events to this destination when you send an email with the associated
     * configuration set. Set to <code>true</code> to enable publishing to this destination; set to <code>false</code>
     * to prevent publishing to this destination. The default value is <code>false</code>.
     * </p>
     * 
     * @return Sets whether Amazon SES publishes events to this destination when you send an email with the associated
     *         configuration set. Set to <code>true</code> to enable publishing to this destination; set to
     *         <code>false</code> to prevent publishing to this destination. The default value is <code>false</code>.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Sets whether Amazon SES publishes events to this destination when you send an email with the associated
     * configuration set. Set to <code>true</code> to enable publishing to this destination; set to <code>false</code>
     * to prevent publishing to this destination. The default value is <code>false</code>.
     * </p>
     * 
     * @param enabled
     *        Sets whether Amazon SES publishes events to this destination when you send an email with the associated
     *        configuration set. Set to <code>true</code> to enable publishing to this destination; set to
     *        <code>false</code> to prevent publishing to this destination. The default value is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestination withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon SES publishes events to this destination when you send an email with the associated
     * configuration set. Set to <code>true</code> to enable publishing to this destination; set to <code>false</code>
     * to prevent publishing to this destination. The default value is <code>false</code>.
     * </p>
     * 
     * @return Sets whether Amazon SES publishes events to this destination when you send an email with the associated
     *         configuration set. Set to <code>true</code> to enable publishing to this destination; set to
     *         <code>false</code> to prevent publishing to this destination. The default value is <code>false</code>.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     * 
     * @return The type of email sending events to publish to the event destination.
     * @see EventType
     */

    public java.util.List<String> getMatchingEventTypes() {
        if (matchingEventTypes == null) {
            matchingEventTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return matchingEventTypes;
    }

    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     * 
     * @param matchingEventTypes
     *        The type of email sending events to publish to the event destination.
     * @see EventType
     */

    public void setMatchingEventTypes(java.util.Collection<String> matchingEventTypes) {
        if (matchingEventTypes == null) {
            this.matchingEventTypes = null;
            return;
        }

        this.matchingEventTypes = new com.amazonaws.internal.SdkInternalList<String>(matchingEventTypes);
    }

    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchingEventTypes(java.util.Collection)} or {@link #withMatchingEventTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param matchingEventTypes
     *        The type of email sending events to publish to the event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventDestination withMatchingEventTypes(String... matchingEventTypes) {
        if (this.matchingEventTypes == null) {
            setMatchingEventTypes(new com.amazonaws.internal.SdkInternalList<String>(matchingEventTypes.length));
        }
        for (String ele : matchingEventTypes) {
            this.matchingEventTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     * 
     * @param matchingEventTypes
     *        The type of email sending events to publish to the event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventDestination withMatchingEventTypes(java.util.Collection<String> matchingEventTypes) {
        setMatchingEventTypes(matchingEventTypes);
        return this;
    }

    /**
     * <p>
     * The type of email sending events to publish to the event destination.
     * </p>
     * 
     * @param matchingEventTypes
     *        The type of email sending events to publish to the event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventDestination withMatchingEventTypes(EventType... matchingEventTypes) {
        com.amazonaws.internal.SdkInternalList<String> matchingEventTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(matchingEventTypes.length);
        for (EventType value : matchingEventTypes) {
            matchingEventTypesCopy.add(value.toString());
        }
        if (getMatchingEventTypes() == null) {
            setMatchingEventTypes(matchingEventTypesCopy);
        } else {
            getMatchingEventTypes().addAll(matchingEventTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose
     * event destination.
     * </p>
     * 
     * @param kinesisFirehoseDestination
     *        An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis
     *        Firehose event destination.
     */

    public void setKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
        this.kinesisFirehoseDestination = kinesisFirehoseDestination;
    }

    /**
     * <p>
     * An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose
     * event destination.
     * </p>
     * 
     * @return An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis
     *         Firehose event destination.
     */

    public KinesisFirehoseDestination getKinesisFirehoseDestination() {
        return this.kinesisFirehoseDestination;
    }

    /**
     * <p>
     * An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis Firehose
     * event destination.
     * </p>
     * 
     * @param kinesisFirehoseDestination
     *        An object that contains the delivery stream ARN and the IAM role ARN associated with an Amazon Kinesis
     *        Firehose event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestination withKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
        setKinesisFirehoseDestination(kinesisFirehoseDestination);
        return this;
    }

    /**
     * <p>
     * An object that contains the names, default values, and sources of the dimensions associated with an Amazon
     * CloudWatch event destination.
     * </p>
     * 
     * @param cloudWatchDestination
     *        An object that contains the names, default values, and sources of the dimensions associated with an Amazon
     *        CloudWatch event destination.
     */

    public void setCloudWatchDestination(CloudWatchDestination cloudWatchDestination) {
        this.cloudWatchDestination = cloudWatchDestination;
    }

    /**
     * <p>
     * An object that contains the names, default values, and sources of the dimensions associated with an Amazon
     * CloudWatch event destination.
     * </p>
     * 
     * @return An object that contains the names, default values, and sources of the dimensions associated with an
     *         Amazon CloudWatch event destination.
     */

    public CloudWatchDestination getCloudWatchDestination() {
        return this.cloudWatchDestination;
    }

    /**
     * <p>
     * An object that contains the names, default values, and sources of the dimensions associated with an Amazon
     * CloudWatch event destination.
     * </p>
     * 
     * @param cloudWatchDestination
     *        An object that contains the names, default values, and sources of the dimensions associated with an Amazon
     *        CloudWatch event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestination withCloudWatchDestination(CloudWatchDestination cloudWatchDestination) {
        setCloudWatchDestination(cloudWatchDestination);
        return this;
    }

    /**
     * <p>
     * An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event
     * destination.
     * </p>
     * 
     * @param sNSDestination
     *        An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS)
     *        event destination.
     */

    public void setSNSDestination(SNSDestination sNSDestination) {
        this.sNSDestination = sNSDestination;
    }

    /**
     * <p>
     * An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event
     * destination.
     * </p>
     * 
     * @return An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS)
     *         event destination.
     */

    public SNSDestination getSNSDestination() {
        return this.sNSDestination;
    }

    /**
     * <p>
     * An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS) event
     * destination.
     * </p>
     * 
     * @param sNSDestination
     *        An object that contains the topic ARN associated with an Amazon Simple Notification Service (Amazon SNS)
     *        event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestination withSNSDestination(SNSDestination sNSDestination) {
        setSNSDestination(sNSDestination);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getMatchingEventTypes() != null)
            sb.append("MatchingEventTypes: ").append(getMatchingEventTypes()).append(",");
        if (getKinesisFirehoseDestination() != null)
            sb.append("KinesisFirehoseDestination: ").append(getKinesisFirehoseDestination()).append(",");
        if (getCloudWatchDestination() != null)
            sb.append("CloudWatchDestination: ").append(getCloudWatchDestination()).append(",");
        if (getSNSDestination() != null)
            sb.append("SNSDestination: ").append(getSNSDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventDestination == false)
            return false;
        EventDestination other = (EventDestination) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getMatchingEventTypes() == null ^ this.getMatchingEventTypes() == null)
            return false;
        if (other.getMatchingEventTypes() != null && other.getMatchingEventTypes().equals(this.getMatchingEventTypes()) == false)
            return false;
        if (other.getKinesisFirehoseDestination() == null ^ this.getKinesisFirehoseDestination() == null)
            return false;
        if (other.getKinesisFirehoseDestination() != null && other.getKinesisFirehoseDestination().equals(this.getKinesisFirehoseDestination()) == false)
            return false;
        if (other.getCloudWatchDestination() == null ^ this.getCloudWatchDestination() == null)
            return false;
        if (other.getCloudWatchDestination() != null && other.getCloudWatchDestination().equals(this.getCloudWatchDestination()) == false)
            return false;
        if (other.getSNSDestination() == null ^ this.getSNSDestination() == null)
            return false;
        if (other.getSNSDestination() != null && other.getSNSDestination().equals(this.getSNSDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getMatchingEventTypes() == null) ? 0 : getMatchingEventTypes().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseDestination() == null) ? 0 : getKinesisFirehoseDestination().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchDestination() == null) ? 0 : getCloudWatchDestination().hashCode());
        hashCode = prime * hashCode + ((getSNSDestination() == null) ? 0 : getSNSDestination().hashCode());
        return hashCode;
    }

    @Override
    public EventDestination clone() {
        try {
            return (EventDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
