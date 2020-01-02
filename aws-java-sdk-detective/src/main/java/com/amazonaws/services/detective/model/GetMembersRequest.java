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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/GetMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the behavior graph for which to request the member details.
     * </p>
     */
    private String graphArn;
    /**
     * <p>
     * The list of AWS account identifiers for the member account for which to return member details.
     * </p>
     * <p>
     * You cannot use <code>GetMembers</code> to retrieve information about member accounts that were removed from the
     * behavior graph.
     * </p>
     */
    private java.util.List<String> accountIds;

    /**
     * <p>
     * The ARN of the behavior graph for which to request the member details.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph for which to request the member details.
     */

    public void setGraphArn(String graphArn) {
        this.graphArn = graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph for which to request the member details.
     * </p>
     * 
     * @return The ARN of the behavior graph for which to request the member details.
     */

    public String getGraphArn() {
        return this.graphArn;
    }

    /**
     * <p>
     * The ARN of the behavior graph for which to request the member details.
     * </p>
     * 
     * @param graphArn
     *        The ARN of the behavior graph for which to request the member details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersRequest withGraphArn(String graphArn) {
        setGraphArn(graphArn);
        return this;
    }

    /**
     * <p>
     * The list of AWS account identifiers for the member account for which to return member details.
     * </p>
     * <p>
     * You cannot use <code>GetMembers</code> to retrieve information about member accounts that were removed from the
     * behavior graph.
     * </p>
     * 
     * @return The list of AWS account identifiers for the member account for which to return member details.</p>
     *         <p>
     *         You cannot use <code>GetMembers</code> to retrieve information about member accounts that were removed
     *         from the behavior graph.
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The list of AWS account identifiers for the member account for which to return member details.
     * </p>
     * <p>
     * You cannot use <code>GetMembers</code> to retrieve information about member accounts that were removed from the
     * behavior graph.
     * </p>
     * 
     * @param accountIds
     *        The list of AWS account identifiers for the member account for which to return member details.</p>
     *        <p>
     *        You cannot use <code>GetMembers</code> to retrieve information about member accounts that were removed
     *        from the behavior graph.
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * The list of AWS account identifiers for the member account for which to return member details.
     * </p>
     * <p>
     * You cannot use <code>GetMembers</code> to retrieve information about member accounts that were removed from the
     * behavior graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The list of AWS account identifiers for the member account for which to return member details.</p>
     *        <p>
     *        You cannot use <code>GetMembers</code> to retrieve information about member accounts that were removed
     *        from the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of AWS account identifiers for the member account for which to return member details.
     * </p>
     * <p>
     * You cannot use <code>GetMembers</code> to retrieve information about member accounts that were removed from the
     * behavior graph.
     * </p>
     * 
     * @param accountIds
     *        The list of AWS account identifiers for the member account for which to return member details.</p>
     *        <p>
     *        You cannot use <code>GetMembers</code> to retrieve information about member accounts that were removed
     *        from the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMembersRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
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
        if (getGraphArn() != null)
            sb.append("GraphArn: ").append(getGraphArn()).append(",");
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMembersRequest == false)
            return false;
        GetMembersRequest other = (GetMembersRequest) obj;
        if (other.getGraphArn() == null ^ this.getGraphArn() == null)
            return false;
        if (other.getGraphArn() != null && other.getGraphArn().equals(this.getGraphArn()) == false)
            return false;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGraphArn() == null) ? 0 : getGraphArn().hashCode());
        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public GetMembersRequest clone() {
        return (GetMembersRequest) super.clone();
    }

}
