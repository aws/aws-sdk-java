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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetResourceLFTags" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceLFTagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of tags applied to a database resource.
     * </p>
     */
    private java.util.List<LFTagPair> lFTagOnDatabase;
    /**
     * <p>
     * A list of tags applied to a table resource.
     * </p>
     */
    private java.util.List<LFTagPair> lFTagsOnTable;
    /**
     * <p>
     * A list of tags applied to a column resource.
     * </p>
     */
    private java.util.List<ColumnLFTag> lFTagsOnColumns;

    /**
     * <p>
     * A list of tags applied to a database resource.
     * </p>
     * 
     * @return A list of tags applied to a database resource.
     */

    public java.util.List<LFTagPair> getLFTagOnDatabase() {
        return lFTagOnDatabase;
    }

    /**
     * <p>
     * A list of tags applied to a database resource.
     * </p>
     * 
     * @param lFTagOnDatabase
     *        A list of tags applied to a database resource.
     */

    public void setLFTagOnDatabase(java.util.Collection<LFTagPair> lFTagOnDatabase) {
        if (lFTagOnDatabase == null) {
            this.lFTagOnDatabase = null;
            return;
        }

        this.lFTagOnDatabase = new java.util.ArrayList<LFTagPair>(lFTagOnDatabase);
    }

    /**
     * <p>
     * A list of tags applied to a database resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLFTagOnDatabase(java.util.Collection)} or {@link #withLFTagOnDatabase(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lFTagOnDatabase
     *        A list of tags applied to a database resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceLFTagsResult withLFTagOnDatabase(LFTagPair... lFTagOnDatabase) {
        if (this.lFTagOnDatabase == null) {
            setLFTagOnDatabase(new java.util.ArrayList<LFTagPair>(lFTagOnDatabase.length));
        }
        for (LFTagPair ele : lFTagOnDatabase) {
            this.lFTagOnDatabase.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags applied to a database resource.
     * </p>
     * 
     * @param lFTagOnDatabase
     *        A list of tags applied to a database resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceLFTagsResult withLFTagOnDatabase(java.util.Collection<LFTagPair> lFTagOnDatabase) {
        setLFTagOnDatabase(lFTagOnDatabase);
        return this;
    }

    /**
     * <p>
     * A list of tags applied to a table resource.
     * </p>
     * 
     * @return A list of tags applied to a table resource.
     */

    public java.util.List<LFTagPair> getLFTagsOnTable() {
        return lFTagsOnTable;
    }

    /**
     * <p>
     * A list of tags applied to a table resource.
     * </p>
     * 
     * @param lFTagsOnTable
     *        A list of tags applied to a table resource.
     */

    public void setLFTagsOnTable(java.util.Collection<LFTagPair> lFTagsOnTable) {
        if (lFTagsOnTable == null) {
            this.lFTagsOnTable = null;
            return;
        }

        this.lFTagsOnTable = new java.util.ArrayList<LFTagPair>(lFTagsOnTable);
    }

    /**
     * <p>
     * A list of tags applied to a table resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLFTagsOnTable(java.util.Collection)} or {@link #withLFTagsOnTable(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param lFTagsOnTable
     *        A list of tags applied to a table resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceLFTagsResult withLFTagsOnTable(LFTagPair... lFTagsOnTable) {
        if (this.lFTagsOnTable == null) {
            setLFTagsOnTable(new java.util.ArrayList<LFTagPair>(lFTagsOnTable.length));
        }
        for (LFTagPair ele : lFTagsOnTable) {
            this.lFTagsOnTable.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags applied to a table resource.
     * </p>
     * 
     * @param lFTagsOnTable
     *        A list of tags applied to a table resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceLFTagsResult withLFTagsOnTable(java.util.Collection<LFTagPair> lFTagsOnTable) {
        setLFTagsOnTable(lFTagsOnTable);
        return this;
    }

    /**
     * <p>
     * A list of tags applied to a column resource.
     * </p>
     * 
     * @return A list of tags applied to a column resource.
     */

    public java.util.List<ColumnLFTag> getLFTagsOnColumns() {
        return lFTagsOnColumns;
    }

    /**
     * <p>
     * A list of tags applied to a column resource.
     * </p>
     * 
     * @param lFTagsOnColumns
     *        A list of tags applied to a column resource.
     */

    public void setLFTagsOnColumns(java.util.Collection<ColumnLFTag> lFTagsOnColumns) {
        if (lFTagsOnColumns == null) {
            this.lFTagsOnColumns = null;
            return;
        }

        this.lFTagsOnColumns = new java.util.ArrayList<ColumnLFTag>(lFTagsOnColumns);
    }

    /**
     * <p>
     * A list of tags applied to a column resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLFTagsOnColumns(java.util.Collection)} or {@link #withLFTagsOnColumns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param lFTagsOnColumns
     *        A list of tags applied to a column resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceLFTagsResult withLFTagsOnColumns(ColumnLFTag... lFTagsOnColumns) {
        if (this.lFTagsOnColumns == null) {
            setLFTagsOnColumns(new java.util.ArrayList<ColumnLFTag>(lFTagsOnColumns.length));
        }
        for (ColumnLFTag ele : lFTagsOnColumns) {
            this.lFTagsOnColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags applied to a column resource.
     * </p>
     * 
     * @param lFTagsOnColumns
     *        A list of tags applied to a column resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceLFTagsResult withLFTagsOnColumns(java.util.Collection<ColumnLFTag> lFTagsOnColumns) {
        setLFTagsOnColumns(lFTagsOnColumns);
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
        if (getLFTagOnDatabase() != null)
            sb.append("LFTagOnDatabase: ").append(getLFTagOnDatabase()).append(",");
        if (getLFTagsOnTable() != null)
            sb.append("LFTagsOnTable: ").append(getLFTagsOnTable()).append(",");
        if (getLFTagsOnColumns() != null)
            sb.append("LFTagsOnColumns: ").append(getLFTagsOnColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceLFTagsResult == false)
            return false;
        GetResourceLFTagsResult other = (GetResourceLFTagsResult) obj;
        if (other.getLFTagOnDatabase() == null ^ this.getLFTagOnDatabase() == null)
            return false;
        if (other.getLFTagOnDatabase() != null && other.getLFTagOnDatabase().equals(this.getLFTagOnDatabase()) == false)
            return false;
        if (other.getLFTagsOnTable() == null ^ this.getLFTagsOnTable() == null)
            return false;
        if (other.getLFTagsOnTable() != null && other.getLFTagsOnTable().equals(this.getLFTagsOnTable()) == false)
            return false;
        if (other.getLFTagsOnColumns() == null ^ this.getLFTagsOnColumns() == null)
            return false;
        if (other.getLFTagsOnColumns() != null && other.getLFTagsOnColumns().equals(this.getLFTagsOnColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLFTagOnDatabase() == null) ? 0 : getLFTagOnDatabase().hashCode());
        hashCode = prime * hashCode + ((getLFTagsOnTable() == null) ? 0 : getLFTagsOnTable().hashCode());
        hashCode = prime * hashCode + ((getLFTagsOnColumns() == null) ? 0 : getLFTagsOnColumns().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceLFTagsResult clone() {
        try {
            return (GetResourceLFTagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
