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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an environment variable for a build project or a build.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/EnvironmentVariable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentVariable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name or key of the environment variable.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the environment variable.
     * </p>
     * <important>
     * <p>
     * We strongly discourage the use of environment variables to store sensitive values, especially AWS secret key IDs
     * and secret access keys. Environment variables can be displayed in plain text using the AWS CodeBuild console and
     * the AWS Command Line Interface (AWS CLI).
     * </p>
     * </important>
     */
    private String value;
    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon EC2 Systems Manager Parameter Store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plaintext format.
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The name or key of the environment variable.
     * </p>
     * 
     * @param name
     *        The name or key of the environment variable.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name or key of the environment variable.
     * </p>
     * 
     * @return The name or key of the environment variable.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name or key of the environment variable.
     * </p>
     * 
     * @param name
     *        The name or key of the environment variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVariable withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the environment variable.
     * </p>
     * <important>
     * <p>
     * We strongly discourage the use of environment variables to store sensitive values, especially AWS secret key IDs
     * and secret access keys. Environment variables can be displayed in plain text using the AWS CodeBuild console and
     * the AWS Command Line Interface (AWS CLI).
     * </p>
     * </important>
     * 
     * @param value
     *        The value of the environment variable.</p> <important>
     *        <p>
     *        We strongly discourage the use of environment variables to store sensitive values, especially AWS secret
     *        key IDs and secret access keys. Environment variables can be displayed in plain text using the AWS
     *        CodeBuild console and the AWS Command Line Interface (AWS CLI).
     *        </p>
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the environment variable.
     * </p>
     * <important>
     * <p>
     * We strongly discourage the use of environment variables to store sensitive values, especially AWS secret key IDs
     * and secret access keys. Environment variables can be displayed in plain text using the AWS CodeBuild console and
     * the AWS Command Line Interface (AWS CLI).
     * </p>
     * </important>
     * 
     * @return The value of the environment variable.</p> <important>
     *         <p>
     *         We strongly discourage the use of environment variables to store sensitive values, especially AWS secret
     *         key IDs and secret access keys. Environment variables can be displayed in plain text using the AWS
     *         CodeBuild console and the AWS Command Line Interface (AWS CLI).
     *         </p>
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the environment variable.
     * </p>
     * <important>
     * <p>
     * We strongly discourage the use of environment variables to store sensitive values, especially AWS secret key IDs
     * and secret access keys. Environment variables can be displayed in plain text using the AWS CodeBuild console and
     * the AWS Command Line Interface (AWS CLI).
     * </p>
     * </important>
     * 
     * @param value
     *        The value of the environment variable.</p> <important>
     *        <p>
     *        We strongly discourage the use of environment variables to store sensitive values, especially AWS secret
     *        key IDs and secret access keys. Environment variables can be displayed in plain text using the AWS
     *        CodeBuild console and the AWS Command Line Interface (AWS CLI).
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVariable withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon EC2 Systems Manager Parameter Store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plaintext format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of environment variable. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PARAMETER_STORE</code>: An environment variable stored in Amazon EC2 Systems Manager Parameter
     *        Store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAINTEXT</code>: An environment variable in plaintext format.
     *        </p>
     *        </li>
     * @see EnvironmentVariableType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon EC2 Systems Manager Parameter Store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plaintext format.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of environment variable. Valid values include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PARAMETER_STORE</code>: An environment variable stored in Amazon EC2 Systems Manager Parameter
     *         Store.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PLAINTEXT</code>: An environment variable in plaintext format.
     *         </p>
     *         </li>
     * @see EnvironmentVariableType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon EC2 Systems Manager Parameter Store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plaintext format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of environment variable. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PARAMETER_STORE</code>: An environment variable stored in Amazon EC2 Systems Manager Parameter
     *        Store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAINTEXT</code>: An environment variable in plaintext format.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentVariableType
     */

    public EnvironmentVariable withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of environment variable. Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PARAMETER_STORE</code>: An environment variable stored in Amazon EC2 Systems Manager Parameter Store.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PLAINTEXT</code>: An environment variable in plaintext format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of environment variable. Valid values include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PARAMETER_STORE</code>: An environment variable stored in Amazon EC2 Systems Manager Parameter
     *        Store.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PLAINTEXT</code>: An environment variable in plaintext format.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentVariableType
     */

    public EnvironmentVariable withType(EnvironmentVariableType type) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
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

        if (obj instanceof EnvironmentVariable == false)
            return false;
        EnvironmentVariable other = (EnvironmentVariable) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentVariable clone() {
        try {
            return (EnvironmentVariable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.EnvironmentVariableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
