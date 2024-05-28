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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListAddonSubscriptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAddonSubscriptionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     */
    private java.util.List<AddonSubscription> addonSubscriptions;
    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * 
     * @return The list of ingress endpoints.
     */

    public java.util.List<AddonSubscription> getAddonSubscriptions() {
        return addonSubscriptions;
    }

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * 
     * @param addonSubscriptions
     *        The list of ingress endpoints.
     */

    public void setAddonSubscriptions(java.util.Collection<AddonSubscription> addonSubscriptions) {
        if (addonSubscriptions == null) {
            this.addonSubscriptions = null;
            return;
        }

        this.addonSubscriptions = new java.util.ArrayList<AddonSubscription>(addonSubscriptions);
    }

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddonSubscriptions(java.util.Collection)} or {@link #withAddonSubscriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param addonSubscriptions
     *        The list of ingress endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAddonSubscriptionsResult withAddonSubscriptions(AddonSubscription... addonSubscriptions) {
        if (this.addonSubscriptions == null) {
            setAddonSubscriptions(new java.util.ArrayList<AddonSubscription>(addonSubscriptions.length));
        }
        for (AddonSubscription ele : addonSubscriptions) {
            this.addonSubscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * 
     * @param addonSubscriptions
     *        The list of ingress endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAddonSubscriptionsResult withAddonSubscriptions(java.util.Collection<AddonSubscription> addonSubscriptions) {
        setAddonSubscriptions(addonSubscriptions);
        return this;
    }

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If NextToken is returned, there are more results available. The value of NextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @return If NextToken is returned, there are more results available. The value of NextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If NextToken is returned, there are more results available. The value of NextToken is a unique pagination token
     * for each page. Make the call again using the returned token to retrieve the next page.
     * </p>
     * 
     * @param nextToken
     *        If NextToken is returned, there are more results available. The value of NextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAddonSubscriptionsResult withNextToken(String nextToken) {
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
        if (getAddonSubscriptions() != null)
            sb.append("AddonSubscriptions: ").append(getAddonSubscriptions()).append(",");
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

        if (obj instanceof ListAddonSubscriptionsResult == false)
            return false;
        ListAddonSubscriptionsResult other = (ListAddonSubscriptionsResult) obj;
        if (other.getAddonSubscriptions() == null ^ this.getAddonSubscriptions() == null)
            return false;
        if (other.getAddonSubscriptions() != null && other.getAddonSubscriptions().equals(this.getAddonSubscriptions()) == false)
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

        hashCode = prime * hashCode + ((getAddonSubscriptions() == null) ? 0 : getAddonSubscriptions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAddonSubscriptionsResult clone() {
        try {
            return (ListAddonSubscriptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
