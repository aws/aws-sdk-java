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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ListKeyValueStores" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListKeyValueStoresResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resulting key value stores list.
     * </p>
     */
    private KeyValueStoreList keyValueStoreList;

    /**
     * <p>
     * The resulting key value stores list.
     * </p>
     * 
     * @param keyValueStoreList
     *        The resulting key value stores list.
     */

    public void setKeyValueStoreList(KeyValueStoreList keyValueStoreList) {
        this.keyValueStoreList = keyValueStoreList;
    }

    /**
     * <p>
     * The resulting key value stores list.
     * </p>
     * 
     * @return The resulting key value stores list.
     */

    public KeyValueStoreList getKeyValueStoreList() {
        return this.keyValueStoreList;
    }

    /**
     * <p>
     * The resulting key value stores list.
     * </p>
     * 
     * @param keyValueStoreList
     *        The resulting key value stores list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListKeyValueStoresResult withKeyValueStoreList(KeyValueStoreList keyValueStoreList) {
        setKeyValueStoreList(keyValueStoreList);
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
        if (getKeyValueStoreList() != null)
            sb.append("KeyValueStoreList: ").append(getKeyValueStoreList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKeyValueStoresResult == false)
            return false;
        ListKeyValueStoresResult other = (ListKeyValueStoresResult) obj;
        if (other.getKeyValueStoreList() == null ^ this.getKeyValueStoreList() == null)
            return false;
        if (other.getKeyValueStoreList() != null && other.getKeyValueStoreList().equals(this.getKeyValueStoreList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyValueStoreList() == null) ? 0 : getKeyValueStoreList().hashCode());
        return hashCode;
    }

    @Override
    public ListKeyValueStoresResult clone() {
        try {
            return (ListKeyValueStoresResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
