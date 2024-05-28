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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Account level Launch Configuration Template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/LaunchConfigurationTemplate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchConfigurationTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the Launch Configuration Template.
     * </p>
     */
    private String arn;
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
     * ID of the Launch Configuration Template.
     * </p>
     */
    private String launchConfigurationTemplateID;
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
     * Post-launch actions activated.
     * </p>
     */
    private Boolean postLaunchEnabled;
    /**
     * <p>
     * Tags of the Launch Configuration Template.
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
     * ARN of the Launch Configuration Template.
     * </p>
     * 
     * @param arn
     *        ARN of the Launch Configuration Template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of the Launch Configuration Template.
     * </p>
     * 
     * @return ARN of the Launch Configuration Template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN of the Launch Configuration Template.
     * </p>
     * 
     * @param arn
     *        ARN of the Launch Configuration Template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfigurationTemplate withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public LaunchConfigurationTemplate withCopyPrivateIp(Boolean copyPrivateIp) {
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

    public LaunchConfigurationTemplate withCopyTags(Boolean copyTags) {
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

    public LaunchConfigurationTemplate withExportBucketArn(String exportBucketArn) {
        setExportBucketArn(exportBucketArn);
        return this;
    }

    /**
     * <p>
     * ID of the Launch Configuration Template.
     * </p>
     * 
     * @param launchConfigurationTemplateID
     *        ID of the Launch Configuration Template.
     */

    public void setLaunchConfigurationTemplateID(String launchConfigurationTemplateID) {
        this.launchConfigurationTemplateID = launchConfigurationTemplateID;
    }

    /**
     * <p>
     * ID of the Launch Configuration Template.
     * </p>
     * 
     * @return ID of the Launch Configuration Template.
     */

    public String getLaunchConfigurationTemplateID() {
        return this.launchConfigurationTemplateID;
    }

    /**
     * <p>
     * ID of the Launch Configuration Template.
     * </p>
     * 
     * @param launchConfigurationTemplateID
     *        ID of the Launch Configuration Template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfigurationTemplate withLaunchConfigurationTemplateID(String launchConfigurationTemplateID) {
        setLaunchConfigurationTemplateID(launchConfigurationTemplateID);
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

    public LaunchConfigurationTemplate withLaunchDisposition(String launchDisposition) {
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

    public LaunchConfigurationTemplate withLaunchDisposition(LaunchDisposition launchDisposition) {
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

    public LaunchConfigurationTemplate withLaunchIntoSourceInstance(Boolean launchIntoSourceInstance) {
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

    public LaunchConfigurationTemplate withLicensing(Licensing licensing) {
        setLicensing(licensing);
        return this;
    }

    /**
     * <p>
     * Post-launch actions activated.
     * </p>
     * 
     * @param postLaunchEnabled
     *        Post-launch actions activated.
     */

    public void setPostLaunchEnabled(Boolean postLaunchEnabled) {
        this.postLaunchEnabled = postLaunchEnabled;
    }

    /**
     * <p>
     * Post-launch actions activated.
     * </p>
     * 
     * @return Post-launch actions activated.
     */

    public Boolean getPostLaunchEnabled() {
        return this.postLaunchEnabled;
    }

    /**
     * <p>
     * Post-launch actions activated.
     * </p>
     * 
     * @param postLaunchEnabled
     *        Post-launch actions activated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfigurationTemplate withPostLaunchEnabled(Boolean postLaunchEnabled) {
        setPostLaunchEnabled(postLaunchEnabled);
        return this;
    }

    /**
     * <p>
     * Post-launch actions activated.
     * </p>
     * 
     * @return Post-launch actions activated.
     */

    public Boolean isPostLaunchEnabled() {
        return this.postLaunchEnabled;
    }

    /**
     * <p>
     * Tags of the Launch Configuration Template.
     * </p>
     * 
     * @return Tags of the Launch Configuration Template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags of the Launch Configuration Template.
     * </p>
     * 
     * @param tags
     *        Tags of the Launch Configuration Template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags of the Launch Configuration Template.
     * </p>
     * 
     * @param tags
     *        Tags of the Launch Configuration Template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfigurationTemplate withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see LaunchConfigurationTemplate#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LaunchConfigurationTemplate addTagsEntry(String key, String value) {
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

    public LaunchConfigurationTemplate clearTagsEntries() {
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

    public LaunchConfigurationTemplate withTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
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

    public LaunchConfigurationTemplate withTargetInstanceTypeRightSizingMethod(TargetInstanceTypeRightSizingMethod targetInstanceTypeRightSizingMethod) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCopyPrivateIp() != null)
            sb.append("CopyPrivateIp: ").append(getCopyPrivateIp()).append(",");
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getExportBucketArn() != null)
            sb.append("ExportBucketArn: ").append(getExportBucketArn()).append(",");
        if (getLaunchConfigurationTemplateID() != null)
            sb.append("LaunchConfigurationTemplateID: ").append(getLaunchConfigurationTemplateID()).append(",");
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

        if (obj instanceof LaunchConfigurationTemplate == false)
            return false;
        LaunchConfigurationTemplate other = (LaunchConfigurationTemplate) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getLaunchConfigurationTemplateID() == null ^ this.getLaunchConfigurationTemplateID() == null)
            return false;
        if (other.getLaunchConfigurationTemplateID() != null
                && other.getLaunchConfigurationTemplateID().equals(this.getLaunchConfigurationTemplateID()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCopyPrivateIp() == null) ? 0 : getCopyPrivateIp().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getExportBucketArn() == null) ? 0 : getExportBucketArn().hashCode());
        hashCode = prime * hashCode + ((getLaunchConfigurationTemplateID() == null) ? 0 : getLaunchConfigurationTemplateID().hashCode());
        hashCode = prime * hashCode + ((getLaunchDisposition() == null) ? 0 : getLaunchDisposition().hashCode());
        hashCode = prime * hashCode + ((getLaunchIntoSourceInstance() == null) ? 0 : getLaunchIntoSourceInstance().hashCode());
        hashCode = prime * hashCode + ((getLicensing() == null) ? 0 : getLicensing().hashCode());
        hashCode = prime * hashCode + ((getPostLaunchEnabled() == null) ? 0 : getPostLaunchEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargetInstanceTypeRightSizingMethod() == null) ? 0 : getTargetInstanceTypeRightSizingMethod().hashCode());
        return hashCode;
    }

    @Override
    public LaunchConfigurationTemplate clone() {
        try {
            return (LaunchConfigurationTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.LaunchConfigurationTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
