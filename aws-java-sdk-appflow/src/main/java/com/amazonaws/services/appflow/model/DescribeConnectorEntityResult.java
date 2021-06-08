/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeConnectorEntity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConnectorEntityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the fields for that connector entity. For example, for an <i>account</i> entity, the fields would be
     * <i>account name</i>, <i>account ID</i>, and so on.
     * </p>
     */
    private java.util.List<ConnectorEntityField> connectorEntityFields;

    /**
     * <p>
     * Describes the fields for that connector entity. For example, for an <i>account</i> entity, the fields would be
     * <i>account name</i>, <i>account ID</i>, and so on.
     * </p>
     * 
     * @return Describes the fields for that connector entity. For example, for an <i>account</i> entity, the fields
     *         would be <i>account name</i>, <i>account ID</i>, and so on.
     */

    public java.util.List<ConnectorEntityField> getConnectorEntityFields() {
        return connectorEntityFields;
    }

    /**
     * <p>
     * Describes the fields for that connector entity. For example, for an <i>account</i> entity, the fields would be
     * <i>account name</i>, <i>account ID</i>, and so on.
     * </p>
     * 
     * @param connectorEntityFields
     *        Describes the fields for that connector entity. For example, for an <i>account</i> entity, the fields
     *        would be <i>account name</i>, <i>account ID</i>, and so on.
     */

    public void setConnectorEntityFields(java.util.Collection<ConnectorEntityField> connectorEntityFields) {
        if (connectorEntityFields == null) {
            this.connectorEntityFields = null;
            return;
        }

        this.connectorEntityFields = new java.util.ArrayList<ConnectorEntityField>(connectorEntityFields);
    }

    /**
     * <p>
     * Describes the fields for that connector entity. For example, for an <i>account</i> entity, the fields would be
     * <i>account name</i>, <i>account ID</i>, and so on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorEntityFields(java.util.Collection)} or
     * {@link #withConnectorEntityFields(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param connectorEntityFields
     *        Describes the fields for that connector entity. For example, for an <i>account</i> entity, the fields
     *        would be <i>account name</i>, <i>account ID</i>, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorEntityResult withConnectorEntityFields(ConnectorEntityField... connectorEntityFields) {
        if (this.connectorEntityFields == null) {
            setConnectorEntityFields(new java.util.ArrayList<ConnectorEntityField>(connectorEntityFields.length));
        }
        for (ConnectorEntityField ele : connectorEntityFields) {
            this.connectorEntityFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the fields for that connector entity. For example, for an <i>account</i> entity, the fields would be
     * <i>account name</i>, <i>account ID</i>, and so on.
     * </p>
     * 
     * @param connectorEntityFields
     *        Describes the fields for that connector entity. For example, for an <i>account</i> entity, the fields
     *        would be <i>account name</i>, <i>account ID</i>, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeConnectorEntityResult withConnectorEntityFields(java.util.Collection<ConnectorEntityField> connectorEntityFields) {
        setConnectorEntityFields(connectorEntityFields);
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
        if (getConnectorEntityFields() != null)
            sb.append("ConnectorEntityFields: ").append(getConnectorEntityFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeConnectorEntityResult == false)
            return false;
        DescribeConnectorEntityResult other = (DescribeConnectorEntityResult) obj;
        if (other.getConnectorEntityFields() == null ^ this.getConnectorEntityFields() == null)
            return false;
        if (other.getConnectorEntityFields() != null && other.getConnectorEntityFields().equals(this.getConnectorEntityFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectorEntityFields() == null) ? 0 : getConnectorEntityFields().hashCode());
        return hashCode;
    }

    @Override
    public DescribeConnectorEntityResult clone() {
        try {
            return (DescribeConnectorEntityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
