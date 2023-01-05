/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about an CodeBuild project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCodeBuildProjectDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCodeBuildProjectDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The KMS key used to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the ARN of the KMS key or, if available, the KMS key alias (using the format
     * alias/alias-name).
     * </p>
     */
    private String encryptionKey;
    /**
     * <p>
     * Information about the build artifacts for the CodeBuild project.
     * </p>
     */
    private java.util.List<AwsCodeBuildProjectArtifactsDetails> artifacts;
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
     * The ARN of the IAM role that enables CodeBuild to interact with dependent Amazon Web Services services on behalf
     * of the Amazon Web Services account.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * Information about logs for the build project.
     * </p>
     */
    private AwsCodeBuildProjectLogsConfigDetails logsConfig;
    /**
     * <p>
     * Information about the VPC configuration that CodeBuild accesses.
     * </p>
     */
    private AwsCodeBuildProjectVpcConfig vpcConfig;
    /**
     * <p>
     * Information about the secondary artifacts for the CodeBuild project.
     * </p>
     */
    private java.util.List<AwsCodeBuildProjectArtifactsDetails> secondaryArtifacts;

    /**
     * <p>
     * The KMS key used to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the ARN of the KMS key or, if available, the KMS key alias (using the format
     * alias/alias-name).
     * </p>
     * 
     * @param encryptionKey
     *        The KMS key used to encrypt the build output artifacts.</p>
     *        <p>
     *        You can specify either the ARN of the KMS key or, if available, the KMS key alias (using the format
     *        alias/alias-name).
     */

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The KMS key used to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the ARN of the KMS key or, if available, the KMS key alias (using the format
     * alias/alias-name).
     * </p>
     * 
     * @return The KMS key used to encrypt the build output artifacts.</p>
     *         <p>
     *         You can specify either the ARN of the KMS key or, if available, the KMS key alias (using the format
     *         alias/alias-name).
     */

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The KMS key used to encrypt the build output artifacts.
     * </p>
     * <p>
     * You can specify either the ARN of the KMS key or, if available, the KMS key alias (using the format
     * alias/alias-name).
     * </p>
     * 
     * @param encryptionKey
     *        The KMS key used to encrypt the build output artifacts.</p>
     *        <p>
     *        You can specify either the ARN of the KMS key or, if available, the KMS key alias (using the format
     *        alias/alias-name).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withEncryptionKey(String encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * Information about the build artifacts for the CodeBuild project.
     * </p>
     * 
     * @return Information about the build artifacts for the CodeBuild project.
     */

    public java.util.List<AwsCodeBuildProjectArtifactsDetails> getArtifacts() {
        return artifacts;
    }

    /**
     * <p>
     * Information about the build artifacts for the CodeBuild project.
     * </p>
     * 
     * @param artifacts
     *        Information about the build artifacts for the CodeBuild project.
     */

    public void setArtifacts(java.util.Collection<AwsCodeBuildProjectArtifactsDetails> artifacts) {
        if (artifacts == null) {
            this.artifacts = null;
            return;
        }

        this.artifacts = new java.util.ArrayList<AwsCodeBuildProjectArtifactsDetails>(artifacts);
    }

    /**
     * <p>
     * Information about the build artifacts for the CodeBuild project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArtifacts(java.util.Collection)} or {@link #withArtifacts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param artifacts
     *        Information about the build artifacts for the CodeBuild project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withArtifacts(AwsCodeBuildProjectArtifactsDetails... artifacts) {
        if (this.artifacts == null) {
            setArtifacts(new java.util.ArrayList<AwsCodeBuildProjectArtifactsDetails>(artifacts.length));
        }
        for (AwsCodeBuildProjectArtifactsDetails ele : artifacts) {
            this.artifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the build artifacts for the CodeBuild project.
     * </p>
     * 
     * @param artifacts
     *        Information about the build artifacts for the CodeBuild project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withArtifacts(java.util.Collection<AwsCodeBuildProjectArtifactsDetails> artifacts) {
        setArtifacts(artifacts);
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
     * The ARN of the IAM role that enables CodeBuild to interact with dependent Amazon Web Services services on behalf
     * of the Amazon Web Services account.
     * </p>
     * 
     * @param serviceRole
     *        The ARN of the IAM role that enables CodeBuild to interact with dependent Amazon Web Services services on
     *        behalf of the Amazon Web Services account.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables CodeBuild to interact with dependent Amazon Web Services services on behalf
     * of the Amazon Web Services account.
     * </p>
     * 
     * @return The ARN of the IAM role that enables CodeBuild to interact with dependent Amazon Web Services services on
     *         behalf of the Amazon Web Services account.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * The ARN of the IAM role that enables CodeBuild to interact with dependent Amazon Web Services services on behalf
     * of the Amazon Web Services account.
     * </p>
     * 
     * @param serviceRole
     *        The ARN of the IAM role that enables CodeBuild to interact with dependent Amazon Web Services services on
     *        behalf of the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * Information about logs for the build project.
     * </p>
     * 
     * @param logsConfig
     *        Information about logs for the build project.
     */

    public void setLogsConfig(AwsCodeBuildProjectLogsConfigDetails logsConfig) {
        this.logsConfig = logsConfig;
    }

    /**
     * <p>
     * Information about logs for the build project.
     * </p>
     * 
     * @return Information about logs for the build project.
     */

    public AwsCodeBuildProjectLogsConfigDetails getLogsConfig() {
        return this.logsConfig;
    }

    /**
     * <p>
     * Information about logs for the build project.
     * </p>
     * 
     * @param logsConfig
     *        Information about logs for the build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withLogsConfig(AwsCodeBuildProjectLogsConfigDetails logsConfig) {
        setLogsConfig(logsConfig);
        return this;
    }

    /**
     * <p>
     * Information about the VPC configuration that CodeBuild accesses.
     * </p>
     * 
     * @param vpcConfig
     *        Information about the VPC configuration that CodeBuild accesses.
     */

    public void setVpcConfig(AwsCodeBuildProjectVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Information about the VPC configuration that CodeBuild accesses.
     * </p>
     * 
     * @return Information about the VPC configuration that CodeBuild accesses.
     */

    public AwsCodeBuildProjectVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * Information about the VPC configuration that CodeBuild accesses.
     * </p>
     * 
     * @param vpcConfig
     *        Information about the VPC configuration that CodeBuild accesses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withVpcConfig(AwsCodeBuildProjectVpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * Information about the secondary artifacts for the CodeBuild project.
     * </p>
     * 
     * @return Information about the secondary artifacts for the CodeBuild project.
     */

    public java.util.List<AwsCodeBuildProjectArtifactsDetails> getSecondaryArtifacts() {
        return secondaryArtifacts;
    }

    /**
     * <p>
     * Information about the secondary artifacts for the CodeBuild project.
     * </p>
     * 
     * @param secondaryArtifacts
     *        Information about the secondary artifacts for the CodeBuild project.
     */

    public void setSecondaryArtifacts(java.util.Collection<AwsCodeBuildProjectArtifactsDetails> secondaryArtifacts) {
        if (secondaryArtifacts == null) {
            this.secondaryArtifacts = null;
            return;
        }

        this.secondaryArtifacts = new java.util.ArrayList<AwsCodeBuildProjectArtifactsDetails>(secondaryArtifacts);
    }

    /**
     * <p>
     * Information about the secondary artifacts for the CodeBuild project.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondaryArtifacts(java.util.Collection)} or {@link #withSecondaryArtifacts(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param secondaryArtifacts
     *        Information about the secondary artifacts for the CodeBuild project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withSecondaryArtifacts(AwsCodeBuildProjectArtifactsDetails... secondaryArtifacts) {
        if (this.secondaryArtifacts == null) {
            setSecondaryArtifacts(new java.util.ArrayList<AwsCodeBuildProjectArtifactsDetails>(secondaryArtifacts.length));
        }
        for (AwsCodeBuildProjectArtifactsDetails ele : secondaryArtifacts) {
            this.secondaryArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the secondary artifacts for the CodeBuild project.
     * </p>
     * 
     * @param secondaryArtifacts
     *        Information about the secondary artifacts for the CodeBuild project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCodeBuildProjectDetails withSecondaryArtifacts(java.util.Collection<AwsCodeBuildProjectArtifactsDetails> secondaryArtifacts) {
        setSecondaryArtifacts(secondaryArtifacts);
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
        if (getArtifacts() != null)
            sb.append("Artifacts: ").append(getArtifacts()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getLogsConfig() != null)
            sb.append("LogsConfig: ").append(getLogsConfig()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getSecondaryArtifacts() != null)
            sb.append("SecondaryArtifacts: ").append(getSecondaryArtifacts());
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
        if (other.getArtifacts() == null ^ this.getArtifacts() == null)
            return false;
        if (other.getArtifacts() != null && other.getArtifacts().equals(this.getArtifacts()) == false)
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
        if (other.getLogsConfig() == null ^ this.getLogsConfig() == null)
            return false;
        if (other.getLogsConfig() != null && other.getLogsConfig().equals(this.getLogsConfig()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getSecondaryArtifacts() == null ^ this.getSecondaryArtifacts() == null)
            return false;
        if (other.getSecondaryArtifacts() != null && other.getSecondaryArtifacts().equals(this.getSecondaryArtifacts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getArtifacts() == null) ? 0 : getArtifacts().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getLogsConfig() == null) ? 0 : getLogsConfig().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getSecondaryArtifacts() == null) ? 0 : getSecondaryArtifacts().hashCode());
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
