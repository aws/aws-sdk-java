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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#describeVirtualGateways(DescribeVirtualGatewaysRequest) DescribeVirtualGateways operation}.
 * <p>
 * Returns a list of virtual private gateways owned by the AWS account.
 * </p>
 * <p>
 * You can create one or more AWS Direct Connect private virtual interfaces linking to a virtual private gateway. A virtual private gateway can be
 * managed via Amazon Virtual Private Cloud (VPC) console or the <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-CreateVpnGateway.html"> EC2 CreateVpnGateway </a> action.
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#describeVirtualGateways(DescribeVirtualGatewaysRequest)
 */
public class DescribeVirtualGatewaysRequest extends AmazonWebServiceRequest implements Serializable {

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

        if (obj instanceof DescribeVirtualGatewaysRequest == false) return false;
        DescribeVirtualGatewaysRequest other = (DescribeVirtualGatewaysRequest)obj;
        
        return true;
    }
    
}
    