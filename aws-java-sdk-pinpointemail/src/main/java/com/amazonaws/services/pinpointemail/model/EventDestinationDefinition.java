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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that defines the event destination. Specifically, it defines which services receive events from emails sent
 * using the configuration set that the event destination is associated with. Also defines the types of events that are
 * sent to the event destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/EventDestinationDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventDestinationDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If <code>true</code>, the event destination is enabled. When the event destination is enabled, the specified
     * event types are sent to the destinations in this <code>EventDestinationDefinition</code>.
     * </p>
     * <p>
     * If <code>false</code>, the event destination is disabled. When the event destination is disabled, events aren't
     * sent to the specified destinations.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * An array that specifies which events Amazon Pinpoint should send to the destinations in this
     * <code>EventDestinationDefinition</code>.
     * </p>
     */
    private java.util.List<String> matchingEventTypes;
    /**
     * <p>
     * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis
     * Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
     * </p>
     */
    private KinesisFirehoseDestination kinesisFirehoseDestination;
    /**
     * <p>
     * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to
     * monitor and gain insights on your email sending metrics.
     * </p>
     */
    private CloudWatchDestination cloudWatchDestination;
    /**
     * <p>
     * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification
     * when certain email events occur.
     * </p>
     */
    private SnsDestination snsDestination;
    /**
     * <p>
     * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to
     * create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your
     * campaigns.
     * </p>
     */
    private PinpointDestination pinpointDestination;

    /**
     * <p>
     * If <code>true</code>, the event destination is enabled. When the event destination is enabled, the specified
     * event types are sent to the destinations in this <code>EventDestinationDefinition</code>.
     * </p>
     * <p>
     * If <code>false</code>, the event destination is disabled. When the event destination is disabled, events aren't
     * sent to the specified destinations.
     * </p>
     * 
     * @param enabled
     *        If <code>true</code>, the event destination is enabled. When the event destination is enabled, the
     *        specified event types are sent to the destinations in this <code>EventDestinationDefinition</code>.</p>
     *        <p>
     *        If <code>false</code>, the event destination is disabled. When the event destination is disabled, events
     *        aren't sent to the specified destinations.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * If <code>true</code>, the event destination is enabled. When the event destination is enabled, the specified
     * event types are sent to the destinations in this <code>EventDestinationDefinition</code>.
     * </p>
     * <p>
     * If <code>false</code>, the event destination is disabled. When the event destination is disabled, events aren't
     * sent to the specified destinations.
     * </p>
     * 
     * @return If <code>true</code>, the event destination is enabled. When the event destination is enabled, the
     *         specified event types are sent to the destinations in this <code>EventDestinationDefinition</code>.</p>
     *         <p>
     *         If <code>false</code>, the event destination is disabled. When the event destination is disabled, events
     *         aren't sent to the specified destinations.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * If <code>true</code>, the event destination is enabled. When the event destination is enabled, the specified
     * event types are sent to the destinations in this <code>EventDestinationDefinition</code>.
     * </p>
     * <p>
     * If <code>false</code>, the event destination is disabled. When the event destination is disabled, events aren't
     * sent to the specified destinations.
     * </p>
     * 
     * @param enabled
     *        If <code>true</code>, the event destination is enabled. When the event destination is enabled, the
     *        specified event types are sent to the destinations in this <code>EventDestinationDefinition</code>.</p>
     *        <p>
     *        If <code>false</code>, the event destination is disabled. When the event destination is disabled, events
     *        aren't sent to the specified destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestinationDefinition withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, the event destination is enabled. When the event destination is enabled, the specified
     * event types are sent to the destinations in this <code>EventDestinationDefinition</code>.
     * </p>
     * <p>
     * If <code>false</code>, the event destination is disabled. When the event destination is disabled, events aren't
     * sent to the specified destinations.
     * </p>
     * 
     * @return If <code>true</code>, the event destination is enabled. When the event destination is enabled, the
     *         specified event types are sent to the destinations in this <code>EventDestinationDefinition</code>.</p>
     *         <p>
     *         If <code>false</code>, the event destination is disabled. When the event destination is disabled, events
     *         aren't sent to the specified destinations.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * An array that specifies which events Amazon Pinpoint should send to the destinations in this
     * <code>EventDestinationDefinition</code>.
     * </p>
     * 
     * @return An array that specifies which events Amazon Pinpoint should send to the destinations in this
     *         <code>EventDestinationDefinition</code>.
     * @see EventType
     */

    public java.util.List<String> getMatchingEventTypes() {
        return matchingEventTypes;
    }

    /**
     * <p>
     * An array that specifies which events Amazon Pinpoint should send to the destinations in this
     * <code>EventDestinationDefinition</code>.
     * </p>
     * 
     * @param matchingEventTypes
     *        An array that specifies which events Amazon Pinpoint should send to the destinations in this
     *        <code>EventDestinationDefinition</code>.
     * @see EventType
     */

    public void setMatchingEventTypes(java.util.Collection<String> matchingEventTypes) {
        if (matchingEventTypes == null) {
            this.matchingEventTypes = null;
            return;
        }

        this.matchingEventTypes = new java.util.ArrayList<String>(matchingEventTypes);
    }

    /**
     * <p>
     * An array that specifies which events Amazon Pinpoint should send to the destinations in this
     * <code>EventDestinationDefinition</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchingEventTypes(java.util.Collection)} or {@link #withMatchingEventTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param matchingEventTypes
     *        An array that specifies which events Amazon Pinpoint should send to the destinations in this
     *        <code>EventDestinationDefinition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventDestinationDefinition withMatchingEventTypes(String... matchingEventTypes) {
        if (this.matchingEventTypes == null) {
            setMatchingEventTypes(new java.util.ArrayList<String>(matchingEventTypes.length));
        }
        for (String ele : matchingEventTypes) {
            this.matchingEventTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that specifies which events Amazon Pinpoint should send to the destinations in this
     * <code>EventDestinationDefinition</code>.
     * </p>
     * 
     * @param matchingEventTypes
     *        An array that specifies which events Amazon Pinpoint should send to the destinations in this
     *        <code>EventDestinationDefinition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventDestinationDefinition withMatchingEventTypes(java.util.Collection<String> matchingEventTypes) {
        setMatchingEventTypes(matchingEventTypes);
        return this;
    }

    /**
     * <p>
     * An array that specifies which events Amazon Pinpoint should send to the destinations in this
     * <code>EventDestinationDefinition</code>.
     * </p>
     * 
     * @param matchingEventTypes
     *        An array that specifies which events Amazon Pinpoint should send to the destinations in this
     *        <code>EventDestinationDefinition</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventDestinationDefinition withMatchingEventTypes(EventType... matchingEventTypes) {
        java.util.ArrayList<String> matchingEventTypesCopy = new java.util.ArrayList<String>(matchingEventTypes.length);
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
     * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis
     * Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
     * </p>
     * 
     * @param kinesisFirehoseDestination
     *        An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon
     *        Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
     */

    public void setKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
        this.kinesisFirehoseDestination = kinesisFirehoseDestination;
    }

    /**
     * <p>
     * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis
     * Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
     * </p>
     * 
     * @return An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon
     *         Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
     */

    public KinesisFirehoseDestination getKinesisFirehoseDestination() {
        return this.kinesisFirehoseDestination;
    }

    /**
     * <p>
     * An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon Kinesis
     * Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
     * </p>
     * 
     * @param kinesisFirehoseDestination
     *        An object that defines an Amazon Kinesis Data Firehose destination for email events. You can use Amazon
     *        Kinesis Data Firehose to stream data to other services, such as Amazon S3 and Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestinationDefinition withKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
        setKinesisFirehoseDestination(kinesisFirehoseDestination);
        return this;
    }

    /**
     * <p>
     * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to
     * monitor and gain insights on your email sending metrics.
     * </p>
     * 
     * @param cloudWatchDestination
     *        An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to
     *        monitor and gain insights on your email sending metrics.
     */

    public void setCloudWatchDestination(CloudWatchDestination cloudWatchDestination) {
        this.cloudWatchDestination = cloudWatchDestination;
    }

    /**
     * <p>
     * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to
     * monitor and gain insights on your email sending metrics.
     * </p>
     * 
     * @return An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch
     *         to monitor and gain insights on your email sending metrics.
     */

    public CloudWatchDestination getCloudWatchDestination() {
        return this.cloudWatchDestination;
    }

    /**
     * <p>
     * An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to
     * monitor and gain insights on your email sending metrics.
     * </p>
     * 
     * @param cloudWatchDestination
     *        An object that defines an Amazon CloudWatch destination for email events. You can use Amazon CloudWatch to
     *        monitor and gain insights on your email sending metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestinationDefinition withCloudWatchDestination(CloudWatchDestination cloudWatchDestination) {
        setCloudWatchDestination(cloudWatchDestination);
        return this;
    }

    /**
     * <p>
     * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification
     * when certain email events occur.
     * </p>
     * 
     * @param snsDestination
     *        An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send
     *        notification when certain email events occur.
     */

    public void setSnsDestination(SnsDestination snsDestination) {
        this.snsDestination = snsDestination;
    }

    /**
     * <p>
     * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification
     * when certain email events occur.
     * </p>
     * 
     * @return An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send
     *         notification when certain email events occur.
     */

    public SnsDestination getSnsDestination() {
        return this.snsDestination;
    }

    /**
     * <p>
     * An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send notification
     * when certain email events occur.
     * </p>
     * 
     * @param snsDestination
     *        An object that defines an Amazon SNS destination for email events. You can use Amazon SNS to send
     *        notification when certain email events occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestinationDefinition withSnsDestination(SnsDestination snsDestination) {
        setSnsDestination(snsDestination);
        return this;
    }

    /**
     * <p>
     * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to
     * create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your
     * campaigns.
     * </p>
     * 
     * @param pinpointDestination
     *        An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events
     *        to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your
     *        campaigns.
     */

    public void setPinpointDestination(PinpointDestination pinpointDestination) {
        this.pinpointDestination = pinpointDestination;
    }

    /**
     * <p>
     * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to
     * create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your
     * campaigns.
     * </p>
     * 
     * @return An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events
     *         to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for
     *         your campaigns.
     */

    public PinpointDestination getPinpointDestination() {
        return this.pinpointDestination;
    }

    /**
     * <p>
     * An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events to
     * create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your
     * campaigns.
     * </p>
     * 
     * @param pinpointDestination
     *        An object that defines a Amazon Pinpoint destination for email events. You can use Amazon Pinpoint events
     *        to create attributes in Amazon Pinpoint projects. You can use these attributes to create segments for your
     *        campaigns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDestinationDefinition withPinpointDestination(PinpointDestination pinpointDestination) {
        setPinpointDestination(pinpointDestination);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getMatchingEventTypes() != null)
            sb.append("MatchingEventTypes: ").append(getMatchingEventTypes()).append(",");
        if (getKinesisFirehoseDestination() != null)
            sb.append("KinesisFirehoseDestination: ").append(getKinesisFirehoseDestination()).append(",");
        if (getCloudWatchDestination() != null)
            sb.append("CloudWatchDestination: ").append(getCloudWatchDestination()).append(",");
        if (getSnsDestination() != null)
            sb.append("SnsDestination: ").append(getSnsDestination()).append(",");
        if (getPinpointDestination() != null)
            sb.append("PinpointDestination: ").append(getPinpointDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventDestinationDefinition == false)
            return false;
        EventDestinationDefinition other = (EventDestinationDefinition) obj;
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
        if (other.getSnsDestination() == null ^ this.getSnsDestination() == null)
            return false;
        if (other.getSnsDestination() != null && other.getSnsDestination().equals(this.getSnsDestination()) == false)
            return false;
        if (other.getPinpointDestination() == null ^ this.getPinpointDestination() == null)
            return false;
        if (other.getPinpointDestination() != null && other.getPinpointDestination().equals(this.getPinpointDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getMatchingEventTypes() == null) ? 0 : getMatchingEventTypes().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseDestination() == null) ? 0 : getKinesisFirehoseDestination().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchDestination() == null) ? 0 : getCloudWatchDestination().hashCode());
        hashCode = prime * hashCode + ((getSnsDestination() == null) ? 0 : getSnsDestination().hashCode());
        hashCode = prime * hashCode + ((getPinpointDestination() == null) ? 0 : getPinpointDestination().hashCode());
        return hashCode;
    }

    @Override
    public EventDestinationDefinition clone() {
        try {
            return (EventDestinationDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.EventDestinationDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
