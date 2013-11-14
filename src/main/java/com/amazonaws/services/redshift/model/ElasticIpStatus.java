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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the status of the elastic IP (EIP) address.
 * </p>
 */
public class ElasticIpStatus implements Serializable {

    /**
     * The elastic IP (EIP) address for the cluster.
     */
    private String elasticIp;

    /**
     * Describes the status of the elastic IP (EIP) address.
     */
    private String status;

    /**
     * The elastic IP (EIP) address for the cluster.
     *
     * @return The elastic IP (EIP) address for the cluster.
     */
    public String getElasticIp() {
        return elasticIp;
    }
    
    /**
     * The elastic IP (EIP) address for the cluster.
     *
     * @param elasticIp The elastic IP (EIP) address for the cluster.
     */
    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }
    
    /**
     * The elastic IP (EIP) address for the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticIp The elastic IP (EIP) address for the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticIpStatus withElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }

    /**
     * Describes the status of the elastic IP (EIP) address.
     *
     * @return Describes the status of the elastic IP (EIP) address.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Describes the status of the elastic IP (EIP) address.
     *
     * @param status Describes the status of the elastic IP (EIP) address.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Describes the status of the elastic IP (EIP) address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Describes the status of the elastic IP (EIP) address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ElasticIpStatus withStatus(String status) {
        this.status = status;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ElasticIpStatus == false) return false;
        ElasticIpStatus other = (ElasticIpStatus)obj;
        
        if (other.getElasticIp() == null ^ this.getElasticIp() == null) return false;
        if (other.getElasticIp() != null && other.getElasticIp().equals(this.getElasticIp()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    