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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateDataQualityRuleset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataQualityRulesetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name for the data quality ruleset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the data quality ruleset.
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
     * A list of tags applied to the data quality ruleset.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A target table associated with the data quality ruleset.
     * </p>
     */
    private DataQualityTargetTable targetTable;
    /**
     * <p>
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting
     * multiple instances of the same resource.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * A unique name for the data quality ruleset.
     * </p>
     * 
     * @param name
     *        A unique name for the data quality ruleset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the data quality ruleset.
     * </p>
     * 
     * @return A unique name for the data quality ruleset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name for the data quality ruleset.
     * </p>
     * 
     * @param name
     *        A unique name for the data quality ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityRulesetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the data quality ruleset.
     * </p>
     * 
     * @param description
     *        A description of the data quality ruleset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the data quality ruleset.
     * </p>
     * 
     * @return A description of the data quality ruleset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the data quality ruleset.
     * </p>
     * 
     * @param description
     *        A description of the data quality ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityRulesetRequest withDescription(String description) {
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

    public CreateDataQualityRulesetRequest withRuleset(String ruleset) {
        setRuleset(ruleset);
        return this;
    }

    /**
     * <p>
     * A list of tags applied to the data quality ruleset.
     * </p>
     * 
     * @return A list of tags applied to the data quality ruleset.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags applied to the data quality ruleset.
     * </p>
     * 
     * @param tags
     *        A list of tags applied to the data quality ruleset.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags applied to the data quality ruleset.
     * </p>
     * 
     * @param tags
     *        A list of tags applied to the data quality ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityRulesetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDataQualityRulesetRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityRulesetRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityRulesetRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A target table associated with the data quality ruleset.
     * </p>
     * 
     * @param targetTable
     *        A target table associated with the data quality ruleset.
     */

    public void setTargetTable(DataQualityTargetTable targetTable) {
        this.targetTable = targetTable;
    }

    /**
     * <p>
     * A target table associated with the data quality ruleset.
     * </p>
     * 
     * @return A target table associated with the data quality ruleset.
     */

    public DataQualityTargetTable getTargetTable() {
        return this.targetTable;
    }

    /**
     * <p>
     * A target table associated with the data quality ruleset.
     * </p>
     * 
     * @param targetTable
     *        A target table associated with the data quality ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityRulesetRequest withTargetTable(DataQualityTargetTable targetTable) {
        setTargetTable(targetTable);
        return this;
    }

    /**
     * <p>
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting
     * multiple instances of the same resource.
     * </p>
     * 
     * @param clientToken
     *        Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or
     *        starting multiple instances of the same resource.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting
     * multiple instances of the same resource.
     * </p>
     * 
     * @return Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or
     *         starting multiple instances of the same resource.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or starting
     * multiple instances of the same resource.
     * </p>
     * 
     * @param clientToken
     *        Used for idempotency and is recommended to be set to a random ID (such as a UUID) to avoid creating or
     *        starting multiple instances of the same resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataQualityRulesetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargetTable() != null)
            sb.append("TargetTable: ").append(getTargetTable()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataQualityRulesetRequest == false)
            return false;
        CreateDataQualityRulesetRequest other = (CreateDataQualityRulesetRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargetTable() == null ^ this.getTargetTable() == null)
            return false;
        if (other.getTargetTable() != null && other.getTargetTable().equals(this.getTargetTable()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargetTable() == null) ? 0 : getTargetTable().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataQualityRulesetRequest clone() {
        return (CreateDataQualityRulesetRequest) super.clone();
    }

}
