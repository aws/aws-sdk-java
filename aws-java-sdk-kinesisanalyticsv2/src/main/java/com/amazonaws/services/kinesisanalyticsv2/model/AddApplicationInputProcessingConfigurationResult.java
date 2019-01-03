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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInputProcessingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationInputProcessingConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String applicationARN;
    /**
     * <p>
     * Provides the current application version.
     * </p>
     */
    private Long applicationVersionId;
    /**
     * <p>
     * The input ID that is associated with the application input. This is the ID that Amazon Kinesis Data Analytics
     * assigns to each input configuration that you add to your application.
     * </p>
     */
    private String inputId;
    /**
     * <p>
     * The description of the preprocessor that executes on records in this input before the application's code is run.
     * </p>
     */
    private InputProcessingConfigurationDescription inputProcessingConfigurationDescription;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationARN
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setApplicationARN(String applicationARN) {
        this.applicationARN = applicationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getApplicationARN() {
        return this.applicationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationARN
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputProcessingConfigurationResult withApplicationARN(String applicationARN) {
        setApplicationARN(applicationARN);
        return this;
    }

    /**
     * <p>
     * Provides the current application version.
     * </p>
     * 
     * @param applicationVersionId
     *        Provides the current application version.
     */

    public void setApplicationVersionId(Long applicationVersionId) {
        this.applicationVersionId = applicationVersionId;
    }

    /**
     * <p>
     * Provides the current application version.
     * </p>
     * 
     * @return Provides the current application version.
     */

    public Long getApplicationVersionId() {
        return this.applicationVersionId;
    }

    /**
     * <p>
     * Provides the current application version.
     * </p>
     * 
     * @param applicationVersionId
     *        Provides the current application version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputProcessingConfigurationResult withApplicationVersionId(Long applicationVersionId) {
        setApplicationVersionId(applicationVersionId);
        return this;
    }

    /**
     * <p>
     * The input ID that is associated with the application input. This is the ID that Amazon Kinesis Data Analytics
     * assigns to each input configuration that you add to your application.
     * </p>
     * 
     * @param inputId
     *        The input ID that is associated with the application input. This is the ID that Amazon Kinesis Data
     *        Analytics assigns to each input configuration that you add to your application.
     */

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * <p>
     * The input ID that is associated with the application input. This is the ID that Amazon Kinesis Data Analytics
     * assigns to each input configuration that you add to your application.
     * </p>
     * 
     * @return The input ID that is associated with the application input. This is the ID that Amazon Kinesis Data
     *         Analytics assigns to each input configuration that you add to your application.
     */

    public String getInputId() {
        return this.inputId;
    }

    /**
     * <p>
     * The input ID that is associated with the application input. This is the ID that Amazon Kinesis Data Analytics
     * assigns to each input configuration that you add to your application.
     * </p>
     * 
     * @param inputId
     *        The input ID that is associated with the application input. This is the ID that Amazon Kinesis Data
     *        Analytics assigns to each input configuration that you add to your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputProcessingConfigurationResult withInputId(String inputId) {
        setInputId(inputId);
        return this;
    }

    /**
     * <p>
     * The description of the preprocessor that executes on records in this input before the application's code is run.
     * </p>
     * 
     * @param inputProcessingConfigurationDescription
     *        The description of the preprocessor that executes on records in this input before the application's code
     *        is run.
     */

    public void setInputProcessingConfigurationDescription(InputProcessingConfigurationDescription inputProcessingConfigurationDescription) {
        this.inputProcessingConfigurationDescription = inputProcessingConfigurationDescription;
    }

    /**
     * <p>
     * The description of the preprocessor that executes on records in this input before the application's code is run.
     * </p>
     * 
     * @return The description of the preprocessor that executes on records in this input before the application's code
     *         is run.
     */

    public InputProcessingConfigurationDescription getInputProcessingConfigurationDescription() {
        return this.inputProcessingConfigurationDescription;
    }

    /**
     * <p>
     * The description of the preprocessor that executes on records in this input before the application's code is run.
     * </p>
     * 
     * @param inputProcessingConfigurationDescription
     *        The description of the preprocessor that executes on records in this input before the application's code
     *        is run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputProcessingConfigurationResult withInputProcessingConfigurationDescription(
            InputProcessingConfigurationDescription inputProcessingConfigurationDescription) {
        setInputProcessingConfigurationDescription(inputProcessingConfigurationDescription);
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
        if (getApplicationARN() != null)
            sb.append("ApplicationARN: ").append(getApplicationARN()).append(",");
        if (getApplicationVersionId() != null)
            sb.append("ApplicationVersionId: ").append(getApplicationVersionId()).append(",");
        if (getInputId() != null)
            sb.append("InputId: ").append(getInputId()).append(",");
        if (getInputProcessingConfigurationDescription() != null)
            sb.append("InputProcessingConfigurationDescription: ").append(getInputProcessingConfigurationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationInputProcessingConfigurationResult == false)
            return false;
        AddApplicationInputProcessingConfigurationResult other = (AddApplicationInputProcessingConfigurationResult) obj;
        if (other.getApplicationARN() == null ^ this.getApplicationARN() == null)
            return false;
        if (other.getApplicationARN() != null && other.getApplicationARN().equals(this.getApplicationARN()) == false)
            return false;
        if (other.getApplicationVersionId() == null ^ this.getApplicationVersionId() == null)
            return false;
        if (other.getApplicationVersionId() != null && other.getApplicationVersionId().equals(this.getApplicationVersionId()) == false)
            return false;
        if (other.getInputId() == null ^ this.getInputId() == null)
            return false;
        if (other.getInputId() != null && other.getInputId().equals(this.getInputId()) == false)
            return false;
        if (other.getInputProcessingConfigurationDescription() == null ^ this.getInputProcessingConfigurationDescription() == null)
            return false;
        if (other.getInputProcessingConfigurationDescription() != null
                && other.getInputProcessingConfigurationDescription().equals(this.getInputProcessingConfigurationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationARN() == null) ? 0 : getApplicationARN().hashCode());
        hashCode = prime * hashCode + ((getApplicationVersionId() == null) ? 0 : getApplicationVersionId().hashCode());
        hashCode = prime * hashCode + ((getInputId() == null) ? 0 : getInputId().hashCode());
        hashCode = prime * hashCode + ((getInputProcessingConfigurationDescription() == null) ? 0 : getInputProcessingConfigurationDescription().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationInputProcessingConfigurationResult clone() {
        try {
            return (AddApplicationInputProcessingConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
