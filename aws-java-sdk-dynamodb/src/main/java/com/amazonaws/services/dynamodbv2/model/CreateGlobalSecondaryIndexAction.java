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
 * Represents a new global secondary index to be added to an existing table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CreateGlobalSecondaryIndexAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGlobalSecondaryIndexAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the global secondary index to be created.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The key schema for the global secondary index.
     * </p>
     */
    private java.util.List<KeySchemaElement> keySchema;
    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into an index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically projected.
     * </p>
     */
    private Projection projection;
    /**
     * <p>
     * Represents the provisioned throughput settings for the specified global secondary index.
     * </p>
     * <p>
     * For current minimum and maximum provisioned throughput values, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     */
    private ProvisionedThroughput provisionedThroughput;

    /**
     * <p>
     * The name of the global secondary index to be created.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index to be created.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index to be created.
     * </p>
     * 
     * @return The name of the global secondary index to be created.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the global secondary index to be created.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalSecondaryIndexAction withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The key schema for the global secondary index.
     * </p>
     * 
     * @return The key schema for the global secondary index.
     */

    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The key schema for the global secondary index.
     * </p>
     * 
     * @param keySchema
     *        The key schema for the global secondary index.
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
     * The key schema for the global secondary index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySchema(java.util.Collection)} or {@link #withKeySchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keySchema
     *        The key schema for the global secondary index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalSecondaryIndexAction withKeySchema(KeySchemaElement... keySchema) {
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
     * The key schema for the global secondary index.
     * </p>
     * 
     * @param keySchema
     *        The key schema for the global secondary index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalSecondaryIndexAction withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into an index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically projected.
     * </p>
     * 
     * @param projection
     *        Represents attributes that are copied (projected) from the table into an index. These are in addition to
     *        the primary key attributes and index key attributes, which are automatically projected.
     */

    public void setProjection(Projection projection) {
        this.projection = projection;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into an index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically projected.
     * </p>
     * 
     * @return Represents attributes that are copied (projected) from the table into an index. These are in addition to
     *         the primary key attributes and index key attributes, which are automatically projected.
     */

    public Projection getProjection() {
        return this.projection;
    }

    /**
     * <p>
     * Represents attributes that are copied (projected) from the table into an index. These are in addition to the
     * primary key attributes and index key attributes, which are automatically projected.
     * </p>
     * 
     * @param projection
     *        Represents attributes that are copied (projected) from the table into an index. These are in addition to
     *        the primary key attributes and index key attributes, which are automatically projected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalSecondaryIndexAction withProjection(Projection projection) {
        setProjection(projection);
        return this;
    }

    /**
     * <p>
     * Represents the provisioned throughput settings for the specified global secondary index.
     * </p>
     * <p>
     * For current minimum and maximum provisioned throughput values, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param provisionedThroughput
     *        Represents the provisioned throughput settings for the specified global secondary index.</p>
     *        <p>
     *        For current minimum and maximum provisioned throughput values, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the
     *        <i>Amazon DynamoDB Developer Guide</i>.
     */

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * <p>
     * Represents the provisioned throughput settings for the specified global secondary index.
     * </p>
     * <p>
     * For current minimum and maximum provisioned throughput values, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @return Represents the provisioned throughput settings for the specified global secondary index.</p>
     *         <p>
     *         For current minimum and maximum provisioned throughput values, see <a
     *         href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the
     *         <i>Amazon DynamoDB Developer Guide</i>.
     */

    public ProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * <p>
     * Represents the provisioned throughput settings for the specified global secondary index.
     * </p>
     * <p>
     * For current minimum and maximum provisioned throughput values, see <a
     * href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the <i>Amazon
     * DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param provisionedThroughput
     *        Represents the provisioned throughput settings for the specified global secondary index.</p>
     *        <p>
     *        For current minimum and maximum provisioned throughput values, see <a
     *        href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a> in the
     *        <i>Amazon DynamoDB Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGlobalSecondaryIndexAction withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
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

        if (obj instanceof CreateGlobalSecondaryIndexAction == false)
            return false;
        CreateGlobalSecondaryIndexAction other = (CreateGlobalSecondaryIndexAction) obj;
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

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode + ((getProjection() == null) ? 0 : getProjection().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        return hashCode;
    }

    @Override
    public CreateGlobalSecondaryIndexAction clone() {
        try {
            return (CreateGlobalSecondaryIndexAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.CreateGlobalSecondaryIndexActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
