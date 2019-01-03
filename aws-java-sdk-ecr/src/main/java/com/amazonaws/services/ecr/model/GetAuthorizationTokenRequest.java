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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/GetAuthorizationToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAuthorizationTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of AWS account IDs that are associated with the registries for which to get authorization tokens. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     */
    private java.util.List<String> registryIds;

    /**
     * <p>
     * A list of AWS account IDs that are associated with the registries for which to get authorization tokens. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @return A list of AWS account IDs that are associated with the registries for which to get authorization tokens.
     *         If you do not specify a registry, the default registry is assumed.
     */

    public java.util.List<String> getRegistryIds() {
        return registryIds;
    }

    /**
     * <p>
     * A list of AWS account IDs that are associated with the registries for which to get authorization tokens. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryIds
     *        A list of AWS account IDs that are associated with the registries for which to get authorization tokens.
     *        If you do not specify a registry, the default registry is assumed.
     */

    public void setRegistryIds(java.util.Collection<String> registryIds) {
        if (registryIds == null) {
            this.registryIds = null;
            return;
        }

        this.registryIds = new java.util.ArrayList<String>(registryIds);
    }

    /**
     * <p>
     * A list of AWS account IDs that are associated with the registries for which to get authorization tokens. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegistryIds(java.util.Collection)} or {@link #withRegistryIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param registryIds
     *        A list of AWS account IDs that are associated with the registries for which to get authorization tokens.
     *        If you do not specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizationTokenRequest withRegistryIds(String... registryIds) {
        if (this.registryIds == null) {
            setRegistryIds(new java.util.ArrayList<String>(registryIds.length));
        }
        for (String ele : registryIds) {
            this.registryIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of AWS account IDs that are associated with the registries for which to get authorization tokens. If you
     * do not specify a registry, the default registry is assumed.
     * </p>
     * 
     * @param registryIds
     *        A list of AWS account IDs that are associated with the registries for which to get authorization tokens.
     *        If you do not specify a registry, the default registry is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAuthorizationTokenRequest withRegistryIds(java.util.Collection<String> registryIds) {
        setRegistryIds(registryIds);
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
        if (getRegistryIds() != null)
            sb.append("RegistryIds: ").append(getRegistryIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAuthorizationTokenRequest == false)
            return false;
        GetAuthorizationTokenRequest other = (GetAuthorizationTokenRequest) obj;
        if (other.getRegistryIds() == null ^ this.getRegistryIds() == null)
            return false;
        if (other.getRegistryIds() != null && other.getRegistryIds().equals(this.getRegistryIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryIds() == null) ? 0 : getRegistryIds().hashCode());
        return hashCode;
    }

    @Override
    public GetAuthorizationTokenRequest clone() {
        return (GetAuthorizationTokenRequest) super.clone();
    }

}
