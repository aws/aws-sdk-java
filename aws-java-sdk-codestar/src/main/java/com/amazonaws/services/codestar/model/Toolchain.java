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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The toolchain template file provided with the project request. AWS CodeStar uses the template to provision the
 * toolchain stack in AWS CloudFormation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/Toolchain" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Toolchain implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS
     * CodeStar retrieves the file during project creation.
     * </p>
     */
    private ToolchainSource source;
    /**
     * <p>
     * The service role ARN for AWS CodeStar to use for the toolchain template during stack provisioning.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The list of parameter overrides to be passed into the toolchain template during stack provisioning, if any.
     * </p>
     */
    private java.util.Map<String, String> stackParameters;

    /**
     * <p>
     * The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS
     * CodeStar retrieves the file during project creation.
     * </p>
     * 
     * @param source
     *        The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS
     *        CodeStar retrieves the file during project creation.
     */

    public void setSource(ToolchainSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS
     * CodeStar retrieves the file during project creation.
     * </p>
     * 
     * @return The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS
     *         CodeStar retrieves the file during project creation.
     */

    public ToolchainSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS
     * CodeStar retrieves the file during project creation.
     * </p>
     * 
     * @param source
     *        The Amazon S3 location where the toolchain template file provided with the project request is stored. AWS
     *        CodeStar retrieves the file during project creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Toolchain withSource(ToolchainSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The service role ARN for AWS CodeStar to use for the toolchain template during stack provisioning.
     * </p>
     * 
     * @param roleArn
     *        The service role ARN for AWS CodeStar to use for the toolchain template during stack provisioning.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The service role ARN for AWS CodeStar to use for the toolchain template during stack provisioning.
     * </p>
     * 
     * @return The service role ARN for AWS CodeStar to use for the toolchain template during stack provisioning.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The service role ARN for AWS CodeStar to use for the toolchain template during stack provisioning.
     * </p>
     * 
     * @param roleArn
     *        The service role ARN for AWS CodeStar to use for the toolchain template during stack provisioning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Toolchain withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The list of parameter overrides to be passed into the toolchain template during stack provisioning, if any.
     * </p>
     * 
     * @return The list of parameter overrides to be passed into the toolchain template during stack provisioning, if
     *         any.
     */

    public java.util.Map<String, String> getStackParameters() {
        return stackParameters;
    }

    /**
     * <p>
     * The list of parameter overrides to be passed into the toolchain template during stack provisioning, if any.
     * </p>
     * 
     * @param stackParameters
     *        The list of parameter overrides to be passed into the toolchain template during stack provisioning, if
     *        any.
     */

    public void setStackParameters(java.util.Map<String, String> stackParameters) {
        this.stackParameters = stackParameters;
    }

    /**
     * <p>
     * The list of parameter overrides to be passed into the toolchain template during stack provisioning, if any.
     * </p>
     * 
     * @param stackParameters
     *        The list of parameter overrides to be passed into the toolchain template during stack provisioning, if
     *        any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Toolchain withStackParameters(java.util.Map<String, String> stackParameters) {
        setStackParameters(stackParameters);
        return this;
    }

    public Toolchain addStackParametersEntry(String key, String value) {
        if (null == this.stackParameters) {
            this.stackParameters = new java.util.HashMap<String, String>();
        }
        if (this.stackParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.stackParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StackParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Toolchain clearStackParametersEntries() {
        this.stackParameters = null;
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStackParameters() != null)
            sb.append("StackParameters: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Toolchain == false)
            return false;
        Toolchain other = (Toolchain) obj;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStackParameters() == null ^ this.getStackParameters() == null)
            return false;
        if (other.getStackParameters() != null && other.getStackParameters().equals(this.getStackParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStackParameters() == null) ? 0 : getStackParameters().hashCode());
        return hashCode;
    }

    @Override
    public Toolchain clone() {
        try {
            return (Toolchain) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestar.model.transform.ToolchainMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
