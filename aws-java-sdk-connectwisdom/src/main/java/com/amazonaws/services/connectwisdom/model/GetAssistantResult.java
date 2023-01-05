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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetAssistant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssistantResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the assistant.
     * </p>
     */
    private AssistantData assistant;

    /**
     * <p>
     * Information about the assistant.
     * </p>
     * 
     * @param assistant
     *        Information about the assistant.
     */

    public void setAssistant(AssistantData assistant) {
        this.assistant = assistant;
    }

    /**
     * <p>
     * Information about the assistant.
     * </p>
     * 
     * @return Information about the assistant.
     */

    public AssistantData getAssistant() {
        return this.assistant;
    }

    /**
     * <p>
     * Information about the assistant.
     * </p>
     * 
     * @param assistant
     *        Information about the assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssistantResult withAssistant(AssistantData assistant) {
        setAssistant(assistant);
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
        if (getAssistant() != null)
            sb.append("Assistant: ").append(getAssistant());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssistantResult == false)
            return false;
        GetAssistantResult other = (GetAssistantResult) obj;
        if (other.getAssistant() == null ^ this.getAssistant() == null)
            return false;
        if (other.getAssistant() != null && other.getAssistant().equals(this.getAssistant()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssistant() == null) ? 0 : getAssistant().hashCode());
        return hashCode;
    }

    @Override
    public GetAssistantResult clone() {
        try {
            return (GetAssistantResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
