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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Details regarding output
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/OutputDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputDetail implements Serializable, Cloneable, StructuredPojo {

    /** Duration in milliseconds */
    private Integer durationInMs;
    /** Contains details about the output's video stream */
    private VideoDetail videoDetails;

    /**
     * Duration in milliseconds
     * 
     * @param durationInMs
     *        Duration in milliseconds
     */

    public void setDurationInMs(Integer durationInMs) {
        this.durationInMs = durationInMs;
    }

    /**
     * Duration in milliseconds
     * 
     * @return Duration in milliseconds
     */

    public Integer getDurationInMs() {
        return this.durationInMs;
    }

    /**
     * Duration in milliseconds
     * 
     * @param durationInMs
     *        Duration in milliseconds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDetail withDurationInMs(Integer durationInMs) {
        setDurationInMs(durationInMs);
        return this;
    }

    /**
     * Contains details about the output's video stream
     * 
     * @param videoDetails
     *        Contains details about the output's video stream
     */

    public void setVideoDetails(VideoDetail videoDetails) {
        this.videoDetails = videoDetails;
    }

    /**
     * Contains details about the output's video stream
     * 
     * @return Contains details about the output's video stream
     */

    public VideoDetail getVideoDetails() {
        return this.videoDetails;
    }

    /**
     * Contains details about the output's video stream
     * 
     * @param videoDetails
     *        Contains details about the output's video stream
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDetail withVideoDetails(VideoDetail videoDetails) {
        setVideoDetails(videoDetails);
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
        if (getDurationInMs() != null)
            sb.append("DurationInMs: ").append(getDurationInMs()).append(",");
        if (getVideoDetails() != null)
            sb.append("VideoDetails: ").append(getVideoDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDetail == false)
            return false;
        OutputDetail other = (OutputDetail) obj;
        if (other.getDurationInMs() == null ^ this.getDurationInMs() == null)
            return false;
        if (other.getDurationInMs() != null && other.getDurationInMs().equals(this.getDurationInMs()) == false)
            return false;
        if (other.getVideoDetails() == null ^ this.getVideoDetails() == null)
            return false;
        if (other.getVideoDetails() != null && other.getVideoDetails().equals(this.getVideoDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationInMs() == null) ? 0 : getDurationInMs().hashCode());
        hashCode = prime * hashCode + ((getVideoDetails() == null) ? 0 : getVideoDetails().hashCode());
        return hashCode;
    }

    @Override
    public OutputDetail clone() {
        try {
            return (OutputDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.OutputDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
