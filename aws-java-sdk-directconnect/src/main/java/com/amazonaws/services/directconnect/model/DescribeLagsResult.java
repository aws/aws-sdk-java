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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DescribeLags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLagsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The LAGs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Lag> lags;

    /**
     * <p>
     * The LAGs.
     * </p>
     * 
     * @return The LAGs.
     */

    public java.util.List<Lag> getLags() {
        if (lags == null) {
            lags = new com.amazonaws.internal.SdkInternalList<Lag>();
        }
        return lags;
    }

    /**
     * <p>
     * The LAGs.
     * </p>
     * 
     * @param lags
     *        The LAGs.
     */

    public void setLags(java.util.Collection<Lag> lags) {
        if (lags == null) {
            this.lags = null;
            return;
        }

        this.lags = new com.amazonaws.internal.SdkInternalList<Lag>(lags);
    }

    /**
     * <p>
     * The LAGs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLags(java.util.Collection)} or {@link #withLags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lags
     *        The LAGs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLagsResult withLags(Lag... lags) {
        if (this.lags == null) {
            setLags(new com.amazonaws.internal.SdkInternalList<Lag>(lags.length));
        }
        for (Lag ele : lags) {
            this.lags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The LAGs.
     * </p>
     * 
     * @param lags
     *        The LAGs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLagsResult withLags(java.util.Collection<Lag> lags) {
        setLags(lags);
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
        if (getLags() != null)
            sb.append("Lags: ").append(getLags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLagsResult == false)
            return false;
        DescribeLagsResult other = (DescribeLagsResult) obj;
        if (other.getLags() == null ^ this.getLags() == null)
            return false;
        if (other.getLags() != null && other.getLags().equals(this.getLags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLags() == null) ? 0 : getLags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLagsResult clone() {
        try {
            return (DescribeLagsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
