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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#authorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest) AuthorizeCacheSecurityGroupIngress operation}.
 * <p>
 * The <i>AuthorizeCacheSecurityGroupIngress</i> operation allows network ingress to a cache security group. Applications using ElastiCache must be
 * running on Amazon EC2, and Amazon EC2 security groups are used as the authorization mechanism.
 * </p>
 * <p>
 * <b>NOTE:</b> You cannot authorize ingress from an Amazon EC2 security group in one Region to an ElastiCache cluster in another Region.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#authorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest)
 */
public class AuthorizeCacheSecurityGroupIngressRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The cache security group which will allow network ingress.
     */
    private String cacheSecurityGroupName;

    /**
     * The Amazon EC2 security group to be authorized for ingress to the
     * cache security group.
     */
    private String eC2SecurityGroupName;

    /**
     * The AWS account number of the Amazon EC2 security group owner. Note
     * that this is not the same thing as an AWS access key ID - you must
     * provide a valid AWS account number for this parameter.
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * Default constructor for a new AuthorizeCacheSecurityGroupIngressRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AuthorizeCacheSecurityGroupIngressRequest() {}
    
    /**
     * Constructs a new AuthorizeCacheSecurityGroupIngressRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheSecurityGroupName The cache security group which will
     * allow network ingress.
     * @param eC2SecurityGroupName The Amazon EC2 security group to be
     * authorized for ingress to the cache security group.
     * @param eC2SecurityGroupOwnerId The AWS account number of the Amazon
     * EC2 security group owner. Note that this is not the same thing as an
     * AWS access key ID - you must provide a valid AWS account number for
     * this parameter.
     */
    public AuthorizeCacheSecurityGroupIngressRequest(String cacheSecurityGroupName, String eC2SecurityGroupName, String eC2SecurityGroupOwnerId) {
        setCacheSecurityGroupName(cacheSecurityGroupName);
        setEC2SecurityGroupName(eC2SecurityGroupName);
        setEC2SecurityGroupOwnerId(eC2SecurityGroupOwnerId);
    }

    /**
     * The cache security group which will allow network ingress.
     *
     * @return The cache security group which will allow network ingress.
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }
    
    /**
     * The cache security group which will allow network ingress.
     *
     * @param cacheSecurityGroupName The cache security group which will allow network ingress.
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }
    
    /**
     * The cache security group which will allow network ingress.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupName The cache security group which will allow network ingress.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AuthorizeCacheSecurityGroupIngressRequest withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }

    /**
     * The Amazon EC2 security group to be authorized for ingress to the
     * cache security group.
     *
     * @return The Amazon EC2 security group to be authorized for ingress to the
     *         cache security group.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * The Amazon EC2 security group to be authorized for ingress to the
     * cache security group.
     *
     * @param eC2SecurityGroupName The Amazon EC2 security group to be authorized for ingress to the
     *         cache security group.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * The Amazon EC2 security group to be authorized for ingress to the
     * cache security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName The Amazon EC2 security group to be authorized for ingress to the
     *         cache security group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AuthorizeCacheSecurityGroupIngressRequest withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * The AWS account number of the Amazon EC2 security group owner. Note
     * that this is not the same thing as an AWS access key ID - you must
     * provide a valid AWS account number for this parameter.
     *
     * @return The AWS account number of the Amazon EC2 security group owner. Note
     *         that this is not the same thing as an AWS access key ID - you must
     *         provide a valid AWS account number for this parameter.
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS account number of the Amazon EC2 security group owner. Note
     * that this is not the same thing as an AWS access key ID - you must
     * provide a valid AWS account number for this parameter.
     *
     * @param eC2SecurityGroupOwnerId The AWS account number of the Amazon EC2 security group owner. Note
     *         that this is not the same thing as an AWS access key ID - you must
     *         provide a valid AWS account number for this parameter.
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * The AWS account number of the Amazon EC2 security group owner. Note
     * that this is not the same thing as an AWS access key ID - you must
     * provide a valid AWS account number for this parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId The AWS account number of the Amazon EC2 security group owner. Note
     *         that this is not the same thing as an AWS access key ID - you must
     *         provide a valid AWS account number for this parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AuthorizeCacheSecurityGroupIngressRequest withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
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
        if (getCacheSecurityGroupName() != null) sb.append("CacheSecurityGroupName: " + getCacheSecurityGroupName() + ",");
        if (getEC2SecurityGroupName() != null) sb.append("EC2SecurityGroupName: " + getEC2SecurityGroupName() + ",");
        if (getEC2SecurityGroupOwnerId() != null) sb.append("EC2SecurityGroupOwnerId: " + getEC2SecurityGroupOwnerId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheSecurityGroupName() == null) ? 0 : getCacheSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupName() == null) ? 0 : getEC2SecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupOwnerId() == null) ? 0 : getEC2SecurityGroupOwnerId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AuthorizeCacheSecurityGroupIngressRequest == false) return false;
        AuthorizeCacheSecurityGroupIngressRequest other = (AuthorizeCacheSecurityGroupIngressRequest)obj;
        
        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null) return false;
        if (other.getCacheSecurityGroupName() != null && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false) return false; 
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null) return false;
        if (other.getEC2SecurityGroupName() != null && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false) return false; 
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null) return false;
        if (other.getEC2SecurityGroupOwnerId() != null && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false) return false; 
        return true;
    }
    
}
    