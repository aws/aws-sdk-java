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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateTracker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrackerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional description for the tracker resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A key identifier for an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS
     * customer managed key</a>. Enter a key ID, key ARN, alias name, or alias ARN.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     * location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds
     * is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are ignored.
     * Location updates within this area are neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and historical device positions to paginate
     * through. Distance-based filtering can also reduce the effects of GPS noise when displaying device trajectories on
     * a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     * ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m, the
     * second update is ignored if the device has moved less than 15 m. Ignored location updates are neither evaluated
     * against linked geofence collections, nor stored. This can reduce the effects of GPS noise when displaying device
     * trajectories on a map, and can help control your costs by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This field is optional. If not specified, the default value is <code>TimeBased</code>.
     * </p>
     */
    private String positionFiltering;
    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     */
    @Deprecated
    private String pricingPlan;
    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     */
    @Deprecated
    private String pricingPlanDataSource;
    /**
     * <p>
     * Applies one or more tags to the tracker resource. A tag is a key-value pair helps manage, identify, search, and
     * filter your resources by labelling them.
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
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
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
     * The name for the tracker resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique tracker resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleTracker</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String trackerName;

    /**
     * <p>
     * An optional description for the tracker resource.
     * </p>
     * 
     * @param description
     *        An optional description for the tracker resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the tracker resource.
     * </p>
     * 
     * @return An optional description for the tracker resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the tracker resource.
     * </p>
     * 
     * @param description
     *        An optional description for the tracker resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrackerRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A key identifier for an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS
     * customer managed key</a>. Enter a key ID, key ARN, alias name, or alias ARN.
     * </p>
     * 
     * @param kmsKeyId
     *        A key identifier for an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS customer managed
     *        key</a>. Enter a key ID, key ARN, alias name, or alias ARN.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * A key identifier for an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS
     * customer managed key</a>. Enter a key ID, key ARN, alias name, or alias ARN.
     * </p>
     * 
     * @return A key identifier for an <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS customer managed
     *         key</a>. Enter a key ID, key ARN, alias name, or alias ARN.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * A key identifier for an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS
     * customer managed key</a>. Enter a key ID, key ARN, alias name, or alias ARN.
     * </p>
     * 
     * @param kmsKeyId
     *        A key identifier for an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS customer managed
     *        key</a>. Enter a key ID, key ARN, alias name, or alias ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrackerRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     * location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds
     * is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are ignored.
     * Location updates within this area are neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and historical device positions to paginate
     * through. Distance-based filtering can also reduce the effects of GPS noise when displaying device trajectories on
     * a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     * ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m, the
     * second update is ignored if the device has moved less than 15 m. Ignored location updates are neither evaluated
     * against linked geofence collections, nor stored. This can reduce the effects of GPS noise when displaying device
     * trajectories on a map, and can help control your costs by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This field is optional. If not specified, the default value is <code>TimeBased</code>.
     * </p>
     * 
     * @param positionFiltering
     *        Specifies the position filtering for the tracker resource.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     *        location update is stored. If your update frequency is more often than 30 seconds, only one update per 30
     *        seconds is stored for each unique device ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are
     *        ignored. Location updates within this area are neither evaluated against linked geofence collections, nor
     *        stored. This helps control costs by reducing the number of geofence evaluations and historical device
     *        positions to paginate through. Distance-based filtering can also reduce the effects of GPS noise when
     *        displaying device trajectories on a map.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     *        ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m,
     *        the second update is ignored if the device has moved less than 15 m. Ignored location updates are neither
     *        evaluated against linked geofence collections, nor stored. This can reduce the effects of GPS noise when
     *        displaying device trajectories on a map, and can help control your costs by reducing the number of
     *        geofence evaluations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This field is optional. If not specified, the default value is <code>TimeBased</code>.
     * @see PositionFiltering
     */

    public void setPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
    }

    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     * location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds
     * is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are ignored.
     * Location updates within this area are neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and historical device positions to paginate
     * through. Distance-based filtering can also reduce the effects of GPS noise when displaying device trajectories on
     * a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     * ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m, the
     * second update is ignored if the device has moved less than 15 m. Ignored location updates are neither evaluated
     * against linked geofence collections, nor stored. This can reduce the effects of GPS noise when displaying device
     * trajectories on a map, and can help control your costs by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This field is optional. If not specified, the default value is <code>TimeBased</code>.
     * </p>
     * 
     * @return Specifies the position filtering for the tracker resource.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not
     *         every location update is stored. If your update frequency is more often than 30 seconds, only one update
     *         per 30 seconds is stored for each unique device ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are
     *         ignored. Location updates within this area are neither evaluated against linked geofence collections, nor
     *         stored. This helps control costs by reducing the number of geofence evaluations and historical device
     *         positions to paginate through. Distance-based filtering can also reduce the effects of GPS noise when
     *         displaying device trajectories on a map.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates
     *         are ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and
     *         10 m, the second update is ignored if the device has moved less than 15 m. Ignored location updates are
     *         neither evaluated against linked geofence collections, nor stored. This can reduce the effects of GPS
     *         noise when displaying device trajectories on a map, and can help control your costs by reducing the
     *         number of geofence evaluations.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This field is optional. If not specified, the default value is <code>TimeBased</code>.
     * @see PositionFiltering
     */

    public String getPositionFiltering() {
        return this.positionFiltering;
    }

    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     * location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds
     * is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are ignored.
     * Location updates within this area are neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and historical device positions to paginate
     * through. Distance-based filtering can also reduce the effects of GPS noise when displaying device trajectories on
     * a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     * ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m, the
     * second update is ignored if the device has moved less than 15 m. Ignored location updates are neither evaluated
     * against linked geofence collections, nor stored. This can reduce the effects of GPS noise when displaying device
     * trajectories on a map, and can help control your costs by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This field is optional. If not specified, the default value is <code>TimeBased</code>.
     * </p>
     * 
     * @param positionFiltering
     *        Specifies the position filtering for the tracker resource.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     *        location update is stored. If your update frequency is more often than 30 seconds, only one update per 30
     *        seconds is stored for each unique device ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are
     *        ignored. Location updates within this area are neither evaluated against linked geofence collections, nor
     *        stored. This helps control costs by reducing the number of geofence evaluations and historical device
     *        positions to paginate through. Distance-based filtering can also reduce the effects of GPS noise when
     *        displaying device trajectories on a map.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     *        ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m,
     *        the second update is ignored if the device has moved less than 15 m. Ignored location updates are neither
     *        evaluated against linked geofence collections, nor stored. This can reduce the effects of GPS noise when
     *        displaying device trajectories on a map, and can help control your costs by reducing the number of
     *        geofence evaluations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This field is optional. If not specified, the default value is <code>TimeBased</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionFiltering
     */

    public CreateTrackerRequest withPositionFiltering(String positionFiltering) {
        setPositionFiltering(positionFiltering);
        return this;
    }

    /**
     * <p>
     * Specifies the position filtering for the tracker resource.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     * location update is stored. If your update frequency is more often than 30 seconds, only one update per 30 seconds
     * is stored for each unique device ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are ignored.
     * Location updates within this area are neither evaluated against linked geofence collections, nor stored. This
     * helps control costs by reducing the number of geofence evaluations and historical device positions to paginate
     * through. Distance-based filtering can also reduce the effects of GPS noise when displaying device trajectories on
     * a map.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     * ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m, the
     * second update is ignored if the device has moved less than 15 m. Ignored location updates are neither evaluated
     * against linked geofence collections, nor stored. This can reduce the effects of GPS noise when displaying device
     * trajectories on a map, and can help control your costs by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This field is optional. If not specified, the default value is <code>TimeBased</code>.
     * </p>
     * 
     * @param positionFiltering
     *        Specifies the position filtering for the tracker resource.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TimeBased</code> - Location updates are evaluated against linked geofence collections, but not every
     *        location update is stored. If your update frequency is more often than 30 seconds, only one update per 30
     *        seconds is stored for each unique device ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DistanceBased</code> - If the device has moved less than 30 m (98.4 ft), location updates are
     *        ignored. Location updates within this area are neither evaluated against linked geofence collections, nor
     *        stored. This helps control costs by reducing the number of geofence evaluations and historical device
     *        positions to paginate through. Distance-based filtering can also reduce the effects of GPS noise when
     *        displaying device trajectories on a map.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     *        ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m,
     *        the second update is ignored if the device has moved less than 15 m. Ignored location updates are neither
     *        evaluated against linked geofence collections, nor stored. This can reduce the effects of GPS noise when
     *        displaying device trajectories on a map, and can help control your costs by reducing the number of
     *        geofence evaluations.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This field is optional. If not specified, the default value is <code>TimeBased</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionFiltering
     */

    public CreateTrackerRequest withPositionFiltering(PositionFiltering positionFiltering) {
        this.positionFiltering = positionFiltering.toString();
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
    public CreateTrackerRequest withPricingPlan(String pricingPlan) {
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
    public CreateTrackerRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     * 
     * @param pricingPlanDataSource
     *        This parameter is no longer used.
     */
    @Deprecated
    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     * 
     * @return This parameter is no longer used.
     */
    @Deprecated
    public String getPricingPlanDataSource() {
        return this.pricingPlanDataSource;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     * 
     * @param pricingPlanDataSource
     *        This parameter is no longer used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public CreateTrackerRequest withPricingPlanDataSource(String pricingPlanDataSource) {
        setPricingPlanDataSource(pricingPlanDataSource);
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the tracker resource. A tag is a key-value pair helps manage, identify, search, and
     * filter your resources by labelling them.
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
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot use "aws:" as a prefix for a key.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Applies one or more tags to the tracker resource. A tag is a key-value pair helps manage, identify,
     *         search, and filter your resources by labelling them.</p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     *         </p>
     *         <p>
     *         Restrictions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum 50 tags per resource
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Each resource tag must be unique with a maximum of one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length: 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length: 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
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
     * Applies one or more tags to the tracker resource. A tag is a key-value pair helps manage, identify, search, and
     * filter your resources by labelling them.
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
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
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
     *        Applies one or more tags to the tracker resource. A tag is a key-value pair helps manage, identify,
     *        search, and filter your resources by labelling them.</p>
     *        <p>
     *        Format: <code>"key" : "value"</code>
     *        </p>
     *        <p>
     *        Restrictions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum 50 tags per resource
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each resource tag must be unique with a maximum of one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
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
     * Applies one or more tags to the tracker resource. A tag is a key-value pair helps manage, identify, search, and
     * filter your resources by labelling them.
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
     * Maximum 50 tags per resource
     * </p>
     * </li>
     * <li>
     * <p>
     * Each resource tag must be unique with a maximum of one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length: 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length: 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
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
     *        Applies one or more tags to the tracker resource. A tag is a key-value pair helps manage, identify,
     *        search, and filter your resources by labelling them.</p>
     *        <p>
     *        Format: <code>"key" : "value"</code>
     *        </p>
     *        <p>
     *        Restrictions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum 50 tags per resource
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Each resource tag must be unique with a maximum of one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length: 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length: 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot use "aws:" as a prefix for a key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrackerRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateTrackerRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrackerRequest addTagsEntry(String key, String value) {
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

    public CreateTrackerRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name for the tracker resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique tracker resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleTracker</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trackerName
     *        The name for the tracker resource.</p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and underscores (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique tracker resource name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExampleTracker</code>.
     *        </p>
     *        </li>
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name for the tracker resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique tracker resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleTracker</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name for the tracker resource.</p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique tracker resource name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExampleTracker</code>.
     *         </p>
     *         </li>
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The name for the tracker resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique tracker resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleTracker</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trackerName
     *        The name for the tracker resource.</p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-), periods (.), and underscores (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique tracker resource name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExampleTracker</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrackerRequest withTrackerName(String trackerName) {
        setTrackerName(trackerName);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPositionFiltering() != null)
            sb.append("PositionFiltering: ").append(getPositionFiltering()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan()).append(",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: ").append(getPricingPlanDataSource()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTrackerName() != null)
            sb.append("TrackerName: ").append(getTrackerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrackerRequest == false)
            return false;
        CreateTrackerRequest other = (CreateTrackerRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPositionFiltering() == null ^ this.getPositionFiltering() == null)
            return false;
        if (other.getPositionFiltering() != null && other.getPositionFiltering().equals(this.getPositionFiltering()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getPricingPlanDataSource() == null ^ this.getPricingPlanDataSource() == null)
            return false;
        if (other.getPricingPlanDataSource() != null && other.getPricingPlanDataSource().equals(this.getPricingPlanDataSource()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPositionFiltering() == null) ? 0 : getPositionFiltering().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrackerRequest clone() {
        return (CreateTrackerRequest) super.clone();
    }

}
