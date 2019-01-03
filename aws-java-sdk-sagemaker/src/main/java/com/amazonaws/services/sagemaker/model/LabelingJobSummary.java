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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information about a labeling job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the labeling job.
     * </p>
     */
    private String labelingJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
     * </p>
     */
    private String labelingJobArn;
    /**
     * <p>
     * The date and time that the job was created (timestamp).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that the job was last modified (timestamp).
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     */
    private String labelingJobStatus;
    /**
     * <p>
     * Counts showing the progress of the labeling job.
     * </p>
     */
    private LabelCounters labelCounters;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to the job.
     * </p>
     */
    private String workteamArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent to a
     * worker.
     * </p>
     */
    private String preHumanTaskLambdaArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual workers
     * into a label for a data object. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     * Consolidation</a>.
     * </p>
     */
    private String annotationConsolidationLambdaArn;
    /**
     * <p>
     * If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this field contains a description of the
     * error.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     */
    private LabelingJobOutput labelingJobOutput;
    /**
     * <p>
     * Input configuration for the labeling job.
     * </p>
     */
    private LabelingJobInputConfig inputConfig;

    /**
     * <p>
     * The name of the labeling job.
     * </p>
     * 
     * @param labelingJobName
     *        The name of the labeling job.
     */

    public void setLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job.
     * </p>
     * 
     * @return The name of the labeling job.
     */

    public String getLabelingJobName() {
        return this.labelingJobName;
    }

    /**
     * <p>
     * The name of the labeling job.
     * </p>
     * 
     * @param labelingJobName
     *        The name of the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withLabelingJobName(String labelingJobName) {
        setLabelingJobName(labelingJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
     * </p>
     * 
     * @param labelingJobArn
     *        The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
     */

    public void setLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
     */

    public String getLabelingJobArn() {
        return this.labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
     * </p>
     * 
     * @param labelingJobArn
     *        The Amazon Resource Name (ARN) assigned to the labeling job when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withLabelingJobArn(String labelingJobArn) {
        setLabelingJobArn(labelingJobArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the job was created (timestamp).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the job was created (timestamp).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the job was created (timestamp).
     * </p>
     * 
     * @return The date and time that the job was created (timestamp).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the job was created (timestamp).
     * </p>
     * 
     * @param creationTime
     *        The date and time that the job was created (timestamp).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the job was last modified (timestamp).
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the job was last modified (timestamp).
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the job was last modified (timestamp).
     * </p>
     * 
     * @return The date and time that the job was last modified (timestamp).
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the job was last modified (timestamp).
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the job was last modified (timestamp).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     * 
     * @param labelingJobStatus
     *        The current status of the labeling job.
     * @see LabelingJobStatus
     */

    public void setLabelingJobStatus(String labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus;
    }

    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     * 
     * @return The current status of the labeling job.
     * @see LabelingJobStatus
     */

    public String getLabelingJobStatus() {
        return this.labelingJobStatus;
    }

    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     * 
     * @param labelingJobStatus
     *        The current status of the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LabelingJobStatus
     */

    public LabelingJobSummary withLabelingJobStatus(String labelingJobStatus) {
        setLabelingJobStatus(labelingJobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the labeling job.
     * </p>
     * 
     * @param labelingJobStatus
     *        The current status of the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LabelingJobStatus
     */

    public LabelingJobSummary withLabelingJobStatus(LabelingJobStatus labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Counts showing the progress of the labeling job.
     * </p>
     * 
     * @param labelCounters
     *        Counts showing the progress of the labeling job.
     */

    public void setLabelCounters(LabelCounters labelCounters) {
        this.labelCounters = labelCounters;
    }

    /**
     * <p>
     * Counts showing the progress of the labeling job.
     * </p>
     * 
     * @return Counts showing the progress of the labeling job.
     */

    public LabelCounters getLabelCounters() {
        return this.labelCounters;
    }

    /**
     * <p>
     * Counts showing the progress of the labeling job.
     * </p>
     * 
     * @param labelCounters
     *        Counts showing the progress of the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withLabelCounters(LabelCounters labelCounters) {
        setLabelCounters(labelCounters);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to the job.
     * </p>
     * 
     * @param workteamArn
     *        The Amazon Resource Name (ARN) of the work team assigned to the job.
     */

    public void setWorkteamArn(String workteamArn) {
        this.workteamArn = workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the work team assigned to the job.
     */

    public String getWorkteamArn() {
        return this.workteamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the work team assigned to the job.
     * </p>
     * 
     * @param workteamArn
     *        The Amazon Resource Name (ARN) of the work team assigned to the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withWorkteamArn(String workteamArn) {
        setWorkteamArn(workteamArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent to a
     * worker.
     * </p>
     * 
     * @param preHumanTaskLambdaArn
     *        The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent
     *        to a worker.
     */

    public void setPreHumanTaskLambdaArn(String preHumanTaskLambdaArn) {
        this.preHumanTaskLambdaArn = preHumanTaskLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent to a
     * worker.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent
     *         to a worker.
     */

    public String getPreHumanTaskLambdaArn() {
        return this.preHumanTaskLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent to a
     * worker.
     * </p>
     * 
     * @param preHumanTaskLambdaArn
     *        The Amazon Resource Name (ARN) of a Lambda function. The function is run before each data object is sent
     *        to a worker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withPreHumanTaskLambdaArn(String preHumanTaskLambdaArn) {
        setPreHumanTaskLambdaArn(preHumanTaskLambdaArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual workers
     * into a label for a data object. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     * Consolidation</a>.
     * </p>
     * 
     * @param annotationConsolidationLambdaArn
     *        The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual
     *        workers into a label for a data object. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     *        Consolidation</a>.
     */

    public void setAnnotationConsolidationLambdaArn(String annotationConsolidationLambdaArn) {
        this.annotationConsolidationLambdaArn = annotationConsolidationLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual workers
     * into a label for a data object. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     * Consolidation</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual
     *         workers into a label for a data object. For more information, see <a
     *         href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     *         Consolidation</a>.
     */

    public String getAnnotationConsolidationLambdaArn() {
        return this.annotationConsolidationLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual workers
     * into a label for a data object. For more information, see <a
     * href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     * Consolidation</a>.
     * </p>
     * 
     * @param annotationConsolidationLambdaArn
     *        The Amazon Resource Name (ARN) of the Lambda function used to consolidate the annotations from individual
     *        workers into a label for a data object. For more information, see <a
     *        href="http://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html">Annotation
     *        Consolidation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withAnnotationConsolidationLambdaArn(String annotationConsolidationLambdaArn) {
        setAnnotationConsolidationLambdaArn(annotationConsolidationLambdaArn);
        return this;
    }

    /**
     * <p>
     * If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this field contains a description of the
     * error.
     * </p>
     * 
     * @param failureReason
     *        If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this field contains a description of
     *        the error.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this field contains a description of the
     * error.
     * </p>
     * 
     * @return If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this field contains a description of
     *         the error.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this field contains a description of the
     * error.
     * </p>
     * 
     * @param failureReason
     *        If the <code>LabelingJobStatus</code> field is <code>Failed</code>, this field contains a description of
     *        the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     * 
     * @param labelingJobOutput
     *        The location of the output produced by the labeling job.
     */

    public void setLabelingJobOutput(LabelingJobOutput labelingJobOutput) {
        this.labelingJobOutput = labelingJobOutput;
    }

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     * 
     * @return The location of the output produced by the labeling job.
     */

    public LabelingJobOutput getLabelingJobOutput() {
        return this.labelingJobOutput;
    }

    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     * 
     * @param labelingJobOutput
     *        The location of the output produced by the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withLabelingJobOutput(LabelingJobOutput labelingJobOutput) {
        setLabelingJobOutput(labelingJobOutput);
        return this;
    }

    /**
     * <p>
     * Input configuration for the labeling job.
     * </p>
     * 
     * @param inputConfig
     *        Input configuration for the labeling job.
     */

    public void setInputConfig(LabelingJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Input configuration for the labeling job.
     * </p>
     * 
     * @return Input configuration for the labeling job.
     */

    public LabelingJobInputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * Input configuration for the labeling job.
     * </p>
     * 
     * @param inputConfig
     *        Input configuration for the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobSummary withInputConfig(LabelingJobInputConfig inputConfig) {
        setInputConfig(inputConfig);
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
        if (getLabelingJobName() != null)
            sb.append("LabelingJobName: ").append(getLabelingJobName()).append(",");
        if (getLabelingJobArn() != null)
            sb.append("LabelingJobArn: ").append(getLabelingJobArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLabelingJobStatus() != null)
            sb.append("LabelingJobStatus: ").append(getLabelingJobStatus()).append(",");
        if (getLabelCounters() != null)
            sb.append("LabelCounters: ").append(getLabelCounters()).append(",");
        if (getWorkteamArn() != null)
            sb.append("WorkteamArn: ").append(getWorkteamArn()).append(",");
        if (getPreHumanTaskLambdaArn() != null)
            sb.append("PreHumanTaskLambdaArn: ").append(getPreHumanTaskLambdaArn()).append(",");
        if (getAnnotationConsolidationLambdaArn() != null)
            sb.append("AnnotationConsolidationLambdaArn: ").append(getAnnotationConsolidationLambdaArn()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getLabelingJobOutput() != null)
            sb.append("LabelingJobOutput: ").append(getLabelingJobOutput()).append(",");
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobSummary == false)
            return false;
        LabelingJobSummary other = (LabelingJobSummary) obj;
        if (other.getLabelingJobName() == null ^ this.getLabelingJobName() == null)
            return false;
        if (other.getLabelingJobName() != null && other.getLabelingJobName().equals(this.getLabelingJobName()) == false)
            return false;
        if (other.getLabelingJobArn() == null ^ this.getLabelingJobArn() == null)
            return false;
        if (other.getLabelingJobArn() != null && other.getLabelingJobArn().equals(this.getLabelingJobArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLabelingJobStatus() == null ^ this.getLabelingJobStatus() == null)
            return false;
        if (other.getLabelingJobStatus() != null && other.getLabelingJobStatus().equals(this.getLabelingJobStatus()) == false)
            return false;
        if (other.getLabelCounters() == null ^ this.getLabelCounters() == null)
            return false;
        if (other.getLabelCounters() != null && other.getLabelCounters().equals(this.getLabelCounters()) == false)
            return false;
        if (other.getWorkteamArn() == null ^ this.getWorkteamArn() == null)
            return false;
        if (other.getWorkteamArn() != null && other.getWorkteamArn().equals(this.getWorkteamArn()) == false)
            return false;
        if (other.getPreHumanTaskLambdaArn() == null ^ this.getPreHumanTaskLambdaArn() == null)
            return false;
        if (other.getPreHumanTaskLambdaArn() != null && other.getPreHumanTaskLambdaArn().equals(this.getPreHumanTaskLambdaArn()) == false)
            return false;
        if (other.getAnnotationConsolidationLambdaArn() == null ^ this.getAnnotationConsolidationLambdaArn() == null)
            return false;
        if (other.getAnnotationConsolidationLambdaArn() != null
                && other.getAnnotationConsolidationLambdaArn().equals(this.getAnnotationConsolidationLambdaArn()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getLabelingJobOutput() == null ^ this.getLabelingJobOutput() == null)
            return false;
        if (other.getLabelingJobOutput() != null && other.getLabelingJobOutput().equals(this.getLabelingJobOutput()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelingJobName() == null) ? 0 : getLabelingJobName().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobArn() == null) ? 0 : getLabelingJobArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobStatus() == null) ? 0 : getLabelingJobStatus().hashCode());
        hashCode = prime * hashCode + ((getLabelCounters() == null) ? 0 : getLabelCounters().hashCode());
        hashCode = prime * hashCode + ((getWorkteamArn() == null) ? 0 : getWorkteamArn().hashCode());
        hashCode = prime * hashCode + ((getPreHumanTaskLambdaArn() == null) ? 0 : getPreHumanTaskLambdaArn().hashCode());
        hashCode = prime * hashCode + ((getAnnotationConsolidationLambdaArn() == null) ? 0 : getAnnotationConsolidationLambdaArn().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobOutput() == null) ? 0 : getLabelingJobOutput().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobSummary clone() {
        try {
            return (LabelingJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
