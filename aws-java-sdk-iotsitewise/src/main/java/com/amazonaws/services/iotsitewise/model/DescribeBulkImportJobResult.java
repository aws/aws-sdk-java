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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeBulkImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBulkImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The unique name that helps identify the job request.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The status of the bulk import job can be one of following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The bulk import job has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs
     * saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3 with
     * errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * </ul>
     */
    private String jobStatus;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the IAM role
     * that allows IoT SiteWise to read Amazon S3 data.
     * </p>
     */
    private String jobRoleArn;
    /**
     * <p>
     * The files in the specified Amazon S3 bucket that contain your data.
     * </p>
     */
    private java.util.List<File> files;
    /**
     * <p>
     * The Amazon S3 destination where errors associated with the job creation request are saved.
     * </p>
     */
    private ErrorReportLocation errorReportLocation;
    /**
     * <p>
     * Contains the configuration information of a job, such as the file format used to save data in Amazon S3.
     * </p>
     */
    private JobConfiguration jobConfiguration;
    /**
     * <p>
     * The date the job was created, in Unix epoch TIME.
     * </p>
     */
    private java.util.Date jobCreationDate;
    /**
     * <p>
     * The date the job was last updated, in Unix epoch time.
     * </p>
     */
    private java.util.Date jobLastUpdateDate;

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @param jobId
     *        The ID of the job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @return The ID of the job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @param jobId
     *        The ID of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBulkImportJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The unique name that helps identify the job request.
     * </p>
     * 
     * @param jobName
     *        The unique name that helps identify the job request.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The unique name that helps identify the job request.
     * </p>
     * 
     * @return The unique name that helps identify the job request.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The unique name that helps identify the job request.
     * </p>
     * 
     * @param jobName
     *        The unique name that helps identify the job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBulkImportJobResult withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The status of the bulk import job can be one of following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The bulk import job has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs
     * saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3 with
     * errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The status of the bulk import job can be one of following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – The bulk import job has been canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can
     *        use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3
     *        with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot
     *        issues.
     *        </p>
     *        </li>
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the bulk import job can be one of following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The bulk import job has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs
     * saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3 with
     * errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the bulk import job can be one of following values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCELLED</code> – The bulk import job has been canceled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can
     *         use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3
     *         with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot
     *         issues.
     *         </p>
     *         </li>
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of the bulk import job can be one of following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The bulk import job has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs
     * saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3 with
     * errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The status of the bulk import job can be one of following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – The bulk import job has been canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can
     *        use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3
     *        with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot
     *        issues.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public DescribeBulkImportJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the bulk import job can be one of following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCELLED</code> – The bulk import job has been canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs
     * saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3 with
     * errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        The status of the bulk import job can be one of following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – IoT SiteWise is waiting for the current bulk import job to finish.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code> – The bulk import job has been canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – IoT SiteWise is processing your request to import your data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> – IoT SiteWise successfully completed your request to import data from Amazon S3.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – IoT SiteWise couldn't process your request to import data from Amazon S3. You can
     *        use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED_WITH_FAILURES</code> – IoT SiteWise completed your request to import data from Amazon S3
     *        with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot
     *        issues.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public DescribeBulkImportJobResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the IAM role
     * that allows IoT SiteWise to read Amazon S3 data.
     * </p>
     * 
     * @param jobRoleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        IAM role that allows IoT SiteWise to read Amazon S3 data.
     */

    public void setJobRoleArn(String jobRoleArn) {
        this.jobRoleArn = jobRoleArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the IAM role
     * that allows IoT SiteWise to read Amazon S3 data.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         IAM role that allows IoT SiteWise to read Amazon S3 data.
     */

    public String getJobRoleArn() {
        return this.jobRoleArn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the IAM role
     * that allows IoT SiteWise to read Amazon S3 data.
     * </p>
     * 
     * @param jobRoleArn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        IAM role that allows IoT SiteWise to read Amazon S3 data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBulkImportJobResult withJobRoleArn(String jobRoleArn) {
        setJobRoleArn(jobRoleArn);
        return this;
    }

    /**
     * <p>
     * The files in the specified Amazon S3 bucket that contain your data.
     * </p>
     * 
     * @return The files in the specified Amazon S3 bucket that contain your data.
     */

    public java.util.List<File> getFiles() {
        return files;
    }

    /**
     * <p>
     * The files in the specified Amazon S3 bucket that contain your data.
     * </p>
     * 
     * @param files
     *        The files in the specified Amazon S3 bucket that contain your data.
     */

    public void setFiles(java.util.Collection<File> files) {
        if (files == null) {
            this.files = null;
            return;
        }

        this.files = new java.util.ArrayList<File>(files);
    }

    /**
     * <p>
     * The files in the specified Amazon S3 bucket that contain your data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFiles(java.util.Collection)} or {@link #withFiles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param files
     *        The files in the specified Amazon S3 bucket that contain your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBulkImportJobResult withFiles(File... files) {
        if (this.files == null) {
            setFiles(new java.util.ArrayList<File>(files.length));
        }
        for (File ele : files) {
            this.files.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The files in the specified Amazon S3 bucket that contain your data.
     * </p>
     * 
     * @param files
     *        The files in the specified Amazon S3 bucket that contain your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBulkImportJobResult withFiles(java.util.Collection<File> files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 destination where errors associated with the job creation request are saved.
     * </p>
     * 
     * @param errorReportLocation
     *        The Amazon S3 destination where errors associated with the job creation request are saved.
     */

    public void setErrorReportLocation(ErrorReportLocation errorReportLocation) {
        this.errorReportLocation = errorReportLocation;
    }

    /**
     * <p>
     * The Amazon S3 destination where errors associated with the job creation request are saved.
     * </p>
     * 
     * @return The Amazon S3 destination where errors associated with the job creation request are saved.
     */

    public ErrorReportLocation getErrorReportLocation() {
        return this.errorReportLocation;
    }

    /**
     * <p>
     * The Amazon S3 destination where errors associated with the job creation request are saved.
     * </p>
     * 
     * @param errorReportLocation
     *        The Amazon S3 destination where errors associated with the job creation request are saved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBulkImportJobResult withErrorReportLocation(ErrorReportLocation errorReportLocation) {
        setErrorReportLocation(errorReportLocation);
        return this;
    }

    /**
     * <p>
     * Contains the configuration information of a job, such as the file format used to save data in Amazon S3.
     * </p>
     * 
     * @param jobConfiguration
     *        Contains the configuration information of a job, such as the file format used to save data in Amazon S3.
     */

    public void setJobConfiguration(JobConfiguration jobConfiguration) {
        this.jobConfiguration = jobConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of a job, such as the file format used to save data in Amazon S3.
     * </p>
     * 
     * @return Contains the configuration information of a job, such as the file format used to save data in Amazon S3.
     */

    public JobConfiguration getJobConfiguration() {
        return this.jobConfiguration;
    }

    /**
     * <p>
     * Contains the configuration information of a job, such as the file format used to save data in Amazon S3.
     * </p>
     * 
     * @param jobConfiguration
     *        Contains the configuration information of a job, such as the file format used to save data in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBulkImportJobResult withJobConfiguration(JobConfiguration jobConfiguration) {
        setJobConfiguration(jobConfiguration);
        return this;
    }

    /**
     * <p>
     * The date the job was created, in Unix epoch TIME.
     * </p>
     * 
     * @param jobCreationDate
     *        The date the job was created, in Unix epoch TIME.
     */

    public void setJobCreationDate(java.util.Date jobCreationDate) {
        this.jobCreationDate = jobCreationDate;
    }

    /**
     * <p>
     * The date the job was created, in Unix epoch TIME.
     * </p>
     * 
     * @return The date the job was created, in Unix epoch TIME.
     */

    public java.util.Date getJobCreationDate() {
        return this.jobCreationDate;
    }

    /**
     * <p>
     * The date the job was created, in Unix epoch TIME.
     * </p>
     * 
     * @param jobCreationDate
     *        The date the job was created, in Unix epoch TIME.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBulkImportJobResult withJobCreationDate(java.util.Date jobCreationDate) {
        setJobCreationDate(jobCreationDate);
        return this;
    }

    /**
     * <p>
     * The date the job was last updated, in Unix epoch time.
     * </p>
     * 
     * @param jobLastUpdateDate
     *        The date the job was last updated, in Unix epoch time.
     */

    public void setJobLastUpdateDate(java.util.Date jobLastUpdateDate) {
        this.jobLastUpdateDate = jobLastUpdateDate;
    }

    /**
     * <p>
     * The date the job was last updated, in Unix epoch time.
     * </p>
     * 
     * @return The date the job was last updated, in Unix epoch time.
     */

    public java.util.Date getJobLastUpdateDate() {
        return this.jobLastUpdateDate;
    }

    /**
     * <p>
     * The date the job was last updated, in Unix epoch time.
     * </p>
     * 
     * @param jobLastUpdateDate
     *        The date the job was last updated, in Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBulkImportJobResult withJobLastUpdateDate(java.util.Date jobLastUpdateDate) {
        setJobLastUpdateDate(jobLastUpdateDate);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getJobRoleArn() != null)
            sb.append("JobRoleArn: ").append(getJobRoleArn()).append(",");
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles()).append(",");
        if (getErrorReportLocation() != null)
            sb.append("ErrorReportLocation: ").append(getErrorReportLocation()).append(",");
        if (getJobConfiguration() != null)
            sb.append("JobConfiguration: ").append(getJobConfiguration()).append(",");
        if (getJobCreationDate() != null)
            sb.append("JobCreationDate: ").append(getJobCreationDate()).append(",");
        if (getJobLastUpdateDate() != null)
            sb.append("JobLastUpdateDate: ").append(getJobLastUpdateDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBulkImportJobResult == false)
            return false;
        DescribeBulkImportJobResult other = (DescribeBulkImportJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getJobRoleArn() == null ^ this.getJobRoleArn() == null)
            return false;
        if (other.getJobRoleArn() != null && other.getJobRoleArn().equals(this.getJobRoleArn()) == false)
            return false;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getErrorReportLocation() == null ^ this.getErrorReportLocation() == null)
            return false;
        if (other.getErrorReportLocation() != null && other.getErrorReportLocation().equals(this.getErrorReportLocation()) == false)
            return false;
        if (other.getJobConfiguration() == null ^ this.getJobConfiguration() == null)
            return false;
        if (other.getJobConfiguration() != null && other.getJobConfiguration().equals(this.getJobConfiguration()) == false)
            return false;
        if (other.getJobCreationDate() == null ^ this.getJobCreationDate() == null)
            return false;
        if (other.getJobCreationDate() != null && other.getJobCreationDate().equals(this.getJobCreationDate()) == false)
            return false;
        if (other.getJobLastUpdateDate() == null ^ this.getJobLastUpdateDate() == null)
            return false;
        if (other.getJobLastUpdateDate() != null && other.getJobLastUpdateDate().equals(this.getJobLastUpdateDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getJobRoleArn() == null) ? 0 : getJobRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getErrorReportLocation() == null) ? 0 : getErrorReportLocation().hashCode());
        hashCode = prime * hashCode + ((getJobConfiguration() == null) ? 0 : getJobConfiguration().hashCode());
        hashCode = prime * hashCode + ((getJobCreationDate() == null) ? 0 : getJobCreationDate().hashCode());
        hashCode = prime * hashCode + ((getJobLastUpdateDate() == null) ? 0 : getJobLastUpdateDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBulkImportJobResult clone() {
        try {
            return (DescribeBulkImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
