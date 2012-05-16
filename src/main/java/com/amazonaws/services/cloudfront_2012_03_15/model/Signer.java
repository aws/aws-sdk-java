/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront_2012_03_15.model;

/**
 * Signer
 */
public class Signer {

    private String awsAccountNumber;

    private String self;

    private java.util.List<String> keyPairIds;

    /**
     * Default constructor for a new Signer object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Signer() {}
    
    /**
     * Returns the value of the AwsAccountNumber property for this object.
     *
     * @return The value of the AwsAccountNumber property for this object.
     */
    public String getAwsAccountNumber() {
        return awsAccountNumber;
    }
    
    /**
     * Sets the value of the AwsAccountNumber property for this object.
     *
     * @param awsAccountNumber The new value for the AwsAccountNumber property for this object.
     */
    public void setAwsAccountNumber(String awsAccountNumber) {
        this.awsAccountNumber = awsAccountNumber;
    }
    
    /**
     * Sets the value of the AwsAccountNumber property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param awsAccountNumber The new value for the AwsAccountNumber property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Signer withAwsAccountNumber(String awsAccountNumber) {
        this.awsAccountNumber = awsAccountNumber;
        return this;
    }
    
    
    /**
     * Returns the value of the Self property for this object.
     *
     * @return The value of the Self property for this object.
     */
    public String getSelf() {
        return self;
    }
    
    /**
     * Sets the value of the Self property for this object.
     *
     * @param self The new value for the Self property for this object.
     */
    public void setSelf(String self) {
        this.self = self;
    }
    
    /**
     * Sets the value of the Self property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param self The new value for the Self property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Signer withSelf(String self) {
        this.self = self;
        return this;
    }
    
    
    /**
     * Returns the value of the KeyPairIds property for this object.
     *
     * @return The value of the KeyPairIds property for this object.
     */
    public java.util.List<String> getKeyPairIds() {
        
        if (keyPairIds == null) {
            keyPairIds = new java.util.ArrayList<String>();
        }
        return keyPairIds;
    }
    
    /**
     * Sets the value of the KeyPairIds property for this object.
     *
     * @param keyPairIds The new value for the KeyPairIds property for this object.
     */
    public void setKeyPairIds(java.util.Collection<String> keyPairIds) {
        if (keyPairIds == null) {
            this.keyPairIds = null;
            return;
        }

        java.util.List<String> keyPairIdsCopy = new java.util.ArrayList<String>(keyPairIds.size());
        keyPairIdsCopy.addAll(keyPairIds);
        this.keyPairIds = keyPairIdsCopy;
    }
    
    /**
     * Sets the value of the KeyPairIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyPairIds The new value for the KeyPairIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Signer withKeyPairIds(String... keyPairIds) {
        if (getKeyPairIds() == null) setKeyPairIds(new java.util.ArrayList<String>(keyPairIds.length));
        for (String value : keyPairIds) {
            getKeyPairIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the KeyPairIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyPairIds The new value for the KeyPairIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Signer withKeyPairIds(java.util.Collection<String> keyPairIds) {
        if (keyPairIds == null) {
            this.keyPairIds = null;
        } else {
            java.util.List<String> keyPairIdsCopy = new java.util.ArrayList<String>(keyPairIds.size());
            keyPairIdsCopy.addAll(keyPairIds);
            this.keyPairIds = keyPairIdsCopy;
        }

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
        if (awsAccountNumber != null) sb.append("AwsAccountNumber: " + awsAccountNumber + ", ");
        if (self != null) sb.append("Self: " + self + ", ");
        if (keyPairIds != null) sb.append("KeyPairIds: " + keyPairIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAwsAccountNumber() == null) ? 0 : getAwsAccountNumber().hashCode()); 
        hashCode = prime * hashCode + ((getSelf() == null) ? 0 : getSelf().hashCode()); 
        hashCode = prime * hashCode + ((getKeyPairIds() == null) ? 0 : getKeyPairIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof Signer == false) return false;
        Signer other = (Signer)obj;
        
        if (other.getAwsAccountNumber() == null ^ this.getAwsAccountNumber() == null) return false;
        if (other.getAwsAccountNumber() != null && other.getAwsAccountNumber().equals(this.getAwsAccountNumber()) == false) return false; 
        if (other.getSelf() == null ^ this.getSelf() == null) return false;
        if (other.getSelf() != null && other.getSelf().equals(this.getSelf()) == false) return false; 
        if (other.getKeyPairIds() == null ^ this.getKeyPairIds() == null) return false;
        if (other.getKeyPairIds() != null && other.getKeyPairIds().equals(this.getKeyPairIds()) == false) return false; 
        return true;
    }
    
}
    
