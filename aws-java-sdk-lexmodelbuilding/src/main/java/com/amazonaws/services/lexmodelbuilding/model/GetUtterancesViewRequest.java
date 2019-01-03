/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetUtterancesView" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUtterancesViewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot for which utterance information should be returned.
     * </p>
     */
    private String botName;
    /**
     * <p>
     * An array of bot versions for which utterance information should be returned. The limit is 5 versions per request.
     * </p>
     */
    private java.util.List<String> botVersions;
    /**
     * <p>
     * To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances that were
     * not recognized, use <code>Missed</code>.
     * </p>
     */
    private String statusType;

    /**
     * <p>
     * The name of the bot for which utterance information should be returned.
     * </p>
     * 
     * @param botName
     *        The name of the bot for which utterance information should be returned.
     */

    public void setBotName(String botName) {
        this.botName = botName;
    }

    /**
     * <p>
     * The name of the bot for which utterance information should be returned.
     * </p>
     * 
     * @return The name of the bot for which utterance information should be returned.
     */

    public String getBotName() {
        return this.botName;
    }

    /**
     * <p>
     * The name of the bot for which utterance information should be returned.
     * </p>
     * 
     * @param botName
     *        The name of the bot for which utterance information should be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUtterancesViewRequest withBotName(String botName) {
        setBotName(botName);
        return this;
    }

    /**
     * <p>
     * An array of bot versions for which utterance information should be returned. The limit is 5 versions per request.
     * </p>
     * 
     * @return An array of bot versions for which utterance information should be returned. The limit is 5 versions per
     *         request.
     */

    public java.util.List<String> getBotVersions() {
        return botVersions;
    }

    /**
     * <p>
     * An array of bot versions for which utterance information should be returned. The limit is 5 versions per request.
     * </p>
     * 
     * @param botVersions
     *        An array of bot versions for which utterance information should be returned. The limit is 5 versions per
     *        request.
     */

    public void setBotVersions(java.util.Collection<String> botVersions) {
        if (botVersions == null) {
            this.botVersions = null;
            return;
        }

        this.botVersions = new java.util.ArrayList<String>(botVersions);
    }

    /**
     * <p>
     * An array of bot versions for which utterance information should be returned. The limit is 5 versions per request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBotVersions(java.util.Collection)} or {@link #withBotVersions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param botVersions
     *        An array of bot versions for which utterance information should be returned. The limit is 5 versions per
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUtterancesViewRequest withBotVersions(String... botVersions) {
        if (this.botVersions == null) {
            setBotVersions(new java.util.ArrayList<String>(botVersions.length));
        }
        for (String ele : botVersions) {
            this.botVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of bot versions for which utterance information should be returned. The limit is 5 versions per request.
     * </p>
     * 
     * @param botVersions
     *        An array of bot versions for which utterance information should be returned. The limit is 5 versions per
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUtterancesViewRequest withBotVersions(java.util.Collection<String> botVersions) {
        setBotVersions(botVersions);
        return this;
    }

    /**
     * <p>
     * To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances that were
     * not recognized, use <code>Missed</code>.
     * </p>
     * 
     * @param statusType
     *        To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances that
     *        were not recognized, use <code>Missed</code>.
     * @see StatusType
     */

    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    /**
     * <p>
     * To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances that were
     * not recognized, use <code>Missed</code>.
     * </p>
     * 
     * @return To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances
     *         that were not recognized, use <code>Missed</code>.
     * @see StatusType
     */

    public String getStatusType() {
        return this.statusType;
    }

    /**
     * <p>
     * To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances that were
     * not recognized, use <code>Missed</code>.
     * </p>
     * 
     * @param statusType
     *        To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances that
     *        were not recognized, use <code>Missed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public GetUtterancesViewRequest withStatusType(String statusType) {
        setStatusType(statusType);
        return this;
    }

    /**
     * <p>
     * To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances that were
     * not recognized, use <code>Missed</code>.
     * </p>
     * 
     * @param statusType
     *        To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances that
     *        were not recognized, use <code>Missed</code>.
     * @see StatusType
     */

    public void setStatusType(StatusType statusType) {
        withStatusType(statusType);
    }

    /**
     * <p>
     * To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances that were
     * not recognized, use <code>Missed</code>.
     * </p>
     * 
     * @param statusType
     *        To return utterances that were recognized and handled, use<code>Detected</code>. To return utterances that
     *        were not recognized, use <code>Missed</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public GetUtterancesViewRequest withStatusType(StatusType statusType) {
        this.statusType = statusType.toString();
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
        if (getBotName() != null)
            sb.append("BotName: ").append(getBotName()).append(",");
        if (getBotVersions() != null)
            sb.append("BotVersions: ").append(getBotVersions()).append(",");
        if (getStatusType() != null)
            sb.append("StatusType: ").append(getStatusType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUtterancesViewRequest == false)
            return false;
        GetUtterancesViewRequest other = (GetUtterancesViewRequest) obj;
        if (other.getBotName() == null ^ this.getBotName() == null)
            return false;
        if (other.getBotName() != null && other.getBotName().equals(this.getBotName()) == false)
            return false;
        if (other.getBotVersions() == null ^ this.getBotVersions() == null)
            return false;
        if (other.getBotVersions() != null && other.getBotVersions().equals(this.getBotVersions()) == false)
            return false;
        if (other.getStatusType() == null ^ this.getStatusType() == null)
            return false;
        if (other.getStatusType() != null && other.getStatusType().equals(this.getStatusType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotName() == null) ? 0 : getBotName().hashCode());
        hashCode = prime * hashCode + ((getBotVersions() == null) ? 0 : getBotVersions().hashCode());
        hashCode = prime * hashCode + ((getStatusType() == null) ? 0 : getStatusType().hashCode());
        return hashCode;
    }

    @Override
    public GetUtterancesViewRequest clone() {
        return (GetUtterancesViewRequest) super.clone();
    }

}
