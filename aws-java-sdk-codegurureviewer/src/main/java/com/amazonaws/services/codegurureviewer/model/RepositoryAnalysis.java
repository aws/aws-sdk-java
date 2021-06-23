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
 * A code review type that analyzes all code under a specified branch in an associated repository. The associated
 * repository is specified using its ARN when you call <a
 * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview"> <code>CreateCodeReview</code>
 * </a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/RepositoryAnalysis"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RepositoryAnalysis implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies the tip of a branch in an associated repository.
     * </p>
     */
    private RepositoryHeadSourceCodeType repositoryHead;

    private SourceCodeType sourceCodeType;

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies the tip of a branch in an associated repository.
     * </p>
     * 
     * @param repositoryHead
     *        A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *        <code>SourceCodeType</code> </a> that specifies the tip of a branch in an associated repository.
     */

    public void setRepositoryHead(RepositoryHeadSourceCodeType repositoryHead) {
        this.repositoryHead = repositoryHead;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies the tip of a branch in an associated repository.
     * </p>
     * 
     * @return A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *         <code>SourceCodeType</code> </a> that specifies the tip of a branch in an associated repository.
     */

    public RepositoryHeadSourceCodeType getRepositoryHead() {
        return this.repositoryHead;
    }

    /**
     * <p>
     * A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     * <code>SourceCodeType</code> </a> that specifies the tip of a branch in an associated repository.
     * </p>
     * 
     * @param repositoryHead
     *        A <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_SourceCodeType">
     *        <code>SourceCodeType</code> </a> that specifies the tip of a branch in an associated repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAnalysis withRepositoryHead(RepositoryHeadSourceCodeType repositoryHead) {
        setRepositoryHead(repositoryHead);
        return this;
    }

    /**
     * @param sourceCodeType
     */

    public void setSourceCodeType(SourceCodeType sourceCodeType) {
        this.sourceCodeType = sourceCodeType;
    }

    /**
     * @return
     */

    public SourceCodeType getSourceCodeType() {
        return this.sourceCodeType;
    }

    /**
     * @param sourceCodeType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RepositoryAnalysis withSourceCodeType(SourceCodeType sourceCodeType) {
        setSourceCodeType(sourceCodeType);
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
        if (getRepositoryHead() != null)
            sb.append("RepositoryHead: ").append(getRepositoryHead()).append(",");
        if (getSourceCodeType() != null)
            sb.append("SourceCodeType: ").append(getSourceCodeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryAnalysis == false)
            return false;
        RepositoryAnalysis other = (RepositoryAnalysis) obj;
        if (other.getRepositoryHead() == null ^ this.getRepositoryHead() == null)
            return false;
        if (other.getRepositoryHead() != null && other.getRepositoryHead().equals(this.getRepositoryHead()) == false)
            return false;
        if (other.getSourceCodeType() == null ^ this.getSourceCodeType() == null)
            return false;
        if (other.getSourceCodeType() != null && other.getSourceCodeType().equals(this.getSourceCodeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryHead() == null) ? 0 : getRepositoryHead().hashCode());
        hashCode = prime * hashCode + ((getSourceCodeType() == null) ? 0 : getSourceCodeType().hashCode());
        return hashCode;
    }

    @Override
    public RepositoryAnalysis clone() {
        try {
            return (RepositoryAnalysis) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.RepositoryAnalysisMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
