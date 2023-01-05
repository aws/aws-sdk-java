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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpdateDataQualityRuleset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataQualityRulesetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the data quality ruleset.
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
     * The name of the data quality ruleset.
     * </p>
     * 
     * @param name
     *        The name of the data quality ruleset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data quality ruleset.
     * </p>
     * 
     * @return The name of the data quality ruleset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data quality ruleset.
     * </p>
     * 
     * @param name
     *        The name of the data quality ruleset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataQualityRulesetResult withName(String name) {
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

    public UpdateDataQualityRulesetResult withDescription(String description) {
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

    public UpdateDataQualityRulesetResult withRuleset(String ruleset) {
        setRuleset(ruleset);
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
            sb.append("Ruleset: ").append(getRuleset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataQualityRulesetResult == false)
            return false;
        UpdateDataQualityRulesetResult other = (UpdateDataQualityRulesetResult) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRuleset() == null) ? 0 : getRuleset().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataQualityRulesetResult clone() {
        try {
            return (UpdateDataQualityRulesetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
