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
 * Information about a local secondary index for a DynamoDB table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDynamoDbTableLocalSecondaryIndex"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableLocalSecondaryIndex implements Serializable, Cloneable, StructuredPojo {

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
     * The complete key schema for the index.
     * </p>
     */
    private java.util.List<AwsDynamoDbTableKeySchema> keySchema;
    /**
     * <p>
     * Attributes that are copied from the table into the index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     * </p>
     */
    private AwsDynamoDbTableProjection projection;

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

    public AwsDynamoDbTableLocalSecondaryIndex withIndexArn(String indexArn) {
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

    public AwsDynamoDbTableLocalSecondaryIndex withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The complete key schema for the index.
     * </p>
     * 
     * @return The complete key schema for the index.
     */

    public java.util.List<AwsDynamoDbTableKeySchema> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The complete key schema for the index.
     * </p>
     * 
     * @param keySchema
     *        The complete key schema for the index.
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
     * The complete key schema for the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySchema(java.util.Collection)} or {@link #withKeySchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keySchema
     *        The complete key schema for the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableLocalSecondaryIndex withKeySchema(AwsDynamoDbTableKeySchema... keySchema) {
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
     * The complete key schema for the index.
     * </p>
     * 
     * @param keySchema
     *        The complete key schema for the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableLocalSecondaryIndex withKeySchema(java.util.Collection<AwsDynamoDbTableKeySchema> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * Attributes that are copied from the table into the index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     * </p>
     * 
     * @param projection
     *        Attributes that are copied from the table into the index. These are in addition to the primary key
     *        attributes and index key attributes, which are automatically projected.
     */

    public void setProjection(AwsDynamoDbTableProjection projection) {
        this.projection = projection;
    }

    /**
     * <p>
     * Attributes that are copied from the table into the index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     * </p>
     * 
     * @return Attributes that are copied from the table into the index. These are in addition to the primary key
     *         attributes and index key attributes, which are automatically projected.
     */

    public AwsDynamoDbTableProjection getProjection() {
        return this.projection;
    }

    /**
     * <p>
     * Attributes that are copied from the table into the index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     * </p>
     * 
     * @param projection
     *        Attributes that are copied from the table into the index. These are in addition to the primary key
     *        attributes and index key attributes, which are automatically projected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDynamoDbTableLocalSecondaryIndex withProjection(AwsDynamoDbTableProjection projection) {
        setProjection(projection);
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
        if (getIndexArn() != null)
            sb.append("IndexArn: ").append(getIndexArn()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getKeySchema() != null)
            sb.append("KeySchema: ").append(getKeySchema()).append(",");
        if (getProjection() != null)
            sb.append("Projection: ").append(getProjection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDynamoDbTableLocalSecondaryIndex == false)
            return false;
        AwsDynamoDbTableLocalSecondaryIndex other = (AwsDynamoDbTableLocalSecondaryIndex) obj;
        if (other.getIndexArn() == null ^ this.getIndexArn() == null)
            return false;
        if (other.getIndexArn() != null && other.getIndexArn().equals(this.getIndexArn()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getProjection() == null ^ this.getProjection() == null)
            return false;
        if (other.getProjection() != null && other.getProjection().equals(this.getProjection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexArn() == null) ? 0 : getIndexArn().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode + ((getProjection() == null) ? 0 : getProjection().hashCode());
        return hashCode;
    }

    @Override
    public AwsDynamoDbTableLocalSecondaryIndex clone() {
        try {
            return (AwsDynamoDbTableLocalSecondaryIndex) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDynamoDbTableLocalSecondaryIndexMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
