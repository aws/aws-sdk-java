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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing the intent that the bot mapped the utterance to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AnalyticsUtteranceAttributeResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsUtteranceAttributeResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The intent that the bot mapped the utterance to.
     * </p>
     */
    private String lastUsedIntent;

    /**
     * <p>
     * The intent that the bot mapped the utterance to.
     * </p>
     * 
     * @param lastUsedIntent
     *        The intent that the bot mapped the utterance to.
     */

    public void setLastUsedIntent(String lastUsedIntent) {
        this.lastUsedIntent = lastUsedIntent;
    }

    /**
     * <p>
     * The intent that the bot mapped the utterance to.
     * </p>
     * 
     * @return The intent that the bot mapped the utterance to.
     */

    public String getLastUsedIntent() {
        return this.lastUsedIntent;
    }

    /**
     * <p>
     * The intent that the bot mapped the utterance to.
     * </p>
     * 
     * @param lastUsedIntent
     *        The intent that the bot mapped the utterance to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsUtteranceAttributeResult withLastUsedIntent(String lastUsedIntent) {
        setLastUsedIntent(lastUsedIntent);
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
        if (getLastUsedIntent() != null)
            sb.append("LastUsedIntent: ").append(getLastUsedIntent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsUtteranceAttributeResult == false)
            return false;
        AnalyticsUtteranceAttributeResult other = (AnalyticsUtteranceAttributeResult) obj;
        if (other.getLastUsedIntent() == null ^ this.getLastUsedIntent() == null)
            return false;
        if (other.getLastUsedIntent() != null && other.getLastUsedIntent().equals(this.getLastUsedIntent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastUsedIntent() == null) ? 0 : getLastUsedIntent().hashCode());
        return hashCode;
    }

    @Override
    public AnalyticsUtteranceAttributeResult clone() {
        try {
            return (AnalyticsUtteranceAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AnalyticsUtteranceAttributeResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
