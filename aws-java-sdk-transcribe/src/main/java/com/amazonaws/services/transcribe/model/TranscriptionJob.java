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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an asynchronous transcription job that was created with the <code>StartTranscriptionJob</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/TranscriptionJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptionJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     */
    private String transcriptionJobName;
    /**
     * <p>
     * The status of the transcription job.
     * </p>
     */
    private String transcriptionJobStatus;
    /**
     * <p>
     * The language code for the input speech.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     */
    private Integer mediaSampleRateHertz;
    /**
     * <p>
     * The format of the input media file.
     * </p>
     */
    private String mediaFormat;
    /**
     * <p>
     * An object that describes the input media for the transcription job.
     * </p>
     */
    private Media media;
    /**
     * <p>
     * An object that describes the output of the transcription job.
     * </p>
     */
    private Transcript transcript;
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
     * The <code>FailureReason</code> field can contain one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code> - The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code> - The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code> - The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and 48000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code> - The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code> - The size of your audio file is larger than Amazon
     * Transcribe can process. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Limits</a> in the <i>Amazon
     * Transcribe Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code> - Your audio contains more channels than
     * Amazon Transcribe is configured to process. To request additional channels, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe">Amazon
     * Transcribe Limits</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String failureReason;
    /**
     * <p>
     * Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the
     * maximum number of speakers that should be identified and to specify a custom vocabulary to use when processing
     * the transcription job.
     * </p>
     */
    private Settings settings;

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the transcription job.
     */

    public void setTranscriptionJobName(String transcriptionJobName) {
        this.transcriptionJobName = transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * 
     * @return The name of the transcription job.
     */

    public String getTranscriptionJobName() {
        return this.transcriptionJobName;
    }

    /**
     * <p>
     * The name of the transcription job.
     * </p>
     * 
     * @param transcriptionJobName
     *        The name of the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJob withTranscriptionJobName(String transcriptionJobName) {
        setTranscriptionJobName(transcriptionJobName);
        return this;
    }

    /**
     * <p>
     * The status of the transcription job.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The status of the transcription job.
     * @see TranscriptionJobStatus
     */

    public void setTranscriptionJobStatus(String transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the transcription job.
     * </p>
     * 
     * @return The status of the transcription job.
     * @see TranscriptionJobStatus
     */

    public String getTranscriptionJobStatus() {
        return this.transcriptionJobStatus;
    }

    /**
     * <p>
     * The status of the transcription job.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The status of the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public TranscriptionJob withTranscriptionJobStatus(String transcriptionJobStatus) {
        setTranscriptionJobStatus(transcriptionJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the transcription job.
     * </p>
     * 
     * @param transcriptionJobStatus
     *        The status of the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptionJobStatus
     */

    public TranscriptionJob withTranscriptionJobStatus(TranscriptionJobStatus transcriptionJobStatus) {
        this.transcriptionJobStatus = transcriptionJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * 
     * @param languageCode
     *        The language code for the input speech.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * 
     * @return The language code for the input speech.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * 
     * @param languageCode
     *        The language code for the input speech.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public TranscriptionJob withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code for the input speech.
     * </p>
     * 
     * @param languageCode
     *        The language code for the input speech.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public TranscriptionJob withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the audio track in the input media file.
     */

    public void setMediaSampleRateHertz(Integer mediaSampleRateHertz) {
        this.mediaSampleRateHertz = mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * 
     * @return The sample rate, in Hertz, of the audio track in the input media file.
     */

    public Integer getMediaSampleRateHertz() {
        return this.mediaSampleRateHertz;
    }

    /**
     * <p>
     * The sample rate, in Hertz, of the audio track in the input media file.
     * </p>
     * 
     * @param mediaSampleRateHertz
     *        The sample rate, in Hertz, of the audio track in the input media file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJob withMediaSampleRateHertz(Integer mediaSampleRateHertz) {
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

    public TranscriptionJob withMediaFormat(String mediaFormat) {
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

    public TranscriptionJob withMediaFormat(MediaFormat mediaFormat) {
        this.mediaFormat = mediaFormat.toString();
        return this;
    }

    /**
     * <p>
     * An object that describes the input media for the transcription job.
     * </p>
     * 
     * @param media
     *        An object that describes the input media for the transcription job.
     */

    public void setMedia(Media media) {
        this.media = media;
    }

    /**
     * <p>
     * An object that describes the input media for the transcription job.
     * </p>
     * 
     * @return An object that describes the input media for the transcription job.
     */

    public Media getMedia() {
        return this.media;
    }

    /**
     * <p>
     * An object that describes the input media for the transcription job.
     * </p>
     * 
     * @param media
     *        An object that describes the input media for the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJob withMedia(Media media) {
        setMedia(media);
        return this;
    }

    /**
     * <p>
     * An object that describes the output of the transcription job.
     * </p>
     * 
     * @param transcript
     *        An object that describes the output of the transcription job.
     */

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * An object that describes the output of the transcription job.
     * </p>
     * 
     * @return An object that describes the output of the transcription job.
     */

    public Transcript getTranscript() {
        return this.transcript;
    }

    /**
     * <p>
     * An object that describes the output of the transcription job.
     * </p>
     * 
     * @param transcript
     *        An object that describes the output of the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJob withTranscript(Transcript transcript) {
        setTranscript(transcript);
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

    public TranscriptionJob withCreationTime(java.util.Date creationTime) {
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

    public TranscriptionJob withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information about
     * why the job failed.
     * </p>
     * <p>
     * The <code>FailureReason</code> field can contain one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code> - The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code> - The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code> - The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and 48000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code> - The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code> - The size of your audio file is larger than Amazon
     * Transcribe can process. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Limits</a> in the <i>Amazon
     * Transcribe Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code> - Your audio contains more channels than
     * Amazon Transcribe is configured to process. To request additional channels, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe">Amazon
     * Transcribe Limits</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information
     *        about why the job failed.</p>
     *        <p>
     *        The <code>FailureReason</code> field can contain one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unsupported media format</code> - The media format specified in the <code>MediaFormat</code> field
     *        of the request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid
     *        values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The media format provided does not match the detected media format</code> - The media format of the
     *        audio file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check
     *        the media format of your media file and make sure that the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid sample rate for audio file</code> - The sample rate specified in the
     *        <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and
     *        48000 Hertz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The sample rate provided does not match the detected sample rate</code> - The sample rate in the
     *        audio file doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the
     *        request. Check the sample rate of your media file and make sure that the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid file size: file size too large</code> - The size of your audio file is larger than Amazon
     *        Transcribe can process. For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Limits</a> in the
     *        <i>Amazon Transcribe Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid number of channels: number of channels too large</code> - Your audio contains more channels
     *        than Amazon Transcribe is configured to process. To request additional channels, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe"
     *        >Amazon Transcribe Limits</a> in the <i>Amazon Web Services General Reference</i>.
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
     * The <code>FailureReason</code> field can contain one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code> - The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code> - The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code> - The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and 48000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code> - The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code> - The size of your audio file is larger than Amazon
     * Transcribe can process. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Limits</a> in the <i>Amazon
     * Transcribe Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code> - Your audio contains more channels than
     * Amazon Transcribe is configured to process. To request additional channels, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe">Amazon
     * Transcribe Limits</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information
     *         about why the job failed.</p>
     *         <p>
     *         The <code>FailureReason</code> field can contain one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Unsupported media format</code> - The media format specified in the <code>MediaFormat</code> field
     *         of the request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid
     *         values.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The media format provided does not match the detected media format</code> - The media format of the
     *         audio file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check
     *         the media format of your media file and make sure that the two values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid sample rate for audio file</code> - The sample rate specified in the
     *         <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and
     *         48000 Hertz.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>The sample rate provided does not match the detected sample rate</code> - The sample rate in the
     *         audio file doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the
     *         request. Check the sample rate of your media file and make sure that the two values match.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid file size: file size too large</code> - The size of your audio file is larger than Amazon
     *         Transcribe can process. For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Limits</a> in the
     *         <i>Amazon Transcribe Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Invalid number of channels: number of channels too large</code> - Your audio contains more channels
     *         than Amazon Transcribe is configured to process. To request additional channels, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe"
     *         >Amazon Transcribe Limits</a> in the <i>Amazon Web Services General Reference</i>.
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
     * The <code>FailureReason</code> field can contain one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Unsupported media format</code> - The media format specified in the <code>MediaFormat</code> field of the
     * request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The media format provided does not match the detected media format</code> - The media format of the audio
     * file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check the media
     * format of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid sample rate for audio file</code> - The sample rate specified in the
     * <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and 48000
     * Hertz.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>The sample rate provided does not match the detected sample rate</code> - The sample rate in the audio file
     * doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the request. Check the
     * sample rate of your media file and make sure that the two values match.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid file size: file size too large</code> - The size of your audio file is larger than Amazon
     * Transcribe can process. For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Limits</a> in the <i>Amazon
     * Transcribe Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Invalid number of channels: number of channels too large</code> - Your audio contains more channels than
     * Amazon Transcribe is configured to process. To request additional channels, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe">Amazon
     * Transcribe Limits</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param failureReason
     *        If the <code>TranscriptionJobStatus</code> field is <code>FAILED</code>, this field contains information
     *        about why the job failed.</p>
     *        <p>
     *        The <code>FailureReason</code> field can contain one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Unsupported media format</code> - The media format specified in the <code>MediaFormat</code> field
     *        of the request isn't valid. See the description of the <code>MediaFormat</code> field for a list of valid
     *        values.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The media format provided does not match the detected media format</code> - The media format of the
     *        audio file doesn't match the format specified in the <code>MediaFormat</code> field in the request. Check
     *        the media format of your media file and make sure that the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid sample rate for audio file</code> - The sample rate specified in the
     *        <code>MediaSampleRateHertz</code> of the request isn't valid. The sample rate must be between 8000 and
     *        48000 Hertz.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>The sample rate provided does not match the detected sample rate</code> - The sample rate in the
     *        audio file doesn't match the sample rate specified in the <code>MediaSampleRateHertz</code> field in the
     *        request. Check the sample rate of your media file and make sure that the two values match.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid file size: file size too large</code> - The size of your audio file is larger than Amazon
     *        Transcribe can process. For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/limits-guidelines.html#limits">Limits</a> in the
     *        <i>Amazon Transcribe Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Invalid number of channels: number of channels too large</code> - Your audio contains more channels
     *        than Amazon Transcribe is configured to process. To request additional channels, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits-amazon-transcribe"
     *        >Amazon Transcribe Limits</a> in the <i>Amazon Web Services General Reference</i>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the
     * maximum number of speakers that should be identified and to specify a custom vocabulary to use when processing
     * the transcription job.
     * </p>
     * 
     * @param settings
     *        Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the
     *        maximum number of speakers that should be identified and to specify a custom vocabulary to use when
     *        processing the transcription job.
     */

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the
     * maximum number of speakers that should be identified and to specify a custom vocabulary to use when processing
     * the transcription job.
     * </p>
     * 
     * @return Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set
     *         the maximum number of speakers that should be identified and to specify a custom vocabulary to use when
     *         processing the transcription job.
     */

    public Settings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the
     * maximum number of speakers that should be identified and to specify a custom vocabulary to use when processing
     * the transcription job.
     * </p>
     * 
     * @param settings
     *        Optional settings for the transcription job. Use these settings to turn on speaker recognition, to set the
     *        maximum number of speakers that should be identified and to specify a custom vocabulary to use when
     *        processing the transcription job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptionJob withSettings(Settings settings) {
        setSettings(settings);
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
        if (getTranscriptionJobName() != null)
            sb.append("TranscriptionJobName: ").append(getTranscriptionJobName()).append(",");
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptionJob == false)
            return false;
        TranscriptionJob other = (TranscriptionJob) obj;
        if (other.getTranscriptionJobName() == null ^ this.getTranscriptionJobName() == null)
            return false;
        if (other.getTranscriptionJobName() != null && other.getTranscriptionJobName().equals(this.getTranscriptionJobName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptionJobName() == null) ? 0 : getTranscriptionJobName().hashCode());
        hashCode = prime * hashCode + ((getTranscriptionJobStatus() == null) ? 0 : getTranscriptionJobStatus().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getMediaSampleRateHertz() == null) ? 0 : getMediaSampleRateHertz().hashCode());
        hashCode = prime * hashCode + ((getMediaFormat() == null) ? 0 : getMediaFormat().hashCode());
        hashCode = prime * hashCode + ((getMedia() == null) ? 0 : getMedia().hashCode());
        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public TranscriptionJob clone() {
        try {
            return (TranscriptionJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.TranscriptionJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
