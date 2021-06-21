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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The kind of extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of a specific version of the extension. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the extension version when it is registered.
     * </p>
     * <p>
     * If you specify a <code>VersionId</code>, <code>DescribeType</code> returns information about that specific
     * extension version. Otherwise, it returns information about the default extension version.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * <p>
     * Extensions provided by Amazon are not assigned a publisher ID.
     * </p>
     */
    private String publisherId;
    /**
     * <p>
     * The version number of a public third-party extension.
     * </p>
     */
    private String publicVersionNumber;

    /**
     * <p>
     * The kind of extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param type
     *        The kind of extension. </p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @see RegistryType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @return The kind of extension. </p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @see RegistryType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param type
     *        The kind of extension. </p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public DescribeTypeRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The kind of extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param type
     *        The kind of extension. </p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistryType
     */

    public DescribeTypeRequest withType(RegistryType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @return The name of the extension.</p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the extension.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the extension.</p>
     *         <p>
     *         Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the extension.
     * </p>
     * <p>
     * Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the extension.</p>
     *        <p>
     *        Conditional: You must specify either <code>TypeName</code> and <code>Type</code>, or <code>Arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of a specific version of the extension. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the extension version when it is registered.
     * </p>
     * <p>
     * If you specify a <code>VersionId</code>, <code>DescribeType</code> returns information about that specific
     * extension version. Otherwise, it returns information about the default extension version.
     * </p>
     * 
     * @param versionId
     *        The ID of a specific version of the extension. The version ID is the value at the end of the Amazon
     *        Resource Name (ARN) assigned to the extension version when it is registered.</p>
     *        <p>
     *        If you specify a <code>VersionId</code>, <code>DescribeType</code> returns information about that specific
     *        extension version. Otherwise, it returns information about the default extension version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of a specific version of the extension. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the extension version when it is registered.
     * </p>
     * <p>
     * If you specify a <code>VersionId</code>, <code>DescribeType</code> returns information about that specific
     * extension version. Otherwise, it returns information about the default extension version.
     * </p>
     * 
     * @return The ID of a specific version of the extension. The version ID is the value at the end of the Amazon
     *         Resource Name (ARN) assigned to the extension version when it is registered.</p>
     *         <p>
     *         If you specify a <code>VersionId</code>, <code>DescribeType</code> returns information about that
     *         specific extension version. Otherwise, it returns information about the default extension version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID of a specific version of the extension. The version ID is the value at the end of the Amazon Resource Name
     * (ARN) assigned to the extension version when it is registered.
     * </p>
     * <p>
     * If you specify a <code>VersionId</code>, <code>DescribeType</code> returns information about that specific
     * extension version. Otherwise, it returns information about the default extension version.
     * </p>
     * 
     * @param versionId
     *        The ID of a specific version of the extension. The version ID is the value at the end of the Amazon
     *        Resource Name (ARN) assigned to the extension version when it is registered.</p>
     *        <p>
     *        If you specify a <code>VersionId</code>, <code>DescribeType</code> returns information about that specific
     *        extension version. Otherwise, it returns information about the default extension version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * <p>
     * Extensions provided by Amazon are not assigned a publisher ID.
     * </p>
     * 
     * @param publisherId
     *        The publisher ID of the extension publisher.</p>
     *        <p>
     *        Extensions provided by Amazon are not assigned a publisher ID.
     */

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * <p>
     * Extensions provided by Amazon are not assigned a publisher ID.
     * </p>
     * 
     * @return The publisher ID of the extension publisher.</p>
     *         <p>
     *         Extensions provided by Amazon are not assigned a publisher ID.
     */

    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * <p>
     * Extensions provided by Amazon are not assigned a publisher ID.
     * </p>
     * 
     * @param publisherId
     *        The publisher ID of the extension publisher.</p>
     *        <p>
     *        Extensions provided by Amazon are not assigned a publisher ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeRequest withPublisherId(String publisherId) {
        setPublisherId(publisherId);
        return this;
    }

    /**
     * <p>
     * The version number of a public third-party extension.
     * </p>
     * 
     * @param publicVersionNumber
     *        The version number of a public third-party extension.
     */

    public void setPublicVersionNumber(String publicVersionNumber) {
        this.publicVersionNumber = publicVersionNumber;
    }

    /**
     * <p>
     * The version number of a public third-party extension.
     * </p>
     * 
     * @return The version number of a public third-party extension.
     */

    public String getPublicVersionNumber() {
        return this.publicVersionNumber;
    }

    /**
     * <p>
     * The version number of a public third-party extension.
     * </p>
     * 
     * @param publicVersionNumber
     *        The version number of a public third-party extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTypeRequest withPublicVersionNumber(String publicVersionNumber) {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getPublisherId() != null)
            sb.append("PublisherId: ").append(getPublisherId()).append(",");
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

        if (obj instanceof DescribeTypeRequest == false)
            return false;
        DescribeTypeRequest other = (DescribeTypeRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getPublisherId() == null ^ this.getPublisherId() == null)
            return false;
        if (other.getPublisherId() != null && other.getPublisherId().equals(this.getPublisherId()) == false)
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
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getPublisherId() == null) ? 0 : getPublisherId().hashCode());
        hashCode = prime * hashCode + ((getPublicVersionNumber() == null) ? 0 : getPublicVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTypeRequest clone() {
        return (DescribeTypeRequest) super.clone();
    }

}
