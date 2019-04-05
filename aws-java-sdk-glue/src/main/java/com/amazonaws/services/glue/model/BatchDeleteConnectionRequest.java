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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * A list of names of the connections to delete.
     * </p>
     */
    private java.util.List<String> connectionNameList;

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is
     *        used by default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @return The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is
     *         used by default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is used by
     * default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the connections reside. If none is provided, the AWS account ID is
     *        used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConnectionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * A list of names of the connections to delete.
     * </p>
     * 
     * @return A list of names of the connections to delete.
     */

    public java.util.List<String> getConnectionNameList() {
        return connectionNameList;
    }

    /**
     * <p>
     * A list of names of the connections to delete.
     * </p>
     * 
     * @param connectionNameList
     *        A list of names of the connections to delete.
     */

    public void setConnectionNameList(java.util.Collection<String> connectionNameList) {
        if (connectionNameList == null) {
            this.connectionNameList = null;
            return;
        }

        this.connectionNameList = new java.util.ArrayList<String>(connectionNameList);
    }

    /**
     * <p>
     * A list of names of the connections to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectionNameList(java.util.Collection)} or {@link #withConnectionNameList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param connectionNameList
     *        A list of names of the connections to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConnectionRequest withConnectionNameList(String... connectionNameList) {
        if (this.connectionNameList == null) {
            setConnectionNameList(new java.util.ArrayList<String>(connectionNameList.length));
        }
        for (String ele : connectionNameList) {
            this.connectionNameList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of the connections to delete.
     * </p>
     * 
     * @param connectionNameList
     *        A list of names of the connections to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteConnectionRequest withConnectionNameList(java.util.Collection<String> connectionNameList) {
        setConnectionNameList(connectionNameList);
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
        if (getConnectionNameList() != null)
            sb.append("ConnectionNameList: ").append(getConnectionNameList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteConnectionRequest == false)
            return false;
        BatchDeleteConnectionRequest other = (BatchDeleteConnectionRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getConnectionNameList() == null ^ this.getConnectionNameList() == null)
            return false;
        if (other.getConnectionNameList() != null && other.getConnectionNameList().equals(this.getConnectionNameList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getConnectionNameList() == null) ? 0 : getConnectionNameList().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteConnectionRequest clone() {
        return (BatchDeleteConnectionRequest) super.clone();
    }

}
