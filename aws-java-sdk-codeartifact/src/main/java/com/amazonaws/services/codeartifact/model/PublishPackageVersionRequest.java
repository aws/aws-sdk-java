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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/PublishPackageVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublishPackageVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package version to publish.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     */
    private String domainOwner;
    /**
     * <p>
     * The name of the repository that the package version will be published to.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * A format that specifies the type of the package version with the requested asset file.
     * </p>
     * <p>
     * The only supported value is <code>generic</code>.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The namespace of the package version to publish.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The name of the package version to publish.
     * </p>
     */
    private String packageValue;
    /**
     * <p>
     * The package version to publish (for example, <code>3.5.2</code>).
     * </p>
     */
    private String packageVersion;
    /**
     * <p>
     * The content of the asset to publish.
     * </p>
     */
    private java.io.InputStream assetContent;
    /**
     * <p>
     * The name of the asset to publish. Asset names can include Unicode letters and numbers, and the following special
     * characters: <code>~ ! @ ^ &amp; ( ) - ` _ + [ ] { } ; , . `</code>
     * </p>
     */
    private String assetName;
    /**
     * <p>
     * The SHA256 hash of the <code>assetContent</code> to publish. This value must be calculated by the caller and
     * provided with the request (see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-generic.html#publishing-generic-packages"
     * >Publishing a generic package</a> in the <i>CodeArtifact User Guide</i>).
     * </p>
     * <p>
     * This value is used as an integrity check to verify that the <code>assetContent</code> has not changed after it
     * was originally sent.
     * </p>
     */
    private String assetSHA256;
    /**
     * <p>
     * Specifies whether the package version should remain in the <code>unfinished</code> state. If omitted, the package
     * version status will be set to <code>Published</code> (see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status">Package
     * version status</a> in the <i>CodeArtifact User Guide</i>).
     * </p>
     * <p>
     * Valid values: <code>unfinished</code>
     * </p>
     */
    private Boolean unfinished;

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package version to publish.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the package version to publish.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package version to publish.
     * </p>
     * 
     * @return The name of the domain that contains the repository that contains the package version to publish.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain that contains the repository that contains the package version to publish.
     * </p>
     * 
     * @param domain
     *        The name of the domain that contains the repository that contains the package version to publish.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     */

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @return The 12-digit account number of the AWS account that owns the domain. It does not include dashes or
     *         spaces.
     */

    public String getDomainOwner() {
        return this.domainOwner;
    }

    /**
     * <p>
     * The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * </p>
     * 
     * @param domainOwner
     *        The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionRequest withDomainOwner(String domainOwner) {
        setDomainOwner(domainOwner);
        return this;
    }

    /**
     * <p>
     * The name of the repository that the package version will be published to.
     * </p>
     * 
     * @param repository
     *        The name of the repository that the package version will be published to.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The name of the repository that the package version will be published to.
     * </p>
     * 
     * @return The name of the repository that the package version will be published to.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The name of the repository that the package version will be published to.
     * </p>
     * 
     * @param repository
     *        The name of the repository that the package version will be published to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionRequest withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the package version with the requested asset file.
     * </p>
     * <p>
     * The only supported value is <code>generic</code>.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the package version with the requested asset file.</p>
     *        <p>
     *        The only supported value is <code>generic</code>.
     * @see PackageFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * A format that specifies the type of the package version with the requested asset file.
     * </p>
     * <p>
     * The only supported value is <code>generic</code>.
     * </p>
     * 
     * @return A format that specifies the type of the package version with the requested asset file.</p>
     *         <p>
     *         The only supported value is <code>generic</code>.
     * @see PackageFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * A format that specifies the type of the package version with the requested asset file.
     * </p>
     * <p>
     * The only supported value is <code>generic</code>.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the package version with the requested asset file.</p>
     *        <p>
     *        The only supported value is <code>generic</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public PublishPackageVersionRequest withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * A format that specifies the type of the package version with the requested asset file.
     * </p>
     * <p>
     * The only supported value is <code>generic</code>.
     * </p>
     * 
     * @param format
     *        A format that specifies the type of the package version with the requested asset file.</p>
     *        <p>
     *        The only supported value is <code>generic</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageFormat
     */

    public PublishPackageVersionRequest withFormat(PackageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The namespace of the package version to publish.
     * </p>
     * 
     * @param namespace
     *        The namespace of the package version to publish.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the package version to publish.
     * </p>
     * 
     * @return The namespace of the package version to publish.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the package version to publish.
     * </p>
     * 
     * @param namespace
     *        The namespace of the package version to publish.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The name of the package version to publish.
     * </p>
     * 
     * @param packageValue
     *        The name of the package version to publish.
     */

    public void setPackage(String packageValue) {
        this.packageValue = packageValue;
    }

    /**
     * <p>
     * The name of the package version to publish.
     * </p>
     * 
     * @return The name of the package version to publish.
     */

    public String getPackage() {
        return this.packageValue;
    }

    /**
     * <p>
     * The name of the package version to publish.
     * </p>
     * 
     * @param packageValue
     *        The name of the package version to publish.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionRequest withPackage(String packageValue) {
        setPackage(packageValue);
        return this;
    }

    /**
     * <p>
     * The package version to publish (for example, <code>3.5.2</code>).
     * </p>
     * 
     * @param packageVersion
     *        The package version to publish (for example, <code>3.5.2</code>).
     */

    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * The package version to publish (for example, <code>3.5.2</code>).
     * </p>
     * 
     * @return The package version to publish (for example, <code>3.5.2</code>).
     */

    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * <p>
     * The package version to publish (for example, <code>3.5.2</code>).
     * </p>
     * 
     * @param packageVersion
     *        The package version to publish (for example, <code>3.5.2</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionRequest withPackageVersion(String packageVersion) {
        setPackageVersion(packageVersion);
        return this;
    }

    /**
     * <p>
     * The content of the asset to publish.
     * </p>
     * 
     * @param assetContent
     *        The content of the asset to publish.
     */

    public void setAssetContent(java.io.InputStream assetContent) {
        this.assetContent = assetContent;
    }

    /**
     * <p>
     * The content of the asset to publish.
     * </p>
     * 
     * @return The content of the asset to publish.
     */

    public java.io.InputStream getAssetContent() {
        return this.assetContent;
    }

    /**
     * <p>
     * The content of the asset to publish.
     * </p>
     * 
     * @param assetContent
     *        The content of the asset to publish.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionRequest withAssetContent(java.io.InputStream assetContent) {
        setAssetContent(assetContent);
        return this;
    }

    /**
     * <p>
     * The name of the asset to publish. Asset names can include Unicode letters and numbers, and the following special
     * characters: <code>~ ! @ ^ &amp; ( ) - ` _ + [ ] { } ; , . `</code>
     * </p>
     * 
     * @param assetName
     *        The name of the asset to publish. Asset names can include Unicode letters and numbers, and the following
     *        special characters: <code>~ ! @ ^ &amp; ( ) - ` _ + [ ] { } ; , . `</code>
     */

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    /**
     * <p>
     * The name of the asset to publish. Asset names can include Unicode letters and numbers, and the following special
     * characters: <code>~ ! @ ^ &amp; ( ) - ` _ + [ ] { } ; , . `</code>
     * </p>
     * 
     * @return The name of the asset to publish. Asset names can include Unicode letters and numbers, and the following
     *         special characters: <code>~ ! @ ^ &amp; ( ) - ` _ + [ ] { } ; , . `</code>
     */

    public String getAssetName() {
        return this.assetName;
    }

    /**
     * <p>
     * The name of the asset to publish. Asset names can include Unicode letters and numbers, and the following special
     * characters: <code>~ ! @ ^ &amp; ( ) - ` _ + [ ] { } ; , . `</code>
     * </p>
     * 
     * @param assetName
     *        The name of the asset to publish. Asset names can include Unicode letters and numbers, and the following
     *        special characters: <code>~ ! @ ^ &amp; ( ) - ` _ + [ ] { } ; , . `</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionRequest withAssetName(String assetName) {
        setAssetName(assetName);
        return this;
    }

    /**
     * <p>
     * The SHA256 hash of the <code>assetContent</code> to publish. This value must be calculated by the caller and
     * provided with the request (see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-generic.html#publishing-generic-packages"
     * >Publishing a generic package</a> in the <i>CodeArtifact User Guide</i>).
     * </p>
     * <p>
     * This value is used as an integrity check to verify that the <code>assetContent</code> has not changed after it
     * was originally sent.
     * </p>
     * 
     * @param assetSHA256
     *        The SHA256 hash of the <code>assetContent</code> to publish. This value must be calculated by the caller
     *        and provided with the request (see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-generic.html#publishing-generic-packages"
     *        >Publishing a generic package</a> in the <i>CodeArtifact User Guide</i>).</p>
     *        <p>
     *        This value is used as an integrity check to verify that the <code>assetContent</code> has not changed
     *        after it was originally sent.
     */

    public void setAssetSHA256(String assetSHA256) {
        this.assetSHA256 = assetSHA256;
    }

    /**
     * <p>
     * The SHA256 hash of the <code>assetContent</code> to publish. This value must be calculated by the caller and
     * provided with the request (see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-generic.html#publishing-generic-packages"
     * >Publishing a generic package</a> in the <i>CodeArtifact User Guide</i>).
     * </p>
     * <p>
     * This value is used as an integrity check to verify that the <code>assetContent</code> has not changed after it
     * was originally sent.
     * </p>
     * 
     * @return The SHA256 hash of the <code>assetContent</code> to publish. This value must be calculated by the caller
     *         and provided with the request (see <a href=
     *         "https://docs.aws.amazon.com/codeartifact/latest/ug/using-generic.html#publishing-generic-packages"
     *         >Publishing a generic package</a> in the <i>CodeArtifact User Guide</i>).</p>
     *         <p>
     *         This value is used as an integrity check to verify that the <code>assetContent</code> has not changed
     *         after it was originally sent.
     */

    public String getAssetSHA256() {
        return this.assetSHA256;
    }

    /**
     * <p>
     * The SHA256 hash of the <code>assetContent</code> to publish. This value must be calculated by the caller and
     * provided with the request (see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-generic.html#publishing-generic-packages"
     * >Publishing a generic package</a> in the <i>CodeArtifact User Guide</i>).
     * </p>
     * <p>
     * This value is used as an integrity check to verify that the <code>assetContent</code> has not changed after it
     * was originally sent.
     * </p>
     * 
     * @param assetSHA256
     *        The SHA256 hash of the <code>assetContent</code> to publish. This value must be calculated by the caller
     *        and provided with the request (see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/ug/using-generic.html#publishing-generic-packages"
     *        >Publishing a generic package</a> in the <i>CodeArtifact User Guide</i>).</p>
     *        <p>
     *        This value is used as an integrity check to verify that the <code>assetContent</code> has not changed
     *        after it was originally sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionRequest withAssetSHA256(String assetSHA256) {
        setAssetSHA256(assetSHA256);
        return this;
    }

    /**
     * <p>
     * Specifies whether the package version should remain in the <code>unfinished</code> state. If omitted, the package
     * version status will be set to <code>Published</code> (see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status">Package
     * version status</a> in the <i>CodeArtifact User Guide</i>).
     * </p>
     * <p>
     * Valid values: <code>unfinished</code>
     * </p>
     * 
     * @param unfinished
     *        Specifies whether the package version should remain in the <code>unfinished</code> state. If omitted, the
     *        package version status will be set to <code>Published</code> (see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status"
     *        >Package version status</a> in the <i>CodeArtifact User Guide</i>).</p>
     *        <p>
     *        Valid values: <code>unfinished</code>
     */

    public void setUnfinished(Boolean unfinished) {
        this.unfinished = unfinished;
    }

    /**
     * <p>
     * Specifies whether the package version should remain in the <code>unfinished</code> state. If omitted, the package
     * version status will be set to <code>Published</code> (see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status">Package
     * version status</a> in the <i>CodeArtifact User Guide</i>).
     * </p>
     * <p>
     * Valid values: <code>unfinished</code>
     * </p>
     * 
     * @return Specifies whether the package version should remain in the <code>unfinished</code> state. If omitted, the
     *         package version status will be set to <code>Published</code> (see <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status"
     *         >Package version status</a> in the <i>CodeArtifact User Guide</i>).</p>
     *         <p>
     *         Valid values: <code>unfinished</code>
     */

    public Boolean getUnfinished() {
        return this.unfinished;
    }

    /**
     * <p>
     * Specifies whether the package version should remain in the <code>unfinished</code> state. If omitted, the package
     * version status will be set to <code>Published</code> (see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status">Package
     * version status</a> in the <i>CodeArtifact User Guide</i>).
     * </p>
     * <p>
     * Valid values: <code>unfinished</code>
     * </p>
     * 
     * @param unfinished
     *        Specifies whether the package version should remain in the <code>unfinished</code> state. If omitted, the
     *        package version status will be set to <code>Published</code> (see <a
     *        href="https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status"
     *        >Package version status</a> in the <i>CodeArtifact User Guide</i>).</p>
     *        <p>
     *        Valid values: <code>unfinished</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PublishPackageVersionRequest withUnfinished(Boolean unfinished) {
        setUnfinished(unfinished);
        return this;
    }

    /**
     * <p>
     * Specifies whether the package version should remain in the <code>unfinished</code> state. If omitted, the package
     * version status will be set to <code>Published</code> (see <a
     * href="https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status">Package
     * version status</a> in the <i>CodeArtifact User Guide</i>).
     * </p>
     * <p>
     * Valid values: <code>unfinished</code>
     * </p>
     * 
     * @return Specifies whether the package version should remain in the <code>unfinished</code> state. If omitted, the
     *         package version status will be set to <code>Published</code> (see <a
     *         href="https://docs.aws.amazon.com/codeartifact/latest/ug/packages-overview.html#package-version-status"
     *         >Package version status</a> in the <i>CodeArtifact User Guide</i>).</p>
     *         <p>
     *         Valid values: <code>unfinished</code>
     */

    public Boolean isUnfinished() {
        return this.unfinished;
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainOwner() != null)
            sb.append("DomainOwner: ").append(getDomainOwner()).append(",");
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPackage() != null)
            sb.append("Package: ").append(getPackage()).append(",");
        if (getPackageVersion() != null)
            sb.append("PackageVersion: ").append(getPackageVersion()).append(",");
        if (getAssetContent() != null)
            sb.append("AssetContent: ").append(getAssetContent()).append(",");
        if (getAssetName() != null)
            sb.append("AssetName: ").append(getAssetName()).append(",");
        if (getAssetSHA256() != null)
            sb.append("AssetSHA256: ").append(getAssetSHA256()).append(",");
        if (getUnfinished() != null)
            sb.append("Unfinished: ").append(getUnfinished());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublishPackageVersionRequest == false)
            return false;
        PublishPackageVersionRequest other = (PublishPackageVersionRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null)
            return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false)
            return false;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
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
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        if (other.getAssetContent() == null ^ this.getAssetContent() == null)
            return false;
        if (other.getAssetContent() != null && other.getAssetContent().equals(this.getAssetContent()) == false)
            return false;
        if (other.getAssetName() == null ^ this.getAssetName() == null)
            return false;
        if (other.getAssetName() != null && other.getAssetName().equals(this.getAssetName()) == false)
            return false;
        if (other.getAssetSHA256() == null ^ this.getAssetSHA256() == null)
            return false;
        if (other.getAssetSHA256() != null && other.getAssetSHA256().equals(this.getAssetSHA256()) == false)
            return false;
        if (other.getUnfinished() == null ^ this.getUnfinished() == null)
            return false;
        if (other.getUnfinished() != null && other.getUnfinished().equals(this.getUnfinished()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getAssetContent() == null) ? 0 : getAssetContent().hashCode());
        hashCode = prime * hashCode + ((getAssetName() == null) ? 0 : getAssetName().hashCode());
        hashCode = prime * hashCode + ((getAssetSHA256() == null) ? 0 : getAssetSHA256().hashCode());
        hashCode = prime * hashCode + ((getUnfinished() == null) ? 0 : getUnfinished().hashCode());
        return hashCode;
    }

    @Override
    public PublishPackageVersionRequest clone() {
        return (PublishPackageVersionRequest) super.clone();
    }

}
