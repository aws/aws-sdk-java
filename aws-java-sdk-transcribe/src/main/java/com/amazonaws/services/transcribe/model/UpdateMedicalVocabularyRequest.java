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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateMedicalVocabulary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMedicalVocabularyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the vocabulary to update. The name is case sensitive. If you try to update a vocabulary with the same
     * name as a vocabulary you've already made, you get a <code>ConflictException</code> error.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The language code of the language used for the entries in the updated vocabulary. US English (en-US) is the only
     * valid language code in Amazon Transcribe Medical.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The location in Amazon S3 of the text file that contains the you use for your custom vocabulary. The URI must be
     * in the same AWS Region as the resource that you are calling. The following is the format for a URI:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     * </p>
     * <p>
     * For more information about Amazon S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies in Amazon Transcribe Medical, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Medical Custom
     * Vocabularies</a>.
     * </p>
     */
    private String vocabularyFileUri;

    /**
     * <p>
     * The name of the vocabulary to update. The name is case sensitive. If you try to update a vocabulary with the same
     * name as a vocabulary you've already made, you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary to update. The name is case sensitive. If you try to update a vocabulary with
     *        the same name as a vocabulary you've already made, you get a <code>ConflictException</code> error.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary to update. The name is case sensitive. If you try to update a vocabulary with the same
     * name as a vocabulary you've already made, you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @return The name of the vocabulary to update. The name is case sensitive. If you try to update a vocabulary with
     *         the same name as a vocabulary you've already made, you get a <code>ConflictException</code> error.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary to update. The name is case sensitive. If you try to update a vocabulary with the same
     * name as a vocabulary you've already made, you get a <code>ConflictException</code> error.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary to update. The name is case sensitive. If you try to update a vocabulary with
     *        the same name as a vocabulary you've already made, you get a <code>ConflictException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMedicalVocabularyRequest withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The language code of the language used for the entries in the updated vocabulary. US English (en-US) is the only
     * valid language code in Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code of the language used for the entries in the updated vocabulary. US English (en-US) is
     *        the only valid language code in Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the language used for the entries in the updated vocabulary. US English (en-US) is the only
     * valid language code in Amazon Transcribe Medical.
     * </p>
     * 
     * @return The language code of the language used for the entries in the updated vocabulary. US English (en-US) is
     *         the only valid language code in Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code of the language used for the entries in the updated vocabulary. US English (en-US) is the only
     * valid language code in Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code of the language used for the entries in the updated vocabulary. US English (en-US) is
     *        the only valid language code in Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public UpdateMedicalVocabularyRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code of the language used for the entries in the updated vocabulary. US English (en-US) is the only
     * valid language code in Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code of the language used for the entries in the updated vocabulary. US English (en-US) is
     *        the only valid language code in Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public UpdateMedicalVocabularyRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 of the text file that contains the you use for your custom vocabulary. The URI must be
     * in the same AWS Region as the resource that you are calling. The following is the format for a URI:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     * </p>
     * <p>
     * For more information about Amazon S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies in Amazon Transcribe Medical, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Medical Custom
     * Vocabularies</a>.
     * </p>
     * 
     * @param vocabularyFileUri
     *        The location in Amazon S3 of the text file that contains the you use for your custom vocabulary. The URI
     *        must be in the same AWS Region as the resource that you are calling. The following is the format for a
     *        URI:</p>
     *        <p>
     *        <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     *        </p>
     *        <p>
     *        For more information about Amazon S3 object names, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *        the <i>Amazon S3 Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information about custom vocabularies in Amazon Transcribe Medical, see <a
     *        href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Medical Custom
     *        Vocabularies</a>.
     */

    public void setVocabularyFileUri(String vocabularyFileUri) {
        this.vocabularyFileUri = vocabularyFileUri;
    }

    /**
     * <p>
     * The location in Amazon S3 of the text file that contains the you use for your custom vocabulary. The URI must be
     * in the same AWS Region as the resource that you are calling. The following is the format for a URI:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     * </p>
     * <p>
     * For more information about Amazon S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies in Amazon Transcribe Medical, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Medical Custom
     * Vocabularies</a>.
     * </p>
     * 
     * @return The location in Amazon S3 of the text file that contains the you use for your custom vocabulary. The URI
     *         must be in the same AWS Region as the resource that you are calling. The following is the format for a
     *         URI:</p>
     *         <p>
     *         <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <p>
     *         <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     *         </p>
     *         <p>
     *         For more information about Amazon S3 object names, see <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *         the <i>Amazon S3 Developer Guide</i>.
     *         </p>
     *         <p>
     *         For more information about custom vocabularies in Amazon Transcribe Medical, see <a
     *         href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Medical Custom
     *         Vocabularies</a>.
     */

    public String getVocabularyFileUri() {
        return this.vocabularyFileUri;
    }

    /**
     * <p>
     * The location in Amazon S3 of the text file that contains the you use for your custom vocabulary. The URI must be
     * in the same AWS Region as the resource that you are calling. The following is the format for a URI:
     * </p>
     * <p>
     * <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     * </p>
     * <p>
     * For example:
     * </p>
     * <p>
     * <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     * </p>
     * <p>
     * For more information about Amazon S3 object names, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in the
     * <i>Amazon S3 Developer Guide</i>.
     * </p>
     * <p>
     * For more information about custom vocabularies in Amazon Transcribe Medical, see <a
     * href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Medical Custom
     * Vocabularies</a>.
     * </p>
     * 
     * @param vocabularyFileUri
     *        The location in Amazon S3 of the text file that contains the you use for your custom vocabulary. The URI
     *        must be in the same AWS Region as the resource that you are calling. The following is the format for a
     *        URI:</p>
     *        <p>
     *        <code> https://s3.&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt; </code>
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <p>
     *        <code>https://s3.us-east-1.amazonaws.com/AWSDOC-EXAMPLE-BUCKET/vocab.txt</code>
     *        </p>
     *        <p>
     *        For more information about Amazon S3 object names, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html#object-keys">Object Keys</a> in
     *        the <i>Amazon S3 Developer Guide</i>.
     *        </p>
     *        <p>
     *        For more information about custom vocabularies in Amazon Transcribe Medical, see <a
     *        href="http://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html#how-vocabulary">Medical Custom
     *        Vocabularies</a>.
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
