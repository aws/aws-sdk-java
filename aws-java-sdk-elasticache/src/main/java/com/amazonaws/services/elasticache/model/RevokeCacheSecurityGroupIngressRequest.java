/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>RevokeCacheSecurityGroupIngress</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/RevokeCacheSecurityGroupIngress"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeCacheSecurityGroupIngressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the cache security group to revoke ingress from.
     * </p>
     */
    private String cacheSecurityGroupName;
    /**
     * <p>
     * The name of the Amazon EC2 security group to revoke access from.
     * </p>
     */
    private String eC2SecurityGroupName;
    /**
     * <p>
     * The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an AWS
     * access key ID - you must provide a valid AWS account number for this parameter.
     * </p>
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * Default constructor for RevokeCacheSecurityGroupIngressRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public RevokeCacheSecurityGroupIngressRequest() {
    }

    /**
     * Constructs a new RevokeCacheSecurityGroupIngressRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param cacheSecurityGroupName
     *        The name of the cache security group to revoke ingress from.
     * @param eC2SecurityGroupName
     *        The name of the Amazon EC2 security group to revoke access from.
     * @param eC2SecurityGroupOwnerId
     *        The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an
     *        AWS access key ID - you must provide a valid AWS account number for this parameter.
     */
    public RevokeCacheSecurityGroupIngressRequest(String cacheSecurityGroupName, String eC2SecurityGroupName, String eC2SecurityGroupOwnerId) {
        setCacheSecurityGroupName(cacheSecurityGroupName);
        setEC2SecurityGroupName(eC2SecurityGroupName);
        setEC2SecurityGroupOwnerId(eC2SecurityGroupOwnerId);
    }

    /**
     * <p>
     * The name of the cache security group to revoke ingress from.
     * </p>
     * 
     * @param cacheSecurityGroupName
     *        The name of the cache security group to revoke ingress from.
     */

    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cache security group to revoke ingress from.
     * </p>
     * 
     * @return The name of the cache security group to revoke ingress from.
     */

    public String getCacheSecurityGroupName() {
        return this.cacheSecurityGroupName;
    }

    /**
     * <p>
     * The name of the cache security group to revoke ingress from.
     * </p>
     * 
     * @param cacheSecurityGroupName
     *        The name of the cache security group to revoke ingress from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeCacheSecurityGroupIngressRequest withCacheSecurityGroupName(String cacheSecurityGroupName) {
        setCacheSecurityGroupName(cacheSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon EC2 security group to revoke access from.
     * </p>
     * 
     * @param eC2SecurityGroupName
     *        The name of the Amazon EC2 security group to revoke access from.
     */

    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }

    /**
     * <p>
     * The name of the Amazon EC2 security group to revoke access from.
     * </p>
     * 
     * @return The name of the Amazon EC2 security group to revoke access from.
     */

    public String getEC2SecurityGroupName() {
        return this.eC2SecurityGroupName;
    }

    /**
     * <p>
     * The name of the Amazon EC2 security group to revoke access from.
     * </p>
     * 
     * @param eC2SecurityGroupName
     *        The name of the Amazon EC2 security group to revoke access from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeCacheSecurityGroupIngressRequest withEC2SecurityGroupName(String eC2SecurityGroupName) {
        setEC2SecurityGroupName(eC2SecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an AWS
     * access key ID - you must provide a valid AWS account number for this parameter.
     * </p>
     * 
     * @param eC2SecurityGroupOwnerId
     *        The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an
     *        AWS access key ID - you must provide a valid AWS account number for this parameter.
     */

    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an AWS
     * access key ID - you must provide a valid AWS account number for this parameter.
     * </p>
     * 
     * @return The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an
     *         AWS access key ID - you must provide a valid AWS account number for this parameter.
     */

    public String getEC2SecurityGroupOwnerId() {
        return this.eC2SecurityGroupOwnerId;
    }

    /**
     * <p>
     * The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an AWS
     * access key ID - you must provide a valid AWS account number for this parameter.
     * </p>
     * 
     * @param eC2SecurityGroupOwnerId
     *        The AWS account number of the Amazon EC2 security group owner. Note that this is not the same thing as an
     *        AWS access key ID - you must provide a valid AWS account number for this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeCacheSecurityGroupIngressRequest withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        setEC2SecurityGroupOwnerId(eC2SecurityGroupOwnerId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCacheSecurityGroupName() != null)
            sb.append("CacheSecurityGroupName: ").append(getCacheSecurityGroupName()).append(",");
        if (getEC2SecurityGroupName() != null)
            sb.append("EC2SecurityGroupName: ").append(getEC2SecurityGroupName()).append(",");
        if (getEC2SecurityGroupOwnerId() != null)
            sb.append("EC2SecurityGroupOwnerId: ").append(getEC2SecurityGroupOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeCacheSecurityGroupIngressRequest == false)
            return false;
        RevokeCacheSecurityGroupIngressRequest other = (RevokeCacheSecurityGroupIngressRequest) obj;
        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null)
            return false;
        if (other.getCacheSecurityGroupName() != null && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false)
            return false;
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null)
            return false;
        if (other.getEC2SecurityGroupName() != null && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false)
            return false;
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null)
            return false;
        if (other.getEC2SecurityGroupOwnerId() != null && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false)
            return false;
        return true;
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
    public RevokeCacheSecurityGroupIngressRequest clone() {
        return (RevokeCacheSecurityGroupIngressRequest) super.clone();
    }

}
