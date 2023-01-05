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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateMedicalVocabulary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMedicalVocabularyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name, chosen by you, for your new custom medical vocabulary.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom medical vocabulary with the same name as an existing custom medical vocabulary,
     * you get a <code>ConflictException</code> error.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The language code that represents the language of the entries in your custom vocabulary. US English (
     * <code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary. The URI must be in
     * the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     */
    private String vocabularyFileUri;
    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom medical vocabulary at the
     * time you create this new custom vocabulary.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique name, chosen by you, for your new custom medical vocabulary.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom medical vocabulary with the same name as an existing custom medical vocabulary,
     * you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @param vocabularyName
     *        A unique name, chosen by you, for your new custom medical vocabulary.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new custom medical vocabulary with the same name as an existing custom
     *        medical vocabulary, you get a <code>ConflictException</code> error.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your new custom medical vocabulary.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom medical vocabulary with the same name as an existing custom medical vocabulary,
     * you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @return A unique name, chosen by you, for your new custom medical vocabulary.</p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *         account. If you try to create a new custom medical vocabulary with the same name as an existing custom
     *         medical vocabulary, you get a <code>ConflictException</code> error.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your new custom medical vocabulary.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom medical vocabulary with the same name as an existing custom medical vocabulary,
     * you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @param vocabularyName
     *        A unique name, chosen by you, for your new custom medical vocabulary.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new custom medical vocabulary with the same name as an existing custom
     *        medical vocabulary, you get a <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMedicalVocabularyRequest withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your custom vocabulary. US English (
     * <code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your custom vocabulary. US English (
     *        <code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your custom vocabulary. US English (
     * <code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @return The language code that represents the language of the entries in your custom vocabulary. US English (
     *         <code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your custom vocabulary. US English (
     * <code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your custom vocabulary. US English (
     *        <code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateMedicalVocabularyRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your custom vocabulary. US English (
     * <code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your custom vocabulary. US English (
     *        <code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateMedicalVocabularyRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary. The URI must be in
     * the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * 
     * @param vocabularyFileUri
     *        The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary. The URI must
     *        be in the same Amazon Web Services Region as the resource you're calling.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     */

    public void setVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary. The URI must be in
     * the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * 
     * @return The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary. The URI must
     *         be in the same Amazon Web Services Region as the resource you're calling.</p>
     *         <p>
     *         Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     */

    public String getVocabularyFileUri() {
        return this.vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary. The URI must be in
     * the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * 
     * @param vocabularyFileUri
     *        The Amazon S3 location (URI) of the text file that contains your custom medical vocabulary. The URI must
     *        be in the same Amazon Web Services Region as the resource you're calling.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMedicalVocabularyRequest withVocabularyFileUri(String vocabularyFileUri) {
        setVocabularyFileUri(vocabularyFileUri);
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom medical vocabulary at the
     * time you create this new custom vocabulary.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @return Adds one or more custom tags, each in the form of a key:value pair, to a new custom medical vocabulary at
     *         the time you create this new custom vocabulary.</p>
     *         <p>
     *         To learn more about using tags with Amazon Transcribe, refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom medical vocabulary at the
     * time you create this new custom vocabulary.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new custom medical vocabulary at
     *        the time you create this new custom vocabulary.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom medical vocabulary at the
     * time you create this new custom vocabulary.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new custom medical vocabulary at
     *        the time you create this new custom vocabulary.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMedicalVocabularyRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom medical vocabulary at the
     * time you create this new custom vocabulary.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new custom medical vocabulary at
     *        the time you create this new custom vocabulary.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMedicalVocabularyRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getVocabularyFileUri() != null)
            sb.append("VocabularyFileUri: ").append(getVocabularyFileUri()).append(",");
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

        if (obj instanceof CreateMedicalVocabularyRequest == false)
            return false;
        CreateMedicalVocabularyRequest other = (CreateMedicalVocabularyRequest) obj;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getVocabularyFileUri() == null ^ this.getVocabularyFileUri() == null)
            return false;
        if (other.getVocabularyFileUri() != null && other.getVocabularyFileUri().equals(this.getVocabularyFileUri()) == false)
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

        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFileUri() == null) ? 0 : getVocabularyFileUri().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMedicalVocabularyRequest clone() {
        return (CreateMedicalVocabularyRequest) super.clone();
    }

}
