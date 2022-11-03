/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The object representing the URL of the bot definition, the URL of the associated transcript, and a statistical
 * summary of the bot recommendation results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BotRecommendationResults"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BotRecommendationResults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The presigned URL link of the recommended bot definition.
     * </p>
     */
    private String botLocaleExportUrl;
    /**
     * <p>
     * The presigned url link of the associated transcript.
     * </p>
     */
    private String associatedTranscriptsUrl;
    /**
     * <p>
     * The statistical summary of the bot recommendation results.
     * </p>
     */
    private BotRecommendationResultStatistics statistics;

    /**
     * <p>
     * The presigned URL link of the recommended bot definition.
     * </p>
     * 
     * @param botLocaleExportUrl
     *        The presigned URL link of the recommended bot definition.
     */

    public void setBotLocaleExportUrl(String botLocaleExportUrl) {
        this.botLocaleExportUrl = botLocaleExportUrl;
    }

    /**
     * <p>
     * The presigned URL link of the recommended bot definition.
     * </p>
     * 
     * @return The presigned URL link of the recommended bot definition.
     */

    public String getBotLocaleExportUrl() {
        return this.botLocaleExportUrl;
    }

    /**
     * <p>
     * The presigned URL link of the recommended bot definition.
     * </p>
     * 
     * @param botLocaleExportUrl
     *        The presigned URL link of the recommended bot definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotRecommendationResults withBotLocaleExportUrl(String botLocaleExportUrl) {
        setBotLocaleExportUrl(botLocaleExportUrl);
        return this;
    }

    /**
     * <p>
     * The presigned url link of the associated transcript.
     * </p>
     * 
     * @param associatedTranscriptsUrl
     *        The presigned url link of the associated transcript.
     */

    public void setAssociatedTranscriptsUrl(String associatedTranscriptsUrl) {
        this.associatedTranscriptsUrl = associatedTranscriptsUrl;
    }

    /**
     * <p>
     * The presigned url link of the associated transcript.
     * </p>
     * 
     * @return The presigned url link of the associated transcript.
     */

    public String getAssociatedTranscriptsUrl() {
        return this.associatedTranscriptsUrl;
    }

    /**
     * <p>
     * The presigned url link of the associated transcript.
     * </p>
     * 
     * @param associatedTranscriptsUrl
     *        The presigned url link of the associated transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotRecommendationResults withAssociatedTranscriptsUrl(String associatedTranscriptsUrl) {
        setAssociatedTranscriptsUrl(associatedTranscriptsUrl);
        return this;
    }

    /**
     * <p>
     * The statistical summary of the bot recommendation results.
     * </p>
     * 
     * @param statistics
     *        The statistical summary of the bot recommendation results.
     */

    public void setStatistics(BotRecommendationResultStatistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * The statistical summary of the bot recommendation results.
     * </p>
     * 
     * @return The statistical summary of the bot recommendation results.
     */

    public BotRecommendationResultStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * <p>
     * The statistical summary of the bot recommendation results.
     * </p>
     * 
     * @param statistics
     *        The statistical summary of the bot recommendation results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BotRecommendationResults withStatistics(BotRecommendationResultStatistics statistics) {
        setStatistics(statistics);
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
        if (getBotLocaleExportUrl() != null)
            sb.append("BotLocaleExportUrl: ").append(getBotLocaleExportUrl()).append(",");
        if (getAssociatedTranscriptsUrl() != null)
            sb.append("AssociatedTranscriptsUrl: ").append(getAssociatedTranscriptsUrl()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BotRecommendationResults == false)
            return false;
        BotRecommendationResults other = (BotRecommendationResults) obj;
        if (other.getBotLocaleExportUrl() == null ^ this.getBotLocaleExportUrl() == null)
            return false;
        if (other.getBotLocaleExportUrl() != null && other.getBotLocaleExportUrl().equals(this.getBotLocaleExportUrl()) == false)
            return false;
        if (other.getAssociatedTranscriptsUrl() == null ^ this.getAssociatedTranscriptsUrl() == null)
            return false;
        if (other.getAssociatedTranscriptsUrl() != null && other.getAssociatedTranscriptsUrl().equals(this.getAssociatedTranscriptsUrl()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotLocaleExportUrl() == null) ? 0 : getBotLocaleExportUrl().hashCode());
        hashCode = prime * hashCode + ((getAssociatedTranscriptsUrl() == null) ? 0 : getAssociatedTranscriptsUrl().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public BotRecommendationResults clone() {
        try {
            return (BotRecommendationResults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.BotRecommendationResultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
