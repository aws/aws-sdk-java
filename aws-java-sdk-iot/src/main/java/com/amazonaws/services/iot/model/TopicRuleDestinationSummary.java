/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the topic rule destination.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRuleDestinationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The topic rule destination ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed. You can set <code>status</code> to
     * <code>DISABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not allowed. You can set <code>status</code> to
     * <code>ENABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation timed out. You can call
     * <code>GetTopicRuleDestination</code> for details about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * The reason the topic rule destination is in the current status.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * Information about the HTTP URL.
     * </p>
     */
    private HttpUrlDestinationSummary httpUrlSummary;

    /**
     * <p>
     * The topic rule destination ARN.
     * </p>
     * 
     * @param arn
     *        The topic rule destination ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The topic rule destination ARN.
     * </p>
     * 
     * @return The topic rule destination ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The topic rule destination ARN.
     * </p>
     * 
     * @param arn
     *        The topic rule destination ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestinationSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed. You can set <code>status</code> to
     * <code>DISABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not allowed. You can set <code>status</code> to
     * <code>ENABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation timed out. You can call
     * <code>GetTopicRuleDestination</code> for details about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the topic rule destination. Valid values are:</p>
     *        <dl>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        A topic rule destination was created but has not been confirmed. You can set <code>status</code> to
     *        <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     *        <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your
     *        confirmation endpoint.
     *        </p>
     *        </dd>
     *        <dt>ENABLED</dt>
     *        <dd>
     *        <p>
     *        Confirmation was completed, and traffic to this destination is allowed. You can set <code>status</code> to
     *        <code>DISABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     *        </p>
     *        </dd>
     *        <dt>DISABLED</dt>
     *        <dd>
     *        <p>
     *        Confirmation was completed, and traffic to this destination is not allowed. You can set
     *        <code>status</code> to <code>ENABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     *        </p>
     *        </dd>
     *        <dt>ERROR</dt>
     *        <dd>
     *        <p>
     *        Confirmation could not be completed, for example if the confirmation timed out. You can call
     *        <code>GetTopicRuleDestination</code> for details about the error. You can set <code>status</code> to
     *        <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     *        <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your
     *        confirmation endpoint.
     *        </p>
     *        </dd>
     * @see TopicRuleDestinationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed. You can set <code>status</code> to
     * <code>DISABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not allowed. You can set <code>status</code> to
     * <code>ENABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation timed out. You can call
     * <code>GetTopicRuleDestination</code> for details about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of the topic rule destination. Valid values are:</p>
     *         <dl>
     *         <dt>IN_PROGRESS</dt>
     *         <dd>
     *         <p>
     *         A topic rule destination was created but has not been confirmed. You can set <code>status</code> to
     *         <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     *         <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your
     *         confirmation endpoint.
     *         </p>
     *         </dd>
     *         <dt>ENABLED</dt>
     *         <dd>
     *         <p>
     *         Confirmation was completed, and traffic to this destination is allowed. You can set <code>status</code>
     *         to <code>DISABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     *         </p>
     *         </dd>
     *         <dt>DISABLED</dt>
     *         <dd>
     *         <p>
     *         Confirmation was completed, and traffic to this destination is not allowed. You can set
     *         <code>status</code> to <code>ENABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     *         </p>
     *         </dd>
     *         <dt>ERROR</dt>
     *         <dd>
     *         <p>
     *         Confirmation could not be completed, for example if the confirmation timed out. You can call
     *         <code>GetTopicRuleDestination</code> for details about the error. You can set <code>status</code> to
     *         <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     *         <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your
     *         confirmation endpoint.
     *         </p>
     *         </dd>
     * @see TopicRuleDestinationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed. You can set <code>status</code> to
     * <code>DISABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not allowed. You can set <code>status</code> to
     * <code>ENABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation timed out. You can call
     * <code>GetTopicRuleDestination</code> for details about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the topic rule destination. Valid values are:</p>
     *        <dl>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        A topic rule destination was created but has not been confirmed. You can set <code>status</code> to
     *        <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     *        <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your
     *        confirmation endpoint.
     *        </p>
     *        </dd>
     *        <dt>ENABLED</dt>
     *        <dd>
     *        <p>
     *        Confirmation was completed, and traffic to this destination is allowed. You can set <code>status</code> to
     *        <code>DISABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     *        </p>
     *        </dd>
     *        <dt>DISABLED</dt>
     *        <dd>
     *        <p>
     *        Confirmation was completed, and traffic to this destination is not allowed. You can set
     *        <code>status</code> to <code>ENABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     *        </p>
     *        </dd>
     *        <dt>ERROR</dt>
     *        <dd>
     *        <p>
     *        Confirmation could not be completed, for example if the confirmation timed out. You can call
     *        <code>GetTopicRuleDestination</code> for details about the error. You can set <code>status</code> to
     *        <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     *        <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your
     *        confirmation endpoint.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicRuleDestinationStatus
     */

    public TopicRuleDestinationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the topic rule destination. Valid values are:
     * </p>
     * <dl>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * A topic rule destination was created but has not been confirmed. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     * </p>
     * </dd>
     * <dt>ENABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is allowed. You can set <code>status</code> to
     * <code>DISABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>DISABLED</dt>
     * <dd>
     * <p>
     * Confirmation was completed, and traffic to this destination is not allowed. You can set <code>status</code> to
     * <code>ENABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     * </p>
     * </dd>
     * <dt>ERROR</dt>
     * <dd>
     * <p>
     * Confirmation could not be completed, for example if the confirmation timed out. You can call
     * <code>GetTopicRuleDestination</code> for details about the error. You can set <code>status</code> to
     * <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     * <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your confirmation
     * endpoint.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the topic rule destination. Valid values are:</p>
     *        <dl>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        A topic rule destination was created but has not been confirmed. You can set <code>status</code> to
     *        <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     *        <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your
     *        confirmation endpoint.
     *        </p>
     *        </dd>
     *        <dt>ENABLED</dt>
     *        <dd>
     *        <p>
     *        Confirmation was completed, and traffic to this destination is allowed. You can set <code>status</code> to
     *        <code>DISABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     *        </p>
     *        </dd>
     *        <dt>DISABLED</dt>
     *        <dd>
     *        <p>
     *        Confirmation was completed, and traffic to this destination is not allowed. You can set
     *        <code>status</code> to <code>ENABLED</code> by calling <code>UpdateTopicRuleDestination</code>.
     *        </p>
     *        </dd>
     *        <dt>ERROR</dt>
     *        <dd>
     *        <p>
     *        Confirmation could not be completed, for example if the confirmation timed out. You can call
     *        <code>GetTopicRuleDestination</code> for details about the error. You can set <code>status</code> to
     *        <code>IN_PROGRESS</code> by calling <code>UpdateTopicRuleDestination</code>. Calling
     *        <code>UpdateTopicRuleDestination</code> causes a new confirmation challenge to be sent to your
     *        confirmation endpoint.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicRuleDestinationStatus
     */

    public TopicRuleDestinationSummary withStatus(TopicRuleDestinationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason the topic rule destination is in the current status.
     * </p>
     * 
     * @param statusReason
     *        The reason the topic rule destination is in the current status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason the topic rule destination is in the current status.
     * </p>
     * 
     * @return The reason the topic rule destination is in the current status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason the topic rule destination is in the current status.
     * </p>
     * 
     * @param statusReason
     *        The reason the topic rule destination is in the current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestinationSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Information about the HTTP URL.
     * </p>
     * 
     * @param httpUrlSummary
     *        Information about the HTTP URL.
     */

    public void setHttpUrlSummary(HttpUrlDestinationSummary httpUrlSummary) {
        this.httpUrlSummary = httpUrlSummary;
    }

    /**
     * <p>
     * Information about the HTTP URL.
     * </p>
     * 
     * @return Information about the HTTP URL.
     */

    public HttpUrlDestinationSummary getHttpUrlSummary() {
        return this.httpUrlSummary;
    }

    /**
     * <p>
     * Information about the HTTP URL.
     * </p>
     * 
     * @param httpUrlSummary
     *        Information about the HTTP URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestinationSummary withHttpUrlSummary(HttpUrlDestinationSummary httpUrlSummary) {
        setHttpUrlSummary(httpUrlSummary);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getHttpUrlSummary() != null)
            sb.append("HttpUrlSummary: ").append(getHttpUrlSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRuleDestinationSummary == false)
            return false;
        TopicRuleDestinationSummary other = (TopicRuleDestinationSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getHttpUrlSummary() == null ^ this.getHttpUrlSummary() == null)
            return false;
        if (other.getHttpUrlSummary() != null && other.getHttpUrlSummary().equals(this.getHttpUrlSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getHttpUrlSummary() == null) ? 0 : getHttpUrlSummary().hashCode());
        return hashCode;
    }

    @Override
    public TopicRuleDestinationSummary clone() {
        try {
            return (TopicRuleDestinationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TopicRuleDestinationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
