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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListIPSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIPSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<String> ipSetIds;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<String> getIpSetIds() {
        return ipSetIds;
    }

    /**
     * @param ipSetIds
     */

    public void setIpSetIds(java.util.Collection<String> ipSetIds) {
        if (ipSetIds == null) {
            this.ipSetIds = null;
            return;
        }

        this.ipSetIds = new java.util.ArrayList<String>(ipSetIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpSetIds(java.util.Collection)} or {@link #withIpSetIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ipSetIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIPSetsResult withIpSetIds(String... ipSetIds) {
        if (this.ipSetIds == null) {
            setIpSetIds(new java.util.ArrayList<String>(ipSetIds.length));
        }
        for (String ele : ipSetIds) {
            this.ipSetIds.add(ele);
        }
        return this;
    }

    /**
     * @param ipSetIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIPSetsResult withIpSetIds(java.util.Collection<String> ipSetIds) {
        setIpSetIds(ipSetIds);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIPSetsResult withNextToken(String nextToken) {
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
        if (getIpSetIds() != null)
            sb.append("IpSetIds: ").append(getIpSetIds()).append(",");
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

        if (obj instanceof ListIPSetsResult == false)
            return false;
        ListIPSetsResult other = (ListIPSetsResult) obj;
        if (other.getIpSetIds() == null ^ this.getIpSetIds() == null)
            return false;
        if (other.getIpSetIds() != null && other.getIpSetIds().equals(this.getIpSetIds()) == false)
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

        hashCode = prime * hashCode + ((getIpSetIds() == null) ? 0 : getIpSetIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIPSetsResult clone() {
        try {
            return (ListIPSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
