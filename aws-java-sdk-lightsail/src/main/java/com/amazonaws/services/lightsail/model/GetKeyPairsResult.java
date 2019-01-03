/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetKeyPairs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKeyPairsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of key-value pairs containing information about the key pairs.
     * </p>
     */
    private java.util.List<KeyPair> keyPairs;
    /**
     * <p>
     * A token used for advancing to the next page of results from your get key pairs request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * An array of key-value pairs containing information about the key pairs.
     * </p>
     * 
     * @return An array of key-value pairs containing information about the key pairs.
     */

    public java.util.List<KeyPair> getKeyPairs() {
        return keyPairs;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the key pairs.
     * </p>
     * 
     * @param keyPairs
     *        An array of key-value pairs containing information about the key pairs.
     */

    public void setKeyPairs(java.util.Collection<KeyPair> keyPairs) {
        if (keyPairs == null) {
            this.keyPairs = null;
            return;
        }

        this.keyPairs = new java.util.ArrayList<KeyPair>(keyPairs);
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the key pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyPairs(java.util.Collection)} or {@link #withKeyPairs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keyPairs
     *        An array of key-value pairs containing information about the key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyPairsResult withKeyPairs(KeyPair... keyPairs) {
        if (this.keyPairs == null) {
            setKeyPairs(new java.util.ArrayList<KeyPair>(keyPairs.length));
        }
        for (KeyPair ele : keyPairs) {
            this.keyPairs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs containing information about the key pairs.
     * </p>
     * 
     * @param keyPairs
     *        An array of key-value pairs containing information about the key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyPairsResult withKeyPairs(java.util.Collection<KeyPair> keyPairs) {
        setKeyPairs(keyPairs);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get key pairs request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get key pairs request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get key pairs request.
     * </p>
     * 
     * @return A token used for advancing to the next page of results from your get key pairs request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get key pairs request.
     * </p>
     * 
     * @param nextPageToken
     *        A token used for advancing to the next page of results from your get key pairs request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKeyPairsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getKeyPairs() != null)
            sb.append("KeyPairs: ").append(getKeyPairs()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKeyPairsResult == false)
            return false;
        GetKeyPairsResult other = (GetKeyPairsResult) obj;
        if (other.getKeyPairs() == null ^ this.getKeyPairs() == null)
            return false;
        if (other.getKeyPairs() != null && other.getKeyPairs().equals(this.getKeyPairs()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPairs() == null) ? 0 : getKeyPairs().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetKeyPairsResult clone() {
        try {
            return (GetKeyPairsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
