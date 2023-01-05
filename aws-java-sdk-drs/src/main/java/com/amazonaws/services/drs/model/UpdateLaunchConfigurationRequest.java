/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLaunchConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether we should copy the Private IP of the Source Server to the Recovery Instance.
     * </p>
     */
    private Boolean copyPrivateIp;
    /**
     * <p>
     * Whether we want to copy the tags of the Source Server to the EC2 machine of the Recovery Instance.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * The state of the Recovery Instance in EC2 after the recovery operation.
     * </p>
     */
    private String launchDisposition;
    /**
     * <p>
     * The licensing configuration to be used for this launch configuration.
     * </p>
     */
    private Licensing licensing;
    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the Source Server that we want to retrieve a Launch Configuration for.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * Whether Elastic Disaster Recovery should try to automatically choose the instance type that best matches the OS,
     * CPU, and RAM of your Source Server.
     * </p>
     */
    private String targetInstanceTypeRightSizingMethod;

    /**
     * <p>
     * Whether we should copy the Private IP of the Source Server to the Recovery Instance.
     * </p>
     * 
     * @param copyPrivateIp
     *        Whether we should copy the Private IP of the Source Server to the Recovery Instance.
     */

    public void setCopyPrivateIp(Boolean copyPrivateIp) {
        this.copyPrivateIp = copyPrivateIp;
    }

    /**
     * <p>
     * Whether we should copy the Private IP of the Source Server to the Recovery Instance.
     * </p>
     * 
     * @return Whether we should copy the Private IP of the Source Server to the Recovery Instance.
     */

    public Boolean getCopyPrivateIp() {
        return this.copyPrivateIp;
    }

    /**
     * <p>
     * Whether we should copy the Private IP of the Source Server to the Recovery Instance.
     * </p>
     * 
     * @param copyPrivateIp
     *        Whether we should copy the Private IP of the Source Server to the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationRequest withCopyPrivateIp(Boolean copyPrivateIp) {
        setCopyPrivateIp(copyPrivateIp);
        return this;
    }

    /**
     * <p>
     * Whether we should copy the Private IP of the Source Server to the Recovery Instance.
     * </p>
     * 
     * @return Whether we should copy the Private IP of the Source Server to the Recovery Instance.
     */

    public Boolean isCopyPrivateIp() {
        return this.copyPrivateIp;
    }

    /**
     * <p>
     * Whether we want to copy the tags of the Source Server to the EC2 machine of the Recovery Instance.
     * </p>
     * 
     * @param copyTags
     *        Whether we want to copy the tags of the Source Server to the EC2 machine of the Recovery Instance.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Whether we want to copy the tags of the Source Server to the EC2 machine of the Recovery Instance.
     * </p>
     * 
     * @return Whether we want to copy the tags of the Source Server to the EC2 machine of the Recovery Instance.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Whether we want to copy the tags of the Source Server to the EC2 machine of the Recovery Instance.
     * </p>
     * 
     * @param copyTags
     *        Whether we want to copy the tags of the Source Server to the EC2 machine of the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationRequest withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * Whether we want to copy the tags of the Source Server to the EC2 machine of the Recovery Instance.
     * </p>
     * 
     * @return Whether we want to copy the tags of the Source Server to the EC2 machine of the Recovery Instance.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * The state of the Recovery Instance in EC2 after the recovery operation.
     * </p>
     * 
     * @param launchDisposition
     *        The state of the Recovery Instance in EC2 after the recovery operation.
     * @see LaunchDisposition
     */

    public void setLaunchDisposition(String launchDisposition) {
        this.launchDisposition = launchDisposition;
    }

    /**
     * <p>
     * The state of the Recovery Instance in EC2 after the recovery operation.
     * </p>
     * 
     * @return The state of the Recovery Instance in EC2 after the recovery operation.
     * @see LaunchDisposition
     */

    public String getLaunchDisposition() {
        return this.launchDisposition;
    }

    /**
     * <p>
     * The state of the Recovery Instance in EC2 after the recovery operation.
     * </p>
     * 
     * @param launchDisposition
     *        The state of the Recovery Instance in EC2 after the recovery operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchDisposition
     */

    public UpdateLaunchConfigurationRequest withLaunchDisposition(String launchDisposition) {
        setLaunchDisposition(launchDisposition);
        return this;
    }

    /**
     * <p>
     * The state of the Recovery Instance in EC2 after the recovery operation.
     * </p>
     * 
     * @param launchDisposition
     *        The state of the Recovery Instance in EC2 after the recovery operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchDisposition
     */

    public UpdateLaunchConfigurationRequest withLaunchDisposition(LaunchDisposition launchDisposition) {
        this.launchDisposition = launchDisposition.toString();
        return this;
    }

    /**
     * <p>
     * The licensing configuration to be used for this launch configuration.
     * </p>
     * 
     * @param licensing
     *        The licensing configuration to be used for this launch configuration.
     */

    public void setLicensing(Licensing licensing) {
        this.licensing = licensing;
    }

    /**
     * <p>
     * The licensing configuration to be used for this launch configuration.
     * </p>
     * 
     * @return The licensing configuration to be used for this launch configuration.
     */

    public Licensing getLicensing() {
        return this.licensing;
    }

    /**
     * <p>
     * The licensing configuration to be used for this launch configuration.
     * </p>
     * 
     * @param licensing
     *        The licensing configuration to be used for this launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationRequest withLicensing(Licensing licensing) {
        setLicensing(licensing);
        return this;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @param name
     *        The name of the launch configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @return The name of the launch configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @param name
     *        The name of the launch configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the Source Server that we want to retrieve a Launch Configuration for.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of the Source Server that we want to retrieve a Launch Configuration for.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * The ID of the Source Server that we want to retrieve a Launch Configuration for.
     * </p>
     * 
     * @return The ID of the Source Server that we want to retrieve a Launch Configuration for.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * The ID of the Source Server that we want to retrieve a Launch Configuration for.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of the Source Server that we want to retrieve a Launch Configuration for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationRequest withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * Whether Elastic Disaster Recovery should try to automatically choose the instance type that best matches the OS,
     * CPU, and RAM of your Source Server.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Whether Elastic Disaster Recovery should try to automatically choose the instance type that best matches
     *        the OS, CPU, and RAM of your Source Server.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public void setTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
        this.targetInstanceTypeRightSizingMethod = targetInstanceTypeRightSizingMethod;
    }

    /**
     * <p>
     * Whether Elastic Disaster Recovery should try to automatically choose the instance type that best matches the OS,
     * CPU, and RAM of your Source Server.
     * </p>
     * 
     * @return Whether Elastic Disaster Recovery should try to automatically choose the instance type that best matches
     *         the OS, CPU, and RAM of your Source Server.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public String getTargetInstanceTypeRightSizingMethod() {
        return this.targetInstanceTypeRightSizingMethod;
    }

    /**
     * <p>
     * Whether Elastic Disaster Recovery should try to automatically choose the instance type that best matches the OS,
     * CPU, and RAM of your Source Server.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Whether Elastic Disaster Recovery should try to automatically choose the instance type that best matches
     *        the OS, CPU, and RAM of your Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public UpdateLaunchConfigurationRequest withTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
        setTargetInstanceTypeRightSizingMethod(targetInstanceTypeRightSizingMethod);
        return this;
    }

    /**
     * <p>
     * Whether Elastic Disaster Recovery should try to automatically choose the instance type that best matches the OS,
     * CPU, and RAM of your Source Server.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Whether Elastic Disaster Recovery should try to automatically choose the instance type that best matches
     *        the OS, CPU, and RAM of your Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public UpdateLaunchConfigurationRequest withTargetInstanceTypeRightSizingMethod(TargetInstanceTypeRightSizingMethod targetInstanceTypeRightSizingMethod) {
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

        if (obj instanceof UpdateLaunchConfigurationRequest == false)
            return false;
        UpdateLaunchConfigurationRequest other = (UpdateLaunchConfigurationRequest) obj;
        if (other.getCopyPrivateIp() == null ^ this.getCopyPrivateIp() == null)
            return false;
        if (other.getCopyPrivateIp() != null && other.getCopyPrivateIp().equals(this.getCopyPrivateIp()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
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
        hashCode = prime * hashCode + ((getLaunchDisposition() == null) ? 0 : getLaunchDisposition().hashCode());
        hashCode = prime * hashCode + ((getLicensing() == null) ? 0 : getLicensing().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        hashCode = prime * hashCode + ((getTargetInstanceTypeRightSizingMethod() == null) ? 0 : getTargetInstanceTypeRightSizingMethod().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLaunchConfigurationRequest clone() {
        return (UpdateLaunchConfigurationRequest) super.clone();
    }

}
