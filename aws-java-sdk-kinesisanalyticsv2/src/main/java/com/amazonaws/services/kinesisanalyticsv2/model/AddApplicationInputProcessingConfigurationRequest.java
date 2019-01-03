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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInputProcessingConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddApplicationInputProcessingConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application to which you want to add the input processing configuration.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The version of the application to which you want to add the input processing configuration. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     */
    private Long currentApplicationVersionId;
    /**
     * <p>
     * The ID of the input configuration to add the input processing configuration to. You can get a list of the input
     * IDs for an application using the <a>DescribeApplication</a> operation.
     * </p>
     */
    private String inputId;
    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> to add to the application.
     * </p>
     */
    private InputProcessingConfiguration inputProcessingConfiguration;

    /**
     * <p>
     * The name of the application to which you want to add the input processing configuration.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to which you want to add the input processing configuration.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to which you want to add the input processing configuration.
     * </p>
     * 
     * @return The name of the application to which you want to add the input processing configuration.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application to which you want to add the input processing configuration.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to which you want to add the input processing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputProcessingConfigurationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The version of the application to which you want to add the input processing configuration. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The version of the application to which you want to add the input processing configuration. You can use
     *        the <a>DescribeApplication</a> operation to get the current application version. If the version specified
     *        is not the current version, the <code>ConcurrentModificationException</code> is returned.
     */

    public void setCurrentApplicationVersionId(Long currentApplicationVersionId) {
        this.currentApplicationVersionId = currentApplicationVersionId;
    }

    /**
     * <p>
     * The version of the application to which you want to add the input processing configuration. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @return The version of the application to which you want to add the input processing configuration. You can use
     *         the <a>DescribeApplication</a> operation to get the current application version. If the version specified
     *         is not the current version, the <code>ConcurrentModificationException</code> is returned.
     */

    public Long getCurrentApplicationVersionId() {
        return this.currentApplicationVersionId;
    }

    /**
     * <p>
     * The version of the application to which you want to add the input processing configuration. You can use the
     * <a>DescribeApplication</a> operation to get the current application version. If the version specified is not the
     * current version, the <code>ConcurrentModificationException</code> is returned.
     * </p>
     * 
     * @param currentApplicationVersionId
     *        The version of the application to which you want to add the input processing configuration. You can use
     *        the <a>DescribeApplication</a> operation to get the current application version. If the version specified
     *        is not the current version, the <code>ConcurrentModificationException</code> is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputProcessingConfigurationRequest withCurrentApplicationVersionId(Long currentApplicationVersionId) {
        setCurrentApplicationVersionId(currentApplicationVersionId);
        return this;
    }

    /**
     * <p>
     * The ID of the input configuration to add the input processing configuration to. You can get a list of the input
     * IDs for an application using the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param inputId
     *        The ID of the input configuration to add the input processing configuration to. You can get a list of the
     *        input IDs for an application using the <a>DescribeApplication</a> operation.
     */

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * <p>
     * The ID of the input configuration to add the input processing configuration to. You can get a list of the input
     * IDs for an application using the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @return The ID of the input configuration to add the input processing configuration to. You can get a list of the
     *         input IDs for an application using the <a>DescribeApplication</a> operation.
     */

    public String getInputId() {
        return this.inputId;
    }

    /**
     * <p>
     * The ID of the input configuration to add the input processing configuration to. You can get a list of the input
     * IDs for an application using the <a>DescribeApplication</a> operation.
     * </p>
     * 
     * @param inputId
     *        The ID of the input configuration to add the input processing configuration to. You can get a list of the
     *        input IDs for an application using the <a>DescribeApplication</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputProcessingConfigurationRequest withInputId(String inputId) {
        setInputId(inputId);
        return this;
    }

    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> to add to the application.
     * </p>
     * 
     * @param inputProcessingConfiguration
     *        The <a>InputProcessingConfiguration</a> to add to the application.
     */

    public void setInputProcessingConfiguration(InputProcessingConfiguration inputProcessingConfiguration) {
        this.inputProcessingConfiguration = inputProcessingConfiguration;
    }

    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> to add to the application.
     * </p>
     * 
     * @return The <a>InputProcessingConfiguration</a> to add to the application.
     */

    public InputProcessingConfiguration getInputProcessingConfiguration() {
        return this.inputProcessingConfiguration;
    }

    /**
     * <p>
     * The <a>InputProcessingConfiguration</a> to add to the application.
     * </p>
     * 
     * @param inputProcessingConfiguration
     *        The <a>InputProcessingConfiguration</a> to add to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddApplicationInputProcessingConfigurationRequest withInputProcessingConfiguration(InputProcessingConfiguration inputProcessingConfiguration) {
        setInputProcessingConfiguration(inputProcessingConfiguration);
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
            sb.append("InputId: ").append(getInputId()).append(",");
        if (getInputProcessingConfiguration() != null)
            sb.append("InputProcessingConfiguration: ").append(getInputProcessingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddApplicationInputProcessingConfigurationRequest == false)
            return false;
        AddApplicationInputProcessingConfigurationRequest other = (AddApplicationInputProcessingConfigurationRequest) obj;
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
        if (other.getInputProcessingConfiguration() == null ^ this.getInputProcessingConfiguration() == null)
            return false;
        if (other.getInputProcessingConfiguration() != null && other.getInputProcessingConfiguration().equals(this.getInputProcessingConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getInputProcessingConfiguration() == null) ? 0 : getInputProcessingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public AddApplicationInputProcessingConfigurationRequest clone() {
        return (AddApplicationInputProcessingConfigurationRequest) super.clone();
    }

}
