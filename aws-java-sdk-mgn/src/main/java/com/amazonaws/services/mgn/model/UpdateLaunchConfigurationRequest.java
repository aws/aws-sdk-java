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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateLaunchConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLaunchConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Update Launch configuration copy Private IP request.
     * </p>
     */
    private Boolean copyPrivateIp;
    /**
     * <p>
     * Update Launch configuration copy Tags request.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * Update Launch configuration launch disposition request.
     * </p>
     */
    private String launchDisposition;
    /**
     * <p>
     * Update Launch configuration licensing request.
     * </p>
     */
    private Licensing licensing;
    /**
     * <p>
     * Update Launch configuration name request.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Update Launch configuration by Source Server ID request.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     */
    private String targetInstanceTypeRightSizingMethod;

    /**
     * <p>
     * Update Launch configuration copy Private IP request.
     * </p>
     * 
     * @param copyPrivateIp
     *        Update Launch configuration copy Private IP request.
     */

    public void setCopyPrivateIp(Boolean copyPrivateIp) {
        this.copyPrivateIp = copyPrivateIp;
    }

    /**
     * <p>
     * Update Launch configuration copy Private IP request.
     * </p>
     * 
     * @return Update Launch configuration copy Private IP request.
     */

    public Boolean getCopyPrivateIp() {
        return this.copyPrivateIp;
    }

    /**
     * <p>
     * Update Launch configuration copy Private IP request.
     * </p>
     * 
     * @param copyPrivateIp
     *        Update Launch configuration copy Private IP request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationRequest withCopyPrivateIp(Boolean copyPrivateIp) {
        setCopyPrivateIp(copyPrivateIp);
        return this;
    }

    /**
     * <p>
     * Update Launch configuration copy Private IP request.
     * </p>
     * 
     * @return Update Launch configuration copy Private IP request.
     */

    public Boolean isCopyPrivateIp() {
        return this.copyPrivateIp;
    }

    /**
     * <p>
     * Update Launch configuration copy Tags request.
     * </p>
     * 
     * @param copyTags
     *        Update Launch configuration copy Tags request.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Update Launch configuration copy Tags request.
     * </p>
     * 
     * @return Update Launch configuration copy Tags request.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Update Launch configuration copy Tags request.
     * </p>
     * 
     * @param copyTags
     *        Update Launch configuration copy Tags request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationRequest withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * Update Launch configuration copy Tags request.
     * </p>
     * 
     * @return Update Launch configuration copy Tags request.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Update Launch configuration launch disposition request.
     * </p>
     * 
     * @param launchDisposition
     *        Update Launch configuration launch disposition request.
     * @see LaunchDisposition
     */

    public void setLaunchDisposition(String launchDisposition) {
        this.launchDisposition = launchDisposition;
    }

    /**
     * <p>
     * Update Launch configuration launch disposition request.
     * </p>
     * 
     * @return Update Launch configuration launch disposition request.
     * @see LaunchDisposition
     */

    public String getLaunchDisposition() {
        return this.launchDisposition;
    }

    /**
     * <p>
     * Update Launch configuration launch disposition request.
     * </p>
     * 
     * @param launchDisposition
     *        Update Launch configuration launch disposition request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchDisposition
     */

    public UpdateLaunchConfigurationRequest withLaunchDisposition(String launchDisposition) {
        setLaunchDisposition(launchDisposition);
        return this;
    }

    /**
     * <p>
     * Update Launch configuration launch disposition request.
     * </p>
     * 
     * @param launchDisposition
     *        Update Launch configuration launch disposition request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchDisposition
     */

    public UpdateLaunchConfigurationRequest withLaunchDisposition(LaunchDisposition launchDisposition) {
        this.launchDisposition = launchDisposition.toString();
        return this;
    }

    /**
     * <p>
     * Update Launch configuration licensing request.
     * </p>
     * 
     * @param licensing
     *        Update Launch configuration licensing request.
     */

    public void setLicensing(Licensing licensing) {
        this.licensing = licensing;
    }

    /**
     * <p>
     * Update Launch configuration licensing request.
     * </p>
     * 
     * @return Update Launch configuration licensing request.
     */

    public Licensing getLicensing() {
        return this.licensing;
    }

    /**
     * <p>
     * Update Launch configuration licensing request.
     * </p>
     * 
     * @param licensing
     *        Update Launch configuration licensing request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationRequest withLicensing(Licensing licensing) {
        setLicensing(licensing);
        return this;
    }

    /**
     * <p>
     * Update Launch configuration name request.
     * </p>
     * 
     * @param name
     *        Update Launch configuration name request.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Update Launch configuration name request.
     * </p>
     * 
     * @return Update Launch configuration name request.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Update Launch configuration name request.
     * </p>
     * 
     * @param name
     *        Update Launch configuration name request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Update Launch configuration by Source Server ID request.
     * </p>
     * 
     * @param sourceServerID
     *        Update Launch configuration by Source Server ID request.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Update Launch configuration by Source Server ID request.
     * </p>
     * 
     * @return Update Launch configuration by Source Server ID request.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Update Launch configuration by Source Server ID request.
     * </p>
     * 
     * @param sourceServerID
     *        Update Launch configuration by Source Server ID request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLaunchConfigurationRequest withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Update Launch configuration Target instance right sizing request.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public void setTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
        this.targetInstanceTypeRightSizingMethod = targetInstanceTypeRightSizingMethod;
    }

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     * 
     * @return Update Launch configuration Target instance right sizing request.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public String getTargetInstanceTypeRightSizingMethod() {
        return this.targetInstanceTypeRightSizingMethod;
    }

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Update Launch configuration Target instance right sizing request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetInstanceTypeRightSizingMethod
     */

    public UpdateLaunchConfigurationRequest withTargetInstanceTypeRightSizingMethod(String targetInstanceTypeRightSizingMethod) {
        setTargetInstanceTypeRightSizingMethod(targetInstanceTypeRightSizingMethod);
        return this;
    }

    /**
     * <p>
     * Update Launch configuration Target instance right sizing request.
     * </p>
     * 
     * @param targetInstanceTypeRightSizingMethod
     *        Update Launch configuration Target instance right sizing request.
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
