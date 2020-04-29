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
     * The name of the custom vocabulary. This case-sensitive name must be unique within an AWS account. If you try to
     * create a vocabulary with the same name as a previous vocabulary you will receive a <code>ConflictException</code>
     * error.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The language code used for the entries within your custom vocabulary. The language code of your custom vocabulary
     * must match the language code of your transcription job. US English (en-US) is the only language code available
     * for Amazon Transcribe Medical.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The Amazon S3 location of the text file you use to define your custom vocabulary. The URI must be in the same AWS
     * region as the API endpoint you're calling. Enter information about your <code>VocabularyFileUri</code> in the
     * following format:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * This is an example of a vocabulary file uri location in Amazon S3:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med">Medical Custom
     * Vocabularies</a>.
     * </p>
     */
    private String vocabularyFileUri;

    /**
     * <p>
     * The name of the custom vocabulary. This case-sensitive name must be unique within an AWS account. If you try to
     * create a vocabulary with the same name as a previous vocabulary you will receive a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the custom vocabulary. This case-sensitive name must be unique within an AWS account. If you
     *        try to create a vocabulary with the same name as a previous vocabulary you will receive a
     *        <code>ConflictException</code> error.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary. This case-sensitive name must be unique within an AWS account. If you try to
     * create a vocabulary with the same name as a previous vocabulary you will receive a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @return The name of the custom vocabulary. This case-sensitive name must be unique within an AWS account. If you
     *         try to create a vocabulary with the same name as a previous vocabulary you will receive a
     *         <code>ConflictException</code> error.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the custom vocabulary. This case-sensitive name must be unique within an AWS account. If you try to
     * create a vocabulary with the same name as a previous vocabulary you will receive a <code>ConflictException</code>
     * error.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the custom vocabulary. This case-sensitive name must be unique within an AWS account. If you
     *        try to create a vocabulary with the same name as a previous vocabulary you will receive a
     *        <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMedicalVocabularyRequest withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The language code used for the entries within your custom vocabulary. The language code of your custom vocabulary
     * must match the language code of your transcription job. US English (en-US) is the only language code available
     * for Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code used for the entries within your custom vocabulary. The language code of your custom
     *        vocabulary must match the language code of your transcription job. US English (en-US) is the only language
     *        code available for Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code used for the entries within your custom vocabulary. The language code of your custom vocabulary
     * must match the language code of your transcription job. US English (en-US) is the only language code available
     * for Amazon Transcribe Medical.
     * </p>
     * 
     * @return The language code used for the entries within your custom vocabulary. The language code of your custom
     *         vocabulary must match the language code of your transcription job. US English (en-US) is the only
     *         language code available for Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code used for the entries within your custom vocabulary. The language code of your custom vocabulary
     * must match the language code of your transcription job. US English (en-US) is the only language code available
     * for Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code used for the entries within your custom vocabulary. The language code of your custom
     *        vocabulary must match the language code of your transcription job. US English (en-US) is the only language
     *        code available for Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateMedicalVocabularyRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code used for the entries within your custom vocabulary. The language code of your custom vocabulary
     * must match the language code of your transcription job. US English (en-US) is the only language code available
     * for Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code used for the entries within your custom vocabulary. The language code of your custom
     *        vocabulary must match the language code of your transcription job. US English (en-US) is the only language
     *        code available for Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateMedicalVocabularyRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file you use to define your custom vocabulary. The URI must be in the same AWS
     * region as the API endpoint you're calling. Enter information about your <code>VocabularyFileUri</code> in the
     * following format:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * This is an example of a vocabulary file uri location in Amazon S3:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med">Medical Custom
     * Vocabularies</a>.
     * </p>
     * 
     * @param vocabularyFileUri
     *        The Amazon S3 location of the text file you use to define your custom vocabulary. The URI must be in the
     *        same AWS region as the API endpoint you're calling. Enter information about your
     *        <code>VocabularyFileUri</code> in the following format:</p>
     *        <p>
     *        <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        This is an example of a vocabulary file uri location in Amazon S3:
     *        </p>
     *        <p>
     *        <code>https://s3.us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     *        </p>
     *        <p>
     *        For more information about S3 object names, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *        the <i>Amazon S3 Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information about custom vocabularies, see <a
     *        href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med">Medical Custom
     *        Vocabularies</a>.
     */

    public void setVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file you use to define your custom vocabulary. The URI must be in the same AWS
     * region as the API endpoint you're calling. Enter information about your <code>VocabularyFileUri</code> in the
     * following format:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * This is an example of a vocabulary file uri location in Amazon S3:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med">Medical Custom
     * Vocabularies</a>.
     * </p>
     * 
     * @return The Amazon S3 location of the text file you use to define your custom vocabulary. The URI must be in the
     *         same AWS region as the API endpoint you're calling. Enter information about your
     *         <code>VocabularyFileUri</code> in the following format:</p>
     *         <p>
     *         <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *         </p>
     *         <p>
     *         This is an example of a vocabulary file uri location in Amazon S3:
     *         </p>
     *         <p>
     *         <code>https://s3.us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     *         </p>
     *         <p>
     *         For more information about S3 object names, see <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *         the <i>Amazon S3 Developer Guide</i>.
     *         </p>
     *         <p>
     *         For more information about custom vocabularies, see <a
     *         href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med">Medical
     *         Custom Vocabularies</a>.
     */

    public String getVocabularyFileUri() {
        return this.vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file you use to define your custom vocabulary. The URI must be in the same AWS
     * region as the API endpoint you're calling. Enter information about your <code>VocabularyFileUri</code> in the
     * following format:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * This is an example of a vocabulary file uri location in Amazon S3:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med">Medical Custom
     * Vocabularies</a>.
     * </p>
     * 
     * @param vocabularyFileUri
     *        The Amazon S3 location of the text file you use to define your custom vocabulary. The URI must be in the
     *        same AWS region as the API endpoint you're calling. Enter information about your
     *        <code>VocabularyFileUri</code> in the following format:</p>
     *        <p>
     *        <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        This is an example of a vocabulary file uri location in Amazon S3:
     *        </p>
     *        <p>
     *        <code>https://s3.us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     *        </p>
     *        <p>
     *        For more information about S3 object names, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *        the <i>Amazon S3 Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information about custom vocabularies, see <a
     *        href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary-med">Medical Custom
     *        Vocabularies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMedicalVocabularyRequest withVocabularyFileUri(String vocabularyFileUri) {
        setVocabularyFileUri(vocabularyFileUri);
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
            sb.append("VocabularyFileUri: ").append(getVocabularyFileUri());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFileUri() == null) ? 0 : getVocabularyFileUri().hashCode());
        return hashCode;
    }

    @Override
    public CreateMedicalVocabularyRequest clone() {
        return (CreateMedicalVocabularyRequest) super.clone();
    }

}
