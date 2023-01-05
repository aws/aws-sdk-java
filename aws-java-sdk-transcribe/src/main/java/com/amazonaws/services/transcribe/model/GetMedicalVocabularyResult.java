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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/GetMedicalVocabulary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMedicalVocabularyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom medical vocabulary you requested information about.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The language code you selected for your custom medical vocabulary. US English (<code>en-US</code>) is the only
     * language supported with Amazon Transcribe Medical.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The processing state of your custom medical vocabulary. If the state is <code>READY</code>, you can use the
     * custom vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     */
    private String vocabularyState;
    /**
     * <p>
     * The date and time the specified custom medical vocabulary was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * If <code>VocabularyState</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about why
     * the custom medical vocabulary request failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The S3 location where the specified custom medical vocabulary is stored; use this URI to view or download the
     * custom vocabulary.
     * </p>
     */
    private String downloadUri;

    /**
     * <p>
     * The name of the custom medical vocabulary you requested information about.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the custom medical vocabulary you requested information about.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the custom medical vocabulary you requested information about.
     * </p>
     * 
     * @return The name of the custom medical vocabulary you requested information about.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the custom medical vocabulary you requested information about.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the custom medical vocabulary you requested information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMedicalVocabularyResult withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The language code you selected for your custom medical vocabulary. US English (<code>en-US</code>) is the only
     * language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code you selected for your custom medical vocabulary. US English (<code>en-US</code>) is the
     *        only language supported with Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code you selected for your custom medical vocabulary. US English (<code>en-US</code>) is the only
     * language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @return The language code you selected for your custom medical vocabulary. US English (<code>en-US</code>) is the
     *         only language supported with Amazon Transcribe Medical.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code you selected for your custom medical vocabulary. US English (<code>en-US</code>) is the only
     * language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code you selected for your custom medical vocabulary. US English (<code>en-US</code>) is the
     *        only language supported with Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public GetMedicalVocabularyResult withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code you selected for your custom medical vocabulary. US English (<code>en-US</code>) is the only
     * language supported with Amazon Transcribe Medical.
     * </p>
     * 
     * @param languageCode
     *        The language code you selected for your custom medical vocabulary. US English (<code>en-US</code>) is the
     *        only language supported with Amazon Transcribe Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public GetMedicalVocabularyResult withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The processing state of your custom medical vocabulary. If the state is <code>READY</code>, you can use the
     * custom vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of your custom medical vocabulary. If the state is <code>READY</code>, you can use
     *        the custom vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * @see VocabularyState
     */

    public void setVocabularyState(String vocabularyState) {
        this.vocabularyState = vocabularyState;
    }

    /**
     * <p>
     * The processing state of your custom medical vocabulary. If the state is <code>READY</code>, you can use the
     * custom vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @return The processing state of your custom medical vocabulary. If the state is <code>READY</code>, you can use
     *         the custom vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * @see VocabularyState
     */

    public String getVocabularyState() {
        return this.vocabularyState;
    }

    /**
     * <p>
     * The processing state of your custom medical vocabulary. If the state is <code>READY</code>, you can use the
     * custom vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of your custom medical vocabulary. If the state is <code>READY</code>, you can use
     *        the custom vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public GetMedicalVocabularyResult withVocabularyState(String vocabularyState) {
        setVocabularyState(vocabularyState);
        return this;
    }

    /**
     * <p>
     * The processing state of your custom medical vocabulary. If the state is <code>READY</code>, you can use the
     * custom vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * </p>
     * 
     * @param vocabularyState
     *        The processing state of your custom medical vocabulary. If the state is <code>READY</code>, you can use
     *        the custom vocabulary in a <code>StartMedicalTranscriptionJob</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyState
     */

    public GetMedicalVocabularyResult withVocabularyState(VocabularyState vocabularyState) {
        this.vocabularyState = vocabularyState.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the specified custom medical vocabulary was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the specified custom medical vocabulary was last modified.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the specified custom medical vocabulary was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @return The date and time the specified custom medical vocabulary was last modified.</p>
     *         <p>
     *         Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *         <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time the specified custom medical vocabulary was last modified.
     * </p>
     * <p>
     * Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     * <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time the specified custom medical vocabulary was last modified.</p>
     *        <p>
     *        Timestamps are in the format <code>YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC</code>. For example,
     *        <code>2022-05-04T12:32:58.761000-07:00</code> represents 12:32 PM UTC-7 on May 4, 2022.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMedicalVocabularyResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * If <code>VocabularyState</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about why
     * the custom medical vocabulary request failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @param failureReason
     *        If <code>VocabularyState</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     *        about why the custom medical vocabulary request failed. See also: <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If <code>VocabularyState</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about why
     * the custom medical vocabulary request failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @return If <code>VocabularyState</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     *         about why the custom medical vocabulary request failed. See also: <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If <code>VocabularyState</code> is <code>FAILED</code>, <code>FailureReason</code> contains information about why
     * the custom medical vocabulary request failed. See also: <a
     * href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * </p>
     * 
     * @param failureReason
     *        If <code>VocabularyState</code> is <code>FAILED</code>, <code>FailureReason</code> contains information
     *        about why the custom medical vocabulary request failed. See also: <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/APIReference/CommonErrors.html">Common Errors</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMedicalVocabularyResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The S3 location where the specified custom medical vocabulary is stored; use this URI to view or download the
     * custom vocabulary.
     * </p>
     * 
     * @param downloadUri
     *        The S3 location where the specified custom medical vocabulary is stored; use this URI to view or download
     *        the custom vocabulary.
     */

    public void setDownloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
    }

    /**
     * <p>
     * The S3 location where the specified custom medical vocabulary is stored; use this URI to view or download the
     * custom vocabulary.
     * </p>
     * 
     * @return The S3 location where the specified custom medical vocabulary is stored; use this URI to view or download
     *         the custom vocabulary.
     */

    public String getDownloadUri() {
        return this.downloadUri;
    }

    /**
     * <p>
     * The S3 location where the specified custom medical vocabulary is stored; use this URI to view or download the
     * custom vocabulary.
     * </p>
     * 
     * @param downloadUri
     *        The S3 location where the specified custom medical vocabulary is stored; use this URI to view or download
     *        the custom vocabulary.
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
