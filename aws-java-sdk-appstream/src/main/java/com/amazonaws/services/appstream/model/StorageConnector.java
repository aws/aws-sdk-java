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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a connector to enable persistent storage for users.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/StorageConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageConnector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of storage connector.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * The ARN of the storage connector.
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * The names of the domains for the account.
     * </p>
     */
    private java.util.List<String> domains;

    /**
     * <p>
     * The type of storage connector.
     * </p>
     * 
     * @param connectorType
     *        The type of storage connector.
     * @see StorageConnectorType
     */

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * <p>
     * The type of storage connector.
     * </p>
     * 
     * @return The type of storage connector.
     * @see StorageConnectorType
     */

    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * <p>
     * The type of storage connector.
     * </p>
     * 
     * @param connectorType
     *        The type of storage connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageConnectorType
     */

    public StorageConnector withConnectorType(String connectorType) {
        setConnectorType(connectorType);
        return this;
    }

    /**
     * <p>
     * The type of storage connector.
     * </p>
     * 
     * @param connectorType
     *        The type of storage connector.
     * @see StorageConnectorType
     */

    public void setConnectorType(StorageConnectorType connectorType) {
        withConnectorType(connectorType);
    }

    /**
     * <p>
     * The type of storage connector.
     * </p>
     * 
     * @param connectorType
     *        The type of storage connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageConnectorType
     */

    public StorageConnector withConnectorType(StorageConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the storage connector.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ARN of the storage connector.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of the storage connector.
     * </p>
     * 
     * @return The ARN of the storage connector.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The ARN of the storage connector.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ARN of the storage connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConnector withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The names of the domains for the account.
     * </p>
     * 
     * @return The names of the domains for the account.
     */

    public java.util.List<String> getDomains() {
        return domains;
    }

    /**
     * <p>
     * The names of the domains for the account.
     * </p>
     * 
     * @param domains
     *        The names of the domains for the account.
     */

    public void setDomains(java.util.Collection<String> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }

        this.domains = new java.util.ArrayList<String>(domains);
    }

    /**
     * <p>
     * The names of the domains for the account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomains(java.util.Collection)} or {@link #withDomains(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param domains
     *        The names of the domains for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConnector withDomains(String... domains) {
        if (this.domains == null) {
            setDomains(new java.util.ArrayList<String>(domains.length));
        }
        for (String ele : domains) {
            this.domains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the domains for the account.
     * </p>
     * 
     * @param domains
     *        The names of the domains for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageConnector withDomains(java.util.Collection<String> domains) {
        setDomains(domains);
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
        if (getConnectorType() != null)
            sb.append("ConnectorType: ").append(getConnectorType()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getDomains() != null)
            sb.append("Domains: ").append(getDomains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageConnector == false)
            return false;
        StorageConnector other = (StorageConnector) obj;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getDomains() == null ^ this.getDomains() == null)
            return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode());
        return hashCode;
    }

    @Override
    public StorageConnector clone() {
        try {
            return (StorageConnector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.StorageConnectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
