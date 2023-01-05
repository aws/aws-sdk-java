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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeCustomVocabularyMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomVocabularyMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifier of the bot that contains the custom vocabulary.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot that contains the custom vocabulary to describe.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The locale that contains the custom vocabulary to describe.
     * </p>
     */
    private String localeId;
    /**
     * <p>
     * The status of the custom vocabulary. If the status is <code>Ready</code> the custom vocabulary is ready to use.
     * </p>
     */
    private String customVocabularyStatus;
    /**
     * <p>
     * The date and time that the custom vocabulary was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time that the custom vocabulary was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The identifier of the bot that contains the custom vocabulary.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the custom vocabulary.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the custom vocabulary.
     * </p>
     * 
     * @return The identifier of the bot that contains the custom vocabulary.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot that contains the custom vocabulary.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot that contains the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomVocabularyMetadataResult withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot that contains the custom vocabulary to describe.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the custom vocabulary to describe.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the custom vocabulary to describe.
     * </p>
     * 
     * @return The version of the bot that contains the custom vocabulary to describe.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot that contains the custom vocabulary to describe.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot that contains the custom vocabulary to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomVocabularyMetadataResult withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The locale that contains the custom vocabulary to describe.
     * </p>
     * 
     * @param localeId
     *        The locale that contains the custom vocabulary to describe.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The locale that contains the custom vocabulary to describe.
     * </p>
     * 
     * @return The locale that contains the custom vocabulary to describe.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The locale that contains the custom vocabulary to describe.
     * </p>
     * 
     * @param localeId
     *        The locale that contains the custom vocabulary to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomVocabularyMetadataResult withLocaleId(String localeId) {
        setLocaleId(localeId);
        return this;
    }

    /**
     * <p>
     * The status of the custom vocabulary. If the status is <code>Ready</code> the custom vocabulary is ready to use.
     * </p>
     * 
     * @param customVocabularyStatus
     *        The status of the custom vocabulary. If the status is <code>Ready</code> the custom vocabulary is ready to
     *        use.
     * @see CustomVocabularyStatus
     */

    public void setCustomVocabularyStatus(String customVocabularyStatus) {
        this.customVocabularyStatus = customVocabularyStatus;
    }

    /**
     * <p>
     * The status of the custom vocabulary. If the status is <code>Ready</code> the custom vocabulary is ready to use.
     * </p>
     * 
     * @return The status of the custom vocabulary. If the status is <code>Ready</code> the custom vocabulary is ready
     *         to use.
     * @see CustomVocabularyStatus
     */

    public String getCustomVocabularyStatus() {
        return this.customVocabularyStatus;
    }

    /**
     * <p>
     * The status of the custom vocabulary. If the status is <code>Ready</code> the custom vocabulary is ready to use.
     * </p>
     * 
     * @param customVocabularyStatus
     *        The status of the custom vocabulary. If the status is <code>Ready</code> the custom vocabulary is ready to
     *        use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomVocabularyStatus
     */

    public DescribeCustomVocabularyMetadataResult withCustomVocabularyStatus(String customVocabularyStatus) {
        setCustomVocabularyStatus(customVocabularyStatus);
        return this;
    }

    /**
     * <p>
     * The status of the custom vocabulary. If the status is <code>Ready</code> the custom vocabulary is ready to use.
     * </p>
     * 
     * @param customVocabularyStatus
     *        The status of the custom vocabulary. If the status is <code>Ready</code> the custom vocabulary is ready to
     *        use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomVocabularyStatus
     */

    public DescribeCustomVocabularyMetadataResult withCustomVocabularyStatus(CustomVocabularyStatus customVocabularyStatus) {
        this.customVocabularyStatus = customVocabularyStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the custom vocabulary was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the custom vocabulary was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time that the custom vocabulary was created.
     * </p>
     * 
     * @return The date and time that the custom vocabulary was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time that the custom vocabulary was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the custom vocabulary was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomVocabularyMetadataResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the custom vocabulary was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the custom vocabulary was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the custom vocabulary was last updated.
     * </p>
     * 
     * @return The date and time that the custom vocabulary was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the custom vocabulary was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the custom vocabulary was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomVocabularyMetadataResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getCustomVocabularyStatus() != null)
            sb.append("CustomVocabularyStatus: ").append(getCustomVocabularyStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCustomVocabularyMetadataResult == false)
            return false;
        DescribeCustomVocabularyMetadataResult other = (DescribeCustomVocabularyMetadataResult) obj;
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
        if (other.getCustomVocabularyStatus() == null ^ this.getCustomVocabularyStatus() == null)
            return false;
        if (other.getCustomVocabularyStatus() != null && other.getCustomVocabularyStatus().equals(this.getCustomVocabularyStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
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
        hashCode = prime * hashCode + ((getCustomVocabularyStatus() == null) ? 0 : getCustomVocabularyStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomVocabularyMetadataResult clone() {
        try {
            return (DescribeCustomVocabularyMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
