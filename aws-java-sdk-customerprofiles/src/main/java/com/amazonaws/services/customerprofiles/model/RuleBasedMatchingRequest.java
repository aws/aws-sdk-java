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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The request to enable the rule-based matching.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/RuleBasedMatchingRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleBasedMatchingRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The flag that enables the rule-based matching process of duplicate profiles.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Configures how the rule-based matching process should match profiles. You can have up to 15
     * <code>MatchingRule</code> in the <code>MatchingRules</code>.
     * </p>
     */
    private java.util.List<MatchingRule> matchingRules;
    /**
     * <p>
     * <a href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_MatchingRule.html">MatchingRule</a>
     * </p>
     */
    private Integer maxAllowedRuleLevelForMerging;
    /**
     * <p>
     * Indicates the maximum allowed rule level.
     * </p>
     */
    private Integer maxAllowedRuleLevelForMatching;
    /**
     * <p>
     * Configures information about the <code>AttributeTypesSelector</code> where the rule-based identity resolution
     * uses to match profiles.
     * </p>
     */
    private AttributeTypesSelector attributeTypesSelector;

    private ConflictResolution conflictResolution;

    private ExportingConfig exportingConfig;

    /**
     * <p>
     * The flag that enables the rule-based matching process of duplicate profiles.
     * </p>
     * 
     * @param enabled
     *        The flag that enables the rule-based matching process of duplicate profiles.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * The flag that enables the rule-based matching process of duplicate profiles.
     * </p>
     * 
     * @return The flag that enables the rule-based matching process of duplicate profiles.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The flag that enables the rule-based matching process of duplicate profiles.
     * </p>
     * 
     * @param enabled
     *        The flag that enables the rule-based matching process of duplicate profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleBasedMatchingRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * The flag that enables the rule-based matching process of duplicate profiles.
     * </p>
     * 
     * @return The flag that enables the rule-based matching process of duplicate profiles.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Configures how the rule-based matching process should match profiles. You can have up to 15
     * <code>MatchingRule</code> in the <code>MatchingRules</code>.
     * </p>
     * 
     * @return Configures how the rule-based matching process should match profiles. You can have up to 15
     *         <code>MatchingRule</code> in the <code>MatchingRules</code>.
     */

    public java.util.List<MatchingRule> getMatchingRules() {
        return matchingRules;
    }

    /**
     * <p>
     * Configures how the rule-based matching process should match profiles. You can have up to 15
     * <code>MatchingRule</code> in the <code>MatchingRules</code>.
     * </p>
     * 
     * @param matchingRules
     *        Configures how the rule-based matching process should match profiles. You can have up to 15
     *        <code>MatchingRule</code> in the <code>MatchingRules</code>.
     */

    public void setMatchingRules(java.util.Collection<MatchingRule> matchingRules) {
        if (matchingRules == null) {
            this.matchingRules = null;
            return;
        }

        this.matchingRules = new java.util.ArrayList<MatchingRule>(matchingRules);
    }

    /**
     * <p>
     * Configures how the rule-based matching process should match profiles. You can have up to 15
     * <code>MatchingRule</code> in the <code>MatchingRules</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchingRules(java.util.Collection)} or {@link #withMatchingRules(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param matchingRules
     *        Configures how the rule-based matching process should match profiles. You can have up to 15
     *        <code>MatchingRule</code> in the <code>MatchingRules</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleBasedMatchingRequest withMatchingRules(MatchingRule... matchingRules) {
        if (this.matchingRules == null) {
            setMatchingRules(new java.util.ArrayList<MatchingRule>(matchingRules.length));
        }
        for (MatchingRule ele : matchingRules) {
            this.matchingRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configures how the rule-based matching process should match profiles. You can have up to 15
     * <code>MatchingRule</code> in the <code>MatchingRules</code>.
     * </p>
     * 
     * @param matchingRules
     *        Configures how the rule-based matching process should match profiles. You can have up to 15
     *        <code>MatchingRule</code> in the <code>MatchingRules</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleBasedMatchingRequest withMatchingRules(java.util.Collection<MatchingRule> matchingRules) {
        setMatchingRules(matchingRules);
        return this;
    }

    /**
     * <p>
     * <a href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_MatchingRule.html">MatchingRule</a>
     * </p>
     * 
     * @param maxAllowedRuleLevelForMerging
     *        <a href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_MatchingRule.html">
     *        MatchingRule</a>
     */

    public void setMaxAllowedRuleLevelForMerging(Integer maxAllowedRuleLevelForMerging) {
        this.maxAllowedRuleLevelForMerging = maxAllowedRuleLevelForMerging;
    }

    /**
     * <p>
     * <a href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_MatchingRule.html">MatchingRule</a>
     * </p>
     * 
     * @return <a
     *         href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_MatchingRule.html">MatchingRule
     *         </a>
     */

    public Integer getMaxAllowedRuleLevelForMerging() {
        return this.maxAllowedRuleLevelForMerging;
    }

    /**
     * <p>
     * <a href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_MatchingRule.html">MatchingRule</a>
     * </p>
     * 
     * @param maxAllowedRuleLevelForMerging
     *        <a href="https://docs.aws.amazon.com/customerprofiles/latest/APIReference/API_MatchingRule.html">
     *        MatchingRule</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleBasedMatchingRequest withMaxAllowedRuleLevelForMerging(Integer maxAllowedRuleLevelForMerging) {
        setMaxAllowedRuleLevelForMerging(maxAllowedRuleLevelForMerging);
        return this;
    }

    /**
     * <p>
     * Indicates the maximum allowed rule level.
     * </p>
     * 
     * @param maxAllowedRuleLevelForMatching
     *        Indicates the maximum allowed rule level.
     */

    public void setMaxAllowedRuleLevelForMatching(Integer maxAllowedRuleLevelForMatching) {
        this.maxAllowedRuleLevelForMatching = maxAllowedRuleLevelForMatching;
    }

    /**
     * <p>
     * Indicates the maximum allowed rule level.
     * </p>
     * 
     * @return Indicates the maximum allowed rule level.
     */

    public Integer getMaxAllowedRuleLevelForMatching() {
        return this.maxAllowedRuleLevelForMatching;
    }

    /**
     * <p>
     * Indicates the maximum allowed rule level.
     * </p>
     * 
     * @param maxAllowedRuleLevelForMatching
     *        Indicates the maximum allowed rule level.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleBasedMatchingRequest withMaxAllowedRuleLevelForMatching(Integer maxAllowedRuleLevelForMatching) {
        setMaxAllowedRuleLevelForMatching(maxAllowedRuleLevelForMatching);
        return this;
    }

    /**
     * <p>
     * Configures information about the <code>AttributeTypesSelector</code> where the rule-based identity resolution
     * uses to match profiles.
     * </p>
     * 
     * @param attributeTypesSelector
     *        Configures information about the <code>AttributeTypesSelector</code> where the rule-based identity
     *        resolution uses to match profiles.
     */

    public void setAttributeTypesSelector(AttributeTypesSelector attributeTypesSelector) {
        this.attributeTypesSelector = attributeTypesSelector;
    }

    /**
     * <p>
     * Configures information about the <code>AttributeTypesSelector</code> where the rule-based identity resolution
     * uses to match profiles.
     * </p>
     * 
     * @return Configures information about the <code>AttributeTypesSelector</code> where the rule-based identity
     *         resolution uses to match profiles.
     */

    public AttributeTypesSelector getAttributeTypesSelector() {
        return this.attributeTypesSelector;
    }

    /**
     * <p>
     * Configures information about the <code>AttributeTypesSelector</code> where the rule-based identity resolution
     * uses to match profiles.
     * </p>
     * 
     * @param attributeTypesSelector
     *        Configures information about the <code>AttributeTypesSelector</code> where the rule-based identity
     *        resolution uses to match profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleBasedMatchingRequest withAttributeTypesSelector(AttributeTypesSelector attributeTypesSelector) {
        setAttributeTypesSelector(attributeTypesSelector);
        return this;
    }

    /**
     * @param conflictResolution
     */

    public void setConflictResolution(ConflictResolution conflictResolution) {
        this.conflictResolution = conflictResolution;
    }

    /**
     * @return
     */

    public ConflictResolution getConflictResolution() {
        return this.conflictResolution;
    }

    /**
     * @param conflictResolution
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleBasedMatchingRequest withConflictResolution(ConflictResolution conflictResolution) {
        setConflictResolution(conflictResolution);
        return this;
    }

    /**
     * @param exportingConfig
     */

    public void setExportingConfig(ExportingConfig exportingConfig) {
        this.exportingConfig = exportingConfig;
    }

    /**
     * @return
     */

    public ExportingConfig getExportingConfig() {
        return this.exportingConfig;
    }

    /**
     * @param exportingConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleBasedMatchingRequest withExportingConfig(ExportingConfig exportingConfig) {
        setExportingConfig(exportingConfig);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getMatchingRules() != null)
            sb.append("MatchingRules: ").append(getMatchingRules()).append(",");
        if (getMaxAllowedRuleLevelForMerging() != null)
            sb.append("MaxAllowedRuleLevelForMerging: ").append(getMaxAllowedRuleLevelForMerging()).append(",");
        if (getMaxAllowedRuleLevelForMatching() != null)
            sb.append("MaxAllowedRuleLevelForMatching: ").append(getMaxAllowedRuleLevelForMatching()).append(",");
        if (getAttributeTypesSelector() != null)
            sb.append("AttributeTypesSelector: ").append(getAttributeTypesSelector()).append(",");
        if (getConflictResolution() != null)
            sb.append("ConflictResolution: ").append(getConflictResolution()).append(",");
        if (getExportingConfig() != null)
            sb.append("ExportingConfig: ").append(getExportingConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleBasedMatchingRequest == false)
            return false;
        RuleBasedMatchingRequest other = (RuleBasedMatchingRequest) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getMatchingRules() == null ^ this.getMatchingRules() == null)
            return false;
        if (other.getMatchingRules() != null && other.getMatchingRules().equals(this.getMatchingRules()) == false)
            return false;
        if (other.getMaxAllowedRuleLevelForMerging() == null ^ this.getMaxAllowedRuleLevelForMerging() == null)
            return false;
        if (other.getMaxAllowedRuleLevelForMerging() != null
                && other.getMaxAllowedRuleLevelForMerging().equals(this.getMaxAllowedRuleLevelForMerging()) == false)
            return false;
        if (other.getMaxAllowedRuleLevelForMatching() == null ^ this.getMaxAllowedRuleLevelForMatching() == null)
            return false;
        if (other.getMaxAllowedRuleLevelForMatching() != null
                && other.getMaxAllowedRuleLevelForMatching().equals(this.getMaxAllowedRuleLevelForMatching()) == false)
            return false;
        if (other.getAttributeTypesSelector() == null ^ this.getAttributeTypesSelector() == null)
            return false;
        if (other.getAttributeTypesSelector() != null && other.getAttributeTypesSelector().equals(this.getAttributeTypesSelector()) == false)
            return false;
        if (other.getConflictResolution() == null ^ this.getConflictResolution() == null)
            return false;
        if (other.getConflictResolution() != null && other.getConflictResolution().equals(this.getConflictResolution()) == false)
            return false;
        if (other.getExportingConfig() == null ^ this.getExportingConfig() == null)
            return false;
        if (other.getExportingConfig() != null && other.getExportingConfig().equals(this.getExportingConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getMatchingRules() == null) ? 0 : getMatchingRules().hashCode());
        hashCode = prime * hashCode + ((getMaxAllowedRuleLevelForMerging() == null) ? 0 : getMaxAllowedRuleLevelForMerging().hashCode());
        hashCode = prime * hashCode + ((getMaxAllowedRuleLevelForMatching() == null) ? 0 : getMaxAllowedRuleLevelForMatching().hashCode());
        hashCode = prime * hashCode + ((getAttributeTypesSelector() == null) ? 0 : getAttributeTypesSelector().hashCode());
        hashCode = prime * hashCode + ((getConflictResolution() == null) ? 0 : getConflictResolution().hashCode());
        hashCode = prime * hashCode + ((getExportingConfig() == null) ? 0 : getExportingConfig().hashCode());
        return hashCode;
    }

    @Override
    public RuleBasedMatchingRequest clone() {
        try {
            return (RuleBasedMatchingRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.RuleBasedMatchingRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
