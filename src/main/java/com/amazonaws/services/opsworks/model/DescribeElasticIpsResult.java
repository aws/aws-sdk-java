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


/**
 * <p>
 * Contains the response to a <code>DescribeElasticIps</code> request.
 * </p>
 */
public class DescribeElasticIpsResult implements Serializable {

    /**
     * An <code>ElasticIps</code> object that describes the specified Elastic
     * IP addresses.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ElasticIp> elasticIps;

    /**
     * An <code>ElasticIps</code> object that describes the specified Elastic
     * IP addresses.
     *
     * @return An <code>ElasticIps</code> object that describes the specified Elastic
     *         IP addresses.
     */
    public java.util.List<ElasticIp> getElasticIps() {
        if (elasticIps == null) {
              elasticIps = new com.amazonaws.internal.ListWithAutoConstructFlag<ElasticIp>();
              elasticIps.setAutoConstruct(true);
        }
        return elasticIps;
    }
    
    /**
     * An <code>ElasticIps</code> object that describes the specified Elastic
     * IP addresses.
     *
     * @param elasticIps An <code>ElasticIps</code> object that describes the specified Elastic
     *         IP addresses.
     */
    public void setElasticIps(java.util.Collection<ElasticIp> elasticIps) {
        if (elasticIps == null) {
            this.elasticIps = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ElasticIp> elasticIpsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ElasticIp>(elasticIps.size());
        elasticIpsCopy.addAll(elasticIps);
        this.elasticIps = elasticIpsCopy;
    }
    
    /**
     * An <code>ElasticIps</code> object that describes the specified Elastic
     * IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticIps An <code>ElasticIps</code> object that describes the specified Elastic
     *         IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeElasticIpsResult withElasticIps(ElasticIp... elasticIps) {
        if (getElasticIps() == null) setElasticIps(new java.util.ArrayList<ElasticIp>(elasticIps.length));
        for (ElasticIp value : elasticIps) {
            getElasticIps().add(value);
        }
        return this;
    }
    
    /**
     * An <code>ElasticIps</code> object that describes the specified Elastic
     * IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elasticIps An <code>ElasticIps</code> object that describes the specified Elastic
     *         IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeElasticIpsResult withElasticIps(java.util.Collection<ElasticIp> elasticIps) {
        if (elasticIps == null) {
            this.elasticIps = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ElasticIp> elasticIpsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ElasticIp>(elasticIps.size());
            elasticIpsCopy.addAll(elasticIps);
            this.elasticIps = elasticIpsCopy;
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
        if (getElasticIps() != null) sb.append("ElasticIps: " + getElasticIps() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getElasticIps() == null) ? 0 : getElasticIps().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeElasticIpsResult == false) return false;
        DescribeElasticIpsResult other = (DescribeElasticIpsResult)obj;
        
        if (other.getElasticIps() == null ^ this.getElasticIps() == null) return false;
        if (other.getElasticIps() != null && other.getElasticIps().equals(this.getElasticIps()) == false) return false; 
        return true;
    }
    
}
    