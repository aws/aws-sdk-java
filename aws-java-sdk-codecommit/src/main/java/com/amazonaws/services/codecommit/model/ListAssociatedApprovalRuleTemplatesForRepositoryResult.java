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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListAssociatedApprovalRuleTemplatesForRepository"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociatedApprovalRuleTemplatesForRepositoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The names of all approval rule templates associated with the repository.
     * </p>
     */
    private java.util.List<String> approvalRuleTemplateNames;
    /**
     * <p>
     * An enumeration token that allows the operation to batch the next results of the operation.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of all approval rule templates associated with the repository.
     * </p>
     * 
     * @return The names of all approval rule templates associated with the repository.
     */

    public java.util.List<String> getApprovalRuleTemplateNames() {
        return approvalRuleTemplateNames;
    }

    /**
     * <p>
     * The names of all approval rule templates associated with the repository.
     * </p>
     * 
     * @param approvalRuleTemplateNames
     *        The names of all approval rule templates associated with the repository.
     */

    public void setApprovalRuleTemplateNames(java.util.Collection<String> approvalRuleTemplateNames) {
        if (approvalRuleTemplateNames == null) {
            this.approvalRuleTemplateNames = null;
            return;
        }

        this.approvalRuleTemplateNames = new java.util.ArrayList<String>(approvalRuleTemplateNames);
    }

    /**
     * <p>
     * The names of all approval rule templates associated with the repository.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApprovalRuleTemplateNames(java.util.Collection)} or
     * {@link #withApprovalRuleTemplateNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param approvalRuleTemplateNames
     *        The names of all approval rule templates associated with the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedApprovalRuleTemplatesForRepositoryResult withApprovalRuleTemplateNames(String... approvalRuleTemplateNames) {
        if (this.approvalRuleTemplateNames == null) {
            setApprovalRuleTemplateNames(new java.util.ArrayList<String>(approvalRuleTemplateNames.length));
        }
        for (String ele : approvalRuleTemplateNames) {
            this.approvalRuleTemplateNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of all approval rule templates associated with the repository.
     * </p>
     * 
     * @param approvalRuleTemplateNames
     *        The names of all approval rule templates associated with the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedApprovalRuleTemplatesForRepositoryResult withApprovalRuleTemplateNames(java.util.Collection<String> approvalRuleTemplateNames) {
        setApprovalRuleTemplateNames(approvalRuleTemplateNames);
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

    public ListAssociatedApprovalRuleTemplatesForRepositoryResult withNextToken(String nextToken) {
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
        if (getApprovalRuleTemplateNames() != null)
            sb.append("ApprovalRuleTemplateNames: ").append(getApprovalRuleTemplateNames()).append(",");
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

        if (obj instanceof ListAssociatedApprovalRuleTemplatesForRepositoryResult == false)
            return false;
        ListAssociatedApprovalRuleTemplatesForRepositoryResult other = (ListAssociatedApprovalRuleTemplatesForRepositoryResult) obj;
        if (other.getApprovalRuleTemplateNames() == null ^ this.getApprovalRuleTemplateNames() == null)
            return false;
        if (other.getApprovalRuleTemplateNames() != null && other.getApprovalRuleTemplateNames().equals(this.getApprovalRuleTemplateNames()) == false)
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

        hashCode = prime * hashCode + ((getApprovalRuleTemplateNames() == null) ? 0 : getApprovalRuleTemplateNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssociatedApprovalRuleTemplatesForRepositoryResult clone() {
        try {
            return (ListAssociatedApprovalRuleTemplatesForRepositoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
