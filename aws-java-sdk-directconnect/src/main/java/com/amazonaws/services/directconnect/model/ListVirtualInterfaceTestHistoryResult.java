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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ListVirtualInterfaceTestHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVirtualInterfaceTestHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VirtualInterfaceTestHistory> virtualInterfaceTestHistory;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     * 
     * @return The ID of the tested virtual interface.
     */

    public java.util.List<VirtualInterfaceTestHistory> getVirtualInterfaceTestHistory() {
        if (virtualInterfaceTestHistory == null) {
            virtualInterfaceTestHistory = new com.amazonaws.internal.SdkInternalList<VirtualInterfaceTestHistory>();
        }
        return virtualInterfaceTestHistory;
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     * 
     * @param virtualInterfaceTestHistory
     *        The ID of the tested virtual interface.
     */

    public void setVirtualInterfaceTestHistory(java.util.Collection<VirtualInterfaceTestHistory> virtualInterfaceTestHistory) {
        if (virtualInterfaceTestHistory == null) {
            this.virtualInterfaceTestHistory = null;
            return;
        }

        this.virtualInterfaceTestHistory = new com.amazonaws.internal.SdkInternalList<VirtualInterfaceTestHistory>(virtualInterfaceTestHistory);
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVirtualInterfaceTestHistory(java.util.Collection)} or
     * {@link #withVirtualInterfaceTestHistory(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param virtualInterfaceTestHistory
     *        The ID of the tested virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualInterfaceTestHistoryResult withVirtualInterfaceTestHistory(VirtualInterfaceTestHistory... virtualInterfaceTestHistory) {
        if (this.virtualInterfaceTestHistory == null) {
            setVirtualInterfaceTestHistory(new com.amazonaws.internal.SdkInternalList<VirtualInterfaceTestHistory>(virtualInterfaceTestHistory.length));
        }
        for (VirtualInterfaceTestHistory ele : virtualInterfaceTestHistory) {
            this.virtualInterfaceTestHistory.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the tested virtual interface.
     * </p>
     * 
     * @param virtualInterfaceTestHistory
     *        The ID of the tested virtual interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualInterfaceTestHistoryResult withVirtualInterfaceTestHistory(java.util.Collection<VirtualInterfaceTestHistory> virtualInterfaceTestHistory) {
        setVirtualInterfaceTestHistory(virtualInterfaceTestHistory);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVirtualInterfaceTestHistoryResult withNextToken(String nextToken) {
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
        if (getVirtualInterfaceTestHistory() != null)
            sb.append("VirtualInterfaceTestHistory: ").append(getVirtualInterfaceTestHistory()).append(",");
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

        if (obj instanceof ListVirtualInterfaceTestHistoryResult == false)
            return false;
        ListVirtualInterfaceTestHistoryResult other = (ListVirtualInterfaceTestHistoryResult) obj;
        if (other.getVirtualInterfaceTestHistory() == null ^ this.getVirtualInterfaceTestHistory() == null)
            return false;
        if (other.getVirtualInterfaceTestHistory() != null && other.getVirtualInterfaceTestHistory().equals(this.getVirtualInterfaceTestHistory()) == false)
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

        hashCode = prime * hashCode + ((getVirtualInterfaceTestHistory() == null) ? 0 : getVirtualInterfaceTestHistory().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListVirtualInterfaceTestHistoryResult clone() {
        try {
            return (ListVirtualInterfaceTestHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
