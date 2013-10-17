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
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeElasticIps(DescribeElasticIpsRequest) DescribeElasticIps operation}.
 * <p>
 * Describes <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP addresses </a> .
 * </p>
 * <p>
 * <b>NOTE:</b>You must specify at least one of the parameters.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeElasticIps(DescribeElasticIpsRequest)
 */
public class DescribeElasticIpsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The instance ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic
     * IP addresses associated with the specified instance.
     */
    private String instanceId;

    /**
     * A stack ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic
     * IP addresses that are registered with the specified stack.
     */
    private String stackId;

    /**
     * An array of Elastic IP addresses to be described. If you include this
     * parameter, <code>DescribeElasticIps</code> returns a description of
     * the specified Elastic IP addresses. Otherwise, it returns a
     * description of every Elastic IP address.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ips;

    /**
     * The instance ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic
     * IP addresses associated with the specified instance.
     *
     * @return The instance ID. If you include this parameter,
     *         <code>DescribeElasticIps</code> returns a description of the Elastic
     *         IP addresses associated with the specified instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic
     * IP addresses associated with the specified instance.
     *
     * @param instanceId The instance ID. If you include this parameter,
     *         <code>DescribeElasticIps</code> returns a description of the Elastic
     *         IP addresses associated with the specified instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic
     * IP addresses associated with the specified instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID. If you include this parameter,
     *         <code>DescribeElasticIps</code> returns a description of the Elastic
     *         IP addresses associated with the specified instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeElasticIpsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * A stack ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic
     * IP addresses that are registered with the specified stack.
     *
     * @return A stack ID. If you include this parameter,
     *         <code>DescribeElasticIps</code> returns a description of the Elastic
     *         IP addresses that are registered with the specified stack.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * A stack ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic
     * IP addresses that are registered with the specified stack.
     *
     * @param stackId A stack ID. If you include this parameter,
     *         <code>DescribeElasticIps</code> returns a description of the Elastic
     *         IP addresses that are registered with the specified stack.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * A stack ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic
     * IP addresses that are registered with the specified stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId A stack ID. If you include this parameter,
     *         <code>DescribeElasticIps</code> returns a description of the Elastic
     *         IP addresses that are registered with the specified stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeElasticIpsRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * An array of Elastic IP addresses to be described. If you include this
     * parameter, <code>DescribeElasticIps</code> returns a description of
     * the specified Elastic IP addresses. Otherwise, it returns a
     * description of every Elastic IP address.
     *
     * @return An array of Elastic IP addresses to be described. If you include this
     *         parameter, <code>DescribeElasticIps</code> returns a description of
     *         the specified Elastic IP addresses. Otherwise, it returns a
     *         description of every Elastic IP address.
     */
    public java.util.List<String> getIps() {
        if (ips == null) {
              ips = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ips.setAutoConstruct(true);
        }
        return ips;
    }
    
    /**
     * An array of Elastic IP addresses to be described. If you include this
     * parameter, <code>DescribeElasticIps</code> returns a description of
     * the specified Elastic IP addresses. Otherwise, it returns a
     * description of every Elastic IP address.
     *
     * @param ips An array of Elastic IP addresses to be described. If you include this
     *         parameter, <code>DescribeElasticIps</code> returns a description of
     *         the specified Elastic IP addresses. Otherwise, it returns a
     *         description of every Elastic IP address.
     */
    public void setIps(java.util.Collection<String> ips) {
        if (ips == null) {
            this.ips = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ips.size());
        ipsCopy.addAll(ips);
        this.ips = ipsCopy;
    }
    
    /**
     * An array of Elastic IP addresses to be described. If you include this
     * parameter, <code>DescribeElasticIps</code> returns a description of
     * the specified Elastic IP addresses. Otherwise, it returns a
     * description of every Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ips An array of Elastic IP addresses to be described. If you include this
     *         parameter, <code>DescribeElasticIps</code> returns a description of
     *         the specified Elastic IP addresses. Otherwise, it returns a
     *         description of every Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeElasticIpsRequest withIps(String... ips) {
        if (getIps() == null) setIps(new java.util.ArrayList<String>(ips.length));
        for (String value : ips) {
            getIps().add(value);
        }
        return this;
    }
    
    /**
     * An array of Elastic IP addresses to be described. If you include this
     * parameter, <code>DescribeElasticIps</code> returns a description of
     * the specified Elastic IP addresses. Otherwise, it returns a
     * description of every Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ips An array of Elastic IP addresses to be described. If you include this
     *         parameter, <code>DescribeElasticIps</code> returns a description of
     *         the specified Elastic IP addresses. Otherwise, it returns a
     *         description of every Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeElasticIpsRequest withIps(java.util.Collection<String> ips) {
        if (ips == null) {
            this.ips = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ips.size());
            ipsCopy.addAll(ips);
            this.ips = ipsCopy;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getIps() != null) sb.append("Ips: " + getIps() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getIps() == null) ? 0 : getIps().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeElasticIpsRequest == false) return false;
        DescribeElasticIpsRequest other = (DescribeElasticIpsRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getIps() == null ^ this.getIps() == null) return false;
        if (other.getIps() != null && other.getIps().equals(this.getIps()) == false) return false; 
        return true;
    }
    
}
    