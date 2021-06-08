/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the name and configuration information of a late data rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/LateDataRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LateDataRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the late data rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The information needed to configure the late data rule.
     * </p>
     */
    private LateDataRuleConfiguration ruleConfiguration;

    /**
     * <p>
     * The name of the late data rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the late data rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the late data rule.
     * </p>
     * 
     * @return The name of the late data rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the late data rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the late data rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LateDataRule withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The information needed to configure the late data rule.
     * </p>
     * 
     * @param ruleConfiguration
     *        The information needed to configure the late data rule.
     */

    public void setRuleConfiguration(LateDataRuleConfiguration ruleConfiguration) {
        this.ruleConfiguration = ruleConfiguration;
    }

    /**
     * <p>
     * The information needed to configure the late data rule.
     * </p>
     * 
     * @return The information needed to configure the late data rule.
     */

    public LateDataRuleConfiguration getRuleConfiguration() {
        return this.ruleConfiguration;
    }

    /**
     * <p>
     * The information needed to configure the late data rule.
     * </p>
     * 
     * @param ruleConfiguration
     *        The information needed to configure the late data rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LateDataRule withRuleConfiguration(LateDataRuleConfiguration ruleConfiguration) {
        setRuleConfiguration(ruleConfiguration);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getRuleConfiguration() != null)
            sb.append("RuleConfiguration: ").append(getRuleConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LateDataRule == false)
            return false;
        LateDataRule other = (LateDataRule) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getRuleConfiguration() == null ^ this.getRuleConfiguration() == null)
            return false;
        if (other.getRuleConfiguration() != null && other.getRuleConfiguration().equals(this.getRuleConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getRuleConfiguration() == null) ? 0 : getRuleConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public LateDataRule clone() {
        try {
            return (LateDataRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.LateDataRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
