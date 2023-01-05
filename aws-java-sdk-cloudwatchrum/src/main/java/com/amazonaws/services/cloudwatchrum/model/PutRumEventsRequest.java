/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/PutRumEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRumEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains information about the app monitor that collected this telemetry information.
     * </p>
     */
    private AppMonitorDetails appMonitorDetails;
    /**
     * <p>
     * A unique identifier for this batch of RUM event data.
     * </p>
     */
    private String batchId;
    /**
     * <p>
     * The ID of the app monitor that is sending this data.
     * </p>
     */
    private String id;
    /**
     * <p>
     * An array of structures that contain the telemetry event data.
     * </p>
     */
    private java.util.List<RumEvent> rumEvents;
    /**
     * <p>
     * A structure that contains information about the user session that this batch of events was collected from.
     * </p>
     */
    private UserDetails userDetails;

    /**
     * <p>
     * A structure that contains information about the app monitor that collected this telemetry information.
     * </p>
     * 
     * @param appMonitorDetails
     *        A structure that contains information about the app monitor that collected this telemetry information.
     */

    public void setAppMonitorDetails(AppMonitorDetails appMonitorDetails) {
        this.appMonitorDetails = appMonitorDetails;
    }

    /**
     * <p>
     * A structure that contains information about the app monitor that collected this telemetry information.
     * </p>
     * 
     * @return A structure that contains information about the app monitor that collected this telemetry information.
     */

    public AppMonitorDetails getAppMonitorDetails() {
        return this.appMonitorDetails;
    }

    /**
     * <p>
     * A structure that contains information about the app monitor that collected this telemetry information.
     * </p>
     * 
     * @param appMonitorDetails
     *        A structure that contains information about the app monitor that collected this telemetry information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRumEventsRequest withAppMonitorDetails(AppMonitorDetails appMonitorDetails) {
        setAppMonitorDetails(appMonitorDetails);
        return this;
    }

    /**
     * <p>
     * A unique identifier for this batch of RUM event data.
     * </p>
     * 
     * @param batchId
     *        A unique identifier for this batch of RUM event data.
     */

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    /**
     * <p>
     * A unique identifier for this batch of RUM event data.
     * </p>
     * 
     * @return A unique identifier for this batch of RUM event data.
     */

    public String getBatchId() {
        return this.batchId;
    }

    /**
     * <p>
     * A unique identifier for this batch of RUM event data.
     * </p>
     * 
     * @param batchId
     *        A unique identifier for this batch of RUM event data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRumEventsRequest withBatchId(String batchId) {
        setBatchId(batchId);
        return this;
    }

    /**
     * <p>
     * The ID of the app monitor that is sending this data.
     * </p>
     * 
     * @param id
     *        The ID of the app monitor that is sending this data.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the app monitor that is sending this data.
     * </p>
     * 
     * @return The ID of the app monitor that is sending this data.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the app monitor that is sending this data.
     * </p>
     * 
     * @param id
     *        The ID of the app monitor that is sending this data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRumEventsRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the telemetry event data.
     * </p>
     * 
     * @return An array of structures that contain the telemetry event data.
     */

    public java.util.List<RumEvent> getRumEvents() {
        return rumEvents;
    }

    /**
     * <p>
     * An array of structures that contain the telemetry event data.
     * </p>
     * 
     * @param rumEvents
     *        An array of structures that contain the telemetry event data.
     */

    public void setRumEvents(java.util.Collection<RumEvent> rumEvents) {
        if (rumEvents == null) {
            this.rumEvents = null;
            return;
        }

        this.rumEvents = new java.util.ArrayList<RumEvent>(rumEvents);
    }

    /**
     * <p>
     * An array of structures that contain the telemetry event data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRumEvents(java.util.Collection)} or {@link #withRumEvents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rumEvents
     *        An array of structures that contain the telemetry event data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRumEventsRequest withRumEvents(RumEvent... rumEvents) {
        if (this.rumEvents == null) {
            setRumEvents(new java.util.ArrayList<RumEvent>(rumEvents.length));
        }
        for (RumEvent ele : rumEvents) {
            this.rumEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the telemetry event data.
     * </p>
     * 
     * @param rumEvents
     *        An array of structures that contain the telemetry event data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRumEventsRequest withRumEvents(java.util.Collection<RumEvent> rumEvents) {
        setRumEvents(rumEvents);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about the user session that this batch of events was collected from.
     * </p>
     * 
     * @param userDetails
     *        A structure that contains information about the user session that this batch of events was collected from.
     */

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    /**
     * <p>
     * A structure that contains information about the user session that this batch of events was collected from.
     * </p>
     * 
     * @return A structure that contains information about the user session that this batch of events was collected
     *         from.
     */

    public UserDetails getUserDetails() {
        return this.userDetails;
    }

    /**
     * <p>
     * A structure that contains information about the user session that this batch of events was collected from.
     * </p>
     * 
     * @param userDetails
     *        A structure that contains information about the user session that this batch of events was collected from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRumEventsRequest withUserDetails(UserDetails userDetails) {
        setUserDetails(userDetails);
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
        if (getAppMonitorDetails() != null)
            sb.append("AppMonitorDetails: ").append(getAppMonitorDetails()).append(",");
        if (getBatchId() != null)
            sb.append("BatchId: ").append(getBatchId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRumEvents() != null)
            sb.append("RumEvents: ").append(getRumEvents()).append(",");
        if (getUserDetails() != null)
            sb.append("UserDetails: ").append(getUserDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRumEventsRequest == false)
            return false;
        PutRumEventsRequest other = (PutRumEventsRequest) obj;
        if (other.getAppMonitorDetails() == null ^ this.getAppMonitorDetails() == null)
            return false;
        if (other.getAppMonitorDetails() != null && other.getAppMonitorDetails().equals(this.getAppMonitorDetails()) == false)
            return false;
        if (other.getBatchId() == null ^ this.getBatchId() == null)
            return false;
        if (other.getBatchId() != null && other.getBatchId().equals(this.getBatchId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRumEvents() == null ^ this.getRumEvents() == null)
            return false;
        if (other.getRumEvents() != null && other.getRumEvents().equals(this.getRumEvents()) == false)
            return false;
        if (other.getUserDetails() == null ^ this.getUserDetails() == null)
            return false;
        if (other.getUserDetails() != null && other.getUserDetails().equals(this.getUserDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppMonitorDetails() == null) ? 0 : getAppMonitorDetails().hashCode());
        hashCode = prime * hashCode + ((getBatchId() == null) ? 0 : getBatchId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRumEvents() == null) ? 0 : getRumEvents().hashCode());
        hashCode = prime * hashCode + ((getUserDetails() == null) ? 0 : getUserDetails().hashCode());
        return hashCode;
    }

    @Override
    public PutRumEventsRequest clone() {
        return (PutRumEventsRequest) super.clone();
    }

}
