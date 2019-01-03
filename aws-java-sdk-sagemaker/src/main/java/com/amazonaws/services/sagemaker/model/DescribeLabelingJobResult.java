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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeLabelingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLabelingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     */
    private String labelingJobStatus;
    /**
     * <p>
     * Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by machine,
     * the number of objects than couldn't be labeled, and the total number of objects labeled.
     * </p>
     */
    private LabelCounters labelCounters;
    /**
     * <p>
     * If the job failed, the reason that it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that the labeling job was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * A unique identifier for work done as part of a labeling job.
     * </p>
     */
    private String jobReferenceCode;
    /**
     * <p>
     * The name assigned to the labeling job when it was created.
     * </p>
     */
    private String labelingJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     */
    private String labelingJobArn;
    /**
     * <p>
     * The attribute used as the label in the output manifest file.
     * </p>
     */
    private String labelAttributeName;
    /**
     * <p>
     * Input configuration information for the labeling job, such as the Amazon S3 location of the data objects and the
     * location of the manifest file that describes the data objects.
     * </p>
     */
    private LabelingJobInputConfig inputConfig;
    /**
     * <p>
     * The location of the job's output data and the AWS Key Management Service key ID for the key used to encrypt the
     * output data, if any.
     * </p>
     */
    private LabelingJobOutputConfig outputConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     * labeling.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The S3 location of the JSON file that defines the categories used to label data objects.
     * </p>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     */
    private String labelCategoryConfigS3Uri;
    /**
     * <p>
     * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically
     * stopped.
     * </p>
     */
    private LabelingJobStoppingConditions stoppingConditions;
    /**
     * <p>
     * Configuration information for automated data labeling.
     * </p>
     */
    private LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig;
    /**
     * <p>
     * Configuration information required for human workers to complete a labeling task.
     * </p>
     */
    private HumanTaskConfig humanTaskConfig;
    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The location of the output produced by the labeling job.
     * </p>
     */
    private LabelingJobOutput labelingJobOutput;

    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     * 
     * @param labelingJobStatus
     *        The processing status of the labeling job.
     * @see LabelingJobStatus
     */

    public void setLabelingJobStatus(String labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus;
    }

    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     * 
     * @return The processing status of the labeling job.
     * @see LabelingJobStatus
     */

    public String getLabelingJobStatus() {
        return this.labelingJobStatus;
    }

    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     * 
     * @param labelingJobStatus
     *        The processing status of the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LabelingJobStatus
     */

    public DescribeLabelingJobResult withLabelingJobStatus(String labelingJobStatus) {
        setLabelingJobStatus(labelingJobStatus);
        return this;
    }

    /**
     * <p>
     * The processing status of the labeling job.
     * </p>
     * 
     * @param labelingJobStatus
     *        The processing status of the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LabelingJobStatus
     */

    public DescribeLabelingJobResult withLabelingJobStatus(LabelingJobStatus labelingJobStatus) {
        this.labelingJobStatus = labelingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by machine,
     * the number of objects than couldn't be labeled, and the total number of objects labeled.
     * </p>
     * 
     * @param labelCounters
     *        Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by
     *        machine, the number of objects than couldn't be labeled, and the total number of objects labeled.
     */

    public void setLabelCounters(LabelCounters labelCounters) {
        this.labelCounters = labelCounters;
    }

    /**
     * <p>
     * Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by machine,
     * the number of objects than couldn't be labeled, and the total number of objects labeled.
     * </p>
     * 
     * @return Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by
     *         machine, the number of objects than couldn't be labeled, and the total number of objects labeled.
     */

    public LabelCounters getLabelCounters() {
        return this.labelCounters;
    }

    /**
     * <p>
     * Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by machine,
     * the number of objects than couldn't be labeled, and the total number of objects labeled.
     * </p>
     * 
     * @param labelCounters
     *        Provides a breakdown of the number of data objects labeled by humans, the number of objects labeled by
     *        machine, the number of objects than couldn't be labeled, and the total number of objects labeled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withLabelCounters(LabelCounters labelCounters) {
        setLabelCounters(labelCounters);
        return this;
    }

    /**
     * <p>
     * If the job failed, the reason that it failed.
     * </p>
     * 
     * @param failureReason
     *        If the job failed, the reason that it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the job failed, the reason that it failed.
     * </p>
     * 
     * @return If the job failed, the reason that it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the job failed, the reason that it failed.
     * </p>
     * 
     * @param failureReason
     *        If the job failed, the reason that it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the labeling job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     * 
     * @return The date and time that the labeling job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the labeling job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the labeling job was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the labeling job was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was last updated.
     * </p>
     * 
     * @return The date and time that the labeling job was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the labeling job was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the labeling job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * A unique identifier for work done as part of a labeling job.
     * </p>
     * 
     * @param jobReferenceCode
     *        A unique identifier for work done as part of a labeling job.
     */

    public void setJobReferenceCode(String jobReferenceCode) {
        this.jobReferenceCode = jobReferenceCode;
    }

    /**
     * <p>
     * A unique identifier for work done as part of a labeling job.
     * </p>
     * 
     * @return A unique identifier for work done as part of a labeling job.
     */

    public String getJobReferenceCode() {
        return this.jobReferenceCode;
    }

    /**
     * <p>
     * A unique identifier for work done as part of a labeling job.
     * </p>
     * 
     * @param jobReferenceCode
     *        A unique identifier for work done as part of a labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withJobReferenceCode(String jobReferenceCode) {
        setJobReferenceCode(jobReferenceCode);
        return this;
    }

    /**
     * <p>
     * The name assigned to the labeling job when it was created.
     * </p>
     * 
     * @param labelingJobName
     *        The name assigned to the labeling job when it was created.
     */

    public void setLabelingJobName(String labelingJobName) {
        this.labelingJobName = labelingJobName;
    }

    /**
     * <p>
     * The name assigned to the labeling job when it was created.
     * </p>
     * 
     * @return The name assigned to the labeling job when it was created.
     */

    public String getLabelingJobName() {
        return this.labelingJobName;
    }

    /**
     * <p>
     * The name assigned to the labeling job when it was created.
     * </p>
     * 
     * @param labelingJobName
     *        The name assigned to the labeling job when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withLabelingJobName(String labelingJobName) {
        setLabelingJobName(labelingJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * 
     * @param labelingJobArn
     *        The Amazon Resource Name (ARN) of the labeling job.
     */

    public void setLabelingJobArn(String labelingJobArn) {
        this.labelingJobArn = labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the labeling job.
     */

    public String getLabelingJobArn() {
        return this.labelingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the labeling job.
     * </p>
     * 
     * @param labelingJobArn
     *        The Amazon Resource Name (ARN) of the labeling job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withLabelingJobArn(String labelingJobArn) {
        setLabelingJobArn(labelingJobArn);
        return this;
    }

    /**
     * <p>
     * The attribute used as the label in the output manifest file.
     * </p>
     * 
     * @param labelAttributeName
     *        The attribute used as the label in the output manifest file.
     */

    public void setLabelAttributeName(String labelAttributeName) {
        this.labelAttributeName = labelAttributeName;
    }

    /**
     * <p>
     * The attribute used as the label in the output manifest file.
     * </p>
     * 
     * @return The attribute used as the label in the output manifest file.
     */

    public String getLabelAttributeName() {
        return this.labelAttributeName;
    }

    /**
     * <p>
     * The attribute used as the label in the output manifest file.
     * </p>
     * 
     * @param labelAttributeName
     *        The attribute used as the label in the output manifest file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withLabelAttributeName(String labelAttributeName) {
        setLabelAttributeName(labelAttributeName);
        return this;
    }

    /**
     * <p>
     * Input configuration information for the labeling job, such as the Amazon S3 location of the data objects and the
     * location of the manifest file that describes the data objects.
     * </p>
     * 
     * @param inputConfig
     *        Input configuration information for the labeling job, such as the Amazon S3 location of the data objects
     *        and the location of the manifest file that describes the data objects.
     */

    public void setInputConfig(LabelingJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * Input configuration information for the labeling job, such as the Amazon S3 location of the data objects and the
     * location of the manifest file that describes the data objects.
     * </p>
     * 
     * @return Input configuration information for the labeling job, such as the Amazon S3 location of the data objects
     *         and the location of the manifest file that describes the data objects.
     */

    public LabelingJobInputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * Input configuration information for the labeling job, such as the Amazon S3 location of the data objects and the
     * location of the manifest file that describes the data objects.
     * </p>
     * 
     * @param inputConfig
     *        Input configuration information for the labeling job, such as the Amazon S3 location of the data objects
     *        and the location of the manifest file that describes the data objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withInputConfig(LabelingJobInputConfig inputConfig) {
        setInputConfig(inputConfig);
        return this;
    }

    /**
     * <p>
     * The location of the job's output data and the AWS Key Management Service key ID for the key used to encrypt the
     * output data, if any.
     * </p>
     * 
     * @param outputConfig
     *        The location of the job's output data and the AWS Key Management Service key ID for the key used to
     *        encrypt the output data, if any.
     */

    public void setOutputConfig(LabelingJobOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The location of the job's output data and the AWS Key Management Service key ID for the key used to encrypt the
     * output data, if any.
     * </p>
     * 
     * @return The location of the job's output data and the AWS Key Management Service key ID for the key used to
     *         encrypt the output data, if any.
     */

    public LabelingJobOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The location of the job's output data and the AWS Key Management Service key ID for the key used to encrypt the
     * output data, if any.
     * </p>
     * 
     * @param outputConfig
     *        The location of the job's output data and the AWS Key Management Service key ID for the key used to
     *        encrypt the output data, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withOutputConfig(LabelingJobOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     * labeling.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     *        labeling.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     * labeling.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     *         labeling.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     * labeling.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) that Amazon SageMaker assumes to perform tasks on your behalf during data
     *        labeling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The S3 location of the JSON file that defines the categories used to label data objects.
     * </p>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * 
     * @param labelCategoryConfigS3Uri
     *        The S3 location of the JSON file that defines the categories used to label data objects.</p>
     *        <p>
     *        The file is a JSON structure in the following format:
     *        </p>
     *        <p>
     *        <code>{</code>
     *        </p>
     *        <p>
     *        <code> "document-version": "2018-11-28"</code>
     *        </p>
     *        <p>
     *        <code> "labels": [</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label 1</i>"</code>
     *        </p>
     *        <p>
     *        <code> },</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label 2</i>"</code>
     *        </p>
     *        <p>
     *        <code> },</code>
     *        </p>
     *        <p>
     *        <code> ...</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label n</i>"</code>
     *        </p>
     *        <p>
     *        <code> }</code>
     *        </p>
     *        <p>
     *        <code> ]</code>
     *        </p>
     *        <p>
     *        <code>}</code>
     */

    public void setLabelCategoryConfigS3Uri(String labelCategoryConfigS3Uri) {
        this.labelCategoryConfigS3Uri = labelCategoryConfigS3Uri;
    }

    /**
     * <p>
     * The S3 location of the JSON file that defines the categories used to label data objects.
     * </p>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * 
     * @return The S3 location of the JSON file that defines the categories used to label data objects.</p>
     *         <p>
     *         The file is a JSON structure in the following format:
     *         </p>
     *         <p>
     *         <code>{</code>
     *         </p>
     *         <p>
     *         <code> "document-version": "2018-11-28"</code>
     *         </p>
     *         <p>
     *         <code> "labels": [</code>
     *         </p>
     *         <p>
     *         <code> {</code>
     *         </p>
     *         <p>
     *         <code> "label": "<i>label 1</i>"</code>
     *         </p>
     *         <p>
     *         <code> },</code>
     *         </p>
     *         <p>
     *         <code> {</code>
     *         </p>
     *         <p>
     *         <code> "label": "<i>label 2</i>"</code>
     *         </p>
     *         <p>
     *         <code> },</code>
     *         </p>
     *         <p>
     *         <code> ...</code>
     *         </p>
     *         <p>
     *         <code> {</code>
     *         </p>
     *         <p>
     *         <code> "label": "<i>label n</i>"</code>
     *         </p>
     *         <p>
     *         <code> }</code>
     *         </p>
     *         <p>
     *         <code> ]</code>
     *         </p>
     *         <p>
     *         <code>}</code>
     */

    public String getLabelCategoryConfigS3Uri() {
        return this.labelCategoryConfigS3Uri;
    }

    /**
     * <p>
     * The S3 location of the JSON file that defines the categories used to label data objects.
     * </p>
     * <p>
     * The file is a JSON structure in the following format:
     * </p>
     * <p>
     * <code>{</code>
     * </p>
     * <p>
     * <code> "document-version": "2018-11-28"</code>
     * </p>
     * <p>
     * <code> "labels": [</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 1</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label 2</i>"</code>
     * </p>
     * <p>
     * <code> },</code>
     * </p>
     * <p>
     * <code> ...</code>
     * </p>
     * <p>
     * <code> {</code>
     * </p>
     * <p>
     * <code> "label": "<i>label n</i>"</code>
     * </p>
     * <p>
     * <code> }</code>
     * </p>
     * <p>
     * <code> ]</code>
     * </p>
     * <p>
     * <code>}</code>
     * </p>
     * 
     * @param labelCategoryConfigS3Uri
     *        The S3 location of the JSON file that defines the categories used to label data objects.</p>
     *        <p>
     *        The file is a JSON structure in the following format:
     *        </p>
     *        <p>
     *        <code>{</code>
     *        </p>
     *        <p>
     *        <code> "document-version": "2018-11-28"</code>
     *        </p>
     *        <p>
     *        <code> "labels": [</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label 1</i>"</code>
     *        </p>
     *        <p>
     *        <code> },</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label 2</i>"</code>
     *        </p>
     *        <p>
     *        <code> },</code>
     *        </p>
     *        <p>
     *        <code> ...</code>
     *        </p>
     *        <p>
     *        <code> {</code>
     *        </p>
     *        <p>
     *        <code> "label": "<i>label n</i>"</code>
     *        </p>
     *        <p>
     *        <code> }</code>
     *        </p>
     *        <p>
     *        <code> ]</code>
     *        </p>
     *        <p>
     *        <code>}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withLabelCategoryConfigS3Uri(String labelCategoryConfigS3Uri) {
        setLabelCategoryConfigS3Uri(labelCategoryConfigS3Uri);
        return this;
    }

    /**
     * <p>
     * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically
     * stopped.
     * </p>
     * 
     * @param stoppingConditions
     *        A set of conditions for stopping a labeling job. If any of the conditions are met, the job is
     *        automatically stopped.
     */

    public void setStoppingConditions(LabelingJobStoppingConditions stoppingConditions) {
        this.stoppingConditions = stoppingConditions;
    }

    /**
     * <p>
     * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically
     * stopped.
     * </p>
     * 
     * @return A set of conditions for stopping a labeling job. If any of the conditions are met, the job is
     *         automatically stopped.
     */

    public LabelingJobStoppingConditions getStoppingConditions() {
        return this.stoppingConditions;
    }

    /**
     * <p>
     * A set of conditions for stopping a labeling job. If any of the conditions are met, the job is automatically
     * stopped.
     * </p>
     * 
     * @param stoppingConditions
     *        A set of conditions for stopping a labeling job. If any of the conditions are met, the job is
     *        automatically stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withStoppingConditions(LabelingJobStoppingConditions stoppingConditions) {
        setStoppingConditions(stoppingConditions);
        return this;
    }

    /**
     * <p>
     * Configuration information for automated data labeling.
     * </p>
     * 
     * @param labelingJobAlgorithmsConfig
     *        Configuration information for automated data labeling.
     */

    public void setLabelingJobAlgorithmsConfig(LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig) {
        this.labelingJobAlgorithmsConfig = labelingJobAlgorithmsConfig;
    }

    /**
     * <p>
     * Configuration information for automated data labeling.
     * </p>
     * 
     * @return Configuration information for automated data labeling.
     */

    public LabelingJobAlgorithmsConfig getLabelingJobAlgorithmsConfig() {
        return this.labelingJobAlgorithmsConfig;
    }

    /**
     * <p>
     * Configuration information for automated data labeling.
     * </p>
     * 
     * @param labelingJobAlgorithmsConfig
     *        Configuration information for automated data labeling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withLabelingJobAlgorithmsConfig(LabelingJobAlgorithmsConfig labelingJobAlgorithmsConfig) {
        setLabelingJobAlgorithmsConfig(labelingJobAlgorithmsConfig);
        return this;
    }

    /**
     * <p>
     * Configuration information required for human workers to complete a labeling task.
     * </p>
     * 
     * @param humanTaskConfig
     *        Configuration information required for human workers to complete a labeling task.
     */

    public void setHumanTaskConfig(HumanTaskConfig humanTaskConfig) {
        this.humanTaskConfig = humanTaskConfig;
    }

    /**
     * <p>
     * Configuration information required for human workers to complete a labeling task.
     * </p>
     * 
     * @return Configuration information required for human workers to complete a labeling task.
     */

    public HumanTaskConfig getHumanTaskConfig() {
        return this.humanTaskConfig;
    }

    /**
     * <p>
     * Configuration information required for human workers to complete a labeling task.
     * </p>
     * 
     * @param humanTaskConfig
     *        Configuration information required for human workers to complete a labeling task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withHumanTaskConfig(HumanTaskConfig humanTaskConfig) {
        setHumanTaskConfig(humanTaskConfig);
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return An array of key/value pairs. For more information, see <a
     *         href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *         >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key/value pairs. For more information, see <a
     *        href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key/value pairs. For more information, see <a
     *        href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key/value pairs. For more information, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what">Using
     * Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key/value pairs. For more information, see <a
     *        href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-what"
     *        >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLabelingJobResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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

    public DescribeLabelingJobResult withLabelingJobOutput(LabelingJobOutput labelingJobOutput) {
        setLabelingJobOutput(labelingJobOutput);
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
        if (getLabelingJobStatus() != null)
            sb.append("LabelingJobStatus: ").append(getLabelingJobStatus()).append(",");
        if (getLabelCounters() != null)
            sb.append("LabelCounters: ").append(getLabelCounters()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getJobReferenceCode() != null)
            sb.append("JobReferenceCode: ").append(getJobReferenceCode()).append(",");
        if (getLabelingJobName() != null)
            sb.append("LabelingJobName: ").append(getLabelingJobName()).append(",");
        if (getLabelingJobArn() != null)
            sb.append("LabelingJobArn: ").append(getLabelingJobArn()).append(",");
        if (getLabelAttributeName() != null)
            sb.append("LabelAttributeName: ").append(getLabelAttributeName()).append(",");
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getLabelCategoryConfigS3Uri() != null)
            sb.append("LabelCategoryConfigS3Uri: ").append(getLabelCategoryConfigS3Uri()).append(",");
        if (getStoppingConditions() != null)
            sb.append("StoppingConditions: ").append(getStoppingConditions()).append(",");
        if (getLabelingJobAlgorithmsConfig() != null)
            sb.append("LabelingJobAlgorithmsConfig: ").append(getLabelingJobAlgorithmsConfig()).append(",");
        if (getHumanTaskConfig() != null)
            sb.append("HumanTaskConfig: ").append(getHumanTaskConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLabelingJobOutput() != null)
            sb.append("LabelingJobOutput: ").append(getLabelingJobOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLabelingJobResult == false)
            return false;
        DescribeLabelingJobResult other = (DescribeLabelingJobResult) obj;
        if (other.getLabelingJobStatus() == null ^ this.getLabelingJobStatus() == null)
            return false;
        if (other.getLabelingJobStatus() != null && other.getLabelingJobStatus().equals(this.getLabelingJobStatus()) == false)
            return false;
        if (other.getLabelCounters() == null ^ this.getLabelCounters() == null)
            return false;
        if (other.getLabelCounters() != null && other.getLabelCounters().equals(this.getLabelCounters()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getJobReferenceCode() == null ^ this.getJobReferenceCode() == null)
            return false;
        if (other.getJobReferenceCode() != null && other.getJobReferenceCode().equals(this.getJobReferenceCode()) == false)
            return false;
        if (other.getLabelingJobName() == null ^ this.getLabelingJobName() == null)
            return false;
        if (other.getLabelingJobName() != null && other.getLabelingJobName().equals(this.getLabelingJobName()) == false)
            return false;
        if (other.getLabelingJobArn() == null ^ this.getLabelingJobArn() == null)
            return false;
        if (other.getLabelingJobArn() != null && other.getLabelingJobArn().equals(this.getLabelingJobArn()) == false)
            return false;
        if (other.getLabelAttributeName() == null ^ this.getLabelAttributeName() == null)
            return false;
        if (other.getLabelAttributeName() != null && other.getLabelAttributeName().equals(this.getLabelAttributeName()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLabelCategoryConfigS3Uri() == null ^ this.getLabelCategoryConfigS3Uri() == null)
            return false;
        if (other.getLabelCategoryConfigS3Uri() != null && other.getLabelCategoryConfigS3Uri().equals(this.getLabelCategoryConfigS3Uri()) == false)
            return false;
        if (other.getStoppingConditions() == null ^ this.getStoppingConditions() == null)
            return false;
        if (other.getStoppingConditions() != null && other.getStoppingConditions().equals(this.getStoppingConditions()) == false)
            return false;
        if (other.getLabelingJobAlgorithmsConfig() == null ^ this.getLabelingJobAlgorithmsConfig() == null)
            return false;
        if (other.getLabelingJobAlgorithmsConfig() != null && other.getLabelingJobAlgorithmsConfig().equals(this.getLabelingJobAlgorithmsConfig()) == false)
            return false;
        if (other.getHumanTaskConfig() == null ^ this.getHumanTaskConfig() == null)
            return false;
        if (other.getHumanTaskConfig() != null && other.getHumanTaskConfig().equals(this.getHumanTaskConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLabelingJobOutput() == null ^ this.getLabelingJobOutput() == null)
            return false;
        if (other.getLabelingJobOutput() != null && other.getLabelingJobOutput().equals(this.getLabelingJobOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelingJobStatus() == null) ? 0 : getLabelingJobStatus().hashCode());
        hashCode = prime * hashCode + ((getLabelCounters() == null) ? 0 : getLabelCounters().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getJobReferenceCode() == null) ? 0 : getJobReferenceCode().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobName() == null) ? 0 : getLabelingJobName().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobArn() == null) ? 0 : getLabelingJobArn().hashCode());
        hashCode = prime * hashCode + ((getLabelAttributeName() == null) ? 0 : getLabelAttributeName().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLabelCategoryConfigS3Uri() == null) ? 0 : getLabelCategoryConfigS3Uri().hashCode());
        hashCode = prime * hashCode + ((getStoppingConditions() == null) ? 0 : getStoppingConditions().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobAlgorithmsConfig() == null) ? 0 : getLabelingJobAlgorithmsConfig().hashCode());
        hashCode = prime * hashCode + ((getHumanTaskConfig() == null) ? 0 : getHumanTaskConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLabelingJobOutput() == null) ? 0 : getLabelingJobOutput().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLabelingJobResult clone() {
        try {
            return (DescribeLabelingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
