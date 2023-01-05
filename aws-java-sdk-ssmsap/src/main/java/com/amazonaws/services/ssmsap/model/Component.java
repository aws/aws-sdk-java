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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/Component" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Component implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String componentId;
    /** <p/> */
    private String applicationId;
    /** <p/> */
    private String componentType;
    /** <p/> */
    private String status;
    /** <p/> */
    private java.util.List<String> databases;
    /** <p/> */
    private java.util.List<Host> hosts;
    /** <p/> */
    private String primaryHost;
    /** <p/> */
    private java.util.Date lastUpdated;

    /**
     * <p/>
     * 
     * @param componentId
     */

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getComponentId() {
        return this.componentId;
    }

    /**
     * <p/>
     * 
     * @param componentId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withComponentId(String componentId) {
        setComponentId(componentId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param applicationId
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p/>
     * 
     * @param applicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param componentType
     * @see ComponentType
     */

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ComponentType
     */

    public String getComponentType() {
        return this.componentType;
    }

    /**
     * <p/>
     * 
     * @param componentType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentType
     */

    public Component withComponentType(String componentType) {
        setComponentType(componentType);
        return this;
    }

    /**
     * <p/>
     * 
     * @param componentType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentType
     */

    public Component withComponentType(ComponentType componentType) {
        this.componentType = componentType.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param status
     * @see ComponentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p/>
     * 
     * @return
     * @see ComponentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p/>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentStatus
     */

    public Component withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p/>
     * 
     * @param status
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComponentStatus
     */

    public Component withStatus(ComponentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getDatabases() {
        return databases;
    }

    /**
     * <p/>
     * 
     * @param databases
     */

    public void setDatabases(java.util.Collection<String> databases) {
        if (databases == null) {
            this.databases = null;
            return;
        }

        this.databases = new java.util.ArrayList<String>(databases);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabases(java.util.Collection)} or {@link #withDatabases(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param databases
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withDatabases(String... databases) {
        if (this.databases == null) {
            setDatabases(new java.util.ArrayList<String>(databases.length));
        }
        for (String ele : databases) {
            this.databases.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param databases
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withDatabases(java.util.Collection<String> databases) {
        setDatabases(databases);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<Host> getHosts() {
        return hosts;
    }

    /**
     * <p/>
     * 
     * @param hosts
     */

    public void setHosts(java.util.Collection<Host> hosts) {
        if (hosts == null) {
            this.hosts = null;
            return;
        }

        this.hosts = new java.util.ArrayList<Host>(hosts);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHosts(java.util.Collection)} or {@link #withHosts(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param hosts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withHosts(Host... hosts) {
        if (this.hosts == null) {
            setHosts(new java.util.ArrayList<Host>(hosts.length));
        }
        for (Host ele : hosts) {
            this.hosts.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param hosts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withHosts(java.util.Collection<Host> hosts) {
        setHosts(hosts);
        return this;
    }

    /**
     * <p/>
     * 
     * @param primaryHost
     */

    public void setPrimaryHost(String primaryHost) {
        this.primaryHost = primaryHost;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getPrimaryHost() {
        return this.primaryHost;
    }

    /**
     * <p/>
     * 
     * @param primaryHost
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withPrimaryHost(String primaryHost) {
        setPrimaryHost(primaryHost);
        return this;
    }

    /**
     * <p/>
     * 
     * @param lastUpdated
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p/>
     * 
     * @param lastUpdated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
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
        if (getComponentId() != null)
            sb.append("ComponentId: ").append(getComponentId()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getComponentType() != null)
            sb.append("ComponentType: ").append(getComponentType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDatabases() != null)
            sb.append("Databases: ").append(getDatabases()).append(",");
        if (getHosts() != null)
            sb.append("Hosts: ").append(getHosts()).append(",");
        if (getPrimaryHost() != null)
            sb.append("PrimaryHost: ").append(getPrimaryHost()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Component == false)
            return false;
        Component other = (Component) obj;
        if (other.getComponentId() == null ^ this.getComponentId() == null)
            return false;
        if (other.getComponentId() != null && other.getComponentId().equals(this.getComponentId()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getComponentType() == null ^ this.getComponentType() == null)
            return false;
        if (other.getComponentType() != null && other.getComponentType().equals(this.getComponentType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDatabases() == null ^ this.getDatabases() == null)
            return false;
        if (other.getDatabases() != null && other.getDatabases().equals(this.getDatabases()) == false)
            return false;
        if (other.getHosts() == null ^ this.getHosts() == null)
            return false;
        if (other.getHosts() != null && other.getHosts().equals(this.getHosts()) == false)
            return false;
        if (other.getPrimaryHost() == null ^ this.getPrimaryHost() == null)
            return false;
        if (other.getPrimaryHost() != null && other.getPrimaryHost().equals(this.getPrimaryHost()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentId() == null) ? 0 : getComponentId().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getComponentType() == null) ? 0 : getComponentType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDatabases() == null) ? 0 : getDatabases().hashCode());
        hashCode = prime * hashCode + ((getHosts() == null) ? 0 : getHosts().hashCode());
        hashCode = prime * hashCode + ((getPrimaryHost() == null) ? 0 : getPrimaryHost().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        return hashCode;
    }

    @Override
    public Component clone() {
        try {
            return (Component) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmsap.model.transform.ComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
