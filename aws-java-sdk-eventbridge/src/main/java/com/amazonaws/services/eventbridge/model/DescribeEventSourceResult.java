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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeEventSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the partner event source.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the SaaS partner that created the event source.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time that the event source was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that the event source will expire if you don't create a matching event bus.
     * </p>
     */
    private java.util.Date expirationTime;
    /**
     * <p>
     * The name of the partner event source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The state of the event source. If it's <code>ACTIVE</code>, you have already created a matching event bus for
     * this event source, and that event bus is active. If it's <code>PENDING</code>, either you haven't yet created a
     * matching event bus, or that event bus is deactivated. If it's <code>DELETED</code>, you have created a matching
     * event bus, but the event source has since been deleted.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ARN of the partner event source.
     * </p>
     * 
     * @param arn
     *        The ARN of the partner event source.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the partner event source.
     * </p>
     * 
     * @return The ARN of the partner event source.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the partner event source.
     * </p>
     * 
     * @param arn
     *        The ARN of the partner event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventSourceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the SaaS partner that created the event source.
     * </p>
     * 
     * @param createdBy
     *        The name of the SaaS partner that created the event source.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The name of the SaaS partner that created the event source.
     * </p>
     * 
     * @return The name of the SaaS partner that created the event source.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The name of the SaaS partner that created the event source.
     * </p>
     * 
     * @param createdBy
     *        The name of the SaaS partner that created the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventSourceResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time that the event source was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the event source was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the event source was created.
     * </p>
     * 
     * @return The date and time that the event source was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the event source was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the event source was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventSourceResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the event source will expire if you don't create a matching event bus.
     * </p>
     * 
     * @param expirationTime
     *        The date and time that the event source will expire if you don't create a matching event bus.
     */

    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The date and time that the event source will expire if you don't create a matching event bus.
     * </p>
     * 
     * @return The date and time that the event source will expire if you don't create a matching event bus.
     */

    public java.util.Date getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * The date and time that the event source will expire if you don't create a matching event bus.
     * </p>
     * 
     * @param expirationTime
     *        The date and time that the event source will expire if you don't create a matching event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventSourceResult withExpirationTime(java.util.Date expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * The name of the partner event source.
     * </p>
     * 
     * @param name
     *        The name of the partner event source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the partner event source.
     * </p>
     * 
     * @return The name of the partner event source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the partner event source.
     * </p>
     * 
     * @param name
     *        The name of the partner event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventSourceResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The state of the event source. If it's <code>ACTIVE</code>, you have already created a matching event bus for
     * this event source, and that event bus is active. If it's <code>PENDING</code>, either you haven't yet created a
     * matching event bus, or that event bus is deactivated. If it's <code>DELETED</code>, you have created a matching
     * event bus, but the event source has since been deleted.
     * </p>
     * 
     * @param state
     *        The state of the event source. If it's <code>ACTIVE</code>, you have already created a matching event bus
     *        for this event source, and that event bus is active. If it's <code>PENDING</code>, either you haven't yet
     *        created a matching event bus, or that event bus is deactivated. If it's <code>DELETED</code>, you have
     *        created a matching event bus, but the event source has since been deleted.
     * @see EventSourceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the event source. If it's <code>ACTIVE</code>, you have already created a matching event bus for
     * this event source, and that event bus is active. If it's <code>PENDING</code>, either you haven't yet created a
     * matching event bus, or that event bus is deactivated. If it's <code>DELETED</code>, you have created a matching
     * event bus, but the event source has since been deleted.
     * </p>
     * 
     * @return The state of the event source. If it's <code>ACTIVE</code>, you have already created a matching event bus
     *         for this event source, and that event bus is active. If it's <code>PENDING</code>, either you haven't yet
     *         created a matching event bus, or that event bus is deactivated. If it's <code>DELETED</code>, you have
     *         created a matching event bus, but the event source has since been deleted.
     * @see EventSourceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the event source. If it's <code>ACTIVE</code>, you have already created a matching event bus for
     * this event source, and that event bus is active. If it's <code>PENDING</code>, either you haven't yet created a
     * matching event bus, or that event bus is deactivated. If it's <code>DELETED</code>, you have created a matching
     * event bus, but the event source has since been deleted.
     * </p>
     * 
     * @param state
     *        The state of the event source. If it's <code>ACTIVE</code>, you have already created a matching event bus
     *        for this event source, and that event bus is active. If it's <code>PENDING</code>, either you haven't yet
     *        created a matching event bus, or that event bus is deactivated. If it's <code>DELETED</code>, you have
     *        created a matching event bus, but the event source has since been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceState
     */

    public DescribeEventSourceResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the event source. If it's <code>ACTIVE</code>, you have already created a matching event bus for
     * this event source, and that event bus is active. If it's <code>PENDING</code>, either you haven't yet created a
     * matching event bus, or that event bus is deactivated. If it's <code>DELETED</code>, you have created a matching
     * event bus, but the event source has since been deleted.
     * </p>
     * 
     * @param state
     *        The state of the event source. If it's <code>ACTIVE</code>, you have already created a matching event bus
     *        for this event source, and that event bus is active. If it's <code>PENDING</code>, either you haven't yet
     *        created a matching event bus, or that event bus is deactivated. If it's <code>DELETED</code>, you have
     *        created a matching event bus, but the event source has since been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceState
     */

    public DescribeEventSourceResult withState(EventSourceState state) {
        this.state = state.toString();
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventSourceResult == false)
            return false;
        DescribeEventSourceResult other = (DescribeEventSourceResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventSourceResult clone() {
        try {
            return (DescribeEventSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
