/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/DescribeGlobalNetworks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGlobalNetworksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the global networks.
     * </p>
     */
    private java.util.List<GlobalNetwork> globalNetworks;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the global networks.
     * </p>
     * 
     * @return Information about the global networks.
     */

    public java.util.List<GlobalNetwork> getGlobalNetworks() {
        return globalNetworks;
    }

    /**
     * <p>
     * Information about the global networks.
     * </p>
     * 
     * @param globalNetworks
     *        Information about the global networks.
     */

    public void setGlobalNetworks(java.util.Collection<GlobalNetwork> globalNetworks) {
        if (globalNetworks == null) {
            this.globalNetworks = null;
            return;
        }

        this.globalNetworks = new java.util.ArrayList<GlobalNetwork>(globalNetworks);
    }

    /**
     * <p>
     * Information about the global networks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalNetworks(java.util.Collection)} or {@link #withGlobalNetworks(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param globalNetworks
     *        Information about the global networks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalNetworksResult withGlobalNetworks(GlobalNetwork... globalNetworks) {
        if (this.globalNetworks == null) {
            setGlobalNetworks(new java.util.ArrayList<GlobalNetwork>(globalNetworks.length));
        }
        for (GlobalNetwork ele : globalNetworks) {
            this.globalNetworks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the global networks.
     * </p>
     * 
     * @param globalNetworks
     *        Information about the global networks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalNetworksResult withGlobalNetworks(java.util.Collection<GlobalNetwork> globalNetworks) {
        setGlobalNetworks(globalNetworks);
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

    public DescribeGlobalNetworksResult withNextToken(String nextToken) {
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
        if (getGlobalNetworks() != null)
            sb.append("GlobalNetworks: ").append(getGlobalNetworks()).append(",");
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

        if (obj instanceof DescribeGlobalNetworksResult == false)
            return false;
        DescribeGlobalNetworksResult other = (DescribeGlobalNetworksResult) obj;
        if (other.getGlobalNetworks() == null ^ this.getGlobalNetworks() == null)
            return false;
        if (other.getGlobalNetworks() != null && other.getGlobalNetworks().equals(this.getGlobalNetworks()) == false)
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

        hashCode = prime * hashCode + ((getGlobalNetworks() == null) ? 0 : getGlobalNetworks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGlobalNetworksResult clone() {
        try {
            return (DescribeGlobalNetworksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
