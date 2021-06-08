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
 * Placeholder documentation for ListInputDevicesResponse
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListInputDevices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInputDevicesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The list of input devices. */
    private java.util.List<InputDeviceSummary> inputDevices;
    /** A token to get additional list results. */
    private String nextToken;

    /**
     * The list of input devices.
     * 
     * @return The list of input devices.
     */

    public java.util.List<InputDeviceSummary> getInputDevices() {
        return inputDevices;
    }

    /**
     * The list of input devices.
     * 
     * @param inputDevices
     *        The list of input devices.
     */

    public void setInputDevices(java.util.Collection<InputDeviceSummary> inputDevices) {
        if (inputDevices == null) {
            this.inputDevices = null;
            return;
        }

        this.inputDevices = new java.util.ArrayList<InputDeviceSummary>(inputDevices);
    }

    /**
     * The list of input devices.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputDevices(java.util.Collection)} or {@link #withInputDevices(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param inputDevices
     *        The list of input devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputDevicesResult withInputDevices(InputDeviceSummary... inputDevices) {
        if (this.inputDevices == null) {
            setInputDevices(new java.util.ArrayList<InputDeviceSummary>(inputDevices.length));
        }
        for (InputDeviceSummary ele : inputDevices) {
            this.inputDevices.add(ele);
        }
        return this;
    }

    /**
     * The list of input devices.
     * 
     * @param inputDevices
     *        The list of input devices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInputDevicesResult withInputDevices(java.util.Collection<InputDeviceSummary> inputDevices) {
        setInputDevices(inputDevices);
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

    public ListInputDevicesResult withNextToken(String nextToken) {
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
        if (getInputDevices() != null)
            sb.append("InputDevices: ").append(getInputDevices()).append(",");
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

        if (obj instanceof ListInputDevicesResult == false)
            return false;
        ListInputDevicesResult other = (ListInputDevicesResult) obj;
        if (other.getInputDevices() == null ^ this.getInputDevices() == null)
            return false;
        if (other.getInputDevices() != null && other.getInputDevices().equals(this.getInputDevices()) == false)
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

        hashCode = prime * hashCode + ((getInputDevices() == null) ? 0 : getInputDevices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInputDevicesResult clone() {
        try {
            return (ListInputDevicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
