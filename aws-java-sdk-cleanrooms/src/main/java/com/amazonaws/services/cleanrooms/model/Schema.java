/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A schema is a relation within a collaboration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/Schema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Schema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The columns for the relation this schema represents.
     * </p>
     */
    private java.util.List<Column> columns;
    /**
     * <p>
     * The partition keys for the dataset underlying this schema.
     * </p>
     */
    private java.util.List<Column> partitionKeys;
    /**
     * <p>
     * The analysis rule types associated with the schema. Currently, only one entry is present.
     * </p>
     */
    private java.util.List<String> analysisRuleTypes;
    /**
     * <p>
     * The analysis method for the schema. The only valid value is currently DIRECT_QUERY.
     * </p>
     */
    private String analysisMethod;
    /**
     * <p>
     * The unique account ID for the Amazon Web Services account that owns the schema.
     * </p>
     */
    private String creatorAccountId;
    /**
     * <p>
     * A name for the schema. The schema relation is referred to by this name when queried by a protected query.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The unique ID for the collaboration that the schema belongs to.
     * </p>
     */
    private String collaborationId;
    /**
     * <p>
     * The unique ARN for the collaboration that the schema belongs to.
     * </p>
     */
    private String collaborationArn;
    /**
     * <p>
     * A description for the schema.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time the schema was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time the schema was last updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The type of schema. The only valid value is currently `TABLE`.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Details about the status of the schema. Currently, only one entry is present.
     * </p>
     */
    private java.util.List<SchemaStatusDetail> schemaStatusDetails;

    /**
     * <p>
     * The columns for the relation this schema represents.
     * </p>
     * 
     * @return The columns for the relation this schema represents.
     */

    public java.util.List<Column> getColumns() {
        return columns;
    }

    /**
     * <p>
     * The columns for the relation this schema represents.
     * </p>
     * 
     * @param columns
     *        The columns for the relation this schema represents.
     */

    public void setColumns(java.util.Collection<Column> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<Column>(columns);
    }

    /**
     * <p>
     * The columns for the relation this schema represents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        The columns for the relation this schema represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withColumns(Column... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<Column>(columns.length));
        }
        for (Column ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns for the relation this schema represents.
     * </p>
     * 
     * @param columns
     *        The columns for the relation this schema represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withColumns(java.util.Collection<Column> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * The partition keys for the dataset underlying this schema.
     * </p>
     * 
     * @return The partition keys for the dataset underlying this schema.
     */

    public java.util.List<Column> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * <p>
     * The partition keys for the dataset underlying this schema.
     * </p>
     * 
     * @param partitionKeys
     *        The partition keys for the dataset underlying this schema.
     */

    public void setPartitionKeys(java.util.Collection<Column> partitionKeys) {
        if (partitionKeys == null) {
            this.partitionKeys = null;
            return;
        }

        this.partitionKeys = new java.util.ArrayList<Column>(partitionKeys);
    }

    /**
     * <p>
     * The partition keys for the dataset underlying this schema.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionKeys(java.util.Collection)} or {@link #withPartitionKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param partitionKeys
     *        The partition keys for the dataset underlying this schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withPartitionKeys(Column... partitionKeys) {
        if (this.partitionKeys == null) {
            setPartitionKeys(new java.util.ArrayList<Column>(partitionKeys.length));
        }
        for (Column ele : partitionKeys) {
            this.partitionKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The partition keys for the dataset underlying this schema.
     * </p>
     * 
     * @param partitionKeys
     *        The partition keys for the dataset underlying this schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withPartitionKeys(java.util.Collection<Column> partitionKeys) {
        setPartitionKeys(partitionKeys);
        return this;
    }

    /**
     * <p>
     * The analysis rule types associated with the schema. Currently, only one entry is present.
     * </p>
     * 
     * @return The analysis rule types associated with the schema. Currently, only one entry is present.
     * @see AnalysisRuleType
     */

    public java.util.List<String> getAnalysisRuleTypes() {
        return analysisRuleTypes;
    }

    /**
     * <p>
     * The analysis rule types associated with the schema. Currently, only one entry is present.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The analysis rule types associated with the schema. Currently, only one entry is present.
     * @see AnalysisRuleType
     */

    public void setAnalysisRuleTypes(java.util.Collection<String> analysisRuleTypes) {
        if (analysisRuleTypes == null) {
            this.analysisRuleTypes = null;
            return;
        }

        this.analysisRuleTypes = new java.util.ArrayList<String>(analysisRuleTypes);
    }

    /**
     * <p>
     * The analysis rule types associated with the schema. Currently, only one entry is present.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisRuleTypes(java.util.Collection)} or {@link #withAnalysisRuleTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The analysis rule types associated with the schema. Currently, only one entry is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public Schema withAnalysisRuleTypes(String... analysisRuleTypes) {
        if (this.analysisRuleTypes == null) {
            setAnalysisRuleTypes(new java.util.ArrayList<String>(analysisRuleTypes.length));
        }
        for (String ele : analysisRuleTypes) {
            this.analysisRuleTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The analysis rule types associated with the schema. Currently, only one entry is present.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The analysis rule types associated with the schema. Currently, only one entry is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public Schema withAnalysisRuleTypes(java.util.Collection<String> analysisRuleTypes) {
        setAnalysisRuleTypes(analysisRuleTypes);
        return this;
    }

    /**
     * <p>
     * The analysis rule types associated with the schema. Currently, only one entry is present.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The analysis rule types associated with the schema. Currently, only one entry is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public Schema withAnalysisRuleTypes(AnalysisRuleType... analysisRuleTypes) {
        java.util.ArrayList<String> analysisRuleTypesCopy = new java.util.ArrayList<String>(analysisRuleTypes.length);
        for (AnalysisRuleType value : analysisRuleTypes) {
            analysisRuleTypesCopy.add(value.toString());
        }
        if (getAnalysisRuleTypes() == null) {
            setAnalysisRuleTypes(analysisRuleTypesCopy);
        } else {
            getAnalysisRuleTypes().addAll(analysisRuleTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The analysis method for the schema. The only valid value is currently DIRECT_QUERY.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the schema. The only valid value is currently DIRECT_QUERY.
     * @see AnalysisMethod
     */

    public void setAnalysisMethod(String analysisMethod) {
        this.analysisMethod = analysisMethod;
    }

    /**
     * <p>
     * The analysis method for the schema. The only valid value is currently DIRECT_QUERY.
     * </p>
     * 
     * @return The analysis method for the schema. The only valid value is currently DIRECT_QUERY.
     * @see AnalysisMethod
     */

    public String getAnalysisMethod() {
        return this.analysisMethod;
    }

    /**
     * <p>
     * The analysis method for the schema. The only valid value is currently DIRECT_QUERY.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the schema. The only valid value is currently DIRECT_QUERY.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisMethod
     */

    public Schema withAnalysisMethod(String analysisMethod) {
        setAnalysisMethod(analysisMethod);
        return this;
    }

    /**
     * <p>
     * The analysis method for the schema. The only valid value is currently DIRECT_QUERY.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the schema. The only valid value is currently DIRECT_QUERY.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisMethod
     */

    public Schema withAnalysisMethod(AnalysisMethod analysisMethod) {
        this.analysisMethod = analysisMethod.toString();
        return this;
    }

    /**
     * <p>
     * The unique account ID for the Amazon Web Services account that owns the schema.
     * </p>
     * 
     * @param creatorAccountId
     *        The unique account ID for the Amazon Web Services account that owns the schema.
     */

    public void setCreatorAccountId(String creatorAccountId) {
        this.creatorAccountId = creatorAccountId;
    }

    /**
     * <p>
     * The unique account ID for the Amazon Web Services account that owns the schema.
     * </p>
     * 
     * @return The unique account ID for the Amazon Web Services account that owns the schema.
     */

    public String getCreatorAccountId() {
        return this.creatorAccountId;
    }

    /**
     * <p>
     * The unique account ID for the Amazon Web Services account that owns the schema.
     * </p>
     * 
     * @param creatorAccountId
     *        The unique account ID for the Amazon Web Services account that owns the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withCreatorAccountId(String creatorAccountId) {
        setCreatorAccountId(creatorAccountId);
        return this;
    }

    /**
     * <p>
     * A name for the schema. The schema relation is referred to by this name when queried by a protected query.
     * </p>
     * 
     * @param name
     *        A name for the schema. The schema relation is referred to by this name when queried by a protected query.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the schema. The schema relation is referred to by this name when queried by a protected query.
     * </p>
     * 
     * @return A name for the schema. The schema relation is referred to by this name when queried by a protected query.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the schema. The schema relation is referred to by this name when queried by a protected query.
     * </p>
     * 
     * @param name
     *        A name for the schema. The schema relation is referred to by this name when queried by a protected query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The unique ID for the collaboration that the schema belongs to.
     * </p>
     * 
     * @param collaborationId
     *        The unique ID for the collaboration that the schema belongs to.
     */

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    /**
     * <p>
     * The unique ID for the collaboration that the schema belongs to.
     * </p>
     * 
     * @return The unique ID for the collaboration that the schema belongs to.
     */

    public String getCollaborationId() {
        return this.collaborationId;
    }

    /**
     * <p>
     * The unique ID for the collaboration that the schema belongs to.
     * </p>
     * 
     * @param collaborationId
     *        The unique ID for the collaboration that the schema belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withCollaborationId(String collaborationId) {
        setCollaborationId(collaborationId);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the collaboration that the schema belongs to.
     * </p>
     * 
     * @param collaborationArn
     *        The unique ARN for the collaboration that the schema belongs to.
     */

    public void setCollaborationArn(String collaborationArn) {
        this.collaborationArn = collaborationArn;
    }

    /**
     * <p>
     * The unique ARN for the collaboration that the schema belongs to.
     * </p>
     * 
     * @return The unique ARN for the collaboration that the schema belongs to.
     */

    public String getCollaborationArn() {
        return this.collaborationArn;
    }

    /**
     * <p>
     * The unique ARN for the collaboration that the schema belongs to.
     * </p>
     * 
     * @param collaborationArn
     *        The unique ARN for the collaboration that the schema belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withCollaborationArn(String collaborationArn) {
        setCollaborationArn(collaborationArn);
        return this;
    }

    /**
     * <p>
     * A description for the schema.
     * </p>
     * 
     * @param description
     *        A description for the schema.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the schema.
     * </p>
     * 
     * @return A description for the schema.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the schema.
     * </p>
     * 
     * @param description
     *        A description for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time the schema was created.
     * </p>
     * 
     * @param createTime
     *        The time the schema was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the schema was created.
     * </p>
     * 
     * @return The time the schema was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time the schema was created.
     * </p>
     * 
     * @param createTime
     *        The time the schema was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time the schema was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the schema was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the schema was last updated.
     * </p>
     * 
     * @return The time the schema was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the schema was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the schema was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The type of schema. The only valid value is currently `TABLE`.
     * </p>
     * 
     * @param type
     *        The type of schema. The only valid value is currently `TABLE`.
     * @see SchemaType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of schema. The only valid value is currently `TABLE`.
     * </p>
     * 
     * @return The type of schema. The only valid value is currently `TABLE`.
     * @see SchemaType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of schema. The only valid value is currently `TABLE`.
     * </p>
     * 
     * @param type
     *        The type of schema. The only valid value is currently `TABLE`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaType
     */

    public Schema withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of schema. The only valid value is currently `TABLE`.
     * </p>
     * 
     * @param type
     *        The type of schema. The only valid value is currently `TABLE`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaType
     */

    public Schema withType(SchemaType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Details about the status of the schema. Currently, only one entry is present.
     * </p>
     * 
     * @return Details about the status of the schema. Currently, only one entry is present.
     */

    public java.util.List<SchemaStatusDetail> getSchemaStatusDetails() {
        return schemaStatusDetails;
    }

    /**
     * <p>
     * Details about the status of the schema. Currently, only one entry is present.
     * </p>
     * 
     * @param schemaStatusDetails
     *        Details about the status of the schema. Currently, only one entry is present.
     */

    public void setSchemaStatusDetails(java.util.Collection<SchemaStatusDetail> schemaStatusDetails) {
        if (schemaStatusDetails == null) {
            this.schemaStatusDetails = null;
            return;
        }

        this.schemaStatusDetails = new java.util.ArrayList<SchemaStatusDetail>(schemaStatusDetails);
    }

    /**
     * <p>
     * Details about the status of the schema. Currently, only one entry is present.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaStatusDetails(java.util.Collection)} or {@link #withSchemaStatusDetails(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param schemaStatusDetails
     *        Details about the status of the schema. Currently, only one entry is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withSchemaStatusDetails(SchemaStatusDetail... schemaStatusDetails) {
        if (this.schemaStatusDetails == null) {
            setSchemaStatusDetails(new java.util.ArrayList<SchemaStatusDetail>(schemaStatusDetails.length));
        }
        for (SchemaStatusDetail ele : schemaStatusDetails) {
            this.schemaStatusDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the status of the schema. Currently, only one entry is present.
     * </p>
     * 
     * @param schemaStatusDetails
     *        Details about the status of the schema. Currently, only one entry is present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schema withSchemaStatusDetails(java.util.Collection<SchemaStatusDetail> schemaStatusDetails) {
        setSchemaStatusDetails(schemaStatusDetails);
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
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns()).append(",");
        if (getPartitionKeys() != null)
            sb.append("PartitionKeys: ").append(getPartitionKeys()).append(",");
        if (getAnalysisRuleTypes() != null)
            sb.append("AnalysisRuleTypes: ").append(getAnalysisRuleTypes()).append(",");
        if (getAnalysisMethod() != null)
            sb.append("AnalysisMethod: ").append(getAnalysisMethod()).append(",");
        if (getCreatorAccountId() != null)
            sb.append("CreatorAccountId: ").append(getCreatorAccountId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getCollaborationArn() != null)
            sb.append("CollaborationArn: ").append(getCollaborationArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSchemaStatusDetails() != null)
            sb.append("SchemaStatusDetails: ").append(getSchemaStatusDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schema == false)
            return false;
        Schema other = (Schema) obj;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getPartitionKeys() == null ^ this.getPartitionKeys() == null)
            return false;
        if (other.getPartitionKeys() != null && other.getPartitionKeys().equals(this.getPartitionKeys()) == false)
            return false;
        if (other.getAnalysisRuleTypes() == null ^ this.getAnalysisRuleTypes() == null)
            return false;
        if (other.getAnalysisRuleTypes() != null && other.getAnalysisRuleTypes().equals(this.getAnalysisRuleTypes()) == false)
            return false;
        if (other.getAnalysisMethod() == null ^ this.getAnalysisMethod() == null)
            return false;
        if (other.getAnalysisMethod() != null && other.getAnalysisMethod().equals(this.getAnalysisMethod()) == false)
            return false;
        if (other.getCreatorAccountId() == null ^ this.getCreatorAccountId() == null)
            return false;
        if (other.getCreatorAccountId() != null && other.getCreatorAccountId().equals(this.getCreatorAccountId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getCollaborationArn() == null ^ this.getCollaborationArn() == null)
            return false;
        if (other.getCollaborationArn() != null && other.getCollaborationArn().equals(this.getCollaborationArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSchemaStatusDetails() == null ^ this.getSchemaStatusDetails() == null)
            return false;
        if (other.getSchemaStatusDetails() != null && other.getSchemaStatusDetails().equals(this.getSchemaStatusDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode + ((getPartitionKeys() == null) ? 0 : getPartitionKeys().hashCode());
        hashCode = prime * hashCode + ((getAnalysisRuleTypes() == null) ? 0 : getAnalysisRuleTypes().hashCode());
        hashCode = prime * hashCode + ((getAnalysisMethod() == null) ? 0 : getAnalysisMethod().hashCode());
        hashCode = prime * hashCode + ((getCreatorAccountId() == null) ? 0 : getCreatorAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getCollaborationArn() == null) ? 0 : getCollaborationArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSchemaStatusDetails() == null) ? 0 : getSchemaStatusDetails().hashCode());
        return hashCode;
    }

    @Override
    public Schema clone() {
        try {
            return (Schema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.SchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
