/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMacHostsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the EC2 Mac Dedicated Hosts.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MacHost> macHosts;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the EC2 Mac Dedicated Hosts.
     * </p>
     * 
     * @return Information about the EC2 Mac Dedicated Hosts.
     */

    public java.util.List<MacHost> getMacHosts() {
        if (macHosts == null) {
            macHosts = new com.amazonaws.internal.SdkInternalList<MacHost>();
        }
        return macHosts;
    }

    /**
     * <p>
     * Information about the EC2 Mac Dedicated Hosts.
     * </p>
     * 
     * @param macHosts
     *        Information about the EC2 Mac Dedicated Hosts.
     */

    public void setMacHosts(java.util.Collection<MacHost> macHosts) {
        if (macHosts == null) {
            this.macHosts = null;
            return;
        }

        this.macHosts = new com.amazonaws.internal.SdkInternalList<MacHost>(macHosts);
    }

    /**
     * <p>
     * Information about the EC2 Mac Dedicated Hosts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMacHosts(java.util.Collection)} or {@link #withMacHosts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param macHosts
     *        Information about the EC2 Mac Dedicated Hosts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMacHostsResult withMacHosts(MacHost... macHosts) {
        if (this.macHosts == null) {
            setMacHosts(new com.amazonaws.internal.SdkInternalList<MacHost>(macHosts.length));
        }
        for (MacHost ele : macHosts) {
            this.macHosts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Mac Dedicated Hosts.
     * </p>
     * 
     * @param macHosts
     *        Information about the EC2 Mac Dedicated Hosts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMacHostsResult withMacHosts(java.util.Collection<MacHost> macHosts) {
        setMacHosts(macHosts);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMacHostsResult withNextToken(String nextToken) {
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
        if (getMacHosts() != null)
            sb.append("MacHosts: ").append(getMacHosts()).append(",");
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

        if (obj instanceof DescribeMacHostsResult == false)
            return false;
        DescribeMacHostsResult other = (DescribeMacHostsResult) obj;
        if (other.getMacHosts() == null ^ this.getMacHosts() == null)
            return false;
        if (other.getMacHosts() != null && other.getMacHosts().equals(this.getMacHosts()) == false)
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

        hashCode = prime * hashCode + ((getMacHosts() == null) ? 0 : getMacHosts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMacHostsResult clone() {
        try {
            return (DescribeMacHostsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
