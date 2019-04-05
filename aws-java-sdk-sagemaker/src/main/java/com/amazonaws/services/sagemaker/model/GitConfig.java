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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configuration details for a Git repository in your AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/GitConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL where the Git repository is located.
     * </p>
     */
    private String repositoryUrl;
    /**
     * <p>
     * The default branch for the Git repository.
     * </p>
     */
    private String branch;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the
     * git repository. The secret must have a staging label of <code>AWSCURRENT</code> and must be in the following
     * format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     */
    private String secretArn;

    /**
     * <p>
     * The URL where the Git repository is located.
     * </p>
     * 
     * @param repositoryUrl
     *        The URL where the Git repository is located.
     */

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    /**
     * <p>
     * The URL where the Git repository is located.
     * </p>
     * 
     * @return The URL where the Git repository is located.
     */

    public String getRepositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * <p>
     * The URL where the Git repository is located.
     * </p>
     * 
     * @param repositoryUrl
     *        The URL where the Git repository is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitConfig withRepositoryUrl(String repositoryUrl) {
        setRepositoryUrl(repositoryUrl);
        return this;
    }

    /**
     * <p>
     * The default branch for the Git repository.
     * </p>
     * 
     * @param branch
     *        The default branch for the Git repository.
     */

    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * <p>
     * The default branch for the Git repository.
     * </p>
     * 
     * @return The default branch for the Git repository.
     */

    public String getBranch() {
        return this.branch;
    }

    /**
     * <p>
     * The default branch for the Git repository.
     * </p>
     * 
     * @param branch
     *        The default branch for the Git repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitConfig withBranch(String branch) {
        setBranch(branch);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the
     * git repository. The secret must have a staging label of <code>AWSCURRENT</code> and must be in the following
     * format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to
     *        access the git repository. The secret must have a staging label of <code>AWSCURRENT</code> and must be in
     *        the following format:</p>
     *        <p>
     *        <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the
     * git repository. The secret must have a staging label of <code>AWSCURRENT</code> and must be in the following
     * format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to
     *         access the git repository. The secret must have a staging label of <code>AWSCURRENT</code> and must be in
     *         the following format:</p>
     *         <p>
     *         <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the
     * git repository. The secret must have a staging label of <code>AWSCURRENT</code> and must be in the following
     * format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     * 
     * @param secretArn
     *        The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to
     *        access the git repository. The secret must have a staging label of <code>AWSCURRENT</code> and must be in
     *        the following format:</p>
     *        <p>
     *        <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitConfig withSecretArn(String secretArn) {
        setSecretArn(secretArn);
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
        if (getRepositoryUrl() != null)
            sb.append("RepositoryUrl: ").append(getRepositoryUrl()).append(",");
        if (getBranch() != null)
            sb.append("Branch: ").append(getBranch()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitConfig == false)
            return false;
        GitConfig other = (GitConfig) obj;
        if (other.getRepositoryUrl() == null ^ this.getRepositoryUrl() == null)
            return false;
        if (other.getRepositoryUrl() != null && other.getRepositoryUrl().equals(this.getRepositoryUrl()) == false)
            return false;
        if (other.getBranch() == null ^ this.getBranch() == null)
            return false;
        if (other.getBranch() != null && other.getBranch().equals(this.getBranch()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryUrl() == null) ? 0 : getRepositoryUrl().hashCode());
        hashCode = prime * hashCode + ((getBranch() == null) ? 0 : getBranch().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public GitConfig clone() {
        try {
            return (GitConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.GitConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
