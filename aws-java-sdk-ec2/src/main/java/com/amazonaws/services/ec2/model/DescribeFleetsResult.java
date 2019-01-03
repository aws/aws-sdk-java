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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the EC2 Fleets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FleetData> fleets;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Fleets.
     * </p>
     * 
     * @return Information about the EC2 Fleets.
     */

    public java.util.List<FleetData> getFleets() {
        if (fleets == null) {
            fleets = new com.amazonaws.internal.SdkInternalList<FleetData>();
        }
        return fleets;
    }

    /**
     * <p>
     * Information about the EC2 Fleets.
     * </p>
     * 
     * @param fleets
     *        Information about the EC2 Fleets.
     */

    public void setFleets(java.util.Collection<FleetData> fleets) {
        if (fleets == null) {
            this.fleets = null;
            return;
        }

        this.fleets = new com.amazonaws.internal.SdkInternalList<FleetData>(fleets);
    }

    /**
     * <p>
     * Information about the EC2 Fleets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleets(java.util.Collection)} or {@link #withFleets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fleets
     *        Information about the EC2 Fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsResult withFleets(FleetData... fleets) {
        if (this.fleets == null) {
            setFleets(new com.amazonaws.internal.SdkInternalList<FleetData>(fleets.length));
        }
        for (FleetData ele : fleets) {
            this.fleets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the EC2 Fleets.
     * </p>
     * 
     * @param fleets
     *        Information about the EC2 Fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetsResult withFleets(java.util.Collection<FleetData> fleets) {
        setFleets(fleets);
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
        if (getFleets() != null)
            sb.append("Fleets: ").append(getFleets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFleetsResult == false)
            return false;
        DescribeFleetsResult other = (DescribeFleetsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFleets() == null ^ this.getFleets() == null)
            return false;
        if (other.getFleets() != null && other.getFleets().equals(this.getFleets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFleets() == null) ? 0 : getFleets().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetsResult clone() {
        try {
            return (DescribeFleetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
