/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/ListSatellites" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSatellitesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Next token that can be supplied in the next call to get the next page of satellites.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of satellites.
     * </p>
     */
    private java.util.List<SatelliteListItem> satellites;

    /**
     * <p>
     * Next token that can be supplied in the next call to get the next page of satellites.
     * </p>
     * 
     * @param nextToken
     *        Next token that can be supplied in the next call to get the next page of satellites.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token that can be supplied in the next call to get the next page of satellites.
     * </p>
     * 
     * @return Next token that can be supplied in the next call to get the next page of satellites.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token that can be supplied in the next call to get the next page of satellites.
     * </p>
     * 
     * @param nextToken
     *        Next token that can be supplied in the next call to get the next page of satellites.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSatellitesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of satellites.
     * </p>
     * 
     * @return List of satellites.
     */

    public java.util.List<SatelliteListItem> getSatellites() {
        return satellites;
    }

    /**
     * <p>
     * List of satellites.
     * </p>
     * 
     * @param satellites
     *        List of satellites.
     */

    public void setSatellites(java.util.Collection<SatelliteListItem> satellites) {
        if (satellites == null) {
            this.satellites = null;
            return;
        }

        this.satellites = new java.util.ArrayList<SatelliteListItem>(satellites);
    }

    /**
     * <p>
     * List of satellites.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSatellites(java.util.Collection)} or {@link #withSatellites(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param satellites
     *        List of satellites.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSatellitesResult withSatellites(SatelliteListItem... satellites) {
        if (this.satellites == null) {
            setSatellites(new java.util.ArrayList<SatelliteListItem>(satellites.length));
        }
        for (SatelliteListItem ele : satellites) {
            this.satellites.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of satellites.
     * </p>
     * 
     * @param satellites
     *        List of satellites.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSatellitesResult withSatellites(java.util.Collection<SatelliteListItem> satellites) {
        setSatellites(satellites);
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
        if (getSatellites() != null)
            sb.append("Satellites: ").append(getSatellites());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSatellitesResult == false)
            return false;
        ListSatellitesResult other = (ListSatellitesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSatellites() == null ^ this.getSatellites() == null)
            return false;
        if (other.getSatellites() != null && other.getSatellites().equals(this.getSatellites()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSatellites() == null) ? 0 : getSatellites().hashCode());
        return hashCode;
    }

    @Override
    public ListSatellitesResult clone() {
        try {
            return (ListSatellitesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
