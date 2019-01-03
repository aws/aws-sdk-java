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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an update default branch operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateDefaultBranch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDefaultBranchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository to set or change the default branch for.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The name of the branch to set as the default.
     * </p>
     */
    private String defaultBranchName;

    /**
     * <p>
     * The name of the repository to set or change the default branch for.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to set or change the default branch for.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository to set or change the default branch for.
     * </p>
     * 
     * @return The name of the repository to set or change the default branch for.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository to set or change the default branch for.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository to set or change the default branch for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDefaultBranchRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The name of the branch to set as the default.
     * </p>
     * 
     * @param defaultBranchName
     *        The name of the branch to set as the default.
     */

    public void setDefaultBranchName(String defaultBranchName) {
        this.defaultBranchName = defaultBranchName;
    }

    /**
     * <p>
     * The name of the branch to set as the default.
     * </p>
     * 
     * @return The name of the branch to set as the default.
     */

    public String getDefaultBranchName() {
        return this.defaultBranchName;
    }

    /**
     * <p>
     * The name of the branch to set as the default.
     * </p>
     * 
     * @param defaultBranchName
     *        The name of the branch to set as the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDefaultBranchRequest withDefaultBranchName(String defaultBranchName) {
        setDefaultBranchName(defaultBranchName);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getDefaultBranchName() != null)
            sb.append("DefaultBranchName: ").append(getDefaultBranchName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDefaultBranchRequest == false)
            return false;
        UpdateDefaultBranchRequest other = (UpdateDefaultBranchRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getDefaultBranchName() == null ^ this.getDefaultBranchName() == null)
            return false;
        if (other.getDefaultBranchName() != null && other.getDefaultBranchName().equals(this.getDefaultBranchName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getDefaultBranchName() == null) ? 0 : getDefaultBranchName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDefaultBranchRequest clone() {
        return (UpdateDefaultBranchRequest) super.clone();
    }

}
