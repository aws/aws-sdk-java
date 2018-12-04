/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a storage connector.
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
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
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
