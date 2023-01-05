/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeleteRepository" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRepositoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The repository name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The repository provider.
     * </p>
     */
    private String provider;

    /**
     * <p>
     * The repository name.
     * </p>
     * 
     * @param name
     *        The repository name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The repository name.
     * </p>
     * 
     * @return The repository name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The repository name.
     * </p>
     * 
     * @param name
     *        The repository name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRepositoryRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param provider
     *        The repository provider.
     * @see RepositoryProvider
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @return The repository provider.
     * @see RepositoryProvider
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param provider
     *        The repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public DeleteRepositoryRequest withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The repository provider.
     * </p>
     * 
     * @param provider
     *        The repository provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RepositoryProvider
     */

    public DeleteRepositoryRequest withProvider(RepositoryProvider provider) {
        this.provider = provider.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRepositoryRequest == false)
            return false;
        DeleteRepositoryRequest other = (DeleteRepositoryRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRepositoryRequest clone() {
        return (DeleteRepositoryRequest) super.clone();
    }

}
