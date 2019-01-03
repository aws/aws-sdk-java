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
 * The ParameterDeclaration data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ParameterDeclaration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterDeclaration implements Serializable, Cloneable {

    /**
     * <p>
     * The name that is associated with the parameter.
     * </p>
     */
    private String parameterKey;
    /**
     * <p>
     * The default value of the parameter.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The type of parameter.
     * </p>
     */
    private String parameterType;
    /**
     * <p>
     * Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management Console.
     * </p>
     */
    private Boolean noEcho;
    /**
     * <p>
     * The description that is associate with the parameter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The criteria that AWS CloudFormation uses to validate parameter values.
     * </p>
     */
    private ParameterConstraints parameterConstraints;

    /**
     * <p>
     * The name that is associated with the parameter.
     * </p>
     * 
     * @param parameterKey
     *        The name that is associated with the parameter.
     */

    public void setParameterKey(String parameterKey) {
        this.parameterKey = parameterKey;
    }

    /**
     * <p>
     * The name that is associated with the parameter.
     * </p>
     * 
     * @return The name that is associated with the parameter.
     */

    public String getParameterKey() {
        return this.parameterKey;
    }

    /**
     * <p>
     * The name that is associated with the parameter.
     * </p>
     * 
     * @param parameterKey
     *        The name that is associated with the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDeclaration withParameterKey(String parameterKey) {
        setParameterKey(parameterKey);
        return this;
    }

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the parameter.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     * 
     * @return The default value of the parameter.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value of the parameter.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDeclaration withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The type of parameter.
     * </p>
     * 
     * @param parameterType
     *        The type of parameter.
     */

    public void setParameterType(String parameterType) {
        this.parameterType = parameterType;
    }

    /**
     * <p>
     * The type of parameter.
     * </p>
     * 
     * @return The type of parameter.
     */

    public String getParameterType() {
        return this.parameterType;
    }

    /**
     * <p>
     * The type of parameter.
     * </p>
     * 
     * @param parameterType
     *        The type of parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDeclaration withParameterType(String parameterType) {
        setParameterType(parameterType);
        return this;
    }

    /**
     * <p>
     * Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management Console.
     * </p>
     * 
     * @param noEcho
     *        Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management
     *        Console.
     */

    public void setNoEcho(Boolean noEcho) {
        this.noEcho = noEcho;
    }

    /**
     * <p>
     * Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management Console.
     * </p>
     * 
     * @return Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management
     *         Console.
     */

    public Boolean getNoEcho() {
        return this.noEcho;
    }

    /**
     * <p>
     * Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management Console.
     * </p>
     * 
     * @param noEcho
     *        Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management
     *        Console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDeclaration withNoEcho(Boolean noEcho) {
        setNoEcho(noEcho);
        return this;
    }

    /**
     * <p>
     * Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management Console.
     * </p>
     * 
     * @return Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management
     *         Console.
     */

    public Boolean isNoEcho() {
        return this.noEcho;
    }

    /**
     * <p>
     * The description that is associate with the parameter.
     * </p>
     * 
     * @param description
     *        The description that is associate with the parameter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description that is associate with the parameter.
     * </p>
     * 
     * @return The description that is associate with the parameter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description that is associate with the parameter.
     * </p>
     * 
     * @param description
     *        The description that is associate with the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDeclaration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The criteria that AWS CloudFormation uses to validate parameter values.
     * </p>
     * 
     * @param parameterConstraints
     *        The criteria that AWS CloudFormation uses to validate parameter values.
     */

    public void setParameterConstraints(ParameterConstraints parameterConstraints) {
        this.parameterConstraints = parameterConstraints;
    }

    /**
     * <p>
     * The criteria that AWS CloudFormation uses to validate parameter values.
     * </p>
     * 
     * @return The criteria that AWS CloudFormation uses to validate parameter values.
     */

    public ParameterConstraints getParameterConstraints() {
        return this.parameterConstraints;
    }

    /**
     * <p>
     * The criteria that AWS CloudFormation uses to validate parameter values.
     * </p>
     * 
     * @param parameterConstraints
     *        The criteria that AWS CloudFormation uses to validate parameter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParameterDeclaration withParameterConstraints(ParameterConstraints parameterConstraints) {
        setParameterConstraints(parameterConstraints);
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getParameterType() != null)
            sb.append("ParameterType: ").append(getParameterType()).append(",");
        if (getNoEcho() != null)
            sb.append("NoEcho: ").append(getNoEcho()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameterConstraints() != null)
            sb.append("ParameterConstraints: ").append(getParameterConstraints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterDeclaration == false)
            return false;
        ParameterDeclaration other = (ParameterDeclaration) obj;
        if (other.getParameterKey() == null ^ this.getParameterKey() == null)
            return false;
        if (other.getParameterKey() != null && other.getParameterKey().equals(this.getParameterKey()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getParameterType() == null ^ this.getParameterType() == null)
            return false;
        if (other.getParameterType() != null && other.getParameterType().equals(this.getParameterType()) == false)
            return false;
        if (other.getNoEcho() == null ^ this.getNoEcho() == null)
            return false;
        if (other.getNoEcho() != null && other.getNoEcho().equals(this.getNoEcho()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameterConstraints() == null ^ this.getParameterConstraints() == null)
            return false;
        if (other.getParameterConstraints() != null && other.getParameterConstraints().equals(this.getParameterConstraints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParameterKey() == null) ? 0 : getParameterKey().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getParameterType() == null) ? 0 : getParameterType().hashCode());
        hashCode = prime * hashCode + ((getNoEcho() == null) ? 0 : getNoEcho().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameterConstraints() == null) ? 0 : getParameterConstraints().hashCode());
        return hashCode;
    }

    @Override
    public ParameterDeclaration clone() {
        try {
            return (ParameterDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
