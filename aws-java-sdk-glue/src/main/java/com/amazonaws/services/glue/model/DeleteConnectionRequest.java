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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the connection to delete.
     * </p>
     */
    private String connectionName;

    /**
     * <p>
     * The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is
     *        used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @return The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is
     *         used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the connection resides. If none is provided, the AWS account ID is
     *        used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the connection to delete.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to delete.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection to delete.
     * </p>
     * 
     * @return The name of the connection to delete.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection to delete.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConnectionRequest withConnectionName(String connectionName) {
        setConnectionName(connectionName);
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
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConnectionRequest == false)
            return false;
        DeleteConnectionRequest other = (DeleteConnectionRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConnectionRequest clone() {
        return (DeleteConnectionRequest) super.clone();
    }

}
