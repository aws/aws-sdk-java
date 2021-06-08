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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ListSlots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSlotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot that contains the slots.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contains the slots.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The language and locale of the slots in the list.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The identifier of the intent that contains the slots.
     * </p>
     */
    private String intentId;
    /**
     * <p>
     * Summary information for the slots that meet the filter criteria specified in the request. The length of the list
     * is specified in the <code>maxResults</code> parameter of the request. If there are more slots available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     */
    private java.util.List<SlotSummary> slotSummaries;
    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListSlots</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListSlots</code> operation request to get the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier of the bot that contains the slots.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the slots.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the slots.
     * </p>
     * 
     * @return The identifier of the bot that contains the slots.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the slots.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the slots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlotsResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contains the slots.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the slots.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the slots.
     * </p>
     * 
     * @return The version of the bot that contains the slots.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the slots.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the slots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlotsResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The language and locale of the slots in the list.
     * </p>
     * 
     * @param localeId
     *        The language and locale of the slots in the list.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The language and locale of the slots in the list.
     * </p>
     * 
     * @return The language and locale of the slots in the list.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The language and locale of the slots in the list.
     * </p>
     * 
     * @param localeId
     *        The language and locale of the slots in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlotsResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the intent that contains the slots.
     * </p>
     * 
     * @param intentId
     *        The identifier of the intent that contains the slots.
     */

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    /**
     * <p>
     * The identifier of the intent that contains the slots.
     * </p>
     * 
     * @return The identifier of the intent that contains the slots.
     */

    public String getIntentId() {
        return this.intentId;
    }

    /**
     * <p>
     * The identifier of the intent that contains the slots.
     * </p>
     * 
     * @param intentId
     *        The identifier of the intent that contains the slots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlotsResult withIntentId(String intentId) {
        setIntentId(intentId);
        return this;
    }

    /**
     * <p>
     * Summary information for the slots that meet the filter criteria specified in the request. The length of the list
     * is specified in the <code>maxResults</code> parameter of the request. If there are more slots available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @return Summary information for the slots that meet the filter criteria specified in the request. The length of
     *         the list is specified in the <code>maxResults</code> parameter of the request. If there are more slots
     *         available, the <code>nextToken</code> field contains a token to get the next page of results.
     */

    public java.util.List<SlotSummary> getSlotSummaries() {
        return slotSummaries;
    }

    /**
     * <p>
     * Summary information for the slots that meet the filter criteria specified in the request. The length of the list
     * is specified in the <code>maxResults</code> parameter of the request. If there are more slots available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param slotSummaries
     *        Summary information for the slots that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter of the request. If there are more slots
     *        available, the <code>nextToken</code> field contains a token to get the next page of results.
     */

    public void setSlotSummaries(java.util.Collection<SlotSummary> slotSummaries) {
        if (slotSummaries == null) {
            this.slotSummaries = null;
            return;
        }

        this.slotSummaries = new java.util.ArrayList<SlotSummary>(slotSummaries);
    }

    /**
     * <p>
     * Summary information for the slots that meet the filter criteria specified in the request. The length of the list
     * is specified in the <code>maxResults</code> parameter of the request. If there are more slots available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSlotSummaries(java.util.Collection)} or {@link #withSlotSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param slotSummaries
     *        Summary information for the slots that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter of the request. If there are more slots
     *        available, the <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlotsResult withSlotSummaries(SlotSummary... slotSummaries) {
        if (this.slotSummaries == null) {
            setSlotSummaries(new java.util.ArrayList<SlotSummary>(slotSummaries.length));
        }
        for (SlotSummary ele : slotSummaries) {
            this.slotSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information for the slots that meet the filter criteria specified in the request. The length of the list
     * is specified in the <code>maxResults</code> parameter of the request. If there are more slots available, the
     * <code>nextToken</code> field contains a token to get the next page of results.
     * </p>
     * 
     * @param slotSummaries
     *        Summary information for the slots that meet the filter criteria specified in the request. The length of
     *        the list is specified in the <code>maxResults</code> parameter of the request. If there are more slots
     *        available, the <code>nextToken</code> field contains a token to get the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlotsResult withSlotSummaries(java.util.Collection<SlotSummary> slotSummaries) {
        setSlotSummaries(slotSummaries);
        return this;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListSlots</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListSlots</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListSlots</code> operation. If the <code>nextToken</code> field is present, you send the contents as
     *        the <code>nextToken</code> parameter of a <code>ListSlots</code> operation request to get the next page of
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListSlots</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListSlots</code> operation request to get the next page of results.
     * </p>
     * 
     * @return A token that indicates whether there are more results to return in a response to the
     *         <code>ListSlots</code> operation. If the <code>nextToken</code> field is present, you send the contents
     *         as the <code>nextToken</code> parameter of a <code>ListSlots</code> operation request to get the next
     *         page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that indicates whether there are more results to return in a response to the <code>ListSlots</code>
     * operation. If the <code>nextToken</code> field is present, you send the contents as the <code>nextToken</code>
     * parameter of a <code>ListSlots</code> operation request to get the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A token that indicates whether there are more results to return in a response to the
     *        <code>ListSlots</code> operation. If the <code>nextToken</code> field is present, you send the contents as
     *        the <code>nextToken</code> parameter of a <code>ListSlots</code> operation request to get the next page of
     *        results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSlotsResult withNextToken(String nextToken) {
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
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId()).append(",");
        if (getIntentId() != null)
            sb.append("IntentId: ").append(getIntentId()).append(",");
        if (getSlotSummaries() != null)
            sb.append("SlotSummaries: ").append(getSlotSummaries()).append(",");
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

        if (obj instanceof ListSlotsResult == false)
            return false;
        ListSlotsResult other = (ListSlotsResult) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        if (other.getIntentId() == null ^ this.getIntentId() == null)
            return false;
        if (other.getIntentId() != null && other.getIntentId().equals(this.getIntentId()) == false)
            return false;
        if (other.getSlotSummaries() == null ^ this.getSlotSummaries() == null)
            return false;
        if (other.getSlotSummaries() != null && other.getSlotSummaries().equals(this.getSlotSummaries()) == false)
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
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        hashCode = prime * hashCode + ((getIntentId() == null) ? 0 : getIntentId().hashCode());
        hashCode = prime * hashCode + ((getSlotSummaries() == null) ? 0 : getSlotSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSlotsResult clone() {
        try {
            return (ListSlotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
