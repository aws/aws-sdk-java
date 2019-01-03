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
 * The repository to be created in AWS CodeStar. Valid values are AWS CodeCommit or GitHub. After AWS CodeStar
 * provisions the new repository, the source code files provided with the project request are placed in the repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/CodeDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code
     * files provided with the project request will be uploaded after project creation.
     * </p>
     */
    private CodeCommitCodeDestination codeCommit;
    /**
     * <p>
     * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files
     * provided with the project request will be uploaded after project creation.
     * </p>
     */
    private GitHubCodeDestination gitHub;

    /**
     * <p>
     * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code
     * files provided with the project request will be uploaded after project creation.
     * </p>
     * 
     * @param codeCommit
     *        Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source
     *        code files provided with the project request will be uploaded after project creation.
     */

    public void setCodeCommit(CodeCommitCodeDestination codeCommit) {
        this.codeCommit = codeCommit;
    }

    /**
     * <p>
     * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code
     * files provided with the project request will be uploaded after project creation.
     * </p>
     * 
     * @return Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source
     *         code files provided with the project request will be uploaded after project creation.
     */

    public CodeCommitCodeDestination getCodeCommit() {
        return this.codeCommit;
    }

    /**
     * <p>
     * Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source code
     * files provided with the project request will be uploaded after project creation.
     * </p>
     * 
     * @param codeCommit
     *        Information about the AWS CodeCommit repository to be created in AWS CodeStar. This is where the source
     *        code files provided with the project request will be uploaded after project creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeDestination withCodeCommit(CodeCommitCodeDestination codeCommit) {
        setCodeCommit(codeCommit);
        return this;
    }

    /**
     * <p>
     * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files
     * provided with the project request will be uploaded after project creation.
     * </p>
     * 
     * @param gitHub
     *        Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files
     *        provided with the project request will be uploaded after project creation.
     */

    public void setGitHub(GitHubCodeDestination gitHub) {
        this.gitHub = gitHub;
    }

    /**
     * <p>
     * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files
     * provided with the project request will be uploaded after project creation.
     * </p>
     * 
     * @return Information about the GitHub repository to be created in AWS CodeStar. This is where the source code
     *         files provided with the project request will be uploaded after project creation.
     */

    public GitHubCodeDestination getGitHub() {
        return this.gitHub;
    }

    /**
     * <p>
     * Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files
     * provided with the project request will be uploaded after project creation.
     * </p>
     * 
     * @param gitHub
     *        Information about the GitHub repository to be created in AWS CodeStar. This is where the source code files
     *        provided with the project request will be uploaded after project creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeDestination withGitHub(GitHubCodeDestination gitHub) {
        setGitHub(gitHub);
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
        if (getCodeCommit() != null)
            sb.append("CodeCommit: ").append(getCodeCommit()).append(",");
        if (getGitHub() != null)
            sb.append("GitHub: ").append(getGitHub());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeDestination == false)
            return false;
        CodeDestination other = (CodeDestination) obj;
        if (other.getCodeCommit() == null ^ this.getCodeCommit() == null)
            return false;
        if (other.getCodeCommit() != null && other.getCodeCommit().equals(this.getCodeCommit()) == false)
            return false;
        if (other.getGitHub() == null ^ this.getGitHub() == null)
            return false;
        if (other.getGitHub() != null && other.getGitHub().equals(this.getGitHub()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeCommit() == null) ? 0 : getCodeCommit().hashCode());
        hashCode = prime * hashCode + ((getGitHub() == null) ? 0 : getGitHub().hashCode());
        return hashCode;
    }

    @Override
    public CodeDestination clone() {
        try {
            return (CodeDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codestar.model.transform.CodeDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
