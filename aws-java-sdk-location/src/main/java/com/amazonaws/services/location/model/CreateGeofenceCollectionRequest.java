/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateGeofenceCollection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGeofenceCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A custom name for the geofence collection.
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
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String collectionName;
    /**
     * <p>
     * An optional description for the geofence collection.
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
     * Specifies the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     */
    private String pricingPlan;
    /**
     * <p>
     * Specifies the data provider for the geofence collection.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required value for the following pricing plans: <code>MobileAssetTracking </code>|
     * <code>MobileAssetManagement</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about <a href="https://aws.amazon.com/location/data-providers/">Data Providers</a>, and <a
     * href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your geofence
     * collection. Your data won't be shared with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>Esri </code>| <code>Here</code>
     * </p>
     */
    private String pricingPlanDataSource;
    /**
     * <p>
     * Applies one or more tags to the geofence collection. A tag is a key-value pair helps manage, identify, search,
     * and filter your resources by labelling them.
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
     * </ul>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A custom name for the geofence collection.
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
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionName
     *        A custom name for the geofence collection.</p>
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
     *        Must be a unique geofence collection name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     *        </p>
     *        </li>
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * A custom name for the geofence collection.
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
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A custom name for the geofence collection.</p>
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
     *         Must be a unique geofence collection name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     *         </p>
     *         </li>
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * A custom name for the geofence collection.
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
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionName
     *        A custom name for the geofence collection.</p>
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
     *        Must be a unique geofence collection name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionRequest withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     * 
     * @param description
     *        An optional description for the geofence collection.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     * 
     * @return An optional description for the geofence collection.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     * 
     * @param description
     *        An optional description for the geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionRequest withDescription(String description) {
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

    public CreateGeofenceCollectionRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for the geofence collection.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @see PricingPlan
     */

    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @return Specifies the pricing plan for the geofence collection.</p>
     *         <p>
     *         For additional details and restrictions on each pricing plan option, see the <a
     *         href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @see PricingPlan
     */

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for the geofence collection.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreateGeofenceCollectionRequest withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for the geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for the geofence collection.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreateGeofenceCollectionRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the data provider for the geofence collection.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required value for the following pricing plans: <code>MobileAssetTracking </code>|
     * <code>MobileAssetManagement</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about <a href="https://aws.amazon.com/location/data-providers/">Data Providers</a>, and <a
     * href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your geofence
     * collection. Your data won't be shared with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>Esri </code>| <code>Here</code>
     * </p>
     * 
     * @param pricingPlanDataSource
     *        Specifies the data provider for the geofence collection.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required value for the following pricing plans: <code>MobileAssetTracking </code>|
     *        <code>MobileAssetManagement</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about <a href="https://aws.amazon.com/location/data-providers/">Data Providers</a>,
     *        and <a href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see the Amazon Location Service
     *        product page.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your
     *        geofence collection. Your data won't be shared with the data provider, and will remain in your AWS account
     *        or Region unless you move it.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>Esri </code>| <code>Here</code>
     */

    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * Specifies the data provider for the geofence collection.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required value for the following pricing plans: <code>MobileAssetTracking </code>|
     * <code>MobileAssetManagement</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about <a href="https://aws.amazon.com/location/data-providers/">Data Providers</a>, and <a
     * href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your geofence
     * collection. Your data won't be shared with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>Esri </code>| <code>Here</code>
     * </p>
     * 
     * @return Specifies the data provider for the geofence collection.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required value for the following pricing plans: <code>MobileAssetTracking </code>|
     *         <code>MobileAssetManagement</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about <a href="https://aws.amazon.com/location/data-providers/">Data Providers</a>,
     *         and <a href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see the Amazon Location Service
     *         product page.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your
     *         geofence collection. Your data won't be shared with the data provider, and will remain in your AWS
     *         account or Region unless you move it.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>Esri </code>| <code>Here</code>
     */

    public String getPricingPlanDataSource() {
        return this.pricingPlanDataSource;
    }

    /**
     * <p>
     * Specifies the data provider for the geofence collection.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required value for the following pricing plans: <code>MobileAssetTracking </code>|
     * <code>MobileAssetManagement</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about <a href="https://aws.amazon.com/location/data-providers/">Data Providers</a>, and <a
     * href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see the Amazon Location Service product page.
     * </p>
     * <note>
     * <p>
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your geofence
     * collection. Your data won't be shared with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>Esri </code>| <code>Here</code>
     * </p>
     * 
     * @param pricingPlanDataSource
     *        Specifies the data provider for the geofence collection.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required value for the following pricing plans: <code>MobileAssetTracking </code>|
     *        <code>MobileAssetManagement</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about <a href="https://aws.amazon.com/location/data-providers/">Data Providers</a>,
     *        and <a href="https://aws.amazon.com/location/pricing/">Pricing plans</a>, see the Amazon Location Service
     *        product page.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your
     *        geofence collection. Your data won't be shared with the data provider, and will remain in your AWS account
     *        or Region unless you move it.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>Esri </code>| <code>Here</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionRequest withPricingPlanDataSource(String pricingPlanDataSource) {
        setPricingPlanDataSource(pricingPlanDataSource);
        return this;
    }

    /**
     * <p>
     * Applies one or more tags to the geofence collection. A tag is a key-value pair helps manage, identify, search,
     * and filter your resources by labelling them.
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
     * </ul>
     * 
     * @return Applies one or more tags to the geofence collection. A tag is a key-value pair helps manage, identify,
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
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Applies one or more tags to the geofence collection. A tag is a key-value pair helps manage, identify, search,
     * and filter your resources by labelling them.
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
     * </ul>
     * 
     * @param tags
     *        Applies one or more tags to the geofence collection. A tag is a key-value pair helps manage, identify,
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
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Applies one or more tags to the geofence collection. A tag is a key-value pair helps manage, identify, search,
     * and filter your resources by labelling them.
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
     * </ul>
     * 
     * @param tags
     *        Applies one or more tags to the geofence collection. A tag is a key-value pair helps manage, identify,
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateGeofenceCollectionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionRequest addTagsEntry(String key, String value) {
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

    public CreateGeofenceCollectionRequest clearTagsEntries() {
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
        if (getCollectionName() != null)
            sb.append("CollectionName: ").append(getCollectionName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan()).append(",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: ").append(getPricingPlanDataSource()).append(",");
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

        if (obj instanceof CreateGeofenceCollectionRequest == false)
            return false;
        CreateGeofenceCollectionRequest other = (CreateGeofenceCollectionRequest) obj;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateGeofenceCollectionRequest clone() {
        return (CreateGeofenceCollectionRequest) super.clone();
    }

}
