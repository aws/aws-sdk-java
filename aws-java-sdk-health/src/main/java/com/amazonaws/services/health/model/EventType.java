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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata about a type of event that is reported by AWS Health. Data consists of the category (for example,
 * <code>issue</code>), the service (for example, <code>EC2</code>), and the event type code (for example,
 * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EventType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS service that is affected by the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for
     * example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     */
    private String code;
    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     */
    private String category;

    /**
     * <p>
     * The AWS service that is affected by the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * 
     * @param service
     *        The AWS service that is affected by the event. For example, <code>EC2</code>, <code>RDS</code>.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The AWS service that is affected by the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * 
     * @return The AWS service that is affected by the event. For example, <code>EC2</code>, <code>RDS</code>.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The AWS service that is affected by the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * 
     * @param service
     *        The AWS service that is affected by the event. For example, <code>EC2</code>, <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for
     * example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * 
     * @param code
     *        The unique identifier for the event type. The format is
     *        <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for example,
     *        <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for
     * example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * 
     * @return The unique identifier for the event type. The format is
     *         <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for example,
     *         <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for
     * example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * 
     * @param code
     *        The unique identifier for the event type. The format is
     *        <code>AWS_<i>SERVICE</i>_<i>DESCRIPTION</i> </code>; for example,
     *        <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventType withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @param category
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @see EventTypeCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @return A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *         <code>accountNotification</code>).
     * @see EventTypeCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @param category
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public EventType withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @param category
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @see EventTypeCategory
     */

    public void setCategory(EventTypeCategory category) {
        withCategory(category);
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @param category
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public EventType withCategory(EventTypeCategory category) {
        this.category = category.toString();
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventType == false)
            return false;
        EventType other = (EventType) obj;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        return hashCode;
    }

    @Override
    public EventType clone() {
        try {
            return (EventType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.EventTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
