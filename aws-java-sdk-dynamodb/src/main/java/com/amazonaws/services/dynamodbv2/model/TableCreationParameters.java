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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for the table created as part of the import operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/TableCreationParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableCreationParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the table created as part of the import operation.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The attributes of the table created as part of the import operation.
     * </p>
     */
    private java.util.List<AttributeDefinition> attributeDefinitions;
    /**
     * <p>
     * The primary key and option sort key of the table created as part of the import operation.
     * </p>
     */
    private java.util.List<KeySchemaElement> keySchema;
    /**
     * <p>
     * The billing mode for provisioning the table created as part of the import operation.
     * </p>
     */
    private String billingMode;

    private ProvisionedThroughput provisionedThroughput;

    private SSESpecification sSESpecification;
    /**
     * <p>
     * The Global Secondary Indexes (GSI) of the table to be created as part of the import operation.
     * </p>
     */
    private java.util.List<GlobalSecondaryIndex> globalSecondaryIndexes;

    /**
     * <p>
     * The name of the table created as part of the import operation.
     * </p>
     * 
     * @param tableName
     *        The name of the table created as part of the import operation.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table created as part of the import operation.
     * </p>
     * 
     * @return The name of the table created as part of the import operation.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table created as part of the import operation.
     * </p>
     * 
     * @param tableName
     *        The name of the table created as part of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCreationParameters withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The attributes of the table created as part of the import operation.
     * </p>
     * 
     * @return The attributes of the table created as part of the import operation.
     */

    public java.util.List<AttributeDefinition> getAttributeDefinitions() {
        return attributeDefinitions;
    }

    /**
     * <p>
     * The attributes of the table created as part of the import operation.
     * </p>
     * 
     * @param attributeDefinitions
     *        The attributes of the table created as part of the import operation.
     */

    public void setAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        if (attributeDefinitions == null) {
            this.attributeDefinitions = null;
            return;
        }

        this.attributeDefinitions = new java.util.ArrayList<AttributeDefinition>(attributeDefinitions);
    }

    /**
     * <p>
     * The attributes of the table created as part of the import operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributeDefinitions(java.util.Collection)} or {@link #withAttributeDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param attributeDefinitions
     *        The attributes of the table created as part of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCreationParameters withAttributeDefinitions(AttributeDefinition... attributeDefinitions) {
        if (this.attributeDefinitions == null) {
            setAttributeDefinitions(new java.util.ArrayList<AttributeDefinition>(attributeDefinitions.length));
        }
        for (AttributeDefinition ele : attributeDefinitions) {
            this.attributeDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes of the table created as part of the import operation.
     * </p>
     * 
     * @param attributeDefinitions
     *        The attributes of the table created as part of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCreationParameters withAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        setAttributeDefinitions(attributeDefinitions);
        return this;
    }

    /**
     * <p>
     * The primary key and option sort key of the table created as part of the import operation.
     * </p>
     * 
     * @return The primary key and option sort key of the table created as part of the import operation.
     */

    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }

    /**
     * <p>
     * The primary key and option sort key of the table created as part of the import operation.
     * </p>
     * 
     * @param keySchema
     *        The primary key and option sort key of the table created as part of the import operation.
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
     * The primary key and option sort key of the table created as part of the import operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeySchema(java.util.Collection)} or {@link #withKeySchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keySchema
     *        The primary key and option sort key of the table created as part of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCreationParameters withKeySchema(KeySchemaElement... keySchema) {
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
     * The primary key and option sort key of the table created as part of the import operation.
     * </p>
     * 
     * @param keySchema
     *        The primary key and option sort key of the table created as part of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCreationParameters withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        setKeySchema(keySchema);
        return this;
    }

    /**
     * <p>
     * The billing mode for provisioning the table created as part of the import operation.
     * </p>
     * 
     * @param billingMode
     *        The billing mode for provisioning the table created as part of the import operation.
     * @see BillingMode
     */

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    /**
     * <p>
     * The billing mode for provisioning the table created as part of the import operation.
     * </p>
     * 
     * @return The billing mode for provisioning the table created as part of the import operation.
     * @see BillingMode
     */

    public String getBillingMode() {
        return this.billingMode;
    }

    /**
     * <p>
     * The billing mode for provisioning the table created as part of the import operation.
     * </p>
     * 
     * @param billingMode
     *        The billing mode for provisioning the table created as part of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public TableCreationParameters withBillingMode(String billingMode) {
        setBillingMode(billingMode);
        return this;
    }

    /**
     * <p>
     * The billing mode for provisioning the table created as part of the import operation.
     * </p>
     * 
     * @param billingMode
     *        The billing mode for provisioning the table created as part of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BillingMode
     */

    public TableCreationParameters withBillingMode(BillingMode billingMode) {
        this.billingMode = billingMode.toString();
        return this;
    }

    /**
     * @param provisionedThroughput
     */

    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    /**
     * @return
     */

    public ProvisionedThroughput getProvisionedThroughput() {
        return this.provisionedThroughput;
    }

    /**
     * @param provisionedThroughput
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCreationParameters withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        setProvisionedThroughput(provisionedThroughput);
        return this;
    }

    /**
     * @param sSESpecification
     */

    public void setSSESpecification(SSESpecification sSESpecification) {
        this.sSESpecification = sSESpecification;
    }

    /**
     * @return
     */

    public SSESpecification getSSESpecification() {
        return this.sSESpecification;
    }

    /**
     * @param sSESpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCreationParameters withSSESpecification(SSESpecification sSESpecification) {
        setSSESpecification(sSESpecification);
        return this;
    }

    /**
     * <p>
     * The Global Secondary Indexes (GSI) of the table to be created as part of the import operation.
     * </p>
     * 
     * @return The Global Secondary Indexes (GSI) of the table to be created as part of the import operation.
     */

    public java.util.List<GlobalSecondaryIndex> getGlobalSecondaryIndexes() {
        return globalSecondaryIndexes;
    }

    /**
     * <p>
     * The Global Secondary Indexes (GSI) of the table to be created as part of the import operation.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        The Global Secondary Indexes (GSI) of the table to be created as part of the import operation.
     */

    public void setGlobalSecondaryIndexes(java.util.Collection<GlobalSecondaryIndex> globalSecondaryIndexes) {
        if (globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = null;
            return;
        }

        this.globalSecondaryIndexes = new java.util.ArrayList<GlobalSecondaryIndex>(globalSecondaryIndexes);
    }

    /**
     * <p>
     * The Global Secondary Indexes (GSI) of the table to be created as part of the import operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalSecondaryIndexes(java.util.Collection)} or
     * {@link #withGlobalSecondaryIndexes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        The Global Secondary Indexes (GSI) of the table to be created as part of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCreationParameters withGlobalSecondaryIndexes(GlobalSecondaryIndex... globalSecondaryIndexes) {
        if (this.globalSecondaryIndexes == null) {
            setGlobalSecondaryIndexes(new java.util.ArrayList<GlobalSecondaryIndex>(globalSecondaryIndexes.length));
        }
        for (GlobalSecondaryIndex ele : globalSecondaryIndexes) {
            this.globalSecondaryIndexes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Global Secondary Indexes (GSI) of the table to be created as part of the import operation.
     * </p>
     * 
     * @param globalSecondaryIndexes
     *        The Global Secondary Indexes (GSI) of the table to be created as part of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableCreationParameters withGlobalSecondaryIndexes(java.util.Collection<GlobalSecondaryIndex> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
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
        if (getAttributeDefinitions() != null)
            sb.append("AttributeDefinitions: ").append(getAttributeDefinitions()).append(",");
        if (getKeySchema() != null)
            sb.append("KeySchema: ").append(getKeySchema()).append(",");
        if (getBillingMode() != null)
            sb.append("BillingMode: ").append(getBillingMode()).append(",");
        if (getProvisionedThroughput() != null)
            sb.append("ProvisionedThroughput: ").append(getProvisionedThroughput()).append(",");
        if (getSSESpecification() != null)
            sb.append("SSESpecification: ").append(getSSESpecification()).append(",");
        if (getGlobalSecondaryIndexes() != null)
            sb.append("GlobalSecondaryIndexes: ").append(getGlobalSecondaryIndexes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableCreationParameters == false)
            return false;
        TableCreationParameters other = (TableCreationParameters) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getAttributeDefinitions() == null ^ this.getAttributeDefinitions() == null)
            return false;
        if (other.getAttributeDefinitions() != null && other.getAttributeDefinitions().equals(this.getAttributeDefinitions()) == false)
            return false;
        if (other.getKeySchema() == null ^ this.getKeySchema() == null)
            return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false)
            return false;
        if (other.getBillingMode() == null ^ this.getBillingMode() == null)
            return false;
        if (other.getBillingMode() != null && other.getBillingMode().equals(this.getBillingMode()) == false)
            return false;
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null)
            return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false)
            return false;
        if (other.getSSESpecification() == null ^ this.getSSESpecification() == null)
            return false;
        if (other.getSSESpecification() != null && other.getSSESpecification().equals(this.getSSESpecification()) == false)
            return false;
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null)
            return false;
        if (other.getGlobalSecondaryIndexes() != null && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getAttributeDefinitions() == null) ? 0 : getAttributeDefinitions().hashCode());
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode());
        hashCode = prime * hashCode + ((getBillingMode() == null) ? 0 : getBillingMode().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode());
        hashCode = prime * hashCode + ((getSSESpecification() == null) ? 0 : getSSESpecification().hashCode());
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes().hashCode());
        return hashCode;
    }

    @Override
    public TableCreationParameters clone() {
        try {
            return (TableCreationParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.TableCreationParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
