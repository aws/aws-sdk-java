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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/RetrieveAndGenerate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveAndGenerateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of segments of the generated response that are based on sources in the knowledge base, alongside
     * information about the sources.
     * </p>
     */
    private java.util.List<Citation> citations;
    /**
     * <p>
     * Specifies if there is a guardrail intervention in the response.
     * </p>
     */
    private String guardrailAction;
    /**
     * <p>
     * Contains the response generated from querying the knowledge base.
     * </p>
     */
    private RetrieveAndGenerateOutput output;
    /**
     * <p>
     * The unique identifier of the session. Reuse the same value to continue the same session with the knowledge base.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * A list of segments of the generated response that are based on sources in the knowledge base, alongside
     * information about the sources.
     * </p>
     * 
     * @return A list of segments of the generated response that are based on sources in the knowledge base, alongside
     *         information about the sources.
     */

    public java.util.List<Citation> getCitations() {
        return citations;
    }

    /**
     * <p>
     * A list of segments of the generated response that are based on sources in the knowledge base, alongside
     * information about the sources.
     * </p>
     * 
     * @param citations
     *        A list of segments of the generated response that are based on sources in the knowledge base, alongside
     *        information about the sources.
     */

    public void setCitations(java.util.Collection<Citation> citations) {
        if (citations == null) {
            this.citations = null;
            return;
        }

        this.citations = new java.util.ArrayList<Citation>(citations);
    }

    /**
     * <p>
     * A list of segments of the generated response that are based on sources in the knowledge base, alongside
     * information about the sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCitations(java.util.Collection)} or {@link #withCitations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param citations
     *        A list of segments of the generated response that are based on sources in the knowledge base, alongside
     *        information about the sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveAndGenerateResult withCitations(Citation... citations) {
        if (this.citations == null) {
            setCitations(new java.util.ArrayList<Citation>(citations.length));
        }
        for (Citation ele : citations) {
            this.citations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of segments of the generated response that are based on sources in the knowledge base, alongside
     * information about the sources.
     * </p>
     * 
     * @param citations
     *        A list of segments of the generated response that are based on sources in the knowledge base, alongside
     *        information about the sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveAndGenerateResult withCitations(java.util.Collection<Citation> citations) {
        setCitations(citations);
        return this;
    }

    /**
     * <p>
     * Specifies if there is a guardrail intervention in the response.
     * </p>
     * 
     * @param guardrailAction
     *        Specifies if there is a guardrail intervention in the response.
     * @see GuadrailAction
     */

    public void setGuardrailAction(String guardrailAction) {
        this.guardrailAction = guardrailAction;
    }

    /**
     * <p>
     * Specifies if there is a guardrail intervention in the response.
     * </p>
     * 
     * @return Specifies if there is a guardrail intervention in the response.
     * @see GuadrailAction
     */

    public String getGuardrailAction() {
        return this.guardrailAction;
    }

    /**
     * <p>
     * Specifies if there is a guardrail intervention in the response.
     * </p>
     * 
     * @param guardrailAction
     *        Specifies if there is a guardrail intervention in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuadrailAction
     */

    public RetrieveAndGenerateResult withGuardrailAction(String guardrailAction) {
        setGuardrailAction(guardrailAction);
        return this;
    }

    /**
     * <p>
     * Specifies if there is a guardrail intervention in the response.
     * </p>
     * 
     * @param guardrailAction
     *        Specifies if there is a guardrail intervention in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GuadrailAction
     */

    public RetrieveAndGenerateResult withGuardrailAction(GuadrailAction guardrailAction) {
        this.guardrailAction = guardrailAction.toString();
        return this;
    }

    /**
     * <p>
     * Contains the response generated from querying the knowledge base.
     * </p>
     * 
     * @param output
     *        Contains the response generated from querying the knowledge base.
     */

    public void setOutput(RetrieveAndGenerateOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * Contains the response generated from querying the knowledge base.
     * </p>
     * 
     * @return Contains the response generated from querying the knowledge base.
     */

    public RetrieveAndGenerateOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * Contains the response generated from querying the knowledge base.
     * </p>
     * 
     * @param output
     *        Contains the response generated from querying the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveAndGenerateResult withOutput(RetrieveAndGenerateOutput output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the session. Reuse the same value to continue the same session with the knowledge base.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier of the session. Reuse the same value to continue the same session with the knowledge
     *        base.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The unique identifier of the session. Reuse the same value to continue the same session with the knowledge base.
     * </p>
     * 
     * @return The unique identifier of the session. Reuse the same value to continue the same session with the
     *         knowledge base.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The unique identifier of the session. Reuse the same value to continue the same session with the knowledge base.
     * </p>
     * 
     * @param sessionId
     *        The unique identifier of the session. Reuse the same value to continue the same session with the knowledge
     *        base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveAndGenerateResult withSessionId(String sessionId) {
        setSessionId(sessionId);
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
        if (getCitations() != null)
            sb.append("Citations: ").append(getCitations()).append(",");
        if (getGuardrailAction() != null)
            sb.append("GuardrailAction: ").append(getGuardrailAction()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append("***Sensitive Data Redacted***").append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveAndGenerateResult == false)
            return false;
        RetrieveAndGenerateResult other = (RetrieveAndGenerateResult) obj;
        if (other.getCitations() == null ^ this.getCitations() == null)
            return false;
        if (other.getCitations() != null && other.getCitations().equals(this.getCitations()) == false)
            return false;
        if (other.getGuardrailAction() == null ^ this.getGuardrailAction() == null)
            return false;
        if (other.getGuardrailAction() != null && other.getGuardrailAction().equals(this.getGuardrailAction()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCitations() == null) ? 0 : getCitations().hashCode());
        hashCode = prime * hashCode + ((getGuardrailAction() == null) ? 0 : getGuardrailAction().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public RetrieveAndGenerateResult clone() {
        try {
            return (RetrieveAndGenerateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
