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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/UpdateConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Update Connector request connector ID.
     * </p>
     */
    private String connectorID;
    /**
     * <p>
     * Update Connector request name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Update Connector request SSM command config.
     * </p>
     */
    private ConnectorSsmCommandConfig ssmCommandConfig;

    /**
     * <p>
     * Update Connector request connector ID.
     * </p>
     * 
     * @param connectorID
     *        Update Connector request connector ID.
     */

    public void setConnectorID(String connectorID) {
        this.connectorID = connectorID;
    }

    /**
     * <p>
     * Update Connector request connector ID.
     * </p>
     * 
     * @return Update Connector request connector ID.
     */

    public String getConnectorID() {
        return this.connectorID;
    }

    /**
     * <p>
     * Update Connector request connector ID.
     * </p>
     * 
     * @param connectorID
     *        Update Connector request connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withConnectorID(String connectorID) {
        setConnectorID(connectorID);
        return this;
    }

    /**
     * <p>
     * Update Connector request name.
     * </p>
     * 
     * @param name
     *        Update Connector request name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Update Connector request name.
     * </p>
     * 
     * @return Update Connector request name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Update Connector request name.
     * </p>
     * 
     * @param name
     *        Update Connector request name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Update Connector request SSM command config.
     * </p>
     * 
     * @param ssmCommandConfig
     *        Update Connector request SSM command config.
     */

    public void setSsmCommandConfig(ConnectorSsmCommandConfig ssmCommandConfig) {
        this.ssmCommandConfig = ssmCommandConfig;
    }

    /**
     * <p>
     * Update Connector request SSM command config.
     * </p>
     * 
     * @return Update Connector request SSM command config.
     */

    public ConnectorSsmCommandConfig getSsmCommandConfig() {
        return this.ssmCommandConfig;
    }

    /**
     * <p>
     * Update Connector request SSM command config.
     * </p>
     * 
     * @param ssmCommandConfig
     *        Update Connector request SSM command config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withSsmCommandConfig(ConnectorSsmCommandConfig ssmCommandConfig) {
        setSsmCommandConfig(ssmCommandConfig);
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
        if (getConnectorID() != null)
            sb.append("ConnectorID: ").append(getConnectorID()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSsmCommandConfig() != null)
            sb.append("SsmCommandConfig: ").append(getSsmCommandConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectorRequest == false)
            return false;
        UpdateConnectorRequest other = (UpdateConnectorRequest) obj;
        if (other.getConnectorID() == null ^ this.getConnectorID() == null)
            return false;
        if (other.getConnectorID() != null && other.getConnectorID().equals(this.getConnectorID()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSsmCommandConfig() == null ^ this.getSsmCommandConfig() == null)
            return false;
        if (other.getSsmCommandConfig() != null && other.getSsmCommandConfig().equals(this.getSsmCommandConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorID() == null) ? 0 : getConnectorID().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSsmCommandConfig() == null) ? 0 : getSsmCommandConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectorRequest clone() {
        return (UpdateConnectorRequest) super.clone();
    }

}
