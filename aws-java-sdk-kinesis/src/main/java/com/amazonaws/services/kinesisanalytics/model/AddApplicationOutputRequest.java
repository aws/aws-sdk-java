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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationOutputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the application to which you want to add the output configuration.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Version of the application to which you want to add the output configuration. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * An array of objects, each describing one output configuration. In the output configuration, you specify the name
     * of an in-application stream, a destination (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose
     * delivery stream, or an AWS Lambda function), and record the formation to use when writing to the destination.
     * </p>
     */
    private Output output;

    /**
     * <p>
     * Name of the application to which you want to add the output configuration.
     * </p>
     * 
     * @param applicationName
     *        Name of the application to which you want to add the output configuration.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Name of the application to which you want to add the output configuration.
     * </p>
     * 
     * @return Name of the application to which you want to add the output configuration.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * Name of the application to which you want to add the output configuration.
     * </p>
     * 
     * @param applicationName
     *        Name of the application to which you want to add the output configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationOutputRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Version of the application to which you want to add the output configuration. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        Version of the application to which you want to add the output configuration. You can use the
     *        <a>DescribeApplication</a> operation to get the current application version. If the version specified is
     *        not the current version, the <code>ConcurrentModificationException</code> is returned.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * Version of the application to which you want to add the output configuration. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @return Version of the application to which you want to add the output configuration. You can use the
     *         <a>DescribeApplication</a> operation to get the current application version. If the version specified is
     *         not the current version, the <code>ConcurrentModificationException</code> is returned.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * Version of the application to which you want to add the output configuration. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        Version of the application to which you want to add the output configuration. You can use the
     *        <a>DescribeApplication</a> operation to get the current application version. If the version specified is
     *        not the current version, the <code>ConcurrentModificationException</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationOutputRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * An array of objects, each describing one output configuration. In the output configuration, you specify the name
     * of an in-application stream, a destination (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose
     * delivery stream, or an AWS Lambda function), and record the formation to use when writing to the destination.
     * </p>
     * 
     * @param output
     *        An array of objects, each describing one output configuration. In the output configuration, you specify
     *        the name of an in-application stream, a destination (that is, an Amazon Kinesis stream, an Amazon Kinesis
     *        Firehose delivery stream, or an AWS Lambda function), and record the formation to use when writing to the
     *        destination.
     */

    public void setOutput(Output output) {
        this.output = output;
    }

    /**
     * <p>
     * An array of objects, each describing one output configuration. In the output configuration, you specify the name
     * of an in-application stream, a destination (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose
     * delivery stream, or an AWS Lambda function), and record the formation to use when writing to the destination.
     * </p>
     * 
     * @return An array of objects, each describing one output configuration. In the output configuration, you specify
     *         the name of an in-application stream, a destination (that is, an Amazon Kinesis stream, an Amazon Kinesis
     *         Firehose delivery stream, or an AWS Lambda function), and record the formation to use when writing to the
     *         destination.
     */

    public Output getOutput() {
        return this.output;
    }

    /**
     * <p>
     * An array of objects, each describing one output configuration. In the output configuration, you specify the name
     * of an in-application stream, a destination (that is, an Amazon Kinesis stream, an Amazon Kinesis Firehose
     * delivery stream, or an AWS Lambda function), and record the formation to use when writing to the destination.
     * </p>
     * 
     * @param output
     *        An array of objects, each describing one output configuration. In the output configuration, you specify
     *        the name of an in-application stream, a destination (that is, an Amazon Kinesis stream, an Amazon Kinesis
     *        Firehose delivery stream, or an AWS Lambda function), and record the formation to use when writing to the
     *        destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationOutputRequest withOutput(Output output) {
        setOutput(output);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getCurrentApplicationVersionId() != null)
            sb.append("CurrentApplicationVersionId: ").append(getCurrentApplicationVersionId()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationOutputRequest == false)
            return false;
        AddApplicationOutputRequest other = (AddApplicationOutputRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationOutputRequest clone() {
        return (AddApplicationOutputRequest) super.clone();
    }

}
