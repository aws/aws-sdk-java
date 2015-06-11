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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createFlowLogs(CreateFlowLogsRequest) CreateFlowLogs operation}.
 * <p>
 * Creates one or more flow logs to capture IP traffic for a specific
 * network interface, subnet, or VPC. Flow logs are delivered to a
 * specified log group in Amazon CloudWatch Logs. If you specify a VPC or
 * subnet in the request, a log stream is created in CloudWatch Logs for
 * each network interface in the subnet or VPC. Log streams can include
 * information about accepted and rejected traffic to a network
 * interface. You can view the data in your log streams using Amazon
 * CloudWatch Logs.
 * </p>
 * <p>
 * In your request, you must also specify an IAM role that has permission
 * to publish logs to CloudWatch Logs.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createFlowLogs(CreateFlowLogsRequest)
 */
public class CreateFlowLogsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * One or more subnet, network interface, or VPC IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIds;

    /**
     * The type of resource on which to create the flow log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     */
    private String resourceType;

    /**
     * The type of traffic to log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     */
    private String trafficType;

    /**
     * The name of the CloudWatch log group.
     */
    private String logGroupName;

    /**
     * The ARN for the IAM role that's used to post flow logs to a CloudWatch
     * Logs log group.
     */
    private String deliverLogsPermissionArn;

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     */
    private String clientToken;

    /**
     * One or more subnet, network interface, or VPC IDs.
     *
     * @return One or more subnet, network interface, or VPC IDs.
     */
    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
              resourceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              resourceIds.setAutoConstruct(true);
        }
        return resourceIds;
    }
    
    /**
     * One or more subnet, network interface, or VPC IDs.
     *
     * @param resourceIds One or more subnet, network interface, or VPC IDs.
     */
    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceIds.size());
        resourceIdsCopy.addAll(resourceIds);
        this.resourceIds = resourceIdsCopy;
    }
    
    /**
     * One or more subnet, network interface, or VPC IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceIds(java.util.Collection)} or {@link
     * #withResourceIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceIds One or more subnet, network interface, or VPC IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFlowLogsRequest withResourceIds(String... resourceIds) {
        if (getResourceIds() == null) setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        for (String value : resourceIds) {
            getResourceIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more subnet, network interface, or VPC IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceIds One or more subnet, network interface, or VPC IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFlowLogsRequest withResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceIds.size());
            resourceIdsCopy.addAll(resourceIds);
            this.resourceIds = resourceIdsCopy;
        }

        return this;
    }

    /**
     * The type of resource on which to create the flow log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     *
     * @return The type of resource on which to create the flow log.
     *
     * @see FlowLogsResourceType
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of resource on which to create the flow log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     *
     * @param resourceType The type of resource on which to create the flow log.
     *
     * @see FlowLogsResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of resource on which to create the flow log.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     *
     * @param resourceType The type of resource on which to create the flow log.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see FlowLogsResourceType
     */
    public CreateFlowLogsRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The type of resource on which to create the flow log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     *
     * @param resourceType The type of resource on which to create the flow log.
     *
     * @see FlowLogsResourceType
     */
    public void setResourceType(FlowLogsResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }
    
    /**
     * The type of resource on which to create the flow log.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VPC, Subnet, NetworkInterface
     *
     * @param resourceType The type of resource on which to create the flow log.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see FlowLogsResourceType
     */
    public CreateFlowLogsRequest withResourceType(FlowLogsResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * The type of traffic to log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @return The type of traffic to log.
     *
     * @see TrafficType
     */
    public String getTrafficType() {
        return trafficType;
    }
    
    /**
     * The type of traffic to log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType The type of traffic to log.
     *
     * @see TrafficType
     */
    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }
    
    /**
     * The type of traffic to log.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType The type of traffic to log.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TrafficType
     */
    public CreateFlowLogsRequest withTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * The type of traffic to log.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType The type of traffic to log.
     *
     * @see TrafficType
     */
    public void setTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
    }
    
    /**
     * The type of traffic to log.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCEPT, REJECT, ALL
     *
     * @param trafficType The type of traffic to log.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see TrafficType
     */
    public CreateFlowLogsRequest withTrafficType(TrafficType trafficType) {
        this.trafficType = trafficType.toString();
        return this;
    }

    /**
     * The name of the CloudWatch log group.
     *
     * @return The name of the CloudWatch log group.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * The name of the CloudWatch log group.
     *
     * @param logGroupName The name of the CloudWatch log group.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * The name of the CloudWatch log group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logGroupName The name of the CloudWatch log group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFlowLogsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * The ARN for the IAM role that's used to post flow logs to a CloudWatch
     * Logs log group.
     *
     * @return The ARN for the IAM role that's used to post flow logs to a CloudWatch
     *         Logs log group.
     */
    public String getDeliverLogsPermissionArn() {
        return deliverLogsPermissionArn;
    }
    
    /**
     * The ARN for the IAM role that's used to post flow logs to a CloudWatch
     * Logs log group.
     *
     * @param deliverLogsPermissionArn The ARN for the IAM role that's used to post flow logs to a CloudWatch
     *         Logs log group.
     */
    public void setDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
    }
    
    /**
     * The ARN for the IAM role that's used to post flow logs to a CloudWatch
     * Logs log group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deliverLogsPermissionArn The ARN for the IAM role that's used to post flow logs to a CloudWatch
     *         Logs log group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFlowLogsRequest withDeliverLogsPermissionArn(String deliverLogsPermissionArn) {
        this.deliverLogsPermissionArn = deliverLogsPermissionArn;
        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     *
     * @return Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a>.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a>.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateFlowLogsRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getResourceIds() != null) sb.append("ResourceIds: " + getResourceIds() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getTrafficType() != null) sb.append("TrafficType: " + getTrafficType() + ",");
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getDeliverLogsPermissionArn() != null) sb.append("DeliverLogsPermissionArn: " + getDeliverLogsPermissionArn() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode()); 
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficType() == null) ? 0 : getTrafficType().hashCode()); 
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDeliverLogsPermissionArn() == null) ? 0 : getDeliverLogsPermissionArn().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateFlowLogsRequest == false) return false;
        CreateFlowLogsRequest other = (CreateFlowLogsRequest)obj;
        
        if (other.getResourceIds() == null ^ this.getResourceIds() == null) return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false) return false; 
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getTrafficType() == null ^ this.getTrafficType() == null) return false;
        if (other.getTrafficType() != null && other.getTrafficType().equals(this.getTrafficType()) == false) return false; 
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getDeliverLogsPermissionArn() == null ^ this.getDeliverLogsPermissionArn() == null) return false;
        if (other.getDeliverLogsPermissionArn() != null && other.getDeliverLogsPermissionArn().equals(this.getDeliverLogsPermissionArn()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateFlowLogsRequest clone() {
        
            return (CreateFlowLogsRequest) super.clone();
    }

}
    