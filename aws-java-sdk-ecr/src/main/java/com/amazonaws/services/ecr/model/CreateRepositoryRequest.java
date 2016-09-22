/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateRepositoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name to use for the repository. The repository name may be specified on its own (such as
     * <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a category (such
     * as <code>project-a/nginx-web-app</code>).
     * </p>
     */
    private String repositoryName;

    /**
     * <p>
     * The name to use for the repository. The repository name may be specified on its own (such as
     * <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a category (such
     * as <code>project-a/nginx-web-app</code>).
     * </p>
     * 
     * @param repositoryName
     *        The name to use for the repository. The repository name may be specified on its own (such as
     *        <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a
     *        category (such as <code>project-a/nginx-web-app</code>).
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name to use for the repository. The repository name may be specified on its own (such as
     * <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a category (such
     * as <code>project-a/nginx-web-app</code>).
     * </p>
     * 
     * @return The name to use for the repository. The repository name may be specified on its own (such as
     *         <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a
     *         category (such as <code>project-a/nginx-web-app</code>).
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name to use for the repository. The repository name may be specified on its own (such as
     * <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a category (such
     * as <code>project-a/nginx-web-app</code>).
     * </p>
     * 
     * @param repositoryName
     *        The name to use for the repository. The repository name may be specified on its own (such as
     *        <code>nginx-web-app</code>) or it can be prepended with a namespace to group the repository into a
     *        category (such as <code>project-a/nginx-web-app</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRepositoryRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("RepositoryName: " + getRepositoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRepositoryRequest == false)
            return false;
        CreateRepositoryRequest other = (CreateRepositoryRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        return hashCode;
    }

    @Override
    public CreateRepositoryRequest clone() {
        return (CreateRepositoryRequest) super.clone();
    }
}
