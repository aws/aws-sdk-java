/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateConnectorDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectorDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the connector definition. */
    private String connectorDefinitionId;
    /** The name of the definition. */
    private String name;

    /**
     * The ID of the connector definition.
     * 
     * @param connectorDefinitionId
     *        The ID of the connector definition.
     */

    public void setConnectorDefinitionId(String connectorDefinitionId) {
        this.connectorDefinitionId = connectorDefinitionId;
    }

    /**
     * The ID of the connector definition.
     * 
     * @return The ID of the connector definition.
     */

    public String getConnectorDefinitionId() {
        return this.connectorDefinitionId;
    }

    /**
     * The ID of the connector definition.
     * 
     * @param connectorDefinitionId
     *        The ID of the connector definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorDefinitionRequest withConnectorDefinitionId(String connectorDefinitionId) {
        setConnectorDefinitionId(connectorDefinitionId);
        return this;
    }

    /**
     * The name of the definition.
     * 
     * @param name
     *        The name of the definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the definition.
     * 
     * @return The name of the definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the definition.
     * 
     * @param name
     *        The name of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorDefinitionRequest withName(String name) {
        setName(name);
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
        if (getConnectorDefinitionId() != null)
            sb.append("ConnectorDefinitionId: ").append(getConnectorDefinitionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectorDefinitionRequest == false)
            return false;
        UpdateConnectorDefinitionRequest other = (UpdateConnectorDefinitionRequest) obj;
        if (other.getConnectorDefinitionId() == null ^ this.getConnectorDefinitionId() == null)
            return false;
        if (other.getConnectorDefinitionId() != null && other.getConnectorDefinitionId().equals(this.getConnectorDefinitionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorDefinitionId() == null) ? 0 : getConnectorDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectorDefinitionRequest clone() {
        return (UpdateConnectorDefinitionRequest) super.clone();
    }

}
