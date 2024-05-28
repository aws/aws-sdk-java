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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List Connectors Request Filters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/ListConnectorsRequestFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConnectorsRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List Connectors Request Filters connector IDs.
     * </p>
     */
    private java.util.List<String> connectorIDs;

    /**
     * <p>
     * List Connectors Request Filters connector IDs.
     * </p>
     * 
     * @return List Connectors Request Filters connector IDs.
     */

    public java.util.List<String> getConnectorIDs() {
        return connectorIDs;
    }

    /**
     * <p>
     * List Connectors Request Filters connector IDs.
     * </p>
     * 
     * @param connectorIDs
     *        List Connectors Request Filters connector IDs.
     */

    public void setConnectorIDs(java.util.Collection<String> connectorIDs) {
        if (connectorIDs == null) {
            this.connectorIDs = null;
            return;
        }

        this.connectorIDs = new java.util.ArrayList<String>(connectorIDs);
    }

    /**
     * <p>
     * List Connectors Request Filters connector IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorIDs(java.util.Collection)} or {@link #withConnectorIDs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connectorIDs
     *        List Connectors Request Filters connector IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorsRequestFilters withConnectorIDs(String... connectorIDs) {
        if (this.connectorIDs == null) {
            setConnectorIDs(new java.util.ArrayList<String>(connectorIDs.length));
        }
        for (String ele : connectorIDs) {
            this.connectorIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List Connectors Request Filters connector IDs.
     * </p>
     * 
     * @param connectorIDs
     *        List Connectors Request Filters connector IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectorsRequestFilters withConnectorIDs(java.util.Collection<String> connectorIDs) {
        setConnectorIDs(connectorIDs);
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
        if (getConnectorIDs() != null)
            sb.append("ConnectorIDs: ").append(getConnectorIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConnectorsRequestFilters == false)
            return false;
        ListConnectorsRequestFilters other = (ListConnectorsRequestFilters) obj;
        if (other.getConnectorIDs() == null ^ this.getConnectorIDs() == null)
            return false;
        if (other.getConnectorIDs() != null && other.getConnectorIDs().equals(this.getConnectorIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorIDs() == null) ? 0 : getConnectorIDs().hashCode());
        return hashCode;
    }

    @Override
    public ListConnectorsRequestFilters clone() {
        try {
            return (ListConnectorsRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.ListConnectorsRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
