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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationInputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Current version of your Amazon Kinesis Analytics application. You can use the <a>DescribeApplication</a>
     * operation to find the current application version.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * The <a>Input</a> to add.
     * </p>
     */
    private Input input;

    /**
     * <p>
     * Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
     * </p>
     * 
     * @param applicationName
     *        Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
     * </p>
     * 
     * @return Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
     * </p>
     * 
     * @param applicationName
     *        Name of your existing Amazon Kinesis Analytics application to which you want to add the streaming source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Current version of your Amazon Kinesis Analytics application. You can use the <a>DescribeApplication</a>
     * operation to find the current application version.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        Current version of your Amazon Kinesis Analytics application. You can use the <a>DescribeApplication</a>
     *        operation to find the current application version.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * Current version of your Amazon Kinesis Analytics application. You can use the <a>DescribeApplication</a>
     * operation to find the current application version.
     * </p>
     * 
     * @return Current version of your Amazon Kinesis Analytics application. You can use the <a>DescribeApplication</a>
     *         operation to find the current application version.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * Current version of your Amazon Kinesis Analytics application. You can use the <a>DescribeApplication</a>
     * operation to find the current application version.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        Current version of your Amazon Kinesis Analytics application. You can use the <a>DescribeApplication</a>
     *        operation to find the current application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * The <a>Input</a> to add.
     * </p>
     * 
     * @param input
     *        The <a>Input</a> to add.
     */

    public void setInput(Input input) {
        this.input = input;
    }

    /**
     * <p>
     * The <a>Input</a> to add.
     * </p>
     * 
     * @return The <a>Input</a> to add.
     */

    public Input getInput() {
        return this.input;
    }

    /**
     * <p>
     * The <a>Input</a> to add.
     * </p>
     * 
     * @param input
     *        The <a>Input</a> to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputRequest withInput(Input input) {
        setInput(input);
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
        if (getInput() != null)
            sb.append("Input: ").append(getInput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationInputRequest == false)
            return false;
        AddApplicationInputRequest other = (AddApplicationInputRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationInputRequest clone() {
        return (AddApplicationInputRequest) super.clone();
    }

}
