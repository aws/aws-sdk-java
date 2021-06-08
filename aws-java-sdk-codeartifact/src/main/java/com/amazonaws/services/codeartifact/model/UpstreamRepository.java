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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an upstream repository. A list of <code>UpstreamRepository</code> objects is an input parameter to
 * <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_CreateRepository.html">CreateRepository</a>
 * and <a
 * href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_UpdateRepository.html">UpdateRepository</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/UpstreamRepository" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpstreamRepository implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of an upstream repository.
     * </p>
     */
    private String repositoryName;

    /**
     * <p>
     * The name of an upstream repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of an upstream repository.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of an upstream repository.
     * </p>
     * 
     * @return The name of an upstream repository.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of an upstream repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of an upstream repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpstreamRepository withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
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
            sb.append("RepositoryName: ").append(getRepositoryName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpstreamRepository == false)
            return false;
        UpstreamRepository other = (UpstreamRepository) obj;
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
    public UpstreamRepository clone() {
        try {
            return (UpstreamRepository) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.UpstreamRepositoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
