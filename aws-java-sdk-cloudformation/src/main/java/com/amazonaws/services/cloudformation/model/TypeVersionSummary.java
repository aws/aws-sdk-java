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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains summary information about a specific version of a CloudFormation extension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TypeVersionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeVersionSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The kind of extension.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the extension.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The ID of a specific version of the extension. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the extension version when it is registered.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * Whether the specified extension version is set as the default version.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account, and extensions published by Amazon.
     * For public third-party extensions, whether or not they are activated in your account, CloudFormation returns
     * <code>null</code>.
     * </p>
     */
    private Boolean isDefaultVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension version.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the version was registered.
     * </p>
     */
    private java.util.Date timeCreated;
    /**
     * <p>
     * The description of the extension version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * For public extensions that have been activated for this account and region, the version of the public extension
     * to be used for CloudFormation operations in this account and region. For any extensions other than activated
     * third-arty extensions, CloudFormation returns <code>null</code>.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     */
    private String publicVersionNumber;

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @param type
     *        The kind of extension.
     * @see RegistryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @return The kind of extension.
     * @see RegistryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @param type
     *        The kind of extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public TypeVersionSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * 
     * @param type
     *        The kind of extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public TypeVersionSummary withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * 
     * @return The name of the extension.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The ID of a specific version of the extension. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the extension version when it is registered.
     * </p>
     * 
     * @param versionId
     *        The ID of a specific version of the extension. The version ID is the value at the end of the Amazon
     *        Resource Name (ARN) assigned to the extension version when it is registered.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of a specific version of the extension. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the extension version when it is registered.
     * </p>
     * 
     * @return The ID of a specific version of the extension. The version ID is the value at the end of the Amazon
     *         Resource Name (ARN) assigned to the extension version when it is registered.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID of a specific version of the extension. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the extension version when it is registered.
     * </p>
     * 
     * @param versionId
     *        The ID of a specific version of the extension. The version ID is the value at the end of the Amazon
     *        Resource Name (ARN) assigned to the extension version when it is registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * Whether the specified extension version is set as the default version.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account, and extensions published by Amazon.
     * For public third-party extensions, whether or not they are activated in your account, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @param isDefaultVersion
     *        Whether the specified extension version is set as the default version.</p>
     *        <p>
     *        This applies only to private extensions you have registered in your account, and extensions published by
     *        Amazon. For public third-party extensions, whether or not they are activated in your account,
     *        CloudFormation returns <code>null</code>.
     */

    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * Whether the specified extension version is set as the default version.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account, and extensions published by Amazon.
     * For public third-party extensions, whether or not they are activated in your account, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @return Whether the specified extension version is set as the default version.</p>
     *         <p>
     *         This applies only to private extensions you have registered in your account, and extensions published by
     *         Amazon. For public third-party extensions, whether or not they are activated in your account,
     *         CloudFormation returns <code>null</code>.
     */

    public Boolean getIsDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * Whether the specified extension version is set as the default version.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account, and extensions published by Amazon.
     * For public third-party extensions, whether or not they are activated in your account, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @param isDefaultVersion
     *        Whether the specified extension version is set as the default version.</p>
     *        <p>
     *        This applies only to private extensions you have registered in your account, and extensions published by
     *        Amazon. For public third-party extensions, whether or not they are activated in your account,
     *        CloudFormation returns <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withIsDefaultVersion(Boolean isDefaultVersion) {
        setIsDefaultVersion(isDefaultVersion);
        return this;
    }

    /**
     * <p>
     * Whether the specified extension version is set as the default version.
     * </p>
     * <p>
     * This applies only to private extensions you have registered in your account, and extensions published by Amazon.
     * For public third-party extensions, whether or not they are activated in your account, CloudFormation returns
     * <code>null</code>.
     * </p>
     * 
     * @return Whether the specified extension version is set as the default version.</p>
     *         <p>
     *         This applies only to private extensions you have registered in your account, and extensions published by
     *         Amazon. For public third-party extensions, whether or not they are activated in your account,
     *         CloudFormation returns <code>null</code>.
     */

    public Boolean isDefaultVersion() {
        return this.isDefaultVersion;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension version.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the extension version.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension version.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the extension version.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension version.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the extension version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the version was registered.
     * </p>
     * 
     * @param timeCreated
     *        When the version was registered.
     */

    public void setTimeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
    }

    /**
     * <p>
     * When the version was registered.
     * </p>
     * 
     * @return When the version was registered.
     */

    public java.util.Date getTimeCreated() {
        return this.timeCreated;
    }

    /**
     * <p>
     * When the version was registered.
     * </p>
     * 
     * @param timeCreated
     *        When the version was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withTimeCreated(java.util.Date timeCreated) {
        setTimeCreated(timeCreated);
        return this;
    }

    /**
     * <p>
     * The description of the extension version.
     * </p>
     * 
     * @param description
     *        The description of the extension version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the extension version.
     * </p>
     * 
     * @return The description of the extension version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the extension version.
     * </p>
     * 
     * @param description
     *        The description of the extension version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the version of the public extension
     * to be used for CloudFormation operations in this account and region. For any extensions other than activated
     * third-arty extensions, CloudFormation returns <code>null</code>.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @param publicVersionNumber
     *        For public extensions that have been activated for this account and region, the version of the public
     *        extension to be used for CloudFormation operations in this account and region. For any extensions other
     *        than activated third-arty extensions, CloudFormation returns <code>null</code>.</p>
     *        <p>
     *        How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     *        automatically updates the extention in this account and region when a new version is released. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     *        >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     *        Guide</i>.
     */

    public void setPublicVersionNumber(String publicVersionNumber) {
        this.publicVersionNumber = publicVersionNumber;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the version of the public extension
     * to be used for CloudFormation operations in this account and region. For any extensions other than activated
     * third-arty extensions, CloudFormation returns <code>null</code>.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @return For public extensions that have been activated for this account and region, the version of the public
     *         extension to be used for CloudFormation operations in this account and region. For any extensions other
     *         than activated third-arty extensions, CloudFormation returns <code>null</code>.</p>
     *         <p>
     *         How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     *         automatically updates the extention in this account and region when a new version is released. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     *         >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     *         Guide</i>.
     */

    public String getPublicVersionNumber() {
        return this.publicVersionNumber;
    }

    /**
     * <p>
     * For public extensions that have been activated for this account and region, the version of the public extension
     * to be used for CloudFormation operations in this account and region. For any extensions other than activated
     * third-arty extensions, CloudFormation returns <code>null</code>.
     * </p>
     * <p>
     * How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     * automatically updates the extention in this account and region when a new version is released. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     * >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     * Guide</i>.
     * </p>
     * 
     * @param publicVersionNumber
     *        For public extensions that have been activated for this account and region, the version of the public
     *        extension to be used for CloudFormation operations in this account and region. For any extensions other
     *        than activated third-arty extensions, CloudFormation returns <code>null</code>.</p>
     *        <p>
     *        How you specified <code>AutoUpdate</code> when enabling the extension affects whether CloudFormation
     *        automatically updates the extention in this account and region when a new version is released. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-auto"
     *        >Setting CloudFormation to automatically use new versions of extensions</a> in the <i>CloudFormation User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeVersionSummary withPublicVersionNumber(String publicVersionNumber) {
        setPublicVersionNumber(publicVersionNumber);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getIsDefaultVersion() != null)
            sb.append("IsDefaultVersion: ").append(getIsDefaultVersion()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getTimeCreated() != null)
            sb.append("TimeCreated: ").append(getTimeCreated()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPublicVersionNumber() != null)
            sb.append("PublicVersionNumber: ").append(getPublicVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypeVersionSummary == false)
            return false;
        TypeVersionSummary other = (TypeVersionSummary) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getTimeCreated() == null ^ this.getTimeCreated() == null)
            return false;
        if (other.getTimeCreated() != null && other.getTimeCreated().equals(this.getTimeCreated()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPublicVersionNumber() == null ^ this.getPublicVersionNumber() == null)
            return false;
        if (other.getPublicVersionNumber() != null && other.getPublicVersionNumber().equals(this.getPublicVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getTimeCreated() == null) ? 0 : getTimeCreated().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPublicVersionNumber() == null) ? 0 : getPublicVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public TypeVersionSummary clone() {
        try {
            return (TypeVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
