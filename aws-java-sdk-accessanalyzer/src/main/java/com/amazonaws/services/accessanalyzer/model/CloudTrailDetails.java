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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about CloudTrail access.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CloudTrailDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudTrailDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the service role that Access Analyzer uses to access your CloudTrail trail and service last accessed
     * information.
     * </p>
     */
    private String accessRole;
    /**
     * <p>
     * The end of the time range for which Access Analyzer reviews your CloudTrail events. Events with a timestamp after
     * this time are not considered to generate a policy. If this is not included in the request, the default value is
     * the current time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The start of the time range for which Access Analyzer reviews your CloudTrail events. Events with a timestamp
     * before this time are not considered to generate a policy.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A <code>Trail</code> object that contains settings for a trail.
     * </p>
     */
    private java.util.List<Trail> trails;

    /**
     * <p>
     * The ARN of the service role that Access Analyzer uses to access your CloudTrail trail and service last accessed
     * information.
     * </p>
     * 
     * @param accessRole
     *        The ARN of the service role that Access Analyzer uses to access your CloudTrail trail and service last
     *        accessed information.
     */

    public void setAccessRole(String accessRole) {
        this.accessRole = accessRole;
    }

    /**
     * <p>
     * The ARN of the service role that Access Analyzer uses to access your CloudTrail trail and service last accessed
     * information.
     * </p>
     * 
     * @return The ARN of the service role that Access Analyzer uses to access your CloudTrail trail and service last
     *         accessed information.
     */

    public String getAccessRole() {
        return this.accessRole;
    }

    /**
     * <p>
     * The ARN of the service role that Access Analyzer uses to access your CloudTrail trail and service last accessed
     * information.
     * </p>
     * 
     * @param accessRole
     *        The ARN of the service role that Access Analyzer uses to access your CloudTrail trail and service last
     *        accessed information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudTrailDetails withAccessRole(String accessRole) {
        setAccessRole(accessRole);
        return this;
    }

    /**
     * <p>
     * The end of the time range for which Access Analyzer reviews your CloudTrail events. Events with a timestamp after
     * this time are not considered to generate a policy. If this is not included in the request, the default value is
     * the current time.
     * </p>
     * 
     * @param endTime
     *        The end of the time range for which Access Analyzer reviews your CloudTrail events. Events with a
     *        timestamp after this time are not considered to generate a policy. If this is not included in the request,
     *        the default value is the current time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time range for which Access Analyzer reviews your CloudTrail events. Events with a timestamp after
     * this time are not considered to generate a policy. If this is not included in the request, the default value is
     * the current time.
     * </p>
     * 
     * @return The end of the time range for which Access Analyzer reviews your CloudTrail events. Events with a
     *         timestamp after this time are not considered to generate a policy. If this is not included in the
     *         request, the default value is the current time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time range for which Access Analyzer reviews your CloudTrail events. Events with a timestamp after
     * this time are not considered to generate a policy. If this is not included in the request, the default value is
     * the current time.
     * </p>
     * 
     * @param endTime
     *        The end of the time range for which Access Analyzer reviews your CloudTrail events. Events with a
     *        timestamp after this time are not considered to generate a policy. If this is not included in the request,
     *        the default value is the current time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudTrailDetails withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The start of the time range for which Access Analyzer reviews your CloudTrail events. Events with a timestamp
     * before this time are not considered to generate a policy.
     * </p>
     * 
     * @param startTime
     *        The start of the time range for which Access Analyzer reviews your CloudTrail events. Events with a
     *        timestamp before this time are not considered to generate a policy.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time range for which Access Analyzer reviews your CloudTrail events. Events with a timestamp
     * before this time are not considered to generate a policy.
     * </p>
     * 
     * @return The start of the time range for which Access Analyzer reviews your CloudTrail events. Events with a
     *         timestamp before this time are not considered to generate a policy.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time range for which Access Analyzer reviews your CloudTrail events. Events with a timestamp
     * before this time are not considered to generate a policy.
     * </p>
     * 
     * @param startTime
     *        The start of the time range for which Access Analyzer reviews your CloudTrail events. Events with a
     *        timestamp before this time are not considered to generate a policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudTrailDetails withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A <code>Trail</code> object that contains settings for a trail.
     * </p>
     * 
     * @return A <code>Trail</code> object that contains settings for a trail.
     */

    public java.util.List<Trail> getTrails() {
        return trails;
    }

    /**
     * <p>
     * A <code>Trail</code> object that contains settings for a trail.
     * </p>
     * 
     * @param trails
     *        A <code>Trail</code> object that contains settings for a trail.
     */

    public void setTrails(java.util.Collection<Trail> trails) {
        if (trails == null) {
            this.trails = null;
            return;
        }

        this.trails = new java.util.ArrayList<Trail>(trails);
    }

    /**
     * <p>
     * A <code>Trail</code> object that contains settings for a trail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrails(java.util.Collection)} or {@link #withTrails(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param trails
     *        A <code>Trail</code> object that contains settings for a trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudTrailDetails withTrails(Trail... trails) {
        if (this.trails == null) {
            setTrails(new java.util.ArrayList<Trail>(trails.length));
        }
        for (Trail ele : trails) {
            this.trails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>Trail</code> object that contains settings for a trail.
     * </p>
     * 
     * @param trails
     *        A <code>Trail</code> object that contains settings for a trail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudTrailDetails withTrails(java.util.Collection<Trail> trails) {
        setTrails(trails);
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
        if (getAccessRole() != null)
            sb.append("AccessRole: ").append(getAccessRole()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTrails() != null)
            sb.append("Trails: ").append(getTrails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudTrailDetails == false)
            return false;
        CloudTrailDetails other = (CloudTrailDetails) obj;
        if (other.getAccessRole() == null ^ this.getAccessRole() == null)
            return false;
        if (other.getAccessRole() != null && other.getAccessRole().equals(this.getAccessRole()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTrails() == null ^ this.getTrails() == null)
            return false;
        if (other.getTrails() != null && other.getTrails().equals(this.getTrails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessRole() == null) ? 0 : getAccessRole().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrails() == null) ? 0 : getTrails().hashCode());
        return hashCode;
    }

    @Override
    public CloudTrailDetails clone() {
        try {
            return (CloudTrailDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.CloudTrailDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
