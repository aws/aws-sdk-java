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
 * Represents the input of a get branch operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/GetBranch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBranchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository that contains the branch for which you want to retrieve information.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The name of the branch for which you want to retrieve information.
     * </p>
     */
    private String branchName;

    /**
     * <p>
     * The name of the repository that contains the branch for which you want to retrieve information.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the branch for which you want to retrieve information.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the branch for which you want to retrieve information.
     * </p>
     * 
     * @return The name of the repository that contains the branch for which you want to retrieve information.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository that contains the branch for which you want to retrieve information.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository that contains the branch for which you want to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBranchRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The name of the branch for which you want to retrieve information.
     * </p>
     * 
     * @param branchName
     *        The name of the branch for which you want to retrieve information.
     */

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    /**
     * <p>
     * The name of the branch for which you want to retrieve information.
     * </p>
     * 
     * @return The name of the branch for which you want to retrieve information.
     */

    public String getBranchName() {
        return this.branchName;
    }

    /**
     * <p>
     * The name of the branch for which you want to retrieve information.
     * </p>
     * 
     * @param branchName
     *        The name of the branch for which you want to retrieve information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBranchRequest withBranchName(String branchName) {
        setBranchName(branchName);
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
        if (getBranchName() != null)
            sb.append("BranchName: ").append(getBranchName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBranchRequest == false)
            return false;
        GetBranchRequest other = (GetBranchRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        return hashCode;
    }

    @Override
    public GetBranchRequest clone() {
        return (GetBranchRequest) super.clone();
    }

}
