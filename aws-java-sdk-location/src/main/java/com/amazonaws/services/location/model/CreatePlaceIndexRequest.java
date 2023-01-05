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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreatePlaceIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlaceIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the geospatial data provider for the new place index.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For example, entering <code>HERE</code> returns an
     * error.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code> – For additional information about <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>'s coverage in your region of
     * interest, see <a href="https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm">Esri
     * details on geocoding coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies</a>' coverage in
     * your region of interest, see <a
     * href="https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html">HERE details on
     * goecoding coverage</a>.
     * </p>
     * <important>
     * <p>
     * If you specify HERE Technologies (<code>Here</code>) as the data provider, you may not <a
     * href="https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html">store
     * results</a> for locations in Japan. For more information, see the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location Service.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * For additional information , see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Data providers</a>
     * on the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * Specifies the data storage option requesting Places.
     * </p>
     */
    private DataSourceConfiguration dataSourceConfiguration;
    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String indexName;
    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     */
    @Deprecated
    private String pricingPlan;
    /**
     * <p>
     * Applies one or more tags to the place index resource. A tag is a key-value pair that helps you manage, identify,
     * search, and filter your resources.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each tag key must be unique and must have exactly one associated value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Specifies the geospatial data provider for the new place index.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For example, entering <code>HERE</code> returns an
     * error.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code> – For additional information about <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>'s coverage in your region of
     * interest, see <a href="https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm">Esri
     * details on geocoding coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies</a>' coverage in
     * your region of interest, see <a
     * href="https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html">HERE details on
     * goecoding coverage</a>.
     * </p>
     * <important>
     * <p>
     * If you specify HERE Technologies (<code>Here</code>) as the data provider, you may not <a
     * href="https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html">store
     * results</a> for locations in Japan. For more information, see the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location Service.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * For additional information , see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Data providers</a>
     * on the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * 
     * @param dataSource
     *        Specifies the geospatial data provider for the new place index.</p> <note>
     *        <p>
     *        This field is case-sensitive. Enter the valid values as shown. For example, entering <code>HERE</code>
     *        returns an error.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Esri</code> – For additional information about <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>'s coverage in your
     *        region of interest, see <a
     *        href="https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm">Esri details on
     *        geocoding coverage</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Here</code> – For additional information about <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies</a>'
     *        coverage in your region of interest, see <a
     *        href="https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html">HERE
     *        details on goecoding coverage</a>.
     *        </p>
     *        <important>
     *        <p>
     *        If you specify HERE Technologies (<code>Here</code>) as the data provider, you may not <a
     *        href="https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html"
     *        >store results</a> for locations in Japan. For more information, see the <a
     *        href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location Service.
     *        </p>
     *        </important></li>
     *        </ul>
     *        <p>
     *        For additional information , see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Data
     *        providers</a> on the <i>Amazon Location Service Developer Guide</i>.
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * Specifies the geospatial data provider for the new place index.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For example, entering <code>HERE</code> returns an
     * error.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code> – For additional information about <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>'s coverage in your region of
     * interest, see <a href="https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm">Esri
     * details on geocoding coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies</a>' coverage in
     * your region of interest, see <a
     * href="https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html">HERE details on
     * goecoding coverage</a>.
     * </p>
     * <important>
     * <p>
     * If you specify HERE Technologies (<code>Here</code>) as the data provider, you may not <a
     * href="https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html">store
     * results</a> for locations in Japan. For more information, see the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location Service.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * For additional information , see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Data providers</a>
     * on the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the geospatial data provider for the new place index.</p> <note>
     *         <p>
     *         This field is case-sensitive. Enter the valid values as shown. For example, entering <code>HERE</code>
     *         returns an error.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Esri</code> – For additional information about <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>'s coverage in your
     *         region of interest, see <a
     *         href="https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm">Esri details on
     *         geocoding coverage</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Here</code> – For additional information about <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies</a>'
     *         coverage in your region of interest, see <a
     *         href="https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html">HERE
     *         details on goecoding coverage</a>.
     *         </p>
     *         <important>
     *         <p>
     *         If you specify HERE Technologies (<code>Here</code>) as the data provider, you may not <a
     *         href="https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html"
     *         >store results</a> for locations in Japan. For more information, see the <a
     *         href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location Service.
     *         </p>
     *         </important></li>
     *         </ul>
     *         <p>
     *         For additional information , see <a
     *         href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Data
     *         providers</a> on the <i>Amazon Location Service Developer Guide</i>.
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * Specifies the geospatial data provider for the new place index.
     * </p>
     * <note>
     * <p>
     * This field is case-sensitive. Enter the valid values as shown. For example, entering <code>HERE</code> returns an
     * error.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Esri</code> – For additional information about <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>'s coverage in your region of
     * interest, see <a href="https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm">Esri
     * details on geocoding coverage</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Here</code> – For additional information about <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies</a>' coverage in
     * your region of interest, see <a
     * href="https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html">HERE details on
     * goecoding coverage</a>.
     * </p>
     * <important>
     * <p>
     * If you specify HERE Technologies (<code>Here</code>) as the data provider, you may not <a
     * href="https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html">store
     * results</a> for locations in Japan. For more information, see the <a
     * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location Service.
     * </p>
     * </important></li>
     * </ul>
     * <p>
     * For additional information , see <a
     * href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Data providers</a>
     * on the <i>Amazon Location Service Developer Guide</i>.
     * </p>
     * 
     * @param dataSource
     *        Specifies the geospatial data provider for the new place index.</p> <note>
     *        <p>
     *        This field is case-sensitive. Enter the valid values as shown. For example, entering <code>HERE</code>
     *        returns an error.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Esri</code> – For additional information about <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/esri.html">Esri</a>'s coverage in your
     *        region of interest, see <a
     *        href="https://developers.arcgis.com/rest/geocode/api-reference/geocode-coverage.htm">Esri details on
     *        geocoding coverage</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Here</code> – For additional information about <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/HERE.html">HERE Technologies</a>'
     *        coverage in your region of interest, see <a
     *        href="https://developer.here.com/documentation/geocoder/dev_guide/topics/coverage-geocoder.html">HERE
     *        details on goecoding coverage</a>.
     *        </p>
     *        <important>
     *        <p>
     *        If you specify HERE Technologies (<code>Here</code>) as the data provider, you may not <a
     *        href="https://docs.aws.amazon.com/location-places/latest/APIReference/API_DataSourceConfiguration.html"
     *        >store results</a> for locations in Japan. For more information, see the <a
     *        href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> for Amazon Location Service.
     *        </p>
     *        </important></li>
     *        </ul>
     *        <p>
     *        For additional information , see <a
     *        href="https://docs.aws.amazon.com/location/latest/developerguide/what-is-data-provider.html">Data
     *        providers</a> on the <i>Amazon Location Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * Specifies the data storage option requesting Places.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Specifies the data storage option requesting Places.
     */

    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
    }

    /**
     * <p>
     * Specifies the data storage option requesting Places.
     * </p>
     * 
     * @return Specifies the data storage option requesting Places.
     */

    public DataSourceConfiguration getDataSourceConfiguration() {
        return this.dataSourceConfiguration;
    }

    /**
     * <p>
     * Specifies the data storage option requesting Places.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Specifies the data storage option requesting Places.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest withDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        setDataSourceConfiguration(dataSourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * 
     * @param description
     *        The optional description for the place index resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * 
     * @return The optional description for the place index resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for the place index resource.
     * </p>
     * 
     * @param description
     *        The optional description for the place index resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexName
     *        The name of the place index resource. </p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique place index resource name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     *        </p>
     *        </li>
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the place index resource. </p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique place index resource name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     *         </p>
     *         </li>
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexName
     *        The name of the place index resource. </p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and underscores (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique place index resource name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @param pricingPlan
     *        No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @see PricingPlan
     */
    @Deprecated
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @return No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @see PricingPlan
     */
    @Deprecated
    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @param pricingPlan
     *        No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */
    @Deprecated
    public CreatePlaceIndexRequest withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @param pricingPlan
     *        No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */
    @Deprecated
    public CreatePlaceIndexRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the place index resource. A tag is a key-value pair that helps you manage, identify,
     * search, and filter your resources.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each tag key must be unique and must have exactly one associated value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Applies one or more tags to the place index resource. A tag is a key-value pair that helps you manage,
     *         identify, search, and filter your resources.</p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     *         </p>
     *         <p>
     *         Restrictions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum 50 tags per resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each tag key must be unique and must have exactly one associated value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot use "aws:" as a prefix for a key.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Applies one or more tags to the place index resource. A tag is a key-value pair that helps you manage, identify,
     * search, and filter your resources.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each tag key must be unique and must have exactly one associated value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Applies one or more tags to the place index resource. A tag is a key-value pair that helps you manage,
     *        identify, search, and filter your resources.</p>
     *        <p>
     *        Format: <code>"key" : "value"</code>
     *        </p>
     *        <p>
     *        Restrictions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum 50 tags per resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each tag key must be unique and must have exactly one associated value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot use "aws:" as a prefix for a key.
     *        </p>
     *        </li>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Applies one or more tags to the place index resource. A tag is a key-value pair that helps you manage, identify,
     * search, and filter your resources.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * <p>
     * Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum 50 tags per resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Each tag key must be unique and must have exactly one associated value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        Applies one or more tags to the place index resource. A tag is a key-value pair that helps you manage,
     *        identify, search, and filter your resources.</p>
     *        <p>
     *        Format: <code>"key" : "value"</code>
     *        </p>
     *        <p>
     *        Restrictions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum 50 tags per resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each tag key must be unique and must have exactly one associated value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot use "aws:" as a prefix for a key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreatePlaceIndexRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getDataSourceConfiguration() != null)
            sb.append("DataSourceConfiguration: ").append(getDataSourceConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlaceIndexRequest == false)
            return false;
        CreatePlaceIndexRequest other = (CreatePlaceIndexRequest) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDataSourceConfiguration() == null ^ this.getDataSourceConfiguration() == null)
            return false;
        if (other.getDataSourceConfiguration() != null && other.getDataSourceConfiguration().equals(this.getDataSourceConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDataSourceConfiguration() == null) ? 0 : getDataSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlaceIndexRequest clone() {
        return (CreatePlaceIndexRequest) super.clone();
    }

}
