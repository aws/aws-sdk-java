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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to verify whether an Amazon DevPay product code is
 * associated with an instance.
 * </p>
 * <p>
 * This can only be executed by the owner of the AMI and is useful when
 * an AMI owner wants to verify whether a user's instance is eligible for
 * support.
 * </p>
 */
public class ConfirmProductInstanceRequest extends AmazonWebServiceRequest {
        
    /**
     * The product code to confirm.
     */
    private String productCode;

    /**
     * The ID of the instance to confirm.
     */
    private String instanceId;

    /**
     * The product code to confirm.
     *
     * @return The product code to confirm.
     */
    public String getProductCode() {
        return productCode;
    }
    
    /**
     * The product code to confirm.
     *
     * @param productCode The product code to confirm.
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    
    /**
     * The product code to confirm.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCode The product code to confirm.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ConfirmProductInstanceRequest withProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    
    
    /**
     * The ID of the instance to confirm.
     *
     * @return The ID of the instance to confirm.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance to confirm.
     *
     * @param instanceId The ID of the instance to confirm.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance to confirm.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance to confirm.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ConfirmProductInstanceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
}
    