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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/ListClientDevicesAssociatedWithCoreDevice"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClientDevicesAssociatedWithCoreDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list that describes the client devices that are associated with the core device.
     * </p>
     */
    private java.util.List<AssociatedClientDevice> associatedClientDevices;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that describes the client devices that are associated with the core device.
     * </p>
     * 
     * @return A list that describes the client devices that are associated with the core device.
     */

    public java.util.List<AssociatedClientDevice> getAssociatedClientDevices() {
        return associatedClientDevices;
    }

    /**
     * <p>
     * A list that describes the client devices that are associated with the core device.
     * </p>
     * 
     * @param associatedClientDevices
     *        A list that describes the client devices that are associated with the core device.
     */

    public void setAssociatedClientDevices(java.util.Collection<AssociatedClientDevice> associatedClientDevices) {
        if (associatedClientDevices == null) {
            this.associatedClientDevices = null;
            return;
        }

        this.associatedClientDevices = new java.util.ArrayList<AssociatedClientDevice>(associatedClientDevices);
    }

    /**
     * <p>
     * A list that describes the client devices that are associated with the core device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedClientDevices(java.util.Collection)} or
     * {@link #withAssociatedClientDevices(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param associatedClientDevices
     *        A list that describes the client devices that are associated with the core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClientDevicesAssociatedWithCoreDeviceResult withAssociatedClientDevices(AssociatedClientDevice... associatedClientDevices) {
        if (this.associatedClientDevices == null) {
            setAssociatedClientDevices(new java.util.ArrayList<AssociatedClientDevice>(associatedClientDevices.length));
        }
        for (AssociatedClientDevice ele : associatedClientDevices) {
            this.associatedClientDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that describes the client devices that are associated with the core device.
     * </p>
     * 
     * @param associatedClientDevices
     *        A list that describes the client devices that are associated with the core device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClientDevicesAssociatedWithCoreDeviceResult withAssociatedClientDevices(java.util.Collection<AssociatedClientDevice> associatedClientDevices) {
        setAssociatedClientDevices(associatedClientDevices);
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

    public ListClientDevicesAssociatedWithCoreDeviceResult withNextToken(String nextToken) {
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
        if (getAssociatedClientDevices() != null)
            sb.append("AssociatedClientDevices: ").append(getAssociatedClientDevices()).append(",");
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

        if (obj instanceof ListClientDevicesAssociatedWithCoreDeviceResult == false)
            return false;
        ListClientDevicesAssociatedWithCoreDeviceResult other = (ListClientDevicesAssociatedWithCoreDeviceResult) obj;
        if (other.getAssociatedClientDevices() == null ^ this.getAssociatedClientDevices() == null)
            return false;
        if (other.getAssociatedClientDevices() != null && other.getAssociatedClientDevices().equals(this.getAssociatedClientDevices()) == false)
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

        hashCode = prime * hashCode + ((getAssociatedClientDevices() == null) ? 0 : getAssociatedClientDevices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListClientDevicesAssociatedWithCoreDeviceResult clone() {
        try {
            return (ListClientDevicesAssociatedWithCoreDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
