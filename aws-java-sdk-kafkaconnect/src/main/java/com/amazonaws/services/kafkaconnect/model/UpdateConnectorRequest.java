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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/UpdateConnector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The target capacity.
     * </p>
     */
    private CapacityUpdate capacity;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector that you want to update.
     * </p>
     */
    private String connectorArn;
    /**
     * <p>
     * The current version of the connector that you want to update.
     * </p>
     */
    private String currentVersion;

    /**
     * <p>
     * The target capacity.
     * </p>
     * 
     * @param capacity
     *        The target capacity.
     */

    public void setCapacity(CapacityUpdate capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The target capacity.
     * </p>
     * 
     * @return The target capacity.
     */

    public CapacityUpdate getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The target capacity.
     * </p>
     * 
     * @param capacity
     *        The target capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withCapacity(CapacityUpdate capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector that you want to update.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) of the connector that you want to update.
     */

    public void setConnectorArn(String connectorArn) {
        this.connectorArn = connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the connector that you want to update.
     */

    public String getConnectorArn() {
        return this.connectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the connector that you want to update.
     * </p>
     * 
     * @param connectorArn
     *        The Amazon Resource Name (ARN) of the connector that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withConnectorArn(String connectorArn) {
        setConnectorArn(connectorArn);
        return this;
    }

    /**
     * <p>
     * The current version of the connector that you want to update.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the connector that you want to update.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the connector that you want to update.
     * </p>
     * 
     * @return The current version of the connector that you want to update.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version of the connector that you want to update.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the connector that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectorRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
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
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getConnectorArn() != null)
            sb.append("ConnectorArn: ").append(getConnectorArn()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectorRequest == false)
            return false;
        UpdateConnectorRequest other = (UpdateConnectorRequest) obj;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getConnectorArn() == null ^ this.getConnectorArn() == null)
            return false;
        if (other.getConnectorArn() != null && other.getConnectorArn().equals(this.getConnectorArn()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getConnectorArn() == null) ? 0 : getConnectorArn().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectorRequest clone() {
        return (UpdateConnectorRequest) super.clone();
    }

}
