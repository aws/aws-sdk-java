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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/DeleteConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Delete Connector request connector ID.
     * </p>
     */
    private String connectorID;

    /**
     * <p>
     * Delete Connector request connector ID.
     * </p>
     * 
     * @param connectorID
     *        Delete Connector request connector ID.
     */

    public void setConnectorID(String connectorID) {
        this.connectorID = connectorID;
    }

    /**
     * <p>
     * Delete Connector request connector ID.
     * </p>
     * 
     * @return Delete Connector request connector ID.
     */

    public String getConnectorID() {
        return this.connectorID;
    }

    /**
     * <p>
     * Delete Connector request connector ID.
     * </p>
     * 
     * @param connectorID
     *        Delete Connector request connector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectorRequest withConnectorID(String connectorID) {
        setConnectorID(connectorID);
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
            sb.append("ConnectorID: ").append(getConnectorID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConnectorRequest == false)
            return false;
        DeleteConnectorRequest other = (DeleteConnectorRequest) obj;
        if (other.getConnectorID() == null ^ this.getConnectorID() == null)
            return false;
        if (other.getConnectorID() != null && other.getConnectorID().equals(this.getConnectorID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorID() == null) ? 0 : getConnectorID().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConnectorRequest clone() {
        return (DeleteConnectorRequest) super.clone();
    }

}
