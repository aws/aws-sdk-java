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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/GetRepositoryEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRepositoryEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string that specifies the URL of the returned endpoint.
     * </p>
     */
    private String repositoryEndpoint;

    /**
     * <p>
     * A string that specifies the URL of the returned endpoint.
     * </p>
     * 
     * @param repositoryEndpoint
     *        A string that specifies the URL of the returned endpoint.
     */

    public void setRepositoryEndpoint(String repositoryEndpoint) {
        this.repositoryEndpoint = repositoryEndpoint;
    }

    /**
     * <p>
     * A string that specifies the URL of the returned endpoint.
     * </p>
     * 
     * @return A string that specifies the URL of the returned endpoint.
     */

    public String getRepositoryEndpoint() {
        return this.repositoryEndpoint;
    }

    /**
     * <p>
     * A string that specifies the URL of the returned endpoint.
     * </p>
     * 
     * @param repositoryEndpoint
     *        A string that specifies the URL of the returned endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRepositoryEndpointResult withRepositoryEndpoint(String repositoryEndpoint) {
        setRepositoryEndpoint(repositoryEndpoint);
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
        if (getRepositoryEndpoint() != null)
            sb.append("RepositoryEndpoint: ").append(getRepositoryEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRepositoryEndpointResult == false)
            return false;
        GetRepositoryEndpointResult other = (GetRepositoryEndpointResult) obj;
        if (other.getRepositoryEndpoint() == null ^ this.getRepositoryEndpoint() == null)
            return false;
        if (other.getRepositoryEndpoint() != null && other.getRepositoryEndpoint().equals(this.getRepositoryEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryEndpoint() == null) ? 0 : getRepositoryEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public GetRepositoryEndpointResult clone() {
        try {
            return (GetRepositoryEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
