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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/CloudTrailProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudTrailProperties implements Serializable, Cloneable, StructuredPojo {

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
     * A <code>TrailProperties</code> object that contains settings for trail properties.
     * </p>
     */
    private java.util.List<TrailProperties> trailProperties;

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

    public CloudTrailProperties withEndTime(java.util.Date endTime) {
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

    public CloudTrailProperties withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A <code>TrailProperties</code> object that contains settings for trail properties.
     * </p>
     * 
     * @return A <code>TrailProperties</code> object that contains settings for trail properties.
     */

    public java.util.List<TrailProperties> getTrailProperties() {
        return trailProperties;
    }

    /**
     * <p>
     * A <code>TrailProperties</code> object that contains settings for trail properties.
     * </p>
     * 
     * @param trailProperties
     *        A <code>TrailProperties</code> object that contains settings for trail properties.
     */

    public void setTrailProperties(java.util.Collection<TrailProperties> trailProperties) {
        if (trailProperties == null) {
            this.trailProperties = null;
            return;
        }

        this.trailProperties = new java.util.ArrayList<TrailProperties>(trailProperties);
    }

    /**
     * <p>
     * A <code>TrailProperties</code> object that contains settings for trail properties.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrailProperties(java.util.Collection)} or {@link #withTrailProperties(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param trailProperties
     *        A <code>TrailProperties</code> object that contains settings for trail properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudTrailProperties withTrailProperties(TrailProperties... trailProperties) {
        if (this.trailProperties == null) {
            setTrailProperties(new java.util.ArrayList<TrailProperties>(trailProperties.length));
        }
        for (TrailProperties ele : trailProperties) {
            this.trailProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A <code>TrailProperties</code> object that contains settings for trail properties.
     * </p>
     * 
     * @param trailProperties
     *        A <code>TrailProperties</code> object that contains settings for trail properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudTrailProperties withTrailProperties(java.util.Collection<TrailProperties> trailProperties) {
        setTrailProperties(trailProperties);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTrailProperties() != null)
            sb.append("TrailProperties: ").append(getTrailProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudTrailProperties == false)
            return false;
        CloudTrailProperties other = (CloudTrailProperties) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTrailProperties() == null ^ this.getTrailProperties() == null)
            return false;
        if (other.getTrailProperties() != null && other.getTrailProperties().equals(this.getTrailProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrailProperties() == null) ? 0 : getTrailProperties().hashCode());
        return hashCode;
    }

    @Override
    public CloudTrailProperties clone() {
        try {
            return (CloudTrailProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.CloudTrailPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
