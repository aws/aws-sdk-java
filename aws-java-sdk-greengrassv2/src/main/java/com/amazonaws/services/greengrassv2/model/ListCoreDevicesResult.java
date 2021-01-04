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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListCoreDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCoreDevicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each core device.
     * </p>
     */
    private java.util.List<CoreDevice> coreDevices;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each core device.
     * </p>
     * 
     * @return A list that summarizes each core device.
     */

    public java.util.List<CoreDevice> getCoreDevices() {
        return coreDevices;
    }

    /**
     * <p>
     * A list that summarizes each core device.
     * </p>
     * 
     * @param coreDevices
     *        A list that summarizes each core device.
     */

    public void setCoreDevices(java.util.Collection<CoreDevice> coreDevices) {
        if (coreDevices == null) {
            this.coreDevices = null;
            return;
        }

        this.coreDevices = new java.util.ArrayList<CoreDevice>(coreDevices);
    }

    /**
     * <p>
     * A list that summarizes each core device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCoreDevices(java.util.Collection)} or {@link #withCoreDevices(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param coreDevices
     *        A list that summarizes each core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoreDevicesResult withCoreDevices(CoreDevice... coreDevices) {
        if (this.coreDevices == null) {
            setCoreDevices(new java.util.ArrayList<CoreDevice>(coreDevices.length));
        }
        for (CoreDevice ele : coreDevices) {
            this.coreDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each core device.
     * </p>
     * 
     * @param coreDevices
     *        A list that summarizes each core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoreDevicesResult withCoreDevices(java.util.Collection<CoreDevice> coreDevices) {
        setCoreDevices(coreDevices);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCoreDevicesResult withNextToken(String nextToken) {
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
        if (getCoreDevices() != null)
            sb.append("CoreDevices: ").append(getCoreDevices()).append(",");
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

        if (obj instanceof ListCoreDevicesResult == false)
            return false;
        ListCoreDevicesResult other = (ListCoreDevicesResult) obj;
        if (other.getCoreDevices() == null ^ this.getCoreDevices() == null)
            return false;
        if (other.getCoreDevices() != null && other.getCoreDevices().equals(this.getCoreDevices()) == false)
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

        hashCode = prime * hashCode + ((getCoreDevices() == null) ? 0 : getCoreDevices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCoreDevicesResult clone() {
        try {
            return (ListCoreDevicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
