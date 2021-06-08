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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetManagedPrefixListEntriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the prefix list entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PrefixListEntry> entries;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the prefix list entries.
     * </p>
     * 
     * @return Information about the prefix list entries.
     */

    public java.util.List<PrefixListEntry> getEntries() {
        if (entries == null) {
            entries = new com.amazonaws.internal.SdkInternalList<PrefixListEntry>();
        }
        return entries;
    }

    /**
     * <p>
     * Information about the prefix list entries.
     * </p>
     * 
     * @param entries
     *        Information about the prefix list entries.
     */

    public void setEntries(java.util.Collection<PrefixListEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new com.amazonaws.internal.SdkInternalList<PrefixListEntry>(entries);
    }

    /**
     * <p>
     * Information about the prefix list entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        Information about the prefix list entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedPrefixListEntriesResult withEntries(PrefixListEntry... entries) {
        if (this.entries == null) {
            setEntries(new com.amazonaws.internal.SdkInternalList<PrefixListEntry>(entries.length));
        }
        for (PrefixListEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the prefix list entries.
     * </p>
     * 
     * @param entries
     *        Information about the prefix list entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetManagedPrefixListEntriesResult withEntries(java.util.Collection<PrefixListEntry> entries) {
        setEntries(entries);
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

    public GetManagedPrefixListEntriesResult withNextToken(String nextToken) {
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries()).append(",");
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

        if (obj instanceof GetManagedPrefixListEntriesResult == false)
            return false;
        GetManagedPrefixListEntriesResult other = (GetManagedPrefixListEntriesResult) obj;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
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

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetManagedPrefixListEntriesResult clone() {
        try {
            return (GetManagedPrefixListEntriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
