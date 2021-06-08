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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/TerminateTargetInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateTargetInstancesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Terminate Target instance by Source Server IDs.
     * </p>
     */
    private java.util.List<String> sourceServerIDs;
    /**
     * <p>
     * Terminate Target instance by Tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Terminate Target instance by Source Server IDs.
     * </p>
     * 
     * @return Terminate Target instance by Source Server IDs.
     */

    public java.util.List<String> getSourceServerIDs() {
        return sourceServerIDs;
    }

    /**
     * <p>
     * Terminate Target instance by Source Server IDs.
     * </p>
     * 
     * @param sourceServerIDs
     *        Terminate Target instance by Source Server IDs.
     */

    public void setSourceServerIDs(java.util.Collection<String> sourceServerIDs) {
        if (sourceServerIDs == null) {
            this.sourceServerIDs = null;
            return;
        }

        this.sourceServerIDs = new java.util.ArrayList<String>(sourceServerIDs);
    }

    /**
     * <p>
     * Terminate Target instance by Source Server IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceServerIDs(java.util.Collection)} or {@link #withSourceServerIDs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceServerIDs
     *        Terminate Target instance by Source Server IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateTargetInstancesRequest withSourceServerIDs(String... sourceServerIDs) {
        if (this.sourceServerIDs == null) {
            setSourceServerIDs(new java.util.ArrayList<String>(sourceServerIDs.length));
        }
        for (String ele : sourceServerIDs) {
            this.sourceServerIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Terminate Target instance by Source Server IDs.
     * </p>
     * 
     * @param sourceServerIDs
     *        Terminate Target instance by Source Server IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateTargetInstancesRequest withSourceServerIDs(java.util.Collection<String> sourceServerIDs) {
        setSourceServerIDs(sourceServerIDs);
        return this;
    }

    /**
     * <p>
     * Terminate Target instance by Tags.
     * </p>
     * 
     * @return Terminate Target instance by Tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Terminate Target instance by Tags.
     * </p>
     * 
     * @param tags
     *        Terminate Target instance by Tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Terminate Target instance by Tags.
     * </p>
     * 
     * @param tags
     *        Terminate Target instance by Tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateTargetInstancesRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see TerminateTargetInstancesRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TerminateTargetInstancesRequest addTagsEntry(String key, String value) {
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

    public TerminateTargetInstancesRequest clearTagsEntries() {
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
        if (getSourceServerIDs() != null)
            sb.append("SourceServerIDs: ").append(getSourceServerIDs()).append(",");
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

        if (obj instanceof TerminateTargetInstancesRequest == false)
            return false;
        TerminateTargetInstancesRequest other = (TerminateTargetInstancesRequest) obj;
        if (other.getSourceServerIDs() == null ^ this.getSourceServerIDs() == null)
            return false;
        if (other.getSourceServerIDs() != null && other.getSourceServerIDs().equals(this.getSourceServerIDs()) == false)
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

        hashCode = prime * hashCode + ((getSourceServerIDs() == null) ? 0 : getSourceServerIDs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TerminateTargetInstancesRequest clone() {
        return (TerminateTargetInstancesRequest) super.clone();
    }

}
