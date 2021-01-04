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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListWirelessGateways" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWirelessGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     */
    private java.util.List<WirelessGatewayStatistics> wirelessGatewayList;

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

    public ListWirelessGatewaysResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @return The ID of the wireless gateway.
     */

    public java.util.List<WirelessGatewayStatistics> getWirelessGatewayList() {
        return wirelessGatewayList;
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @param wirelessGatewayList
     *        The ID of the wireless gateway.
     */

    public void setWirelessGatewayList(java.util.Collection<WirelessGatewayStatistics> wirelessGatewayList) {
        if (wirelessGatewayList == null) {
            this.wirelessGatewayList = null;
            return;
        }

        this.wirelessGatewayList = new java.util.ArrayList<WirelessGatewayStatistics>(wirelessGatewayList);
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWirelessGatewayList(java.util.Collection)} or {@link #withWirelessGatewayList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param wirelessGatewayList
     *        The ID of the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessGatewaysResult withWirelessGatewayList(WirelessGatewayStatistics... wirelessGatewayList) {
        if (this.wirelessGatewayList == null) {
            setWirelessGatewayList(new java.util.ArrayList<WirelessGatewayStatistics>(wirelessGatewayList.length));
        }
        for (WirelessGatewayStatistics ele : wirelessGatewayList) {
            this.wirelessGatewayList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @param wirelessGatewayList
     *        The ID of the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWirelessGatewaysResult withWirelessGatewayList(java.util.Collection<WirelessGatewayStatistics> wirelessGatewayList) {
        setWirelessGatewayList(wirelessGatewayList);
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
        if (getWirelessGatewayList() != null)
            sb.append("WirelessGatewayList: ").append(getWirelessGatewayList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWirelessGatewaysResult == false)
            return false;
        ListWirelessGatewaysResult other = (ListWirelessGatewaysResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getWirelessGatewayList() == null ^ this.getWirelessGatewayList() == null)
            return false;
        if (other.getWirelessGatewayList() != null && other.getWirelessGatewayList().equals(this.getWirelessGatewayList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getWirelessGatewayList() == null) ? 0 : getWirelessGatewayList().hashCode());
        return hashCode;
    }

    @Override
    public ListWirelessGatewaysResult clone() {
        try {
            return (ListWirelessGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
