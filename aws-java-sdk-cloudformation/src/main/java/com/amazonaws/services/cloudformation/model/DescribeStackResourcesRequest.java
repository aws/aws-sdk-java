/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for <a>DescribeStackResources</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/DescribeStackResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStackResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * <p>
     * Required: Conditional. If you do not specify <code>StackName</code>, you must specify
     * <code>PhysicalResourceId</code>.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The logical name of the resource as specified in the template.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     * CloudFormation.
     * </p>
     * <p>
     * For example, for an Amazon Elastic Compute Cloud (EC2) instance, <code>PhysicalResourceId</code> corresponds to
     * the <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code> to <code>DescribeStackResources</code>
     * to find which stack the instance belongs to and what other resources are part of the stack.
     * </p>
     * <p>
     * Required: Conditional. If you do not specify <code>PhysicalResourceId</code>, you must specify
     * <code>StackName</code>.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     */
    private String physicalResourceId;

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * <p>
     * Required: Conditional. If you do not specify <code>StackName</code>, you must specify
     * <code>PhysicalResourceId</code>.
     * </p>
     * 
     * @param stackName
     *        The name or the unique stack ID that is associated with the stack, which are not always
     *        interchangeable:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running stacks: You can specify either the stack's name or its unique stack ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deleted stacks: You must specify the unique stack ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: There is no default value.
     *        </p>
     *        <p>
     *        Required: Conditional. If you do not specify <code>StackName</code>, you must specify
     *        <code>PhysicalResourceId</code>.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * <p>
     * Required: Conditional. If you do not specify <code>StackName</code>, you must specify
     * <code>PhysicalResourceId</code>.
     * </p>
     * 
     * @return The name or the unique stack ID that is associated with the stack, which are not always
     *         interchangeable:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Running stacks: You can specify either the stack's name or its unique stack ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Deleted stacks: You must specify the unique stack ID.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: There is no default value.
     *         </p>
     *         <p>
     *         Required: Conditional. If you do not specify <code>StackName</code>, you must specify
     *         <code>PhysicalResourceId</code>.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Running stacks: You can specify either the stack's name or its unique stack ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * Deleted stacks: You must specify the unique stack ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: There is no default value.
     * </p>
     * <p>
     * Required: Conditional. If you do not specify <code>StackName</code>, you must specify
     * <code>PhysicalResourceId</code>.
     * </p>
     * 
     * @param stackName
     *        The name or the unique stack ID that is associated with the stack, which are not always
     *        interchangeable:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Running stacks: You can specify either the stack's name or its unique stack ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Deleted stacks: You must specify the unique stack ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: There is no default value.
     *        </p>
     *        <p>
     *        Required: Conditional. If you do not specify <code>StackName</code>, you must specify
     *        <code>PhysicalResourceId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackResourcesRequest withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The logical name of the resource as specified in the template.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical name of the resource as specified in the template.</p>
     *        <p>
     *        Default: There is no default value.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource as specified in the template.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @return The logical name of the resource as specified in the template.</p>
     *         <p>
     *         Default: There is no default value.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource as specified in the template.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical name of the resource as specified in the template.</p>
     *        <p>
     *        Default: There is no default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackResourcesRequest withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     * CloudFormation.
     * </p>
     * <p>
     * For example, for an Amazon Elastic Compute Cloud (EC2) instance, <code>PhysicalResourceId</code> corresponds to
     * the <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code> to <code>DescribeStackResources</code>
     * to find which stack the instance belongs to and what other resources are part of the stack.
     * </p>
     * <p>
     * Required: Conditional. If you do not specify <code>PhysicalResourceId</code>, you must specify
     * <code>StackName</code>.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     *        CloudFormation.</p>
     *        <p>
     *        For example, for an Amazon Elastic Compute Cloud (EC2) instance, <code>PhysicalResourceId</code>
     *        corresponds to the <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code> to
     *        <code>DescribeStackResources</code> to find which stack the instance belongs to and what other resources
     *        are part of the stack.
     *        </p>
     *        <p>
     *        Required: Conditional. If you do not specify <code>PhysicalResourceId</code>, you must specify
     *        <code>StackName</code>.
     *        </p>
     *        <p>
     *        Default: There is no default value.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     * CloudFormation.
     * </p>
     * <p>
     * For example, for an Amazon Elastic Compute Cloud (EC2) instance, <code>PhysicalResourceId</code> corresponds to
     * the <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code> to <code>DescribeStackResources</code>
     * to find which stack the instance belongs to and what other resources are part of the stack.
     * </p>
     * <p>
     * Required: Conditional. If you do not specify <code>PhysicalResourceId</code>, you must specify
     * <code>StackName</code>.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @return The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     *         CloudFormation.</p>
     *         <p>
     *         For example, for an Amazon Elastic Compute Cloud (EC2) instance, <code>PhysicalResourceId</code>
     *         corresponds to the <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code> to
     *         <code>DescribeStackResources</code> to find which stack the instance belongs to and what other resources
     *         are part of the stack.
     *         </p>
     *         <p>
     *         Required: Conditional. If you do not specify <code>PhysicalResourceId</code>, you must specify
     *         <code>StackName</code>.
     *         </p>
     *         <p>
     *         Default: There is no default value.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     * CloudFormation.
     * </p>
     * <p>
     * For example, for an Amazon Elastic Compute Cloud (EC2) instance, <code>PhysicalResourceId</code> corresponds to
     * the <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code> to <code>DescribeStackResources</code>
     * to find which stack the instance belongs to and what other resources are part of the stack.
     * </p>
     * <p>
     * Required: Conditional. If you do not specify <code>PhysicalResourceId</code>, you must specify
     * <code>StackName</code>.
     * </p>
     * <p>
     * Default: There is no default value.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS
     *        CloudFormation.</p>
     *        <p>
     *        For example, for an Amazon Elastic Compute Cloud (EC2) instance, <code>PhysicalResourceId</code>
     *        corresponds to the <code>InstanceId</code>. You can pass the EC2 <code>InstanceId</code> to
     *        <code>DescribeStackResources</code> to find which stack the instance belongs to and what other resources
     *        are part of the stack.
     *        </p>
     *        <p>
     *        Required: Conditional. If you do not specify <code>PhysicalResourceId</code>, you must specify
     *        <code>StackName</code>.
     *        </p>
     *        <p>
     *        Default: There is no default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStackResourcesRequest withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
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
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: ").append(getLogicalResourceId()).append(",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: ").append(getPhysicalResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackResourcesRequest == false)
            return false;
        DescribeStackResourcesRequest other = (DescribeStackResourcesRequest) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getLogicalResourceId() == null ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null && other.getLogicalResourceId().equals(this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null && other.getPhysicalResourceId().equals(this.getPhysicalResourceId()) == false)
            return false;
        return true;
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
    public DescribeStackResourcesRequest clone() {
        return (DescribeStackResourcesRequest) super.clone();
    }

}
