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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * A <code>ConnectionInput</code> object defining the connection to create.
     * </p>
     */
    private ConnectionInput connectionInput;

    /**
     * <p>
     * The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is
     *        used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @return The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is
     *         used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which to create the connection. If none is provided, the AWS account ID is
     *        used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * A <code>ConnectionInput</code> object defining the connection to create.
     * </p>
     * 
     * @param connectionInput
     *        A <code>ConnectionInput</code> object defining the connection to create.
     */

    public void setConnectionInput(ConnectionInput connectionInput) {
        this.connectionInput = connectionInput;
    }

    /**
     * <p>
     * A <code>ConnectionInput</code> object defining the connection to create.
     * </p>
     * 
     * @return A <code>ConnectionInput</code> object defining the connection to create.
     */

    public ConnectionInput getConnectionInput() {
        return this.connectionInput;
    }

    /**
     * <p>
     * A <code>ConnectionInput</code> object defining the connection to create.
     * </p>
     * 
     * @param connectionInput
     *        A <code>ConnectionInput</code> object defining the connection to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConnectionRequest withConnectionInput(ConnectionInput connectionInput) {
        setConnectionInput(connectionInput);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getConnectionInput() != null)
            sb.append("ConnectionInput: ").append(getConnectionInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConnectionRequest == false)
            return false;
        CreateConnectionRequest other = (CreateConnectionRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getConnectionInput() == null ^ this.getConnectionInput() == null)
            return false;
        if (other.getConnectionInput() != null && other.getConnectionInput().equals(this.getConnectionInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getConnectionInput() == null) ? 0 : getConnectionInput().hashCode());
        return hashCode;
    }

    @Override
    public CreateConnectionRequest clone() {
        return (CreateConnectionRequest) super.clone();
    }

}
