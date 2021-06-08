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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateVirtualCluster"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVirtualClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The specified name of the virtual cluster.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The container provider of the virtual cluster.
     * </p>
     */
    private ContainerProvider containerProvider;
    /**
     * <p>
     * The client token of the virtual cluster.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags assigned to the virtual cluster.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The specified name of the virtual cluster.
     * </p>
     * 
     * @param name
     *        The specified name of the virtual cluster.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The specified name of the virtual cluster.
     * </p>
     * 
     * @return The specified name of the virtual cluster.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The specified name of the virtual cluster.
     * </p>
     * 
     * @param name
     *        The specified name of the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualClusterRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The container provider of the virtual cluster.
     * </p>
     * 
     * @param containerProvider
     *        The container provider of the virtual cluster.
     */

    public void setContainerProvider(ContainerProvider containerProvider) {
        this.containerProvider = containerProvider;
    }

    /**
     * <p>
     * The container provider of the virtual cluster.
     * </p>
     * 
     * @return The container provider of the virtual cluster.
     */

    public ContainerProvider getContainerProvider() {
        return this.containerProvider;
    }

    /**
     * <p>
     * The container provider of the virtual cluster.
     * </p>
     * 
     * @param containerProvider
     *        The container provider of the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualClusterRequest withContainerProvider(ContainerProvider containerProvider) {
        setContainerProvider(containerProvider);
        return this;
    }

    /**
     * <p>
     * The client token of the virtual cluster.
     * </p>
     * 
     * @param clientToken
     *        The client token of the virtual cluster.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token of the virtual cluster.
     * </p>
     * 
     * @return The client token of the virtual cluster.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token of the virtual cluster.
     * </p>
     * 
     * @param clientToken
     *        The client token of the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualClusterRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the virtual cluster.
     * </p>
     * 
     * @return The tags assigned to the virtual cluster.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the virtual cluster.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the virtual cluster.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the virtual cluster.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualClusterRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateVirtualClusterRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualClusterRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualClusterRequest clearTagsEntries() {
        this.tags = null;
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
        if (getContainerProvider() != null)
            sb.append("ContainerProvider: ").append(getContainerProvider()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVirtualClusterRequest == false)
            return false;
        CreateVirtualClusterRequest other = (CreateVirtualClusterRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContainerProvider() == null ^ this.getContainerProvider() == null)
            return false;
        if (other.getContainerProvider() != null && other.getContainerProvider().equals(this.getContainerProvider()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getContainerProvider() == null) ? 0 : getContainerProvider().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVirtualClusterRequest clone() {
        return (CreateVirtualClusterRequest) super.clone();
    }

}
