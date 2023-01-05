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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a custom vocabulary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Vocabulary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Vocabulary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The timestamp when the custom vocabulary was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The reason why the custom vocabulary was not created.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The content of the custom vocabulary in plain-text format with a table of values. Each row in the table
     * represents a word or a phrase, described with <code>Phrase</code>, <code>IPA</code>, <code>SoundsLike</code>, and
     * <code>DisplayAs</code> fields. Separate the fields with TAB characters. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table">Create a
     * custom vocabulary using a table</a>.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * 
     * @param name
     *        A unique name of the custom vocabulary.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * 
     * @return A unique name of the custom vocabulary.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name of the custom vocabulary.
     * </p>
     * 
     * @param name
     *        A unique name of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vocabulary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * 
     * @param id
     *        The identifier of the custom vocabulary.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * 
     * @return The identifier of the custom vocabulary.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the custom vocabulary.
     * </p>
     * 
     * @param id
     *        The identifier of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vocabulary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the custom vocabulary.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the custom vocabulary.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the custom vocabulary.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vocabulary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries. For a list of languages and their corresponding language
     *        codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *        Amazon Transcribe?</a>
     * @see VocabularyLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @return The language code of the vocabulary entries. For a list of languages and their corresponding language
     *         codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *         Amazon Transcribe?</a>
     * @see VocabularyLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries. For a list of languages and their corresponding language
     *        codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *        Amazon Transcribe?</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyLanguageCode
     */

    public Vocabulary withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries. For a list of languages and their corresponding language codes, see
     * <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is Amazon Transcribe?</a>
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries. For a list of languages and their corresponding language
     *        codes, see <a href="https://docs.aws.amazon.com/transcribe/latest/dg/transcribe-whatis.html">What is
     *        Amazon Transcribe?</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyLanguageCode
     */

    public Vocabulary withLanguageCode(VocabularyLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @param state
     *        The current state of the custom vocabulary.
     * @see VocabularyState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @return The current state of the custom vocabulary.
     * @see VocabularyState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @param state
     *        The current state of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public Vocabulary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the custom vocabulary.
     * </p>
     * 
     * @param state
     *        The current state of the custom vocabulary.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public Vocabulary withState(VocabularyState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the custom vocabulary was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the custom vocabulary was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the custom vocabulary was last modified.
     * </p>
     * 
     * @return The timestamp when the custom vocabulary was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the custom vocabulary was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the custom vocabulary was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vocabulary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The reason why the custom vocabulary was not created.
     * </p>
     * 
     * @param failureReason
     *        The reason why the custom vocabulary was not created.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason why the custom vocabulary was not created.
     * </p>
     * 
     * @return The reason why the custom vocabulary was not created.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason why the custom vocabulary was not created.
     * </p>
     * 
     * @param failureReason
     *        The reason why the custom vocabulary was not created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vocabulary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The content of the custom vocabulary in plain-text format with a table of values. Each row in the table
     * represents a word or a phrase, described with <code>Phrase</code>, <code>IPA</code>, <code>SoundsLike</code>, and
     * <code>DisplayAs</code> fields. Separate the fields with TAB characters. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table">Create a
     * custom vocabulary using a table</a>.
     * </p>
     * 
     * @param content
     *        The content of the custom vocabulary in plain-text format with a table of values. Each row in the table
     *        represents a word or a phrase, described with <code>Phrase</code>, <code>IPA</code>,
     *        <code>SoundsLike</code>, and <code>DisplayAs</code> fields. Separate the fields with TAB characters. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table"
     *        >Create a custom vocabulary using a table</a>.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the custom vocabulary in plain-text format with a table of values. Each row in the table
     * represents a word or a phrase, described with <code>Phrase</code>, <code>IPA</code>, <code>SoundsLike</code>, and
     * <code>DisplayAs</code> fields. Separate the fields with TAB characters. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table">Create a
     * custom vocabulary using a table</a>.
     * </p>
     * 
     * @return The content of the custom vocabulary in plain-text format with a table of values. Each row in the table
     *         represents a word or a phrase, described with <code>Phrase</code>, <code>IPA</code>,
     *         <code>SoundsLike</code>, and <code>DisplayAs</code> fields. Separate the fields with TAB characters. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table"
     *         >Create a custom vocabulary using a table</a>.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the custom vocabulary in plain-text format with a table of values. Each row in the table
     * represents a word or a phrase, described with <code>Phrase</code>, <code>IPA</code>, <code>SoundsLike</code>, and
     * <code>DisplayAs</code> fields. Separate the fields with TAB characters. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table">Create a
     * custom vocabulary using a table</a>.
     * </p>
     * 
     * @param content
     *        The content of the custom vocabulary in plain-text format with a table of values. Each row in the table
     *        represents a word or a phrase, described with <code>Phrase</code>, <code>IPA</code>,
     *        <code>SoundsLike</code>, and <code>DisplayAs</code> fields. Separate the fields with TAB characters. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/custom-vocabulary.html#create-vocabulary-table"
     *        >Create a custom vocabulary using a table</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vocabulary withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Vocabulary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Vocabulary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Vocabulary addTagsEntry(String key, String value) {
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

    public Vocabulary clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Vocabulary == false)
            return false;
        Vocabulary other = (Vocabulary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Vocabulary clone() {
        try {
            return (Vocabulary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.VocabularyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
