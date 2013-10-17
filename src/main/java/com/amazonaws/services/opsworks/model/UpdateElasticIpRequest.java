/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#updateElasticIp(UpdateElasticIpRequest) UpdateElasticIp operation}.
 * <p>
 * Updates a registered Elastic IP address's name. For more information, see <a
 * href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> </a> .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#updateElasticIp(UpdateElasticIpRequest)
 */
public class UpdateElasticIpRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The address.
     */
    private String elasticIp;

    /**
     * The new name.
     */
    private String name;

    /**
     * The address.
     *
     * @return The address.
     */
    public String getElasticIp() {
        return elasticIp;
    }
    
    /**
     * The address.
     *
     * @param elasticIp The address.
     */
    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }
    
    /**
     * The address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticIp The address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateElasticIpRequest withElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * The new name.
     *
     * @return The new name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The new name.
     *
     * @param name The new name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The new name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The new name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateElasticIpRequest withName(String name) {
        this.name = name;
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
        if (getElasticIp() != null) sb.append("ElasticIp: " + getElasticIp() + ",");
        if (getName() != null) sb.append("Name: " + getName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateElasticIpRequest == false) return false;
        UpdateElasticIpRequest other = (UpdateElasticIpRequest)obj;
        
        if (other.getElasticIp() == null ^ this.getElasticIp() == null) return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        return true;
    }
    
}
    