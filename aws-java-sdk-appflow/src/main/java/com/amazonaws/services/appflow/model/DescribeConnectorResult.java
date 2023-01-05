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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Configuration info of all the connectors that the user requested.
     * </p>
     */
    private ConnectorConfiguration connectorConfiguration;

    /**
     * <p>
     * Configuration info of all the connectors that the user requested.
     * </p>
     * 
     * @param connectorConfiguration
     *        Configuration info of all the connectors that the user requested.
     */

    public void setConnectorConfiguration(ConnectorConfiguration connectorConfiguration) {
        this.connectorConfiguration = connectorConfiguration;
    }

    /**
     * <p>
     * Configuration info of all the connectors that the user requested.
     * </p>
     * 
     * @return Configuration info of all the connectors that the user requested.
     */

    public ConnectorConfiguration getConnectorConfiguration() {
        return this.connectorConfiguration;
    }

    /**
     * <p>
     * Configuration info of all the connectors that the user requested.
     * </p>
     * 
     * @param connectorConfiguration
     *        Configuration info of all the connectors that the user requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorResult withConnectorConfiguration(ConnectorConfiguration connectorConfiguration) {
        setConnectorConfiguration(connectorConfiguration);
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
        if (getConnectorConfiguration() != null)
            sb.append("ConnectorConfiguration: ").append(getConnectorConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConnectorResult == false)
            return false;
        DescribeConnectorResult other = (DescribeConnectorResult) obj;
        if (other.getConnectorConfiguration() == null ^ this.getConnectorConfiguration() == null)
            return false;
        if (other.getConnectorConfiguration() != null && other.getConnectorConfiguration().equals(this.getConnectorConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorConfiguration() == null) ? 0 : getConnectorConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectorResult clone() {
        try {
            return (DescribeConnectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
