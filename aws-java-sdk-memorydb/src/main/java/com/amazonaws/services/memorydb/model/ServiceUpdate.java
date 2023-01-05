/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An update that you can apply to your MemoryDB clusters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ServiceUpdate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the cluster to which the service update applies
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;
    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     */
    private java.util.Date releaseDate;
    /**
     * <p>
     * Provides details of the service update
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the service update
     * </p>
     */
    private String status;
    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     */
    private String type;
    /**
     * <p>
     * A list of nodes updated by the service update
     * </p>
     */
    private String nodesUpdated;
    /**
     * <p>
     * The date at which the service update will be automatically applied
     * </p>
     */
    private java.util.Date autoUpdateStartDate;

    /**
     * <p>
     * The name of the cluster to which the service update applies
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to which the service update applies
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the cluster to which the service update applies
     * </p>
     * 
     * @return The name of the cluster to which the service update applies
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the cluster to which the service update applies
     * </p>
     * 
     * @param clusterName
     *        The name of the cluster to which the service update applies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     */

    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @return The unique ID of the service update
     */

    public String getServiceUpdateName() {
        return this.serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * 
     * @param serviceUpdateName
     *        The unique ID of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withServiceUpdateName(String serviceUpdateName) {
        setServiceUpdateName(serviceUpdateName);
        return this;
    }

    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     * 
     * @param releaseDate
     *        The date when the service update is initially available
     */

    public void setReleaseDate(java.util.Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     * 
     * @return The date when the service update is initially available
     */

    public java.util.Date getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * <p>
     * The date when the service update is initially available
     * </p>
     * 
     * @param releaseDate
     *        The date when the service update is initially available
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withReleaseDate(java.util.Date releaseDate) {
        setReleaseDate(releaseDate);
        return this;
    }

    /**
     * <p>
     * Provides details of the service update
     * </p>
     * 
     * @param description
     *        Provides details of the service update
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Provides details of the service update
     * </p>
     * 
     * @return Provides details of the service update
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Provides details of the service update
     * </p>
     * 
     * @param description
     *        Provides details of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param status
     *        The status of the service update
     * @see ServiceUpdateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @return The status of the service update
     * @see ServiceUpdateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param status
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public ServiceUpdate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * 
     * @param status
     *        The status of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateStatus
     */

    public ServiceUpdate withStatus(ServiceUpdateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @param type
     *        Reflects the nature of the service update
     * @see ServiceUpdateType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @return Reflects the nature of the service update
     * @see ServiceUpdateType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @param type
     *        Reflects the nature of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateType
     */

    public ServiceUpdate withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * 
     * @param type
     *        Reflects the nature of the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceUpdateType
     */

    public ServiceUpdate withType(ServiceUpdateType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A list of nodes updated by the service update
     * </p>
     * 
     * @param nodesUpdated
     *        A list of nodes updated by the service update
     */

    public void setNodesUpdated(String nodesUpdated) {
        this.nodesUpdated = nodesUpdated;
    }

    /**
     * <p>
     * A list of nodes updated by the service update
     * </p>
     * 
     * @return A list of nodes updated by the service update
     */

    public String getNodesUpdated() {
        return this.nodesUpdated;
    }

    /**
     * <p>
     * A list of nodes updated by the service update
     * </p>
     * 
     * @param nodesUpdated
     *        A list of nodes updated by the service update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withNodesUpdated(String nodesUpdated) {
        setNodesUpdated(nodesUpdated);
        return this;
    }

    /**
     * <p>
     * The date at which the service update will be automatically applied
     * </p>
     * 
     * @param autoUpdateStartDate
     *        The date at which the service update will be automatically applied
     */

    public void setAutoUpdateStartDate(java.util.Date autoUpdateStartDate) {
        this.autoUpdateStartDate = autoUpdateStartDate;
    }

    /**
     * <p>
     * The date at which the service update will be automatically applied
     * </p>
     * 
     * @return The date at which the service update will be automatically applied
     */

    public java.util.Date getAutoUpdateStartDate() {
        return this.autoUpdateStartDate;
    }

    /**
     * <p>
     * The date at which the service update will be automatically applied
     * </p>
     * 
     * @param autoUpdateStartDate
     *        The date at which the service update will be automatically applied
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceUpdate withAutoUpdateStartDate(java.util.Date autoUpdateStartDate) {
        setAutoUpdateStartDate(autoUpdateStartDate);
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
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: ").append(getServiceUpdateName()).append(",");
        if (getReleaseDate() != null)
            sb.append("ReleaseDate: ").append(getReleaseDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getNodesUpdated() != null)
            sb.append("NodesUpdated: ").append(getNodesUpdated()).append(",");
        if (getAutoUpdateStartDate() != null)
            sb.append("AutoUpdateStartDate: ").append(getAutoUpdateStartDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceUpdate == false)
            return false;
        ServiceUpdate other = (ServiceUpdate) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getReleaseDate() == null ^ this.getReleaseDate() == null)
            return false;
        if (other.getReleaseDate() != null && other.getReleaseDate().equals(this.getReleaseDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getNodesUpdated() == null ^ this.getNodesUpdated() == null)
            return false;
        if (other.getNodesUpdated() != null && other.getNodesUpdated().equals(this.getNodesUpdated()) == false)
            return false;
        if (other.getAutoUpdateStartDate() == null ^ this.getAutoUpdateStartDate() == null)
            return false;
        if (other.getAutoUpdateStartDate() != null && other.getAutoUpdateStartDate().equals(this.getAutoUpdateStartDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime * hashCode + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getNodesUpdated() == null) ? 0 : getNodesUpdated().hashCode());
        hashCode = prime * hashCode + ((getAutoUpdateStartDate() == null) ? 0 : getAutoUpdateStartDate().hashCode());
        return hashCode;
    }

    @Override
    public ServiceUpdate clone() {
        try {
            return (ServiceUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ServiceUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
