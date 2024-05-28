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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateKeyValueStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKeyValueStoreResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The resulting key value store to update.
     * </p>
     */
    private KeyValueStore keyValueStore;
    /**
     * <p>
     * The <code>ETag</code> of the resulting key value store.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The resulting key value store to update.
     * </p>
     * 
     * @param keyValueStore
     *        The resulting key value store to update.
     */

    public void setKeyValueStore(KeyValueStore keyValueStore) {
        this.keyValueStore = keyValueStore;
    }

    /**
     * <p>
     * The resulting key value store to update.
     * </p>
     * 
     * @return The resulting key value store to update.
     */

    public KeyValueStore getKeyValueStore() {
        return this.keyValueStore;
    }

    /**
     * <p>
     * The resulting key value store to update.
     * </p>
     * 
     * @param keyValueStore
     *        The resulting key value store to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyValueStoreResult withKeyValueStore(KeyValueStore keyValueStore) {
        setKeyValueStore(keyValueStore);
        return this;
    }

    /**
     * <p>
     * The <code>ETag</code> of the resulting key value store.
     * </p>
     * 
     * @param eTag
     *        The <code>ETag</code> of the resulting key value store.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The <code>ETag</code> of the resulting key value store.
     * </p>
     * 
     * @return The <code>ETag</code> of the resulting key value store.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The <code>ETag</code> of the resulting key value store.
     * </p>
     * 
     * @param eTag
     *        The <code>ETag</code> of the resulting key value store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKeyValueStoreResult withETag(String eTag) {
        setETag(eTag);
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
        if (getKeyValueStore() != null)
            sb.append("KeyValueStore: ").append(getKeyValueStore()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKeyValueStoreResult == false)
            return false;
        UpdateKeyValueStoreResult other = (UpdateKeyValueStoreResult) obj;
        if (other.getKeyValueStore() == null ^ this.getKeyValueStore() == null)
            return false;
        if (other.getKeyValueStore() != null && other.getKeyValueStore().equals(this.getKeyValueStore()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyValueStore() == null) ? 0 : getKeyValueStore().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKeyValueStoreResult clone() {
        try {
            return (UpdateKeyValueStoreResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
