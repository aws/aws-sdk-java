/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLaunchConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Copy Private IP during Launch Configuration.
     * </p>
     */
    private Boolean copyPrivateIp;
    /**
     * <p>
     * Copy Tags during Launch Configuration.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * Configure EC2 lauch configuration template ID.
     * </p>
     */
    private String ec2LaunchTemplateID;
    /**
     * <p>
     * Configure launch dispostion for launch configuration.
     * </p>
     */
    private String launchDisposition;
    /**
     * <p>
     * Configure launch configuration OS licensing.
     * </p>
     */
    private Licensing licensing;
    /**
     * <p>
     * Configure launch configuration name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Configure launch configuration Source Server ID.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * Configure launch configuration Target instance type right sizing method.
     * </p>
     */
    private String targetInstanceTypeRightSizingMethod;

    /**
     * <p>
     * Copy Private IP during Launch Configuration.
     * </p>
     * 
     * @param copyPrivateIp
     *        Copy Private IP during Launch Configuration.
     */

    public void setCopyPrivateIp(Boolean copyPrivateIp) {
        this.copyPrivateIp = copyPrivateIp;
    }

    /**
     * <p>
     * Copy Private IP during Launch Configuration.
     * </p>
     * 
     * @return Copy Private IP during Launch Configuration.
     */

    public Boolean getCopyPrivateIp() {
        return this.copyPrivateIp;
    }

    /**
     * <p>
     * Copy Private IP during Launch Configuration.
     * </p>
     * 
     * @param copyPrivateIp
     *        Copy Private IP during Launch Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationResult withCopyPrivateIp(Boolean copyPrivateIp) {
        setCopyPrivateIp(copyPrivateIp);
        return this;
    }

    /**
     * <p>
     * Copy Private IP during Launch Configuration.
     * </p>
     * 
     * @return Copy Private IP during Launch Configuration.
     */

    public Boolean isCopyPrivateIp() {
        return this.copyPrivateIp;
    }

    /**
     * <p>
     * Copy Tags during Launch Configuration.
     * </p>
     * 
     * @param copyTags
     *        Copy Tags during Launch Configuration.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Copy Tags during Launch Configuration.
     * </p>
     * 
     * @return Copy Tags during Launch Configuration.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Copy Tags during Launch Configuration.
     * </p>
     * 
     * @param copyTags
     *        Copy Tags during Launch Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationResult withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * Copy Tags during Launch Configuration.
     * </p>
     * 
     * @return Copy Tags during Launch Configuration.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Configure EC2 lauch configuration template ID.
     * </p>
     * 
     * @param ec2LaunchTemplateID
     *        Configure EC2 lauch configuration template ID.
     */

    public void setEc2LaunchTemplateID(String ec2LaunchTemplateID) {
        this.ec2LaunchTemplateID = ec2LaunchTemplateID;
    }

    /**
     * <p>
     * Configure EC2 lauch configuration template ID.
     * </p>
     * 
     * @return Configure EC2 lauch configuration template ID.
     */

    public String getEc2LaunchTemplateID() {
        return this.ec2LaunchTemplateID;
    }

    /**
     * <p>
     * Configure EC2 lauch configuration template ID.
     * </p>
     * 
     * @param ec2LaunchTemplateID
     *        Configure EC2 lauch configuration template ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationResult withEc2LaunchTemplateID(String ec2LaunchTemplateID) {
        setEc2LaunchTemplateID(ec2LaunchTemplateID);
        return this;
    }

    /**
     * <p>
     * Configure launch dispostion for launch configuration.
     * </p>
     * 
     * @param launchDisposition
     *        Configure launch dispostion for launch configuration.
     * @see LaunchDisposition
     */

    public void setLaunchDisposition(String launchDisposition) {
        this.launchDisposition = launchDisposition;
    }

    /**
     * <p>
     * Configure launch dispostion for launch configuration.
     * </p>
     * 
     * @return Configure launch dispostion for launch configuration.
     * @see LaunchDisposition
     */

    public String getLaunchDisposition() {
        return this.launchDisposition;
    }

    /**
     * <p>
     * Configure launch dispostion for launch configuration.
     * </p>
     * 
     * @param launchDisposition
     *        Configure launch dispostion for launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchDisposition
     */

    public UpdateLaunchConfigurationResult withLaunchDisposition(String launchDisposition) {
        setLaunchDisposition(launchDisposition);
        return this;
    }

    /**
     * <p>
     * Configure launch dispostion for launch configuration.
     * </p>
     * 
     * @param launchDisposition
     *        Configure launch dispostion for launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchDisposition
     */

    public UpdateLaunchConfigurationResult withLaunchDisposition(LaunchDisposition launchDisposition) {
        this.launchDisposition = launchDisposition.toString();
        return this;
    }

    /**
     * <p>
     * Configure launch configuration OS licensing.
     * </p>
     * 
     * @param licensing
     *        Configure launch configuration OS licensing.
     */

    public void setLicensing(Licensing licensing) {
        this.licensing = licensing;
    }

    /**
     * <p>
     * Configure launch configuration OS licensing.
     * </p>
     * 
     * @return Configure launch configuration OS licensing.
     */

    public Licensing getLicensing() {
        return this.licensing;
    }

    /**
     * <p>
     * Configure launch configuration OS licensing.
     * </p>
     * 
     * @param licensing
     *        Configure launch configuration OS licensing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationResult withLicensing(Licensing licensing) {
        setLicensing(licensing);
        return this;
    }

    /**
     * <p>
     * Configure launch configuration name.
     * </p>
     * 
     * @param name
     *        Configure launch configuration name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Configure launch configuration name.
     * </p>
     * 
     * @return Configure launch configuration name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Configure launch configuration name.
     * </p>
     * 
     * @param name
     *        Configure launch configuration name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Configure launch configuration Source Server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Configure launch configuration Source Server ID.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Configure launch configuration Source Server ID.
     * </p>
     * 
     * @return Configure launch configuration Source Server ID.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Configure launch configuration Source Server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Configure launch configuration Source Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationResult withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * Configure launch configuration Target instance type right sizing method.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Configure launch configuration Target instance type right sizing method.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public void setTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
        this.targetInstanceTypeRightSizingMethod = targetInstanceTypeRightSizingMethod;
    }

    /**
     * <p>
     * Configure launch configuration Target instance type right sizing method.
     * </p>
     * 
     * @return Configure launch configuration Target instance type right sizing method.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public String getTargetInstanceTypeRightSizingMethod() {
        return this.targetInstanceTypeRightSizingMethod;
    }

    /**
     * <p>
     * Configure launch configuration Target instance type right sizing method.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Configure launch configuration Target instance type right sizing method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public UpdateLaunchConfigurationResult withTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
        setTargetInstanceTypeRightSizingMethod(targetInstanceTypeRightSizingMethod);
        return this;
    }

    /**
     * <p>
     * Configure launch configuration Target instance type right sizing method.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Configure launch configuration Target instance type right sizing method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public UpdateLaunchConfigurationResult withTargetInstanceTypeRightSizingMethod(TargetInstanceTypeRightSizingMethod targetInstanceTypeRightSizingMethod) {
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
        if (getEc2LaunchTemplateID() != null)
            sb.append("Ec2LaunchTemplateID: ").append(getEc2LaunchTemplateID()).append(",");
        if (getLaunchDisposition() != null)
            sb.append("LaunchDisposition: ").append(getLaunchDisposition()).append(",");
        if (getLicensing() != null)
            sb.append("Licensing: ").append(getLicensing()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID()).append(",");
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

        if (obj instanceof UpdateLaunchConfigurationResult == false)
            return false;
        UpdateLaunchConfigurationResult other = (UpdateLaunchConfigurationResult) obj;
        if (other.getCopyPrivateIp() == null ^ this.getCopyPrivateIp() == null)
            return false;
        if (other.getCopyPrivateIp() != null && other.getCopyPrivateIp().equals(this.getCopyPrivateIp()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getEc2LaunchTemplateID() == null ^ this.getEc2LaunchTemplateID() == null)
            return false;
        if (other.getEc2LaunchTemplateID() != null && other.getEc2LaunchTemplateID().equals(this.getEc2LaunchTemplateID()) == false)
            return false;
        if (other.getLaunchDisposition() == null ^ this.getLaunchDisposition() == null)
            return false;
        if (other.getLaunchDisposition() != null && other.getLaunchDisposition().equals(this.getLaunchDisposition()) == false)
            return false;
        if (other.getLicensing() == null ^ this.getLicensing() == null)
            return false;
        if (other.getLicensing() != null && other.getLicensing().equals(this.getLicensing()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
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
        hashCode = prime * hashCode + ((getEc2LaunchTemplateID() == null) ? 0 : getEc2LaunchTemplateID().hashCode());
        hashCode = prime * hashCode + ((getLaunchDisposition() == null) ? 0 : getLaunchDisposition().hashCode());
        hashCode = prime * hashCode + ((getLicensing() == null) ? 0 : getLicensing().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        hashCode = prime * hashCode + ((getTargetInstanceTypeRightSizingMethod() == null) ? 0 : getTargetInstanceTypeRightSizingMethod().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLaunchConfigurationResult clone() {
        try {
            return (UpdateLaunchConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
