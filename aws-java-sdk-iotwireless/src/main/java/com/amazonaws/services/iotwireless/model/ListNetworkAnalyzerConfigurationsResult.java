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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListNetworkAnalyzerConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNetworkAnalyzerConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of network analyzer configurations.
     * </p>
     */
    private java.util.List<NetworkAnalyzerConfigurations> networkAnalyzerConfigurationList;

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkAnalyzerConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of network analyzer configurations.
     * </p>
     * 
     * @return The list of network analyzer configurations.
     */

    public java.util.List<NetworkAnalyzerConfigurations> getNetworkAnalyzerConfigurationList() {
        return networkAnalyzerConfigurationList;
    }

    /**
     * <p>
     * The list of network analyzer configurations.
     * </p>
     * 
     * @param networkAnalyzerConfigurationList
     *        The list of network analyzer configurations.
     */

    public void setNetworkAnalyzerConfigurationList(java.util.Collection<NetworkAnalyzerConfigurations> networkAnalyzerConfigurationList) {
        if (networkAnalyzerConfigurationList == null) {
            this.networkAnalyzerConfigurationList = null;
            return;
        }

        this.networkAnalyzerConfigurationList = new java.util.ArrayList<NetworkAnalyzerConfigurations>(networkAnalyzerConfigurationList);
    }

    /**
     * <p>
     * The list of network analyzer configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkAnalyzerConfigurationList(java.util.Collection)} or
     * {@link #withNetworkAnalyzerConfigurationList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkAnalyzerConfigurationList
     *        The list of network analyzer configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkAnalyzerConfigurationsResult withNetworkAnalyzerConfigurationList(NetworkAnalyzerConfigurations... networkAnalyzerConfigurationList) {
        if (this.networkAnalyzerConfigurationList == null) {
            setNetworkAnalyzerConfigurationList(new java.util.ArrayList<NetworkAnalyzerConfigurations>(networkAnalyzerConfigurationList.length));
        }
        for (NetworkAnalyzerConfigurations ele : networkAnalyzerConfigurationList) {
            this.networkAnalyzerConfigurationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of network analyzer configurations.
     * </p>
     * 
     * @param networkAnalyzerConfigurationList
     *        The list of network analyzer configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNetworkAnalyzerConfigurationsResult withNetworkAnalyzerConfigurationList(
            java.util.Collection<NetworkAnalyzerConfigurations> networkAnalyzerConfigurationList) {
        setNetworkAnalyzerConfigurationList(networkAnalyzerConfigurationList);
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
        if (getNetworkAnalyzerConfigurationList() != null)
            sb.append("NetworkAnalyzerConfigurationList: ").append(getNetworkAnalyzerConfigurationList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNetworkAnalyzerConfigurationsResult == false)
            return false;
        ListNetworkAnalyzerConfigurationsResult other = (ListNetworkAnalyzerConfigurationsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getNetworkAnalyzerConfigurationList() == null ^ this.getNetworkAnalyzerConfigurationList() == null)
            return false;
        if (other.getNetworkAnalyzerConfigurationList() != null
                && other.getNetworkAnalyzerConfigurationList().equals(this.getNetworkAnalyzerConfigurationList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getNetworkAnalyzerConfigurationList() == null) ? 0 : getNetworkAnalyzerConfigurationList().hashCode());
        return hashCode;
    }

    @Override
    public ListNetworkAnalyzerConfigurationsResult clone() {
        try {
            return (ListNetworkAnalyzerConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
