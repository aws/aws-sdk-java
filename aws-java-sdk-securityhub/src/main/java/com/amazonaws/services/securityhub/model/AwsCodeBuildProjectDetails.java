/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an AWS CodeBuild project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCodeBuildProjectDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCodeBuildProjectDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK alias (using the
     * format alias/alias-name).
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     */
    private AwsCodeBuildProjectEnvironment environment;
    /**
     * <p>
     * The name of the build project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Information about the build input source code for this build project.
     * </p>
     */
    private AwsCodeBuildProjectSource source;
    /**
     * <p>
     * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS
     * account.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * Information about the VPC configuration that AWS CodeBuild accesses.
     * </p>
     */
    private AwsCodeBuildProjectVpcConfig vpcConfig;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK alias (using the
     * format alias/alias-name).
     * </p>
     * 
     * @param encryptionKey
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the build output
     *        artifacts.</p>
     *        <p>
     *        You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK alias (using
     *        the format alias/alias-name).
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK alias (using the
     * format alias/alias-name).
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the build output
     *         artifacts.</p>
     *         <p>
     *         You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK alias (using
     *         the format alias/alias-name).
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK alias (using the
     * format alias/alias-name).
     * </p>
     * 
     * @param encryptionKey
     *        The AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the build output
     *        artifacts.</p>
     *        <p>
     *        You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK alias (using
     *        the format alias/alias-name).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     * 
     * @param environment
     *        Information about the build environment for this build project.
     */

    public void setEnvironment(AwsCodeBuildProjectEnvironment environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     * 
     * @return Information about the build environment for this build project.
     */

    public AwsCodeBuildProjectEnvironment getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * Information about the build environment for this build project.
     * </p>
     * 
     * @param environment
     *        Information about the build environment for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withEnvironment(AwsCodeBuildProjectEnvironment environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * 
     * @param name
     *        The name of the build project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * 
     * @return The name of the build project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the build project.
     * </p>
     * 
     * @param name
     *        The name of the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Information about the build input source code for this build project.
     * </p>
     * 
     * @param source
     *        Information about the build input source code for this build project.
     */

    public void setSource(AwsCodeBuildProjectSource source) {
        this.source = source;
    }

    /**
     * <p>
     * Information about the build input source code for this build project.
     * </p>
     * 
     * @return Information about the build input source code for this build project.
     */

    public AwsCodeBuildProjectSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * Information about the build input source code for this build project.
     * </p>
     * 
     * @param source
     *        Information about the build input source code for this build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withSource(AwsCodeBuildProjectSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS
     * account.
     * </p>
     * 
     * @param serviceRole
     *        The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on behalf of
     *        the AWS account.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS
     * account.
     * </p>
     * 
     * @return The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on behalf of
     *         the AWS account.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS
     * account.
     * </p>
     * 
     * @param serviceRole
     *        The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on behalf of
     *        the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * Information about the VPC configuration that AWS CodeBuild accesses.
     * </p>
     * 
     * @param vpcConfig
     *        Information about the VPC configuration that AWS CodeBuild accesses.
     */

    public void setVpcConfig(AwsCodeBuildProjectVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Information about the VPC configuration that AWS CodeBuild accesses.
     * </p>
     * 
     * @return Information about the VPC configuration that AWS CodeBuild accesses.
     */

    public AwsCodeBuildProjectVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * Information about the VPC configuration that AWS CodeBuild accesses.
     * </p>
     * 
     * @param vpcConfig
     *        Information about the VPC configuration that AWS CodeBuild accesses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withVpcConfig(AwsCodeBuildProjectVpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
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
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCodeBuildProjectDetails == false)
            return false;
        AwsCodeBuildProjectDetails other = (AwsCodeBuildProjectDetails) obj;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public AwsCodeBuildProjectDetails clone() {
        try {
            return (AwsCodeBuildProjectDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCodeBuildProjectDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
