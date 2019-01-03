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
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplicationInputProcessingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteApplicationInputProcessingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Kinesis Analytics application name.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The version ID of the Kinesis Analytics application.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * The ID of the input configuration from which to delete the input processing configuration. You can get a list of
     * the input IDs for an application by using the <a>DescribeApplication</a> operation.
     * </p>
     */
    private String inputId;

    /**
     * <p>
     * The Kinesis Analytics application name.
     * </p>
     * 
     * @param applicationName
     *        The Kinesis Analytics application name.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The Kinesis Analytics application name.
     * </p>
     * 
     * @return The Kinesis Analytics application name.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The Kinesis Analytics application name.
     * </p>
     * 
     * @param applicationName
     *        The Kinesis Analytics application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationInputProcessingConfigurationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The version ID of the Kinesis Analytics application.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The version ID of the Kinesis Analytics application.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * The version ID of the Kinesis Analytics application.
     * </p>
     * 
     * @return The version ID of the Kinesis Analytics application.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * The version ID of the Kinesis Analytics application.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The version ID of the Kinesis Analytics application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationInputProcessingConfigurationRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * The ID of the input configuration from which to delete the input processing configuration. You can get a list of
     * the input IDs for an application by using the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param inputId
     *        The ID of the input configuration from which to delete the input processing configuration. You can get a
     *        list of the input IDs for an application by using the <a>DescribeApplication</a> operation.
     */

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * <p>
     * The ID of the input configuration from which to delete the input processing configuration. You can get a list of
     * the input IDs for an application by using the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @return The ID of the input configuration from which to delete the input processing configuration. You can get a
     *         list of the input IDs for an application by using the <a>DescribeApplication</a> operation.
     */

    public String getInputId() {
        return this.inputId;
    }

    /**
     * <p>
     * The ID of the input configuration from which to delete the input processing configuration. You can get a list of
     * the input IDs for an application by using the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param inputId
     *        The ID of the input configuration from which to delete the input processing configuration. You can get a
     *        list of the input IDs for an application by using the <a>DescribeApplication</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteApplicationInputProcessingConfigurationRequest withInputId(String inputId) {
        setInputId(inputId);
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
        if (getInputId() != null)
            sb.append("InputId: ").append(getInputId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApplicationInputProcessingConfigurationRequest == false)
            return false;
        DeleteApplicationInputProcessingConfigurationRequest other = (DeleteApplicationInputProcessingConfigurationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentApplicationVersionId() == null ^ this.getCurrentApplicationVersionId() == null)
            return false;
        if (other.getCurrentApplicationVersionId() != null && other.getCurrentApplicationVersionId().equals(this.getCurrentApplicationVersionId()) == false)
            return false;
        if (other.getInputId() == null ^ this.getInputId() == null)
            return false;
        if (other.getInputId() != null && other.getInputId().equals(this.getInputId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentApplicationVersionId() == null) ? 0 : getCurrentApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getInputId() == null) ? 0 : getInputId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteApplicationInputProcessingConfigurationRequest clone() {
        return (DeleteApplicationInputProcessingConfigurationRequest) super.clone();
    }

}
