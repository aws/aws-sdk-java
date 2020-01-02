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
 * The values to filter results from the <a>DescribeEventsForOrganization</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/OrganizationEventFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationEventFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     */
    private java.util.List<String> eventTypeCodes;
    /**
     * <p>
     * A list of 12-digit AWS account numbers that contains the affected entities.
     * </p>
     */
    private java.util.List<String> awsAccountIds;
    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     */
    private java.util.List<String> services;
    /**
     * <p>
     * A list of AWS Regions.
     * </p>
     */
    private java.util.List<String> regions;

    private DateTimeRange startTime;

    private DateTimeRange endTime;

    private DateTimeRange lastUpdatedTime;
    /**
     * <p>
     * REPLACEME
     * </p>
     */
    private java.util.List<String> entityArns;
    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
     * </p>
     */
    private java.util.List<String> entityValues;
    /**
     * <p>
     * REPLACEME
     * </p>
     */
    private java.util.List<String> eventTypeCategories;
    /**
     * <p>
     * A list of event status codes.
     * </p>
     */
    private java.util.List<String> eventStatusCodes;

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     * 
     * @return A list of unique identifiers for event types. For example,
     *         <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     */

    public java.util.List<String> getEventTypeCodes() {
        return eventTypeCodes;
    }

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     * 
     * @param eventTypeCodes
     *        A list of unique identifiers for event types. For example,
     *        <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     */

    public void setEventTypeCodes(java.util.Collection<String> eventTypeCodes) {
        if (eventTypeCodes == null) {
            this.eventTypeCodes = null;
            return;
        }

        this.eventTypeCodes = new java.util.ArrayList<String>(eventTypeCodes);
    }

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypeCodes(java.util.Collection)} or {@link #withEventTypeCodes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventTypeCodes
     *        A list of unique identifiers for event types. For example,
     *        <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withEventTypeCodes(String... eventTypeCodes) {
        if (this.eventTypeCodes == null) {
            setEventTypeCodes(new java.util.ArrayList<String>(eventTypeCodes.length));
        }
        for (String ele : eventTypeCodes) {
            this.eventTypeCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * </p>
     * 
     * @param eventTypeCodes
     *        A list of unique identifiers for event types. For example,
     *        <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED".</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withEventTypeCodes(java.util.Collection<String> eventTypeCodes) {
        setEventTypeCodes(eventTypeCodes);
        return this;
    }

    /**
     * <p>
     * A list of 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * 
     * @return A list of 12-digit AWS account numbers that contains the affected entities.
     */

    public java.util.List<String> getAwsAccountIds() {
        return awsAccountIds;
    }

    /**
     * <p>
     * A list of 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * 
     * @param awsAccountIds
     *        A list of 12-digit AWS account numbers that contains the affected entities.
     */

    public void setAwsAccountIds(java.util.Collection<String> awsAccountIds) {
        if (awsAccountIds == null) {
            this.awsAccountIds = null;
            return;
        }

        this.awsAccountIds = new java.util.ArrayList<String>(awsAccountIds);
    }

    /**
     * <p>
     * A list of 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsAccountIds(java.util.Collection)} or {@link #withAwsAccountIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param awsAccountIds
     *        A list of 12-digit AWS account numbers that contains the affected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withAwsAccountIds(String... awsAccountIds) {
        if (this.awsAccountIds == null) {
            setAwsAccountIds(new java.util.ArrayList<String>(awsAccountIds.length));
        }
        for (String ele : awsAccountIds) {
            this.awsAccountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of 12-digit AWS account numbers that contains the affected entities.
     * </p>
     * 
     * @param awsAccountIds
     *        A list of 12-digit AWS account numbers that contains the affected entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withAwsAccountIds(java.util.Collection<String> awsAccountIds) {
        setAwsAccountIds(awsAccountIds);
        return this;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * 
     * @return The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     */

    public java.util.List<String> getServices() {
        return services;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * 
     * @param services
     *        The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     */

    public void setServices(java.util.Collection<String> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<String>(services);
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withServices(String... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<String>(services.length));
        }
        for (String ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     * 
     * @param services
     *        The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withServices(java.util.Collection<String> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * A list of AWS Regions.
     * </p>
     * 
     * @return A list of AWS Regions.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * A list of AWS Regions.
     * </p>
     * 
     * @param regions
     *        A list of AWS Regions.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * A list of AWS Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        A list of AWS Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS Regions.
     * </p>
     * 
     * @param regions
     *        A list of AWS Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * @param startTime
     */

    public void setStartTime(DateTimeRange startTime) {
        this.startTime = startTime;
    }

    /**
     * @return
     */

    public DateTimeRange getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withStartTime(DateTimeRange startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * @param endTime
     */

    public void setEndTime(DateTimeRange endTime) {
        this.endTime = endTime;
    }

    /**
     * @return
     */

    public DateTimeRange getEndTime() {
        return this.endTime;
    }

    /**
     * @param endTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withEndTime(DateTimeRange endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * @param lastUpdatedTime
     */

    public void setLastUpdatedTime(DateTimeRange lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * @return
     */

    public DateTimeRange getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * @param lastUpdatedTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withLastUpdatedTime(DateTimeRange lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * 
     * @return REPLACEME
     */

    public java.util.List<String> getEntityArns() {
        return entityArns;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * 
     * @param entityArns
     *        REPLACEME
     */

    public void setEntityArns(java.util.Collection<String> entityArns) {
        if (entityArns == null) {
            this.entityArns = null;
            return;
        }

        this.entityArns = new java.util.ArrayList<String>(entityArns);
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityArns(java.util.Collection)} or {@link #withEntityArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityArns
     *        REPLACEME
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withEntityArns(String... entityArns) {
        if (this.entityArns == null) {
            setEntityArns(new java.util.ArrayList<String>(entityArns.length));
        }
        for (String ele : entityArns) {
            this.entityArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * 
     * @param entityArns
     *        REPLACEME
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withEntityArns(java.util.Collection<String> entityArns) {
        setEntityArns(entityArns);
        return this;
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
     * </p>
     * 
     * @return A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
     */

    public java.util.List<String> getEntityValues() {
        return entityValues;
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
     * </p>
     * 
     * @param entityValues
     *        A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
     */

    public void setEntityValues(java.util.Collection<String> entityValues) {
        if (entityValues == null) {
            this.entityValues = null;
            return;
        }

        this.entityValues = new java.util.ArrayList<String>(entityValues);
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityValues(java.util.Collection)} or {@link #withEntityValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityValues
     *        A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withEntityValues(String... entityValues) {
        if (this.entityValues == null) {
            setEntityValues(new java.util.ArrayList<String>(entityValues.length));
        }
        for (String ele : entityValues) {
            this.entityValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
     * </p>
     * 
     * @param entityValues
     *        A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationEventFilter withEntityValues(java.util.Collection<String> entityValues) {
        setEntityValues(entityValues);
        return this;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * 
     * @return REPLACEME
     * @see EventTypeCategory
     */

    public java.util.List<String> getEventTypeCategories() {
        return eventTypeCategories;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * 
     * @param eventTypeCategories
     *        REPLACEME
     * @see EventTypeCategory
     */

    public void setEventTypeCategories(java.util.Collection<String> eventTypeCategories) {
        if (eventTypeCategories == null) {
            this.eventTypeCategories = null;
            return;
        }

        this.eventTypeCategories = new java.util.ArrayList<String>(eventTypeCategories);
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypeCategories(java.util.Collection)} or {@link #withEventTypeCategories(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param eventTypeCategories
     *        REPLACEME
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public OrganizationEventFilter withEventTypeCategories(String... eventTypeCategories) {
        if (this.eventTypeCategories == null) {
            setEventTypeCategories(new java.util.ArrayList<String>(eventTypeCategories.length));
        }
        for (String ele : eventTypeCategories) {
            this.eventTypeCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * 
     * @param eventTypeCategories
     *        REPLACEME
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public OrganizationEventFilter withEventTypeCategories(java.util.Collection<String> eventTypeCategories) {
        setEventTypeCategories(eventTypeCategories);
        return this;
    }

    /**
     * <p>
     * REPLACEME
     * </p>
     * 
     * @param eventTypeCategories
     *        REPLACEME
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public OrganizationEventFilter withEventTypeCategories(EventTypeCategory... eventTypeCategories) {
        java.util.ArrayList<String> eventTypeCategoriesCopy = new java.util.ArrayList<String>(eventTypeCategories.length);
        for (EventTypeCategory value : eventTypeCategories) {
            eventTypeCategoriesCopy.add(value.toString());
        }
        if (getEventTypeCategories() == null) {
            setEventTypeCategories(eventTypeCategoriesCopy);
        } else {
            getEventTypeCategories().addAll(eventTypeCategoriesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of event status codes.
     * </p>
     * 
     * @return A list of event status codes.
     * @see EventStatusCode
     */

    public java.util.List<String> getEventStatusCodes() {
        return eventStatusCodes;
    }

    /**
     * <p>
     * A list of event status codes.
     * </p>
     * 
     * @param eventStatusCodes
     *        A list of event status codes.
     * @see EventStatusCode
     */

    public void setEventStatusCodes(java.util.Collection<String> eventStatusCodes) {
        if (eventStatusCodes == null) {
            this.eventStatusCodes = null;
            return;
        }

        this.eventStatusCodes = new java.util.ArrayList<String>(eventStatusCodes);
    }

    /**
     * <p>
     * A list of event status codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventStatusCodes(java.util.Collection)} or {@link #withEventStatusCodes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventStatusCodes
     *        A list of event status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStatusCode
     */

    public OrganizationEventFilter withEventStatusCodes(String... eventStatusCodes) {
        if (this.eventStatusCodes == null) {
            setEventStatusCodes(new java.util.ArrayList<String>(eventStatusCodes.length));
        }
        for (String ele : eventStatusCodes) {
            this.eventStatusCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event status codes.
     * </p>
     * 
     * @param eventStatusCodes
     *        A list of event status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStatusCode
     */

    public OrganizationEventFilter withEventStatusCodes(java.util.Collection<String> eventStatusCodes) {
        setEventStatusCodes(eventStatusCodes);
        return this;
    }

    /**
     * <p>
     * A list of event status codes.
     * </p>
     * 
     * @param eventStatusCodes
     *        A list of event status codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStatusCode
     */

    public OrganizationEventFilter withEventStatusCodes(EventStatusCode... eventStatusCodes) {
        java.util.ArrayList<String> eventStatusCodesCopy = new java.util.ArrayList<String>(eventStatusCodes.length);
        for (EventStatusCode value : eventStatusCodes) {
            eventStatusCodesCopy.add(value.toString());
        }
        if (getEventStatusCodes() == null) {
            setEventStatusCodes(eventStatusCodesCopy);
        } else {
            getEventStatusCodes().addAll(eventStatusCodesCopy);
        }
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
        if (getEventTypeCodes() != null)
            sb.append("EventTypeCodes: ").append(getEventTypeCodes()).append(",");
        if (getAwsAccountIds() != null)
            sb.append("AwsAccountIds: ").append(getAwsAccountIds()).append(",");
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getEntityArns() != null)
            sb.append("EntityArns: ").append(getEntityArns()).append(",");
        if (getEntityValues() != null)
            sb.append("EntityValues: ").append(getEntityValues()).append(",");
        if (getEventTypeCategories() != null)
            sb.append("EventTypeCategories: ").append(getEventTypeCategories()).append(",");
        if (getEventStatusCodes() != null)
            sb.append("EventStatusCodes: ").append(getEventStatusCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationEventFilter == false)
            return false;
        OrganizationEventFilter other = (OrganizationEventFilter) obj;
        if (other.getEventTypeCodes() == null ^ this.getEventTypeCodes() == null)
            return false;
        if (other.getEventTypeCodes() != null && other.getEventTypeCodes().equals(this.getEventTypeCodes()) == false)
            return false;
        if (other.getAwsAccountIds() == null ^ this.getAwsAccountIds() == null)
            return false;
        if (other.getAwsAccountIds() != null && other.getAwsAccountIds().equals(this.getAwsAccountIds()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
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
        if (other.getEntityArns() == null ^ this.getEntityArns() == null)
            return false;
        if (other.getEntityArns() != null && other.getEntityArns().equals(this.getEntityArns()) == false)
            return false;
        if (other.getEntityValues() == null ^ this.getEntityValues() == null)
            return false;
        if (other.getEntityValues() != null && other.getEntityValues().equals(this.getEntityValues()) == false)
            return false;
        if (other.getEventTypeCategories() == null ^ this.getEventTypeCategories() == null)
            return false;
        if (other.getEventTypeCategories() != null && other.getEventTypeCategories().equals(this.getEventTypeCategories()) == false)
            return false;
        if (other.getEventStatusCodes() == null ^ this.getEventStatusCodes() == null)
            return false;
        if (other.getEventStatusCodes() != null && other.getEventStatusCodes().equals(this.getEventStatusCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventTypeCodes() == null) ? 0 : getEventTypeCodes().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountIds() == null) ? 0 : getAwsAccountIds().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getEntityArns() == null) ? 0 : getEntityArns().hashCode());
        hashCode = prime * hashCode + ((getEntityValues() == null) ? 0 : getEntityValues().hashCode());
        hashCode = prime * hashCode + ((getEventTypeCategories() == null) ? 0 : getEventTypeCategories().hashCode());
        hashCode = prime * hashCode + ((getEventStatusCodes() == null) ? 0 : getEventStatusCodes().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationEventFilter clone() {
        try {
            return (OrganizationEventFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.OrganizationEventFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
