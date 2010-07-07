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
 * The result of describing an account's available Elastic IPs.
 * </p>
 */
public class DescribeAddressesResult {

    /**
     * The list of Elastic IPs.
     */
    private java.util.List<Address> addresses;

    /**
     * The list of Elastic IPs.
     *
     * @return The list of Elastic IPs.
     */
    public java.util.List<Address> getAddresses() {
        if (addresses == null) {
            addresses = new java.util.ArrayList<Address>();
        }
        return addresses;
    }
    
    /**
     * The list of Elastic IPs.
     *
     * @param addresses The list of Elastic IPs.
     */
    public void setAddresses(java.util.Collection<Address> addresses) {
        java.util.List<Address> addressesCopy = new java.util.ArrayList<Address>();
        if (addresses != null) {
            addressesCopy.addAll(addresses);
        }
        this.addresses = addressesCopy;
    }
    
    /**
     * The list of Elastic IPs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param addresses The list of Elastic IPs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesResult withAddresses(Address... addresses) {
        for (Address value : addresses) {
            getAddresses().add(value);
        }
        return this;
    }
    
    /**
     * The list of Elastic IPs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param addresses The list of Elastic IPs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesResult withAddresses(java.util.Collection<Address> addresses) {
        java.util.List<Address> addressesCopy = new java.util.ArrayList<Address>();
        if (addresses != null) {
            addressesCopy.addAll(addresses);
        }
        this.addresses = addressesCopy;

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
        sb.append("Addresses: " + addresses + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    