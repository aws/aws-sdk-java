/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetResourcePolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourcePoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the individual resource policies and the account-level resource policy.
     * </p>
     */
    private java.util.List<GluePolicy> getResourcePoliciesResponseList;
    /**
     * <p>
     * A continuation token, if the returned list does not contain the last resource policy available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the individual resource policies and the account-level resource policy.
     * </p>
     * 
     * @return A list of the individual resource policies and the account-level resource policy.
     */

    public java.util.List<GluePolicy> getGetResourcePoliciesResponseList() {
        return getResourcePoliciesResponseList;
    }

    /**
     * <p>
     * A list of the individual resource policies and the account-level resource policy.
     * </p>
     * 
     * @param getResourcePoliciesResponseList
     *        A list of the individual resource policies and the account-level resource policy.
     */

    public void setGetResourcePoliciesResponseList(java.util.Collection<GluePolicy> getResourcePoliciesResponseList) {
        if (getResourcePoliciesResponseList == null) {
            this.getResourcePoliciesResponseList = null;
            return;
        }

        this.getResourcePoliciesResponseList = new java.util.ArrayList<GluePolicy>(getResourcePoliciesResponseList);
    }

    /**
     * <p>
     * A list of the individual resource policies and the account-level resource policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGetResourcePoliciesResponseList(java.util.Collection)} or
     * {@link #withGetResourcePoliciesResponseList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param getResourcePoliciesResponseList
     *        A list of the individual resource policies and the account-level resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResult withGetResourcePoliciesResponseList(GluePolicy... getResourcePoliciesResponseList) {
        if (this.getResourcePoliciesResponseList == null) {
            setGetResourcePoliciesResponseList(new java.util.ArrayList<GluePolicy>(getResourcePoliciesResponseList.length));
        }
        for (GluePolicy ele : getResourcePoliciesResponseList) {
            this.getResourcePoliciesResponseList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the individual resource policies and the account-level resource policy.
     * </p>
     * 
     * @param getResourcePoliciesResponseList
     *        A list of the individual resource policies and the account-level resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResult withGetResourcePoliciesResponseList(java.util.Collection<GluePolicy> getResourcePoliciesResponseList) {
        setGetResourcePoliciesResponseList(getResourcePoliciesResponseList);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last resource policy available.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the returned list does not contain the last resource policy available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last resource policy available.
     * </p>
     * 
     * @return A continuation token, if the returned list does not contain the last resource policy available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if the returned list does not contain the last resource policy available.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the returned list does not contain the last resource policy available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourcePoliciesResult withNextToken(String nextToken) {
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
        if (getGetResourcePoliciesResponseList() != null)
            sb.append("GetResourcePoliciesResponseList: ").append(getGetResourcePoliciesResponseList()).append(",");
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

        if (obj instanceof GetResourcePoliciesResult == false)
            return false;
        GetResourcePoliciesResult other = (GetResourcePoliciesResult) obj;
        if (other.getGetResourcePoliciesResponseList() == null ^ this.getGetResourcePoliciesResponseList() == null)
            return false;
        if (other.getGetResourcePoliciesResponseList() != null
                && other.getGetResourcePoliciesResponseList().equals(this.getGetResourcePoliciesResponseList()) == false)
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

        hashCode = prime * hashCode + ((getGetResourcePoliciesResponseList() == null) ? 0 : getGetResourcePoliciesResponseList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetResourcePoliciesResult clone() {
        try {
            return (GetResourcePoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
