/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
 * <code>SourceCodeType</code> </a> that specifies the commit diff for a pull request on an associated repository. The
 * <code>SourceCommit</code> and <code>DestinationCommit</code> fields are required to do a pull request code review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/CommitDiffSourceCodeType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommitDiffSourceCodeType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SHA of the source commit used to generate a commit diff. This field is required for a pull request code
     * review.
     * </p>
     */
    private String sourceCommit;
    /**
     * <p>
     * The SHA of the destination commit used to generate a commit diff. This field is required for a pull request code
     * review.
     * </p>
     */
    private String destinationCommit;
    /**
     * <p>
     * The SHA of the merge base of a commit.
     * </p>
     */
    private String mergeBaseCommit;

    /**
     * <p>
     * The SHA of the source commit used to generate a commit diff. This field is required for a pull request code
     * review.
     * </p>
     * 
     * @param sourceCommit
     *        The SHA of the source commit used to generate a commit diff. This field is required for a pull request
     *        code review.
     */

    public void setSourceCommit(String sourceCommit) {
        this.sourceCommit = sourceCommit;
    }

    /**
     * <p>
     * The SHA of the source commit used to generate a commit diff. This field is required for a pull request code
     * review.
     * </p>
     * 
     * @return The SHA of the source commit used to generate a commit diff. This field is required for a pull request
     *         code review.
     */

    public String getSourceCommit() {
        return this.sourceCommit;
    }

    /**
     * <p>
     * The SHA of the source commit used to generate a commit diff. This field is required for a pull request code
     * review.
     * </p>
     * 
     * @param sourceCommit
     *        The SHA of the source commit used to generate a commit diff. This field is required for a pull request
     *        code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitDiffSourceCodeType withSourceCommit(String sourceCommit) {
        setSourceCommit(sourceCommit);
        return this;
    }

    /**
     * <p>
     * The SHA of the destination commit used to generate a commit diff. This field is required for a pull request code
     * review.
     * </p>
     * 
     * @param destinationCommit
     *        The SHA of the destination commit used to generate a commit diff. This field is required for a pull
     *        request code review.
     */

    public void setDestinationCommit(String destinationCommit) {
        this.destinationCommit = destinationCommit;
    }

    /**
     * <p>
     * The SHA of the destination commit used to generate a commit diff. This field is required for a pull request code
     * review.
     * </p>
     * 
     * @return The SHA of the destination commit used to generate a commit diff. This field is required for a pull
     *         request code review.
     */

    public String getDestinationCommit() {
        return this.destinationCommit;
    }

    /**
     * <p>
     * The SHA of the destination commit used to generate a commit diff. This field is required for a pull request code
     * review.
     * </p>
     * 
     * @param destinationCommit
     *        The SHA of the destination commit used to generate a commit diff. This field is required for a pull
     *        request code review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitDiffSourceCodeType withDestinationCommit(String destinationCommit) {
        setDestinationCommit(destinationCommit);
        return this;
    }

    /**
     * <p>
     * The SHA of the merge base of a commit.
     * </p>
     * 
     * @param mergeBaseCommit
     *        The SHA of the merge base of a commit.
     */

    public void setMergeBaseCommit(String mergeBaseCommit) {
        this.mergeBaseCommit = mergeBaseCommit;
    }

    /**
     * <p>
     * The SHA of the merge base of a commit.
     * </p>
     * 
     * @return The SHA of the merge base of a commit.
     */

    public String getMergeBaseCommit() {
        return this.mergeBaseCommit;
    }

    /**
     * <p>
     * The SHA of the merge base of a commit.
     * </p>
     * 
     * @param mergeBaseCommit
     *        The SHA of the merge base of a commit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitDiffSourceCodeType withMergeBaseCommit(String mergeBaseCommit) {
        setMergeBaseCommit(mergeBaseCommit);
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
        if (getSourceCommit() != null)
            sb.append("SourceCommit: ").append(getSourceCommit()).append(",");
        if (getDestinationCommit() != null)
            sb.append("DestinationCommit: ").append(getDestinationCommit()).append(",");
        if (getMergeBaseCommit() != null)
            sb.append("MergeBaseCommit: ").append(getMergeBaseCommit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommitDiffSourceCodeType == false)
            return false;
        CommitDiffSourceCodeType other = (CommitDiffSourceCodeType) obj;
        if (other.getSourceCommit() == null ^ this.getSourceCommit() == null)
            return false;
        if (other.getSourceCommit() != null && other.getSourceCommit().equals(this.getSourceCommit()) == false)
            return false;
        if (other.getDestinationCommit() == null ^ this.getDestinationCommit() == null)
            return false;
        if (other.getDestinationCommit() != null && other.getDestinationCommit().equals(this.getDestinationCommit()) == false)
            return false;
        if (other.getMergeBaseCommit() == null ^ this.getMergeBaseCommit() == null)
            return false;
        if (other.getMergeBaseCommit() != null && other.getMergeBaseCommit().equals(this.getMergeBaseCommit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceCommit() == null) ? 0 : getSourceCommit().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommit() == null) ? 0 : getDestinationCommit().hashCode());
        hashCode = prime * hashCode + ((getMergeBaseCommit() == null) ? 0 : getMergeBaseCommit().hashCode());
        return hashCode;
    }

    @Override
    public CommitDiffSourceCodeType clone() {
        try {
            return (CommitDiffSourceCodeType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.CommitDiffSourceCodeTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
