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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetDataQualityRuleset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataQualityRulesetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ruleset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the ruleset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A Data Quality Definition Language (DQDL) ruleset. For more information, see the Glue developer guide.
     * </p>
     */
    private String ruleset;
    /**
     * <p>
     * The name and database name of the target table.
     * </p>
     */
    private DataQualityTargetTable targetTable;
    /**
     * <p>
     * A timestamp. The time and date that this data quality ruleset was created.
     * </p>
     */
    private java.util.Date createdOn;
    /**
     * <p>
     * A timestamp. The last point in time when this data quality ruleset was modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * When a ruleset was created from a recommendation run, this run ID is generated to link the two together.
     * </p>
     */
    private String recommendationRunId;

    /**
     * <p>
     * The name of the ruleset.
     * </p>
     * 
     * @param name
     *        The name of the ruleset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ruleset.
     * </p>
     * 
     * @return The name of the ruleset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ruleset.
     * </p>
     * 
     * @param name
     *        The name of the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the ruleset.
     * </p>
     * 
     * @param description
     *        A description of the ruleset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the ruleset.
     * </p>
     * 
     * @return A description of the ruleset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the ruleset.
     * </p>
     * 
     * @param description
     *        A description of the ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A Data Quality Definition Language (DQDL) ruleset. For more information, see the Glue developer guide.
     * </p>
     * 
     * @param ruleset
     *        A Data Quality Definition Language (DQDL) ruleset. For more information, see the Glue developer guide.
     */

    public void setRuleset(String ruleset) {
        this.ruleset = ruleset;
    }

    /**
     * <p>
     * A Data Quality Definition Language (DQDL) ruleset. For more information, see the Glue developer guide.
     * </p>
     * 
     * @return A Data Quality Definition Language (DQDL) ruleset. For more information, see the Glue developer guide.
     */

    public String getRuleset() {
        return this.ruleset;
    }

    /**
     * <p>
     * A Data Quality Definition Language (DQDL) ruleset. For more information, see the Glue developer guide.
     * </p>
     * 
     * @param ruleset
     *        A Data Quality Definition Language (DQDL) ruleset. For more information, see the Glue developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetResult withRuleset(String ruleset) {
        setRuleset(ruleset);
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

    public GetDataQualityRulesetResult withTargetTable(DataQualityTargetTable targetTable) {
        setTargetTable(targetTable);
        return this;
    }

    /**
     * <p>
     * A timestamp. The time and date that this data quality ruleset was created.
     * </p>
     * 
     * @param createdOn
     *        A timestamp. The time and date that this data quality ruleset was created.
     */

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * A timestamp. The time and date that this data quality ruleset was created.
     * </p>
     * 
     * @return A timestamp. The time and date that this data quality ruleset was created.
     */

    public java.util.Date getCreatedOn() {
        return this.createdOn;
    }

    /**
     * <p>
     * A timestamp. The time and date that this data quality ruleset was created.
     * </p>
     * 
     * @param createdOn
     *        A timestamp. The time and date that this data quality ruleset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetResult withCreatedOn(java.util.Date createdOn) {
        setCreatedOn(createdOn);
        return this;
    }

    /**
     * <p>
     * A timestamp. The last point in time when this data quality ruleset was modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        A timestamp. The last point in time when this data quality ruleset was modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * A timestamp. The last point in time when this data quality ruleset was modified.
     * </p>
     * 
     * @return A timestamp. The last point in time when this data quality ruleset was modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * A timestamp. The last point in time when this data quality ruleset was modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        A timestamp. The last point in time when this data quality ruleset was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetResult withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * When a ruleset was created from a recommendation run, this run ID is generated to link the two together.
     * </p>
     * 
     * @param recommendationRunId
     *        When a ruleset was created from a recommendation run, this run ID is generated to link the two together.
     */

    public void setRecommendationRunId(String recommendationRunId) {
        this.recommendationRunId = recommendationRunId;
    }

    /**
     * <p>
     * When a ruleset was created from a recommendation run, this run ID is generated to link the two together.
     * </p>
     * 
     * @return When a ruleset was created from a recommendation run, this run ID is generated to link the two together.
     */

    public String getRecommendationRunId() {
        return this.recommendationRunId;
    }

    /**
     * <p>
     * When a ruleset was created from a recommendation run, this run ID is generated to link the two together.
     * </p>
     * 
     * @param recommendationRunId
     *        When a ruleset was created from a recommendation run, this run ID is generated to link the two together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityRulesetResult withRecommendationRunId(String recommendationRunId) {
        setRecommendationRunId(recommendationRunId);
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
        if (getRuleset() != null)
            sb.append("Ruleset: ").append(getRuleset()).append(",");
        if (getTargetTable() != null)
            sb.append("TargetTable: ").append(getTargetTable()).append(",");
        if (getCreatedOn() != null)
            sb.append("CreatedOn: ").append(getCreatedOn()).append(",");
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getRecommendationRunId() != null)
            sb.append("RecommendationRunId: ").append(getRecommendationRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataQualityRulesetResult == false)
            return false;
        GetDataQualityRulesetResult other = (GetDataQualityRulesetResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRuleset() == null ^ this.getRuleset() == null)
            return false;
        if (other.getRuleset() != null && other.getRuleset().equals(this.getRuleset()) == false)
            return false;
        if (other.getTargetTable() == null ^ this.getTargetTable() == null)
            return false;
        if (other.getTargetTable() != null && other.getTargetTable().equals(this.getTargetTable()) == false)
            return false;
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getRecommendationRunId() == null ^ this.getRecommendationRunId() == null)
            return false;
        if (other.getRecommendationRunId() != null && other.getRecommendationRunId().equals(this.getRecommendationRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRuleset() == null) ? 0 : getRuleset().hashCode());
        hashCode = prime * hashCode + ((getTargetTable() == null) ? 0 : getTargetTable().hashCode());
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getRecommendationRunId() == null) ? 0 : getRecommendationRunId().hashCode());
        return hashCode;
    }

    @Override
    public GetDataQualityRulesetResult clone() {
        try {
            return (GetDataQualityRulesetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
