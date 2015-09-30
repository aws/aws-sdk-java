/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#describeAccountLimits(DescribeAccountLimitsRequest) DescribeAccountLimits operation}.
 * <p>
 * Retrieves your account's AWS CloudFormation limits, such as the
 * maximum number of stacks that you can create in your account.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#describeAccountLimits(DescribeAccountLimitsRequest)
 */
public class DescribeAccountLimitsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A string that identifies the next page of limits that you want to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * A string that identifies the next page of limits that you want to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return A string that identifies the next page of limits that you want to
     *         retrieve.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string that identifies the next page of limits that you want to
     * retrieve.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken A string that identifies the next page of limits that you want to
     *         retrieve.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string that identifies the next page of limits that you want to
     * retrieve.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken A string that identifies the next page of limits that you want to
     *         retrieve.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAccountLimitsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAccountLimitsRequest == false) return false;
        DescribeAccountLimitsRequest other = (DescribeAccountLimitsRequest)obj;
        
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeAccountLimitsRequest clone() {
        
            return (DescribeAccountLimitsRequest) super.clone();
    }

}
    