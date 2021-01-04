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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Summary information about a platform version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/PlatformSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlatformSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     */
    private String platformArn;
    /**
     * <p>
     * The AWS account ID of the person who created the platform version.
     * </p>
     */
    private String platformOwner;
    /**
     * <p>
     * The status of the platform version. You can create an environment from the platform version once it is ready.
     * </p>
     */
    private String platformStatus;
    /**
     * <p>
     * The category of platform version.
     * </p>
     */
    private String platformCategory;
    /**
     * <p>
     * The operating system used by the platform version.
     * </p>
     */
    private String operatingSystemName;
    /**
     * <p>
     * The version of the operating system used by the platform version.
     * </p>
     */
    private String operatingSystemVersion;
    /**
     * <p>
     * The tiers in which the platform version runs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedTierList;
    /**
     * <p>
     * The additions associated with the platform version.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedAddonList;
    /**
     * <p>
     * The state of the platform version in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>recommended</code> | empty
     * </p>
     * <p>
     * If an empty value is returned, the platform version is supported but isn't the recommended one for its branch.
     * </p>
     */
    private String platformLifecycleState;
    /**
     * <p>
     * The version string of the platform version.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The platform branch to which the platform version belongs.
     * </p>
     */
    private String platformBranchName;
    /**
     * <p>
     * The state of the platform version's branch in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     */
    private String platformBranchLifecycleState;

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform version.
     */

    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     * 
     * @return The ARN of the platform version.
     */

    public String getPlatformArn() {
        return this.platformArn;
    }

    /**
     * <p>
     * The ARN of the platform version.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the person who created the platform version.
     * </p>
     * 
     * @param platformOwner
     *        The AWS account ID of the person who created the platform version.
     */

    public void setPlatformOwner(String platformOwner) {
        this.platformOwner = platformOwner;
    }

    /**
     * <p>
     * The AWS account ID of the person who created the platform version.
     * </p>
     * 
     * @return The AWS account ID of the person who created the platform version.
     */

    public String getPlatformOwner() {
        return this.platformOwner;
    }

    /**
     * <p>
     * The AWS account ID of the person who created the platform version.
     * </p>
     * 
     * @param platformOwner
     *        The AWS account ID of the person who created the platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withPlatformOwner(String platformOwner) {
        setPlatformOwner(platformOwner);
        return this;
    }

    /**
     * <p>
     * The status of the platform version. You can create an environment from the platform version once it is ready.
     * </p>
     * 
     * @param platformStatus
     *        The status of the platform version. You can create an environment from the platform version once it is
     *        ready.
     * @see PlatformStatus
     */

    public void setPlatformStatus(String platformStatus) {
        this.platformStatus = platformStatus;
    }

    /**
     * <p>
     * The status of the platform version. You can create an environment from the platform version once it is ready.
     * </p>
     * 
     * @return The status of the platform version. You can create an environment from the platform version once it is
     *         ready.
     * @see PlatformStatus
     */

    public String getPlatformStatus() {
        return this.platformStatus;
    }

    /**
     * <p>
     * The status of the platform version. You can create an environment from the platform version once it is ready.
     * </p>
     * 
     * @param platformStatus
     *        The status of the platform version. You can create an environment from the platform version once it is
     *        ready.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformStatus
     */

    public PlatformSummary withPlatformStatus(String platformStatus) {
        setPlatformStatus(platformStatus);
        return this;
    }

    /**
     * <p>
     * The status of the platform version. You can create an environment from the platform version once it is ready.
     * </p>
     * 
     * @param platformStatus
     *        The status of the platform version. You can create an environment from the platform version once it is
     *        ready.
     * @see PlatformStatus
     */

    public void setPlatformStatus(PlatformStatus platformStatus) {
        withPlatformStatus(platformStatus);
    }

    /**
     * <p>
     * The status of the platform version. You can create an environment from the platform version once it is ready.
     * </p>
     * 
     * @param platformStatus
     *        The status of the platform version. You can create an environment from the platform version once it is
     *        ready.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformStatus
     */

    public PlatformSummary withPlatformStatus(PlatformStatus platformStatus) {
        this.platformStatus = platformStatus.toString();
        return this;
    }

    /**
     * <p>
     * The category of platform version.
     * </p>
     * 
     * @param platformCategory
     *        The category of platform version.
     */

    public void setPlatformCategory(String platformCategory) {
        this.platformCategory = platformCategory;
    }

    /**
     * <p>
     * The category of platform version.
     * </p>
     * 
     * @return The category of platform version.
     */

    public String getPlatformCategory() {
        return this.platformCategory;
    }

    /**
     * <p>
     * The category of platform version.
     * </p>
     * 
     * @param platformCategory
     *        The category of platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withPlatformCategory(String platformCategory) {
        setPlatformCategory(platformCategory);
        return this;
    }

    /**
     * <p>
     * The operating system used by the platform version.
     * </p>
     * 
     * @param operatingSystemName
     *        The operating system used by the platform version.
     */

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    /**
     * <p>
     * The operating system used by the platform version.
     * </p>
     * 
     * @return The operating system used by the platform version.
     */

    public String getOperatingSystemName() {
        return this.operatingSystemName;
    }

    /**
     * <p>
     * The operating system used by the platform version.
     * </p>
     * 
     * @param operatingSystemName
     *        The operating system used by the platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withOperatingSystemName(String operatingSystemName) {
        setOperatingSystemName(operatingSystemName);
        return this;
    }

    /**
     * <p>
     * The version of the operating system used by the platform version.
     * </p>
     * 
     * @param operatingSystemVersion
     *        The version of the operating system used by the platform version.
     */

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * <p>
     * The version of the operating system used by the platform version.
     * </p>
     * 
     * @return The version of the operating system used by the platform version.
     */

    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    /**
     * <p>
     * The version of the operating system used by the platform version.
     * </p>
     * 
     * @param operatingSystemVersion
     *        The version of the operating system used by the platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withOperatingSystemVersion(String operatingSystemVersion) {
        setOperatingSystemVersion(operatingSystemVersion);
        return this;
    }

    /**
     * <p>
     * The tiers in which the platform version runs.
     * </p>
     * 
     * @return The tiers in which the platform version runs.
     */

    public java.util.List<String> getSupportedTierList() {
        if (supportedTierList == null) {
            supportedTierList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedTierList;
    }

    /**
     * <p>
     * The tiers in which the platform version runs.
     * </p>
     * 
     * @param supportedTierList
     *        The tiers in which the platform version runs.
     */

    public void setSupportedTierList(java.util.Collection<String> supportedTierList) {
        if (supportedTierList == null) {
            this.supportedTierList = null;
            return;
        }

        this.supportedTierList = new com.amazonaws.internal.SdkInternalList<String>(supportedTierList);
    }

    /**
     * <p>
     * The tiers in which the platform version runs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedTierList(java.util.Collection)} or {@link #withSupportedTierList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedTierList
     *        The tiers in which the platform version runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withSupportedTierList(String... supportedTierList) {
        if (this.supportedTierList == null) {
            setSupportedTierList(new com.amazonaws.internal.SdkInternalList<String>(supportedTierList.length));
        }
        for (String ele : supportedTierList) {
            this.supportedTierList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tiers in which the platform version runs.
     * </p>
     * 
     * @param supportedTierList
     *        The tiers in which the platform version runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withSupportedTierList(java.util.Collection<String> supportedTierList) {
        setSupportedTierList(supportedTierList);
        return this;
    }

    /**
     * <p>
     * The additions associated with the platform version.
     * </p>
     * 
     * @return The additions associated with the platform version.
     */

    public java.util.List<String> getSupportedAddonList() {
        if (supportedAddonList == null) {
            supportedAddonList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedAddonList;
    }

    /**
     * <p>
     * The additions associated with the platform version.
     * </p>
     * 
     * @param supportedAddonList
     *        The additions associated with the platform version.
     */

    public void setSupportedAddonList(java.util.Collection<String> supportedAddonList) {
        if (supportedAddonList == null) {
            this.supportedAddonList = null;
            return;
        }

        this.supportedAddonList = new com.amazonaws.internal.SdkInternalList<String>(supportedAddonList);
    }

    /**
     * <p>
     * The additions associated with the platform version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedAddonList(java.util.Collection)} or {@link #withSupportedAddonList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedAddonList
     *        The additions associated with the platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withSupportedAddonList(String... supportedAddonList) {
        if (this.supportedAddonList == null) {
            setSupportedAddonList(new com.amazonaws.internal.SdkInternalList<String>(supportedAddonList.length));
        }
        for (String ele : supportedAddonList) {
            this.supportedAddonList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The additions associated with the platform version.
     * </p>
     * 
     * @param supportedAddonList
     *        The additions associated with the platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withSupportedAddonList(java.util.Collection<String> supportedAddonList) {
        setSupportedAddonList(supportedAddonList);
        return this;
    }

    /**
     * <p>
     * The state of the platform version in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>recommended</code> | empty
     * </p>
     * <p>
     * If an empty value is returned, the platform version is supported but isn't the recommended one for its branch.
     * </p>
     * 
     * @param platformLifecycleState
     *        The state of the platform version in its lifecycle.</p>
     *        <p>
     *        Possible values: <code>recommended</code> | empty
     *        </p>
     *        <p>
     *        If an empty value is returned, the platform version is supported but isn't the recommended one for its
     *        branch.
     */

    public void setPlatformLifecycleState(String platformLifecycleState) {
        this.platformLifecycleState = platformLifecycleState;
    }

    /**
     * <p>
     * The state of the platform version in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>recommended</code> | empty
     * </p>
     * <p>
     * If an empty value is returned, the platform version is supported but isn't the recommended one for its branch.
     * </p>
     * 
     * @return The state of the platform version in its lifecycle.</p>
     *         <p>
     *         Possible values: <code>recommended</code> | empty
     *         </p>
     *         <p>
     *         If an empty value is returned, the platform version is supported but isn't the recommended one for its
     *         branch.
     */

    public String getPlatformLifecycleState() {
        return this.platformLifecycleState;
    }

    /**
     * <p>
     * The state of the platform version in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>recommended</code> | empty
     * </p>
     * <p>
     * If an empty value is returned, the platform version is supported but isn't the recommended one for its branch.
     * </p>
     * 
     * @param platformLifecycleState
     *        The state of the platform version in its lifecycle.</p>
     *        <p>
     *        Possible values: <code>recommended</code> | empty
     *        </p>
     *        <p>
     *        If an empty value is returned, the platform version is supported but isn't the recommended one for its
     *        branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withPlatformLifecycleState(String platformLifecycleState) {
        setPlatformLifecycleState(platformLifecycleState);
        return this;
    }

    /**
     * <p>
     * The version string of the platform version.
     * </p>
     * 
     * @param platformVersion
     *        The version string of the platform version.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The version string of the platform version.
     * </p>
     * 
     * @return The version string of the platform version.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The version string of the platform version.
     * </p>
     * 
     * @param platformVersion
     *        The version string of the platform version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The platform branch to which the platform version belongs.
     * </p>
     * 
     * @param platformBranchName
     *        The platform branch to which the platform version belongs.
     */

    public void setPlatformBranchName(String platformBranchName) {
        this.platformBranchName = platformBranchName;
    }

    /**
     * <p>
     * The platform branch to which the platform version belongs.
     * </p>
     * 
     * @return The platform branch to which the platform version belongs.
     */

    public String getPlatformBranchName() {
        return this.platformBranchName;
    }

    /**
     * <p>
     * The platform branch to which the platform version belongs.
     * </p>
     * 
     * @param platformBranchName
     *        The platform branch to which the platform version belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withPlatformBranchName(String platformBranchName) {
        setPlatformBranchName(platformBranchName);
        return this;
    }

    /**
     * <p>
     * The state of the platform version's branch in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * 
     * @param platformBranchLifecycleState
     *        The state of the platform version's branch in its lifecycle.</p>
     *        <p>
     *        Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> |
     *        <code>retired</code>
     */

    public void setPlatformBranchLifecycleState(String platformBranchLifecycleState) {
        this.platformBranchLifecycleState = platformBranchLifecycleState;
    }

    /**
     * <p>
     * The state of the platform version's branch in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * 
     * @return The state of the platform version's branch in its lifecycle.</p>
     *         <p>
     *         Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> |
     *         <code>retired</code>
     */

    public String getPlatformBranchLifecycleState() {
        return this.platformBranchLifecycleState;
    }

    /**
     * <p>
     * The state of the platform version's branch in its lifecycle.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * 
     * @param platformBranchLifecycleState
     *        The state of the platform version's branch in its lifecycle.</p>
     *        <p>
     *        Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> |
     *        <code>retired</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformSummary withPlatformBranchLifecycleState(String platformBranchLifecycleState) {
        setPlatformBranchLifecycleState(platformBranchLifecycleState);
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
        if (getPlatformArn() != null)
            sb.append("PlatformArn: ").append(getPlatformArn()).append(",");
        if (getPlatformOwner() != null)
            sb.append("PlatformOwner: ").append(getPlatformOwner()).append(",");
        if (getPlatformStatus() != null)
            sb.append("PlatformStatus: ").append(getPlatformStatus()).append(",");
        if (getPlatformCategory() != null)
            sb.append("PlatformCategory: ").append(getPlatformCategory()).append(",");
        if (getOperatingSystemName() != null)
            sb.append("OperatingSystemName: ").append(getOperatingSystemName()).append(",");
        if (getOperatingSystemVersion() != null)
            sb.append("OperatingSystemVersion: ").append(getOperatingSystemVersion()).append(",");
        if (getSupportedTierList() != null)
            sb.append("SupportedTierList: ").append(getSupportedTierList()).append(",");
        if (getSupportedAddonList() != null)
            sb.append("SupportedAddonList: ").append(getSupportedAddonList()).append(",");
        if (getPlatformLifecycleState() != null)
            sb.append("PlatformLifecycleState: ").append(getPlatformLifecycleState()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getPlatformBranchName() != null)
            sb.append("PlatformBranchName: ").append(getPlatformBranchName()).append(",");
        if (getPlatformBranchLifecycleState() != null)
            sb.append("PlatformBranchLifecycleState: ").append(getPlatformBranchLifecycleState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlatformSummary == false)
            return false;
        PlatformSummary other = (PlatformSummary) obj;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getPlatformOwner() == null ^ this.getPlatformOwner() == null)
            return false;
        if (other.getPlatformOwner() != null && other.getPlatformOwner().equals(this.getPlatformOwner()) == false)
            return false;
        if (other.getPlatformStatus() == null ^ this.getPlatformStatus() == null)
            return false;
        if (other.getPlatformStatus() != null && other.getPlatformStatus().equals(this.getPlatformStatus()) == false)
            return false;
        if (other.getPlatformCategory() == null ^ this.getPlatformCategory() == null)
            return false;
        if (other.getPlatformCategory() != null && other.getPlatformCategory().equals(this.getPlatformCategory()) == false)
            return false;
        if (other.getOperatingSystemName() == null ^ this.getOperatingSystemName() == null)
            return false;
        if (other.getOperatingSystemName() != null && other.getOperatingSystemName().equals(this.getOperatingSystemName()) == false)
            return false;
        if (other.getOperatingSystemVersion() == null ^ this.getOperatingSystemVersion() == null)
            return false;
        if (other.getOperatingSystemVersion() != null && other.getOperatingSystemVersion().equals(this.getOperatingSystemVersion()) == false)
            return false;
        if (other.getSupportedTierList() == null ^ this.getSupportedTierList() == null)
            return false;
        if (other.getSupportedTierList() != null && other.getSupportedTierList().equals(this.getSupportedTierList()) == false)
            return false;
        if (other.getSupportedAddonList() == null ^ this.getSupportedAddonList() == null)
            return false;
        if (other.getSupportedAddonList() != null && other.getSupportedAddonList().equals(this.getSupportedAddonList()) == false)
            return false;
        if (other.getPlatformLifecycleState() == null ^ this.getPlatformLifecycleState() == null)
            return false;
        if (other.getPlatformLifecycleState() != null && other.getPlatformLifecycleState().equals(this.getPlatformLifecycleState()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getPlatformBranchName() == null ^ this.getPlatformBranchName() == null)
            return false;
        if (other.getPlatformBranchName() != null && other.getPlatformBranchName().equals(this.getPlatformBranchName()) == false)
            return false;
        if (other.getPlatformBranchLifecycleState() == null ^ this.getPlatformBranchLifecycleState() == null)
            return false;
        if (other.getPlatformBranchLifecycleState() != null && other.getPlatformBranchLifecycleState().equals(this.getPlatformBranchLifecycleState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getPlatformOwner() == null) ? 0 : getPlatformOwner().hashCode());
        hashCode = prime * hashCode + ((getPlatformStatus() == null) ? 0 : getPlatformStatus().hashCode());
        hashCode = prime * hashCode + ((getPlatformCategory() == null) ? 0 : getPlatformCategory().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystemName() == null) ? 0 : getOperatingSystemName().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystemVersion() == null) ? 0 : getOperatingSystemVersion().hashCode());
        hashCode = prime * hashCode + ((getSupportedTierList() == null) ? 0 : getSupportedTierList().hashCode());
        hashCode = prime * hashCode + ((getSupportedAddonList() == null) ? 0 : getSupportedAddonList().hashCode());
        hashCode = prime * hashCode + ((getPlatformLifecycleState() == null) ? 0 : getPlatformLifecycleState().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getPlatformBranchName() == null) ? 0 : getPlatformBranchName().hashCode());
        hashCode = prime * hashCode + ((getPlatformBranchLifecycleState() == null) ? 0 : getPlatformBranchLifecycleState().hashCode());
        return hashCode;
    }

    @Override
    public PlatformSummary clone() {
        try {
            return (PlatformSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
