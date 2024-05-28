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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAssetBundleImportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetBundleImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates the status of a job through its queuing and execution.
     * </p>
     * <p>
     * Poll the <code>DescribeAssetBundleImport</code> API until <code>JobStatus</code> returns one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_ROLLBACK_COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_ROLLBACK_ERROR</code>
     * </p>
     * </li>
     * </ul>
     */
    private String jobStatus;
    /**
     * <p>
     * An array of error records that describes any failures that occurred during the export job processing.
     * </p>
     * <p>
     * Error records accumulate while the job is still running. The complete set of error records is available after the
     * job has completed and failed.
     * </p>
     */
    private java.util.List<AssetBundleImportJobError> errors;
    /**
     * <p>
     * An array of error records that describes any failures that occurred while an import job was attempting a
     * rollback.
     * </p>
     * <p>
     * Error records accumulate while the job is still running. The complete set of error records is available after the
     * job has completed and failed.
     * </p>
     */
    private java.util.List<AssetBundleImportJobError> rollbackErrors;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the import job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time that the import job was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleImportJob</code> API
     * call.
     * </p>
     */
    private String assetBundleImportJobId;
    /**
     * <p>
     * The ID of the Amazon Web Services account the import job was executed in.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The source of the asset bundle zip file that contains the data that is imported by the job.
     * </p>
     */
    private AssetBundleImportSourceDescription assetBundleImportSource;
    /**
     * <p>
     * Optional overrides that are applied to the resource configuration before import.
     * </p>
     */
    private AssetBundleImportJobOverrideParameters overrideParameters;
    /**
     * <p>
     * The failure action for the import job.
     * </p>
     */
    private String failureAction;
    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the response.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * Optional permission overrides that are applied to the resource configuration before import.
     * </p>
     */
    private AssetBundleImportJobOverridePermissions overridePermissions;
    /**
     * <p>
     * Optional tag overrides that are applied to the resource configuration before import.
     * </p>
     */
    private AssetBundleImportJobOverrideTags overrideTags;
    /**
     * <p>
     * An optional validation strategy override for all analyses and dashboards to be applied to the resource
     * configuration before import.
     * </p>
     */
    private AssetBundleImportJobOverrideValidationStrategy overrideValidationStrategy;
    /**
     * <p>
     * An array of warning records that describe all permitted errors that are encountered during the import job.
     * </p>
     */
    private java.util.List<AssetBundleImportJobWarning> warnings;

    /**
     * <p>
     * Indicates the status of a job through its queuing and execution.
     * </p>
     * <p>
     * Poll the <code>DescribeAssetBundleImport</code> API until <code>JobStatus</code> returns one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_ROLLBACK_COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_ROLLBACK_ERROR</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        Indicates the status of a job through its queuing and execution.</p>
     *        <p>
     *        Poll the <code>DescribeAssetBundleImport</code> API until <code>JobStatus</code> returns one of the
     *        following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESSFUL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_ROLLBACK_COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_ROLLBACK_ERROR</code>
     *        </p>
     *        </li>
     * @see AssetBundleImportJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Indicates the status of a job through its queuing and execution.
     * </p>
     * <p>
     * Poll the <code>DescribeAssetBundleImport</code> API until <code>JobStatus</code> returns one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_ROLLBACK_COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_ROLLBACK_ERROR</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the status of a job through its queuing and execution.</p>
     *         <p>
     *         Poll the <code>DescribeAssetBundleImport</code> API until <code>JobStatus</code> returns one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCESSFUL</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED_ROLLBACK_COMPLETED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED_ROLLBACK_ERROR</code>
     *         </p>
     *         </li>
     * @see AssetBundleImportJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * Indicates the status of a job through its queuing and execution.
     * </p>
     * <p>
     * Poll the <code>DescribeAssetBundleImport</code> API until <code>JobStatus</code> returns one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_ROLLBACK_COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_ROLLBACK_ERROR</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        Indicates the status of a job through its queuing and execution.</p>
     *        <p>
     *        Poll the <code>DescribeAssetBundleImport</code> API until <code>JobStatus</code> returns one of the
     *        following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESSFUL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_ROLLBACK_COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_ROLLBACK_ERROR</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleImportJobStatus
     */

    public DescribeAssetBundleImportJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a job through its queuing and execution.
     * </p>
     * <p>
     * Poll the <code>DescribeAssetBundleImport</code> API until <code>JobStatus</code> returns one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCESSFUL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_ROLLBACK_COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED_ROLLBACK_ERROR</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param jobStatus
     *        Indicates the status of a job through its queuing and execution.</p>
     *        <p>
     *        Poll the <code>DescribeAssetBundleImport</code> API until <code>JobStatus</code> returns one of the
     *        following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCESSFUL</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_ROLLBACK_COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED_ROLLBACK_ERROR</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleImportJobStatus
     */

    public DescribeAssetBundleImportJobResult withJobStatus(AssetBundleImportJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred during the export job processing.
     * </p>
     * <p>
     * Error records accumulate while the job is still running. The complete set of error records is available after the
     * job has completed and failed.
     * </p>
     * 
     * @return An array of error records that describes any failures that occurred during the export job processing.</p>
     *         <p>
     *         Error records accumulate while the job is still running. The complete set of error records is available
     *         after the job has completed and failed.
     */

    public java.util.List<AssetBundleImportJobError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred during the export job processing.
     * </p>
     * <p>
     * Error records accumulate while the job is still running. The complete set of error records is available after the
     * job has completed and failed.
     * </p>
     * 
     * @param errors
     *        An array of error records that describes any failures that occurred during the export job processing.</p>
     *        <p>
     *        Error records accumulate while the job is still running. The complete set of error records is available
     *        after the job has completed and failed.
     */

    public void setErrors(java.util.Collection<AssetBundleImportJobError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<AssetBundleImportJobError>(errors);
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred during the export job processing.
     * </p>
     * <p>
     * Error records accumulate while the job is still running. The complete set of error records is available after the
     * job has completed and failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        An array of error records that describes any failures that occurred during the export job processing.</p>
     *        <p>
     *        Error records accumulate while the job is still running. The complete set of error records is available
     *        after the job has completed and failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withErrors(AssetBundleImportJobError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<AssetBundleImportJobError>(errors.length));
        }
        for (AssetBundleImportJobError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred during the export job processing.
     * </p>
     * <p>
     * Error records accumulate while the job is still running. The complete set of error records is available after the
     * job has completed and failed.
     * </p>
     * 
     * @param errors
     *        An array of error records that describes any failures that occurred during the export job processing.</p>
     *        <p>
     *        Error records accumulate while the job is still running. The complete set of error records is available
     *        after the job has completed and failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withErrors(java.util.Collection<AssetBundleImportJobError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred while an import job was attempting a
     * rollback.
     * </p>
     * <p>
     * Error records accumulate while the job is still running. The complete set of error records is available after the
     * job has completed and failed.
     * </p>
     * 
     * @return An array of error records that describes any failures that occurred while an import job was attempting a
     *         rollback.</p>
     *         <p>
     *         Error records accumulate while the job is still running. The complete set of error records is available
     *         after the job has completed and failed.
     */

    public java.util.List<AssetBundleImportJobError> getRollbackErrors() {
        return rollbackErrors;
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred while an import job was attempting a
     * rollback.
     * </p>
     * <p>
     * Error records accumulate while the job is still running. The complete set of error records is available after the
     * job has completed and failed.
     * </p>
     * 
     * @param rollbackErrors
     *        An array of error records that describes any failures that occurred while an import job was attempting a
     *        rollback.</p>
     *        <p>
     *        Error records accumulate while the job is still running. The complete set of error records is available
     *        after the job has completed and failed.
     */

    public void setRollbackErrors(java.util.Collection<AssetBundleImportJobError> rollbackErrors) {
        if (rollbackErrors == null) {
            this.rollbackErrors = null;
            return;
        }

        this.rollbackErrors = new java.util.ArrayList<AssetBundleImportJobError>(rollbackErrors);
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred while an import job was attempting a
     * rollback.
     * </p>
     * <p>
     * Error records accumulate while the job is still running. The complete set of error records is available after the
     * job has completed and failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRollbackErrors(java.util.Collection)} or {@link #withRollbackErrors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param rollbackErrors
     *        An array of error records that describes any failures that occurred while an import job was attempting a
     *        rollback.</p>
     *        <p>
     *        Error records accumulate while the job is still running. The complete set of error records is available
     *        after the job has completed and failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withRollbackErrors(AssetBundleImportJobError... rollbackErrors) {
        if (this.rollbackErrors == null) {
            setRollbackErrors(new java.util.ArrayList<AssetBundleImportJobError>(rollbackErrors.length));
        }
        for (AssetBundleImportJobError ele : rollbackErrors) {
            this.rollbackErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred while an import job was attempting a
     * rollback.
     * </p>
     * <p>
     * Error records accumulate while the job is still running. The complete set of error records is available after the
     * job has completed and failed.
     * </p>
     * 
     * @param rollbackErrors
     *        An array of error records that describes any failures that occurred while an import job was attempting a
     *        rollback.</p>
     *        <p>
     *        Error records accumulate while the job is still running. The complete set of error records is available
     *        after the job has completed and failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withRollbackErrors(java.util.Collection<AssetBundleImportJobError> rollbackErrors) {
        setRollbackErrors(rollbackErrors);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the import job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the import job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the import job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the import job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the import job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time that the import job was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the import job was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that the import job was created.
     * </p>
     * 
     * @return The time that the import job was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that the import job was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the import job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleImportJob</code> API
     * call.
     * </p>
     * 
     * @param assetBundleImportJobId
     *        The ID of the job. The job ID is set when you start a new job with a
     *        <code>StartAssetBundleImportJob</code> API call.
     */

    public void setAssetBundleImportJobId(String assetBundleImportJobId) {
        this.assetBundleImportJobId = assetBundleImportJobId;
    }

    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleImportJob</code> API
     * call.
     * </p>
     * 
     * @return The ID of the job. The job ID is set when you start a new job with a
     *         <code>StartAssetBundleImportJob</code> API call.
     */

    public String getAssetBundleImportJobId() {
        return this.assetBundleImportJobId;
    }

    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleImportJob</code> API
     * call.
     * </p>
     * 
     * @param assetBundleImportJobId
     *        The ID of the job. The job ID is set when you start a new job with a
     *        <code>StartAssetBundleImportJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withAssetBundleImportJobId(String assetBundleImportJobId) {
        setAssetBundleImportJobId(assetBundleImportJobId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account the import job was executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account the import job was executed in.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account the import job was executed in.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account the import job was executed in.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account the import job was executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account the import job was executed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The source of the asset bundle zip file that contains the data that is imported by the job.
     * </p>
     * 
     * @param assetBundleImportSource
     *        The source of the asset bundle zip file that contains the data that is imported by the job.
     */

    public void setAssetBundleImportSource(AssetBundleImportSourceDescription assetBundleImportSource) {
        this.assetBundleImportSource = assetBundleImportSource;
    }

    /**
     * <p>
     * The source of the asset bundle zip file that contains the data that is imported by the job.
     * </p>
     * 
     * @return The source of the asset bundle zip file that contains the data that is imported by the job.
     */

    public AssetBundleImportSourceDescription getAssetBundleImportSource() {
        return this.assetBundleImportSource;
    }

    /**
     * <p>
     * The source of the asset bundle zip file that contains the data that is imported by the job.
     * </p>
     * 
     * @param assetBundleImportSource
     *        The source of the asset bundle zip file that contains the data that is imported by the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withAssetBundleImportSource(AssetBundleImportSourceDescription assetBundleImportSource) {
        setAssetBundleImportSource(assetBundleImportSource);
        return this;
    }

    /**
     * <p>
     * Optional overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overrideParameters
     *        Optional overrides that are applied to the resource configuration before import.
     */

    public void setOverrideParameters(AssetBundleImportJobOverrideParameters overrideParameters) {
        this.overrideParameters = overrideParameters;
    }

    /**
     * <p>
     * Optional overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @return Optional overrides that are applied to the resource configuration before import.
     */

    public AssetBundleImportJobOverrideParameters getOverrideParameters() {
        return this.overrideParameters;
    }

    /**
     * <p>
     * Optional overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overrideParameters
     *        Optional overrides that are applied to the resource configuration before import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withOverrideParameters(AssetBundleImportJobOverrideParameters overrideParameters) {
        setOverrideParameters(overrideParameters);
        return this;
    }

    /**
     * <p>
     * The failure action for the import job.
     * </p>
     * 
     * @param failureAction
     *        The failure action for the import job.
     * @see AssetBundleImportFailureAction
     */

    public void setFailureAction(String failureAction) {
        this.failureAction = failureAction;
    }

    /**
     * <p>
     * The failure action for the import job.
     * </p>
     * 
     * @return The failure action for the import job.
     * @see AssetBundleImportFailureAction
     */

    public String getFailureAction() {
        return this.failureAction;
    }

    /**
     * <p>
     * The failure action for the import job.
     * </p>
     * 
     * @param failureAction
     *        The failure action for the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleImportFailureAction
     */

    public DescribeAssetBundleImportJobResult withFailureAction(String failureAction) {
        setFailureAction(failureAction);
        return this;
    }

    /**
     * <p>
     * The failure action for the import job.
     * </p>
     * 
     * @param failureAction
     *        The failure action for the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleImportFailureAction
     */

    public DescribeAssetBundleImportJobResult withFailureAction(AssetBundleImportFailureAction failureAction) {
        this.failureAction = failureAction.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the response.
     * </p>
     * 
     * @param status
     *        The HTTP status of the response.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the response.
     * </p>
     * 
     * @return The HTTP status of the response.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the response.
     * </p>
     * 
     * @param status
     *        The HTTP status of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Optional permission overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overridePermissions
     *        Optional permission overrides that are applied to the resource configuration before import.
     */

    public void setOverridePermissions(AssetBundleImportJobOverridePermissions overridePermissions) {
        this.overridePermissions = overridePermissions;
    }

    /**
     * <p>
     * Optional permission overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @return Optional permission overrides that are applied to the resource configuration before import.
     */

    public AssetBundleImportJobOverridePermissions getOverridePermissions() {
        return this.overridePermissions;
    }

    /**
     * <p>
     * Optional permission overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overridePermissions
     *        Optional permission overrides that are applied to the resource configuration before import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withOverridePermissions(AssetBundleImportJobOverridePermissions overridePermissions) {
        setOverridePermissions(overridePermissions);
        return this;
    }

    /**
     * <p>
     * Optional tag overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overrideTags
     *        Optional tag overrides that are applied to the resource configuration before import.
     */

    public void setOverrideTags(AssetBundleImportJobOverrideTags overrideTags) {
        this.overrideTags = overrideTags;
    }

    /**
     * <p>
     * Optional tag overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @return Optional tag overrides that are applied to the resource configuration before import.
     */

    public AssetBundleImportJobOverrideTags getOverrideTags() {
        return this.overrideTags;
    }

    /**
     * <p>
     * Optional tag overrides that are applied to the resource configuration before import.
     * </p>
     * 
     * @param overrideTags
     *        Optional tag overrides that are applied to the resource configuration before import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withOverrideTags(AssetBundleImportJobOverrideTags overrideTags) {
        setOverrideTags(overrideTags);
        return this;
    }

    /**
     * <p>
     * An optional validation strategy override for all analyses and dashboards to be applied to the resource
     * configuration before import.
     * </p>
     * 
     * @param overrideValidationStrategy
     *        An optional validation strategy override for all analyses and dashboards to be applied to the resource
     *        configuration before import.
     */

    public void setOverrideValidationStrategy(AssetBundleImportJobOverrideValidationStrategy overrideValidationStrategy) {
        this.overrideValidationStrategy = overrideValidationStrategy;
    }

    /**
     * <p>
     * An optional validation strategy override for all analyses and dashboards to be applied to the resource
     * configuration before import.
     * </p>
     * 
     * @return An optional validation strategy override for all analyses and dashboards to be applied to the resource
     *         configuration before import.
     */

    public AssetBundleImportJobOverrideValidationStrategy getOverrideValidationStrategy() {
        return this.overrideValidationStrategy;
    }

    /**
     * <p>
     * An optional validation strategy override for all analyses and dashboards to be applied to the resource
     * configuration before import.
     * </p>
     * 
     * @param overrideValidationStrategy
     *        An optional validation strategy override for all analyses and dashboards to be applied to the resource
     *        configuration before import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withOverrideValidationStrategy(AssetBundleImportJobOverrideValidationStrategy overrideValidationStrategy) {
        setOverrideValidationStrategy(overrideValidationStrategy);
        return this;
    }

    /**
     * <p>
     * An array of warning records that describe all permitted errors that are encountered during the import job.
     * </p>
     * 
     * @return An array of warning records that describe all permitted errors that are encountered during the import
     *         job.
     */

    public java.util.List<AssetBundleImportJobWarning> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * An array of warning records that describe all permitted errors that are encountered during the import job.
     * </p>
     * 
     * @param warnings
     *        An array of warning records that describe all permitted errors that are encountered during the import job.
     */

    public void setWarnings(java.util.Collection<AssetBundleImportJobWarning> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<AssetBundleImportJobWarning>(warnings);
    }

    /**
     * <p>
     * An array of warning records that describe all permitted errors that are encountered during the import job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        An array of warning records that describe all permitted errors that are encountered during the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withWarnings(AssetBundleImportJobWarning... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<AssetBundleImportJobWarning>(warnings.length));
        }
        for (AssetBundleImportJobWarning ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of warning records that describe all permitted errors that are encountered during the import job.
     * </p>
     * 
     * @param warnings
     *        An array of warning records that describe all permitted errors that are encountered during the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleImportJobResult withWarnings(java.util.Collection<AssetBundleImportJobWarning> warnings) {
        setWarnings(warnings);
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
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getRollbackErrors() != null)
            sb.append("RollbackErrors: ").append(getRollbackErrors()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getAssetBundleImportJobId() != null)
            sb.append("AssetBundleImportJobId: ").append(getAssetBundleImportJobId()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAssetBundleImportSource() != null)
            sb.append("AssetBundleImportSource: ").append(getAssetBundleImportSource()).append(",");
        if (getOverrideParameters() != null)
            sb.append("OverrideParameters: ").append(getOverrideParameters()).append(",");
        if (getFailureAction() != null)
            sb.append("FailureAction: ").append(getFailureAction()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOverridePermissions() != null)
            sb.append("OverridePermissions: ").append(getOverridePermissions()).append(",");
        if (getOverrideTags() != null)
            sb.append("OverrideTags: ").append(getOverrideTags()).append(",");
        if (getOverrideValidationStrategy() != null)
            sb.append("OverrideValidationStrategy: ").append(getOverrideValidationStrategy()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssetBundleImportJobResult == false)
            return false;
        DescribeAssetBundleImportJobResult other = (DescribeAssetBundleImportJobResult) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getRollbackErrors() == null ^ this.getRollbackErrors() == null)
            return false;
        if (other.getRollbackErrors() != null && other.getRollbackErrors().equals(this.getRollbackErrors()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getAssetBundleImportJobId() == null ^ this.getAssetBundleImportJobId() == null)
            return false;
        if (other.getAssetBundleImportJobId() != null && other.getAssetBundleImportJobId().equals(this.getAssetBundleImportJobId()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssetBundleImportSource() == null ^ this.getAssetBundleImportSource() == null)
            return false;
        if (other.getAssetBundleImportSource() != null && other.getAssetBundleImportSource().equals(this.getAssetBundleImportSource()) == false)
            return false;
        if (other.getOverrideParameters() == null ^ this.getOverrideParameters() == null)
            return false;
        if (other.getOverrideParameters() != null && other.getOverrideParameters().equals(this.getOverrideParameters()) == false)
            return false;
        if (other.getFailureAction() == null ^ this.getFailureAction() == null)
            return false;
        if (other.getFailureAction() != null && other.getFailureAction().equals(this.getFailureAction()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOverridePermissions() == null ^ this.getOverridePermissions() == null)
            return false;
        if (other.getOverridePermissions() != null && other.getOverridePermissions().equals(this.getOverridePermissions()) == false)
            return false;
        if (other.getOverrideTags() == null ^ this.getOverrideTags() == null)
            return false;
        if (other.getOverrideTags() != null && other.getOverrideTags().equals(this.getOverrideTags()) == false)
            return false;
        if (other.getOverrideValidationStrategy() == null ^ this.getOverrideValidationStrategy() == null)
            return false;
        if (other.getOverrideValidationStrategy() != null && other.getOverrideValidationStrategy().equals(this.getOverrideValidationStrategy()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getRollbackErrors() == null) ? 0 : getRollbackErrors().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getAssetBundleImportJobId() == null) ? 0 : getAssetBundleImportJobId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAssetBundleImportSource() == null) ? 0 : getAssetBundleImportSource().hashCode());
        hashCode = prime * hashCode + ((getOverrideParameters() == null) ? 0 : getOverrideParameters().hashCode());
        hashCode = prime * hashCode + ((getFailureAction() == null) ? 0 : getFailureAction().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOverridePermissions() == null) ? 0 : getOverridePermissions().hashCode());
        hashCode = prime * hashCode + ((getOverrideTags() == null) ? 0 : getOverrideTags().hashCode());
        hashCode = prime * hashCode + ((getOverrideValidationStrategy() == null) ? 0 : getOverrideValidationStrategy().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssetBundleImportJobResult clone() {
        try {
            return (DescribeAssetBundleImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
