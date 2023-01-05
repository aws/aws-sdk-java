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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the registered connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description about the registered connector.
     * </p>
     */
    private String connectorDescription;
    /**
     * <p>
     * The name of the connector.
     * </p>
     */
    private String connectorName;
    /**
     * <p>
     * The owner of the connector.
     * </p>
     */
    private String connectorOwner;
    /**
     * <p>
     * The connector version.
     * </p>
     */
    private String connectorVersion;
    /**
     * <p>
     * The application type of the connector.
     * </p>
     */
    private String applicationType;
    /**
     * <p>
     * The connector type.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * A label used for the connector.
     * </p>
     */
    private String connectorLabel;
    /**
     * <p>
     * The time at which the connector was registered.
     * </p>
     */
    private java.util.Date registeredAt;
    /**
     * <p>
     * The user who registered the connector.
     * </p>
     */
    private String registeredBy;
    /**
     * <p>
     * The provisioning type that the connector uses.
     * </p>
     */
    private String connectorProvisioningType;
    /**
     * <p>
     * The connection mode that the connector supports.
     * </p>
     */
    private java.util.List<String> connectorModes;

    /**
     * <p>
     * A description about the registered connector.
     * </p>
     * 
     * @param connectorDescription
     *        A description about the registered connector.
     */

    public void setConnectorDescription(String connectorDescription) {
        this.connectorDescription = connectorDescription;
    }

    /**
     * <p>
     * A description about the registered connector.
     * </p>
     * 
     * @return A description about the registered connector.
     */

    public String getConnectorDescription() {
        return this.connectorDescription;
    }

    /**
     * <p>
     * A description about the registered connector.
     * </p>
     * 
     * @param connectorDescription
     *        A description about the registered connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDetail withConnectorDescription(String connectorDescription) {
        setConnectorDescription(connectorDescription);
        return this;
    }

    /**
     * <p>
     * The name of the connector.
     * </p>
     * 
     * @param connectorName
     *        The name of the connector.
     */

    public void setConnectorName(String connectorName) {
        this.connectorName = connectorName;
    }

    /**
     * <p>
     * The name of the connector.
     * </p>
     * 
     * @return The name of the connector.
     */

    public String getConnectorName() {
        return this.connectorName;
    }

    /**
     * <p>
     * The name of the connector.
     * </p>
     * 
     * @param connectorName
     *        The name of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDetail withConnectorName(String connectorName) {
        setConnectorName(connectorName);
        return this;
    }

    /**
     * <p>
     * The owner of the connector.
     * </p>
     * 
     * @param connectorOwner
     *        The owner of the connector.
     */

    public void setConnectorOwner(String connectorOwner) {
        this.connectorOwner = connectorOwner;
    }

    /**
     * <p>
     * The owner of the connector.
     * </p>
     * 
     * @return The owner of the connector.
     */

    public String getConnectorOwner() {
        return this.connectorOwner;
    }

    /**
     * <p>
     * The owner of the connector.
     * </p>
     * 
     * @param connectorOwner
     *        The owner of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDetail withConnectorOwner(String connectorOwner) {
        setConnectorOwner(connectorOwner);
        return this;
    }

    /**
     * <p>
     * The connector version.
     * </p>
     * 
     * @param connectorVersion
     *        The connector version.
     */

    public void setConnectorVersion(String connectorVersion) {
        this.connectorVersion = connectorVersion;
    }

    /**
     * <p>
     * The connector version.
     * </p>
     * 
     * @return The connector version.
     */

    public String getConnectorVersion() {
        return this.connectorVersion;
    }

    /**
     * <p>
     * The connector version.
     * </p>
     * 
     * @param connectorVersion
     *        The connector version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDetail withConnectorVersion(String connectorVersion) {
        setConnectorVersion(connectorVersion);
        return this;
    }

    /**
     * <p>
     * The application type of the connector.
     * </p>
     * 
     * @param applicationType
     *        The application type of the connector.
     */

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    /**
     * <p>
     * The application type of the connector.
     * </p>
     * 
     * @return The application type of the connector.
     */

    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * <p>
     * The application type of the connector.
     * </p>
     * 
     * @param applicationType
     *        The application type of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDetail withApplicationType(String applicationType) {
        setApplicationType(applicationType);
        return this;
    }

    /**
     * <p>
     * The connector type.
     * </p>
     * 
     * @param connectorType
     *        The connector type.
     * @see ConnectorType
     */

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * <p>
     * The connector type.
     * </p>
     * 
     * @return The connector type.
     * @see ConnectorType
     */

    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * <p>
     * The connector type.
     * </p>
     * 
     * @param connectorType
     *        The connector type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ConnectorDetail withConnectorType(String connectorType) {
        setConnectorType(connectorType);
        return this;
    }

    /**
     * <p>
     * The connector type.
     * </p>
     * 
     * @param connectorType
     *        The connector type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public ConnectorDetail withConnectorType(ConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * A label used for the connector.
     * </p>
     * 
     * @param connectorLabel
     *        A label used for the connector.
     */

    public void setConnectorLabel(String connectorLabel) {
        this.connectorLabel = connectorLabel;
    }

    /**
     * <p>
     * A label used for the connector.
     * </p>
     * 
     * @return A label used for the connector.
     */

    public String getConnectorLabel() {
        return this.connectorLabel;
    }

    /**
     * <p>
     * A label used for the connector.
     * </p>
     * 
     * @param connectorLabel
     *        A label used for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDetail withConnectorLabel(String connectorLabel) {
        setConnectorLabel(connectorLabel);
        return this;
    }

    /**
     * <p>
     * The time at which the connector was registered.
     * </p>
     * 
     * @param registeredAt
     *        The time at which the connector was registered.
     */

    public void setRegisteredAt(java.util.Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    /**
     * <p>
     * The time at which the connector was registered.
     * </p>
     * 
     * @return The time at which the connector was registered.
     */

    public java.util.Date getRegisteredAt() {
        return this.registeredAt;
    }

    /**
     * <p>
     * The time at which the connector was registered.
     * </p>
     * 
     * @param registeredAt
     *        The time at which the connector was registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDetail withRegisteredAt(java.util.Date registeredAt) {
        setRegisteredAt(registeredAt);
        return this;
    }

    /**
     * <p>
     * The user who registered the connector.
     * </p>
     * 
     * @param registeredBy
     *        The user who registered the connector.
     */

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    /**
     * <p>
     * The user who registered the connector.
     * </p>
     * 
     * @return The user who registered the connector.
     */

    public String getRegisteredBy() {
        return this.registeredBy;
    }

    /**
     * <p>
     * The user who registered the connector.
     * </p>
     * 
     * @param registeredBy
     *        The user who registered the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDetail withRegisteredBy(String registeredBy) {
        setRegisteredBy(registeredBy);
        return this;
    }

    /**
     * <p>
     * The provisioning type that the connector uses.
     * </p>
     * 
     * @param connectorProvisioningType
     *        The provisioning type that the connector uses.
     * @see ConnectorProvisioningType
     */

    public void setConnectorProvisioningType(String connectorProvisioningType) {
        this.connectorProvisioningType = connectorProvisioningType;
    }

    /**
     * <p>
     * The provisioning type that the connector uses.
     * </p>
     * 
     * @return The provisioning type that the connector uses.
     * @see ConnectorProvisioningType
     */

    public String getConnectorProvisioningType() {
        return this.connectorProvisioningType;
    }

    /**
     * <p>
     * The provisioning type that the connector uses.
     * </p>
     * 
     * @param connectorProvisioningType
     *        The provisioning type that the connector uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorProvisioningType
     */

    public ConnectorDetail withConnectorProvisioningType(String connectorProvisioningType) {
        setConnectorProvisioningType(connectorProvisioningType);
        return this;
    }

    /**
     * <p>
     * The provisioning type that the connector uses.
     * </p>
     * 
     * @param connectorProvisioningType
     *        The provisioning type that the connector uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorProvisioningType
     */

    public ConnectorDetail withConnectorProvisioningType(ConnectorProvisioningType connectorProvisioningType) {
        this.connectorProvisioningType = connectorProvisioningType.toString();
        return this;
    }

    /**
     * <p>
     * The connection mode that the connector supports.
     * </p>
     * 
     * @return The connection mode that the connector supports.
     */

    public java.util.List<String> getConnectorModes() {
        return connectorModes;
    }

    /**
     * <p>
     * The connection mode that the connector supports.
     * </p>
     * 
     * @param connectorModes
     *        The connection mode that the connector supports.
     */

    public void setConnectorModes(java.util.Collection<String> connectorModes) {
        if (connectorModes == null) {
            this.connectorModes = null;
            return;
        }

        this.connectorModes = new java.util.ArrayList<String>(connectorModes);
    }

    /**
     * <p>
     * The connection mode that the connector supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorModes(java.util.Collection)} or {@link #withConnectorModes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param connectorModes
     *        The connection mode that the connector supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDetail withConnectorModes(String... connectorModes) {
        if (this.connectorModes == null) {
            setConnectorModes(new java.util.ArrayList<String>(connectorModes.length));
        }
        for (String ele : connectorModes) {
            this.connectorModes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The connection mode that the connector supports.
     * </p>
     * 
     * @param connectorModes
     *        The connection mode that the connector supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDetail withConnectorModes(java.util.Collection<String> connectorModes) {
        setConnectorModes(connectorModes);
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
        if (getConnectorDescription() != null)
            sb.append("ConnectorDescription: ").append(getConnectorDescription()).append(",");
        if (getConnectorName() != null)
            sb.append("ConnectorName: ").append(getConnectorName()).append(",");
        if (getConnectorOwner() != null)
            sb.append("ConnectorOwner: ").append(getConnectorOwner()).append(",");
        if (getConnectorVersion() != null)
            sb.append("ConnectorVersion: ").append(getConnectorVersion()).append(",");
        if (getApplicationType() != null)
            sb.append("ApplicationType: ").append(getApplicationType()).append(",");
        if (getConnectorType() != null)
            sb.append("ConnectorType: ").append(getConnectorType()).append(",");
        if (getConnectorLabel() != null)
            sb.append("ConnectorLabel: ").append(getConnectorLabel()).append(",");
        if (getRegisteredAt() != null)
            sb.append("RegisteredAt: ").append(getRegisteredAt()).append(",");
        if (getRegisteredBy() != null)
            sb.append("RegisteredBy: ").append(getRegisteredBy()).append(",");
        if (getConnectorProvisioningType() != null)
            sb.append("ConnectorProvisioningType: ").append(getConnectorProvisioningType()).append(",");
        if (getConnectorModes() != null)
            sb.append("ConnectorModes: ").append(getConnectorModes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorDetail == false)
            return false;
        ConnectorDetail other = (ConnectorDetail) obj;
        if (other.getConnectorDescription() == null ^ this.getConnectorDescription() == null)
            return false;
        if (other.getConnectorDescription() != null && other.getConnectorDescription().equals(this.getConnectorDescription()) == false)
            return false;
        if (other.getConnectorName() == null ^ this.getConnectorName() == null)
            return false;
        if (other.getConnectorName() != null && other.getConnectorName().equals(this.getConnectorName()) == false)
            return false;
        if (other.getConnectorOwner() == null ^ this.getConnectorOwner() == null)
            return false;
        if (other.getConnectorOwner() != null && other.getConnectorOwner().equals(this.getConnectorOwner()) == false)
            return false;
        if (other.getConnectorVersion() == null ^ this.getConnectorVersion() == null)
            return false;
        if (other.getConnectorVersion() != null && other.getConnectorVersion().equals(this.getConnectorVersion()) == false)
            return false;
        if (other.getApplicationType() == null ^ this.getApplicationType() == null)
            return false;
        if (other.getApplicationType() != null && other.getApplicationType().equals(this.getApplicationType()) == false)
            return false;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getConnectorLabel() == null ^ this.getConnectorLabel() == null)
            return false;
        if (other.getConnectorLabel() != null && other.getConnectorLabel().equals(this.getConnectorLabel()) == false)
            return false;
        if (other.getRegisteredAt() == null ^ this.getRegisteredAt() == null)
            return false;
        if (other.getRegisteredAt() != null && other.getRegisteredAt().equals(this.getRegisteredAt()) == false)
            return false;
        if (other.getRegisteredBy() == null ^ this.getRegisteredBy() == null)
            return false;
        if (other.getRegisteredBy() != null && other.getRegisteredBy().equals(this.getRegisteredBy()) == false)
            return false;
        if (other.getConnectorProvisioningType() == null ^ this.getConnectorProvisioningType() == null)
            return false;
        if (other.getConnectorProvisioningType() != null && other.getConnectorProvisioningType().equals(this.getConnectorProvisioningType()) == false)
            return false;
        if (other.getConnectorModes() == null ^ this.getConnectorModes() == null)
            return false;
        if (other.getConnectorModes() != null && other.getConnectorModes().equals(this.getConnectorModes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorDescription() == null) ? 0 : getConnectorDescription().hashCode());
        hashCode = prime * hashCode + ((getConnectorName() == null) ? 0 : getConnectorName().hashCode());
        hashCode = prime * hashCode + ((getConnectorOwner() == null) ? 0 : getConnectorOwner().hashCode());
        hashCode = prime * hashCode + ((getConnectorVersion() == null) ? 0 : getConnectorVersion().hashCode());
        hashCode = prime * hashCode + ((getApplicationType() == null) ? 0 : getApplicationType().hashCode());
        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getConnectorLabel() == null) ? 0 : getConnectorLabel().hashCode());
        hashCode = prime * hashCode + ((getRegisteredAt() == null) ? 0 : getRegisteredAt().hashCode());
        hashCode = prime * hashCode + ((getRegisteredBy() == null) ? 0 : getRegisteredBy().hashCode());
        hashCode = prime * hashCode + ((getConnectorProvisioningType() == null) ? 0 : getConnectorProvisioningType().hashCode());
        hashCode = prime * hashCode + ((getConnectorModes() == null) ? 0 : getConnectorModes().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorDetail clone() {
        try {
            return (ConnectorDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
