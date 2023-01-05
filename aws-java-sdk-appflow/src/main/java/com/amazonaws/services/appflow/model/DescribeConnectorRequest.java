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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The connector type, such as CUSTOMCONNECTOR, Saleforce, Marketo. Please choose CUSTOMCONNECTOR for Lambda based
     * custom connectors.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account. Only needed if calling for CUSTOMCONNECTOR connector type/.
     * </p>
     */
    private String connectorLabel;

    /**
     * <p>
     * The connector type, such as CUSTOMCONNECTOR, Saleforce, Marketo. Please choose CUSTOMCONNECTOR for Lambda based
     * custom connectors.
     * </p>
     * 
     * @param connectorType
     *        The connector type, such as CUSTOMCONNECTOR, Saleforce, Marketo. Please choose CUSTOMCONNECTOR for Lambda
     *        based custom connectors.
     * @see ConnectorType
     */

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * <p>
     * The connector type, such as CUSTOMCONNECTOR, Saleforce, Marketo. Please choose CUSTOMCONNECTOR for Lambda based
     * custom connectors.
     * </p>
     * 
     * @return The connector type, such as CUSTOMCONNECTOR, Saleforce, Marketo. Please choose CUSTOMCONNECTOR for Lambda
     *         based custom connectors.
     * @see ConnectorType
     */

    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * <p>
     * The connector type, such as CUSTOMCONNECTOR, Saleforce, Marketo. Please choose CUSTOMCONNECTOR for Lambda based
     * custom connectors.
     * </p>
     * 
     * @param connectorType
     *        The connector type, such as CUSTOMCONNECTOR, Saleforce, Marketo. Please choose CUSTOMCONNECTOR for Lambda
     *        based custom connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public DescribeConnectorRequest withConnectorType(String connectorType) {
        setConnectorType(connectorType);
        return this;
    }

    /**
     * <p>
     * The connector type, such as CUSTOMCONNECTOR, Saleforce, Marketo. Please choose CUSTOMCONNECTOR for Lambda based
     * custom connectors.
     * </p>
     * 
     * @param connectorType
     *        The connector type, such as CUSTOMCONNECTOR, Saleforce, Marketo. Please choose CUSTOMCONNECTOR for Lambda
     *        based custom connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public DescribeConnectorRequest withConnectorType(ConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account. Only needed if calling for CUSTOMCONNECTOR connector type/.
     * </p>
     * 
     * @param connectorLabel
     *        The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon
     *        Web Services account. Only needed if calling for CUSTOMCONNECTOR connector type/.
     */

    public void setConnectorLabel(String connectorLabel) {
        this.connectorLabel = connectorLabel;
    }

    /**
     * <p>
     * The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account. Only needed if calling for CUSTOMCONNECTOR connector type/.
     * </p>
     * 
     * @return The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your
     *         Amazon Web Services account. Only needed if calling for CUSTOMCONNECTOR connector type/.
     */

    public String getConnectorLabel() {
        return this.connectorLabel;
    }

    /**
     * <p>
     * The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon Web
     * Services account. Only needed if calling for CUSTOMCONNECTOR connector type/.
     * </p>
     * 
     * @param connectorLabel
     *        The label of the connector. The label is unique for each <code>ConnectorRegistration</code> in your Amazon
     *        Web Services account. Only needed if calling for CUSTOMCONNECTOR connector type/.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorRequest withConnectorLabel(String connectorLabel) {
        setConnectorLabel(connectorLabel);
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
        if (getConnectorLabel() != null)
            sb.append("ConnectorLabel: ").append(getConnectorLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConnectorRequest == false)
            return false;
        DescribeConnectorRequest other = (DescribeConnectorRequest) obj;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getConnectorLabel() == null ^ this.getConnectorLabel() == null)
            return false;
        if (other.getConnectorLabel() != null && other.getConnectorLabel().equals(this.getConnectorLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getConnectorLabel() == null) ? 0 : getConnectorLabel().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectorRequest clone() {
        return (DescribeConnectorRequest) super.clone();
    }

}
