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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/DeleteConfiguredTableAnalysisRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteConfiguredTableAnalysisRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the configured table that the analysis rule applies to. Currently accepts the
     * configured table ID.
     * </p>
     */
    private String configuredTableIdentifier;
    /**
     * <p>
     * The analysis rule type to be deleted. Configured table analysis rules are uniquely identified by their configured
     * table identifier and analysis rule type.
     * </p>
     */
    private String analysisRuleType;

    /**
     * <p>
     * The unique identifier for the configured table that the analysis rule applies to. Currently accepts the
     * configured table ID.
     * </p>
     * 
     * @param configuredTableIdentifier
     *        The unique identifier for the configured table that the analysis rule applies to. Currently accepts the
     *        configured table ID.
     */

    public void setConfiguredTableIdentifier(String configuredTableIdentifier) {
        this.configuredTableIdentifier = configuredTableIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the configured table that the analysis rule applies to. Currently accepts the
     * configured table ID.
     * </p>
     * 
     * @return The unique identifier for the configured table that the analysis rule applies to. Currently accepts the
     *         configured table ID.
     */

    public String getConfiguredTableIdentifier() {
        return this.configuredTableIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the configured table that the analysis rule applies to. Currently accepts the
     * configured table ID.
     * </p>
     * 
     * @param configuredTableIdentifier
     *        The unique identifier for the configured table that the analysis rule applies to. Currently accepts the
     *        configured table ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteConfiguredTableAnalysisRuleRequest withConfiguredTableIdentifier(String configuredTableIdentifier) {
        setConfiguredTableIdentifier(configuredTableIdentifier);
        return this;
    }

    /**
     * <p>
     * The analysis rule type to be deleted. Configured table analysis rules are uniquely identified by their configured
     * table identifier and analysis rule type.
     * </p>
     * 
     * @param analysisRuleType
     *        The analysis rule type to be deleted. Configured table analysis rules are uniquely identified by their
     *        configured table identifier and analysis rule type.
     * @see ConfiguredTableAnalysisRuleType
     */

    public void setAnalysisRuleType(String analysisRuleType) {
        this.analysisRuleType = analysisRuleType;
    }

    /**
     * <p>
     * The analysis rule type to be deleted. Configured table analysis rules are uniquely identified by their configured
     * table identifier and analysis rule type.
     * </p>
     * 
     * @return The analysis rule type to be deleted. Configured table analysis rules are uniquely identified by their
     *         configured table identifier and analysis rule type.
     * @see ConfiguredTableAnalysisRuleType
     */

    public String getAnalysisRuleType() {
        return this.analysisRuleType;
    }

    /**
     * <p>
     * The analysis rule type to be deleted. Configured table analysis rules are uniquely identified by their configured
     * table identifier and analysis rule type.
     * </p>
     * 
     * @param analysisRuleType
     *        The analysis rule type to be deleted. Configured table analysis rules are uniquely identified by their
     *        configured table identifier and analysis rule type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAnalysisRuleType
     */

    public DeleteConfiguredTableAnalysisRuleRequest withAnalysisRuleType(String analysisRuleType) {
        setAnalysisRuleType(analysisRuleType);
        return this;
    }

    /**
     * <p>
     * The analysis rule type to be deleted. Configured table analysis rules are uniquely identified by their configured
     * table identifier and analysis rule type.
     * </p>
     * 
     * @param analysisRuleType
     *        The analysis rule type to be deleted. Configured table analysis rules are uniquely identified by their
     *        configured table identifier and analysis rule type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfiguredTableAnalysisRuleType
     */

    public DeleteConfiguredTableAnalysisRuleRequest withAnalysisRuleType(ConfiguredTableAnalysisRuleType analysisRuleType) {
        this.analysisRuleType = analysisRuleType.toString();
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
        if (getConfiguredTableIdentifier() != null)
            sb.append("ConfiguredTableIdentifier: ").append(getConfiguredTableIdentifier()).append(",");
        if (getAnalysisRuleType() != null)
            sb.append("AnalysisRuleType: ").append(getAnalysisRuleType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteConfiguredTableAnalysisRuleRequest == false)
            return false;
        DeleteConfiguredTableAnalysisRuleRequest other = (DeleteConfiguredTableAnalysisRuleRequest) obj;
        if (other.getConfiguredTableIdentifier() == null ^ this.getConfiguredTableIdentifier() == null)
            return false;
        if (other.getConfiguredTableIdentifier() != null && other.getConfiguredTableIdentifier().equals(this.getConfiguredTableIdentifier()) == false)
            return false;
        if (other.getAnalysisRuleType() == null ^ this.getAnalysisRuleType() == null)
            return false;
        if (other.getAnalysisRuleType() != null && other.getAnalysisRuleType().equals(this.getAnalysisRuleType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguredTableIdentifier() == null) ? 0 : getConfiguredTableIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAnalysisRuleType() == null) ? 0 : getAnalysisRuleType().hashCode());
        return hashCode;
    }

    @Override
    public DeleteConfiguredTableAnalysisRuleRequest clone() {
        return (DeleteConfiguredTableAnalysisRuleRequest) super.clone();
    }

}
