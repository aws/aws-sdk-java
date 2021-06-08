/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/StartExperiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     */
    private String experimentTemplateId;
    /**
     * <p>
     * The tags to apply to the experiment.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExperimentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @param experimentTemplateId
     *        The ID of the experiment template.
     */

    public void setExperimentTemplateId(String experimentTemplateId) {
        this.experimentTemplateId = experimentTemplateId;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @return The ID of the experiment template.
     */

    public String getExperimentTemplateId() {
        return this.experimentTemplateId;
    }

    /**
     * <p>
     * The ID of the experiment template.
     * </p>
     * 
     * @param experimentTemplateId
     *        The ID of the experiment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExperimentRequest withExperimentTemplateId(String experimentTemplateId) {
        setExperimentTemplateId(experimentTemplateId);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the experiment.
     * </p>
     * 
     * @return The tags to apply to the experiment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the experiment.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the experiment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to apply to the experiment.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExperimentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartExperimentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartExperimentRequest addTagsEntry(String key, String value) {
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

    public StartExperimentRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getExperimentTemplateId() != null)
            sb.append("ExperimentTemplateId: ").append(getExperimentTemplateId()).append(",");
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

        if (obj instanceof StartExperimentRequest == false)
            return false;
        StartExperimentRequest other = (StartExperimentRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getExperimentTemplateId() == null ^ this.getExperimentTemplateId() == null)
            return false;
        if (other.getExperimentTemplateId() != null && other.getExperimentTemplateId().equals(this.getExperimentTemplateId()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getExperimentTemplateId() == null) ? 0 : getExperimentTemplateId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartExperimentRequest clone() {
        return (StartExperimentRequest) super.clone();
    }

}
