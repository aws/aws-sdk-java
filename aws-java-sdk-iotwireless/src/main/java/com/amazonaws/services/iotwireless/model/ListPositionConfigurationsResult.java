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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListPositionConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Deprecated
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPositionConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of position configurations.
     * </p>
     */
    private java.util.List<PositionConfigurationItem> positionConfigurationList;
    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of position configurations.
     * </p>
     * 
     * @return A list of position configurations.
     */

    public java.util.List<PositionConfigurationItem> getPositionConfigurationList() {
        return positionConfigurationList;
    }

    /**
     * <p>
     * A list of position configurations.
     * </p>
     * 
     * @param positionConfigurationList
     *        A list of position configurations.
     */

    public void setPositionConfigurationList(java.util.Collection<PositionConfigurationItem> positionConfigurationList) {
        if (positionConfigurationList == null) {
            this.positionConfigurationList = null;
            return;
        }

        this.positionConfigurationList = new java.util.ArrayList<PositionConfigurationItem>(positionConfigurationList);
    }

    /**
     * <p>
     * A list of position configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPositionConfigurationList(java.util.Collection)} or
     * {@link #withPositionConfigurationList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param positionConfigurationList
     *        A list of position configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPositionConfigurationsResult withPositionConfigurationList(PositionConfigurationItem... positionConfigurationList) {
        if (this.positionConfigurationList == null) {
            setPositionConfigurationList(new java.util.ArrayList<PositionConfigurationItem>(positionConfigurationList.length));
        }
        for (PositionConfigurationItem ele : positionConfigurationList) {
            this.positionConfigurationList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of position configurations.
     * </p>
     * 
     * @param positionConfigurationList
     *        A list of position configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPositionConfigurationsResult withPositionConfigurationList(java.util.Collection<PositionConfigurationItem> positionConfigurationList) {
        setPositionConfigurationList(positionConfigurationList);
        return this;
    }

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

    public ListPositionConfigurationsResult withNextToken(String nextToken) {
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
        if (getPositionConfigurationList() != null)
            sb.append("PositionConfigurationList: ").append(getPositionConfigurationList()).append(",");
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

        if (obj instanceof ListPositionConfigurationsResult == false)
            return false;
        ListPositionConfigurationsResult other = (ListPositionConfigurationsResult) obj;
        if (other.getPositionConfigurationList() == null ^ this.getPositionConfigurationList() == null)
            return false;
        if (other.getPositionConfigurationList() != null && other.getPositionConfigurationList().equals(this.getPositionConfigurationList()) == false)
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

        hashCode = prime * hashCode + ((getPositionConfigurationList() == null) ? 0 : getPositionConfigurationList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPositionConfigurationsResult clone() {
        try {
            return (ListPositionConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
