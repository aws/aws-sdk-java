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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure defines the traffic allocation percentages among the feature variations during one step of a launch,
 * and the start time of that step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ScheduledSplit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledSplit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The traffic allocation percentages among the feature variations during one step of a launch. This is a set of
     * key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that
     * variation during this step.
     * </p>
     * <p>
     * The values is expressed in thousandths of a percent, so assigning a weight of 50000 assigns 50% of traffic to
     * that variation.
     * </p>
     * <p>
     * If the sum of the weights for all the variations in a segment override does not add up to 100,000, then the
     * remaining traffic that matches this segment is not assigned by this segment override, and instead moves on to the
     * next segment override or the default traffic split.
     * </p>
     */
    private java.util.Map<String, Long> groupWeights;
    /**
     * <p>
     * Use this parameter to specify different traffic splits for one or more audience <i>segments</i>. A segment is a
     * portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in
     * Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as
     * age.
     * </p>
     * <p>
     * This parameter is an array of up to six segment override objects. Each of these objects specifies a segment that
     * you have already created, and defines the traffic split for that segment.
     * </p>
     */
    private java.util.List<SegmentOverride> segmentOverrides;
    /**
     * <p>
     * The date and time that this step of the launch starts.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The traffic allocation percentages among the feature variations during one step of a launch. This is a set of
     * key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that
     * variation during this step.
     * </p>
     * <p>
     * The values is expressed in thousandths of a percent, so assigning a weight of 50000 assigns 50% of traffic to
     * that variation.
     * </p>
     * <p>
     * If the sum of the weights for all the variations in a segment override does not add up to 100,000, then the
     * remaining traffic that matches this segment is not assigned by this segment override, and instead moves on to the
     * next segment override or the default traffic split.
     * </p>
     * 
     * @return The traffic allocation percentages among the feature variations during one step of a launch. This is a
     *         set of key-value pairs. The keys are variation names. The values represent the percentage of traffic to
     *         allocate to that variation during this step.</p>
     *         <p>
     *         The values is expressed in thousandths of a percent, so assigning a weight of 50000 assigns 50% of
     *         traffic to that variation.
     *         </p>
     *         <p>
     *         If the sum of the weights for all the variations in a segment override does not add up to 100,000, then
     *         the remaining traffic that matches this segment is not assigned by this segment override, and instead
     *         moves on to the next segment override or the default traffic split.
     */

    public java.util.Map<String, Long> getGroupWeights() {
        return groupWeights;
    }

    /**
     * <p>
     * The traffic allocation percentages among the feature variations during one step of a launch. This is a set of
     * key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that
     * variation during this step.
     * </p>
     * <p>
     * The values is expressed in thousandths of a percent, so assigning a weight of 50000 assigns 50% of traffic to
     * that variation.
     * </p>
     * <p>
     * If the sum of the weights for all the variations in a segment override does not add up to 100,000, then the
     * remaining traffic that matches this segment is not assigned by this segment override, and instead moves on to the
     * next segment override or the default traffic split.
     * </p>
     * 
     * @param groupWeights
     *        The traffic allocation percentages among the feature variations during one step of a launch. This is a set
     *        of key-value pairs. The keys are variation names. The values represent the percentage of traffic to
     *        allocate to that variation during this step.</p>
     *        <p>
     *        The values is expressed in thousandths of a percent, so assigning a weight of 50000 assigns 50% of traffic
     *        to that variation.
     *        </p>
     *        <p>
     *        If the sum of the weights for all the variations in a segment override does not add up to 100,000, then
     *        the remaining traffic that matches this segment is not assigned by this segment override, and instead
     *        moves on to the next segment override or the default traffic split.
     */

    public void setGroupWeights(java.util.Map<String, Long> groupWeights) {
        this.groupWeights = groupWeights;
    }

    /**
     * <p>
     * The traffic allocation percentages among the feature variations during one step of a launch. This is a set of
     * key-value pairs. The keys are variation names. The values represent the percentage of traffic to allocate to that
     * variation during this step.
     * </p>
     * <p>
     * The values is expressed in thousandths of a percent, so assigning a weight of 50000 assigns 50% of traffic to
     * that variation.
     * </p>
     * <p>
     * If the sum of the weights for all the variations in a segment override does not add up to 100,000, then the
     * remaining traffic that matches this segment is not assigned by this segment override, and instead moves on to the
     * next segment override or the default traffic split.
     * </p>
     * 
     * @param groupWeights
     *        The traffic allocation percentages among the feature variations during one step of a launch. This is a set
     *        of key-value pairs. The keys are variation names. The values represent the percentage of traffic to
     *        allocate to that variation during this step.</p>
     *        <p>
     *        The values is expressed in thousandths of a percent, so assigning a weight of 50000 assigns 50% of traffic
     *        to that variation.
     *        </p>
     *        <p>
     *        If the sum of the weights for all the variations in a segment override does not add up to 100,000, then
     *        the remaining traffic that matches this segment is not assigned by this segment override, and instead
     *        moves on to the next segment override or the default traffic split.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplit withGroupWeights(java.util.Map<String, Long> groupWeights) {
        setGroupWeights(groupWeights);
        return this;
    }

    /**
     * Add a single GroupWeights entry
     *
     * @see ScheduledSplit#withGroupWeights
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplit addGroupWeightsEntry(String key, Long value) {
        if (null == this.groupWeights) {
            this.groupWeights = new java.util.HashMap<String, Long>();
        }
        if (this.groupWeights.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.groupWeights.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into GroupWeights.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplit clearGroupWeightsEntries() {
        this.groupWeights = null;
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify different traffic splits for one or more audience <i>segments</i>. A segment is a
     * portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in
     * Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as
     * age.
     * </p>
     * <p>
     * This parameter is an array of up to six segment override objects. Each of these objects specifies a segment that
     * you have already created, and defines the traffic split for that segment.
     * </p>
     * 
     * @return Use this parameter to specify different traffic splits for one or more audience <i>segments</i>. A
     *         segment is a portion of your audience that share one or more characteristics. Examples could be Chrome
     *         browser users, users in Europe, or Firefox browser users in Europe who also fit other criteria that your
     *         application collects, such as age.</p>
     *         <p>
     *         This parameter is an array of up to six segment override objects. Each of these objects specifies a
     *         segment that you have already created, and defines the traffic split for that segment.
     */

    public java.util.List<SegmentOverride> getSegmentOverrides() {
        return segmentOverrides;
    }

    /**
     * <p>
     * Use this parameter to specify different traffic splits for one or more audience <i>segments</i>. A segment is a
     * portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in
     * Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as
     * age.
     * </p>
     * <p>
     * This parameter is an array of up to six segment override objects. Each of these objects specifies a segment that
     * you have already created, and defines the traffic split for that segment.
     * </p>
     * 
     * @param segmentOverrides
     *        Use this parameter to specify different traffic splits for one or more audience <i>segments</i>. A segment
     *        is a portion of your audience that share one or more characteristics. Examples could be Chrome browser
     *        users, users in Europe, or Firefox browser users in Europe who also fit other criteria that your
     *        application collects, such as age.</p>
     *        <p>
     *        This parameter is an array of up to six segment override objects. Each of these objects specifies a
     *        segment that you have already created, and defines the traffic split for that segment.
     */

    public void setSegmentOverrides(java.util.Collection<SegmentOverride> segmentOverrides) {
        if (segmentOverrides == null) {
            this.segmentOverrides = null;
            return;
        }

        this.segmentOverrides = new java.util.ArrayList<SegmentOverride>(segmentOverrides);
    }

    /**
     * <p>
     * Use this parameter to specify different traffic splits for one or more audience <i>segments</i>. A segment is a
     * portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in
     * Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as
     * age.
     * </p>
     * <p>
     * This parameter is an array of up to six segment override objects. Each of these objects specifies a segment that
     * you have already created, and defines the traffic split for that segment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegmentOverrides(java.util.Collection)} or {@link #withSegmentOverrides(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param segmentOverrides
     *        Use this parameter to specify different traffic splits for one or more audience <i>segments</i>. A segment
     *        is a portion of your audience that share one or more characteristics. Examples could be Chrome browser
     *        users, users in Europe, or Firefox browser users in Europe who also fit other criteria that your
     *        application collects, such as age.</p>
     *        <p>
     *        This parameter is an array of up to six segment override objects. Each of these objects specifies a
     *        segment that you have already created, and defines the traffic split for that segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplit withSegmentOverrides(SegmentOverride... segmentOverrides) {
        if (this.segmentOverrides == null) {
            setSegmentOverrides(new java.util.ArrayList<SegmentOverride>(segmentOverrides.length));
        }
        for (SegmentOverride ele : segmentOverrides) {
            this.segmentOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify different traffic splits for one or more audience <i>segments</i>. A segment is a
     * portion of your audience that share one or more characteristics. Examples could be Chrome browser users, users in
     * Europe, or Firefox browser users in Europe who also fit other criteria that your application collects, such as
     * age.
     * </p>
     * <p>
     * This parameter is an array of up to six segment override objects. Each of these objects specifies a segment that
     * you have already created, and defines the traffic split for that segment.
     * </p>
     * 
     * @param segmentOverrides
     *        Use this parameter to specify different traffic splits for one or more audience <i>segments</i>. A segment
     *        is a portion of your audience that share one or more characteristics. Examples could be Chrome browser
     *        users, users in Europe, or Firefox browser users in Europe who also fit other criteria that your
     *        application collects, such as age.</p>
     *        <p>
     *        This parameter is an array of up to six segment override objects. Each of these objects specifies a
     *        segment that you have already created, and defines the traffic split for that segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplit withSegmentOverrides(java.util.Collection<SegmentOverride> segmentOverrides) {
        setSegmentOverrides(segmentOverrides);
        return this;
    }

    /**
     * <p>
     * The date and time that this step of the launch starts.
     * </p>
     * 
     * @param startTime
     *        The date and time that this step of the launch starts.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time that this step of the launch starts.
     * </p>
     * 
     * @return The date and time that this step of the launch starts.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time that this step of the launch starts.
     * </p>
     * 
     * @param startTime
     *        The date and time that this step of the launch starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledSplit withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getGroupWeights() != null)
            sb.append("GroupWeights: ").append(getGroupWeights()).append(",");
        if (getSegmentOverrides() != null)
            sb.append("SegmentOverrides: ").append(getSegmentOverrides()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledSplit == false)
            return false;
        ScheduledSplit other = (ScheduledSplit) obj;
        if (other.getGroupWeights() == null ^ this.getGroupWeights() == null)
            return false;
        if (other.getGroupWeights() != null && other.getGroupWeights().equals(this.getGroupWeights()) == false)
            return false;
        if (other.getSegmentOverrides() == null ^ this.getSegmentOverrides() == null)
            return false;
        if (other.getSegmentOverrides() != null && other.getSegmentOverrides().equals(this.getSegmentOverrides()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupWeights() == null) ? 0 : getGroupWeights().hashCode());
        hashCode = prime * hashCode + ((getSegmentOverrides() == null) ? 0 : getSegmentOverrides().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledSplit clone() {
        try {
            return (ScheduledSplit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevidently.model.transform.ScheduledSplitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
