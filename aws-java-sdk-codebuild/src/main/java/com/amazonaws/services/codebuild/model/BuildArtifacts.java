/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about build output artifacts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BuildArtifacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildArtifacts implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     */
    private String sha256sum;
    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     */
    private String md5sum;
    /**
     * <p>
     * If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a
     * build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a
     * date and time to your artifact name so that it is always unique.
     * </p>
     */
    private Boolean overrideArtifactName;
    /**
     * <p>
     * Information that tells you if encryption for build artifacts is disabled.
     * </p>
     */
    private Boolean encryptionDisabled;
    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     */
    private String artifactIdentifier;

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     * 
     * @param location
     *        Information about the location of the build artifacts.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     * 
     * @return Information about the location of the build artifacts.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Information about the location of the build artifacts.
     * </p>
     * 
     * @param location
     *        Information about the location of the build artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildArtifacts withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @param sha256sum
     *        The SHA-256 hash of the build artifact.</p>
     *        <p>
     *        You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     *        </p>
     *        <note>
     *        <p>
     *        This value is available only if the build project's <code>packaging</code> value is set to
     *        <code>ZIP</code>.
     *        </p>
     */

    public void setSha256sum(String sha256sum) {
        this.sha256sum = sha256sum;
    }

    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @return The SHA-256 hash of the build artifact.</p>
     *         <p>
     *         You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     *         </p>
     *         <note>
     *         <p>
     *         This value is available only if the build project's <code>packaging</code> value is set to
     *         <code>ZIP</code>.
     *         </p>
     */

    public String getSha256sum() {
        return this.sha256sum;
    }

    /**
     * <p>
     * The SHA-256 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @param sha256sum
     *        The SHA-256 hash of the build artifact.</p>
     *        <p>
     *        You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     *        </p>
     *        <note>
     *        <p>
     *        This value is available only if the build project's <code>packaging</code> value is set to
     *        <code>ZIP</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildArtifacts withSha256sum(String sha256sum) {
        setSha256sum(sha256sum);
        return this;
    }

    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @param md5sum
     *        The MD5 hash of the build artifact.</p>
     *        <p>
     *        You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     *        </p>
     *        <note>
     *        <p>
     *        This value is available only if the build project's <code>packaging</code> value is set to
     *        <code>ZIP</code>.
     *        </p>
     */

    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum;
    }

    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @return The MD5 hash of the build artifact.</p>
     *         <p>
     *         You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     *         </p>
     *         <note>
     *         <p>
     *         This value is available only if the build project's <code>packaging</code> value is set to
     *         <code>ZIP</code>.
     *         </p>
     */

    public String getMd5sum() {
        return this.md5sum;
    }

    /**
     * <p>
     * The MD5 hash of the build artifact.
     * </p>
     * <p>
     * You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     * </p>
     * <note>
     * <p>
     * This value is available only if the build project's <code>packaging</code> value is set to <code>ZIP</code>.
     * </p>
     * </note>
     * 
     * @param md5sum
     *        The MD5 hash of the build artifact.</p>
     *        <p>
     *        You can use this hash along with a checksum tool to confirm file integrity and authenticity.
     *        </p>
     *        <note>
     *        <p>
     *        This value is available only if the build project's <code>packaging</code> value is set to
     *        <code>ZIP</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildArtifacts withMd5sum(String md5sum) {
        setMd5sum(md5sum);
        return this;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a
     * build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a
     * date and time to your artifact name so that it is always unique.
     * </p>
     * 
     * @param overrideArtifactName
     *        If this flag is set, a name specified in the build spec file overrides the artifact name. The name
     *        specified in a build spec file is calculated at build time and uses the Shell Command Language. For
     *        example, you can append a date and time to your artifact name so that it is always unique.
     */

    public void setOverrideArtifactName(Boolean overrideArtifactName) {
        this.overrideArtifactName = overrideArtifactName;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a
     * build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a
     * date and time to your artifact name so that it is always unique.
     * </p>
     * 
     * @return If this flag is set, a name specified in the build spec file overrides the artifact name. The name
     *         specified in a build spec file is calculated at build time and uses the Shell Command Language. For
     *         example, you can append a date and time to your artifact name so that it is always unique.
     */

    public Boolean getOverrideArtifactName() {
        return this.overrideArtifactName;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a
     * build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a
     * date and time to your artifact name so that it is always unique.
     * </p>
     * 
     * @param overrideArtifactName
     *        If this flag is set, a name specified in the build spec file overrides the artifact name. The name
     *        specified in a build spec file is calculated at build time and uses the Shell Command Language. For
     *        example, you can append a date and time to your artifact name so that it is always unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildArtifacts withOverrideArtifactName(Boolean overrideArtifactName) {
        setOverrideArtifactName(overrideArtifactName);
        return this;
    }

    /**
     * <p>
     * If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a
     * build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a
     * date and time to your artifact name so that it is always unique.
     * </p>
     * 
     * @return If this flag is set, a name specified in the build spec file overrides the artifact name. The name
     *         specified in a build spec file is calculated at build time and uses the Shell Command Language. For
     *         example, you can append a date and time to your artifact name so that it is always unique.
     */

    public Boolean isOverrideArtifactName() {
        return this.overrideArtifactName;
    }

    /**
     * <p>
     * Information that tells you if encryption for build artifacts is disabled.
     * </p>
     * 
     * @param encryptionDisabled
     *        Information that tells you if encryption for build artifacts is disabled.
     */

    public void setEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    /**
     * <p>
     * Information that tells you if encryption for build artifacts is disabled.
     * </p>
     * 
     * @return Information that tells you if encryption for build artifacts is disabled.
     */

    public Boolean getEncryptionDisabled() {
        return this.encryptionDisabled;
    }

    /**
     * <p>
     * Information that tells you if encryption for build artifacts is disabled.
     * </p>
     * 
     * @param encryptionDisabled
     *        Information that tells you if encryption for build artifacts is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildArtifacts withEncryptionDisabled(Boolean encryptionDisabled) {
        setEncryptionDisabled(encryptionDisabled);
        return this;
    }

    /**
     * <p>
     * Information that tells you if encryption for build artifacts is disabled.
     * </p>
     * 
     * @return Information that tells you if encryption for build artifacts is disabled.
     */

    public Boolean isEncryptionDisabled() {
        return this.encryptionDisabled;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     * 
     * @param artifactIdentifier
     *        An identifier for this artifact definition.
     */

    public void setArtifactIdentifier(String artifactIdentifier) {
        this.artifactIdentifier = artifactIdentifier;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     * 
     * @return An identifier for this artifact definition.
     */

    public String getArtifactIdentifier() {
        return this.artifactIdentifier;
    }

    /**
     * <p>
     * An identifier for this artifact definition.
     * </p>
     * 
     * @param artifactIdentifier
     *        An identifier for this artifact definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildArtifacts withArtifactIdentifier(String artifactIdentifier) {
        setArtifactIdentifier(artifactIdentifier);
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
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getSha256sum() != null)
            sb.append("Sha256sum: ").append(getSha256sum()).append(",");
        if (getMd5sum() != null)
            sb.append("Md5sum: ").append(getMd5sum()).append(",");
        if (getOverrideArtifactName() != null)
            sb.append("OverrideArtifactName: ").append(getOverrideArtifactName()).append(",");
        if (getEncryptionDisabled() != null)
            sb.append("EncryptionDisabled: ").append(getEncryptionDisabled()).append(",");
        if (getArtifactIdentifier() != null)
            sb.append("ArtifactIdentifier: ").append(getArtifactIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildArtifacts == false)
            return false;
        BuildArtifacts other = (BuildArtifacts) obj;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getSha256sum() == null ^ this.getSha256sum() == null)
            return false;
        if (other.getSha256sum() != null && other.getSha256sum().equals(this.getSha256sum()) == false)
            return false;
        if (other.getMd5sum() == null ^ this.getMd5sum() == null)
            return false;
        if (other.getMd5sum() != null && other.getMd5sum().equals(this.getMd5sum()) == false)
            return false;
        if (other.getOverrideArtifactName() == null ^ this.getOverrideArtifactName() == null)
            return false;
        if (other.getOverrideArtifactName() != null && other.getOverrideArtifactName().equals(this.getOverrideArtifactName()) == false)
            return false;
        if (other.getEncryptionDisabled() == null ^ this.getEncryptionDisabled() == null)
            return false;
        if (other.getEncryptionDisabled() != null && other.getEncryptionDisabled().equals(this.getEncryptionDisabled()) == false)
            return false;
        if (other.getArtifactIdentifier() == null ^ this.getArtifactIdentifier() == null)
            return false;
        if (other.getArtifactIdentifier() != null && other.getArtifactIdentifier().equals(this.getArtifactIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getSha256sum() == null) ? 0 : getSha256sum().hashCode());
        hashCode = prime * hashCode + ((getMd5sum() == null) ? 0 : getMd5sum().hashCode());
        hashCode = prime * hashCode + ((getOverrideArtifactName() == null) ? 0 : getOverrideArtifactName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionDisabled() == null) ? 0 : getEncryptionDisabled().hashCode());
        hashCode = prime * hashCode + ((getArtifactIdentifier() == null) ? 0 : getArtifactIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public BuildArtifacts clone() {
        try {
            return (BuildArtifacts) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.BuildArtifactsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
