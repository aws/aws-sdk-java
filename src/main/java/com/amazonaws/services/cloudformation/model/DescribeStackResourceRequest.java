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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#describeStackResource(DescribeStackResourceRequest) DescribeStackResource operation}.
 * <p>
 * Returns a description of the specified resource in the specified stack.
 * </p>
 * <p>
 * For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been deleted.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#describeStackResource(DescribeStackResourceRequest)
 */
public class DescribeStackResourceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name or the unique identifier associated with the stack.
     * <p>Default: There is no default value.
     */
    private String stackName;

    /**
     * The logical name of the resource as specified in the template.
     * <p>Default: There is no default value.
     */
    private String logicalResourceId;

    /**
     * The name or the unique identifier associated with the stack.
     * <p>Default: There is no default value.
     *
     * @return The name or the unique identifier associated with the stack.
     *         <p>Default: There is no default value.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack.
     * <p>Default: There is no default value.
     *
     * @param stackName The name or the unique identifier associated with the stack.
     *         <p>Default: There is no default value.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack.
     * <p>Default: There is no default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name or the unique identifier associated with the stack.
     *         <p>Default: There is no default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStackResourceRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * The logical name of the resource as specified in the template.
     * <p>Default: There is no default value.
     *
     * @return The logical name of the resource as specified in the template.
     *         <p>Default: There is no default value.
     */
    public String getLogicalResourceId() {
        return logicalResourceId;
    }
    
    /**
     * The logical name of the resource as specified in the template.
     * <p>Default: There is no default value.
     *
     * @param logicalResourceId The logical name of the resource as specified in the template.
     *         <p>Default: There is no default value.
     */
    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }
    
    /**
     * The logical name of the resource as specified in the template.
     * <p>Default: There is no default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logicalResourceId The logical name of the resource as specified in the template.
     *         <p>Default: There is no default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStackResourceRequest withLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
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
        if (getStackName() != null) sb.append("StackName: " + getStackName() + ",");
        if (getLogicalResourceId() != null) sb.append("LogicalResourceId: " + getLogicalResourceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStackResourceRequest == false) return false;
        DescribeStackResourceRequest other = (DescribeStackResourceRequest)obj;
        
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null) return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false) return false; 
        return true;
    }
    
}
    