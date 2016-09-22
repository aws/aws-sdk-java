/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of the <a>ListHsms</a> operation.
 * </p>
 */
public class ListHsmsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of ARNs that identify the HSMs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hsmList;
    /**
     * <p>
     * If not null, more results are available. Pass this value to <a>ListHsms</a> to retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of ARNs that identify the HSMs.
     * </p>
     * 
     * @return The list of ARNs that identify the HSMs.
     */

    public java.util.List<String> getHsmList() {
        if (hsmList == null) {
            hsmList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hsmList;
    }

    /**
     * <p>
     * The list of ARNs that identify the HSMs.
     * </p>
     * 
     * @param hsmList
     *        The list of ARNs that identify the HSMs.
     */

    public void setHsmList(java.util.Collection<String> hsmList) {
        if (hsmList == null) {
            this.hsmList = null;
            return;
        }

        this.hsmList = new com.amazonaws.internal.SdkInternalList<String>(hsmList);
    }

    /**
     * <p>
     * The list of ARNs that identify the HSMs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHsmList(java.util.Collection)} or {@link #withHsmList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param hsmList
     *        The list of ARNs that identify the HSMs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHsmsResult withHsmList(String... hsmList) {
        if (this.hsmList == null) {
            setHsmList(new com.amazonaws.internal.SdkInternalList<String>(hsmList.length));
        }
        for (String ele : hsmList) {
            this.hsmList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of ARNs that identify the HSMs.
     * </p>
     * 
     * @param hsmList
     *        The list of ARNs that identify the HSMs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHsmsResult withHsmList(java.util.Collection<String> hsmList) {
        setHsmList(hsmList);
        return this;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value to <a>ListHsms</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value to <a>ListHsms</a> to retrieve the next set of
     *        items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value to <a>ListHsms</a> to retrieve the next set of items.
     * </p>
     * 
     * @return If not null, more results are available. Pass this value to <a>ListHsms</a> to retrieve the next set of
     *         items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value to <a>ListHsms</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value to <a>ListHsms</a> to retrieve the next set of
     *        items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHsmsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHsmList() != null)
            sb.append("HsmList: " + getHsmList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHsmsResult == false)
            return false;
        ListHsmsResult other = (ListHsmsResult) obj;
        if (other.getHsmList() == null ^ this.getHsmList() == null)
            return false;
        if (other.getHsmList() != null && other.getHsmList().equals(this.getHsmList()) == false)
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

        hashCode = prime * hashCode + ((getHsmList() == null) ? 0 : getHsmList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListHsmsResult clone() {
        try {
            return (ListHsmsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
