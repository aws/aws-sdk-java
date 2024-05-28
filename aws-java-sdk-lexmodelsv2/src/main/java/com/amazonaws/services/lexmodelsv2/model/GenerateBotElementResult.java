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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/GenerateBotElement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateBotElementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique bot Id for the bot which received the response.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The unique bot version for the bot which received the response.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The unique locale Id for the bot which received the response.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The unique intent Id for the bot which received the response.
     * </p>
     */
    private String intentId;
    /**
     * <p>
     * The sample utterances for the bot which received the response.
     * </p>
     */
    private java.util.List<SampleUtterance> sampleUtterances;

    /**
     * <p>
     * The unique bot Id for the bot which received the response.
     * </p>
     * 
     * @param botId
     *        The unique bot Id for the bot which received the response.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique bot Id for the bot which received the response.
     * </p>
     * 
     * @return The unique bot Id for the bot which received the response.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique bot Id for the bot which received the response.
     * </p>
     * 
     * @param botId
     *        The unique bot Id for the bot which received the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBotElementResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The unique bot version for the bot which received the response.
     * </p>
     * 
     * @param botVersion
     *        The unique bot version for the bot which received the response.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The unique bot version for the bot which received the response.
     * </p>
     * 
     * @return The unique bot version for the bot which received the response.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The unique bot version for the bot which received the response.
     * </p>
     * 
     * @param botVersion
     *        The unique bot version for the bot which received the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBotElementResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The unique locale Id for the bot which received the response.
     * </p>
     * 
     * @param localeId
     *        The unique locale Id for the bot which received the response.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The unique locale Id for the bot which received the response.
     * </p>
     * 
     * @return The unique locale Id for the bot which received the response.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The unique locale Id for the bot which received the response.
     * </p>
     * 
     * @param localeId
     *        The unique locale Id for the bot which received the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBotElementResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The unique intent Id for the bot which received the response.
     * </p>
     * 
     * @param intentId
     *        The unique intent Id for the bot which received the response.
     */

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    /**
     * <p>
     * The unique intent Id for the bot which received the response.
     * </p>
     * 
     * @return The unique intent Id for the bot which received the response.
     */

    public String getIntentId() {
        return this.intentId;
    }

    /**
     * <p>
     * The unique intent Id for the bot which received the response.
     * </p>
     * 
     * @param intentId
     *        The unique intent Id for the bot which received the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBotElementResult withIntentId(String intentId) {
        setIntentId(intentId);
        return this;
    }

    /**
     * <p>
     * The sample utterances for the bot which received the response.
     * </p>
     * 
     * @return The sample utterances for the bot which received the response.
     */

    public java.util.List<SampleUtterance> getSampleUtterances() {
        return sampleUtterances;
    }

    /**
     * <p>
     * The sample utterances for the bot which received the response.
     * </p>
     * 
     * @param sampleUtterances
     *        The sample utterances for the bot which received the response.
     */

    public void setSampleUtterances(java.util.Collection<SampleUtterance> sampleUtterances) {
        if (sampleUtterances == null) {
            this.sampleUtterances = null;
            return;
        }

        this.sampleUtterances = new java.util.ArrayList<SampleUtterance>(sampleUtterances);
    }

    /**
     * <p>
     * The sample utterances for the bot which received the response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSampleUtterances(java.util.Collection)} or {@link #withSampleUtterances(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sampleUtterances
     *        The sample utterances for the bot which received the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBotElementResult withSampleUtterances(SampleUtterance... sampleUtterances) {
        if (this.sampleUtterances == null) {
            setSampleUtterances(new java.util.ArrayList<SampleUtterance>(sampleUtterances.length));
        }
        for (SampleUtterance ele : sampleUtterances) {
            this.sampleUtterances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sample utterances for the bot which received the response.
     * </p>
     * 
     * @param sampleUtterances
     *        The sample utterances for the bot which received the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBotElementResult withSampleUtterances(java.util.Collection<SampleUtterance> sampleUtterances) {
        setSampleUtterances(sampleUtterances);
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
        if (getSampleUtterances() != null)
            sb.append("SampleUtterances: ").append(getSampleUtterances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateBotElementResult == false)
            return false;
        GenerateBotElementResult other = (GenerateBotElementResult) obj;
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
        if (other.getSampleUtterances() == null ^ this.getSampleUtterances() == null)
            return false;
        if (other.getSampleUtterances() != null && other.getSampleUtterances().equals(this.getSampleUtterances()) == false)
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
        hashCode = prime * hashCode + ((getSampleUtterances() == null) ? 0 : getSampleUtterances().hashCode());
        return hashCode;
    }

    @Override
    public GenerateBotElementResult clone() {
        try {
            return (GenerateBotElementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
