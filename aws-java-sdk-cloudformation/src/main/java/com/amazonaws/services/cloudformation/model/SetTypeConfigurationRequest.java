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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SetTypeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetTypeConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * <p>
     * Do not include the extension versions suffix at the end of the ARN. You can set the configuration for an
     * extension, but not for a specific extension version.
     * </p>
     */
    private String typeArn;
    /**
     * <p>
     * The configuration data for the extension, in this account and region.
     * </p>
     * <p>
     * The configuration data must be formatted as JSON, and validate against the schema returned in the
     * <code>ConfigurationSchema</code> response element of <a
     * href="AWSCloudFormation/latest/APIReference/API_DescribeType.html">API_DescribeType</a>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-model.html#resource-type-howto-configuration"
     * >Defining account-level configuration data for an extension</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     */
    private String configuration;
    /**
     * <p>
     * An alias by which to refer to this extension configuration data.
     * </p>
     * <p>
     * Conditional: Specifying a configuration alias is required when setting a configuration for a resource type
     * extension.
     * </p>
     */
    private String configurationAlias;
    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The type of extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     */
    private String type;

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
     * <p>
     * Do not include the extension versions suffix at the end of the ARN. You can set the configuration for an
     * extension, but not for a specific extension version.
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
     *        </p>
     *        <p>
     *        Do not include the extension versions suffix at the end of the ARN. You can set the configuration for an
     *        extension, but not for a specific extension version.
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
     * <p>
     * Do not include the extension versions suffix at the end of the ARN. You can set the configuration for an
     * extension, but not for a specific extension version.
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
     *         </p>
     *         <p>
     *         Do not include the extension versions suffix at the end of the ARN. You can set the configuration for an
     *         extension, but not for a specific extension version.
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
     * <p>
     * Do not include the extension versions suffix at the end of the ARN. You can set the configuration for an
     * extension, but not for a specific extension version.
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
     *        </p>
     *        <p>
     *        Do not include the extension versions suffix at the end of the ARN. You can set the configuration for an
     *        extension, but not for a specific extension version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTypeConfigurationRequest withTypeArn(String typeArn) {
        setTypeArn(typeArn);
        return this;
    }

    /**
     * <p>
     * The configuration data for the extension, in this account and region.
     * </p>
     * <p>
     * The configuration data must be formatted as JSON, and validate against the schema returned in the
     * <code>ConfigurationSchema</code> response element of <a
     * href="AWSCloudFormation/latest/APIReference/API_DescribeType.html">API_DescribeType</a>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-model.html#resource-type-howto-configuration"
     * >Defining account-level configuration data for an extension</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @param configuration
     *        The configuration data for the extension, in this account and region. </p>
     *        <p>
     *        The configuration data must be formatted as JSON, and validate against the schema returned in the
     *        <code>ConfigurationSchema</code> response element of <a
     *        href="AWSCloudFormation/latest/APIReference/API_DescribeType.html">API_DescribeType</a>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-model.html#resource-type-howto-configuration"
     *        >Defining account-level configuration data for an extension</a> in the <i>CloudFormation CLI User
     *        Guide</i>.
     */

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration data for the extension, in this account and region.
     * </p>
     * <p>
     * The configuration data must be formatted as JSON, and validate against the schema returned in the
     * <code>ConfigurationSchema</code> response element of <a
     * href="AWSCloudFormation/latest/APIReference/API_DescribeType.html">API_DescribeType</a>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-model.html#resource-type-howto-configuration"
     * >Defining account-level configuration data for an extension</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @return The configuration data for the extension, in this account and region. </p>
     *         <p>
     *         The configuration data must be formatted as JSON, and validate against the schema returned in the
     *         <code>ConfigurationSchema</code> response element of <a
     *         href="AWSCloudFormation/latest/APIReference/API_DescribeType.html">API_DescribeType</a>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-model.html#resource-type-howto-configuration"
     *         >Defining account-level configuration data for an extension</a> in the <i>CloudFormation CLI User
     *         Guide</i>.
     */

    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration data for the extension, in this account and region.
     * </p>
     * <p>
     * The configuration data must be formatted as JSON, and validate against the schema returned in the
     * <code>ConfigurationSchema</code> response element of <a
     * href="AWSCloudFormation/latest/APIReference/API_DescribeType.html">API_DescribeType</a>. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-model.html#resource-type-howto-configuration"
     * >Defining account-level configuration data for an extension</a> in the <i>CloudFormation CLI User Guide</i>.
     * </p>
     * 
     * @param configuration
     *        The configuration data for the extension, in this account and region. </p>
     *        <p>
     *        The configuration data must be formatted as JSON, and validate against the schema returned in the
     *        <code>ConfigurationSchema</code> response element of <a
     *        href="AWSCloudFormation/latest/APIReference/API_DescribeType.html">API_DescribeType</a>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-model.html#resource-type-howto-configuration"
     *        >Defining account-level configuration data for an extension</a> in the <i>CloudFormation CLI User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTypeConfigurationRequest withConfiguration(String configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * An alias by which to refer to this extension configuration data.
     * </p>
     * <p>
     * Conditional: Specifying a configuration alias is required when setting a configuration for a resource type
     * extension.
     * </p>
     * 
     * @param configurationAlias
     *        An alias by which to refer to this extension configuration data.</p>
     *        <p>
     *        Conditional: Specifying a configuration alias is required when setting a configuration for a resource type
     *        extension.
     */

    public void setConfigurationAlias(String configurationAlias) {
        this.configurationAlias = configurationAlias;
    }

    /**
     * <p>
     * An alias by which to refer to this extension configuration data.
     * </p>
     * <p>
     * Conditional: Specifying a configuration alias is required when setting a configuration for a resource type
     * extension.
     * </p>
     * 
     * @return An alias by which to refer to this extension configuration data.</p>
     *         <p>
     *         Conditional: Specifying a configuration alias is required when setting a configuration for a resource
     *         type extension.
     */

    public String getConfigurationAlias() {
        return this.configurationAlias;
    }

    /**
     * <p>
     * An alias by which to refer to this extension configuration data.
     * </p>
     * <p>
     * Conditional: Specifying a configuration alias is required when setting a configuration for a resource type
     * extension.
     * </p>
     * 
     * @param configurationAlias
     *        An alias by which to refer to this extension configuration data.</p>
     *        <p>
     *        Conditional: Specifying a configuration alias is required when setting a configuration for a resource type
     *        extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTypeConfigurationRequest withConfigurationAlias(String configurationAlias) {
        setConfigurationAlias(configurationAlias);
        return this;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.</p>
     *        <p>
     *        Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and
     *        <code>TypeName</code>.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     * 
     * @return The name of the extension.</p>
     *         <p>
     *         Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and
     *         <code>TypeName</code>.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the extension.</p>
     *        <p>
     *        Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and
     *        <code>TypeName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTypeConfigurationRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The type of extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     * 
     * @param type
     *        The type of extension.</p>
     *        <p>
     *        Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and
     *        <code>TypeName</code>.
     * @see ThirdPartyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     * 
     * @return The type of extension.</p>
     *         <p>
     *         Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and
     *         <code>TypeName</code>.
     * @see ThirdPartyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     * 
     * @param type
     *        The type of extension.</p>
     *        <p>
     *        Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and
     *        <code>TypeName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyType
     */

    public SetTypeConfigurationRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of extension.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     * 
     * @param type
     *        The type of extension.</p>
     *        <p>
     *        Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and
     *        <code>TypeName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThirdPartyType
     */

    public SetTypeConfigurationRequest withType(ThirdPartyType type) {
        this.type = type.toString();
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getConfigurationAlias() != null)
            sb.append("ConfigurationAlias: ").append(getConfigurationAlias()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
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

        if (obj instanceof SetTypeConfigurationRequest == false)
            return false;
        SetTypeConfigurationRequest other = (SetTypeConfigurationRequest) obj;
        if (other.getTypeArn() == null ^ this.getTypeArn() == null)
            return false;
        if (other.getTypeArn() != null && other.getTypeArn().equals(this.getTypeArn()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getConfigurationAlias() == null ^ this.getConfigurationAlias() == null)
            return false;
        if (other.getConfigurationAlias() != null && other.getConfigurationAlias().equals(this.getConfigurationAlias()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
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

        hashCode = prime * hashCode + ((getTypeArn() == null) ? 0 : getTypeArn().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getConfigurationAlias() == null) ? 0 : getConfigurationAlias().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SetTypeConfigurationRequest clone() {
        return (SetTypeConfigurationRequest) super.clone();
    }

}
