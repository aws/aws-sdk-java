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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about PII entities and regular expressions to configure for the guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailSensitiveInformationPolicyConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailSensitiveInformationPolicyConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of PII entities to configure to the guardrail.
     * </p>
     */
    private java.util.List<GuardrailPiiEntityConfig> piiEntitiesConfig;
    /**
     * <p>
     * A list of regular expressions to configure to the guardrail.
     * </p>
     */
    private java.util.List<GuardrailRegexConfig> regexesConfig;

    /**
     * <p>
     * A list of PII entities to configure to the guardrail.
     * </p>
     * 
     * @return A list of PII entities to configure to the guardrail.
     */

    public java.util.List<GuardrailPiiEntityConfig> getPiiEntitiesConfig() {
        return piiEntitiesConfig;
    }

    /**
     * <p>
     * A list of PII entities to configure to the guardrail.
     * </p>
     * 
     * @param piiEntitiesConfig
     *        A list of PII entities to configure to the guardrail.
     */

    public void setPiiEntitiesConfig(java.util.Collection<GuardrailPiiEntityConfig> piiEntitiesConfig) {
        if (piiEntitiesConfig == null) {
            this.piiEntitiesConfig = null;
            return;
        }

        this.piiEntitiesConfig = new java.util.ArrayList<GuardrailPiiEntityConfig>(piiEntitiesConfig);
    }

    /**
     * <p>
     * A list of PII entities to configure to the guardrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPiiEntitiesConfig(java.util.Collection)} or {@link #withPiiEntitiesConfig(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param piiEntitiesConfig
     *        A list of PII entities to configure to the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSensitiveInformationPolicyConfig withPiiEntitiesConfig(GuardrailPiiEntityConfig... piiEntitiesConfig) {
        if (this.piiEntitiesConfig == null) {
            setPiiEntitiesConfig(new java.util.ArrayList<GuardrailPiiEntityConfig>(piiEntitiesConfig.length));
        }
        for (GuardrailPiiEntityConfig ele : piiEntitiesConfig) {
            this.piiEntitiesConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of PII entities to configure to the guardrail.
     * </p>
     * 
     * @param piiEntitiesConfig
     *        A list of PII entities to configure to the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSensitiveInformationPolicyConfig withPiiEntitiesConfig(java.util.Collection<GuardrailPiiEntityConfig> piiEntitiesConfig) {
        setPiiEntitiesConfig(piiEntitiesConfig);
        return this;
    }

    /**
     * <p>
     * A list of regular expressions to configure to the guardrail.
     * </p>
     * 
     * @return A list of regular expressions to configure to the guardrail.
     */

    public java.util.List<GuardrailRegexConfig> getRegexesConfig() {
        return regexesConfig;
    }

    /**
     * <p>
     * A list of regular expressions to configure to the guardrail.
     * </p>
     * 
     * @param regexesConfig
     *        A list of regular expressions to configure to the guardrail.
     */

    public void setRegexesConfig(java.util.Collection<GuardrailRegexConfig> regexesConfig) {
        if (regexesConfig == null) {
            this.regexesConfig = null;
            return;
        }

        this.regexesConfig = new java.util.ArrayList<GuardrailRegexConfig>(regexesConfig);
    }

    /**
     * <p>
     * A list of regular expressions to configure to the guardrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegexesConfig(java.util.Collection)} or {@link #withRegexesConfig(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param regexesConfig
     *        A list of regular expressions to configure to the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSensitiveInformationPolicyConfig withRegexesConfig(GuardrailRegexConfig... regexesConfig) {
        if (this.regexesConfig == null) {
            setRegexesConfig(new java.util.ArrayList<GuardrailRegexConfig>(regexesConfig.length));
        }
        for (GuardrailRegexConfig ele : regexesConfig) {
            this.regexesConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of regular expressions to configure to the guardrail.
     * </p>
     * 
     * @param regexesConfig
     *        A list of regular expressions to configure to the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailSensitiveInformationPolicyConfig withRegexesConfig(java.util.Collection<GuardrailRegexConfig> regexesConfig) {
        setRegexesConfig(regexesConfig);
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
        if (getPiiEntitiesConfig() != null)
            sb.append("PiiEntitiesConfig: ").append(getPiiEntitiesConfig()).append(",");
        if (getRegexesConfig() != null)
            sb.append("RegexesConfig: ").append(getRegexesConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailSensitiveInformationPolicyConfig == false)
            return false;
        GuardrailSensitiveInformationPolicyConfig other = (GuardrailSensitiveInformationPolicyConfig) obj;
        if (other.getPiiEntitiesConfig() == null ^ this.getPiiEntitiesConfig() == null)
            return false;
        if (other.getPiiEntitiesConfig() != null && other.getPiiEntitiesConfig().equals(this.getPiiEntitiesConfig()) == false)
            return false;
        if (other.getRegexesConfig() == null ^ this.getRegexesConfig() == null)
            return false;
        if (other.getRegexesConfig() != null && other.getRegexesConfig().equals(this.getRegexesConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPiiEntitiesConfig() == null) ? 0 : getPiiEntitiesConfig().hashCode());
        hashCode = prime * hashCode + ((getRegexesConfig() == null) ? 0 : getRegexesConfig().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailSensitiveInformationPolicyConfig clone() {
        try {
            return (GuardrailSensitiveInformationPolicyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailSensitiveInformationPolicyConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
