/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/ListLandingZones" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLandingZonesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the landing zone.
     * </p>
     */
    private java.util.List<LandingZoneSummary> landingZones;
    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the response is the end of the results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the landing zone.
     * </p>
     * 
     * @return The ARN of the landing zone.
     */

    public java.util.List<LandingZoneSummary> getLandingZones() {
        return landingZones;
    }

    /**
     * <p>
     * The ARN of the landing zone.
     * </p>
     * 
     * @param landingZones
     *        The ARN of the landing zone.
     */

    public void setLandingZones(java.util.Collection<LandingZoneSummary> landingZones) {
        if (landingZones == null) {
            this.landingZones = null;
            return;
        }

        this.landingZones = new java.util.ArrayList<LandingZoneSummary>(landingZones);
    }

    /**
     * <p>
     * The ARN of the landing zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLandingZones(java.util.Collection)} or {@link #withLandingZones(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param landingZones
     *        The ARN of the landing zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLandingZonesResult withLandingZones(LandingZoneSummary... landingZones) {
        if (this.landingZones == null) {
            setLandingZones(new java.util.ArrayList<LandingZoneSummary>(landingZones.length));
        }
        for (LandingZoneSummary ele : landingZones) {
            this.landingZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARN of the landing zone.
     * </p>
     * 
     * @param landingZones
     *        The ARN of the landing zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLandingZonesResult withLandingZones(java.util.Collection<LandingZoneSummary> landingZones) {
        setLandingZones(landingZones);
        return this;
    }

    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the response is the end of the results.
     * </p>
     * 
     * @param nextToken
     *        Retrieves the next page of results. If the string is empty, the response is the end of the results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the response is the end of the results.
     * </p>
     * 
     * @return Retrieves the next page of results. If the string is empty, the response is the end of the results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Retrieves the next page of results. If the string is empty, the response is the end of the results.
     * </p>
     * 
     * @param nextToken
     *        Retrieves the next page of results. If the string is empty, the response is the end of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLandingZonesResult withNextToken(String nextToken) {
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
        if (getLandingZones() != null)
            sb.append("LandingZones: ").append(getLandingZones()).append(",");
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

        if (obj instanceof ListLandingZonesResult == false)
            return false;
        ListLandingZonesResult other = (ListLandingZonesResult) obj;
        if (other.getLandingZones() == null ^ this.getLandingZones() == null)
            return false;
        if (other.getLandingZones() != null && other.getLandingZones().equals(this.getLandingZones()) == false)
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

        hashCode = prime * hashCode + ((getLandingZones() == null) ? 0 : getLandingZones().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLandingZonesResult clone() {
        try {
            return (ListLandingZonesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
