/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the content and settings for a message template that can be used in messages that are sent
 * through the voice channel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/VoiceTemplateResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VoiceTemplateResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The text of the script that's used in messages that are based on the message template, in plain text format.
     * </p>
     */
    private String body;
    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The JSON object that specifies the default values that are used for message variables in the message template.
     * This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding
     * value defines the default value for that variable.
     * </p>
     */
    private String defaultSubstitutions;
    /**
     * <p>
     * The code for the language that's used when synthesizing the text of the script in messages that are based on the
     * message template. For a list of supported languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The custom description of the message template.
     * </p>
     */
    private String templateDescription;
    /**
     * <p>
     * The name of the message template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The type of channel that the message template is designed for. For a voice template, this value is VOICE.
     * </p>
     */
    private String templateType;
    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the message template, or the version of the
     * template that you specified by using the version parameter in your request.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The name of the voice that's used when delivering messages that are based on the message template. For a list of
     * supported voices, see the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly
     * Developer Guide</a>.
     * </p>
     */
    private String voiceId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the message template.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the message template.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the message template.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The text of the script that's used in messages that are based on the message template, in plain text format.
     * </p>
     * 
     * @param body
     *        The text of the script that's used in messages that are based on the message template, in plain text
     *        format.
     */

    public void setBody(String body) {
        this.body = body;
    }

    /**
     * <p>
     * The text of the script that's used in messages that are based on the message template, in plain text format.
     * </p>
     * 
     * @return The text of the script that's used in messages that are based on the message template, in plain text
     *         format.
     */

    public String getBody() {
        return this.body;
    }

    /**
     * <p>
     * The text of the script that's used in messages that are based on the message template, in plain text format.
     * </p>
     * 
     * @param body
     *        The text of the script that's used in messages that are based on the message template, in plain text
     *        format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withBody(String body) {
        setBody(body);
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     * 
     * @param creationDate
     *        The date, in ISO 8601 format, when the message template was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the message template was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was created.
     * </p>
     * 
     * @param creationDate
     *        The date, in ISO 8601 format, when the message template was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The JSON object that specifies the default values that are used for message variables in the message template.
     * This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding
     * value defines the default value for that variable.
     * </p>
     * 
     * @param defaultSubstitutions
     *        The JSON object that specifies the default values that are used for message variables in the message
     *        template. This object is a set of key-value pairs. Each key defines a message variable in the template.
     *        The corresponding value defines the default value for that variable.
     */

    public void setDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
    }

    /**
     * <p>
     * The JSON object that specifies the default values that are used for message variables in the message template.
     * This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding
     * value defines the default value for that variable.
     * </p>
     * 
     * @return The JSON object that specifies the default values that are used for message variables in the message
     *         template. This object is a set of key-value pairs. Each key defines a message variable in the template.
     *         The corresponding value defines the default value for that variable.
     */

    public String getDefaultSubstitutions() {
        return this.defaultSubstitutions;
    }

    /**
     * <p>
     * The JSON object that specifies the default values that are used for message variables in the message template.
     * This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding
     * value defines the default value for that variable.
     * </p>
     * 
     * @param defaultSubstitutions
     *        The JSON object that specifies the default values that are used for message variables in the message
     *        template. This object is a set of key-value pairs. Each key defines a message variable in the template.
     *        The corresponding value defines the default value for that variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withDefaultSubstitutions(String defaultSubstitutions) {
        setDefaultSubstitutions(defaultSubstitutions);
        return this;
    }

    /**
     * <p>
     * The code for the language that's used when synthesizing the text of the script in messages that are based on the
     * message template. For a list of supported languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     * 
     * @param languageCode
     *        The code for the language that's used when synthesizing the text of the script in messages that are based
     *        on the message template. For a list of supported languages and the code for each one, see the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The code for the language that's used when synthesizing the text of the script in messages that are based on the
     * message template. For a list of supported languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     * 
     * @return The code for the language that's used when synthesizing the text of the script in messages that are based
     *         on the message template. For a list of supported languages and the code for each one, see the <a
     *         href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The code for the language that's used when synthesizing the text of the script in messages that are based on the
     * message template. For a list of supported languages and the code for each one, see the <a
     * href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * </p>
     * 
     * @param languageCode
     *        The code for the language that's used when synthesizing the text of the script in messages that are based
     *        on the message template. For a list of supported languages and the code for each one, see the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in ISO 8601 format, when the message template was last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last modified.
     * </p>
     * 
     * @return The date, in ISO 8601 format, when the message template was last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the message template was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date, in ISO 8601 format, when the message template was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @return A string-to-string map of key-value pairs that identifies the tags that are associated with the message
     *         template. Each tag consists of a required tag key and an associated tag value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that identifies the tags that are associated with the message
     *        template. Each tag consists of a required tag key and an associated tag value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template.
     * Each tag consists of a required tag key and an associated tag value.
     * </p>
     * 
     * @param tags
     *        A string-to-string map of key-value pairs that identifies the tags that are associated with the message
     *        template. Each tag consists of a required tag key and an associated tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see VoiceTemplateResponse#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The custom description of the message template.
     * </p>
     * 
     * @param templateDescription
     *        The custom description of the message template.
     */

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * The custom description of the message template.
     * </p>
     * 
     * @return The custom description of the message template.
     */

    public String getTemplateDescription() {
        return this.templateDescription;
    }

    /**
     * <p>
     * The custom description of the message template.
     * </p>
     * 
     * @param templateDescription
     *        The custom description of the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withTemplateDescription(String templateDescription) {
        setTemplateDescription(templateDescription);
        return this;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * 
     * @param templateName
     *        The name of the message template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * 
     * @return The name of the message template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * 
     * @param templateName
     *        The name of the message template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a voice template, this value is VOICE.
     * </p>
     * 
     * @param templateType
     *        The type of channel that the message template is designed for. For a voice template, this value is VOICE.
     * @see TemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a voice template, this value is VOICE.
     * </p>
     * 
     * @return The type of channel that the message template is designed for. For a voice template, this value is VOICE.
     * @see TemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a voice template, this value is VOICE.
     * </p>
     * 
     * @param templateType
     *        The type of channel that the message template is designed for. For a voice template, this value is VOICE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public VoiceTemplateResponse withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. For a voice template, this value is VOICE.
     * </p>
     * 
     * @param templateType
     *        The type of channel that the message template is designed for. For a voice template, this value is VOICE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public VoiceTemplateResponse withTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the message template, or the version of the
     * template that you specified by using the version parameter in your request.
     * </p>
     * 
     * @param version
     *        The unique identifier, as an integer, for the active version of the message template, or the version of
     *        the template that you specified by using the version parameter in your request.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the message template, or the version of the
     * template that you specified by using the version parameter in your request.
     * </p>
     * 
     * @return The unique identifier, as an integer, for the active version of the message template, or the version of
     *         the template that you specified by using the version parameter in your request.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The unique identifier, as an integer, for the active version of the message template, or the version of the
     * template that you specified by using the version parameter in your request.
     * </p>
     * 
     * @param version
     *        The unique identifier, as an integer, for the active version of the message template, or the version of
     *        the template that you specified by using the version parameter in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The name of the voice that's used when delivering messages that are based on the message template. For a list of
     * supported voices, see the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly
     * Developer Guide</a>.
     * </p>
     * 
     * @param voiceId
     *        The name of the voice that's used when delivering messages that are based on the message template. For a
     *        list of supported voices, see the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     */

    public void setVoiceId(String voiceId) {
        this.voiceId = voiceId;
    }

    /**
     * <p>
     * The name of the voice that's used when delivering messages that are based on the message template. For a list of
     * supported voices, see the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly
     * Developer Guide</a>.
     * </p>
     * 
     * @return The name of the voice that's used when delivering messages that are based on the message template. For a
     *         list of supported voices, see the <a
     *         href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     */

    public String getVoiceId() {
        return this.voiceId;
    }

    /**
     * <p>
     * The name of the voice that's used when delivering messages that are based on the message template. For a list of
     * supported voices, see the <a href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly
     * Developer Guide</a>.
     * </p>
     * 
     * @param voiceId
     *        The name of the voice that's used when delivering messages that are based on the message template. For a
     *        list of supported voices, see the <a
     *        href="https://docs.aws.amazon.com/polly/latest/dg/what-is.html">Amazon Polly Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VoiceTemplateResponse withVoiceId(String voiceId) {
        setVoiceId(voiceId);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBody() != null)
            sb.append("Body: ").append(getBody()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDefaultSubstitutions() != null)
            sb.append("DefaultSubstitutions: ").append(getDefaultSubstitutions()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: ").append(getTemplateDescription()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getVoiceId() != null)
            sb.append("VoiceId: ").append(getVoiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VoiceTemplateResponse == false)
            return false;
        VoiceTemplateResponse other = (VoiceTemplateResponse) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBody() == null ^ this.getBody() == null)
            return false;
        if (other.getBody() != null && other.getBody().equals(this.getBody()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefaultSubstitutions() == null ^ this.getDefaultSubstitutions() == null)
            return false;
        if (other.getDefaultSubstitutions() != null && other.getDefaultSubstitutions().equals(this.getDefaultSubstitutions()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVoiceId() == null ^ this.getVoiceId() == null)
            return false;
        if (other.getVoiceId() != null && other.getVoiceId().equals(this.getVoiceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBody() == null) ? 0 : getBody().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDefaultSubstitutions() == null) ? 0 : getDefaultSubstitutions().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVoiceId() == null) ? 0 : getVoiceId().hashCode());
        return hashCode;
    }

    @Override
    public VoiceTemplateResponse clone() {
        try {
            return (VoiceTemplateResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.VoiceTemplateResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
