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
 * Specifies an Amazon DynamoDB table to crawl.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DynamoDBTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DynamoDBTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the DynamoDB table to crawl.
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
     * The percentage of the configured read capacity units to use by the Glue crawler. Read capacity units is a term
     * defined by DynamoDB, and is a numeric value that acts as rate limiter for the number of reads that can be
     * performed on that table per second.
     * </p>
     * <p>
     * The valid values are null or a value between 0.1 to 1.5. A null value is used when user does not provide a value,
     * and defaults to 0.5 of the configured Read Capacity Unit (for provisioned tables), or 0.25 of the max configured
     * Read Capacity Unit (for tables using on-demand mode).
     * </p>
     */
    private Double scanRate;

    /**
     * <p>
     * The name of the DynamoDB table to crawl.
     * </p>
     * 
     * @param path
     *        The name of the DynamoDB table to crawl.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The name of the DynamoDB table to crawl.
     * </p>
     * 
     * @return The name of the DynamoDB table to crawl.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The name of the DynamoDB table to crawl.
     * </p>
     * 
     * @param path
     *        The name of the DynamoDB table to crawl.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBTarget withPath(String path) {
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

    public DynamoDBTarget withScanAll(Boolean scanAll) {
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
     * <p>
     * The percentage of the configured read capacity units to use by the Glue crawler. Read capacity units is a term
     * defined by DynamoDB, and is a numeric value that acts as rate limiter for the number of reads that can be
     * performed on that table per second.
     * </p>
     * <p>
     * The valid values are null or a value between 0.1 to 1.5. A null value is used when user does not provide a value,
     * and defaults to 0.5 of the configured Read Capacity Unit (for provisioned tables), or 0.25 of the max configured
     * Read Capacity Unit (for tables using on-demand mode).
     * </p>
     * 
     * @param scanRate
     *        The percentage of the configured read capacity units to use by the Glue crawler. Read capacity units is a
     *        term defined by DynamoDB, and is a numeric value that acts as rate limiter for the number of reads that
     *        can be performed on that table per second.</p>
     *        <p>
     *        The valid values are null or a value between 0.1 to 1.5. A null value is used when user does not provide a
     *        value, and defaults to 0.5 of the configured Read Capacity Unit (for provisioned tables), or 0.25 of the
     *        max configured Read Capacity Unit (for tables using on-demand mode).
     */

    public void setScanRate(Double scanRate) {
        this.scanRate = scanRate;
    }

    /**
     * <p>
     * The percentage of the configured read capacity units to use by the Glue crawler. Read capacity units is a term
     * defined by DynamoDB, and is a numeric value that acts as rate limiter for the number of reads that can be
     * performed on that table per second.
     * </p>
     * <p>
     * The valid values are null or a value between 0.1 to 1.5. A null value is used when user does not provide a value,
     * and defaults to 0.5 of the configured Read Capacity Unit (for provisioned tables), or 0.25 of the max configured
     * Read Capacity Unit (for tables using on-demand mode).
     * </p>
     * 
     * @return The percentage of the configured read capacity units to use by the Glue crawler. Read capacity units is a
     *         term defined by DynamoDB, and is a numeric value that acts as rate limiter for the number of reads that
     *         can be performed on that table per second.</p>
     *         <p>
     *         The valid values are null or a value between 0.1 to 1.5. A null value is used when user does not provide
     *         a value, and defaults to 0.5 of the configured Read Capacity Unit (for provisioned tables), or 0.25 of
     *         the max configured Read Capacity Unit (for tables using on-demand mode).
     */

    public Double getScanRate() {
        return this.scanRate;
    }

    /**
     * <p>
     * The percentage of the configured read capacity units to use by the Glue crawler. Read capacity units is a term
     * defined by DynamoDB, and is a numeric value that acts as rate limiter for the number of reads that can be
     * performed on that table per second.
     * </p>
     * <p>
     * The valid values are null or a value between 0.1 to 1.5. A null value is used when user does not provide a value,
     * and defaults to 0.5 of the configured Read Capacity Unit (for provisioned tables), or 0.25 of the max configured
     * Read Capacity Unit (for tables using on-demand mode).
     * </p>
     * 
     * @param scanRate
     *        The percentage of the configured read capacity units to use by the Glue crawler. Read capacity units is a
     *        term defined by DynamoDB, and is a numeric value that acts as rate limiter for the number of reads that
     *        can be performed on that table per second.</p>
     *        <p>
     *        The valid values are null or a value between 0.1 to 1.5. A null value is used when user does not provide a
     *        value, and defaults to 0.5 of the configured Read Capacity Unit (for provisioned tables), or 0.25 of the
     *        max configured Read Capacity Unit (for tables using on-demand mode).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DynamoDBTarget withScanRate(Double scanRate) {
        setScanRate(scanRate);
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
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getScanAll() != null)
            sb.append("ScanAll: ").append(getScanAll()).append(",");
        if (getScanRate() != null)
            sb.append("ScanRate: ").append(getScanRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DynamoDBTarget == false)
            return false;
        DynamoDBTarget other = (DynamoDBTarget) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getScanAll() == null ^ this.getScanAll() == null)
            return false;
        if (other.getScanAll() != null && other.getScanAll().equals(this.getScanAll()) == false)
            return false;
        if (other.getScanRate() == null ^ this.getScanRate() == null)
            return false;
        if (other.getScanRate() != null && other.getScanRate().equals(this.getScanRate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getScanAll() == null) ? 0 : getScanAll().hashCode());
        hashCode = prime * hashCode + ((getScanRate() == null) ? 0 : getScanRate().hashCode());
        return hashCode;
    }

    @Override
    public DynamoDBTarget clone() {
        try {
            return (DynamoDBTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DynamoDBTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
