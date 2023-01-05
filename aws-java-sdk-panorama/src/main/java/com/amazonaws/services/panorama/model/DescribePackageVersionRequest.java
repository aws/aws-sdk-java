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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackageVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The version's owner account.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The version's ID.
     * </p>
     */
    private String packageId;
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
     * The version's owner account.
     * </p>
     * 
     * @param ownerAccount
     *        The version's owner account.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The version's owner account.
     * </p>
     * 
     * @return The version's owner account.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The version's owner account.
     * </p>
     * 
     * @param ownerAccount
     *        The version's owner account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageVersionRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
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

    public DescribePackageVersionRequest withPackageId(String packageId) {
        setPackageId(packageId);
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

    public DescribePackageVersionRequest withPackageVersion(String packageVersion) {
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

    public DescribePackageVersionRequest withPatchVersion(String patchVersion) {
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

        if (obj instanceof DescribePackageVersionRequest == false)
            return false;
        DescribePackageVersionRequest other = (DescribePackageVersionRequest) obj;
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

        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getPackageId() == null) ? 0 : getPackageId().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getPatchVersion() == null) ? 0 : getPatchVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribePackageVersionRequest clone() {
        return (DescribePackageVersionRequest) super.clone();
    }

}
