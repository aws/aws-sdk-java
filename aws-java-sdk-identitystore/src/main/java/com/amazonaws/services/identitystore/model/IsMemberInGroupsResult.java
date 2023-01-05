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
package com.amazonaws.services.identitystore.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/identitystore-2020-06-15/IsMemberInGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IsMemberInGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list containing the results of membership existence checks.
     * </p>
     */
    private java.util.List<GroupMembershipExistenceResult> results;

    /**
     * <p>
     * A list containing the results of membership existence checks.
     * </p>
     * 
     * @return A list containing the results of membership existence checks.
     */

    public java.util.List<GroupMembershipExistenceResult> getResults() {
        return results;
    }

    /**
     * <p>
     * A list containing the results of membership existence checks.
     * </p>
     * 
     * @param results
     *        A list containing the results of membership existence checks.
     */

    public void setResults(java.util.Collection<GroupMembershipExistenceResult> results) {
        if (results == null) {
            this.results = null;
            return;
        }

        this.results = new java.util.ArrayList<GroupMembershipExistenceResult>(results);
    }

    /**
     * <p>
     * A list containing the results of membership existence checks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResults(java.util.Collection)} or {@link #withResults(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param results
     *        A list containing the results of membership existence checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsMemberInGroupsResult withResults(GroupMembershipExistenceResult... results) {
        if (this.results == null) {
            setResults(new java.util.ArrayList<GroupMembershipExistenceResult>(results.length));
        }
        for (GroupMembershipExistenceResult ele : results) {
            this.results.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the results of membership existence checks.
     * </p>
     * 
     * @param results
     *        A list containing the results of membership existence checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsMemberInGroupsResult withResults(java.util.Collection<GroupMembershipExistenceResult> results) {
        setResults(results);
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
        if (getResults() != null)
            sb.append("Results: ").append(getResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IsMemberInGroupsResult == false)
            return false;
        IsMemberInGroupsResult other = (IsMemberInGroupsResult) obj;
        if (other.getResults() == null ^ this.getResults() == null)
            return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode());
        return hashCode;
    }

    @Override
    public IsMemberInGroupsResult clone() {
        try {
            return (IsMemberInGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
