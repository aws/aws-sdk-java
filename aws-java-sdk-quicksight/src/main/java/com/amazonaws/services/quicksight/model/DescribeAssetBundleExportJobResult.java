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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeAssetBundleExportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetBundleExportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates the status of a job through its queuing and execution.
     * </p>
     * <p>
     * Poll this <code>DescribeAssetBundleExportApi</code> until <code>JobStatus</code> is either
     * <code>SUCCESSFUL</code> or <code>FAILED</code>.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The URL to download the exported asset bundle data from.
     * </p>
     * <p>
     * This URL is available only after the job has succeeded. This URL is valid for 5 minutes after issuance. Call
     * <code>DescribeAssetBundleExportJob</code> again for a fresh URL if needed.
     * </p>
     * <p>
     * The downloaded asset bundle is a zip file named <code>assetbundle-{jobId}.qs</code>. The file has a
     * <code>.qs</code> extension.
     * </p>
     * <p>
     * This URL can't be used in a <code>StartAssetBundleImportJob</code> API call and should only be used for download
     * purposes.
     * </p>
     */
    private String downloadUrl;
    /**
     * <p>
     * An array of error records that describes any failures that occurred during the export job processing.
     * </p>
     * <p>
     * Error records accumulate while the job runs. The complete set of error records is available after the job has
     * completed and failed.
     * </p>
     */
    private java.util.List<AssetBundleExportJobError> errors;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the export job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time that the export job was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleExportJob</code> API
     * call.
     * </p>
     */
    private String assetBundleExportJobId;
    /**
     * <p>
     * The ID of the Amazon Web Services account that the export job was executed in.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * A list of resource ARNs that exported with the job.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * The include dependencies flag.
     * </p>
     */
    private Boolean includeAllDependencies;
    /**
     * <p>
     * The format of the exported asset bundle. A <code>QUICKSIGHT_JSON</code> formatted file can be used to make a
     * <code>StartAssetBundleImportJob</code> API call. A <code>CLOUDFORMATION_JSON</code> formatted file can be used in
     * the CloudFormation console and with the CloudFormation APIs.
     * </p>
     */
    private String exportFormat;
    /**
     * <p>
     * The CloudFormation override property configuration for the export job.
     * </p>
     */
    private AssetBundleCloudFormationOverridePropertyConfiguration cloudFormationOverridePropertyConfiguration;
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
     * The include permissions flag.
     * </p>
     */
    private Boolean includePermissions;
    /**
     * <p>
     * The include tags flag.
     * </p>
     */
    private Boolean includeTags;
    /**
     * <p>
     * The validation strategy that is used to export the analysis or dashboard.
     * </p>
     */
    private AssetBundleExportJobValidationStrategy validationStrategy;
    /**
     * <p>
     * An array of warning records that describe the analysis or dashboard that is exported. This array includes UI
     * errors that can be skipped during the validation process.
     * </p>
     * <p>
     * This property only appears if <code>StrictModeForAllResources</code> in <code>ValidationStrategy</code> is set to
     * <code>FALSE</code>.
     * </p>
     */
    private java.util.List<AssetBundleExportJobWarning> warnings;

    /**
     * <p>
     * Indicates the status of a job through its queuing and execution.
     * </p>
     * <p>
     * Poll this <code>DescribeAssetBundleExportApi</code> until <code>JobStatus</code> is either
     * <code>SUCCESSFUL</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param jobStatus
     *        Indicates the status of a job through its queuing and execution.</p>
     *        <p>
     *        Poll this <code>DescribeAssetBundleExportApi</code> until <code>JobStatus</code> is either
     *        <code>SUCCESSFUL</code> or <code>FAILED</code>.
     * @see AssetBundleExportJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Indicates the status of a job through its queuing and execution.
     * </p>
     * <p>
     * Poll this <code>DescribeAssetBundleExportApi</code> until <code>JobStatus</code> is either
     * <code>SUCCESSFUL</code> or <code>FAILED</code>.
     * </p>
     * 
     * @return Indicates the status of a job through its queuing and execution.</p>
     *         <p>
     *         Poll this <code>DescribeAssetBundleExportApi</code> until <code>JobStatus</code> is either
     *         <code>SUCCESSFUL</code> or <code>FAILED</code>.
     * @see AssetBundleExportJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * Indicates the status of a job through its queuing and execution.
     * </p>
     * <p>
     * Poll this <code>DescribeAssetBundleExportApi</code> until <code>JobStatus</code> is either
     * <code>SUCCESSFUL</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param jobStatus
     *        Indicates the status of a job through its queuing and execution.</p>
     *        <p>
     *        Poll this <code>DescribeAssetBundleExportApi</code> until <code>JobStatus</code> is either
     *        <code>SUCCESSFUL</code> or <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportJobStatus
     */

    public DescribeAssetBundleExportJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the status of a job through its queuing and execution.
     * </p>
     * <p>
     * Poll this <code>DescribeAssetBundleExportApi</code> until <code>JobStatus</code> is either
     * <code>SUCCESSFUL</code> or <code>FAILED</code>.
     * </p>
     * 
     * @param jobStatus
     *        Indicates the status of a job through its queuing and execution.</p>
     *        <p>
     *        Poll this <code>DescribeAssetBundleExportApi</code> until <code>JobStatus</code> is either
     *        <code>SUCCESSFUL</code> or <code>FAILED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportJobStatus
     */

    public DescribeAssetBundleExportJobResult withJobStatus(AssetBundleExportJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The URL to download the exported asset bundle data from.
     * </p>
     * <p>
     * This URL is available only after the job has succeeded. This URL is valid for 5 minutes after issuance. Call
     * <code>DescribeAssetBundleExportJob</code> again for a fresh URL if needed.
     * </p>
     * <p>
     * The downloaded asset bundle is a zip file named <code>assetbundle-{jobId}.qs</code>. The file has a
     * <code>.qs</code> extension.
     * </p>
     * <p>
     * This URL can't be used in a <code>StartAssetBundleImportJob</code> API call and should only be used for download
     * purposes.
     * </p>
     * 
     * @param downloadUrl
     *        The URL to download the exported asset bundle data from.</p>
     *        <p>
     *        This URL is available only after the job has succeeded. This URL is valid for 5 minutes after issuance.
     *        Call <code>DescribeAssetBundleExportJob</code> again for a fresh URL if needed.
     *        </p>
     *        <p>
     *        The downloaded asset bundle is a zip file named <code>assetbundle-{jobId}.qs</code>. The file has a
     *        <code>.qs</code> extension.
     *        </p>
     *        <p>
     *        This URL can't be used in a <code>StartAssetBundleImportJob</code> API call and should only be used for
     *        download purposes.
     */

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * <p>
     * The URL to download the exported asset bundle data from.
     * </p>
     * <p>
     * This URL is available only after the job has succeeded. This URL is valid for 5 minutes after issuance. Call
     * <code>DescribeAssetBundleExportJob</code> again for a fresh URL if needed.
     * </p>
     * <p>
     * The downloaded asset bundle is a zip file named <code>assetbundle-{jobId}.qs</code>. The file has a
     * <code>.qs</code> extension.
     * </p>
     * <p>
     * This URL can't be used in a <code>StartAssetBundleImportJob</code> API call and should only be used for download
     * purposes.
     * </p>
     * 
     * @return The URL to download the exported asset bundle data from.</p>
     *         <p>
     *         This URL is available only after the job has succeeded. This URL is valid for 5 minutes after issuance.
     *         Call <code>DescribeAssetBundleExportJob</code> again for a fresh URL if needed.
     *         </p>
     *         <p>
     *         The downloaded asset bundle is a zip file named <code>assetbundle-{jobId}.qs</code>. The file has a
     *         <code>.qs</code> extension.
     *         </p>
     *         <p>
     *         This URL can't be used in a <code>StartAssetBundleImportJob</code> API call and should only be used for
     *         download purposes.
     */

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * <p>
     * The URL to download the exported asset bundle data from.
     * </p>
     * <p>
     * This URL is available only after the job has succeeded. This URL is valid for 5 minutes after issuance. Call
     * <code>DescribeAssetBundleExportJob</code> again for a fresh URL if needed.
     * </p>
     * <p>
     * The downloaded asset bundle is a zip file named <code>assetbundle-{jobId}.qs</code>. The file has a
     * <code>.qs</code> extension.
     * </p>
     * <p>
     * This URL can't be used in a <code>StartAssetBundleImportJob</code> API call and should only be used for download
     * purposes.
     * </p>
     * 
     * @param downloadUrl
     *        The URL to download the exported asset bundle data from.</p>
     *        <p>
     *        This URL is available only after the job has succeeded. This URL is valid for 5 minutes after issuance.
     *        Call <code>DescribeAssetBundleExportJob</code> again for a fresh URL if needed.
     *        </p>
     *        <p>
     *        The downloaded asset bundle is a zip file named <code>assetbundle-{jobId}.qs</code>. The file has a
     *        <code>.qs</code> extension.
     *        </p>
     *        <p>
     *        This URL can't be used in a <code>StartAssetBundleImportJob</code> API call and should only be used for
     *        download purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withDownloadUrl(String downloadUrl) {
        setDownloadUrl(downloadUrl);
        return this;
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred during the export job processing.
     * </p>
     * <p>
     * Error records accumulate while the job runs. The complete set of error records is available after the job has
     * completed and failed.
     * </p>
     * 
     * @return An array of error records that describes any failures that occurred during the export job processing.</p>
     *         <p>
     *         Error records accumulate while the job runs. The complete set of error records is available after the job
     *         has completed and failed.
     */

    public java.util.List<AssetBundleExportJobError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred during the export job processing.
     * </p>
     * <p>
     * Error records accumulate while the job runs. The complete set of error records is available after the job has
     * completed and failed.
     * </p>
     * 
     * @param errors
     *        An array of error records that describes any failures that occurred during the export job processing.</p>
     *        <p>
     *        Error records accumulate while the job runs. The complete set of error records is available after the job
     *        has completed and failed.
     */

    public void setErrors(java.util.Collection<AssetBundleExportJobError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<AssetBundleExportJobError>(errors);
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred during the export job processing.
     * </p>
     * <p>
     * Error records accumulate while the job runs. The complete set of error records is available after the job has
     * completed and failed.
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
     *        Error records accumulate while the job runs. The complete set of error records is available after the job
     *        has completed and failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withErrors(AssetBundleExportJobError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<AssetBundleExportJobError>(errors.length));
        }
        for (AssetBundleExportJobError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of error records that describes any failures that occurred during the export job processing.
     * </p>
     * <p>
     * Error records accumulate while the job runs. The complete set of error records is available after the job has
     * completed and failed.
     * </p>
     * 
     * @param errors
     *        An array of error records that describes any failures that occurred during the export job processing.</p>
     *        <p>
     *        Error records accumulate while the job runs. The complete set of error records is available after the job
     *        has completed and failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withErrors(java.util.Collection<AssetBundleExportJobError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the export job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the export job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the export job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the export job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the export job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time that the export job was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the export job was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time that the export job was created.
     * </p>
     * 
     * @return The time that the export job was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time that the export job was created.
     * </p>
     * 
     * @param createdTime
     *        The time that the export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleExportJob</code> API
     * call.
     * </p>
     * 
     * @param assetBundleExportJobId
     *        The ID of the job. The job ID is set when you start a new job with a
     *        <code>StartAssetBundleExportJob</code> API call.
     */

    public void setAssetBundleExportJobId(String assetBundleExportJobId) {
        this.assetBundleExportJobId = assetBundleExportJobId;
    }

    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleExportJob</code> API
     * call.
     * </p>
     * 
     * @return The ID of the job. The job ID is set when you start a new job with a
     *         <code>StartAssetBundleExportJob</code> API call.
     */

    public String getAssetBundleExportJobId() {
        return this.assetBundleExportJobId;
    }

    /**
     * <p>
     * The ID of the job. The job ID is set when you start a new job with a <code>StartAssetBundleExportJob</code> API
     * call.
     * </p>
     * 
     * @param assetBundleExportJobId
     *        The ID of the job. The job ID is set when you start a new job with a
     *        <code>StartAssetBundleExportJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withAssetBundleExportJobId(String assetBundleExportJobId) {
        setAssetBundleExportJobId(assetBundleExportJobId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that the export job was executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that the export job was executed in.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that the export job was executed in.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that the export job was executed in.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that the export job was executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that the export job was executed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * A list of resource ARNs that exported with the job.
     * </p>
     * 
     * @return A list of resource ARNs that exported with the job.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * A list of resource ARNs that exported with the job.
     * </p>
     * 
     * @param resourceArns
     *        A list of resource ARNs that exported with the job.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * A list of resource ARNs that exported with the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        A list of resource ARNs that exported with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource ARNs that exported with the job.
     * </p>
     * 
     * @param resourceArns
     *        A list of resource ARNs that exported with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The include dependencies flag.
     * </p>
     * 
     * @param includeAllDependencies
     *        The include dependencies flag.
     */

    public void setIncludeAllDependencies(Boolean includeAllDependencies) {
        this.includeAllDependencies = includeAllDependencies;
    }

    /**
     * <p>
     * The include dependencies flag.
     * </p>
     * 
     * @return The include dependencies flag.
     */

    public Boolean getIncludeAllDependencies() {
        return this.includeAllDependencies;
    }

    /**
     * <p>
     * The include dependencies flag.
     * </p>
     * 
     * @param includeAllDependencies
     *        The include dependencies flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withIncludeAllDependencies(Boolean includeAllDependencies) {
        setIncludeAllDependencies(includeAllDependencies);
        return this;
    }

    /**
     * <p>
     * The include dependencies flag.
     * </p>
     * 
     * @return The include dependencies flag.
     */

    public Boolean isIncludeAllDependencies() {
        return this.includeAllDependencies;
    }

    /**
     * <p>
     * The format of the exported asset bundle. A <code>QUICKSIGHT_JSON</code> formatted file can be used to make a
     * <code>StartAssetBundleImportJob</code> API call. A <code>CLOUDFORMATION_JSON</code> formatted file can be used in
     * the CloudFormation console and with the CloudFormation APIs.
     * </p>
     * 
     * @param exportFormat
     *        The format of the exported asset bundle. A <code>QUICKSIGHT_JSON</code> formatted file can be used to make
     *        a <code>StartAssetBundleImportJob</code> API call. A <code>CLOUDFORMATION_JSON</code> formatted file can
     *        be used in the CloudFormation console and with the CloudFormation APIs.
     * @see AssetBundleExportFormat
     */

    public void setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
    }

    /**
     * <p>
     * The format of the exported asset bundle. A <code>QUICKSIGHT_JSON</code> formatted file can be used to make a
     * <code>StartAssetBundleImportJob</code> API call. A <code>CLOUDFORMATION_JSON</code> formatted file can be used in
     * the CloudFormation console and with the CloudFormation APIs.
     * </p>
     * 
     * @return The format of the exported asset bundle. A <code>QUICKSIGHT_JSON</code> formatted file can be used to
     *         make a <code>StartAssetBundleImportJob</code> API call. A <code>CLOUDFORMATION_JSON</code> formatted file
     *         can be used in the CloudFormation console and with the CloudFormation APIs.
     * @see AssetBundleExportFormat
     */

    public String getExportFormat() {
        return this.exportFormat;
    }

    /**
     * <p>
     * The format of the exported asset bundle. A <code>QUICKSIGHT_JSON</code> formatted file can be used to make a
     * <code>StartAssetBundleImportJob</code> API call. A <code>CLOUDFORMATION_JSON</code> formatted file can be used in
     * the CloudFormation console and with the CloudFormation APIs.
     * </p>
     * 
     * @param exportFormat
     *        The format of the exported asset bundle. A <code>QUICKSIGHT_JSON</code> formatted file can be used to make
     *        a <code>StartAssetBundleImportJob</code> API call. A <code>CLOUDFORMATION_JSON</code> formatted file can
     *        be used in the CloudFormation console and with the CloudFormation APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportFormat
     */

    public DescribeAssetBundleExportJobResult withExportFormat(String exportFormat) {
        setExportFormat(exportFormat);
        return this;
    }

    /**
     * <p>
     * The format of the exported asset bundle. A <code>QUICKSIGHT_JSON</code> formatted file can be used to make a
     * <code>StartAssetBundleImportJob</code> API call. A <code>CLOUDFORMATION_JSON</code> formatted file can be used in
     * the CloudFormation console and with the CloudFormation APIs.
     * </p>
     * 
     * @param exportFormat
     *        The format of the exported asset bundle. A <code>QUICKSIGHT_JSON</code> formatted file can be used to make
     *        a <code>StartAssetBundleImportJob</code> API call. A <code>CLOUDFORMATION_JSON</code> formatted file can
     *        be used in the CloudFormation console and with the CloudFormation APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportFormat
     */

    public DescribeAssetBundleExportJobResult withExportFormat(AssetBundleExportFormat exportFormat) {
        this.exportFormat = exportFormat.toString();
        return this;
    }

    /**
     * <p>
     * The CloudFormation override property configuration for the export job.
     * </p>
     * 
     * @param cloudFormationOverridePropertyConfiguration
     *        The CloudFormation override property configuration for the export job.
     */

    public void setCloudFormationOverridePropertyConfiguration(
            AssetBundleCloudFormationOverridePropertyConfiguration cloudFormationOverridePropertyConfiguration) {
        this.cloudFormationOverridePropertyConfiguration = cloudFormationOverridePropertyConfiguration;
    }

    /**
     * <p>
     * The CloudFormation override property configuration for the export job.
     * </p>
     * 
     * @return The CloudFormation override property configuration for the export job.
     */

    public AssetBundleCloudFormationOverridePropertyConfiguration getCloudFormationOverridePropertyConfiguration() {
        return this.cloudFormationOverridePropertyConfiguration;
    }

    /**
     * <p>
     * The CloudFormation override property configuration for the export job.
     * </p>
     * 
     * @param cloudFormationOverridePropertyConfiguration
     *        The CloudFormation override property configuration for the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withCloudFormationOverridePropertyConfiguration(
            AssetBundleCloudFormationOverridePropertyConfiguration cloudFormationOverridePropertyConfiguration) {
        setCloudFormationOverridePropertyConfiguration(cloudFormationOverridePropertyConfiguration);
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

    public DescribeAssetBundleExportJobResult withRequestId(String requestId) {
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

    public DescribeAssetBundleExportJobResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The include permissions flag.
     * </p>
     * 
     * @param includePermissions
     *        The include permissions flag.
     */

    public void setIncludePermissions(Boolean includePermissions) {
        this.includePermissions = includePermissions;
    }

    /**
     * <p>
     * The include permissions flag.
     * </p>
     * 
     * @return The include permissions flag.
     */

    public Boolean getIncludePermissions() {
        return this.includePermissions;
    }

    /**
     * <p>
     * The include permissions flag.
     * </p>
     * 
     * @param includePermissions
     *        The include permissions flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withIncludePermissions(Boolean includePermissions) {
        setIncludePermissions(includePermissions);
        return this;
    }

    /**
     * <p>
     * The include permissions flag.
     * </p>
     * 
     * @return The include permissions flag.
     */

    public Boolean isIncludePermissions() {
        return this.includePermissions;
    }

    /**
     * <p>
     * The include tags flag.
     * </p>
     * 
     * @param includeTags
     *        The include tags flag.
     */

    public void setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
    }

    /**
     * <p>
     * The include tags flag.
     * </p>
     * 
     * @return The include tags flag.
     */

    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    /**
     * <p>
     * The include tags flag.
     * </p>
     * 
     * @param includeTags
     *        The include tags flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withIncludeTags(Boolean includeTags) {
        setIncludeTags(includeTags);
        return this;
    }

    /**
     * <p>
     * The include tags flag.
     * </p>
     * 
     * @return The include tags flag.
     */

    public Boolean isIncludeTags() {
        return this.includeTags;
    }

    /**
     * <p>
     * The validation strategy that is used to export the analysis or dashboard.
     * </p>
     * 
     * @param validationStrategy
     *        The validation strategy that is used to export the analysis or dashboard.
     */

    public void setValidationStrategy(AssetBundleExportJobValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    /**
     * <p>
     * The validation strategy that is used to export the analysis or dashboard.
     * </p>
     * 
     * @return The validation strategy that is used to export the analysis or dashboard.
     */

    public AssetBundleExportJobValidationStrategy getValidationStrategy() {
        return this.validationStrategy;
    }

    /**
     * <p>
     * The validation strategy that is used to export the analysis or dashboard.
     * </p>
     * 
     * @param validationStrategy
     *        The validation strategy that is used to export the analysis or dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withValidationStrategy(AssetBundleExportJobValidationStrategy validationStrategy) {
        setValidationStrategy(validationStrategy);
        return this;
    }

    /**
     * <p>
     * An array of warning records that describe the analysis or dashboard that is exported. This array includes UI
     * errors that can be skipped during the validation process.
     * </p>
     * <p>
     * This property only appears if <code>StrictModeForAllResources</code> in <code>ValidationStrategy</code> is set to
     * <code>FALSE</code>.
     * </p>
     * 
     * @return An array of warning records that describe the analysis or dashboard that is exported. This array includes
     *         UI errors that can be skipped during the validation process.</p>
     *         <p>
     *         This property only appears if <code>StrictModeForAllResources</code> in <code>ValidationStrategy</code>
     *         is set to <code>FALSE</code>.
     */

    public java.util.List<AssetBundleExportJobWarning> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * An array of warning records that describe the analysis or dashboard that is exported. This array includes UI
     * errors that can be skipped during the validation process.
     * </p>
     * <p>
     * This property only appears if <code>StrictModeForAllResources</code> in <code>ValidationStrategy</code> is set to
     * <code>FALSE</code>.
     * </p>
     * 
     * @param warnings
     *        An array of warning records that describe the analysis or dashboard that is exported. This array includes
     *        UI errors that can be skipped during the validation process.</p>
     *        <p>
     *        This property only appears if <code>StrictModeForAllResources</code> in <code>ValidationStrategy</code> is
     *        set to <code>FALSE</code>.
     */

    public void setWarnings(java.util.Collection<AssetBundleExportJobWarning> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<AssetBundleExportJobWarning>(warnings);
    }

    /**
     * <p>
     * An array of warning records that describe the analysis or dashboard that is exported. This array includes UI
     * errors that can be skipped during the validation process.
     * </p>
     * <p>
     * This property only appears if <code>StrictModeForAllResources</code> in <code>ValidationStrategy</code> is set to
     * <code>FALSE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        An array of warning records that describe the analysis or dashboard that is exported. This array includes
     *        UI errors that can be skipped during the validation process.</p>
     *        <p>
     *        This property only appears if <code>StrictModeForAllResources</code> in <code>ValidationStrategy</code> is
     *        set to <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withWarnings(AssetBundleExportJobWarning... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<AssetBundleExportJobWarning>(warnings.length));
        }
        for (AssetBundleExportJobWarning ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of warning records that describe the analysis or dashboard that is exported. This array includes UI
     * errors that can be skipped during the validation process.
     * </p>
     * <p>
     * This property only appears if <code>StrictModeForAllResources</code> in <code>ValidationStrategy</code> is set to
     * <code>FALSE</code>.
     * </p>
     * 
     * @param warnings
     *        An array of warning records that describe the analysis or dashboard that is exported. This array includes
     *        UI errors that can be skipped during the validation process.</p>
     *        <p>
     *        This property only appears if <code>StrictModeForAllResources</code> in <code>ValidationStrategy</code> is
     *        set to <code>FALSE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssetBundleExportJobResult withWarnings(java.util.Collection<AssetBundleExportJobWarning> warnings) {
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
        if (getDownloadUrl() != null)
            sb.append("DownloadUrl: ").append("***Sensitive Data Redacted***").append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getAssetBundleExportJobId() != null)
            sb.append("AssetBundleExportJobId: ").append(getAssetBundleExportJobId()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getIncludeAllDependencies() != null)
            sb.append("IncludeAllDependencies: ").append(getIncludeAllDependencies()).append(",");
        if (getExportFormat() != null)
            sb.append("ExportFormat: ").append(getExportFormat()).append(",");
        if (getCloudFormationOverridePropertyConfiguration() != null)
            sb.append("CloudFormationOverridePropertyConfiguration: ").append(getCloudFormationOverridePropertyConfiguration()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIncludePermissions() != null)
            sb.append("IncludePermissions: ").append(getIncludePermissions()).append(",");
        if (getIncludeTags() != null)
            sb.append("IncludeTags: ").append(getIncludeTags()).append(",");
        if (getValidationStrategy() != null)
            sb.append("ValidationStrategy: ").append(getValidationStrategy()).append(",");
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

        if (obj instanceof DescribeAssetBundleExportJobResult == false)
            return false;
        DescribeAssetBundleExportJobResult other = (DescribeAssetBundleExportJobResult) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getDownloadUrl() == null ^ this.getDownloadUrl() == null)
            return false;
        if (other.getDownloadUrl() != null && other.getDownloadUrl().equals(this.getDownloadUrl()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getAssetBundleExportJobId() == null ^ this.getAssetBundleExportJobId() == null)
            return false;
        if (other.getAssetBundleExportJobId() != null && other.getAssetBundleExportJobId().equals(this.getAssetBundleExportJobId()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getIncludeAllDependencies() == null ^ this.getIncludeAllDependencies() == null)
            return false;
        if (other.getIncludeAllDependencies() != null && other.getIncludeAllDependencies().equals(this.getIncludeAllDependencies()) == false)
            return false;
        if (other.getExportFormat() == null ^ this.getExportFormat() == null)
            return false;
        if (other.getExportFormat() != null && other.getExportFormat().equals(this.getExportFormat()) == false)
            return false;
        if (other.getCloudFormationOverridePropertyConfiguration() == null ^ this.getCloudFormationOverridePropertyConfiguration() == null)
            return false;
        if (other.getCloudFormationOverridePropertyConfiguration() != null
                && other.getCloudFormationOverridePropertyConfiguration().equals(this.getCloudFormationOverridePropertyConfiguration()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIncludePermissions() == null ^ this.getIncludePermissions() == null)
            return false;
        if (other.getIncludePermissions() != null && other.getIncludePermissions().equals(this.getIncludePermissions()) == false)
            return false;
        if (other.getIncludeTags() == null ^ this.getIncludeTags() == null)
            return false;
        if (other.getIncludeTags() != null && other.getIncludeTags().equals(this.getIncludeTags()) == false)
            return false;
        if (other.getValidationStrategy() == null ^ this.getValidationStrategy() == null)
            return false;
        if (other.getValidationStrategy() != null && other.getValidationStrategy().equals(this.getValidationStrategy()) == false)
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
        hashCode = prime * hashCode + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getAssetBundleExportJobId() == null) ? 0 : getAssetBundleExportJobId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getIncludeAllDependencies() == null) ? 0 : getIncludeAllDependencies().hashCode());
        hashCode = prime * hashCode + ((getExportFormat() == null) ? 0 : getExportFormat().hashCode());
        hashCode = prime * hashCode
                + ((getCloudFormationOverridePropertyConfiguration() == null) ? 0 : getCloudFormationOverridePropertyConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIncludePermissions() == null) ? 0 : getIncludePermissions().hashCode());
        hashCode = prime * hashCode + ((getIncludeTags() == null) ? 0 : getIncludeTags().hashCode());
        hashCode = prime * hashCode + ((getValidationStrategy() == null) ? 0 : getValidationStrategy().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssetBundleExportJobResult clone() {
        try {
            return (DescribeAssetBundleExportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
