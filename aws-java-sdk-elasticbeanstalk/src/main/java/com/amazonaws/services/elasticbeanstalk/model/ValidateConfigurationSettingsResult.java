/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Provides a list of validation messages.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ValidateConfigurationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateConfigurationSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list of <a>ValidationMessage</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ValidationMessage> messages;

    /**
     * <p>
     * A list of <a>ValidationMessage</a>.
     * </p>
     * 
     * @return A list of <a>ValidationMessage</a>.
     */

    public java.util.List<ValidationMessage> getMessages() {
        if (messages == null) {
            messages = new com.amazonaws.internal.SdkInternalList<ValidationMessage>();
        }
        return messages;
    }

    /**
     * <p>
     * A list of <a>ValidationMessage</a>.
     * </p>
     * 
     * @param messages
     *        A list of <a>ValidationMessage</a>.
     */

    public void setMessages(java.util.Collection<ValidationMessage> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new com.amazonaws.internal.SdkInternalList<ValidationMessage>(messages);
    }

    /**
     * <p>
     * A list of <a>ValidationMessage</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        A list of <a>ValidationMessage</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateConfigurationSettingsResult withMessages(ValidationMessage... messages) {
        if (this.messages == null) {
            setMessages(new com.amazonaws.internal.SdkInternalList<ValidationMessage>(messages.length));
        }
        for (ValidationMessage ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>ValidationMessage</a>.
     * </p>
     * 
     * @param messages
     *        A list of <a>ValidationMessage</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateConfigurationSettingsResult withMessages(java.util.Collection<ValidationMessage> messages) {
        setMessages(messages);
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
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateConfigurationSettingsResult == false)
            return false;
        ValidateConfigurationSettingsResult other = (ValidateConfigurationSettingsResult) obj;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        return hashCode;
    }

    @Override
    public ValidateConfigurationSettingsResult clone() {
        try {
            return (ValidateConfigurationSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
