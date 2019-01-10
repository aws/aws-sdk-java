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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCodeRepository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCodeRepositoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Git repository. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     */
    private String codeRepositoryName;
    /**
     * <p>
     * Specifies details about the repository, including the URL where the repository is located, the default branch,
     * and credentials to use to access the repository.
     * </p>
     */
    private GitConfig gitConfig;

    /**
     * <p>
     * The name of the Git repository. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * 
     * @param codeRepositoryName
     *        The name of the Git repository. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *        and - (hyphen).
     */

    public void setCodeRepositoryName(String codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
    }

    /**
     * <p>
     * The name of the Git repository. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * 
     * @return The name of the Git repository. The name must have 1 to 63 characters. Valid characters are a-z, A-Z,
     *         0-9, and - (hyphen).
     */

    public String getCodeRepositoryName() {
        return this.codeRepositoryName;
    }

    /**
     * <p>
     * The name of the Git repository. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * 
     * @param codeRepositoryName
     *        The name of the Git repository. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *        and - (hyphen).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCodeRepositoryRequest withCodeRepositoryName(String codeRepositoryName) {
        setCodeRepositoryName(codeRepositoryName);
        return this;
    }

    /**
     * <p>
     * Specifies details about the repository, including the URL where the repository is located, the default branch,
     * and credentials to use to access the repository.
     * </p>
     * 
     * @param gitConfig
     *        Specifies details about the repository, including the URL where the repository is located, the default
     *        branch, and credentials to use to access the repository.
     */

    public void setGitConfig(GitConfig gitConfig) {
        this.gitConfig = gitConfig;
    }

    /**
     * <p>
     * Specifies details about the repository, including the URL where the repository is located, the default branch,
     * and credentials to use to access the repository.
     * </p>
     * 
     * @return Specifies details about the repository, including the URL where the repository is located, the default
     *         branch, and credentials to use to access the repository.
     */

    public GitConfig getGitConfig() {
        return this.gitConfig;
    }

    /**
     * <p>
     * Specifies details about the repository, including the URL where the repository is located, the default branch,
     * and credentials to use to access the repository.
     * </p>
     * 
     * @param gitConfig
     *        Specifies details about the repository, including the URL where the repository is located, the default
     *        branch, and credentials to use to access the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCodeRepositoryRequest withGitConfig(GitConfig gitConfig) {
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

        if (obj instanceof CreateCodeRepositoryRequest == false)
            return false;
        CreateCodeRepositoryRequest other = (CreateCodeRepositoryRequest) obj;
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
    public CreateCodeRepositoryRequest clone() {
        return (CreateCodeRepositoryRequest) super.clone();
    }

}
