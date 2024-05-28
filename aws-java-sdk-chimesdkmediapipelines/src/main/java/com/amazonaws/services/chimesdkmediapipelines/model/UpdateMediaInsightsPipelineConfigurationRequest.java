/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/UpdateMediaInsightsPipelineConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMediaInsightsPipelineConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the resource to be updated. Valid values include the name and ARN of the media insights
     * pipeline configuration.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The ARN of the role used by the service to access Amazon Web Services resources.
     * </p>
     */
    private String resourceAccessRoleArn;
    /**
     * <p>
     * The configuration settings for real-time alerts for the media insights pipeline.
     * </p>
     */
    private RealTimeAlertConfiguration realTimeAlertConfiguration;
    /**
     * <p>
     * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream..
     * </p>
     */
    private java.util.List<MediaInsightsPipelineConfigurationElement> elements;

    /**
     * <p>
     * The unique identifier for the resource to be updated. Valid values include the name and ARN of the media insights
     * pipeline configuration.
     * </p>
     * 
     * @param identifier
     *        The unique identifier for the resource to be updated. Valid values include the name and ARN of the media
     *        insights pipeline configuration.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique identifier for the resource to be updated. Valid values include the name and ARN of the media insights
     * pipeline configuration.
     * </p>
     * 
     * @return The unique identifier for the resource to be updated. Valid values include the name and ARN of the media
     *         insights pipeline configuration.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique identifier for the resource to be updated. Valid values include the name and ARN of the media insights
     * pipeline configuration.
     * </p>
     * 
     * @param identifier
     *        The unique identifier for the resource to be updated. Valid values include the name and ARN of the media
     *        insights pipeline configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMediaInsightsPipelineConfigurationRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The ARN of the role used by the service to access Amazon Web Services resources.
     * </p>
     * 
     * @param resourceAccessRoleArn
     *        The ARN of the role used by the service to access Amazon Web Services resources.
     */

    public void setResourceAccessRoleArn(String resourceAccessRoleArn) {
        this.resourceAccessRoleArn = resourceAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the role used by the service to access Amazon Web Services resources.
     * </p>
     * 
     * @return The ARN of the role used by the service to access Amazon Web Services resources.
     */

    public String getResourceAccessRoleArn() {
        return this.resourceAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the role used by the service to access Amazon Web Services resources.
     * </p>
     * 
     * @param resourceAccessRoleArn
     *        The ARN of the role used by the service to access Amazon Web Services resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMediaInsightsPipelineConfigurationRequest withResourceAccessRoleArn(String resourceAccessRoleArn) {
        setResourceAccessRoleArn(resourceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The configuration settings for real-time alerts for the media insights pipeline.
     * </p>
     * 
     * @param realTimeAlertConfiguration
     *        The configuration settings for real-time alerts for the media insights pipeline.
     */

    public void setRealTimeAlertConfiguration(RealTimeAlertConfiguration realTimeAlertConfiguration) {
        this.realTimeAlertConfiguration = realTimeAlertConfiguration;
    }

    /**
     * <p>
     * The configuration settings for real-time alerts for the media insights pipeline.
     * </p>
     * 
     * @return The configuration settings for real-time alerts for the media insights pipeline.
     */

    public RealTimeAlertConfiguration getRealTimeAlertConfiguration() {
        return this.realTimeAlertConfiguration;
    }

    /**
     * <p>
     * The configuration settings for real-time alerts for the media insights pipeline.
     * </p>
     * 
     * @param realTimeAlertConfiguration
     *        The configuration settings for real-time alerts for the media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMediaInsightsPipelineConfigurationRequest withRealTimeAlertConfiguration(RealTimeAlertConfiguration realTimeAlertConfiguration) {
        setRealTimeAlertConfiguration(realTimeAlertConfiguration);
        return this;
    }

    /**
     * <p>
     * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream..
     * </p>
     * 
     * @return The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data
     *         Stream..
     */

    public java.util.List<MediaInsightsPipelineConfigurationElement> getElements() {
        return elements;
    }

    /**
     * <p>
     * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream..
     * </p>
     * 
     * @param elements
     *        The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data
     *        Stream..
     */

    public void setElements(java.util.Collection<MediaInsightsPipelineConfigurationElement> elements) {
        if (elements == null) {
            this.elements = null;
            return;
        }

        this.elements = new java.util.ArrayList<MediaInsightsPipelineConfigurationElement>(elements);
    }

    /**
     * <p>
     * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream..
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElements(java.util.Collection)} or {@link #withElements(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param elements
     *        The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data
     *        Stream..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMediaInsightsPipelineConfigurationRequest withElements(MediaInsightsPipelineConfigurationElement... elements) {
        if (this.elements == null) {
            setElements(new java.util.ArrayList<MediaInsightsPipelineConfigurationElement>(elements.length));
        }
        for (MediaInsightsPipelineConfigurationElement ele : elements) {
            this.elements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream..
     * </p>
     * 
     * @param elements
     *        The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data
     *        Stream..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateMediaInsightsPipelineConfigurationRequest withElements(java.util.Collection<MediaInsightsPipelineConfigurationElement> elements) {
        setElements(elements);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getResourceAccessRoleArn() != null)
            sb.append("ResourceAccessRoleArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getRealTimeAlertConfiguration() != null)
            sb.append("RealTimeAlertConfiguration: ").append(getRealTimeAlertConfiguration()).append(",");
        if (getElements() != null)
            sb.append("Elements: ").append(getElements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMediaInsightsPipelineConfigurationRequest == false)
            return false;
        UpdateMediaInsightsPipelineConfigurationRequest other = (UpdateMediaInsightsPipelineConfigurationRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getResourceAccessRoleArn() == null ^ this.getResourceAccessRoleArn() == null)
            return false;
        if (other.getResourceAccessRoleArn() != null && other.getResourceAccessRoleArn().equals(this.getResourceAccessRoleArn()) == false)
            return false;
        if (other.getRealTimeAlertConfiguration() == null ^ this.getRealTimeAlertConfiguration() == null)
            return false;
        if (other.getRealTimeAlertConfiguration() != null && other.getRealTimeAlertConfiguration().equals(this.getRealTimeAlertConfiguration()) == false)
            return false;
        if (other.getElements() == null ^ this.getElements() == null)
            return false;
        if (other.getElements() != null && other.getElements().equals(this.getElements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getResourceAccessRoleArn() == null) ? 0 : getResourceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRealTimeAlertConfiguration() == null) ? 0 : getRealTimeAlertConfiguration().hashCode());
        hashCode = prime * hashCode + ((getElements() == null) ? 0 : getElements().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMediaInsightsPipelineConfigurationRequest clone() {
        return (UpdateMediaInsightsPipelineConfigurationRequest) super.clone();
    }

}
