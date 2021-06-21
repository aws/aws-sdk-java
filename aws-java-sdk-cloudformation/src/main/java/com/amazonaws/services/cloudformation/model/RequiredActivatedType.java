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
 * For extensions that are modules, a public third-party extension that must be activated in your account in order for
 * the module itself to be activated.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/modules.html#module-enabling">Activating public
 * modules for use in your account</a> in the <i>AWS CloudFormation User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RequiredActivatedType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequiredActivatedType implements Serializable, Cloneable {

    /**
     * <p>
     * An alias assigned to the public extension, in this account and region. If you specify an alias for the extension,
     * CloudFormation treats the alias as the extension type name within this account and region. You must use the alias
     * to refer to the extension in your templates, API calls, and CloudFormation console.
     * </p>
     */
    private String typeNameAlias;
    /**
     * <p>
     * The type name of the public extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     * CloudFormation treats that alias as the extension's type name within the account and region, not the type name of
     * the public extension. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     * >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     */
    private String originalTypeName;
    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     */
    private String publisherId;
    /**
     * <p>
     * A list of the major versions of the extension type that the macro supports.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Integer> supportedMajorVersions;

    /**
     * <p>
     * An alias assigned to the public extension, in this account and region. If you specify an alias for the extension,
     * CloudFormation treats the alias as the extension type name within this account and region. You must use the alias
     * to refer to the extension in your templates, API calls, and CloudFormation console.
     * </p>
     * 
     * @param typeNameAlias
     *        An alias assigned to the public extension, in this account and region. If you specify an alias for the
     *        extension, CloudFormation treats the alias as the extension type name within this account and region. You
     *        must use the alias to refer to the extension in your templates, API calls, and CloudFormation console.
     */

    public void setTypeNameAlias(String typeNameAlias) {
        this.typeNameAlias = typeNameAlias;
    }

    /**
     * <p>
     * An alias assigned to the public extension, in this account and region. If you specify an alias for the extension,
     * CloudFormation treats the alias as the extension type name within this account and region. You must use the alias
     * to refer to the extension in your templates, API calls, and CloudFormation console.
     * </p>
     * 
     * @return An alias assigned to the public extension, in this account and region. If you specify an alias for the
     *         extension, CloudFormation treats the alias as the extension type name within this account and region. You
     *         must use the alias to refer to the extension in your templates, API calls, and CloudFormation console.
     */

    public String getTypeNameAlias() {
        return this.typeNameAlias;
    }

    /**
     * <p>
     * An alias assigned to the public extension, in this account and region. If you specify an alias for the extension,
     * CloudFormation treats the alias as the extension type name within this account and region. You must use the alias
     * to refer to the extension in your templates, API calls, and CloudFormation console.
     * </p>
     * 
     * @param typeNameAlias
     *        An alias assigned to the public extension, in this account and region. If you specify an alias for the
     *        extension, CloudFormation treats the alias as the extension type name within this account and region. You
     *        must use the alias to refer to the extension in your templates, API calls, and CloudFormation console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequiredActivatedType withTypeNameAlias(String typeNameAlias) {
        setTypeNameAlias(typeNameAlias);
        return this;
    }

    /**
     * <p>
     * The type name of the public extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     * CloudFormation treats that alias as the extension's type name within the account and region, not the type name of
     * the public extension. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     * >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param originalTypeName
     *        The type name of the public extension.</p>
     *        <p>
     *        If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     *        CloudFormation treats that alias as the extension's type name within the account and region, not the type
     *        name of the public extension. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     *        >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     */

    public void setOriginalTypeName(String originalTypeName) {
        this.originalTypeName = originalTypeName;
    }

    /**
     * <p>
     * The type name of the public extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     * CloudFormation treats that alias as the extension's type name within the account and region, not the type name of
     * the public extension. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     * >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @return The type name of the public extension.</p>
     *         <p>
     *         If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     *         CloudFormation treats that alias as the extension's type name within the account and region, not the type
     *         name of the public extension. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     *         >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     */

    public String getOriginalTypeName() {
        return this.originalTypeName;
    }

    /**
     * <p>
     * The type name of the public extension.
     * </p>
     * <p>
     * If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     * CloudFormation treats that alias as the extension's type name within the account and region, not the type name of
     * the public extension. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     * >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     * </p>
     * 
     * @param originalTypeName
     *        The type name of the public extension.</p>
     *        <p>
     *        If you specified a <code>TypeNameAlias</code> when enabling the extension in this account and region,
     *        CloudFormation treats that alias as the extension's type name within the account and region, not the type
     *        name of the public extension. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-public.html#registry-public-enable-alias"
     *        >Specifying aliases to refer to extensions</a> in the <i>CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequiredActivatedType withOriginalTypeName(String originalTypeName) {
        setOriginalTypeName(originalTypeName);
        return this;
    }

    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * 
     * @param publisherId
     *        The publisher ID of the extension publisher.
     */

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * 
     * @return The publisher ID of the extension publisher.
     */

    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * <p>
     * The publisher ID of the extension publisher.
     * </p>
     * 
     * @param publisherId
     *        The publisher ID of the extension publisher.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequiredActivatedType withPublisherId(String publisherId) {
        setPublisherId(publisherId);
        return this;
    }

    /**
     * <p>
     * A list of the major versions of the extension type that the macro supports.
     * </p>
     * 
     * @return A list of the major versions of the extension type that the macro supports.
     */

    public java.util.List<Integer> getSupportedMajorVersions() {
        if (supportedMajorVersions == null) {
            supportedMajorVersions = new com.amazonaws.internal.SdkInternalList<Integer>();
        }
        return supportedMajorVersions;
    }

    /**
     * <p>
     * A list of the major versions of the extension type that the macro supports.
     * </p>
     * 
     * @param supportedMajorVersions
     *        A list of the major versions of the extension type that the macro supports.
     */

    public void setSupportedMajorVersions(java.util.Collection<Integer> supportedMajorVersions) {
        if (supportedMajorVersions == null) {
            this.supportedMajorVersions = null;
            return;
        }

        this.supportedMajorVersions = new com.amazonaws.internal.SdkInternalList<Integer>(supportedMajorVersions);
    }

    /**
     * <p>
     * A list of the major versions of the extension type that the macro supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedMajorVersions(java.util.Collection)} or
     * {@link #withSupportedMajorVersions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedMajorVersions
     *        A list of the major versions of the extension type that the macro supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequiredActivatedType withSupportedMajorVersions(Integer... supportedMajorVersions) {
        if (this.supportedMajorVersions == null) {
            setSupportedMajorVersions(new com.amazonaws.internal.SdkInternalList<Integer>(supportedMajorVersions.length));
        }
        for (Integer ele : supportedMajorVersions) {
            this.supportedMajorVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the major versions of the extension type that the macro supports.
     * </p>
     * 
     * @param supportedMajorVersions
     *        A list of the major versions of the extension type that the macro supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequiredActivatedType withSupportedMajorVersions(java.util.Collection<Integer> supportedMajorVersions) {
        setSupportedMajorVersions(supportedMajorVersions);
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
        if (getTypeNameAlias() != null)
            sb.append("TypeNameAlias: ").append(getTypeNameAlias()).append(",");
        if (getOriginalTypeName() != null)
            sb.append("OriginalTypeName: ").append(getOriginalTypeName()).append(",");
        if (getPublisherId() != null)
            sb.append("PublisherId: ").append(getPublisherId()).append(",");
        if (getSupportedMajorVersions() != null)
            sb.append("SupportedMajorVersions: ").append(getSupportedMajorVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequiredActivatedType == false)
            return false;
        RequiredActivatedType other = (RequiredActivatedType) obj;
        if (other.getTypeNameAlias() == null ^ this.getTypeNameAlias() == null)
            return false;
        if (other.getTypeNameAlias() != null && other.getTypeNameAlias().equals(this.getTypeNameAlias()) == false)
            return false;
        if (other.getOriginalTypeName() == null ^ this.getOriginalTypeName() == null)
            return false;
        if (other.getOriginalTypeName() != null && other.getOriginalTypeName().equals(this.getOriginalTypeName()) == false)
            return false;
        if (other.getPublisherId() == null ^ this.getPublisherId() == null)
            return false;
        if (other.getPublisherId() != null && other.getPublisherId().equals(this.getPublisherId()) == false)
            return false;
        if (other.getSupportedMajorVersions() == null ^ this.getSupportedMajorVersions() == null)
            return false;
        if (other.getSupportedMajorVersions() != null && other.getSupportedMajorVersions().equals(this.getSupportedMajorVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeNameAlias() == null) ? 0 : getTypeNameAlias().hashCode());
        hashCode = prime * hashCode + ((getOriginalTypeName() == null) ? 0 : getOriginalTypeName().hashCode());
        hashCode = prime * hashCode + ((getPublisherId() == null) ? 0 : getPublisherId().hashCode());
        hashCode = prime * hashCode + ((getSupportedMajorVersions() == null) ? 0 : getSupportedMajorVersions().hashCode());
        return hashCode;
    }

    @Override
    public RequiredActivatedType clone() {
        try {
            return (RequiredActivatedType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
