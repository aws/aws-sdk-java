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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ListServices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of full ARN entries for each service associated with the specified cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> serviceArns;
    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListServices</code> request. When the results of a
     * <code>ListServices</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of full ARN entries for each service associated with the specified cluster.
     * </p>
     * 
     * @return The list of full ARN entries for each service associated with the specified cluster.
     */

    public java.util.List<String> getServiceArns() {
        if (serviceArns == null) {
            serviceArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return serviceArns;
    }

    /**
     * <p>
     * The list of full ARN entries for each service associated with the specified cluster.
     * </p>
     * 
     * @param serviceArns
     *        The list of full ARN entries for each service associated with the specified cluster.
     */

    public void setServiceArns(java.util.Collection<String> serviceArns) {
        if (serviceArns == null) {
            this.serviceArns = null;
            return;
        }

        this.serviceArns = new com.amazonaws.internal.SdkInternalList<String>(serviceArns);
    }

    /**
     * <p>
     * The list of full ARN entries for each service associated with the specified cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceArns(java.util.Collection)} or {@link #withServiceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceArns
     *        The list of full ARN entries for each service associated with the specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withServiceArns(String... serviceArns) {
        if (this.serviceArns == null) {
            setServiceArns(new com.amazonaws.internal.SdkInternalList<String>(serviceArns.length));
        }
        for (String ele : serviceArns) {
            this.serviceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of full ARN entries for each service associated with the specified cluster.
     * </p>
     * 
     * @param serviceArns
     *        The list of full ARN entries for each service associated with the specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withServiceArns(java.util.Collection<String> serviceArns) {
        setServiceArns(serviceArns);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListServices</code> request. When the results of a
     * <code>ListServices</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListServices</code> request. When the
     *        results of a <code>ListServices</code> request exceed <code>maxResults</code>, this value can be used to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListServices</code> request. When the results of a
     * <code>ListServices</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>nextToken</code> value to include in a future <code>ListServices</code> request. When the
     *         results of a <code>ListServices</code> request exceed <code>maxResults</code>, this value can be used to
     *         retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future <code>ListServices</code> request. When the results of a
     * <code>ListServices</code> request exceed <code>maxResults</code>, this value can be used to retrieve the next
     * page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value to include in a future <code>ListServices</code> request. When the
     *        results of a <code>ListServices</code> request exceed <code>maxResults</code>, this value can be used to
     *        retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesResult withNextToken(String nextToken) {
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
        if (getServiceArns() != null)
            sb.append("ServiceArns: ").append(getServiceArns()).append(",");
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

        if (obj instanceof ListServicesResult == false)
            return false;
        ListServicesResult other = (ListServicesResult) obj;
        if (other.getServiceArns() == null ^ this.getServiceArns() == null)
            return false;
        if (other.getServiceArns() != null && other.getServiceArns().equals(this.getServiceArns()) == false)
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

        hashCode = prime * hashCode + ((getServiceArns() == null) ? 0 : getServiceArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListServicesResult clone() {
        try {
            return (ListServicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
