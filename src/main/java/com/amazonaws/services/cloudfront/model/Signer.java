/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront.model;

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
        java.util.List<String> keyPairIdsCopy = new java.util.ArrayList<String>();
        if (keyPairIds != null) {
            keyPairIdsCopy.addAll(keyPairIds);
        }
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
        if (getKeyPairIds() == null) setKeyPairIds(new java.util.ArrayList<String>());
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
        java.util.List<String> keyPairIdsCopy = new java.util.ArrayList<String>();
        if (keyPairIds != null) {
            keyPairIdsCopy.addAll(keyPairIds);
        }
        this.keyPairIds = keyPairIdsCopy;

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
        sb.append("AwsAccountNumber: " + awsAccountNumber + ", ");
        sb.append("Self: " + self + ", ");
        sb.append("KeyPairIds: " + keyPairIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    