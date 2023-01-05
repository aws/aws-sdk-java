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
 * A top level <code>ProductViewDetail</code> response containing details about the product’s connection. Service
 * Catalog returns this field for the <code>CreateProduct</code>, <code>UpdateProduct</code>,
 * <code>DescribeProductAsAdmin</code>, and <code>SearchProductAsAdmin</code> APIs. This response contains the same
 * fields as the <code>ConnectionParameters</code> request, with the addition of the <code>LastSync</code> response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/SourceConnection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceConnection implements Serializable, Cloneable, StructuredPojo {

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

    public SourceConnection withType(String type) {
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

    public SourceConnection withType(SourceType type) {
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

    public SourceConnection withConnectionParameters(SourceConnectionParameters connectionParameters) {
        setConnectionParameters(connectionParameters);
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
            sb.append("ConnectionParameters: ").append(getConnectionParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceConnection == false)
            return false;
        SourceConnection other = (SourceConnection) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConnectionParameters() == null ^ this.getConnectionParameters() == null)
            return false;
        if (other.getConnectionParameters() != null && other.getConnectionParameters().equals(this.getConnectionParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConnectionParameters() == null) ? 0 : getConnectionParameters().hashCode());
        return hashCode;
    }

    @Override
    public SourceConnection clone() {
        try {
            return (SourceConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.SourceConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
