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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabulary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVocabularyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom vocabulary with the same name as an existing custom vocabulary, you get a
     * <code>ConflictException</code> error.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The language code that represents the language of the entries in your custom vocabulary. Each custom vocabulary
     * must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same language as the custom vocabulary. For
     * example, if you create a custom vocabulary using US English (<code>en-US</code>), you can only apply this custom
     * vocabulary to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Use this parameter if you want to create your custom vocabulary by including all desired terms, as
     * comma-separated values, within your request. The other option for creating your custom vocabulary is to save your
     * entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the
     * <code>VocabularyFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Phrases</code> in your request, you cannot use <code>VocabularyFileUri</code>; you
     * must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     */
    private java.util.List<String> phrases;
    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom vocabulary. The URI must be located in the same
     * Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFileUri</code> in your request, you cannot use the <code>Phrases</code>
     * flag; you must choose one or the other.
     * </p>
     */
    private String vocabularyFileUri;
    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary at the time you
     * create this new custom vocabulary.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom vocabulary with the same name as an existing custom vocabulary, you get a
     * <code>ConflictException</code> error.
     * </p>
     * 
     * @param vocabularyName
     *        A unique name, chosen by you, for your new custom vocabulary.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new custom vocabulary with the same name as an existing custom vocabulary,
     *        you get a <code>ConflictException</code> error.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom vocabulary with the same name as an existing custom vocabulary, you get a
     * <code>ConflictException</code> error.
     * </p>
     * 
     * @return A unique name, chosen by you, for your new custom vocabulary.</p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *         account. If you try to create a new custom vocabulary with the same name as an existing custom
     *         vocabulary, you get a <code>ConflictException</code> error.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom vocabulary with the same name as an existing custom vocabulary, you get a
     * <code>ConflictException</code> error.
     * </p>
     * 
     * @param vocabularyName
     *        A unique name, chosen by you, for your new custom vocabulary.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new custom vocabulary with the same name as an existing custom vocabulary,
     *        you get a <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyRequest withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your custom vocabulary. Each custom vocabulary
     * must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same language as the custom vocabulary. For
     * example, if you create a custom vocabulary using US English (<code>en-US</code>), you can only apply this custom
     * vocabulary to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your custom vocabulary. Each custom
     *        vocabulary must contain terms in only one language.</p>
     *        <p>
     *        A custom vocabulary can only be used to transcribe files in the same language as the custom vocabulary.
     *        For example, if you create a custom vocabulary using US English (<code>en-US</code>), you can only apply
     *        this custom vocabulary to files that contain English audio.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your custom vocabulary. Each custom vocabulary
     * must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same language as the custom vocabulary. For
     * example, if you create a custom vocabulary using US English (<code>en-US</code>), you can only apply this custom
     * vocabulary to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @return The language code that represents the language of the entries in your custom vocabulary. Each custom
     *         vocabulary must contain terms in only one language.</p>
     *         <p>
     *         A custom vocabulary can only be used to transcribe files in the same language as the custom vocabulary.
     *         For example, if you create a custom vocabulary using US English (<code>en-US</code>), you can only apply
     *         this custom vocabulary to files that contain English audio.
     *         </p>
     *         <p>
     *         For a list of supported languages and their associated language codes, refer to the <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *         table.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your custom vocabulary. Each custom vocabulary
     * must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same language as the custom vocabulary. For
     * example, if you create a custom vocabulary using US English (<code>en-US</code>), you can only apply this custom
     * vocabulary to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your custom vocabulary. Each custom
     *        vocabulary must contain terms in only one language.</p>
     *        <p>
     *        A custom vocabulary can only be used to transcribe files in the same language as the custom vocabulary.
     *        For example, if you create a custom vocabulary using US English (<code>en-US</code>), you can only apply
     *        this custom vocabulary to files that contain English audio.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateVocabularyRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your custom vocabulary. Each custom vocabulary
     * must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary can only be used to transcribe files in the same language as the custom vocabulary. For
     * example, if you create a custom vocabulary using US English (<code>en-US</code>), you can only apply this custom
     * vocabulary to files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your custom vocabulary. Each custom
     *        vocabulary must contain terms in only one language.</p>
     *        <p>
     *        A custom vocabulary can only be used to transcribe files in the same language as the custom vocabulary.
     *        For example, if you create a custom vocabulary using US English (<code>en-US</code>), you can only apply
     *        this custom vocabulary to files that contain English audio.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateVocabularyRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to create your custom vocabulary by including all desired terms, as
     * comma-separated values, within your request. The other option for creating your custom vocabulary is to save your
     * entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the
     * <code>VocabularyFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Phrases</code> in your request, you cannot use <code>VocabularyFileUri</code>; you
     * must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * 
     * @return Use this parameter if you want to create your custom vocabulary by including all desired terms, as
     *         comma-separated values, within your request. The other option for creating your custom vocabulary is to
     *         save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of
     *         your file using the <code>VocabularyFileUri</code> parameter.</p>
     *         <p>
     *         Note that if you include <code>Phrases</code> in your request, you cannot use
     *         <code>VocabularyFileUri</code>; you must choose one or the other.
     *         </p>
     *         <p>
     *         Each language has a character set that contains all allowed characters for that specific language. If you
     *         use unsupported characters, your custom vocabulary filter request fails. Refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom
     *         Vocabularies</a> to get the character set for your language.
     */

    public java.util.List<String> getPhrases() {
        return phrases;
    }

    /**
     * <p>
     * Use this parameter if you want to create your custom vocabulary by including all desired terms, as
     * comma-separated values, within your request. The other option for creating your custom vocabulary is to save your
     * entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the
     * <code>VocabularyFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Phrases</code> in your request, you cannot use <code>VocabularyFileUri</code>; you
     * must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * 
     * @param phrases
     *        Use this parameter if you want to create your custom vocabulary by including all desired terms, as
     *        comma-separated values, within your request. The other option for creating your custom vocabulary is to
     *        save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your
     *        file using the <code>VocabularyFileUri</code> parameter.</p>
     *        <p>
     *        Note that if you include <code>Phrases</code> in your request, you cannot use
     *        <code>VocabularyFileUri</code>; you must choose one or the other.
     *        </p>
     *        <p>
     *        Each language has a character set that contains all allowed characters for that specific language. If you
     *        use unsupported characters, your custom vocabulary filter request fails. Refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom
     *        Vocabularies</a> to get the character set for your language.
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
     * Use this parameter if you want to create your custom vocabulary by including all desired terms, as
     * comma-separated values, within your request. The other option for creating your custom vocabulary is to save your
     * entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the
     * <code>VocabularyFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Phrases</code> in your request, you cannot use <code>VocabularyFileUri</code>; you
     * must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhrases(java.util.Collection)} or {@link #withPhrases(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param phrases
     *        Use this parameter if you want to create your custom vocabulary by including all desired terms, as
     *        comma-separated values, within your request. The other option for creating your custom vocabulary is to
     *        save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your
     *        file using the <code>VocabularyFileUri</code> parameter.</p>
     *        <p>
     *        Note that if you include <code>Phrases</code> in your request, you cannot use
     *        <code>VocabularyFileUri</code>; you must choose one or the other.
     *        </p>
     *        <p>
     *        Each language has a character set that contains all allowed characters for that specific language. If you
     *        use unsupported characters, your custom vocabulary filter request fails. Refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom
     *        Vocabularies</a> to get the character set for your language.
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
     * Use this parameter if you want to create your custom vocabulary by including all desired terms, as
     * comma-separated values, within your request. The other option for creating your custom vocabulary is to save your
     * entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the
     * <code>VocabularyFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Phrases</code> in your request, you cannot use <code>VocabularyFileUri</code>; you
     * must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * 
     * @param phrases
     *        Use this parameter if you want to create your custom vocabulary by including all desired terms, as
     *        comma-separated values, within your request. The other option for creating your custom vocabulary is to
     *        save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your
     *        file using the <code>VocabularyFileUri</code> parameter.</p>
     *        <p>
     *        Note that if you include <code>Phrases</code> in your request, you cannot use
     *        <code>VocabularyFileUri</code>; you must choose one or the other.
     *        </p>
     *        <p>
     *        Each language has a character set that contains all allowed characters for that specific language. If you
     *        use unsupported characters, your custom vocabulary filter request fails. Refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom
     *        Vocabularies</a> to get the character set for your language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyRequest withPhrases(java.util.Collection<String> phrases) {
        setPhrases(phrases);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom vocabulary. The URI must be located in the same
     * Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFileUri</code> in your request, you cannot use the <code>Phrases</code>
     * flag; you must choose one or the other.
     * </p>
     * 
     * @param vocabularyFileUri
     *        The Amazon S3 location of the text file that contains your custom vocabulary. The URI must be located in
     *        the same Amazon Web Services Region as the resource you're calling.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     *        </p>
     *        <p>
     *        Note that if you include <code>VocabularyFileUri</code> in your request, you cannot use the
     *        <code>Phrases</code> flag; you must choose one or the other.
     */

    public void setVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom vocabulary. The URI must be located in the same
     * Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFileUri</code> in your request, you cannot use the <code>Phrases</code>
     * flag; you must choose one or the other.
     * </p>
     * 
     * @return The Amazon S3 location of the text file that contains your custom vocabulary. The URI must be located in
     *         the same Amazon Web Services Region as the resource you're calling.</p>
     *         <p>
     *         Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     *         </p>
     *         <p>
     *         Note that if you include <code>VocabularyFileUri</code> in your request, you cannot use the
     *         <code>Phrases</code> flag; you must choose one or the other.
     */

    public String getVocabularyFileUri() {
        return this.vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom vocabulary. The URI must be located in the same
     * Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFileUri</code> in your request, you cannot use the <code>Phrases</code>
     * flag; you must choose one or the other.
     * </p>
     * 
     * @param vocabularyFileUri
     *        The Amazon S3 location of the text file that contains your custom vocabulary. The URI must be located in
     *        the same Amazon Web Services Region as the resource you're calling.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     *        </p>
     *        <p>
     *        Note that if you include <code>VocabularyFileUri</code> in your request, you cannot use the
     *        <code>Phrases</code> flag; you must choose one or the other.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyRequest withVocabularyFileUri(String vocabularyFileUri) {
        setVocabularyFileUri(vocabularyFileUri);
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary at the time you
     * create this new custom vocabulary.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @return Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary at the
     *         time you create this new custom vocabulary.</p>
     *         <p>
     *         To learn more about using tags with Amazon Transcribe, refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary at the time you
     * create this new custom vocabulary.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary at the time
     *        you create this new custom vocabulary.</p>
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary at the time you
     * create this new custom vocabulary.
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
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary at the time
     *        you create this new custom vocabulary.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyRequest withTags(Tag... tags) {
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary at the time you
     * create this new custom vocabulary.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary at the time
     *        you create this new custom vocabulary.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPhrases() != null)
            sb.append("Phrases: ").append(getPhrases()).append(",");
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
        hashCode = prime * hashCode + ((getPhrases() == null) ? 0 : getPhrases().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFileUri() == null) ? 0 : getVocabularyFileUri().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVocabularyRequest clone() {
        return (CreateVocabularyRequest) super.clone();
    }

}
