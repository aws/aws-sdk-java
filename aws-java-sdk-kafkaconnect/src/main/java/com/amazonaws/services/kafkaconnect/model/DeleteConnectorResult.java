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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/DeleteConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConnectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector that you requested to delete.
     * </p>
     */
    private String connectorArn;
    /**
     * <p>
     * The state of the connector that you requested to delete.
     * </p>
     */
    private String connectorState;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector that you requested to delete.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) of the connector that you requested to delete.
     */

    public void setConnectorArn(String connectorArn) {
        this.connectorArn = connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector that you requested to delete.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connector that you requested to delete.
     */

    public String getConnectorArn() {
        return this.connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector that you requested to delete.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) of the connector that you requested to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectorResult withConnectorArn(String connectorArn) {
        setConnectorArn(connectorArn);
        return this;
    }

    /**
     * <p>
     * The state of the connector that you requested to delete.
     * </p>
     * 
     * @param connectorState
     *        The state of the connector that you requested to delete.
     * @see ConnectorState
     */

    public void setConnectorState(String connectorState) {
        this.connectorState = connectorState;
    }

    /**
     * <p>
     * The state of the connector that you requested to delete.
     * </p>
     * 
     * @return The state of the connector that you requested to delete.
     * @see ConnectorState
     */

    public String getConnectorState() {
        return this.connectorState;
    }

    /**
     * <p>
     * The state of the connector that you requested to delete.
     * </p>
     * 
     * @param connectorState
     *        The state of the connector that you requested to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorState
     */

    public DeleteConnectorResult withConnectorState(String connectorState) {
        setConnectorState(connectorState);
        return this;
    }

    /**
     * <p>
     * The state of the connector that you requested to delete.
     * </p>
     * 
     * @param connectorState
     *        The state of the connector that you requested to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorState
     */

    public DeleteConnectorResult withConnectorState(ConnectorState connectorState) {
        this.connectorState = connectorState.toString();
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
        if (getConnectorState() != null)
            sb.append("ConnectorState: ").append(getConnectorState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConnectorResult == false)
            return false;
        DeleteConnectorResult other = (DeleteConnectorResult) obj;
        if (other.getConnectorArn() == null ^ this.getConnectorArn() == null)
            return false;
        if (other.getConnectorArn() != null && other.getConnectorArn().equals(this.getConnectorArn()) == false)
            return false;
        if (other.getConnectorState() == null ^ this.getConnectorState() == null)
            return false;
        if (other.getConnectorState() != null && other.getConnectorState().equals(this.getConnectorState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorArn() == null) ? 0 : getConnectorArn().hashCode());
        hashCode = prime * hashCode + ((getConnectorState() == null) ? 0 : getConnectorState().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConnectorResult clone() {
        try {
            return (DeleteConnectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
