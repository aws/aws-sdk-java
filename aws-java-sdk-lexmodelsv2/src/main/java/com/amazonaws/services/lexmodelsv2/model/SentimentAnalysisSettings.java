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
 * Determines whether Amazon Lex will use Amazon Comprehend to detect the sentiment of user utterances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/SentimentAnalysisSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SentimentAnalysisSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     * </p>
     */
    private Boolean detectSentiment;

    /**
     * <p>
     * Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     * </p>
     * 
     * @param detectSentiment
     *        Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     */

    public void setDetectSentiment(Boolean detectSentiment) {
        this.detectSentiment = detectSentiment;
    }

    /**
     * <p>
     * Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     * </p>
     * 
     * @return Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     */

    public Boolean getDetectSentiment() {
        return this.detectSentiment;
    }

    /**
     * <p>
     * Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     * </p>
     * 
     * @param detectSentiment
     *        Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentAnalysisSettings withDetectSentiment(Boolean detectSentiment) {
        setDetectSentiment(detectSentiment);
        return this;
    }

    /**
     * <p>
     * Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     * </p>
     * 
     * @return Sets whether Amazon Lex uses Amazon Comprehend to detect the sentiment of user utterances.
     */

    public Boolean isDetectSentiment() {
        return this.detectSentiment;
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
        if (getDetectSentiment() != null)
            sb.append("DetectSentiment: ").append(getDetectSentiment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SentimentAnalysisSettings == false)
            return false;
        SentimentAnalysisSettings other = (SentimentAnalysisSettings) obj;
        if (other.getDetectSentiment() == null ^ this.getDetectSentiment() == null)
            return false;
        if (other.getDetectSentiment() != null && other.getDetectSentiment().equals(this.getDetectSentiment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectSentiment() == null) ? 0 : getDetectSentiment().hashCode());
        return hashCode;
    }

    @Override
    public SentimentAnalysisSettings clone() {
        try {
            return (SentimentAnalysisSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.SentimentAnalysisSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
