/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * The output of the DescribeAccountLimitsResult action.
 * </p>
 */
public class DescribeAccountLimitsResult implements Serializable {

    /**
     * The maximum number of Auto Scaling groups allowed for your AWS
     * account.
     */
    private Integer maxNumberOfAutoScalingGroups;

    /**
     * The maximum number of launch configurations allowed for your AWS
     * account.
     */
    private Integer maxNumberOfLaunchConfigurations;

    /**
     * The maximum number of Auto Scaling groups allowed for your AWS
     * account.
     *
     * @return The maximum number of Auto Scaling groups allowed for your AWS
     *         account.
     */
    public Integer getMaxNumberOfAutoScalingGroups() {
        return maxNumberOfAutoScalingGroups;
    }
    
    /**
     * The maximum number of Auto Scaling groups allowed for your AWS
     * account.
     *
     * @param maxNumberOfAutoScalingGroups The maximum number of Auto Scaling groups allowed for your AWS
     *         account.
     */
    public void setMaxNumberOfAutoScalingGroups(Integer maxNumberOfAutoScalingGroups) {
        this.maxNumberOfAutoScalingGroups = maxNumberOfAutoScalingGroups;
    }
    
    /**
     * The maximum number of Auto Scaling groups allowed for your AWS
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxNumberOfAutoScalingGroups The maximum number of Auto Scaling groups allowed for your AWS
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAccountLimitsResult withMaxNumberOfAutoScalingGroups(Integer maxNumberOfAutoScalingGroups) {
        this.maxNumberOfAutoScalingGroups = maxNumberOfAutoScalingGroups;
        return this;
    }

    /**
     * The maximum number of launch configurations allowed for your AWS
     * account.
     *
     * @return The maximum number of launch configurations allowed for your AWS
     *         account.
     */
    public Integer getMaxNumberOfLaunchConfigurations() {
        return maxNumberOfLaunchConfigurations;
    }
    
    /**
     * The maximum number of launch configurations allowed for your AWS
     * account.
     *
     * @param maxNumberOfLaunchConfigurations The maximum number of launch configurations allowed for your AWS
     *         account.
     */
    public void setMaxNumberOfLaunchConfigurations(Integer maxNumberOfLaunchConfigurations) {
        this.maxNumberOfLaunchConfigurations = maxNumberOfLaunchConfigurations;
    }
    
    /**
     * The maximum number of launch configurations allowed for your AWS
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxNumberOfLaunchConfigurations The maximum number of launch configurations allowed for your AWS
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAccountLimitsResult withMaxNumberOfLaunchConfigurations(Integer maxNumberOfLaunchConfigurations) {
        this.maxNumberOfLaunchConfigurations = maxNumberOfLaunchConfigurations;
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
        if (getMaxNumberOfAutoScalingGroups() != null) sb.append("MaxNumberOfAutoScalingGroups: " + getMaxNumberOfAutoScalingGroups() + ",");
        if (getMaxNumberOfLaunchConfigurations() != null) sb.append("MaxNumberOfLaunchConfigurations: " + getMaxNumberOfLaunchConfigurations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMaxNumberOfAutoScalingGroups() == null) ? 0 : getMaxNumberOfAutoScalingGroups().hashCode()); 
        hashCode = prime * hashCode + ((getMaxNumberOfLaunchConfigurations() == null) ? 0 : getMaxNumberOfLaunchConfigurations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAccountLimitsResult == false) return false;
        DescribeAccountLimitsResult other = (DescribeAccountLimitsResult)obj;
        
        if (other.getMaxNumberOfAutoScalingGroups() == null ^ this.getMaxNumberOfAutoScalingGroups() == null) return false;
        if (other.getMaxNumberOfAutoScalingGroups() != null && other.getMaxNumberOfAutoScalingGroups().equals(this.getMaxNumberOfAutoScalingGroups()) == false) return false; 
        if (other.getMaxNumberOfLaunchConfigurations() == null ^ this.getMaxNumberOfLaunchConfigurations() == null) return false;
        if (other.getMaxNumberOfLaunchConfigurations() != null && other.getMaxNumberOfLaunchConfigurations().equals(this.getMaxNumberOfLaunchConfigurations()) == false) return false; 
        return true;
    }
    
}
    