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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/ListIpRoutes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIpRoutesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <a>IpRoute</a>s.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IpRouteInfo> ipRoutesInfo;
    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>ListIpRoutes</a> to retrieve the next set of items.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <a>IpRoute</a>s.
     * </p>
     * 
     * @return A list of <a>IpRoute</a>s.
     */

    public java.util.List<IpRouteInfo> getIpRoutesInfo() {
        if (ipRoutesInfo == null) {
            ipRoutesInfo = new com.amazonaws.internal.SdkInternalList<IpRouteInfo>();
        }
        return ipRoutesInfo;
    }

    /**
     * <p>
     * A list of <a>IpRoute</a>s.
     * </p>
     * 
     * @param ipRoutesInfo
     *        A list of <a>IpRoute</a>s.
     */

    public void setIpRoutesInfo(java.util.Collection<IpRouteInfo> ipRoutesInfo) {
        if (ipRoutesInfo == null) {
            this.ipRoutesInfo = null;
            return;
        }

        this.ipRoutesInfo = new com.amazonaws.internal.SdkInternalList<IpRouteInfo>(ipRoutesInfo);
    }

    /**
     * <p>
     * A list of <a>IpRoute</a>s.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpRoutesInfo(java.util.Collection)} or {@link #withIpRoutesInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipRoutesInfo
     *        A list of <a>IpRoute</a>s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIpRoutesResult withIpRoutesInfo(IpRouteInfo... ipRoutesInfo) {
        if (this.ipRoutesInfo == null) {
            setIpRoutesInfo(new com.amazonaws.internal.SdkInternalList<IpRouteInfo>(ipRoutesInfo.length));
        }
        for (IpRouteInfo ele : ipRoutesInfo) {
            this.ipRoutesInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>IpRoute</a>s.
     * </p>
     * 
     * @param ipRoutesInfo
     *        A list of <a>IpRoute</a>s.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIpRoutesResult withIpRoutesInfo(java.util.Collection<IpRouteInfo> ipRoutesInfo) {
        setIpRoutesInfo(ipRoutesInfo);
        return this;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>ListIpRoutes</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a
     *        subsequent call to <a>ListIpRoutes</a> to retrieve the next set of items.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>ListIpRoutes</a> to retrieve the next set of items.
     * </p>
     * 
     * @return If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a
     *         subsequent call to <a>ListIpRoutes</a> to retrieve the next set of items.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a subsequent call
     * to <a>ListIpRoutes</a> to retrieve the next set of items.
     * </p>
     * 
     * @param nextToken
     *        If not null, more results are available. Pass this value for the <i>NextToken</i> parameter in a
     *        subsequent call to <a>ListIpRoutes</a> to retrieve the next set of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIpRoutesResult withNextToken(String nextToken) {
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
        if (getIpRoutesInfo() != null)
            sb.append("IpRoutesInfo: ").append(getIpRoutesInfo()).append(",");
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

        if (obj instanceof ListIpRoutesResult == false)
            return false;
        ListIpRoutesResult other = (ListIpRoutesResult) obj;
        if (other.getIpRoutesInfo() == null ^ this.getIpRoutesInfo() == null)
            return false;
        if (other.getIpRoutesInfo() != null && other.getIpRoutesInfo().equals(this.getIpRoutesInfo()) == false)
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

        hashCode = prime * hashCode + ((getIpRoutesInfo() == null) ? 0 : getIpRoutesInfo().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListIpRoutesResult clone() {
        try {
            return (ListIpRoutesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
