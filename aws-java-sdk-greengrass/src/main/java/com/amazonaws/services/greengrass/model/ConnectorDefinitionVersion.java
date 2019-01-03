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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about the connector definition version, which is a container for connectors.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ConnectorDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorDefinitionVersion implements Serializable, Cloneable, StructuredPojo {

    /** A list of references to connectors in this version, with their corresponding configuration settings. */
    private java.util.List<Connector> connectors;

    /**
     * A list of references to connectors in this version, with their corresponding configuration settings.
     * 
     * @return A list of references to connectors in this version, with their corresponding configuration settings.
     */

    public java.util.List<Connector> getConnectors() {
        return connectors;
    }

    /**
     * A list of references to connectors in this version, with their corresponding configuration settings.
     * 
     * @param connectors
     *        A list of references to connectors in this version, with their corresponding configuration settings.
     */

    public void setConnectors(java.util.Collection<Connector> connectors) {
        if (connectors == null) {
            this.connectors = null;
            return;
        }

        this.connectors = new java.util.ArrayList<Connector>(connectors);
    }

    /**
     * A list of references to connectors in this version, with their corresponding configuration settings.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectors(java.util.Collection)} or {@link #withConnectors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param connectors
     *        A list of references to connectors in this version, with their corresponding configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDefinitionVersion withConnectors(Connector... connectors) {
        if (this.connectors == null) {
            setConnectors(new java.util.ArrayList<Connector>(connectors.length));
        }
        for (Connector ele : connectors) {
            this.connectors.add(ele);
        }
        return this;
    }

    /**
     * A list of references to connectors in this version, with their corresponding configuration settings.
     * 
     * @param connectors
     *        A list of references to connectors in this version, with their corresponding configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorDefinitionVersion withConnectors(java.util.Collection<Connector> connectors) {
        setConnectors(connectors);
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
        if (getConnectors() != null)
            sb.append("Connectors: ").append(getConnectors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorDefinitionVersion == false)
            return false;
        ConnectorDefinitionVersion other = (ConnectorDefinitionVersion) obj;
        if (other.getConnectors() == null ^ this.getConnectors() == null)
            return false;
        if (other.getConnectors() != null && other.getConnectors().equals(this.getConnectors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectors() == null) ? 0 : getConnectors().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorDefinitionVersion clone() {
        try {
            return (ConnectorDefinitionVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.ConnectorDefinitionVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
