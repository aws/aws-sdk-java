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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     */
    private java.util.List<String> connectorTypes;
    /**
     * <p>
     * The pagination token for the next page of data.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @return The type of connector, such as Salesforce, Amplitude, and so on.
     * @see ConnectorType
     */

    public java.util.List<String> getConnectorTypes() {
        return connectorTypes;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorTypes
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @see ConnectorType
     */

    public void setConnectorTypes(java.util.Collection<String> connectorTypes) {
        if (connectorTypes == null) {
            this.connectorTypes = null;
            return;
        }

        this.connectorTypes = new java.util.ArrayList<String>(connectorTypes);
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorTypes(java.util.Collection)} or {@link #withConnectorTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param connectorTypes
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public DescribeConnectorsRequest withConnectorTypes(String... connectorTypes) {
        if (this.connectorTypes == null) {
            setConnectorTypes(new java.util.ArrayList<String>(connectorTypes.length));
        }
        for (String ele : connectorTypes) {
            this.connectorTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorTypes
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public DescribeConnectorsRequest withConnectorTypes(java.util.Collection<String> connectorTypes) {
        setConnectorTypes(connectorTypes);
        return this;
    }

    /**
     * <p>
     * The type of connector, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorTypes
     *        The type of connector, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public DescribeConnectorsRequest withConnectorTypes(ConnectorType... connectorTypes) {
        java.util.ArrayList<String> connectorTypesCopy = new java.util.ArrayList<String>(connectorTypes.length);
        for (ConnectorType value : connectorTypes) {
            connectorTypesCopy.add(value.toString());
        }
        if (getConnectorTypes() == null) {
            setConnectorTypes(connectorTypesCopy);
        } else {
            getConnectorTypes().addAll(connectorTypesCopy);
        }
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

    public DescribeConnectorsRequest withNextToken(String nextToken) {
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
        if (getConnectorTypes() != null)
            sb.append("ConnectorTypes: ").append(getConnectorTypes()).append(",");
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

        if (obj instanceof DescribeConnectorsRequest == false)
            return false;
        DescribeConnectorsRequest other = (DescribeConnectorsRequest) obj;
        if (other.getConnectorTypes() == null ^ this.getConnectorTypes() == null)
            return false;
        if (other.getConnectorTypes() != null && other.getConnectorTypes().equals(this.getConnectorTypes()) == false)
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

        hashCode = prime * hashCode + ((getConnectorTypes() == null) ? 0 : getConnectorTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectorsRequest clone() {
        return (DescribeConnectorsRequest) super.clone();
    }

}
