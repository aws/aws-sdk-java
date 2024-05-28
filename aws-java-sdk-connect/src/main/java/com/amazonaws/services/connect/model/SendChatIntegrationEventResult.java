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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SendChatIntegrationEvent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendChatIntegrationEventResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Identifier of chat contact used to handle integration event. This may be null if the integration event is not
     * valid without an already existing chat contact.
     * </p>
     */
    private String initialContactId;
    /**
     * <p>
     * Whether handling the integration event resulted in creating a new chat or acting on existing chat.
     * </p>
     */
    private Boolean newChatCreated;

    /**
     * <p>
     * Identifier of chat contact used to handle integration event. This may be null if the integration event is not
     * valid without an already existing chat contact.
     * </p>
     * 
     * @param initialContactId
     *        Identifier of chat contact used to handle integration event. This may be null if the integration event is
     *        not valid without an already existing chat contact.
     */

    public void setInitialContactId(String initialContactId) {
        this.initialContactId = initialContactId;
    }

    /**
     * <p>
     * Identifier of chat contact used to handle integration event. This may be null if the integration event is not
     * valid without an already existing chat contact.
     * </p>
     * 
     * @return Identifier of chat contact used to handle integration event. This may be null if the integration event is
     *         not valid without an already existing chat contact.
     */

    public String getInitialContactId() {
        return this.initialContactId;
    }

    /**
     * <p>
     * Identifier of chat contact used to handle integration event. This may be null if the integration event is not
     * valid without an already existing chat contact.
     * </p>
     * 
     * @param initialContactId
     *        Identifier of chat contact used to handle integration event. This may be null if the integration event is
     *        not valid without an already existing chat contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChatIntegrationEventResult withInitialContactId(String initialContactId) {
        setInitialContactId(initialContactId);
        return this;
    }

    /**
     * <p>
     * Whether handling the integration event resulted in creating a new chat or acting on existing chat.
     * </p>
     * 
     * @param newChatCreated
     *        Whether handling the integration event resulted in creating a new chat or acting on existing chat.
     */

    public void setNewChatCreated(Boolean newChatCreated) {
        this.newChatCreated = newChatCreated;
    }

    /**
     * <p>
     * Whether handling the integration event resulted in creating a new chat or acting on existing chat.
     * </p>
     * 
     * @return Whether handling the integration event resulted in creating a new chat or acting on existing chat.
     */

    public Boolean getNewChatCreated() {
        return this.newChatCreated;
    }

    /**
     * <p>
     * Whether handling the integration event resulted in creating a new chat or acting on existing chat.
     * </p>
     * 
     * @param newChatCreated
     *        Whether handling the integration event resulted in creating a new chat or acting on existing chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendChatIntegrationEventResult withNewChatCreated(Boolean newChatCreated) {
        setNewChatCreated(newChatCreated);
        return this;
    }

    /**
     * <p>
     * Whether handling the integration event resulted in creating a new chat or acting on existing chat.
     * </p>
     * 
     * @return Whether handling the integration event resulted in creating a new chat or acting on existing chat.
     */

    public Boolean isNewChatCreated() {
        return this.newChatCreated;
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
        if (getInitialContactId() != null)
            sb.append("InitialContactId: ").append(getInitialContactId()).append(",");
        if (getNewChatCreated() != null)
            sb.append("NewChatCreated: ").append(getNewChatCreated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendChatIntegrationEventResult == false)
            return false;
        SendChatIntegrationEventResult other = (SendChatIntegrationEventResult) obj;
        if (other.getInitialContactId() == null ^ this.getInitialContactId() == null)
            return false;
        if (other.getInitialContactId() != null && other.getInitialContactId().equals(this.getInitialContactId()) == false)
            return false;
        if (other.getNewChatCreated() == null ^ this.getNewChatCreated() == null)
            return false;
        if (other.getNewChatCreated() != null && other.getNewChatCreated().equals(this.getNewChatCreated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialContactId() == null) ? 0 : getInitialContactId().hashCode());
        hashCode = prime * hashCode + ((getNewChatCreated() == null) ? 0 : getNewChatCreated().hashCode());
        return hashCode;
    }

    @Override
    public SendChatIntegrationEventResult clone() {
        try {
            return (SendChatIntegrationEventResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
