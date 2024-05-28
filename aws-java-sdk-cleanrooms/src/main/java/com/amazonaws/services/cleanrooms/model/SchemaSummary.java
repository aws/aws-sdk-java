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
 * The schema summary for the objects listed by the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/SchemaSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for the schema object.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of schema object. The only valid schema type is currently `TABLE`.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The unique account ID for the Amazon Web Services account that owns the schema.
     * </p>
     */
    private String creatorAccountId;
    /**
     * <p>
     * The time the schema object was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time the schema object was last updated.
     * </p>
     */
    private java.util.Date updateTime;
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
     * The types of analysis rules that are associated with this schema object.
     * </p>
     */
    private java.util.List<String> analysisRuleTypes;
    /**
     * <p>
     * The analysis method for the associated schema. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     */
    private String analysisMethod;

    /**
     * <p>
     * The name for the schema object.
     * </p>
     * 
     * @param name
     *        The name for the schema object.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the schema object.
     * </p>
     * 
     * @return The name for the schema object.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the schema object.
     * </p>
     * 
     * @param name
     *        The name for the schema object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of schema object. The only valid schema type is currently `TABLE`.
     * </p>
     * 
     * @param type
     *        The type of schema object. The only valid schema type is currently `TABLE`.
     * @see SchemaType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of schema object. The only valid schema type is currently `TABLE`.
     * </p>
     * 
     * @return The type of schema object. The only valid schema type is currently `TABLE`.
     * @see SchemaType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of schema object. The only valid schema type is currently `TABLE`.
     * </p>
     * 
     * @param type
     *        The type of schema object. The only valid schema type is currently `TABLE`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaType
     */

    public SchemaSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of schema object. The only valid schema type is currently `TABLE`.
     * </p>
     * 
     * @param type
     *        The type of schema object. The only valid schema type is currently `TABLE`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaType
     */

    public SchemaSummary withType(SchemaType type) {
        this.type = type.toString();
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

    public SchemaSummary withCreatorAccountId(String creatorAccountId) {
        setCreatorAccountId(creatorAccountId);
        return this;
    }

    /**
     * <p>
     * The time the schema object was created.
     * </p>
     * 
     * @param createTime
     *        The time the schema object was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the schema object was created.
     * </p>
     * 
     * @return The time the schema object was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time the schema object was created.
     * </p>
     * 
     * @param createTime
     *        The time the schema object was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time the schema object was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the schema object was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the schema object was last updated.
     * </p>
     * 
     * @return The time the schema object was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the schema object was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the schema object was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaSummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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

    public SchemaSummary withCollaborationId(String collaborationId) {
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

    public SchemaSummary withCollaborationArn(String collaborationArn) {
        setCollaborationArn(collaborationArn);
        return this;
    }

    /**
     * <p>
     * The types of analysis rules that are associated with this schema object.
     * </p>
     * 
     * @return The types of analysis rules that are associated with this schema object.
     * @see AnalysisRuleType
     */

    public java.util.List<String> getAnalysisRuleTypes() {
        return analysisRuleTypes;
    }

    /**
     * <p>
     * The types of analysis rules that are associated with this schema object.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules that are associated with this schema object.
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
     * The types of analysis rules that are associated with this schema object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisRuleTypes(java.util.Collection)} or {@link #withAnalysisRuleTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules that are associated with this schema object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public SchemaSummary withAnalysisRuleTypes(String... analysisRuleTypes) {
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
     * The types of analysis rules that are associated with this schema object.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules that are associated with this schema object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public SchemaSummary withAnalysisRuleTypes(java.util.Collection<String> analysisRuleTypes) {
        setAnalysisRuleTypes(analysisRuleTypes);
        return this;
    }

    /**
     * <p>
     * The types of analysis rules that are associated with this schema object.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules that are associated with this schema object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisRuleType
     */

    public SchemaSummary withAnalysisRuleTypes(AnalysisRuleType... analysisRuleTypes) {
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
     * The analysis method for the associated schema. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the associated schema. The only valid value is currently `DIRECT_QUERY`.
     * @see AnalysisMethod
     */

    public void setAnalysisMethod(String analysisMethod) {
        this.analysisMethod = analysisMethod;
    }

    /**
     * <p>
     * The analysis method for the associated schema. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @return The analysis method for the associated schema. The only valid value is currently `DIRECT_QUERY`.
     * @see AnalysisMethod
     */

    public String getAnalysisMethod() {
        return this.analysisMethod;
    }

    /**
     * <p>
     * The analysis method for the associated schema. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the associated schema. The only valid value is currently `DIRECT_QUERY`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisMethod
     */

    public SchemaSummary withAnalysisMethod(String analysisMethod) {
        setAnalysisMethod(analysisMethod);
        return this;
    }

    /**
     * <p>
     * The analysis method for the associated schema. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the associated schema. The only valid value is currently `DIRECT_QUERY`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisMethod
     */

    public SchemaSummary withAnalysisMethod(AnalysisMethod analysisMethod) {
        this.analysisMethod = analysisMethod.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCreatorAccountId() != null)
            sb.append("CreatorAccountId: ").append(getCreatorAccountId()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getCollaborationId() != null)
            sb.append("CollaborationId: ").append(getCollaborationId()).append(",");
        if (getCollaborationArn() != null)
            sb.append("CollaborationArn: ").append(getCollaborationArn()).append(",");
        if (getAnalysisRuleTypes() != null)
            sb.append("AnalysisRuleTypes: ").append(getAnalysisRuleTypes()).append(",");
        if (getAnalysisMethod() != null)
            sb.append("AnalysisMethod: ").append(getAnalysisMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaSummary == false)
            return false;
        SchemaSummary other = (SchemaSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCreatorAccountId() == null ^ this.getCreatorAccountId() == null)
            return false;
        if (other.getCreatorAccountId() != null && other.getCreatorAccountId().equals(this.getCreatorAccountId()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getCollaborationId() == null ^ this.getCollaborationId() == null)
            return false;
        if (other.getCollaborationId() != null && other.getCollaborationId().equals(this.getCollaborationId()) == false)
            return false;
        if (other.getCollaborationArn() == null ^ this.getCollaborationArn() == null)
            return false;
        if (other.getCollaborationArn() != null && other.getCollaborationArn().equals(this.getCollaborationArn()) == false)
            return false;
        if (other.getAnalysisRuleTypes() == null ^ this.getAnalysisRuleTypes() == null)
            return false;
        if (other.getAnalysisRuleTypes() != null && other.getAnalysisRuleTypes().equals(this.getAnalysisRuleTypes()) == false)
            return false;
        if (other.getAnalysisMethod() == null ^ this.getAnalysisMethod() == null)
            return false;
        if (other.getAnalysisMethod() != null && other.getAnalysisMethod().equals(this.getAnalysisMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCreatorAccountId() == null) ? 0 : getCreatorAccountId().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getCollaborationId() == null) ? 0 : getCollaborationId().hashCode());
        hashCode = prime * hashCode + ((getCollaborationArn() == null) ? 0 : getCollaborationArn().hashCode());
        hashCode = prime * hashCode + ((getAnalysisRuleTypes() == null) ? 0 : getAnalysisRuleTypes().hashCode());
        hashCode = prime * hashCode + ((getAnalysisMethod() == null) ? 0 : getAnalysisMethod().hashCode());
        return hashCode;
    }

    @Override
    public SchemaSummary clone() {
        try {
            return (SchemaSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.SchemaSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
