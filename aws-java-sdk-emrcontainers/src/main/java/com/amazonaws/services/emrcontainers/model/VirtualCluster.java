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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This entity describes a virtual cluster. A virtual cluster is a Kubernetes namespace that Amazon EMR is registered
 * with. Amazon EMR uses virtual clusters to run jobs and host endpoints. Multiple virtual clusters can be backed by the
 * same physical cluster. However, each virtual cluster maps to one namespace on an EKS cluster. Virtual clusters do not
 * create any active resources that contribute to your bill or that require lifecycle management outside the service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/VirtualCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualCluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the virtual cluster.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the virtual cluster.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the virtual cluster.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The state of the virtual cluster.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The container provider of the virtual cluster.
     * </p>
     */
    private ContainerProvider containerProvider;
    /**
     * <p>
     * The date and time when the virtual cluster is created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The assigned tags of the virtual cluster.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the virtual cluster.
     * </p>
     * 
     * @param id
     *        The ID of the virtual cluster.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the virtual cluster.
     * </p>
     * 
     * @return The ID of the virtual cluster.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the virtual cluster.
     * </p>
     * 
     * @param id
     *        The ID of the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualCluster withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the virtual cluster.
     * </p>
     * 
     * @param name
     *        The name of the virtual cluster.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the virtual cluster.
     * </p>
     * 
     * @return The name of the virtual cluster.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the virtual cluster.
     * </p>
     * 
     * @param name
     *        The name of the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualCluster withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the virtual cluster.
     * </p>
     * 
     * @param arn
     *        The ARN of the virtual cluster.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the virtual cluster.
     * </p>
     * 
     * @return The ARN of the virtual cluster.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the virtual cluster.
     * </p>
     * 
     * @param arn
     *        The ARN of the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualCluster withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The state of the virtual cluster.
     * </p>
     * 
     * @param state
     *        The state of the virtual cluster.
     * @see VirtualClusterState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the virtual cluster.
     * </p>
     * 
     * @return The state of the virtual cluster.
     * @see VirtualClusterState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the virtual cluster.
     * </p>
     * 
     * @param state
     *        The state of the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualClusterState
     */

    public VirtualCluster withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the virtual cluster.
     * </p>
     * 
     * @param state
     *        The state of the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualClusterState
     */

    public VirtualCluster withState(VirtualClusterState state) {
        this.state = state.toString();
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

    public VirtualCluster withContainerProvider(ContainerProvider containerProvider) {
        setContainerProvider(containerProvider);
        return this;
    }

    /**
     * <p>
     * The date and time when the virtual cluster is created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the virtual cluster is created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the virtual cluster is created.
     * </p>
     * 
     * @return The date and time when the virtual cluster is created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the virtual cluster is created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the virtual cluster is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualCluster withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The assigned tags of the virtual cluster.
     * </p>
     * 
     * @return The assigned tags of the virtual cluster.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The assigned tags of the virtual cluster.
     * </p>
     * 
     * @param tags
     *        The assigned tags of the virtual cluster.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The assigned tags of the virtual cluster.
     * </p>
     * 
     * @param tags
     *        The assigned tags of the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualCluster withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see VirtualCluster#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public VirtualCluster addTagsEntry(String key, String value) {
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

    public VirtualCluster clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getContainerProvider() != null)
            sb.append("ContainerProvider: ").append(getContainerProvider()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
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

        if (obj instanceof VirtualCluster == false)
            return false;
        VirtualCluster other = (VirtualCluster) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getContainerProvider() == null ^ this.getContainerProvider() == null)
            return false;
        if (other.getContainerProvider() != null && other.getContainerProvider().equals(this.getContainerProvider()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getContainerProvider() == null) ? 0 : getContainerProvider().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public VirtualCluster clone() {
        try {
            return (VirtualCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.VirtualClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
