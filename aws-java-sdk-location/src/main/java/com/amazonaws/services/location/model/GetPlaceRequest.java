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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetPlace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPlaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the place index resource that you want to use for the search.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The preferred language used to return results. The value must be a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the results themselves. If no language is
     * specified, or not supported for a particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     * <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code> in the
     * results will more likely be returned as <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be in a language that the provider does
     * support.
     * </p>
     */
    private String language;
    /**
     * <p>
     * The identifier of the place to find.
     * </p>
     * <p>
     * While you can use PlaceID in subsequent requests, PlaceID is not intended to be a permanent identifier and the ID
     * can change between consecutive API calls. Please see the following PlaceID behaviour for each data provider:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri: Place IDs will change every quarter at a minimum. The typical time period for these changes would be March,
     * June, September, and December. Place IDs might also change between the typical quarterly change but that will be
     * much less frequent.
     * </p>
     * </li>
     * <li>
     * <p>
     * HERE: We recommend that you cache data for no longer than a week to keep your data data fresh. You can assume
     * that less than 1% ID shifts will release over release which is approximately 1 - 2 times per week.
     * </p>
     * </li>
     * <li>
     * <p>
     * Grab: Place IDs can expire or become invalid in the following situations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data operations: The POI may be removed from Grab POI database by Grab Map Ops based on the ground-truth, such as
     * being closed in the real world, being detected as a duplicate POI, or having incorrect information. Grab will
     * synchronize data to the Waypoint environment on weekly basis.
     * </p>
     * </li>
     * <li>
     * <p>
     * Interpolated POI: Interpolated POI is a temporary POI generated in real time when serving a request, and it will
     * be marked as derived in the <code>place.result_type</code> field in the response. The information of interpolated
     * POIs will be retained for at least 30 days, which means that within 30 days, you are able to obtain POI details
     * by Place ID from Place Details API. After 30 days, the interpolated POIs(both Place ID and details) may expire
     * and inaccessible from the Places Details API.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String placeId;

    /**
     * <p>
     * The name of the place index resource that you want to use for the search.
     * </p>
     * 
     * @param indexName
     *        The name of the place index resource that you want to use for the search.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the place index resource that you want to use for the search.
     * </p>
     * 
     * @return The name of the place index resource that you want to use for the search.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the place index resource that you want to use for the search.
     * </p>
     * 
     * @param indexName
     *        The name of the place index resource that you want to use for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaceRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     * 
     * @param key
     *        The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API
     *        key</a> to authorize the request.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     * 
     * @return The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API
     *         key</a> to authorize the request.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API key</a>
     * to authorize the request.
     * </p>
     * 
     * @param key
     *        The optional <a href="https://docs.aws.amazon.com/location/latest/developerguide/using-apikeys.html">API
     *        key</a> to authorize the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaceRequest withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the results themselves. If no language is
     * specified, or not supported for a particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     * <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code> in the
     * results will more likely be returned as <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be in a language that the provider does
     * support.
     * </p>
     * 
     * @param language
     *        The preferred language used to return results. The value must be a valid <a
     *        href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for
     *        English.</p>
     *        <p>
     *        This setting affects the languages used in the results, but not the results themselves. If no language is
     *        specified, or not supported for a particular result, the partner automatically chooses a language for the
     *        result.
     *        </p>
     *        <p>
     *        For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     *        <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most
     *        likely be returned as <code>Athens</code>.
     *        </p>
     *        <p>
     *        If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code>
     *        in the results will more likely be returned as <code>Αθήνα</code>.
     *        </p>
     *        <p>
     *        If the data provider does not have a value for Greek, the result will be in a language that the provider
     *        does support.
     */

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the results themselves. If no language is
     * specified, or not supported for a particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     * <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code> in the
     * results will more likely be returned as <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be in a language that the provider does
     * support.
     * </p>
     * 
     * @return The preferred language used to return results. The value must be a valid <a
     *         href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for
     *         English.</p>
     *         <p>
     *         This setting affects the languages used in the results, but not the results themselves. If no language is
     *         specified, or not supported for a particular result, the partner automatically chooses a language for the
     *         result.
     *         </p>
     *         <p>
     *         For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     *         <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most
     *         likely be returned as <code>Athens</code>.
     *         </p>
     *         <p>
     *         If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code>
     *         in the results will more likely be returned as <code>Αθήνα</code>.
     *         </p>
     *         <p>
     *         If the data provider does not have a value for Greek, the result will be in a language that the provider
     *         does support.
     */

    public String getLanguage() {
        return this.language;
    }

    /**
     * <p>
     * The preferred language used to return results. The value must be a valid <a
     * href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for English.
     * </p>
     * <p>
     * This setting affects the languages used in the results, but not the results themselves. If no language is
     * specified, or not supported for a particular result, the partner automatically chooses a language for the result.
     * </p>
     * <p>
     * For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     * <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most likely be
     * returned as <code>Athens</code>.
     * </p>
     * <p>
     * If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code> in the
     * results will more likely be returned as <code>Αθήνα</code>.
     * </p>
     * <p>
     * If the data provider does not have a value for Greek, the result will be in a language that the provider does
     * support.
     * </p>
     * 
     * @param language
     *        The preferred language used to return results. The value must be a valid <a
     *        href="https://tools.ietf.org/search/bcp47">BCP 47</a> language tag, for example, <code>en</code> for
     *        English.</p>
     *        <p>
     *        This setting affects the languages used in the results, but not the results themselves. If no language is
     *        specified, or not supported for a particular result, the partner automatically chooses a language for the
     *        result.
     *        </p>
     *        <p>
     *        For an example, we'll use the Greek language. You search for a location around Athens, Greece, with the
     *        <code>language</code> parameter set to <code>en</code>. The <code>city</code> in the results will most
     *        likely be returned as <code>Athens</code>.
     *        </p>
     *        <p>
     *        If you set the <code>language</code> parameter to <code>el</code>, for Greek, then the <code>city</code>
     *        in the results will more likely be returned as <code>Αθήνα</code>.
     *        </p>
     *        <p>
     *        If the data provider does not have a value for Greek, the result will be in a language that the provider
     *        does support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaceRequest withLanguage(String language) {
        setLanguage(language);
        return this;
    }

    /**
     * <p>
     * The identifier of the place to find.
     * </p>
     * <p>
     * While you can use PlaceID in subsequent requests, PlaceID is not intended to be a permanent identifier and the ID
     * can change between consecutive API calls. Please see the following PlaceID behaviour for each data provider:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri: Place IDs will change every quarter at a minimum. The typical time period for these changes would be March,
     * June, September, and December. Place IDs might also change between the typical quarterly change but that will be
     * much less frequent.
     * </p>
     * </li>
     * <li>
     * <p>
     * HERE: We recommend that you cache data for no longer than a week to keep your data data fresh. You can assume
     * that less than 1% ID shifts will release over release which is approximately 1 - 2 times per week.
     * </p>
     * </li>
     * <li>
     * <p>
     * Grab: Place IDs can expire or become invalid in the following situations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data operations: The POI may be removed from Grab POI database by Grab Map Ops based on the ground-truth, such as
     * being closed in the real world, being detected as a duplicate POI, or having incorrect information. Grab will
     * synchronize data to the Waypoint environment on weekly basis.
     * </p>
     * </li>
     * <li>
     * <p>
     * Interpolated POI: Interpolated POI is a temporary POI generated in real time when serving a request, and it will
     * be marked as derived in the <code>place.result_type</code> field in the response. The information of interpolated
     * POIs will be retained for at least 30 days, which means that within 30 days, you are able to obtain POI details
     * by Place ID from Place Details API. After 30 days, the interpolated POIs(both Place ID and details) may expire
     * and inaccessible from the Places Details API.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param placeId
     *        The identifier of the place to find.</p>
     *        <p>
     *        While you can use PlaceID in subsequent requests, PlaceID is not intended to be a permanent identifier and
     *        the ID can change between consecutive API calls. Please see the following PlaceID behaviour for each data
     *        provider:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Esri: Place IDs will change every quarter at a minimum. The typical time period for these changes would be
     *        March, June, September, and December. Place IDs might also change between the typical quarterly change but
     *        that will be much less frequent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HERE: We recommend that you cache data for no longer than a week to keep your data data fresh. You can
     *        assume that less than 1% ID shifts will release over release which is approximately 1 - 2 times per week.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Grab: Place IDs can expire or become invalid in the following situations.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Data operations: The POI may be removed from Grab POI database by Grab Map Ops based on the ground-truth,
     *        such as being closed in the real world, being detected as a duplicate POI, or having incorrect
     *        information. Grab will synchronize data to the Waypoint environment on weekly basis.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Interpolated POI: Interpolated POI is a temporary POI generated in real time when serving a request, and
     *        it will be marked as derived in the <code>place.result_type</code> field in the response. The information
     *        of interpolated POIs will be retained for at least 30 days, which means that within 30 days, you are able
     *        to obtain POI details by Place ID from Place Details API. After 30 days, the interpolated POIs(both Place
     *        ID and details) may expire and inaccessible from the Places Details API.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    /**
     * <p>
     * The identifier of the place to find.
     * </p>
     * <p>
     * While you can use PlaceID in subsequent requests, PlaceID is not intended to be a permanent identifier and the ID
     * can change between consecutive API calls. Please see the following PlaceID behaviour for each data provider:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri: Place IDs will change every quarter at a minimum. The typical time period for these changes would be March,
     * June, September, and December. Place IDs might also change between the typical quarterly change but that will be
     * much less frequent.
     * </p>
     * </li>
     * <li>
     * <p>
     * HERE: We recommend that you cache data for no longer than a week to keep your data data fresh. You can assume
     * that less than 1% ID shifts will release over release which is approximately 1 - 2 times per week.
     * </p>
     * </li>
     * <li>
     * <p>
     * Grab: Place IDs can expire or become invalid in the following situations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data operations: The POI may be removed from Grab POI database by Grab Map Ops based on the ground-truth, such as
     * being closed in the real world, being detected as a duplicate POI, or having incorrect information. Grab will
     * synchronize data to the Waypoint environment on weekly basis.
     * </p>
     * </li>
     * <li>
     * <p>
     * Interpolated POI: Interpolated POI is a temporary POI generated in real time when serving a request, and it will
     * be marked as derived in the <code>place.result_type</code> field in the response. The information of interpolated
     * POIs will be retained for at least 30 days, which means that within 30 days, you are able to obtain POI details
     * by Place ID from Place Details API. After 30 days, the interpolated POIs(both Place ID and details) may expire
     * and inaccessible from the Places Details API.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The identifier of the place to find.</p>
     *         <p>
     *         While you can use PlaceID in subsequent requests, PlaceID is not intended to be a permanent identifier
     *         and the ID can change between consecutive API calls. Please see the following PlaceID behaviour for each
     *         data provider:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Esri: Place IDs will change every quarter at a minimum. The typical time period for these changes would
     *         be March, June, September, and December. Place IDs might also change between the typical quarterly change
     *         but that will be much less frequent.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         HERE: We recommend that you cache data for no longer than a week to keep your data data fresh. You can
     *         assume that less than 1% ID shifts will release over release which is approximately 1 - 2 times per week.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Grab: Place IDs can expire or become invalid in the following situations.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Data operations: The POI may be removed from Grab POI database by Grab Map Ops based on the ground-truth,
     *         such as being closed in the real world, being detected as a duplicate POI, or having incorrect
     *         information. Grab will synchronize data to the Waypoint environment on weekly basis.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Interpolated POI: Interpolated POI is a temporary POI generated in real time when serving a request, and
     *         it will be marked as derived in the <code>place.result_type</code> field in the response. The information
     *         of interpolated POIs will be retained for at least 30 days, which means that within 30 days, you are able
     *         to obtain POI details by Place ID from Place Details API. After 30 days, the interpolated POIs(both Place
     *         ID and details) may expire and inaccessible from the Places Details API.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getPlaceId() {
        return this.placeId;
    }

    /**
     * <p>
     * The identifier of the place to find.
     * </p>
     * <p>
     * While you can use PlaceID in subsequent requests, PlaceID is not intended to be a permanent identifier and the ID
     * can change between consecutive API calls. Please see the following PlaceID behaviour for each data provider:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Esri: Place IDs will change every quarter at a minimum. The typical time period for these changes would be March,
     * June, September, and December. Place IDs might also change between the typical quarterly change but that will be
     * much less frequent.
     * </p>
     * </li>
     * <li>
     * <p>
     * HERE: We recommend that you cache data for no longer than a week to keep your data data fresh. You can assume
     * that less than 1% ID shifts will release over release which is approximately 1 - 2 times per week.
     * </p>
     * </li>
     * <li>
     * <p>
     * Grab: Place IDs can expire or become invalid in the following situations.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Data operations: The POI may be removed from Grab POI database by Grab Map Ops based on the ground-truth, such as
     * being closed in the real world, being detected as a duplicate POI, or having incorrect information. Grab will
     * synchronize data to the Waypoint environment on weekly basis.
     * </p>
     * </li>
     * <li>
     * <p>
     * Interpolated POI: Interpolated POI is a temporary POI generated in real time when serving a request, and it will
     * be marked as derived in the <code>place.result_type</code> field in the response. The information of interpolated
     * POIs will be retained for at least 30 days, which means that within 30 days, you are able to obtain POI details
     * by Place ID from Place Details API. After 30 days, the interpolated POIs(both Place ID and details) may expire
     * and inaccessible from the Places Details API.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param placeId
     *        The identifier of the place to find.</p>
     *        <p>
     *        While you can use PlaceID in subsequent requests, PlaceID is not intended to be a permanent identifier and
     *        the ID can change between consecutive API calls. Please see the following PlaceID behaviour for each data
     *        provider:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Esri: Place IDs will change every quarter at a minimum. The typical time period for these changes would be
     *        March, June, September, and December. Place IDs might also change between the typical quarterly change but
     *        that will be much less frequent.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        HERE: We recommend that you cache data for no longer than a week to keep your data data fresh. You can
     *        assume that less than 1% ID shifts will release over release which is approximately 1 - 2 times per week.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Grab: Place IDs can expire or become invalid in the following situations.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Data operations: The POI may be removed from Grab POI database by Grab Map Ops based on the ground-truth,
     *        such as being closed in the real world, being detected as a duplicate POI, or having incorrect
     *        information. Grab will synchronize data to the Waypoint environment on weekly basis.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Interpolated POI: Interpolated POI is a temporary POI generated in real time when serving a request, and
     *        it will be marked as derived in the <code>place.result_type</code> field in the response. The information
     *        of interpolated POIs will be retained for at least 30 days, which means that within 30 days, you are able
     *        to obtain POI details by Place ID from Place Details API. After 30 days, the interpolated POIs(both Place
     *        ID and details) may expire and inaccessible from the Places Details API.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlaceRequest withPlaceId(String placeId) {
        setPlaceId(placeId);
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append("***Sensitive Data Redacted***").append(",");
        if (getLanguage() != null)
            sb.append("Language: ").append(getLanguage()).append(",");
        if (getPlaceId() != null)
            sb.append("PlaceId: ").append(getPlaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlaceRequest == false)
            return false;
        GetPlaceRequest other = (GetPlaceRequest) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getLanguage() == null ^ this.getLanguage() == null)
            return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false)
            return false;
        if (other.getPlaceId() == null ^ this.getPlaceId() == null)
            return false;
        if (other.getPlaceId() != null && other.getPlaceId().equals(this.getPlaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        hashCode = prime * hashCode + ((getPlaceId() == null) ? 0 : getPlaceId().hashCode());
        return hashCode;
    }

    @Override
    public GetPlaceRequest clone() {
        return (GetPlaceRequest) super.clone();
    }

}
