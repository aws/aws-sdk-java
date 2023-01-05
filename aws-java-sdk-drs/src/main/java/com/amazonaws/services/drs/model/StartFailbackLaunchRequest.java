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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartFailbackLaunch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartFailbackLaunchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the Recovery Instance whose failback launch we want to request.
     * </p>
     */
    private java.util.List<String> recoveryInstanceIDs;
    /**
     * <p>
     * The tags to be associated with the failback launch Job.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The IDs of the Recovery Instance whose failback launch we want to request.
     * </p>
     * 
     * @return The IDs of the Recovery Instance whose failback launch we want to request.
     */

    public java.util.List<String> getRecoveryInstanceIDs() {
        return recoveryInstanceIDs;
    }

    /**
     * <p>
     * The IDs of the Recovery Instance whose failback launch we want to request.
     * </p>
     * 
     * @param recoveryInstanceIDs
     *        The IDs of the Recovery Instance whose failback launch we want to request.
     */

    public void setRecoveryInstanceIDs(java.util.Collection<String> recoveryInstanceIDs) {
        if (recoveryInstanceIDs == null) {
            this.recoveryInstanceIDs = null;
            return;
        }

        this.recoveryInstanceIDs = new java.util.ArrayList<String>(recoveryInstanceIDs);
    }

    /**
     * <p>
     * The IDs of the Recovery Instance whose failback launch we want to request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecoveryInstanceIDs(java.util.Collection)} or {@link #withRecoveryInstanceIDs(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param recoveryInstanceIDs
     *        The IDs of the Recovery Instance whose failback launch we want to request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFailbackLaunchRequest withRecoveryInstanceIDs(String... recoveryInstanceIDs) {
        if (this.recoveryInstanceIDs == null) {
            setRecoveryInstanceIDs(new java.util.ArrayList<String>(recoveryInstanceIDs.length));
        }
        for (String ele : recoveryInstanceIDs) {
            this.recoveryInstanceIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Recovery Instance whose failback launch we want to request.
     * </p>
     * 
     * @param recoveryInstanceIDs
     *        The IDs of the Recovery Instance whose failback launch we want to request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFailbackLaunchRequest withRecoveryInstanceIDs(java.util.Collection<String> recoveryInstanceIDs) {
        setRecoveryInstanceIDs(recoveryInstanceIDs);
        return this;
    }

    /**
     * <p>
     * The tags to be associated with the failback launch Job.
     * </p>
     * 
     * @return The tags to be associated with the failback launch Job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be associated with the failback launch Job.
     * </p>
     * 
     * @param tags
     *        The tags to be associated with the failback launch Job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be associated with the failback launch Job.
     * </p>
     * 
     * @param tags
     *        The tags to be associated with the failback launch Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFailbackLaunchRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartFailbackLaunchRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartFailbackLaunchRequest addTagsEntry(String key, String value) {
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

    public StartFailbackLaunchRequest clearTagsEntries() {
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
        if (getRecoveryInstanceIDs() != null)
            sb.append("RecoveryInstanceIDs: ").append(getRecoveryInstanceIDs()).append(",");
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

        if (obj instanceof StartFailbackLaunchRequest == false)
            return false;
        StartFailbackLaunchRequest other = (StartFailbackLaunchRequest) obj;
        if (other.getRecoveryInstanceIDs() == null ^ this.getRecoveryInstanceIDs() == null)
            return false;
        if (other.getRecoveryInstanceIDs() != null && other.getRecoveryInstanceIDs().equals(this.getRecoveryInstanceIDs()) == false)
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

        hashCode = prime * hashCode + ((getRecoveryInstanceIDs() == null) ? 0 : getRecoveryInstanceIDs().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartFailbackLaunchRequest clone() {
        return (StartFailbackLaunchRequest) super.clone();
    }

}
