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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The user import job type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UserImportJobType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserImportJobType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The pre-signed URL to be used to upload the <code>.csv</code> file.
     * </p>
     */
    private String preSignedUrl;
    /**
     * <p>
     * The date the user import job was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date when the user import job was started.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The date when the user import job was completed.
     * </p>
     */
    private java.util.Date completionDate;
    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data associated with
     * the job was deleted, and the job cannot be started.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see
     * "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
     * </p>
     */
    private String cloudWatchLogsRoleArn;
    /**
     * <p>
     * The number of users that were successfully imported.
     * </p>
     */
    private Long importedUsers;
    /**
     * <p>
     * The number of users that were skipped.
     * </p>
     */
    private Long skippedUsers;
    /**
     * <p>
     * The number of users that could not be imported.
     * </p>
     */
    private Long failedUsers;
    /**
     * <p>
     * The message returned when the user import job is completed.
     * </p>
     */
    private String completionMessage;

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     * 
     * @param jobName
     *        The job name for the user import job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     * 
     * @return The job name for the user import job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The job name for the user import job.
     * </p>
     * 
     * @param jobName
     *        The job name for the user import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     * 
     * @param jobId
     *        The job ID for the user import job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     * 
     * @return The job ID for the user import job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID for the user import job.
     * </p>
     * 
     * @param jobId
     *        The job ID for the user import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that the users are being imported into.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     * 
     * @return The user pool ID for the user pool that the users are being imported into.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool that the users are being imported into.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool that the users are being imported into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The pre-signed URL to be used to upload the <code>.csv</code> file.
     * </p>
     * 
     * @param preSignedUrl
     *        The pre-signed URL to be used to upload the <code>.csv</code> file.
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * The pre-signed URL to be used to upload the <code>.csv</code> file.
     * </p>
     * 
     * @return The pre-signed URL to be used to upload the <code>.csv</code> file.
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * The pre-signed URL to be used to upload the <code>.csv</code> file.
     * </p>
     * 
     * @param preSignedUrl
     *        The pre-signed URL to be used to upload the <code>.csv</code> file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * <p>
     * The date the user import job was created.
     * </p>
     * 
     * @param creationDate
     *        The date the user import job was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the user import job was created.
     * </p>
     * 
     * @return The date the user import job was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the user import job was created.
     * </p>
     * 
     * @param creationDate
     *        The date the user import job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date when the user import job was started.
     * </p>
     * 
     * @param startDate
     *        The date when the user import job was started.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date when the user import job was started.
     * </p>
     * 
     * @return The date when the user import job was started.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date when the user import job was started.
     * </p>
     * 
     * @param startDate
     *        The date when the user import job was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The date when the user import job was completed.
     * </p>
     * 
     * @param completionDate
     *        The date when the user import job was completed.
     */

    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date when the user import job was completed.
     * </p>
     * 
     * @return The date when the user import job was completed.
     */

    public java.util.Date getCompletionDate() {
        return this.completionDate;
    }

    /**
     * <p>
     * The date when the user import job was completed.
     * </p>
     * 
     * @param completionDate
     *        The date when the user import job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withCompletionDate(java.util.Date completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data associated with
     * the job was deleted, and the job cannot be started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the user import job. One of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Created</code> - The job was created but not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users
     *        yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The job has started, and users are being imported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Succeeded</code> - The job has completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The job has stopped due to an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data
     *        associated with the job was deleted, and the job cannot be started.
     *        </p>
     *        </li>
     * @see UserImportJobStatusType
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data associated with
     * the job was deleted, and the job cannot be started.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the user import job. One of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Created</code> - The job was created but not started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users
     *         yet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InProgress</code> - The job has started, and users are being imported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Succeeded</code> - The job has completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Failed</code> - The job has stopped due to an error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data
     *         associated with the job was deleted, and the job cannot be started.
     *         </p>
     *         </li>
     * @see UserImportJobStatusType
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data associated with
     * the job was deleted, and the job cannot be started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the user import job. One of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Created</code> - The job was created but not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users
     *        yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The job has started, and users are being imported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Succeeded</code> - The job has completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The job has stopped due to an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data
     *        associated with the job was deleted, and the job cannot be started.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserImportJobStatusType
     */

    public UserImportJobType withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data associated with
     * the job was deleted, and the job cannot be started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the user import job. One of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Created</code> - The job was created but not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users
     *        yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The job has started, and users are being imported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Succeeded</code> - The job has completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The job has stopped due to an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data
     *        associated with the job was deleted, and the job cannot be started.
     *        </p>
     *        </li>
     * @see UserImportJobStatusType
     */

    public void setStatus(UserImportJobStatusType status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the user import job. One of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Created</code> - The job was created but not started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code> - The job has started, and users are being imported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Succeeded</code> - The job has completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Failed</code> - The job has stopped due to an error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data associated with
     * the job was deleted, and the job cannot be started.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the user import job. One of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Created</code> - The job was created but not started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Pending</code> - A transition state. You have started the job, but it has not begun importing users
     *        yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code> - The job has started, and users are being imported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - You have stopped the job, but the job has not stopped importing users yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopped</code> - You have stopped the job, and the job has stopped importing users.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Succeeded</code> - The job has completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Failed</code> - The job has stopped due to an error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Expired</code> - You created a job, but did not start the job within 24-48 hours. All data
     *        associated with the job was deleted, and the job cannot be started.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserImportJobStatusType
     */

    public UserImportJobType withStatus(UserImportJobStatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see
     * "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see
     *        "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
     */

    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see
     * "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
     * </p>
     * 
     * @return The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see
     *         "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
     */

    public String getCloudWatchLogsRoleArn() {
        return this.cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see
     * "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see
     *        "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        setCloudWatchLogsRoleArn(cloudWatchLogsRoleArn);
        return this;
    }

    /**
     * <p>
     * The number of users that were successfully imported.
     * </p>
     * 
     * @param importedUsers
     *        The number of users that were successfully imported.
     */

    public void setImportedUsers(Long importedUsers) {
        this.importedUsers = importedUsers;
    }

    /**
     * <p>
     * The number of users that were successfully imported.
     * </p>
     * 
     * @return The number of users that were successfully imported.
     */

    public Long getImportedUsers() {
        return this.importedUsers;
    }

    /**
     * <p>
     * The number of users that were successfully imported.
     * </p>
     * 
     * @param importedUsers
     *        The number of users that were successfully imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withImportedUsers(Long importedUsers) {
        setImportedUsers(importedUsers);
        return this;
    }

    /**
     * <p>
     * The number of users that were skipped.
     * </p>
     * 
     * @param skippedUsers
     *        The number of users that were skipped.
     */

    public void setSkippedUsers(Long skippedUsers) {
        this.skippedUsers = skippedUsers;
    }

    /**
     * <p>
     * The number of users that were skipped.
     * </p>
     * 
     * @return The number of users that were skipped.
     */

    public Long getSkippedUsers() {
        return this.skippedUsers;
    }

    /**
     * <p>
     * The number of users that were skipped.
     * </p>
     * 
     * @param skippedUsers
     *        The number of users that were skipped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withSkippedUsers(Long skippedUsers) {
        setSkippedUsers(skippedUsers);
        return this;
    }

    /**
     * <p>
     * The number of users that could not be imported.
     * </p>
     * 
     * @param failedUsers
     *        The number of users that could not be imported.
     */

    public void setFailedUsers(Long failedUsers) {
        this.failedUsers = failedUsers;
    }

    /**
     * <p>
     * The number of users that could not be imported.
     * </p>
     * 
     * @return The number of users that could not be imported.
     */

    public Long getFailedUsers() {
        return this.failedUsers;
    }

    /**
     * <p>
     * The number of users that could not be imported.
     * </p>
     * 
     * @param failedUsers
     *        The number of users that could not be imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withFailedUsers(Long failedUsers) {
        setFailedUsers(failedUsers);
        return this;
    }

    /**
     * <p>
     * The message returned when the user import job is completed.
     * </p>
     * 
     * @param completionMessage
     *        The message returned when the user import job is completed.
     */

    public void setCompletionMessage(String completionMessage) {
        this.completionMessage = completionMessage;
    }

    /**
     * <p>
     * The message returned when the user import job is completed.
     * </p>
     * 
     * @return The message returned when the user import job is completed.
     */

    public String getCompletionMessage() {
        return this.completionMessage;
    }

    /**
     * <p>
     * The message returned when the user import job is completed.
     * </p>
     * 
     * @param completionMessage
     *        The message returned when the user import job is completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserImportJobType withCompletionMessage(String completionMessage) {
        setCompletionMessage(completionMessage);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: ").append(getPreSignedUrl()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: ").append(getCompletionDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCloudWatchLogsRoleArn() != null)
            sb.append("CloudWatchLogsRoleArn: ").append(getCloudWatchLogsRoleArn()).append(",");
        if (getImportedUsers() != null)
            sb.append("ImportedUsers: ").append(getImportedUsers()).append(",");
        if (getSkippedUsers() != null)
            sb.append("SkippedUsers: ").append(getSkippedUsers()).append(",");
        if (getFailedUsers() != null)
            sb.append("FailedUsers: ").append(getFailedUsers()).append(",");
        if (getCompletionMessage() != null)
            sb.append("CompletionMessage: ").append(getCompletionMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserImportJobType == false)
            return false;
        UserImportJobType other = (UserImportJobType) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCloudWatchLogsRoleArn() == null ^ this.getCloudWatchLogsRoleArn() == null)
            return false;
        if (other.getCloudWatchLogsRoleArn() != null && other.getCloudWatchLogsRoleArn().equals(this.getCloudWatchLogsRoleArn()) == false)
            return false;
        if (other.getImportedUsers() == null ^ this.getImportedUsers() == null)
            return false;
        if (other.getImportedUsers() != null && other.getImportedUsers().equals(this.getImportedUsers()) == false)
            return false;
        if (other.getSkippedUsers() == null ^ this.getSkippedUsers() == null)
            return false;
        if (other.getSkippedUsers() != null && other.getSkippedUsers().equals(this.getSkippedUsers()) == false)
            return false;
        if (other.getFailedUsers() == null ^ this.getFailedUsers() == null)
            return false;
        if (other.getFailedUsers() != null && other.getFailedUsers().equals(this.getFailedUsers()) == false)
            return false;
        if (other.getCompletionMessage() == null ^ this.getCompletionMessage() == null)
            return false;
        if (other.getCompletionMessage() != null && other.getCompletionMessage().equals(this.getCompletionMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogsRoleArn() == null) ? 0 : getCloudWatchLogsRoleArn().hashCode());
        hashCode = prime * hashCode + ((getImportedUsers() == null) ? 0 : getImportedUsers().hashCode());
        hashCode = prime * hashCode + ((getSkippedUsers() == null) ? 0 : getSkippedUsers().hashCode());
        hashCode = prime * hashCode + ((getFailedUsers() == null) ? 0 : getFailedUsers().hashCode());
        hashCode = prime * hashCode + ((getCompletionMessage() == null) ? 0 : getCompletionMessage().hashCode());
        return hashCode;
    }

    @Override
    public UserImportJobType clone() {
        try {
            return (UserImportJobType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.UserImportJobTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
