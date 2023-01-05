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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateVocabularyFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVocabularyFilterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary filter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom vocabulary filter with the same name as an existing custom vocabulary filter, you
     * get a <code>ConflictException</code> error.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * The language code that represents the language of the entries in your vocabulary filter. Each custom vocabulary
     * filter must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For example,
     * if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Use this parameter if you want to create your custom vocabulary filter by including all desired terms, as
     * comma-separated values, within your request. The other option for creating your vocabulary filter is to save your
     * entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot use <code>VocabularyFilterFileUri</code>;
     * you must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     */
    private java.util.List<String> words;
    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom vocabulary filter terms. The URI must be
     * located in the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your request, you cannot use <code>Words</code>;
     * you must choose one or the other.
     * </p>
     */
    private String vocabularyFilterFileUri;
    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary filter at the time
     * you create this new vocabulary filter.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary filter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom vocabulary filter with the same name as an existing custom vocabulary filter, you
     * get a <code>ConflictException</code> error.
     * </p>
     * 
     * @param vocabularyFilterName
     *        A unique name, chosen by you, for your new custom vocabulary filter.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new custom vocabulary filter with the same name as an existing custom
     *        vocabulary filter, you get a <code>ConflictException</code> error.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary filter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom vocabulary filter with the same name as an existing custom vocabulary filter, you
     * get a <code>ConflictException</code> error.
     * </p>
     * 
     * @return A unique name, chosen by you, for your new custom vocabulary filter.</p>
     *         <p>
     *         This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *         account. If you try to create a new custom vocabulary filter with the same name as an existing custom
     *         vocabulary filter, you get a <code>ConflictException</code> error.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * A unique name, chosen by you, for your new custom vocabulary filter.
     * </p>
     * <p>
     * This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services account. If
     * you try to create a new custom vocabulary filter with the same name as an existing custom vocabulary filter, you
     * get a <code>ConflictException</code> error.
     * </p>
     * 
     * @param vocabularyFilterName
     *        A unique name, chosen by you, for your new custom vocabulary filter.</p>
     *        <p>
     *        This name is case sensitive, cannot contain spaces, and must be unique within an Amazon Web Services
     *        account. If you try to create a new custom vocabulary filter with the same name as an existing custom
     *        vocabulary filter, you get a <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyFilterRequest withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your vocabulary filter. Each custom vocabulary
     * filter must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For example,
     * if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your vocabulary filter. Each custom
     *        vocabulary filter must contain terms in only one language.</p>
     *        <p>
     *        A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For
     *        example, if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only
     *        apply this filter to files that contain English audio.
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
     * The language code that represents the language of the entries in your vocabulary filter. Each custom vocabulary
     * filter must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For example,
     * if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @return The language code that represents the language of the entries in your vocabulary filter. Each custom
     *         vocabulary filter must contain terms in only one language.</p>
     *         <p>
     *         A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For
     *         example, if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only
     *         apply this filter to files that contain English audio.
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
     * The language code that represents the language of the entries in your vocabulary filter. Each custom vocabulary
     * filter must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For example,
     * if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your vocabulary filter. Each custom
     *        vocabulary filter must contain terms in only one language.</p>
     *        <p>
     *        A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For
     *        example, if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only
     *        apply this filter to files that contain English audio.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateVocabularyFilterRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in your vocabulary filter. Each custom vocabulary
     * filter must contain terms in only one language.
     * </p>
     * <p>
     * A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For example,
     * if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only apply this filter to
     * files that contain English audio.
     * </p>
     * <p>
     * For a list of supported languages and their associated language codes, refer to the <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a> table.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in your vocabulary filter. Each custom
     *        vocabulary filter must contain terms in only one language.</p>
     *        <p>
     *        A custom vocabulary filter can only be used to transcribe files in the same language as the filter. For
     *        example, if you create a custom vocabulary filter using US English (<code>en-US</code>), you can only
     *        apply this filter to files that contain English audio.
     *        </p>
     *        <p>
     *        For a list of supported languages and their associated language codes, refer to the <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html">Supported languages</a>
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CreateVocabularyFilterRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter if you want to create your custom vocabulary filter by including all desired terms, as
     * comma-separated values, within your request. The other option for creating your vocabulary filter is to save your
     * entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot use <code>VocabularyFilterFileUri</code>;
     * you must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * 
     * @return Use this parameter if you want to create your custom vocabulary filter by including all desired terms, as
     *         comma-separated values, within your request. The other option for creating your vocabulary filter is to
     *         save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of
     *         your file using the <code>VocabularyFilterFileUri</code> parameter.</p>
     *         <p>
     *         Note that if you include <code>Words</code> in your request, you cannot use
     *         <code>VocabularyFilterFileUri</code>; you must choose one or the other.
     *         </p>
     *         <p>
     *         Each language has a character set that contains all allowed characters for that specific language. If you
     *         use unsupported characters, your custom vocabulary filter request fails. Refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom
     *         Vocabularies</a> to get the character set for your language.
     */

    public java.util.List<String> getWords() {
        return words;
    }

    /**
     * <p>
     * Use this parameter if you want to create your custom vocabulary filter by including all desired terms, as
     * comma-separated values, within your request. The other option for creating your vocabulary filter is to save your
     * entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot use <code>VocabularyFilterFileUri</code>;
     * you must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * 
     * @param words
     *        Use this parameter if you want to create your custom vocabulary filter by including all desired terms, as
     *        comma-separated values, within your request. The other option for creating your vocabulary filter is to
     *        save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your
     *        file using the <code>VocabularyFilterFileUri</code> parameter.</p>
     *        <p>
     *        Note that if you include <code>Words</code> in your request, you cannot use
     *        <code>VocabularyFilterFileUri</code>; you must choose one or the other.
     *        </p>
     *        <p>
     *        Each language has a character set that contains all allowed characters for that specific language. If you
     *        use unsupported characters, your custom vocabulary filter request fails. Refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom
     *        Vocabularies</a> to get the character set for your language.
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
     * Use this parameter if you want to create your custom vocabulary filter by including all desired terms, as
     * comma-separated values, within your request. The other option for creating your vocabulary filter is to save your
     * entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot use <code>VocabularyFilterFileUri</code>;
     * you must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWords(java.util.Collection)} or {@link #withWords(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param words
     *        Use this parameter if you want to create your custom vocabulary filter by including all desired terms, as
     *        comma-separated values, within your request. The other option for creating your vocabulary filter is to
     *        save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your
     *        file using the <code>VocabularyFilterFileUri</code> parameter.</p>
     *        <p>
     *        Note that if you include <code>Words</code> in your request, you cannot use
     *        <code>VocabularyFilterFileUri</code>; you must choose one or the other.
     *        </p>
     *        <p>
     *        Each language has a character set that contains all allowed characters for that specific language. If you
     *        use unsupported characters, your custom vocabulary filter request fails. Refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom
     *        Vocabularies</a> to get the character set for your language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyFilterRequest withWords(String... words) {
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
     * Use this parameter if you want to create your custom vocabulary filter by including all desired terms, as
     * comma-separated values, within your request. The other option for creating your vocabulary filter is to save your
     * entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your file using the
     * <code>VocabularyFilterFileUri</code> parameter.
     * </p>
     * <p>
     * Note that if you include <code>Words</code> in your request, you cannot use <code>VocabularyFilterFileUri</code>;
     * you must choose one or the other.
     * </p>
     * <p>
     * Each language has a character set that contains all allowed characters for that specific language. If you use
     * unsupported characters, your custom vocabulary filter request fails. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom Vocabularies</a>
     * to get the character set for your language.
     * </p>
     * 
     * @param words
     *        Use this parameter if you want to create your custom vocabulary filter by including all desired terms, as
     *        comma-separated values, within your request. The other option for creating your vocabulary filter is to
     *        save your entries in a text file and upload them to an Amazon S3 bucket, then specify the location of your
     *        file using the <code>VocabularyFilterFileUri</code> parameter.</p>
     *        <p>
     *        Note that if you include <code>Words</code> in your request, you cannot use
     *        <code>VocabularyFilterFileUri</code>; you must choose one or the other.
     *        </p>
     *        <p>
     *        Each language has a character set that contains all allowed characters for that specific language. If you
     *        use unsupported characters, your custom vocabulary filter request fails. Refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/charsets.html">Character Sets for Custom
     *        Vocabularies</a> to get the character set for your language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyFilterRequest withWords(java.util.Collection<String> words) {
        setWords(words);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom vocabulary filter terms. The URI must be
     * located in the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your request, you cannot use <code>Words</code>;
     * you must choose one or the other.
     * </p>
     * 
     * @param vocabularyFilterFileUri
     *        The Amazon S3 location of the text file that contains your custom vocabulary filter terms. The URI must be
     *        located in the same Amazon Web Services Region as the resource you're calling.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     *        </p>
     *        <p>
     *        Note that if you include <code>VocabularyFilterFileUri</code> in your request, you cannot use
     *        <code>Words</code>; you must choose one or the other.
     */

    public void setVocabularyFilterFileUri(String vocabularyFilterFileUri) {
        this.vocabularyFilterFileUri = vocabularyFilterFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom vocabulary filter terms. The URI must be
     * located in the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your request, you cannot use <code>Words</code>;
     * you must choose one or the other.
     * </p>
     * 
     * @return The Amazon S3 location of the text file that contains your custom vocabulary filter terms. The URI must
     *         be located in the same Amazon Web Services Region as the resource you're calling.</p>
     *         <p>
     *         Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     *         </p>
     *         <p>
     *         Note that if you include <code>VocabularyFilterFileUri</code> in your request, you cannot use
     *         <code>Words</code>; you must choose one or the other.
     */

    public String getVocabularyFilterFileUri() {
        return this.vocabularyFilterFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom vocabulary filter terms. The URI must be
     * located in the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     * </p>
     * <p>
     * Note that if you include <code>VocabularyFilterFileUri</code> in your request, you cannot use <code>Words</code>;
     * you must choose one or the other.
     * </p>
     * 
     * @param vocabularyFilterFileUri
     *        The Amazon S3 location of the text file that contains your custom vocabulary filter terms. The URI must be
     *        located in the same Amazon Web Services Region as the resource you're calling.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-filter-file.txt</code>
     *        </p>
     *        <p>
     *        Note that if you include <code>VocabularyFilterFileUri</code> in your request, you cannot use
     *        <code>Words</code>; you must choose one or the other.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyFilterRequest withVocabularyFilterFileUri(String vocabularyFilterFileUri) {
        setVocabularyFilterFileUri(vocabularyFilterFileUri);
        return this;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary filter at the time
     * you create this new vocabulary filter.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @return Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary filter at
     *         the time you create this new vocabulary filter.</p>
     *         <p>
     *         To learn more about using tags with Amazon Transcribe, refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary filter at the time
     * you create this new vocabulary filter.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary filter at
     *        the time you create this new vocabulary filter.</p>
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary filter at the time
     * you create this new vocabulary filter.
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
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary filter at
     *        the time you create this new vocabulary filter.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyFilterRequest withTags(Tag... tags) {
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
     * Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary filter at the time
     * you create this new vocabulary filter.
     * </p>
     * <p>
     * To learn more about using tags with Amazon Transcribe, refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * </p>
     * 
     * @param tags
     *        Adds one or more custom tags, each in the form of a key:value pair, to a new custom vocabulary filter at
     *        the time you create this new vocabulary filter.</p>
     *        <p>
     *        To learn more about using tags with Amazon Transcribe, refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tagging.html">Tagging resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVocabularyFilterRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: ").append(getVocabularyFilterName()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getWords() != null)
            sb.append("Words: ").append(getWords()).append(",");
        if (getVocabularyFilterFileUri() != null)
            sb.append("VocabularyFilterFileUri: ").append(getVocabularyFilterFileUri()).append(",");
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

        if (obj instanceof CreateVocabularyFilterRequest == false)
            return false;
        CreateVocabularyFilterRequest other = (CreateVocabularyFilterRequest) obj;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getWords() == null ^ this.getWords() == null)
            return false;
        if (other.getWords() != null && other.getWords().equals(this.getWords()) == false)
            return false;
        if (other.getVocabularyFilterFileUri() == null ^ this.getVocabularyFilterFileUri() == null)
            return false;
        if (other.getVocabularyFilterFileUri() != null && other.getVocabularyFilterFileUri().equals(this.getVocabularyFilterFileUri()) == false)
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

        hashCode = prime * hashCode + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getWords() == null) ? 0 : getWords().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterFileUri() == null) ? 0 : getVocabularyFilterFileUri().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVocabularyFilterRequest clone() {
        return (CreateVocabularyFilterRequest) super.clone();
    }

}
