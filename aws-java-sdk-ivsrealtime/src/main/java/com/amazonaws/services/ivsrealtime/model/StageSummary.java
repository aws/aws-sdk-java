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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StageSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ID of the active session within the stage.
     * </p>
     */
    private String activeSessionId;
    /**
     * <p>
     * Stage ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Stage name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * ID of the active session within the stage.
     * </p>
     * 
     * @param activeSessionId
     *        ID of the active session within the stage.
     */

    public void setActiveSessionId(String activeSessionId) {
        this.activeSessionId = activeSessionId;
    }

    /**
     * <p>
     * ID of the active session within the stage.
     * </p>
     * 
     * @return ID of the active session within the stage.
     */

    public String getActiveSessionId() {
        return this.activeSessionId;
    }

    /**
     * <p>
     * ID of the active session within the stage.
     * </p>
     * 
     * @param activeSessionId
     *        ID of the active session within the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageSummary withActiveSessionId(String activeSessionId) {
        setActiveSessionId(activeSessionId);
        return this;
    }

    /**
     * <p>
     * Stage ARN.
     * </p>
     * 
     * @param arn
     *        Stage ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Stage ARN.
     * </p>
     * 
     * @return Stage ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Stage ARN.
     * </p>
     * 
     * @param arn
     *        Stage ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Stage name.
     * </p>
     * 
     * @param name
     *        Stage name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Stage name.
     * </p>
     * 
     * @return Stage name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Stage name.
     * </p>
     * 
     * @param name
     *        Stage name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @return Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>.
     *         See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>
     *         for details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     *         IVS has no constraints on tags beyond what is documented there.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        has no constraints on tags beyond what is documented there.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        has no constraints on tags beyond what is documented there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StageSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StageSummary addTagsEntry(String key, String value) {
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

    public StageSummary clearTagsEntries() {
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
        if (getActiveSessionId() != null)
            sb.append("ActiveSessionId: ").append(getActiveSessionId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof StageSummary == false)
            return false;
        StageSummary other = (StageSummary) obj;
        if (other.getActiveSessionId() == null ^ this.getActiveSessionId() == null)
            return false;
        if (other.getActiveSessionId() != null && other.getActiveSessionId().equals(this.getActiveSessionId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getActiveSessionId() == null) ? 0 : getActiveSessionId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StageSummary clone() {
        try {
            return (StageSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.StageSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
