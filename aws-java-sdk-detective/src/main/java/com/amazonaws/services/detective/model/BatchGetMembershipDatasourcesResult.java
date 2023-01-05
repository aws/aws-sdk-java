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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/BatchGetMembershipDatasources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetMembershipDatasourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Details on the data source package history for an member of the behavior graph.
     * </p>
     */
    private java.util.List<MembershipDatasources> membershipDatasources;
    /**
     * <p>
     * Graphs that data source package information could not be retrieved for.
     * </p>
     */
    private java.util.List<UnprocessedGraph> unprocessedGraphs;

    /**
     * <p>
     * Details on the data source package history for an member of the behavior graph.
     * </p>
     * 
     * @return Details on the data source package history for an member of the behavior graph.
     */

    public java.util.List<MembershipDatasources> getMembershipDatasources() {
        return membershipDatasources;
    }

    /**
     * <p>
     * Details on the data source package history for an member of the behavior graph.
     * </p>
     * 
     * @param membershipDatasources
     *        Details on the data source package history for an member of the behavior graph.
     */

    public void setMembershipDatasources(java.util.Collection<MembershipDatasources> membershipDatasources) {
        if (membershipDatasources == null) {
            this.membershipDatasources = null;
            return;
        }

        this.membershipDatasources = new java.util.ArrayList<MembershipDatasources>(membershipDatasources);
    }

    /**
     * <p>
     * Details on the data source package history for an member of the behavior graph.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMembershipDatasources(java.util.Collection)} or
     * {@link #withMembershipDatasources(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param membershipDatasources
     *        Details on the data source package history for an member of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMembershipDatasourcesResult withMembershipDatasources(MembershipDatasources... membershipDatasources) {
        if (this.membershipDatasources == null) {
            setMembershipDatasources(new java.util.ArrayList<MembershipDatasources>(membershipDatasources.length));
        }
        for (MembershipDatasources ele : membershipDatasources) {
            this.membershipDatasources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details on the data source package history for an member of the behavior graph.
     * </p>
     * 
     * @param membershipDatasources
     *        Details on the data source package history for an member of the behavior graph.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMembershipDatasourcesResult withMembershipDatasources(java.util.Collection<MembershipDatasources> membershipDatasources) {
        setMembershipDatasources(membershipDatasources);
        return this;
    }

    /**
     * <p>
     * Graphs that data source package information could not be retrieved for.
     * </p>
     * 
     * @return Graphs that data source package information could not be retrieved for.
     */

    public java.util.List<UnprocessedGraph> getUnprocessedGraphs() {
        return unprocessedGraphs;
    }

    /**
     * <p>
     * Graphs that data source package information could not be retrieved for.
     * </p>
     * 
     * @param unprocessedGraphs
     *        Graphs that data source package information could not be retrieved for.
     */

    public void setUnprocessedGraphs(java.util.Collection<UnprocessedGraph> unprocessedGraphs) {
        if (unprocessedGraphs == null) {
            this.unprocessedGraphs = null;
            return;
        }

        this.unprocessedGraphs = new java.util.ArrayList<UnprocessedGraph>(unprocessedGraphs);
    }

    /**
     * <p>
     * Graphs that data source package information could not be retrieved for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedGraphs(java.util.Collection)} or {@link #withUnprocessedGraphs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param unprocessedGraphs
     *        Graphs that data source package information could not be retrieved for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMembershipDatasourcesResult withUnprocessedGraphs(UnprocessedGraph... unprocessedGraphs) {
        if (this.unprocessedGraphs == null) {
            setUnprocessedGraphs(new java.util.ArrayList<UnprocessedGraph>(unprocessedGraphs.length));
        }
        for (UnprocessedGraph ele : unprocessedGraphs) {
            this.unprocessedGraphs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Graphs that data source package information could not be retrieved for.
     * </p>
     * 
     * @param unprocessedGraphs
     *        Graphs that data source package information could not be retrieved for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetMembershipDatasourcesResult withUnprocessedGraphs(java.util.Collection<UnprocessedGraph> unprocessedGraphs) {
        setUnprocessedGraphs(unprocessedGraphs);
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
        if (getMembershipDatasources() != null)
            sb.append("MembershipDatasources: ").append(getMembershipDatasources()).append(",");
        if (getUnprocessedGraphs() != null)
            sb.append("UnprocessedGraphs: ").append(getUnprocessedGraphs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetMembershipDatasourcesResult == false)
            return false;
        BatchGetMembershipDatasourcesResult other = (BatchGetMembershipDatasourcesResult) obj;
        if (other.getMembershipDatasources() == null ^ this.getMembershipDatasources() == null)
            return false;
        if (other.getMembershipDatasources() != null && other.getMembershipDatasources().equals(this.getMembershipDatasources()) == false)
            return false;
        if (other.getUnprocessedGraphs() == null ^ this.getUnprocessedGraphs() == null)
            return false;
        if (other.getUnprocessedGraphs() != null && other.getUnprocessedGraphs().equals(this.getUnprocessedGraphs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMembershipDatasources() == null) ? 0 : getMembershipDatasources().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedGraphs() == null) ? 0 : getUnprocessedGraphs().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetMembershipDatasourcesResult clone() {
        try {
            return (BatchGetMembershipDatasourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
