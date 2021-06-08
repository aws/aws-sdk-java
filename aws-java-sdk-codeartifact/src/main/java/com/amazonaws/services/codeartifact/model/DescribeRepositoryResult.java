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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/DescribeRepository" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRepositoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>RepositoryDescription</code> object that contains the requested repository information.
     * </p>
     */
    private RepositoryDescription repository;

    /**
     * <p>
     * A <code>RepositoryDescription</code> object that contains the requested repository information.
     * </p>
     * 
     * @param repository
     *        A <code>RepositoryDescription</code> object that contains the requested repository information.
     */

    public void setRepository(RepositoryDescription repository) {
        this.repository = repository;
    }

    /**
     * <p>
     * A <code>RepositoryDescription</code> object that contains the requested repository information.
     * </p>
     * 
     * @return A <code>RepositoryDescription</code> object that contains the requested repository information.
     */

    public RepositoryDescription getRepository() {
        return this.repository;
    }

    /**
     * <p>
     * A <code>RepositoryDescription</code> object that contains the requested repository information.
     * </p>
     * 
     * @param repository
     *        A <code>RepositoryDescription</code> object that contains the requested repository information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRepositoryResult withRepository(RepositoryDescription repository) {
        setRepository(repository);
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
            sb.append("Repository: ").append(getRepository());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRepositoryResult == false)
            return false;
        DescribeRepositoryResult other = (DescribeRepositoryResult) obj;
        if (other.getRepository() == null ^ this.getRepository() == null)
            return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRepositoryResult clone() {
        try {
            return (DescribeRepositoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
