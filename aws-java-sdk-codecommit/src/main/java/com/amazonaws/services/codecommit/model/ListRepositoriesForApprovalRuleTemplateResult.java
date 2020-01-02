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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositoriesForApprovalRuleTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRepositoriesForApprovalRuleTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of repository names that are associated with the specified approval rule template.
     * </p>
     */
    private java.util.List<String> repositoryNames;
    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results of the operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of repository names that are associated with the specified approval rule template.
     * </p>
     * 
     * @return A list of repository names that are associated with the specified approval rule template.
     */

    public java.util.List<String> getRepositoryNames() {
        return repositoryNames;
    }

    /**
     * <p>
     * A list of repository names that are associated with the specified approval rule template.
     * </p>
     * 
     * @param repositoryNames
     *        A list of repository names that are associated with the specified approval rule template.
     */

    public void setRepositoryNames(java.util.Collection<String> repositoryNames) {
        if (repositoryNames == null) {
            this.repositoryNames = null;
            return;
        }

        this.repositoryNames = new java.util.ArrayList<String>(repositoryNames);
    }

    /**
     * <p>
     * A list of repository names that are associated with the specified approval rule template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRepositoryNames(java.util.Collection)} or {@link #withRepositoryNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param repositoryNames
     *        A list of repository names that are associated with the specified approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesForApprovalRuleTemplateResult withRepositoryNames(String... repositoryNames) {
        if (this.repositoryNames == null) {
            setRepositoryNames(new java.util.ArrayList<String>(repositoryNames.length));
        }
        for (String ele : repositoryNames) {
            this.repositoryNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of repository names that are associated with the specified approval rule template.
     * </p>
     * 
     * @param repositoryNames
     *        A list of repository names that are associated with the specified approval rule template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesForApprovalRuleTemplateResult withRepositoryNames(java.util.Collection<String> repositoryNames) {
        setRepositoryNames(repositoryNames);
        return this;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results of the operation.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the next results of the operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results of the operation.
     * </p>
     * 
     * @return An enumeration token that allows the operation to batch the next results of the operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results of the operation.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that allows the operation to batch the next results of the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesForApprovalRuleTemplateResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRepositoryNames() != null)
            sb.append("RepositoryNames: ").append(getRepositoryNames()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRepositoriesForApprovalRuleTemplateResult == false)
            return false;
        ListRepositoriesForApprovalRuleTemplateResult other = (ListRepositoriesForApprovalRuleTemplateResult) obj;
        if (other.getRepositoryNames() == null ^ this.getRepositoryNames() == null)
            return false;
        if (other.getRepositoryNames() != null && other.getRepositoryNames().equals(this.getRepositoryNames()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryNames() == null) ? 0 : getRepositoryNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRepositoriesForApprovalRuleTemplateResult clone() {
        try {
            return (ListRepositoriesForApprovalRuleTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
