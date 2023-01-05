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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SessionData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The description of the session.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the session.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session.
     * </p>
     */
    private String sessionArn;
    /**
     * <p>
     * The identifier of the session.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The description of the session.
     * </p>
     * 
     * @param description
     *        The description of the session.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the session.
     * </p>
     * 
     * @return The description of the session.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the session.
     * </p>
     * 
     * @param description
     *        The description of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionData withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the session.
     * </p>
     * 
     * @param name
     *        The name of the session.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the session.
     * </p>
     * 
     * @return The name of the session.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the session.
     * </p>
     * 
     * @param name
     *        The name of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionData withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session.
     * </p>
     * 
     * @param sessionArn
     *        The Amazon Resource Name (ARN) of the session.
     */

    public void setSessionArn(String sessionArn) {
        this.sessionArn = sessionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the session.
     */

    public String getSessionArn() {
        return this.sessionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the session.
     * </p>
     * 
     * @param sessionArn
     *        The Amazon Resource Name (ARN) of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionData withSessionArn(String sessionArn) {
        setSessionArn(sessionArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the session.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session.
     * </p>
     * 
     * @return The identifier of the session.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionData withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionData withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SessionData#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SessionData addTagsEntry(String key, String value) {
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

    public SessionData clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSessionArn() != null)
            sb.append("SessionArn: ").append(getSessionArn()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
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

        if (obj instanceof SessionData == false)
            return false;
        SessionData other = (SessionData) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSessionArn() == null ^ this.getSessionArn() == null)
            return false;
        if (other.getSessionArn() != null && other.getSessionArn().equals(this.getSessionArn()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSessionArn() == null) ? 0 : getSessionArn().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SessionData clone() {
        try {
            return (SessionData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.SessionDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
