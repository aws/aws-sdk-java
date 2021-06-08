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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to create a partner input
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CreatePartnerInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePartnerInputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Unique ID of the input. */
    private String inputId;
    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     */
    private String requestId;
    /** A collection of key-value pairs. */
    private java.util.Map<String, String> tags;

    /**
     * Unique ID of the input.
     * 
     * @param inputId
     *        Unique ID of the input.
     */

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * Unique ID of the input.
     * 
     * @return Unique ID of the input.
     */

    public String getInputId() {
        return this.inputId;
    }

    /**
     * Unique ID of the input.
     * 
     * @param inputId
     *        Unique ID of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnerInputRequest withInputId(String inputId) {
        setInputId(inputId);
        return this;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     * 
     * @param requestId
     *        Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     * 
     * @return Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     * 
     * @param requestId
     *        Unique identifier of the request to ensure the request is handled exactly once in case of retries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnerInputRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @return A collection of key-value pairs.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @param tags
     *        A collection of key-value pairs.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs.
     * 
     * @param tags
     *        A collection of key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnerInputRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreatePartnerInputRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreatePartnerInputRequest addTagsEntry(String key, String value) {
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

    public CreatePartnerInputRequest clearTagsEntries() {
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
        if (getInputId() != null)
            sb.append("InputId: ").append(getInputId()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
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

        if (obj instanceof CreatePartnerInputRequest == false)
            return false;
        CreatePartnerInputRequest other = (CreatePartnerInputRequest) obj;
        if (other.getInputId() == null ^ this.getInputId() == null)
            return false;
        if (other.getInputId() != null && other.getInputId().equals(this.getInputId()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
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

        hashCode = prime * hashCode + ((getInputId() == null) ? 0 : getInputId().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePartnerInputRequest clone() {
        return (CreatePartnerInputRequest) super.clone();
    }

}
