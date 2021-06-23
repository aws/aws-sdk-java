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
 * The type of a code review. There are two code review types:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>PullRequest</code> - A code review that is automatically triggered by a pull request on an associated
 * repository.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RepositoryAnalysis</code> - A code review that analyzes all code under a specified branch in an associated
 * repository. The associated repository is specified using its ARN in <a
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
     * A code review that analyzes all code under a specified branch in an associated repository. The associated
     * repository is specified using its ARN in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     * <code>CreateCodeReview</code> </a>.
     * </p>
     */
    private RepositoryAnalysis repositoryAnalysis;
    /**
     * <p>
     * They types of analysis performed during a repository analysis or a pull request review. You can specify either
     * <code>Security</code>, <code>CodeQuality</code>, or both.
     * </p>
     */
    private java.util.List<String> analysisTypes;

    /**
     * <p>
     * A code review that analyzes all code under a specified branch in an associated repository. The associated
     * repository is specified using its ARN in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     * <code>CreateCodeReview</code> </a>.
     * </p>
     * 
     * @param repositoryAnalysis
     *        A code review that analyzes all code under a specified branch in an associated repository. The associated
     *        repository is specified using its ARN in <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     *        <code>CreateCodeReview</code> </a>.
     */

    public void setRepositoryAnalysis(RepositoryAnalysis repositoryAnalysis) {
        this.repositoryAnalysis = repositoryAnalysis;
    }

    /**
     * <p>
     * A code review that analyzes all code under a specified branch in an associated repository. The associated
     * repository is specified using its ARN in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     * <code>CreateCodeReview</code> </a>.
     * </p>
     * 
     * @return A code review that analyzes all code under a specified branch in an associated repository. The associated
     *         repository is specified using its ARN in <a
     *         href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     *         <code>CreateCodeReview</code> </a>.
     */

    public RepositoryAnalysis getRepositoryAnalysis() {
        return this.repositoryAnalysis;
    }

    /**
     * <p>
     * A code review that analyzes all code under a specified branch in an associated repository. The associated
     * repository is specified using its ARN in <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     * <code>CreateCodeReview</code> </a>.
     * </p>
     * 
     * @param repositoryAnalysis
     *        A code review that analyzes all code under a specified branch in an associated repository. The associated
     *        repository is specified using its ARN in <a
     *        href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CreateCodeReview">
     *        <code>CreateCodeReview</code> </a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeReviewType withRepositoryAnalysis(RepositoryAnalysis repositoryAnalysis) {
        setRepositoryAnalysis(repositoryAnalysis);
        return this;
    }

    /**
     * <p>
     * They types of analysis performed during a repository analysis or a pull request review. You can specify either
     * <code>Security</code>, <code>CodeQuality</code>, or both.
     * </p>
     * 
     * @return They types of analysis performed during a repository analysis or a pull request review. You can specify
     *         either <code>Security</code>, <code>CodeQuality</code>, or both.
     * @see AnalysisType
     */

    public java.util.List<String> getAnalysisTypes() {
        return analysisTypes;
    }

    /**
     * <p>
     * They types of analysis performed during a repository analysis or a pull request review. You can specify either
     * <code>Security</code>, <code>CodeQuality</code>, or both.
     * </p>
     * 
     * @param analysisTypes
     *        They types of analysis performed during a repository analysis or a pull request review. You can specify
     *        either <code>Security</code>, <code>CodeQuality</code>, or both.
     * @see AnalysisType
     */

    public void setAnalysisTypes(java.util.Collection<String> analysisTypes) {
        if (analysisTypes == null) {
            this.analysisTypes = null;
            return;
        }

        this.analysisTypes = new java.util.ArrayList<String>(analysisTypes);
    }

    /**
     * <p>
     * They types of analysis performed during a repository analysis or a pull request review. You can specify either
     * <code>Security</code>, <code>CodeQuality</code>, or both.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnalysisTypes(java.util.Collection)} or {@link #withAnalysisTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param analysisTypes
     *        They types of analysis performed during a repository analysis or a pull request review. You can specify
     *        either <code>Security</code>, <code>CodeQuality</code>, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public CodeReviewType withAnalysisTypes(String... analysisTypes) {
        if (this.analysisTypes == null) {
            setAnalysisTypes(new java.util.ArrayList<String>(analysisTypes.length));
        }
        for (String ele : analysisTypes) {
            this.analysisTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * They types of analysis performed during a repository analysis or a pull request review. You can specify either
     * <code>Security</code>, <code>CodeQuality</code>, or both.
     * </p>
     * 
     * @param analysisTypes
     *        They types of analysis performed during a repository analysis or a pull request review. You can specify
     *        either <code>Security</code>, <code>CodeQuality</code>, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public CodeReviewType withAnalysisTypes(java.util.Collection<String> analysisTypes) {
        setAnalysisTypes(analysisTypes);
        return this;
    }

    /**
     * <p>
     * They types of analysis performed during a repository analysis or a pull request review. You can specify either
     * <code>Security</code>, <code>CodeQuality</code>, or both.
     * </p>
     * 
     * @param analysisTypes
     *        They types of analysis performed during a repository analysis or a pull request review. You can specify
     *        either <code>Security</code>, <code>CodeQuality</code>, or both.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisType
     */

    public CodeReviewType withAnalysisTypes(AnalysisType... analysisTypes) {
        java.util.ArrayList<String> analysisTypesCopy = new java.util.ArrayList<String>(analysisTypes.length);
        for (AnalysisType value : analysisTypes) {
            analysisTypesCopy.add(value.toString());
        }
        if (getAnalysisTypes() == null) {
            setAnalysisTypes(analysisTypesCopy);
        } else {
            getAnalysisTypes().addAll(analysisTypesCopy);
        }
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
            sb.append("RepositoryAnalysis: ").append(getRepositoryAnalysis()).append(",");
        if (getAnalysisTypes() != null)
            sb.append("AnalysisTypes: ").append(getAnalysisTypes());
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
        if (other.getAnalysisTypes() == null ^ this.getAnalysisTypes() == null)
            return false;
        if (other.getAnalysisTypes() != null && other.getAnalysisTypes().equals(this.getAnalysisTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryAnalysis() == null) ? 0 : getRepositoryAnalysis().hashCode());
        hashCode = prime * hashCode + ((getAnalysisTypes() == null) ? 0 : getAnalysisTypes().hashCode());
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
