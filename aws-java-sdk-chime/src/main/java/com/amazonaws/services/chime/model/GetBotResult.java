/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetBot" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The chat bot details.
     * </p>
     */
    private Bot bot;

    /**
     * <p>
     * The chat bot details.
     * </p>
     * 
     * @param bot
     *        The chat bot details.
     */

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    /**
     * <p>
     * The chat bot details.
     * </p>
     * 
     * @return The chat bot details.
     */

    public Bot getBot() {
        return this.bot;
    }

    /**
     * <p>
     * The chat bot details.
     * </p>
     * 
     * @param bot
     *        The chat bot details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotResult withBot(Bot bot) {
        setBot(bot);
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
        if (getBot() != null)
            sb.append("Bot: ").append(getBot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBotResult == false)
            return false;
        GetBotResult other = (GetBotResult) obj;
        if (other.getBot() == null ^ this.getBot() == null)
            return false;
        if (other.getBot() != null && other.getBot().equals(this.getBot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBot() == null) ? 0 : getBot().hashCode());
        return hashCode;
    }

    @Override
    public GetBotResult clone() {
        try {
            return (GetBotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
