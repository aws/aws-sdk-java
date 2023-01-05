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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListAggregatedUtterances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAggregatedUtterancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot that contains the utterances.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The identifier of the bot alias that contains the utterances. If you specified the bot version, the bot alias ID
     * isn't returned.
     * </p>
     */
    private String botAliasId;
    /**
     * <p>
     * The identifier of the bot version that contains the utterances. If you specified the bot alias, the bot version
     * isn't returned.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale that the utterances are in.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The time period used to aggregate the utterance data.
     * </p>
     */
    private UtteranceAggregationDuration aggregationDuration;
    /**
     * <p>
     * The date and time that the aggregation window begins. Only data collected after this time is returned in the
     * results.
     * </p>
     */
    private java.util.Date aggregationWindowStartTime;
    /**
     * <p>
     * The date and time that the aggregation window ends. Only data collected between the start time and the end time
     * are returned in the results.
     * </p>
     */
    private java.util.Date aggregationWindowEndTime;
    /**
     * <p>
     * The last date and time that the aggregated data was collected. The time period depends on the length of the
     * aggregation window.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Hours</b> - for 1 hour time window, every half hour; otherwise every hour.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Days</b> - every 6 hours
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Weeks</b> - for a one week time window, every 12 hours; otherwise, every day
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Date aggregationLastRefreshedDateTime;
    /**
     * <p>
     * Summaries of the aggregated utterance data. Each response contains information about the number of times that the
     * utterance was seen during the time period, whether it was detected or missed, and when it was seen during the
     * time period.
     * </p>
     */
    private java.util.List<AggregatedUtterancesSummary> aggregatedUtterancesSummaries;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListAggregatedUtterances</code> operation. If the <code>nextToken</code> field is present, you send the
     * contents as the <code>nextToken</code> parameter of a <code>ListAggregatedUtterances</code> operation request to
     * get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the bot that contains the utterances.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the utterances.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the utterances.
     * </p>
     * 
     * @return The identifier of the bot that contains the utterances.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the utterances.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot alias that contains the utterances. If you specified the bot version, the bot alias ID
     * isn't returned.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the bot alias that contains the utterances. If you specified the bot version, the bot
     *        alias ID isn't returned.
     */

    public void setBotAliasId(String botAliasId) {
        this.botAliasId = botAliasId;
    }

    /**
     * <p>
     * The identifier of the bot alias that contains the utterances. If you specified the bot version, the bot alias ID
     * isn't returned.
     * </p>
     * 
     * @return The identifier of the bot alias that contains the utterances. If you specified the bot version, the bot
     *         alias ID isn't returned.
     */

    public String getBotAliasId() {
        return this.botAliasId;
    }

    /**
     * <p>
     * The identifier of the bot alias that contains the utterances. If you specified the bot version, the bot alias ID
     * isn't returned.
     * </p>
     * 
     * @param botAliasId
     *        The identifier of the bot alias that contains the utterances. If you specified the bot version, the bot
     *        alias ID isn't returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withBotAliasId(String botAliasId) {
        setBotAliasId(botAliasId);
        return this;
    }

    /**
     * <p>
     * The identifier of the bot version that contains the utterances. If you specified the bot alias, the bot version
     * isn't returned.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the bot version that contains the utterances. If you specified the bot alias, the bot
     *        version isn't returned.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The identifier of the bot version that contains the utterances. If you specified the bot alias, the bot version
     * isn't returned.
     * </p>
     * 
     * @return The identifier of the bot version that contains the utterances. If you specified the bot alias, the bot
     *         version isn't returned.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The identifier of the bot version that contains the utterances. If you specified the bot alias, the bot version
     * isn't returned.
     * </p>
     * 
     * @param botVersion
     *        The identifier of the bot version that contains the utterances. If you specified the bot alias, the bot
     *        version isn't returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale that the utterances are in.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the utterances are in.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the utterances are in.
     * </p>
     * 
     * @return The identifier of the language and locale that the utterances are in.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the utterances are in.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the utterances are in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The time period used to aggregate the utterance data.
     * </p>
     * 
     * @param aggregationDuration
     *        The time period used to aggregate the utterance data.
     */

    public void setAggregationDuration(UtteranceAggregationDuration aggregationDuration) {
        this.aggregationDuration = aggregationDuration;
    }

    /**
     * <p>
     * The time period used to aggregate the utterance data.
     * </p>
     * 
     * @return The time period used to aggregate the utterance data.
     */

    public UtteranceAggregationDuration getAggregationDuration() {
        return this.aggregationDuration;
    }

    /**
     * <p>
     * The time period used to aggregate the utterance data.
     * </p>
     * 
     * @param aggregationDuration
     *        The time period used to aggregate the utterance data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withAggregationDuration(UtteranceAggregationDuration aggregationDuration) {
        setAggregationDuration(aggregationDuration);
        return this;
    }

    /**
     * <p>
     * The date and time that the aggregation window begins. Only data collected after this time is returned in the
     * results.
     * </p>
     * 
     * @param aggregationWindowStartTime
     *        The date and time that the aggregation window begins. Only data collected after this time is returned in
     *        the results.
     */

    public void setAggregationWindowStartTime(java.util.Date aggregationWindowStartTime) {
        this.aggregationWindowStartTime = aggregationWindowStartTime;
    }

    /**
     * <p>
     * The date and time that the aggregation window begins. Only data collected after this time is returned in the
     * results.
     * </p>
     * 
     * @return The date and time that the aggregation window begins. Only data collected after this time is returned in
     *         the results.
     */

    public java.util.Date getAggregationWindowStartTime() {
        return this.aggregationWindowStartTime;
    }

    /**
     * <p>
     * The date and time that the aggregation window begins. Only data collected after this time is returned in the
     * results.
     * </p>
     * 
     * @param aggregationWindowStartTime
     *        The date and time that the aggregation window begins. Only data collected after this time is returned in
     *        the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withAggregationWindowStartTime(java.util.Date aggregationWindowStartTime) {
        setAggregationWindowStartTime(aggregationWindowStartTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the aggregation window ends. Only data collected between the start time and the end time
     * are returned in the results.
     * </p>
     * 
     * @param aggregationWindowEndTime
     *        The date and time that the aggregation window ends. Only data collected between the start time and the end
     *        time are returned in the results.
     */

    public void setAggregationWindowEndTime(java.util.Date aggregationWindowEndTime) {
        this.aggregationWindowEndTime = aggregationWindowEndTime;
    }

    /**
     * <p>
     * The date and time that the aggregation window ends. Only data collected between the start time and the end time
     * are returned in the results.
     * </p>
     * 
     * @return The date and time that the aggregation window ends. Only data collected between the start time and the
     *         end time are returned in the results.
     */

    public java.util.Date getAggregationWindowEndTime() {
        return this.aggregationWindowEndTime;
    }

    /**
     * <p>
     * The date and time that the aggregation window ends. Only data collected between the start time and the end time
     * are returned in the results.
     * </p>
     * 
     * @param aggregationWindowEndTime
     *        The date and time that the aggregation window ends. Only data collected between the start time and the end
     *        time are returned in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withAggregationWindowEndTime(java.util.Date aggregationWindowEndTime) {
        setAggregationWindowEndTime(aggregationWindowEndTime);
        return this;
    }

    /**
     * <p>
     * The last date and time that the aggregated data was collected. The time period depends on the length of the
     * aggregation window.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Hours</b> - for 1 hour time window, every half hour; otherwise every hour.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Days</b> - every 6 hours
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Weeks</b> - for a one week time window, every 12 hours; otherwise, every day
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregationLastRefreshedDateTime
     *        The last date and time that the aggregated data was collected. The time period depends on the length of
     *        the aggregation window.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Hours</b> - for 1 hour time window, every half hour; otherwise every hour.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Days</b> - every 6 hours
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Weeks</b> - for a one week time window, every 12 hours; otherwise, every day
     *        </p>
     *        </li>
     */

    public void setAggregationLastRefreshedDateTime(java.util.Date aggregationLastRefreshedDateTime) {
        this.aggregationLastRefreshedDateTime = aggregationLastRefreshedDateTime;
    }

    /**
     * <p>
     * The last date and time that the aggregated data was collected. The time period depends on the length of the
     * aggregation window.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Hours</b> - for 1 hour time window, every half hour; otherwise every hour.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Days</b> - every 6 hours
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Weeks</b> - for a one week time window, every 12 hours; otherwise, every day
     * </p>
     * </li>
     * </ul>
     * 
     * @return The last date and time that the aggregated data was collected. The time period depends on the length of
     *         the aggregation window.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Hours</b> - for 1 hour time window, every half hour; otherwise every hour.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Days</b> - every 6 hours
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Weeks</b> - for a one week time window, every 12 hours; otherwise, every day
     *         </p>
     *         </li>
     */

    public java.util.Date getAggregationLastRefreshedDateTime() {
        return this.aggregationLastRefreshedDateTime;
    }

    /**
     * <p>
     * The last date and time that the aggregated data was collected. The time period depends on the length of the
     * aggregation window.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Hours</b> - for 1 hour time window, every half hour; otherwise every hour.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Days</b> - every 6 hours
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Weeks</b> - for a one week time window, every 12 hours; otherwise, every day
     * </p>
     * </li>
     * </ul>
     * 
     * @param aggregationLastRefreshedDateTime
     *        The last date and time that the aggregated data was collected. The time period depends on the length of
     *        the aggregation window.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Hours</b> - for 1 hour time window, every half hour; otherwise every hour.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Days</b> - every 6 hours
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Weeks</b> - for a one week time window, every 12 hours; otherwise, every day
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withAggregationLastRefreshedDateTime(java.util.Date aggregationLastRefreshedDateTime) {
        setAggregationLastRefreshedDateTime(aggregationLastRefreshedDateTime);
        return this;
    }

    /**
     * <p>
     * Summaries of the aggregated utterance data. Each response contains information about the number of times that the
     * utterance was seen during the time period, whether it was detected or missed, and when it was seen during the
     * time period.
     * </p>
     * 
     * @return Summaries of the aggregated utterance data. Each response contains information about the number of times
     *         that the utterance was seen during the time period, whether it was detected or missed, and when it was
     *         seen during the time period.
     */

    public java.util.List<AggregatedUtterancesSummary> getAggregatedUtterancesSummaries() {
        return aggregatedUtterancesSummaries;
    }

    /**
     * <p>
     * Summaries of the aggregated utterance data. Each response contains information about the number of times that the
     * utterance was seen during the time period, whether it was detected or missed, and when it was seen during the
     * time period.
     * </p>
     * 
     * @param aggregatedUtterancesSummaries
     *        Summaries of the aggregated utterance data. Each response contains information about the number of times
     *        that the utterance was seen during the time period, whether it was detected or missed, and when it was
     *        seen during the time period.
     */

    public void setAggregatedUtterancesSummaries(java.util.Collection<AggregatedUtterancesSummary> aggregatedUtterancesSummaries) {
        if (aggregatedUtterancesSummaries == null) {
            this.aggregatedUtterancesSummaries = null;
            return;
        }

        this.aggregatedUtterancesSummaries = new java.util.ArrayList<AggregatedUtterancesSummary>(aggregatedUtterancesSummaries);
    }

    /**
     * <p>
     * Summaries of the aggregated utterance data. Each response contains information about the number of times that the
     * utterance was seen during the time period, whether it was detected or missed, and when it was seen during the
     * time period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregatedUtterancesSummaries(java.util.Collection)} or
     * {@link #withAggregatedUtterancesSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param aggregatedUtterancesSummaries
     *        Summaries of the aggregated utterance data. Each response contains information about the number of times
     *        that the utterance was seen during the time period, whether it was detected or missed, and when it was
     *        seen during the time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withAggregatedUtterancesSummaries(AggregatedUtterancesSummary... aggregatedUtterancesSummaries) {
        if (this.aggregatedUtterancesSummaries == null) {
            setAggregatedUtterancesSummaries(new java.util.ArrayList<AggregatedUtterancesSummary>(aggregatedUtterancesSummaries.length));
        }
        for (AggregatedUtterancesSummary ele : aggregatedUtterancesSummaries) {
            this.aggregatedUtterancesSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summaries of the aggregated utterance data. Each response contains information about the number of times that the
     * utterance was seen during the time period, whether it was detected or missed, and when it was seen during the
     * time period.
     * </p>
     * 
     * @param aggregatedUtterancesSummaries
     *        Summaries of the aggregated utterance data. Each response contains information about the number of times
     *        that the utterance was seen during the time period, whether it was detected or missed, and when it was
     *        seen during the time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withAggregatedUtterancesSummaries(java.util.Collection<AggregatedUtterancesSummary> aggregatedUtterancesSummaries) {
        setAggregatedUtterancesSummaries(aggregatedUtterancesSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListAggregatedUtterances</code> operation. If the <code>nextToken</code> field is present, you send the
     * contents as the <code>nextToken</code> parameter of a <code>ListAggregatedUtterances</code> operation request to
     * get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListAggregatedUtterances</code> operation. If the <code>nextToken</code> field is present, you send
     *        the contents as the <code>nextToken</code> parameter of a <code>ListAggregatedUtterances</code> operation
     *        request to get the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListAggregatedUtterances</code> operation. If the <code>nextToken</code> field is present, you send the
     * contents as the <code>nextToken</code> parameter of a <code>ListAggregatedUtterances</code> operation request to
     * get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the
     *         <code>ListAggregatedUtterances</code> operation. If the <code>nextToken</code> field is present, you send
     *         the contents as the <code>nextToken</code> parameter of a <code>ListAggregatedUtterances</code> operation
     *         request to get the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the
     * <code>ListAggregatedUtterances</code> operation. If the <code>nextToken</code> field is present, you send the
     * contents as the <code>nextToken</code> parameter of a <code>ListAggregatedUtterances</code> operation request to
     * get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListAggregatedUtterances</code> operation. If the <code>nextToken</code> field is present, you send
     *        the contents as the <code>nextToken</code> parameter of a <code>ListAggregatedUtterances</code> operation
     *        request to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAggregatedUtterancesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotAliasId() != null)
            sb.append("BotAliasId: ").append(getBotAliasId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getAggregationDuration() != null)
            sb.append("AggregationDuration: ").append(getAggregationDuration()).append(",");
        if (getAggregationWindowStartTime() != null)
            sb.append("AggregationWindowStartTime: ").append(getAggregationWindowStartTime()).append(",");
        if (getAggregationWindowEndTime() != null)
            sb.append("AggregationWindowEndTime: ").append(getAggregationWindowEndTime()).append(",");
        if (getAggregationLastRefreshedDateTime() != null)
            sb.append("AggregationLastRefreshedDateTime: ").append(getAggregationLastRefreshedDateTime()).append(",");
        if (getAggregatedUtterancesSummaries() != null)
            sb.append("AggregatedUtterancesSummaries: ").append(getAggregatedUtterancesSummaries()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAggregatedUtterancesResult == false)
            return false;
        ListAggregatedUtterancesResult other = (ListAggregatedUtterancesResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotAliasId() == null ^ this.getBotAliasId() == null)
            return false;
        if (other.getBotAliasId() != null && other.getBotAliasId().equals(this.getBotAliasId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getAggregationDuration() == null ^ this.getAggregationDuration() == null)
            return false;
        if (other.getAggregationDuration() != null && other.getAggregationDuration().equals(this.getAggregationDuration()) == false)
            return false;
        if (other.getAggregationWindowStartTime() == null ^ this.getAggregationWindowStartTime() == null)
            return false;
        if (other.getAggregationWindowStartTime() != null && other.getAggregationWindowStartTime().equals(this.getAggregationWindowStartTime()) == false)
            return false;
        if (other.getAggregationWindowEndTime() == null ^ this.getAggregationWindowEndTime() == null)
            return false;
        if (other.getAggregationWindowEndTime() != null && other.getAggregationWindowEndTime().equals(this.getAggregationWindowEndTime()) == false)
            return false;
        if (other.getAggregationLastRefreshedDateTime() == null ^ this.getAggregationLastRefreshedDateTime() == null)
            return false;
        if (other.getAggregationLastRefreshedDateTime() != null
                && other.getAggregationLastRefreshedDateTime().equals(this.getAggregationLastRefreshedDateTime()) == false)
            return false;
        if (other.getAggregatedUtterancesSummaries() == null ^ this.getAggregatedUtterancesSummaries() == null)
            return false;
        if (other.getAggregatedUtterancesSummaries() != null
                && other.getAggregatedUtterancesSummaries().equals(this.getAggregatedUtterancesSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotAliasId() == null) ? 0 : getBotAliasId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getAggregationDuration() == null) ? 0 : getAggregationDuration().hashCode());
        hashCode = prime * hashCode + ((getAggregationWindowStartTime() == null) ? 0 : getAggregationWindowStartTime().hashCode());
        hashCode = prime * hashCode + ((getAggregationWindowEndTime() == null) ? 0 : getAggregationWindowEndTime().hashCode());
        hashCode = prime * hashCode + ((getAggregationLastRefreshedDateTime() == null) ? 0 : getAggregationLastRefreshedDateTime().hashCode());
        hashCode = prime * hashCode + ((getAggregatedUtterancesSummaries() == null) ? 0 : getAggregatedUtterancesSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAggregatedUtterancesResult clone() {
        try {
            return (ListAggregatedUtterancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
