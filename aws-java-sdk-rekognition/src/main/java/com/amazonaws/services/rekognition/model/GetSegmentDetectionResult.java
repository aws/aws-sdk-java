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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSegmentDetectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Current status of the segment detection job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Currently, Amazon Rekognition Video returns a single object in the <code>VideoMetadata</code> array. The object
     * contains information about the video stream in the input file that Amazon Rekognition Video chose to analyze. The
     * <code>VideoMetadata</code> object includes the video codec, video format and other information. Video metadata is
     * returned in each page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     */
    private java.util.List<VideoMetadata> videoMetadata;
    /**
     * <p>
     * An array of objects. There can be multiple audio streams. Each <code>AudioMetadata</code> object contains
     * metadata for a single audio stream. Audio information in an <code>AudioMetadata</code> objects includes the audio
     * codec, the number of audio channels, the duration of the audio stream, and the sample rate. Audio metadata is
     * returned in each page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     */
    private java.util.List<AudioMetadata> audioMetadata;
    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or SHOT)
     * specified in the <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Within each
     * segment type the array is sorted by timestamp values.
     * </p>
     */
    private java.util.List<SegmentDetection> segments;
    /**
     * <p>
     * An array containing the segment types requested in the call to <code>StartSegmentDetection</code>.
     * </p>
     */
    private java.util.List<SegmentTypeInfo> selectedSegmentTypes;

    /**
     * <p>
     * Current status of the segment detection job.
     * </p>
     * 
     * @param jobStatus
     *        Current status of the segment detection job.
     * @see VideoJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * Current status of the segment detection job.
     * </p>
     * 
     * @return Current status of the segment detection job.
     * @see VideoJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * Current status of the segment detection job.
     * </p>
     * 
     * @param jobStatus
     *        Current status of the segment detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetSegmentDetectionResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the segment detection job.
     * </p>
     * 
     * @param jobStatus
     *        Current status of the segment detection job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoJobStatus
     */

    public GetSegmentDetectionResult withJobStatus(VideoJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * </p>
     * 
     * @param statusMessage
     *        If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * </p>
     * 
     * @return If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * </p>
     * 
     * @param statusMessage
     *        If the job fails, <code>StatusMessage</code> provides a descriptive error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentDetectionResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Currently, Amazon Rekognition Video returns a single object in the <code>VideoMetadata</code> array. The object
     * contains information about the video stream in the input file that Amazon Rekognition Video chose to analyze. The
     * <code>VideoMetadata</code> object includes the video codec, video format and other information. Video metadata is
     * returned in each page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * 
     * @return Currently, Amazon Rekognition Video returns a single object in the <code>VideoMetadata</code> array. The
     *         object contains information about the video stream in the input file that Amazon Rekognition Video chose
     *         to analyze. The <code>VideoMetadata</code> object includes the video codec, video format and other
     *         information. Video metadata is returned in each page of information returned by
     *         <code>GetSegmentDetection</code>.
     */

    public java.util.List<VideoMetadata> getVideoMetadata() {
        return videoMetadata;
    }

    /**
     * <p>
     * Currently, Amazon Rekognition Video returns a single object in the <code>VideoMetadata</code> array. The object
     * contains information about the video stream in the input file that Amazon Rekognition Video chose to analyze. The
     * <code>VideoMetadata</code> object includes the video codec, video format and other information. Video metadata is
     * returned in each page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * 
     * @param videoMetadata
     *        Currently, Amazon Rekognition Video returns a single object in the <code>VideoMetadata</code> array. The
     *        object contains information about the video stream in the input file that Amazon Rekognition Video chose
     *        to analyze. The <code>VideoMetadata</code> object includes the video codec, video format and other
     *        information. Video metadata is returned in each page of information returned by
     *        <code>GetSegmentDetection</code>.
     */

    public void setVideoMetadata(java.util.Collection<VideoMetadata> videoMetadata) {
        if (videoMetadata == null) {
            this.videoMetadata = null;
            return;
        }

        this.videoMetadata = new java.util.ArrayList<VideoMetadata>(videoMetadata);
    }

    /**
     * <p>
     * Currently, Amazon Rekognition Video returns a single object in the <code>VideoMetadata</code> array. The object
     * contains information about the video stream in the input file that Amazon Rekognition Video chose to analyze. The
     * <code>VideoMetadata</code> object includes the video codec, video format and other information. Video metadata is
     * returned in each page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVideoMetadata(java.util.Collection)} or {@link #withVideoMetadata(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param videoMetadata
     *        Currently, Amazon Rekognition Video returns a single object in the <code>VideoMetadata</code> array. The
     *        object contains information about the video stream in the input file that Amazon Rekognition Video chose
     *        to analyze. The <code>VideoMetadata</code> object includes the video codec, video format and other
     *        information. Video metadata is returned in each page of information returned by
     *        <code>GetSegmentDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentDetectionResult withVideoMetadata(VideoMetadata... videoMetadata) {
        if (this.videoMetadata == null) {
            setVideoMetadata(new java.util.ArrayList<VideoMetadata>(videoMetadata.length));
        }
        for (VideoMetadata ele : videoMetadata) {
            this.videoMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Currently, Amazon Rekognition Video returns a single object in the <code>VideoMetadata</code> array. The object
     * contains information about the video stream in the input file that Amazon Rekognition Video chose to analyze. The
     * <code>VideoMetadata</code> object includes the video codec, video format and other information. Video metadata is
     * returned in each page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * 
     * @param videoMetadata
     *        Currently, Amazon Rekognition Video returns a single object in the <code>VideoMetadata</code> array. The
     *        object contains information about the video stream in the input file that Amazon Rekognition Video chose
     *        to analyze. The <code>VideoMetadata</code> object includes the video codec, video format and other
     *        information. Video metadata is returned in each page of information returned by
     *        <code>GetSegmentDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentDetectionResult withVideoMetadata(java.util.Collection<VideoMetadata> videoMetadata) {
        setVideoMetadata(videoMetadata);
        return this;
    }

    /**
     * <p>
     * An array of objects. There can be multiple audio streams. Each <code>AudioMetadata</code> object contains
     * metadata for a single audio stream. Audio information in an <code>AudioMetadata</code> objects includes the audio
     * codec, the number of audio channels, the duration of the audio stream, and the sample rate. Audio metadata is
     * returned in each page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * 
     * @return An array of objects. There can be multiple audio streams. Each <code>AudioMetadata</code> object contains
     *         metadata for a single audio stream. Audio information in an <code>AudioMetadata</code> objects includes
     *         the audio codec, the number of audio channels, the duration of the audio stream, and the sample rate.
     *         Audio metadata is returned in each page of information returned by <code>GetSegmentDetection</code>.
     */

    public java.util.List<AudioMetadata> getAudioMetadata() {
        return audioMetadata;
    }

    /**
     * <p>
     * An array of objects. There can be multiple audio streams. Each <code>AudioMetadata</code> object contains
     * metadata for a single audio stream. Audio information in an <code>AudioMetadata</code> objects includes the audio
     * codec, the number of audio channels, the duration of the audio stream, and the sample rate. Audio metadata is
     * returned in each page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * 
     * @param audioMetadata
     *        An array of objects. There can be multiple audio streams. Each <code>AudioMetadata</code> object contains
     *        metadata for a single audio stream. Audio information in an <code>AudioMetadata</code> objects includes
     *        the audio codec, the number of audio channels, the duration of the audio stream, and the sample rate.
     *        Audio metadata is returned in each page of information returned by <code>GetSegmentDetection</code>.
     */

    public void setAudioMetadata(java.util.Collection<AudioMetadata> audioMetadata) {
        if (audioMetadata == null) {
            this.audioMetadata = null;
            return;
        }

        this.audioMetadata = new java.util.ArrayList<AudioMetadata>(audioMetadata);
    }

    /**
     * <p>
     * An array of objects. There can be multiple audio streams. Each <code>AudioMetadata</code> object contains
     * metadata for a single audio stream. Audio information in an <code>AudioMetadata</code> objects includes the audio
     * codec, the number of audio channels, the duration of the audio stream, and the sample rate. Audio metadata is
     * returned in each page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioMetadata(java.util.Collection)} or {@link #withAudioMetadata(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param audioMetadata
     *        An array of objects. There can be multiple audio streams. Each <code>AudioMetadata</code> object contains
     *        metadata for a single audio stream. Audio information in an <code>AudioMetadata</code> objects includes
     *        the audio codec, the number of audio channels, the duration of the audio stream, and the sample rate.
     *        Audio metadata is returned in each page of information returned by <code>GetSegmentDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentDetectionResult withAudioMetadata(AudioMetadata... audioMetadata) {
        if (this.audioMetadata == null) {
            setAudioMetadata(new java.util.ArrayList<AudioMetadata>(audioMetadata.length));
        }
        for (AudioMetadata ele : audioMetadata) {
            this.audioMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects. There can be multiple audio streams. Each <code>AudioMetadata</code> object contains
     * metadata for a single audio stream. Audio information in an <code>AudioMetadata</code> objects includes the audio
     * codec, the number of audio channels, the duration of the audio stream, and the sample rate. Audio metadata is
     * returned in each page of information returned by <code>GetSegmentDetection</code>.
     * </p>
     * 
     * @param audioMetadata
     *        An array of objects. There can be multiple audio streams. Each <code>AudioMetadata</code> object contains
     *        metadata for a single audio stream. Audio information in an <code>AudioMetadata</code> objects includes
     *        the audio codec, the number of audio channels, the duration of the audio stream, and the sample rate.
     *        Audio metadata is returned in each page of information returned by <code>GetSegmentDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentDetectionResult withAudioMetadata(java.util.Collection<AudioMetadata> audioMetadata) {
        setAudioMetadata(audioMetadata);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition
     *        Video returns a pagination token in the response. You can use this pagination token to retrieve the next
     *        set of text.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
     * </p>
     * 
     * @return If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition
     *         Video returns a pagination token in the response. You can use this pagination token to retrieve the next
     *         set of text.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition
     *        Video returns a pagination token in the response. You can use this pagination token to retrieve the next
     *        set of text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentDetectionResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or SHOT)
     * specified in the <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Within each
     * segment type the array is sorted by timestamp values.
     * </p>
     * 
     * @return An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or
     *         SHOT) specified in the <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>.
     *         Within each segment type the array is sorted by timestamp values.
     */

    public java.util.List<SegmentDetection> getSegments() {
        return segments;
    }

    /**
     * <p>
     * An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or SHOT)
     * specified in the <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Within each
     * segment type the array is sorted by timestamp values.
     * </p>
     * 
     * @param segments
     *        An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or SHOT)
     *        specified in the <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Within
     *        each segment type the array is sorted by timestamp values.
     */

    public void setSegments(java.util.Collection<SegmentDetection> segments) {
        if (segments == null) {
            this.segments = null;
            return;
        }

        this.segments = new java.util.ArrayList<SegmentDetection>(segments);
    }

    /**
     * <p>
     * An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or SHOT)
     * specified in the <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Within each
     * segment type the array is sorted by timestamp values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegments(java.util.Collection)} or {@link #withSegments(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param segments
     *        An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or SHOT)
     *        specified in the <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Within
     *        each segment type the array is sorted by timestamp values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentDetectionResult withSegments(SegmentDetection... segments) {
        if (this.segments == null) {
            setSegments(new java.util.ArrayList<SegmentDetection>(segments.length));
        }
        for (SegmentDetection ele : segments) {
            this.segments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or SHOT)
     * specified in the <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Within each
     * segment type the array is sorted by timestamp values.
     * </p>
     * 
     * @param segments
     *        An array of segments detected in a video. The array is sorted by the segment types (TECHNICAL_CUE or SHOT)
     *        specified in the <code>SegmentTypes</code> input parameter of <code>StartSegmentDetection</code>. Within
     *        each segment type the array is sorted by timestamp values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentDetectionResult withSegments(java.util.Collection<SegmentDetection> segments) {
        setSegments(segments);
        return this;
    }

    /**
     * <p>
     * An array containing the segment types requested in the call to <code>StartSegmentDetection</code>.
     * </p>
     * 
     * @return An array containing the segment types requested in the call to <code>StartSegmentDetection</code>.
     */

    public java.util.List<SegmentTypeInfo> getSelectedSegmentTypes() {
        return selectedSegmentTypes;
    }

    /**
     * <p>
     * An array containing the segment types requested in the call to <code>StartSegmentDetection</code>.
     * </p>
     * 
     * @param selectedSegmentTypes
     *        An array containing the segment types requested in the call to <code>StartSegmentDetection</code>.
     */

    public void setSelectedSegmentTypes(java.util.Collection<SegmentTypeInfo> selectedSegmentTypes) {
        if (selectedSegmentTypes == null) {
            this.selectedSegmentTypes = null;
            return;
        }

        this.selectedSegmentTypes = new java.util.ArrayList<SegmentTypeInfo>(selectedSegmentTypes);
    }

    /**
     * <p>
     * An array containing the segment types requested in the call to <code>StartSegmentDetection</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedSegmentTypes(java.util.Collection)} or {@link #withSelectedSegmentTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param selectedSegmentTypes
     *        An array containing the segment types requested in the call to <code>StartSegmentDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentDetectionResult withSelectedSegmentTypes(SegmentTypeInfo... selectedSegmentTypes) {
        if (this.selectedSegmentTypes == null) {
            setSelectedSegmentTypes(new java.util.ArrayList<SegmentTypeInfo>(selectedSegmentTypes.length));
        }
        for (SegmentTypeInfo ele : selectedSegmentTypes) {
            this.selectedSegmentTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the segment types requested in the call to <code>StartSegmentDetection</code>.
     * </p>
     * 
     * @param selectedSegmentTypes
     *        An array containing the segment types requested in the call to <code>StartSegmentDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSegmentDetectionResult withSelectedSegmentTypes(java.util.Collection<SegmentTypeInfo> selectedSegmentTypes) {
        setSelectedSegmentTypes(selectedSegmentTypes);
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
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getVideoMetadata() != null)
            sb.append("VideoMetadata: ").append(getVideoMetadata()).append(",");
        if (getAudioMetadata() != null)
            sb.append("AudioMetadata: ").append(getAudioMetadata()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSegments() != null)
            sb.append("Segments: ").append(getSegments()).append(",");
        if (getSelectedSegmentTypes() != null)
            sb.append("SelectedSegmentTypes: ").append(getSelectedSegmentTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSegmentDetectionResult == false)
            return false;
        GetSegmentDetectionResult other = (GetSegmentDetectionResult) obj;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getVideoMetadata() == null ^ this.getVideoMetadata() == null)
            return false;
        if (other.getVideoMetadata() != null && other.getVideoMetadata().equals(this.getVideoMetadata()) == false)
            return false;
        if (other.getAudioMetadata() == null ^ this.getAudioMetadata() == null)
            return false;
        if (other.getAudioMetadata() != null && other.getAudioMetadata().equals(this.getAudioMetadata()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSegments() == null ^ this.getSegments() == null)
            return false;
        if (other.getSegments() != null && other.getSegments().equals(this.getSegments()) == false)
            return false;
        if (other.getSelectedSegmentTypes() == null ^ this.getSelectedSegmentTypes() == null)
            return false;
        if (other.getSelectedSegmentTypes() != null && other.getSelectedSegmentTypes().equals(this.getSelectedSegmentTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getVideoMetadata() == null) ? 0 : getVideoMetadata().hashCode());
        hashCode = prime * hashCode + ((getAudioMetadata() == null) ? 0 : getAudioMetadata().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSegments() == null) ? 0 : getSegments().hashCode());
        hashCode = prime * hashCode + ((getSelectedSegmentTypes() == null) ? 0 : getSelectedSegmentTypes().hashCode());
        return hashCode;
    }

    @Override
    public GetSegmentDetectionResult clone() {
        try {
            return (GetSegmentDetectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
