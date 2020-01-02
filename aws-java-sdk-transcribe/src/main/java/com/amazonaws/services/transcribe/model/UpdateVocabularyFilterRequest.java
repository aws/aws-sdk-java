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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateVocabularyFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVocabularyFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the vocabulary filter to update.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * The words to use in the vocabulary filter. Only use characters from the character set defined for custom
     * vocabularies. For a list of character sets, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for Custom
     * Vocabularies</a>.
     * </p>
     * <p>
     * If you provide a list of words in the <code>Words</code> parameter, you can't use the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     */
    private java.util.List<String> words;
    /**
     * <p>
     * The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters from the
     * character set defined for custom vocabularies. For a list of character sets, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for Custom
     * Vocabularies</a>.
     * </p>
     * <p>
     * The specified file must be less than 50 KB of UTF-8 characters.
     * </p>
     * <p>
     * If you provide the location of a list of words in the <code>VocabularyFilterFileUri</code> parameter, you can't
     * use the <code>Words</code> parameter.
     * </p>
     */
    private String vocabularyFilterFileUri;

    /**
     * <p>
     * The name of the vocabulary filter to update.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter to update.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter to update.
     * </p>
     * 
     * @return The name of the vocabulary filter to update.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter to update.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVocabularyFilterRequest withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * The words to use in the vocabulary filter. Only use characters from the character set defined for custom
     * vocabularies. For a list of character sets, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for Custom
     * Vocabularies</a>.
     * </p>
     * <p>
     * If you provide a list of words in the <code>Words</code> parameter, you can't use the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * 
     * @return The words to use in the vocabulary filter. Only use characters from the character set defined for custom
     *         vocabularies. For a list of character sets, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for
     *         Custom Vocabularies</a>.</p>
     *         <p>
     *         If you provide a list of words in the <code>Words</code> parameter, you can't use the
     *         <code>VocabularyFilterFileUri</code> parameter.
     */

    public java.util.List<String> getWords() {
        return words;
    }

    /**
     * <p>
     * The words to use in the vocabulary filter. Only use characters from the character set defined for custom
     * vocabularies. For a list of character sets, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for Custom
     * Vocabularies</a>.
     * </p>
     * <p>
     * If you provide a list of words in the <code>Words</code> parameter, you can't use the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * 
     * @param words
     *        The words to use in the vocabulary filter. Only use characters from the character set defined for custom
     *        vocabularies. For a list of character sets, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for
     *        Custom Vocabularies</a>.</p>
     *        <p>
     *        If you provide a list of words in the <code>Words</code> parameter, you can't use the
     *        <code>VocabularyFilterFileUri</code> parameter.
     */

    public void setWords(java.util.Collection<String> words) {
        if (words == null) {
            this.words = null;
            return;
        }

        this.words = new java.util.ArrayList<String>(words);
    }

    /**
     * <p>
     * The words to use in the vocabulary filter. Only use characters from the character set defined for custom
     * vocabularies. For a list of character sets, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for Custom
     * Vocabularies</a>.
     * </p>
     * <p>
     * If you provide a list of words in the <code>Words</code> parameter, you can't use the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWords(java.util.Collection)} or {@link #withWords(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param words
     *        The words to use in the vocabulary filter. Only use characters from the character set defined for custom
     *        vocabularies. For a list of character sets, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for
     *        Custom Vocabularies</a>.</p>
     *        <p>
     *        If you provide a list of words in the <code>Words</code> parameter, you can't use the
     *        <code>VocabularyFilterFileUri</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVocabularyFilterRequest withWords(String... words) {
        if (this.words == null) {
            setWords(new java.util.ArrayList<String>(words.length));
        }
        for (String ele : words) {
            this.words.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The words to use in the vocabulary filter. Only use characters from the character set defined for custom
     * vocabularies. For a list of character sets, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for Custom
     * Vocabularies</a>.
     * </p>
     * <p>
     * If you provide a list of words in the <code>Words</code> parameter, you can't use the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * 
     * @param words
     *        The words to use in the vocabulary filter. Only use characters from the character set defined for custom
     *        vocabularies. For a list of character sets, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for
     *        Custom Vocabularies</a>.</p>
     *        <p>
     *        If you provide a list of words in the <code>Words</code> parameter, you can't use the
     *        <code>VocabularyFilterFileUri</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVocabularyFilterRequest withWords(java.util.Collection<String> words) {
        setWords(words);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters from the
     * character set defined for custom vocabularies. For a list of character sets, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for Custom
     * Vocabularies</a>.
     * </p>
     * <p>
     * The specified file must be less than 50 KB of UTF-8 characters.
     * </p>
     * <p>
     * If you provide the location of a list of words in the <code>VocabularyFilterFileUri</code> parameter, you can't
     * use the <code>Words</code> parameter.
     * </p>
     * 
     * @param vocabularyFilterFileUri
     *        The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters
     *        from the character set defined for custom vocabularies. For a list of character sets, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for
     *        Custom Vocabularies</a>.</p>
     *        <p>
     *        The specified file must be less than 50 KB of UTF-8 characters.
     *        </p>
     *        <p>
     *        If you provide the location of a list of words in the <code>VocabularyFilterFileUri</code> parameter, you
     *        can't use the <code>Words</code> parameter.
     */

    public void setVocabularyFilterFileUri(String vocabularyFilterFileUri) {
        this.vocabularyFilterFileUri = vocabularyFilterFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters from the
     * character set defined for custom vocabularies. For a list of character sets, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for Custom
     * Vocabularies</a>.
     * </p>
     * <p>
     * The specified file must be less than 50 KB of UTF-8 characters.
     * </p>
     * <p>
     * If you provide the location of a list of words in the <code>VocabularyFilterFileUri</code> parameter, you can't
     * use the <code>Words</code> parameter.
     * </p>
     * 
     * @return The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters
     *         from the character set defined for custom vocabularies. For a list of character sets, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for
     *         Custom Vocabularies</a>.</p>
     *         <p>
     *         The specified file must be less than 50 KB of UTF-8 characters.
     *         </p>
     *         <p>
     *         If you provide the location of a list of words in the <code>VocabularyFilterFileUri</code> parameter, you
     *         can't use the <code>Words</code> parameter.
     */

    public String getVocabularyFilterFileUri() {
        return this.vocabularyFilterFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters from the
     * character set defined for custom vocabularies. For a list of character sets, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for Custom
     * Vocabularies</a>.
     * </p>
     * <p>
     * The specified file must be less than 50 KB of UTF-8 characters.
     * </p>
     * <p>
     * If you provide the location of a list of words in the <code>VocabularyFilterFileUri</code> parameter, you can't
     * use the <code>Words</code> parameter.
     * </p>
     * 
     * @param vocabularyFilterFileUri
     *        The Amazon S3 location of a text file used as input to create the vocabulary filter. Only use characters
     *        from the character set defined for custom vocabularies. For a list of character sets, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-vocabulary.html#charsets">Character Sets for
     *        Custom Vocabularies</a>.</p>
     *        <p>
     *        The specified file must be less than 50 KB of UTF-8 characters.
     *        </p>
     *        <p>
     *        If you provide the location of a list of words in the <code>VocabularyFilterFileUri</code> parameter, you
     *        can't use the <code>Words</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVocabularyFilterRequest withVocabularyFilterFileUri(String vocabularyFilterFileUri) {
        setVocabularyFilterFileUri(vocabularyFilterFileUri);
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
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: ").append(getVocabularyFilterName()).append(",");
        if (getWords() != null)
            sb.append("Words: ").append(getWords()).append(",");
        if (getVocabularyFilterFileUri() != null)
            sb.append("VocabularyFilterFileUri: ").append(getVocabularyFilterFileUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVocabularyFilterRequest == false)
            return false;
        UpdateVocabularyFilterRequest other = (UpdateVocabularyFilterRequest) obj;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getWords() == null ^ this.getWords() == null)
            return false;
        if (other.getWords() != null && other.getWords().equals(this.getWords()) == false)
            return false;
        if (other.getVocabularyFilterFileUri() == null ^ this.getVocabularyFilterFileUri() == null)
            return false;
        if (other.getVocabularyFilterFileUri() != null && other.getVocabularyFilterFileUri().equals(this.getVocabularyFilterFileUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode + ((getWords() == null) ? 0 : getWords().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterFileUri() == null) ? 0 : getVocabularyFilterFileUri().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVocabularyFilterRequest clone() {
        return (UpdateVocabularyFilterRequest) super.clone();
    }

}
