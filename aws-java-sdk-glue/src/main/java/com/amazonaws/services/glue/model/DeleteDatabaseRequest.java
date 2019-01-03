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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteDatabase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDatabaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog in which the database resides. If none is supplied, the AWS account ID is used by
     * default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The name of the Database to delete. For Hive compatibility, this must be all lowercase.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the Data Catalog in which the database resides. If none is supplied, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the database resides. If none is supplied, the AWS account ID is used
     *        by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the database resides. If none is supplied, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @return The ID of the Data Catalog in which the database resides. If none is supplied, the AWS account ID is used
     *         by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the database resides. If none is supplied, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the database resides. If none is supplied, the AWS account ID is used
     *        by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDatabaseRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The name of the Database to delete. For Hive compatibility, this must be all lowercase.
     * </p>
     * 
     * @param name
     *        The name of the Database to delete. For Hive compatibility, this must be all lowercase.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Database to delete. For Hive compatibility, this must be all lowercase.
     * </p>
     * 
     * @return The name of the Database to delete. For Hive compatibility, this must be all lowercase.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Database to delete. For Hive compatibility, this must be all lowercase.
     * </p>
     * 
     * @param name
     *        The name of the Database to delete. For Hive compatibility, this must be all lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDatabaseRequest withName(String name) {
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
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

        if (obj instanceof DeleteDatabaseRequest == false)
            return false;
        DeleteDatabaseRequest other = (DeleteDatabaseRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
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

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDatabaseRequest clone() {
        return (DeleteDatabaseRequest) super.clone();
    }

}
