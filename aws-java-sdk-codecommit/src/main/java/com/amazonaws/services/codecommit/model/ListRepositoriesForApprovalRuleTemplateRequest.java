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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ListRepositoriesForApprovalRuleTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRepositoriesForApprovalRuleTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the approval rule template for which you want to list repositories that are associated with that
     * template.
     * </p>
     */
    private String approvalRuleTemplateName;
    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the approval rule template for which you want to list repositories that are associated with that
     * template.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the approval rule template for which you want to list repositories that are associated with
     *        that template.
     */

    public void setApprovalRuleTemplateName(String approvalRuleTemplateName) {
        this.approvalRuleTemplateName = approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template for which you want to list repositories that are associated with that
     * template.
     * </p>
     * 
     * @return The name of the approval rule template for which you want to list repositories that are associated with
     *         that template.
     */

    public String getApprovalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }

    /**
     * <p>
     * The name of the approval rule template for which you want to list repositories that are associated with that
     * template.
     * </p>
     * 
     * @param approvalRuleTemplateName
     *        The name of the approval rule template for which you want to list repositories that are associated with
     *        that template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesForApprovalRuleTemplateRequest withApprovalRuleTemplateName(String approvalRuleTemplateName) {
        setApprovalRuleTemplateName(approvalRuleTemplateName);
        return this;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @return An enumeration token that, when provided in a request, returns the next batch of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An enumeration token that, when provided in a request, returns the next batch of the results.
     * </p>
     * 
     * @param nextToken
     *        An enumeration token that, when provided in a request, returns the next batch of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesForApprovalRuleTemplateRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @param maxResults
     *        A non-zero, non-negative integer used to limit the number of returned results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @return A non-zero, non-negative integer used to limit the number of returned results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * A non-zero, non-negative integer used to limit the number of returned results.
     * </p>
     * 
     * @param maxResults
     *        A non-zero, non-negative integer used to limit the number of returned results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRepositoriesForApprovalRuleTemplateRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getApprovalRuleTemplateName() != null)
            sb.append("ApprovalRuleTemplateName: ").append(getApprovalRuleTemplateName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRepositoriesForApprovalRuleTemplateRequest == false)
            return false;
        ListRepositoriesForApprovalRuleTemplateRequest other = (ListRepositoriesForApprovalRuleTemplateRequest) obj;
        if (other.getApprovalRuleTemplateName() == null ^ this.getApprovalRuleTemplateName() == null)
            return false;
        if (other.getApprovalRuleTemplateName() != null && other.getApprovalRuleTemplateName().equals(this.getApprovalRuleTemplateName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApprovalRuleTemplateName() == null) ? 0 : getApprovalRuleTemplateName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListRepositoriesForApprovalRuleTemplateRequest clone() {
        return (ListRepositoriesForApprovalRuleTemplateRequest) super.clone();
    }

}
