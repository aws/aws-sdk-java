/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalVocabulary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMedicalVocabularyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the vocabulary returned by Amazon Transcribe Medical.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The valid language code for your vocabulary entries.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The processing state of the vocabulary. If the <code>VocabularyState</code> is <code>READY</code> then you can
     * use it in the <code>StartMedicalTranscriptionJob</code> operation.
     * </p>
     */
    private String vocabularyState;
    /**
     * <p>
     * The date and time that the vocabulary was last modified with a text file different from the one that was
     * previously used.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * If the <code>VocabularyState</code> is <code>FAILED</code>, this field contains information about why the job
     * failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The location in Amazon S3 where the vocabulary is stored. Use this URI to get the contents of the vocabulary. You
     * can download your vocabulary from the URI for a limited time.
     * </p>
     */
    private String downloadUri;

    /**
     * <p>
     * The name of the vocabulary returned by Amazon Transcribe Medical.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary returned by Amazon Transcribe Medical.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary returned by Amazon Transcribe Medical.
     * </p>
     * 
     * @return The name of the vocabulary returned by Amazon Transcribe Medical.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary returned by Amazon Transcribe Medical.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary returned by Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMedicalVocabularyResult withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The valid language code for your vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The valid language code for your vocabulary entries.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The valid language code for your vocabulary entries.
     * </p>
     * 
     * @return The valid language code for your vocabulary entries.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The valid language code for your vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The valid language code for your vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public GetMedicalVocabularyResult withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The valid language code for your vocabulary entries.
     * </p>
     * 
     * @param languageCode
     *        The valid language code for your vocabulary entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public GetMedicalVocabularyResult withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The processing state of the vocabulary. If the <code>VocabularyState</code> is <code>READY</code> then you can
     * use it in the <code>StartMedicalTranscriptionJob</code> operation.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of the vocabulary. If the <code>VocabularyState</code> is <code>READY</code> then you
     *        can use it in the <code>StartMedicalTranscriptionJob</code> operation.
     * @see VocabularyState
     */

    public void setVocabularyState(String vocabularyState) {
        this.vocabularyState = vocabularyState;
    }

    /**
     * <p>
     * The processing state of the vocabulary. If the <code>VocabularyState</code> is <code>READY</code> then you can
     * use it in the <code>StartMedicalTranscriptionJob</code> operation.
     * </p>
     * 
     * @return The processing state of the vocabulary. If the <code>VocabularyState</code> is <code>READY</code> then
     *         you can use it in the <code>StartMedicalTranscriptionJob</code> operation.
     * @see VocabularyState
     */

    public String getVocabularyState() {
        return this.vocabularyState;
    }

    /**
     * <p>
     * The processing state of the vocabulary. If the <code>VocabularyState</code> is <code>READY</code> then you can
     * use it in the <code>StartMedicalTranscriptionJob</code> operation.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of the vocabulary. If the <code>VocabularyState</code> is <code>READY</code> then you
     *        can use it in the <code>StartMedicalTranscriptionJob</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public GetMedicalVocabularyResult withVocabularyState(String vocabularyState) {
        setVocabularyState(vocabularyState);
        return this;
    }

    /**
     * <p>
     * The processing state of the vocabulary. If the <code>VocabularyState</code> is <code>READY</code> then you can
     * use it in the <code>StartMedicalTranscriptionJob</code> operation.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of the vocabulary. If the <code>VocabularyState</code> is <code>READY</code> then you
     *        can use it in the <code>StartMedicalTranscriptionJob</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public GetMedicalVocabularyResult withVocabularyState(VocabularyState vocabularyState) {
        this.vocabularyState = vocabularyState.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last modified with a text file different from the one that was
     * previously used.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the vocabulary was last modified with a text file different from the one that was
     *        previously used.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last modified with a text file different from the one that was
     * previously used.
     * </p>
     * 
     * @return The date and time that the vocabulary was last modified with a text file different from the one that was
     *         previously used.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the vocabulary was last modified with a text file different from the one that was
     * previously used.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the vocabulary was last modified with a text file different from the one that was
     *        previously used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMedicalVocabularyResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * If the <code>VocabularyState</code> is <code>FAILED</code>, this field contains information about why the job
     * failed.
     * </p>
     * 
     * @param failureReason
     *        If the <code>VocabularyState</code> is <code>FAILED</code>, this field contains information about why the
     *        job failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>VocabularyState</code> is <code>FAILED</code>, this field contains information about why the job
     * failed.
     * </p>
     * 
     * @return If the <code>VocabularyState</code> is <code>FAILED</code>, this field contains information about why the
     *         job failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the <code>VocabularyState</code> is <code>FAILED</code>, this field contains information about why the job
     * failed.
     * </p>
     * 
     * @param failureReason
     *        If the <code>VocabularyState</code> is <code>FAILED</code>, this field contains information about why the
     *        job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMedicalVocabularyResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The location in Amazon S3 where the vocabulary is stored. Use this URI to get the contents of the vocabulary. You
     * can download your vocabulary from the URI for a limited time.
     * </p>
     * 
     * @param downloadUri
     *        The location in Amazon S3 where the vocabulary is stored. Use this URI to get the contents of the
     *        vocabulary. You can download your vocabulary from the URI for a limited time.
     */

    public void setDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
    }

    /**
     * <p>
     * The location in Amazon S3 where the vocabulary is stored. Use this URI to get the contents of the vocabulary. You
     * can download your vocabulary from the URI for a limited time.
     * </p>
     * 
     * @return The location in Amazon S3 where the vocabulary is stored. Use this URI to get the contents of the
     *         vocabulary. You can download your vocabulary from the URI for a limited time.
     */

    public String getDownloadUri() {
        return this.downloadUri;
    }

    /**
     * <p>
     * The location in Amazon S3 where the vocabulary is stored. Use this URI to get the contents of the vocabulary. You
     * can download your vocabulary from the URI for a limited time.
     * </p>
     * 
     * @param downloadUri
     *        The location in Amazon S3 where the vocabulary is stored. Use this URI to get the contents of the
     *        vocabulary. You can download your vocabulary from the URI for a limited time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMedicalVocabularyResult withDownloadUri(String downloadUri) {
        setDownloadUri(downloadUri);
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
        if (getVocabularyState() != null)
            sb.append("VocabularyState: ").append(getVocabularyState()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getDownloadUri() != null)
            sb.append("DownloadUri: ").append(getDownloadUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMedicalVocabularyResult == false)
            return false;
        GetMedicalVocabularyResult other = (GetMedicalVocabularyResult) obj;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getVocabularyState() == null ^ this.getVocabularyState() == null)
            return false;
        if (other.getVocabularyState() != null && other.getVocabularyState().equals(this.getVocabularyState()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getDownloadUri() == null ^ this.getDownloadUri() == null)
            return false;
        if (other.getDownloadUri() != null && other.getDownloadUri().equals(this.getDownloadUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getVocabularyState() == null) ? 0 : getVocabularyState().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getDownloadUri() == null) ? 0 : getDownloadUri().hashCode());
        return hashCode;
    }

    @Override
    public GetMedicalVocabularyResult clone() {
        try {
            return (GetMedicalVocabularyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
