/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A view of a data source that contains information about the shape of the data in the underlying source. This is a
 * variant type structure. For this structure to be valid, only one of the attributes can be non-null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PhysicalTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhysicalTable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A physical table type for relational data sources.
     * </p>
     */
    private RelationalTable relationalTable;
    /**
     * <p>
     * A physical table type built from the results of the custom SQL query.
     * </p>
     */
    private CustomSql customSql;
    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     */
    private S3Source s3Source;

    /**
     * <p>
     * A physical table type for relational data sources.
     * </p>
     * 
     * @param relationalTable
     *        A physical table type for relational data sources.
     */

    public void setRelationalTable(RelationalTable relationalTable) {
        this.relationalTable = relationalTable;
    }

    /**
     * <p>
     * A physical table type for relational data sources.
     * </p>
     * 
     * @return A physical table type for relational data sources.
     */

    public RelationalTable getRelationalTable() {
        return this.relationalTable;
    }

    /**
     * <p>
     * A physical table type for relational data sources.
     * </p>
     * 
     * @param relationalTable
     *        A physical table type for relational data sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalTable withRelationalTable(RelationalTable relationalTable) {
        setRelationalTable(relationalTable);
        return this;
    }

    /**
     * <p>
     * A physical table type built from the results of the custom SQL query.
     * </p>
     * 
     * @param customSql
     *        A physical table type built from the results of the custom SQL query.
     */

    public void setCustomSql(CustomSql customSql) {
        this.customSql = customSql;
    }

    /**
     * <p>
     * A physical table type built from the results of the custom SQL query.
     * </p>
     * 
     * @return A physical table type built from the results of the custom SQL query.
     */

    public CustomSql getCustomSql() {
        return this.customSql;
    }

    /**
     * <p>
     * A physical table type built from the results of the custom SQL query.
     * </p>
     * 
     * @param customSql
     *        A physical table type built from the results of the custom SQL query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalTable withCustomSql(CustomSql customSql) {
        setCustomSql(customSql);
        return this;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     * 
     * @param s3Source
     *        A physical table type for as S3 data source.
     */

    public void setS3Source(S3Source s3Source) {
        this.s3Source = s3Source;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     * 
     * @return A physical table type for as S3 data source.
     */

    public S3Source getS3Source() {
        return this.s3Source;
    }

    /**
     * <p>
     * A physical table type for as S3 data source.
     * </p>
     * 
     * @param s3Source
     *        A physical table type for as S3 data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalTable withS3Source(S3Source s3Source) {
        setS3Source(s3Source);
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
        if (getRelationalTable() != null)
            sb.append("RelationalTable: ").append(getRelationalTable()).append(",");
        if (getCustomSql() != null)
            sb.append("CustomSql: ").append(getCustomSql()).append(",");
        if (getS3Source() != null)
            sb.append("S3Source: ").append(getS3Source());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhysicalTable == false)
            return false;
        PhysicalTable other = (PhysicalTable) obj;
        if (other.getRelationalTable() == null ^ this.getRelationalTable() == null)
            return false;
        if (other.getRelationalTable() != null && other.getRelationalTable().equals(this.getRelationalTable()) == false)
            return false;
        if (other.getCustomSql() == null ^ this.getCustomSql() == null)
            return false;
        if (other.getCustomSql() != null && other.getCustomSql().equals(this.getCustomSql()) == false)
            return false;
        if (other.getS3Source() == null ^ this.getS3Source() == null)
            return false;
        if (other.getS3Source() != null && other.getS3Source().equals(this.getS3Source()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelationalTable() == null) ? 0 : getRelationalTable().hashCode());
        hashCode = prime * hashCode + ((getCustomSql() == null) ? 0 : getCustomSql().hashCode());
        hashCode = prime * hashCode + ((getS3Source() == null) ? 0 : getS3Source().hashCode());
        return hashCode;
    }

    @Override
    public PhysicalTable clone() {
        try {
            return (PhysicalTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PhysicalTableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
