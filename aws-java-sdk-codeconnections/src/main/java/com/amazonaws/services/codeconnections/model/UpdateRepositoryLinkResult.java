/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeconnections.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeconnections-2023-12-01/UpdateRepositoryLink"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRepositoryLinkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the repository link to be updated.
     * </p>
     */
    private RepositoryLinkInfo repositoryLinkInfo;

    /**
     * <p>
     * Information about the repository link to be updated.
     * </p>
     * 
     * @param repositoryLinkInfo
     *        Information about the repository link to be updated.
     */

    public void setRepositoryLinkInfo(RepositoryLinkInfo repositoryLinkInfo) {
        this.repositoryLinkInfo = repositoryLinkInfo;
    }

    /**
     * <p>
     * Information about the repository link to be updated.
     * </p>
     * 
     * @return Information about the repository link to be updated.
     */

    public RepositoryLinkInfo getRepositoryLinkInfo() {
        return this.repositoryLinkInfo;
    }

    /**
     * <p>
     * Information about the repository link to be updated.
     * </p>
     * 
     * @param repositoryLinkInfo
     *        Information about the repository link to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryLinkResult withRepositoryLinkInfo(RepositoryLinkInfo repositoryLinkInfo) {
        setRepositoryLinkInfo(repositoryLinkInfo);
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
        if (getRepositoryLinkInfo() != null)
            sb.append("RepositoryLinkInfo: ").append(getRepositoryLinkInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRepositoryLinkResult == false)
            return false;
        UpdateRepositoryLinkResult other = (UpdateRepositoryLinkResult) obj;
        if (other.getRepositoryLinkInfo() == null ^ this.getRepositoryLinkInfo() == null)
            return false;
        if (other.getRepositoryLinkInfo() != null && other.getRepositoryLinkInfo().equals(this.getRepositoryLinkInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryLinkInfo() == null) ? 0 : getRepositoryLinkInfo().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRepositoryLinkResult clone() {
        try {
            return (UpdateRepositoryLinkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
