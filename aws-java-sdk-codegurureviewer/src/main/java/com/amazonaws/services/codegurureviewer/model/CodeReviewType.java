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
 * The type of a code review. There are two code review types:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>PullRequest</code> - A code review that is automatically triggered by a pull request on an assocaited
 * repository. Because this type of code review is automatically generated, you cannot specify this code review type
 * using <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
 * <code>CreateCodeReview</code> </a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RepositoryAnalysis</code> - A code review that analyzes all code under a specified branch in an associated
 * respository. The assocated repository is specified using its ARN in <a
 * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview"> <code>CreateCodeReview</code>
 * </a>.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/CodeReviewType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeReviewType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A code review that analyzes all code under a specified branch in an associated respository. The assocated
     * repository is specified using its ARN in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     * <code>CreateCodeReview</code> </a>
     * </p>
     */
    private RepositoryAnalysis repositoryAnalysis;

    /**
     * <p>
     * A code review that analyzes all code under a specified branch in an associated respository. The assocated
     * repository is specified using its ARN in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     * <code>CreateCodeReview</code> </a>
     * </p>
     * 
     * @param repositoryAnalysis
     *        A code review that analyzes all code under a specified branch in an associated respository. The assocated
     *        repository is specified using its ARN in <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     *        <code>CreateCodeReview</code> </a>
     */

    public void setRepositoryAnalysis(RepositoryAnalysis repositoryAnalysis) {
        this.repositoryAnalysis = repositoryAnalysis;
    }

    /**
     * <p>
     * A code review that analyzes all code under a specified branch in an associated respository. The assocated
     * repository is specified using its ARN in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     * <code>CreateCodeReview</code> </a>
     * </p>
     * 
     * @return A code review that analyzes all code under a specified branch in an associated respository. The assocated
     *         repository is specified using its ARN in <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     *         <code>CreateCodeReview</code> </a>
     */

    public RepositoryAnalysis getRepositoryAnalysis() {
        return this.repositoryAnalysis;
    }

    /**
     * <p>
     * A code review that analyzes all code under a specified branch in an associated respository. The assocated
     * repository is specified using its ARN in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     * <code>CreateCodeReview</code> </a>
     * </p>
     * 
     * @param repositoryAnalysis
     *        A code review that analyzes all code under a specified branch in an associated respository. The assocated
     *        repository is specified using its ARN in <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     *        <code>CreateCodeReview</code> </a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeReviewType withRepositoryAnalysis(RepositoryAnalysis repositoryAnalysis) {
        setRepositoryAnalysis(repositoryAnalysis);
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
        if (getRepositoryAnalysis() != null)
            sb.append("RepositoryAnalysis: ").append(getRepositoryAnalysis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeReviewType == false)
            return false;
        CodeReviewType other = (CodeReviewType) obj;
        if (other.getRepositoryAnalysis() == null ^ this.getRepositoryAnalysis() == null)
            return false;
        if (other.getRepositoryAnalysis() != null && other.getRepositoryAnalysis().equals(this.getRepositoryAnalysis()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryAnalysis() == null) ? 0 : getRepositoryAnalysis().hashCode());
        return hashCode;
    }

    @Override
    public CodeReviewType clone() {
        try {
            return (CodeReviewType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.CodeReviewTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
