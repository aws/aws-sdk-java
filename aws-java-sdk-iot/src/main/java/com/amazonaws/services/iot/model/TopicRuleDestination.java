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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A topic rule destination.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicRuleDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The topic rule destination URL.
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
     * The date and time when the topic rule destination was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time when the topic rule destination was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * Additional details or reason why the topic rule destination is in the current status.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * Properties of the HTTP URL.
     * </p>
     */
    private HttpUrlDestinationProperties httpUrlProperties;
    /**
     * <p>
     * Properties of the virtual private cloud (VPC) connection.
     * </p>
     */
    private VpcDestinationProperties vpcProperties;

    /**
     * <p>
     * The topic rule destination URL.
     * </p>
     * 
     * @param arn
     *        The topic rule destination URL.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The topic rule destination URL.
     * </p>
     * 
     * @return The topic rule destination URL.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The topic rule destination URL.
     * </p>
     * 
     * @param arn
     *        The topic rule destination URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestination withArn(String arn) {
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

    public TopicRuleDestination withStatus(String status) {
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

    public TopicRuleDestination withStatus(TopicRuleDestinationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the topic rule destination was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was created.
     * </p>
     * 
     * @return The date and time when the topic rule destination was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the topic rule destination was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestination withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the topic rule destination was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was last updated.
     * </p>
     * 
     * @return The date and time when the topic rule destination was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time when the topic rule destination was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time when the topic rule destination was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestination withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * Additional details or reason why the topic rule destination is in the current status.
     * </p>
     * 
     * @param statusReason
     *        Additional details or reason why the topic rule destination is in the current status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Additional details or reason why the topic rule destination is in the current status.
     * </p>
     * 
     * @return Additional details or reason why the topic rule destination is in the current status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Additional details or reason why the topic rule destination is in the current status.
     * </p>
     * 
     * @param statusReason
     *        Additional details or reason why the topic rule destination is in the current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestination withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Properties of the HTTP URL.
     * </p>
     * 
     * @param httpUrlProperties
     *        Properties of the HTTP URL.
     */

    public void setHttpUrlProperties(HttpUrlDestinationProperties httpUrlProperties) {
        this.httpUrlProperties = httpUrlProperties;
    }

    /**
     * <p>
     * Properties of the HTTP URL.
     * </p>
     * 
     * @return Properties of the HTTP URL.
     */

    public HttpUrlDestinationProperties getHttpUrlProperties() {
        return this.httpUrlProperties;
    }

    /**
     * <p>
     * Properties of the HTTP URL.
     * </p>
     * 
     * @param httpUrlProperties
     *        Properties of the HTTP URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestination withHttpUrlProperties(HttpUrlDestinationProperties httpUrlProperties) {
        setHttpUrlProperties(httpUrlProperties);
        return this;
    }

    /**
     * <p>
     * Properties of the virtual private cloud (VPC) connection.
     * </p>
     * 
     * @param vpcProperties
     *        Properties of the virtual private cloud (VPC) connection.
     */

    public void setVpcProperties(VpcDestinationProperties vpcProperties) {
        this.vpcProperties = vpcProperties;
    }

    /**
     * <p>
     * Properties of the virtual private cloud (VPC) connection.
     * </p>
     * 
     * @return Properties of the virtual private cloud (VPC) connection.
     */

    public VpcDestinationProperties getVpcProperties() {
        return this.vpcProperties;
    }

    /**
     * <p>
     * Properties of the virtual private cloud (VPC) connection.
     * </p>
     * 
     * @param vpcProperties
     *        Properties of the virtual private cloud (VPC) connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicRuleDestination withVpcProperties(VpcDestinationProperties vpcProperties) {
        setVpcProperties(vpcProperties);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getHttpUrlProperties() != null)
            sb.append("HttpUrlProperties: ").append(getHttpUrlProperties()).append(",");
        if (getVpcProperties() != null)
            sb.append("VpcProperties: ").append(getVpcProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRuleDestination == false)
            return false;
        TopicRuleDestination other = (TopicRuleDestination) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getHttpUrlProperties() == null ^ this.getHttpUrlProperties() == null)
            return false;
        if (other.getHttpUrlProperties() != null && other.getHttpUrlProperties().equals(this.getHttpUrlProperties()) == false)
            return false;
        if (other.getVpcProperties() == null ^ this.getVpcProperties() == null)
            return false;
        if (other.getVpcProperties() != null && other.getVpcProperties().equals(this.getVpcProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getHttpUrlProperties() == null) ? 0 : getHttpUrlProperties().hashCode());
        hashCode = prime * hashCode + ((getVpcProperties() == null) ? 0 : getVpcProperties().hashCode());
        return hashCode;
    }

    @Override
    public TopicRuleDestination clone() {
        try {
            return (TopicRuleDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TopicRuleDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
