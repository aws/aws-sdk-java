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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The Parameter data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/Parameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Parameter implements Serializable, Cloneable {

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS
     * CloudFormation uses the default value that is specified in your template.
     * </p>
     */
    private String parameterKey;
    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     */
    private String parameterValue;
    /**
     * <p>
     * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you
     * specify <code>true</code>, do not specify a parameter value.
     * </p>
     */
    private Boolean usePreviousValue;
    /**
     * <p>
     * Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     * > <code>SSM</code> parameter types</a> in the template.
     * </p>
     */
    private String resolvedValue;

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS
     * CloudFormation uses the default value that is specified in your template.
     * </p>
     * 
     * @param parameterKey
     *        The key associated with the parameter. If you don't specify a key and value for a particular parameter,
     *        AWS CloudFormation uses the default value that is specified in your template.
     */

    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS
     * CloudFormation uses the default value that is specified in your template.
     * </p>
     * 
     * @return The key associated with the parameter. If you don't specify a key and value for a particular parameter,
     *         AWS CloudFormation uses the default value that is specified in your template.
     */

    public String getParameterKey() {
        return this.parameterKey;
    }

    /**
     * <p>
     * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS
     * CloudFormation uses the default value that is specified in your template.
     * </p>
     * 
     * @param parameterKey
     *        The key associated with the parameter. If you don't specify a key and value for a particular parameter,
     *        AWS CloudFormation uses the default value that is specified in your template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withParameterKey(String parameterKey) {
        setParameterKey(parameterKey);
        return this;
    }

    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     * 
     * @param parameterValue
     *        The input value associated with the parameter.
     */

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }

    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     * 
     * @return The input value associated with the parameter.
     */

    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * <p>
     * The input value associated with the parameter.
     * </p>
     * 
     * @param parameterValue
     *        The input value associated with the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withParameterValue(String parameterValue) {
        setParameterValue(parameterValue);
        return this;
    }

    /**
     * <p>
     * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you
     * specify <code>true</code>, do not specify a parameter value.
     * </p>
     * 
     * @param usePreviousValue
     *        During a stack update, use the existing parameter value that the stack is using for a given parameter key.
     *        If you specify <code>true</code>, do not specify a parameter value.
     */

    public void setUsePreviousValue(Boolean usePreviousValue) {
        this.usePreviousValue = usePreviousValue;
    }

    /**
     * <p>
     * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you
     * specify <code>true</code>, do not specify a parameter value.
     * </p>
     * 
     * @return During a stack update, use the existing parameter value that the stack is using for a given parameter
     *         key. If you specify <code>true</code>, do not specify a parameter value.
     */

    public Boolean getUsePreviousValue() {
        return this.usePreviousValue;
    }

    /**
     * <p>
     * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you
     * specify <code>true</code>, do not specify a parameter value.
     * </p>
     * 
     * @param usePreviousValue
     *        During a stack update, use the existing parameter value that the stack is using for a given parameter key.
     *        If you specify <code>true</code>, do not specify a parameter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withUsePreviousValue(Boolean usePreviousValue) {
        setUsePreviousValue(usePreviousValue);
        return this;
    }

    /**
     * <p>
     * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you
     * specify <code>true</code>, do not specify a parameter value.
     * </p>
     * 
     * @return During a stack update, use the existing parameter value that the stack is using for a given parameter
     *         key. If you specify <code>true</code>, do not specify a parameter value.
     */

    public Boolean isUsePreviousValue() {
        return this.usePreviousValue;
    }

    /**
     * <p>
     * Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     * > <code>SSM</code> parameter types</a> in the template.
     * </p>
     * 
     * @param resolvedValue
     *        Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     *        > <code>SSM</code> parameter types</a> in the template.
     */

    public void setResolvedValue(String resolvedValue) {
        this.resolvedValue = resolvedValue;
    }

    /**
     * <p>
     * Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     * > <code>SSM</code> parameter types</a> in the template.
     * </p>
     * 
     * @return Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for
     *         <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     *         > <code>SSM</code> parameter types</a> in the template.
     */

    public String getResolvedValue() {
        return this.resolvedValue;
    }

    /**
     * <p>
     * Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for <a
     * href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     * > <code>SSM</code> parameter types</a> in the template.
     * </p>
     * 
     * @param resolvedValue
     *        Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for
     *        <a href=
     *        "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/parameters-section-structure.html#aws-ssm-parameter-types"
     *        > <code>SSM</code> parameter types</a> in the template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameter withResolvedValue(String resolvedValue) {
        setResolvedValue(resolvedValue);
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
        if (getParameterKey() != null)
            sb.append("ParameterKey: ").append(getParameterKey()).append(",");
        if (getParameterValue() != null)
            sb.append("ParameterValue: ").append(getParameterValue()).append(",");
        if (getUsePreviousValue() != null)
            sb.append("UsePreviousValue: ").append(getUsePreviousValue()).append(",");
        if (getResolvedValue() != null)
            sb.append("ResolvedValue: ").append(getResolvedValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameter == false)
            return false;
        Parameter other = (Parameter) obj;
        if (other.getParameterKey() == null ^ this.getParameterKey() == null)
            return false;
        if (other.getParameterKey() != null && other.getParameterKey().equals(this.getParameterKey()) == false)
            return false;
        if (other.getParameterValue() == null ^ this.getParameterValue() == null)
            return false;
        if (other.getParameterValue() != null && other.getParameterValue().equals(this.getParameterValue()) == false)
            return false;
        if (other.getUsePreviousValue() == null ^ this.getUsePreviousValue() == null)
            return false;
        if (other.getUsePreviousValue() != null && other.getUsePreviousValue().equals(this.getUsePreviousValue()) == false)
            return false;
        if (other.getResolvedValue() == null ^ this.getResolvedValue() == null)
            return false;
        if (other.getResolvedValue() != null && other.getResolvedValue().equals(this.getResolvedValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode());
        hashCode = prime * hashCode + ((getParameterValue() == null) ? 0 : getParameterValue().hashCode());
        hashCode = prime * hashCode + ((getUsePreviousValue() == null) ? 0 : getUsePreviousValue().hashCode());
        hashCode = prime * hashCode + ((getResolvedValue() == null) ? 0 : getResolvedValue().hashCode());
        return hashCode;
    }

    @Override
    public Parameter clone() {
        try {
            return (Parameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
