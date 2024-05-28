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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateLaunchConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchConfigurationTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Copy private IP.
     * </p>
     */
    private Boolean copyPrivateIp;
    /**
     * <p>
     * Copy tags.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * S3 bucket ARN to export Source Network templates.
     * </p>
     */
    private String exportBucketArn;
    /**
     * <p>
     * Launch disposition.
     * </p>
     */
    private String launchDisposition;
    /**
     * <p>
     * DRS will set the 'launch into instance ID' of any source server when performing a drill, recovery or failback to
     * the previous region or availability zone, using the instance ID of the source instance.
     * </p>
     */
    private Boolean launchIntoSourceInstance;
    /**
     * <p>
     * Licensing.
     * </p>
     */
    private Licensing licensing;
    /**
     * <p>
     * Whether we want to activate post-launch actions.
     * </p>
     */
    private Boolean postLaunchEnabled;
    /**
     * <p>
     * Request to associate tags during creation of a Launch Configuration Template.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Target instance type right-sizing method.
     * </p>
     */
    private String targetInstanceTypeRightSizingMethod;

    /**
     * <p>
     * Copy private IP.
     * </p>
     * 
     * @param copyPrivateIp
     *        Copy private IP.
     */

    public void setCopyPrivateIp(Boolean copyPrivateIp) {
        this.copyPrivateIp = copyPrivateIp;
    }

    /**
     * <p>
     * Copy private IP.
     * </p>
     * 
     * @return Copy private IP.
     */

    public Boolean getCopyPrivateIp() {
        return this.copyPrivateIp;
    }

    /**
     * <p>
     * Copy private IP.
     * </p>
     * 
     * @param copyPrivateIp
     *        Copy private IP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateRequest withCopyPrivateIp(Boolean copyPrivateIp) {
        setCopyPrivateIp(copyPrivateIp);
        return this;
    }

    /**
     * <p>
     * Copy private IP.
     * </p>
     * 
     * @return Copy private IP.
     */

    public Boolean isCopyPrivateIp() {
        return this.copyPrivateIp;
    }

    /**
     * <p>
     * Copy tags.
     * </p>
     * 
     * @param copyTags
     *        Copy tags.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Copy tags.
     * </p>
     * 
     * @return Copy tags.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Copy tags.
     * </p>
     * 
     * @param copyTags
     *        Copy tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateRequest withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * Copy tags.
     * </p>
     * 
     * @return Copy tags.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * S3 bucket ARN to export Source Network templates.
     * </p>
     * 
     * @param exportBucketArn
     *        S3 bucket ARN to export Source Network templates.
     */

    public void setExportBucketArn(String exportBucketArn) {
        this.exportBucketArn = exportBucketArn;
    }

    /**
     * <p>
     * S3 bucket ARN to export Source Network templates.
     * </p>
     * 
     * @return S3 bucket ARN to export Source Network templates.
     */

    public String getExportBucketArn() {
        return this.exportBucketArn;
    }

    /**
     * <p>
     * S3 bucket ARN to export Source Network templates.
     * </p>
     * 
     * @param exportBucketArn
     *        S3 bucket ARN to export Source Network templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateRequest withExportBucketArn(String exportBucketArn) {
        setExportBucketArn(exportBucketArn);
        return this;
    }

    /**
     * <p>
     * Launch disposition.
     * </p>
     * 
     * @param launchDisposition
     *        Launch disposition.
     * @see LaunchDisposition
     */

    public void setLaunchDisposition(String launchDisposition) {
        this.launchDisposition = launchDisposition;
    }

    /**
     * <p>
     * Launch disposition.
     * </p>
     * 
     * @return Launch disposition.
     * @see LaunchDisposition
     */

    public String getLaunchDisposition() {
        return this.launchDisposition;
    }

    /**
     * <p>
     * Launch disposition.
     * </p>
     * 
     * @param launchDisposition
     *        Launch disposition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchDisposition
     */

    public CreateLaunchConfigurationTemplateRequest withLaunchDisposition(String launchDisposition) {
        setLaunchDisposition(launchDisposition);
        return this;
    }

    /**
     * <p>
     * Launch disposition.
     * </p>
     * 
     * @param launchDisposition
     *        Launch disposition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchDisposition
     */

    public CreateLaunchConfigurationTemplateRequest withLaunchDisposition(LaunchDisposition launchDisposition) {
        this.launchDisposition = launchDisposition.toString();
        return this;
    }

    /**
     * <p>
     * DRS will set the 'launch into instance ID' of any source server when performing a drill, recovery or failback to
     * the previous region or availability zone, using the instance ID of the source instance.
     * </p>
     * 
     * @param launchIntoSourceInstance
     *        DRS will set the 'launch into instance ID' of any source server when performing a drill, recovery or
     *        failback to the previous region or availability zone, using the instance ID of the source instance.
     */

    public void setLaunchIntoSourceInstance(Boolean launchIntoSourceInstance) {
        this.launchIntoSourceInstance = launchIntoSourceInstance;
    }

    /**
     * <p>
     * DRS will set the 'launch into instance ID' of any source server when performing a drill, recovery or failback to
     * the previous region or availability zone, using the instance ID of the source instance.
     * </p>
     * 
     * @return DRS will set the 'launch into instance ID' of any source server when performing a drill, recovery or
     *         failback to the previous region or availability zone, using the instance ID of the source instance.
     */

    public Boolean getLaunchIntoSourceInstance() {
        return this.launchIntoSourceInstance;
    }

    /**
     * <p>
     * DRS will set the 'launch into instance ID' of any source server when performing a drill, recovery or failback to
     * the previous region or availability zone, using the instance ID of the source instance.
     * </p>
     * 
     * @param launchIntoSourceInstance
     *        DRS will set the 'launch into instance ID' of any source server when performing a drill, recovery or
     *        failback to the previous region or availability zone, using the instance ID of the source instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateRequest withLaunchIntoSourceInstance(Boolean launchIntoSourceInstance) {
        setLaunchIntoSourceInstance(launchIntoSourceInstance);
        return this;
    }

    /**
     * <p>
     * DRS will set the 'launch into instance ID' of any source server when performing a drill, recovery or failback to
     * the previous region or availability zone, using the instance ID of the source instance.
     * </p>
     * 
     * @return DRS will set the 'launch into instance ID' of any source server when performing a drill, recovery or
     *         failback to the previous region or availability zone, using the instance ID of the source instance.
     */

    public Boolean isLaunchIntoSourceInstance() {
        return this.launchIntoSourceInstance;
    }

    /**
     * <p>
     * Licensing.
     * </p>
     * 
     * @param licensing
     *        Licensing.
     */

    public void setLicensing(Licensing licensing) {
        this.licensing = licensing;
    }

    /**
     * <p>
     * Licensing.
     * </p>
     * 
     * @return Licensing.
     */

    public Licensing getLicensing() {
        return this.licensing;
    }

    /**
     * <p>
     * Licensing.
     * </p>
     * 
     * @param licensing
     *        Licensing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateRequest withLicensing(Licensing licensing) {
        setLicensing(licensing);
        return this;
    }

    /**
     * <p>
     * Whether we want to activate post-launch actions.
     * </p>
     * 
     * @param postLaunchEnabled
     *        Whether we want to activate post-launch actions.
     */

    public void setPostLaunchEnabled(Boolean postLaunchEnabled) {
        this.postLaunchEnabled = postLaunchEnabled;
    }

    /**
     * <p>
     * Whether we want to activate post-launch actions.
     * </p>
     * 
     * @return Whether we want to activate post-launch actions.
     */

    public Boolean getPostLaunchEnabled() {
        return this.postLaunchEnabled;
    }

    /**
     * <p>
     * Whether we want to activate post-launch actions.
     * </p>
     * 
     * @param postLaunchEnabled
     *        Whether we want to activate post-launch actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateRequest withPostLaunchEnabled(Boolean postLaunchEnabled) {
        setPostLaunchEnabled(postLaunchEnabled);
        return this;
    }

    /**
     * <p>
     * Whether we want to activate post-launch actions.
     * </p>
     * 
     * @return Whether we want to activate post-launch actions.
     */

    public Boolean isPostLaunchEnabled() {
        return this.postLaunchEnabled;
    }

    /**
     * <p>
     * Request to associate tags during creation of a Launch Configuration Template.
     * </p>
     * 
     * @return Request to associate tags during creation of a Launch Configuration Template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Request to associate tags during creation of a Launch Configuration Template.
     * </p>
     * 
     * @param tags
     *        Request to associate tags during creation of a Launch Configuration Template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Request to associate tags during creation of a Launch Configuration Template.
     * </p>
     * 
     * @param tags
     *        Request to associate tags during creation of a Launch Configuration Template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateLaunchConfigurationTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateLaunchConfigurationTemplateRequest addTagsEntry(String key, String value) {
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

    public CreateLaunchConfigurationTemplateRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Target instance type right-sizing method.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Target instance type right-sizing method.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public void setTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
        this.targetInstanceTypeRightSizingMethod = targetInstanceTypeRightSizingMethod;
    }

    /**
     * <p>
     * Target instance type right-sizing method.
     * </p>
     * 
     * @return Target instance type right-sizing method.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public String getTargetInstanceTypeRightSizingMethod() {
        return this.targetInstanceTypeRightSizingMethod;
    }

    /**
     * <p>
     * Target instance type right-sizing method.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Target instance type right-sizing method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public CreateLaunchConfigurationTemplateRequest withTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
        setTargetInstanceTypeRightSizingMethod(targetInstanceTypeRightSizingMethod);
        return this;
    }

    /**
     * <p>
     * Target instance type right-sizing method.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Target instance type right-sizing method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public CreateLaunchConfigurationTemplateRequest withTargetInstanceTypeRightSizingMethod(
            TargetInstanceTypeRightSizingMethod targetInstanceTypeRightSizingMethod) {
        this.targetInstanceTypeRightSizingMethod = targetInstanceTypeRightSizingMethod.toString();
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
        if (getCopyPrivateIp() != null)
            sb.append("CopyPrivateIp: ").append(getCopyPrivateIp()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getExportBucketArn() != null)
            sb.append("ExportBucketArn: ").append(getExportBucketArn()).append(",");
        if (getLaunchDisposition() != null)
            sb.append("LaunchDisposition: ").append(getLaunchDisposition()).append(",");
        if (getLaunchIntoSourceInstance() != null)
            sb.append("LaunchIntoSourceInstance: ").append(getLaunchIntoSourceInstance()).append(",");
        if (getLicensing() != null)
            sb.append("Licensing: ").append(getLicensing()).append(",");
        if (getPostLaunchEnabled() != null)
            sb.append("PostLaunchEnabled: ").append(getPostLaunchEnabled()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getTargetInstanceTypeRightSizingMethod() != null)
            sb.append("TargetInstanceTypeRightSizingMethod: ").append(getTargetInstanceTypeRightSizingMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLaunchConfigurationTemplateRequest == false)
            return false;
        CreateLaunchConfigurationTemplateRequest other = (CreateLaunchConfigurationTemplateRequest) obj;
        if (other.getCopyPrivateIp() == null ^ this.getCopyPrivateIp() == null)
            return false;
        if (other.getCopyPrivateIp() != null && other.getCopyPrivateIp().equals(this.getCopyPrivateIp()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getExportBucketArn() == null ^ this.getExportBucketArn() == null)
            return false;
        if (other.getExportBucketArn() != null && other.getExportBucketArn().equals(this.getExportBucketArn()) == false)
            return false;
        if (other.getLaunchDisposition() == null ^ this.getLaunchDisposition() == null)
            return false;
        if (other.getLaunchDisposition() != null && other.getLaunchDisposition().equals(this.getLaunchDisposition()) == false)
            return false;
        if (other.getLaunchIntoSourceInstance() == null ^ this.getLaunchIntoSourceInstance() == null)
            return false;
        if (other.getLaunchIntoSourceInstance() != null && other.getLaunchIntoSourceInstance().equals(this.getLaunchIntoSourceInstance()) == false)
            return false;
        if (other.getLicensing() == null ^ this.getLicensing() == null)
            return false;
        if (other.getLicensing() != null && other.getLicensing().equals(this.getLicensing()) == false)
            return false;
        if (other.getPostLaunchEnabled() == null ^ this.getPostLaunchEnabled() == null)
            return false;
        if (other.getPostLaunchEnabled() != null && other.getPostLaunchEnabled().equals(this.getPostLaunchEnabled()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargetInstanceTypeRightSizingMethod() == null ^ this.getTargetInstanceTypeRightSizingMethod() == null)
            return false;
        if (other.getTargetInstanceTypeRightSizingMethod() != null
                && other.getTargetInstanceTypeRightSizingMethod().equals(this.getTargetInstanceTypeRightSizingMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyPrivateIp() == null) ? 0 : getCopyPrivateIp().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getExportBucketArn() == null) ? 0 : getExportBucketArn().hashCode());
        hashCode = prime * hashCode + ((getLaunchDisposition() == null) ? 0 : getLaunchDisposition().hashCode());
        hashCode = prime * hashCode + ((getLaunchIntoSourceInstance() == null) ? 0 : getLaunchIntoSourceInstance().hashCode());
        hashCode = prime * hashCode + ((getLicensing() == null) ? 0 : getLicensing().hashCode());
        hashCode = prime * hashCode + ((getPostLaunchEnabled() == null) ? 0 : getPostLaunchEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargetInstanceTypeRightSizingMethod() == null) ? 0 : getTargetInstanceTypeRightSizingMethod().hashCode());
        return hashCode;
    }

    @Override
    public CreateLaunchConfigurationTemplateRequest clone() {
        return (CreateLaunchConfigurationTemplateRequest) super.clone();
    }

}
