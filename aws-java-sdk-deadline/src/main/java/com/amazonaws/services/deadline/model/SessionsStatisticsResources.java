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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the fleet IDs or queue IDs to return statistics. You can specify only fleet IDs or queue IDS, not both.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SessionsStatisticsResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionsStatisticsResources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One to 10 fleet IDs that specify the fleets to return statistics for. If you specify the <code>fleetIds</code>
     * field, you can't specify the <code>queueIds</code> field.
     * </p>
     */
    private java.util.List<String> fleetIds;
    /**
     * <p>
     * One to 10 queue IDs that specify the queues to return statistics for. If you specify the <code>queueIds</code>
     * field, you can't specify the <code>fleetIds</code> field.
     * </p>
     */
    private java.util.List<String> queueIds;

    /**
     * <p>
     * One to 10 fleet IDs that specify the fleets to return statistics for. If you specify the <code>fleetIds</code>
     * field, you can't specify the <code>queueIds</code> field.
     * </p>
     * 
     * @return One to 10 fleet IDs that specify the fleets to return statistics for. If you specify the
     *         <code>fleetIds</code> field, you can't specify the <code>queueIds</code> field.
     */

    public java.util.List<String> getFleetIds() {
        return fleetIds;
    }

    /**
     * <p>
     * One to 10 fleet IDs that specify the fleets to return statistics for. If you specify the <code>fleetIds</code>
     * field, you can't specify the <code>queueIds</code> field.
     * </p>
     * 
     * @param fleetIds
     *        One to 10 fleet IDs that specify the fleets to return statistics for. If you specify the
     *        <code>fleetIds</code> field, you can't specify the <code>queueIds</code> field.
     */

    public void setFleetIds(java.util.Collection<String> fleetIds) {
        if (fleetIds == null) {
            this.fleetIds = null;
            return;
        }

        this.fleetIds = new java.util.ArrayList<String>(fleetIds);
    }

    /**
     * <p>
     * One to 10 fleet IDs that specify the fleets to return statistics for. If you specify the <code>fleetIds</code>
     * field, you can't specify the <code>queueIds</code> field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetIds(java.util.Collection)} or {@link #withFleetIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param fleetIds
     *        One to 10 fleet IDs that specify the fleets to return statistics for. If you specify the
     *        <code>fleetIds</code> field, you can't specify the <code>queueIds</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionsStatisticsResources withFleetIds(String... fleetIds) {
        if (this.fleetIds == null) {
            setFleetIds(new java.util.ArrayList<String>(fleetIds.length));
        }
        for (String ele : fleetIds) {
            this.fleetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One to 10 fleet IDs that specify the fleets to return statistics for. If you specify the <code>fleetIds</code>
     * field, you can't specify the <code>queueIds</code> field.
     * </p>
     * 
     * @param fleetIds
     *        One to 10 fleet IDs that specify the fleets to return statistics for. If you specify the
     *        <code>fleetIds</code> field, you can't specify the <code>queueIds</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionsStatisticsResources withFleetIds(java.util.Collection<String> fleetIds) {
        setFleetIds(fleetIds);
        return this;
    }

    /**
     * <p>
     * One to 10 queue IDs that specify the queues to return statistics for. If you specify the <code>queueIds</code>
     * field, you can't specify the <code>fleetIds</code> field.
     * </p>
     * 
     * @return One to 10 queue IDs that specify the queues to return statistics for. If you specify the
     *         <code>queueIds</code> field, you can't specify the <code>fleetIds</code> field.
     */

    public java.util.List<String> getQueueIds() {
        return queueIds;
    }

    /**
     * <p>
     * One to 10 queue IDs that specify the queues to return statistics for. If you specify the <code>queueIds</code>
     * field, you can't specify the <code>fleetIds</code> field.
     * </p>
     * 
     * @param queueIds
     *        One to 10 queue IDs that specify the queues to return statistics for. If you specify the
     *        <code>queueIds</code> field, you can't specify the <code>fleetIds</code> field.
     */

    public void setQueueIds(java.util.Collection<String> queueIds) {
        if (queueIds == null) {
            this.queueIds = null;
            return;
        }

        this.queueIds = new java.util.ArrayList<String>(queueIds);
    }

    /**
     * <p>
     * One to 10 queue IDs that specify the queues to return statistics for. If you specify the <code>queueIds</code>
     * field, you can't specify the <code>fleetIds</code> field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueueIds(java.util.Collection)} or {@link #withQueueIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param queueIds
     *        One to 10 queue IDs that specify the queues to return statistics for. If you specify the
     *        <code>queueIds</code> field, you can't specify the <code>fleetIds</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionsStatisticsResources withQueueIds(String... queueIds) {
        if (this.queueIds == null) {
            setQueueIds(new java.util.ArrayList<String>(queueIds.length));
        }
        for (String ele : queueIds) {
            this.queueIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One to 10 queue IDs that specify the queues to return statistics for. If you specify the <code>queueIds</code>
     * field, you can't specify the <code>fleetIds</code> field.
     * </p>
     * 
     * @param queueIds
     *        One to 10 queue IDs that specify the queues to return statistics for. If you specify the
     *        <code>queueIds</code> field, you can't specify the <code>fleetIds</code> field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionsStatisticsResources withQueueIds(java.util.Collection<String> queueIds) {
        setQueueIds(queueIds);
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
        if (getFleetIds() != null)
            sb.append("FleetIds: ").append(getFleetIds()).append(",");
        if (getQueueIds() != null)
            sb.append("QueueIds: ").append(getQueueIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionsStatisticsResources == false)
            return false;
        SessionsStatisticsResources other = (SessionsStatisticsResources) obj;
        if (other.getFleetIds() == null ^ this.getFleetIds() == null)
            return false;
        if (other.getFleetIds() != null && other.getFleetIds().equals(this.getFleetIds()) == false)
            return false;
        if (other.getQueueIds() == null ^ this.getQueueIds() == null)
            return false;
        if (other.getQueueIds() != null && other.getQueueIds().equals(this.getQueueIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetIds() == null) ? 0 : getFleetIds().hashCode());
        hashCode = prime * hashCode + ((getQueueIds() == null) ? 0 : getQueueIds().hashCode());
        return hashCode;
    }

    @Override
    public SessionsStatisticsResources clone() {
        try {
            return (SessionsStatisticsResources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.SessionsStatisticsResourcesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
