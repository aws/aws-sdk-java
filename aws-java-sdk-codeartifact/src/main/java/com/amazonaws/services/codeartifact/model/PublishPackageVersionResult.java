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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PublishPackageVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishPackageVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The format of the package version.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The namespace of the package version.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the package.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * The version of the package.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The revision of the package version.
     * </p>
     */
    private String versionRevision;
    /**
     * <p>
     * A string that contains the status of the package version. For more information, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status.html#package-version-status"
     * >Package version status</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * for the published asset.
     * </p>
     */
    private AssetSummary asset;

    /**
     * <p>
     * The format of the package version.
     * </p>
     * 
     * @param format
     *        The format of the package version.
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the package version.
     * </p>
     * 
     * @return The format of the package version.
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the package version.
     * </p>
     * 
     * @param format
     *        The format of the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public PublishPackageVersionResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the package version.
     * </p>
     * 
     * @param format
     *        The format of the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public PublishPackageVersionResult withFormat(PackageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The namespace of the package version.
     * </p>
     * 
     * @param namespace
     *        The namespace of the package version.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the package version.
     * </p>
     * 
     * @return The namespace of the package version.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the package version.
     * </p>
     * 
     * @param namespace
     *        The namespace of the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionResult withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package.
     * </p>
     * 
     * @param packageValue
     *        The name of the package.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package.
     * </p>
     * 
     * @return The name of the package.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package.
     * </p>
     * 
     * @param packageValue
     *        The name of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionResult withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * The version of the package.
     * </p>
     * 
     * @param version
     *        The version of the package.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the package.
     * </p>
     * 
     * @return The version of the package.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the package.
     * </p>
     * 
     * @param version
     *        The version of the package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The revision of the package version.
     * </p>
     * 
     * @param versionRevision
     *        The revision of the package version.
     */

    public void setVersionRevision(String versionRevision) {
        this.versionRevision = versionRevision;
    }

    /**
     * <p>
     * The revision of the package version.
     * </p>
     * 
     * @return The revision of the package version.
     */

    public String getVersionRevision() {
        return this.versionRevision;
    }

    /**
     * <p>
     * The revision of the package version.
     * </p>
     * 
     * @param versionRevision
     *        The revision of the package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionResult withVersionRevision(String versionRevision) {
        setVersionRevision(versionRevision);
        return this;
    }

    /**
     * <p>
     * A string that contains the status of the package version. For more information, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status.html#package-version-status"
     * >Package version status</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param status
     *        A string that contains the status of the package version. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status.html#package-version-status"
     *        >Package version status</a> in the <i>CodeArtifact User Guide</i>.
     * @see PackageVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A string that contains the status of the package version. For more information, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status.html#package-version-status"
     * >Package version status</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @return A string that contains the status of the package version. For more information, see <a href=
     *         "https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status.html#package-version-status"
     *         >Package version status</a> in the <i>CodeArtifact User Guide</i>.
     * @see PackageVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A string that contains the status of the package version. For more information, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status.html#package-version-status"
     * >Package version status</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param status
     *        A string that contains the status of the package version. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status.html#package-version-status"
     *        >Package version status</a> in the <i>CodeArtifact User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public PublishPackageVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A string that contains the status of the package version. For more information, see <a href=
     * "https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status.html#package-version-status"
     * >Package version status</a> in the <i>CodeArtifact User Guide</i>.
     * </p>
     * 
     * @param status
     *        A string that contains the status of the package version. For more information, see <a href=
     *        "https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status.html#package-version-status"
     *        >Package version status</a> in the <i>CodeArtifact User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageVersionStatus
     */

    public PublishPackageVersionResult withStatus(PackageVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * for the published asset.
     * </p>
     * 
     * @param asset
     *        An <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     *        for the published asset.
     */

    public void setAsset(AssetSummary asset) {
        this.asset = asset;
    }

    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * for the published asset.
     * </p>
     * 
     * @return An <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary
     *         </a> for the published asset.
     */

    public AssetSummary getAsset() {
        return this.asset;
    }

    /**
     * <p>
     * An <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     * for the published asset.
     * </p>
     * 
     * @param asset
     *        An <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html">AssetSummary</a>
     *        for the published asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionResult withAsset(AssetSummary asset) {
        setAsset(asset);
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPackage() != null)
            sb.append("Package: ").append(getPackage()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getVersionRevision() != null)
            sb.append("VersionRevision: ").append(getVersionRevision()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAsset() != null)
            sb.append("Asset: ").append(getAsset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishPackageVersionResult == false)
            return false;
        PublishPackageVersionResult other = (PublishPackageVersionResult) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getPackage() == null ^ this.getPackage() == null)
            return false;
        if (other.getPackage() != null && other.getPackage().equals(this.getPackage()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionRevision() == null ^ this.getVersionRevision() == null)
            return false;
        if (other.getVersionRevision() != null && other.getVersionRevision().equals(this.getVersionRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAsset() == null ^ this.getAsset() == null)
            return false;
        if (other.getAsset() != null && other.getAsset().equals(this.getAsset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionRevision() == null) ? 0 : getVersionRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAsset() == null) ? 0 : getAsset().hashCode());
        return hashCode;
    }

    @Override
    public PublishPackageVersionResult clone() {
        try {
            return (PublishPackageVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
