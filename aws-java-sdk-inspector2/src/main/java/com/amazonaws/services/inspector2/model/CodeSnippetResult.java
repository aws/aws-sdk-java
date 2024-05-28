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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on a code snippet retrieved by Amazon Inspector from a code vulnerability finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CodeSnippetResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeSnippetResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains information on the retrieved code snippet.
     * </p>
     */
    private java.util.List<CodeLine> codeSnippet;
    /**
     * <p>
     * The line number of the last line of a code snippet.
     * </p>
     */
    private Integer endLine;
    /**
     * <p>
     * The ARN of a finding that the code snippet is associated with.
     * </p>
     */
    private String findingArn;
    /**
     * <p>
     * The line number of the first line of a code snippet.
     * </p>
     */
    private Integer startLine;
    /**
     * <p>
     * Details of a suggested code fix.
     * </p>
     */
    private java.util.List<SuggestedFix> suggestedFixes;

    /**
     * <p>
     * Contains information on the retrieved code snippet.
     * </p>
     * 
     * @return Contains information on the retrieved code snippet.
     */

    public java.util.List<CodeLine> getCodeSnippet() {
        return codeSnippet;
    }

    /**
     * <p>
     * Contains information on the retrieved code snippet.
     * </p>
     * 
     * @param codeSnippet
     *        Contains information on the retrieved code snippet.
     */

    public void setCodeSnippet(java.util.Collection<CodeLine> codeSnippet) {
        if (codeSnippet == null) {
            this.codeSnippet = null;
            return;
        }

        this.codeSnippet = new java.util.ArrayList<CodeLine>(codeSnippet);
    }

    /**
     * <p>
     * Contains information on the retrieved code snippet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCodeSnippet(java.util.Collection)} or {@link #withCodeSnippet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param codeSnippet
     *        Contains information on the retrieved code snippet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSnippetResult withCodeSnippet(CodeLine... codeSnippet) {
        if (this.codeSnippet == null) {
            setCodeSnippet(new java.util.ArrayList<CodeLine>(codeSnippet.length));
        }
        for (CodeLine ele : codeSnippet) {
            this.codeSnippet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information on the retrieved code snippet.
     * </p>
     * 
     * @param codeSnippet
     *        Contains information on the retrieved code snippet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSnippetResult withCodeSnippet(java.util.Collection<CodeLine> codeSnippet) {
        setCodeSnippet(codeSnippet);
        return this;
    }

    /**
     * <p>
     * The line number of the last line of a code snippet.
     * </p>
     * 
     * @param endLine
     *        The line number of the last line of a code snippet.
     */

    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * <p>
     * The line number of the last line of a code snippet.
     * </p>
     * 
     * @return The line number of the last line of a code snippet.
     */

    public Integer getEndLine() {
        return this.endLine;
    }

    /**
     * <p>
     * The line number of the last line of a code snippet.
     * </p>
     * 
     * @param endLine
     *        The line number of the last line of a code snippet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSnippetResult withEndLine(Integer endLine) {
        setEndLine(endLine);
        return this;
    }

    /**
     * <p>
     * The ARN of a finding that the code snippet is associated with.
     * </p>
     * 
     * @param findingArn
     *        The ARN of a finding that the code snippet is associated with.
     */

    public void setFindingArn(String findingArn) {
        this.findingArn = findingArn;
    }

    /**
     * <p>
     * The ARN of a finding that the code snippet is associated with.
     * </p>
     * 
     * @return The ARN of a finding that the code snippet is associated with.
     */

    public String getFindingArn() {
        return this.findingArn;
    }

    /**
     * <p>
     * The ARN of a finding that the code snippet is associated with.
     * </p>
     * 
     * @param findingArn
     *        The ARN of a finding that the code snippet is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSnippetResult withFindingArn(String findingArn) {
        setFindingArn(findingArn);
        return this;
    }

    /**
     * <p>
     * The line number of the first line of a code snippet.
     * </p>
     * 
     * @param startLine
     *        The line number of the first line of a code snippet.
     */

    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    /**
     * <p>
     * The line number of the first line of a code snippet.
     * </p>
     * 
     * @return The line number of the first line of a code snippet.
     */

    public Integer getStartLine() {
        return this.startLine;
    }

    /**
     * <p>
     * The line number of the first line of a code snippet.
     * </p>
     * 
     * @param startLine
     *        The line number of the first line of a code snippet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSnippetResult withStartLine(Integer startLine) {
        setStartLine(startLine);
        return this;
    }

    /**
     * <p>
     * Details of a suggested code fix.
     * </p>
     * 
     * @return Details of a suggested code fix.
     */

    public java.util.List<SuggestedFix> getSuggestedFixes() {
        return suggestedFixes;
    }

    /**
     * <p>
     * Details of a suggested code fix.
     * </p>
     * 
     * @param suggestedFixes
     *        Details of a suggested code fix.
     */

    public void setSuggestedFixes(java.util.Collection<SuggestedFix> suggestedFixes) {
        if (suggestedFixes == null) {
            this.suggestedFixes = null;
            return;
        }

        this.suggestedFixes = new java.util.ArrayList<SuggestedFix>(suggestedFixes);
    }

    /**
     * <p>
     * Details of a suggested code fix.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuggestedFixes(java.util.Collection)} or {@link #withSuggestedFixes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param suggestedFixes
     *        Details of a suggested code fix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSnippetResult withSuggestedFixes(SuggestedFix... suggestedFixes) {
        if (this.suggestedFixes == null) {
            setSuggestedFixes(new java.util.ArrayList<SuggestedFix>(suggestedFixes.length));
        }
        for (SuggestedFix ele : suggestedFixes) {
            this.suggestedFixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of a suggested code fix.
     * </p>
     * 
     * @param suggestedFixes
     *        Details of a suggested code fix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSnippetResult withSuggestedFixes(java.util.Collection<SuggestedFix> suggestedFixes) {
        setSuggestedFixes(suggestedFixes);
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
        if (getCodeSnippet() != null)
            sb.append("CodeSnippet: ").append(getCodeSnippet()).append(",");
        if (getEndLine() != null)
            sb.append("EndLine: ").append(getEndLine()).append(",");
        if (getFindingArn() != null)
            sb.append("FindingArn: ").append(getFindingArn()).append(",");
        if (getStartLine() != null)
            sb.append("StartLine: ").append(getStartLine()).append(",");
        if (getSuggestedFixes() != null)
            sb.append("SuggestedFixes: ").append(getSuggestedFixes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeSnippetResult == false)
            return false;
        CodeSnippetResult other = (CodeSnippetResult) obj;
        if (other.getCodeSnippet() == null ^ this.getCodeSnippet() == null)
            return false;
        if (other.getCodeSnippet() != null && other.getCodeSnippet().equals(this.getCodeSnippet()) == false)
            return false;
        if (other.getEndLine() == null ^ this.getEndLine() == null)
            return false;
        if (other.getEndLine() != null && other.getEndLine().equals(this.getEndLine()) == false)
            return false;
        if (other.getFindingArn() == null ^ this.getFindingArn() == null)
            return false;
        if (other.getFindingArn() != null && other.getFindingArn().equals(this.getFindingArn()) == false)
            return false;
        if (other.getStartLine() == null ^ this.getStartLine() == null)
            return false;
        if (other.getStartLine() != null && other.getStartLine().equals(this.getStartLine()) == false)
            return false;
        if (other.getSuggestedFixes() == null ^ this.getSuggestedFixes() == null)
            return false;
        if (other.getSuggestedFixes() != null && other.getSuggestedFixes().equals(this.getSuggestedFixes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeSnippet() == null) ? 0 : getCodeSnippet().hashCode());
        hashCode = prime * hashCode + ((getEndLine() == null) ? 0 : getEndLine().hashCode());
        hashCode = prime * hashCode + ((getFindingArn() == null) ? 0 : getFindingArn().hashCode());
        hashCode = prime * hashCode + ((getStartLine() == null) ? 0 : getStartLine().hashCode());
        hashCode = prime * hashCode + ((getSuggestedFixes() == null) ? 0 : getSuggestedFixes().hashCode());
        return hashCode;
    }

    @Override
    public CodeSnippetResult clone() {
        try {
            return (CodeSnippetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CodeSnippetResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
