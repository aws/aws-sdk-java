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
package com.amazonaws.services.iotsecuretunneling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/ListTunnels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTunnelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A short description of the tunnels in an AWS account.
     * </p>
     */
    private java.util.List<TunnelSummary> tunnelSummaries;
    /**
     * <p>
     * A token to used to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A short description of the tunnels in an AWS account.
     * </p>
     * 
     * @return A short description of the tunnels in an AWS account.
     */

    public java.util.List<TunnelSummary> getTunnelSummaries() {
        return tunnelSummaries;
    }

    /**
     * <p>
     * A short description of the tunnels in an AWS account.
     * </p>
     * 
     * @param tunnelSummaries
     *        A short description of the tunnels in an AWS account.
     */

    public void setTunnelSummaries(java.util.Collection<TunnelSummary> tunnelSummaries) {
        if (tunnelSummaries == null) {
            this.tunnelSummaries = null;
            return;
        }

        this.tunnelSummaries = new java.util.ArrayList<TunnelSummary>(tunnelSummaries);
    }

    /**
     * <p>
     * A short description of the tunnels in an AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTunnelSummaries(java.util.Collection)} or {@link #withTunnelSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param tunnelSummaries
     *        A short description of the tunnels in an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTunnelsResult withTunnelSummaries(TunnelSummary... tunnelSummaries) {
        if (this.tunnelSummaries == null) {
            setTunnelSummaries(new java.util.ArrayList<TunnelSummary>(tunnelSummaries.length));
        }
        for (TunnelSummary ele : tunnelSummaries) {
            this.tunnelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A short description of the tunnels in an AWS account.
     * </p>
     * 
     * @param tunnelSummaries
     *        A short description of the tunnels in an AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTunnelsResult withTunnelSummaries(java.util.Collection<TunnelSummary> tunnelSummaries) {
        setTunnelSummaries(tunnelSummaries);
        return this;
    }

    /**
     * <p>
     * A token to used to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to used to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to used to retrieve the next set of results.
     * </p>
     * 
     * @return A token to used to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to used to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to used to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTunnelsResult withNextToken(String nextToken) {
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
        if (getTunnelSummaries() != null)
            sb.append("TunnelSummaries: ").append(getTunnelSummaries()).append(",");
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

        if (obj instanceof ListTunnelsResult == false)
            return false;
        ListTunnelsResult other = (ListTunnelsResult) obj;
        if (other.getTunnelSummaries() == null ^ this.getTunnelSummaries() == null)
            return false;
        if (other.getTunnelSummaries() != null && other.getTunnelSummaries().equals(this.getTunnelSummaries()) == false)
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

        hashCode = prime * hashCode + ((getTunnelSummaries() == null) ? 0 : getTunnelSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTunnelsResult clone() {
        try {
            return (ListTunnelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
