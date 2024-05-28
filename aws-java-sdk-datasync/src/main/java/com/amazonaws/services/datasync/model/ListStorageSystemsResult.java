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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListStorageSystems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStorageSystemsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Names ARNs) of the on-premises storage systems that you're using with DataSync Discovery.
     * </p>
     */
    private java.util.List<StorageSystemListEntry> storageSystems;
    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Names ARNs) of the on-premises storage systems that you're using with DataSync Discovery.
     * </p>
     * 
     * @return The Amazon Resource Names ARNs) of the on-premises storage systems that you're using with DataSync
     *         Discovery.
     */

    public java.util.List<StorageSystemListEntry> getStorageSystems() {
        return storageSystems;
    }

    /**
     * <p>
     * The Amazon Resource Names ARNs) of the on-premises storage systems that you're using with DataSync Discovery.
     * </p>
     * 
     * @param storageSystems
     *        The Amazon Resource Names ARNs) of the on-premises storage systems that you're using with DataSync
     *        Discovery.
     */

    public void setStorageSystems(java.util.Collection<StorageSystemListEntry> storageSystems) {
        if (storageSystems == null) {
            this.storageSystems = null;
            return;
        }

        this.storageSystems = new java.util.ArrayList<StorageSystemListEntry>(storageSystems);
    }

    /**
     * <p>
     * The Amazon Resource Names ARNs) of the on-premises storage systems that you're using with DataSync Discovery.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageSystems(java.util.Collection)} or {@link #withStorageSystems(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param storageSystems
     *        The Amazon Resource Names ARNs) of the on-premises storage systems that you're using with DataSync
     *        Discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageSystemsResult withStorageSystems(StorageSystemListEntry... storageSystems) {
        if (this.storageSystems == null) {
            setStorageSystems(new java.util.ArrayList<StorageSystemListEntry>(storageSystems.length));
        }
        for (StorageSystemListEntry ele : storageSystems) {
            this.storageSystems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names ARNs) of the on-premises storage systems that you're using with DataSync Discovery.
     * </p>
     * 
     * @param storageSystems
     *        The Amazon Resource Names ARNs) of the on-premises storage systems that you're using with DataSync
     *        Discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageSystemsResult withStorageSystems(java.util.Collection<StorageSystemListEntry> storageSystems) {
        setStorageSystems(storageSystems);
        return this;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        The opaque string that indicates the position to begin the next list of results in the response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @return The opaque string that indicates the position to begin the next list of results in the response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        The opaque string that indicates the position to begin the next list of results in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStorageSystemsResult withNextToken(String nextToken) {
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
        if (getStorageSystems() != null)
            sb.append("StorageSystems: ").append(getStorageSystems()).append(",");
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

        if (obj instanceof ListStorageSystemsResult == false)
            return false;
        ListStorageSystemsResult other = (ListStorageSystemsResult) obj;
        if (other.getStorageSystems() == null ^ this.getStorageSystems() == null)
            return false;
        if (other.getStorageSystems() != null && other.getStorageSystems().equals(this.getStorageSystems()) == false)
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

        hashCode = prime * hashCode + ((getStorageSystems() == null) ? 0 : getStorageSystems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListStorageSystemsResult clone() {
        try {
            return (ListStorageSystemsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
