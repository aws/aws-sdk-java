/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The date and time that the job was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The identifier (user name) of the user associated with the creation of the job.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The dataset that the job acts upon.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
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
     * The name of the job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The job type, which must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROFILE</code> - The job analyzes the dataset to determine its size, data types, data distribution, and
     * more.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECIPE</code> - The job applies one or more transformations to a dataset.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The identifier (user name) of the user who last modified the job.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The date and time that the job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * A value that indicates whether Amazon CloudWatch logging is enabled for this job.
     * </p>
     */
    private String logSubscription;
    /**
     * <p>
     * The maximum number of nodes that AWS Glue DataBrew can consume when the job processes data.
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
     * One or more artifacts that represent the output from running the job.
     * </p>
     */
    private java.util.List<Output> outputs;
    /**
     * <p>
     * The DataBrew project associated with this job.
     * </p>
     */
    private String projectName;

    private RecipeReference recipeReference;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Metadata tags associated with this job.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of
     * <code>TIMEOUT</code>.
     * </p>
     */
    private Integer timeout;

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

    public DescribeJobResult withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The identifier (user name) of the user associated with the creation of the job.
     * </p>
     * 
     * @param createdBy
     *        The identifier (user name) of the user associated with the creation of the job.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user associated with the creation of the job.
     * </p>
     * 
     * @return The identifier (user name) of the user associated with the creation of the job.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user associated with the creation of the job.
     * </p>
     * 
     * @param createdBy
     *        The identifier (user name) of the user associated with the creation of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The dataset that the job acts upon.
     * </p>
     * 
     * @param datasetName
     *        The dataset that the job acts upon.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The dataset that the job acts upon.
     * </p>
     * 
     * @return The dataset that the job acts upon.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The dataset that the job acts upon.
     * </p>
     * 
     * @param datasetName
     *        The dataset that the job acts upon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withEncryptionKeyArn(String encryptionKeyArn) {
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

    public DescribeJobResult withEncryptionMode(String encryptionMode) {
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

    public DescribeJobResult withEncryptionMode(EncryptionMode encryptionMode) {
        this.encryptionMode = encryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param name
     *        The name of the job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @return The name of the job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param name
     *        The name of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The job type, which must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROFILE</code> - The job analyzes the dataset to determine its size, data types, data distribution, and
     * more.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECIPE</code> - The job applies one or more transformations to a dataset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The job type, which must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROFILE</code> - The job analyzes the dataset to determine its size, data types, data distribution,
     *        and more.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECIPE</code> - The job applies one or more transformations to a dataset.
     *        </p>
     *        </li>
     * @see JobType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The job type, which must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROFILE</code> - The job analyzes the dataset to determine its size, data types, data distribution, and
     * more.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECIPE</code> - The job applies one or more transformations to a dataset.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The job type, which must be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROFILE</code> - The job analyzes the dataset to determine its size, data types, data distribution,
     *         and more.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RECIPE</code> - The job applies one or more transformations to a dataset.
     *         </p>
     *         </li>
     * @see JobType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The job type, which must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROFILE</code> - The job analyzes the dataset to determine its size, data types, data distribution, and
     * more.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECIPE</code> - The job applies one or more transformations to a dataset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The job type, which must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROFILE</code> - The job analyzes the dataset to determine its size, data types, data distribution,
     *        and more.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECIPE</code> - The job applies one or more transformations to a dataset.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public DescribeJobResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The job type, which must be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROFILE</code> - The job analyzes the dataset to determine its size, data types, data distribution, and
     * more.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RECIPE</code> - The job applies one or more transformations to a dataset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The job type, which must be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROFILE</code> - The job analyzes the dataset to determine its size, data types, data distribution,
     *        and more.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RECIPE</code> - The job applies one or more transformations to a dataset.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public DescribeJobResult withType(JobType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the job.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (user name) of the user who last modified the job.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the job.
     * </p>
     * 
     * @return The identifier (user name) of the user who last modified the job.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the job.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (user name) of the user who last modified the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The date and time that the job was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the job was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the job was last modified.
     * </p>
     * 
     * @return The date and time that the job was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the job was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether Amazon CloudWatch logging is enabled for this job.
     * </p>
     * 
     * @param logSubscription
     *        A value that indicates whether Amazon CloudWatch logging is enabled for this job.
     * @see LogSubscription
     */

    public void setLogSubscription(String logSubscription) {
        this.logSubscription = logSubscription;
    }

    /**
     * <p>
     * A value that indicates whether Amazon CloudWatch logging is enabled for this job.
     * </p>
     * 
     * @return A value that indicates whether Amazon CloudWatch logging is enabled for this job.
     * @see LogSubscription
     */

    public String getLogSubscription() {
        return this.logSubscription;
    }

    /**
     * <p>
     * A value that indicates whether Amazon CloudWatch logging is enabled for this job.
     * </p>
     * 
     * @param logSubscription
     *        A value that indicates whether Amazon CloudWatch logging is enabled for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogSubscription
     */

    public DescribeJobResult withLogSubscription(String logSubscription) {
        setLogSubscription(logSubscription);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether Amazon CloudWatch logging is enabled for this job.
     * </p>
     * 
     * @param logSubscription
     *        A value that indicates whether Amazon CloudWatch logging is enabled for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogSubscription
     */

    public DescribeJobResult withLogSubscription(LogSubscription logSubscription) {
        this.logSubscription = logSubscription.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of nodes that AWS Glue DataBrew can consume when the job processes data.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum number of nodes that AWS Glue DataBrew can consume when the job processes data.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum number of nodes that AWS Glue DataBrew can consume when the job processes data.
     * </p>
     * 
     * @return The maximum number of nodes that AWS Glue DataBrew can consume when the job processes data.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum number of nodes that AWS Glue DataBrew can consume when the job processes data.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum number of nodes that AWS Glue DataBrew can consume when the job processes data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withMaxCapacity(Integer maxCapacity) {
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

    public DescribeJobResult withMaxRetries(Integer maxRetries) {
        setMaxRetries(maxRetries);
        return this;
    }

    /**
     * <p>
     * One or more artifacts that represent the output from running the job.
     * </p>
     * 
     * @return One or more artifacts that represent the output from running the job.
     */

    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * One or more artifacts that represent the output from running the job.
     * </p>
     * 
     * @param outputs
     *        One or more artifacts that represent the output from running the job.
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
     * One or more artifacts that represent the output from running the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        One or more artifacts that represent the output from running the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withOutputs(Output... outputs) {
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
     * One or more artifacts that represent the output from running the job.
     * </p>
     * 
     * @param outputs
     *        One or more artifacts that represent the output from running the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The DataBrew project associated with this job.
     * </p>
     * 
     * @param projectName
     *        The DataBrew project associated with this job.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The DataBrew project associated with this job.
     * </p>
     * 
     * @return The DataBrew project associated with this job.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The DataBrew project associated with this job.
     * </p>
     * 
     * @param projectName
     *        The DataBrew project associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * @param recipeReference
     */

    public void setRecipeReference(RecipeReference recipeReference) {
        this.recipeReference = recipeReference;
    }

    /**
     * @return
     */

    public RecipeReference getRecipeReference() {
        return this.recipeReference;
    }

    /**
     * @param recipeReference
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withRecipeReference(RecipeReference recipeReference) {
        setRecipeReference(recipeReference);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the job.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the job.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
     * </p>
     * 
     * @return The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the AWS Identity and Access Management (IAM) role that was assumed for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Metadata tags associated with this job.
     * </p>
     * 
     * @return Metadata tags associated with this job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags associated with this job.
     * </p>
     * 
     * @param tags
     *        Metadata tags associated with this job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags associated with this job.
     * </p>
     * 
     * @param tags
     *        Metadata tags associated with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeJobResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobResult addTagsEntry(String key, String value) {
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

    public DescribeJobResult clearTagsEntries() {
        this.tags = null;
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

    public DescribeJobResult withTimeout(Integer timeout) {
        setTimeout(timeout);
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
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobResult == false)
            return false;
        DescribeJobResult other = (DescribeJobResult) obj;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobResult clone() {
        try {
            return (DescribeJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
