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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object which defines the <code>resolutionType</code> and the <code>ruleBasedProperties</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ResolutionTechniques"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolutionTechniques implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The properties of the provider service.
     * </p>
     */
    private ProviderProperties providerProperties;
    /**
     * <p>
     * The type of matching. There are three types of matching: <code>RULE_MATCHING</code>, <code>ML_MATCHING</code>,
     * and <code>PROVIDER</code>.
     * </p>
     */
    private String resolutionType;
    /**
     * <p>
     * An object which defines the list of matching rules to run and has a field <code>Rules</code>, which is a list of
     * rule objects.
     * </p>
     */
    private RuleBasedProperties ruleBasedProperties;

    /**
     * <p>
     * The properties of the provider service.
     * </p>
     * 
     * @param providerProperties
     *        The properties of the provider service.
     */

    public void setProviderProperties(ProviderProperties providerProperties) {
        this.providerProperties = providerProperties;
    }

    /**
     * <p>
     * The properties of the provider service.
     * </p>
     * 
     * @return The properties of the provider service.
     */

    public ProviderProperties getProviderProperties() {
        return this.providerProperties;
    }

    /**
     * <p>
     * The properties of the provider service.
     * </p>
     * 
     * @param providerProperties
     *        The properties of the provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolutionTechniques withProviderProperties(ProviderProperties providerProperties) {
        setProviderProperties(providerProperties);
        return this;
    }

    /**
     * <p>
     * The type of matching. There are three types of matching: <code>RULE_MATCHING</code>, <code>ML_MATCHING</code>,
     * and <code>PROVIDER</code>.
     * </p>
     * 
     * @param resolutionType
     *        The type of matching. There are three types of matching: <code>RULE_MATCHING</code>,
     *        <code>ML_MATCHING</code>, and <code>PROVIDER</code>.
     * @see ResolutionType
     */

    public void setResolutionType(String resolutionType) {
        this.resolutionType = resolutionType;
    }

    /**
     * <p>
     * The type of matching. There are three types of matching: <code>RULE_MATCHING</code>, <code>ML_MATCHING</code>,
     * and <code>PROVIDER</code>.
     * </p>
     * 
     * @return The type of matching. There are three types of matching: <code>RULE_MATCHING</code>,
     *         <code>ML_MATCHING</code>, and <code>PROVIDER</code>.
     * @see ResolutionType
     */

    public String getResolutionType() {
        return this.resolutionType;
    }

    /**
     * <p>
     * The type of matching. There are three types of matching: <code>RULE_MATCHING</code>, <code>ML_MATCHING</code>,
     * and <code>PROVIDER</code>.
     * </p>
     * 
     * @param resolutionType
     *        The type of matching. There are three types of matching: <code>RULE_MATCHING</code>,
     *        <code>ML_MATCHING</code>, and <code>PROVIDER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolutionType
     */

    public ResolutionTechniques withResolutionType(String resolutionType) {
        setResolutionType(resolutionType);
        return this;
    }

    /**
     * <p>
     * The type of matching. There are three types of matching: <code>RULE_MATCHING</code>, <code>ML_MATCHING</code>,
     * and <code>PROVIDER</code>.
     * </p>
     * 
     * @param resolutionType
     *        The type of matching. There are three types of matching: <code>RULE_MATCHING</code>,
     *        <code>ML_MATCHING</code>, and <code>PROVIDER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolutionType
     */

    public ResolutionTechniques withResolutionType(ResolutionType resolutionType) {
        this.resolutionType = resolutionType.toString();
        return this;
    }

    /**
     * <p>
     * An object which defines the list of matching rules to run and has a field <code>Rules</code>, which is a list of
     * rule objects.
     * </p>
     * 
     * @param ruleBasedProperties
     *        An object which defines the list of matching rules to run and has a field <code>Rules</code>, which is a
     *        list of rule objects.
     */

    public void setRuleBasedProperties(RuleBasedProperties ruleBasedProperties) {
        this.ruleBasedProperties = ruleBasedProperties;
    }

    /**
     * <p>
     * An object which defines the list of matching rules to run and has a field <code>Rules</code>, which is a list of
     * rule objects.
     * </p>
     * 
     * @return An object which defines the list of matching rules to run and has a field <code>Rules</code>, which is a
     *         list of rule objects.
     */

    public RuleBasedProperties getRuleBasedProperties() {
        return this.ruleBasedProperties;
    }

    /**
     * <p>
     * An object which defines the list of matching rules to run and has a field <code>Rules</code>, which is a list of
     * rule objects.
     * </p>
     * 
     * @param ruleBasedProperties
     *        An object which defines the list of matching rules to run and has a field <code>Rules</code>, which is a
     *        list of rule objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolutionTechniques withRuleBasedProperties(RuleBasedProperties ruleBasedProperties) {
        setRuleBasedProperties(ruleBasedProperties);
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
        if (getProviderProperties() != null)
            sb.append("ProviderProperties: ").append(getProviderProperties()).append(",");
        if (getResolutionType() != null)
            sb.append("ResolutionType: ").append(getResolutionType()).append(",");
        if (getRuleBasedProperties() != null)
            sb.append("RuleBasedProperties: ").append(getRuleBasedProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolutionTechniques == false)
            return false;
        ResolutionTechniques other = (ResolutionTechniques) obj;
        if (other.getProviderProperties() == null ^ this.getProviderProperties() == null)
            return false;
        if (other.getProviderProperties() != null && other.getProviderProperties().equals(this.getProviderProperties()) == false)
            return false;
        if (other.getResolutionType() == null ^ this.getResolutionType() == null)
            return false;
        if (other.getResolutionType() != null && other.getResolutionType().equals(this.getResolutionType()) == false)
            return false;
        if (other.getRuleBasedProperties() == null ^ this.getRuleBasedProperties() == null)
            return false;
        if (other.getRuleBasedProperties() != null && other.getRuleBasedProperties().equals(this.getRuleBasedProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderProperties() == null) ? 0 : getProviderProperties().hashCode());
        hashCode = prime * hashCode + ((getResolutionType() == null) ? 0 : getResolutionType().hashCode());
        hashCode = prime * hashCode + ((getRuleBasedProperties() == null) ? 0 : getRuleBasedProperties().hashCode());
        return hashCode;
    }

    @Override
    public ResolutionTechniques clone() {
        try {
            return (ResolutionTechniques) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.ResolutionTechniquesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
