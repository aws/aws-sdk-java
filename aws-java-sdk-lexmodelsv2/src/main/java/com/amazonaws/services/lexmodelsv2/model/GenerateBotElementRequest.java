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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/GenerateBotElement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateBotElementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The intent unique Id for the bot request to generate utterances.
     * </p>
     */
    private String intentId;
    /**
     * <p>
     * The bot unique Id for the bot request to generate utterances.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The bot version for the bot request to generate utterances.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The unique locale Id for the bot request to generate utterances.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The intent unique Id for the bot request to generate utterances.
     * </p>
     * 
     * @param intentId
     *        The intent unique Id for the bot request to generate utterances.
     */

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    /**
     * <p>
     * The intent unique Id for the bot request to generate utterances.
     * </p>
     * 
     * @return The intent unique Id for the bot request to generate utterances.
     */

    public String getIntentId() {
        return this.intentId;
    }

    /**
     * <p>
     * The intent unique Id for the bot request to generate utterances.
     * </p>
     * 
     * @param intentId
     *        The intent unique Id for the bot request to generate utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBotElementRequest withIntentId(String intentId) {
        setIntentId(intentId);
        return this;
    }

    /**
     * <p>
     * The bot unique Id for the bot request to generate utterances.
     * </p>
     * 
     * @param botId
     *        The bot unique Id for the bot request to generate utterances.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The bot unique Id for the bot request to generate utterances.
     * </p>
     * 
     * @return The bot unique Id for the bot request to generate utterances.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The bot unique Id for the bot request to generate utterances.
     * </p>
     * 
     * @param botId
     *        The bot unique Id for the bot request to generate utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBotElementRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The bot version for the bot request to generate utterances.
     * </p>
     * 
     * @param botVersion
     *        The bot version for the bot request to generate utterances.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The bot version for the bot request to generate utterances.
     * </p>
     * 
     * @return The bot version for the bot request to generate utterances.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The bot version for the bot request to generate utterances.
     * </p>
     * 
     * @param botVersion
     *        The bot version for the bot request to generate utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBotElementRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The unique locale Id for the bot request to generate utterances.
     * </p>
     * 
     * @param localeId
     *        The unique locale Id for the bot request to generate utterances.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The unique locale Id for the bot request to generate utterances.
     * </p>
     * 
     * @return The unique locale Id for the bot request to generate utterances.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The unique locale Id for the bot request to generate utterances.
     * </p>
     * 
     * @param localeId
     *        The unique locale Id for the bot request to generate utterances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBotElementRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
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
        if (getIntentId() != null)
            sb.append("IntentId: ").append(getIntentId()).append(",");
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateBotElementRequest == false)
            return false;
        GenerateBotElementRequest other = (GenerateBotElementRequest) obj;
        if (other.getIntentId() == null ^ this.getIntentId() == null)
            return false;
        if (other.getIntentId() != null && other.getIntentId().equals(this.getIntentId()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntentId() == null) ? 0 : getIntentId().hashCode());
        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public GenerateBotElementRequest clone() {
        return (GenerateBotElementRequest) super.clone();
    }

}
