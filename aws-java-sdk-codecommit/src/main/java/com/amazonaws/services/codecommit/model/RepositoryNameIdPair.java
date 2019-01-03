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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a repository name and ID.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/RepositoryNameIdPair" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryNameIdPair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name associated with the repository.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The ID associated with the repository.
     * </p>
     */
    private String repositoryId;

    /**
     * <p>
     * The name associated with the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name associated with the repository.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name associated with the repository.
     * </p>
     * 
     * @return The name associated with the repository.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name associated with the repository.
     * </p>
     * 
     * @param repositoryName
     *        The name associated with the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryNameIdPair withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The ID associated with the repository.
     * </p>
     * 
     * @param repositoryId
     *        The ID associated with the repository.
     */

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * <p>
     * The ID associated with the repository.
     * </p>
     * 
     * @return The ID associated with the repository.
     */

    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * <p>
     * The ID associated with the repository.
     * </p>
     * 
     * @param repositoryId
     *        The ID associated with the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryNameIdPair withRepositoryId(String repositoryId) {
        setRepositoryId(repositoryId);
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
        if (getRepositoryId() != null)
            sb.append("RepositoryId: ").append(getRepositoryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryNameIdPair == false)
            return false;
        RepositoryNameIdPair other = (RepositoryNameIdPair) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getRepositoryId() == null ^ this.getRepositoryId() == null)
            return false;
        if (other.getRepositoryId() != null && other.getRepositoryId().equals(this.getRepositoryId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getRepositoryId() == null) ? 0 : getRepositoryId().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryNameIdPair clone() {
        try {
            return (RepositoryNameIdPair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.RepositoryNameIdPairMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
