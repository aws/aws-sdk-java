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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the details of a merge hunk that contains a conflict in a merge or pull request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/MergeHunkDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MergeHunkDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start position of the hunk in the merge result.
     * </p>
     */
    private Integer startLine;
    /**
     * <p>
     * The end position of the hunk in the merge result.
     * </p>
     */
    private Integer endLine;
    /**
     * <p>
     * The base-64 encoded content of the hunk merged region that might contain a conflict.
     * </p>
     */
    private String hunkContent;

    /**
     * <p>
     * The start position of the hunk in the merge result.
     * </p>
     * 
     * @param startLine
     *        The start position of the hunk in the merge result.
     */

    public void setStartLine(Integer startLine) {
        this.startLine = startLine;
    }

    /**
     * <p>
     * The start position of the hunk in the merge result.
     * </p>
     * 
     * @return The start position of the hunk in the merge result.
     */

    public Integer getStartLine() {
        return this.startLine;
    }

    /**
     * <p>
     * The start position of the hunk in the merge result.
     * </p>
     * 
     * @param startLine
     *        The start position of the hunk in the merge result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeHunkDetail withStartLine(Integer startLine) {
        setStartLine(startLine);
        return this;
    }

    /**
     * <p>
     * The end position of the hunk in the merge result.
     * </p>
     * 
     * @param endLine
     *        The end position of the hunk in the merge result.
     */

    public void setEndLine(Integer endLine) {
        this.endLine = endLine;
    }

    /**
     * <p>
     * The end position of the hunk in the merge result.
     * </p>
     * 
     * @return The end position of the hunk in the merge result.
     */

    public Integer getEndLine() {
        return this.endLine;
    }

    /**
     * <p>
     * The end position of the hunk in the merge result.
     * </p>
     * 
     * @param endLine
     *        The end position of the hunk in the merge result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeHunkDetail withEndLine(Integer endLine) {
        setEndLine(endLine);
        return this;
    }

    /**
     * <p>
     * The base-64 encoded content of the hunk merged region that might contain a conflict.
     * </p>
     * 
     * @param hunkContent
     *        The base-64 encoded content of the hunk merged region that might contain a conflict.
     */

    public void setHunkContent(String hunkContent) {
        this.hunkContent = hunkContent;
    }

    /**
     * <p>
     * The base-64 encoded content of the hunk merged region that might contain a conflict.
     * </p>
     * 
     * @return The base-64 encoded content of the hunk merged region that might contain a conflict.
     */

    public String getHunkContent() {
        return this.hunkContent;
    }

    /**
     * <p>
     * The base-64 encoded content of the hunk merged region that might contain a conflict.
     * </p>
     * 
     * @param hunkContent
     *        The base-64 encoded content of the hunk merged region that might contain a conflict.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MergeHunkDetail withHunkContent(String hunkContent) {
        setHunkContent(hunkContent);
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
        if (getStartLine() != null)
            sb.append("StartLine: ").append(getStartLine()).append(",");
        if (getEndLine() != null)
            sb.append("EndLine: ").append(getEndLine()).append(",");
        if (getHunkContent() != null)
            sb.append("HunkContent: ").append(getHunkContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeHunkDetail == false)
            return false;
        MergeHunkDetail other = (MergeHunkDetail) obj;
        if (other.getStartLine() == null ^ this.getStartLine() == null)
            return false;
        if (other.getStartLine() != null && other.getStartLine().equals(this.getStartLine()) == false)
            return false;
        if (other.getEndLine() == null ^ this.getEndLine() == null)
            return false;
        if (other.getEndLine() != null && other.getEndLine().equals(this.getEndLine()) == false)
            return false;
        if (other.getHunkContent() == null ^ this.getHunkContent() == null)
            return false;
        if (other.getHunkContent() != null && other.getHunkContent().equals(this.getHunkContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartLine() == null) ? 0 : getStartLine().hashCode());
        hashCode = prime * hashCode + ((getEndLine() == null) ? 0 : getEndLine().hashCode());
        hashCode = prime * hashCode + ((getHunkContent() == null) ? 0 : getHunkContent().hashCode());
        return hashCode;
    }

    @Override
    public MergeHunkDetail clone() {
        try {
            return (MergeHunkDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.MergeHunkDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
