/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SQL query to modify the message.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/SqlQueryDatasetAction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlQueryDatasetAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An SQL query string.
     * </p>
     */
    private String sqlQuery;

    /**
     * <p>
     * An SQL query string.
     * </p>
     * 
     * @param sqlQuery
     *        An SQL query string.
     */

    public void setSqlQuery(String sqlQuery) {
        this.sqlQuery = sqlQuery;
    }

    /**
     * <p>
     * An SQL query string.
     * </p>
     * 
     * @return An SQL query string.
     */

    public String getSqlQuery() {
        return this.sqlQuery;
    }

    /**
     * <p>
     * An SQL query string.
     * </p>
     * 
     * @param sqlQuery
     *        An SQL query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlQueryDatasetAction withSqlQuery(String sqlQuery) {
        setSqlQuery(sqlQuery);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSqlQuery() != null)
            sb.append("SqlQuery: ").append(getSqlQuery());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlQueryDatasetAction == false)
            return false;
        SqlQueryDatasetAction other = (SqlQueryDatasetAction) obj;
        if (other.getSqlQuery() == null ^ this.getSqlQuery() == null)
            return false;
        if (other.getSqlQuery() != null && other.getSqlQuery().equals(this.getSqlQuery()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSqlQuery() == null) ? 0 : getSqlQuery().hashCode());
        return hashCode;
    }

    @Override
    public SqlQueryDatasetAction clone() {
        try {
            return (SqlQueryDatasetAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.SqlQueryDatasetActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
