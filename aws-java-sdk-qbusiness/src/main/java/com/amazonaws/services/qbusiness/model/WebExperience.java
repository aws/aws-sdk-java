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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information for an Amazon Q Business web experience.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/WebExperience" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebExperience implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of your Amazon Q Business web experience.
     * </p>
     */
    private String webExperienceId;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when your Amazon Q Business web experience was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The endpoint URLs for your Amazon Q Business web experience. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     */
    private String defaultEndpoint;
    /**
     * <p>
     * The status of your Amazon Q Business web experience.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The identifier of your Amazon Q Business web experience.
     * </p>
     * 
     * @param webExperienceId
     *        The identifier of your Amazon Q Business web experience.
     */

    public void setWebExperienceId(String webExperienceId) {
        this.webExperienceId = webExperienceId;
    }

    /**
     * <p>
     * The identifier of your Amazon Q Business web experience.
     * </p>
     * 
     * @return The identifier of your Amazon Q Business web experience.
     */

    public String getWebExperienceId() {
        return this.webExperienceId;
    }

    /**
     * <p>
     * The identifier of your Amazon Q Business web experience.
     * </p>
     * 
     * @param webExperienceId
     *        The identifier of your Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebExperience withWebExperienceId(String webExperienceId) {
        setWebExperienceId(webExperienceId);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebExperience withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when your Amazon Q Business web experience was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when your Amazon Q Business web experience was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when your Amazon Q Business web experience was updated.
     * </p>
     * 
     * @return The Unix timestamp when your Amazon Q Business web experience was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when your Amazon Q Business web experience was updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when your Amazon Q Business web experience was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebExperience withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The endpoint URLs for your Amazon Q Business web experience. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * 
     * @param defaultEndpoint
     *        The endpoint URLs for your Amazon Q Business web experience. The URLs are unique and fully hosted by
     *        Amazon Web Services.
     */

    public void setDefaultEndpoint(String defaultEndpoint) {
        this.defaultEndpoint = defaultEndpoint;
    }

    /**
     * <p>
     * The endpoint URLs for your Amazon Q Business web experience. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * 
     * @return The endpoint URLs for your Amazon Q Business web experience. The URLs are unique and fully hosted by
     *         Amazon Web Services.
     */

    public String getDefaultEndpoint() {
        return this.defaultEndpoint;
    }

    /**
     * <p>
     * The endpoint URLs for your Amazon Q Business web experience. The URLs are unique and fully hosted by Amazon Web
     * Services.
     * </p>
     * 
     * @param defaultEndpoint
     *        The endpoint URLs for your Amazon Q Business web experience. The URLs are unique and fully hosted by
     *        Amazon Web Services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WebExperience withDefaultEndpoint(String defaultEndpoint) {
        setDefaultEndpoint(defaultEndpoint);
        return this;
    }

    /**
     * <p>
     * The status of your Amazon Q Business web experience.
     * </p>
     * 
     * @param status
     *        The status of your Amazon Q Business web experience.
     * @see WebExperienceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of your Amazon Q Business web experience.
     * </p>
     * 
     * @return The status of your Amazon Q Business web experience.
     * @see WebExperienceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of your Amazon Q Business web experience.
     * </p>
     * 
     * @param status
     *        The status of your Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebExperienceStatus
     */

    public WebExperience withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of your Amazon Q Business web experience.
     * </p>
     * 
     * @param status
     *        The status of your Amazon Q Business web experience.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WebExperienceStatus
     */

    public WebExperience withStatus(WebExperienceStatus status) {
        this.status = status.toString();
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
        if (getWebExperienceId() != null)
            sb.append("WebExperienceId: ").append(getWebExperienceId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getDefaultEndpoint() != null)
            sb.append("DefaultEndpoint: ").append(getDefaultEndpoint()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebExperience == false)
            return false;
        WebExperience other = (WebExperience) obj;
        if (other.getWebExperienceId() == null ^ this.getWebExperienceId() == null)
            return false;
        if (other.getWebExperienceId() != null && other.getWebExperienceId().equals(this.getWebExperienceId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getDefaultEndpoint() == null ^ this.getDefaultEndpoint() == null)
            return false;
        if (other.getDefaultEndpoint() != null && other.getDefaultEndpoint().equals(this.getDefaultEndpoint()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebExperienceId() == null) ? 0 : getWebExperienceId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDefaultEndpoint() == null) ? 0 : getDefaultEndpoint().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public WebExperience clone() {
        try {
            return (WebExperience) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.WebExperienceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
