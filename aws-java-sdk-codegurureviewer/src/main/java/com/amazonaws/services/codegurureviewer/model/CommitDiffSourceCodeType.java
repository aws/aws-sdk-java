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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A type of <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
 * <code>SourceCodeType</code> </a> that specifies the commit diff for a pull request on an associated repository.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/CommitDiffSourceCodeType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommitDiffSourceCodeType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SHA of the source commit used to generate a commit diff.
     * </p>
     */
    private String sourceCommit;
    /**
     * <p>
     * The SHA of the destination commit used to generate a commit diff.
     * </p>
     */
    private String destinationCommit;

    /**
     * <p>
     * The SHA of the source commit used to generate a commit diff.
     * </p>
     * 
     * @param sourceCommit
     *        The SHA of the source commit used to generate a commit diff.
     */

    public void setSourceCommit(String sourceCommit) {
        this.sourceCommit = sourceCommit;
    }

    /**
     * <p>
     * The SHA of the source commit used to generate a commit diff.
     * </p>
     * 
     * @return The SHA of the source commit used to generate a commit diff.
     */

    public String getSourceCommit() {
        return this.sourceCommit;
    }

    /**
     * <p>
     * The SHA of the source commit used to generate a commit diff.
     * </p>
     * 
     * @param sourceCommit
     *        The SHA of the source commit used to generate a commit diff.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitDiffSourceCodeType withSourceCommit(String sourceCommit) {
        setSourceCommit(sourceCommit);
        return this;
    }

    /**
     * <p>
     * The SHA of the destination commit used to generate a commit diff.
     * </p>
     * 
     * @param destinationCommit
     *        The SHA of the destination commit used to generate a commit diff.
     */

    public void setDestinationCommit(String destinationCommit) {
        this.destinationCommit = destinationCommit;
    }

    /**
     * <p>
     * The SHA of the destination commit used to generate a commit diff.
     * </p>
     * 
     * @return The SHA of the destination commit used to generate a commit diff.
     */

    public String getDestinationCommit() {
        return this.destinationCommit;
    }

    /**
     * <p>
     * The SHA of the destination commit used to generate a commit diff.
     * </p>
     * 
     * @param destinationCommit
     *        The SHA of the destination commit used to generate a commit diff.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CommitDiffSourceCodeType withDestinationCommit(String destinationCommit) {
        setDestinationCommit(destinationCommit);
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
            sb.append("DestinationCommit: ").append(getDestinationCommit());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceCommit() == null) ? 0 : getSourceCommit().hashCode());
        hashCode = prime * hashCode + ((getDestinationCommit() == null) ? 0 : getDestinationCommit().hashCode());
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
