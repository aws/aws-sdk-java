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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateTracker" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrackerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and <code>EXIT</code> events for geofences with
     * this tracker. Those events are always sent to EventBridge.
     * </p>
     * </note>
     */
    private Boolean eventBridgeEnabled;
    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">Amazon Web Services KMS customer
     * managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     */
    private Boolean kmsKeyEnableGeospatialQueries;
    /**
     * <p>
     * Updates the position filtering for the tracker resource.
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
     * Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This
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
     * against linked geofence collections, nor stored. This helps educe the effects of GPS noise when displaying device
     * trajectories on a map, and can help control costs by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
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
     * The name of the tracker resource to update.
     * </p>
     */
    private String trackerName;

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * 
     * @param description
     *        Updates the description for the tracker resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * 
     * @return Updates the description for the tracker resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Updates the description for the tracker resource.
     * </p>
     * 
     * @param description
     *        Updates the description for the tracker resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrackerRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and <code>EXIT</code> events for geofences with
     * this tracker. Those events are always sent to EventBridge.
     * </p>
     * </note>
     * 
     * @param eventBridgeEnabled
     *        Whether to enable position <code>UPDATE</code> events from this tracker to be sent to EventBridge.</p>
     *        <note>
     *        <p>
     *        You do not need enable this feature to get <code>ENTER</code> and <code>EXIT</code> events for geofences
     *        with this tracker. Those events are always sent to EventBridge.
     *        </p>
     */

    public void setEventBridgeEnabled(Boolean eventBridgeEnabled) {
        this.eventBridgeEnabled = eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and <code>EXIT</code> events for geofences with
     * this tracker. Those events are always sent to EventBridge.
     * </p>
     * </note>
     * 
     * @return Whether to enable position <code>UPDATE</code> events from this tracker to be sent to EventBridge.</p>
     *         <note>
     *         <p>
     *         You do not need enable this feature to get <code>ENTER</code> and <code>EXIT</code> events for geofences
     *         with this tracker. Those events are always sent to EventBridge.
     *         </p>
     */

    public Boolean getEventBridgeEnabled() {
        return this.eventBridgeEnabled;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and <code>EXIT</code> events for geofences with
     * this tracker. Those events are always sent to EventBridge.
     * </p>
     * </note>
     * 
     * @param eventBridgeEnabled
     *        Whether to enable position <code>UPDATE</code> events from this tracker to be sent to EventBridge.</p>
     *        <note>
     *        <p>
     *        You do not need enable this feature to get <code>ENTER</code> and <code>EXIT</code> events for geofences
     *        with this tracker. Those events are always sent to EventBridge.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrackerRequest withEventBridgeEnabled(Boolean eventBridgeEnabled) {
        setEventBridgeEnabled(eventBridgeEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to enable position <code>UPDATE</code> events from this tracker to be sent to EventBridge.
     * </p>
     * <note>
     * <p>
     * You do not need enable this feature to get <code>ENTER</code> and <code>EXIT</code> events for geofences with
     * this tracker. Those events are always sent to EventBridge.
     * </p>
     * </note>
     * 
     * @return Whether to enable position <code>UPDATE</code> events from this tracker to be sent to EventBridge.</p>
     *         <note>
     *         <p>
     *         You do not need enable this feature to get <code>ENTER</code> and <code>EXIT</code> events for geofences
     *         with this tracker. Those events are always sent to EventBridge.
     *         </p>
     */

    public Boolean isEventBridgeEnabled() {
        return this.eventBridgeEnabled;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">Amazon Web Services KMS customer
     * managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     * 
     * @param kmsKeyEnableGeospatialQueries
     *        Enables <code>GeospatialQueries</code> for a tracker that uses a <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">Amazon Web Services KMS
     *        customer managed key</a>.</p>
     *        <p>
     *        This parameter is only used if you are using a KMS customer managed key.
     */

    public void setKmsKeyEnableGeospatialQueries(Boolean kmsKeyEnableGeospatialQueries) {
        this.kmsKeyEnableGeospatialQueries = kmsKeyEnableGeospatialQueries;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">Amazon Web Services KMS customer
     * managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     * 
     * @return Enables <code>GeospatialQueries</code> for a tracker that uses a <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">Amazon Web Services KMS
     *         customer managed key</a>.</p>
     *         <p>
     *         This parameter is only used if you are using a KMS customer managed key.
     */

    public Boolean getKmsKeyEnableGeospatialQueries() {
        return this.kmsKeyEnableGeospatialQueries;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">Amazon Web Services KMS customer
     * managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     * 
     * @param kmsKeyEnableGeospatialQueries
     *        Enables <code>GeospatialQueries</code> for a tracker that uses a <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">Amazon Web Services KMS
     *        customer managed key</a>.</p>
     *        <p>
     *        This parameter is only used if you are using a KMS customer managed key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrackerRequest withKmsKeyEnableGeospatialQueries(Boolean kmsKeyEnableGeospatialQueries) {
        setKmsKeyEnableGeospatialQueries(kmsKeyEnableGeospatialQueries);
        return this;
    }

    /**
     * <p>
     * Enables <code>GeospatialQueries</code> for a tracker that uses a <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">Amazon Web Services KMS customer
     * managed key</a>.
     * </p>
     * <p>
     * This parameter is only used if you are using a KMS customer managed key.
     * </p>
     * 
     * @return Enables <code>GeospatialQueries</code> for a tracker that uses a <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">Amazon Web Services KMS
     *         customer managed key</a>.</p>
     *         <p>
     *         This parameter is only used if you are using a KMS customer managed key.
     */

    public Boolean isKmsKeyEnableGeospatialQueries() {
        return this.kmsKeyEnableGeospatialQueries;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
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
     * Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This
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
     * against linked geofence collections, nor stored. This helps educe the effects of GPS noise when displaying device
     * trajectories on a map, and can help control costs by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param positionFiltering
     *        Updates the position filtering for the tracker resource.</p>
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
     *        ignored. Location updates within this distance are neither evaluated against linked geofence collections,
     *        nor stored. This helps control costs by reducing the number of geofence evaluations and historical device
     *        positions to paginate through. Distance-based filtering can also reduce the effects of GPS noise when
     *        displaying device trajectories on a map.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     *        ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m,
     *        the second update is ignored if the device has moved less than 15 m. Ignored location updates are neither
     *        evaluated against linked geofence collections, nor stored. This helps educe the effects of GPS noise when
     *        displaying device trajectories on a map, and can help control costs by reducing the number of geofence
     *        evaluations.
     *        </p>
     *        </li>
     * @see PositionFiltering
     */

    public void setPositionFiltering(String positionFiltering) {
        this.positionFiltering = positionFiltering;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
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
     * Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This
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
     * against linked geofence collections, nor stored. This helps educe the effects of GPS noise when displaying device
     * trajectories on a map, and can help control costs by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Updates the position filtering for the tracker resource.</p>
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
     *         ignored. Location updates within this distance are neither evaluated against linked geofence collections,
     *         nor stored. This helps control costs by reducing the number of geofence evaluations and historical device
     *         positions to paginate through. Distance-based filtering can also reduce the effects of GPS noise when
     *         displaying device trajectories on a map.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates
     *         are ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and
     *         10 m, the second update is ignored if the device has moved less than 15 m. Ignored location updates are
     *         neither evaluated against linked geofence collections, nor stored. This helps educe the effects of GPS
     *         noise when displaying device trajectories on a map, and can help control costs by reducing the number of
     *         geofence evaluations.
     *         </p>
     *         </li>
     * @see PositionFiltering
     */

    public String getPositionFiltering() {
        return this.positionFiltering;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
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
     * Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This
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
     * against linked geofence collections, nor stored. This helps educe the effects of GPS noise when displaying device
     * trajectories on a map, and can help control costs by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param positionFiltering
     *        Updates the position filtering for the tracker resource.</p>
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
     *        ignored. Location updates within this distance are neither evaluated against linked geofence collections,
     *        nor stored. This helps control costs by reducing the number of geofence evaluations and historical device
     *        positions to paginate through. Distance-based filtering can also reduce the effects of GPS noise when
     *        displaying device trajectories on a map.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     *        ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m,
     *        the second update is ignored if the device has moved less than 15 m. Ignored location updates are neither
     *        evaluated against linked geofence collections, nor stored. This helps educe the effects of GPS noise when
     *        displaying device trajectories on a map, and can help control costs by reducing the number of geofence
     *        evaluations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionFiltering
     */

    public UpdateTrackerRequest withPositionFiltering(String positionFiltering) {
        setPositionFiltering(positionFiltering);
        return this;
    }

    /**
     * <p>
     * Updates the position filtering for the tracker resource.
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
     * Location updates within this distance are neither evaluated against linked geofence collections, nor stored. This
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
     * against linked geofence collections, nor stored. This helps educe the effects of GPS noise when displaying device
     * trajectories on a map, and can help control costs by reducing the number of geofence evaluations.
     * </p>
     * </li>
     * </ul>
     * 
     * @param positionFiltering
     *        Updates the position filtering for the tracker resource.</p>
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
     *        ignored. Location updates within this distance are neither evaluated against linked geofence collections,
     *        nor stored. This helps control costs by reducing the number of geofence evaluations and historical device
     *        positions to paginate through. Distance-based filtering can also reduce the effects of GPS noise when
     *        displaying device trajectories on a map.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AccuracyBased</code> - If the device has moved less than the measured accuracy, location updates are
     *        ignored. For example, if two consecutive updates from a device have a horizontal accuracy of 5 m and 10 m,
     *        the second update is ignored if the device has moved less than 15 m. Ignored location updates are neither
     *        evaluated against linked geofence collections, nor stored. This helps educe the effects of GPS noise when
     *        displaying device trajectories on a map, and can help control costs by reducing the number of geofence
     *        evaluations.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PositionFiltering
     */

    public UpdateTrackerRequest withPositionFiltering(PositionFiltering positionFiltering) {
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
    public UpdateTrackerRequest withPricingPlan(String pricingPlan) {
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
    public UpdateTrackerRequest withPricingPlan(PricingPlan pricingPlan) {
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
    public UpdateTrackerRequest withPricingPlanDataSource(String pricingPlanDataSource) {
        setPricingPlanDataSource(pricingPlanDataSource);
        return this;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource to update.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * 
     * @return The name of the tracker resource to update.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrackerRequest withTrackerName(String trackerName) {
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
        if (getEventBridgeEnabled() != null)
            sb.append("EventBridgeEnabled: ").append(getEventBridgeEnabled()).append(",");
        if (getKmsKeyEnableGeospatialQueries() != null)
            sb.append("KmsKeyEnableGeospatialQueries: ").append(getKmsKeyEnableGeospatialQueries()).append(",");
        if (getPositionFiltering() != null)
            sb.append("PositionFiltering: ").append(getPositionFiltering()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan()).append(",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: ").append(getPricingPlanDataSource()).append(",");
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

        if (obj instanceof UpdateTrackerRequest == false)
            return false;
        UpdateTrackerRequest other = (UpdateTrackerRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventBridgeEnabled() == null ^ this.getEventBridgeEnabled() == null)
            return false;
        if (other.getEventBridgeEnabled() != null && other.getEventBridgeEnabled().equals(this.getEventBridgeEnabled()) == false)
            return false;
        if (other.getKmsKeyEnableGeospatialQueries() == null ^ this.getKmsKeyEnableGeospatialQueries() == null)
            return false;
        if (other.getKmsKeyEnableGeospatialQueries() != null
                && other.getKmsKeyEnableGeospatialQueries().equals(this.getKmsKeyEnableGeospatialQueries()) == false)
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
        hashCode = prime * hashCode + ((getEventBridgeEnabled() == null) ? 0 : getEventBridgeEnabled().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyEnableGeospatialQueries() == null) ? 0 : getKmsKeyEnableGeospatialQueries().hashCode());
        hashCode = prime * hashCode + ((getPositionFiltering() == null) ? 0 : getPositionFiltering().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrackerRequest clone() {
        return (UpdateTrackerRequest) super.clone();
    }

}
