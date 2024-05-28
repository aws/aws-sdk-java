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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListApplicationAssignmentsForPrincipal"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationAssignmentsForPrincipalResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An array list of the application assignments for the specified principal.
     * </p>
     */
    private java.util.List<ApplicationAssignmentForPrincipal> applicationAssignments;
    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array list of the application assignments for the specified principal.
     * </p>
     * 
     * @return An array list of the application assignments for the specified principal.
     */

    public java.util.List<ApplicationAssignmentForPrincipal> getApplicationAssignments() {
        return applicationAssignments;
    }

    /**
     * <p>
     * An array list of the application assignments for the specified principal.
     * </p>
     * 
     * @param applicationAssignments
     *        An array list of the application assignments for the specified principal.
     */

    public void setApplicationAssignments(java.util.Collection<ApplicationAssignmentForPrincipal> applicationAssignments) {
        if (applicationAssignments == null) {
            this.applicationAssignments = null;
            return;
        }

        this.applicationAssignments = new java.util.ArrayList<ApplicationAssignmentForPrincipal>(applicationAssignments);
    }

    /**
     * <p>
     * An array list of the application assignments for the specified principal.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicationAssignments(java.util.Collection)} or
     * {@link #withApplicationAssignments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param applicationAssignments
     *        An array list of the application assignments for the specified principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationAssignmentsForPrincipalResult withApplicationAssignments(ApplicationAssignmentForPrincipal... applicationAssignments) {
        if (this.applicationAssignments == null) {
            setApplicationAssignments(new java.util.ArrayList<ApplicationAssignmentForPrincipal>(applicationAssignments.length));
        }
        for (ApplicationAssignmentForPrincipal ele : applicationAssignments) {
            this.applicationAssignments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array list of the application assignments for the specified principal.
     * </p>
     * 
     * @param applicationAssignments
     *        An array list of the application assignments for the specified principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationAssignmentsForPrincipalResult withApplicationAssignments(
            java.util.Collection<ApplicationAssignmentForPrincipal> applicationAssignments) {
        setApplicationAssignments(applicationAssignments);
        return this;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that more output is available than is included in the current response.
     *        Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *        get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *        comes back as <code>null</code>. This indicates that this is the last page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @return If present, this value indicates that more output is available than is included in the current response.
     *         Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *         get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *         comes back as <code>null</code>. This indicates that this is the last page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that more output is available than is included in the current response. Use this
     * value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the next part
     * of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>. This indicates that this is the last page of results.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that more output is available than is included in the current response.
     *        Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to
     *        get the next part of the output. You should repeat this until the <code>NextToken</code> response element
     *        comes back as <code>null</code>. This indicates that this is the last page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationAssignmentsForPrincipalResult withNextToken(String nextToken) {
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
        if (getApplicationAssignments() != null)
            sb.append("ApplicationAssignments: ").append(getApplicationAssignments()).append(",");
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

        if (obj instanceof ListApplicationAssignmentsForPrincipalResult == false)
            return false;
        ListApplicationAssignmentsForPrincipalResult other = (ListApplicationAssignmentsForPrincipalResult) obj;
        if (other.getApplicationAssignments() == null ^ this.getApplicationAssignments() == null)
            return false;
        if (other.getApplicationAssignments() != null && other.getApplicationAssignments().equals(this.getApplicationAssignments()) == false)
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

        hashCode = prime * hashCode + ((getApplicationAssignments() == null) ? 0 : getApplicationAssignments().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationAssignmentsForPrincipalResult clone() {
        try {
            return (ListApplicationAssignmentsForPrincipalResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
