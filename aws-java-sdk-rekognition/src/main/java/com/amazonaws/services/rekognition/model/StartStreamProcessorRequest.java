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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartStreamProcessorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream processor to start processing.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the starting point in the Kinesis stream to start processing. You can use the producer timestamp or the
     * fragment number. If you use the producer timestamp, you must put the time in milliseconds. For more information
     * about fragment numbers, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_reader_Fragment.html">Fragment</a>.
     * </p>
     * <p>
     * This is a required parameter for label detection stream processors and should not be used to start a face search
     * stream processor.
     * </p>
     */
    private StreamProcessingStartSelector startSelector;
    /**
     * <p>
     * Specifies when to stop processing the stream. You can specify a maximum amount of time to process the video.
     * </p>
     * <p>
     * This is a required parameter for label detection stream processors and should not be used to start a face search
     * stream processor.
     * </p>
     */
    private StreamProcessingStopSelector stopSelector;

    /**
     * <p>
     * The name of the stream processor to start processing.
     * </p>
     * 
     * @param name
     *        The name of the stream processor to start processing.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the stream processor to start processing.
     * </p>
     * 
     * @return The name of the stream processor to start processing.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the stream processor to start processing.
     * </p>
     * 
     * @param name
     *        The name of the stream processor to start processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartStreamProcessorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the starting point in the Kinesis stream to start processing. You can use the producer timestamp or the
     * fragment number. If you use the producer timestamp, you must put the time in milliseconds. For more information
     * about fragment numbers, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_reader_Fragment.html">Fragment</a>.
     * </p>
     * <p>
     * This is a required parameter for label detection stream processors and should not be used to start a face search
     * stream processor.
     * </p>
     * 
     * @param startSelector
     *        Specifies the starting point in the Kinesis stream to start processing. You can use the producer timestamp
     *        or the fragment number. If you use the producer timestamp, you must put the time in milliseconds. For more
     *        information about fragment numbers, see <a
     *        href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_reader_Fragment.html">Fragment</a>.
     *        </p>
     *        <p>
     *        This is a required parameter for label detection stream processors and should not be used to start a face
     *        search stream processor.
     */

    public void setStartSelector(StreamProcessingStartSelector startSelector) {
        this.startSelector = startSelector;
    }

    /**
     * <p>
     * Specifies the starting point in the Kinesis stream to start processing. You can use the producer timestamp or the
     * fragment number. If you use the producer timestamp, you must put the time in milliseconds. For more information
     * about fragment numbers, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_reader_Fragment.html">Fragment</a>.
     * </p>
     * <p>
     * This is a required parameter for label detection stream processors and should not be used to start a face search
     * stream processor.
     * </p>
     * 
     * @return Specifies the starting point in the Kinesis stream to start processing. You can use the producer
     *         timestamp or the fragment number. If you use the producer timestamp, you must put the time in
     *         milliseconds. For more information about fragment numbers, see <a
     *         href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_reader_Fragment.html">Fragment</a>.
     *         </p>
     *         <p>
     *         This is a required parameter for label detection stream processors and should not be used to start a face
     *         search stream processor.
     */

    public StreamProcessingStartSelector getStartSelector() {
        return this.startSelector;
    }

    /**
     * <p>
     * Specifies the starting point in the Kinesis stream to start processing. You can use the producer timestamp or the
     * fragment number. If you use the producer timestamp, you must put the time in milliseconds. For more information
     * about fragment numbers, see <a
     * href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_reader_Fragment.html">Fragment</a>.
     * </p>
     * <p>
     * This is a required parameter for label detection stream processors and should not be used to start a face search
     * stream processor.
     * </p>
     * 
     * @param startSelector
     *        Specifies the starting point in the Kinesis stream to start processing. You can use the producer timestamp
     *        or the fragment number. If you use the producer timestamp, you must put the time in milliseconds. For more
     *        information about fragment numbers, see <a
     *        href="https://docs.aws.amazon.com/kinesisvideostreams/latest/dg/API_reader_Fragment.html">Fragment</a>.
     *        </p>
     *        <p>
     *        This is a required parameter for label detection stream processors and should not be used to start a face
     *        search stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartStreamProcessorRequest withStartSelector(StreamProcessingStartSelector startSelector) {
        setStartSelector(startSelector);
        return this;
    }

    /**
     * <p>
     * Specifies when to stop processing the stream. You can specify a maximum amount of time to process the video.
     * </p>
     * <p>
     * This is a required parameter for label detection stream processors and should not be used to start a face search
     * stream processor.
     * </p>
     * 
     * @param stopSelector
     *        Specifies when to stop processing the stream. You can specify a maximum amount of time to process the
     *        video. </p>
     *        <p>
     *        This is a required parameter for label detection stream processors and should not be used to start a face
     *        search stream processor.
     */

    public void setStopSelector(StreamProcessingStopSelector stopSelector) {
        this.stopSelector = stopSelector;
    }

    /**
     * <p>
     * Specifies when to stop processing the stream. You can specify a maximum amount of time to process the video.
     * </p>
     * <p>
     * This is a required parameter for label detection stream processors and should not be used to start a face search
     * stream processor.
     * </p>
     * 
     * @return Specifies when to stop processing the stream. You can specify a maximum amount of time to process the
     *         video. </p>
     *         <p>
     *         This is a required parameter for label detection stream processors and should not be used to start a face
     *         search stream processor.
     */

    public StreamProcessingStopSelector getStopSelector() {
        return this.stopSelector;
    }

    /**
     * <p>
     * Specifies when to stop processing the stream. You can specify a maximum amount of time to process the video.
     * </p>
     * <p>
     * This is a required parameter for label detection stream processors and should not be used to start a face search
     * stream processor.
     * </p>
     * 
     * @param stopSelector
     *        Specifies when to stop processing the stream. You can specify a maximum amount of time to process the
     *        video. </p>
     *        <p>
     *        This is a required parameter for label detection stream processors and should not be used to start a face
     *        search stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartStreamProcessorRequest withStopSelector(StreamProcessingStopSelector stopSelector) {
        setStopSelector(stopSelector);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStartSelector() != null)
            sb.append("StartSelector: ").append(getStartSelector()).append(",");
        if (getStopSelector() != null)
            sb.append("StopSelector: ").append(getStopSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartStreamProcessorRequest == false)
            return false;
        StartStreamProcessorRequest other = (StartStreamProcessorRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStartSelector() == null ^ this.getStartSelector() == null)
            return false;
        if (other.getStartSelector() != null && other.getStartSelector().equals(this.getStartSelector()) == false)
            return false;
        if (other.getStopSelector() == null ^ this.getStopSelector() == null)
            return false;
        if (other.getStopSelector() != null && other.getStopSelector().equals(this.getStopSelector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStartSelector() == null) ? 0 : getStartSelector().hashCode());
        hashCode = prime * hashCode + ((getStopSelector() == null) ? 0 : getStopSelector().hashCode());
        return hashCode;
    }

    @Override
    public StartStreamProcessorRequest clone() {
        return (StartStreamProcessorRequest) super.clone();
    }

}
