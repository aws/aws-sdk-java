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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The structure representing the SubmitFeedbackRequest.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/SubmitFeedback" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubmitFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The universally unique identifier (UUID) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AnomalyInstance.html">
     * <code>AnomalyInstance</code> </a> object that is included in the analysis data.
     * </p>
     */
    private String anomalyInstanceId;
    /**
     * <p>
     * Optional feedback about this anomaly.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The name of the profiling group that is associated with the analysis data.
     * </p>
     */
    private String profilingGroupName;
    /**
     * <p>
     * The feedback tpye. Thee are two valid values, <code>Positive</code> and <code>Negative</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The universally unique identifier (UUID) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AnomalyInstance.html">
     * <code>AnomalyInstance</code> </a> object that is included in the analysis data.
     * </p>
     * 
     * @param anomalyInstanceId
     *        The universally unique identifier (UUID) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AnomalyInstance.html">
     *        <code>AnomalyInstance</code> </a> object that is included in the analysis data.
     */

    public void setAnomalyInstanceId(String anomalyInstanceId) {
        this.anomalyInstanceId = anomalyInstanceId;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AnomalyInstance.html">
     * <code>AnomalyInstance</code> </a> object that is included in the analysis data.
     * </p>
     * 
     * @return The universally unique identifier (UUID) of the <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AnomalyInstance.html">
     *         <code>AnomalyInstance</code> </a> object that is included in the analysis data.
     */

    public String getAnomalyInstanceId() {
        return this.anomalyInstanceId;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the <a
     * href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AnomalyInstance.html">
     * <code>AnomalyInstance</code> </a> object that is included in the analysis data.
     * </p>
     * 
     * @param anomalyInstanceId
     *        The universally unique identifier (UUID) of the <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/profiler-api/API_AnomalyInstance.html">
     *        <code>AnomalyInstance</code> </a> object that is included in the analysis data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitFeedbackRequest withAnomalyInstanceId(String anomalyInstanceId) {
        setAnomalyInstanceId(anomalyInstanceId);
        return this;
    }

    /**
     * <p>
     * Optional feedback about this anomaly.
     * </p>
     * 
     * @param comment
     *        Optional feedback about this anomaly.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Optional feedback about this anomaly.
     * </p>
     * 
     * @return Optional feedback about this anomaly.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * Optional feedback about this anomaly.
     * </p>
     * 
     * @param comment
     *        Optional feedback about this anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitFeedbackRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The name of the profiling group that is associated with the analysis data.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group that is associated with the analysis data.
     */

    public void setProfilingGroupName(String profilingGroupName) {
        this.profilingGroupName = profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group that is associated with the analysis data.
     * </p>
     * 
     * @return The name of the profiling group that is associated with the analysis data.
     */

    public String getProfilingGroupName() {
        return this.profilingGroupName;
    }

    /**
     * <p>
     * The name of the profiling group that is associated with the analysis data.
     * </p>
     * 
     * @param profilingGroupName
     *        The name of the profiling group that is associated with the analysis data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubmitFeedbackRequest withProfilingGroupName(String profilingGroupName) {
        setProfilingGroupName(profilingGroupName);
        return this;
    }

    /**
     * <p>
     * The feedback tpye. Thee are two valid values, <code>Positive</code> and <code>Negative</code>.
     * </p>
     * 
     * @param type
     *        The feedback tpye. Thee are two valid values, <code>Positive</code> and <code>Negative</code>.
     * @see FeedbackType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The feedback tpye. Thee are two valid values, <code>Positive</code> and <code>Negative</code>.
     * </p>
     * 
     * @return The feedback tpye. Thee are two valid values, <code>Positive</code> and <code>Negative</code>.
     * @see FeedbackType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The feedback tpye. Thee are two valid values, <code>Positive</code> and <code>Negative</code>.
     * </p>
     * 
     * @param type
     *        The feedback tpye. Thee are two valid values, <code>Positive</code> and <code>Negative</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeedbackType
     */

    public SubmitFeedbackRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The feedback tpye. Thee are two valid values, <code>Positive</code> and <code>Negative</code>.
     * </p>
     * 
     * @param type
     *        The feedback tpye. Thee are two valid values, <code>Positive</code> and <code>Negative</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeedbackType
     */

    public SubmitFeedbackRequest withType(FeedbackType type) {
        this.type = type.toString();
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
        if (getAnomalyInstanceId() != null)
            sb.append("AnomalyInstanceId: ").append(getAnomalyInstanceId()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getProfilingGroupName() != null)
            sb.append("ProfilingGroupName: ").append(getProfilingGroupName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubmitFeedbackRequest == false)
            return false;
        SubmitFeedbackRequest other = (SubmitFeedbackRequest) obj;
        if (other.getAnomalyInstanceId() == null ^ this.getAnomalyInstanceId() == null)
            return false;
        if (other.getAnomalyInstanceId() != null && other.getAnomalyInstanceId().equals(this.getAnomalyInstanceId()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getProfilingGroupName() == null ^ this.getProfilingGroupName() == null)
            return false;
        if (other.getProfilingGroupName() != null && other.getProfilingGroupName().equals(this.getProfilingGroupName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyInstanceId() == null) ? 0 : getAnomalyInstanceId().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getProfilingGroupName() == null) ? 0 : getProfilingGroupName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SubmitFeedbackRequest clone() {
        return (SubmitFeedbackRequest) super.clone();
    }

}
