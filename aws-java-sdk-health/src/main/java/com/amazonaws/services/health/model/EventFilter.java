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
 * The values to use to filter results from the <a>DescribeEvents</a> and <a>DescribeEventAggregates</a> operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/EventFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     */
    private java.util.List<String> eventArns;
    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED"</code>
     * </p>
     */
    private java.util.List<String> eventTypeCodes;
    /**
     * <p>
     * The AWS services associated with the event. For example, <code>EC2</code>, <code>RDS</code>.
     * </p>
     */
    private java.util.List<String> services;
    /**
     * <p>
     * A list of AWS regions.
     * </p>
     */
    private java.util.List<String> regions;
    /**
     * <p>
     * A list of AWS availability zones.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * A list of dates and times that the event began.
     * </p>
     */
    private java.util.List<DateTimeRange> startTimes;
    /**
     * <p>
     * A list of dates and times that the event ended.
     * </p>
     */
    private java.util.List<DateTimeRange> endTimes;
    /**
     * <p>
     * A list of dates and times that the event was last updated.
     * </p>
     */
    private java.util.List<DateTimeRange> lastUpdatedTimes;
    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     */
    private java.util.List<String> entityArns;
    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (<code>i-34ab692e</code>) or EBS volumes (
     * <code>vol-426ab23e</code>).
     * </p>
     */
    private java.util.List<String> entityValues;
    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     */
    private java.util.List<String> eventTypeCategories;
    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     */
    private java.util.List<java.util.Map<String, String>> tags;
    /**
     * <p>
     * A list of event status codes.
     * </p>
     */
    private java.util.List<String> eventStatusCodes;

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * 
     * @return A list of event ARNs (unique identifiers). For example:
     *         <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     */

    public java.util.List<String> getEventArns() {
        return eventArns;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * 
     * @param eventArns
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     */

    public void setEventArns(java.util.Collection<String> eventArns) {
        if (eventArns == null) {
            this.eventArns = null;
            return;
        }

        this.eventArns = new java.util.ArrayList<String>(eventArns);
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventArns(java.util.Collection)} or {@link #withEventArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventArns
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withEventArns(String... eventArns) {
        if (this.eventArns == null) {
            setEventArns(new java.util.ArrayList<String>(eventArns.length));
        }
        for (String ele : eventArns) {
            this.eventArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event ARNs (unique identifiers). For example:
     * <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * </p>
     * 
     * @param eventArns
     *        A list of event ARNs (unique identifiers). For example:
     *        <code>"arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withEventArns(java.util.Collection<String> eventArns) {
        setEventArns(eventArns);
        return this;
    }

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED"</code>
     * </p>
     * 
     * @return A list of unique identifiers for event types. For example,
     *         <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED"</code>
     */

    public java.util.List<String> getEventTypeCodes() {
        return eventTypeCodes;
    }

    /**
     * <p>
     * A list of unique identifiers for event types. For example,
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED"</code>
     * </p>
     * 
     * @param eventTypeCodes
     *        A list of unique identifiers for event types. For example,
     *        <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED"</code>
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
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED"</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypeCodes(java.util.Collection)} or {@link #withEventTypeCodes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventTypeCodes
     *        A list of unique identifiers for event types. For example,
     *        <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withEventTypeCodes(String... eventTypeCodes) {
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
     * <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED"</code>
     * </p>
     * 
     * @param eventTypeCodes
     *        A list of unique identifiers for event types. For example,
     *        <code>"AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withEventTypeCodes(java.util.Collection<String> eventTypeCodes) {
        setEventTypeCodes(eventTypeCodes);
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

    public EventFilter withServices(String... services) {
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

    public EventFilter withServices(java.util.Collection<String> services) {
        setServices(services);
        return this;
    }

    /**
     * <p>
     * A list of AWS regions.
     * </p>
     * 
     * @return A list of AWS regions.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * A list of AWS regions.
     * </p>
     * 
     * @param regions
     *        A list of AWS regions.
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
     * A list of AWS regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        A list of AWS regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withRegions(String... regions) {
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
     * A list of AWS regions.
     * </p>
     * 
     * @param regions
     *        A list of AWS regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * A list of AWS availability zones.
     * </p>
     * 
     * @return A list of AWS availability zones.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * A list of AWS availability zones.
     * </p>
     * 
     * @param availabilityZones
     *        A list of AWS availability zones.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * A list of AWS availability zones.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of AWS availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS availability zones.
     * </p>
     * 
     * @param availabilityZones
     *        A list of AWS availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event began.
     * </p>
     * 
     * @return A list of dates and times that the event began.
     */

    public java.util.List<DateTimeRange> getStartTimes() {
        return startTimes;
    }

    /**
     * <p>
     * A list of dates and times that the event began.
     * </p>
     * 
     * @param startTimes
     *        A list of dates and times that the event began.
     */

    public void setStartTimes(java.util.Collection<DateTimeRange> startTimes) {
        if (startTimes == null) {
            this.startTimes = null;
            return;
        }

        this.startTimes = new java.util.ArrayList<DateTimeRange>(startTimes);
    }

    /**
     * <p>
     * A list of dates and times that the event began.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStartTimes(java.util.Collection)} or {@link #withStartTimes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param startTimes
     *        A list of dates and times that the event began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withStartTimes(DateTimeRange... startTimes) {
        if (this.startTimes == null) {
            setStartTimes(new java.util.ArrayList<DateTimeRange>(startTimes.length));
        }
        for (DateTimeRange ele : startTimes) {
            this.startTimes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event began.
     * </p>
     * 
     * @param startTimes
     *        A list of dates and times that the event began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withStartTimes(java.util.Collection<DateTimeRange> startTimes) {
        setStartTimes(startTimes);
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event ended.
     * </p>
     * 
     * @return A list of dates and times that the event ended.
     */

    public java.util.List<DateTimeRange> getEndTimes() {
        return endTimes;
    }

    /**
     * <p>
     * A list of dates and times that the event ended.
     * </p>
     * 
     * @param endTimes
     *        A list of dates and times that the event ended.
     */

    public void setEndTimes(java.util.Collection<DateTimeRange> endTimes) {
        if (endTimes == null) {
            this.endTimes = null;
            return;
        }

        this.endTimes = new java.util.ArrayList<DateTimeRange>(endTimes);
    }

    /**
     * <p>
     * A list of dates and times that the event ended.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndTimes(java.util.Collection)} or {@link #withEndTimes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param endTimes
     *        A list of dates and times that the event ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withEndTimes(DateTimeRange... endTimes) {
        if (this.endTimes == null) {
            setEndTimes(new java.util.ArrayList<DateTimeRange>(endTimes.length));
        }
        for (DateTimeRange ele : endTimes) {
            this.endTimes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event ended.
     * </p>
     * 
     * @param endTimes
     *        A list of dates and times that the event ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withEndTimes(java.util.Collection<DateTimeRange> endTimes) {
        setEndTimes(endTimes);
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event was last updated.
     * </p>
     * 
     * @return A list of dates and times that the event was last updated.
     */

    public java.util.List<DateTimeRange> getLastUpdatedTimes() {
        return lastUpdatedTimes;
    }

    /**
     * <p>
     * A list of dates and times that the event was last updated.
     * </p>
     * 
     * @param lastUpdatedTimes
     *        A list of dates and times that the event was last updated.
     */

    public void setLastUpdatedTimes(java.util.Collection<DateTimeRange> lastUpdatedTimes) {
        if (lastUpdatedTimes == null) {
            this.lastUpdatedTimes = null;
            return;
        }

        this.lastUpdatedTimes = new java.util.ArrayList<DateTimeRange>(lastUpdatedTimes);
    }

    /**
     * <p>
     * A list of dates and times that the event was last updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLastUpdatedTimes(java.util.Collection)} or {@link #withLastUpdatedTimes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lastUpdatedTimes
     *        A list of dates and times that the event was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withLastUpdatedTimes(DateTimeRange... lastUpdatedTimes) {
        if (this.lastUpdatedTimes == null) {
            setLastUpdatedTimes(new java.util.ArrayList<DateTimeRange>(lastUpdatedTimes.length));
        }
        for (DateTimeRange ele : lastUpdatedTimes) {
            this.lastUpdatedTimes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of dates and times that the event was last updated.
     * </p>
     * 
     * @param lastUpdatedTimes
     *        A list of dates and times that the event was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withLastUpdatedTimes(java.util.Collection<DateTimeRange> lastUpdatedTimes) {
        setLastUpdatedTimes(lastUpdatedTimes);
        return this;
    }

    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     * 
     * @return A list of entity ARNs (unique identifiers).
     */

    public java.util.List<String> getEntityArns() {
        return entityArns;
    }

    /**
     * <p>
     * A list of entity ARNs (unique identifiers).
     * </p>
     * 
     * @param entityArns
     *        A list of entity ARNs (unique identifiers).
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
     * A list of entity ARNs (unique identifiers).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityArns(java.util.Collection)} or {@link #withEntityArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityArns
     *        A list of entity ARNs (unique identifiers).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withEntityArns(String... entityArns) {
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
     * A list of entity ARNs (unique identifiers).
     * </p>
     * 
     * @param entityArns
     *        A list of entity ARNs (unique identifiers).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withEntityArns(java.util.Collection<String> entityArns) {
        setEntityArns(entityArns);
        return this;
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (<code>i-34ab692e</code>) or EBS volumes (
     * <code>vol-426ab23e</code>).
     * </p>
     * 
     * @return A list of entity identifiers, such as EC2 instance IDs (<code>i-34ab692e</code>) or EBS volumes (
     *         <code>vol-426ab23e</code>).
     */

    public java.util.List<String> getEntityValues() {
        return entityValues;
    }

    /**
     * <p>
     * A list of entity identifiers, such as EC2 instance IDs (<code>i-34ab692e</code>) or EBS volumes (
     * <code>vol-426ab23e</code>).
     * </p>
     * 
     * @param entityValues
     *        A list of entity identifiers, such as EC2 instance IDs (<code>i-34ab692e</code>) or EBS volumes (
     *        <code>vol-426ab23e</code>).
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
     * A list of entity identifiers, such as EC2 instance IDs (<code>i-34ab692e</code>) or EBS volumes (
     * <code>vol-426ab23e</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityValues(java.util.Collection)} or {@link #withEntityValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param entityValues
     *        A list of entity identifiers, such as EC2 instance IDs (<code>i-34ab692e</code>) or EBS volumes (
     *        <code>vol-426ab23e</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withEntityValues(String... entityValues) {
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
     * A list of entity identifiers, such as EC2 instance IDs (<code>i-34ab692e</code>) or EBS volumes (
     * <code>vol-426ab23e</code>).
     * </p>
     * 
     * @param entityValues
     *        A list of entity identifiers, such as EC2 instance IDs (<code>i-34ab692e</code>) or EBS volumes (
     *        <code>vol-426ab23e</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withEntityValues(java.util.Collection<String> entityValues) {
        setEntityValues(entityValues);
        return this;
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

    public java.util.List<String> getEventTypeCategories() {
        return eventTypeCategories;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @param eventTypeCategories
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
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
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypeCategories(java.util.Collection)} or {@link #withEventTypeCategories(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param eventTypeCategories
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public EventFilter withEventTypeCategories(String... eventTypeCategories) {
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
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @param eventTypeCategories
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public EventFilter withEventTypeCategories(java.util.Collection<String> eventTypeCategories) {
        setEventTypeCategories(eventTypeCategories);
        return this;
    }

    /**
     * <p>
     * A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     * <code>accountNotification</code>).
     * </p>
     * 
     * @param eventTypeCategories
     *        A list of event type category codes (<code>issue</code>, <code>scheduledChange</code>, or
     *        <code>accountNotification</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventTypeCategory
     */

    public EventFilter withEventTypeCategories(EventTypeCategory... eventTypeCategories) {
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
     * A map of entity tags attached to the affected entity.
     * </p>
     * 
     * @return A map of entity tags attached to the affected entity.
     */

    public java.util.List<java.util.Map<String, String>> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * 
     * @param tags
     *        A map of entity tags attached to the affected entity.
     */

    public void setTags(java.util.Collection<java.util.Map<String, String>> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<java.util.Map<String, String>>(tags);
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A map of entity tags attached to the affected entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withTags(java.util.Map<String, String>... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<java.util.Map<String, String>>(tags.length));
        }
        for (java.util.Map<String, String> ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A map of entity tags attached to the affected entity.
     * </p>
     * 
     * @param tags
     *        A map of entity tags attached to the affected entity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withTags(java.util.Collection<java.util.Map<String, String>> tags) {
        setTags(tags);
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

    public EventFilter withEventStatusCodes(String... eventStatusCodes) {
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

    public EventFilter withEventStatusCodes(java.util.Collection<String> eventStatusCodes) {
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

    public EventFilter withEventStatusCodes(EventStatusCode... eventStatusCodes) {
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
        if (getEventArns() != null)
            sb.append("EventArns: ").append(getEventArns()).append(",");
        if (getEventTypeCodes() != null)
            sb.append("EventTypeCodes: ").append(getEventTypeCodes()).append(",");
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getStartTimes() != null)
            sb.append("StartTimes: ").append(getStartTimes()).append(",");
        if (getEndTimes() != null)
            sb.append("EndTimes: ").append(getEndTimes()).append(",");
        if (getLastUpdatedTimes() != null)
            sb.append("LastUpdatedTimes: ").append(getLastUpdatedTimes()).append(",");
        if (getEntityArns() != null)
            sb.append("EntityArns: ").append(getEntityArns()).append(",");
        if (getEntityValues() != null)
            sb.append("EntityValues: ").append(getEntityValues()).append(",");
        if (getEventTypeCategories() != null)
            sb.append("EventTypeCategories: ").append(getEventTypeCategories()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof EventFilter == false)
            return false;
        EventFilter other = (EventFilter) obj;
        if (other.getEventArns() == null ^ this.getEventArns() == null)
            return false;
        if (other.getEventArns() != null && other.getEventArns().equals(this.getEventArns()) == false)
            return false;
        if (other.getEventTypeCodes() == null ^ this.getEventTypeCodes() == null)
            return false;
        if (other.getEventTypeCodes() != null && other.getEventTypeCodes().equals(this.getEventTypeCodes()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getStartTimes() == null ^ this.getStartTimes() == null)
            return false;
        if (other.getStartTimes() != null && other.getStartTimes().equals(this.getStartTimes()) == false)
            return false;
        if (other.getEndTimes() == null ^ this.getEndTimes() == null)
            return false;
        if (other.getEndTimes() != null && other.getEndTimes().equals(this.getEndTimes()) == false)
            return false;
        if (other.getLastUpdatedTimes() == null ^ this.getLastUpdatedTimes() == null)
            return false;
        if (other.getLastUpdatedTimes() != null && other.getLastUpdatedTimes().equals(this.getLastUpdatedTimes()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getEventArns() == null) ? 0 : getEventArns().hashCode());
        hashCode = prime * hashCode + ((getEventTypeCodes() == null) ? 0 : getEventTypeCodes().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getStartTimes() == null) ? 0 : getStartTimes().hashCode());
        hashCode = prime * hashCode + ((getEndTimes() == null) ? 0 : getEndTimes().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimes() == null) ? 0 : getLastUpdatedTimes().hashCode());
        hashCode = prime * hashCode + ((getEntityArns() == null) ? 0 : getEntityArns().hashCode());
        hashCode = prime * hashCode + ((getEntityValues() == null) ? 0 : getEntityValues().hashCode());
        hashCode = prime * hashCode + ((getEventTypeCategories() == null) ? 0 : getEventTypeCategories().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEventStatusCodes() == null) ? 0 : getEventStatusCodes().hashCode());
        return hashCode;
    }

    @Override
    public EventFilter clone() {
        try {
            return (EventFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.health.model.transform.EventFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
