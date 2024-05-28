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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Enable persistent chats. For more information about enabling persistent chat, and for example use cases and how to
 * configure for them, see <a href="https://docs.aws.amazon.com/connect/latest/adminguide/chat-persistence.html">Enable
 * persistent chat</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/PersistentChat" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PersistentChat implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration type. RehydrationType is required for
     * persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of the
     * specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the past ended
     * chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines the most recent
     * chat contact on the specified chat session that has ended, and uses it to start a persistent chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact that is specified in the
     * <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of this API.
     * </p>
     */
    private String rehydrationType;
    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     */
    private String sourceContactId;

    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration type. RehydrationType is required for
     * persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of the
     * specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the past ended
     * chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines the most recent
     * chat contact on the specified chat session that has ended, and uses it to start a persistent chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact that is specified in the
     * <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of this API.
     * </p>
     * 
     * @param rehydrationType
     *        The contactId that is used for rehydration depends on the rehydration type. RehydrationType is required
     *        for persistent chat. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of
     *        the specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the
     *        past ended chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines
     *        the most recent chat contact on the specified chat session that has ended, and uses it to start a
     *        persistent chat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact that is specified in the
     *        <code>sourceContactId</code> field.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The actual contactId used for rehydration is provided in the response of this API.
     * @see RehydrationType
     */

    public void setRehydrationType(String rehydrationType) {
        this.rehydrationType = rehydrationType;
    }

    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration type. RehydrationType is required for
     * persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of the
     * specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the past ended
     * chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines the most recent
     * chat contact on the specified chat session that has ended, and uses it to start a persistent chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact that is specified in the
     * <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of this API.
     * </p>
     * 
     * @return The contactId that is used for rehydration depends on the rehydration type. RehydrationType is required
     *         for persistent chat. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact
     *         of the specified past ended chat session. To use this type, provide the <code>initialContactId</code> of
     *         the past ended chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect
     *         determines the most recent chat contact on the specified chat session that has ended, and uses it to
     *         start a persistent chat.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact that is specified in the
     *         <code>sourceContactId</code> field.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The actual contactId used for rehydration is provided in the response of this API.
     * @see RehydrationType
     */

    public String getRehydrationType() {
        return this.rehydrationType;
    }

    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration type. RehydrationType is required for
     * persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of the
     * specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the past ended
     * chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines the most recent
     * chat contact on the specified chat session that has ended, and uses it to start a persistent chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact that is specified in the
     * <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of this API.
     * </p>
     * 
     * @param rehydrationType
     *        The contactId that is used for rehydration depends on the rehydration type. RehydrationType is required
     *        for persistent chat. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of
     *        the specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the
     *        past ended chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines
     *        the most recent chat contact on the specified chat session that has ended, and uses it to start a
     *        persistent chat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact that is specified in the
     *        <code>sourceContactId</code> field.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The actual contactId used for rehydration is provided in the response of this API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RehydrationType
     */

    public PersistentChat withRehydrationType(String rehydrationType) {
        setRehydrationType(rehydrationType);
        return this;
    }

    /**
     * <p>
     * The contactId that is used for rehydration depends on the rehydration type. RehydrationType is required for
     * persistent chat.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of the
     * specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the past ended
     * chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines the most recent
     * chat contact on the specified chat session that has ended, and uses it to start a persistent chat.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact that is specified in the
     * <code>sourceContactId</code> field.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The actual contactId used for rehydration is provided in the response of this API.
     * </p>
     * 
     * @param rehydrationType
     *        The contactId that is used for rehydration depends on the rehydration type. RehydrationType is required
     *        for persistent chat. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENTIRE_PAST_SESSION</code>: Rehydrates a chat from the most recently terminated past chat contact of
     *        the specified past ended chat session. To use this type, provide the <code>initialContactId</code> of the
     *        past ended chat session in the <code>sourceContactId</code> field. In this type, Amazon Connect determines
     *        the most recent chat contact on the specified chat session that has ended, and uses it to start a
     *        persistent chat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FROM_SEGMENT</code>: Rehydrates a chat from the past chat contact that is specified in the
     *        <code>sourceContactId</code> field.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The actual contactId used for rehydration is provided in the response of this API.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RehydrationType
     */

    public PersistentChat withRehydrationType(RehydrationType rehydrationType) {
        this.rehydrationType = rehydrationType.toString();
        return this;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     * 
     * @param sourceContactId
     *        The contactId from which a persistent chat session must be started.
     */

    public void setSourceContactId(String sourceContactId) {
        this.sourceContactId = sourceContactId;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     * 
     * @return The contactId from which a persistent chat session must be started.
     */

    public String getSourceContactId() {
        return this.sourceContactId;
    }

    /**
     * <p>
     * The contactId from which a persistent chat session must be started.
     * </p>
     * 
     * @param sourceContactId
     *        The contactId from which a persistent chat session must be started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PersistentChat withSourceContactId(String sourceContactId) {
        setSourceContactId(sourceContactId);
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
        if (getRehydrationType() != null)
            sb.append("RehydrationType: ").append(getRehydrationType()).append(",");
        if (getSourceContactId() != null)
            sb.append("SourceContactId: ").append(getSourceContactId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PersistentChat == false)
            return false;
        PersistentChat other = (PersistentChat) obj;
        if (other.getRehydrationType() == null ^ this.getRehydrationType() == null)
            return false;
        if (other.getRehydrationType() != null && other.getRehydrationType().equals(this.getRehydrationType()) == false)
            return false;
        if (other.getSourceContactId() == null ^ this.getSourceContactId() == null)
            return false;
        if (other.getSourceContactId() != null && other.getSourceContactId().equals(this.getSourceContactId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRehydrationType() == null) ? 0 : getRehydrationType().hashCode());
        hashCode = prime * hashCode + ((getSourceContactId() == null) ? 0 : getSourceContactId().hashCode());
        return hashCode;
    }

    @Override
    public PersistentChat clone() {
        try {
            return (PersistentChat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.PersistentChatMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
