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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data structure that contains the information for a medical transcription job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/MedicalTranscriptionJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalTranscriptionJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name for a given medical transcription job.
     * </p>
     */
    private String medicalTranscriptionJobName;
    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     */
    private String transcriptionJobStatus;
    /**
     * <p>
     * The language code for the language spoken in the source audio file. US English (en-US) is the only supported
     * language for medical transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The sample rate, in Hertz, of the source audio containing medical information.
     * </p>
     * <p>
     * If you don't specify the sample rate, Amazon Transcribe Medical determines it for you. If you choose to specify
     * the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave
     * the <code>MediaSampleHertz</code> blank and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     */
    private Integer mediaSampleRateHertz;
    /**
     * <p>
     * The format of the input media file.
     * </p>
     */
    private String mediaFormat;

    private Media media;
    /**
     * <p>
     * An object that contains the <code>MedicalTranscript</code>. The <code>MedicalTranscript</code> contains the
     * <code>TranscriptFileUri</code>.
     * </p>
     */
    private MedicalTranscript transcript;
    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information about
     * why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>- The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>- The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>- The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and 48000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>- The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>- The size of your audio file is larger than what Amazon
     * Transcribe Medical can process. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and Quotas</a>
     * in the <i>Amazon Transcribe Medical Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>- Your audio contains more channels than
     * Amazon Transcribe Medical is configured to process. To request additional channels, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html">Amazon Transcribe Medical Endpoints
     * and Quotas</a> in the <i>Amazon Web Services General Reference</i>
     * </p>
     * </li>
     * </ul>
     */
    private String failureReason;
    /**
     * <p>
     * Object that contains object.
     * </p>
     */
    private MedicalTranscriptionSetting settings;
    /**
     * <p>
     * The medical specialty of any clinicians providing a dictation or having a conversation. <code>PRIMARYCARE</code>
     * is the only available setting for this object. This specialty enables you to generate transcriptions for the
     * following medical fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Family Medicine
     * </p>
     * </li>
     * </ul>
     */
    private String specialty;
    /**
     * <p>
     * The type of speech in the transcription job. <code>CONVERSATION</code> is generally used for patient-physician
     * dialogues. <code>DICTATION</code> is the setting for physicians speaking their notes after seeing a patient. For
     * more information, see <a>how-it-works-med</a>
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name for a given medical transcription job.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        The name for a given medical transcription job.
     */

    public void setMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        this.medicalTranscriptionJobName = medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name for a given medical transcription job.
     * </p>
     * 
     * @return The name for a given medical transcription job.
     */

    public String getMedicalTranscriptionJobName() {
        return this.medicalTranscriptionJobName;
    }

    /**
     * <p>
     * The name for a given medical transcription job.
     * </p>
     * 
     * @param medicalTranscriptionJobName
     *        The name for a given medical transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withMedicalTranscriptionJobName(String medicalTranscriptionJobName) {
        setMedicalTranscriptionJobName(medicalTranscriptionJobName);
        return this;
    }

    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The completion status of a medical transcription job.
     * @see TranscriptionJobStatus
     */

    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     * 
     * @return The completion status of a medical transcription job.
     * @see TranscriptionJobStatus
     */

    public String getTranscriptionJobStatus() {
        return this.transcriptionJobStatus;
    }

    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The completion status of a medical transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public MedicalTranscriptionJob withTranscriptionJobStatus(String transcriptionJobStatus) {
        setTranscriptionJobStatus(transcriptionJobStatus);
        return this;
    }

    /**
     * <p>
     * The completion status of a medical transcription job.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The completion status of a medical transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public MedicalTranscriptionJob withTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The language code for the language spoken in the source audio file. US English (en-US) is the only supported
     * language for medical transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language spoken in the source audio file. US English (en-US) is the only
     *        supported language for medical transcriptions. Any other value you enter for language code results in a
     *        <code>BadRequestException</code> error.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the language spoken in the source audio file. US English (en-US) is the only supported
     * language for medical transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @return The language code for the language spoken in the source audio file. US English (en-US) is the only
     *         supported language for medical transcriptions. Any other value you enter for language code results in a
     *         <code>BadRequestException</code> error.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code for the language spoken in the source audio file. US English (en-US) is the only supported
     * language for medical transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language spoken in the source audio file. US English (en-US) is the only
     *        supported language for medical transcriptions. Any other value you enter for language code results in a
     *        <code>BadRequestException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public MedicalTranscriptionJob withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code for the language spoken in the source audio file. US English (en-US) is the only supported
     * language for medical transcriptions. Any other value you enter for language code results in a
     * <code>BadRequestException</code> error.
     * </p>
     * 
     * @param languageCode
     *        The language code for the language spoken in the source audio file. US English (en-US) is the only
     *        supported language for medical transcriptions. Any other value you enter for language code results in a
     *        <code>BadRequestException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public MedicalTranscriptionJob withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the source audio containing medical information.
     * </p>
     * <p>
     * If you don't specify the sample rate, Amazon Transcribe Medical determines it for you. If you choose to specify
     * the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave
     * the <code>MediaSampleHertz</code> blank and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the source audio containing medical information.</p>
     *        <p>
     *        If you don't specify the sample rate, Amazon Transcribe Medical determines it for you. If you choose to
     *        specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you
     *        should leave the <code>MediaSampleHertz</code> blank and let Amazon Transcribe Medical determine the
     *        sample rate.
     */

    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the source audio containing medical information.
     * </p>
     * <p>
     * If you don't specify the sample rate, Amazon Transcribe Medical determines it for you. If you choose to specify
     * the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave
     * the <code>MediaSampleHertz</code> blank and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     * 
     * @return The sample rate, in Hertz, of the source audio containing medical information.</p>
     *         <p>
     *         If you don't specify the sample rate, Amazon Transcribe Medical determines it for you. If you choose to
     *         specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you
     *         should leave the <code>MediaSampleHertz</code> blank and let Amazon Transcribe Medical determine the
     *         sample rate.
     */

    public Integer getMediaSampleRateHertz() {
        return this.mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the source audio containing medical information.
     * </p>
     * <p>
     * If you don't specify the sample rate, Amazon Transcribe Medical determines it for you. If you choose to specify
     * the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave
     * the <code>MediaSampleHertz</code> blank and let Amazon Transcribe Medical determine the sample rate.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the source audio containing medical information.</p>
     *        <p>
     *        If you don't specify the sample rate, Amazon Transcribe Medical determines it for you. If you choose to
     *        specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you
     *        should leave the <code>MediaSampleHertz</code> blank and let Amazon Transcribe Medical determine the
     *        sample rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        setMediaSampleRateHertz(mediaSampleRateHertz);
        return this;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * 
     * @param mediaFormat
     *        The format of the input media file.
     * @see MediaFormat
     */

    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * 
     * @return The format of the input media file.
     * @see MediaFormat
     */

    public String getMediaFormat() {
        return this.mediaFormat;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * 
     * @param mediaFormat
     *        The format of the input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaFormat
     */

    public MedicalTranscriptionJob withMediaFormat(String mediaFormat) {
        setMediaFormat(mediaFormat);
        return this;
    }

    /**
     * <p>
     * The format of the input media file.
     * </p>
     * 
     * @param mediaFormat
     *        The format of the input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaFormat
     */

    public MedicalTranscriptionJob withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * @param media
     */

    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * @return
     */

    public Media getMedia() {
        return this.media;
    }

    /**
     * @param media
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withMedia(Media media) {
        setMedia(media);
        return this;
    }

    /**
     * <p>
     * An object that contains the <code>MedicalTranscript</code>. The <code>MedicalTranscript</code> contains the
     * <code>TranscriptFileUri</code>.
     * </p>
     * 
     * @param transcript
     *        An object that contains the <code>MedicalTranscript</code>. The <code>MedicalTranscript</code> contains
     *        the <code>TranscriptFileUri</code>.
     */

    public void setTranscript(MedicalTranscript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * An object that contains the <code>MedicalTranscript</code>. The <code>MedicalTranscript</code> contains the
     * <code>TranscriptFileUri</code>.
     * </p>
     * 
     * @return An object that contains the <code>MedicalTranscript</code>. The <code>MedicalTranscript</code> contains
     *         the <code>TranscriptFileUri</code>.
     */

    public MedicalTranscript getTranscript() {
        return this.transcript;
    }

    /**
     * <p>
     * An object that contains the <code>MedicalTranscript</code>. The <code>MedicalTranscript</code> contains the
     * <code>TranscriptFileUri</code>.
     * </p>
     * 
     * @param transcript
     *        An object that contains the <code>MedicalTranscript</code>. The <code>MedicalTranscript</code> contains
     *        the <code>TranscriptFileUri</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withTranscript(MedicalTranscript transcript) {
        setTranscript(transcript);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the job started processing.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     * 
     * @return A timestamp that shows when the job started processing.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job started processing.
     * </p>
     * 
     * @param startTime
     *        A timestamp that shows when the job started processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @return A timestamp that shows when the job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that shows when the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job was completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @return A timestamp that shows when the job was completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * A timestamp that shows when the job was completed.
     * </p>
     * 
     * @param completionTime
     *        A timestamp that shows when the job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information about
     * why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>- The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>- The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>- The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and 48000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>- The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>- The size of your audio file is larger than what Amazon
     * Transcribe Medical can process. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and Quotas</a>
     * in the <i>Amazon Transcribe Medical Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>- Your audio contains more channels than
     * Amazon Transcribe Medical is configured to process. To request additional channels, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html">Amazon Transcribe Medical Endpoints
     * and Quotas</a> in the <i>Amazon Web Services General Reference</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information
     *        about why the job failed.</p>
     *        <p>
     *        The <code>FailureReason</code> field contains one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unsupported media format</code>- The media format specified in the <code>MediaFormat</code> field of
     *        the request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid
     *        values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The media format provided does not match the detected media format</code>- The media format of the
     *        audio file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check
     *        the media format of your media file and make sure the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid sample rate for audio file</code>- The sample rate specified in the
     *        <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and
     *        48000 Hertz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The sample rate provided does not match the detected sample rate</code>- The sample rate in the
     *        audio file doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the
     *        request. Check the sample rate of your media file and make sure that the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid file size: file size too large</code>- The size of your audio file is larger than what
     *        Amazon Transcribe Medical can process. For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and
     *        Quotas</a> in the <i>Amazon Transcribe Medical Guide</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid number of channels: number of channels too large</code>- Your audio contains more channels
     *        than Amazon Transcribe Medical is configured to process. To request additional channels, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html">Amazon Transcribe Medical
     *        Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>
     *        </p>
     *        </li>
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information about
     * why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>- The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>- The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>- The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and 48000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>- The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>- The size of your audio file is larger than what Amazon
     * Transcribe Medical can process. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and Quotas</a>
     * in the <i>Amazon Transcribe Medical Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>- Your audio contains more channels than
     * Amazon Transcribe Medical is configured to process. To request additional channels, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html">Amazon Transcribe Medical Endpoints
     * and Quotas</a> in the <i>Amazon Web Services General Reference</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information
     *         about why the job failed.</p>
     *         <p>
     *         The <code>FailureReason</code> field contains one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Unsupported media format</code>- The media format specified in the <code>MediaFormat</code> field
     *         of the request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid
     *         values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The media format provided does not match the detected media format</code>- The media format of the
     *         audio file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check
     *         the media format of your media file and make sure the two values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid sample rate for audio file</code>- The sample rate specified in the
     *         <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and
     *         48000 Hertz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The sample rate provided does not match the detected sample rate</code>- The sample rate in the
     *         audio file doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the
     *         request. Check the sample rate of your media file and make sure that the two values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid file size: file size too large</code>- The size of your audio file is larger than what
     *         Amazon Transcribe Medical can process. For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and
     *         Quotas</a> in the <i>Amazon Transcribe Medical Guide</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid number of channels: number of channels too large</code>- Your audio contains more channels
     *         than Amazon Transcribe Medical is configured to process. To request additional channels, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html">Amazon Transcribe Medical
     *         Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>
     *         </p>
     *         </li>
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information about
     * why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code>- The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code>- The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code>- The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and 48000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code>- The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code>- The size of your audio file is larger than what Amazon
     * Transcribe Medical can process. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and Quotas</a>
     * in the <i>Amazon Transcribe Medical Guide</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code>- Your audio contains more channels than
     * Amazon Transcribe Medical is configured to process. To request additional channels, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html">Amazon Transcribe Medical Endpoints
     * and Quotas</a> in the <i>Amazon Web Services General Reference</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information
     *        about why the job failed.</p>
     *        <p>
     *        The <code>FailureReason</code> field contains one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unsupported media format</code>- The media format specified in the <code>MediaFormat</code> field of
     *        the request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid
     *        values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The media format provided does not match the detected media format</code>- The media format of the
     *        audio file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check
     *        the media format of your media file and make sure the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid sample rate for audio file</code>- The sample rate specified in the
     *        <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and
     *        48000 Hertz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The sample rate provided does not match the detected sample rate</code>- The sample rate in the
     *        audio file doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the
     *        request. Check the sample rate of your media file and make sure that the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid file size: file size too large</code>- The size of your audio file is larger than what
     *        Amazon Transcribe Medical can process. For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Guidelines and
     *        Quotas</a> in the <i>Amazon Transcribe Medical Guide</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid number of channels: number of channels too large</code>- Your audio contains more channels
     *        than Amazon Transcribe Medical is configured to process. To request additional channels, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/transcribe-medical.html">Amazon Transcribe Medical
     *        Endpoints and Quotas</a> in the <i>Amazon Web Services General Reference</i>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Object that contains object.
     * </p>
     * 
     * @param settings
     *        Object that contains object.
     */

    public void setSettings(MedicalTranscriptionSetting settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Object that contains object.
     * </p>
     * 
     * @return Object that contains object.
     */

    public MedicalTranscriptionSetting getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Object that contains object.
     * </p>
     * 
     * @param settings
     *        Object that contains object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MedicalTranscriptionJob withSettings(MedicalTranscriptionSetting settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The medical specialty of any clinicians providing a dictation or having a conversation. <code>PRIMARYCARE</code>
     * is the only available setting for this object. This specialty enables you to generate transcriptions for the
     * following medical fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Family Medicine
     * </p>
     * </li>
     * </ul>
     * 
     * @param specialty
     *        The medical specialty of any clinicians providing a dictation or having a conversation.
     *        <code>PRIMARYCARE</code> is the only available setting for this object. This specialty enables you to
     *        generate transcriptions for the following medical fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Family Medicine
     *        </p>
     *        </li>
     * @see Specialty
     */

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * <p>
     * The medical specialty of any clinicians providing a dictation or having a conversation. <code>PRIMARYCARE</code>
     * is the only available setting for this object. This specialty enables you to generate transcriptions for the
     * following medical fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Family Medicine
     * </p>
     * </li>
     * </ul>
     * 
     * @return The medical specialty of any clinicians providing a dictation or having a conversation.
     *         <code>PRIMARYCARE</code> is the only available setting for this object. This specialty enables you to
     *         generate transcriptions for the following medical fields:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Family Medicine
     *         </p>
     *         </li>
     * @see Specialty
     */

    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * <p>
     * The medical specialty of any clinicians providing a dictation or having a conversation. <code>PRIMARYCARE</code>
     * is the only available setting for this object. This specialty enables you to generate transcriptions for the
     * following medical fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Family Medicine
     * </p>
     * </li>
     * </ul>
     * 
     * @param specialty
     *        The medical specialty of any clinicians providing a dictation or having a conversation.
     *        <code>PRIMARYCARE</code> is the only available setting for this object. This specialty enables you to
     *        generate transcriptions for the following medical fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Family Medicine
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public MedicalTranscriptionJob withSpecialty(String specialty) {
        setSpecialty(specialty);
        return this;
    }

    /**
     * <p>
     * The medical specialty of any clinicians providing a dictation or having a conversation. <code>PRIMARYCARE</code>
     * is the only available setting for this object. This specialty enables you to generate transcriptions for the
     * following medical fields:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Family Medicine
     * </p>
     * </li>
     * </ul>
     * 
     * @param specialty
     *        The medical specialty of any clinicians providing a dictation or having a conversation.
     *        <code>PRIMARYCARE</code> is the only available setting for this object. This specialty enables you to
     *        generate transcriptions for the following medical fields:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Family Medicine
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Specialty
     */

    public MedicalTranscriptionJob withSpecialty(Specialty specialty) {
        this.specialty = specialty.toString();
        return this;
    }

    /**
     * <p>
     * The type of speech in the transcription job. <code>CONVERSATION</code> is generally used for patient-physician
     * dialogues. <code>DICTATION</code> is the setting for physicians speaking their notes after seeing a patient. For
     * more information, see <a>how-it-works-med</a>
     * </p>
     * 
     * @param type
     *        The type of speech in the transcription job. <code>CONVERSATION</code> is generally used for
     *        patient-physician dialogues. <code>DICTATION</code> is the setting for physicians speaking their notes
     *        after seeing a patient. For more information, see <a>how-it-works-med</a>
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of speech in the transcription job. <code>CONVERSATION</code> is generally used for patient-physician
     * dialogues. <code>DICTATION</code> is the setting for physicians speaking their notes after seeing a patient. For
     * more information, see <a>how-it-works-med</a>
     * </p>
     * 
     * @return The type of speech in the transcription job. <code>CONVERSATION</code> is generally used for
     *         patient-physician dialogues. <code>DICTATION</code> is the setting for physicians speaking their notes
     *         after seeing a patient. For more information, see <a>how-it-works-med</a>
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of speech in the transcription job. <code>CONVERSATION</code> is generally used for patient-physician
     * dialogues. <code>DICTATION</code> is the setting for physicians speaking their notes after seeing a patient. For
     * more information, see <a>how-it-works-med</a>
     * </p>
     * 
     * @param type
     *        The type of speech in the transcription job. <code>CONVERSATION</code> is generally used for
     *        patient-physician dialogues. <code>DICTATION</code> is the setting for physicians speaking their notes
     *        after seeing a patient. For more information, see <a>how-it-works-med</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public MedicalTranscriptionJob withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of speech in the transcription job. <code>CONVERSATION</code> is generally used for patient-physician
     * dialogues. <code>DICTATION</code> is the setting for physicians speaking their notes after seeing a patient. For
     * more information, see <a>how-it-works-med</a>
     * </p>
     * 
     * @param type
     *        The type of speech in the transcription job. <code>CONVERSATION</code> is generally used for
     *        patient-physician dialogues. <code>DICTATION</code> is the setting for physicians speaking their notes
     *        after seeing a patient. For more information, see <a>how-it-works-med</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public MedicalTranscriptionJob withType(Type type) {
        this.type = type.toString();
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
        if (getMedicalTranscriptionJobName() != null)
            sb.append("MedicalTranscriptionJobName: ").append(getMedicalTranscriptionJobName()).append(",");
        if (getTranscriptionJobStatus() != null)
            sb.append("TranscriptionJobStatus: ").append(getTranscriptionJobStatus()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getMediaSampleRateHertz() != null)
            sb.append("MediaSampleRateHertz: ").append(getMediaSampleRateHertz()).append(",");
        if (getMediaFormat() != null)
            sb.append("MediaFormat: ").append(getMediaFormat()).append(",");
        if (getMedia() != null)
            sb.append("Media: ").append(getMedia()).append(",");
        if (getTranscript() != null)
            sb.append("Transcript: ").append(getTranscript()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getSpecialty() != null)
            sb.append("Specialty: ").append(getSpecialty()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MedicalTranscriptionJob == false)
            return false;
        MedicalTranscriptionJob other = (MedicalTranscriptionJob) obj;
        if (other.getMedicalTranscriptionJobName() == null ^ this.getMedicalTranscriptionJobName() == null)
            return false;
        if (other.getMedicalTranscriptionJobName() != null && other.getMedicalTranscriptionJobName().equals(this.getMedicalTranscriptionJobName()) == false)
            return false;
        if (other.getTranscriptionJobStatus() == null ^ this.getTranscriptionJobStatus() == null)
            return false;
        if (other.getTranscriptionJobStatus() != null && other.getTranscriptionJobStatus().equals(this.getTranscriptionJobStatus()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getMediaSampleRateHertz() == null ^ this.getMediaSampleRateHertz() == null)
            return false;
        if (other.getMediaSampleRateHertz() != null && other.getMediaSampleRateHertz().equals(this.getMediaSampleRateHertz()) == false)
            return false;
        if (other.getMediaFormat() == null ^ this.getMediaFormat() == null)
            return false;
        if (other.getMediaFormat() != null && other.getMediaFormat().equals(this.getMediaFormat()) == false)
            return false;
        if (other.getMedia() == null ^ this.getMedia() == null)
            return false;
        if (other.getMedia() != null && other.getMedia().equals(this.getMedia()) == false)
            return false;
        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getSpecialty() == null ^ this.getSpecialty() == null)
            return false;
        if (other.getSpecialty() != null && other.getSpecialty().equals(this.getSpecialty()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMedicalTranscriptionJobName() == null) ? 0 : getMedicalTranscriptionJobName().hashCode());
        hashCode = prime * hashCode + ((getTranscriptionJobStatus() == null) ? 0 : getTranscriptionJobStatus().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getSpecialty() == null) ? 0 : getSpecialty().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public MedicalTranscriptionJob clone() {
        try {
            return (MedicalTranscriptionJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.MedicalTranscriptionJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
