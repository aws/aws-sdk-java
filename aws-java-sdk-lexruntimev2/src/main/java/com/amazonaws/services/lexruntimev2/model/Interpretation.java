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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An intent that Amazon Lex V2 determined might satisfy the user's utterance. The intents are ordered by the confidence
 * score.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/Interpretation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Interpretation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the threshold where Amazon Lex V2 will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a response.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     */
    private ConfidenceScore nluConfidence;
    /**
     * <p>
     * The sentiment expressed in an utterance.
     * </p>
     * <p>
     * When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains
     * the result of the analysis.
     * </p>
     */
    private SentimentResponse sentimentResponse;
    /**
     * <p>
     * A list of intents that might satisfy the user's utterance. The intents are ordered by the confidence score.
     * </p>
     */
    private Intent intent;

    /**
     * <p>
     * Determines the threshold where Amazon Lex V2 will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a response.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * 
     * @param nluConfidence
     *        Determines the threshold where Amazon Lex V2 will insert the <code>AMAZON.FallbackIntent</code>,
     *        <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a response.
     *        <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *        are configured for the bot.
     */

    public void setNluConfidence(ConfidenceScore nluConfidence) {
        this.nluConfidence = nluConfidence;
    }

    /**
     * <p>
     * Determines the threshold where Amazon Lex V2 will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a response.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * 
     * @return Determines the threshold where Amazon Lex V2 will insert the <code>AMAZON.FallbackIntent</code>,
     *         <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a response.
     *         <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *         are configured for the bot.
     */

    public ConfidenceScore getNluConfidence() {
        return this.nluConfidence;
    }

    /**
     * <p>
     * Determines the threshold where Amazon Lex V2 will insert the <code>AMAZON.FallbackIntent</code>,
     * <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a response.
     * <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they are
     * configured for the bot.
     * </p>
     * 
     * @param nluConfidence
     *        Determines the threshold where Amazon Lex V2 will insert the <code>AMAZON.FallbackIntent</code>,
     *        <code>AMAZON.KendraSearchIntent</code>, or both when returning alternative intents in a response.
     *        <code>AMAZON.FallbackIntent</code> and <code>AMAZON.KendraSearchIntent</code> are only inserted if they
     *        are configured for the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interpretation withNluConfidence(ConfidenceScore nluConfidence) {
        setNluConfidence(nluConfidence);
        return this;
    }

    /**
     * <p>
     * The sentiment expressed in an utterance.
     * </p>
     * <p>
     * When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains
     * the result of the analysis.
     * </p>
     * 
     * @param sentimentResponse
     *        The sentiment expressed in an utterance. </p>
     *        <p>
     *        When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field
     *        contains the result of the analysis.
     */

    public void setSentimentResponse(SentimentResponse sentimentResponse) {
        this.sentimentResponse = sentimentResponse;
    }

    /**
     * <p>
     * The sentiment expressed in an utterance.
     * </p>
     * <p>
     * When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains
     * the result of the analysis.
     * </p>
     * 
     * @return The sentiment expressed in an utterance. </p>
     *         <p>
     *         When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field
     *         contains the result of the analysis.
     */

    public SentimentResponse getSentimentResponse() {
        return this.sentimentResponse;
    }

    /**
     * <p>
     * The sentiment expressed in an utterance.
     * </p>
     * <p>
     * When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains
     * the result of the analysis.
     * </p>
     * 
     * @param sentimentResponse
     *        The sentiment expressed in an utterance. </p>
     *        <p>
     *        When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field
     *        contains the result of the analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interpretation withSentimentResponse(SentimentResponse sentimentResponse) {
        setSentimentResponse(sentimentResponse);
        return this;
    }

    /**
     * <p>
     * A list of intents that might satisfy the user's utterance. The intents are ordered by the confidence score.
     * </p>
     * 
     * @param intent
     *        A list of intents that might satisfy the user's utterance. The intents are ordered by the confidence
     *        score.
     */

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    /**
     * <p>
     * A list of intents that might satisfy the user's utterance. The intents are ordered by the confidence score.
     * </p>
     * 
     * @return A list of intents that might satisfy the user's utterance. The intents are ordered by the confidence
     *         score.
     */

    public Intent getIntent() {
        return this.intent;
    }

    /**
     * <p>
     * A list of intents that might satisfy the user's utterance. The intents are ordered by the confidence score.
     * </p>
     * 
     * @param intent
     *        A list of intents that might satisfy the user's utterance. The intents are ordered by the confidence
     *        score.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Interpretation withIntent(Intent intent) {
        setIntent(intent);
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
        if (getNluConfidence() != null)
            sb.append("NluConfidence: ").append(getNluConfidence()).append(",");
        if (getSentimentResponse() != null)
            sb.append("SentimentResponse: ").append(getSentimentResponse()).append(",");
        if (getIntent() != null)
            sb.append("Intent: ").append(getIntent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Interpretation == false)
            return false;
        Interpretation other = (Interpretation) obj;
        if (other.getNluConfidence() == null ^ this.getNluConfidence() == null)
            return false;
        if (other.getNluConfidence() != null && other.getNluConfidence().equals(this.getNluConfidence()) == false)
            return false;
        if (other.getSentimentResponse() == null ^ this.getSentimentResponse() == null)
            return false;
        if (other.getSentimentResponse() != null && other.getSentimentResponse().equals(this.getSentimentResponse()) == false)
            return false;
        if (other.getIntent() == null ^ this.getIntent() == null)
            return false;
        if (other.getIntent() != null && other.getIntent().equals(this.getIntent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNluConfidence() == null) ? 0 : getNluConfidence().hashCode());
        hashCode = prime * hashCode + ((getSentimentResponse() == null) ? 0 : getSentimentResponse().hashCode());
        hashCode = prime * hashCode + ((getIntent() == null) ? 0 : getIntent().hashCode());
        return hashCode;
    }

    @Override
    public Interpretation clone() {
        try {
            return (Interpretation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.InterpretationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
