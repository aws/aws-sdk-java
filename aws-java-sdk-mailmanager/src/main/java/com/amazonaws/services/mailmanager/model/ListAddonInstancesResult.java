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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/ListAddonInstances" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAddonInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     */
    private java.util.List<AddonInstance> addonInstances;
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

    public java.util.List<AddonInstance> getAddonInstances() {
        return addonInstances;
    }

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * 
     * @param addonInstances
     *        The list of ingress endpoints.
     */

    public void setAddonInstances(java.util.Collection<AddonInstance> addonInstances) {
        if (addonInstances == null) {
            this.addonInstances = null;
            return;
        }

        this.addonInstances = new java.util.ArrayList<AddonInstance>(addonInstances);
    }

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddonInstances(java.util.Collection)} or {@link #withAddonInstances(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param addonInstances
     *        The list of ingress endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAddonInstancesResult withAddonInstances(AddonInstance... addonInstances) {
        if (this.addonInstances == null) {
            setAddonInstances(new java.util.ArrayList<AddonInstance>(addonInstances.length));
        }
        for (AddonInstance ele : addonInstances) {
            this.addonInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of ingress endpoints.
     * </p>
     * 
     * @param addonInstances
     *        The list of ingress endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAddonInstancesResult withAddonInstances(java.util.Collection<AddonInstance> addonInstances) {
        setAddonInstances(addonInstances);
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

    public ListAddonInstancesResult withNextToken(String nextToken) {
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
        if (getAddonInstances() != null)
            sb.append("AddonInstances: ").append(getAddonInstances()).append(",");
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

        if (obj instanceof ListAddonInstancesResult == false)
            return false;
        ListAddonInstancesResult other = (ListAddonInstancesResult) obj;
        if (other.getAddonInstances() == null ^ this.getAddonInstances() == null)
            return false;
        if (other.getAddonInstances() != null && other.getAddonInstances().equals(this.getAddonInstances()) == false)
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

        hashCode = prime * hashCode + ((getAddonInstances() == null) ? 0 : getAddonInstances().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAddonInstancesResult clone() {
        try {
            return (ListAddonInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
