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
 * Contains details about the word policy to configured for the guardrail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailWordPolicyConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailWordPolicyConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of words to configure for the guardrail.
     * </p>
     */
    private java.util.List<GuardrailWordConfig> wordsConfig;
    /**
     * <p>
     * A list of managed words to configure for the guardrail.
     * </p>
     */
    private java.util.List<GuardrailManagedWordsConfig> managedWordListsConfig;

    /**
     * <p>
     * A list of words to configure for the guardrail.
     * </p>
     * 
     * @return A list of words to configure for the guardrail.
     */

    public java.util.List<GuardrailWordConfig> getWordsConfig() {
        return wordsConfig;
    }

    /**
     * <p>
     * A list of words to configure for the guardrail.
     * </p>
     * 
     * @param wordsConfig
     *        A list of words to configure for the guardrail.
     */

    public void setWordsConfig(java.util.Collection<GuardrailWordConfig> wordsConfig) {
        if (wordsConfig == null) {
            this.wordsConfig = null;
            return;
        }

        this.wordsConfig = new java.util.ArrayList<GuardrailWordConfig>(wordsConfig);
    }

    /**
     * <p>
     * A list of words to configure for the guardrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWordsConfig(java.util.Collection)} or {@link #withWordsConfig(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param wordsConfig
     *        A list of words to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicyConfig withWordsConfig(GuardrailWordConfig... wordsConfig) {
        if (this.wordsConfig == null) {
            setWordsConfig(new java.util.ArrayList<GuardrailWordConfig>(wordsConfig.length));
        }
        for (GuardrailWordConfig ele : wordsConfig) {
            this.wordsConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of words to configure for the guardrail.
     * </p>
     * 
     * @param wordsConfig
     *        A list of words to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicyConfig withWordsConfig(java.util.Collection<GuardrailWordConfig> wordsConfig) {
        setWordsConfig(wordsConfig);
        return this;
    }

    /**
     * <p>
     * A list of managed words to configure for the guardrail.
     * </p>
     * 
     * @return A list of managed words to configure for the guardrail.
     */

    public java.util.List<GuardrailManagedWordsConfig> getManagedWordListsConfig() {
        return managedWordListsConfig;
    }

    /**
     * <p>
     * A list of managed words to configure for the guardrail.
     * </p>
     * 
     * @param managedWordListsConfig
     *        A list of managed words to configure for the guardrail.
     */

    public void setManagedWordListsConfig(java.util.Collection<GuardrailManagedWordsConfig> managedWordListsConfig) {
        if (managedWordListsConfig == null) {
            this.managedWordListsConfig = null;
            return;
        }

        this.managedWordListsConfig = new java.util.ArrayList<GuardrailManagedWordsConfig>(managedWordListsConfig);
    }

    /**
     * <p>
     * A list of managed words to configure for the guardrail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedWordListsConfig(java.util.Collection)} or
     * {@link #withManagedWordListsConfig(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param managedWordListsConfig
     *        A list of managed words to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicyConfig withManagedWordListsConfig(GuardrailManagedWordsConfig... managedWordListsConfig) {
        if (this.managedWordListsConfig == null) {
            setManagedWordListsConfig(new java.util.ArrayList<GuardrailManagedWordsConfig>(managedWordListsConfig.length));
        }
        for (GuardrailManagedWordsConfig ele : managedWordListsConfig) {
            this.managedWordListsConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of managed words to configure for the guardrail.
     * </p>
     * 
     * @param managedWordListsConfig
     *        A list of managed words to configure for the guardrail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GuardrailWordPolicyConfig withManagedWordListsConfig(java.util.Collection<GuardrailManagedWordsConfig> managedWordListsConfig) {
        setManagedWordListsConfig(managedWordListsConfig);
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
        if (getWordsConfig() != null)
            sb.append("WordsConfig: ").append(getWordsConfig()).append(",");
        if (getManagedWordListsConfig() != null)
            sb.append("ManagedWordListsConfig: ").append(getManagedWordListsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailWordPolicyConfig == false)
            return false;
        GuardrailWordPolicyConfig other = (GuardrailWordPolicyConfig) obj;
        if (other.getWordsConfig() == null ^ this.getWordsConfig() == null)
            return false;
        if (other.getWordsConfig() != null && other.getWordsConfig().equals(this.getWordsConfig()) == false)
            return false;
        if (other.getManagedWordListsConfig() == null ^ this.getManagedWordListsConfig() == null)
            return false;
        if (other.getManagedWordListsConfig() != null && other.getManagedWordListsConfig().equals(this.getManagedWordListsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWordsConfig() == null) ? 0 : getWordsConfig().hashCode());
        hashCode = prime * hashCode + ((getManagedWordListsConfig() == null) ? 0 : getManagedWordListsConfig().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailWordPolicyConfig clone() {
        try {
            return (GuardrailWordPolicyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailWordPolicyConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
