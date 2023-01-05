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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectorEntity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectorEntityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The entity name for that connector.
     * </p>
     */
    private String connectorEntityName;
    /**
     * <p>
     * The type of connector application, such as Salesforce, Amplitude, and so on.
     * </p>
     */
    private String connectorType;
    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon Web
     * Services account.
     * </p>
     */
    private String connectorProfileName;
    /**
     * <p>
     * The version of the API that's used by the connector.
     * </p>
     */
    private String apiVersion;

    /**
     * <p>
     * The entity name for that connector.
     * </p>
     * 
     * @param connectorEntityName
     *        The entity name for that connector.
     */

    public void setConnectorEntityName(String connectorEntityName) {
        this.connectorEntityName = connectorEntityName;
    }

    /**
     * <p>
     * The entity name for that connector.
     * </p>
     * 
     * @return The entity name for that connector.
     */

    public String getConnectorEntityName() {
        return this.connectorEntityName;
    }

    /**
     * <p>
     * The entity name for that connector.
     * </p>
     * 
     * @param connectorEntityName
     *        The entity name for that connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorEntityRequest withConnectorEntityName(String connectorEntityName) {
        setConnectorEntityName(connectorEntityName);
        return this;
    }

    /**
     * <p>
     * The type of connector application, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector application, such as Salesforce, Amplitude, and so on.
     * @see ConnectorType
     */

    public void setConnectorType(String connectorType) {
        this.connectorType = connectorType;
    }

    /**
     * <p>
     * The type of connector application, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @return The type of connector application, such as Salesforce, Amplitude, and so on.
     * @see ConnectorType
     */

    public String getConnectorType() {
        return this.connectorType;
    }

    /**
     * <p>
     * The type of connector application, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector application, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public DescribeConnectorEntityRequest withConnectorType(String connectorType) {
        setConnectorType(connectorType);
        return this;
    }

    /**
     * <p>
     * The type of connector application, such as Salesforce, Amplitude, and so on.
     * </p>
     * 
     * @param connectorType
     *        The type of connector application, such as Salesforce, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public DescribeConnectorEntityRequest withConnectorType(ConnectorType connectorType) {
        this.connectorType = connectorType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon Web
     * Services account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon
     *        Web Services account.
     */

    public void setConnectorProfileName(String connectorProfileName) {
        this.connectorProfileName = connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon Web
     * Services account.
     * </p>
     * 
     * @return The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the
     *         Amazon Web Services account.
     */

    public String getConnectorProfileName() {
        return this.connectorProfileName;
    }

    /**
     * <p>
     * The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon Web
     * Services account.
     * </p>
     * 
     * @param connectorProfileName
     *        The name of the connector profile. The name is unique for each <code>ConnectorProfile</code> in the Amazon
     *        Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorEntityRequest withConnectorProfileName(String connectorProfileName) {
        setConnectorProfileName(connectorProfileName);
        return this;
    }

    /**
     * <p>
     * The version of the API that's used by the connector.
     * </p>
     * 
     * @param apiVersion
     *        The version of the API that's used by the connector.
     */

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * <p>
     * The version of the API that's used by the connector.
     * </p>
     * 
     * @return The version of the API that's used by the connector.
     */

    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * <p>
     * The version of the API that's used by the connector.
     * </p>
     * 
     * @param apiVersion
     *        The version of the API that's used by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorEntityRequest withApiVersion(String apiVersion) {
        setApiVersion(apiVersion);
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
        if (getConnectorEntityName() != null)
            sb.append("ConnectorEntityName: ").append(getConnectorEntityName()).append(",");
        if (getConnectorType() != null)
            sb.append("ConnectorType: ").append(getConnectorType()).append(",");
        if (getConnectorProfileName() != null)
            sb.append("ConnectorProfileName: ").append(getConnectorProfileName()).append(",");
        if (getApiVersion() != null)
            sb.append("ApiVersion: ").append(getApiVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConnectorEntityRequest == false)
            return false;
        DescribeConnectorEntityRequest other = (DescribeConnectorEntityRequest) obj;
        if (other.getConnectorEntityName() == null ^ this.getConnectorEntityName() == null)
            return false;
        if (other.getConnectorEntityName() != null && other.getConnectorEntityName().equals(this.getConnectorEntityName()) == false)
            return false;
        if (other.getConnectorType() == null ^ this.getConnectorType() == null)
            return false;
        if (other.getConnectorType() != null && other.getConnectorType().equals(this.getConnectorType()) == false)
            return false;
        if (other.getConnectorProfileName() == null ^ this.getConnectorProfileName() == null)
            return false;
        if (other.getConnectorProfileName() != null && other.getConnectorProfileName().equals(this.getConnectorProfileName()) == false)
            return false;
        if (other.getApiVersion() == null ^ this.getApiVersion() == null)
            return false;
        if (other.getApiVersion() != null && other.getApiVersion().equals(this.getApiVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorEntityName() == null) ? 0 : getConnectorEntityName().hashCode());
        hashCode = prime * hashCode + ((getConnectorType() == null) ? 0 : getConnectorType().hashCode());
        hashCode = prime * hashCode + ((getConnectorProfileName() == null) ? 0 : getConnectorProfileName().hashCode());
        hashCode = prime * hashCode + ((getApiVersion() == null) ? 0 : getApiVersion().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectorEntityRequest clone() {
        return (DescribeConnectorEntityRequest) super.clone();
    }

}
