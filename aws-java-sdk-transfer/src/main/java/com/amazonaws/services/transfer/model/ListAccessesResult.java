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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListAccesses" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When you can get additional results from the <code>ListAccesses</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to the <code>NextToken</code> parameter to
     * continue listing additional accesses.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A system-assigned unique identifier for a server that has users assigned to it.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * Returns the accesses and their properties for the <code>ServerId</code> value that you specify.
     * </p>
     */
    private java.util.List<ListedAccess> accesses;

    /**
     * <p>
     * When you can get additional results from the <code>ListAccesses</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to the <code>NextToken</code> parameter to
     * continue listing additional accesses.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListAccesses</code> call, a <code>NextToken</code>
     *        parameter is returned in the output. You can then pass in a subsequent command to the
     *        <code>NextToken</code> parameter to continue listing additional accesses.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListAccesses</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to the <code>NextToken</code> parameter to
     * continue listing additional accesses.
     * </p>
     * 
     * @return When you can get additional results from the <code>ListAccesses</code> call, a <code>NextToken</code>
     *         parameter is returned in the output. You can then pass in a subsequent command to the
     *         <code>NextToken</code> parameter to continue listing additional accesses.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the <code>ListAccesses</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to the <code>NextToken</code> parameter to
     * continue listing additional accesses.
     * </p>
     * 
     * @param nextToken
     *        When you can get additional results from the <code>ListAccesses</code> call, a <code>NextToken</code>
     *        parameter is returned in the output. You can then pass in a subsequent command to the
     *        <code>NextToken</code> parameter to continue listing additional accesses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server that has users assigned to it.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a server that has users assigned to it.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server that has users assigned to it.
     * </p>
     * 
     * @return A system-assigned unique identifier for a server that has users assigned to it.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server that has users assigned to it.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a server that has users assigned to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessesResult withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * Returns the accesses and their properties for the <code>ServerId</code> value that you specify.
     * </p>
     * 
     * @return Returns the accesses and their properties for the <code>ServerId</code> value that you specify.
     */

    public java.util.List<ListedAccess> getAccesses() {
        return accesses;
    }

    /**
     * <p>
     * Returns the accesses and their properties for the <code>ServerId</code> value that you specify.
     * </p>
     * 
     * @param accesses
     *        Returns the accesses and their properties for the <code>ServerId</code> value that you specify.
     */

    public void setAccesses(java.util.Collection<ListedAccess> accesses) {
        if (accesses == null) {
            this.accesses = null;
            return;
        }

        this.accesses = new java.util.ArrayList<ListedAccess>(accesses);
    }

    /**
     * <p>
     * Returns the accesses and their properties for the <code>ServerId</code> value that you specify.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccesses(java.util.Collection)} or {@link #withAccesses(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accesses
     *        Returns the accesses and their properties for the <code>ServerId</code> value that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessesResult withAccesses(ListedAccess... accesses) {
        if (this.accesses == null) {
            setAccesses(new java.util.ArrayList<ListedAccess>(accesses.length));
        }
        for (ListedAccess ele : accesses) {
            this.accesses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the accesses and their properties for the <code>ServerId</code> value that you specify.
     * </p>
     * 
     * @param accesses
     *        Returns the accesses and their properties for the <code>ServerId</code> value that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessesResult withAccesses(java.util.Collection<ListedAccess> accesses) {
        setAccesses(accesses);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getAccesses() != null)
            sb.append("Accesses: ").append(getAccesses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccessesResult == false)
            return false;
        ListAccessesResult other = (ListAccessesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getAccesses() == null ^ this.getAccesses() == null)
            return false;
        if (other.getAccesses() != null && other.getAccesses().equals(this.getAccesses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getAccesses() == null) ? 0 : getAccesses().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessesResult clone() {
        try {
            return (ListAccessesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
