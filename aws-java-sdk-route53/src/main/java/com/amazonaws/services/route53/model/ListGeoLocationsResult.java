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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type containing the response information for the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListGeoLocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGeoLocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains one <code>GeoLocationDetails</code> element for each location that Amazon Route 53
     * supports for geolocation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GeoLocationDetails> geoLocationDetailsList;
    /**
     * <p>
     * A value that indicates whether more locations remain to be listed after the last location in this response. If
     * so, the value of <code>IsTruncated</code> is <code>true</code>. To get more values, submit another request and
     * include the values of <code>NextContinentCode</code>, <code>NextCountryCode</code>, and
     * <code>NextSubdivisionCode</code> in the <code>startcontinentcode</code>, <code>startcountrycode</code>, and
     * <code>startsubdivisioncode</code>, as applicable.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextContinentCode</code> in the <code>startcontinentcode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     */
    private String nextContinentCode;
    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextCountryCode</code> in the <code>startcountrycode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     */
    private String nextCountryCode;
    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     */
    private String nextSubdivisionCode;
    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the request.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains one <code>GeoLocationDetails</code> element for each location that Amazon Route 53
     * supports for geolocation.
     * </p>
     * 
     * @return A complex type that contains one <code>GeoLocationDetails</code> element for each location that Amazon
     *         Route 53 supports for geolocation.
     */

    public java.util.List<GeoLocationDetails> getGeoLocationDetailsList() {
        if (geoLocationDetailsList == null) {
            geoLocationDetailsList = new com.amazonaws.internal.SdkInternalList<GeoLocationDetails>();
        }
        return geoLocationDetailsList;
    }

    /**
     * <p>
     * A complex type that contains one <code>GeoLocationDetails</code> element for each location that Amazon Route 53
     * supports for geolocation.
     * </p>
     * 
     * @param geoLocationDetailsList
     *        A complex type that contains one <code>GeoLocationDetails</code> element for each location that Amazon
     *        Route 53 supports for geolocation.
     */

    public void setGeoLocationDetailsList(java.util.Collection<GeoLocationDetails> geoLocationDetailsList) {
        if (geoLocationDetailsList == null) {
            this.geoLocationDetailsList = null;
            return;
        }

        this.geoLocationDetailsList = new com.amazonaws.internal.SdkInternalList<GeoLocationDetails>(geoLocationDetailsList);
    }

    /**
     * <p>
     * A complex type that contains one <code>GeoLocationDetails</code> element for each location that Amazon Route 53
     * supports for geolocation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGeoLocationDetailsList(java.util.Collection)} or
     * {@link #withGeoLocationDetailsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param geoLocationDetailsList
     *        A complex type that contains one <code>GeoLocationDetails</code> element for each location that Amazon
     *        Route 53 supports for geolocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsResult withGeoLocationDetailsList(GeoLocationDetails... geoLocationDetailsList) {
        if (this.geoLocationDetailsList == null) {
            setGeoLocationDetailsList(new com.amazonaws.internal.SdkInternalList<GeoLocationDetails>(geoLocationDetailsList.length));
        }
        for (GeoLocationDetails ele : geoLocationDetailsList) {
            this.geoLocationDetailsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>GeoLocationDetails</code> element for each location that Amazon Route 53
     * supports for geolocation.
     * </p>
     * 
     * @param geoLocationDetailsList
     *        A complex type that contains one <code>GeoLocationDetails</code> element for each location that Amazon
     *        Route 53 supports for geolocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsResult withGeoLocationDetailsList(java.util.Collection<GeoLocationDetails> geoLocationDetailsList) {
        setGeoLocationDetailsList(geoLocationDetailsList);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether more locations remain to be listed after the last location in this response. If
     * so, the value of <code>IsTruncated</code> is <code>true</code>. To get more values, submit another request and
     * include the values of <code>NextContinentCode</code>, <code>NextCountryCode</code>, and
     * <code>NextSubdivisionCode</code> in the <code>startcontinentcode</code>, <code>startcountrycode</code>, and
     * <code>startsubdivisioncode</code>, as applicable.
     * </p>
     * 
     * @param isTruncated
     *        A value that indicates whether more locations remain to be listed after the last location in this
     *        response. If so, the value of <code>IsTruncated</code> is <code>true</code>. To get more values, submit
     *        another request and include the values of <code>NextContinentCode</code>, <code>NextCountryCode</code>,
     *        and <code>NextSubdivisionCode</code> in the <code>startcontinentcode</code>, <code>startcountrycode</code>
     *        , and <code>startsubdivisioncode</code>, as applicable.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A value that indicates whether more locations remain to be listed after the last location in this response. If
     * so, the value of <code>IsTruncated</code> is <code>true</code>. To get more values, submit another request and
     * include the values of <code>NextContinentCode</code>, <code>NextCountryCode</code>, and
     * <code>NextSubdivisionCode</code> in the <code>startcontinentcode</code>, <code>startcountrycode</code>, and
     * <code>startsubdivisioncode</code>, as applicable.
     * </p>
     * 
     * @return A value that indicates whether more locations remain to be listed after the last location in this
     *         response. If so, the value of <code>IsTruncated</code> is <code>true</code>. To get more values, submit
     *         another request and include the values of <code>NextContinentCode</code>, <code>NextCountryCode</code>,
     *         and <code>NextSubdivisionCode</code> in the <code>startcontinentcode</code>,
     *         <code>startcountrycode</code>, and <code>startsubdivisioncode</code>, as applicable.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A value that indicates whether more locations remain to be listed after the last location in this response. If
     * so, the value of <code>IsTruncated</code> is <code>true</code>. To get more values, submit another request and
     * include the values of <code>NextContinentCode</code>, <code>NextCountryCode</code>, and
     * <code>NextSubdivisionCode</code> in the <code>startcontinentcode</code>, <code>startcountrycode</code>, and
     * <code>startsubdivisioncode</code>, as applicable.
     * </p>
     * 
     * @param isTruncated
     *        A value that indicates whether more locations remain to be listed after the last location in this
     *        response. If so, the value of <code>IsTruncated</code> is <code>true</code>. To get more values, submit
     *        another request and include the values of <code>NextContinentCode</code>, <code>NextCountryCode</code>,
     *        and <code>NextSubdivisionCode</code> in the <code>startcontinentcode</code>, <code>startcountrycode</code>
     *        , and <code>startsubdivisioncode</code>, as applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether more locations remain to be listed after the last location in this response. If
     * so, the value of <code>IsTruncated</code> is <code>true</code>. To get more values, submit another request and
     * include the values of <code>NextContinentCode</code>, <code>NextCountryCode</code>, and
     * <code>NextSubdivisionCode</code> in the <code>startcontinentcode</code>, <code>startcountrycode</code>, and
     * <code>startsubdivisioncode</code>, as applicable.
     * </p>
     * 
     * @return A value that indicates whether more locations remain to be listed after the last location in this
     *         response. If so, the value of <code>IsTruncated</code> is <code>true</code>. To get more values, submit
     *         another request and include the values of <code>NextContinentCode</code>, <code>NextCountryCode</code>,
     *         and <code>NextSubdivisionCode</code> in the <code>startcontinentcode</code>,
     *         <code>startcountrycode</code>, and <code>startsubdivisioncode</code>, as applicable.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextContinentCode</code> in the <code>startcontinentcode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     * 
     * @param nextContinentCode
     *        If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more
     *        locations. Enter the value of <code>NextContinentCode</code> in the <code>startcontinentcode</code>
     *        parameter in another <code>ListGeoLocations</code> request.
     */

    public void setNextContinentCode(String nextContinentCode) {
        this.nextContinentCode = nextContinentCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextContinentCode</code> in the <code>startcontinentcode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more
     *         locations. Enter the value of <code>NextContinentCode</code> in the <code>startcontinentcode</code>
     *         parameter in another <code>ListGeoLocations</code> request.
     */

    public String getNextContinentCode() {
        return this.nextContinentCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextContinentCode</code> in the <code>startcontinentcode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     * 
     * @param nextContinentCode
     *        If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more
     *        locations. Enter the value of <code>NextContinentCode</code> in the <code>startcontinentcode</code>
     *        parameter in another <code>ListGeoLocations</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsResult withNextContinentCode(String nextContinentCode) {
        setNextContinentCode(nextContinentCode);
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextCountryCode</code> in the <code>startcountrycode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     * 
     * @param nextCountryCode
     *        If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more
     *        locations. Enter the value of <code>NextCountryCode</code> in the <code>startcountrycode</code> parameter
     *        in another <code>ListGeoLocations</code> request.
     */

    public void setNextCountryCode(String nextCountryCode) {
        this.nextCountryCode = nextCountryCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextCountryCode</code> in the <code>startcountrycode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more
     *         locations. Enter the value of <code>NextCountryCode</code> in the <code>startcountrycode</code> parameter
     *         in another <code>ListGeoLocations</code> request.
     */

    public String getNextCountryCode() {
        return this.nextCountryCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextCountryCode</code> in the <code>startcountrycode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     * 
     * @param nextCountryCode
     *        If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more
     *        locations. Enter the value of <code>NextCountryCode</code> in the <code>startcountrycode</code> parameter
     *        in another <code>ListGeoLocations</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsResult withNextCountryCode(String nextCountryCode) {
        setNextCountryCode(nextCountryCode);
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     * 
     * @param nextSubdivisionCode
     *        If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more
     *        locations. Enter the value of <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code>
     *        parameter in another <code>ListGeoLocations</code> request.
     */

    public void setNextSubdivisionCode(String nextSubdivisionCode) {
        this.nextSubdivisionCode = nextSubdivisionCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more
     *         locations. Enter the value of <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code>
     *         parameter in another <code>ListGeoLocations</code> request.
     */

    public String getNextSubdivisionCode() {
        return this.nextSubdivisionCode;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more locations.
     * Enter the value of <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code> parameter in another
     * <code>ListGeoLocations</code> request.
     * </p>
     * 
     * @param nextSubdivisionCode
     *        If <code>IsTruncated</code> is <code>true</code>, you can make a follow-up request to display more
     *        locations. Enter the value of <code>NextSubdivisionCode</code> in the <code>startsubdivisioncode</code>
     *        parameter in another <code>ListGeoLocations</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsResult withNextSubdivisionCode(String nextSubdivisionCode) {
        setNextSubdivisionCode(nextSubdivisionCode);
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the request.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for <code>MaxItems</code> in the request.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the request.
     * </p>
     * 
     * @return The value that you specified for <code>MaxItems</code> in the request.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the request.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for <code>MaxItems</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsResult withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getGeoLocationDetailsList() != null)
            sb.append("GeoLocationDetailsList: ").append(getGeoLocationDetailsList()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getNextContinentCode() != null)
            sb.append("NextContinentCode: ").append(getNextContinentCode()).append(",");
        if (getNextCountryCode() != null)
            sb.append("NextCountryCode: ").append(getNextCountryCode()).append(",");
        if (getNextSubdivisionCode() != null)
            sb.append("NextSubdivisionCode: ").append(getNextSubdivisionCode()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGeoLocationsResult == false)
            return false;
        ListGeoLocationsResult other = (ListGeoLocationsResult) obj;
        if (other.getGeoLocationDetailsList() == null ^ this.getGeoLocationDetailsList() == null)
            return false;
        if (other.getGeoLocationDetailsList() != null && other.getGeoLocationDetailsList().equals(this.getGeoLocationDetailsList()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextContinentCode() == null ^ this.getNextContinentCode() == null)
            return false;
        if (other.getNextContinentCode() != null && other.getNextContinentCode().equals(this.getNextContinentCode()) == false)
            return false;
        if (other.getNextCountryCode() == null ^ this.getNextCountryCode() == null)
            return false;
        if (other.getNextCountryCode() != null && other.getNextCountryCode().equals(this.getNextCountryCode()) == false)
            return false;
        if (other.getNextSubdivisionCode() == null ^ this.getNextSubdivisionCode() == null)
            return false;
        if (other.getNextSubdivisionCode() != null && other.getNextSubdivisionCode().equals(this.getNextSubdivisionCode()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeoLocationDetailsList() == null) ? 0 : getGeoLocationDetailsList().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getNextContinentCode() == null) ? 0 : getNextContinentCode().hashCode());
        hashCode = prime * hashCode + ((getNextCountryCode() == null) ? 0 : getNextCountryCode().hashCode());
        hashCode = prime * hashCode + ((getNextSubdivisionCode() == null) ? 0 : getNextSubdivisionCode().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListGeoLocationsResult clone() {
        try {
            return (ListGeoLocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
