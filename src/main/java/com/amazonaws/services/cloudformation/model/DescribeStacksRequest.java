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
package com.amazonaws.services.cloudformation.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#describeStacks(DescribeStacksRequest) DescribeStacks operation}.
 * <p>
 * Returns the description for the specified stack; if no stack name was specified, then it returns the description for all the stacks created.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#describeStacks(DescribeStacksRequest)
 */
public class DescribeStacksRequest extends AmazonWebServiceRequest {

    /**
     * The name or the unique identifier associated with the stack. <p>
     * Default: There is no default value.
     */
    private String stackName;

    /**
     * The name or the unique identifier associated with the stack. <p>
     * Default: There is no default value.
     *
     * @return The name or the unique identifier associated with the stack. <p>
     *         Default: There is no default value.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack. <p>
     * Default: There is no default value.
     *
     * @param stackName The name or the unique identifier associated with the stack. <p>
     *         Default: There is no default value.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack. <p>
     * Default: There is no default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name or the unique identifier associated with the stack. <p>
     *         Default: There is no default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeStacksRequest withStackName(String stackName) {
        this.stackName = stackName;
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
        if (stackName != null) sb.append("StackName: " + stackName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeStacksRequest == false) return false;
        DescribeStacksRequest other = (DescribeStacksRequest)obj;
        
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        return true;
    }
    
}
    