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
 * Contains filter strengths for harmful content. Guardrails support the following content filters to detect and filter
 * harmful user inputs and FM-generated outputs.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Hate</b> – Describes language or a statement that discriminates, criticizes, insults, denounces, or dehumanizes a
 * person or group on the basis of an identity (such as race, ethnicity, gender, religion, sexual orientation, ability,
 * and national origin).
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Insults</b> – Describes language or a statement that includes demeaning, humiliating, mocking, insulting, or
 * belittling language. This type of language is also labeled as bullying.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Sexual</b> – Describes language or a statement that indicates sexual interest, activity, or arousal using direct
 * or indirect references to body parts, physical traits, or sex.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Violence</b> – Describes language or a statement that includes glorification of or threats to inflict physical
 * pain, hurt, or injury toward a person, group or thing.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Content filtering depends on the confidence classification of user inputs and FM responses across each of the four
 * harmful categories. All input and output statements are classified into one of four confidence levels (NONE, LOW,
 * MEDIUM, HIGH) for each harmful category. For example, if a statement is classified as <i>Hate</i> with HIGH
 * confidence, the likelihood of the statement representing hateful content is high. A single statement can be
 * classified across multiple categories with varying confidence levels. For example, a single statement can be
 * classified as <i>Hate</i> with HIGH confidence, <i>Insults</i> with LOW confidence, <i>Sexual</i> with NONE
 * confidence, and <i>Violence</i> with MEDIUM confidence.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/guardrails-filters.html">Guardrails content filters</a>.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_GetGuardrail.html#API_GetGuardrail_ResponseSyntax"
 * >GetGuardrail response body</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/GuardrailContentFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GuardrailContentFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The harmful category that the content filter is applied to.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The strength of the content filter to apply to prompts. As you increase the filter strength, the likelihood of
     * filtering harmful content increases and the probability of seeing harmful content in your application reduces.
     * </p>
     */
    private String inputStrength;
    /**
     * <p>
     * The strength of the content filter to apply to model responses. As you increase the filter strength, the
     * likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     * application reduces.
     * </p>
     */
    private String outputStrength;

    /**
     * <p>
     * The harmful category that the content filter is applied to.
     * </p>
     * 
     * @param type
     *        The harmful category that the content filter is applied to.
     * @see GuardrailContentFilterType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The harmful category that the content filter is applied to.
     * </p>
     * 
     * @return The harmful category that the content filter is applied to.
     * @see GuardrailContentFilterType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The harmful category that the content filter is applied to.
     * </p>
     * 
     * @param type
     *        The harmful category that the content filter is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContentFilterType
     */

    public GuardrailContentFilter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The harmful category that the content filter is applied to.
     * </p>
     * 
     * @param type
     *        The harmful category that the content filter is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailContentFilterType
     */

    public GuardrailContentFilter withType(GuardrailContentFilterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The strength of the content filter to apply to prompts. As you increase the filter strength, the likelihood of
     * filtering harmful content increases and the probability of seeing harmful content in your application reduces.
     * </p>
     * 
     * @param inputStrength
     *        The strength of the content filter to apply to prompts. As you increase the filter strength, the
     *        likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     *        application reduces.
     * @see GuardrailFilterStrength
     */

    public void setInputStrength(String inputStrength) {
        this.inputStrength = inputStrength;
    }

    /**
     * <p>
     * The strength of the content filter to apply to prompts. As you increase the filter strength, the likelihood of
     * filtering harmful content increases and the probability of seeing harmful content in your application reduces.
     * </p>
     * 
     * @return The strength of the content filter to apply to prompts. As you increase the filter strength, the
     *         likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     *         application reduces.
     * @see GuardrailFilterStrength
     */

    public String getInputStrength() {
        return this.inputStrength;
    }

    /**
     * <p>
     * The strength of the content filter to apply to prompts. As you increase the filter strength, the likelihood of
     * filtering harmful content increases and the probability of seeing harmful content in your application reduces.
     * </p>
     * 
     * @param inputStrength
     *        The strength of the content filter to apply to prompts. As you increase the filter strength, the
     *        likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     *        application reduces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailFilterStrength
     */

    public GuardrailContentFilter withInputStrength(String inputStrength) {
        setInputStrength(inputStrength);
        return this;
    }

    /**
     * <p>
     * The strength of the content filter to apply to prompts. As you increase the filter strength, the likelihood of
     * filtering harmful content increases and the probability of seeing harmful content in your application reduces.
     * </p>
     * 
     * @param inputStrength
     *        The strength of the content filter to apply to prompts. As you increase the filter strength, the
     *        likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     *        application reduces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailFilterStrength
     */

    public GuardrailContentFilter withInputStrength(GuardrailFilterStrength inputStrength) {
        this.inputStrength = inputStrength.toString();
        return this;
    }

    /**
     * <p>
     * The strength of the content filter to apply to model responses. As you increase the filter strength, the
     * likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     * application reduces.
     * </p>
     * 
     * @param outputStrength
     *        The strength of the content filter to apply to model responses. As you increase the filter strength, the
     *        likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     *        application reduces.
     * @see GuardrailFilterStrength
     */

    public void setOutputStrength(String outputStrength) {
        this.outputStrength = outputStrength;
    }

    /**
     * <p>
     * The strength of the content filter to apply to model responses. As you increase the filter strength, the
     * likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     * application reduces.
     * </p>
     * 
     * @return The strength of the content filter to apply to model responses. As you increase the filter strength, the
     *         likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     *         application reduces.
     * @see GuardrailFilterStrength
     */

    public String getOutputStrength() {
        return this.outputStrength;
    }

    /**
     * <p>
     * The strength of the content filter to apply to model responses. As you increase the filter strength, the
     * likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     * application reduces.
     * </p>
     * 
     * @param outputStrength
     *        The strength of the content filter to apply to model responses. As you increase the filter strength, the
     *        likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     *        application reduces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailFilterStrength
     */

    public GuardrailContentFilter withOutputStrength(String outputStrength) {
        setOutputStrength(outputStrength);
        return this;
    }

    /**
     * <p>
     * The strength of the content filter to apply to model responses. As you increase the filter strength, the
     * likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     * application reduces.
     * </p>
     * 
     * @param outputStrength
     *        The strength of the content filter to apply to model responses. As you increase the filter strength, the
     *        likelihood of filtering harmful content increases and the probability of seeing harmful content in your
     *        application reduces.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuardrailFilterStrength
     */

    public GuardrailContentFilter withOutputStrength(GuardrailFilterStrength outputStrength) {
        this.outputStrength = outputStrength.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getInputStrength() != null)
            sb.append("InputStrength: ").append(getInputStrength()).append(",");
        if (getOutputStrength() != null)
            sb.append("OutputStrength: ").append(getOutputStrength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GuardrailContentFilter == false)
            return false;
        GuardrailContentFilter other = (GuardrailContentFilter) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getInputStrength() == null ^ this.getInputStrength() == null)
            return false;
        if (other.getInputStrength() != null && other.getInputStrength().equals(this.getInputStrength()) == false)
            return false;
        if (other.getOutputStrength() == null ^ this.getOutputStrength() == null)
            return false;
        if (other.getOutputStrength() != null && other.getOutputStrength().equals(this.getOutputStrength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getInputStrength() == null) ? 0 : getInputStrength().hashCode());
        hashCode = prime * hashCode + ((getOutputStrength() == null) ? 0 : getOutputStrength().hashCode());
        return hashCode;
    }

    @Override
    public GuardrailContentFilter clone() {
        try {
            return (GuardrailContentFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.GuardrailContentFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
