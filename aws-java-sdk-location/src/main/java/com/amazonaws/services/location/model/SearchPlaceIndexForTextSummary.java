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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the geocoding request sent using <code>SearchPlaceIndexForText</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/SearchPlaceIndexForTextSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPlaceIndexForTextSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the coordinates for the bias position entered in the geocoding request.
     * </p>
     */
    private java.util.List<Double> biasPosition;
    /**
     * <p>
     * The data provider of geospatial data for the Place index resource.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * Contains the coordinates for the optional bounding box coordinated entered in the geocoding request.
     * </p>
     */
    private java.util.List<Double> filterBBox;
    /**
     * <p>
     * Contains the country filter entered in the geocoding request.
     * </p>
     */
    private java.util.List<String> filterCountries;
    /**
     * <p>
     * Contains the maximum number of results indicated for the request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A bounding box that contains the search results within the specified area indicated by <code>FilterBBox</code>. A
     * subset of bounding box specified using <code>FilterBBox</code>.
     * </p>
     */
    private java.util.List<Double> resultBBox;
    /**
     * <p>
     * The address, name, city or region to be used in the geocoding request. In free-form text format. For example,
     * <code>Vancouver</code>.
     * </p>
     */
    private String text;

    /**
     * <p>
     * Contains the coordinates for the bias position entered in the geocoding request.
     * </p>
     * 
     * @return Contains the coordinates for the bias position entered in the geocoding request.
     */

    public java.util.List<Double> getBiasPosition() {
        return biasPosition;
    }

    /**
     * <p>
     * Contains the coordinates for the bias position entered in the geocoding request.
     * </p>
     * 
     * @param biasPosition
     *        Contains the coordinates for the bias position entered in the geocoding request.
     */

    public void setBiasPosition(java.util.Collection<Double> biasPosition) {
        if (biasPosition == null) {
            this.biasPosition = null;
            return;
        }

        this.biasPosition = new java.util.ArrayList<Double>(biasPosition);
    }

    /**
     * <p>
     * Contains the coordinates for the bias position entered in the geocoding request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBiasPosition(java.util.Collection)} or {@link #withBiasPosition(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param biasPosition
     *        Contains the coordinates for the bias position entered in the geocoding request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withBiasPosition(Double... biasPosition) {
        if (this.biasPosition == null) {
            setBiasPosition(new java.util.ArrayList<Double>(biasPosition.length));
        }
        for (Double ele : biasPosition) {
            this.biasPosition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the coordinates for the bias position entered in the geocoding request.
     * </p>
     * 
     * @param biasPosition
     *        Contains the coordinates for the bias position entered in the geocoding request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withBiasPosition(java.util.Collection<Double> biasPosition) {
        setBiasPosition(biasPosition);
        return this;
    }

    /**
     * <p>
     * The data provider of geospatial data for the Place index resource.
     * </p>
     * 
     * @param dataSource
     *        The data provider of geospatial data for the Place index resource.
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * The data provider of geospatial data for the Place index resource.
     * </p>
     * 
     * @return The data provider of geospatial data for the Place index resource.
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * The data provider of geospatial data for the Place index resource.
     * </p>
     * 
     * @param dataSource
     *        The data provider of geospatial data for the Place index resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box coordinated entered in the geocoding request.
     * </p>
     * 
     * @return Contains the coordinates for the optional bounding box coordinated entered in the geocoding request.
     */

    public java.util.List<Double> getFilterBBox() {
        return filterBBox;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box coordinated entered in the geocoding request.
     * </p>
     * 
     * @param filterBBox
     *        Contains the coordinates for the optional bounding box coordinated entered in the geocoding request.
     */

    public void setFilterBBox(java.util.Collection<Double> filterBBox) {
        if (filterBBox == null) {
            this.filterBBox = null;
            return;
        }

        this.filterBBox = new java.util.ArrayList<Double>(filterBBox);
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box coordinated entered in the geocoding request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterBBox(java.util.Collection)} or {@link #withFilterBBox(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterBBox
     *        Contains the coordinates for the optional bounding box coordinated entered in the geocoding request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withFilterBBox(Double... filterBBox) {
        if (this.filterBBox == null) {
            setFilterBBox(new java.util.ArrayList<Double>(filterBBox.length));
        }
        for (Double ele : filterBBox) {
            this.filterBBox.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the coordinates for the optional bounding box coordinated entered in the geocoding request.
     * </p>
     * 
     * @param filterBBox
     *        Contains the coordinates for the optional bounding box coordinated entered in the geocoding request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withFilterBBox(java.util.Collection<Double> filterBBox) {
        setFilterBBox(filterBBox);
        return this;
    }

    /**
     * <p>
     * Contains the country filter entered in the geocoding request.
     * </p>
     * 
     * @return Contains the country filter entered in the geocoding request.
     */

    public java.util.List<String> getFilterCountries() {
        return filterCountries;
    }

    /**
     * <p>
     * Contains the country filter entered in the geocoding request.
     * </p>
     * 
     * @param filterCountries
     *        Contains the country filter entered in the geocoding request.
     */

    public void setFilterCountries(java.util.Collection<String> filterCountries) {
        if (filterCountries == null) {
            this.filterCountries = null;
            return;
        }

        this.filterCountries = new java.util.ArrayList<String>(filterCountries);
    }

    /**
     * <p>
     * Contains the country filter entered in the geocoding request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterCountries(java.util.Collection)} or {@link #withFilterCountries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param filterCountries
     *        Contains the country filter entered in the geocoding request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withFilterCountries(String... filterCountries) {
        if (this.filterCountries == null) {
            setFilterCountries(new java.util.ArrayList<String>(filterCountries.length));
        }
        for (String ele : filterCountries) {
            this.filterCountries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the country filter entered in the geocoding request.
     * </p>
     * 
     * @param filterCountries
     *        Contains the country filter entered in the geocoding request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withFilterCountries(java.util.Collection<String> filterCountries) {
        setFilterCountries(filterCountries);
        return this;
    }

    /**
     * <p>
     * Contains the maximum number of results indicated for the request.
     * </p>
     * 
     * @param maxResults
     *        Contains the maximum number of results indicated for the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Contains the maximum number of results indicated for the request.
     * </p>
     * 
     * @return Contains the maximum number of results indicated for the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Contains the maximum number of results indicated for the request.
     * </p>
     * 
     * @param maxResults
     *        Contains the maximum number of results indicated for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A bounding box that contains the search results within the specified area indicated by <code>FilterBBox</code>. A
     * subset of bounding box specified using <code>FilterBBox</code>.
     * </p>
     * 
     * @return A bounding box that contains the search results within the specified area indicated by
     *         <code>FilterBBox</code>. A subset of bounding box specified using <code>FilterBBox</code>.
     */

    public java.util.List<Double> getResultBBox() {
        return resultBBox;
    }

    /**
     * <p>
     * A bounding box that contains the search results within the specified area indicated by <code>FilterBBox</code>. A
     * subset of bounding box specified using <code>FilterBBox</code>.
     * </p>
     * 
     * @param resultBBox
     *        A bounding box that contains the search results within the specified area indicated by
     *        <code>FilterBBox</code>. A subset of bounding box specified using <code>FilterBBox</code>.
     */

    public void setResultBBox(java.util.Collection<Double> resultBBox) {
        if (resultBBox == null) {
            this.resultBBox = null;
            return;
        }

        this.resultBBox = new java.util.ArrayList<Double>(resultBBox);
    }

    /**
     * <p>
     * A bounding box that contains the search results within the specified area indicated by <code>FilterBBox</code>. A
     * subset of bounding box specified using <code>FilterBBox</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultBBox(java.util.Collection)} or {@link #withResultBBox(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resultBBox
     *        A bounding box that contains the search results within the specified area indicated by
     *        <code>FilterBBox</code>. A subset of bounding box specified using <code>FilterBBox</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withResultBBox(Double... resultBBox) {
        if (this.resultBBox == null) {
            setResultBBox(new java.util.ArrayList<Double>(resultBBox.length));
        }
        for (Double ele : resultBBox) {
            this.resultBBox.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A bounding box that contains the search results within the specified area indicated by <code>FilterBBox</code>. A
     * subset of bounding box specified using <code>FilterBBox</code>.
     * </p>
     * 
     * @param resultBBox
     *        A bounding box that contains the search results within the specified area indicated by
     *        <code>FilterBBox</code>. A subset of bounding box specified using <code>FilterBBox</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withResultBBox(java.util.Collection<Double> resultBBox) {
        setResultBBox(resultBBox);
        return this;
    }

    /**
     * <p>
     * The address, name, city or region to be used in the geocoding request. In free-form text format. For example,
     * <code>Vancouver</code>.
     * </p>
     * 
     * @param text
     *        The address, name, city or region to be used in the geocoding request. In free-form text format. For
     *        example, <code>Vancouver</code>.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The address, name, city or region to be used in the geocoding request. In free-form text format. For example,
     * <code>Vancouver</code>.
     * </p>
     * 
     * @return The address, name, city or region to be used in the geocoding request. In free-form text format. For
     *         example, <code>Vancouver</code>.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The address, name, city or region to be used in the geocoding request. In free-form text format. For example,
     * <code>Vancouver</code>.
     * </p>
     * 
     * @param text
     *        The address, name, city or region to be used in the geocoding request. In free-form text format. For
     *        example, <code>Vancouver</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchPlaceIndexForTextSummary withText(String text) {
        setText(text);
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
        if (getBiasPosition() != null)
            sb.append("BiasPosition: ").append("***Sensitive Data Redacted***").append(",");
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getFilterBBox() != null)
            sb.append("FilterBBox: ").append("***Sensitive Data Redacted***").append(",");
        if (getFilterCountries() != null)
            sb.append("FilterCountries: ").append(getFilterCountries()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getResultBBox() != null)
            sb.append("ResultBBox: ").append("***Sensitive Data Redacted***").append(",");
        if (getText() != null)
            sb.append("Text: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchPlaceIndexForTextSummary == false)
            return false;
        SearchPlaceIndexForTextSummary other = (SearchPlaceIndexForTextSummary) obj;
        if (other.getBiasPosition() == null ^ this.getBiasPosition() == null)
            return false;
        if (other.getBiasPosition() != null && other.getBiasPosition().equals(this.getBiasPosition()) == false)
            return false;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getFilterBBox() == null ^ this.getFilterBBox() == null)
            return false;
        if (other.getFilterBBox() != null && other.getFilterBBox().equals(this.getFilterBBox()) == false)
            return false;
        if (other.getFilterCountries() == null ^ this.getFilterCountries() == null)
            return false;
        if (other.getFilterCountries() != null && other.getFilterCountries().equals(this.getFilterCountries()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getResultBBox() == null ^ this.getResultBBox() == null)
            return false;
        if (other.getResultBBox() != null && other.getResultBBox().equals(this.getResultBBox()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBiasPosition() == null) ? 0 : getBiasPosition().hashCode());
        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getFilterBBox() == null) ? 0 : getFilterBBox().hashCode());
        hashCode = prime * hashCode + ((getFilterCountries() == null) ? 0 : getFilterCountries().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getResultBBox() == null) ? 0 : getResultBBox().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        return hashCode;
    }

    @Override
    public SearchPlaceIndexForTextSummary clone() {
        try {
            return (SearchPlaceIndexForTextSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.SearchPlaceIndexForTextSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
