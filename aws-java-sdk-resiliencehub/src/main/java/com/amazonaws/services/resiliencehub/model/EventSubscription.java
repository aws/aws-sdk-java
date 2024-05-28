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
package com.amazonaws.services.resiliencehub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates an event you would like to subscribe and get notification for. Currently, Resilience Hub supports
 * notifications only for <b>Drift detected</b> and <b>Scheduled assessment failure</b> events.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resiliencehub-2020-04-30/EventSubscription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSubscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of event you would like to subscribe and get notification for. Currently, Resilience Hub supports
     * notifications only for <b>Drift detected</b> (<code>DriftDetected</code>) and <b>Scheduled assessment failure</b>
     * (<code>ScheduledAssessmentFailure</code>) events.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * Unique name to identify an event subscription.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic. The format for this ARN is:
     * <code>arn:partition:sns:region:account:topic-name</code>. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     */
    private String snsTopicArn;

    /**
     * <p>
     * The type of event you would like to subscribe and get notification for. Currently, Resilience Hub supports
     * notifications only for <b>Drift detected</b> (<code>DriftDetected</code>) and <b>Scheduled assessment failure</b>
     * (<code>ScheduledAssessmentFailure</code>) events.
     * </p>
     * 
     * @param eventType
     *        The type of event you would like to subscribe and get notification for. Currently, Resilience Hub supports
     *        notifications only for <b>Drift detected</b> (<code>DriftDetected</code>) and <b>Scheduled assessment
     *        failure</b> (<code>ScheduledAssessmentFailure</code>) events.
     * @see EventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of event you would like to subscribe and get notification for. Currently, Resilience Hub supports
     * notifications only for <b>Drift detected</b> (<code>DriftDetected</code>) and <b>Scheduled assessment failure</b>
     * (<code>ScheduledAssessmentFailure</code>) events.
     * </p>
     * 
     * @return The type of event you would like to subscribe and get notification for. Currently, Resilience Hub
     *         supports notifications only for <b>Drift detected</b> (<code>DriftDetected</code>) and <b>Scheduled
     *         assessment failure</b> (<code>ScheduledAssessmentFailure</code>) events.
     * @see EventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of event you would like to subscribe and get notification for. Currently, Resilience Hub supports
     * notifications only for <b>Drift detected</b> (<code>DriftDetected</code>) and <b>Scheduled assessment failure</b>
     * (<code>ScheduledAssessmentFailure</code>) events.
     * </p>
     * 
     * @param eventType
     *        The type of event you would like to subscribe and get notification for. Currently, Resilience Hub supports
     *        notifications only for <b>Drift detected</b> (<code>DriftDetected</code>) and <b>Scheduled assessment
     *        failure</b> (<code>ScheduledAssessmentFailure</code>) events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventSubscription withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The type of event you would like to subscribe and get notification for. Currently, Resilience Hub supports
     * notifications only for <b>Drift detected</b> (<code>DriftDetected</code>) and <b>Scheduled assessment failure</b>
     * (<code>ScheduledAssessmentFailure</code>) events.
     * </p>
     * 
     * @param eventType
     *        The type of event you would like to subscribe and get notification for. Currently, Resilience Hub supports
     *        notifications only for <b>Drift detected</b> (<code>DriftDetected</code>) and <b>Scheduled assessment
     *        failure</b> (<code>ScheduledAssessmentFailure</code>) events.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public EventSubscription withEventType(EventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * Unique name to identify an event subscription.
     * </p>
     * 
     * @param name
     *        Unique name to identify an event subscription.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Unique name to identify an event subscription.
     * </p>
     * 
     * @return Unique name to identify an event subscription.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Unique name to identify an event subscription.
     * </p>
     * 
     * @param name
     *        Unique name to identify an event subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic. The format for this ARN is:
     * <code>arn:partition:sns:region:account:topic-name</code>. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param snsTopicArn
     *        Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic. The format for this ARN is:
     *        <code>arn:partition:sns:region:account:topic-name</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic. The format for this ARN is:
     * <code>arn:partition:sns:region:account:topic-name</code>. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic. The format for this ARN is:
     *         <code>arn:partition:sns:region:account:topic-name</code>. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *         (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic. The format for this ARN is:
     * <code>arn:partition:sns:region:account:topic-name</code>. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     * (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * </p>
     * 
     * @param snsTopicArn
     *        Amazon Resource Name (ARN) of the Amazon Simple Notification Service topic. The format for this ARN is:
     *        <code>arn:partition:sns:region:account:topic-name</code>. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"> Amazon Resource Names
     *        (ARNs)</a> in the <i>Amazon Web Services General Reference</i> guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
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
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventSubscription == false)
            return false;
        EventSubscription other = (EventSubscription) obj;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public EventSubscription clone() {
        try {
            return (EventSubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.resiliencehub.model.transform.EventSubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
