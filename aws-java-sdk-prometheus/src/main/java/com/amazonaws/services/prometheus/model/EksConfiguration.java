/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The <code>EksConfiguration</code> structure describes the connection to the Amazon EKS cluster from which a scraper
 * collects metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/EksConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EksConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the Amazon EKS cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * A list of the security group IDs for the Amazon EKS cluster VPC configuration.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * A list of subnet IDs for the Amazon EKS cluster VPC configuration.
     * </p>
     */
    private java.util.List<String> subnetIds;

    /**
     * <p>
     * ARN of the Amazon EKS cluster.
     * </p>
     * 
     * @param clusterArn
     *        ARN of the Amazon EKS cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * ARN of the Amazon EKS cluster.
     * </p>
     * 
     * @return ARN of the Amazon EKS cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * ARN of the Amazon EKS cluster.
     * </p>
     * 
     * @param clusterArn
     *        ARN of the Amazon EKS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksConfiguration withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * A list of the security group IDs for the Amazon EKS cluster VPC configuration.
     * </p>
     * 
     * @return A list of the security group IDs for the Amazon EKS cluster VPC configuration.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of the security group IDs for the Amazon EKS cluster VPC configuration.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of the security group IDs for the Amazon EKS cluster VPC configuration.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of the security group IDs for the Amazon EKS cluster VPC configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of the security group IDs for the Amazon EKS cluster VPC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksConfiguration withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the security group IDs for the Amazon EKS cluster VPC configuration.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of the security group IDs for the Amazon EKS cluster VPC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksConfiguration withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs for the Amazon EKS cluster VPC configuration.
     * </p>
     * 
     * @return A list of subnet IDs for the Amazon EKS cluster VPC configuration.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of subnet IDs for the Amazon EKS cluster VPC configuration.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs for the Amazon EKS cluster VPC configuration.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of subnet IDs for the Amazon EKS cluster VPC configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs for the Amazon EKS cluster VPC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksConfiguration withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subnet IDs for the Amazon EKS cluster VPC configuration.
     * </p>
     * 
     * @param subnetIds
     *        A list of subnet IDs for the Amazon EKS cluster VPC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EksConfiguration withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EksConfiguration == false)
            return false;
        EksConfiguration other = (EksConfiguration) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public EksConfiguration clone() {
        try {
            return (EksConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.EksConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
