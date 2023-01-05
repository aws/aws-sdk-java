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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetNetworkResources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetNetworkResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The network resources.
     * </p>
     */
    private java.util.List<NetworkResource> networkResources;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The network resources.
     * </p>
     * 
     * @return The network resources.
     */

    public java.util.List<NetworkResource> getNetworkResources() {
        return networkResources;
    }

    /**
     * <p>
     * The network resources.
     * </p>
     * 
     * @param networkResources
     *        The network resources.
     */

    public void setNetworkResources(java.util.Collection<NetworkResource> networkResources) {
        if (networkResources == null) {
            this.networkResources = null;
            return;
        }

        this.networkResources = new java.util.ArrayList<NetworkResource>(networkResources);
    }

    /**
     * <p>
     * The network resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkResources(java.util.Collection)} or {@link #withNetworkResources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkResources
     *        The network resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourcesResult withNetworkResources(NetworkResource... networkResources) {
        if (this.networkResources == null) {
            setNetworkResources(new java.util.ArrayList<NetworkResource>(networkResources.length));
        }
        for (NetworkResource ele : networkResources) {
            this.networkResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network resources.
     * </p>
     * 
     * @param networkResources
     *        The network resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourcesResult withNetworkResources(java.util.Collection<NetworkResource> networkResources) {
        setNetworkResources(networkResources);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetNetworkResourcesResult withNextToken(String nextToken) {
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
        if (getNetworkResources() != null)
            sb.append("NetworkResources: ").append(getNetworkResources()).append(",");
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

        if (obj instanceof GetNetworkResourcesResult == false)
            return false;
        GetNetworkResourcesResult other = (GetNetworkResourcesResult) obj;
        if (other.getNetworkResources() == null ^ this.getNetworkResources() == null)
            return false;
        if (other.getNetworkResources() != null && other.getNetworkResources().equals(this.getNetworkResources()) == false)
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

        hashCode = prime * hashCode + ((getNetworkResources() == null) ? 0 : getNetworkResources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetNetworkResourcesResult clone() {
        try {
            return (GetNetworkResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
