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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/CreateConnector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If successful, the Amazon Resource Name (ARN) of the connector for Active Directory.
     * </p>
     */
    private String connectorArn;

    /**
     * <p>
     * If successful, the Amazon Resource Name (ARN) of the connector for Active Directory.
     * </p>
     * 
     * @param connectorArn
     *        If successful, the Amazon Resource Name (ARN) of the connector for Active Directory.
     */

    public void setConnectorArn(String connectorArn) {
        this.connectorArn = connectorArn;
    }

    /**
     * <p>
     * If successful, the Amazon Resource Name (ARN) of the connector for Active Directory.
     * </p>
     * 
     * @return If successful, the Amazon Resource Name (ARN) of the connector for Active Directory.
     */

    public String getConnectorArn() {
        return this.connectorArn;
    }

    /**
     * <p>
     * If successful, the Amazon Resource Name (ARN) of the connector for Active Directory.
     * </p>
     * 
     * @param connectorArn
     *        If successful, the Amazon Resource Name (ARN) of the connector for Active Directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectorResult withConnectorArn(String connectorArn) {
        setConnectorArn(connectorArn);
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
            sb.append("ConnectorArn: ").append(getConnectorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectorResult == false)
            return false;
        CreateConnectorResult other = (CreateConnectorResult) obj;
        if (other.getConnectorArn() == null ^ this.getConnectorArn() == null)
            return false;
        if (other.getConnectorArn() != null && other.getConnectorArn().equals(this.getConnectorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorArn() == null) ? 0 : getConnectorArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectorResult clone() {
        try {
            return (CreateConnectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
