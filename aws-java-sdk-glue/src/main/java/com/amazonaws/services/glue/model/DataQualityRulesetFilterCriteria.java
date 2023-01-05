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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The criteria used to filter data quality rulesets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DataQualityRulesetFilterCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataQualityRulesetFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the ruleset filter criteria.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the ruleset filter criteria.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Filter on rulesets created before this date.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * Filter on rulesets created after this date.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * Filter on rulesets last modified before this date.
     * </p>
     */
    private java.util.Date lastModifiedBefore;
    /**
     * <p>
     * Filter on rulesets last modified after this date.
     * </p>
     */
    private java.util.Date lastModifiedAfter;
    /**
     * <p>
     * The name and database name of the target table.
     * </p>
     */
    private DataQualityTargetTable targetTable;

    /**
     * <p>
     * The name of the ruleset filter criteria.
     * </p>
     * 
     * @param name
     *        The name of the ruleset filter criteria.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ruleset filter criteria.
     * </p>
     * 
     * @return The name of the ruleset filter criteria.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ruleset filter criteria.
     * </p>
     * 
     * @param name
     *        The name of the ruleset filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRulesetFilterCriteria withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the ruleset filter criteria.
     * </p>
     * 
     * @param description
     *        The description of the ruleset filter criteria.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the ruleset filter criteria.
     * </p>
     * 
     * @return The description of the ruleset filter criteria.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the ruleset filter criteria.
     * </p>
     * 
     * @param description
     *        The description of the ruleset filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRulesetFilterCriteria withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Filter on rulesets created before this date.
     * </p>
     * 
     * @param createdBefore
     *        Filter on rulesets created before this date.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * Filter on rulesets created before this date.
     * </p>
     * 
     * @return Filter on rulesets created before this date.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * Filter on rulesets created before this date.
     * </p>
     * 
     * @param createdBefore
     *        Filter on rulesets created before this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRulesetFilterCriteria withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * Filter on rulesets created after this date.
     * </p>
     * 
     * @param createdAfter
     *        Filter on rulesets created after this date.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * Filter on rulesets created after this date.
     * </p>
     * 
     * @return Filter on rulesets created after this date.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * Filter on rulesets created after this date.
     * </p>
     * 
     * @param createdAfter
     *        Filter on rulesets created after this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRulesetFilterCriteria withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * Filter on rulesets last modified before this date.
     * </p>
     * 
     * @param lastModifiedBefore
     *        Filter on rulesets last modified before this date.
     */

    public void setLastModifiedBefore(java.util.Date lastModifiedBefore) {
        this.lastModifiedBefore = lastModifiedBefore;
    }

    /**
     * <p>
     * Filter on rulesets last modified before this date.
     * </p>
     * 
     * @return Filter on rulesets last modified before this date.
     */

    public java.util.Date getLastModifiedBefore() {
        return this.lastModifiedBefore;
    }

    /**
     * <p>
     * Filter on rulesets last modified before this date.
     * </p>
     * 
     * @param lastModifiedBefore
     *        Filter on rulesets last modified before this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRulesetFilterCriteria withLastModifiedBefore(java.util.Date lastModifiedBefore) {
        setLastModifiedBefore(lastModifiedBefore);
        return this;
    }

    /**
     * <p>
     * Filter on rulesets last modified after this date.
     * </p>
     * 
     * @param lastModifiedAfter
     *        Filter on rulesets last modified after this date.
     */

    public void setLastModifiedAfter(java.util.Date lastModifiedAfter) {
        this.lastModifiedAfter = lastModifiedAfter;
    }

    /**
     * <p>
     * Filter on rulesets last modified after this date.
     * </p>
     * 
     * @return Filter on rulesets last modified after this date.
     */

    public java.util.Date getLastModifiedAfter() {
        return this.lastModifiedAfter;
    }

    /**
     * <p>
     * Filter on rulesets last modified after this date.
     * </p>
     * 
     * @param lastModifiedAfter
     *        Filter on rulesets last modified after this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRulesetFilterCriteria withLastModifiedAfter(java.util.Date lastModifiedAfter) {
        setLastModifiedAfter(lastModifiedAfter);
        return this;
    }

    /**
     * <p>
     * The name and database name of the target table.
     * </p>
     * 
     * @param targetTable
     *        The name and database name of the target table.
     */

    public void setTargetTable(DataQualityTargetTable targetTable) {
        this.targetTable = targetTable;
    }

    /**
     * <p>
     * The name and database name of the target table.
     * </p>
     * 
     * @return The name and database name of the target table.
     */

    public DataQualityTargetTable getTargetTable() {
        return this.targetTable;
    }

    /**
     * <p>
     * The name and database name of the target table.
     * </p>
     * 
     * @param targetTable
     *        The name and database name of the target table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataQualityRulesetFilterCriteria withTargetTable(DataQualityTargetTable targetTable) {
        setTargetTable(targetTable);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getLastModifiedBefore() != null)
            sb.append("LastModifiedBefore: ").append(getLastModifiedBefore()).append(",");
        if (getLastModifiedAfter() != null)
            sb.append("LastModifiedAfter: ").append(getLastModifiedAfter()).append(",");
        if (getTargetTable() != null)
            sb.append("TargetTable: ").append(getTargetTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataQualityRulesetFilterCriteria == false)
            return false;
        DataQualityRulesetFilterCriteria other = (DataQualityRulesetFilterCriteria) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getLastModifiedBefore() == null ^ this.getLastModifiedBefore() == null)
            return false;
        if (other.getLastModifiedBefore() != null && other.getLastModifiedBefore().equals(this.getLastModifiedBefore()) == false)
            return false;
        if (other.getLastModifiedAfter() == null ^ this.getLastModifiedAfter() == null)
            return false;
        if (other.getLastModifiedAfter() != null && other.getLastModifiedAfter().equals(this.getLastModifiedAfter()) == false)
            return false;
        if (other.getTargetTable() == null ^ this.getTargetTable() == null)
            return false;
        if (other.getTargetTable() != null && other.getTargetTable().equals(this.getTargetTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBefore() == null) ? 0 : getLastModifiedBefore().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAfter() == null) ? 0 : getLastModifiedAfter().hashCode());
        hashCode = prime * hashCode + ((getTargetTable() == null) ? 0 : getTargetTable().hashCode());
        return hashCode;
    }

    @Override
    public DataQualityRulesetFilterCriteria clone() {
        try {
            return (DataQualityRulesetFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DataQualityRulesetFilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
