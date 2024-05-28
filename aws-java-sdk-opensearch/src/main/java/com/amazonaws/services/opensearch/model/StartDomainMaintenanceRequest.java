/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code>StartDomainMaintenance</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDomainMaintenanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The name of the action.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The ID of the data node.
     * </p>
     */
    private String nodeId;

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @return The name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain.
     * </p>
     * 
     * @param domainName
     *        The name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDomainMaintenanceRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param action
     *        The name of the action.
     * @see MaintenanceType
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @return The name of the action.
     * @see MaintenanceType
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param action
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceType
     */

    public StartDomainMaintenanceRequest withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The name of the action.
     * </p>
     * 
     * @param action
     *        The name of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MaintenanceType
     */

    public StartDomainMaintenanceRequest withAction(MaintenanceType action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the data node.
     * </p>
     * 
     * @param nodeId
     *        The ID of the data node.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * The ID of the data node.
     * </p>
     * 
     * @return The ID of the data node.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * The ID of the data node.
     * </p>
     * 
     * @param nodeId
     *        The ID of the data node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDomainMaintenanceRequest withNodeId(String nodeId) {
        setNodeId(nodeId);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDomainMaintenanceRequest == false)
            return false;
        StartDomainMaintenanceRequest other = (StartDomainMaintenanceRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        return hashCode;
    }

    @Override
    public StartDomainMaintenanceRequest clone() {
        return (StartDomainMaintenanceRequest) super.clone();
    }

}
