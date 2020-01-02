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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String accountId;
    /**
     * <p>
     * Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs
     * created through the Amazon S3 console.
     * </p>
     */
    private Boolean confirmationRequired;
    /**
     * <p>
     * The operation that you want this job to perform on each object listed in the manifest. For more information about
     * the available operations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the
     * <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     */
    private JobOperation operation;
    /**
     * <p>
     * Configuration parameters for the optional job-completion report.
     * </p>
     */
    private JobReport report;
    /**
     * <p>
     * An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string
     * up to the maximum length.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Configuration parameters for the manifest.
     * </p>
     */
    private JobManifest manifest;
    /**
     * <p>
     * A description for this job. You can use any string within the permitted length. Descriptions don't need to be
     * unique and can be used for multiple jobs.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The numerical priority for this job. Higher numbers indicate higher priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role that batch operations will use
     * to execute this job's operation on each object in the manifest.
     * </p>
     */
    private String roleArn;

    /**
     * <p/>
     * 
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p/>
     * 
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs
     * created through the Amazon S3 console.
     * </p>
     * 
     * @param confirmationRequired
     *        Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required
     *        for jobs created through the Amazon S3 console.
     */

    public void setConfirmationRequired(Boolean confirmationRequired) {
        this.confirmationRequired = confirmationRequired;
    }

    /**
     * <p>
     * Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs
     * created through the Amazon S3 console.
     * </p>
     * 
     * @return Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required
     *         for jobs created through the Amazon S3 console.
     */

    public Boolean getConfirmationRequired() {
        return this.confirmationRequired;
    }

    /**
     * <p>
     * Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs
     * created through the Amazon S3 console.
     * </p>
     * 
     * @param confirmationRequired
     *        Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required
     *        for jobs created through the Amazon S3 console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withConfirmationRequired(Boolean confirmationRequired) {
        setConfirmationRequired(confirmationRequired);
        return this;
    }

    /**
     * <p>
     * Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs
     * created through the Amazon S3 console.
     * </p>
     * 
     * @return Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required
     *         for jobs created through the Amazon S3 console.
     */

    public Boolean isConfirmationRequired() {
        return this.confirmationRequired;
    }

    /**
     * <p>
     * The operation that you want this job to perform on each object listed in the manifest. For more information about
     * the available operations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the
     * <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * 
     * @param operation
     *        The operation that you want this job to perform on each object listed in the manifest. For more
     *        information about the available operations, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a>
     *        in the <i>Amazon Simple Storage Service Developer Guide</i>.
     */

    public void setOperation(JobOperation operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The operation that you want this job to perform on each object listed in the manifest. For more information about
     * the available operations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the
     * <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * 
     * @return The operation that you want this job to perform on each object listed in the manifest. For more
     *         information about the available operations, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a>
     *         in the <i>Amazon Simple Storage Service Developer Guide</i>.
     */

    public JobOperation getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The operation that you want this job to perform on each object listed in the manifest. For more information about
     * the available operations, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a> in the
     * <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * 
     * @param operation
     *        The operation that you want this job to perform on each object listed in the manifest. For more
     *        information about the available operations, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/batch-ops-operations.html">Available Operations</a>
     *        in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withOperation(JobOperation operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * Configuration parameters for the optional job-completion report.
     * </p>
     * 
     * @param report
     *        Configuration parameters for the optional job-completion report.
     */

    public void setReport(JobReport report) {
        this.report = report;
    }

    /**
     * <p>
     * Configuration parameters for the optional job-completion report.
     * </p>
     * 
     * @return Configuration parameters for the optional job-completion report.
     */

    public JobReport getReport() {
        return this.report;
    }

    /**
     * <p>
     * Configuration parameters for the optional job-completion report.
     * </p>
     * 
     * @param report
     *        Configuration parameters for the optional job-completion report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withReport(JobReport report) {
        setReport(report);
        return this;
    }

    /**
     * <p>
     * An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string
     * up to the maximum length.
     * </p>
     * 
     * @param clientRequestToken
     *        An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any
     *        string up to the maximum length.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string
     * up to the maximum length.
     * </p>
     * 
     * @return An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any
     *         string up to the maximum length.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string
     * up to the maximum length.
     * </p>
     * 
     * @param clientRequestToken
     *        An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any
     *        string up to the maximum length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Configuration parameters for the manifest.
     * </p>
     * 
     * @param manifest
     *        Configuration parameters for the manifest.
     */

    public void setManifest(JobManifest manifest) {
        this.manifest = manifest;
    }

    /**
     * <p>
     * Configuration parameters for the manifest.
     * </p>
     * 
     * @return Configuration parameters for the manifest.
     */

    public JobManifest getManifest() {
        return this.manifest;
    }

    /**
     * <p>
     * Configuration parameters for the manifest.
     * </p>
     * 
     * @param manifest
     *        Configuration parameters for the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withManifest(JobManifest manifest) {
        setManifest(manifest);
        return this;
    }

    /**
     * <p>
     * A description for this job. You can use any string within the permitted length. Descriptions don't need to be
     * unique and can be used for multiple jobs.
     * </p>
     * 
     * @param description
     *        A description for this job. You can use any string within the permitted length. Descriptions don't need to
     *        be unique and can be used for multiple jobs.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for this job. You can use any string within the permitted length. Descriptions don't need to be
     * unique and can be used for multiple jobs.
     * </p>
     * 
     * @return A description for this job. You can use any string within the permitted length. Descriptions don't need
     *         to be unique and can be used for multiple jobs.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for this job. You can use any string within the permitted length. Descriptions don't need to be
     * unique and can be used for multiple jobs.
     * </p>
     * 
     * @param description
     *        A description for this job. You can use any string within the permitted length. Descriptions don't need to
     *        be unique and can be used for multiple jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The numerical priority for this job. Higher numbers indicate higher priority.
     * </p>
     * 
     * @param priority
     *        The numerical priority for this job. Higher numbers indicate higher priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The numerical priority for this job. Higher numbers indicate higher priority.
     * </p>
     * 
     * @return The numerical priority for this job. Higher numbers indicate higher priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The numerical priority for this job. Higher numbers indicate higher priority.
     * </p>
     * 
     * @param priority
     *        The numerical priority for this job. Higher numbers indicate higher priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role that batch operations will use
     * to execute this job's operation on each object in the manifest.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role that batch operations
     *        will use to execute this job's operation on each object in the manifest.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role that batch operations will use
     * to execute this job's operation on each object in the manifest.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role that batch operations
     *         will use to execute this job's operation on each object in the manifest.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role that batch operations will use
     * to execute this job's operation on each object in the manifest.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role that batch operations
     *        will use to execute this job's operation on each object in the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getConfirmationRequired() != null)
            sb.append("ConfirmationRequired: ").append(getConfirmationRequired()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getReport() != null)
            sb.append("Report: ").append(getReport()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getManifest() != null)
            sb.append("Manifest: ").append(getManifest()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getConfirmationRequired() == null ^ this.getConfirmationRequired() == null)
            return false;
        if (other.getConfirmationRequired() != null && other.getConfirmationRequired().equals(this.getConfirmationRequired()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getReport() == null ^ this.getReport() == null)
            return false;
        if (other.getReport() != null && other.getReport().equals(this.getReport()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getManifest() == null ^ this.getManifest() == null)
            return false;
        if (other.getManifest() != null && other.getManifest().equals(this.getManifest()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getConfirmationRequired() == null) ? 0 : getConfirmationRequired().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getReport() == null) ? 0 : getReport().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getManifest() == null) ? 0 : getManifest().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }

}
