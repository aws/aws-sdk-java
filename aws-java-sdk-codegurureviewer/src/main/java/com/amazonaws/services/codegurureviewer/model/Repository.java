/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an associated AWS CodeCommit repository or an associated repository that is managed by AWS CodeStar
 * Connections (for example, Bitbucket). This <code>Repository</code> object is not used if your source code is in an
 * associated GitHub repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/Repository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Repository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     */
    private CodeCommitRepository codeCommit;
    /**
     * <p>
     * Information about a Bitbucket repository.
     * </p>
     */
    private ThirdPartySourceRepository bitbucket;
    /**
     * <p>
     * Information about a GitHub Enterprise Server repository.
     * </p>
     */
    private ThirdPartySourceRepository gitHubEnterpriseServer;

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     * 
     * @param codeCommit
     *        Information about an AWS CodeCommit repository.
     */

    public void setCodeCommit(CodeCommitRepository codeCommit) {
        this.codeCommit = codeCommit;
    }

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     * 
     * @return Information about an AWS CodeCommit repository.
     */

    public CodeCommitRepository getCodeCommit() {
        return this.codeCommit;
    }

    /**
     * <p>
     * Information about an AWS CodeCommit repository.
     * </p>
     * 
     * @param codeCommit
     *        Information about an AWS CodeCommit repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withCodeCommit(CodeCommitRepository codeCommit) {
        setCodeCommit(codeCommit);
        return this;
    }

    /**
     * <p>
     * Information about a Bitbucket repository.
     * </p>
     * 
     * @param bitbucket
     *        Information about a Bitbucket repository.
     */

    public void setBitbucket(ThirdPartySourceRepository bitbucket) {
        this.bitbucket = bitbucket;
    }

    /**
     * <p>
     * Information about a Bitbucket repository.
     * </p>
     * 
     * @return Information about a Bitbucket repository.
     */

    public ThirdPartySourceRepository getBitbucket() {
        return this.bitbucket;
    }

    /**
     * <p>
     * Information about a Bitbucket repository.
     * </p>
     * 
     * @param bitbucket
     *        Information about a Bitbucket repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withBitbucket(ThirdPartySourceRepository bitbucket) {
        setBitbucket(bitbucket);
        return this;
    }

    /**
     * <p>
     * Information about a GitHub Enterprise Server repository.
     * </p>
     * 
     * @param gitHubEnterpriseServer
     *        Information about a GitHub Enterprise Server repository.
     */

    public void setGitHubEnterpriseServer(ThirdPartySourceRepository gitHubEnterpriseServer) {
        this.gitHubEnterpriseServer = gitHubEnterpriseServer;
    }

    /**
     * <p>
     * Information about a GitHub Enterprise Server repository.
     * </p>
     * 
     * @return Information about a GitHub Enterprise Server repository.
     */

    public ThirdPartySourceRepository getGitHubEnterpriseServer() {
        return this.gitHubEnterpriseServer;
    }

    /**
     * <p>
     * Information about a GitHub Enterprise Server repository.
     * </p>
     * 
     * @param gitHubEnterpriseServer
     *        Information about a GitHub Enterprise Server repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Repository withGitHubEnterpriseServer(ThirdPartySourceRepository gitHubEnterpriseServer) {
        setGitHubEnterpriseServer(gitHubEnterpriseServer);
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
        if (getBitbucket() != null)
            sb.append("Bitbucket: ").append(getBitbucket()).append(",");
        if (getGitHubEnterpriseServer() != null)
            sb.append("GitHubEnterpriseServer: ").append(getGitHubEnterpriseServer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Repository == false)
            return false;
        Repository other = (Repository) obj;
        if (other.getCodeCommit() == null ^ this.getCodeCommit() == null)
            return false;
        if (other.getCodeCommit() != null && other.getCodeCommit().equals(this.getCodeCommit()) == false)
            return false;
        if (other.getBitbucket() == null ^ this.getBitbucket() == null)
            return false;
        if (other.getBitbucket() != null && other.getBitbucket().equals(this.getBitbucket()) == false)
            return false;
        if (other.getGitHubEnterpriseServer() == null ^ this.getGitHubEnterpriseServer() == null)
            return false;
        if (other.getGitHubEnterpriseServer() != null && other.getGitHubEnterpriseServer().equals(this.getGitHubEnterpriseServer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeCommit() == null) ? 0 : getCodeCommit().hashCode());
        hashCode = prime * hashCode + ((getBitbucket() == null) ? 0 : getBitbucket().hashCode());
        hashCode = prime * hashCode + ((getGitHubEnterpriseServer() == null) ? 0 : getGitHubEnterpriseServer().hashCode());
        return hashCode;
    }

    @Override
    public Repository clone() {
        try {
            return (Repository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
