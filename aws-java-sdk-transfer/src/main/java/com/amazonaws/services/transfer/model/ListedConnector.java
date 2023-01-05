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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns details of the connector that is specified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListedConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListedConnector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified connector.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     */
    private String connectorId;
    /**
     * <p>
     * The URL of the partner's AS2 endpoint.
     * </p>
     */
    private String url;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified connector.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified connector.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified connector.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified connector.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified connector.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the specified connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedConnector withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @param connectorId
     *        The unique identifier for the connector.
     */

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @return The unique identifier for the connector.
     */

    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * <p>
     * The unique identifier for the connector.
     * </p>
     * 
     * @param connectorId
     *        The unique identifier for the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedConnector withConnectorId(String connectorId) {
        setConnectorId(connectorId);
        return this;
    }

    /**
     * <p>
     * The URL of the partner's AS2 endpoint.
     * </p>
     * 
     * @param url
     *        The URL of the partner's AS2 endpoint.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the partner's AS2 endpoint.
     * </p>
     * 
     * @return The URL of the partner's AS2 endpoint.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the partner's AS2 endpoint.
     * </p>
     * 
     * @param url
     *        The URL of the partner's AS2 endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListedConnector withUrl(String url) {
        setUrl(url);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getConnectorId() != null)
            sb.append("ConnectorId: ").append(getConnectorId()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListedConnector == false)
            return false;
        ListedConnector other = (ListedConnector) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getConnectorId() == null ^ this.getConnectorId() == null)
            return false;
        if (other.getConnectorId() != null && other.getConnectorId().equals(this.getConnectorId()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public ListedConnector clone() {
        try {
            return (ListedConnector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.ListedConnectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
