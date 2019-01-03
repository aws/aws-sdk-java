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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of calling the operation. The operation returns one object that is successfully processed by the
 * operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/BatchDetectSyntaxItemResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDetectSyntaxItemResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     */
    private Integer index;
    /**
     * <p>
     * The syntax tokens for the words in the document, one token for each word.
     * </p>
     */
    private java.util.List<SyntaxToken> syntaxTokens;

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of the document in the input list.
     */

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @return The zero-based index of the document in the input list.
     */

    public Integer getIndex() {
        return this.index;
    }

    /**
     * <p>
     * The zero-based index of the document in the input list.
     * </p>
     * 
     * @param index
     *        The zero-based index of the document in the input list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectSyntaxItemResult withIndex(Integer index) {
        setIndex(index);
        return this;
    }

    /**
     * <p>
     * The syntax tokens for the words in the document, one token for each word.
     * </p>
     * 
     * @return The syntax tokens for the words in the document, one token for each word.
     */

    public java.util.List<SyntaxToken> getSyntaxTokens() {
        return syntaxTokens;
    }

    /**
     * <p>
     * The syntax tokens for the words in the document, one token for each word.
     * </p>
     * 
     * @param syntaxTokens
     *        The syntax tokens for the words in the document, one token for each word.
     */

    public void setSyntaxTokens(java.util.Collection<SyntaxToken> syntaxTokens) {
        if (syntaxTokens == null) {
            this.syntaxTokens = null;
            return;
        }

        this.syntaxTokens = new java.util.ArrayList<SyntaxToken>(syntaxTokens);
    }

    /**
     * <p>
     * The syntax tokens for the words in the document, one token for each word.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSyntaxTokens(java.util.Collection)} or {@link #withSyntaxTokens(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param syntaxTokens
     *        The syntax tokens for the words in the document, one token for each word.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectSyntaxItemResult withSyntaxTokens(SyntaxToken... syntaxTokens) {
        if (this.syntaxTokens == null) {
            setSyntaxTokens(new java.util.ArrayList<SyntaxToken>(syntaxTokens.length));
        }
        for (SyntaxToken ele : syntaxTokens) {
            this.syntaxTokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The syntax tokens for the words in the document, one token for each word.
     * </p>
     * 
     * @param syntaxTokens
     *        The syntax tokens for the words in the document, one token for each word.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDetectSyntaxItemResult withSyntaxTokens(java.util.Collection<SyntaxToken> syntaxTokens) {
        setSyntaxTokens(syntaxTokens);
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
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
        if (getSyntaxTokens() != null)
            sb.append("SyntaxTokens: ").append(getSyntaxTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectSyntaxItemResult == false)
            return false;
        BatchDetectSyntaxItemResult other = (BatchDetectSyntaxItemResult) obj;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getSyntaxTokens() == null ^ this.getSyntaxTokens() == null)
            return false;
        if (other.getSyntaxTokens() != null && other.getSyntaxTokens().equals(this.getSyntaxTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getSyntaxTokens() == null) ? 0 : getSyntaxTokens().hashCode());
        return hashCode;
    }

    @Override
    public BatchDetectSyntaxItemResult clone() {
        try {
            return (BatchDetectSyntaxItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.BatchDetectSyntaxItemResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
