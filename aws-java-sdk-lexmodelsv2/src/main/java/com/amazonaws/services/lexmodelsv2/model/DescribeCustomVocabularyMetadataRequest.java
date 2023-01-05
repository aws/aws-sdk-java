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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeCustomVocabularyMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomVocabularyMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the bot that contains the custom vocabulary.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The bot version of the bot to return metadata for.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale to return the custom vocabulary information for. The locale must be <code>en_GB</code>.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The unique identifier of the bot that contains the custom vocabulary.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the custom vocabulary.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the custom vocabulary.
     * </p>
     * 
     * @return The unique identifier of the bot that contains the custom vocabulary.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The unique identifier of the bot that contains the custom vocabulary.
     * </p>
     * 
     * @param botId
     *        The unique identifier of the bot that contains the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomVocabularyMetadataRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The bot version of the bot to return metadata for.
     * </p>
     * 
     * @param botVersion
     *        The bot version of the bot to return metadata for.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The bot version of the bot to return metadata for.
     * </p>
     * 
     * @return The bot version of the bot to return metadata for.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The bot version of the bot to return metadata for.
     * </p>
     * 
     * @param botVersion
     *        The bot version of the bot to return metadata for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomVocabularyMetadataRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale to return the custom vocabulary information for. The locale must be <code>en_GB</code>.
     * </p>
     * 
     * @param localeId
     *        The locale to return the custom vocabulary information for. The locale must be <code>en_GB</code>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale to return the custom vocabulary information for. The locale must be <code>en_GB</code>.
     * </p>
     * 
     * @return The locale to return the custom vocabulary information for. The locale must be <code>en_GB</code>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale to return the custom vocabulary information for. The locale must be <code>en_GB</code>.
     * </p>
     * 
     * @param localeId
     *        The locale to return the custom vocabulary information for. The locale must be <code>en_GB</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomVocabularyMetadataRequest withLocaleId(String localeId) {
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

        if (obj instanceof DescribeCustomVocabularyMetadataRequest == false)
            return false;
        DescribeCustomVocabularyMetadataRequest other = (DescribeCustomVocabularyMetadataRequest) obj;
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

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomVocabularyMetadataRequest clone() {
        return (DescribeCustomVocabularyMetadataRequest) super.clone();
    }

}
