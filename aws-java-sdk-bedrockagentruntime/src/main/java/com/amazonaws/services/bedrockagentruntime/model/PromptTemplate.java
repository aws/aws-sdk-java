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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the template for the prompt that's sent to the model for response generation. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html#kb-test-config-sysprompt">Knowledge
 * base prompt templates</a>.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_RequestSyntax"
 * >RetrieveAndGenerate request</a> – in the <code>filter</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/PromptTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PromptTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The template for the prompt that's sent to the model for response generation. You can include prompt
     * placeholders, which become replaced before the prompt is sent to the model to provide instructions and context to
     * the model. In addition, you can include XML tags to delineate meaningful sections of the prompt template.
     * </p>
     * <p>
     * For more information, see the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html#kb-test-config-sysprompt">
     * Knowledge base prompt templates</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.anthropic.com/claude/docs/use-xml-tags">Use XML tags with Anthropic Claude models</a>
     * </p>
     * </li>
     * </ul>
     */
    private String textPromptTemplate;

    /**
     * <p>
     * The template for the prompt that's sent to the model for response generation. You can include prompt
     * placeholders, which become replaced before the prompt is sent to the model to provide instructions and context to
     * the model. In addition, you can include XML tags to delineate meaningful sections of the prompt template.
     * </p>
     * <p>
     * For more information, see the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html#kb-test-config-sysprompt">
     * Knowledge base prompt templates</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.anthropic.com/claude/docs/use-xml-tags">Use XML tags with Anthropic Claude models</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param textPromptTemplate
     *        The template for the prompt that's sent to the model for response generation. You can include prompt
     *        placeholders, which become replaced before the prompt is sent to the model to provide instructions and
     *        context to the model. In addition, you can include XML tags to delineate meaningful sections of the prompt
     *        template.</p>
     *        <p>
     *        For more information, see the following resources:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html#kb-test-config-sysprompt"
     *        >Knowledge base prompt templates</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.anthropic.com/claude/docs/use-xml-tags">Use XML tags with Anthropic Claude
     *        models</a>
     *        </p>
     *        </li>
     */

    public void setTextPromptTemplate(String textPromptTemplate) {
        this.textPromptTemplate = textPromptTemplate;
    }

    /**
     * <p>
     * The template for the prompt that's sent to the model for response generation. You can include prompt
     * placeholders, which become replaced before the prompt is sent to the model to provide instructions and context to
     * the model. In addition, you can include XML tags to delineate meaningful sections of the prompt template.
     * </p>
     * <p>
     * For more information, see the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html#kb-test-config-sysprompt">
     * Knowledge base prompt templates</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.anthropic.com/claude/docs/use-xml-tags">Use XML tags with Anthropic Claude models</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The template for the prompt that's sent to the model for response generation. You can include prompt
     *         placeholders, which become replaced before the prompt is sent to the model to provide instructions and
     *         context to the model. In addition, you can include XML tags to delineate meaningful sections of the
     *         prompt template.</p>
     *         <p>
     *         For more information, see the following resources:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html#kb-test-config-sysprompt"
     *         >Knowledge base prompt templates</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.anthropic.com/claude/docs/use-xml-tags">Use XML tags with Anthropic Claude
     *         models</a>
     *         </p>
     *         </li>
     */

    public String getTextPromptTemplate() {
        return this.textPromptTemplate;
    }

    /**
     * <p>
     * The template for the prompt that's sent to the model for response generation. You can include prompt
     * placeholders, which become replaced before the prompt is sent to the model to provide instructions and context to
     * the model. In addition, you can include XML tags to delineate meaningful sections of the prompt template.
     * </p>
     * <p>
     * For more information, see the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html#kb-test-config-sysprompt">
     * Knowledge base prompt templates</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.anthropic.com/claude/docs/use-xml-tags">Use XML tags with Anthropic Claude models</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param textPromptTemplate
     *        The template for the prompt that's sent to the model for response generation. You can include prompt
     *        placeholders, which become replaced before the prompt is sent to the model to provide instructions and
     *        context to the model. In addition, you can include XML tags to delineate meaningful sections of the prompt
     *        template.</p>
     *        <p>
     *        For more information, see the following resources:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/bedrock/latest/userguide/kb-test-config.html#kb-test-config-sysprompt"
     *        >Knowledge base prompt templates</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.anthropic.com/claude/docs/use-xml-tags">Use XML tags with Anthropic Claude
     *        models</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PromptTemplate withTextPromptTemplate(String textPromptTemplate) {
        setTextPromptTemplate(textPromptTemplate);
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
        if (getTextPromptTemplate() != null)
            sb.append("TextPromptTemplate: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PromptTemplate == false)
            return false;
        PromptTemplate other = (PromptTemplate) obj;
        if (other.getTextPromptTemplate() == null ^ this.getTextPromptTemplate() == null)
            return false;
        if (other.getTextPromptTemplate() != null && other.getTextPromptTemplate().equals(this.getTextPromptTemplate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextPromptTemplate() == null) ? 0 : getTextPromptTemplate().hashCode());
        return hashCode;
    }

    @Override
    public PromptTemplate clone() {
        try {
            return (PromptTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.PromptTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
