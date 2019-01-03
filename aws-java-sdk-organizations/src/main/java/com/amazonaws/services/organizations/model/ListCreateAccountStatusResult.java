/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListCreateAccountStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCreateAccountStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in
     * the output only after the account has been successfully created.
     * </p>
     */
    private java.util.List<CreateAccountStatus> createAccountStatuses;
    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in
     * the output only after the account has been successfully created.
     * </p>
     * 
     * @return A list of objects with details about the requests. Certain elements, such as the accountId number, are
     *         present in the output only after the account has been successfully created.
     */

    public java.util.List<CreateAccountStatus> getCreateAccountStatuses() {
        return createAccountStatuses;
    }

    /**
     * <p>
     * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in
     * the output only after the account has been successfully created.
     * </p>
     * 
     * @param createAccountStatuses
     *        A list of objects with details about the requests. Certain elements, such as the accountId number, are
     *        present in the output only after the account has been successfully created.
     */

    public void setCreateAccountStatuses(java.util.Collection<CreateAccountStatus> createAccountStatuses) {
        if (createAccountStatuses == null) {
            this.createAccountStatuses = null;
            return;
        }

        this.createAccountStatuses = new java.util.ArrayList<CreateAccountStatus>(createAccountStatuses);
    }

    /**
     * <p>
     * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in
     * the output only after the account has been successfully created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateAccountStatuses(java.util.Collection)} or
     * {@link #withCreateAccountStatuses(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createAccountStatuses
     *        A list of objects with details about the requests. Certain elements, such as the accountId number, are
     *        present in the output only after the account has been successfully created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCreateAccountStatusResult withCreateAccountStatuses(CreateAccountStatus... createAccountStatuses) {
        if (this.createAccountStatuses == null) {
            setCreateAccountStatuses(new java.util.ArrayList<CreateAccountStatus>(createAccountStatuses.length));
        }
        for (CreateAccountStatus ele : createAccountStatuses) {
            this.createAccountStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in
     * the output only after the account has been successfully created.
     * </p>
     * 
     * @param createAccountStatuses
     *        A list of objects with details about the requests. Certain elements, such as the accountId number, are
     *        present in the output only after the account has been successfully created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCreateAccountStatusResult withCreateAccountStatuses(java.util.Collection<CreateAccountStatus> createAccountStatuses) {
        setCreateAccountStatuses(createAccountStatuses);
        return this;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that there is more output available than is included in the current
     *        response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *        operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *        response element comes back as <code>null</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @return If present, this value indicates that there is more output available than is included in the current
     *         response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *         operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *         response element comes back as <code>null</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If present, this value indicates that there is more output available than is included in the current response.
     * Use this value in the <code>NextToken</code> request parameter in a subsequent call to the operation to get the
     * next part of the output. You should repeat this until the <code>NextToken</code> response element comes back as
     * <code>null</code>.
     * </p>
     * 
     * @param nextToken
     *        If present, this value indicates that there is more output available than is included in the current
     *        response. Use this value in the <code>NextToken</code> request parameter in a subsequent call to the
     *        operation to get the next part of the output. You should repeat this until the <code>NextToken</code>
     *        response element comes back as <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCreateAccountStatusResult withNextToken(String nextToken) {
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
        if (getCreateAccountStatuses() != null)
            sb.append("CreateAccountStatuses: ").append(getCreateAccountStatuses()).append(",");
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

        if (obj instanceof ListCreateAccountStatusResult == false)
            return false;
        ListCreateAccountStatusResult other = (ListCreateAccountStatusResult) obj;
        if (other.getCreateAccountStatuses() == null ^ this.getCreateAccountStatuses() == null)
            return false;
        if (other.getCreateAccountStatuses() != null && other.getCreateAccountStatuses().equals(this.getCreateAccountStatuses()) == false)
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

        hashCode = prime * hashCode + ((getCreateAccountStatuses() == null) ? 0 : getCreateAccountStatuses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCreateAccountStatusResult clone() {
        try {
            return (ListCreateAccountStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
