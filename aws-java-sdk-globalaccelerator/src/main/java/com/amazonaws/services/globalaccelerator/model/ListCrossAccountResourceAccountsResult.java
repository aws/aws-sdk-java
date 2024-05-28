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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/ListCrossAccountResourceAccounts"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCrossAccountResourceAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The account IDs of principals (resource owners) in a cross-account attachment who can work with resources listed
     * in the same attachment.
     * </p>
     */
    private java.util.List<String> resourceOwnerAwsAccountIds;

    /**
     * <p>
     * The account IDs of principals (resource owners) in a cross-account attachment who can work with resources listed
     * in the same attachment.
     * </p>
     * 
     * @return The account IDs of principals (resource owners) in a cross-account attachment who can work with resources
     *         listed in the same attachment.
     */

    public java.util.List<String> getResourceOwnerAwsAccountIds() {
        return resourceOwnerAwsAccountIds;
    }

    /**
     * <p>
     * The account IDs of principals (resource owners) in a cross-account attachment who can work with resources listed
     * in the same attachment.
     * </p>
     * 
     * @param resourceOwnerAwsAccountIds
     *        The account IDs of principals (resource owners) in a cross-account attachment who can work with resources
     *        listed in the same attachment.
     */

    public void setResourceOwnerAwsAccountIds(java.util.Collection<String> resourceOwnerAwsAccountIds) {
        if (resourceOwnerAwsAccountIds == null) {
            this.resourceOwnerAwsAccountIds = null;
            return;
        }

        this.resourceOwnerAwsAccountIds = new java.util.ArrayList<String>(resourceOwnerAwsAccountIds);
    }

    /**
     * <p>
     * The account IDs of principals (resource owners) in a cross-account attachment who can work with resources listed
     * in the same attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceOwnerAwsAccountIds(java.util.Collection)} or
     * {@link #withResourceOwnerAwsAccountIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourceOwnerAwsAccountIds
     *        The account IDs of principals (resource owners) in a cross-account attachment who can work with resources
     *        listed in the same attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrossAccountResourceAccountsResult withResourceOwnerAwsAccountIds(String... resourceOwnerAwsAccountIds) {
        if (this.resourceOwnerAwsAccountIds == null) {
            setResourceOwnerAwsAccountIds(new java.util.ArrayList<String>(resourceOwnerAwsAccountIds.length));
        }
        for (String ele : resourceOwnerAwsAccountIds) {
            this.resourceOwnerAwsAccountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The account IDs of principals (resource owners) in a cross-account attachment who can work with resources listed
     * in the same attachment.
     * </p>
     * 
     * @param resourceOwnerAwsAccountIds
     *        The account IDs of principals (resource owners) in a cross-account attachment who can work with resources
     *        listed in the same attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCrossAccountResourceAccountsResult withResourceOwnerAwsAccountIds(java.util.Collection<String> resourceOwnerAwsAccountIds) {
        setResourceOwnerAwsAccountIds(resourceOwnerAwsAccountIds);
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
        if (getResourceOwnerAwsAccountIds() != null)
            sb.append("ResourceOwnerAwsAccountIds: ").append(getResourceOwnerAwsAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCrossAccountResourceAccountsResult == false)
            return false;
        ListCrossAccountResourceAccountsResult other = (ListCrossAccountResourceAccountsResult) obj;
        if (other.getResourceOwnerAwsAccountIds() == null ^ this.getResourceOwnerAwsAccountIds() == null)
            return false;
        if (other.getResourceOwnerAwsAccountIds() != null && other.getResourceOwnerAwsAccountIds().equals(this.getResourceOwnerAwsAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceOwnerAwsAccountIds() == null) ? 0 : getResourceOwnerAwsAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public ListCrossAccountResourceAccountsResult clone() {
        try {
            return (ListCrossAccountResourceAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
