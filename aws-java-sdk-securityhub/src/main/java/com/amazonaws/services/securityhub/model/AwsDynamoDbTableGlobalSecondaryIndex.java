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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information abut a global secondary index for the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableGlobalSecondaryIndex"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableGlobalSecondaryIndex implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether the index is currently backfilling.
     * </p>
     */
    private Boolean backfilling;
    /**
     * <p>
     * The ARN of the index.
     * </p>
     */
    private String indexArn;
    /**
     * <p>
     * The name of the index.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The total size in bytes of the index.
     * </p>
     */
    private Long indexSizeBytes;
    /**
     * <p>
     * The current status of the index.
     * </p>
     */
    private String indexStatus;
    /**
     * <p>
     * The number of items in the index.
     * </p>
     */
    private Integer itemCount;
    /**
     * <p>
     * The key schema for the index.
     * </p>
     */
    private java.util.List<AwsDynamoDbTableKeySchema> keySchema;
    /**
     * <p>
     * Attributes that are copied from the table into an index.
     * </p>
     */
    private AwsDynamoDbTableProjection projection;
    /**
     * <p>
     * Information about the provisioned throughput settings for the indexes.
     * </p>
     */
    private AwsDynamoDbTableProvisionedThroughput provisionedThroughput;

    /**
     * <p>
     * Whether the index is currently backfilling.
     * </p>
     * 
     * @param backfilling
     *        Whether the index is currently backfilling.
     */

    public void setBackfilling(Boolean backfilling) {
        this.backfilling = backfilling;
    }

    /**
     * <p>
     * Whether the index is currently backfilling.
     * </p>
     * 
     * @return Whether the index is currently backfilling.
     */

    public Boolean getBackfilling() {
        return this.backfilling;
    }

    /**
     * <p>
     * Whether the index is currently backfilling.
     * </p>
     * 
     * @param backfilling
     *        Whether the index is currently backfilling.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableGlobalSecondaryIndex withBackfilling(Boolean backfilling) {
        setBackfilling(backfilling);
        return this;
    }

    /**
     * <p>
     * Whether the index is currently backfilling.
     * </p>
     * 
     * @return Whether the index is currently backfilling.
     */

    public Boolean isBackfilling() {
        return this.backfilling;
    }

    /**
     * <p>
     * The ARN of the index.
     * </p>
     * 
     * @param indexArn
     *        The ARN of the index.
     */

    public void setIndexArn(String indexArn) {
        this.indexArn = indexArn;
    }

    /**
     * <p>
     * The ARN of the index.
     * </p>
     * 
     * @return The ARN of the index.
     */

    public String getIndexArn() {
        return this.indexArn;
    }

    /**
     * <p>
     * The ARN of the index.
     * </p>
     * 
     * @param indexArn
     *        The ARN of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableGlobalSecondaryIndex withIndexArn(String indexArn) {
        setIndexArn(indexArn);
        return this;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @param indexName
     *        The name of the index.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @return The name of the index.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @param indexName
     *        The name of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableGlobalSecondaryIndex withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The total size in bytes of the index.
     * </p>
     * 
     * @param indexSizeBytes
     *        The total size in bytes of the index.
     */

    public void setIndexSizeBytes(Long indexSizeBytes) {
        this.indexSizeBytes = indexSizeBytes;
    }

    /**
     * <p>
     * The total size in bytes of the index.
     * </p>
     * 
     * @return The total size in bytes of the index.
     */

    public Long getIndexSizeBytes() {
        return this.indexSizeBytes;
    }

    /**
     * <p>
     * The total size in bytes of the index.
     * </p>
     * 
     * @param indexSizeBytes
     *        The total size in bytes of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableGlobalSecondaryIndex withIndexSizeBytes(Long indexSizeBytes) {
        setIndexSizeBytes(indexSizeBytes);
        return this;
    }

    /**
     * <p>
     * The current status of the index.
     * </p>
     * 
     * @param indexStatus
     *        The current status of the index.
     */

    public void setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
    }

    /**
     * <p>
     * The current status of the index.
     * </p>
     * 
     * @return The current status of the index.
     */

    public String getIndexStatus() {
        return this.indexStatus;
    }

    /**
     * <p>
     * The current status of the index.
     * </p>
     * 
     * @param indexStatus
     *        The current status of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableGlobalSecondaryIndex withIndexStatus(String indexStatus) {
        setIndexStatus(indexStatus);
        return this;
    }

    /**
     * <p>
     * The number of items in the index.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the index.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The number of items in the index.
     * </p>
     * 
     * @return The number of items in the index.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * The number of items in the index.
     * </p>
     * 
     * @param itemCount
     *        The number of items in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableGlobalSecondaryIndex withItemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * The key schema for the index.
     * </p>
     * 
     * @return The key schema for the index.
     */

    public java.util.List<AwsDynamoDbTableKeySchema> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The key schema for the index.
     * </p>
     * 
     * @param keySchema
     *        The key schema for the index.
     */

    public void setKeySchema(java.util.Collection<AwsDynamoDbTableKeySchema> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }

        this.keySchema = new java.util.ArrayList<AwsDynamoDbTableKeySchema>(keySchema);
    }

    /**
     * <p>
     * The key schema for the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySchema(java.util.Collection)} or {@link #withKeySchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keySchema
     *        The key schema for the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableGlobalSecondaryIndex withKeySchema(AwsDynamoDbTableKeySchema... keySchema) {
        if (this.keySchema == null) {
            setKeySchema(new java.util.ArrayList<AwsDynamoDbTableKeySchema>(keySchema.length));
        }
        for (AwsDynamoDbTableKeySchema ele : keySchema) {
            this.keySchema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key schema for the index.
     * </p>
     * 
     * @param keySchema
     *        The key schema for the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableGlobalSecondaryIndex withKeySchema(java.util.Collection<AwsDynamoDbTableKeySchema> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * Attributes that are copied from the table into an index.
     * </p>
     * 
     * @param projection
     *        Attributes that are copied from the table into an index.
     */

    public void setProjection(AwsDynamoDbTableProjection projection) {
        this.projection = projection;
    }

    /**
     * <p>
     * Attributes that are copied from the table into an index.
     * </p>
     * 
     * @return Attributes that are copied from the table into an index.
     */

    public AwsDynamoDbTableProjection getProjection() {
        return this.projection;
    }

    /**
     * <p>
     * Attributes that are copied from the table into an index.
     * </p>
     * 
     * @param projection
     *        Attributes that are copied from the table into an index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableGlobalSecondaryIndex withProjection(AwsDynamoDbTableProjection projection) {
        setProjection(projection);
        return this;
    }

    /**
     * <p>
     * Information about the provisioned throughput settings for the indexes.
     * </p>
     * 
     * @param provisionedThroughput
     *        Information about the provisioned throughput settings for the indexes.
     */

    public void setProvisionedThroughput(AwsDynamoDbTableProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * Information about the provisioned throughput settings for the indexes.
     * </p>
     * 
     * @return Information about the provisioned throughput settings for the indexes.
     */

    public AwsDynamoDbTableProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * <p>
     * Information about the provisioned throughput settings for the indexes.
     * </p>
     * 
     * @param provisionedThroughput
     *        Information about the provisioned throughput settings for the indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableGlobalSecondaryIndex withProvisionedThroughput(AwsDynamoDbTableProvisionedThroughput provisionedThroughput) {
        setProvisionedThroughput(provisionedThroughput);
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
        if (getBackfilling() != null)
            sb.append("Backfilling: ").append(getBackfilling()).append(",");
        if (getIndexArn() != null)
            sb.append("IndexArn: ").append(getIndexArn()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getIndexSizeBytes() != null)
            sb.append("IndexSizeBytes: ").append(getIndexSizeBytes()).append(",");
        if (getIndexStatus() != null)
            sb.append("IndexStatus: ").append(getIndexStatus()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getKeySchema() != null)
            sb.append("KeySchema: ").append(getKeySchema()).append(",");
        if (getProjection() != null)
            sb.append("Projection: ").append(getProjection()).append(",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: ").append(getProvisionedThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDynamoDbTableGlobalSecondaryIndex == false)
            return false;
        AwsDynamoDbTableGlobalSecondaryIndex other = (AwsDynamoDbTableGlobalSecondaryIndex) obj;
        if (other.getBackfilling() == null ^ this.getBackfilling() == null)
            return false;
        if (other.getBackfilling() != null && other.getBackfilling().equals(this.getBackfilling()) == false)
            return false;
        if (other.getIndexArn() == null ^ this.getIndexArn() == null)
            return false;
        if (other.getIndexArn() != null && other.getIndexArn().equals(this.getIndexArn()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getIndexSizeBytes() == null ^ this.getIndexSizeBytes() == null)
            return false;
        if (other.getIndexSizeBytes() != null && other.getIndexSizeBytes().equals(this.getIndexSizeBytes()) == false)
            return false;
        if (other.getIndexStatus() == null ^ this.getIndexStatus() == null)
            return false;
        if (other.getIndexStatus() != null && other.getIndexStatus().equals(this.getIndexStatus()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getProjection() == null ^ this.getProjection() == null)
            return false;
        if (other.getProjection() != null && other.getProjection().equals(this.getProjection()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackfilling() == null) ? 0 : getBackfilling().hashCode());
        hashCode = prime * hashCode + ((getIndexArn() == null) ? 0 : getIndexArn().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getIndexSizeBytes() == null) ? 0 : getIndexSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getIndexStatus() == null) ? 0 : getIndexStatus().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode + ((getProjection() == null) ? 0 : getProjection().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableGlobalSecondaryIndex clone() {
        try {
            return (AwsDynamoDbTableGlobalSecondaryIndex) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableGlobalSecondaryIndexMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
