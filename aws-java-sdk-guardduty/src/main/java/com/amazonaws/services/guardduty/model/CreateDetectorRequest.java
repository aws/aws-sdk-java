/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A boolean value that specifies whether the detector is to be enabled.
     * </p>
     */
    private Boolean enable;
    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A enum value that specifies how frequently customer got Finding updates published.
     * </p>
     */
    private String findingPublishingFrequency;
    /**
     * <p>
     * The tags to be added to a new detector resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A boolean value that specifies whether the detector is to be enabled.
     * </p>
     * 
     * @param enable
     *        A boolean value that specifies whether the detector is to be enabled.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * <p>
     * A boolean value that specifies whether the detector is to be enabled.
     * </p>
     * 
     * @return A boolean value that specifies whether the detector is to be enabled.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * <p>
     * A boolean value that specifies whether the detector is to be enabled.
     * </p>
     * 
     * @param enable
     *        A boolean value that specifies whether the detector is to be enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorRequest withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * <p>
     * A boolean value that specifies whether the detector is to be enabled.
     * </p>
     * 
     * @return A boolean value that specifies whether the detector is to be enabled.
     */

    public Boolean isEnable() {
        return this.enable;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the create request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @return The idempotency token for the create request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for the create request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the create request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A enum value that specifies how frequently customer got Finding updates published.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        A enum value that specifies how frequently customer got Finding updates published.
     * @see FindingPublishingFrequency
     */

    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * <p>
     * A enum value that specifies how frequently customer got Finding updates published.
     * </p>
     * 
     * @return A enum value that specifies how frequently customer got Finding updates published.
     * @see FindingPublishingFrequency
     */

    public String getFindingPublishingFrequency() {
        return this.findingPublishingFrequency;
    }

    /**
     * <p>
     * A enum value that specifies how frequently customer got Finding updates published.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        A enum value that specifies how frequently customer got Finding updates published.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public CreateDetectorRequest withFindingPublishingFrequency(String findingPublishingFrequency) {
        setFindingPublishingFrequency(findingPublishingFrequency);
        return this;
    }

    /**
     * <p>
     * A enum value that specifies how frequently customer got Finding updates published.
     * </p>
     * 
     * @param findingPublishingFrequency
     *        A enum value that specifies how frequently customer got Finding updates published.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingPublishingFrequency
     */

    public CreateDetectorRequest withFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * The tags to be added to a new detector resource.
     * </p>
     * 
     * @return The tags to be added to a new detector resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be added to a new detector resource.
     * </p>
     * 
     * @param tags
     *        The tags to be added to a new detector resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be added to a new detector resource.
     * </p>
     * 
     * @param tags
     *        The tags to be added to a new detector resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDetectorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorRequest clearTagsEntries() {
        this.tags = null;
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
        if (getEnable() != null)
            sb.append("Enable: ").append(getEnable()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFindingPublishingFrequency() != null)
            sb.append("FindingPublishingFrequency: ").append(getFindingPublishingFrequency()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDetectorRequest == false)
            return false;
        CreateDetectorRequest other = (CreateDetectorRequest) obj;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFindingPublishingFrequency() == null ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null && other.getFindingPublishingFrequency().equals(this.getFindingPublishingFrequency()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDetectorRequest clone() {
        return (CreateDetectorRequest) super.clone();
    }

}
