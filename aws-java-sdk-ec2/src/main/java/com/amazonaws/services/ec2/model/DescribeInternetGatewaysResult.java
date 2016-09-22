/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DescribeInternetGateways.
 * </p>
 */
public class DescribeInternetGatewaysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more Internet gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InternetGateway> internetGateways;

    /**
     * <p>
     * Information about one or more Internet gateways.
     * </p>
     * 
     * @return Information about one or more Internet gateways.
     */

    public java.util.List<InternetGateway> getInternetGateways() {
        if (internetGateways == null) {
            internetGateways = new com.amazonaws.internal.SdkInternalList<InternetGateway>();
        }
        return internetGateways;
    }

    /**
     * <p>
     * Information about one or more Internet gateways.
     * </p>
     * 
     * @param internetGateways
     *        Information about one or more Internet gateways.
     */

    public void setInternetGateways(java.util.Collection<InternetGateway> internetGateways) {
        if (internetGateways == null) {
            this.internetGateways = null;
            return;
        }

        this.internetGateways = new com.amazonaws.internal.SdkInternalList<InternetGateway>(internetGateways);
    }

    /**
     * <p>
     * Information about one or more Internet gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInternetGateways(java.util.Collection)} or {@link #withInternetGateways(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param internetGateways
     *        Information about one or more Internet gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInternetGatewaysResult withInternetGateways(InternetGateway... internetGateways) {
        if (this.internetGateways == null) {
            setInternetGateways(new com.amazonaws.internal.SdkInternalList<InternetGateway>(internetGateways.length));
        }
        for (InternetGateway ele : internetGateways) {
            this.internetGateways.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more Internet gateways.
     * </p>
     * 
     * @param internetGateways
     *        Information about one or more Internet gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInternetGatewaysResult withInternetGateways(java.util.Collection<InternetGateway> internetGateways) {
        setInternetGateways(internetGateways);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInternetGateways() != null)
            sb.append("InternetGateways: " + getInternetGateways());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInternetGatewaysResult == false)
            return false;
        DescribeInternetGatewaysResult other = (DescribeInternetGatewaysResult) obj;
        if (other.getInternetGateways() == null ^ this.getInternetGateways() == null)
            return false;
        if (other.getInternetGateways() != null && other.getInternetGateways().equals(this.getInternetGateways()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInternetGateways() == null) ? 0 : getInternetGateways().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInternetGatewaysResult clone() {
        try {
            return (DescribeInternetGatewaysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
