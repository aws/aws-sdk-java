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
 * Summary information about a platform branch.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/PlatformBranchSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlatformBranchSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the platform to which this platform branch belongs.
     * </p>
     */
    private String platformName;
    /**
     * <p>
     * The name of the platform branch.
     * </p>
     */
    private String branchName;
    /**
     * <p>
     * The support life cycle state of the platform branch.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     */
    private String lifecycleState;
    /**
     * <p>
     * An ordinal number that designates the order in which platform branches have been added to a platform. This can be
     * helpful, for example, if your code calls the <code>ListPlatformBranches</code> action and then displays a list of
     * platform branches.
     * </p>
     * <p>
     * A larger <code>BranchOrder</code> value designates a newer platform branch within the platform.
     * </p>
     */
    private Integer branchOrder;
    /**
     * <p>
     * The environment tiers that platform versions in this branch support.
     * </p>
     * <p>
     * Possible values: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> supportedTierList;

    /**
     * <p>
     * The name of the platform to which this platform branch belongs.
     * </p>
     * 
     * @param platformName
     *        The name of the platform to which this platform branch belongs.
     */

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>
     * The name of the platform to which this platform branch belongs.
     * </p>
     * 
     * @return The name of the platform to which this platform branch belongs.
     */

    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * <p>
     * The name of the platform to which this platform branch belongs.
     * </p>
     * 
     * @param platformName
     *        The name of the platform to which this platform branch belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformBranchSummary withPlatformName(String platformName) {
        setPlatformName(platformName);
        return this;
    }

    /**
     * <p>
     * The name of the platform branch.
     * </p>
     * 
     * @param branchName
     *        The name of the platform branch.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the platform branch.
     * </p>
     * 
     * @return The name of the platform branch.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name of the platform branch.
     * </p>
     * 
     * @param branchName
     *        The name of the platform branch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformBranchSummary withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * <p>
     * The support life cycle state of the platform branch.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * 
     * @param lifecycleState
     *        The support life cycle state of the platform branch.</p>
     *        <p>
     *        Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> |
     *        <code>retired</code>
     */

    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    /**
     * <p>
     * The support life cycle state of the platform branch.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * 
     * @return The support life cycle state of the platform branch.</p>
     *         <p>
     *         Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> |
     *         <code>retired</code>
     */

    public String getLifecycleState() {
        return this.lifecycleState;
    }

    /**
     * <p>
     * The support life cycle state of the platform branch.
     * </p>
     * <p>
     * Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> | <code>retired</code>
     * </p>
     * 
     * @param lifecycleState
     *        The support life cycle state of the platform branch.</p>
     *        <p>
     *        Possible values: <code>beta</code> | <code>supported</code> | <code>deprecated</code> |
     *        <code>retired</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformBranchSummary withLifecycleState(String lifecycleState) {
        setLifecycleState(lifecycleState);
        return this;
    }

    /**
     * <p>
     * An ordinal number that designates the order in which platform branches have been added to a platform. This can be
     * helpful, for example, if your code calls the <code>ListPlatformBranches</code> action and then displays a list of
     * platform branches.
     * </p>
     * <p>
     * A larger <code>BranchOrder</code> value designates a newer platform branch within the platform.
     * </p>
     * 
     * @param branchOrder
     *        An ordinal number that designates the order in which platform branches have been added to a platform. This
     *        can be helpful, for example, if your code calls the <code>ListPlatformBranches</code> action and then
     *        displays a list of platform branches.</p>
     *        <p>
     *        A larger <code>BranchOrder</code> value designates a newer platform branch within the platform.
     */

    public void setBranchOrder(Integer branchOrder) {
        this.branchOrder = branchOrder;
    }

    /**
     * <p>
     * An ordinal number that designates the order in which platform branches have been added to a platform. This can be
     * helpful, for example, if your code calls the <code>ListPlatformBranches</code> action and then displays a list of
     * platform branches.
     * </p>
     * <p>
     * A larger <code>BranchOrder</code> value designates a newer platform branch within the platform.
     * </p>
     * 
     * @return An ordinal number that designates the order in which platform branches have been added to a platform.
     *         This can be helpful, for example, if your code calls the <code>ListPlatformBranches</code> action and
     *         then displays a list of platform branches.</p>
     *         <p>
     *         A larger <code>BranchOrder</code> value designates a newer platform branch within the platform.
     */

    public Integer getBranchOrder() {
        return this.branchOrder;
    }

    /**
     * <p>
     * An ordinal number that designates the order in which platform branches have been added to a platform. This can be
     * helpful, for example, if your code calls the <code>ListPlatformBranches</code> action and then displays a list of
     * platform branches.
     * </p>
     * <p>
     * A larger <code>BranchOrder</code> value designates a newer platform branch within the platform.
     * </p>
     * 
     * @param branchOrder
     *        An ordinal number that designates the order in which platform branches have been added to a platform. This
     *        can be helpful, for example, if your code calls the <code>ListPlatformBranches</code> action and then
     *        displays a list of platform branches.</p>
     *        <p>
     *        A larger <code>BranchOrder</code> value designates a newer platform branch within the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformBranchSummary withBranchOrder(Integer branchOrder) {
        setBranchOrder(branchOrder);
        return this;
    }

    /**
     * <p>
     * The environment tiers that platform versions in this branch support.
     * </p>
     * <p>
     * Possible values: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * </p>
     * 
     * @return The environment tiers that platform versions in this branch support.</p>
     *         <p>
     *         Possible values: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     */

    public java.util.List<String> getSupportedTierList() {
        if (supportedTierList == null) {
            supportedTierList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return supportedTierList;
    }

    /**
     * <p>
     * The environment tiers that platform versions in this branch support.
     * </p>
     * <p>
     * Possible values: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * </p>
     * 
     * @param supportedTierList
     *        The environment tiers that platform versions in this branch support.</p>
     *        <p>
     *        Possible values: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
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
     * The environment tiers that platform versions in this branch support.
     * </p>
     * <p>
     * Possible values: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedTierList(java.util.Collection)} or {@link #withSupportedTierList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedTierList
     *        The environment tiers that platform versions in this branch support.</p>
     *        <p>
     *        Possible values: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformBranchSummary withSupportedTierList(String... supportedTierList) {
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
     * The environment tiers that platform versions in this branch support.
     * </p>
     * <p>
     * Possible values: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * </p>
     * 
     * @param supportedTierList
     *        The environment tiers that platform versions in this branch support.</p>
     *        <p>
     *        Possible values: <code>WebServer/Standard</code> | <code>Worker/SQS/HTTP</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlatformBranchSummary withSupportedTierList(java.util.Collection<String> supportedTierList) {
        setSupportedTierList(supportedTierList);
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
        if (getPlatformName() != null)
            sb.append("PlatformName: ").append(getPlatformName()).append(",");
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName()).append(",");
        if (getLifecycleState() != null)
            sb.append("LifecycleState: ").append(getLifecycleState()).append(",");
        if (getBranchOrder() != null)
            sb.append("BranchOrder: ").append(getBranchOrder()).append(",");
        if (getSupportedTierList() != null)
            sb.append("SupportedTierList: ").append(getSupportedTierList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlatformBranchSummary == false)
            return false;
        PlatformBranchSummary other = (PlatformBranchSummary) obj;
        if (other.getPlatformName() == null ^ this.getPlatformName() == null)
            return false;
        if (other.getPlatformName() != null && other.getPlatformName().equals(this.getPlatformName()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        if (other.getLifecycleState() == null ^ this.getLifecycleState() == null)
            return false;
        if (other.getLifecycleState() != null && other.getLifecycleState().equals(this.getLifecycleState()) == false)
            return false;
        if (other.getBranchOrder() == null ^ this.getBranchOrder() == null)
            return false;
        if (other.getBranchOrder() != null && other.getBranchOrder().equals(this.getBranchOrder()) == false)
            return false;
        if (other.getSupportedTierList() == null ^ this.getSupportedTierList() == null)
            return false;
        if (other.getSupportedTierList() != null && other.getSupportedTierList().equals(this.getSupportedTierList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        hashCode = prime * hashCode + ((getLifecycleState() == null) ? 0 : getLifecycleState().hashCode());
        hashCode = prime * hashCode + ((getBranchOrder() == null) ? 0 : getBranchOrder().hashCode());
        hashCode = prime * hashCode + ((getSupportedTierList() == null) ? 0 : getSupportedTierList().hashCode());
        return hashCode;
    }

    @Override
    public PlatformBranchSummary clone() {
        try {
            return (PlatformBranchSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
