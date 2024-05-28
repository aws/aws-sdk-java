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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetCodeSnippet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCodeSnippetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The retrieved code snippets associated with the provided finding ARNs.
     * </p>
     */
    private java.util.List<CodeSnippetResult> codeSnippetResults;
    /**
     * <p>
     * Any errors Amazon Inspector encountered while trying to retrieve the requested code snippets.
     * </p>
     */
    private java.util.List<CodeSnippetError> errors;

    /**
     * <p>
     * The retrieved code snippets associated with the provided finding ARNs.
     * </p>
     * 
     * @return The retrieved code snippets associated with the provided finding ARNs.
     */

    public java.util.List<CodeSnippetResult> getCodeSnippetResults() {
        return codeSnippetResults;
    }

    /**
     * <p>
     * The retrieved code snippets associated with the provided finding ARNs.
     * </p>
     * 
     * @param codeSnippetResults
     *        The retrieved code snippets associated with the provided finding ARNs.
     */

    public void setCodeSnippetResults(java.util.Collection<CodeSnippetResult> codeSnippetResults) {
        if (codeSnippetResults == null) {
            this.codeSnippetResults = null;
            return;
        }

        this.codeSnippetResults = new java.util.ArrayList<CodeSnippetResult>(codeSnippetResults);
    }

    /**
     * <p>
     * The retrieved code snippets associated with the provided finding ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCodeSnippetResults(java.util.Collection)} or {@link #withCodeSnippetResults(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param codeSnippetResults
     *        The retrieved code snippets associated with the provided finding ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCodeSnippetResult withCodeSnippetResults(CodeSnippetResult... codeSnippetResults) {
        if (this.codeSnippetResults == null) {
            setCodeSnippetResults(new java.util.ArrayList<CodeSnippetResult>(codeSnippetResults.length));
        }
        for (CodeSnippetResult ele : codeSnippetResults) {
            this.codeSnippetResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The retrieved code snippets associated with the provided finding ARNs.
     * </p>
     * 
     * @param codeSnippetResults
     *        The retrieved code snippets associated with the provided finding ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCodeSnippetResult withCodeSnippetResults(java.util.Collection<CodeSnippetResult> codeSnippetResults) {
        setCodeSnippetResults(codeSnippetResults);
        return this;
    }

    /**
     * <p>
     * Any errors Amazon Inspector encountered while trying to retrieve the requested code snippets.
     * </p>
     * 
     * @return Any errors Amazon Inspector encountered while trying to retrieve the requested code snippets.
     */

    public java.util.List<CodeSnippetError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Any errors Amazon Inspector encountered while trying to retrieve the requested code snippets.
     * </p>
     * 
     * @param errors
     *        Any errors Amazon Inspector encountered while trying to retrieve the requested code snippets.
     */

    public void setErrors(java.util.Collection<CodeSnippetError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<CodeSnippetError>(errors);
    }

    /**
     * <p>
     * Any errors Amazon Inspector encountered while trying to retrieve the requested code snippets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Any errors Amazon Inspector encountered while trying to retrieve the requested code snippets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCodeSnippetResult withErrors(CodeSnippetError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<CodeSnippetError>(errors.length));
        }
        for (CodeSnippetError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any errors Amazon Inspector encountered while trying to retrieve the requested code snippets.
     * </p>
     * 
     * @param errors
     *        Any errors Amazon Inspector encountered while trying to retrieve the requested code snippets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCodeSnippetResult withErrors(java.util.Collection<CodeSnippetError> errors) {
        setErrors(errors);
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
        if (getCodeSnippetResults() != null)
            sb.append("CodeSnippetResults: ").append(getCodeSnippetResults()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCodeSnippetResult == false)
            return false;
        BatchGetCodeSnippetResult other = (BatchGetCodeSnippetResult) obj;
        if (other.getCodeSnippetResults() == null ^ this.getCodeSnippetResults() == null)
            return false;
        if (other.getCodeSnippetResults() != null && other.getCodeSnippetResults().equals(this.getCodeSnippetResults()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeSnippetResults() == null) ? 0 : getCodeSnippetResults().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCodeSnippetResult clone() {
        try {
            return (BatchGetCodeSnippetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
