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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/UpdateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DAX cluster to be modified.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * A description of the changes being made to the cluster.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A range of time when maintenance of DAX cluster software will be performed. For example:
     * <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is performed
     * automatically within the maintenance window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     */
    private String notificationTopicArn;
    /**
     * <p>
     * The current state of the topic.
     * </p>
     */
    private String notificationTopicStatus;
    /**
     * <p>
     * The name of a parameter group for this cluster.
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this parameter is
     * not specified, DAX assigns the default VPC security group to each node.
     * </p>
     */
    private java.util.List<String> securityGroupIds;

    /**
     * <p>
     * The name of the DAX cluster to be modified.
     * </p>
     * 
     * @param clusterName
     *        The name of the DAX cluster to be modified.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the DAX cluster to be modified.
     * </p>
     * 
     * @return The name of the DAX cluster to be modified.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the DAX cluster to be modified.
     * </p>
     * 
     * @param clusterName
     *        The name of the DAX cluster to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * A description of the changes being made to the cluster.
     * </p>
     * 
     * @param description
     *        A description of the changes being made to the cluster.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the changes being made to the cluster.
     * </p>
     * 
     * @return A description of the changes being made to the cluster.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the changes being made to the cluster.
     * </p>
     * 
     * @param description
     *        A description of the changes being made to the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A range of time when maintenance of DAX cluster software will be performed. For example:
     * <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is performed
     * automatically within the maintenance window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        A range of time when maintenance of DAX cluster software will be performed. For example:
     *        <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is
     *        performed automatically within the maintenance window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * A range of time when maintenance of DAX cluster software will be performed. For example:
     * <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is performed
     * automatically within the maintenance window.
     * </p>
     * 
     * @return A range of time when maintenance of DAX cluster software will be performed. For example:
     *         <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is
     *         performed automatically within the maintenance window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * A range of time when maintenance of DAX cluster software will be performed. For example:
     * <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is performed
     * automatically within the maintenance window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        A range of time when maintenance of DAX cluster software will be performed. For example:
     *        <code>sun:01:00-sun:09:00</code>. Cluster maintenance normally takes less than 30 minutes, and is
     *        performed automatically within the maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) that identifies the topic.
     */

    public void setNotificationTopicArn(String notificationTopicArn) {
        this.notificationTopicArn = notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the topic.
     */

    public String getNotificationTopicArn() {
        return this.notificationTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the topic.
     * </p>
     * 
     * @param notificationTopicArn
     *        The Amazon Resource Name (ARN) that identifies the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withNotificationTopicArn(String notificationTopicArn) {
        setNotificationTopicArn(notificationTopicArn);
        return this;
    }

    /**
     * <p>
     * The current state of the topic.
     * </p>
     * 
     * @param notificationTopicStatus
     *        The current state of the topic.
     */

    public void setNotificationTopicStatus(String notificationTopicStatus) {
        this.notificationTopicStatus = notificationTopicStatus;
    }

    /**
     * <p>
     * The current state of the topic.
     * </p>
     * 
     * @return The current state of the topic.
     */

    public String getNotificationTopicStatus() {
        return this.notificationTopicStatus;
    }

    /**
     * <p>
     * The current state of the topic.
     * </p>
     * 
     * @param notificationTopicStatus
     *        The current state of the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withNotificationTopicStatus(String notificationTopicStatus) {
        setNotificationTopicStatus(notificationTopicStatus);
        return this;
    }

    /**
     * <p>
     * The name of a parameter group for this cluster.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of a parameter group for this cluster.
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of a parameter group for this cluster.
     * </p>
     * 
     * @return The name of a parameter group for this cluster.
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of a parameter group for this cluster.
     * </p>
     * 
     * @param parameterGroupName
     *        The name of a parameter group for this cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this parameter is
     * not specified, DAX assigns the default VPC security group to each node.
     * </p>
     * 
     * @return A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this
     *         parameter is not specified, DAX assigns the default VPC security group to each node.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this parameter is
     * not specified, DAX assigns the default VPC security group to each node.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this
     *        parameter is not specified, DAX assigns the default VPC security group to each node.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this parameter is
     * not specified, DAX assigns the default VPC security group to each node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this
     *        parameter is not specified, DAX assigns the default VPC security group to each node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this parameter is
     * not specified, DAX assigns the default VPC security group to each node.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of user-specified security group IDs to be assigned to each node in the DAX cluster. If this
     *        parameter is not specified, DAX assigns the default VPC security group to each node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getNotificationTopicArn() != null)
            sb.append("NotificationTopicArn: ").append(getNotificationTopicArn()).append(",");
        if (getNotificationTopicStatus() != null)
            sb.append("NotificationTopicStatus: ").append(getNotificationTopicStatus()).append(",");
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterRequest == false)
            return false;
        UpdateClusterRequest other = (UpdateClusterRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getNotificationTopicArn() == null ^ this.getNotificationTopicArn() == null)
            return false;
        if (other.getNotificationTopicArn() != null && other.getNotificationTopicArn().equals(this.getNotificationTopicArn()) == false)
            return false;
        if (other.getNotificationTopicStatus() == null ^ this.getNotificationTopicStatus() == null)
            return false;
        if (other.getNotificationTopicStatus() != null && other.getNotificationTopicStatus().equals(this.getNotificationTopicStatus()) == false)
            return false;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getNotificationTopicArn() == null) ? 0 : getNotificationTopicArn().hashCode());
        hashCode = prime * hashCode + ((getNotificationTopicStatus() == null) ? 0 : getNotificationTopicStatus().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClusterRequest clone() {
        return (UpdateClusterRequest) super.clone();
    }

}
