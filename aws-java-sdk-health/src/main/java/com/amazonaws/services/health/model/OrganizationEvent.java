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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about an event, returned by the <a>DescribeEventsForOrganization</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/OrganizationEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The AWS service that is affected by the event. For example, EC2, RDS.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     */
    private String eventTypeCode;
    /**
     * <p>
     * The category of the event type.
     * </p>
     */
    private String eventTypeCategory;
    /**
     * <p>
     * The AWS Region name of the event.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The date and time that the event began.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The most recent date and time that the event was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The most recent status of the event. Possible values are <code>open</code>, <code>closed</code>, and
     * <code>upcoming</code>.
     * </p>
     */
    private String statusCode;

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @param arn
     *        The unique identifier for the event. Format:
     *        <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *        . Example:
     *        <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @return The unique identifier for the event. Format:
     *         <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *         . Example:
     *         <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique identifier for the event. Format:
     * <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     * . Example:
     * <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * </p>
     * 
     * @param arn
     *        The unique identifier for the event. Format:
     *        <code>arn:aws:health:<i>event-region</i>::event/<i>SERVICE</i>/<i>EVENT_TYPE_CODE</i>/<i>EVENT_TYPE_PLUS_ID</i> </code>
     *        . Example:
     *        <code>Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEvent withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The AWS service that is affected by the event. For example, EC2, RDS.
     * </p>
     * 
     * @param service
     *        The AWS service that is affected by the event. For example, EC2, RDS.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The AWS service that is affected by the event. For example, EC2, RDS.
     * </p>
     * 
     * @return The AWS service that is affected by the event. For example, EC2, RDS.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The AWS service that is affected by the event. For example, EC2, RDS.
     * </p>
     * 
     * @param service
     *        The AWS service that is affected by the event. For example, EC2, RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEvent withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * 
     * @param eventTypeCode
     *        The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     *        <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     */

    public void setEventTypeCode(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * 
     * @return The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For
     *         example, <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     */

    public String getEventTypeCode() {
        return this.eventTypeCode;
    }

    /**
     * <p>
     * The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     * <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * </p>
     * 
     * @param eventTypeCode
     *        The unique identifier for the event type. The format is <code>AWS_SERVICE_DESCRIPTION</code>. For example,
     *        <code>AWS_EC2_SYSTEM_MAINTENANCE_EVENT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEvent withEventTypeCode(String eventTypeCode) {
        setEventTypeCode(eventTypeCode);
        return this;
    }

    /**
     * <p>
     * The category of the event type.
     * </p>
     * 
     * @param eventTypeCategory
     *        The category of the event type.
     * @see EventTypeCategory
     */

    public void setEventTypeCategory(String eventTypeCategory) {
        this.eventTypeCategory = eventTypeCategory;
    }

    /**
     * <p>
     * The category of the event type.
     * </p>
     * 
     * @return The category of the event type.
     * @see EventTypeCategory
     */

    public String getEventTypeCategory() {
        return this.eventTypeCategory;
    }

    /**
     * <p>
     * The category of the event type.
     * </p>
     * 
     * @param eventTypeCategory
     *        The category of the event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public OrganizationEvent withEventTypeCategory(String eventTypeCategory) {
        setEventTypeCategory(eventTypeCategory);
        return this;
    }

    /**
     * <p>
     * The category of the event type.
     * </p>
     * 
     * @param eventTypeCategory
     *        The category of the event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public OrganizationEvent withEventTypeCategory(EventTypeCategory eventTypeCategory) {
        this.eventTypeCategory = eventTypeCategory.toString();
        return this;
    }

    /**
     * <p>
     * The AWS Region name of the event.
     * </p>
     * 
     * @param region
     *        The AWS Region name of the event.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region name of the event.
     * </p>
     * 
     * @return The AWS Region name of the event.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region name of the event.
     * </p>
     * 
     * @param region
     *        The AWS Region name of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEvent withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The date and time that the event began.
     * </p>
     * 
     * @param startTime
     *        The date and time that the event began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time that the event began.
     * </p>
     * 
     * @return The date and time that the event began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time that the event began.
     * </p>
     * 
     * @param startTime
     *        The date and time that the event began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEvent withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     * 
     * @param endTime
     *        The date and time that the event ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     * 
     * @return The date and time that the event ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time that the event ended.
     * </p>
     * 
     * @param endTime
     *        The date and time that the event ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEvent withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The most recent date and time that the event was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The most recent date and time that the event was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The most recent date and time that the event was updated.
     * </p>
     * 
     * @return The most recent date and time that the event was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The most recent date and time that the event was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The most recent date and time that the event was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEvent withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The most recent status of the event. Possible values are <code>open</code>, <code>closed</code>, and
     * <code>upcoming</code>.
     * </p>
     * 
     * @param statusCode
     *        The most recent status of the event. Possible values are <code>open</code>, <code>closed</code>, and
     *        <code>upcoming</code>.
     * @see EventStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The most recent status of the event. Possible values are <code>open</code>, <code>closed</code>, and
     * <code>upcoming</code>.
     * </p>
     * 
     * @return The most recent status of the event. Possible values are <code>open</code>, <code>closed</code>, and
     *         <code>upcoming</code>.
     * @see EventStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The most recent status of the event. Possible values are <code>open</code>, <code>closed</code>, and
     * <code>upcoming</code>.
     * </p>
     * 
     * @param statusCode
     *        The most recent status of the event. Possible values are <code>open</code>, <code>closed</code>, and
     *        <code>upcoming</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStatusCode
     */

    public OrganizationEvent withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The most recent status of the event. Possible values are <code>open</code>, <code>closed</code>, and
     * <code>upcoming</code>.
     * </p>
     * 
     * @param statusCode
     *        The most recent status of the event. Possible values are <code>open</code>, <code>closed</code>, and
     *        <code>upcoming</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStatusCode
     */

    public OrganizationEvent withStatusCode(EventStatusCode statusCode) {
        this.statusCode = statusCode.toString();
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getEventTypeCode() != null)
            sb.append("EventTypeCode: ").append(getEventTypeCode()).append(",");
        if (getEventTypeCategory() != null)
            sb.append("EventTypeCategory: ").append(getEventTypeCategory()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationEvent == false)
            return false;
        OrganizationEvent other = (OrganizationEvent) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getEventTypeCode() == null ^ this.getEventTypeCode() == null)
            return false;
        if (other.getEventTypeCode() != null && other.getEventTypeCode().equals(this.getEventTypeCode()) == false)
            return false;
        if (other.getEventTypeCategory() == null ^ this.getEventTypeCategory() == null)
            return false;
        if (other.getEventTypeCategory() != null && other.getEventTypeCategory().equals(this.getEventTypeCategory()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getEventTypeCode() == null) ? 0 : getEventTypeCode().hashCode());
        hashCode = prime * hashCode + ((getEventTypeCategory() == null) ? 0 : getEventTypeCategory().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationEvent clone() {
        try {
            return (OrganizationEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.OrganizationEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
