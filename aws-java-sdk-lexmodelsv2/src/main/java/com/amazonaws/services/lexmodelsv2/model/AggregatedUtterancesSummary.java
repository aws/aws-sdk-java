/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides summary information for aggregated utterances. The <code>ListAggregatedUtterances</code> operations combines
 * all instances of the same utterance into a single aggregated summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AggregatedUtterancesSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregatedUtterancesSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The text of the utterance. If the utterance was used with the <code>RecognizeUtterance</code> operation, the text
     * is the transcription of the audio utterance.
     * </p>
     */
    private String utterance;
    /**
     * <p>
     * The number of times that the utterance was detected by Amazon Lex during the time period. When an utterance is
     * detected, it activates an intent or a slot.
     * </p>
     */
    private Integer hitCount;
    /**
     * <p>
     * The number of times that the utterance was missed by Amazon Lex An utterance is missed when it doesn't activate
     * an intent or slot.
     * </p>
     */
    private Integer missedCount;
    /**
     * <p>
     * The date and time that the utterance was first recorded in the time window for aggregation. An utterance may have
     * been sent to Amazon Lex before that time, but only utterances within the time window are counted.
     * </p>
     */
    private java.util.Date utteranceFirstRecordedInAggregationDuration;
    /**
     * <p>
     * The last date and time that an utterance was recorded in the time window for aggregation. An utterance may be
     * sent to Amazon Lex after that time, but only utterances within the time window are counted.
     * </p>
     */
    private java.util.Date utteranceLastRecordedInAggregationDuration;
    /**
     * <p>
     * Aggregated utterance data may contain utterances from versions of your bot that have since been deleted. When the
     * aggregated contains this kind of data, this field is set to true.
     * </p>
     */
    private Boolean containsDataFromDeletedResources;

    /**
     * <p>
     * The text of the utterance. If the utterance was used with the <code>RecognizeUtterance</code> operation, the text
     * is the transcription of the audio utterance.
     * </p>
     * 
     * @param utterance
     *        The text of the utterance. If the utterance was used with the <code>RecognizeUtterance</code> operation,
     *        the text is the transcription of the audio utterance.
     */

    public void setUtterance(String utterance) {
        this.utterance = utterance;
    }

    /**
     * <p>
     * The text of the utterance. If the utterance was used with the <code>RecognizeUtterance</code> operation, the text
     * is the transcription of the audio utterance.
     * </p>
     * 
     * @return The text of the utterance. If the utterance was used with the <code>RecognizeUtterance</code> operation,
     *         the text is the transcription of the audio utterance.
     */

    public String getUtterance() {
        return this.utterance;
    }

    /**
     * <p>
     * The text of the utterance. If the utterance was used with the <code>RecognizeUtterance</code> operation, the text
     * is the transcription of the audio utterance.
     * </p>
     * 
     * @param utterance
     *        The text of the utterance. If the utterance was used with the <code>RecognizeUtterance</code> operation,
     *        the text is the transcription of the audio utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedUtterancesSummary withUtterance(String utterance) {
        setUtterance(utterance);
        return this;
    }

    /**
     * <p>
     * The number of times that the utterance was detected by Amazon Lex during the time period. When an utterance is
     * detected, it activates an intent or a slot.
     * </p>
     * 
     * @param hitCount
     *        The number of times that the utterance was detected by Amazon Lex during the time period. When an
     *        utterance is detected, it activates an intent or a slot.
     */

    public void setHitCount(Integer hitCount) {
        this.hitCount = hitCount;
    }

    /**
     * <p>
     * The number of times that the utterance was detected by Amazon Lex during the time period. When an utterance is
     * detected, it activates an intent or a slot.
     * </p>
     * 
     * @return The number of times that the utterance was detected by Amazon Lex during the time period. When an
     *         utterance is detected, it activates an intent or a slot.
     */

    public Integer getHitCount() {
        return this.hitCount;
    }

    /**
     * <p>
     * The number of times that the utterance was detected by Amazon Lex during the time period. When an utterance is
     * detected, it activates an intent or a slot.
     * </p>
     * 
     * @param hitCount
     *        The number of times that the utterance was detected by Amazon Lex during the time period. When an
     *        utterance is detected, it activates an intent or a slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedUtterancesSummary withHitCount(Integer hitCount) {
        setHitCount(hitCount);
        return this;
    }

    /**
     * <p>
     * The number of times that the utterance was missed by Amazon Lex An utterance is missed when it doesn't activate
     * an intent or slot.
     * </p>
     * 
     * @param missedCount
     *        The number of times that the utterance was missed by Amazon Lex An utterance is missed when it doesn't
     *        activate an intent or slot.
     */

    public void setMissedCount(Integer missedCount) {
        this.missedCount = missedCount;
    }

    /**
     * <p>
     * The number of times that the utterance was missed by Amazon Lex An utterance is missed when it doesn't activate
     * an intent or slot.
     * </p>
     * 
     * @return The number of times that the utterance was missed by Amazon Lex An utterance is missed when it doesn't
     *         activate an intent or slot.
     */

    public Integer getMissedCount() {
        return this.missedCount;
    }

    /**
     * <p>
     * The number of times that the utterance was missed by Amazon Lex An utterance is missed when it doesn't activate
     * an intent or slot.
     * </p>
     * 
     * @param missedCount
     *        The number of times that the utterance was missed by Amazon Lex An utterance is missed when it doesn't
     *        activate an intent or slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedUtterancesSummary withMissedCount(Integer missedCount) {
        setMissedCount(missedCount);
        return this;
    }

    /**
     * <p>
     * The date and time that the utterance was first recorded in the time window for aggregation. An utterance may have
     * been sent to Amazon Lex before that time, but only utterances within the time window are counted.
     * </p>
     * 
     * @param utteranceFirstRecordedInAggregationDuration
     *        The date and time that the utterance was first recorded in the time window for aggregation. An utterance
     *        may have been sent to Amazon Lex before that time, but only utterances within the time window are counted.
     */

    public void setUtteranceFirstRecordedInAggregationDuration(java.util.Date utteranceFirstRecordedInAggregationDuration) {
        this.utteranceFirstRecordedInAggregationDuration = utteranceFirstRecordedInAggregationDuration;
    }

    /**
     * <p>
     * The date and time that the utterance was first recorded in the time window for aggregation. An utterance may have
     * been sent to Amazon Lex before that time, but only utterances within the time window are counted.
     * </p>
     * 
     * @return The date and time that the utterance was first recorded in the time window for aggregation. An utterance
     *         may have been sent to Amazon Lex before that time, but only utterances within the time window are
     *         counted.
     */

    public java.util.Date getUtteranceFirstRecordedInAggregationDuration() {
        return this.utteranceFirstRecordedInAggregationDuration;
    }

    /**
     * <p>
     * The date and time that the utterance was first recorded in the time window for aggregation. An utterance may have
     * been sent to Amazon Lex before that time, but only utterances within the time window are counted.
     * </p>
     * 
     * @param utteranceFirstRecordedInAggregationDuration
     *        The date and time that the utterance was first recorded in the time window for aggregation. An utterance
     *        may have been sent to Amazon Lex before that time, but only utterances within the time window are counted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedUtterancesSummary withUtteranceFirstRecordedInAggregationDuration(java.util.Date utteranceFirstRecordedInAggregationDuration) {
        setUtteranceFirstRecordedInAggregationDuration(utteranceFirstRecordedInAggregationDuration);
        return this;
    }

    /**
     * <p>
     * The last date and time that an utterance was recorded in the time window for aggregation. An utterance may be
     * sent to Amazon Lex after that time, but only utterances within the time window are counted.
     * </p>
     * 
     * @param utteranceLastRecordedInAggregationDuration
     *        The last date and time that an utterance was recorded in the time window for aggregation. An utterance may
     *        be sent to Amazon Lex after that time, but only utterances within the time window are counted.
     */

    public void setUtteranceLastRecordedInAggregationDuration(java.util.Date utteranceLastRecordedInAggregationDuration) {
        this.utteranceLastRecordedInAggregationDuration = utteranceLastRecordedInAggregationDuration;
    }

    /**
     * <p>
     * The last date and time that an utterance was recorded in the time window for aggregation. An utterance may be
     * sent to Amazon Lex after that time, but only utterances within the time window are counted.
     * </p>
     * 
     * @return The last date and time that an utterance was recorded in the time window for aggregation. An utterance
     *         may be sent to Amazon Lex after that time, but only utterances within the time window are counted.
     */

    public java.util.Date getUtteranceLastRecordedInAggregationDuration() {
        return this.utteranceLastRecordedInAggregationDuration;
    }

    /**
     * <p>
     * The last date and time that an utterance was recorded in the time window for aggregation. An utterance may be
     * sent to Amazon Lex after that time, but only utterances within the time window are counted.
     * </p>
     * 
     * @param utteranceLastRecordedInAggregationDuration
     *        The last date and time that an utterance was recorded in the time window for aggregation. An utterance may
     *        be sent to Amazon Lex after that time, but only utterances within the time window are counted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedUtterancesSummary withUtteranceLastRecordedInAggregationDuration(java.util.Date utteranceLastRecordedInAggregationDuration) {
        setUtteranceLastRecordedInAggregationDuration(utteranceLastRecordedInAggregationDuration);
        return this;
    }

    /**
     * <p>
     * Aggregated utterance data may contain utterances from versions of your bot that have since been deleted. When the
     * aggregated contains this kind of data, this field is set to true.
     * </p>
     * 
     * @param containsDataFromDeletedResources
     *        Aggregated utterance data may contain utterances from versions of your bot that have since been deleted.
     *        When the aggregated contains this kind of data, this field is set to true.
     */

    public void setContainsDataFromDeletedResources(Boolean containsDataFromDeletedResources) {
        this.containsDataFromDeletedResources = containsDataFromDeletedResources;
    }

    /**
     * <p>
     * Aggregated utterance data may contain utterances from versions of your bot that have since been deleted. When the
     * aggregated contains this kind of data, this field is set to true.
     * </p>
     * 
     * @return Aggregated utterance data may contain utterances from versions of your bot that have since been deleted.
     *         When the aggregated contains this kind of data, this field is set to true.
     */

    public Boolean getContainsDataFromDeletedResources() {
        return this.containsDataFromDeletedResources;
    }

    /**
     * <p>
     * Aggregated utterance data may contain utterances from versions of your bot that have since been deleted. When the
     * aggregated contains this kind of data, this field is set to true.
     * </p>
     * 
     * @param containsDataFromDeletedResources
     *        Aggregated utterance data may contain utterances from versions of your bot that have since been deleted.
     *        When the aggregated contains this kind of data, this field is set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedUtterancesSummary withContainsDataFromDeletedResources(Boolean containsDataFromDeletedResources) {
        setContainsDataFromDeletedResources(containsDataFromDeletedResources);
        return this;
    }

    /**
     * <p>
     * Aggregated utterance data may contain utterances from versions of your bot that have since been deleted. When the
     * aggregated contains this kind of data, this field is set to true.
     * </p>
     * 
     * @return Aggregated utterance data may contain utterances from versions of your bot that have since been deleted.
     *         When the aggregated contains this kind of data, this field is set to true.
     */

    public Boolean isContainsDataFromDeletedResources() {
        return this.containsDataFromDeletedResources;
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
        if (getUtterance() != null)
            sb.append("Utterance: ").append(getUtterance()).append(",");
        if (getHitCount() != null)
            sb.append("HitCount: ").append(getHitCount()).append(",");
        if (getMissedCount() != null)
            sb.append("MissedCount: ").append(getMissedCount()).append(",");
        if (getUtteranceFirstRecordedInAggregationDuration() != null)
            sb.append("UtteranceFirstRecordedInAggregationDuration: ").append(getUtteranceFirstRecordedInAggregationDuration()).append(",");
        if (getUtteranceLastRecordedInAggregationDuration() != null)
            sb.append("UtteranceLastRecordedInAggregationDuration: ").append(getUtteranceLastRecordedInAggregationDuration()).append(",");
        if (getContainsDataFromDeletedResources() != null)
            sb.append("ContainsDataFromDeletedResources: ").append(getContainsDataFromDeletedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregatedUtterancesSummary == false)
            return false;
        AggregatedUtterancesSummary other = (AggregatedUtterancesSummary) obj;
        if (other.getUtterance() == null ^ this.getUtterance() == null)
            return false;
        if (other.getUtterance() != null && other.getUtterance().equals(this.getUtterance()) == false)
            return false;
        if (other.getHitCount() == null ^ this.getHitCount() == null)
            return false;
        if (other.getHitCount() != null && other.getHitCount().equals(this.getHitCount()) == false)
            return false;
        if (other.getMissedCount() == null ^ this.getMissedCount() == null)
            return false;
        if (other.getMissedCount() != null && other.getMissedCount().equals(this.getMissedCount()) == false)
            return false;
        if (other.getUtteranceFirstRecordedInAggregationDuration() == null ^ this.getUtteranceFirstRecordedInAggregationDuration() == null)
            return false;
        if (other.getUtteranceFirstRecordedInAggregationDuration() != null
                && other.getUtteranceFirstRecordedInAggregationDuration().equals(this.getUtteranceFirstRecordedInAggregationDuration()) == false)
            return false;
        if (other.getUtteranceLastRecordedInAggregationDuration() == null ^ this.getUtteranceLastRecordedInAggregationDuration() == null)
            return false;
        if (other.getUtteranceLastRecordedInAggregationDuration() != null
                && other.getUtteranceLastRecordedInAggregationDuration().equals(this.getUtteranceLastRecordedInAggregationDuration()) == false)
            return false;
        if (other.getContainsDataFromDeletedResources() == null ^ this.getContainsDataFromDeletedResources() == null)
            return false;
        if (other.getContainsDataFromDeletedResources() != null
                && other.getContainsDataFromDeletedResources().equals(this.getContainsDataFromDeletedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUtterance() == null) ? 0 : getUtterance().hashCode());
        hashCode = prime * hashCode + ((getHitCount() == null) ? 0 : getHitCount().hashCode());
        hashCode = prime * hashCode + ((getMissedCount() == null) ? 0 : getMissedCount().hashCode());
        hashCode = prime * hashCode
                + ((getUtteranceFirstRecordedInAggregationDuration() == null) ? 0 : getUtteranceFirstRecordedInAggregationDuration().hashCode());
        hashCode = prime * hashCode
                + ((getUtteranceLastRecordedInAggregationDuration() == null) ? 0 : getUtteranceLastRecordedInAggregationDuration().hashCode());
        hashCode = prime * hashCode + ((getContainsDataFromDeletedResources() == null) ? 0 : getContainsDataFromDeletedResources().hashCode());
        return hashCode;
    }

    @Override
    public AggregatedUtterancesSummary clone() {
        try {
            return (AggregatedUtterancesSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AggregatedUtterancesSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
