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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateCodeRepository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCodeRepositoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Git repository to update.
     * </p>
     */
    private String codeRepositoryName;
    /**
     * <p>
     * The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the AWS Secrets
     * Manager secret that contains the credentials used to access the repository. The secret must have a staging label
     * of <code>AWSCURRENT</code> and must be in the following format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     */
    private GitConfigForUpdate gitConfig;

    /**
     * <p>
     * The name of the Git repository to update.
     * </p>
     * 
     * @param codeRepositoryName
     *        The name of the Git repository to update.
     */

    public void setCodeRepositoryName(String codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
    }

    /**
     * <p>
     * The name of the Git repository to update.
     * </p>
     * 
     * @return The name of the Git repository to update.
     */

    public String getCodeRepositoryName() {
        return this.codeRepositoryName;
    }

    /**
     * <p>
     * The name of the Git repository to update.
     * </p>
     * 
     * @param codeRepositoryName
     *        The name of the Git repository to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCodeRepositoryRequest withCodeRepositoryName(String codeRepositoryName) {
        setCodeRepositoryName(codeRepositoryName);
        return this;
    }

    /**
     * <p>
     * The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the AWS Secrets
     * Manager secret that contains the credentials used to access the repository. The secret must have a staging label
     * of <code>AWSCURRENT</code> and must be in the following format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     * 
     * @param gitConfig
     *        The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the AWS
     *        Secrets Manager secret that contains the credentials used to access the repository. The secret must have a
     *        staging label of <code>AWSCURRENT</code> and must be in the following format:</p>
     *        <p>
     *        <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     */

    public void setGitConfig(GitConfigForUpdate gitConfig) {
        this.gitConfig = gitConfig;
    }

    /**
     * <p>
     * The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the AWS Secrets
     * Manager secret that contains the credentials used to access the repository. The secret must have a staging label
     * of <code>AWSCURRENT</code> and must be in the following format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     * 
     * @return The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the AWS
     *         Secrets Manager secret that contains the credentials used to access the repository. The secret must have
     *         a staging label of <code>AWSCURRENT</code> and must be in the following format:</p>
     *         <p>
     *         <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     */

    public GitConfigForUpdate getGitConfig() {
        return this.gitConfig;
    }

    /**
     * <p>
     * The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the AWS Secrets
     * Manager secret that contains the credentials used to access the repository. The secret must have a staging label
     * of <code>AWSCURRENT</code> and must be in the following format:
     * </p>
     * <p>
     * <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * </p>
     * 
     * @param gitConfig
     *        The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the AWS
     *        Secrets Manager secret that contains the credentials used to access the repository. The secret must have a
     *        staging label of <code>AWSCURRENT</code> and must be in the following format:</p>
     *        <p>
     *        <code>{"username": <i>UserName</i>, "password": <i>Password</i>}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCodeRepositoryRequest withGitConfig(GitConfigForUpdate gitConfig) {
        setGitConfig(gitConfig);
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
        if (getCodeRepositoryName() != null)
            sb.append("CodeRepositoryName: ").append(getCodeRepositoryName()).append(",");
        if (getGitConfig() != null)
            sb.append("GitConfig: ").append(getGitConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCodeRepositoryRequest == false)
            return false;
        UpdateCodeRepositoryRequest other = (UpdateCodeRepositoryRequest) obj;
        if (other.getCodeRepositoryName() == null ^ this.getCodeRepositoryName() == null)
            return false;
        if (other.getCodeRepositoryName() != null && other.getCodeRepositoryName().equals(this.getCodeRepositoryName()) == false)
            return false;
        if (other.getGitConfig() == null ^ this.getGitConfig() == null)
            return false;
        if (other.getGitConfig() != null && other.getGitConfig().equals(this.getGitConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeRepositoryName() == null) ? 0 : getCodeRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getGitConfig() == null) ? 0 : getGitConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCodeRepositoryRequest clone() {
        return (UpdateCodeRepositoryRequest) super.clone();
    }

}
