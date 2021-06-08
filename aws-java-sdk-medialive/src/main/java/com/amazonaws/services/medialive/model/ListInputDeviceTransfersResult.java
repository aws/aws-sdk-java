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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Placeholder documentation for ListInputDeviceTransfersResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDeviceTransfers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInputDeviceTransfersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The list of devices that you are transferring or are being transferred to you. */
    private java.util.List<TransferringInputDeviceSummary> inputDeviceTransfers;
    /** A token to get additional list results. */
    private String nextToken;

    /**
     * The list of devices that you are transferring or are being transferred to you.
     * 
     * @return The list of devices that you are transferring or are being transferred to you.
     */

    public java.util.List<TransferringInputDeviceSummary> getInputDeviceTransfers() {
        return inputDeviceTransfers;
    }

    /**
     * The list of devices that you are transferring or are being transferred to you.
     * 
     * @param inputDeviceTransfers
     *        The list of devices that you are transferring or are being transferred to you.
     */

    public void setInputDeviceTransfers(java.util.Collection<TransferringInputDeviceSummary> inputDeviceTransfers) {
        if (inputDeviceTransfers == null) {
            this.inputDeviceTransfers = null;
            return;
        }

        this.inputDeviceTransfers = new java.util.ArrayList<TransferringInputDeviceSummary>(inputDeviceTransfers);
    }

    /**
     * The list of devices that you are transferring or are being transferred to you.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDeviceTransfers(java.util.Collection)} or {@link #withInputDeviceTransfers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inputDeviceTransfers
     *        The list of devices that you are transferring or are being transferred to you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputDeviceTransfersResult withInputDeviceTransfers(TransferringInputDeviceSummary... inputDeviceTransfers) {
        if (this.inputDeviceTransfers == null) {
            setInputDeviceTransfers(new java.util.ArrayList<TransferringInputDeviceSummary>(inputDeviceTransfers.length));
        }
        for (TransferringInputDeviceSummary ele : inputDeviceTransfers) {
            this.inputDeviceTransfers.add(ele);
        }
        return this;
    }

    /**
     * The list of devices that you are transferring or are being transferred to you.
     * 
     * @param inputDeviceTransfers
     *        The list of devices that you are transferring or are being transferred to you.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputDeviceTransfersResult withInputDeviceTransfers(java.util.Collection<TransferringInputDeviceSummary> inputDeviceTransfers) {
        setInputDeviceTransfers(inputDeviceTransfers);
        return this;
    }

    /**
     * A token to get additional list results.
     * 
     * @param nextToken
     *        A token to get additional list results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A token to get additional list results.
     * 
     * @return A token to get additional list results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A token to get additional list results.
     * 
     * @param nextToken
     *        A token to get additional list results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputDeviceTransfersResult withNextToken(String nextToken) {
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
        if (getInputDeviceTransfers() != null)
            sb.append("InputDeviceTransfers: ").append(getInputDeviceTransfers()).append(",");
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

        if (obj instanceof ListInputDeviceTransfersResult == false)
            return false;
        ListInputDeviceTransfersResult other = (ListInputDeviceTransfersResult) obj;
        if (other.getInputDeviceTransfers() == null ^ this.getInputDeviceTransfers() == null)
            return false;
        if (other.getInputDeviceTransfers() != null && other.getInputDeviceTransfers().equals(this.getInputDeviceTransfers()) == false)
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

        hashCode = prime * hashCode + ((getInputDeviceTransfers() == null) ? 0 : getInputDeviceTransfers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInputDeviceTransfersResult clone() {
        try {
            return (ListInputDeviceTransfersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
