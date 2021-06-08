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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetTableMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTableMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains table metadata.
     * </p>
     */
    private TableMetadata tableMetadata;

    /**
     * <p>
     * An object that contains table metadata.
     * </p>
     * 
     * @param tableMetadata
     *        An object that contains table metadata.
     */

    public void setTableMetadata(TableMetadata tableMetadata) {
        this.tableMetadata = tableMetadata;
    }

    /**
     * <p>
     * An object that contains table metadata.
     * </p>
     * 
     * @return An object that contains table metadata.
     */

    public TableMetadata getTableMetadata() {
        return this.tableMetadata;
    }

    /**
     * <p>
     * An object that contains table metadata.
     * </p>
     * 
     * @param tableMetadata
     *        An object that contains table metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTableMetadataResult withTableMetadata(TableMetadata tableMetadata) {
        setTableMetadata(tableMetadata);
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
        if (getTableMetadata() != null)
            sb.append("TableMetadata: ").append(getTableMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTableMetadataResult == false)
            return false;
        GetTableMetadataResult other = (GetTableMetadataResult) obj;
        if (other.getTableMetadata() == null ^ this.getTableMetadata() == null)
            return false;
        if (other.getTableMetadata() != null && other.getTableMetadata().equals(this.getTableMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableMetadata() == null) ? 0 : getTableMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetTableMetadataResult clone() {
        try {
            return (GetTableMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
