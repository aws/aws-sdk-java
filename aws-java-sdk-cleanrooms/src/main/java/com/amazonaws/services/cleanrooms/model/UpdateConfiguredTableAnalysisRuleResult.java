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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTableAnalysisRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfiguredTableAnalysisRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The entire updated analysis rule.
     * </p>
     */
    private ConfiguredTableAnalysisRule analysisRule;

    /**
     * <p>
     * The entire updated analysis rule.
     * </p>
     * 
     * @param analysisRule
     *        The entire updated analysis rule.
     */

    public void setAnalysisRule(ConfiguredTableAnalysisRule analysisRule) {
        this.analysisRule = analysisRule;
    }

    /**
     * <p>
     * The entire updated analysis rule.
     * </p>
     * 
     * @return The entire updated analysis rule.
     */

    public ConfiguredTableAnalysisRule getAnalysisRule() {
        return this.analysisRule;
    }

    /**
     * <p>
     * The entire updated analysis rule.
     * </p>
     * 
     * @param analysisRule
     *        The entire updated analysis rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredTableAnalysisRuleResult withAnalysisRule(ConfiguredTableAnalysisRule analysisRule) {
        setAnalysisRule(analysisRule);
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
        if (getAnalysisRule() != null)
            sb.append("AnalysisRule: ").append(getAnalysisRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfiguredTableAnalysisRuleResult == false)
            return false;
        UpdateConfiguredTableAnalysisRuleResult other = (UpdateConfiguredTableAnalysisRuleResult) obj;
        if (other.getAnalysisRule() == null ^ this.getAnalysisRule() == null)
            return false;
        if (other.getAnalysisRule() != null && other.getAnalysisRule().equals(this.getAnalysisRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnalysisRule() == null) ? 0 : getAnalysisRule().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfiguredTableAnalysisRuleResult clone() {
        try {
            return (UpdateConfiguredTableAnalysisRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
