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
package com.amazonaws.services.simpleemail.model;

/**
 * <p>
 * Represents a list of all the email addresses verified for the current
 * user.
 * </p>
 */
public class ListVerifiedEmailAddressesResult {

    private java.util.List<String> verifiedEmailAddresses;

    /**
     * Returns the value of the VerifiedEmailAddresses property for this
     * object.
     *
     * @return The value of the VerifiedEmailAddresses property for this object.
     */
    public java.util.List<String> getVerifiedEmailAddresses() {
        if (verifiedEmailAddresses == null) {
            verifiedEmailAddresses = new java.util.ArrayList<String>();
        }
        return verifiedEmailAddresses;
    }
    
    /**
     * Sets the value of the VerifiedEmailAddresses property for this object.
     *
     * @param verifiedEmailAddresses The new value for the VerifiedEmailAddresses property for this object.
     */
    public void setVerifiedEmailAddresses(java.util.Collection<String> verifiedEmailAddresses) {
        java.util.List<String> verifiedEmailAddressesCopy = new java.util.ArrayList<String>();
        if (verifiedEmailAddresses != null) {
            verifiedEmailAddressesCopy.addAll(verifiedEmailAddresses);
        }
        this.verifiedEmailAddresses = verifiedEmailAddressesCopy;
    }
    
    /**
     * Sets the value of the VerifiedEmailAddresses property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param verifiedEmailAddresses The new value for the VerifiedEmailAddresses property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListVerifiedEmailAddressesResult withVerifiedEmailAddresses(String... verifiedEmailAddresses) {
        for (String value : verifiedEmailAddresses) {
            getVerifiedEmailAddresses().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the VerifiedEmailAddresses property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param verifiedEmailAddresses The new value for the VerifiedEmailAddresses property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListVerifiedEmailAddressesResult withVerifiedEmailAddresses(java.util.Collection<String> verifiedEmailAddresses) {
        java.util.List<String> verifiedEmailAddressesCopy = new java.util.ArrayList<String>();
        if (verifiedEmailAddresses != null) {
            verifiedEmailAddressesCopy.addAll(verifiedEmailAddresses);
        }
        this.verifiedEmailAddresses = verifiedEmailAddressesCopy;

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
        sb.append("VerifiedEmailAddresses: " + verifiedEmailAddresses + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    