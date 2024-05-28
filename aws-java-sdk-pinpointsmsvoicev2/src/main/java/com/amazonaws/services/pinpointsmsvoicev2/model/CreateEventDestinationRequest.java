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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/CreateEventDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventDestinationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Either the name of the configuration set or the configuration set ARN to apply event logging to. The
     * ConfigurateSetName and ConfigurationSetArn can be found using the <a>DescribeConfigurationSets</a> action.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * The name that identifies the event destination.
     * </p>
     */
    private String eventDestinationName;
    /**
     * <p>
     * An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs every
     * event type.
     * </p>
     * <note>
     * <p>
     * The <code>TEXT_SENT</code> event type is not supported.
     * </p>
     * </note>
     */
    private java.util.List<String> matchingEventTypes;
    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon CloudWatch Logs.
     * </p>
     */
    private CloudWatchLogsDestination cloudWatchLogsDestination;
    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon Kinesis Data Firehose.
     * </p>
     */
    private KinesisFirehoseDestination kinesisFirehoseDestination;
    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon SNS.
     * </p>
     */
    private SnsDestination snsDestination;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Either the name of the configuration set or the configuration set ARN to apply event logging to. The
     * ConfigurateSetName and ConfigurationSetArn can be found using the <a>DescribeConfigurationSets</a> action.
     * </p>
     * 
     * @param configurationSetName
     *        Either the name of the configuration set or the configuration set ARN to apply event logging to. The
     *        ConfigurateSetName and ConfigurationSetArn can be found using the <a>DescribeConfigurationSets</a> action.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * Either the name of the configuration set or the configuration set ARN to apply event logging to. The
     * ConfigurateSetName and ConfigurationSetArn can be found using the <a>DescribeConfigurationSets</a> action.
     * </p>
     * 
     * @return Either the name of the configuration set or the configuration set ARN to apply event logging to. The
     *         ConfigurateSetName and ConfigurationSetArn can be found using the <a>DescribeConfigurationSets</a>
     *         action.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * Either the name of the configuration set or the configuration set ARN to apply event logging to. The
     * ConfigurateSetName and ConfigurationSetArn can be found using the <a>DescribeConfigurationSets</a> action.
     * </p>
     * 
     * @param configurationSetName
     *        Either the name of the configuration set or the configuration set ARN to apply event logging to. The
     *        ConfigurateSetName and ConfigurationSetArn can be found using the <a>DescribeConfigurationSets</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDestinationRequest withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * The name that identifies the event destination.
     * </p>
     * 
     * @param eventDestinationName
     *        The name that identifies the event destination.
     */

    public void setEventDestinationName(String eventDestinationName) {
        this.eventDestinationName = eventDestinationName;
    }

    /**
     * <p>
     * The name that identifies the event destination.
     * </p>
     * 
     * @return The name that identifies the event destination.
     */

    public String getEventDestinationName() {
        return this.eventDestinationName;
    }

    /**
     * <p>
     * The name that identifies the event destination.
     * </p>
     * 
     * @param eventDestinationName
     *        The name that identifies the event destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDestinationRequest withEventDestinationName(String eventDestinationName) {
        setEventDestinationName(eventDestinationName);
        return this;
    }

    /**
     * <p>
     * An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs every
     * event type.
     * </p>
     * <note>
     * <p>
     * The <code>TEXT_SENT</code> event type is not supported.
     * </p>
     * </note>
     * 
     * @return An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs
     *         every event type.</p> <note>
     *         <p>
     *         The <code>TEXT_SENT</code> event type is not supported.
     *         </p>
     * @see EventType
     */

    public java.util.List<String> getMatchingEventTypes() {
        return matchingEventTypes;
    }

    /**
     * <p>
     * An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs every
     * event type.
     * </p>
     * <note>
     * <p>
     * The <code>TEXT_SENT</code> event type is not supported.
     * </p>
     * </note>
     * 
     * @param matchingEventTypes
     *        An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs
     *        every event type.</p> <note>
     *        <p>
     *        The <code>TEXT_SENT</code> event type is not supported.
     *        </p>
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
     * An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs every
     * event type.
     * </p>
     * <note>
     * <p>
     * The <code>TEXT_SENT</code> event type is not supported.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchingEventTypes(java.util.Collection)} or {@link #withMatchingEventTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param matchingEventTypes
     *        An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs
     *        every event type.</p> <note>
     *        <p>
     *        The <code>TEXT_SENT</code> event type is not supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public CreateEventDestinationRequest withMatchingEventTypes(String... matchingEventTypes) {
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
     * An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs every
     * event type.
     * </p>
     * <note>
     * <p>
     * The <code>TEXT_SENT</code> event type is not supported.
     * </p>
     * </note>
     * 
     * @param matchingEventTypes
     *        An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs
     *        every event type.</p> <note>
     *        <p>
     *        The <code>TEXT_SENT</code> event type is not supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public CreateEventDestinationRequest withMatchingEventTypes(java.util.Collection<String> matchingEventTypes) {
        setMatchingEventTypes(matchingEventTypes);
        return this;
    }

    /**
     * <p>
     * An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs every
     * event type.
     * </p>
     * <note>
     * <p>
     * The <code>TEXT_SENT</code> event type is not supported.
     * </p>
     * </note>
     * 
     * @param matchingEventTypes
     *        An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs
     *        every event type.</p> <note>
     *        <p>
     *        The <code>TEXT_SENT</code> event type is not supported.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public CreateEventDestinationRequest withMatchingEventTypes(EventType... matchingEventTypes) {
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
     * An object that contains information about an event destination for logging to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchLogsDestination
     *        An object that contains information about an event destination for logging to Amazon CloudWatch Logs.
     */

    public void setCloudWatchLogsDestination(CloudWatchLogsDestination cloudWatchLogsDestination) {
        this.cloudWatchLogsDestination = cloudWatchLogsDestination;
    }

    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return An object that contains information about an event destination for logging to Amazon CloudWatch Logs.
     */

    public CloudWatchLogsDestination getCloudWatchLogsDestination() {
        return this.cloudWatchLogsDestination;
    }

    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param cloudWatchLogsDestination
     *        An object that contains information about an event destination for logging to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDestinationRequest withCloudWatchLogsDestination(CloudWatchLogsDestination cloudWatchLogsDestination) {
        setCloudWatchLogsDestination(cloudWatchLogsDestination);
        return this;
    }

    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon Kinesis Data Firehose.
     * </p>
     * 
     * @param kinesisFirehoseDestination
     *        An object that contains information about an event destination for logging to Amazon Kinesis Data
     *        Firehose.
     */

    public void setKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
        this.kinesisFirehoseDestination = kinesisFirehoseDestination;
    }

    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon Kinesis Data Firehose.
     * </p>
     * 
     * @return An object that contains information about an event destination for logging to Amazon Kinesis Data
     *         Firehose.
     */

    public KinesisFirehoseDestination getKinesisFirehoseDestination() {
        return this.kinesisFirehoseDestination;
    }

    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon Kinesis Data Firehose.
     * </p>
     * 
     * @param kinesisFirehoseDestination
     *        An object that contains information about an event destination for logging to Amazon Kinesis Data
     *        Firehose.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDestinationRequest withKinesisFirehoseDestination(KinesisFirehoseDestination kinesisFirehoseDestination) {
        setKinesisFirehoseDestination(kinesisFirehoseDestination);
        return this;
    }

    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon SNS.
     * </p>
     * 
     * @param snsDestination
     *        An object that contains information about an event destination for logging to Amazon SNS.
     */

    public void setSnsDestination(SnsDestination snsDestination) {
        this.snsDestination = snsDestination;
    }

    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon SNS.
     * </p>
     * 
     * @return An object that contains information about an event destination for logging to Amazon SNS.
     */

    public SnsDestination getSnsDestination() {
        return this.snsDestination;
    }

    /**
     * <p>
     * An object that contains information about an event destination for logging to Amazon SNS.
     * </p>
     * 
     * @param snsDestination
     *        An object that contains information about an event destination for logging to Amazon SNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDestinationRequest withSnsDestination(SnsDestination snsDestination) {
        setSnsDestination(snsDestination);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *        specify a client token, a randomly generated token is used for the request to ensure idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *         specify a client token, a randomly generated token is used for the request to ensure idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify
     * a client token, a randomly generated token is used for the request to ensure idempotency.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't
     *        specify a client token, a randomly generated token is used for the request to ensure idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventDestinationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getEventDestinationName() != null)
            sb.append("EventDestinationName: ").append(getEventDestinationName()).append(",");
        if (getMatchingEventTypes() != null)
            sb.append("MatchingEventTypes: ").append(getMatchingEventTypes()).append(",");
        if (getCloudWatchLogsDestination() != null)
            sb.append("CloudWatchLogsDestination: ").append(getCloudWatchLogsDestination()).append(",");
        if (getKinesisFirehoseDestination() != null)
            sb.append("KinesisFirehoseDestination: ").append(getKinesisFirehoseDestination()).append(",");
        if (getSnsDestination() != null)
            sb.append("SnsDestination: ").append(getSnsDestination()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventDestinationRequest == false)
            return false;
        CreateEventDestinationRequest other = (CreateEventDestinationRequest) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getEventDestinationName() == null ^ this.getEventDestinationName() == null)
            return false;
        if (other.getEventDestinationName() != null && other.getEventDestinationName().equals(this.getEventDestinationName()) == false)
            return false;
        if (other.getMatchingEventTypes() == null ^ this.getMatchingEventTypes() == null)
            return false;
        if (other.getMatchingEventTypes() != null && other.getMatchingEventTypes().equals(this.getMatchingEventTypes()) == false)
            return false;
        if (other.getCloudWatchLogsDestination() == null ^ this.getCloudWatchLogsDestination() == null)
            return false;
        if (other.getCloudWatchLogsDestination() != null && other.getCloudWatchLogsDestination().equals(this.getCloudWatchLogsDestination()) == false)
            return false;
        if (other.getKinesisFirehoseDestination() == null ^ this.getKinesisFirehoseDestination() == null)
            return false;
        if (other.getKinesisFirehoseDestination() != null && other.getKinesisFirehoseDestination().equals(this.getKinesisFirehoseDestination()) == false)
            return false;
        if (other.getSnsDestination() == null ^ this.getSnsDestination() == null)
            return false;
        if (other.getSnsDestination() != null && other.getSnsDestination().equals(this.getSnsDestination()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getEventDestinationName() == null) ? 0 : getEventDestinationName().hashCode());
        hashCode = prime * hashCode + ((getMatchingEventTypes() == null) ? 0 : getMatchingEventTypes().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsDestination() == null) ? 0 : getCloudWatchLogsDestination().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseDestination() == null) ? 0 : getKinesisFirehoseDestination().hashCode());
        hashCode = prime * hashCode + ((getSnsDestination() == null) ? 0 : getSnsDestination().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventDestinationRequest clone() {
        return (CreateEventDestinationRequest) super.clone();
    }

}
