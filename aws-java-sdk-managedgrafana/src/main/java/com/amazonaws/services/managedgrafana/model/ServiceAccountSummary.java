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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the information about one service account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/ServiceAccountSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceAccountSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The role of the service account, which sets the permission level used when calling Grafana APIs.
     * </p>
     */
    private String grafanaRole;
    /**
     * <p>
     * The unique ID of the service account.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Returns true if the service account is disabled. Service accounts can be disabled and enabled in the Amazon
     * Managed Grafana console.
     * </p>
     */
    private String isDisabled;
    /**
     * <p>
     * The name of the service account.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The role of the service account, which sets the permission level used when calling Grafana APIs.
     * </p>
     * 
     * @param grafanaRole
     *        The role of the service account, which sets the permission level used when calling Grafana APIs.
     * @see Role
     */

    public void setGrafanaRole(String grafanaRole) {
        this.grafanaRole = grafanaRole;
    }

    /**
     * <p>
     * The role of the service account, which sets the permission level used when calling Grafana APIs.
     * </p>
     * 
     * @return The role of the service account, which sets the permission level used when calling Grafana APIs.
     * @see Role
     */

    public String getGrafanaRole() {
        return this.grafanaRole;
    }

    /**
     * <p>
     * The role of the service account, which sets the permission level used when calling Grafana APIs.
     * </p>
     * 
     * @param grafanaRole
     *        The role of the service account, which sets the permission level used when calling Grafana APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public ServiceAccountSummary withGrafanaRole(String grafanaRole) {
        setGrafanaRole(grafanaRole);
        return this;
    }

    /**
     * <p>
     * The role of the service account, which sets the permission level used when calling Grafana APIs.
     * </p>
     * 
     * @param grafanaRole
     *        The role of the service account, which sets the permission level used when calling Grafana APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Role
     */

    public ServiceAccountSummary withGrafanaRole(Role grafanaRole) {
        this.grafanaRole = grafanaRole.toString();
        return this;
    }

    /**
     * <p>
     * The unique ID of the service account.
     * </p>
     * 
     * @param id
     *        The unique ID of the service account.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the service account.
     * </p>
     * 
     * @return The unique ID of the service account.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the service account.
     * </p>
     * 
     * @param id
     *        The unique ID of the service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Returns true if the service account is disabled. Service accounts can be disabled and enabled in the Amazon
     * Managed Grafana console.
     * </p>
     * 
     * @param isDisabled
     *        Returns true if the service account is disabled. Service accounts can be disabled and enabled in the
     *        Amazon Managed Grafana console.
     */

    public void setIsDisabled(String isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * <p>
     * Returns true if the service account is disabled. Service accounts can be disabled and enabled in the Amazon
     * Managed Grafana console.
     * </p>
     * 
     * @return Returns true if the service account is disabled. Service accounts can be disabled and enabled in the
     *         Amazon Managed Grafana console.
     */

    public String getIsDisabled() {
        return this.isDisabled;
    }

    /**
     * <p>
     * Returns true if the service account is disabled. Service accounts can be disabled and enabled in the Amazon
     * Managed Grafana console.
     * </p>
     * 
     * @param isDisabled
     *        Returns true if the service account is disabled. Service accounts can be disabled and enabled in the
     *        Amazon Managed Grafana console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountSummary withIsDisabled(String isDisabled) {
        setIsDisabled(isDisabled);
        return this;
    }

    /**
     * <p>
     * The name of the service account.
     * </p>
     * 
     * @param name
     *        The name of the service account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service account.
     * </p>
     * 
     * @return The name of the service account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service account.
     * </p>
     * 
     * @param name
     *        The name of the service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceAccountSummary withName(String name) {
        setName(name);
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
        if (getGrafanaRole() != null)
            sb.append("GrafanaRole: ").append(getGrafanaRole()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIsDisabled() != null)
            sb.append("IsDisabled: ").append(getIsDisabled()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceAccountSummary == false)
            return false;
        ServiceAccountSummary other = (ServiceAccountSummary) obj;
        if (other.getGrafanaRole() == null ^ this.getGrafanaRole() == null)
            return false;
        if (other.getGrafanaRole() != null && other.getGrafanaRole().equals(this.getGrafanaRole()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIsDisabled() == null ^ this.getIsDisabled() == null)
            return false;
        if (other.getIsDisabled() != null && other.getIsDisabled().equals(this.getIsDisabled()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrafanaRole() == null) ? 0 : getGrafanaRole().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIsDisabled() == null) ? 0 : getIsDisabled().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ServiceAccountSummary clone() {
        try {
            return (ServiceAccountSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.ServiceAccountSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
