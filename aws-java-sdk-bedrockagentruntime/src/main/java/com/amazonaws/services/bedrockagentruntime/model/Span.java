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
 * Contains information about where the text with a citation begins and ends in the generated output.
 * </p>
 * <p>
 * This data type is used in the following API operations:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_RetrieveAndGenerate.html#API_agent-runtime_RetrieveAndGenerate_ResponseSyntax"
 * >RetrieveAndGenerate response</a> – in the <code>span</code> field
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href=
 * "https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html#API_agent-runtime_InvokeAgent_ResponseSyntax"
 * >InvokeAgent response</a> – in the <code>span</code> field
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/Span" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Span implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Where the text with a citation ends in the generated output.
     * </p>
     */
    private Integer end;
    /**
     * <p>
     * Where the text with a citation starts in the generated output.
     * </p>
     */
    private Integer start;

    /**
     * <p>
     * Where the text with a citation ends in the generated output.
     * </p>
     * 
     * @param end
     *        Where the text with a citation ends in the generated output.
     */

    public void setEnd(Integer end) {
        this.end = end;
    }

    /**
     * <p>
     * Where the text with a citation ends in the generated output.
     * </p>
     * 
     * @return Where the text with a citation ends in the generated output.
     */

    public Integer getEnd() {
        return this.end;
    }

    /**
     * <p>
     * Where the text with a citation ends in the generated output.
     * </p>
     * 
     * @param end
     *        Where the text with a citation ends in the generated output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Span withEnd(Integer end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * Where the text with a citation starts in the generated output.
     * </p>
     * 
     * @param start
     *        Where the text with a citation starts in the generated output.
     */

    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * <p>
     * Where the text with a citation starts in the generated output.
     * </p>
     * 
     * @return Where the text with a citation starts in the generated output.
     */

    public Integer getStart() {
        return this.start;
    }

    /**
     * <p>
     * Where the text with a citation starts in the generated output.
     * </p>
     * 
     * @param start
     *        Where the text with a citation starts in the generated output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Span withStart(Integer start) {
        setStart(start);
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
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Span == false)
            return false;
        Span other = (Span) obj;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        return hashCode;
    }

    @Override
    public Span clone() {
        try {
            return (Span) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.SpanMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
