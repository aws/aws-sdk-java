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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateMedicalVocabulary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMedicalVocabularyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom medical vocabulary you want to update. Custom medical vocabulary names are case sensitive.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The language code that represents the language of the entries in the custom vocabulary you want to update. US
     * English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom medical vocabulary. The URI must be located in
     * the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     */
    private String vocabularyFileUri;

    /**
     * <p>
     * The name of the custom medical vocabulary you want to update. Custom medical vocabulary names are case sensitive.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the custom medical vocabulary you want to update. Custom medical vocabulary names are case
     *        sensitive.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the custom medical vocabulary you want to update. Custom medical vocabulary names are case sensitive.
     * </p>
     * 
     * @return The name of the custom medical vocabulary you want to update. Custom medical vocabulary names are case
     *         sensitive.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the custom medical vocabulary you want to update. Custom medical vocabulary names are case sensitive.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the custom medical vocabulary you want to update. Custom medical vocabulary names are case
     *        sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMedicalVocabularyRequest withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the custom vocabulary you want to update. US
     * English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in the custom vocabulary you want to update.
     *        US English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the custom vocabulary you want to update. US
     * English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @return The language code that represents the language of the entries in the custom vocabulary you want to
     *         update. US English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the custom vocabulary you want to update. US
     * English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in the custom vocabulary you want to update.
     *        US English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public UpdateMedicalVocabularyRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code that represents the language of the entries in the custom vocabulary you want to update. US
     * English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code that represents the language of the entries in the custom vocabulary you want to update.
     *        US English (<code>en-US</code>) is the only language supported with Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public UpdateMedicalVocabularyRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom medical vocabulary. The URI must be located in
     * the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * 
     * @param vocabularyFileUri
     *        The Amazon S3 location of the text file that contains your custom medical vocabulary. The URI must be
     *        located in the same Amazon Web Services Region as the resource you're calling.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     */

    public void setVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom medical vocabulary. The URI must be located in
     * the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * 
     * @return The Amazon S3 location of the text file that contains your custom medical vocabulary. The URI must be
     *         located in the same Amazon Web Services Region as the resource you're calling.</p>
     *         <p>
     *         Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     */

    public String getVocabularyFileUri() {
        return this.vocabularyFileUri;
    }

    /**
     * <p>
     * The Amazon S3 location of the text file that contains your custom medical vocabulary. The URI must be located in
     * the same Amazon Web Services Region as the resource you're calling.
     * </p>
     * <p>
     * Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * </p>
     * 
     * @param vocabularyFileUri
     *        The Amazon S3 location of the text file that contains your custom medical vocabulary. The URI must be
     *        located in the same Amazon Web Services Region as the resource you're calling.</p>
     *        <p>
     *        Here's an example URI path: <code>s3://DOC-EXAMPLE-BUCKET/my-vocab-file.txt</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMedicalVocabularyRequest withVocabularyFileUri(String vocabularyFileUri) {
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

        if (obj instanceof UpdateMedicalVocabularyRequest == false)
            return false;
        UpdateMedicalVocabularyRequest other = (UpdateMedicalVocabularyRequest) obj;
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
    public UpdateMedicalVocabularyRequest clone() {
        return (UpdateMedicalVocabularyRequest) super.clone();
    }

}
