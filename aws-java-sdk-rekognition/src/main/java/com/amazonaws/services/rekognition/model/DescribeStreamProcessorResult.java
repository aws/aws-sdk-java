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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStreamProcessorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the stream processor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * ARN of the stream processor.
     * </p>
     */
    private String streamProcessorArn;
    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Detailed status message about the stream processor.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Date and time the stream processor was created
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The time, in Unix format, the stream processor was last updated. For example, when the stream processor moves
     * from a running state to a failed state, or when the user starts or stops the stream processor.
     * </p>
     */
    private java.util.Date lastUpdateTimestamp;
    /**
     * <p>
     * Kinesis video stream that provides the source streaming video.
     * </p>
     */
    private StreamProcessorInput input;
    /**
     * <p>
     * Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
     * </p>
     */
    private StreamProcessorOutput output;
    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Face recognition input parameters that are being used by the stream processor. Includes the collection to use for
     * face recognition and the face attributes to detect.
     * </p>
     */
    private StreamProcessorSettings settings;

    /**
     * <p>
     * Name of the stream processor.
     * </p>
     * 
     * @param name
     *        Name of the stream processor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the stream processor.
     * </p>
     * 
     * @return Name of the stream processor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the stream processor.
     * </p>
     * 
     * @param name
     *        Name of the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamProcessorResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * ARN of the stream processor.
     * </p>
     * 
     * @param streamProcessorArn
     *        ARN of the stream processor.
     */

    public void setStreamProcessorArn(String streamProcessorArn) {
        this.streamProcessorArn = streamProcessorArn;
    }

    /**
     * <p>
     * ARN of the stream processor.
     * </p>
     * 
     * @return ARN of the stream processor.
     */

    public String getStreamProcessorArn() {
        return this.streamProcessorArn;
    }

    /**
     * <p>
     * ARN of the stream processor.
     * </p>
     * 
     * @param streamProcessorArn
     *        ARN of the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamProcessorResult withStreamProcessorArn(String streamProcessorArn) {
        setStreamProcessorArn(streamProcessorArn);
        return this;
    }

    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     * 
     * @param status
     *        Current status of the stream processor.
     * @see StreamProcessorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     * 
     * @return Current status of the stream processor.
     * @see StreamProcessorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     * 
     * @param status
     *        Current status of the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamProcessorStatus
     */

    public DescribeStreamProcessorResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the stream processor.
     * </p>
     * 
     * @param status
     *        Current status of the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamProcessorStatus
     */

    public DescribeStreamProcessorResult withStatus(StreamProcessorStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Detailed status message about the stream processor.
     * </p>
     * 
     * @param statusMessage
     *        Detailed status message about the stream processor.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Detailed status message about the stream processor.
     * </p>
     * 
     * @return Detailed status message about the stream processor.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Detailed status message about the stream processor.
     * </p>
     * 
     * @param statusMessage
     *        Detailed status message about the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamProcessorResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Date and time the stream processor was created
     * </p>
     * 
     * @param creationTimestamp
     *        Date and time the stream processor was created
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * Date and time the stream processor was created
     * </p>
     * 
     * @return Date and time the stream processor was created
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * Date and time the stream processor was created
     * </p>
     * 
     * @param creationTimestamp
     *        Date and time the stream processor was created
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamProcessorResult withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The time, in Unix format, the stream processor was last updated. For example, when the stream processor moves
     * from a running state to a failed state, or when the user starts or stops the stream processor.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The time, in Unix format, the stream processor was last updated. For example, when the stream processor
     *        moves from a running state to a failed state, or when the user starts or stops the stream processor.
     */

    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * <p>
     * The time, in Unix format, the stream processor was last updated. For example, when the stream processor moves
     * from a running state to a failed state, or when the user starts or stops the stream processor.
     * </p>
     * 
     * @return The time, in Unix format, the stream processor was last updated. For example, when the stream processor
     *         moves from a running state to a failed state, or when the user starts or stops the stream processor.
     */

    public java.util.Date getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    /**
     * <p>
     * The time, in Unix format, the stream processor was last updated. For example, when the stream processor moves
     * from a running state to a failed state, or when the user starts or stops the stream processor.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The time, in Unix format, the stream processor was last updated. For example, when the stream processor
     *        moves from a running state to a failed state, or when the user starts or stops the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamProcessorResult withLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        setLastUpdateTimestamp(lastUpdateTimestamp);
        return this;
    }

    /**
     * <p>
     * Kinesis video stream that provides the source streaming video.
     * </p>
     * 
     * @param input
     *        Kinesis video stream that provides the source streaming video.
     */

    public void setInput(StreamProcessorInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Kinesis video stream that provides the source streaming video.
     * </p>
     * 
     * @return Kinesis video stream that provides the source streaming video.
     */

    public StreamProcessorInput getInput() {
        return this.input;
    }

    /**
     * <p>
     * Kinesis video stream that provides the source streaming video.
     * </p>
     * 
     * @param input
     *        Kinesis video stream that provides the source streaming video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamProcessorResult withInput(StreamProcessorInput input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
     * </p>
     * 
     * @param output
     *        Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
     */

    public void setOutput(StreamProcessorOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
     * </p>
     * 
     * @return Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
     */

    public StreamProcessorOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
     * </p>
     * 
     * @param output
     *        Kinesis data stream to which Amazon Rekognition Video puts the analysis results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamProcessorResult withOutput(StreamProcessorOutput output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     * 
     * @param roleArn
     *        ARN of the IAM role that allows access to the stream processor.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     * 
     * @return ARN of the IAM role that allows access to the stream processor.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     * 
     * @param roleArn
     *        ARN of the IAM role that allows access to the stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamProcessorResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Face recognition input parameters that are being used by the stream processor. Includes the collection to use for
     * face recognition and the face attributes to detect.
     * </p>
     * 
     * @param settings
     *        Face recognition input parameters that are being used by the stream processor. Includes the collection to
     *        use for face recognition and the face attributes to detect.
     */

    public void setSettings(StreamProcessorSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Face recognition input parameters that are being used by the stream processor. Includes the collection to use for
     * face recognition and the face attributes to detect.
     * </p>
     * 
     * @return Face recognition input parameters that are being used by the stream processor. Includes the collection to
     *         use for face recognition and the face attributes to detect.
     */

    public StreamProcessorSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Face recognition input parameters that are being used by the stream processor. Includes the collection to use for
     * face recognition and the face attributes to detect.
     * </p>
     * 
     * @param settings
     *        Face recognition input parameters that are being used by the stream processor. Includes the collection to
     *        use for face recognition and the face attributes to detect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamProcessorResult withSettings(StreamProcessorSettings settings) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStreamProcessorArn() != null)
            sb.append("StreamProcessorArn: ").append(getStreamProcessorArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getLastUpdateTimestamp() != null)
            sb.append("LastUpdateTimestamp: ").append(getLastUpdateTimestamp()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
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

        if (obj instanceof DescribeStreamProcessorResult == false)
            return false;
        DescribeStreamProcessorResult other = (DescribeStreamProcessorResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStreamProcessorArn() == null ^ this.getStreamProcessorArn() == null)
            return false;
        if (other.getStreamProcessorArn() != null && other.getStreamProcessorArn().equals(this.getStreamProcessorArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getLastUpdateTimestamp() == null ^ this.getLastUpdateTimestamp() == null)
            return false;
        if (other.getLastUpdateTimestamp() != null && other.getLastUpdateTimestamp().equals(this.getLastUpdateTimestamp()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStreamProcessorArn() == null) ? 0 : getStreamProcessorArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTimestamp() == null) ? 0 : getLastUpdateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStreamProcessorResult clone() {
        try {
            return (DescribeStreamProcessorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
