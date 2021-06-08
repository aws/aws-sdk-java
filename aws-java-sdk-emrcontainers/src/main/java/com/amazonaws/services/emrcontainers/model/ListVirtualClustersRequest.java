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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/ListVirtualClusters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVirtualClustersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The container provider ID of the virtual cluster.
     * </p>
     */
    private String containerProviderId;
    /**
     * <p>
     * The container provider type of the virtual cluster. EKS is the only supported type as of now.
     * </p>
     */
    private String containerProviderType;
    /**
     * <p>
     * The date and time after which the virtual clusters are created.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * The date and time before which the virtual clusters are created.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * The states of the requested virtual clusters.
     * </p>
     */
    private java.util.List<String> states;
    /**
     * <p>
     * The maximum number of virtual clusters that can be listed.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of virtual clusters to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The container provider ID of the virtual cluster.
     * </p>
     * 
     * @param containerProviderId
     *        The container provider ID of the virtual cluster.
     */

    public void setContainerProviderId(String containerProviderId) {
        this.containerProviderId = containerProviderId;
    }

    /**
     * <p>
     * The container provider ID of the virtual cluster.
     * </p>
     * 
     * @return The container provider ID of the virtual cluster.
     */

    public String getContainerProviderId() {
        return this.containerProviderId;
    }

    /**
     * <p>
     * The container provider ID of the virtual cluster.
     * </p>
     * 
     * @param containerProviderId
     *        The container provider ID of the virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualClustersRequest withContainerProviderId(String containerProviderId) {
        setContainerProviderId(containerProviderId);
        return this;
    }

    /**
     * <p>
     * The container provider type of the virtual cluster. EKS is the only supported type as of now.
     * </p>
     * 
     * @param containerProviderType
     *        The container provider type of the virtual cluster. EKS is the only supported type as of now.
     * @see ContainerProviderType
     */

    public void setContainerProviderType(String containerProviderType) {
        this.containerProviderType = containerProviderType;
    }

    /**
     * <p>
     * The container provider type of the virtual cluster. EKS is the only supported type as of now.
     * </p>
     * 
     * @return The container provider type of the virtual cluster. EKS is the only supported type as of now.
     * @see ContainerProviderType
     */

    public String getContainerProviderType() {
        return this.containerProviderType;
    }

    /**
     * <p>
     * The container provider type of the virtual cluster. EKS is the only supported type as of now.
     * </p>
     * 
     * @param containerProviderType
     *        The container provider type of the virtual cluster. EKS is the only supported type as of now.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerProviderType
     */

    public ListVirtualClustersRequest withContainerProviderType(String containerProviderType) {
        setContainerProviderType(containerProviderType);
        return this;
    }

    /**
     * <p>
     * The container provider type of the virtual cluster. EKS is the only supported type as of now.
     * </p>
     * 
     * @param containerProviderType
     *        The container provider type of the virtual cluster. EKS is the only supported type as of now.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerProviderType
     */

    public ListVirtualClustersRequest withContainerProviderType(ContainerProviderType containerProviderType) {
        this.containerProviderType = containerProviderType.toString();
        return this;
    }

    /**
     * <p>
     * The date and time after which the virtual clusters are created.
     * </p>
     * 
     * @param createdAfter
     *        The date and time after which the virtual clusters are created.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * The date and time after which the virtual clusters are created.
     * </p>
     * 
     * @return The date and time after which the virtual clusters are created.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * The date and time after which the virtual clusters are created.
     * </p>
     * 
     * @param createdAfter
     *        The date and time after which the virtual clusters are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualClustersRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * The date and time before which the virtual clusters are created.
     * </p>
     * 
     * @param createdBefore
     *        The date and time before which the virtual clusters are created.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * The date and time before which the virtual clusters are created.
     * </p>
     * 
     * @return The date and time before which the virtual clusters are created.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * The date and time before which the virtual clusters are created.
     * </p>
     * 
     * @param createdBefore
     *        The date and time before which the virtual clusters are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualClustersRequest withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * The states of the requested virtual clusters.
     * </p>
     * 
     * @return The states of the requested virtual clusters.
     * @see VirtualClusterState
     */

    public java.util.List<String> getStates() {
        return states;
    }

    /**
     * <p>
     * The states of the requested virtual clusters.
     * </p>
     * 
     * @param states
     *        The states of the requested virtual clusters.
     * @see VirtualClusterState
     */

    public void setStates(java.util.Collection<String> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<String>(states);
    }

    /**
     * <p>
     * The states of the requested virtual clusters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        The states of the requested virtual clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualClusterState
     */

    public ListVirtualClustersRequest withStates(String... states) {
        if (this.states == null) {
            setStates(new java.util.ArrayList<String>(states.length));
        }
        for (String ele : states) {
            this.states.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The states of the requested virtual clusters.
     * </p>
     * 
     * @param states
     *        The states of the requested virtual clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualClusterState
     */

    public ListVirtualClustersRequest withStates(java.util.Collection<String> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * The states of the requested virtual clusters.
     * </p>
     * 
     * @param states
     *        The states of the requested virtual clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualClusterState
     */

    public ListVirtualClustersRequest withStates(VirtualClusterState... states) {
        java.util.ArrayList<String> statesCopy = new java.util.ArrayList<String>(states.length);
        for (VirtualClusterState value : states) {
            statesCopy.add(value.toString());
        }
        if (getStates() == null) {
            setStates(statesCopy);
        } else {
            getStates().addAll(statesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The maximum number of virtual clusters that can be listed.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of virtual clusters that can be listed.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of virtual clusters that can be listed.
     * </p>
     * 
     * @return The maximum number of virtual clusters that can be listed.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of virtual clusters that can be listed.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of virtual clusters that can be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualClustersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of virtual clusters to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of virtual clusters to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of virtual clusters to return.
     * </p>
     * 
     * @return The token for the next set of virtual clusters to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of virtual clusters to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of virtual clusters to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualClustersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getContainerProviderId() != null)
            sb.append("ContainerProviderId: ").append(getContainerProviderId()).append(",");
        if (getContainerProviderType() != null)
            sb.append("ContainerProviderType: ").append(getContainerProviderType()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getStates() != null)
            sb.append("States: ").append(getStates()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVirtualClustersRequest == false)
            return false;
        ListVirtualClustersRequest other = (ListVirtualClustersRequest) obj;
        if (other.getContainerProviderId() == null ^ this.getContainerProviderId() == null)
            return false;
        if (other.getContainerProviderId() != null && other.getContainerProviderId().equals(this.getContainerProviderId()) == false)
            return false;
        if (other.getContainerProviderType() == null ^ this.getContainerProviderType() == null)
            return false;
        if (other.getContainerProviderType() != null && other.getContainerProviderType().equals(this.getContainerProviderType()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerProviderId() == null) ? 0 : getContainerProviderId().hashCode());
        hashCode = prime * hashCode + ((getContainerProviderType() == null) ? 0 : getContainerProviderType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVirtualClustersRequest clone() {
        return (ListVirtualClustersRequest) super.clone();
    }

}
