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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/SampleChannelData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SampleChannelDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of message samples. Each sample message is returned as a base64-encoded string.
     * </p>
     */
    private java.util.List<java.nio.ByteBuffer> payloads;

    /**
     * <p>
     * The list of message samples. Each sample message is returned as a base64-encoded string.
     * </p>
     * 
     * @return The list of message samples. Each sample message is returned as a base64-encoded string.
     */

    public java.util.List<java.nio.ByteBuffer> getPayloads() {
        return payloads;
    }

    /**
     * <p>
     * The list of message samples. Each sample message is returned as a base64-encoded string.
     * </p>
     * 
     * @param payloads
     *        The list of message samples. Each sample message is returned as a base64-encoded string.
     */

    public void setPayloads(java.util.Collection<java.nio.ByteBuffer> payloads) {
        if (payloads == null) {
            this.payloads = null;
            return;
        }

        this.payloads = new java.util.ArrayList<java.nio.ByteBuffer>(payloads);
    }

    /**
     * <p>
     * The list of message samples. Each sample message is returned as a base64-encoded string.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPayloads(java.util.Collection)} or {@link #withPayloads(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param payloads
     *        The list of message samples. Each sample message is returned as a base64-encoded string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleChannelDataResult withPayloads(java.nio.ByteBuffer... payloads) {
        if (this.payloads == null) {
            setPayloads(new java.util.ArrayList<java.nio.ByteBuffer>(payloads.length));
        }
        for (java.nio.ByteBuffer ele : payloads) {
            this.payloads.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of message samples. Each sample message is returned as a base64-encoded string.
     * </p>
     * 
     * @param payloads
     *        The list of message samples. Each sample message is returned as a base64-encoded string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SampleChannelDataResult withPayloads(java.util.Collection<java.nio.ByteBuffer> payloads) {
        setPayloads(payloads);
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
        if (getPayloads() != null)
            sb.append("Payloads: ").append(getPayloads());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SampleChannelDataResult == false)
            return false;
        SampleChannelDataResult other = (SampleChannelDataResult) obj;
        if (other.getPayloads() == null ^ this.getPayloads() == null)
            return false;
        if (other.getPayloads() != null && other.getPayloads().equals(this.getPayloads()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayloads() == null) ? 0 : getPayloads().hashCode());
        return hashCode;
    }

    @Override
    public SampleChannelDataResult clone() {
        try {
            return (SampleChannelDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
