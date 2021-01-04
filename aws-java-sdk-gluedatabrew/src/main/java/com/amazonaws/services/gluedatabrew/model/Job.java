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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents all of the attributes of an AWS Glue DataBrew job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/Job" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the AWS account that owns the job.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The identifier (the user name) of the user who created the job.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time that the job was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * A dataset that the job is to process.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect a job.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * The encryption mode for the job, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSE-KMS</code> - Server-side encryption with AWS KMS-managed keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     * </p>
     * </li>
     * </ul>
     */
    private String encryptionMode;
    /**
     * <p>
     * The unique name of the job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The job type of the job, which must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROFILE</code> - A job to analyze a dataset, to determine its size, data types, data distribution, and
     * more.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECIPE</code> - A job to apply one or more transformations to a dataset.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The identifier (the user name) of the user who last modified the job.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The modification date and time of the job.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The current status of Amazon CloudWatch logging for the job.
     * </p>
     */
    private String logSubscription;
    /**
     * <p>
     * The maximum number of nodes that can be consumed when the job processes data.
     * </p>
     */
    private Integer maxCapacity;
    /**
     * <p>
     * The maximum number of times to retry the job after a job run fails.
     * </p>
     */
    private Integer maxRetries;
    /**
     * <p>
     * One or more artifacts that represent output from running the job.
     * </p>
     */
    private java.util.List<Output> outputs;
    /**
     * <p>
     * The name of the project that the job is associated with.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * A set of steps that the job runs.
     * </p>
     */
    private RecipeReference recipeReference;
    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the job.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that will be assumed for this job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of
     * <code>TIMEOUT</code>.
     * </p>
     */
    private Integer timeout;
    /**
     * <p>
     * Metadata tags that have been applied to the job.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the AWS account that owns the job.
     * </p>
     * 
     * @param accountId
     *        The ID of the AWS account that owns the job.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the job.
     * </p>
     * 
     * @return The ID of the AWS account that owns the job.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the job.
     * </p>
     * 
     * @param accountId
     *        The ID of the AWS account that owns the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The identifier (the user name) of the user who created the job.
     * </p>
     * 
     * @param createdBy
     *        The identifier (the user name) of the user who created the job.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The identifier (the user name) of the user who created the job.
     * </p>
     * 
     * @return The identifier (the user name) of the user who created the job.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The identifier (the user name) of the user who created the job.
     * </p>
     * 
     * @param createdBy
     *        The identifier (the user name) of the user who created the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time that the job was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the job was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the job was created.
     * </p>
     * 
     * @return The date and time that the job was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time that the job was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * A dataset that the job is to process.
     * </p>
     * 
     * @param datasetName
     *        A dataset that the job is to process.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * A dataset that the job is to process.
     * </p>
     * 
     * @return A dataset that the job is to process.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * A dataset that the job is to process.
     * </p>
     * 
     * @param datasetName
     *        A dataset that the job is to process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect a job.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) of an encryption key that is used to protect a job.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect a job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an encryption key that is used to protect a job.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect a job.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) of an encryption key that is used to protect a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The encryption mode for the job, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSE-KMS</code> - Server-side encryption with AWS KMS-managed keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionMode
     *        The encryption mode for the job, which can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SSE-KMS</code> - Server-side encryption with AWS KMS-managed keys.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     *        </p>
     *        </li>
     * @see EncryptionMode
     */

    public void setEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
    }

    /**
     * <p>
     * The encryption mode for the job, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSE-KMS</code> - Server-side encryption with AWS KMS-managed keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The encryption mode for the job, which can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SSE-KMS</code> - Server-side encryption with AWS KMS-managed keys.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     *         </p>
     *         </li>
     * @see EncryptionMode
     */

    public String getEncryptionMode() {
        return this.encryptionMode;
    }

    /**
     * <p>
     * The encryption mode for the job, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSE-KMS</code> - Server-side encryption with AWS KMS-managed keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionMode
     *        The encryption mode for the job, which can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SSE-KMS</code> - Server-side encryption with AWS KMS-managed keys.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionMode
     */

    public Job withEncryptionMode(String encryptionMode) {
        setEncryptionMode(encryptionMode);
        return this;
    }

    /**
     * <p>
     * The encryption mode for the job, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSE-KMS</code> - Server-side encryption with AWS KMS-managed keys.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionMode
     *        The encryption mode for the job, which can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SSE-KMS</code> - Server-side encryption with AWS KMS-managed keys.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionMode
     */

    public Job withEncryptionMode(EncryptionMode encryptionMode) {
        this.encryptionMode = encryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * The unique name of the job.
     * </p>
     * 
     * @param name
     *        The unique name of the job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The unique name of the job.
     * </p>
     * 
     * @return The unique name of the job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The unique name of the job.
     * </p>
     * 
     * @param name
     *        The unique name of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The job type of the job, which must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROFILE</code> - A job to analyze a dataset, to determine its size, data types, data distribution, and
     * more.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECIPE</code> - A job to apply one or more transformations to a dataset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The job type of the job, which must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROFILE</code> - A job to analyze a dataset, to determine its size, data types, data distribution,
     *        and more.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECIPE</code> - A job to apply one or more transformations to a dataset.
     *        </p>
     *        </li>
     * @see JobType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The job type of the job, which must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROFILE</code> - A job to analyze a dataset, to determine its size, data types, data distribution, and
     * more.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECIPE</code> - A job to apply one or more transformations to a dataset.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The job type of the job, which must be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROFILE</code> - A job to analyze a dataset, to determine its size, data types, data distribution,
     *         and more.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RECIPE</code> - A job to apply one or more transformations to a dataset.
     *         </p>
     *         </li>
     * @see JobType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The job type of the job, which must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROFILE</code> - A job to analyze a dataset, to determine its size, data types, data distribution, and
     * more.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECIPE</code> - A job to apply one or more transformations to a dataset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The job type of the job, which must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROFILE</code> - A job to analyze a dataset, to determine its size, data types, data distribution,
     *        and more.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECIPE</code> - A job to apply one or more transformations to a dataset.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public Job withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The job type of the job, which must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROFILE</code> - A job to analyze a dataset, to determine its size, data types, data distribution, and
     * more.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECIPE</code> - A job to apply one or more transformations to a dataset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The job type of the job, which must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROFILE</code> - A job to analyze a dataset, to determine its size, data types, data distribution,
     *        and more.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECIPE</code> - A job to apply one or more transformations to a dataset.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public Job withType(JobType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The identifier (the user name) of the user who last modified the job.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (the user name) of the user who last modified the job.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (the user name) of the user who last modified the job.
     * </p>
     * 
     * @return The identifier (the user name) of the user who last modified the job.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (the user name) of the user who last modified the job.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (the user name) of the user who last modified the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The modification date and time of the job.
     * </p>
     * 
     * @param lastModifiedDate
     *        The modification date and time of the job.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The modification date and time of the job.
     * </p>
     * 
     * @return The modification date and time of the job.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The modification date and time of the job.
     * </p>
     * 
     * @param lastModifiedDate
     *        The modification date and time of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The current status of Amazon CloudWatch logging for the job.
     * </p>
     * 
     * @param logSubscription
     *        The current status of Amazon CloudWatch logging for the job.
     * @see LogSubscription
     */

    public void setLogSubscription(String logSubscription) {
        this.logSubscription = logSubscription;
    }

    /**
     * <p>
     * The current status of Amazon CloudWatch logging for the job.
     * </p>
     * 
     * @return The current status of Amazon CloudWatch logging for the job.
     * @see LogSubscription
     */

    public String getLogSubscription() {
        return this.logSubscription;
    }

    /**
     * <p>
     * The current status of Amazon CloudWatch logging for the job.
     * </p>
     * 
     * @param logSubscription
     *        The current status of Amazon CloudWatch logging for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogSubscription
     */

    public Job withLogSubscription(String logSubscription) {
        setLogSubscription(logSubscription);
        return this;
    }

    /**
     * <p>
     * The current status of Amazon CloudWatch logging for the job.
     * </p>
     * 
     * @param logSubscription
     *        The current status of Amazon CloudWatch logging for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogSubscription
     */

    public Job withLogSubscription(LogSubscription logSubscription) {
        this.logSubscription = logSubscription.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of nodes that can be consumed when the job processes data.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum number of nodes that can be consumed when the job processes data.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum number of nodes that can be consumed when the job processes data.
     * </p>
     * 
     * @return The maximum number of nodes that can be consumed when the job processes data.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum number of nodes that can be consumed when the job processes data.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum number of nodes that can be consumed when the job processes data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry the job after a job run fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry the job after a job run fails.
     */

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry the job after a job run fails.
     * </p>
     * 
     * @return The maximum number of times to retry the job after a job run fails.
     */

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry the job after a job run fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry the job after a job run fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withMaxRetries(Integer maxRetries) {
        setMaxRetries(maxRetries);
        return this;
    }

    /**
     * <p>
     * One or more artifacts that represent output from running the job.
     * </p>
     * 
     * @return One or more artifacts that represent output from running the job.
     */

    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * One or more artifacts that represent output from running the job.
     * </p>
     * 
     * @param outputs
     *        One or more artifacts that represent output from running the job.
     */

    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * <p>
     * One or more artifacts that represent output from running the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        One or more artifacts that represent output from running the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withOutputs(Output... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<Output>(outputs.length));
        }
        for (Output ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more artifacts that represent output from running the job.
     * </p>
     * 
     * @param outputs
     *        One or more artifacts that represent output from running the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The name of the project that the job is associated with.
     * </p>
     * 
     * @param projectName
     *        The name of the project that the job is associated with.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that the job is associated with.
     * </p>
     * 
     * @return The name of the project that the job is associated with.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that the job is associated with.
     * </p>
     * 
     * @param projectName
     *        The name of the project that the job is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * A set of steps that the job runs.
     * </p>
     * 
     * @param recipeReference
     *        A set of steps that the job runs.
     */

    public void setRecipeReference(RecipeReference recipeReference) {
        this.recipeReference = recipeReference;
    }

    /**
     * <p>
     * A set of steps that the job runs.
     * </p>
     * 
     * @return A set of steps that the job runs.
     */

    public RecipeReference getRecipeReference() {
        return this.recipeReference;
    }

    /**
     * <p>
     * A set of steps that the job runs.
     * </p>
     * 
     * @param recipeReference
     *        A set of steps that the job runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withRecipeReference(RecipeReference recipeReference) {
        setRecipeReference(recipeReference);
        return this;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the job.
     * </p>
     * 
     * @param resourceArn
     *        The unique Amazon Resource Name (ARN) for the job.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the job.
     * </p>
     * 
     * @return The unique Amazon Resource Name (ARN) for the job.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) for the job.
     * </p>
     * 
     * @param resourceArn
     *        The unique Amazon Resource Name (ARN) for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that will be assumed for this job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that will be assumed for this job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that will be assumed for this job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that will be assumed for this job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that will be assumed for this job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that will be assumed for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of
     * <code>TIMEOUT</code>.
     * </p>
     * 
     * @param timeout
     *        The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a
     *        status of <code>TIMEOUT</code>.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of
     * <code>TIMEOUT</code>.
     * </p>
     * 
     * @return The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a
     *         status of <code>TIMEOUT</code>.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of
     * <code>TIMEOUT</code>.
     * </p>
     * 
     * @param timeout
     *        The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a
     *        status of <code>TIMEOUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withTimeout(Integer timeout) {
        setTimeout(timeout);
        return this;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the job.
     * </p>
     * 
     * @return Metadata tags that have been applied to the job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the job.
     * </p>
     * 
     * @param tags
     *        Metadata tags that have been applied to the job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags that have been applied to the job.
     * </p>
     * 
     * @param tags
     *        Metadata tags that have been applied to the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Job#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Job addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job clearTagsEntries() {
        this.tags = null;
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
        if (getEncryptionMode() != null)
            sb.append("EncryptionMode: ").append(getEncryptionMode()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLogSubscription() != null)
            sb.append("LogSubscription: ").append(getLogSubscription()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: ").append(getMaxRetries()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getRecipeReference() != null)
            sb.append("RecipeReference: ").append(getRecipeReference()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getEncryptionMode() == null ^ this.getEncryptionMode() == null)
            return false;
        if (other.getEncryptionMode() != null && other.getEncryptionMode().equals(this.getEncryptionMode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLogSubscription() == null ^ this.getLogSubscription() == null)
            return false;
        if (other.getLogSubscription() != null && other.getLogSubscription().equals(this.getLogSubscription()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getRecipeReference() == null ^ this.getRecipeReference() == null)
            return false;
        if (other.getRecipeReference() != null && other.getRecipeReference().equals(this.getRecipeReference()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLogSubscription() == null) ? 0 : getLogSubscription().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getRecipeReference() == null) ? 0 : getRecipeReference().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
