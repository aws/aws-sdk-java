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
 * Identifying information for the configuration of a CloudFormation extension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TypeConfigurationIdentifier"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeConfigurationIdentifier implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the extension, in this account and region.
     * </p>
     * <p>
     * For public extensions, this will be the ARN assigned when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate the
     * type</a> in this account and region. For private extensions, this will be the ARN assigned when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">register the
     * type</a> in this account and region.
     * </p>
     */
    private String typeArn;
    /**
     * <p>
     * The alias specified for this configuration, if one was specified when the configuration was set.
     * </p>
     */
    private String typeConfigurationAlias;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration, in this account and region.
     * </p>
     */
    private String typeConfigurationArn;
    /**
     * <p>
     * The type of extension.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the extension type to which this configuration applies.
     * </p>
     */
    private String typeName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the extension, in this account and region.
     * </p>
     * <p>
     * For public extensions, this will be the ARN assigned when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate the
     * type</a> in this account and region. For private extensions, this will be the ARN assigned when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">register the
     * type</a> in this account and region.
     * </p>
     * 
     * @param typeArn
     *        The Amazon Resource Name (ARN) for the extension, in this account and region.</p>
     *        <p>
     *        For public extensions, this will be the ARN assigned when you <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate
     *        the type</a> in this account and region. For private extensions, this will be the ARN assigned when you <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">register
     *        the type</a> in this account and region.
     */

    public void setTypeArn(String typeArn) {
        this.typeArn = typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the extension, in this account and region.
     * </p>
     * <p>
     * For public extensions, this will be the ARN assigned when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate the
     * type</a> in this account and region. For private extensions, this will be the ARN assigned when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">register the
     * type</a> in this account and region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the extension, in this account and region.</p>
     *         <p>
     *         For public extensions, this will be the ARN assigned when you <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate
     *         the type</a> in this account and region. For private extensions, this will be the ARN assigned when you
     *         <a
     *         href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">register
     *         the type</a> in this account and region.
     */

    public String getTypeArn() {
        return this.typeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the extension, in this account and region.
     * </p>
     * <p>
     * For public extensions, this will be the ARN assigned when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate the
     * type</a> in this account and region. For private extensions, this will be the ARN assigned when you <a
     * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">register the
     * type</a> in this account and region.
     * </p>
     * 
     * @param typeArn
     *        The Amazon Resource Name (ARN) for the extension, in this account and region.</p>
     *        <p>
     *        For public extensions, this will be the ARN assigned when you <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_ActivateType.html">activate
     *        the type</a> in this account and region. For private extensions, this will be the ARN assigned when you <a
     *        href="https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_RegisterType.html">register
     *        the type</a> in this account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeConfigurationIdentifier withTypeArn(String typeArn) {
        setTypeArn(typeArn);
        return this;
    }

    /**
     * <p>
     * The alias specified for this configuration, if one was specified when the configuration was set.
     * </p>
     * 
     * @param typeConfigurationAlias
     *        The alias specified for this configuration, if one was specified when the configuration was set.
     */

    public void setTypeConfigurationAlias(String typeConfigurationAlias) {
        this.typeConfigurationAlias = typeConfigurationAlias;
    }

    /**
     * <p>
     * The alias specified for this configuration, if one was specified when the configuration was set.
     * </p>
     * 
     * @return The alias specified for this configuration, if one was specified when the configuration was set.
     */

    public String getTypeConfigurationAlias() {
        return this.typeConfigurationAlias;
    }

    /**
     * <p>
     * The alias specified for this configuration, if one was specified when the configuration was set.
     * </p>
     * 
     * @param typeConfigurationAlias
     *        The alias specified for this configuration, if one was specified when the configuration was set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeConfigurationIdentifier withTypeConfigurationAlias(String typeConfigurationAlias) {
        setTypeConfigurationAlias(typeConfigurationAlias);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration, in this account and region.
     * </p>
     * 
     * @param typeConfigurationArn
     *        The Amazon Resource Name (ARN) for the configuration, in this account and region.
     */

    public void setTypeConfigurationArn(String typeConfigurationArn) {
        this.typeConfigurationArn = typeConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration, in this account and region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the configuration, in this account and region.
     */

    public String getTypeConfigurationArn() {
        return this.typeConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration, in this account and region.
     * </p>
     * 
     * @param typeConfigurationArn
     *        The Amazon Resource Name (ARN) for the configuration, in this account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeConfigurationIdentifier withTypeConfigurationArn(String typeConfigurationArn) {
        setTypeConfigurationArn(typeConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The type of extension.
     * </p>
     * 
     * @param type
     *        The type of extension.
     * @see ThirdPartyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of extension.
     * </p>
     * 
     * @return The type of extension.
     * @see ThirdPartyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of extension.
     * </p>
     * 
     * @param type
     *        The type of extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyType
     */

    public TypeConfigurationIdentifier withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of extension.
     * </p>
     * 
     * @param type
     *        The type of extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyType
     */

    public TypeConfigurationIdentifier withType(ThirdPartyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the extension type to which this configuration applies.
     * </p>
     * 
     * @param typeName
     *        The name of the extension type to which this configuration applies.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the extension type to which this configuration applies.
     * </p>
     * 
     * @return The name of the extension type to which this configuration applies.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the extension type to which this configuration applies.
     * </p>
     * 
     * @param typeName
     *        The name of the extension type to which this configuration applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeConfigurationIdentifier withTypeName(String typeName) {
        setTypeName(typeName);
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
        if (getTypeArn() != null)
            sb.append("TypeArn: ").append(getTypeArn()).append(",");
        if (getTypeConfigurationAlias() != null)
            sb.append("TypeConfigurationAlias: ").append(getTypeConfigurationAlias()).append(",");
        if (getTypeConfigurationArn() != null)
            sb.append("TypeConfigurationArn: ").append(getTypeConfigurationArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypeConfigurationIdentifier == false)
            return false;
        TypeConfigurationIdentifier other = (TypeConfigurationIdentifier) obj;
        if (other.getTypeArn() == null ^ this.getTypeArn() == null)
            return false;
        if (other.getTypeArn() != null && other.getTypeArn().equals(this.getTypeArn()) == false)
            return false;
        if (other.getTypeConfigurationAlias() == null ^ this.getTypeConfigurationAlias() == null)
            return false;
        if (other.getTypeConfigurationAlias() != null && other.getTypeConfigurationAlias().equals(this.getTypeConfigurationAlias()) == false)
            return false;
        if (other.getTypeConfigurationArn() == null ^ this.getTypeConfigurationArn() == null)
            return false;
        if (other.getTypeConfigurationArn() != null && other.getTypeConfigurationArn().equals(this.getTypeConfigurationArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeArn() == null) ? 0 : getTypeArn().hashCode());
        hashCode = prime * hashCode + ((getTypeConfigurationAlias() == null) ? 0 : getTypeConfigurationAlias().hashCode());
        hashCode = prime * hashCode + ((getTypeConfigurationArn() == null) ? 0 : getTypeConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        return hashCode;
    }

    @Override
    public TypeConfigurationIdentifier clone() {
        try {
            return (TypeConfigurationIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
