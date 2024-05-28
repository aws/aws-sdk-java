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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the relationship between generic data models.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/CodegenGenericDataRelationshipType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodegenGenericDataRelationshipType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data relationship type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the related model in the data relationship.
     * </p>
     */
    private String relatedModelName;
    /**
     * <p>
     * The related model fields in the data relationship.
     * </p>
     */
    private java.util.List<String> relatedModelFields;
    /**
     * <p>
     * Specifies whether the relationship can unlink the associated model.
     * </p>
     */
    private Boolean canUnlinkAssociatedModel;
    /**
     * <p>
     * The name of the related join field in the data relationship.
     * </p>
     */
    private String relatedJoinFieldName;
    /**
     * <p>
     * The name of the related join table in the data relationship.
     * </p>
     */
    private String relatedJoinTableName;
    /**
     * <p>
     * The value of the <code>belongsTo</code> field on the related data model.
     * </p>
     */
    private String belongsToFieldOnRelatedModel;
    /**
     * <p>
     * The associated fields of the data relationship.
     * </p>
     */
    private java.util.List<String> associatedFields;
    /**
     * <p>
     * Specifies whether the <code>@index</code> directive is supported for a <code>hasMany</code> data relationship.
     * </p>
     */
    private Boolean isHasManyIndex;

    /**
     * <p>
     * The data relationship type.
     * </p>
     * 
     * @param type
     *        The data relationship type.
     * @see GenericDataRelationshipType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data relationship type.
     * </p>
     * 
     * @return The data relationship type.
     * @see GenericDataRelationshipType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data relationship type.
     * </p>
     * 
     * @param type
     *        The data relationship type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenericDataRelationshipType
     */

    public CodegenGenericDataRelationshipType withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The data relationship type.
     * </p>
     * 
     * @param type
     *        The data relationship type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GenericDataRelationshipType
     */

    public CodegenGenericDataRelationshipType withType(GenericDataRelationshipType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the related model in the data relationship.
     * </p>
     * 
     * @param relatedModelName
     *        The name of the related model in the data relationship.
     */

    public void setRelatedModelName(String relatedModelName) {
        this.relatedModelName = relatedModelName;
    }

    /**
     * <p>
     * The name of the related model in the data relationship.
     * </p>
     * 
     * @return The name of the related model in the data relationship.
     */

    public String getRelatedModelName() {
        return this.relatedModelName;
    }

    /**
     * <p>
     * The name of the related model in the data relationship.
     * </p>
     * 
     * @param relatedModelName
     *        The name of the related model in the data relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataRelationshipType withRelatedModelName(String relatedModelName) {
        setRelatedModelName(relatedModelName);
        return this;
    }

    /**
     * <p>
     * The related model fields in the data relationship.
     * </p>
     * 
     * @return The related model fields in the data relationship.
     */

    public java.util.List<String> getRelatedModelFields() {
        return relatedModelFields;
    }

    /**
     * <p>
     * The related model fields in the data relationship.
     * </p>
     * 
     * @param relatedModelFields
     *        The related model fields in the data relationship.
     */

    public void setRelatedModelFields(java.util.Collection<String> relatedModelFields) {
        if (relatedModelFields == null) {
            this.relatedModelFields = null;
            return;
        }

        this.relatedModelFields = new java.util.ArrayList<String>(relatedModelFields);
    }

    /**
     * <p>
     * The related model fields in the data relationship.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRelatedModelFields(java.util.Collection)} or {@link #withRelatedModelFields(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param relatedModelFields
     *        The related model fields in the data relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataRelationshipType withRelatedModelFields(String... relatedModelFields) {
        if (this.relatedModelFields == null) {
            setRelatedModelFields(new java.util.ArrayList<String>(relatedModelFields.length));
        }
        for (String ele : relatedModelFields) {
            this.relatedModelFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The related model fields in the data relationship.
     * </p>
     * 
     * @param relatedModelFields
     *        The related model fields in the data relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataRelationshipType withRelatedModelFields(java.util.Collection<String> relatedModelFields) {
        setRelatedModelFields(relatedModelFields);
        return this;
    }

    /**
     * <p>
     * Specifies whether the relationship can unlink the associated model.
     * </p>
     * 
     * @param canUnlinkAssociatedModel
     *        Specifies whether the relationship can unlink the associated model.
     */

    public void setCanUnlinkAssociatedModel(Boolean canUnlinkAssociatedModel) {
        this.canUnlinkAssociatedModel = canUnlinkAssociatedModel;
    }

    /**
     * <p>
     * Specifies whether the relationship can unlink the associated model.
     * </p>
     * 
     * @return Specifies whether the relationship can unlink the associated model.
     */

    public Boolean getCanUnlinkAssociatedModel() {
        return this.canUnlinkAssociatedModel;
    }

    /**
     * <p>
     * Specifies whether the relationship can unlink the associated model.
     * </p>
     * 
     * @param canUnlinkAssociatedModel
     *        Specifies whether the relationship can unlink the associated model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataRelationshipType withCanUnlinkAssociatedModel(Boolean canUnlinkAssociatedModel) {
        setCanUnlinkAssociatedModel(canUnlinkAssociatedModel);
        return this;
    }

    /**
     * <p>
     * Specifies whether the relationship can unlink the associated model.
     * </p>
     * 
     * @return Specifies whether the relationship can unlink the associated model.
     */

    public Boolean isCanUnlinkAssociatedModel() {
        return this.canUnlinkAssociatedModel;
    }

    /**
     * <p>
     * The name of the related join field in the data relationship.
     * </p>
     * 
     * @param relatedJoinFieldName
     *        The name of the related join field in the data relationship.
     */

    public void setRelatedJoinFieldName(String relatedJoinFieldName) {
        this.relatedJoinFieldName = relatedJoinFieldName;
    }

    /**
     * <p>
     * The name of the related join field in the data relationship.
     * </p>
     * 
     * @return The name of the related join field in the data relationship.
     */

    public String getRelatedJoinFieldName() {
        return this.relatedJoinFieldName;
    }

    /**
     * <p>
     * The name of the related join field in the data relationship.
     * </p>
     * 
     * @param relatedJoinFieldName
     *        The name of the related join field in the data relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataRelationshipType withRelatedJoinFieldName(String relatedJoinFieldName) {
        setRelatedJoinFieldName(relatedJoinFieldName);
        return this;
    }

    /**
     * <p>
     * The name of the related join table in the data relationship.
     * </p>
     * 
     * @param relatedJoinTableName
     *        The name of the related join table in the data relationship.
     */

    public void setRelatedJoinTableName(String relatedJoinTableName) {
        this.relatedJoinTableName = relatedJoinTableName;
    }

    /**
     * <p>
     * The name of the related join table in the data relationship.
     * </p>
     * 
     * @return The name of the related join table in the data relationship.
     */

    public String getRelatedJoinTableName() {
        return this.relatedJoinTableName;
    }

    /**
     * <p>
     * The name of the related join table in the data relationship.
     * </p>
     * 
     * @param relatedJoinTableName
     *        The name of the related join table in the data relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataRelationshipType withRelatedJoinTableName(String relatedJoinTableName) {
        setRelatedJoinTableName(relatedJoinTableName);
        return this;
    }

    /**
     * <p>
     * The value of the <code>belongsTo</code> field on the related data model.
     * </p>
     * 
     * @param belongsToFieldOnRelatedModel
     *        The value of the <code>belongsTo</code> field on the related data model.
     */

    public void setBelongsToFieldOnRelatedModel(String belongsToFieldOnRelatedModel) {
        this.belongsToFieldOnRelatedModel = belongsToFieldOnRelatedModel;
    }

    /**
     * <p>
     * The value of the <code>belongsTo</code> field on the related data model.
     * </p>
     * 
     * @return The value of the <code>belongsTo</code> field on the related data model.
     */

    public String getBelongsToFieldOnRelatedModel() {
        return this.belongsToFieldOnRelatedModel;
    }

    /**
     * <p>
     * The value of the <code>belongsTo</code> field on the related data model.
     * </p>
     * 
     * @param belongsToFieldOnRelatedModel
     *        The value of the <code>belongsTo</code> field on the related data model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataRelationshipType withBelongsToFieldOnRelatedModel(String belongsToFieldOnRelatedModel) {
        setBelongsToFieldOnRelatedModel(belongsToFieldOnRelatedModel);
        return this;
    }

    /**
     * <p>
     * The associated fields of the data relationship.
     * </p>
     * 
     * @return The associated fields of the data relationship.
     */

    public java.util.List<String> getAssociatedFields() {
        return associatedFields;
    }

    /**
     * <p>
     * The associated fields of the data relationship.
     * </p>
     * 
     * @param associatedFields
     *        The associated fields of the data relationship.
     */

    public void setAssociatedFields(java.util.Collection<String> associatedFields) {
        if (associatedFields == null) {
            this.associatedFields = null;
            return;
        }

        this.associatedFields = new java.util.ArrayList<String>(associatedFields);
    }

    /**
     * <p>
     * The associated fields of the data relationship.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedFields(java.util.Collection)} or {@link #withAssociatedFields(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param associatedFields
     *        The associated fields of the data relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataRelationshipType withAssociatedFields(String... associatedFields) {
        if (this.associatedFields == null) {
            setAssociatedFields(new java.util.ArrayList<String>(associatedFields.length));
        }
        for (String ele : associatedFields) {
            this.associatedFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The associated fields of the data relationship.
     * </p>
     * 
     * @param associatedFields
     *        The associated fields of the data relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataRelationshipType withAssociatedFields(java.util.Collection<String> associatedFields) {
        setAssociatedFields(associatedFields);
        return this;
    }

    /**
     * <p>
     * Specifies whether the <code>@index</code> directive is supported for a <code>hasMany</code> data relationship.
     * </p>
     * 
     * @param isHasManyIndex
     *        Specifies whether the <code>@index</code> directive is supported for a <code>hasMany</code> data
     *        relationship.
     */

    public void setIsHasManyIndex(Boolean isHasManyIndex) {
        this.isHasManyIndex = isHasManyIndex;
    }

    /**
     * <p>
     * Specifies whether the <code>@index</code> directive is supported for a <code>hasMany</code> data relationship.
     * </p>
     * 
     * @return Specifies whether the <code>@index</code> directive is supported for a <code>hasMany</code> data
     *         relationship.
     */

    public Boolean getIsHasManyIndex() {
        return this.isHasManyIndex;
    }

    /**
     * <p>
     * Specifies whether the <code>@index</code> directive is supported for a <code>hasMany</code> data relationship.
     * </p>
     * 
     * @param isHasManyIndex
     *        Specifies whether the <code>@index</code> directive is supported for a <code>hasMany</code> data
     *        relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodegenGenericDataRelationshipType withIsHasManyIndex(Boolean isHasManyIndex) {
        setIsHasManyIndex(isHasManyIndex);
        return this;
    }

    /**
     * <p>
     * Specifies whether the <code>@index</code> directive is supported for a <code>hasMany</code> data relationship.
     * </p>
     * 
     * @return Specifies whether the <code>@index</code> directive is supported for a <code>hasMany</code> data
     *         relationship.
     */

    public Boolean isHasManyIndex() {
        return this.isHasManyIndex;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getRelatedModelName() != null)
            sb.append("RelatedModelName: ").append(getRelatedModelName()).append(",");
        if (getRelatedModelFields() != null)
            sb.append("RelatedModelFields: ").append(getRelatedModelFields()).append(",");
        if (getCanUnlinkAssociatedModel() != null)
            sb.append("CanUnlinkAssociatedModel: ").append(getCanUnlinkAssociatedModel()).append(",");
        if (getRelatedJoinFieldName() != null)
            sb.append("RelatedJoinFieldName: ").append(getRelatedJoinFieldName()).append(",");
        if (getRelatedJoinTableName() != null)
            sb.append("RelatedJoinTableName: ").append(getRelatedJoinTableName()).append(",");
        if (getBelongsToFieldOnRelatedModel() != null)
            sb.append("BelongsToFieldOnRelatedModel: ").append(getBelongsToFieldOnRelatedModel()).append(",");
        if (getAssociatedFields() != null)
            sb.append("AssociatedFields: ").append(getAssociatedFields()).append(",");
        if (getIsHasManyIndex() != null)
            sb.append("IsHasManyIndex: ").append(getIsHasManyIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodegenGenericDataRelationshipType == false)
            return false;
        CodegenGenericDataRelationshipType other = (CodegenGenericDataRelationshipType) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getRelatedModelName() == null ^ this.getRelatedModelName() == null)
            return false;
        if (other.getRelatedModelName() != null && other.getRelatedModelName().equals(this.getRelatedModelName()) == false)
            return false;
        if (other.getRelatedModelFields() == null ^ this.getRelatedModelFields() == null)
            return false;
        if (other.getRelatedModelFields() != null && other.getRelatedModelFields().equals(this.getRelatedModelFields()) == false)
            return false;
        if (other.getCanUnlinkAssociatedModel() == null ^ this.getCanUnlinkAssociatedModel() == null)
            return false;
        if (other.getCanUnlinkAssociatedModel() != null && other.getCanUnlinkAssociatedModel().equals(this.getCanUnlinkAssociatedModel()) == false)
            return false;
        if (other.getRelatedJoinFieldName() == null ^ this.getRelatedJoinFieldName() == null)
            return false;
        if (other.getRelatedJoinFieldName() != null && other.getRelatedJoinFieldName().equals(this.getRelatedJoinFieldName()) == false)
            return false;
        if (other.getRelatedJoinTableName() == null ^ this.getRelatedJoinTableName() == null)
            return false;
        if (other.getRelatedJoinTableName() != null && other.getRelatedJoinTableName().equals(this.getRelatedJoinTableName()) == false)
            return false;
        if (other.getBelongsToFieldOnRelatedModel() == null ^ this.getBelongsToFieldOnRelatedModel() == null)
            return false;
        if (other.getBelongsToFieldOnRelatedModel() != null && other.getBelongsToFieldOnRelatedModel().equals(this.getBelongsToFieldOnRelatedModel()) == false)
            return false;
        if (other.getAssociatedFields() == null ^ this.getAssociatedFields() == null)
            return false;
        if (other.getAssociatedFields() != null && other.getAssociatedFields().equals(this.getAssociatedFields()) == false)
            return false;
        if (other.getIsHasManyIndex() == null ^ this.getIsHasManyIndex() == null)
            return false;
        if (other.getIsHasManyIndex() != null && other.getIsHasManyIndex().equals(this.getIsHasManyIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getRelatedModelName() == null) ? 0 : getRelatedModelName().hashCode());
        hashCode = prime * hashCode + ((getRelatedModelFields() == null) ? 0 : getRelatedModelFields().hashCode());
        hashCode = prime * hashCode + ((getCanUnlinkAssociatedModel() == null) ? 0 : getCanUnlinkAssociatedModel().hashCode());
        hashCode = prime * hashCode + ((getRelatedJoinFieldName() == null) ? 0 : getRelatedJoinFieldName().hashCode());
        hashCode = prime * hashCode + ((getRelatedJoinTableName() == null) ? 0 : getRelatedJoinTableName().hashCode());
        hashCode = prime * hashCode + ((getBelongsToFieldOnRelatedModel() == null) ? 0 : getBelongsToFieldOnRelatedModel().hashCode());
        hashCode = prime * hashCode + ((getAssociatedFields() == null) ? 0 : getAssociatedFields().hashCode());
        hashCode = prime * hashCode + ((getIsHasManyIndex() == null) ? 0 : getIsHasManyIndex().hashCode());
        return hashCode;
    }

    @Override
    public CodegenGenericDataRelationshipType clone() {
        try {
            return (CodegenGenericDataRelationshipType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.CodegenGenericDataRelationshipTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
