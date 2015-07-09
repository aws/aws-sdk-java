/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.service.codecommit.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a get branch operation.
 * </p>
 */
public class GetBranchRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    private String repositoryName;
    /**
     * <p>
     * The name of the branch for which you want to retrieve information.
     * </p>
     */
    private String branchName;

    /**
     * Sets the value of the RepositoryName property for this object.
     * 
     * @param repositoryName
     *        The new value for the RepositoryName property for this object.
     */
    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * Returns the value of the RepositoryName property for this object.
     * 
     * @return The value of the RepositoryName property for this object.
     */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * Sets the value of the RepositoryName property for this object.
     * 
     * @param repositoryName
     *        The new value for the RepositoryName property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
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
     * @return The name of the branch for which you want to retrieve
     *         information.
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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetBranchRequest withBranchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("RepositoryName: " + getRepositoryName() + ",");
        if (getBranchName() != null)
            sb.append("BranchName: " + getBranchName());
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
        if (other.getRepositoryName() == null
                ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null
                && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getBranchName() == null ^ this.getBranchName() == null)
            return false;
        if (other.getBranchName() != null
                && other.getBranchName().equals(this.getBranchName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRepositoryName() == null) ? 0 : getRepositoryName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getBranchName() == null) ? 0 : getBranchName().hashCode());
        return hashCode;
    }

    @Override
    public GetBranchRequest clone() {
        return (GetBranchRequest) super.clone();
    }
}