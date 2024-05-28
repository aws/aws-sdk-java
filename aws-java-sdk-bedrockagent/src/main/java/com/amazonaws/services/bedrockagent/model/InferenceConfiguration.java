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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains inference parameters to use when the agent invokes a foundation model in the part of the agent sequence
 * defined by the <code>promptType</code>. For more information, see <a
 * href="https://docs.aws.amazon.com/bedrock/latest/userguide/model-parameters.html">Inference parameters for foundation
 * models</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/InferenceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of tokens to allow in the generated response.
     * </p>
     */
    private Integer maximumLength;
    /**
     * <p>
     * A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop generating
     * the response.
     * </p>
     */
    private java.util.List<String> stopSequences;
    /**
     * <p>
     * The likelihood of the model selecting higher-probability options while generating a response. A lower value makes
     * the model more likely to choose higher-probability options, while a higher value makes the model more likely to
     * choose lower-probability options.
     * </p>
     */
    private Float temperature;
    /**
     * <p>
     * While generating a response, the model determines the probability of the following token at each point of
     * generation. The value that you set for <code>topK</code> is the number of most-likely candidates from which the
     * model chooses the next token in the sequence. For example, if you set <code>topK</code> to 50, the model selects
     * the next token from among the top 50 most likely choices.
     * </p>
     */
    private Integer topK;
    /**
     * <p>
     * While generating a response, the model determines the probability of the following token at each point of
     * generation. The value that you set for <code>Top P</code> determines the number of most-likely candidates from
     * which the model chooses the next token in the sequence. For example, if you set <code>topP</code> to 80, the
     * model only selects the next token from the top 80% of the probability distribution of next tokens.
     * </p>
     */
    private Float topP;

    /**
     * <p>
     * The maximum number of tokens to allow in the generated response.
     * </p>
     * 
     * @param maximumLength
     *        The maximum number of tokens to allow in the generated response.
     */

    public void setMaximumLength(Integer maximumLength) {
        this.maximumLength = maximumLength;
    }

    /**
     * <p>
     * The maximum number of tokens to allow in the generated response.
     * </p>
     * 
     * @return The maximum number of tokens to allow in the generated response.
     */

    public Integer getMaximumLength() {
        return this.maximumLength;
    }

    /**
     * <p>
     * The maximum number of tokens to allow in the generated response.
     * </p>
     * 
     * @param maximumLength
     *        The maximum number of tokens to allow in the generated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withMaximumLength(Integer maximumLength) {
        setMaximumLength(maximumLength);
        return this;
    }

    /**
     * <p>
     * A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop generating
     * the response.
     * </p>
     * 
     * @return A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop
     *         generating the response.
     */

    public java.util.List<String> getStopSequences() {
        return stopSequences;
    }

    /**
     * <p>
     * A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop generating
     * the response.
     * </p>
     * 
     * @param stopSequences
     *        A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop
     *        generating the response.
     */

    public void setStopSequences(java.util.Collection<String> stopSequences) {
        if (stopSequences == null) {
            this.stopSequences = null;
            return;
        }

        this.stopSequences = new java.util.ArrayList<String>(stopSequences);
    }

    /**
     * <p>
     * A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop generating
     * the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStopSequences(java.util.Collection)} or {@link #withStopSequences(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stopSequences
     *        A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop
     *        generating the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withStopSequences(String... stopSequences) {
        if (this.stopSequences == null) {
            setStopSequences(new java.util.ArrayList<String>(stopSequences.length));
        }
        for (String ele : stopSequences) {
            this.stopSequences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop generating
     * the response.
     * </p>
     * 
     * @param stopSequences
     *        A list of stop sequences. A stop sequence is a sequence of characters that causes the model to stop
     *        generating the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withStopSequences(java.util.Collection<String> stopSequences) {
        setStopSequences(stopSequences);
        return this;
    }

    /**
     * <p>
     * The likelihood of the model selecting higher-probability options while generating a response. A lower value makes
     * the model more likely to choose higher-probability options, while a higher value makes the model more likely to
     * choose lower-probability options.
     * </p>
     * 
     * @param temperature
     *        The likelihood of the model selecting higher-probability options while generating a response. A lower
     *        value makes the model more likely to choose higher-probability options, while a higher value makes the
     *        model more likely to choose lower-probability options.
     */

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    /**
     * <p>
     * The likelihood of the model selecting higher-probability options while generating a response. A lower value makes
     * the model more likely to choose higher-probability options, while a higher value makes the model more likely to
     * choose lower-probability options.
     * </p>
     * 
     * @return The likelihood of the model selecting higher-probability options while generating a response. A lower
     *         value makes the model more likely to choose higher-probability options, while a higher value makes the
     *         model more likely to choose lower-probability options.
     */

    public Float getTemperature() {
        return this.temperature;
    }

    /**
     * <p>
     * The likelihood of the model selecting higher-probability options while generating a response. A lower value makes
     * the model more likely to choose higher-probability options, while a higher value makes the model more likely to
     * choose lower-probability options.
     * </p>
     * 
     * @param temperature
     *        The likelihood of the model selecting higher-probability options while generating a response. A lower
     *        value makes the model more likely to choose higher-probability options, while a higher value makes the
     *        model more likely to choose lower-probability options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withTemperature(Float temperature) {
        setTemperature(temperature);
        return this;
    }

    /**
     * <p>
     * While generating a response, the model determines the probability of the following token at each point of
     * generation. The value that you set for <code>topK</code> is the number of most-likely candidates from which the
     * model chooses the next token in the sequence. For example, if you set <code>topK</code> to 50, the model selects
     * the next token from among the top 50 most likely choices.
     * </p>
     * 
     * @param topK
     *        While generating a response, the model determines the probability of the following token at each point of
     *        generation. The value that you set for <code>topK</code> is the number of most-likely candidates from
     *        which the model chooses the next token in the sequence. For example, if you set <code>topK</code> to 50,
     *        the model selects the next token from among the top 50 most likely choices.
     */

    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    /**
     * <p>
     * While generating a response, the model determines the probability of the following token at each point of
     * generation. The value that you set for <code>topK</code> is the number of most-likely candidates from which the
     * model chooses the next token in the sequence. For example, if you set <code>topK</code> to 50, the model selects
     * the next token from among the top 50 most likely choices.
     * </p>
     * 
     * @return While generating a response, the model determines the probability of the following token at each point of
     *         generation. The value that you set for <code>topK</code> is the number of most-likely candidates from
     *         which the model chooses the next token in the sequence. For example, if you set <code>topK</code> to 50,
     *         the model selects the next token from among the top 50 most likely choices.
     */

    public Integer getTopK() {
        return this.topK;
    }

    /**
     * <p>
     * While generating a response, the model determines the probability of the following token at each point of
     * generation. The value that you set for <code>topK</code> is the number of most-likely candidates from which the
     * model chooses the next token in the sequence. For example, if you set <code>topK</code> to 50, the model selects
     * the next token from among the top 50 most likely choices.
     * </p>
     * 
     * @param topK
     *        While generating a response, the model determines the probability of the following token at each point of
     *        generation. The value that you set for <code>topK</code> is the number of most-likely candidates from
     *        which the model chooses the next token in the sequence. For example, if you set <code>topK</code> to 50,
     *        the model selects the next token from among the top 50 most likely choices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withTopK(Integer topK) {
        setTopK(topK);
        return this;
    }

    /**
     * <p>
     * While generating a response, the model determines the probability of the following token at each point of
     * generation. The value that you set for <code>Top P</code> determines the number of most-likely candidates from
     * which the model chooses the next token in the sequence. For example, if you set <code>topP</code> to 80, the
     * model only selects the next token from the top 80% of the probability distribution of next tokens.
     * </p>
     * 
     * @param topP
     *        While generating a response, the model determines the probability of the following token at each point of
     *        generation. The value that you set for <code>Top P</code> determines the number of most-likely candidates
     *        from which the model chooses the next token in the sequence. For example, if you set <code>topP</code> to
     *        80, the model only selects the next token from the top 80% of the probability distribution of next tokens.
     */

    public void setTopP(Float topP) {
        this.topP = topP;
    }

    /**
     * <p>
     * While generating a response, the model determines the probability of the following token at each point of
     * generation. The value that you set for <code>Top P</code> determines the number of most-likely candidates from
     * which the model chooses the next token in the sequence. For example, if you set <code>topP</code> to 80, the
     * model only selects the next token from the top 80% of the probability distribution of next tokens.
     * </p>
     * 
     * @return While generating a response, the model determines the probability of the following token at each point of
     *         generation. The value that you set for <code>Top P</code> determines the number of most-likely candidates
     *         from which the model chooses the next token in the sequence. For example, if you set <code>topP</code> to
     *         80, the model only selects the next token from the top 80% of the probability distribution of next
     *         tokens.
     */

    public Float getTopP() {
        return this.topP;
    }

    /**
     * <p>
     * While generating a response, the model determines the probability of the following token at each point of
     * generation. The value that you set for <code>Top P</code> determines the number of most-likely candidates from
     * which the model chooses the next token in the sequence. For example, if you set <code>topP</code> to 80, the
     * model only selects the next token from the top 80% of the probability distribution of next tokens.
     * </p>
     * 
     * @param topP
     *        While generating a response, the model determines the probability of the following token at each point of
     *        generation. The value that you set for <code>Top P</code> determines the number of most-likely candidates
     *        from which the model chooses the next token in the sequence. For example, if you set <code>topP</code> to
     *        80, the model only selects the next token from the top 80% of the probability distribution of next tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceConfiguration withTopP(Float topP) {
        setTopP(topP);
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
        if (getMaximumLength() != null)
            sb.append("MaximumLength: ").append(getMaximumLength()).append(",");
        if (getStopSequences() != null)
            sb.append("StopSequences: ").append(getStopSequences()).append(",");
        if (getTemperature() != null)
            sb.append("Temperature: ").append(getTemperature()).append(",");
        if (getTopK() != null)
            sb.append("TopK: ").append(getTopK()).append(",");
        if (getTopP() != null)
            sb.append("TopP: ").append(getTopP());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceConfiguration == false)
            return false;
        InferenceConfiguration other = (InferenceConfiguration) obj;
        if (other.getMaximumLength() == null ^ this.getMaximumLength() == null)
            return false;
        if (other.getMaximumLength() != null && other.getMaximumLength().equals(this.getMaximumLength()) == false)
            return false;
        if (other.getStopSequences() == null ^ this.getStopSequences() == null)
            return false;
        if (other.getStopSequences() != null && other.getStopSequences().equals(this.getStopSequences()) == false)
            return false;
        if (other.getTemperature() == null ^ this.getTemperature() == null)
            return false;
        if (other.getTemperature() != null && other.getTemperature().equals(this.getTemperature()) == false)
            return false;
        if (other.getTopK() == null ^ this.getTopK() == null)
            return false;
        if (other.getTopK() != null && other.getTopK().equals(this.getTopK()) == false)
            return false;
        if (other.getTopP() == null ^ this.getTopP() == null)
            return false;
        if (other.getTopP() != null && other.getTopP().equals(this.getTopP()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumLength() == null) ? 0 : getMaximumLength().hashCode());
        hashCode = prime * hashCode + ((getStopSequences() == null) ? 0 : getStopSequences().hashCode());
        hashCode = prime * hashCode + ((getTemperature() == null) ? 0 : getTemperature().hashCode());
        hashCode = prime * hashCode + ((getTopK() == null) ? 0 : getTopK().hashCode());
        hashCode = prime * hashCode + ((getTopP() == null) ? 0 : getTopP().hashCode());
        return hashCode;
    }

    @Override
    public InferenceConfiguration clone() {
        try {
            return (InferenceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.InferenceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
