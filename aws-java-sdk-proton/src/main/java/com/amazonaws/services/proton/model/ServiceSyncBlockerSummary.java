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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * If a service instance is manually updated, Proton wants to prevent accidentally overriding a manual change.
 * </p>
 * <p>
 * A blocker is created because of the manual update or deletion of a service instance. The summary describes the
 * blocker as being active or resolved.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ServiceSyncBlockerSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceSyncBlockerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The latest active blockers for the synced service.
     * </p>
     */
    private java.util.List<SyncBlocker> latestBlockers;
    /**
     * <p>
     * The name of the service instance that you want sync your service configuration with.
     * </p>
     */
    private String serviceInstanceName;
    /**
     * <p>
     * The name of the service that you want to get the sync blocker summary for. If given a service instance name and a
     * service name, it will return the blockers only applying to the instance that is blocked.
     * </p>
     * <p>
     * If given only a service name, it will return the blockers that apply to all of the instances. In order to get the
     * blockers for a single instance, you will need to make two distinct calls, one to get the sync blocker summary for
     * the service and the other to get the sync blocker for the service instance.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The latest active blockers for the synced service.
     * </p>
     * 
     * @return The latest active blockers for the synced service.
     */

    public java.util.List<SyncBlocker> getLatestBlockers() {
        return latestBlockers;
    }

    /**
     * <p>
     * The latest active blockers for the synced service.
     * </p>
     * 
     * @param latestBlockers
     *        The latest active blockers for the synced service.
     */

    public void setLatestBlockers(java.util.Collection<SyncBlocker> latestBlockers) {
        if (latestBlockers == null) {
            this.latestBlockers = null;
            return;
        }

        this.latestBlockers = new java.util.ArrayList<SyncBlocker>(latestBlockers);
    }

    /**
     * <p>
     * The latest active blockers for the synced service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLatestBlockers(java.util.Collection)} or {@link #withLatestBlockers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param latestBlockers
     *        The latest active blockers for the synced service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSyncBlockerSummary withLatestBlockers(SyncBlocker... latestBlockers) {
        if (this.latestBlockers == null) {
            setLatestBlockers(new java.util.ArrayList<SyncBlocker>(latestBlockers.length));
        }
        for (SyncBlocker ele : latestBlockers) {
            this.latestBlockers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The latest active blockers for the synced service.
     * </p>
     * 
     * @param latestBlockers
     *        The latest active blockers for the synced service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSyncBlockerSummary withLatestBlockers(java.util.Collection<SyncBlocker> latestBlockers) {
        setLatestBlockers(latestBlockers);
        return this;
    }

    /**
     * <p>
     * The name of the service instance that you want sync your service configuration with.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance that you want sync your service configuration with.
     */

    public void setServiceInstanceName(String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance that you want sync your service configuration with.
     * </p>
     * 
     * @return The name of the service instance that you want sync your service configuration with.
     */

    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance that you want sync your service configuration with.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance that you want sync your service configuration with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSyncBlockerSummary withServiceInstanceName(String serviceInstanceName) {
        setServiceInstanceName(serviceInstanceName);
        return this;
    }

    /**
     * <p>
     * The name of the service that you want to get the sync blocker summary for. If given a service instance name and a
     * service name, it will return the blockers only applying to the instance that is blocked.
     * </p>
     * <p>
     * If given only a service name, it will return the blockers that apply to all of the instances. In order to get the
     * blockers for a single instance, you will need to make two distinct calls, one to get the sync blocker summary for
     * the service and the other to get the sync blocker for the service instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that you want to get the sync blocker summary for. If given a service instance
     *        name and a service name, it will return the blockers only applying to the instance that is blocked.</p>
     *        <p>
     *        If given only a service name, it will return the blockers that apply to all of the instances. In order to
     *        get the blockers for a single instance, you will need to make two distinct calls, one to get the sync
     *        blocker summary for the service and the other to get the sync blocker for the service instance.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that you want to get the sync blocker summary for. If given a service instance name and a
     * service name, it will return the blockers only applying to the instance that is blocked.
     * </p>
     * <p>
     * If given only a service name, it will return the blockers that apply to all of the instances. In order to get the
     * blockers for a single instance, you will need to make two distinct calls, one to get the sync blocker summary for
     * the service and the other to get the sync blocker for the service instance.
     * </p>
     * 
     * @return The name of the service that you want to get the sync blocker summary for. If given a service instance
     *         name and a service name, it will return the blockers only applying to the instance that is blocked.</p>
     *         <p>
     *         If given only a service name, it will return the blockers that apply to all of the instances. In order to
     *         get the blockers for a single instance, you will need to make two distinct calls, one to get the sync
     *         blocker summary for the service and the other to get the sync blocker for the service instance.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that you want to get the sync blocker summary for. If given a service instance name and a
     * service name, it will return the blockers only applying to the instance that is blocked.
     * </p>
     * <p>
     * If given only a service name, it will return the blockers that apply to all of the instances. In order to get the
     * blockers for a single instance, you will need to make two distinct calls, one to get the sync blocker summary for
     * the service and the other to get the sync blocker for the service instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that you want to get the sync blocker summary for. If given a service instance
     *        name and a service name, it will return the blockers only applying to the instance that is blocked.</p>
     *        <p>
     *        If given only a service name, it will return the blockers that apply to all of the instances. In order to
     *        get the blockers for a single instance, you will need to make two distinct calls, one to get the sync
     *        blocker summary for the service and the other to get the sync blocker for the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceSyncBlockerSummary withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getLatestBlockers() != null)
            sb.append("LatestBlockers: ").append(getLatestBlockers()).append(",");
        if (getServiceInstanceName() != null)
            sb.append("ServiceInstanceName: ").append(getServiceInstanceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceSyncBlockerSummary == false)
            return false;
        ServiceSyncBlockerSummary other = (ServiceSyncBlockerSummary) obj;
        if (other.getLatestBlockers() == null ^ this.getLatestBlockers() == null)
            return false;
        if (other.getLatestBlockers() != null && other.getLatestBlockers().equals(this.getLatestBlockers()) == false)
            return false;
        if (other.getServiceInstanceName() == null ^ this.getServiceInstanceName() == null)
            return false;
        if (other.getServiceInstanceName() != null && other.getServiceInstanceName().equals(this.getServiceInstanceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLatestBlockers() == null) ? 0 : getLatestBlockers().hashCode());
        hashCode = prime * hashCode + ((getServiceInstanceName() == null) ? 0 : getServiceInstanceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public ServiceSyncBlockerSummary clone() {
        try {
            return (ServiceSyncBlockerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ServiceSyncBlockerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
