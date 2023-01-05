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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Source server in staging account that extended source server connected to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/StagingSourceServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StagingSourceServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the source server.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Hostname of staging source server.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * A list of tags associated with the staging source server.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the source server.
     * </p>
     * 
     * @param arn
     *        The ARN of the source server.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the source server.
     * </p>
     * 
     * @return The ARN of the source server.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the source server.
     * </p>
     * 
     * @param arn
     *        The ARN of the source server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StagingSourceServer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Hostname of staging source server.
     * </p>
     * 
     * @param hostname
     *        Hostname of staging source server.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * Hostname of staging source server.
     * </p>
     * 
     * @return Hostname of staging source server.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * Hostname of staging source server.
     * </p>
     * 
     * @param hostname
     *        Hostname of staging source server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StagingSourceServer withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the staging source server.
     * </p>
     * 
     * @return A list of tags associated with the staging source server.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the staging source server.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the staging source server.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags associated with the staging source server.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the staging source server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StagingSourceServer withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StagingSourceServer#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StagingSourceServer addTagsEntry(String key, String value) {
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

    public StagingSourceServer clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
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

        if (obj instanceof StagingSourceServer == false)
            return false;
        StagingSourceServer other = (StagingSourceServer) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StagingSourceServer clone() {
        try {
            return (StagingSourceServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.StagingSourceServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
