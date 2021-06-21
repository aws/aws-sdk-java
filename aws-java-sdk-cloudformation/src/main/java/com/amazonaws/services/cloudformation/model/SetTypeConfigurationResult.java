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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/SetTypeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetTypeConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     */
    private String configurationArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     * 
     * @param configurationArn
     *        The Amazon Resource Name (ARN) for the configuration data, in this account and region.</p>
     *        <p>
     *        Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and
     *        <code>TypeName</code>.
     */

    public void setConfigurationArn(String configurationArn) {
        this.configurationArn = configurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the configuration data, in this account and region.</p>
     *         <p>
     *         Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and
     *         <code>TypeName</code>.
     */

    public String getConfigurationArn() {
        return this.configurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the configuration data, in this account and region.
     * </p>
     * <p>
     * Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and <code>TypeName</code>.
     * </p>
     * 
     * @param configurationArn
     *        The Amazon Resource Name (ARN) for the configuration data, in this account and region.</p>
     *        <p>
     *        Conditional: You must specify <code>ConfigurationArn</code>, or <code>Type</code> and
     *        <code>TypeName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTypeConfigurationResult withConfigurationArn(String configurationArn) {
        setConfigurationArn(configurationArn);
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
        if (getConfigurationArn() != null)
            sb.append("ConfigurationArn: ").append(getConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetTypeConfigurationResult == false)
            return false;
        SetTypeConfigurationResult other = (SetTypeConfigurationResult) obj;
        if (other.getConfigurationArn() == null ^ this.getConfigurationArn() == null)
            return false;
        if (other.getConfigurationArn() != null && other.getConfigurationArn().equals(this.getConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationArn() == null) ? 0 : getConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public SetTypeConfigurationResult clone() {
        try {
            return (SetTypeConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
