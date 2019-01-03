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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/StartApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the application.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics starts
     * reading the streaming source associated with the input. You can also specify where in the streaming source you
     * want Amazon Kinesis Analytics to start reading.
     * </p>
     */
    private java.util.List<InputConfiguration> inputConfigurations;

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @param applicationName
     *        Name of the application.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @return Name of the application.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * Name of the application.
     * </p>
     * 
     * @param applicationName
     *        Name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics starts
     * reading the streaming source associated with the input. You can also specify where in the streaming source you
     * want Amazon Kinesis Analytics to start reading.
     * </p>
     * 
     * @return Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics
     *         starts reading the streaming source associated with the input. You can also specify where in the
     *         streaming source you want Amazon Kinesis Analytics to start reading.
     */

    public java.util.List<InputConfiguration> getInputConfigurations() {
        return inputConfigurations;
    }

    /**
     * <p>
     * Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics starts
     * reading the streaming source associated with the input. You can also specify where in the streaming source you
     * want Amazon Kinesis Analytics to start reading.
     * </p>
     * 
     * @param inputConfigurations
     *        Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics
     *        starts reading the streaming source associated with the input. You can also specify where in the streaming
     *        source you want Amazon Kinesis Analytics to start reading.
     */

    public void setInputConfigurations(java.util.Collection<InputConfiguration> inputConfigurations) {
        if (inputConfigurations == null) {
            this.inputConfigurations = null;
            return;
        }

        this.inputConfigurations = new java.util.ArrayList<InputConfiguration>(inputConfigurations);
    }

    /**
     * <p>
     * Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics starts
     * reading the streaming source associated with the input. You can also specify where in the streaming source you
     * want Amazon Kinesis Analytics to start reading.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputConfigurations(java.util.Collection)} or {@link #withInputConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inputConfigurations
     *        Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics
     *        starts reading the streaming source associated with the input. You can also specify where in the streaming
     *        source you want Amazon Kinesis Analytics to start reading.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartApplicationRequest withInputConfigurations(InputConfiguration... inputConfigurations) {
        if (this.inputConfigurations == null) {
            setInputConfigurations(new java.util.ArrayList<InputConfiguration>(inputConfigurations.length));
        }
        for (InputConfiguration ele : inputConfigurations) {
            this.inputConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics starts
     * reading the streaming source associated with the input. You can also specify where in the streaming source you
     * want Amazon Kinesis Analytics to start reading.
     * </p>
     * 
     * @param inputConfigurations
     *        Identifies the specific input, by ID, that the application starts consuming. Amazon Kinesis Analytics
     *        starts reading the streaming source associated with the input. You can also specify where in the streaming
     *        source you want Amazon Kinesis Analytics to start reading.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartApplicationRequest withInputConfigurations(java.util.Collection<InputConfiguration> inputConfigurations) {
        setInputConfigurations(inputConfigurations);
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
        if (getInputConfigurations() != null)
            sb.append("InputConfigurations: ").append(getInputConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartApplicationRequest == false)
            return false;
        StartApplicationRequest other = (StartApplicationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getInputConfigurations() == null ^ this.getInputConfigurations() == null)
            return false;
        if (other.getInputConfigurations() != null && other.getInputConfigurations().equals(this.getInputConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getInputConfigurations() == null) ? 0 : getInputConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public StartApplicationRequest clone() {
        return (StartApplicationRequest) super.clone();
    }

}
