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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetServers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * List of <code>VmServerAddress</code> objects
     * </p>
     */
    private java.util.List<VmServerAddress> vmServerAddressList;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. The default value is 50. To retrieve the
     *        remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. The default value is 50. To retrieve the
     *         remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. The default value is 50. To retrieve the remaining
     * results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. The default value is 50. To retrieve the
     *        remaining results, make another call with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * List of <code>VmServerAddress</code> objects
     * </p>
     * 
     * @return List of <code>VmServerAddress</code> objects
     */

    public java.util.List<VmServerAddress> getVmServerAddressList() {
        return vmServerAddressList;
    }

    /**
     * <p>
     * List of <code>VmServerAddress</code> objects
     * </p>
     * 
     * @param vmServerAddressList
     *        List of <code>VmServerAddress</code> objects
     */

    public void setVmServerAddressList(java.util.Collection<VmServerAddress> vmServerAddressList) {
        if (vmServerAddressList == null) {
            this.vmServerAddressList = null;
            return;
        }

        this.vmServerAddressList = new java.util.ArrayList<VmServerAddress>(vmServerAddressList);
    }

    /**
     * <p>
     * List of <code>VmServerAddress</code> objects
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVmServerAddressList(java.util.Collection)} or {@link #withVmServerAddressList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vmServerAddressList
     *        List of <code>VmServerAddress</code> objects
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersRequest withVmServerAddressList(VmServerAddress... vmServerAddressList) {
        if (this.vmServerAddressList == null) {
            setVmServerAddressList(new java.util.ArrayList<VmServerAddress>(vmServerAddressList.length));
        }
        for (VmServerAddress ele : vmServerAddressList) {
            this.vmServerAddressList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of <code>VmServerAddress</code> objects
     * </p>
     * 
     * @param vmServerAddressList
     *        List of <code>VmServerAddress</code> objects
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersRequest withVmServerAddressList(java.util.Collection<VmServerAddress> vmServerAddressList) {
        setVmServerAddressList(vmServerAddressList);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getVmServerAddressList() != null)
            sb.append("VmServerAddressList: ").append(getVmServerAddressList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServersRequest == false)
            return false;
        GetServersRequest other = (GetServersRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getVmServerAddressList() == null ^ this.getVmServerAddressList() == null)
            return false;
        if (other.getVmServerAddressList() != null && other.getVmServerAddressList().equals(this.getVmServerAddressList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getVmServerAddressList() == null) ? 0 : getVmServerAddressList().hashCode());
        return hashCode;
    }

    @Override
    public GetServersRequest clone() {
        return (GetServersRequest) super.clone();
    }

}
