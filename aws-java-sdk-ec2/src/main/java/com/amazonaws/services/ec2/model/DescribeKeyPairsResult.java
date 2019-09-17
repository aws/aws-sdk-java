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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeKeyPairsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the key pairs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<KeyPairInfo> keyPairs;

    /**
     * <p>
     * Information about the key pairs.
     * </p>
     * 
     * @return Information about the key pairs.
     */

    public java.util.List<KeyPairInfo> getKeyPairs() {
        if (keyPairs == null) {
            keyPairs = new com.amazonaws.internal.SdkInternalList<KeyPairInfo>();
        }
        return keyPairs;
    }

    /**
     * <p>
     * Information about the key pairs.
     * </p>
     * 
     * @param keyPairs
     *        Information about the key pairs.
     */

    public void setKeyPairs(java.util.Collection<KeyPairInfo> keyPairs) {
        if (keyPairs == null) {
            this.keyPairs = null;
            return;
        }

        this.keyPairs = new com.amazonaws.internal.SdkInternalList<KeyPairInfo>(keyPairs);
    }

    /**
     * <p>
     * Information about the key pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyPairs(java.util.Collection)} or {@link #withKeyPairs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param keyPairs
     *        Information about the key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyPairsResult withKeyPairs(KeyPairInfo... keyPairs) {
        if (this.keyPairs == null) {
            setKeyPairs(new com.amazonaws.internal.SdkInternalList<KeyPairInfo>(keyPairs.length));
        }
        for (KeyPairInfo ele : keyPairs) {
            this.keyPairs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the key pairs.
     * </p>
     * 
     * @param keyPairs
     *        Information about the key pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeKeyPairsResult withKeyPairs(java.util.Collection<KeyPairInfo> keyPairs) {
        setKeyPairs(keyPairs);
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
            sb.append("KeyPairs: ").append(getKeyPairs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyPairsResult == false)
            return false;
        DescribeKeyPairsResult other = (DescribeKeyPairsResult) obj;
        if (other.getKeyPairs() == null ^ this.getKeyPairs() == null)
            return false;
        if (other.getKeyPairs() != null && other.getKeyPairs().equals(this.getKeyPairs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPairs() == null) ? 0 : getKeyPairs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKeyPairsResult clone() {
        try {
            return (DescribeKeyPairsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
