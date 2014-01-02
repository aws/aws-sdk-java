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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeAccountLimits(DescribeAccountLimitsRequest) DescribeAccountLimits operation}.
 * <p>
 * Returns the limits for the Auto Scaling resources currently allowed for your AWS account.
 * </p>
 * <p>
 * Your AWS account comes with default limits on resources for Auto Scaling. There is a default limit of <code>20</code> Auto Scaling groups and
 * <code>100</code> launch configurations per region.
 * </p>
 * <p>
 * If you reach the limits for the number of Auto Scaling groups or the launch configurations, you can go to the <a
 * href="https://aws.amazon.com/support/"> Support Center </a> and place a request to raise the limits.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeAccountLimits(DescribeAccountLimitsRequest)
 */
public class DescribeAccountLimitsRequest extends AmazonWebServiceRequest implements Serializable {

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
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAccountLimitsRequest == false) return false;
        DescribeAccountLimitsRequest other = (DescribeAccountLimitsRequest)obj;
        
        return true;
    }
    
}
    