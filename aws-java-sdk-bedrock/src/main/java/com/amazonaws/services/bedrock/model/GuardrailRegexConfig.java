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
 * The regular expression to configure for the guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailRegexConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailRegexConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the regular expression to configure for the guardrail.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the regular expression to configure for the guardrail.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The regular expression pattern to configure for the guardrail.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * The guardrail action to configure when matching regular expression is detected.
     * </p>
     */
    private String action;

    /**
     * <p>
     * The name of the regular expression to configure for the guardrail.
     * </p>
     * 
     * @param name
     *        The name of the regular expression to configure for the guardrail.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the regular expression to configure for the guardrail.
     * </p>
     * 
     * @return The name of the regular expression to configure for the guardrail.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the regular expression to configure for the guardrail.
     * </p>
     * 
     * @param name
     *        The name of the regular expression to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailRegexConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the regular expression to configure for the guardrail.
     * </p>
     * 
     * @param description
     *        The description of the regular expression to configure for the guardrail.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the regular expression to configure for the guardrail.
     * </p>
     * 
     * @return The description of the regular expression to configure for the guardrail.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the regular expression to configure for the guardrail.
     * </p>
     * 
     * @param description
     *        The description of the regular expression to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailRegexConfig withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The regular expression pattern to configure for the guardrail.
     * </p>
     * 
     * @param pattern
     *        The regular expression pattern to configure for the guardrail.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The regular expression pattern to configure for the guardrail.
     * </p>
     * 
     * @return The regular expression pattern to configure for the guardrail.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The regular expression pattern to configure for the guardrail.
     * </p>
     * 
     * @param pattern
     *        The regular expression pattern to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailRegexConfig withPattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * The guardrail action to configure when matching regular expression is detected.
     * </p>
     * 
     * @param action
     *        The guardrail action to configure when matching regular expression is detected.
     * @see GuardrailSensitiveInformationAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The guardrail action to configure when matching regular expression is detected.
     * </p>
     * 
     * @return The guardrail action to configure when matching regular expression is detected.
     * @see GuardrailSensitiveInformationAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The guardrail action to configure when matching regular expression is detected.
     * </p>
     * 
     * @param action
     *        The guardrail action to configure when matching regular expression is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailSensitiveInformationAction
     */

    public GuardrailRegexConfig withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The guardrail action to configure when matching regular expression is detected.
     * </p>
     * 
     * @param action
     *        The guardrail action to configure when matching regular expression is detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailSensitiveInformationAction
     */

    public GuardrailRegexConfig withAction(GuardrailSensitiveInformationAction action) {
        this.action = action.toString();
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
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailRegexConfig == false)
            return false;
        GuardrailRegexConfig other = (GuardrailRegexConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailRegexConfig clone() {
        try {
            return (GuardrailRegexConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailRegexConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
