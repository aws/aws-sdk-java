/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/ModifyProvisionedCapacity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyProvisionedCapacityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String loadBalancerArn;

    private Integer minimumLBCapacityUnits;

    /**
     * @param loadBalancerArn
     */

    public void setLoadBalancerArn(String loadBalancerArn) {
        this.loadBalancerArn = loadBalancerArn;
    }

    /**
     * @return
     */

    public String getLoadBalancerArn() {
        return this.loadBalancerArn;
    }

    /**
     * @param loadBalancerArn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyProvisionedCapacityRequest withLoadBalancerArn(String loadBalancerArn) {
        setLoadBalancerArn(loadBalancerArn);
        return this;
    }

    /**
     * @param minimumLBCapacityUnits
     */

    public void setMinimumLBCapacityUnits(Integer minimumLBCapacityUnits) {
        this.minimumLBCapacityUnits = minimumLBCapacityUnits;
    }

    /**
     * @return
     */

    public Integer getMinimumLBCapacityUnits() {
        return this.minimumLBCapacityUnits;
    }

    /**
     * @param minimumLBCapacityUnits
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyProvisionedCapacityRequest withMinimumLBCapacityUnits(Integer minimumLBCapacityUnits) {
        setMinimumLBCapacityUnits(minimumLBCapacityUnits);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoadBalancerArn() != null)
            sb.append("LoadBalancerArn: ").append(getLoadBalancerArn()).append(",");
        if (getMinimumLBCapacityUnits() != null)
            sb.append("MinimumLBCapacityUnits: ").append(getMinimumLBCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyProvisionedCapacityRequest == false)
            return false;
        ModifyProvisionedCapacityRequest other = (ModifyProvisionedCapacityRequest) obj;
        if (other.getLoadBalancerArn() == null ^ this.getLoadBalancerArn() == null)
            return false;
        if (other.getLoadBalancerArn() != null && other.getLoadBalancerArn().equals(this.getLoadBalancerArn()) == false)
            return false;
        if (other.getMinimumLBCapacityUnits() == null ^ this.getMinimumLBCapacityUnits() == null)
            return false;
        if (other.getMinimumLBCapacityUnits() != null && other.getMinimumLBCapacityUnits().equals(this.getMinimumLBCapacityUnits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoadBalancerArn() == null) ? 0 : getLoadBalancerArn().hashCode());
        hashCode = prime * hashCode + ((getMinimumLBCapacityUnits() == null) ? 0 : getMinimumLBCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public ModifyProvisionedCapacityRequest clone() {
        return (ModifyProvisionedCapacityRequest) super.clone();
    }

}
