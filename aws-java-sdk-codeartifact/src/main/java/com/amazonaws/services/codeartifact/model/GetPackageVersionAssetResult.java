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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetPackageVersionAsset"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPackageVersionAssetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The binary file, or asset, that is downloaded.
     * </p>
     */
    private java.io.InputStream asset;
    /**
     * <p>
     * The name of the asset that is downloaded.
     * </p>
     */
    private String assetName;
    /**
     * <p>
     * A string that contains the package version (for example, <code>3.5.2</code>).
     * </p>
     */
    private String packageVersion;
    /**
     * <p>
     * The name of the package version revision that contains the downloaded asset.
     * </p>
     */
    private String packageVersionRevision;

    /**
     * <p>
     * The binary file, or asset, that is downloaded.
     * </p>
     * 
     * @param asset
     *        The binary file, or asset, that is downloaded.
     */

    public void setAsset(java.io.InputStream asset) {
        this.asset = asset;
    }

    /**
     * <p>
     * The binary file, or asset, that is downloaded.
     * </p>
     * 
     * @return The binary file, or asset, that is downloaded.
     */

    public java.io.InputStream getAsset() {
        return this.asset;
    }

    /**
     * <p>
     * The binary file, or asset, that is downloaded.
     * </p>
     * 
     * @param asset
     *        The binary file, or asset, that is downloaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionAssetResult withAsset(java.io.InputStream asset) {
        setAsset(asset);
        return this;
    }

    /**
     * <p>
     * The name of the asset that is downloaded.
     * </p>
     * 
     * @param assetName
     *        The name of the asset that is downloaded.
     */

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * The name of the asset that is downloaded.
     * </p>
     * 
     * @return The name of the asset that is downloaded.
     */

    public String getAssetName() {
        return this.assetName;
    }

    /**
     * <p>
     * The name of the asset that is downloaded.
     * </p>
     * 
     * @param assetName
     *        The name of the asset that is downloaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionAssetResult withAssetName(String assetName) {
        setAssetName(assetName);
        return this;
    }

    /**
     * <p>
     * A string that contains the package version (for example, <code>3.5.2</code>).
     * </p>
     * 
     * @param packageVersion
     *        A string that contains the package version (for example, <code>3.5.2</code>).
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * A string that contains the package version (for example, <code>3.5.2</code>).
     * </p>
     * 
     * @return A string that contains the package version (for example, <code>3.5.2</code>).
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * A string that contains the package version (for example, <code>3.5.2</code>).
     * </p>
     * 
     * @param packageVersion
     *        A string that contains the package version (for example, <code>3.5.2</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionAssetResult withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * The name of the package version revision that contains the downloaded asset.
     * </p>
     * 
     * @param packageVersionRevision
     *        The name of the package version revision that contains the downloaded asset.
     */

    public void setPackageVersionRevision(String packageVersionRevision) {
        this.packageVersionRevision = packageVersionRevision;
    }

    /**
     * <p>
     * The name of the package version revision that contains the downloaded asset.
     * </p>
     * 
     * @return The name of the package version revision that contains the downloaded asset.
     */

    public String getPackageVersionRevision() {
        return this.packageVersionRevision;
    }

    /**
     * <p>
     * The name of the package version revision that contains the downloaded asset.
     * </p>
     * 
     * @param packageVersionRevision
     *        The name of the package version revision that contains the downloaded asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPackageVersionAssetResult withPackageVersionRevision(String packageVersionRevision) {
        setPackageVersionRevision(packageVersionRevision);
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
        if (getAsset() != null)
            sb.append("Asset: ").append(getAsset()).append(",");
        if (getAssetName() != null)
            sb.append("AssetName: ").append(getAssetName()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
        if (getPackageVersionRevision() != null)
            sb.append("PackageVersionRevision: ").append(getPackageVersionRevision());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPackageVersionAssetResult == false)
            return false;
        GetPackageVersionAssetResult other = (GetPackageVersionAssetResult) obj;
        if (other.getAsset() == null ^ this.getAsset() == null)
            return false;
        if (other.getAsset() != null && other.getAsset().equals(this.getAsset()) == false)
            return false;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getPackageVersionRevision() == null ^ this.getPackageVersionRevision() == null)
            return false;
        if (other.getPackageVersionRevision() != null && other.getPackageVersionRevision().equals(this.getPackageVersionRevision()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsset() == null) ? 0 : getAsset().hashCode());
        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getPackageVersionRevision() == null) ? 0 : getPackageVersionRevision().hashCode());
        return hashCode;
    }

    @Override
    public GetPackageVersionAssetResult clone() {
        try {
            return (GetPackageVersionAssetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
