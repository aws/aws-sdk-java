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
 * Information about a connector. Connectors run on the Greengrass core and contain built-in integration with local
 * infrastructure, device protocols, AWS, and other cloud services.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/Connector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Connector implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the connector. */
    private String connectorArn;
    /**
     * A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition
     * version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
     */
    private String id;
    /** The parameters or configuration that the connector uses. */
    private java.util.Map<String, String> parameters;

    /**
     * The ARN of the connector.
     * 
     * @param connectorArn
     *        The ARN of the connector.
     */

    public void setConnectorArn(String connectorArn) {
        this.connectorArn = connectorArn;
    }

    /**
     * The ARN of the connector.
     * 
     * @return The ARN of the connector.
     */

    public String getConnectorArn() {
        return this.connectorArn;
    }

    /**
     * The ARN of the connector.
     * 
     * @param connectorArn
     *        The ARN of the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withConnectorArn(String connectorArn) {
        setConnectorArn(connectorArn);
        return this;
    }

    /**
     * A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition
     * version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
     * 
     * @param id
     *        A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition
     *        version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition
     * version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
     * 
     * @return A descriptive or arbitrary ID for the connector. This value must be unique within the connector
     *         definition version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
     */

    public String getId() {
        return this.id;
    }

    /**
     * A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition
     * version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
     * 
     * @param id
     *        A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition
     *        version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The parameters or configuration that the connector uses.
     * 
     * @return The parameters or configuration that the connector uses.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * The parameters or configuration that the connector uses.
     * 
     * @param parameters
     *        The parameters or configuration that the connector uses.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * The parameters or configuration that the connector uses.
     * 
     * @param parameters
     *        The parameters or configuration that the connector uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public Connector addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Connector clearParametersEntries() {
        this.parameters = null;
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
        if (getConnectorArn() != null)
            sb.append("ConnectorArn: ").append(getConnectorArn()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Connector == false)
            return false;
        Connector other = (Connector) obj;
        if (other.getConnectorArn() == null ^ this.getConnectorArn() == null)
            return false;
        if (other.getConnectorArn() != null && other.getConnectorArn().equals(this.getConnectorArn()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorArn() == null) ? 0 : getConnectorArn().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public Connector clone() {
        try {
            return (Connector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.ConnectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
