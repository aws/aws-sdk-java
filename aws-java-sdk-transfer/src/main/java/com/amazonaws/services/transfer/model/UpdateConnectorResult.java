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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the identifier of the connector object that you are updating.
     * </p>
     */
    private String connectorId;

    /**
     * <p>
     * Returns the identifier of the connector object that you are updating.
     * </p>
     * 
     * @param connectorId
     *        Returns the identifier of the connector object that you are updating.
     */

    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
     * <p>
     * Returns the identifier of the connector object that you are updating.
     * </p>
     * 
     * @return Returns the identifier of the connector object that you are updating.
     */

    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * <p>
     * Returns the identifier of the connector object that you are updating.
     * </p>
     * 
     * @param connectorId
     *        Returns the identifier of the connector object that you are updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorResult withConnectorId(String connectorId) {
        setConnectorId(connectorId);
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
        if (getConnectorId() != null)
            sb.append("ConnectorId: ").append(getConnectorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectorResult == false)
            return false;
        UpdateConnectorResult other = (UpdateConnectorResult) obj;
        if (other.getConnectorId() == null ^ this.getConnectorId() == null)
            return false;
        if (other.getConnectorId() != null && other.getConnectorId().equals(this.getConnectorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorId() == null) ? 0 : getConnectorId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectorResult clone() {
        try {
            return (UpdateConnectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
