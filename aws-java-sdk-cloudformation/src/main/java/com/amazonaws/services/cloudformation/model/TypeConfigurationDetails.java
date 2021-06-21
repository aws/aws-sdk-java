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
 * Detailed information concerning the specification of a CloudFormation extension in a given account and region.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry-register.html#registry-set-configuration"
 * >Configuring extensions at the account level</a> in the <i>CloudFormation User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TypeConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeConfigurationDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The alias specified for this configuration, if one was specified when the configuration was set.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * A JSON string specifying the configuration data for the extension, in this account and region.
     * </p>
     * <p>
     * If a configuration has not been set for a specified extension, CloudFormation returns <code>{}</code>.
     * </p>
     */
    private String configuration;
    /**
     * <p>
     * When the configuration data was last updated for this extension.
     * </p>
     * <p>
     * If a configuration has not been set for a specified extension, CloudFormation returns <code>null</code>.
     * </p>
     */
    private java.util.Date lastUpdated;
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
     * The name of the extension.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * Whether or not this configuration data is the default configuration for the extension.
     * </p>
     */
    private Boolean isDefaultConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeConfigurationDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The alias specified for this configuration, if one was specified when the configuration was set.
     * </p>
     * 
     * @param alias
     *        The alias specified for this configuration, if one was specified when the configuration was set.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias specified for this configuration, if one was specified when the configuration was set.
     * </p>
     * 
     * @return The alias specified for this configuration, if one was specified when the configuration was set.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias specified for this configuration, if one was specified when the configuration was set.
     * </p>
     * 
     * @param alias
     *        The alias specified for this configuration, if one was specified when the configuration was set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeConfigurationDetails withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * A JSON string specifying the configuration data for the extension, in this account and region.
     * </p>
     * <p>
     * If a configuration has not been set for a specified extension, CloudFormation returns <code>{}</code>.
     * </p>
     * 
     * @param configuration
     *        A JSON string specifying the configuration data for the extension, in this account and region. </p>
     *        <p>
     *        If a configuration has not been set for a specified extension, CloudFormation returns <code>{}</code>.
     */

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * A JSON string specifying the configuration data for the extension, in this account and region.
     * </p>
     * <p>
     * If a configuration has not been set for a specified extension, CloudFormation returns <code>{}</code>.
     * </p>
     * 
     * @return A JSON string specifying the configuration data for the extension, in this account and region. </p>
     *         <p>
     *         If a configuration has not been set for a specified extension, CloudFormation returns <code>{}</code>.
     */

    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * A JSON string specifying the configuration data for the extension, in this account and region.
     * </p>
     * <p>
     * If a configuration has not been set for a specified extension, CloudFormation returns <code>{}</code>.
     * </p>
     * 
     * @param configuration
     *        A JSON string specifying the configuration data for the extension, in this account and region. </p>
     *        <p>
     *        If a configuration has not been set for a specified extension, CloudFormation returns <code>{}</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeConfigurationDetails withConfiguration(String configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * When the configuration data was last updated for this extension.
     * </p>
     * <p>
     * If a configuration has not been set for a specified extension, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param lastUpdated
     *        When the configuration data was last updated for this extension.</p>
     *        <p>
     *        If a configuration has not been set for a specified extension, CloudFormation returns <code>null</code>.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * When the configuration data was last updated for this extension.
     * </p>
     * <p>
     * If a configuration has not been set for a specified extension, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @return When the configuration data was last updated for this extension.</p>
     *         <p>
     *         If a configuration has not been set for a specified extension, CloudFormation returns <code>null</code>.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * When the configuration data was last updated for this extension.
     * </p>
     * <p>
     * If a configuration has not been set for a specified extension, CloudFormation returns <code>null</code>.
     * </p>
     * 
     * @param lastUpdated
     *        When the configuration data was last updated for this extension.</p>
     *        <p>
     *        If a configuration has not been set for a specified extension, CloudFormation returns <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeConfigurationDetails withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
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

    public TypeConfigurationDetails withTypeArn(String typeArn) {
        setTypeArn(typeArn);
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

    public TypeConfigurationDetails withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * Whether or not this configuration data is the default configuration for the extension.
     * </p>
     * 
     * @param isDefaultConfiguration
     *        Whether or not this configuration data is the default configuration for the extension.
     */

    public void setIsDefaultConfiguration(Boolean isDefaultConfiguration) {
        this.isDefaultConfiguration = isDefaultConfiguration;
    }

    /**
     * <p>
     * Whether or not this configuration data is the default configuration for the extension.
     * </p>
     * 
     * @return Whether or not this configuration data is the default configuration for the extension.
     */

    public Boolean getIsDefaultConfiguration() {
        return this.isDefaultConfiguration;
    }

    /**
     * <p>
     * Whether or not this configuration data is the default configuration for the extension.
     * </p>
     * 
     * @param isDefaultConfiguration
     *        Whether or not this configuration data is the default configuration for the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeConfigurationDetails withIsDefaultConfiguration(Boolean isDefaultConfiguration) {
        setIsDefaultConfiguration(isDefaultConfiguration);
        return this;
    }

    /**
     * <p>
     * Whether or not this configuration data is the default configuration for the extension.
     * </p>
     * 
     * @return Whether or not this configuration data is the default configuration for the extension.
     */

    public Boolean isDefaultConfiguration() {
        return this.isDefaultConfiguration;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getTypeArn() != null)
            sb.append("TypeArn: ").append(getTypeArn()).append(",");
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getIsDefaultConfiguration() != null)
            sb.append("IsDefaultConfiguration: ").append(getIsDefaultConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypeConfigurationDetails == false)
            return false;
        TypeConfigurationDetails other = (TypeConfigurationDetails) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getTypeArn() == null ^ this.getTypeArn() == null)
            return false;
        if (other.getTypeArn() != null && other.getTypeArn().equals(this.getTypeArn()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getIsDefaultConfiguration() == null ^ this.getIsDefaultConfiguration() == null)
            return false;
        if (other.getIsDefaultConfiguration() != null && other.getIsDefaultConfiguration().equals(this.getIsDefaultConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getTypeArn() == null) ? 0 : getTypeArn().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getIsDefaultConfiguration() == null) ? 0 : getIsDefaultConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TypeConfigurationDetails clone() {
        try {
            return (TypeConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
