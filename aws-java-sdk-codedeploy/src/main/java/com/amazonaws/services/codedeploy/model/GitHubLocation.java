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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the location of application artifacts stored in GitHub.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/GitHubLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GitHubLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The GitHub account and repository pair that stores a reference to the commit that represents the bundled
     * artifacts for the application revision.
     * </p>
     * <p>
     * Specified as account/repository.
     * </p>
     */
    private String repository;
    /**
     * <p>
     * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application revision.
     * </p>
     */
    private String commitId;

    /**
     * <p>
     * The GitHub account and repository pair that stores a reference to the commit that represents the bundled
     * artifacts for the application revision.
     * </p>
     * <p>
     * Specified as account/repository.
     * </p>
     * 
     * @param repository
     *        The GitHub account and repository pair that stores a reference to the commit that represents the bundled
     *        artifacts for the application revision. </p>
     *        <p>
     *        Specified as account/repository.
     */

    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * The GitHub account and repository pair that stores a reference to the commit that represents the bundled
     * artifacts for the application revision.
     * </p>
     * <p>
     * Specified as account/repository.
     * </p>
     * 
     * @return The GitHub account and repository pair that stores a reference to the commit that represents the bundled
     *         artifacts for the application revision. </p>
     *         <p>
     *         Specified as account/repository.
     */

    public String getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * The GitHub account and repository pair that stores a reference to the commit that represents the bundled
     * artifacts for the application revision.
     * </p>
     * <p>
     * Specified as account/repository.
     * </p>
     * 
     * @param repository
     *        The GitHub account and repository pair that stores a reference to the commit that represents the bundled
     *        artifacts for the application revision. </p>
     *        <p>
     *        Specified as account/repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubLocation withRepository(String repository) {
        setRepository(repository);
        return this;
    }

    /**
     * <p>
     * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application revision.
     * </p>
     * 
     * @param commitId
     *        The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application
     *        revision.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application revision.
     * </p>
     * 
     * @return The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application
     *         revision.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application revision.
     * </p>
     * 
     * @param commitId
     *        The SHA1 commit ID of the GitHub commit that represents the bundled artifacts for the application
     *        revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GitHubLocation withCommitId(String commitId) {
        setCommitId(commitId);
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
        if (getRepository() != null)
            sb.append("Repository: ").append(getRepository()).append(",");
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GitHubLocation == false)
            return false;
        GitHubLocation other = (GitHubLocation) obj;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        return hashCode;
    }

    @Override
    public GitHubLocation clone() {
        try {
            return (GitHubLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.GitHubLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
