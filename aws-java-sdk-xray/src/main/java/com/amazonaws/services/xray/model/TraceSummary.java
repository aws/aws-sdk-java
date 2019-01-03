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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata generated from the segment documents in a trace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/TraceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TraceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the request that generated the trace's segments and subsegments.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The length of time in seconds between the start time of the root segment and the end time of the last segment
     * that completed.
     * </p>
     */
    private Double duration;
    /**
     * <p>
     * The length of time in seconds between the start and end times of the root segment. If the service performs work
     * asynchronously, the response time measures the time before the response is sent to the user, while the duration
     * measures the amount of time before the last traced activity completes.
     * </p>
     */
    private Double responseTime;
    /**
     * <p>
     * One or more of the segment documents has a 500 series error.
     * </p>
     */
    private Boolean hasFault;
    /**
     * <p>
     * One or more of the segment documents has a 400 series error.
     * </p>
     */
    private Boolean hasError;
    /**
     * <p>
     * One or more of the segment documents has a 429 throttling error.
     * </p>
     */
    private Boolean hasThrottle;
    /**
     * <p>
     * One or more of the segment documents is in progress.
     * </p>
     */
    private Boolean isPartial;
    /**
     * <p>
     * Information about the HTTP request served by the trace.
     * </p>
     */
    private Http http;
    /**
     * <p>
     * Annotations from the trace's segment documents.
     * </p>
     */
    private java.util.Map<String, java.util.List<ValueWithServiceIds>> annotations;
    /**
     * <p>
     * Users from the trace's segment documents.
     * </p>
     */
    private java.util.List<TraceUser> users;
    /**
     * <p>
     * Service IDs from the trace's segment documents.
     * </p>
     */
    private java.util.List<ServiceId> serviceIds;
    /**
     * <p>
     * A list of resource ARNs for any resource corresponding to the trace segments.
     * </p>
     */
    private java.util.List<ResourceARNDetail> resourceARNs;
    /**
     * <p>
     * A list of EC2 instance IDs for any instance corresponding to the trace segments.
     * </p>
     */
    private java.util.List<InstanceIdDetail> instanceIds;
    /**
     * <p>
     * A list of availability zones for any zone corresponding to the trace segments.
     * </p>
     */
    private java.util.List<AvailabilityZoneDetail> availabilityZones;
    /**
     * <p>
     * The root of a trace.
     * </p>
     */
    private ServiceId entryPoint;
    /**
     * <p>
     * A collection of FaultRootCause structures corresponding to the the trace segments.
     * </p>
     */
    private java.util.List<FaultRootCause> faultRootCauses;
    /**
     * <p>
     * A collection of ErrorRootCause structures corresponding to the trace segments.
     * </p>
     */
    private java.util.List<ErrorRootCause> errorRootCauses;
    /**
     * <p>
     * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
     * </p>
     */
    private java.util.List<ResponseTimeRootCause> responseTimeRootCauses;
    /**
     * <p>
     * The revision number of a trace.
     * </p>
     */
    private Integer revision;

    /**
     * <p>
     * The unique identifier for the request that generated the trace's segments and subsegments.
     * </p>
     * 
     * @param id
     *        The unique identifier for the request that generated the trace's segments and subsegments.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the request that generated the trace's segments and subsegments.
     * </p>
     * 
     * @return The unique identifier for the request that generated the trace's segments and subsegments.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the request that generated the trace's segments and subsegments.
     * </p>
     * 
     * @param id
     *        The unique identifier for the request that generated the trace's segments and subsegments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The length of time in seconds between the start time of the root segment and the end time of the last segment
     * that completed.
     * </p>
     * 
     * @param duration
     *        The length of time in seconds between the start time of the root segment and the end time of the last
     *        segment that completed.
     */

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The length of time in seconds between the start time of the root segment and the end time of the last segment
     * that completed.
     * </p>
     * 
     * @return The length of time in seconds between the start time of the root segment and the end time of the last
     *         segment that completed.
     */

    public Double getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The length of time in seconds between the start time of the root segment and the end time of the last segment
     * that completed.
     * </p>
     * 
     * @param duration
     *        The length of time in seconds between the start time of the root segment and the end time of the last
     *        segment that completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withDuration(Double duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The length of time in seconds between the start and end times of the root segment. If the service performs work
     * asynchronously, the response time measures the time before the response is sent to the user, while the duration
     * measures the amount of time before the last traced activity completes.
     * </p>
     * 
     * @param responseTime
     *        The length of time in seconds between the start and end times of the root segment. If the service performs
     *        work asynchronously, the response time measures the time before the response is sent to the user, while
     *        the duration measures the amount of time before the last traced activity completes.
     */

    public void setResponseTime(Double responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * <p>
     * The length of time in seconds between the start and end times of the root segment. If the service performs work
     * asynchronously, the response time measures the time before the response is sent to the user, while the duration
     * measures the amount of time before the last traced activity completes.
     * </p>
     * 
     * @return The length of time in seconds between the start and end times of the root segment. If the service
     *         performs work asynchronously, the response time measures the time before the response is sent to the
     *         user, while the duration measures the amount of time before the last traced activity completes.
     */

    public Double getResponseTime() {
        return this.responseTime;
    }

    /**
     * <p>
     * The length of time in seconds between the start and end times of the root segment. If the service performs work
     * asynchronously, the response time measures the time before the response is sent to the user, while the duration
     * measures the amount of time before the last traced activity completes.
     * </p>
     * 
     * @param responseTime
     *        The length of time in seconds between the start and end times of the root segment. If the service performs
     *        work asynchronously, the response time measures the time before the response is sent to the user, while
     *        the duration measures the amount of time before the last traced activity completes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withResponseTime(Double responseTime) {
        setResponseTime(responseTime);
        return this;
    }

    /**
     * <p>
     * One or more of the segment documents has a 500 series error.
     * </p>
     * 
     * @param hasFault
     *        One or more of the segment documents has a 500 series error.
     */

    public void setHasFault(Boolean hasFault) {
        this.hasFault = hasFault;
    }

    /**
     * <p>
     * One or more of the segment documents has a 500 series error.
     * </p>
     * 
     * @return One or more of the segment documents has a 500 series error.
     */

    public Boolean getHasFault() {
        return this.hasFault;
    }

    /**
     * <p>
     * One or more of the segment documents has a 500 series error.
     * </p>
     * 
     * @param hasFault
     *        One or more of the segment documents has a 500 series error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withHasFault(Boolean hasFault) {
        setHasFault(hasFault);
        return this;
    }

    /**
     * <p>
     * One or more of the segment documents has a 500 series error.
     * </p>
     * 
     * @return One or more of the segment documents has a 500 series error.
     */

    public Boolean isHasFault() {
        return this.hasFault;
    }

    /**
     * <p>
     * One or more of the segment documents has a 400 series error.
     * </p>
     * 
     * @param hasError
     *        One or more of the segment documents has a 400 series error.
     */

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    /**
     * <p>
     * One or more of the segment documents has a 400 series error.
     * </p>
     * 
     * @return One or more of the segment documents has a 400 series error.
     */

    public Boolean getHasError() {
        return this.hasError;
    }

    /**
     * <p>
     * One or more of the segment documents has a 400 series error.
     * </p>
     * 
     * @param hasError
     *        One or more of the segment documents has a 400 series error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withHasError(Boolean hasError) {
        setHasError(hasError);
        return this;
    }

    /**
     * <p>
     * One or more of the segment documents has a 400 series error.
     * </p>
     * 
     * @return One or more of the segment documents has a 400 series error.
     */

    public Boolean isHasError() {
        return this.hasError;
    }

    /**
     * <p>
     * One or more of the segment documents has a 429 throttling error.
     * </p>
     * 
     * @param hasThrottle
     *        One or more of the segment documents has a 429 throttling error.
     */

    public void setHasThrottle(Boolean hasThrottle) {
        this.hasThrottle = hasThrottle;
    }

    /**
     * <p>
     * One or more of the segment documents has a 429 throttling error.
     * </p>
     * 
     * @return One or more of the segment documents has a 429 throttling error.
     */

    public Boolean getHasThrottle() {
        return this.hasThrottle;
    }

    /**
     * <p>
     * One or more of the segment documents has a 429 throttling error.
     * </p>
     * 
     * @param hasThrottle
     *        One or more of the segment documents has a 429 throttling error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withHasThrottle(Boolean hasThrottle) {
        setHasThrottle(hasThrottle);
        return this;
    }

    /**
     * <p>
     * One or more of the segment documents has a 429 throttling error.
     * </p>
     * 
     * @return One or more of the segment documents has a 429 throttling error.
     */

    public Boolean isHasThrottle() {
        return this.hasThrottle;
    }

    /**
     * <p>
     * One or more of the segment documents is in progress.
     * </p>
     * 
     * @param isPartial
     *        One or more of the segment documents is in progress.
     */

    public void setIsPartial(Boolean isPartial) {
        this.isPartial = isPartial;
    }

    /**
     * <p>
     * One or more of the segment documents is in progress.
     * </p>
     * 
     * @return One or more of the segment documents is in progress.
     */

    public Boolean getIsPartial() {
        return this.isPartial;
    }

    /**
     * <p>
     * One or more of the segment documents is in progress.
     * </p>
     * 
     * @param isPartial
     *        One or more of the segment documents is in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withIsPartial(Boolean isPartial) {
        setIsPartial(isPartial);
        return this;
    }

    /**
     * <p>
     * One or more of the segment documents is in progress.
     * </p>
     * 
     * @return One or more of the segment documents is in progress.
     */

    public Boolean isPartial() {
        return this.isPartial;
    }

    /**
     * <p>
     * Information about the HTTP request served by the trace.
     * </p>
     * 
     * @param http
     *        Information about the HTTP request served by the trace.
     */

    public void setHttp(Http http) {
        this.http = http;
    }

    /**
     * <p>
     * Information about the HTTP request served by the trace.
     * </p>
     * 
     * @return Information about the HTTP request served by the trace.
     */

    public Http getHttp() {
        return this.http;
    }

    /**
     * <p>
     * Information about the HTTP request served by the trace.
     * </p>
     * 
     * @param http
     *        Information about the HTTP request served by the trace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withHttp(Http http) {
        setHttp(http);
        return this;
    }

    /**
     * <p>
     * Annotations from the trace's segment documents.
     * </p>
     * 
     * @return Annotations from the trace's segment documents.
     */

    public java.util.Map<String, java.util.List<ValueWithServiceIds>> getAnnotations() {
        return annotations;
    }

    /**
     * <p>
     * Annotations from the trace's segment documents.
     * </p>
     * 
     * @param annotations
     *        Annotations from the trace's segment documents.
     */

    public void setAnnotations(java.util.Map<String, java.util.List<ValueWithServiceIds>> annotations) {
        this.annotations = annotations;
    }

    /**
     * <p>
     * Annotations from the trace's segment documents.
     * </p>
     * 
     * @param annotations
     *        Annotations from the trace's segment documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withAnnotations(java.util.Map<String, java.util.List<ValueWithServiceIds>> annotations) {
        setAnnotations(annotations);
        return this;
    }

    public TraceSummary addAnnotationsEntry(String key, java.util.List<ValueWithServiceIds> value) {
        if (null == this.annotations) {
            this.annotations = new java.util.HashMap<String, java.util.List<ValueWithServiceIds>>();
        }
        if (this.annotations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.annotations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Annotations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary clearAnnotationsEntries() {
        this.annotations = null;
        return this;
    }

    /**
     * <p>
     * Users from the trace's segment documents.
     * </p>
     * 
     * @return Users from the trace's segment documents.
     */

    public java.util.List<TraceUser> getUsers() {
        return users;
    }

    /**
     * <p>
     * Users from the trace's segment documents.
     * </p>
     * 
     * @param users
     *        Users from the trace's segment documents.
     */

    public void setUsers(java.util.Collection<TraceUser> users) {
        if (users == null) {
            this.users = null;
            return;
        }

        this.users = new java.util.ArrayList<TraceUser>(users);
    }

    /**
     * <p>
     * Users from the trace's segment documents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUsers(java.util.Collection)} or {@link #withUsers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param users
     *        Users from the trace's segment documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withUsers(TraceUser... users) {
        if (this.users == null) {
            setUsers(new java.util.ArrayList<TraceUser>(users.length));
        }
        for (TraceUser ele : users) {
            this.users.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Users from the trace's segment documents.
     * </p>
     * 
     * @param users
     *        Users from the trace's segment documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withUsers(java.util.Collection<TraceUser> users) {
        setUsers(users);
        return this;
    }

    /**
     * <p>
     * Service IDs from the trace's segment documents.
     * </p>
     * 
     * @return Service IDs from the trace's segment documents.
     */

    public java.util.List<ServiceId> getServiceIds() {
        return serviceIds;
    }

    /**
     * <p>
     * Service IDs from the trace's segment documents.
     * </p>
     * 
     * @param serviceIds
     *        Service IDs from the trace's segment documents.
     */

    public void setServiceIds(java.util.Collection<ServiceId> serviceIds) {
        if (serviceIds == null) {
            this.serviceIds = null;
            return;
        }

        this.serviceIds = new java.util.ArrayList<ServiceId>(serviceIds);
    }

    /**
     * <p>
     * Service IDs from the trace's segment documents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceIds(java.util.Collection)} or {@link #withServiceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceIds
     *        Service IDs from the trace's segment documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withServiceIds(ServiceId... serviceIds) {
        if (this.serviceIds == null) {
            setServiceIds(new java.util.ArrayList<ServiceId>(serviceIds.length));
        }
        for (ServiceId ele : serviceIds) {
            this.serviceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Service IDs from the trace's segment documents.
     * </p>
     * 
     * @param serviceIds
     *        Service IDs from the trace's segment documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withServiceIds(java.util.Collection<ServiceId> serviceIds) {
        setServiceIds(serviceIds);
        return this;
    }

    /**
     * <p>
     * A list of resource ARNs for any resource corresponding to the trace segments.
     * </p>
     * 
     * @return A list of resource ARNs for any resource corresponding to the trace segments.
     */

    public java.util.List<ResourceARNDetail> getResourceARNs() {
        return resourceARNs;
    }

    /**
     * <p>
     * A list of resource ARNs for any resource corresponding to the trace segments.
     * </p>
     * 
     * @param resourceARNs
     *        A list of resource ARNs for any resource corresponding to the trace segments.
     */

    public void setResourceARNs(java.util.Collection<ResourceARNDetail> resourceARNs) {
        if (resourceARNs == null) {
            this.resourceARNs = null;
            return;
        }

        this.resourceARNs = new java.util.ArrayList<ResourceARNDetail>(resourceARNs);
    }

    /**
     * <p>
     * A list of resource ARNs for any resource corresponding to the trace segments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceARNs(java.util.Collection)} or {@link #withResourceARNs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceARNs
     *        A list of resource ARNs for any resource corresponding to the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withResourceARNs(ResourceARNDetail... resourceARNs) {
        if (this.resourceARNs == null) {
            setResourceARNs(new java.util.ArrayList<ResourceARNDetail>(resourceARNs.length));
        }
        for (ResourceARNDetail ele : resourceARNs) {
            this.resourceARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource ARNs for any resource corresponding to the trace segments.
     * </p>
     * 
     * @param resourceARNs
     *        A list of resource ARNs for any resource corresponding to the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withResourceARNs(java.util.Collection<ResourceARNDetail> resourceARNs) {
        setResourceARNs(resourceARNs);
        return this;
    }

    /**
     * <p>
     * A list of EC2 instance IDs for any instance corresponding to the trace segments.
     * </p>
     * 
     * @return A list of EC2 instance IDs for any instance corresponding to the trace segments.
     */

    public java.util.List<InstanceIdDetail> getInstanceIds() {
        return instanceIds;
    }

    /**
     * <p>
     * A list of EC2 instance IDs for any instance corresponding to the trace segments.
     * </p>
     * 
     * @param instanceIds
     *        A list of EC2 instance IDs for any instance corresponding to the trace segments.
     */

    public void setInstanceIds(java.util.Collection<InstanceIdDetail> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new java.util.ArrayList<InstanceIdDetail>(instanceIds);
    }

    /**
     * <p>
     * A list of EC2 instance IDs for any instance corresponding to the trace segments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        A list of EC2 instance IDs for any instance corresponding to the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withInstanceIds(InstanceIdDetail... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new java.util.ArrayList<InstanceIdDetail>(instanceIds.length));
        }
        for (InstanceIdDetail ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 instance IDs for any instance corresponding to the trace segments.
     * </p>
     * 
     * @param instanceIds
     *        A list of EC2 instance IDs for any instance corresponding to the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withInstanceIds(java.util.Collection<InstanceIdDetail> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * A list of availability zones for any zone corresponding to the trace segments.
     * </p>
     * 
     * @return A list of availability zones for any zone corresponding to the trace segments.
     */

    public java.util.List<AvailabilityZoneDetail> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * A list of availability zones for any zone corresponding to the trace segments.
     * </p>
     * 
     * @param availabilityZones
     *        A list of availability zones for any zone corresponding to the trace segments.
     */

    public void setAvailabilityZones(java.util.Collection<AvailabilityZoneDetail> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZoneDetail>(availabilityZones);
    }

    /**
     * <p>
     * A list of availability zones for any zone corresponding to the trace segments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of availability zones for any zone corresponding to the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withAvailabilityZones(AvailabilityZoneDetail... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<AvailabilityZoneDetail>(availabilityZones.length));
        }
        for (AvailabilityZoneDetail ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of availability zones for any zone corresponding to the trace segments.
     * </p>
     * 
     * @param availabilityZones
     *        A list of availability zones for any zone corresponding to the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withAvailabilityZones(java.util.Collection<AvailabilityZoneDetail> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The root of a trace.
     * </p>
     * 
     * @param entryPoint
     *        The root of a trace.
     */

    public void setEntryPoint(ServiceId entryPoint) {
        this.entryPoint = entryPoint;
    }

    /**
     * <p>
     * The root of a trace.
     * </p>
     * 
     * @return The root of a trace.
     */

    public ServiceId getEntryPoint() {
        return this.entryPoint;
    }

    /**
     * <p>
     * The root of a trace.
     * </p>
     * 
     * @param entryPoint
     *        The root of a trace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withEntryPoint(ServiceId entryPoint) {
        setEntryPoint(entryPoint);
        return this;
    }

    /**
     * <p>
     * A collection of FaultRootCause structures corresponding to the the trace segments.
     * </p>
     * 
     * @return A collection of FaultRootCause structures corresponding to the the trace segments.
     */

    public java.util.List<FaultRootCause> getFaultRootCauses() {
        return faultRootCauses;
    }

    /**
     * <p>
     * A collection of FaultRootCause structures corresponding to the the trace segments.
     * </p>
     * 
     * @param faultRootCauses
     *        A collection of FaultRootCause structures corresponding to the the trace segments.
     */

    public void setFaultRootCauses(java.util.Collection<FaultRootCause> faultRootCauses) {
        if (faultRootCauses == null) {
            this.faultRootCauses = null;
            return;
        }

        this.faultRootCauses = new java.util.ArrayList<FaultRootCause>(faultRootCauses);
    }

    /**
     * <p>
     * A collection of FaultRootCause structures corresponding to the the trace segments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFaultRootCauses(java.util.Collection)} or {@link #withFaultRootCauses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param faultRootCauses
     *        A collection of FaultRootCause structures corresponding to the the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withFaultRootCauses(FaultRootCause... faultRootCauses) {
        if (this.faultRootCauses == null) {
            setFaultRootCauses(new java.util.ArrayList<FaultRootCause>(faultRootCauses.length));
        }
        for (FaultRootCause ele : faultRootCauses) {
            this.faultRootCauses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of FaultRootCause structures corresponding to the the trace segments.
     * </p>
     * 
     * @param faultRootCauses
     *        A collection of FaultRootCause structures corresponding to the the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withFaultRootCauses(java.util.Collection<FaultRootCause> faultRootCauses) {
        setFaultRootCauses(faultRootCauses);
        return this;
    }

    /**
     * <p>
     * A collection of ErrorRootCause structures corresponding to the trace segments.
     * </p>
     * 
     * @return A collection of ErrorRootCause structures corresponding to the trace segments.
     */

    public java.util.List<ErrorRootCause> getErrorRootCauses() {
        return errorRootCauses;
    }

    /**
     * <p>
     * A collection of ErrorRootCause structures corresponding to the trace segments.
     * </p>
     * 
     * @param errorRootCauses
     *        A collection of ErrorRootCause structures corresponding to the trace segments.
     */

    public void setErrorRootCauses(java.util.Collection<ErrorRootCause> errorRootCauses) {
        if (errorRootCauses == null) {
            this.errorRootCauses = null;
            return;
        }

        this.errorRootCauses = new java.util.ArrayList<ErrorRootCause>(errorRootCauses);
    }

    /**
     * <p>
     * A collection of ErrorRootCause structures corresponding to the trace segments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrorRootCauses(java.util.Collection)} or {@link #withErrorRootCauses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param errorRootCauses
     *        A collection of ErrorRootCause structures corresponding to the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withErrorRootCauses(ErrorRootCause... errorRootCauses) {
        if (this.errorRootCauses == null) {
            setErrorRootCauses(new java.util.ArrayList<ErrorRootCause>(errorRootCauses.length));
        }
        for (ErrorRootCause ele : errorRootCauses) {
            this.errorRootCauses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of ErrorRootCause structures corresponding to the trace segments.
     * </p>
     * 
     * @param errorRootCauses
     *        A collection of ErrorRootCause structures corresponding to the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withErrorRootCauses(java.util.Collection<ErrorRootCause> errorRootCauses) {
        setErrorRootCauses(errorRootCauses);
        return this;
    }

    /**
     * <p>
     * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
     * </p>
     * 
     * @return A collection of ResponseTimeRootCause structures corresponding to the trace segments.
     */

    public java.util.List<ResponseTimeRootCause> getResponseTimeRootCauses() {
        return responseTimeRootCauses;
    }

    /**
     * <p>
     * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
     * </p>
     * 
     * @param responseTimeRootCauses
     *        A collection of ResponseTimeRootCause structures corresponding to the trace segments.
     */

    public void setResponseTimeRootCauses(java.util.Collection<ResponseTimeRootCause> responseTimeRootCauses) {
        if (responseTimeRootCauses == null) {
            this.responseTimeRootCauses = null;
            return;
        }

        this.responseTimeRootCauses = new java.util.ArrayList<ResponseTimeRootCause>(responseTimeRootCauses);
    }

    /**
     * <p>
     * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResponseTimeRootCauses(java.util.Collection)} or
     * {@link #withResponseTimeRootCauses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param responseTimeRootCauses
     *        A collection of ResponseTimeRootCause structures corresponding to the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withResponseTimeRootCauses(ResponseTimeRootCause... responseTimeRootCauses) {
        if (this.responseTimeRootCauses == null) {
            setResponseTimeRootCauses(new java.util.ArrayList<ResponseTimeRootCause>(responseTimeRootCauses.length));
        }
        for (ResponseTimeRootCause ele : responseTimeRootCauses) {
            this.responseTimeRootCauses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
     * </p>
     * 
     * @param responseTimeRootCauses
     *        A collection of ResponseTimeRootCause structures corresponding to the trace segments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withResponseTimeRootCauses(java.util.Collection<ResponseTimeRootCause> responseTimeRootCauses) {
        setResponseTimeRootCauses(responseTimeRootCauses);
        return this;
    }

    /**
     * <p>
     * The revision number of a trace.
     * </p>
     * 
     * @param revision
     *        The revision number of a trace.
     */

    public void setRevision(Integer revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision number of a trace.
     * </p>
     * 
     * @return The revision number of a trace.
     */

    public Integer getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision number of a trace.
     * </p>
     * 
     * @param revision
     *        The revision number of a trace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TraceSummary withRevision(Integer revision) {
        setRevision(revision);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getResponseTime() != null)
            sb.append("ResponseTime: ").append(getResponseTime()).append(",");
        if (getHasFault() != null)
            sb.append("HasFault: ").append(getHasFault()).append(",");
        if (getHasError() != null)
            sb.append("HasError: ").append(getHasError()).append(",");
        if (getHasThrottle() != null)
            sb.append("HasThrottle: ").append(getHasThrottle()).append(",");
        if (getIsPartial() != null)
            sb.append("IsPartial: ").append(getIsPartial()).append(",");
        if (getHttp() != null)
            sb.append("Http: ").append(getHttp()).append(",");
        if (getAnnotations() != null)
            sb.append("Annotations: ").append(getAnnotations()).append(",");
        if (getUsers() != null)
            sb.append("Users: ").append(getUsers()).append(",");
        if (getServiceIds() != null)
            sb.append("ServiceIds: ").append(getServiceIds()).append(",");
        if (getResourceARNs() != null)
            sb.append("ResourceARNs: ").append(getResourceARNs()).append(",");
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getEntryPoint() != null)
            sb.append("EntryPoint: ").append(getEntryPoint()).append(",");
        if (getFaultRootCauses() != null)
            sb.append("FaultRootCauses: ").append(getFaultRootCauses()).append(",");
        if (getErrorRootCauses() != null)
            sb.append("ErrorRootCauses: ").append(getErrorRootCauses()).append(",");
        if (getResponseTimeRootCauses() != null)
            sb.append("ResponseTimeRootCauses: ").append(getResponseTimeRootCauses()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TraceSummary == false)
            return false;
        TraceSummary other = (TraceSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getResponseTime() == null ^ this.getResponseTime() == null)
            return false;
        if (other.getResponseTime() != null && other.getResponseTime().equals(this.getResponseTime()) == false)
            return false;
        if (other.getHasFault() == null ^ this.getHasFault() == null)
            return false;
        if (other.getHasFault() != null && other.getHasFault().equals(this.getHasFault()) == false)
            return false;
        if (other.getHasError() == null ^ this.getHasError() == null)
            return false;
        if (other.getHasError() != null && other.getHasError().equals(this.getHasError()) == false)
            return false;
        if (other.getHasThrottle() == null ^ this.getHasThrottle() == null)
            return false;
        if (other.getHasThrottle() != null && other.getHasThrottle().equals(this.getHasThrottle()) == false)
            return false;
        if (other.getIsPartial() == null ^ this.getIsPartial() == null)
            return false;
        if (other.getIsPartial() != null && other.getIsPartial().equals(this.getIsPartial()) == false)
            return false;
        if (other.getHttp() == null ^ this.getHttp() == null)
            return false;
        if (other.getHttp() != null && other.getHttp().equals(this.getHttp()) == false)
            return false;
        if (other.getAnnotations() == null ^ this.getAnnotations() == null)
            return false;
        if (other.getAnnotations() != null && other.getAnnotations().equals(this.getAnnotations()) == false)
            return false;
        if (other.getUsers() == null ^ this.getUsers() == null)
            return false;
        if (other.getUsers() != null && other.getUsers().equals(this.getUsers()) == false)
            return false;
        if (other.getServiceIds() == null ^ this.getServiceIds() == null)
            return false;
        if (other.getServiceIds() != null && other.getServiceIds().equals(this.getServiceIds()) == false)
            return false;
        if (other.getResourceARNs() == null ^ this.getResourceARNs() == null)
            return false;
        if (other.getResourceARNs() != null && other.getResourceARNs().equals(this.getResourceARNs()) == false)
            return false;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getEntryPoint() == null ^ this.getEntryPoint() == null)
            return false;
        if (other.getEntryPoint() != null && other.getEntryPoint().equals(this.getEntryPoint()) == false)
            return false;
        if (other.getFaultRootCauses() == null ^ this.getFaultRootCauses() == null)
            return false;
        if (other.getFaultRootCauses() != null && other.getFaultRootCauses().equals(this.getFaultRootCauses()) == false)
            return false;
        if (other.getErrorRootCauses() == null ^ this.getErrorRootCauses() == null)
            return false;
        if (other.getErrorRootCauses() != null && other.getErrorRootCauses().equals(this.getErrorRootCauses()) == false)
            return false;
        if (other.getResponseTimeRootCauses() == null ^ this.getResponseTimeRootCauses() == null)
            return false;
        if (other.getResponseTimeRootCauses() != null && other.getResponseTimeRootCauses().equals(this.getResponseTimeRootCauses()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getResponseTime() == null) ? 0 : getResponseTime().hashCode());
        hashCode = prime * hashCode + ((getHasFault() == null) ? 0 : getHasFault().hashCode());
        hashCode = prime * hashCode + ((getHasError() == null) ? 0 : getHasError().hashCode());
        hashCode = prime * hashCode + ((getHasThrottle() == null) ? 0 : getHasThrottle().hashCode());
        hashCode = prime * hashCode + ((getIsPartial() == null) ? 0 : getIsPartial().hashCode());
        hashCode = prime * hashCode + ((getHttp() == null) ? 0 : getHttp().hashCode());
        hashCode = prime * hashCode + ((getAnnotations() == null) ? 0 : getAnnotations().hashCode());
        hashCode = prime * hashCode + ((getUsers() == null) ? 0 : getUsers().hashCode());
        hashCode = prime * hashCode + ((getServiceIds() == null) ? 0 : getServiceIds().hashCode());
        hashCode = prime * hashCode + ((getResourceARNs() == null) ? 0 : getResourceARNs().hashCode());
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getEntryPoint() == null) ? 0 : getEntryPoint().hashCode());
        hashCode = prime * hashCode + ((getFaultRootCauses() == null) ? 0 : getFaultRootCauses().hashCode());
        hashCode = prime * hashCode + ((getErrorRootCauses() == null) ? 0 : getErrorRootCauses().hashCode());
        hashCode = prime * hashCode + ((getResponseTimeRootCauses() == null) ? 0 : getResponseTimeRootCauses().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        return hashCode;
    }

    @Override
    public TraceSummary clone() {
        try {
            return (TraceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.TraceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
