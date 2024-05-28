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
 * The configured table summary for the objects listed by the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/ConfiguredTableSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredTableSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the configured table.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique ARN of the configured table.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the configured table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The time the configured table was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time the configured table was last updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The types of analysis rules associated with this configured table.
     * </p>
     */
    private java.util.List<String> analysisRuleTypes;
    /**
     * <p>
     * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     */
    private String analysisMethod;

    /**
     * <p>
     * The unique ID of the configured table.
     * </p>
     * 
     * @param id
     *        The unique ID of the configured table.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the configured table.
     * </p>
     * 
     * @return The unique ID of the configured table.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the configured table.
     * </p>
     * 
     * @param id
     *        The unique ID of the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique ARN of the configured table.
     * </p>
     * 
     * @param arn
     *        The unique ARN of the configured table.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The unique ARN of the configured table.
     * </p>
     * 
     * @return The unique ARN of the configured table.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The unique ARN of the configured table.
     * </p>
     * 
     * @param arn
     *        The unique ARN of the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the configured table.
     * </p>
     * 
     * @param name
     *        The name of the configured table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configured table.
     * </p>
     * 
     * @return The name of the configured table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configured table.
     * </p>
     * 
     * @param name
     *        The name of the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableSummary withName(String name) {
        setName(name);
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

    public ConfiguredTableSummary withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time the configured table was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the configured table was last updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time the configured table was last updated.
     * </p>
     * 
     * @return The time the configured table was last updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time the configured table was last updated.
     * </p>
     * 
     * @param updateTime
     *        The time the configured table was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfiguredTableSummary withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The types of analysis rules associated with this configured table.
     * </p>
     * 
     * @return The types of analysis rules associated with this configured table.
     * @see ConfiguredTableAnalysisRuleType
     */

    public java.util.List<String> getAnalysisRuleTypes() {
        return analysisRuleTypes;
    }

    /**
     * <p>
     * The types of analysis rules associated with this configured table.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules associated with this configured table.
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
     * The types of analysis rules associated with this configured table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisRuleTypes(java.util.Collection)} or {@link #withAnalysisRuleTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules associated with this configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAnalysisRuleType
     */

    public ConfiguredTableSummary withAnalysisRuleTypes(String... analysisRuleTypes) {
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
     * The types of analysis rules associated with this configured table.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules associated with this configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAnalysisRuleType
     */

    public ConfiguredTableSummary withAnalysisRuleTypes(java.util.Collection<String> analysisRuleTypes) {
        setAnalysisRuleTypes(analysisRuleTypes);
        return this;
    }

    /**
     * <p>
     * The types of analysis rules associated with this configured table.
     * </p>
     * 
     * @param analysisRuleTypes
     *        The types of analysis rules associated with this configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAnalysisRuleType
     */

    public ConfiguredTableSummary withAnalysisRuleTypes(ConfiguredTableAnalysisRuleType... analysisRuleTypes) {
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
     * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * @see AnalysisMethod
     */

    public void setAnalysisMethod(String analysisMethod) {
        this.analysisMethod = analysisMethod;
    }

    /**
     * <p>
     * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @return The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * @see AnalysisMethod
     */

    public String getAnalysisMethod() {
        return this.analysisMethod;
    }

    /**
     * <p>
     * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisMethod
     */

    public ConfiguredTableSummary withAnalysisMethod(String analysisMethod) {
        setAnalysisMethod(analysisMethod);
        return this;
    }

    /**
     * <p>
     * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * </p>
     * 
     * @param analysisMethod
     *        The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisMethod
     */

    public ConfiguredTableSummary withAnalysisMethod(AnalysisMethod analysisMethod) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
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

        if (obj instanceof ConfiguredTableSummary == false)
            return false;
        ConfiguredTableSummary other = (ConfiguredTableSummary) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getAnalysisRuleTypes() == null) ? 0 : getAnalysisRuleTypes().hashCode());
        hashCode = prime * hashCode + ((getAnalysisMethod() == null) ? 0 : getAnalysisMethod().hashCode());
        return hashCode;
    }

    @Override
    public ConfiguredTableSummary clone() {
        try {
            return (ConfiguredTableSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanrooms.model.transform.ConfiguredTableSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
