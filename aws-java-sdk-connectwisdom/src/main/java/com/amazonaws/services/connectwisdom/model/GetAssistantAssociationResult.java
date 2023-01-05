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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/GetAssistantAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssistantAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The assistant association.
     * </p>
     */
    private AssistantAssociationData assistantAssociation;

    /**
     * <p>
     * The assistant association.
     * </p>
     * 
     * @param assistantAssociation
     *        The assistant association.
     */

    public void setAssistantAssociation(AssistantAssociationData assistantAssociation) {
        this.assistantAssociation = assistantAssociation;
    }

    /**
     * <p>
     * The assistant association.
     * </p>
     * 
     * @return The assistant association.
     */

    public AssistantAssociationData getAssistantAssociation() {
        return this.assistantAssociation;
    }

    /**
     * <p>
     * The assistant association.
     * </p>
     * 
     * @param assistantAssociation
     *        The assistant association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssistantAssociationResult withAssistantAssociation(AssistantAssociationData assistantAssociation) {
        setAssistantAssociation(assistantAssociation);
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
        if (getAssistantAssociation() != null)
            sb.append("AssistantAssociation: ").append(getAssistantAssociation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAssistantAssociationResult == false)
            return false;
        GetAssistantAssociationResult other = (GetAssistantAssociationResult) obj;
        if (other.getAssistantAssociation() == null ^ this.getAssistantAssociation() == null)
            return false;
        if (other.getAssistantAssociation() != null && other.getAssistantAssociation().equals(this.getAssistantAssociation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssistantAssociation() == null) ? 0 : getAssistantAssociation().hashCode());
        return hashCode;
    }

    @Override
    public GetAssistantAssociationResult clone() {
        try {
            return (GetAssistantAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
