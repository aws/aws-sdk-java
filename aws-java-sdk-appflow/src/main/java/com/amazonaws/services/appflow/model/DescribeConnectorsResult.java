/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration that is applied to the connectors used in the flow.
     * </p>
     */
    private java.util.Map<String, ConnectorConfiguration> connectorConfigurations;
    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The configuration that is applied to the connectors used in the flow.
     * </p>
     * 
     * @return The configuration that is applied to the connectors used in the flow.
     */

    public java.util.Map<String, ConnectorConfiguration> getConnectorConfigurations() {
        return connectorConfigurations;
    }

    /**
     * <p>
     * The configuration that is applied to the connectors used in the flow.
     * </p>
     * 
     * @param connectorConfigurations
     *        The configuration that is applied to the connectors used in the flow.
     */

    public void setConnectorConfigurations(java.util.Map<String, ConnectorConfiguration> connectorConfigurations) {
        this.connectorConfigurations = connectorConfigurations;
    }

    /**
     * <p>
     * The configuration that is applied to the connectors used in the flow.
     * </p>
     * 
     * @param connectorConfigurations
     *        The configuration that is applied to the connectors used in the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorsResult withConnectorConfigurations(java.util.Map<String, ConnectorConfiguration> connectorConfigurations) {
        setConnectorConfigurations(connectorConfigurations);
        return this;
    }

    /**
     * Add a single ConnectorConfigurations entry
     *
     * @see DescribeConnectorsResult#withConnectorConfigurations
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorsResult addConnectorConfigurationsEntry(String key, ConnectorConfiguration value) {
        if (null == this.connectorConfigurations) {
            this.connectorConfigurations = new java.util.HashMap<String, ConnectorConfiguration>();
        }
        if (this.connectorConfigurations.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.connectorConfigurations.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ConnectorConfigurations.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorsResult clearConnectorConfigurationsEntries() {
        this.connectorConfigurations = null;
        return this;
    }

    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next page of data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     * 
     * @return The pagination token for the next page of data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     * 
     * @param nextToken
     *        The pagination token for the next page of data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getConnectorConfigurations() != null)
            sb.append("ConnectorConfigurations: ").append(getConnectorConfigurations()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConnectorsResult == false)
            return false;
        DescribeConnectorsResult other = (DescribeConnectorsResult) obj;
        if (other.getConnectorConfigurations() == null ^ this.getConnectorConfigurations() == null)
            return false;
        if (other.getConnectorConfigurations() != null && other.getConnectorConfigurations().equals(this.getConnectorConfigurations()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorConfigurations() == null) ? 0 : getConnectorConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectorsResult clone() {
        try {
            return (DescribeConnectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
