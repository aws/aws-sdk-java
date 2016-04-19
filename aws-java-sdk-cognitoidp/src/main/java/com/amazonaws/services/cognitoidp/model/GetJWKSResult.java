/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the response from the server to get JSON Web keys.
 * </p>
 */
public class GetJWKSResult implements Serializable, Cloneable {

    /**
     * <p>
     * The keys in a get JSON Web keys response.
     * </p>
     */
    private java.util.List<KeyType> keys;

    /**
     * <p>
     * The keys in a get JSON Web keys response.
     * </p>
     * 
     * @return The keys in a get JSON Web keys response.
     */

    public java.util.List<KeyType> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The keys in a get JSON Web keys response.
     * </p>
     * 
     * @param keys
     *        The keys in a get JSON Web keys response.
     */

    public void setKeys(java.util.Collection<KeyType> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<KeyType>(keys);
    }

    /**
     * <p>
     * The keys in a get JSON Web keys response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setKeys(java.util.Collection)} or
     * {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        The keys in a get JSON Web keys response.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetJWKSResult withKeys(KeyType... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<KeyType>(keys.length));
        }
        for (KeyType ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The keys in a get JSON Web keys response.
     * </p>
     * 
     * @param keys
     *        The keys in a get JSON Web keys response.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetJWKSResult withKeys(java.util.Collection<KeyType> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeys() != null)
            sb.append("Keys: " + getKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJWKSResult == false)
            return false;
        GetJWKSResult other = (GetJWKSResult) obj;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null
                && other.getKeys().equals(this.getKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeys() == null) ? 0 : getKeys().hashCode());
        return hashCode;
    }

    @Override
    public GetJWKSResult clone() {
        try {
            return (GetJWKSResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
