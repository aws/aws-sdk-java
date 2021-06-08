/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that describes a deployment event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeploymentEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of deployment event. Deployment event types include the start, stop, or completion of a deployment; a
     * percentage update; the start or stop of a bake period; the start or completion of a rollback.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an Amazon
     * CloudWatch alarm, or an internal error.
     * </p>
     */
    private String triggeredBy;
    /**
     * <p>
     * A description of the deployment event. Descriptions include, but are not limited to, the user account or the
     * CloudWatch alarm ARN that initiated a rollback, the percentage of hosts that received the deployment, or in the
     * case of an internal error, a recommendation to attempt a new deployment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     */
    private java.util.Date occurredAt;

    /**
     * <p>
     * The type of deployment event. Deployment event types include the start, stop, or completion of a deployment; a
     * percentage update; the start or stop of a bake period; the start or completion of a rollback.
     * </p>
     * 
     * @param eventType
     *        The type of deployment event. Deployment event types include the start, stop, or completion of a
     *        deployment; a percentage update; the start or stop of a bake period; the start or completion of a
     *        rollback.
     * @see DeploymentEventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of deployment event. Deployment event types include the start, stop, or completion of a deployment; a
     * percentage update; the start or stop of a bake period; the start or completion of a rollback.
     * </p>
     * 
     * @return The type of deployment event. Deployment event types include the start, stop, or completion of a
     *         deployment; a percentage update; the start or stop of a bake period; the start or completion of a
     *         rollback.
     * @see DeploymentEventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of deployment event. Deployment event types include the start, stop, or completion of a deployment; a
     * percentage update; the start or stop of a bake period; the start or completion of a rollback.
     * </p>
     * 
     * @param eventType
     *        The type of deployment event. Deployment event types include the start, stop, or completion of a
     *        deployment; a percentage update; the start or stop of a bake period; the start or completion of a
     *        rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentEventType
     */

    public DeploymentEvent withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The type of deployment event. Deployment event types include the start, stop, or completion of a deployment; a
     * percentage update; the start or stop of a bake period; the start or completion of a rollback.
     * </p>
     * 
     * @param eventType
     *        The type of deployment event. Deployment event types include the start, stop, or completion of a
     *        deployment; a percentage update; the start or stop of a bake period; the start or completion of a
     *        rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentEventType
     */

    public DeploymentEvent withEventType(DeploymentEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an Amazon
     * CloudWatch alarm, or an internal error.
     * </p>
     * 
     * @param triggeredBy
     *        The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an
     *        Amazon CloudWatch alarm, or an internal error.
     * @see TriggeredBy
     */

    public void setTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an Amazon
     * CloudWatch alarm, or an internal error.
     * </p>
     * 
     * @return The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an
     *         Amazon CloudWatch alarm, or an internal error.
     * @see TriggeredBy
     */

    public String getTriggeredBy() {
        return this.triggeredBy;
    }

    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an Amazon
     * CloudWatch alarm, or an internal error.
     * </p>
     * 
     * @param triggeredBy
     *        The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an
     *        Amazon CloudWatch alarm, or an internal error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggeredBy
     */

    public DeploymentEvent withTriggeredBy(String triggeredBy) {
        setTriggeredBy(triggeredBy);
        return this;
    }

    /**
     * <p>
     * The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an Amazon
     * CloudWatch alarm, or an internal error.
     * </p>
     * 
     * @param triggeredBy
     *        The entity that triggered the deployment event. Events can be triggered by a user, AWS AppConfig, an
     *        Amazon CloudWatch alarm, or an internal error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggeredBy
     */

    public DeploymentEvent withTriggeredBy(TriggeredBy triggeredBy) {
        this.triggeredBy = triggeredBy.toString();
        return this;
    }

    /**
     * <p>
     * A description of the deployment event. Descriptions include, but are not limited to, the user account or the
     * CloudWatch alarm ARN that initiated a rollback, the percentage of hosts that received the deployment, or in the
     * case of an internal error, a recommendation to attempt a new deployment.
     * </p>
     * 
     * @param description
     *        A description of the deployment event. Descriptions include, but are not limited to, the user account or
     *        the CloudWatch alarm ARN that initiated a rollback, the percentage of hosts that received the deployment,
     *        or in the case of an internal error, a recommendation to attempt a new deployment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the deployment event. Descriptions include, but are not limited to, the user account or the
     * CloudWatch alarm ARN that initiated a rollback, the percentage of hosts that received the deployment, or in the
     * case of an internal error, a recommendation to attempt a new deployment.
     * </p>
     * 
     * @return A description of the deployment event. Descriptions include, but are not limited to, the user account or
     *         the CloudWatch alarm ARN that initiated a rollback, the percentage of hosts that received the deployment,
     *         or in the case of an internal error, a recommendation to attempt a new deployment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the deployment event. Descriptions include, but are not limited to, the user account or the
     * CloudWatch alarm ARN that initiated a rollback, the percentage of hosts that received the deployment, or in the
     * case of an internal error, a recommendation to attempt a new deployment.
     * </p>
     * 
     * @param description
     *        A description of the deployment event. Descriptions include, but are not limited to, the user account or
     *        the CloudWatch alarm ARN that initiated a rollback, the percentage of hosts that received the deployment,
     *        or in the case of an internal error, a recommendation to attempt a new deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentEvent withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     * 
     * @param occurredAt
     *        The date and time the event occurred.
     */

    public void setOccurredAt(java.util.Date occurredAt) {
        this.occurredAt = occurredAt;
    }

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     * 
     * @return The date and time the event occurred.
     */

    public java.util.Date getOccurredAt() {
        return this.occurredAt;
    }

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     * 
     * @param occurredAt
     *        The date and time the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentEvent withOccurredAt(java.util.Date occurredAt) {
        setOccurredAt(occurredAt);
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
        if (getTriggeredBy() != null)
            sb.append("TriggeredBy: ").append(getTriggeredBy()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOccurredAt() != null)
            sb.append("OccurredAt: ").append(getOccurredAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentEvent == false)
            return false;
        DeploymentEvent other = (DeploymentEvent) obj;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getTriggeredBy() == null ^ this.getTriggeredBy() == null)
            return false;
        if (other.getTriggeredBy() != null && other.getTriggeredBy().equals(this.getTriggeredBy()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOccurredAt() == null ^ this.getOccurredAt() == null)
            return false;
        if (other.getOccurredAt() != null && other.getOccurredAt().equals(this.getOccurredAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getTriggeredBy() == null) ? 0 : getTriggeredBy().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOccurredAt() == null) ? 0 : getOccurredAt().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentEvent clone() {
        try {
            return (DeploymentEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfig.model.transform.DeploymentEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
