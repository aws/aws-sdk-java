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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an Amazon DocumentDB or MongoDB data store to crawl.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/MongoDBTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MongoDBTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The path of the Amazon DocumentDB or MongoDB target (database/collection).
     * </p>
     */
    private String path;
    /**
     * <p>
     * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a
     * long time when the table is not a high throughput table.
     * </p>
     * <p>
     * A value of <code>true</code> means to scan all records, while a value of <code>false</code> means to sample the
     * records. If no value is specified, the value defaults to <code>true</code>.
     * </p>
     */
    private Boolean scanAll;

    /**
     * <p>
     * The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
     * </p>
     * 
     * @return The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to use to connect to the Amazon DocumentDB or MongoDB target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDBTarget withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The path of the Amazon DocumentDB or MongoDB target (database/collection).
     * </p>
     * 
     * @param path
     *        The path of the Amazon DocumentDB or MongoDB target (database/collection).
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path of the Amazon DocumentDB or MongoDB target (database/collection).
     * </p>
     * 
     * @return The path of the Amazon DocumentDB or MongoDB target (database/collection).
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path of the Amazon DocumentDB or MongoDB target (database/collection).
     * </p>
     * 
     * @param path
     *        The path of the Amazon DocumentDB or MongoDB target (database/collection).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDBTarget withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a
     * long time when the table is not a high throughput table.
     * </p>
     * <p>
     * A value of <code>true</code> means to scan all records, while a value of <code>false</code> means to sample the
     * records. If no value is specified, the value defaults to <code>true</code>.
     * </p>
     * 
     * @param scanAll
     *        Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can
     *        take a long time when the table is not a high throughput table.</p>
     *        <p>
     *        A value of <code>true</code> means to scan all records, while a value of <code>false</code> means to
     *        sample the records. If no value is specified, the value defaults to <code>true</code>.
     */

    public void setScanAll(Boolean scanAll) {
        this.scanAll = scanAll;
    }

    /**
     * <p>
     * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a
     * long time when the table is not a high throughput table.
     * </p>
     * <p>
     * A value of <code>true</code> means to scan all records, while a value of <code>false</code> means to sample the
     * records. If no value is specified, the value defaults to <code>true</code>.
     * </p>
     * 
     * @return Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can
     *         take a long time when the table is not a high throughput table.</p>
     *         <p>
     *         A value of <code>true</code> means to scan all records, while a value of <code>false</code> means to
     *         sample the records. If no value is specified, the value defaults to <code>true</code>.
     */

    public Boolean getScanAll() {
        return this.scanAll;
    }

    /**
     * <p>
     * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a
     * long time when the table is not a high throughput table.
     * </p>
     * <p>
     * A value of <code>true</code> means to scan all records, while a value of <code>false</code> means to sample the
     * records. If no value is specified, the value defaults to <code>true</code>.
     * </p>
     * 
     * @param scanAll
     *        Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can
     *        take a long time when the table is not a high throughput table.</p>
     *        <p>
     *        A value of <code>true</code> means to scan all records, while a value of <code>false</code> means to
     *        sample the records. If no value is specified, the value defaults to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDBTarget withScanAll(Boolean scanAll) {
        setScanAll(scanAll);
        return this;
    }

    /**
     * <p>
     * Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can take a
     * long time when the table is not a high throughput table.
     * </p>
     * <p>
     * A value of <code>true</code> means to scan all records, while a value of <code>false</code> means to sample the
     * records. If no value is specified, the value defaults to <code>true</code>.
     * </p>
     * 
     * @return Indicates whether to scan all the records, or to sample rows from the table. Scanning all the records can
     *         take a long time when the table is not a high throughput table.</p>
     *         <p>
     *         A value of <code>true</code> means to scan all records, while a value of <code>false</code> means to
     *         sample the records. If no value is specified, the value defaults to <code>true</code>.
     */

    public Boolean isScanAll() {
        return this.scanAll;
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
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getScanAll() != null)
            sb.append("ScanAll: ").append(getScanAll());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MongoDBTarget == false)
            return false;
        MongoDBTarget other = (MongoDBTarget) obj;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getScanAll() == null ^ this.getScanAll() == null)
            return false;
        if (other.getScanAll() != null && other.getScanAll().equals(this.getScanAll()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getScanAll() == null) ? 0 : getScanAll().hashCode());
        return hashCode;
    }

    @Override
    public MongoDBTarget clone() {
        try {
            return (MongoDBTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.MongoDBTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
