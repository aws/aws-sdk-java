/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#authorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest) AuthorizeCacheSecurityGroupIngress operation}.
 * <p>
 * Authorizes ingress to a CacheSecurityGroup using EC2 Security Groups as authorization (therefore the application using the cache must be running on
 * EC2 clusters). This API requires the following parameters: EC2SecurityGroupName and EC2SecurityGroupOwnerId.
 * </p>
 * <p>
 * <b>NOTE:</b> You cannot authorize ingress from an EC2 security group in one Region to an Amazon Cache Cluster in another.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#authorizeCacheSecurityGroupIngress(AuthorizeCacheSecurityGroupIngressRequest)
 */
public class AuthorizeCacheSecurityGroupIngressRequest extends AmazonWebServiceRequest {

    /**
     * The name of the Cache Security Group to authorize.
     */
    private String cacheSecurityGroupName;

    /**
     * Name of the EC2 Security Group to include in the authorization.
     */
    private String eC2SecurityGroupName;

    /**
     * AWS Account Number of the owner of the security group specified in the
     * EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     * acceptable value.
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
     * @param cacheSecurityGroupName The name of the Cache Security Group to
     * authorize.
     * @param eC2SecurityGroupName Name of the EC2 Security Group to include
     * in the authorization.
     * @param eC2SecurityGroupOwnerId AWS Account Number of the owner of the
     * security group specified in the EC2SecurityGroupName parameter. The
     * AWS Access Key ID is not an acceptable value.
     */
    public AuthorizeCacheSecurityGroupIngressRequest(String cacheSecurityGroupName, String eC2SecurityGroupName, String eC2SecurityGroupOwnerId) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    
    
    /**
     * The name of the Cache Security Group to authorize.
     *
     * @return The name of the Cache Security Group to authorize.
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }
    
    /**
     * The name of the Cache Security Group to authorize.
     *
     * @param cacheSecurityGroupName The name of the Cache Security Group to authorize.
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }
    
    /**
     * The name of the Cache Security Group to authorize.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupName The name of the Cache Security Group to authorize.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeCacheSecurityGroupIngressRequest withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }
    
    
    /**
     * Name of the EC2 Security Group to include in the authorization.
     *
     * @return Name of the EC2 Security Group to include in the authorization.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * Name of the EC2 Security Group to include in the authorization.
     *
     * @param eC2SecurityGroupName Name of the EC2 Security Group to include in the authorization.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * Name of the EC2 Security Group to include in the authorization.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName Name of the EC2 Security Group to include in the authorization.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AuthorizeCacheSecurityGroupIngressRequest withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }
    
    
    /**
     * AWS Account Number of the owner of the security group specified in the
     * EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     * acceptable value.
     *
     * @return AWS Account Number of the owner of the security group specified in the
     *         EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     *         acceptable value.
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * AWS Account Number of the owner of the security group specified in the
     * EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     * acceptable value.
     *
     * @param eC2SecurityGroupOwnerId AWS Account Number of the owner of the security group specified in the
     *         EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     *         acceptable value.
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * AWS Account Number of the owner of the security group specified in the
     * EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     * acceptable value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId AWS Account Number of the owner of the security group specified in the
     *         EC2SecurityGroupName parameter. The AWS Access Key ID is not an
     *         acceptable value.
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
        if (cacheSecurityGroupName != null) sb.append("CacheSecurityGroupName: " + cacheSecurityGroupName + ", ");
        if (eC2SecurityGroupName != null) sb.append("EC2SecurityGroupName: " + eC2SecurityGroupName + ", ");
        if (eC2SecurityGroupOwnerId != null) sb.append("EC2SecurityGroupOwnerId: " + eC2SecurityGroupOwnerId + ", ");
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
    