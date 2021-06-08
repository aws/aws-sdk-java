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
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     */
    private String pricingPlan;
    /**
     * <p>
     * Specifies the data provider for the tracker resource.
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
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your tracker
     * resource. Your data will not be shared with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>Esri</code> | <code>Here</code>
     * </p>
     */
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
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for the tracker resource.</p>
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
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @return Specifies the pricing plan for the tracker resource.</p>
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
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for the tracker resource.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreateTrackerRequest withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for the tracker resource.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for the tracker resource.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreateTrackerRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the data provider for the tracker resource.
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
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your tracker
     * resource. Your data will not be shared with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>Esri</code> | <code>Here</code>
     * </p>
     * 
     * @param pricingPlanDataSource
     *        Specifies the data provider for the tracker resource.</p>
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
     *        Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your tracker
     *        resource. Your data will not be shared with the data provider, and will remain in your AWS account or
     *        Region unless you move it.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>Esri</code> | <code>Here</code>
     */

    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * Specifies the data provider for the tracker resource.
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
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your tracker
     * resource. Your data will not be shared with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>Esri</code> | <code>Here</code>
     * </p>
     * 
     * @return Specifies the data provider for the tracker resource.</p>
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
     *         tracker resource. Your data will not be shared with the data provider, and will remain in your AWS
     *         account or Region unless you move it.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>Esri</code> | <code>Here</code>
     */

    public String getPricingPlanDataSource() {
        return this.pricingPlanDataSource;
    }

    /**
     * <p>
     * Specifies the data provider for the tracker resource.
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
     * Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your tracker
     * resource. Your data will not be shared with the data provider, and will remain in your AWS account or Region
     * unless you move it.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>Esri</code> | <code>Here</code>
     * </p>
     * 
     * @param pricingPlanDataSource
     *        Specifies the data provider for the tracker resource.</p>
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
     *        Amazon Location Service only uses <code>PricingPlanDataSource</code> to calculate billing for your tracker
     *        resource. Your data will not be shared with the data provider, and will remain in your AWS account or
     *        Region unless you move it.
     *        </p>
     *        </note>
     *        <p>
     *        Valid Values: <code>Esri</code> | <code>Here</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

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
