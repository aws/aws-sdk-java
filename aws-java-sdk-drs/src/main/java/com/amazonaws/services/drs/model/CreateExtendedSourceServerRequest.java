/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/CreateExtendedSourceServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExtendedSourceServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This defines the ARN of the source server in staging Account based on which you want to create an extended source
     * server.
     * </p>
     */
    private String sourceServerArn;
    /**
     * <p>
     * A list of tags associated with the extended source server.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * This defines the ARN of the source server in staging Account based on which you want to create an extended source
     * server.
     * </p>
     * 
     * @param sourceServerArn
     *        This defines the ARN of the source server in staging Account based on which you want to create an extended
     *        source server.
     */

    public void setSourceServerArn(String sourceServerArn) {
        this.sourceServerArn = sourceServerArn;
    }

    /**
     * <p>
     * This defines the ARN of the source server in staging Account based on which you want to create an extended source
     * server.
     * </p>
     * 
     * @return This defines the ARN of the source server in staging Account based on which you want to create an
     *         extended source server.
     */

    public String getSourceServerArn() {
        return this.sourceServerArn;
    }

    /**
     * <p>
     * This defines the ARN of the source server in staging Account based on which you want to create an extended source
     * server.
     * </p>
     * 
     * @param sourceServerArn
     *        This defines the ARN of the source server in staging Account based on which you want to create an extended
     *        source server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtendedSourceServerRequest withSourceServerArn(String sourceServerArn) {
        setSourceServerArn(sourceServerArn);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the extended source server.
     * </p>
     * 
     * @return A list of tags associated with the extended source server.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the extended source server.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the extended source server.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags associated with the extended source server.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the extended source server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtendedSourceServerRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateExtendedSourceServerRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtendedSourceServerRequest addTagsEntry(String key, String value) {
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

    public CreateExtendedSourceServerRequest clearTagsEntries() {
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
        if (getSourceServerArn() != null)
            sb.append("SourceServerArn: ").append(getSourceServerArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExtendedSourceServerRequest == false)
            return false;
        CreateExtendedSourceServerRequest other = (CreateExtendedSourceServerRequest) obj;
        if (other.getSourceServerArn() == null ^ this.getSourceServerArn() == null)
            return false;
        if (other.getSourceServerArn() != null && other.getSourceServerArn().equals(this.getSourceServerArn()) == false)
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

        hashCode = prime * hashCode + ((getSourceServerArn() == null) ? 0 : getSourceServerArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateExtendedSourceServerRequest clone() {
        return (CreateExtendedSourceServerRequest) super.clone();
    }

}
