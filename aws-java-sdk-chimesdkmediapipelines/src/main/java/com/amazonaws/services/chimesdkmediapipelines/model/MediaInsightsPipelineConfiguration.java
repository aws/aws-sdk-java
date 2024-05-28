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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration settings for a media insights pipeline.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/MediaInsightsPipelineConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaInsightsPipelineConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the configuration.
     * </p>
     */
    private String mediaInsightsPipelineConfigurationName;
    /**
     * <p>
     * The ARN of the configuration.
     * </p>
     */
    private String mediaInsightsPipelineConfigurationArn;
    /**
     * <p>
     * The ARN of the role used by the service to access Amazon Web Services resources.
     * </p>
     */
    private String resourceAccessRoleArn;
    /**
     * <p>
     * Lists the rules that trigger a real-time alert.
     * </p>
     */
    private RealTimeAlertConfiguration realTimeAlertConfiguration;
    /**
     * <p>
     * The elements in the configuration.
     * </p>
     */
    private java.util.List<MediaInsightsPipelineConfigurationElement> elements;
    /**
     * <p>
     * The ID of the configuration.
     * </p>
     */
    private String mediaInsightsPipelineConfigurationId;
    /**
     * <p>
     * The time at which the configuration was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which the configuration was last updated.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationName
     *        The name of the configuration.
     */

    public void setMediaInsightsPipelineConfigurationName(String mediaInsightsPipelineConfigurationName) {
        this.mediaInsightsPipelineConfigurationName = mediaInsightsPipelineConfigurationName;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @return The name of the configuration.
     */

    public String getMediaInsightsPipelineConfigurationName() {
        return this.mediaInsightsPipelineConfigurationName;
    }

    /**
     * <p>
     * The name of the configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationName
     *        The name of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfiguration withMediaInsightsPipelineConfigurationName(String mediaInsightsPipelineConfigurationName) {
        setMediaInsightsPipelineConfigurationName(mediaInsightsPipelineConfigurationName);
        return this;
    }

    /**
     * <p>
     * The ARN of the configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationArn
     *        The ARN of the configuration.
     */

    public void setMediaInsightsPipelineConfigurationArn(String mediaInsightsPipelineConfigurationArn) {
        this.mediaInsightsPipelineConfigurationArn = mediaInsightsPipelineConfigurationArn;
    }

    /**
     * <p>
     * The ARN of the configuration.
     * </p>
     * 
     * @return The ARN of the configuration.
     */

    public String getMediaInsightsPipelineConfigurationArn() {
        return this.mediaInsightsPipelineConfigurationArn;
    }

    /**
     * <p>
     * The ARN of the configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationArn
     *        The ARN of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfiguration withMediaInsightsPipelineConfigurationArn(String mediaInsightsPipelineConfigurationArn) {
        setMediaInsightsPipelineConfigurationArn(mediaInsightsPipelineConfigurationArn);
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

    public MediaInsightsPipelineConfiguration withResourceAccessRoleArn(String resourceAccessRoleArn) {
        setResourceAccessRoleArn(resourceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Lists the rules that trigger a real-time alert.
     * </p>
     * 
     * @param realTimeAlertConfiguration
     *        Lists the rules that trigger a real-time alert.
     */

    public void setRealTimeAlertConfiguration(RealTimeAlertConfiguration realTimeAlertConfiguration) {
        this.realTimeAlertConfiguration = realTimeAlertConfiguration;
    }

    /**
     * <p>
     * Lists the rules that trigger a real-time alert.
     * </p>
     * 
     * @return Lists the rules that trigger a real-time alert.
     */

    public RealTimeAlertConfiguration getRealTimeAlertConfiguration() {
        return this.realTimeAlertConfiguration;
    }

    /**
     * <p>
     * Lists the rules that trigger a real-time alert.
     * </p>
     * 
     * @param realTimeAlertConfiguration
     *        Lists the rules that trigger a real-time alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfiguration withRealTimeAlertConfiguration(RealTimeAlertConfiguration realTimeAlertConfiguration) {
        setRealTimeAlertConfiguration(realTimeAlertConfiguration);
        return this;
    }

    /**
     * <p>
     * The elements in the configuration.
     * </p>
     * 
     * @return The elements in the configuration.
     */

    public java.util.List<MediaInsightsPipelineConfigurationElement> getElements() {
        return elements;
    }

    /**
     * <p>
     * The elements in the configuration.
     * </p>
     * 
     * @param elements
     *        The elements in the configuration.
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
     * The elements in the configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElements(java.util.Collection)} or {@link #withElements(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param elements
     *        The elements in the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfiguration withElements(MediaInsightsPipelineConfigurationElement... elements) {
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
     * The elements in the configuration.
     * </p>
     * 
     * @param elements
     *        The elements in the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfiguration withElements(java.util.Collection<MediaInsightsPipelineConfigurationElement> elements) {
        setElements(elements);
        return this;
    }

    /**
     * <p>
     * The ID of the configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationId
     *        The ID of the configuration.
     */

    public void setMediaInsightsPipelineConfigurationId(String mediaInsightsPipelineConfigurationId) {
        this.mediaInsightsPipelineConfigurationId = mediaInsightsPipelineConfigurationId;
    }

    /**
     * <p>
     * The ID of the configuration.
     * </p>
     * 
     * @return The ID of the configuration.
     */

    public String getMediaInsightsPipelineConfigurationId() {
        return this.mediaInsightsPipelineConfigurationId;
    }

    /**
     * <p>
     * The ID of the configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationId
     *        The ID of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfiguration withMediaInsightsPipelineConfigurationId(String mediaInsightsPipelineConfigurationId) {
        setMediaInsightsPipelineConfigurationId(mediaInsightsPipelineConfigurationId);
        return this;
    }

    /**
     * <p>
     * The time at which the configuration was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the configuration was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the configuration was created.
     * </p>
     * 
     * @return The time at which the configuration was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the configuration was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfiguration withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the configuration was last updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the configuration was last updated.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the configuration was last updated.
     * </p>
     * 
     * @return The time at which the configuration was last updated.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the configuration was last updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the configuration was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfiguration withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
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
        if (getMediaInsightsPipelineConfigurationArn() != null)
            sb.append("MediaInsightsPipelineConfigurationArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getResourceAccessRoleArn() != null)
            sb.append("ResourceAccessRoleArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getRealTimeAlertConfiguration() != null)
            sb.append("RealTimeAlertConfiguration: ").append(getRealTimeAlertConfiguration()).append(",");
        if (getElements() != null)
            sb.append("Elements: ").append(getElements()).append(",");
        if (getMediaInsightsPipelineConfigurationId() != null)
            sb.append("MediaInsightsPipelineConfigurationId: ").append(getMediaInsightsPipelineConfigurationId()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaInsightsPipelineConfiguration == false)
            return false;
        MediaInsightsPipelineConfiguration other = (MediaInsightsPipelineConfiguration) obj;
        if (other.getMediaInsightsPipelineConfigurationName() == null ^ this.getMediaInsightsPipelineConfigurationName() == null)
            return false;
        if (other.getMediaInsightsPipelineConfigurationName() != null
                && other.getMediaInsightsPipelineConfigurationName().equals(this.getMediaInsightsPipelineConfigurationName()) == false)
            return false;
        if (other.getMediaInsightsPipelineConfigurationArn() == null ^ this.getMediaInsightsPipelineConfigurationArn() == null)
            return false;
        if (other.getMediaInsightsPipelineConfigurationArn() != null
                && other.getMediaInsightsPipelineConfigurationArn().equals(this.getMediaInsightsPipelineConfigurationArn()) == false)
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
        if (other.getMediaInsightsPipelineConfigurationId() == null ^ this.getMediaInsightsPipelineConfigurationId() == null)
            return false;
        if (other.getMediaInsightsPipelineConfigurationId() != null
                && other.getMediaInsightsPipelineConfigurationId().equals(this.getMediaInsightsPipelineConfigurationId()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaInsightsPipelineConfigurationName() == null) ? 0 : getMediaInsightsPipelineConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getMediaInsightsPipelineConfigurationArn() == null) ? 0 : getMediaInsightsPipelineConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getResourceAccessRoleArn() == null) ? 0 : getResourceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRealTimeAlertConfiguration() == null) ? 0 : getRealTimeAlertConfiguration().hashCode());
        hashCode = prime * hashCode + ((getElements() == null) ? 0 : getElements().hashCode());
        hashCode = prime * hashCode + ((getMediaInsightsPipelineConfigurationId() == null) ? 0 : getMediaInsightsPipelineConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public MediaInsightsPipelineConfiguration clone() {
        try {
            return (MediaInsightsPipelineConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.MediaInsightsPipelineConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
