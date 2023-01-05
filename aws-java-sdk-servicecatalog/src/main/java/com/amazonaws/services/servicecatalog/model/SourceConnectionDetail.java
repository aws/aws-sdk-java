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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about the configured <code>SourceConnection</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SourceConnectionDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceConnectionDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The only supported <code>SourceConnection</code> type is Codestar.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The connection details based on the connection <code>Type</code>.
     * </p>
     */
    private SourceConnectionParameters connectionParameters;
    /**
     * <p>
     * Provides details about the product's connection sync and contains the following sub-fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LastSyncTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSyncStatus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSyncStatusMessage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSuccessfulSyncTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSuccessfulSyncProvisioningArtifactID</code>
     * </p>
     * </li>
     * </ul>
     */
    private LastSync lastSync;

    /**
     * <p>
     * The only supported <code>SourceConnection</code> type is Codestar.
     * </p>
     * 
     * @param type
     *        The only supported <code>SourceConnection</code> type is Codestar.
     * @see SourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The only supported <code>SourceConnection</code> type is Codestar.
     * </p>
     * 
     * @return The only supported <code>SourceConnection</code> type is Codestar.
     * @see SourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The only supported <code>SourceConnection</code> type is Codestar.
     * </p>
     * 
     * @param type
     *        The only supported <code>SourceConnection</code> type is Codestar.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public SourceConnectionDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The only supported <code>SourceConnection</code> type is Codestar.
     * </p>
     * 
     * @param type
     *        The only supported <code>SourceConnection</code> type is Codestar.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public SourceConnectionDetail withType(SourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The connection details based on the connection <code>Type</code>.
     * </p>
     * 
     * @param connectionParameters
     *        The connection details based on the connection <code>Type</code>.
     */

    public void setConnectionParameters(SourceConnectionParameters connectionParameters) {
        this.connectionParameters = connectionParameters;
    }

    /**
     * <p>
     * The connection details based on the connection <code>Type</code>.
     * </p>
     * 
     * @return The connection details based on the connection <code>Type</code>.
     */

    public SourceConnectionParameters getConnectionParameters() {
        return this.connectionParameters;
    }

    /**
     * <p>
     * The connection details based on the connection <code>Type</code>.
     * </p>
     * 
     * @param connectionParameters
     *        The connection details based on the connection <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectionDetail withConnectionParameters(SourceConnectionParameters connectionParameters) {
        setConnectionParameters(connectionParameters);
        return this;
    }

    /**
     * <p>
     * Provides details about the product's connection sync and contains the following sub-fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LastSyncTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSyncStatus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSyncStatusMessage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSuccessfulSyncTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSuccessfulSyncProvisioningArtifactID</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastSync
     *        Provides details about the product's connection sync and contains the following sub-fields. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LastSyncTime</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastSyncStatus</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastSyncStatusMessage</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastSuccessfulSyncTime</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastSuccessfulSyncProvisioningArtifactID</code>
     *        </p>
     *        </li>
     */

    public void setLastSync(LastSync lastSync) {
        this.lastSync = lastSync;
    }

    /**
     * <p>
     * Provides details about the product's connection sync and contains the following sub-fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LastSyncTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSyncStatus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSyncStatusMessage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSuccessfulSyncTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSuccessfulSyncProvisioningArtifactID</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Provides details about the product's connection sync and contains the following sub-fields. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LastSyncTime</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LastSyncStatus</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LastSyncStatusMessage</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LastSuccessfulSyncTime</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LastSuccessfulSyncProvisioningArtifactID</code>
     *         </p>
     *         </li>
     */

    public LastSync getLastSync() {
        return this.lastSync;
    }

    /**
     * <p>
     * Provides details about the product's connection sync and contains the following sub-fields.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LastSyncTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSyncStatus</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSyncStatusMessage</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSuccessfulSyncTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastSuccessfulSyncProvisioningArtifactID</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param lastSync
     *        Provides details about the product's connection sync and contains the following sub-fields. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LastSyncTime</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastSyncStatus</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastSyncStatusMessage</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastSuccessfulSyncTime</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastSuccessfulSyncProvisioningArtifactID</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectionDetail withLastSync(LastSync lastSync) {
        setLastSync(lastSync);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConnectionParameters() != null)
            sb.append("ConnectionParameters: ").append(getConnectionParameters()).append(",");
        if (getLastSync() != null)
            sb.append("LastSync: ").append(getLastSync());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceConnectionDetail == false)
            return false;
        SourceConnectionDetail other = (SourceConnectionDetail) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConnectionParameters() == null ^ this.getConnectionParameters() == null)
            return false;
        if (other.getConnectionParameters() != null && other.getConnectionParameters().equals(this.getConnectionParameters()) == false)
            return false;
        if (other.getLastSync() == null ^ this.getLastSync() == null)
            return false;
        if (other.getLastSync() != null && other.getLastSync().equals(this.getLastSync()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConnectionParameters() == null) ? 0 : getConnectionParameters().hashCode());
        hashCode = prime * hashCode + ((getLastSync() == null) ? 0 : getLastSync().hashCode());
        return hashCode;
    }

    @Override
    public SourceConnectionDetail clone() {
        try {
            return (SourceConnectionDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.SourceConnectionDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
