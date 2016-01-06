/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeAccountAttributes(DescribeAccountAttributesRequest) DescribeAccountAttributes operation}.
 * <p>
 * Lists all of the attributes for a customer account. The attributes
 * include Amazon RDS quotas for the account, such as the number of DB
 * instances allowed. The description for a quota includes the quota
 * name, current usage toward that quota, and the quota's maximum value.
 * </p>
 * <p>
 * This command does not take any parameters.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeAccountAttributes(DescribeAccountAttributesRequest)
 */
public class DescribeAccountAttributesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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

        if (obj instanceof DescribeAccountAttributesRequest == false) return false;
        DescribeAccountAttributesRequest other = (DescribeAccountAttributesRequest)obj;
        
        return true;
    }
    
    @Override
    public DescribeAccountAttributesRequest clone() {
        
            return (DescribeAccountAttributesRequest) super.clone();
    }

}
    