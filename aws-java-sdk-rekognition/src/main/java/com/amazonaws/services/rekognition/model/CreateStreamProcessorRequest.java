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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamProcessorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter
     * name is <code>StreamProcessorInput</code>.
     * </p>
     */
    private StreamProcessorInput input;
    /**
     * <p>
     * Kinesis data stream stream to which Amazon Rekognition Video puts the analysis results. If you are using the AWS
     * CLI, the parameter name is <code>StreamProcessorOutput</code>.
     * </p>
     */
    private StreamProcessorOutput output;
    /**
     * <p>
     * An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream processor.
     * For example, you can get the current status of the stream processor by calling <a>DescribeStreamProcessor</a>.
     * <code>Name</code> is idempotent.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Face recognition input parameters to be used by the stream processor. Includes the collection to use for face
     * recognition and the face attributes to detect.
     * </p>
     */
    private StreamProcessorSettings settings;
    /**
     * <p>
     * ARN of the IAM role that allows access to the stream processor.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter
     * name is <code>StreamProcessorInput</code>.
     * </p>
     * 
     * @param input
     *        Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the
     *        parameter name is <code>StreamProcessorInput</code>.
     */

    public void setInput(StreamProcessorInput input) {
        this.input = input;
    }

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter
     * name is <code>StreamProcessorInput</code>.
     * </p>
     * 
     * @return Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the
     *         parameter name is <code>StreamProcessorInput</code>.
     */

    public StreamProcessorInput getInput() {
        return this.input;
    }

    /**
     * <p>
     * Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the parameter
     * name is <code>StreamProcessorInput</code>.
     * </p>
     * 
     * @param input
     *        Kinesis video stream stream that provides the source streaming video. If you are using the AWS CLI, the
     *        parameter name is <code>StreamProcessorInput</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withInput(StreamProcessorInput input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * Kinesis data stream stream to which Amazon Rekognition Video puts the analysis results. If you are using the AWS
     * CLI, the parameter name is <code>StreamProcessorOutput</code>.
     * </p>
     * 
     * @param output
     *        Kinesis data stream stream to which Amazon Rekognition Video puts the analysis results. If you are using
     *        the AWS CLI, the parameter name is <code>StreamProcessorOutput</code>.
     */

    public void setOutput(StreamProcessorOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * Kinesis data stream stream to which Amazon Rekognition Video puts the analysis results. If you are using the AWS
     * CLI, the parameter name is <code>StreamProcessorOutput</code>.
     * </p>
     * 
     * @return Kinesis data stream stream to which Amazon Rekognition Video puts the analysis results. If you are using
     *         the AWS CLI, the parameter name is <code>StreamProcessorOutput</code>.
     */

    public StreamProcessorOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * Kinesis data stream stream to which Amazon Rekognition Video puts the analysis results. If you are using the AWS
     * CLI, the parameter name is <code>StreamProcessorOutput</code>.
     * </p>
     * 
     * @param output
     *        Kinesis data stream stream to which Amazon Rekognition Video puts the analysis results. If you are using
     *        the AWS CLI, the parameter name is <code>StreamProcessorOutput</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withOutput(StreamProcessorOutput output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream processor.
     * For example, you can get the current status of the stream processor by calling <a>DescribeStreamProcessor</a>.
     * <code>Name</code> is idempotent.
     * </p>
     * 
     * @param name
     *        An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream
     *        processor. For example, you can get the current status of the stream processor by calling
     *        <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream processor.
     * For example, you can get the current status of the stream processor by calling <a>DescribeStreamProcessor</a>.
     * <code>Name</code> is idempotent.
     * </p>
     * 
     * @return An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream
     *         processor. For example, you can get the current status of the stream processor by calling
     *         <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream processor.
     * For example, you can get the current status of the stream processor by calling <a>DescribeStreamProcessor</a>.
     * <code>Name</code> is idempotent.
     * </p>
     * 
     * @param name
     *        An identifier you assign to the stream processor. You can use <code>Name</code> to manage the stream
     *        processor. For example, you can get the current status of the stream processor by calling
     *        <a>DescribeStreamProcessor</a>. <code>Name</code> is idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Face recognition input parameters to be used by the stream processor. Includes the collection to use for face
     * recognition and the face attributes to detect.
     * </p>
     * 
     * @param settings
     *        Face recognition input parameters to be used by the stream processor. Includes the collection to use for
     *        face recognition and the face attributes to detect.
     */

    public void setSettings(StreamProcessorSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * Face recognition input parameters to be used by the stream processor. Includes the collection to use for face
     * recognition and the face attributes to detect.
     * </p>
     * 
     * @return Face recognition input parameters to be used by the stream processor. Includes the collection to use for
     *         face recognition and the face attributes to detect.
     */

    public StreamProcessorSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * Face recognition input parameters to be used by the stream processor. Includes the collection to use for face
     * recognition and the face attributes to detect.
     * </p>
     * 
     * @param settings
     *        Face recognition input parameters to be used by the stream processor. Includes the collection to use for
     *        face recognition and the face attributes to detect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamProcessorRequest withSettings(StreamProcessorSettings settings) {
        setSettings(settings);
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

    public CreateStreamProcessorRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamProcessorRequest == false)
            return false;
        CreateStreamProcessorRequest other = (CreateStreamProcessorRequest) obj;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamProcessorRequest clone() {
        return (CreateStreamProcessorRequest) super.clone();
    }

}
