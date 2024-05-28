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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/UpdateSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q in Connect assistant. Can be either the ID or the ARN. URLs cannot contain the
     * ARN.
     * </p>
     */
    private String assistantId;
    /**
     * <p>
     * The description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String sessionId;
    /**
     * <p>
     * An object that can be used to specify Tag conditions.
     * </p>
     */
    private TagFilter tagFilter;

    /**
     * <p>
     * The identifier of the Amazon Q in Connect assistant. Can be either the ID or the ARN. URLs cannot contain the
     * ARN.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Amazon Q in Connect assistant. Can be either the ID or the ARN. URLs cannot contain
     *        the ARN.
     */

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q in Connect assistant. Can be either the ID or the ARN. URLs cannot contain the
     * ARN.
     * </p>
     * 
     * @return The identifier of the Amazon Q in Connect assistant. Can be either the ID or the ARN. URLs cannot contain
     *         the ARN.
     */

    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q in Connect assistant. Can be either the ID or the ARN. URLs cannot contain the
     * ARN.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Amazon Q in Connect assistant. Can be either the ID or the ARN. URLs cannot contain
     *        the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSessionRequest withAssistantId(String assistantId) {
        setAssistantId(assistantId);
        return this;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @return The description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description.
     * </p>
     * 
     * @param description
     *        The description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSessionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSessionRequest withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * <p>
     * An object that can be used to specify Tag conditions.
     * </p>
     * 
     * @param tagFilter
     *        An object that can be used to specify Tag conditions.
     */

    public void setTagFilter(TagFilter tagFilter) {
        this.tagFilter = tagFilter;
    }

    /**
     * <p>
     * An object that can be used to specify Tag conditions.
     * </p>
     * 
     * @return An object that can be used to specify Tag conditions.
     */

    public TagFilter getTagFilter() {
        return this.tagFilter;
    }

    /**
     * <p>
     * An object that can be used to specify Tag conditions.
     * </p>
     * 
     * @param tagFilter
     *        An object that can be used to specify Tag conditions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSessionRequest withTagFilter(TagFilter tagFilter) {
        setTagFilter(tagFilter);
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
        if (getAssistantId() != null)
            sb.append("AssistantId: ").append(getAssistantId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId()).append(",");
        if (getTagFilter() != null)
            sb.append("TagFilter: ").append(getTagFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSessionRequest == false)
            return false;
        UpdateSessionRequest other = (UpdateSessionRequest) obj;
        if (other.getAssistantId() == null ^ this.getAssistantId() == null)
            return false;
        if (other.getAssistantId() != null && other.getAssistantId().equals(this.getAssistantId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        if (other.getTagFilter() == null ^ this.getTagFilter() == null)
            return false;
        if (other.getTagFilter() != null && other.getTagFilter().equals(this.getTagFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssistantId() == null) ? 0 : getAssistantId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        hashCode = prime * hashCode + ((getTagFilter() == null) ? 0 : getTagFilter().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSessionRequest clone() {
        return (UpdateSessionRequest) super.clone();
    }

}
