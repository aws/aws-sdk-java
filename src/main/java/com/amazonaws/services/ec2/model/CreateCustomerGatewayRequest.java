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
 * Create Customer Gateway Request
 */
public class CreateCustomerGatewayRequest extends AmazonWebServiceRequest {
        
    private String type;

    private String publicIp;

    private Integer bgpAsn;

    /**
     * Returns the value of the Type property for this object.
     *
     * @return The value of the Type property for this object.
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     *
     * @param type The new value for the Type property for this object.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The new value for the Type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCustomerGatewayRequest withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * Returns the value of the PublicIp property for this object.
     *
     * @return The value of the PublicIp property for this object.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * Sets the value of the PublicIp property for this object.
     *
     * @param publicIp The new value for the PublicIp property for this object.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * Sets the value of the PublicIp property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The new value for the PublicIp property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCustomerGatewayRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    
    
    /**
     * Returns the value of the BgpAsn property for this object.
     *
     * @return The value of the BgpAsn property for this object.
     */
    public Integer getBgpAsn() {
        return bgpAsn;
    }
    
    /**
     * Sets the value of the BgpAsn property for this object.
     *
     * @param bgpAsn The new value for the BgpAsn property for this object.
     */
    public void setBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
    }
    
    /**
     * Sets the value of the BgpAsn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bgpAsn The new value for the BgpAsn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateCustomerGatewayRequest withBgpAsn(Integer bgpAsn) {
        this.bgpAsn = bgpAsn;
        return this;
    }
    
    
}
    