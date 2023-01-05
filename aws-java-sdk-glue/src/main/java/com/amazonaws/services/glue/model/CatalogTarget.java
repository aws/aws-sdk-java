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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an Glue Data Catalog target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CatalogTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CatalogTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     */
    private java.util.List<String> tables;
    /**
     * <p>
     * The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the crawl when using a
     * <code>Catalog</code> connection type paired with a <code>NETWORK</code> Connection type.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     * </p>
     */
    private String eventQueueArn;
    /**
     * <p>
     * A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     * </p>
     */
    private String dlqEventQueueArn;

    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     * 
     * @param databaseName
     *        The name of the database to be synchronized.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     * 
     * @return The name of the database to be synchronized.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database to be synchronized.
     * </p>
     * 
     * @param databaseName
     *        The name of the database to be synchronized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogTarget withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     * 
     * @return A list of the tables to be synchronized.
     */

    public java.util.List<String> getTables() {
        return tables;
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     * 
     * @param tables
     *        A list of the tables to be synchronized.
     */

    public void setTables(java.util.Collection<String> tables) {
        if (tables == null) {
            this.tables = null;
            return;
        }

        this.tables = new java.util.ArrayList<String>(tables);
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTables(java.util.Collection)} or {@link #withTables(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tables
     *        A list of the tables to be synchronized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogTarget withTables(String... tables) {
        if (this.tables == null) {
            setTables(new java.util.ArrayList<String>(tables.length));
        }
        for (String ele : tables) {
            this.tables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tables to be synchronized.
     * </p>
     * 
     * @param tables
     *        A list of the tables to be synchronized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogTarget withTables(java.util.Collection<String> tables) {
        setTables(tables);
        return this;
    }

    /**
     * <p>
     * The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the crawl when using a
     * <code>Catalog</code> connection type paired with a <code>NETWORK</code> Connection type.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the crawl when
     *        using a <code>Catalog</code> connection type paired with a <code>NETWORK</code> Connection type.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the crawl when using a
     * <code>Catalog</code> connection type paired with a <code>NETWORK</code> Connection type.
     * </p>
     * 
     * @return The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the crawl when
     *         using a <code>Catalog</code> connection type paired with a <code>NETWORK</code> Connection type.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the crawl when using a
     * <code>Catalog</code> connection type paired with a <code>NETWORK</code> Connection type.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection for an Amazon S3-backed Data Catalog table to be a target of the crawl when
     *        using a <code>Catalog</code> connection type paired with a <code>NETWORK</code> Connection type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogTarget withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     * </p>
     * 
     * @param eventQueueArn
     *        A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     */

    public void setEventQueueArn(String eventQueueArn) {
        this.eventQueueArn = eventQueueArn;
    }

    /**
     * <p>
     * A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     * </p>
     * 
     * @return A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     */

    public String getEventQueueArn() {
        return this.eventQueueArn;
    }

    /**
     * <p>
     * A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     * </p>
     * 
     * @param eventQueueArn
     *        A valid Amazon SQS ARN. For example, <code>arn:aws:sqs:region:account:sqs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogTarget withEventQueueArn(String eventQueueArn) {
        setEventQueueArn(eventQueueArn);
        return this;
    }

    /**
     * <p>
     * A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     * </p>
     * 
     * @param dlqEventQueueArn
     *        A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     */

    public void setDlqEventQueueArn(String dlqEventQueueArn) {
        this.dlqEventQueueArn = dlqEventQueueArn;
    }

    /**
     * <p>
     * A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     * </p>
     * 
     * @return A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     */

    public String getDlqEventQueueArn() {
        return this.dlqEventQueueArn;
    }

    /**
     * <p>
     * A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     * </p>
     * 
     * @param dlqEventQueueArn
     *        A valid Amazon dead-letter SQS ARN. For example, <code>arn:aws:sqs:region:account:deadLetterQueue</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogTarget withDlqEventQueueArn(String dlqEventQueueArn) {
        setDlqEventQueueArn(dlqEventQueueArn);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTables() != null)
            sb.append("Tables: ").append(getTables()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getEventQueueArn() != null)
            sb.append("EventQueueArn: ").append(getEventQueueArn()).append(",");
        if (getDlqEventQueueArn() != null)
            sb.append("DlqEventQueueArn: ").append(getDlqEventQueueArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CatalogTarget == false)
            return false;
        CatalogTarget other = (CatalogTarget) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTables() == null ^ this.getTables() == null)
            return false;
        if (other.getTables() != null && other.getTables().equals(this.getTables()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getEventQueueArn() == null ^ this.getEventQueueArn() == null)
            return false;
        if (other.getEventQueueArn() != null && other.getEventQueueArn().equals(this.getEventQueueArn()) == false)
            return false;
        if (other.getDlqEventQueueArn() == null ^ this.getDlqEventQueueArn() == null)
            return false;
        if (other.getDlqEventQueueArn() != null && other.getDlqEventQueueArn().equals(this.getDlqEventQueueArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTables() == null) ? 0 : getTables().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getEventQueueArn() == null) ? 0 : getEventQueueArn().hashCode());
        hashCode = prime * hashCode + ((getDlqEventQueueArn() == null) ? 0 : getDlqEventQueueArn().hashCode());
        return hashCode;
    }

    @Override
    public CatalogTarget clone() {
        try {
            return (CatalogTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CatalogTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
