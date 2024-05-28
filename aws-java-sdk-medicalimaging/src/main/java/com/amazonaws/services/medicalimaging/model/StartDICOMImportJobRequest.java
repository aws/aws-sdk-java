/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medicalimaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medical-imaging-2023-07-19/StartDICOMImportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDICOMImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The import job name.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants permission to access medical imaging resources.
     * </p>
     */
    private String dataAccessRoleArn;
    /**
     * <p>
     * A unique identifier for API idempotency.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The data store identifier.
     * </p>
     */
    private String datastoreId;
    /**
     * <p>
     * The input prefix path for the S3 bucket that contains the DICOM files to be imported.
     * </p>
     */
    private String inputS3Uri;
    /**
     * <p>
     * The output prefix of the S3 bucket to upload the results of the DICOM import job.
     * </p>
     */
    private String outputS3Uri;
    /**
     * <p>
     * The account ID of the source S3 bucket owner.
     * </p>
     */
    private String inputOwnerAccountId;

    /**
     * <p>
     * The import job name.
     * </p>
     * 
     * @param jobName
     *        The import job name.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The import job name.
     * </p>
     * 
     * @return The import job name.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The import job name.
     * </p>
     * 
     * @param jobName
     *        The import job name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDICOMImportJobRequest withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants permission to access medical imaging resources.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants permission to access medical imaging resources.
     */

    public void setDataAccessRoleArn(String dataAccessRoleArn) {
        this.dataAccessRoleArn = dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants permission to access medical imaging resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that grants permission to access medical imaging
     *         resources.
     */

    public String getDataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that grants permission to access medical imaging resources.
     * </p>
     * 
     * @param dataAccessRoleArn
     *        The Amazon Resource Name (ARN) of the IAM role that grants permission to access medical imaging resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDICOMImportJobRequest withDataAccessRoleArn(String dataAccessRoleArn) {
        setDataAccessRoleArn(dataAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for API idempotency.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for API idempotency.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier for API idempotency.
     * </p>
     * 
     * @return A unique identifier for API idempotency.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier for API idempotency.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier for API idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDICOMImportJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @return The data store identifier.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The data store identifier.
     * </p>
     * 
     * @param datastoreId
     *        The data store identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDICOMImportJobRequest withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
        return this;
    }

    /**
     * <p>
     * The input prefix path for the S3 bucket that contains the DICOM files to be imported.
     * </p>
     * 
     * @param inputS3Uri
     *        The input prefix path for the S3 bucket that contains the DICOM files to be imported.
     */

    public void setInputS3Uri(String inputS3Uri) {
        this.inputS3Uri = inputS3Uri;
    }

    /**
     * <p>
     * The input prefix path for the S3 bucket that contains the DICOM files to be imported.
     * </p>
     * 
     * @return The input prefix path for the S3 bucket that contains the DICOM files to be imported.
     */

    public String getInputS3Uri() {
        return this.inputS3Uri;
    }

    /**
     * <p>
     * The input prefix path for the S3 bucket that contains the DICOM files to be imported.
     * </p>
     * 
     * @param inputS3Uri
     *        The input prefix path for the S3 bucket that contains the DICOM files to be imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDICOMImportJobRequest withInputS3Uri(String inputS3Uri) {
        setInputS3Uri(inputS3Uri);
        return this;
    }

    /**
     * <p>
     * The output prefix of the S3 bucket to upload the results of the DICOM import job.
     * </p>
     * 
     * @param outputS3Uri
     *        The output prefix of the S3 bucket to upload the results of the DICOM import job.
     */

    public void setOutputS3Uri(String outputS3Uri) {
        this.outputS3Uri = outputS3Uri;
    }

    /**
     * <p>
     * The output prefix of the S3 bucket to upload the results of the DICOM import job.
     * </p>
     * 
     * @return The output prefix of the S3 bucket to upload the results of the DICOM import job.
     */

    public String getOutputS3Uri() {
        return this.outputS3Uri;
    }

    /**
     * <p>
     * The output prefix of the S3 bucket to upload the results of the DICOM import job.
     * </p>
     * 
     * @param outputS3Uri
     *        The output prefix of the S3 bucket to upload the results of the DICOM import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDICOMImportJobRequest withOutputS3Uri(String outputS3Uri) {
        setOutputS3Uri(outputS3Uri);
        return this;
    }

    /**
     * <p>
     * The account ID of the source S3 bucket owner.
     * </p>
     * 
     * @param inputOwnerAccountId
     *        The account ID of the source S3 bucket owner.
     */

    public void setInputOwnerAccountId(String inputOwnerAccountId) {
        this.inputOwnerAccountId = inputOwnerAccountId;
    }

    /**
     * <p>
     * The account ID of the source S3 bucket owner.
     * </p>
     * 
     * @return The account ID of the source S3 bucket owner.
     */

    public String getInputOwnerAccountId() {
        return this.inputOwnerAccountId;
    }

    /**
     * <p>
     * The account ID of the source S3 bucket owner.
     * </p>
     * 
     * @param inputOwnerAccountId
     *        The account ID of the source S3 bucket owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDICOMImportJobRequest withInputOwnerAccountId(String inputOwnerAccountId) {
        setInputOwnerAccountId(inputOwnerAccountId);
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
        if (getDataAccessRoleArn() != null)
            sb.append("DataAccessRoleArn: ").append(getDataAccessRoleArn()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId()).append(",");
        if (getInputS3Uri() != null)
            sb.append("InputS3Uri: ").append(getInputS3Uri()).append(",");
        if (getOutputS3Uri() != null)
            sb.append("OutputS3Uri: ").append(getOutputS3Uri()).append(",");
        if (getInputOwnerAccountId() != null)
            sb.append("InputOwnerAccountId: ").append(getInputOwnerAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDICOMImportJobRequest == false)
            return false;
        StartDICOMImportJobRequest other = (StartDICOMImportJobRequest) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getDataAccessRoleArn() == null ^ this.getDataAccessRoleArn() == null)
            return false;
        if (other.getDataAccessRoleArn() != null && other.getDataAccessRoleArn().equals(this.getDataAccessRoleArn()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        if (other.getInputS3Uri() == null ^ this.getInputS3Uri() == null)
            return false;
        if (other.getInputS3Uri() != null && other.getInputS3Uri().equals(this.getInputS3Uri()) == false)
            return false;
        if (other.getOutputS3Uri() == null ^ this.getOutputS3Uri() == null)
            return false;
        if (other.getOutputS3Uri() != null && other.getOutputS3Uri().equals(this.getOutputS3Uri()) == false)
            return false;
        if (other.getInputOwnerAccountId() == null ^ this.getInputOwnerAccountId() == null)
            return false;
        if (other.getInputOwnerAccountId() != null && other.getInputOwnerAccountId().equals(this.getInputOwnerAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getDataAccessRoleArn() == null) ? 0 : getDataAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        hashCode = prime * hashCode + ((getInputS3Uri() == null) ? 0 : getInputS3Uri().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Uri() == null) ? 0 : getOutputS3Uri().hashCode());
        hashCode = prime * hashCode + ((getInputOwnerAccountId() == null) ? 0 : getInputOwnerAccountId().hashCode());
        return hashCode;
    }

    @Override
    public StartDICOMImportJobRequest clone() {
        return (StartDICOMImportJobRequest) super.clone();
    }

}
