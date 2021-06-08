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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The part of a profile that contains a recommendation found during analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/Match" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Match implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location in the profiling graph that contains a recommendation found during analysis.
     * </p>
     */
    private String frameAddress;
    /**
     * <p>
     * The target frame that triggered a match.
     * </p>
     */
    private Integer targetFramesIndex;
    /**
     * <p>
     * The value in the profile data that exceeded the recommendation threshold.
     * </p>
     */
    private Double thresholdBreachValue;

    /**
     * <p>
     * The location in the profiling graph that contains a recommendation found during analysis.
     * </p>
     * 
     * @param frameAddress
     *        The location in the profiling graph that contains a recommendation found during analysis.
     */

    public void setFrameAddress(String frameAddress) {
        this.frameAddress = frameAddress;
    }

    /**
     * <p>
     * The location in the profiling graph that contains a recommendation found during analysis.
     * </p>
     * 
     * @return The location in the profiling graph that contains a recommendation found during analysis.
     */

    public String getFrameAddress() {
        return this.frameAddress;
    }

    /**
     * <p>
     * The location in the profiling graph that contains a recommendation found during analysis.
     * </p>
     * 
     * @param frameAddress
     *        The location in the profiling graph that contains a recommendation found during analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Match withFrameAddress(String frameAddress) {
        setFrameAddress(frameAddress);
        return this;
    }

    /**
     * <p>
     * The target frame that triggered a match.
     * </p>
     * 
     * @param targetFramesIndex
     *        The target frame that triggered a match.
     */

    public void setTargetFramesIndex(Integer targetFramesIndex) {
        this.targetFramesIndex = targetFramesIndex;
    }

    /**
     * <p>
     * The target frame that triggered a match.
     * </p>
     * 
     * @return The target frame that triggered a match.
     */

    public Integer getTargetFramesIndex() {
        return this.targetFramesIndex;
    }

    /**
     * <p>
     * The target frame that triggered a match.
     * </p>
     * 
     * @param targetFramesIndex
     *        The target frame that triggered a match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Match withTargetFramesIndex(Integer targetFramesIndex) {
        setTargetFramesIndex(targetFramesIndex);
        return this;
    }

    /**
     * <p>
     * The value in the profile data that exceeded the recommendation threshold.
     * </p>
     * 
     * @param thresholdBreachValue
     *        The value in the profile data that exceeded the recommendation threshold.
     */

    public void setThresholdBreachValue(Double thresholdBreachValue) {
        this.thresholdBreachValue = thresholdBreachValue;
    }

    /**
     * <p>
     * The value in the profile data that exceeded the recommendation threshold.
     * </p>
     * 
     * @return The value in the profile data that exceeded the recommendation threshold.
     */

    public Double getThresholdBreachValue() {
        return this.thresholdBreachValue;
    }

    /**
     * <p>
     * The value in the profile data that exceeded the recommendation threshold.
     * </p>
     * 
     * @param thresholdBreachValue
     *        The value in the profile data that exceeded the recommendation threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Match withThresholdBreachValue(Double thresholdBreachValue) {
        setThresholdBreachValue(thresholdBreachValue);
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
        if (getFrameAddress() != null)
            sb.append("FrameAddress: ").append(getFrameAddress()).append(",");
        if (getTargetFramesIndex() != null)
            sb.append("TargetFramesIndex: ").append(getTargetFramesIndex()).append(",");
        if (getThresholdBreachValue() != null)
            sb.append("ThresholdBreachValue: ").append(getThresholdBreachValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Match == false)
            return false;
        Match other = (Match) obj;
        if (other.getFrameAddress() == null ^ this.getFrameAddress() == null)
            return false;
        if (other.getFrameAddress() != null && other.getFrameAddress().equals(this.getFrameAddress()) == false)
            return false;
        if (other.getTargetFramesIndex() == null ^ this.getTargetFramesIndex() == null)
            return false;
        if (other.getTargetFramesIndex() != null && other.getTargetFramesIndex().equals(this.getTargetFramesIndex()) == false)
            return false;
        if (other.getThresholdBreachValue() == null ^ this.getThresholdBreachValue() == null)
            return false;
        if (other.getThresholdBreachValue() != null && other.getThresholdBreachValue().equals(this.getThresholdBreachValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrameAddress() == null) ? 0 : getFrameAddress().hashCode());
        hashCode = prime * hashCode + ((getTargetFramesIndex() == null) ? 0 : getTargetFramesIndex().hashCode());
        hashCode = prime * hashCode + ((getThresholdBreachValue() == null) ? 0 : getThresholdBreachValue().hashCode());
        return hashCode;
    }

    @Override
    public Match clone() {
        try {
            return (Match) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.MatchMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
