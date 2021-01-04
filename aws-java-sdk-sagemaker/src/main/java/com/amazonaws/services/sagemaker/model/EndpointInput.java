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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Input object for the endpoint
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EndpointInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the container.
     * </p>
     */
    private String localPath;
    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     * monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     */
    private String s3InputMode;
    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     * <code>FullyReplicated</code>
     * </p>
     */
    private String s3DataDistributionType;
    /**
     * <p>
     * The attributes of the input data that are the input features.
     * </p>
     */
    private String featuresAttribute;
    /**
     * <p>
     * The attribute of the input data that represents the ground truth label.
     * </p>
     */
    private String inferenceAttribute;
    /**
     * <p>
     * In a classification problem, the attribute that represents the class probability.
     * </p>
     */
    private String probabilityAttribute;
    /**
     * <p>
     * The threshold for the class probability to be evaluated as a positive result.
     * </p>
     */
    private Double probabilityThresholdAttribute;
    /**
     * <p>
     * If specified, monitoring jobs substract this time from the start time. For information about using offsets for
     * scheduling monitoring jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule Model
     * Quality Monitoring Jobs</a>.
     * </p>
     */
    private String startTimeOffset;
    /**
     * <p>
     * If specified, monitoring jobs substract this time from the end time. For information about using offsets for
     * scheduling monitoring jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule Model
     * Quality Monitoring Jobs</a>.
     * </p>
     */
    private String endTimeOffset;

    /**
     * <p>
     * An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     * </p>
     * 
     * @param endpointName
     *        An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     * </p>
     * 
     * @return An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     * </p>
     * 
     * @param endpointName
     *        An endpoint in customer's account which has enabled <code>DataCaptureConfig</code> enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInput withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the container.
     * </p>
     * 
     * @param localPath
     *        Path to the filesystem where the endpoint data is available to the container.
     */

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the container.
     * </p>
     * 
     * @return Path to the filesystem where the endpoint data is available to the container.
     */

    public String getLocalPath() {
        return this.localPath;
    }

    /**
     * <p>
     * Path to the filesystem where the endpoint data is available to the container.
     * </p>
     * 
     * @param localPath
     *        Path to the filesystem where the endpoint data is available to the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInput withLocalPath(String localPath) {
        setLocalPath(localPath);
        return this;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     * monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * 
     * @param s3InputMode
     *        Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     *        monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful
     *        for small files that fit in memory. Defaults to <code>File</code>.
     * @see ProcessingS3InputMode
     */

    public void setS3InputMode(String s3InputMode) {
        this.s3InputMode = s3InputMode;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     * monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * 
     * @return Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     *         monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is
     *         useful for small files that fit in memory. Defaults to <code>File</code>.
     * @see ProcessingS3InputMode
     */

    public String getS3InputMode() {
        return this.s3InputMode;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     * monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * 
     * @param s3InputMode
     *        Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     *        monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful
     *        for small files that fit in memory. Defaults to <code>File</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3InputMode
     */

    public EndpointInput withS3InputMode(String s3InputMode) {
        setS3InputMode(s3InputMode);
        return this;
    }

    /**
     * <p>
     * Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     * monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful for
     * small files that fit in memory. Defaults to <code>File</code>.
     * </p>
     * 
     * @param s3InputMode
     *        Whether the <code>Pipe</code> or <code>File</code> is used as the input mode for transfering data for the
     *        monitoring job. <code>Pipe</code> mode is recommended for large datasets. <code>File</code> mode is useful
     *        for small files that fit in memory. Defaults to <code>File</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3InputMode
     */

    public EndpointInput withS3InputMode(ProcessingS3InputMode s3InputMode) {
        this.s3InputMode = s3InputMode.toString();
        return this;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     * <code>FullyReplicated</code>
     * </p>
     * 
     * @param s3DataDistributionType
     *        Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     *        <code>FullyReplicated</code>
     * @see ProcessingS3DataDistributionType
     */

    public void setS3DataDistributionType(String s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     * <code>FullyReplicated</code>
     * </p>
     * 
     * @return Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     *         <code>FullyReplicated</code>
     * @see ProcessingS3DataDistributionType
     */

    public String getS3DataDistributionType() {
        return this.s3DataDistributionType;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     * <code>FullyReplicated</code>
     * </p>
     * 
     * @param s3DataDistributionType
     *        Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     *        <code>FullyReplicated</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3DataDistributionType
     */

    public EndpointInput withS3DataDistributionType(String s3DataDistributionType) {
        setS3DataDistributionType(s3DataDistributionType);
        return this;
    }

    /**
     * <p>
     * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     * <code>FullyReplicated</code>
     * </p>
     * 
     * @param s3DataDistributionType
     *        Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to
     *        <code>FullyReplicated</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingS3DataDistributionType
     */

    public EndpointInput withS3DataDistributionType(ProcessingS3DataDistributionType s3DataDistributionType) {
        this.s3DataDistributionType = s3DataDistributionType.toString();
        return this;
    }

    /**
     * <p>
     * The attributes of the input data that are the input features.
     * </p>
     * 
     * @param featuresAttribute
     *        The attributes of the input data that are the input features.
     */

    public void setFeaturesAttribute(String featuresAttribute) {
        this.featuresAttribute = featuresAttribute;
    }

    /**
     * <p>
     * The attributes of the input data that are the input features.
     * </p>
     * 
     * @return The attributes of the input data that are the input features.
     */

    public String getFeaturesAttribute() {
        return this.featuresAttribute;
    }

    /**
     * <p>
     * The attributes of the input data that are the input features.
     * </p>
     * 
     * @param featuresAttribute
     *        The attributes of the input data that are the input features.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInput withFeaturesAttribute(String featuresAttribute) {
        setFeaturesAttribute(featuresAttribute);
        return this;
    }

    /**
     * <p>
     * The attribute of the input data that represents the ground truth label.
     * </p>
     * 
     * @param inferenceAttribute
     *        The attribute of the input data that represents the ground truth label.
     */

    public void setInferenceAttribute(String inferenceAttribute) {
        this.inferenceAttribute = inferenceAttribute;
    }

    /**
     * <p>
     * The attribute of the input data that represents the ground truth label.
     * </p>
     * 
     * @return The attribute of the input data that represents the ground truth label.
     */

    public String getInferenceAttribute() {
        return this.inferenceAttribute;
    }

    /**
     * <p>
     * The attribute of the input data that represents the ground truth label.
     * </p>
     * 
     * @param inferenceAttribute
     *        The attribute of the input data that represents the ground truth label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInput withInferenceAttribute(String inferenceAttribute) {
        setInferenceAttribute(inferenceAttribute);
        return this;
    }

    /**
     * <p>
     * In a classification problem, the attribute that represents the class probability.
     * </p>
     * 
     * @param probabilityAttribute
     *        In a classification problem, the attribute that represents the class probability.
     */

    public void setProbabilityAttribute(String probabilityAttribute) {
        this.probabilityAttribute = probabilityAttribute;
    }

    /**
     * <p>
     * In a classification problem, the attribute that represents the class probability.
     * </p>
     * 
     * @return In a classification problem, the attribute that represents the class probability.
     */

    public String getProbabilityAttribute() {
        return this.probabilityAttribute;
    }

    /**
     * <p>
     * In a classification problem, the attribute that represents the class probability.
     * </p>
     * 
     * @param probabilityAttribute
     *        In a classification problem, the attribute that represents the class probability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInput withProbabilityAttribute(String probabilityAttribute) {
        setProbabilityAttribute(probabilityAttribute);
        return this;
    }

    /**
     * <p>
     * The threshold for the class probability to be evaluated as a positive result.
     * </p>
     * 
     * @param probabilityThresholdAttribute
     *        The threshold for the class probability to be evaluated as a positive result.
     */

    public void setProbabilityThresholdAttribute(Double probabilityThresholdAttribute) {
        this.probabilityThresholdAttribute = probabilityThresholdAttribute;
    }

    /**
     * <p>
     * The threshold for the class probability to be evaluated as a positive result.
     * </p>
     * 
     * @return The threshold for the class probability to be evaluated as a positive result.
     */

    public Double getProbabilityThresholdAttribute() {
        return this.probabilityThresholdAttribute;
    }

    /**
     * <p>
     * The threshold for the class probability to be evaluated as a positive result.
     * </p>
     * 
     * @param probabilityThresholdAttribute
     *        The threshold for the class probability to be evaluated as a positive result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInput withProbabilityThresholdAttribute(Double probabilityThresholdAttribute) {
        setProbabilityThresholdAttribute(probabilityThresholdAttribute);
        return this;
    }

    /**
     * <p>
     * If specified, monitoring jobs substract this time from the start time. For information about using offsets for
     * scheduling monitoring jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule Model
     * Quality Monitoring Jobs</a>.
     * </p>
     * 
     * @param startTimeOffset
     *        If specified, monitoring jobs substract this time from the start time. For information about using offsets
     *        for scheduling monitoring jobs, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule
     *        Model Quality Monitoring Jobs</a>.
     */

    public void setStartTimeOffset(String startTimeOffset) {
        this.startTimeOffset = startTimeOffset;
    }

    /**
     * <p>
     * If specified, monitoring jobs substract this time from the start time. For information about using offsets for
     * scheduling monitoring jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule Model
     * Quality Monitoring Jobs</a>.
     * </p>
     * 
     * @return If specified, monitoring jobs substract this time from the start time. For information about using
     *         offsets for scheduling monitoring jobs, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule
     *         Model Quality Monitoring Jobs</a>.
     */

    public String getStartTimeOffset() {
        return this.startTimeOffset;
    }

    /**
     * <p>
     * If specified, monitoring jobs substract this time from the start time. For information about using offsets for
     * scheduling monitoring jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule Model
     * Quality Monitoring Jobs</a>.
     * </p>
     * 
     * @param startTimeOffset
     *        If specified, monitoring jobs substract this time from the start time. For information about using offsets
     *        for scheduling monitoring jobs, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule
     *        Model Quality Monitoring Jobs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInput withStartTimeOffset(String startTimeOffset) {
        setStartTimeOffset(startTimeOffset);
        return this;
    }

    /**
     * <p>
     * If specified, monitoring jobs substract this time from the end time. For information about using offsets for
     * scheduling monitoring jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule Model
     * Quality Monitoring Jobs</a>.
     * </p>
     * 
     * @param endTimeOffset
     *        If specified, monitoring jobs substract this time from the end time. For information about using offsets
     *        for scheduling monitoring jobs, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule
     *        Model Quality Monitoring Jobs</a>.
     */

    public void setEndTimeOffset(String endTimeOffset) {
        this.endTimeOffset = endTimeOffset;
    }

    /**
     * <p>
     * If specified, monitoring jobs substract this time from the end time. For information about using offsets for
     * scheduling monitoring jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule Model
     * Quality Monitoring Jobs</a>.
     * </p>
     * 
     * @return If specified, monitoring jobs substract this time from the end time. For information about using offsets
     *         for scheduling monitoring jobs, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule
     *         Model Quality Monitoring Jobs</a>.
     */

    public String getEndTimeOffset() {
        return this.endTimeOffset;
    }

    /**
     * <p>
     * If specified, monitoring jobs substract this time from the end time. For information about using offsets for
     * scheduling monitoring jobs, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule Model
     * Quality Monitoring Jobs</a>.
     * </p>
     * 
     * @param endTimeOffset
     *        If specified, monitoring jobs substract this time from the end time. For information about using offsets
     *        for scheduling monitoring jobs, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-model-quality-schedule.html">Schedule
     *        Model Quality Monitoring Jobs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointInput withEndTimeOffset(String endTimeOffset) {
        setEndTimeOffset(endTimeOffset);
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getLocalPath() != null)
            sb.append("LocalPath: ").append(getLocalPath()).append(",");
        if (getS3InputMode() != null)
            sb.append("S3InputMode: ").append(getS3InputMode()).append(",");
        if (getS3DataDistributionType() != null)
            sb.append("S3DataDistributionType: ").append(getS3DataDistributionType()).append(",");
        if (getFeaturesAttribute() != null)
            sb.append("FeaturesAttribute: ").append(getFeaturesAttribute()).append(",");
        if (getInferenceAttribute() != null)
            sb.append("InferenceAttribute: ").append(getInferenceAttribute()).append(",");
        if (getProbabilityAttribute() != null)
            sb.append("ProbabilityAttribute: ").append(getProbabilityAttribute()).append(",");
        if (getProbabilityThresholdAttribute() != null)
            sb.append("ProbabilityThresholdAttribute: ").append(getProbabilityThresholdAttribute()).append(",");
        if (getStartTimeOffset() != null)
            sb.append("StartTimeOffset: ").append(getStartTimeOffset()).append(",");
        if (getEndTimeOffset() != null)
            sb.append("EndTimeOffset: ").append(getEndTimeOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointInput == false)
            return false;
        EndpointInput other = (EndpointInput) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getLocalPath() == null ^ this.getLocalPath() == null)
            return false;
        if (other.getLocalPath() != null && other.getLocalPath().equals(this.getLocalPath()) == false)
            return false;
        if (other.getS3InputMode() == null ^ this.getS3InputMode() == null)
            return false;
        if (other.getS3InputMode() != null && other.getS3InputMode().equals(this.getS3InputMode()) == false)
            return false;
        if (other.getS3DataDistributionType() == null ^ this.getS3DataDistributionType() == null)
            return false;
        if (other.getS3DataDistributionType() != null && other.getS3DataDistributionType().equals(this.getS3DataDistributionType()) == false)
            return false;
        if (other.getFeaturesAttribute() == null ^ this.getFeaturesAttribute() == null)
            return false;
        if (other.getFeaturesAttribute() != null && other.getFeaturesAttribute().equals(this.getFeaturesAttribute()) == false)
            return false;
        if (other.getInferenceAttribute() == null ^ this.getInferenceAttribute() == null)
            return false;
        if (other.getInferenceAttribute() != null && other.getInferenceAttribute().equals(this.getInferenceAttribute()) == false)
            return false;
        if (other.getProbabilityAttribute() == null ^ this.getProbabilityAttribute() == null)
            return false;
        if (other.getProbabilityAttribute() != null && other.getProbabilityAttribute().equals(this.getProbabilityAttribute()) == false)
            return false;
        if (other.getProbabilityThresholdAttribute() == null ^ this.getProbabilityThresholdAttribute() == null)
            return false;
        if (other.getProbabilityThresholdAttribute() != null
                && other.getProbabilityThresholdAttribute().equals(this.getProbabilityThresholdAttribute()) == false)
            return false;
        if (other.getStartTimeOffset() == null ^ this.getStartTimeOffset() == null)
            return false;
        if (other.getStartTimeOffset() != null && other.getStartTimeOffset().equals(this.getStartTimeOffset()) == false)
            return false;
        if (other.getEndTimeOffset() == null ^ this.getEndTimeOffset() == null)
            return false;
        if (other.getEndTimeOffset() != null && other.getEndTimeOffset().equals(this.getEndTimeOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getLocalPath() == null) ? 0 : getLocalPath().hashCode());
        hashCode = prime * hashCode + ((getS3InputMode() == null) ? 0 : getS3InputMode().hashCode());
        hashCode = prime * hashCode + ((getS3DataDistributionType() == null) ? 0 : getS3DataDistributionType().hashCode());
        hashCode = prime * hashCode + ((getFeaturesAttribute() == null) ? 0 : getFeaturesAttribute().hashCode());
        hashCode = prime * hashCode + ((getInferenceAttribute() == null) ? 0 : getInferenceAttribute().hashCode());
        hashCode = prime * hashCode + ((getProbabilityAttribute() == null) ? 0 : getProbabilityAttribute().hashCode());
        hashCode = prime * hashCode + ((getProbabilityThresholdAttribute() == null) ? 0 : getProbabilityThresholdAttribute().hashCode());
        hashCode = prime * hashCode + ((getStartTimeOffset() == null) ? 0 : getStartTimeOffset().hashCode());
        hashCode = prime * hashCode + ((getEndTimeOffset() == null) ? 0 : getEndTimeOffset().hashCode());
        return hashCode;
    }

    @Override
    public EndpointInput clone() {
        try {
            return (EndpointInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EndpointInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
