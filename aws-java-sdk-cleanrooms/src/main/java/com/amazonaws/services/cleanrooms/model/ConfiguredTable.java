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
 * A table that has been configured for use in a collaboration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ConfiguredTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredTable implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for the configured table.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique ARN for the configured table.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A name for the configured table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the configured table.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Glue table that this configured table represents.
     * </p>
     */
    private TableReference tableReference;
    /**
     * <p>
     * The time the configured table was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time the configured table was last updated
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The types of analysis rules associated with this configured table. Currently, only one analysis rule may be
     * associated with a configured table.
     * </p>
     */
    private java.util.List<String> analysisRuleTypes;
    /**
     * <p>
     * The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     */
    private String analysisMethod;
    /**
     * <p>
     * The columns within the underlying Glue table that can be utilized within collaborations.
     * </p>
     */
    private java.util.List<String> allowedColumns;

    /**
     * <p>
     * The unique ID for the configured table.
     * </p>
     * 
     * @param id
     *        The unique ID for the configured table.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the configured table.
     * </p>
     * 
     * @return The unique ID for the configured table.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the configured table.
     * </p>
     * 
     * @param id
     *        The unique ID for the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTable withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique ARN for the configured table.
     * </p>
     * 
     * @param arn
     *        The unique ARN for the configured table.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique ARN for the configured table.
     * </p>
     * 
     * @return The unique ARN for the configured table.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique ARN for the configured table.
     * </p>
     * 
     * @param arn
     *        The unique ARN for the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTable withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A name for the configured table.
     * </p>
     * 
     * @param name
     *        A name for the configured table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the configured table.
     * </p>
     * 
     * @return A name for the configured table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the configured table.
     * </p>
     * 
     * @param name
     *        A name for the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTable withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for the configured table.
     * </p>
     * 
     * @param description
     *        A description for the configured table.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the configured table.
     * </p>
     * 
     * @return A description for the configured table.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the configured table.
     * </p>
     * 
     * @param description
     *        A description for the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTable withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Glue table that this configured table represents.
     * </p>
     * 
     * @param tableReference
     *        The Glue table that this configured table represents.
     */

    public void setTableReference(TableReference tableReference) {
        this.tableReference = tableReference;
    }

    /**
     * <p>
     * The Glue table that this configured table represents.
     * </p>
     * 
     * @return The Glue table that this configured table represents.
     */

    public TableReference getTableReference() {
        return this.tableReference;
    }

    /**
     * <p>
     * The Glue table that this configured table represents.
     * </p>
     * 
     * @param tableReference
     *        The Glue table that this configured table represents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTable withTableReference(TableReference tableReference) {
        setTableReference(tableReference);
        return this;
    }

    /**
     * <p>
     * The time the configured table was created.
     * </p>
     * 
     * @param createTime
     *        The time the configured table was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the configured table was created.
     * </p>
     * 
     * @return The time the configured table was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time the configured table was created.
     * </p>
     * 
     * @param createTime
     *        The time the configured table was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTable withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time the configured table was last updated
     * </p>
     * 
     * @param updateTime
     *        The time the configured table was last updated
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the configured table was last updated
     * </p>
     * 
     * @return The time the configured table was last updated
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the configured table was last updated
     * </p>
     * 
     * @param updateTime
     *        The time the configured table was last updated
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTable withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The types of analysis rules associated with this configured table. Currently, only one analysis rule may be
     * associated with a configured table.
     * </p>
     * 
     * @return The types of analysis rules associated with this configured table. Currently, only one analysis rule may
     *         be associated with a configured table.
     * @see ConfiguredTableAnalysisRuleType
     */

    public java.util.List<String> getAnalysisRuleTypes() {
        return analysisRuleTypes;
    }

    /**
     * <p>
     * The types of analysis rules associated with this configured table. Currently, only one analysis rule may be
     * associated with a configured table.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules associated with this configured table. Currently, only one analysis rule may
     *        be associated with a configured table.
     * @see ConfiguredTableAnalysisRuleType
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
     * The types of analysis rules associated with this configured table. Currently, only one analysis rule may be
     * associated with a configured table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisRuleTypes(java.util.Collection)} or {@link #withAnalysisRuleTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules associated with this configured table. Currently, only one analysis rule may
     *        be associated with a configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAnalysisRuleType
     */

    public ConfiguredTable withAnalysisRuleTypes(String... analysisRuleTypes) {
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
     * The types of analysis rules associated with this configured table. Currently, only one analysis rule may be
     * associated with a configured table.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules associated with this configured table. Currently, only one analysis rule may
     *        be associated with a configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAnalysisRuleType
     */

    public ConfiguredTable withAnalysisRuleTypes(java.util.Collection<String> analysisRuleTypes) {
        setAnalysisRuleTypes(analysisRuleTypes);
        return this;
    }

    /**
     * <p>
     * The types of analysis rules associated with this configured table. Currently, only one analysis rule may be
     * associated with a configured table.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules associated with this configured table. Currently, only one analysis rule may
     *        be associated with a configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAnalysisRuleType
     */

    public ConfiguredTable withAnalysisRuleTypes(ConfiguredTableAnalysisRuleType... analysisRuleTypes) {
        java.util.ArrayList<String> analysisRuleTypesCopy = new java.util.ArrayList<String>(analysisRuleTypes.length);
        for (ConfiguredTableAnalysisRuleType value : analysisRuleTypes) {
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
     * The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * @see AnalysisMethod
     */

    public void setAnalysisMethod(String analysisMethod) {
        this.analysisMethod = analysisMethod;
    }

    /**
     * <p>
     * The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @return The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * @see AnalysisMethod
     */

    public String getAnalysisMethod() {
        return this.analysisMethod;
    }

    /**
     * <p>
     * The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisMethod
     */

    public ConfiguredTable withAnalysisMethod(String analysisMethod) {
        setAnalysisMethod(analysisMethod);
        return this;
    }

    /**
     * <p>
     * The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the configured table. The only valid value is currently `DIRECT_QUERY`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisMethod
     */

    public ConfiguredTable withAnalysisMethod(AnalysisMethod analysisMethod) {
        this.analysisMethod = analysisMethod.toString();
        return this;
    }

    /**
     * <p>
     * The columns within the underlying Glue table that can be utilized within collaborations.
     * </p>
     * 
     * @return The columns within the underlying Glue table that can be utilized within collaborations.
     */

    public java.util.List<String> getAllowedColumns() {
        return allowedColumns;
    }

    /**
     * <p>
     * The columns within the underlying Glue table that can be utilized within collaborations.
     * </p>
     * 
     * @param allowedColumns
     *        The columns within the underlying Glue table that can be utilized within collaborations.
     */

    public void setAllowedColumns(java.util.Collection<String> allowedColumns) {
        if (allowedColumns == null) {
            this.allowedColumns = null;
            return;
        }

        this.allowedColumns = new java.util.ArrayList<String>(allowedColumns);
    }

    /**
     * <p>
     * The columns within the underlying Glue table that can be utilized within collaborations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedColumns(java.util.Collection)} or {@link #withAllowedColumns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allowedColumns
     *        The columns within the underlying Glue table that can be utilized within collaborations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTable withAllowedColumns(String... allowedColumns) {
        if (this.allowedColumns == null) {
            setAllowedColumns(new java.util.ArrayList<String>(allowedColumns.length));
        }
        for (String ele : allowedColumns) {
            this.allowedColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns within the underlying Glue table that can be utilized within collaborations.
     * </p>
     * 
     * @param allowedColumns
     *        The columns within the underlying Glue table that can be utilized within collaborations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTable withAllowedColumns(java.util.Collection<String> allowedColumns) {
        setAllowedColumns(allowedColumns);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTableReference() != null)
            sb.append("TableReference: ").append(getTableReference()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getAnalysisRuleTypes() != null)
            sb.append("AnalysisRuleTypes: ").append(getAnalysisRuleTypes()).append(",");
        if (getAnalysisMethod() != null)
            sb.append("AnalysisMethod: ").append(getAnalysisMethod()).append(",");
        if (getAllowedColumns() != null)
            sb.append("AllowedColumns: ").append(getAllowedColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfiguredTable == false)
            return false;
        ConfiguredTable other = (ConfiguredTable) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTableReference() == null ^ this.getTableReference() == null)
            return false;
        if (other.getTableReference() != null && other.getTableReference().equals(this.getTableReference()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getAnalysisRuleTypes() == null ^ this.getAnalysisRuleTypes() == null)
            return false;
        if (other.getAnalysisRuleTypes() != null && other.getAnalysisRuleTypes().equals(this.getAnalysisRuleTypes()) == false)
            return false;
        if (other.getAnalysisMethod() == null ^ this.getAnalysisMethod() == null)
            return false;
        if (other.getAnalysisMethod() != null && other.getAnalysisMethod().equals(this.getAnalysisMethod()) == false)
            return false;
        if (other.getAllowedColumns() == null ^ this.getAllowedColumns() == null)
            return false;
        if (other.getAllowedColumns() != null && other.getAllowedColumns().equals(this.getAllowedColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTableReference() == null) ? 0 : getTableReference().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getAnalysisRuleTypes() == null) ? 0 : getAnalysisRuleTypes().hashCode());
        hashCode = prime * hashCode + ((getAnalysisMethod() == null) ? 0 : getAnalysisMethod().hashCode());
        hashCode = prime * hashCode + ((getAllowedColumns() == null) ? 0 : getAllowedColumns().hashCode());
        return hashCode;
    }

    @Override
    public ConfiguredTable clone() {
        try {
            return (ConfiguredTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ConfiguredTableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
