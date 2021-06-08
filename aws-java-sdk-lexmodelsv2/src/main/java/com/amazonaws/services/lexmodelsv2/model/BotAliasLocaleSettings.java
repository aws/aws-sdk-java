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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies settings that are unique to a locale. For example, you can use different Lambda function depending on the
 * bot's locale.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotAliasLocaleSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotAliasLocaleSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether the locale is enabled for the bot. If the value is <code>false</code>, the locale isn't
     * available for use.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specifies the Lambda function that should be used in the locale.
     * </p>
     */
    private CodeHookSpecification codeHookSpecification;

    /**
     * <p>
     * Determines whether the locale is enabled for the bot. If the value is <code>false</code>, the locale isn't
     * available for use.
     * </p>
     * 
     * @param enabled
     *        Determines whether the locale is enabled for the bot. If the value is <code>false</code>, the locale isn't
     *        available for use.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Determines whether the locale is enabled for the bot. If the value is <code>false</code>, the locale isn't
     * available for use.
     * </p>
     * 
     * @return Determines whether the locale is enabled for the bot. If the value is <code>false</code>, the locale
     *         isn't available for use.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Determines whether the locale is enabled for the bot. If the value is <code>false</code>, the locale isn't
     * available for use.
     * </p>
     * 
     * @param enabled
     *        Determines whether the locale is enabled for the bot. If the value is <code>false</code>, the locale isn't
     *        available for use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasLocaleSettings withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Determines whether the locale is enabled for the bot. If the value is <code>false</code>, the locale isn't
     * available for use.
     * </p>
     * 
     * @return Determines whether the locale is enabled for the bot. If the value is <code>false</code>, the locale
     *         isn't available for use.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies the Lambda function that should be used in the locale.
     * </p>
     * 
     * @param codeHookSpecification
     *        Specifies the Lambda function that should be used in the locale.
     */

    public void setCodeHookSpecification(CodeHookSpecification codeHookSpecification) {
        this.codeHookSpecification = codeHookSpecification;
    }

    /**
     * <p>
     * Specifies the Lambda function that should be used in the locale.
     * </p>
     * 
     * @return Specifies the Lambda function that should be used in the locale.
     */

    public CodeHookSpecification getCodeHookSpecification() {
        return this.codeHookSpecification;
    }

    /**
     * <p>
     * Specifies the Lambda function that should be used in the locale.
     * </p>
     * 
     * @param codeHookSpecification
     *        Specifies the Lambda function that should be used in the locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotAliasLocaleSettings withCodeHookSpecification(CodeHookSpecification codeHookSpecification) {
        setCodeHookSpecification(codeHookSpecification);
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
        if (getCodeHookSpecification() != null)
            sb.append("CodeHookSpecification: ").append(getCodeHookSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotAliasLocaleSettings == false)
            return false;
        BotAliasLocaleSettings other = (BotAliasLocaleSettings) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getCodeHookSpecification() == null ^ this.getCodeHookSpecification() == null)
            return false;
        if (other.getCodeHookSpecification() != null && other.getCodeHookSpecification().equals(this.getCodeHookSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getCodeHookSpecification() == null) ? 0 : getCodeHookSpecification().hashCode());
        return hashCode;
    }

    @Override
    public BotAliasLocaleSettings clone() {
        try {
            return (BotAliasLocaleSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotAliasLocaleSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
