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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/StartPipelineReprocessing"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartPipelineReprocessingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline on which to start reprocessing.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The start time (inclusive) of raw message data that is reprocessed.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time (exclusive) of raw message data that is reprocessed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The name of the pipeline on which to start reprocessing.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline on which to start reprocessing.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline on which to start reprocessing.
     * </p>
     * 
     * @return The name of the pipeline on which to start reprocessing.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline on which to start reprocessing.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline on which to start reprocessing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineReprocessingRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * The start time (inclusive) of raw message data that is reprocessed.
     * </p>
     * 
     * @param startTime
     *        The start time (inclusive) of raw message data that is reprocessed.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time (inclusive) of raw message data that is reprocessed.
     * </p>
     * 
     * @return The start time (inclusive) of raw message data that is reprocessed.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time (inclusive) of raw message data that is reprocessed.
     * </p>
     * 
     * @param startTime
     *        The start time (inclusive) of raw message data that is reprocessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineReprocessingRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time (exclusive) of raw message data that is reprocessed.
     * </p>
     * 
     * @param endTime
     *        The end time (exclusive) of raw message data that is reprocessed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time (exclusive) of raw message data that is reprocessed.
     * </p>
     * 
     * @return The end time (exclusive) of raw message data that is reprocessed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time (exclusive) of raw message data that is reprocessed.
     * </p>
     * 
     * @param endTime
     *        The end time (exclusive) of raw message data that is reprocessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineReprocessingRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartPipelineReprocessingRequest == false)
            return false;
        StartPipelineReprocessingRequest other = (StartPipelineReprocessingRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public StartPipelineReprocessingRequest clone() {
        return (StartPipelineReprocessingRequest) super.clone();
    }

}
