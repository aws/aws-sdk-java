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
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#describeStackResources(DescribeStackResourcesRequest) DescribeStackResources operation}.
 * <p>
 * Returns AWS resource descriptions for running and deleted stacks. If <code>StackName</code> is specified, all the associated resources that are part
 * of the stack are returned. If <code>PhysicalResourceId</code> is specified, all the associated resources of the stack the resource belongs to are
 * returned.
 * </p>
 * <p>
 * For deleted stacks, DescribeStackResources returns resource information for up to 90 days after the stack has been deleted.
 * </p>
 * <p>
 * You must specify <code>StackName</code> or <code>PhysicalResourceId.</code> In addition, you can specify <code>LogicalResourceId</code> to filter the
 * returned result. For more information about resources, the <code>LogicalResourceId</code> and <code>PhysicalResourceId</code> , go to the <a
 * href="http://docs.amazonwebservices.com/AWSCloudFormation/latest/UserGuide"> AWS CloudFormation User Guide </a> .
 * </p>
 * <p>
 * <b>NOTE:</b> A ValidationError is returned if you specify both StackName and PhysicalResourceId in the same request.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#describeStackResources(DescribeStackResourcesRequest)
 */
public class DescribeStackResourcesRequest extends AmazonWebServiceRequest {

    /**
     * The name or the unique identifier associated with the stack. <p>
     * Default: There is no default value.
     */
    private String stackName;

    /**
     * The logical name of the resource as specified in the
     * template.<br></br> Default: There is on default value.
     */
    private String logicalResourceId;

    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of a resource supported by AWS CloudFormation. <p> For example, for
     * an Amazon Elastic Compute Cloud (EC2) instance,
     * <code>PhysicalResourceId</code> corresponds to the
     * <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code>
     * to <code>DescribeStackResources</code> to find which stack the
     * instance belongs to and what other resources are part of the stack.
     * <p> Default: There is no default value.
     */
    private String physicalResourceId;

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
    public DescribeStackResourcesRequest withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    
    
    /**
     * The logical name of the resource as specified in the
     * template.<br></br> Default: There is on default value.
     *
     * @return The logical name of the resource as specified in the
     *         template.<br></br> Default: There is on default value.
     */
    public String getLogicalResourceId() {
        return logicalResourceId;
    }
    
    /**
     * The logical name of the resource as specified in the
     * template.<br></br> Default: There is on default value.
     *
     * @param logicalResourceId The logical name of the resource as specified in the
     *         template.<br></br> Default: There is on default value.
     */
    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }
    
    /**
     * The logical name of the resource as specified in the
     * template.<br></br> Default: There is on default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logicalResourceId The logical name of the resource as specified in the
     *         template.<br></br> Default: There is on default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeStackResourcesRequest withLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
        return this;
    }
    
    
    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of a resource supported by AWS CloudFormation. <p> For example, for
     * an Amazon Elastic Compute Cloud (EC2) instance,
     * <code>PhysicalResourceId</code> corresponds to the
     * <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code>
     * to <code>DescribeStackResources</code> to find which stack the
     * instance belongs to and what other resources are part of the stack.
     * <p> Default: There is no default value.
     *
     * @return The name or unique identifier that corresponds to a physical instance
     *         ID of a resource supported by AWS CloudFormation. <p> For example, for
     *         an Amazon Elastic Compute Cloud (EC2) instance,
     *         <code>PhysicalResourceId</code> corresponds to the
     *         <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code>
     *         to <code>DescribeStackResources</code> to find which stack the
     *         instance belongs to and what other resources are part of the stack.
     *         <p> Default: There is no default value.
     */
    public String getPhysicalResourceId() {
        return physicalResourceId;
    }
    
    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of a resource supported by AWS CloudFormation. <p> For example, for
     * an Amazon Elastic Compute Cloud (EC2) instance,
     * <code>PhysicalResourceId</code> corresponds to the
     * <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code>
     * to <code>DescribeStackResources</code> to find which stack the
     * instance belongs to and what other resources are part of the stack.
     * <p> Default: There is no default value.
     *
     * @param physicalResourceId The name or unique identifier that corresponds to a physical instance
     *         ID of a resource supported by AWS CloudFormation. <p> For example, for
     *         an Amazon Elastic Compute Cloud (EC2) instance,
     *         <code>PhysicalResourceId</code> corresponds to the
     *         <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code>
     *         to <code>DescribeStackResources</code> to find which stack the
     *         instance belongs to and what other resources are part of the stack.
     *         <p> Default: There is no default value.
     */
    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }
    
    /**
     * The name or unique identifier that corresponds to a physical instance
     * ID of a resource supported by AWS CloudFormation. <p> For example, for
     * an Amazon Elastic Compute Cloud (EC2) instance,
     * <code>PhysicalResourceId</code> corresponds to the
     * <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code>
     * to <code>DescribeStackResources</code> to find which stack the
     * instance belongs to and what other resources are part of the stack.
     * <p> Default: There is no default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param physicalResourceId The name or unique identifier that corresponds to a physical instance
     *         ID of a resource supported by AWS CloudFormation. <p> For example, for
     *         an Amazon Elastic Compute Cloud (EC2) instance,
     *         <code>PhysicalResourceId</code> corresponds to the
     *         <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code>
     *         to <code>DescribeStackResources</code> to find which stack the
     *         instance belongs to and what other resources are part of the stack.
     *         <p> Default: There is no default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeStackResourcesRequest withPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
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
        if (logicalResourceId != null) sb.append("LogicalResourceId: " + logicalResourceId + ", ");
        if (physicalResourceId != null) sb.append("PhysicalResourceId: " + physicalResourceId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        hashCode = prime * hashCode + ((getLogicalResourceId() == null) ? 0 : getLogicalResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getPhysicalResourceId() == null) ? 0 : getPhysicalResourceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeStackResourcesRequest == false) return false;
        DescribeStackResourcesRequest other = (DescribeStackResourcesRequest)obj;
        
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null) return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false) return false; 
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null) return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false) return false; 
        return true;
    }
    
}
    