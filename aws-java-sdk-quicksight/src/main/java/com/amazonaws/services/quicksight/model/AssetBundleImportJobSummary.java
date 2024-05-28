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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the import job that includes details of the requested job's configuration and its current status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleImportJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleImportJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status of the import job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The ARN of the import job.
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
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     */
    private String assetBundleImportJobId;
    /**
     * <p>
     * The failure action for the import job.
     * </p>
     */
    private String failureAction;

    /**
     * <p>
     * The current status of the import job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the import job.
     * @see AssetBundleImportJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the import job.
     * </p>
     * 
     * @return The current status of the import job.
     * @see AssetBundleImportJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the import job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleImportJobStatus
     */

    public AssetBundleImportJobSummary withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the import job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleImportJobStatus
     */

    public AssetBundleImportJobSummary withJobStatus(AssetBundleImportJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the import job.
     * </p>
     * 
     * @param arn
     *        The ARN of the import job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the import job.
     * </p>
     * 
     * @return The ARN of the import job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the import job.
     * </p>
     * 
     * @param arn
     *        The ARN of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobSummary withArn(String arn) {
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

    public AssetBundleImportJobSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     * 
     * @param assetBundleImportJobId
     *        The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse
     *        this ID for another job.
     */

    public void setAssetBundleImportJobId(String assetBundleImportJobId) {
        this.assetBundleImportJobId = assetBundleImportJobId;
    }

    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     * 
     * @return The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse
     *         this ID for another job.
     */

    public String getAssetBundleImportJobId() {
        return this.assetBundleImportJobId;
    }

    /**
     * <p>
     * The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse this ID
     * for another job.
     * </p>
     * 
     * @param assetBundleImportJobId
     *        The ID of the job. This ID is unique while the job is running. After the job is completed, you can reuse
     *        this ID for another job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleImportJobSummary withAssetBundleImportJobId(String assetBundleImportJobId) {
        setAssetBundleImportJobId(assetBundleImportJobId);
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

    public AssetBundleImportJobSummary withFailureAction(String failureAction) {
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

    public AssetBundleImportJobSummary withFailureAction(AssetBundleImportFailureAction failureAction) {
        this.failureAction = failureAction.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getAssetBundleImportJobId() != null)
            sb.append("AssetBundleImportJobId: ").append(getAssetBundleImportJobId()).append(",");
        if (getFailureAction() != null)
            sb.append("FailureAction: ").append(getFailureAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleImportJobSummary == false)
            return false;
        AssetBundleImportJobSummary other = (AssetBundleImportJobSummary) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
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
        if (other.getFailureAction() == null ^ this.getFailureAction() == null)
            return false;
        if (other.getFailureAction() != null && other.getFailureAction().equals(this.getFailureAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getAssetBundleImportJobId() == null) ? 0 : getAssetBundleImportJobId().hashCode());
        hashCode = prime * hashCode + ((getFailureAction() == null) ? 0 : getFailureAction().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleImportJobSummary clone() {
        try {
            return (AssetBundleImportJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleImportJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
