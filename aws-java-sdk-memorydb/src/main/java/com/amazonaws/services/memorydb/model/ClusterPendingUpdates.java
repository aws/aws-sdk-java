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
 * A list of updates being applied to the cluster
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ClusterPendingUpdates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterPendingUpdates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     */
    private ReshardingStatus resharding;
    /**
     * <p>
     * A list of ACLs associated with the cluster that are being updated
     * </p>
     */
    private ACLsUpdateStatus aCLs;
    /**
     * <p>
     * A list of service updates being applied to the cluster
     * </p>
     */
    private java.util.List<PendingModifiedServiceUpdate> serviceUpdates;

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     * 
     * @param resharding
     *        The status of an online resharding operation.
     */

    public void setResharding(ReshardingStatus resharding) {
        this.resharding = resharding;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     * 
     * @return The status of an online resharding operation.
     */

    public ReshardingStatus getResharding() {
        return this.resharding;
    }

    /**
     * <p>
     * The status of an online resharding operation.
     * </p>
     * 
     * @param resharding
     *        The status of an online resharding operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingUpdates withResharding(ReshardingStatus resharding) {
        setResharding(resharding);
        return this;
    }

    /**
     * <p>
     * A list of ACLs associated with the cluster that are being updated
     * </p>
     * 
     * @param aCLs
     *        A list of ACLs associated with the cluster that are being updated
     */

    public void setACLs(ACLsUpdateStatus aCLs) {
        this.aCLs = aCLs;
    }

    /**
     * <p>
     * A list of ACLs associated with the cluster that are being updated
     * </p>
     * 
     * @return A list of ACLs associated with the cluster that are being updated
     */

    public ACLsUpdateStatus getACLs() {
        return this.aCLs;
    }

    /**
     * <p>
     * A list of ACLs associated with the cluster that are being updated
     * </p>
     * 
     * @param aCLs
     *        A list of ACLs associated with the cluster that are being updated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingUpdates withACLs(ACLsUpdateStatus aCLs) {
        setACLs(aCLs);
        return this;
    }

    /**
     * <p>
     * A list of service updates being applied to the cluster
     * </p>
     * 
     * @return A list of service updates being applied to the cluster
     */

    public java.util.List<PendingModifiedServiceUpdate> getServiceUpdates() {
        return serviceUpdates;
    }

    /**
     * <p>
     * A list of service updates being applied to the cluster
     * </p>
     * 
     * @param serviceUpdates
     *        A list of service updates being applied to the cluster
     */

    public void setServiceUpdates(java.util.Collection<PendingModifiedServiceUpdate> serviceUpdates) {
        if (serviceUpdates == null) {
            this.serviceUpdates = null;
            return;
        }

        this.serviceUpdates = new java.util.ArrayList<PendingModifiedServiceUpdate>(serviceUpdates);
    }

    /**
     * <p>
     * A list of service updates being applied to the cluster
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceUpdates(java.util.Collection)} or {@link #withServiceUpdates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param serviceUpdates
     *        A list of service updates being applied to the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingUpdates withServiceUpdates(PendingModifiedServiceUpdate... serviceUpdates) {
        if (this.serviceUpdates == null) {
            setServiceUpdates(new java.util.ArrayList<PendingModifiedServiceUpdate>(serviceUpdates.length));
        }
        for (PendingModifiedServiceUpdate ele : serviceUpdates) {
            this.serviceUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of service updates being applied to the cluster
     * </p>
     * 
     * @param serviceUpdates
     *        A list of service updates being applied to the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterPendingUpdates withServiceUpdates(java.util.Collection<PendingModifiedServiceUpdate> serviceUpdates) {
        setServiceUpdates(serviceUpdates);
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
        if (getResharding() != null)
            sb.append("Resharding: ").append(getResharding()).append(",");
        if (getACLs() != null)
            sb.append("ACLs: ").append(getACLs()).append(",");
        if (getServiceUpdates() != null)
            sb.append("ServiceUpdates: ").append(getServiceUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterPendingUpdates == false)
            return false;
        ClusterPendingUpdates other = (ClusterPendingUpdates) obj;
        if (other.getResharding() == null ^ this.getResharding() == null)
            return false;
        if (other.getResharding() != null && other.getResharding().equals(this.getResharding()) == false)
            return false;
        if (other.getACLs() == null ^ this.getACLs() == null)
            return false;
        if (other.getACLs() != null && other.getACLs().equals(this.getACLs()) == false)
            return false;
        if (other.getServiceUpdates() == null ^ this.getServiceUpdates() == null)
            return false;
        if (other.getServiceUpdates() != null && other.getServiceUpdates().equals(this.getServiceUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResharding() == null) ? 0 : getResharding().hashCode());
        hashCode = prime * hashCode + ((getACLs() == null) ? 0 : getACLs().hashCode());
        hashCode = prime * hashCode + ((getServiceUpdates() == null) ? 0 : getServiceUpdates().hashCode());
        return hashCode;
    }

    @Override
    public ClusterPendingUpdates clone() {
        try {
            return (ClusterPendingUpdates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ClusterPendingUpdatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
