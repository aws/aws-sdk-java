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
 * An AWS DevPay product code.
 * </p>
 */
public class ProductCode {

    /**
     * The unique ID of an AWS DevPay product code.
     */
    private String productCodeId;

    /**
     * The unique ID of an AWS DevPay product code.
     *
     * @return The unique ID of an AWS DevPay product code.
     */
    public String getProductCodeId() {
        return productCodeId;
    }
    
    /**
     * The unique ID of an AWS DevPay product code.
     *
     * @param productCodeId The unique ID of an AWS DevPay product code.
     */
    public void setProductCodeId(String productCodeId) {
        this.productCodeId = productCodeId;
    }
    
    /**
     * The unique ID of an AWS DevPay product code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodeId The unique ID of an AWS DevPay product code.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ProductCode withProductCodeId(String productCodeId) {
        this.productCodeId = productCodeId;
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
        
        sb.append("ProductCodeId: " + productCodeId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    