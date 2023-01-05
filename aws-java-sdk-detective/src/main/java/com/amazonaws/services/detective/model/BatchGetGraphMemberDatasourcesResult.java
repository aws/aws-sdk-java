/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/BatchGetGraphMemberDatasources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetGraphMemberDatasourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Details on the status of data source packages for members of the behavior graph.
     * </p>
     */
    private java.util.List<MembershipDatasources> memberDatasources;
    /**
     * <p>
     * Accounts that data source package information could not be retrieved for.
     * </p>
     */
    private java.util.List<UnprocessedAccount> unprocessedAccounts;

    /**
     * <p>
     * Details on the status of data source packages for members of the behavior graph.
     * </p>
     * 
     * @return Details on the status of data source packages for members of the behavior graph.
     */

    public java.util.List<MembershipDatasources> getMemberDatasources() {
        return memberDatasources;
    }

    /**
     * <p>
     * Details on the status of data source packages for members of the behavior graph.
     * </p>
     * 
     * @param memberDatasources
     *        Details on the status of data source packages for members of the behavior graph.
     */

    public void setMemberDatasources(java.util.Collection<MembershipDatasources> memberDatasources) {
        if (memberDatasources == null) {
            this.memberDatasources = null;
            return;
        }

        this.memberDatasources = new java.util.ArrayList<MembershipDatasources>(memberDatasources);
    }

    /**
     * <p>
     * Details on the status of data source packages for members of the behavior graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberDatasources(java.util.Collection)} or {@link #withMemberDatasources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param memberDatasources
     *        Details on the status of data source packages for members of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetGraphMemberDatasourcesResult withMemberDatasources(MembershipDatasources... memberDatasources) {
        if (this.memberDatasources == null) {
            setMemberDatasources(new java.util.ArrayList<MembershipDatasources>(memberDatasources.length));
        }
        for (MembershipDatasources ele : memberDatasources) {
            this.memberDatasources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the status of data source packages for members of the behavior graph.
     * </p>
     * 
     * @param memberDatasources
     *        Details on the status of data source packages for members of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetGraphMemberDatasourcesResult withMemberDatasources(java.util.Collection<MembershipDatasources> memberDatasources) {
        setMemberDatasources(memberDatasources);
        return this;
    }

    /**
     * <p>
     * Accounts that data source package information could not be retrieved for.
     * </p>
     * 
     * @return Accounts that data source package information could not be retrieved for.
     */

    public java.util.List<UnprocessedAccount> getUnprocessedAccounts() {
        return unprocessedAccounts;
    }

    /**
     * <p>
     * Accounts that data source package information could not be retrieved for.
     * </p>
     * 
     * @param unprocessedAccounts
     *        Accounts that data source package information could not be retrieved for.
     */

    public void setUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        if (unprocessedAccounts == null) {
            this.unprocessedAccounts = null;
            return;
        }

        this.unprocessedAccounts = new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts);
    }

    /**
     * <p>
     * Accounts that data source package information could not be retrieved for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAccounts(java.util.Collection)} or {@link #withUnprocessedAccounts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAccounts
     *        Accounts that data source package information could not be retrieved for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetGraphMemberDatasourcesResult withUnprocessedAccounts(UnprocessedAccount... unprocessedAccounts) {
        if (this.unprocessedAccounts == null) {
            setUnprocessedAccounts(new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts.length));
        }
        for (UnprocessedAccount ele : unprocessedAccounts) {
            this.unprocessedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Accounts that data source package information could not be retrieved for.
     * </p>
     * 
     * @param unprocessedAccounts
     *        Accounts that data source package information could not be retrieved for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetGraphMemberDatasourcesResult withUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        setUnprocessedAccounts(unprocessedAccounts);
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
        if (getMemberDatasources() != null)
            sb.append("MemberDatasources: ").append(getMemberDatasources()).append(",");
        if (getUnprocessedAccounts() != null)
            sb.append("UnprocessedAccounts: ").append(getUnprocessedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetGraphMemberDatasourcesResult == false)
            return false;
        BatchGetGraphMemberDatasourcesResult other = (BatchGetGraphMemberDatasourcesResult) obj;
        if (other.getMemberDatasources() == null ^ this.getMemberDatasources() == null)
            return false;
        if (other.getMemberDatasources() != null && other.getMemberDatasources().equals(this.getMemberDatasources()) == false)
            return false;
        if (other.getUnprocessedAccounts() == null ^ this.getUnprocessedAccounts() == null)
            return false;
        if (other.getUnprocessedAccounts() != null && other.getUnprocessedAccounts().equals(this.getUnprocessedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberDatasources() == null) ? 0 : getMemberDatasources().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedAccounts() == null) ? 0 : getUnprocessedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetGraphMemberDatasourcesResult clone() {
        try {
            return (BatchGetGraphMemberDatasourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
