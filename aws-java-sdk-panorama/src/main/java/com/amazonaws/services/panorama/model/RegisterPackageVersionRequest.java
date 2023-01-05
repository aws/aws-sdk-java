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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/RegisterPackageVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterPackageVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether to mark the new version as the latest version.
     * </p>
     */
    private Boolean markLatest;
    /**
     * <p>
     * An owner account.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * A package ID.
     * </p>
     */
    private String packageId;
    /**
     * <p>
     * A package version.
     * </p>
     */
    private String packageVersion;
    /**
     * <p>
     * A patch version.
     * </p>
     */
    private String patchVersion;

    /**
     * <p>
     * Whether to mark the new version as the latest version.
     * </p>
     * 
     * @param markLatest
     *        Whether to mark the new version as the latest version.
     */

    public void setMarkLatest(Boolean markLatest) {
        this.markLatest = markLatest;
    }

    /**
     * <p>
     * Whether to mark the new version as the latest version.
     * </p>
     * 
     * @return Whether to mark the new version as the latest version.
     */

    public Boolean getMarkLatest() {
        return this.markLatest;
    }

    /**
     * <p>
     * Whether to mark the new version as the latest version.
     * </p>
     * 
     * @param markLatest
     *        Whether to mark the new version as the latest version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterPackageVersionRequest withMarkLatest(Boolean markLatest) {
        setMarkLatest(markLatest);
        return this;
    }

    /**
     * <p>
     * Whether to mark the new version as the latest version.
     * </p>
     * 
     * @return Whether to mark the new version as the latest version.
     */

    public Boolean isMarkLatest() {
        return this.markLatest;
    }

    /**
     * <p>
     * An owner account.
     * </p>
     * 
     * @param ownerAccount
     *        An owner account.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * An owner account.
     * </p>
     * 
     * @return An owner account.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * An owner account.
     * </p>
     * 
     * @param ownerAccount
     *        An owner account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterPackageVersionRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * A package ID.
     * </p>
     * 
     * @param packageId
     *        A package ID.
     */

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    /**
     * <p>
     * A package ID.
     * </p>
     * 
     * @return A package ID.
     */

    public String getPackageId() {
        return this.packageId;
    }

    /**
     * <p>
     * A package ID.
     * </p>
     * 
     * @param packageId
     *        A package ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterPackageVersionRequest withPackageId(String packageId) {
        setPackageId(packageId);
        return this;
    }

    /**
     * <p>
     * A package version.
     * </p>
     * 
     * @param packageVersion
     *        A package version.
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * A package version.
     * </p>
     * 
     * @return A package version.
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * A package version.
     * </p>
     * 
     * @param packageVersion
     *        A package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterPackageVersionRequest withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * A patch version.
     * </p>
     * 
     * @param patchVersion
     *        A patch version.
     */

    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
    }

    /**
     * <p>
     * A patch version.
     * </p>
     * 
     * @return A patch version.
     */

    public String getPatchVersion() {
        return this.patchVersion;
    }

    /**
     * <p>
     * A patch version.
     * </p>
     * 
     * @param patchVersion
     *        A patch version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterPackageVersionRequest withPatchVersion(String patchVersion) {
        setPatchVersion(patchVersion);
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
        if (getMarkLatest() != null)
            sb.append("MarkLatest: ").append(getMarkLatest()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getPackageId() != null)
            sb.append("PackageId: ").append(getPackageId()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
        if (getPatchVersion() != null)
            sb.append("PatchVersion: ").append(getPatchVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterPackageVersionRequest == false)
            return false;
        RegisterPackageVersionRequest other = (RegisterPackageVersionRequest) obj;
        if (other.getMarkLatest() == null ^ this.getMarkLatest() == null)
            return false;
        if (other.getMarkLatest() != null && other.getMarkLatest().equals(this.getMarkLatest()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getPackageId() == null ^ this.getPackageId() == null)
            return false;
        if (other.getPackageId() != null && other.getPackageId().equals(this.getPackageId()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getPatchVersion() == null ^ this.getPatchVersion() == null)
            return false;
        if (other.getPatchVersion() != null && other.getPatchVersion().equals(this.getPatchVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarkLatest() == null) ? 0 : getMarkLatest().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getPackageId() == null) ? 0 : getPackageId().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getPatchVersion() == null) ? 0 : getPatchVersion().hashCode());
        return hashCode;
    }

    @Override
    public RegisterPackageVersionRequest clone() {
        return (RegisterPackageVersionRequest) super.clone();
    }

}
