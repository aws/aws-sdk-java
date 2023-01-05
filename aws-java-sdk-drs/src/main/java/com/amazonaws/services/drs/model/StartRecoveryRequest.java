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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StartRecovery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartRecoveryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether this Source Server Recovery operation is a drill or not.
     * </p>
     */
    private Boolean isDrill;
    /**
     * <p>
     * The Source Servers that we want to start a Recovery Job for.
     * </p>
     */
    private java.util.List<StartRecoveryRequestSourceServer> sourceServers;
    /**
     * <p>
     * The tags to be associated with the Recovery Job.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Whether this Source Server Recovery operation is a drill or not.
     * </p>
     * 
     * @param isDrill
     *        Whether this Source Server Recovery operation is a drill or not.
     */

    public void setIsDrill(Boolean isDrill) {
        this.isDrill = isDrill;
    }

    /**
     * <p>
     * Whether this Source Server Recovery operation is a drill or not.
     * </p>
     * 
     * @return Whether this Source Server Recovery operation is a drill or not.
     */

    public Boolean getIsDrill() {
        return this.isDrill;
    }

    /**
     * <p>
     * Whether this Source Server Recovery operation is a drill or not.
     * </p>
     * 
     * @param isDrill
     *        Whether this Source Server Recovery operation is a drill or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRecoveryRequest withIsDrill(Boolean isDrill) {
        setIsDrill(isDrill);
        return this;
    }

    /**
     * <p>
     * Whether this Source Server Recovery operation is a drill or not.
     * </p>
     * 
     * @return Whether this Source Server Recovery operation is a drill or not.
     */

    public Boolean isDrill() {
        return this.isDrill;
    }

    /**
     * <p>
     * The Source Servers that we want to start a Recovery Job for.
     * </p>
     * 
     * @return The Source Servers that we want to start a Recovery Job for.
     */

    public java.util.List<StartRecoveryRequestSourceServer> getSourceServers() {
        return sourceServers;
    }

    /**
     * <p>
     * The Source Servers that we want to start a Recovery Job for.
     * </p>
     * 
     * @param sourceServers
     *        The Source Servers that we want to start a Recovery Job for.
     */

    public void setSourceServers(java.util.Collection<StartRecoveryRequestSourceServer> sourceServers) {
        if (sourceServers == null) {
            this.sourceServers = null;
            return;
        }

        this.sourceServers = new java.util.ArrayList<StartRecoveryRequestSourceServer>(sourceServers);
    }

    /**
     * <p>
     * The Source Servers that we want to start a Recovery Job for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceServers(java.util.Collection)} or {@link #withSourceServers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceServers
     *        The Source Servers that we want to start a Recovery Job for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRecoveryRequest withSourceServers(StartRecoveryRequestSourceServer... sourceServers) {
        if (this.sourceServers == null) {
            setSourceServers(new java.util.ArrayList<StartRecoveryRequestSourceServer>(sourceServers.length));
        }
        for (StartRecoveryRequestSourceServer ele : sourceServers) {
            this.sourceServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Source Servers that we want to start a Recovery Job for.
     * </p>
     * 
     * @param sourceServers
     *        The Source Servers that we want to start a Recovery Job for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRecoveryRequest withSourceServers(java.util.Collection<StartRecoveryRequestSourceServer> sourceServers) {
        setSourceServers(sourceServers);
        return this;
    }

    /**
     * <p>
     * The tags to be associated with the Recovery Job.
     * </p>
     * 
     * @return The tags to be associated with the Recovery Job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be associated with the Recovery Job.
     * </p>
     * 
     * @param tags
     *        The tags to be associated with the Recovery Job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be associated with the Recovery Job.
     * </p>
     * 
     * @param tags
     *        The tags to be associated with the Recovery Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRecoveryRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartRecoveryRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartRecoveryRequest addTagsEntry(String key, String value) {
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

    public StartRecoveryRequest clearTagsEntries() {
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
        if (getIsDrill() != null)
            sb.append("IsDrill: ").append(getIsDrill()).append(",");
        if (getSourceServers() != null)
            sb.append("SourceServers: ").append(getSourceServers()).append(",");
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

        if (obj instanceof StartRecoveryRequest == false)
            return false;
        StartRecoveryRequest other = (StartRecoveryRequest) obj;
        if (other.getIsDrill() == null ^ this.getIsDrill() == null)
            return false;
        if (other.getIsDrill() != null && other.getIsDrill().equals(this.getIsDrill()) == false)
            return false;
        if (other.getSourceServers() == null ^ this.getSourceServers() == null)
            return false;
        if (other.getSourceServers() != null && other.getSourceServers().equals(this.getSourceServers()) == false)
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

        hashCode = prime * hashCode + ((getIsDrill() == null) ? 0 : getIsDrill().hashCode());
        hashCode = prime * hashCode + ((getSourceServers() == null) ? 0 : getSourceServers().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartRecoveryRequest clone() {
        return (StartRecoveryRequest) super.clone();
    }

}
