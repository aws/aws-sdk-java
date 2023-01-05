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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateBulkImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBulkImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name that helps identify the job request.
     * </p>
     */
    private String jobName;
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

    public CreateBulkImportJobRequest withJobName(String jobName) {
        setJobName(jobName);
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

    public CreateBulkImportJobRequest withJobRoleArn(String jobRoleArn) {
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

    public CreateBulkImportJobRequest withFiles(File... files) {
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

    public CreateBulkImportJobRequest withFiles(java.util.Collection<File> files) {
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

    public CreateBulkImportJobRequest withErrorReportLocation(ErrorReportLocation errorReportLocation) {
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

    public CreateBulkImportJobRequest withJobConfiguration(JobConfiguration jobConfiguration) {
        setJobConfiguration(jobConfiguration);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobRoleArn() != null)
            sb.append("JobRoleArn: ").append(getJobRoleArn()).append(",");
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles()).append(",");
        if (getErrorReportLocation() != null)
            sb.append("ErrorReportLocation: ").append(getErrorReportLocation()).append(",");
        if (getJobConfiguration() != null)
            sb.append("JobConfiguration: ").append(getJobConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBulkImportJobRequest == false)
            return false;
        CreateBulkImportJobRequest other = (CreateBulkImportJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRoleArn() == null) ? 0 : getJobRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getErrorReportLocation() == null) ? 0 : getErrorReportLocation().hashCode());
        hashCode = prime * hashCode + ((getJobConfiguration() == null) ? 0 : getJobConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateBulkImportJobRequest clone() {
        return (CreateBulkImportJobRequest) super.clone();
    }

}
