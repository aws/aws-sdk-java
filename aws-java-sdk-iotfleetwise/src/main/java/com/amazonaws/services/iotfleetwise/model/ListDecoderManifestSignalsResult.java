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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/ListDecoderManifestSignals"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDecoderManifestSignalsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about a list of signals to decode.
     * </p>
     */
    private java.util.List<SignalDecoder> signalDecoders;
    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about a list of signals to decode.
     * </p>
     * 
     * @return Information about a list of signals to decode.
     */

    public java.util.List<SignalDecoder> getSignalDecoders() {
        return signalDecoders;
    }

    /**
     * <p>
     * Information about a list of signals to decode.
     * </p>
     * 
     * @param signalDecoders
     *        Information about a list of signals to decode.
     */

    public void setSignalDecoders(java.util.Collection<SignalDecoder> signalDecoders) {
        if (signalDecoders == null) {
            this.signalDecoders = null;
            return;
        }

        this.signalDecoders = new java.util.ArrayList<SignalDecoder>(signalDecoders);
    }

    /**
     * <p>
     * Information about a list of signals to decode.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSignalDecoders(java.util.Collection)} or {@link #withSignalDecoders(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param signalDecoders
     *        Information about a list of signals to decode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDecoderManifestSignalsResult withSignalDecoders(SignalDecoder... signalDecoders) {
        if (this.signalDecoders == null) {
            setSignalDecoders(new java.util.ArrayList<SignalDecoder>(signalDecoders.length));
        }
        for (SignalDecoder ele : signalDecoders) {
            this.signalDecoders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about a list of signals to decode.
     * </p>
     * 
     * @param signalDecoders
     *        Information about a list of signals to decode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDecoderManifestSignalsResult withSignalDecoders(java.util.Collection<SignalDecoder> signalDecoders) {
        setSignalDecoders(signalDecoders);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @return The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next set of results, or <code>null</code> if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDecoderManifestSignalsResult withNextToken(String nextToken) {
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
        if (getSignalDecoders() != null)
            sb.append("SignalDecoders: ").append(getSignalDecoders()).append(",");
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

        if (obj instanceof ListDecoderManifestSignalsResult == false)
            return false;
        ListDecoderManifestSignalsResult other = (ListDecoderManifestSignalsResult) obj;
        if (other.getSignalDecoders() == null ^ this.getSignalDecoders() == null)
            return false;
        if (other.getSignalDecoders() != null && other.getSignalDecoders().equals(this.getSignalDecoders()) == false)
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

        hashCode = prime * hashCode + ((getSignalDecoders() == null) ? 0 : getSignalDecoders().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDecoderManifestSignalsResult clone() {
        try {
            return (ListDecoderManifestSignalsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
