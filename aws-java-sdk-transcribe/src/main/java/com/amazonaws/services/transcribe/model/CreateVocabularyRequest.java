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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabulary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVocabularyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * An array of strings that contains the vocabulary entries.
     * </p>
     */
    private java.util.List<String> phrases;
    /**
     * <p>
     * The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in the
     * same region as the API endpoint that you are calling. The general form is
     * </p>
     * <p>
     * <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Custom Vocabularies</a>.
     * </p>
     */
    private String vocabularyFileUri;

    /**
     * <p>
     * The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive.
     * </p>
     * 
     * @return The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary. The name must be unique within an AWS account. The name is case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyRequest withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @return The language code of the vocabulary entries.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateVocabularyRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The language code of the vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateVocabularyRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * An array of strings that contains the vocabulary entries.
     * </p>
     * 
     * @return An array of strings that contains the vocabulary entries.
     */

    public java.util.List<String> getPhrases() {
        return phrases;
    }

    /**
     * <p>
     * An array of strings that contains the vocabulary entries.
     * </p>
     * 
     * @param phrases
     *        An array of strings that contains the vocabulary entries.
     */

    public void setPhrases(java.util.Collection<String> phrases) {
        if (phrases == null) {
            this.phrases = null;
            return;
        }

        this.phrases = new java.util.ArrayList<String>(phrases);
    }

    /**
     * <p>
     * An array of strings that contains the vocabulary entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhrases(java.util.Collection)} or {@link #withPhrases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param phrases
     *        An array of strings that contains the vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyRequest withPhrases(String... phrases) {
        if (this.phrases == null) {
            setPhrases(new java.util.ArrayList<String>(phrases.length));
        }
        for (String ele : phrases) {
            this.phrases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that contains the vocabulary entries.
     * </p>
     * 
     * @param phrases
     *        An array of strings that contains the vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyRequest withPhrases(java.util.Collection<String> phrases) {
        setPhrases(phrases);
        return this;
    }

    /**
     * <p>
     * The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in the
     * same region as the API endpoint that you are calling. The general form is
     * </p>
     * <p>
     * <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Custom Vocabularies</a>.
     * </p>
     * 
     * @param vocabularyFileUri
     *        The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in
     *        the same region as the API endpoint that you are calling. The general form is </p>
     *        <p>
     *        <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>https://s3-us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     *        </p>
     *        <p>
     *        For more information about S3 object names, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *        the <i>Amazon S3 Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information about custom vocabularies, see <a
     *        href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Custom
     *        Vocabularies</a>.
     */

    public void setVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
    }

    /**
     * <p>
     * The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in the
     * same region as the API endpoint that you are calling. The general form is
     * </p>
     * <p>
     * <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Custom Vocabularies</a>.
     * </p>
     * 
     * @return The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be
     *         in the same region as the API endpoint that you are calling. The general form is </p>
     *         <p>
     *         <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <p>
     *         <code>https://s3-us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     *         </p>
     *         <p>
     *         For more information about S3 object names, see <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *         the <i>Amazon S3 Developer Guide</i>.
     *         </p>
     *         <p>
     *         For more information about custom vocabularies, see <a
     *         href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Custom
     *         Vocabularies</a>.
     */

    public String getVocabularyFileUri() {
        return this.vocabularyFileUri;
    }

    /**
     * <p>
     * The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in the
     * same region as the API endpoint that you are calling. The general form is
     * </p>
     * <p>
     * <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3-us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     * </p>
     * <p>
     * For more information about S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Custom Vocabularies</a>.
     * </p>
     * 
     * @param vocabularyFileUri
     *        The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in
     *        the same region as the API endpoint that you are calling. The general form is </p>
     *        <p>
     *        <code> https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>https://s3-us-east-1.amazonaws.com/examplebucket/vocab.txt</code>
     *        </p>
     *        <p>
     *        For more information about S3 object names, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *        the <i>Amazon S3 Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information about custom vocabularies, see <a
     *        href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Custom
     *        Vocabularies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyRequest withVocabularyFileUri(String vocabularyFileUri) {
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
        if (getPhrases() != null)
            sb.append("Phrases: ").append(getPhrases()).append(",");
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

        if (obj instanceof CreateVocabularyRequest == false)
            return false;
        CreateVocabularyRequest other = (CreateVocabularyRequest) obj;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getPhrases() == null ^ this.getPhrases() == null)
            return false;
        if (other.getPhrases() != null && other.getPhrases().equals(this.getPhrases()) == false)
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
        hashCode = prime * hashCode + ((getPhrases() == null) ? 0 : getPhrases().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFileUri() == null) ? 0 : getVocabularyFileUri().hashCode());
        return hashCode;
    }

    @Override
    public CreateVocabularyRequest clone() {
        return (CreateVocabularyRequest) super.clone();
    }

}
