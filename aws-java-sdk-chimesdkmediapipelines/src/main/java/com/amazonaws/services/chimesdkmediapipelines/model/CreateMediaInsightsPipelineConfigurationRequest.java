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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipelineConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaInsightsPipelineConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the media insights pipeline configuration.
     * </p>
     */
    private String mediaInsightsPipelineConfigurationName;
    /**
     * <p>
     * The ARN of the role used by the service to access Amazon Web Services resources, including
     * <code>Transcribe</code> and <code>Transcribe Call Analytics</code>, on the caller’s behalf.
     * </p>
     */
    private String resourceAccessRoleArn;
    /**
     * <p>
     * The configuration settings for the real-time alerts in a media insights pipeline configuration.
     * </p>
     */
    private RealTimeAlertConfiguration realTimeAlertConfiguration;
    /**
     * <p>
     * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream.
     * </p>
     */
    private java.util.List<MediaInsightsPipelineConfigurationElement> elements;
    /**
     * <p>
     * The tags assigned to the media insights pipeline configuration.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The unique identifier for the media insights pipeline configuration request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the media insights pipeline configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationName
     *        The name of the media insights pipeline configuration.
     */

    public void setMediaInsightsPipelineConfigurationName(String mediaInsightsPipelineConfigurationName) {
        this.mediaInsightsPipelineConfigurationName = mediaInsightsPipelineConfigurationName;
    }

    /**
     * <p>
     * The name of the media insights pipeline configuration.
     * </p>
     * 
     * @return The name of the media insights pipeline configuration.
     */

    public String getMediaInsightsPipelineConfigurationName() {
        return this.mediaInsightsPipelineConfigurationName;
    }

    /**
     * <p>
     * The name of the media insights pipeline configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationName
     *        The name of the media insights pipeline configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineConfigurationRequest withMediaInsightsPipelineConfigurationName(String mediaInsightsPipelineConfigurationName) {
        setMediaInsightsPipelineConfigurationName(mediaInsightsPipelineConfigurationName);
        return this;
    }

    /**
     * <p>
     * The ARN of the role used by the service to access Amazon Web Services resources, including
     * <code>Transcribe</code> and <code>Transcribe Call Analytics</code>, on the caller’s behalf.
     * </p>
     * 
     * @param resourceAccessRoleArn
     *        The ARN of the role used by the service to access Amazon Web Services resources, including
     *        <code>Transcribe</code> and <code>Transcribe Call Analytics</code>, on the caller’s behalf.
     */

    public void setResourceAccessRoleArn(String resourceAccessRoleArn) {
        this.resourceAccessRoleArn = resourceAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the role used by the service to access Amazon Web Services resources, including
     * <code>Transcribe</code> and <code>Transcribe Call Analytics</code>, on the caller’s behalf.
     * </p>
     * 
     * @return The ARN of the role used by the service to access Amazon Web Services resources, including
     *         <code>Transcribe</code> and <code>Transcribe Call Analytics</code>, on the caller’s behalf.
     */

    public String getResourceAccessRoleArn() {
        return this.resourceAccessRoleArn;
    }

    /**
     * <p>
     * The ARN of the role used by the service to access Amazon Web Services resources, including
     * <code>Transcribe</code> and <code>Transcribe Call Analytics</code>, on the caller’s behalf.
     * </p>
     * 
     * @param resourceAccessRoleArn
     *        The ARN of the role used by the service to access Amazon Web Services resources, including
     *        <code>Transcribe</code> and <code>Transcribe Call Analytics</code>, on the caller’s behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineConfigurationRequest withResourceAccessRoleArn(String resourceAccessRoleArn) {
        setResourceAccessRoleArn(resourceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The configuration settings for the real-time alerts in a media insights pipeline configuration.
     * </p>
     * 
     * @param realTimeAlertConfiguration
     *        The configuration settings for the real-time alerts in a media insights pipeline configuration.
     */

    public void setRealTimeAlertConfiguration(RealTimeAlertConfiguration realTimeAlertConfiguration) {
        this.realTimeAlertConfiguration = realTimeAlertConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the real-time alerts in a media insights pipeline configuration.
     * </p>
     * 
     * @return The configuration settings for the real-time alerts in a media insights pipeline configuration.
     */

    public RealTimeAlertConfiguration getRealTimeAlertConfiguration() {
        return this.realTimeAlertConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the real-time alerts in a media insights pipeline configuration.
     * </p>
     * 
     * @param realTimeAlertConfiguration
     *        The configuration settings for the real-time alerts in a media insights pipeline configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineConfigurationRequest withRealTimeAlertConfiguration(RealTimeAlertConfiguration realTimeAlertConfiguration) {
        setRealTimeAlertConfiguration(realTimeAlertConfiguration);
        return this;
    }

    /**
     * <p>
     * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream.
     * </p>
     * 
     * @return The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data
     *         Stream.
     */

    public java.util.List<MediaInsightsPipelineConfigurationElement> getElements() {
        return elements;
    }

    /**
     * <p>
     * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream.
     * </p>
     * 
     * @param elements
     *        The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data
     *        Stream.
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
     * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElements(java.util.Collection)} or {@link #withElements(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param elements
     *        The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data
     *        Stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineConfigurationRequest withElements(MediaInsightsPipelineConfigurationElement... elements) {
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
     * The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data Stream.
     * </p>
     * 
     * @param elements
     *        The elements in the request, such as a processor for Amazon Transcribe or a sink for a Kinesis Data
     *        Stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineConfigurationRequest withElements(java.util.Collection<MediaInsightsPipelineConfigurationElement> elements) {
        setElements(elements);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the media insights pipeline configuration.
     * </p>
     * 
     * @return The tags assigned to the media insights pipeline configuration.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the media insights pipeline configuration.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the media insights pipeline configuration.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the media insights pipeline configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the media insights pipeline configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineConfigurationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the media insights pipeline configuration.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the media insights pipeline configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineConfigurationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the media insights pipeline configuration request.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the media insights pipeline configuration request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the media insights pipeline configuration request.
     * </p>
     * 
     * @return The unique identifier for the media insights pipeline configuration request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the media insights pipeline configuration request.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the media insights pipeline configuration request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineConfigurationRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getMediaInsightsPipelineConfigurationName() != null)
            sb.append("MediaInsightsPipelineConfigurationName: ").append(getMediaInsightsPipelineConfigurationName()).append(",");
        if (getResourceAccessRoleArn() != null)
            sb.append("ResourceAccessRoleArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getRealTimeAlertConfiguration() != null)
            sb.append("RealTimeAlertConfiguration: ").append(getRealTimeAlertConfiguration()).append(",");
        if (getElements() != null)
            sb.append("Elements: ").append(getElements()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMediaInsightsPipelineConfigurationRequest == false)
            return false;
        CreateMediaInsightsPipelineConfigurationRequest other = (CreateMediaInsightsPipelineConfigurationRequest) obj;
        if (other.getMediaInsightsPipelineConfigurationName() == null ^ this.getMediaInsightsPipelineConfigurationName() == null)
            return false;
        if (other.getMediaInsightsPipelineConfigurationName() != null
                && other.getMediaInsightsPipelineConfigurationName().equals(this.getMediaInsightsPipelineConfigurationName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaInsightsPipelineConfigurationName() == null) ? 0 : getMediaInsightsPipelineConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getResourceAccessRoleArn() == null) ? 0 : getResourceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRealTimeAlertConfiguration() == null) ? 0 : getRealTimeAlertConfiguration().hashCode());
        hashCode = prime * hashCode + ((getElements() == null) ? 0 : getElements().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateMediaInsightsPipelineConfigurationRequest clone() {
        return (CreateMediaInsightsPipelineConfigurationRequest) super.clone();
    }

}
