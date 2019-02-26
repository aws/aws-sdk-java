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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the details of the table when the backup was created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/SourceTableDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceTableDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the table for which the backup was created.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * ARN of the table for which backup was created.
     * </p>
     */
    private String tableArn;
    /**
     * <p>
     * Size of the table in bytes. Please note this is an approximate value.
     * </p>
     */
    private Long tableSizeBytes;
    /**
     * <p>
     * Schema of the table.
     * </p>
     */
    private java.util.List<KeySchemaElement> keySchema;
    /**
     * <p>
     * Time when the source table was created.
     * </p>
     */
    private java.util.Date tableCreationDateTime;
    /**
     * <p>
     * Read IOPs and Write IOPS on the table when the backup was created.
     * </p>
     */
    private ProvisionedThroughput provisionedThroughput;
    /**
     * <p>
     * Number of items in the table. Please note this is an approximate value.
     * </p>
     */
    private Long itemCount;
    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
     * changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to <code>PROVISIONED</code>. We recommend using
     * <code>PROVISIONED</code> for predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to <code>PAY_PER_REQUEST</code>. We recommend
     * using <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     */
    private String billingMode;

    /**
     * <p>
     * The name of the table for which the backup was created.
     * </p>
     * 
     * @param tableName
     *        The name of the table for which the backup was created.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table for which the backup was created.
     * </p>
     * 
     * @return The name of the table for which the backup was created.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table for which the backup was created.
     * </p>
     * 
     * @param tableName
     *        The name of the table for which the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableDetails withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     * 
     * @param tableId
     *        Unique identifier for the table for which the backup was created.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     * 
     * @return Unique identifier for the table for which the backup was created.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * Unique identifier for the table for which the backup was created.
     * </p>
     * 
     * @param tableId
     *        Unique identifier for the table for which the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableDetails withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * ARN of the table for which backup was created.
     * </p>
     * 
     * @param tableArn
     *        ARN of the table for which backup was created.
     */

    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * ARN of the table for which backup was created.
     * </p>
     * 
     * @return ARN of the table for which backup was created.
     */

    public String getTableArn() {
        return this.tableArn;
    }

    /**
     * <p>
     * ARN of the table for which backup was created.
     * </p>
     * 
     * @param tableArn
     *        ARN of the table for which backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableDetails withTableArn(String tableArn) {
        setTableArn(tableArn);
        return this;
    }

    /**
     * <p>
     * Size of the table in bytes. Please note this is an approximate value.
     * </p>
     * 
     * @param tableSizeBytes
     *        Size of the table in bytes. Please note this is an approximate value.
     */

    public void setTableSizeBytes(Long tableSizeBytes) {
        this.tableSizeBytes = tableSizeBytes;
    }

    /**
     * <p>
     * Size of the table in bytes. Please note this is an approximate value.
     * </p>
     * 
     * @return Size of the table in bytes. Please note this is an approximate value.
     */

    public Long getTableSizeBytes() {
        return this.tableSizeBytes;
    }

    /**
     * <p>
     * Size of the table in bytes. Please note this is an approximate value.
     * </p>
     * 
     * @param tableSizeBytes
     *        Size of the table in bytes. Please note this is an approximate value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableDetails withTableSizeBytes(Long tableSizeBytes) {
        setTableSizeBytes(tableSizeBytes);
        return this;
    }

    /**
     * <p>
     * Schema of the table.
     * </p>
     * 
     * @return Schema of the table.
     */

    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * Schema of the table.
     * </p>
     * 
     * @param keySchema
     *        Schema of the table.
     */

    public void setKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }

        this.keySchema = new java.util.ArrayList<KeySchemaElement>(keySchema);
    }

    /**
     * <p>
     * Schema of the table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySchema(java.util.Collection)} or {@link #withKeySchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keySchema
     *        Schema of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableDetails withKeySchema(KeySchemaElement... keySchema) {
        if (this.keySchema == null) {
            setKeySchema(new java.util.ArrayList<KeySchemaElement>(keySchema.length));
        }
        for (KeySchemaElement ele : keySchema) {
            this.keySchema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Schema of the table.
     * </p>
     * 
     * @param keySchema
     *        Schema of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableDetails withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * Time when the source table was created.
     * </p>
     * 
     * @param tableCreationDateTime
     *        Time when the source table was created.
     */

    public void setTableCreationDateTime(java.util.Date tableCreationDateTime) {
        this.tableCreationDateTime = tableCreationDateTime;
    }

    /**
     * <p>
     * Time when the source table was created.
     * </p>
     * 
     * @return Time when the source table was created.
     */

    public java.util.Date getTableCreationDateTime() {
        return this.tableCreationDateTime;
    }

    /**
     * <p>
     * Time when the source table was created.
     * </p>
     * 
     * @param tableCreationDateTime
     *        Time when the source table was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableDetails withTableCreationDateTime(java.util.Date tableCreationDateTime) {
        setTableCreationDateTime(tableCreationDateTime);
        return this;
    }

    /**
     * <p>
     * Read IOPs and Write IOPS on the table when the backup was created.
     * </p>
     * 
     * @param provisionedThroughput
     *        Read IOPs and Write IOPS on the table when the backup was created.
     */

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * Read IOPs and Write IOPS on the table when the backup was created.
     * </p>
     * 
     * @return Read IOPs and Write IOPS on the table when the backup was created.
     */

    public ProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * <p>
     * Read IOPs and Write IOPS on the table when the backup was created.
     * </p>
     * 
     * @param provisionedThroughput
     *        Read IOPs and Write IOPS on the table when the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableDetails withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        setProvisionedThroughput(provisionedThroughput);
        return this;
    }

    /**
     * <p>
     * Number of items in the table. Please note this is an approximate value.
     * </p>
     * 
     * @param itemCount
     *        Number of items in the table. Please note this is an approximate value.
     */

    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * Number of items in the table. Please note this is an approximate value.
     * </p>
     * 
     * @return Number of items in the table. Please note this is an approximate value.
     */

    public Long getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * Number of items in the table. Please note this is an approximate value.
     * </p>
     * 
     * @param itemCount
     *        Number of items in the table. Please note this is an approximate value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceTableDetails withItemCount(Long itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
     * changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to <code>PROVISIONED</code>. We recommend using
     * <code>PROVISIONED</code> for predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to <code>PAY_PER_REQUEST</code>. We recommend
     * using <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * 
     * @param billingMode
     *        Controls how you are charged for read and write throughput and how you manage capacity. This setting can
     *        be changed later.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONED</code> - Sets the read/write capacity mode to <code>PROVISIONED</code>. We recommend
     *        using <code>PROVISIONED</code> for predictable workloads.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to <code>PAY_PER_REQUEST</code>. We
     *        recommend using <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *        </p>
     *        </li>
     * @see BillingMode
     */

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
     * changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to <code>PROVISIONED</code>. We recommend using
     * <code>PROVISIONED</code> for predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to <code>PAY_PER_REQUEST</code>. We recommend
     * using <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Controls how you are charged for read and write throughput and how you manage capacity. This setting can
     *         be changed later.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROVISIONED</code> - Sets the read/write capacity mode to <code>PROVISIONED</code>. We recommend
     *         using <code>PROVISIONED</code> for predictable workloads.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to <code>PAY_PER_REQUEST</code>. We
     *         recommend using <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *         </p>
     *         </li>
     * @see BillingMode
     */

    public String getBillingMode() {
        return this.billingMode;
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
     * changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to <code>PROVISIONED</code>. We recommend using
     * <code>PROVISIONED</code> for predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to <code>PAY_PER_REQUEST</code>. We recommend
     * using <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * 
     * @param billingMode
     *        Controls how you are charged for read and write throughput and how you manage capacity. This setting can
     *        be changed later.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONED</code> - Sets the read/write capacity mode to <code>PROVISIONED</code>. We recommend
     *        using <code>PROVISIONED</code> for predictable workloads.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to <code>PAY_PER_REQUEST</code>. We
     *        recommend using <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public SourceTableDetails withBillingMode(String billingMode) {
        setBillingMode(billingMode);
        return this;
    }

    /**
     * <p>
     * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be
     * changed later.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code> - Sets the read/write capacity mode to <code>PROVISIONED</code>. We recommend using
     * <code>PROVISIONED</code> for predictable workloads.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to <code>PAY_PER_REQUEST</code>. We recommend
     * using <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     * </p>
     * </li>
     * </ul>
     * 
     * @param billingMode
     *        Controls how you are charged for read and write throughput and how you manage capacity. This setting can
     *        be changed later.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONED</code> - Sets the read/write capacity mode to <code>PROVISIONED</code>. We recommend
     *        using <code>PROVISIONED</code> for predictable workloads.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PAY_PER_REQUEST</code> - Sets the read/write capacity mode to <code>PAY_PER_REQUEST</code>. We
     *        recommend using <code>PAY_PER_REQUEST</code> for unpredictable workloads.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public SourceTableDetails withBillingMode(BillingMode billingMode) {
        this.billingMode = billingMode.toString();
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTableId() != null)
            sb.append("TableId: ").append(getTableId()).append(",");
        if (getTableArn() != null)
            sb.append("TableArn: ").append(getTableArn()).append(",");
        if (getTableSizeBytes() != null)
            sb.append("TableSizeBytes: ").append(getTableSizeBytes()).append(",");
        if (getKeySchema() != null)
            sb.append("KeySchema: ").append(getKeySchema()).append(",");
        if (getTableCreationDateTime() != null)
            sb.append("TableCreationDateTime: ").append(getTableCreationDateTime()).append(",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: ").append(getProvisionedThroughput()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getBillingMode() != null)
            sb.append("BillingMode: ").append(getBillingMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceTableDetails == false)
            return false;
        SourceTableDetails other = (SourceTableDetails) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
            return false;
        if (other.getTableSizeBytes() == null ^ this.getTableSizeBytes() == null)
            return false;
        if (other.getTableSizeBytes() != null && other.getTableSizeBytes().equals(this.getTableSizeBytes()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getTableCreationDateTime() == null ^ this.getTableCreationDateTime() == null)
            return false;
        if (other.getTableCreationDateTime() != null && other.getTableCreationDateTime().equals(this.getTableCreationDateTime()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getBillingMode() == null ^ this.getBillingMode() == null)
            return false;
        if (other.getBillingMode() != null && other.getBillingMode().equals(this.getBillingMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        hashCode = prime * hashCode + ((getTableSizeBytes() == null) ? 0 : getTableSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode + ((getTableCreationDateTime() == null) ? 0 : getTableCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getBillingMode() == null) ? 0 : getBillingMode().hashCode());
        return hashCode;
    }

    @Override
    public SourceTableDetails clone() {
        try {
            return (SourceTableDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.SourceTableDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
