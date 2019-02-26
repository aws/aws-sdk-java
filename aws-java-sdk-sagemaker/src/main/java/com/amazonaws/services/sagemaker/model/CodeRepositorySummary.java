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
 * Specifies summary information about a Git repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CodeRepositorySummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeRepositorySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Git repository.
     * </p>
     */
    private String codeRepositoryName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Git repository.
     * </p>
     */
    private String codeRepositoryArn;
    /**
     * <p>
     * The date and time that the Git repository was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that the Git repository was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * Configuration details for the Git repository, including the URL where it is located and the ARN of the AWS
     * Secrets Manager secret that contains the credentials used to access the repository.
     * </p>
     */
    private GitConfig gitConfig;

    /**
     * <p>
     * The name of the Git repository.
     * </p>
     * 
     * @param codeRepositoryName
     *        The name of the Git repository.
     */

    public void setCodeRepositoryName(String codeRepositoryName) {
        this.codeRepositoryName = codeRepositoryName;
    }

    /**
     * <p>
     * The name of the Git repository.
     * </p>
     * 
     * @return The name of the Git repository.
     */

    public String getCodeRepositoryName() {
        return this.codeRepositoryName;
    }

    /**
     * <p>
     * The name of the Git repository.
     * </p>
     * 
     * @param codeRepositoryName
     *        The name of the Git repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeRepositorySummary withCodeRepositoryName(String codeRepositoryName) {
        setCodeRepositoryName(codeRepositoryName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Git repository.
     * </p>
     * 
     * @param codeRepositoryArn
     *        The Amazon Resource Name (ARN) of the Git repository.
     */

    public void setCodeRepositoryArn(String codeRepositoryArn) {
        this.codeRepositoryArn = codeRepositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Git repository.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Git repository.
     */

    public String getCodeRepositoryArn() {
        return this.codeRepositoryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Git repository.
     * </p>
     * 
     * @param codeRepositoryArn
     *        The Amazon Resource Name (ARN) of the Git repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeRepositorySummary withCodeRepositoryArn(String codeRepositoryArn) {
        setCodeRepositoryArn(codeRepositoryArn);
        return this;
    }

    /**
     * <p>
     * The date and time that the Git repository was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Git repository was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the Git repository was created.
     * </p>
     * 
     * @return The date and time that the Git repository was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the Git repository was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the Git repository was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeRepositorySummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the Git repository was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the Git repository was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the Git repository was last modified.
     * </p>
     * 
     * @return The date and time that the Git repository was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the Git repository was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the Git repository was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeRepositorySummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Configuration details for the Git repository, including the URL where it is located and the ARN of the AWS
     * Secrets Manager secret that contains the credentials used to access the repository.
     * </p>
     * 
     * @param gitConfig
     *        Configuration details for the Git repository, including the URL where it is located and the ARN of the AWS
     *        Secrets Manager secret that contains the credentials used to access the repository.
     */

    public void setGitConfig(GitConfig gitConfig) {
        this.gitConfig = gitConfig;
    }

    /**
     * <p>
     * Configuration details for the Git repository, including the URL where it is located and the ARN of the AWS
     * Secrets Manager secret that contains the credentials used to access the repository.
     * </p>
     * 
     * @return Configuration details for the Git repository, including the URL where it is located and the ARN of the
     *         AWS Secrets Manager secret that contains the credentials used to access the repository.
     */

    public GitConfig getGitConfig() {
        return this.gitConfig;
    }

    /**
     * <p>
     * Configuration details for the Git repository, including the URL where it is located and the ARN of the AWS
     * Secrets Manager secret that contains the credentials used to access the repository.
     * </p>
     * 
     * @param gitConfig
     *        Configuration details for the Git repository, including the URL where it is located and the ARN of the AWS
     *        Secrets Manager secret that contains the credentials used to access the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeRepositorySummary withGitConfig(GitConfig gitConfig) {
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
        if (getCodeRepositoryArn() != null)
            sb.append("CodeRepositoryArn: ").append(getCodeRepositoryArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
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

        if (obj instanceof CodeRepositorySummary == false)
            return false;
        CodeRepositorySummary other = (CodeRepositorySummary) obj;
        if (other.getCodeRepositoryName() == null ^ this.getCodeRepositoryName() == null)
            return false;
        if (other.getCodeRepositoryName() != null && other.getCodeRepositoryName().equals(this.getCodeRepositoryName()) == false)
            return false;
        if (other.getCodeRepositoryArn() == null ^ this.getCodeRepositoryArn() == null)
            return false;
        if (other.getCodeRepositoryArn() != null && other.getCodeRepositoryArn().equals(this.getCodeRepositoryArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
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
        hashCode = prime * hashCode + ((getCodeRepositoryArn() == null) ? 0 : getCodeRepositoryArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getGitConfig() == null) ? 0 : getGitConfig().hashCode());
        return hashCode;
    }

    @Override
    public CodeRepositorySummary clone() {
        try {
            return (CodeRepositorySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.CodeRepositorySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
