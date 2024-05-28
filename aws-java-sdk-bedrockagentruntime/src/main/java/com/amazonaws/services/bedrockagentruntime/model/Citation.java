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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing a segment of the generated response that is based on a source in the knowledge base, alongside
 * information about the source.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html#API_agent-runtime_InvokeAgent_ResponseSyntax"
 * >InvokeAgent response</a> – in the <code>citations</code> field
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_ResponseSyntax"
 * >RetrieveAndGenerate response</a> – in the <code>citations</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/Citation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Citation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the generated response and metadata
     * </p>
     */
    private GeneratedResponsePart generatedResponsePart;
    /**
     * <p>
     * Contains metadata about the sources cited for the generated response.
     * </p>
     */
    private java.util.List<RetrievedReference> retrievedReferences;

    /**
     * <p>
     * Contains the generated response and metadata
     * </p>
     * 
     * @param generatedResponsePart
     *        Contains the generated response and metadata
     */

    public void setGeneratedResponsePart(GeneratedResponsePart generatedResponsePart) {
        this.generatedResponsePart = generatedResponsePart;
    }

    /**
     * <p>
     * Contains the generated response and metadata
     * </p>
     * 
     * @return Contains the generated response and metadata
     */

    public GeneratedResponsePart getGeneratedResponsePart() {
        return this.generatedResponsePart;
    }

    /**
     * <p>
     * Contains the generated response and metadata
     * </p>
     * 
     * @param generatedResponsePart
     *        Contains the generated response and metadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Citation withGeneratedResponsePart(GeneratedResponsePart generatedResponsePart) {
        setGeneratedResponsePart(generatedResponsePart);
        return this;
    }

    /**
     * <p>
     * Contains metadata about the sources cited for the generated response.
     * </p>
     * 
     * @return Contains metadata about the sources cited for the generated response.
     */

    public java.util.List<RetrievedReference> getRetrievedReferences() {
        return retrievedReferences;
    }

    /**
     * <p>
     * Contains metadata about the sources cited for the generated response.
     * </p>
     * 
     * @param retrievedReferences
     *        Contains metadata about the sources cited for the generated response.
     */

    public void setRetrievedReferences(java.util.Collection<RetrievedReference> retrievedReferences) {
        if (retrievedReferences == null) {
            this.retrievedReferences = null;
            return;
        }

        this.retrievedReferences = new java.util.ArrayList<RetrievedReference>(retrievedReferences);
    }

    /**
     * <p>
     * Contains metadata about the sources cited for the generated response.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRetrievedReferences(java.util.Collection)} or {@link #withRetrievedReferences(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param retrievedReferences
     *        Contains metadata about the sources cited for the generated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Citation withRetrievedReferences(RetrievedReference... retrievedReferences) {
        if (this.retrievedReferences == null) {
            setRetrievedReferences(new java.util.ArrayList<RetrievedReference>(retrievedReferences.length));
        }
        for (RetrievedReference ele : retrievedReferences) {
            this.retrievedReferences.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains metadata about the sources cited for the generated response.
     * </p>
     * 
     * @param retrievedReferences
     *        Contains metadata about the sources cited for the generated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Citation withRetrievedReferences(java.util.Collection<RetrievedReference> retrievedReferences) {
        setRetrievedReferences(retrievedReferences);
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
        if (getGeneratedResponsePart() != null)
            sb.append("GeneratedResponsePart: ").append(getGeneratedResponsePart()).append(",");
        if (getRetrievedReferences() != null)
            sb.append("RetrievedReferences: ").append(getRetrievedReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Citation == false)
            return false;
        Citation other = (Citation) obj;
        if (other.getGeneratedResponsePart() == null ^ this.getGeneratedResponsePart() == null)
            return false;
        if (other.getGeneratedResponsePart() != null && other.getGeneratedResponsePart().equals(this.getGeneratedResponsePart()) == false)
            return false;
        if (other.getRetrievedReferences() == null ^ this.getRetrievedReferences() == null)
            return false;
        if (other.getRetrievedReferences() != null && other.getRetrievedReferences().equals(this.getRetrievedReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeneratedResponsePart() == null) ? 0 : getGeneratedResponsePart().hashCode());
        hashCode = prime * hashCode + ((getRetrievedReferences() == null) ? 0 : getRetrievedReferences().hashCode());
        return hashCode;
    }

    @Override
    public Citation clone() {
        try {
            return (Citation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.CitationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
