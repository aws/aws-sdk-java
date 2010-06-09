/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * The result of describing a user's key pairs.
 * </p>
 */
public class DescribeKeyPairsResult {

    /**
     * The list of described key pairs.
     */
    private java.util.List<KeyPairInfo> keyPairs;

    /**
     * The list of described key pairs.
     *
     * @return The list of described key pairs.
     */
    public java.util.List<KeyPairInfo> getKeyPairs() {
        if (keyPairs == null) {
            keyPairs = new java.util.ArrayList<KeyPairInfo>();
        }
        return keyPairs;
    }
    
    /**
     * The list of described key pairs.
     *
     * @param keyPairs The list of described key pairs.
     */
    public void setKeyPairs(java.util.Collection<KeyPairInfo> keyPairs) {
        java.util.List<KeyPairInfo> keyPairsCopy = new java.util.ArrayList<KeyPairInfo>();
        if (keyPairs != null) {
            keyPairsCopy.addAll(keyPairs);
        }
        this.keyPairs = keyPairsCopy;
    }
    
    /**
     * The list of described key pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyPairs The list of described key pairs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeKeyPairsResult withKeyPairs(KeyPairInfo... keyPairs) {
        for (KeyPairInfo value : keyPairs) {
            getKeyPairs().add(value);
        }
        return this;
    }
    
    /**
     * The list of described key pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyPairs The list of described key pairs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeKeyPairsResult withKeyPairs(java.util.Collection<KeyPairInfo> keyPairs) {
        java.util.List<KeyPairInfo> keyPairsCopy = new java.util.ArrayList<KeyPairInfo>();
        if (keyPairs != null) {
            keyPairsCopy.addAll(keyPairs);
        }
        this.keyPairs = keyPairsCopy;

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
        
        sb.append("KeyPairs: " + keyPairs + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    