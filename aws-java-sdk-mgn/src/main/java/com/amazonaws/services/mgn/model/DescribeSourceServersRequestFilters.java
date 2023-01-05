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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Request to filter Source Servers list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DescribeSourceServersRequestFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSourceServersRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Request to filter Source Servers list by application IDs.
     * </p>
     */
    private java.util.List<String> applicationIDs;
    /**
     * <p>
     * Request to filter Source Servers list by archived.
     * </p>
     */
    private Boolean isArchived;
    /**
     * <p>
     * Request to filter Source Servers list by life cycle states.
     * </p>
     */
    private java.util.List<String> lifeCycleStates;
    /**
     * <p>
     * Request to filter Source Servers list by replication type.
     * </p>
     */
    private java.util.List<String> replicationTypes;
    /**
     * <p>
     * Request to filter Source Servers list by Source Server ID.
     * </p>
     */
    private java.util.List<String> sourceServerIDs;

    /**
     * <p>
     * Request to filter Source Servers list by application IDs.
     * </p>
     * 
     * @return Request to filter Source Servers list by application IDs.
     */

    public java.util.List<String> getApplicationIDs() {
        return applicationIDs;
    }

    /**
     * <p>
     * Request to filter Source Servers list by application IDs.
     * </p>
     * 
     * @param applicationIDs
     *        Request to filter Source Servers list by application IDs.
     */

    public void setApplicationIDs(java.util.Collection<String> applicationIDs) {
        if (applicationIDs == null) {
            this.applicationIDs = null;
            return;
        }

        this.applicationIDs = new java.util.ArrayList<String>(applicationIDs);
    }

    /**
     * <p>
     * Request to filter Source Servers list by application IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationIDs(java.util.Collection)} or {@link #withApplicationIDs(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param applicationIDs
     *        Request to filter Source Servers list by application IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withApplicationIDs(String... applicationIDs) {
        if (this.applicationIDs == null) {
            setApplicationIDs(new java.util.ArrayList<String>(applicationIDs.length));
        }
        for (String ele : applicationIDs) {
            this.applicationIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by application IDs.
     * </p>
     * 
     * @param applicationIDs
     *        Request to filter Source Servers list by application IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withApplicationIDs(java.util.Collection<String> applicationIDs) {
        setApplicationIDs(applicationIDs);
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by archived.
     * </p>
     * 
     * @param isArchived
     *        Request to filter Source Servers list by archived.
     */

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    /**
     * <p>
     * Request to filter Source Servers list by archived.
     * </p>
     * 
     * @return Request to filter Source Servers list by archived.
     */

    public Boolean getIsArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Request to filter Source Servers list by archived.
     * </p>
     * 
     * @param isArchived
     *        Request to filter Source Servers list by archived.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withIsArchived(Boolean isArchived) {
        setIsArchived(isArchived);
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by archived.
     * </p>
     * 
     * @return Request to filter Source Servers list by archived.
     */

    public Boolean isArchived() {
        return this.isArchived;
    }

    /**
     * <p>
     * Request to filter Source Servers list by life cycle states.
     * </p>
     * 
     * @return Request to filter Source Servers list by life cycle states.
     * @see LifeCycleState
     */

    public java.util.List<String> getLifeCycleStates() {
        return lifeCycleStates;
    }

    /**
     * <p>
     * Request to filter Source Servers list by life cycle states.
     * </p>
     * 
     * @param lifeCycleStates
     *        Request to filter Source Servers list by life cycle states.
     * @see LifeCycleState
     */

    public void setLifeCycleStates(java.util.Collection<String> lifeCycleStates) {
        if (lifeCycleStates == null) {
            this.lifeCycleStates = null;
            return;
        }

        this.lifeCycleStates = new java.util.ArrayList<String>(lifeCycleStates);
    }

    /**
     * <p>
     * Request to filter Source Servers list by life cycle states.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLifeCycleStates(java.util.Collection)} or {@link #withLifeCycleStates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lifeCycleStates
     *        Request to filter Source Servers list by life cycle states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public DescribeSourceServersRequestFilters withLifeCycleStates(String... lifeCycleStates) {
        if (this.lifeCycleStates == null) {
            setLifeCycleStates(new java.util.ArrayList<String>(lifeCycleStates.length));
        }
        for (String ele : lifeCycleStates) {
            this.lifeCycleStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by life cycle states.
     * </p>
     * 
     * @param lifeCycleStates
     *        Request to filter Source Servers list by life cycle states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public DescribeSourceServersRequestFilters withLifeCycleStates(java.util.Collection<String> lifeCycleStates) {
        setLifeCycleStates(lifeCycleStates);
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by life cycle states.
     * </p>
     * 
     * @param lifeCycleStates
     *        Request to filter Source Servers list by life cycle states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LifeCycleState
     */

    public DescribeSourceServersRequestFilters withLifeCycleStates(LifeCycleState... lifeCycleStates) {
        java.util.ArrayList<String> lifeCycleStatesCopy = new java.util.ArrayList<String>(lifeCycleStates.length);
        for (LifeCycleState value : lifeCycleStates) {
            lifeCycleStatesCopy.add(value.toString());
        }
        if (getLifeCycleStates() == null) {
            setLifeCycleStates(lifeCycleStatesCopy);
        } else {
            getLifeCycleStates().addAll(lifeCycleStatesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by replication type.
     * </p>
     * 
     * @return Request to filter Source Servers list by replication type.
     * @see ReplicationType
     */

    public java.util.List<String> getReplicationTypes() {
        return replicationTypes;
    }

    /**
     * <p>
     * Request to filter Source Servers list by replication type.
     * </p>
     * 
     * @param replicationTypes
     *        Request to filter Source Servers list by replication type.
     * @see ReplicationType
     */

    public void setReplicationTypes(java.util.Collection<String> replicationTypes) {
        if (replicationTypes == null) {
            this.replicationTypes = null;
            return;
        }

        this.replicationTypes = new java.util.ArrayList<String>(replicationTypes);
    }

    /**
     * <p>
     * Request to filter Source Servers list by replication type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationTypes(java.util.Collection)} or {@link #withReplicationTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param replicationTypes
     *        Request to filter Source Servers list by replication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationType
     */

    public DescribeSourceServersRequestFilters withReplicationTypes(String... replicationTypes) {
        if (this.replicationTypes == null) {
            setReplicationTypes(new java.util.ArrayList<String>(replicationTypes.length));
        }
        for (String ele : replicationTypes) {
            this.replicationTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by replication type.
     * </p>
     * 
     * @param replicationTypes
     *        Request to filter Source Servers list by replication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationType
     */

    public DescribeSourceServersRequestFilters withReplicationTypes(java.util.Collection<String> replicationTypes) {
        setReplicationTypes(replicationTypes);
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by replication type.
     * </p>
     * 
     * @param replicationTypes
     *        Request to filter Source Servers list by replication type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationType
     */

    public DescribeSourceServersRequestFilters withReplicationTypes(ReplicationType... replicationTypes) {
        java.util.ArrayList<String> replicationTypesCopy = new java.util.ArrayList<String>(replicationTypes.length);
        for (ReplicationType value : replicationTypes) {
            replicationTypesCopy.add(value.toString());
        }
        if (getReplicationTypes() == null) {
            setReplicationTypes(replicationTypesCopy);
        } else {
            getReplicationTypes().addAll(replicationTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by Source Server ID.
     * </p>
     * 
     * @return Request to filter Source Servers list by Source Server ID.
     */

    public java.util.List<String> getSourceServerIDs() {
        return sourceServerIDs;
    }

    /**
     * <p>
     * Request to filter Source Servers list by Source Server ID.
     * </p>
     * 
     * @param sourceServerIDs
     *        Request to filter Source Servers list by Source Server ID.
     */

    public void setSourceServerIDs(java.util.Collection<String> sourceServerIDs) {
        if (sourceServerIDs == null) {
            this.sourceServerIDs = null;
            return;
        }

        this.sourceServerIDs = new java.util.ArrayList<String>(sourceServerIDs);
    }

    /**
     * <p>
     * Request to filter Source Servers list by Source Server ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceServerIDs(java.util.Collection)} or {@link #withSourceServerIDs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceServerIDs
     *        Request to filter Source Servers list by Source Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withSourceServerIDs(String... sourceServerIDs) {
        if (this.sourceServerIDs == null) {
            setSourceServerIDs(new java.util.ArrayList<String>(sourceServerIDs.length));
        }
        for (String ele : sourceServerIDs) {
            this.sourceServerIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Request to filter Source Servers list by Source Server ID.
     * </p>
     * 
     * @param sourceServerIDs
     *        Request to filter Source Servers list by Source Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSourceServersRequestFilters withSourceServerIDs(java.util.Collection<String> sourceServerIDs) {
        setSourceServerIDs(sourceServerIDs);
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
        if (getApplicationIDs() != null)
            sb.append("ApplicationIDs: ").append(getApplicationIDs()).append(",");
        if (getIsArchived() != null)
            sb.append("IsArchived: ").append(getIsArchived()).append(",");
        if (getLifeCycleStates() != null)
            sb.append("LifeCycleStates: ").append(getLifeCycleStates()).append(",");
        if (getReplicationTypes() != null)
            sb.append("ReplicationTypes: ").append(getReplicationTypes()).append(",");
        if (getSourceServerIDs() != null)
            sb.append("SourceServerIDs: ").append(getSourceServerIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSourceServersRequestFilters == false)
            return false;
        DescribeSourceServersRequestFilters other = (DescribeSourceServersRequestFilters) obj;
        if (other.getApplicationIDs() == null ^ this.getApplicationIDs() == null)
            return false;
        if (other.getApplicationIDs() != null && other.getApplicationIDs().equals(this.getApplicationIDs()) == false)
            return false;
        if (other.getIsArchived() == null ^ this.getIsArchived() == null)
            return false;
        if (other.getIsArchived() != null && other.getIsArchived().equals(this.getIsArchived()) == false)
            return false;
        if (other.getLifeCycleStates() == null ^ this.getLifeCycleStates() == null)
            return false;
        if (other.getLifeCycleStates() != null && other.getLifeCycleStates().equals(this.getLifeCycleStates()) == false)
            return false;
        if (other.getReplicationTypes() == null ^ this.getReplicationTypes() == null)
            return false;
        if (other.getReplicationTypes() != null && other.getReplicationTypes().equals(this.getReplicationTypes()) == false)
            return false;
        if (other.getSourceServerIDs() == null ^ this.getSourceServerIDs() == null)
            return false;
        if (other.getSourceServerIDs() != null && other.getSourceServerIDs().equals(this.getSourceServerIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationIDs() == null) ? 0 : getApplicationIDs().hashCode());
        hashCode = prime * hashCode + ((getIsArchived() == null) ? 0 : getIsArchived().hashCode());
        hashCode = prime * hashCode + ((getLifeCycleStates() == null) ? 0 : getLifeCycleStates().hashCode());
        hashCode = prime * hashCode + ((getReplicationTypes() == null) ? 0 : getReplicationTypes().hashCode());
        hashCode = prime * hashCode + ((getSourceServerIDs() == null) ? 0 : getSourceServerIDs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSourceServersRequestFilters clone() {
        try {
            return (DescribeSourceServersRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.DescribeSourceServersRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
