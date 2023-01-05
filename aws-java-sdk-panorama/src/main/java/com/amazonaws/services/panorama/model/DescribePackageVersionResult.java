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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackageVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Whether the version is the latest available.
     * </p>
     */
    private Boolean isLatestPatch;
    /**
     * <p>
     * The account ID of the version's owner.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The ARN of the package.
     * </p>
     */
    private String packageArn;
    /**
     * <p>
     * The version's ID.
     * </p>
     */
    private String packageId;
    /**
     * <p>
     * The version's name.
     * </p>
     */
    private String packageName;
    /**
     * <p>
     * The version's version.
     * </p>
     */
    private String packageVersion;
    /**
     * <p>
     * The version's patch version.
     * </p>
     */
    private String patchVersion;
    /**
     * <p>
     * The version's registered time.
     * </p>
     */
    private java.util.Date registeredTime;
    /**
     * <p>
     * The version's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The version's status description.
     * </p>
     */
    private String statusDescription;

    /**
     * <p>
     * Whether the version is the latest available.
     * </p>
     * 
     * @param isLatestPatch
     *        Whether the version is the latest available.
     */

    public void setIsLatestPatch(Boolean isLatestPatch) {
        this.isLatestPatch = isLatestPatch;
    }

    /**
     * <p>
     * Whether the version is the latest available.
     * </p>
     * 
     * @return Whether the version is the latest available.
     */

    public Boolean getIsLatestPatch() {
        return this.isLatestPatch;
    }

    /**
     * <p>
     * Whether the version is the latest available.
     * </p>
     * 
     * @param isLatestPatch
     *        Whether the version is the latest available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionResult withIsLatestPatch(Boolean isLatestPatch) {
        setIsLatestPatch(isLatestPatch);
        return this;
    }

    /**
     * <p>
     * Whether the version is the latest available.
     * </p>
     * 
     * @return Whether the version is the latest available.
     */

    public Boolean isLatestPatch() {
        return this.isLatestPatch;
    }

    /**
     * <p>
     * The account ID of the version's owner.
     * </p>
     * 
     * @param ownerAccount
     *        The account ID of the version's owner.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The account ID of the version's owner.
     * </p>
     * 
     * @return The account ID of the version's owner.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The account ID of the version's owner.
     * </p>
     * 
     * @param ownerAccount
     *        The account ID of the version's owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionResult withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The ARN of the package.
     * </p>
     * 
     * @param packageArn
     *        The ARN of the package.
     */

    public void setPackageArn(String packageArn) {
        this.packageArn = packageArn;
    }

    /**
     * <p>
     * The ARN of the package.
     * </p>
     * 
     * @return The ARN of the package.
     */

    public String getPackageArn() {
        return this.packageArn;
    }

    /**
     * <p>
     * The ARN of the package.
     * </p>
     * 
     * @param packageArn
     *        The ARN of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionResult withPackageArn(String packageArn) {
        setPackageArn(packageArn);
        return this;
    }

    /**
     * <p>
     * The version's ID.
     * </p>
     * 
     * @param packageId
     *        The version's ID.
     */

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * <p>
     * The version's ID.
     * </p>
     * 
     * @return The version's ID.
     */

    public String getPackageId() {
        return this.packageId;
    }

    /**
     * <p>
     * The version's ID.
     * </p>
     * 
     * @param packageId
     *        The version's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionResult withPackageId(String packageId) {
        setPackageId(packageId);
        return this;
    }

    /**
     * <p>
     * The version's name.
     * </p>
     * 
     * @param packageName
     *        The version's name.
     */

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The version's name.
     * </p>
     * 
     * @return The version's name.
     */

    public String getPackageName() {
        return this.packageName;
    }

    /**
     * <p>
     * The version's name.
     * </p>
     * 
     * @param packageName
     *        The version's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionResult withPackageName(String packageName) {
        setPackageName(packageName);
        return this;
    }

    /**
     * <p>
     * The version's version.
     * </p>
     * 
     * @param packageVersion
     *        The version's version.
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * The version's version.
     * </p>
     * 
     * @return The version's version.
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * The version's version.
     * </p>
     * 
     * @param packageVersion
     *        The version's version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionResult withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * The version's patch version.
     * </p>
     * 
     * @param patchVersion
     *        The version's patch version.
     */

    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
    }

    /**
     * <p>
     * The version's patch version.
     * </p>
     * 
     * @return The version's patch version.
     */

    public String getPatchVersion() {
        return this.patchVersion;
    }

    /**
     * <p>
     * The version's patch version.
     * </p>
     * 
     * @param patchVersion
     *        The version's patch version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionResult withPatchVersion(String patchVersion) {
        setPatchVersion(patchVersion);
        return this;
    }

    /**
     * <p>
     * The version's registered time.
     * </p>
     * 
     * @param registeredTime
     *        The version's registered time.
     */

    public void setRegisteredTime(java.util.Date registeredTime) {
        this.registeredTime = registeredTime;
    }

    /**
     * <p>
     * The version's registered time.
     * </p>
     * 
     * @return The version's registered time.
     */

    public java.util.Date getRegisteredTime() {
        return this.registeredTime;
    }

    /**
     * <p>
     * The version's registered time.
     * </p>
     * 
     * @param registeredTime
     *        The version's registered time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionResult withRegisteredTime(java.util.Date registeredTime) {
        setRegisteredTime(registeredTime);
        return this;
    }

    /**
     * <p>
     * The version's status.
     * </p>
     * 
     * @param status
     *        The version's status.
     * @see PackageVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The version's status.
     * </p>
     * 
     * @return The version's status.
     * @see PackageVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The version's status.
     * </p>
     * 
     * @param status
     *        The version's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public DescribePackageVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The version's status.
     * </p>
     * 
     * @param status
     *        The version's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public DescribePackageVersionResult withStatus(PackageVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The version's status description.
     * </p>
     * 
     * @param statusDescription
     *        The version's status description.
     */

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * <p>
     * The version's status description.
     * </p>
     * 
     * @return The version's status description.
     */

    public String getStatusDescription() {
        return this.statusDescription;
    }

    /**
     * <p>
     * The version's status description.
     * </p>
     * 
     * @param statusDescription
     *        The version's status description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionResult withStatusDescription(String statusDescription) {
        setStatusDescription(statusDescription);
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
        if (getIsLatestPatch() != null)
            sb.append("IsLatestPatch: ").append(getIsLatestPatch()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getPackageArn() != null)
            sb.append("PackageArn: ").append(getPackageArn()).append(",");
        if (getPackageId() != null)
            sb.append("PackageId: ").append(getPackageId()).append(",");
        if (getPackageName() != null)
            sb.append("PackageName: ").append(getPackageName()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
        if (getPatchVersion() != null)
            sb.append("PatchVersion: ").append(getPatchVersion()).append(",");
        if (getRegisteredTime() != null)
            sb.append("RegisteredTime: ").append(getRegisteredTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDescription() != null)
            sb.append("StatusDescription: ").append(getStatusDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePackageVersionResult == false)
            return false;
        DescribePackageVersionResult other = (DescribePackageVersionResult) obj;
        if (other.getIsLatestPatch() == null ^ this.getIsLatestPatch() == null)
            return false;
        if (other.getIsLatestPatch() != null && other.getIsLatestPatch().equals(this.getIsLatestPatch()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getPackageArn() == null ^ this.getPackageArn() == null)
            return false;
        if (other.getPackageArn() != null && other.getPackageArn().equals(this.getPackageArn()) == false)
            return false;
        if (other.getPackageId() == null ^ this.getPackageId() == null)
            return false;
        if (other.getPackageId() != null && other.getPackageId().equals(this.getPackageId()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getPatchVersion() == null ^ this.getPatchVersion() == null)
            return false;
        if (other.getPatchVersion() != null && other.getPatchVersion().equals(this.getPatchVersion()) == false)
            return false;
        if (other.getRegisteredTime() == null ^ this.getRegisteredTime() == null)
            return false;
        if (other.getRegisteredTime() != null && other.getRegisteredTime().equals(this.getRegisteredTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDescription() == null ^ this.getStatusDescription() == null)
            return false;
        if (other.getStatusDescription() != null && other.getStatusDescription().equals(this.getStatusDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsLatestPatch() == null) ? 0 : getIsLatestPatch().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getPackageArn() == null) ? 0 : getPackageArn().hashCode());
        hashCode = prime * hashCode + ((getPackageId() == null) ? 0 : getPackageId().hashCode());
        hashCode = prime * hashCode + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getPatchVersion() == null) ? 0 : getPatchVersion().hashCode());
        hashCode = prime * hashCode + ((getRegisteredTime() == null) ? 0 : getRegisteredTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDescription() == null) ? 0 : getStatusDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribePackageVersionResult clone() {
        try {
            return (DescribePackageVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
