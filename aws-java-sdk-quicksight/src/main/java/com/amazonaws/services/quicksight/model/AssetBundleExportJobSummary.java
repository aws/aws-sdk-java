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
 * A summary of the export job that includes details of the job's configuration and its current status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AssetBundleExportJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetBundleExportJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status of the export job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The ARN of the export job.
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
     * The ID of the export job.
     * </p>
     */
    private String assetBundleExportJobId;
    /**
     * <p>
     * The flag that determines the inclusion of resource dependencies in the returned asset bundle.
     * </p>
     */
    private Boolean includeAllDependencies;
    /**
     * <p>
     * The format for the export job.
     * </p>
     */
    private String exportFormat;
    /**
     * <p>
     * The flag that determines the inclusion of permissions associated with each resource ARN.
     * </p>
     */
    private Boolean includePermissions;
    /**
     * <p>
     * The flag that determines the inclusion of tags associated with each resource ARN.
     * </p>
     */
    private Boolean includeTags;

    /**
     * <p>
     * The current status of the export job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the export job.
     * @see AssetBundleExportJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The current status of the export job.
     * </p>
     * 
     * @return The current status of the export job.
     * @see AssetBundleExportJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The current status of the export job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportJobStatus
     */

    public AssetBundleExportJobSummary withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the export job.
     * </p>
     * 
     * @param jobStatus
     *        The current status of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportJobStatus
     */

    public AssetBundleExportJobSummary withJobStatus(AssetBundleExportJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the export job.
     * </p>
     * 
     * @param arn
     *        The ARN of the export job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the export job.
     * </p>
     * 
     * @return The ARN of the export job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the export job.
     * </p>
     * 
     * @param arn
     *        The ARN of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleExportJobSummary withArn(String arn) {
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

    public AssetBundleExportJobSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The ID of the export job.
     * </p>
     * 
     * @param assetBundleExportJobId
     *        The ID of the export job.
     */

    public void setAssetBundleExportJobId(String assetBundleExportJobId) {
        this.assetBundleExportJobId = assetBundleExportJobId;
    }

    /**
     * <p>
     * The ID of the export job.
     * </p>
     * 
     * @return The ID of the export job.
     */

    public String getAssetBundleExportJobId() {
        return this.assetBundleExportJobId;
    }

    /**
     * <p>
     * The ID of the export job.
     * </p>
     * 
     * @param assetBundleExportJobId
     *        The ID of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleExportJobSummary withAssetBundleExportJobId(String assetBundleExportJobId) {
        setAssetBundleExportJobId(assetBundleExportJobId);
        return this;
    }

    /**
     * <p>
     * The flag that determines the inclusion of resource dependencies in the returned asset bundle.
     * </p>
     * 
     * @param includeAllDependencies
     *        The flag that determines the inclusion of resource dependencies in the returned asset bundle.
     */

    public void setIncludeAllDependencies(Boolean includeAllDependencies) {
        this.includeAllDependencies = includeAllDependencies;
    }

    /**
     * <p>
     * The flag that determines the inclusion of resource dependencies in the returned asset bundle.
     * </p>
     * 
     * @return The flag that determines the inclusion of resource dependencies in the returned asset bundle.
     */

    public Boolean getIncludeAllDependencies() {
        return this.includeAllDependencies;
    }

    /**
     * <p>
     * The flag that determines the inclusion of resource dependencies in the returned asset bundle.
     * </p>
     * 
     * @param includeAllDependencies
     *        The flag that determines the inclusion of resource dependencies in the returned asset bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleExportJobSummary withIncludeAllDependencies(Boolean includeAllDependencies) {
        setIncludeAllDependencies(includeAllDependencies);
        return this;
    }

    /**
     * <p>
     * The flag that determines the inclusion of resource dependencies in the returned asset bundle.
     * </p>
     * 
     * @return The flag that determines the inclusion of resource dependencies in the returned asset bundle.
     */

    public Boolean isIncludeAllDependencies() {
        return this.includeAllDependencies;
    }

    /**
     * <p>
     * The format for the export job.
     * </p>
     * 
     * @param exportFormat
     *        The format for the export job.
     * @see AssetBundleExportFormat
     */

    public void setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
    }

    /**
     * <p>
     * The format for the export job.
     * </p>
     * 
     * @return The format for the export job.
     * @see AssetBundleExportFormat
     */

    public String getExportFormat() {
        return this.exportFormat;
    }

    /**
     * <p>
     * The format for the export job.
     * </p>
     * 
     * @param exportFormat
     *        The format for the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportFormat
     */

    public AssetBundleExportJobSummary withExportFormat(String exportFormat) {
        setExportFormat(exportFormat);
        return this;
    }

    /**
     * <p>
     * The format for the export job.
     * </p>
     * 
     * @param exportFormat
     *        The format for the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetBundleExportFormat
     */

    public AssetBundleExportJobSummary withExportFormat(AssetBundleExportFormat exportFormat) {
        this.exportFormat = exportFormat.toString();
        return this;
    }

    /**
     * <p>
     * The flag that determines the inclusion of permissions associated with each resource ARN.
     * </p>
     * 
     * @param includePermissions
     *        The flag that determines the inclusion of permissions associated with each resource ARN.
     */

    public void setIncludePermissions(Boolean includePermissions) {
        this.includePermissions = includePermissions;
    }

    /**
     * <p>
     * The flag that determines the inclusion of permissions associated with each resource ARN.
     * </p>
     * 
     * @return The flag that determines the inclusion of permissions associated with each resource ARN.
     */

    public Boolean getIncludePermissions() {
        return this.includePermissions;
    }

    /**
     * <p>
     * The flag that determines the inclusion of permissions associated with each resource ARN.
     * </p>
     * 
     * @param includePermissions
     *        The flag that determines the inclusion of permissions associated with each resource ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleExportJobSummary withIncludePermissions(Boolean includePermissions) {
        setIncludePermissions(includePermissions);
        return this;
    }

    /**
     * <p>
     * The flag that determines the inclusion of permissions associated with each resource ARN.
     * </p>
     * 
     * @return The flag that determines the inclusion of permissions associated with each resource ARN.
     */

    public Boolean isIncludePermissions() {
        return this.includePermissions;
    }

    /**
     * <p>
     * The flag that determines the inclusion of tags associated with each resource ARN.
     * </p>
     * 
     * @param includeTags
     *        The flag that determines the inclusion of tags associated with each resource ARN.
     */

    public void setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
    }

    /**
     * <p>
     * The flag that determines the inclusion of tags associated with each resource ARN.
     * </p>
     * 
     * @return The flag that determines the inclusion of tags associated with each resource ARN.
     */

    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    /**
     * <p>
     * The flag that determines the inclusion of tags associated with each resource ARN.
     * </p>
     * 
     * @param includeTags
     *        The flag that determines the inclusion of tags associated with each resource ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetBundleExportJobSummary withIncludeTags(Boolean includeTags) {
        setIncludeTags(includeTags);
        return this;
    }

    /**
     * <p>
     * The flag that determines the inclusion of tags associated with each resource ARN.
     * </p>
     * 
     * @return The flag that determines the inclusion of tags associated with each resource ARN.
     */

    public Boolean isIncludeTags() {
        return this.includeTags;
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
        if (getAssetBundleExportJobId() != null)
            sb.append("AssetBundleExportJobId: ").append(getAssetBundleExportJobId()).append(",");
        if (getIncludeAllDependencies() != null)
            sb.append("IncludeAllDependencies: ").append(getIncludeAllDependencies()).append(",");
        if (getExportFormat() != null)
            sb.append("ExportFormat: ").append(getExportFormat()).append(",");
        if (getIncludePermissions() != null)
            sb.append("IncludePermissions: ").append(getIncludePermissions()).append(",");
        if (getIncludeTags() != null)
            sb.append("IncludeTags: ").append(getIncludeTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetBundleExportJobSummary == false)
            return false;
        AssetBundleExportJobSummary other = (AssetBundleExportJobSummary) obj;
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
        if (other.getAssetBundleExportJobId() == null ^ this.getAssetBundleExportJobId() == null)
            return false;
        if (other.getAssetBundleExportJobId() != null && other.getAssetBundleExportJobId().equals(this.getAssetBundleExportJobId()) == false)
            return false;
        if (other.getIncludeAllDependencies() == null ^ this.getIncludeAllDependencies() == null)
            return false;
        if (other.getIncludeAllDependencies() != null && other.getIncludeAllDependencies().equals(this.getIncludeAllDependencies()) == false)
            return false;
        if (other.getExportFormat() == null ^ this.getExportFormat() == null)
            return false;
        if (other.getExportFormat() != null && other.getExportFormat().equals(this.getExportFormat()) == false)
            return false;
        if (other.getIncludePermissions() == null ^ this.getIncludePermissions() == null)
            return false;
        if (other.getIncludePermissions() != null && other.getIncludePermissions().equals(this.getIncludePermissions()) == false)
            return false;
        if (other.getIncludeTags() == null ^ this.getIncludeTags() == null)
            return false;
        if (other.getIncludeTags() != null && other.getIncludeTags().equals(this.getIncludeTags()) == false)
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
        hashCode = prime * hashCode + ((getAssetBundleExportJobId() == null) ? 0 : getAssetBundleExportJobId().hashCode());
        hashCode = prime * hashCode + ((getIncludeAllDependencies() == null) ? 0 : getIncludeAllDependencies().hashCode());
        hashCode = prime * hashCode + ((getExportFormat() == null) ? 0 : getExportFormat().hashCode());
        hashCode = prime * hashCode + ((getIncludePermissions() == null) ? 0 : getIncludePermissions().hashCode());
        hashCode = prime * hashCode + ((getIncludeTags() == null) ? 0 : getIncludeTags().hashCode());
        return hashCode;
    }

    @Override
    public AssetBundleExportJobSummary clone() {
        try {
            return (AssetBundleExportJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AssetBundleExportJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
