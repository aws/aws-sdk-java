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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the build artifacts for the CodeBuild project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCodeBuildProjectArtifactsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCodeBuildProjectArtifactsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier for the artifact definition.
     * </p>
     */
    private String artifactIdentifier;
    /**
     * <p>
     * Indicates whether to disable encryption on the artifact. Only valid when <code>Type</code> is <code>S3</code>.
     * </p>
     */
    private Boolean encryptionDisabled;
    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The name of the S3 bucket where the artifact is located.
     * </p>
     */
    private String location;
    /**
     * <p>
     * Only used when Type is S3. The name of the artifact. Used with <code>NamepaceType</code> and <code>Path</code> to
     * determine the pattern for storing the artifact.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The value to use for the namespace. Used with
     * <code>Name</code> and <code>Path</code> to determine the pattern for storing the artifact.
     * </p>
     */
    private String namespaceType;
    /**
     * <p>
     * Whether the name specified in the buildspec file overrides the artifact name.
     * </p>
     */
    private Boolean overrideArtifactName;
    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The type of output artifact to create.
     * </p>
     */
    private String packaging;
    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The path to the artifact. Used with <code>Name</code> and
     * <code>NamespaceType</code> to determine the pattern for storing the artifact.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The type of build artifact.
     * </p>
     */
    private String type;

    /**
     * <p>
     * An identifier for the artifact definition.
     * </p>
     * 
     * @param artifactIdentifier
     *        An identifier for the artifact definition.
     */

    public void setArtifactIdentifier(String artifactIdentifier) {
        this.artifactIdentifier = artifactIdentifier;
    }

    /**
     * <p>
     * An identifier for the artifact definition.
     * </p>
     * 
     * @return An identifier for the artifact definition.
     */

    public String getArtifactIdentifier() {
        return this.artifactIdentifier;
    }

    /**
     * <p>
     * An identifier for the artifact definition.
     * </p>
     * 
     * @param artifactIdentifier
     *        An identifier for the artifact definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectArtifactsDetails withArtifactIdentifier(String artifactIdentifier) {
        setArtifactIdentifier(artifactIdentifier);
        return this;
    }

    /**
     * <p>
     * Indicates whether to disable encryption on the artifact. Only valid when <code>Type</code> is <code>S3</code>.
     * </p>
     * 
     * @param encryptionDisabled
     *        Indicates whether to disable encryption on the artifact. Only valid when <code>Type</code> is
     *        <code>S3</code>.
     */

    public void setEncryptionDisabled(Boolean encryptionDisabled) {
        this.encryptionDisabled = encryptionDisabled;
    }

    /**
     * <p>
     * Indicates whether to disable encryption on the artifact. Only valid when <code>Type</code> is <code>S3</code>.
     * </p>
     * 
     * @return Indicates whether to disable encryption on the artifact. Only valid when <code>Type</code> is
     *         <code>S3</code>.
     */

    public Boolean getEncryptionDisabled() {
        return this.encryptionDisabled;
    }

    /**
     * <p>
     * Indicates whether to disable encryption on the artifact. Only valid when <code>Type</code> is <code>S3</code>.
     * </p>
     * 
     * @param encryptionDisabled
     *        Indicates whether to disable encryption on the artifact. Only valid when <code>Type</code> is
     *        <code>S3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectArtifactsDetails withEncryptionDisabled(Boolean encryptionDisabled) {
        setEncryptionDisabled(encryptionDisabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether to disable encryption on the artifact. Only valid when <code>Type</code> is <code>S3</code>.
     * </p>
     * 
     * @return Indicates whether to disable encryption on the artifact. Only valid when <code>Type</code> is
     *         <code>S3</code>.
     */

    public Boolean isEncryptionDisabled() {
        return this.encryptionDisabled;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The name of the S3 bucket where the artifact is located.
     * </p>
     * 
     * @param location
     *        Only used when <code>Type</code> is <code>S3</code>. The name of the S3 bucket where the artifact is
     *        located.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The name of the S3 bucket where the artifact is located.
     * </p>
     * 
     * @return Only used when <code>Type</code> is <code>S3</code>. The name of the S3 bucket where the artifact is
     *         located.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The name of the S3 bucket where the artifact is located.
     * </p>
     * 
     * @param location
     *        Only used when <code>Type</code> is <code>S3</code>. The name of the S3 bucket where the artifact is
     *        located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectArtifactsDetails withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * Only used when Type is S3. The name of the artifact. Used with <code>NamepaceType</code> and <code>Path</code> to
     * determine the pattern for storing the artifact.
     * </p>
     * 
     * @param name
     *        Only used when Type is S3. The name of the artifact. Used with <code>NamepaceType</code> and
     *        <code>Path</code> to determine the pattern for storing the artifact.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Only used when Type is S3. The name of the artifact. Used with <code>NamepaceType</code> and <code>Path</code> to
     * determine the pattern for storing the artifact.
     * </p>
     * 
     * @return Only used when Type is S3. The name of the artifact. Used with <code>NamepaceType</code> and
     *         <code>Path</code> to determine the pattern for storing the artifact.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Only used when Type is S3. The name of the artifact. Used with <code>NamepaceType</code> and <code>Path</code> to
     * determine the pattern for storing the artifact.
     * </p>
     * 
     * @param name
     *        Only used when Type is S3. The name of the artifact. Used with <code>NamepaceType</code> and
     *        <code>Path</code> to determine the pattern for storing the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectArtifactsDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The value to use for the namespace. Used with
     * <code>Name</code> and <code>Path</code> to determine the pattern for storing the artifact.
     * </p>
     * 
     * @param namespaceType
     *        Only used when <code>Type</code> is <code>S3</code>. The value to use for the namespace. Used with
     *        <code>Name</code> and <code>Path</code> to determine the pattern for storing the artifact.
     */

    public void setNamespaceType(String namespaceType) {
        this.namespaceType = namespaceType;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The value to use for the namespace. Used with
     * <code>Name</code> and <code>Path</code> to determine the pattern for storing the artifact.
     * </p>
     * 
     * @return Only used when <code>Type</code> is <code>S3</code>. The value to use for the namespace. Used with
     *         <code>Name</code> and <code>Path</code> to determine the pattern for storing the artifact.
     */

    public String getNamespaceType() {
        return this.namespaceType;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The value to use for the namespace. Used with
     * <code>Name</code> and <code>Path</code> to determine the pattern for storing the artifact.
     * </p>
     * 
     * @param namespaceType
     *        Only used when <code>Type</code> is <code>S3</code>. The value to use for the namespace. Used with
     *        <code>Name</code> and <code>Path</code> to determine the pattern for storing the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectArtifactsDetails withNamespaceType(String namespaceType) {
        setNamespaceType(namespaceType);
        return this;
    }

    /**
     * <p>
     * Whether the name specified in the buildspec file overrides the artifact name.
     * </p>
     * 
     * @param overrideArtifactName
     *        Whether the name specified in the buildspec file overrides the artifact name.
     */

    public void setOverrideArtifactName(Boolean overrideArtifactName) {
        this.overrideArtifactName = overrideArtifactName;
    }

    /**
     * <p>
     * Whether the name specified in the buildspec file overrides the artifact name.
     * </p>
     * 
     * @return Whether the name specified in the buildspec file overrides the artifact name.
     */

    public Boolean getOverrideArtifactName() {
        return this.overrideArtifactName;
    }

    /**
     * <p>
     * Whether the name specified in the buildspec file overrides the artifact name.
     * </p>
     * 
     * @param overrideArtifactName
     *        Whether the name specified in the buildspec file overrides the artifact name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectArtifactsDetails withOverrideArtifactName(Boolean overrideArtifactName) {
        setOverrideArtifactName(overrideArtifactName);
        return this;
    }

    /**
     * <p>
     * Whether the name specified in the buildspec file overrides the artifact name.
     * </p>
     * 
     * @return Whether the name specified in the buildspec file overrides the artifact name.
     */

    public Boolean isOverrideArtifactName() {
        return this.overrideArtifactName;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The type of output artifact to create.
     * </p>
     * 
     * @param packaging
     *        Only used when <code>Type</code> is <code>S3</code>. The type of output artifact to create.
     */

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The type of output artifact to create.
     * </p>
     * 
     * @return Only used when <code>Type</code> is <code>S3</code>. The type of output artifact to create.
     */

    public String getPackaging() {
        return this.packaging;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The type of output artifact to create.
     * </p>
     * 
     * @param packaging
     *        Only used when <code>Type</code> is <code>S3</code>. The type of output artifact to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectArtifactsDetails withPackaging(String packaging) {
        setPackaging(packaging);
        return this;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The path to the artifact. Used with <code>Name</code> and
     * <code>NamespaceType</code> to determine the pattern for storing the artifact.
     * </p>
     * 
     * @param path
     *        Only used when <code>Type</code> is <code>S3</code>. The path to the artifact. Used with <code>Name</code>
     *        and <code>NamespaceType</code> to determine the pattern for storing the artifact.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The path to the artifact. Used with <code>Name</code> and
     * <code>NamespaceType</code> to determine the pattern for storing the artifact.
     * </p>
     * 
     * @return Only used when <code>Type</code> is <code>S3</code>. The path to the artifact. Used with
     *         <code>Name</code> and <code>NamespaceType</code> to determine the pattern for storing the artifact.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * Only used when <code>Type</code> is <code>S3</code>. The path to the artifact. Used with <code>Name</code> and
     * <code>NamespaceType</code> to determine the pattern for storing the artifact.
     * </p>
     * 
     * @param path
     *        Only used when <code>Type</code> is <code>S3</code>. The path to the artifact. Used with <code>Name</code>
     *        and <code>NamespaceType</code> to determine the pattern for storing the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectArtifactsDetails withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The type of build artifact.
     * </p>
     * 
     * @param type
     *        The type of build artifact.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of build artifact.
     * </p>
     * 
     * @return The type of build artifact.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of build artifact.
     * </p>
     * 
     * @param type
     *        The type of build artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectArtifactsDetails withType(String type) {
        setType(type);
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
        if (getArtifactIdentifier() != null)
            sb.append("ArtifactIdentifier: ").append(getArtifactIdentifier()).append(",");
        if (getEncryptionDisabled() != null)
            sb.append("EncryptionDisabled: ").append(getEncryptionDisabled()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNamespaceType() != null)
            sb.append("NamespaceType: ").append(getNamespaceType()).append(",");
        if (getOverrideArtifactName() != null)
            sb.append("OverrideArtifactName: ").append(getOverrideArtifactName()).append(",");
        if (getPackaging() != null)
            sb.append("Packaging: ").append(getPackaging()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCodeBuildProjectArtifactsDetails == false)
            return false;
        AwsCodeBuildProjectArtifactsDetails other = (AwsCodeBuildProjectArtifactsDetails) obj;
        if (other.getArtifactIdentifier() == null ^ this.getArtifactIdentifier() == null)
            return false;
        if (other.getArtifactIdentifier() != null && other.getArtifactIdentifier().equals(this.getArtifactIdentifier()) == false)
            return false;
        if (other.getEncryptionDisabled() == null ^ this.getEncryptionDisabled() == null)
            return false;
        if (other.getEncryptionDisabled() != null && other.getEncryptionDisabled().equals(this.getEncryptionDisabled()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNamespaceType() == null ^ this.getNamespaceType() == null)
            return false;
        if (other.getNamespaceType() != null && other.getNamespaceType().equals(this.getNamespaceType()) == false)
            return false;
        if (other.getOverrideArtifactName() == null ^ this.getOverrideArtifactName() == null)
            return false;
        if (other.getOverrideArtifactName() != null && other.getOverrideArtifactName().equals(this.getOverrideArtifactName()) == false)
            return false;
        if (other.getPackaging() == null ^ this.getPackaging() == null)
            return false;
        if (other.getPackaging() != null && other.getPackaging().equals(this.getPackaging()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArtifactIdentifier() == null) ? 0 : getArtifactIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEncryptionDisabled() == null) ? 0 : getEncryptionDisabled().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNamespaceType() == null) ? 0 : getNamespaceType().hashCode());
        hashCode = prime * hashCode + ((getOverrideArtifactName() == null) ? 0 : getOverrideArtifactName().hashCode());
        hashCode = prime * hashCode + ((getPackaging() == null) ? 0 : getPackaging().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsCodeBuildProjectArtifactsDetails clone() {
        try {
            return (AwsCodeBuildProjectArtifactsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCodeBuildProjectArtifactsDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
