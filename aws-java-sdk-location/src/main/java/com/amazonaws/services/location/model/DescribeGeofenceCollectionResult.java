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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DescribeGeofenceCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGeofenceCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     */
    private String collectionArn;
    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * The timestamp for when the geofence resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The optional description for the geofence collection.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A key identifier for an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS
     * customer managed key</a> assigned to the Amazon Location resource
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The pricing plan selected for the specified geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     */
    private String pricingPlan;
    /**
     * <p>
     * The specified data provider for the geofence collection.
     * </p>
     */
    private String pricingPlanDataSource;
    /**
     * <p>
     * Displays the key, value pairs of tags associated with this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionArn
     *        The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a
     *        resource across all AWS. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *        </p>
     *        </li>
     */

    public void setCollectionArn(String collectionArn) {
        this.collectionArn = collectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a
     *         resource across all AWS. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *         </p>
     *         </li>
     */

    public String getCollectionArn() {
        return this.collectionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a resource
     * across all AWS.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionArn
     *        The Amazon Resource Name (ARN) for the geofence collection resource. Used when you need to specify a
     *        resource across all AWS. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Format example: <code>arn:aws:geo:region:account-id:geofence-collection/ExampleGeofenceCollection</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeofenceCollectionResult withCollectionArn(String collectionArn) {
        setCollectionArn(collectionArn);
        return this;
    }

    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * 
     * @param collectionName
     *        The name of the geofence collection.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * 
     * @return The name of the geofence collection.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The name of the geofence collection.
     * </p>
     * 
     * @param collectionName
     *        The name of the geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeofenceCollectionResult withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the geofence resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the geofence resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @return The timestamp for when the geofence resource was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence resource was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the geofence resource was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeofenceCollectionResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The optional description for the geofence collection.
     * </p>
     * 
     * @param description
     *        The optional description for the geofence collection.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the geofence collection.
     * </p>
     * 
     * @return The optional description for the geofence collection.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for the geofence collection.
     * </p>
     * 
     * @param description
     *        The optional description for the geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeofenceCollectionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A key identifier for an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS
     * customer managed key</a> assigned to the Amazon Location resource
     * </p>
     * 
     * @param kmsKeyId
     *        A key identifier for an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS customer managed
     *        key</a> assigned to the Amazon Location resource
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * A key identifier for an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS
     * customer managed key</a> assigned to the Amazon Location resource
     * </p>
     * 
     * @return A key identifier for an <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS customer managed
     *         key</a> assigned to the Amazon Location resource
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * A key identifier for an <a href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS
     * customer managed key</a> assigned to the Amazon Location resource
     * </p>
     * 
     * @param kmsKeyId
     *        A key identifier for an <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html">AWS KMS customer managed
     *        key</a> assigned to the Amazon Location resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeofenceCollectionResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The pricing plan selected for the specified geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan selected for the specified geofence collection.</p>
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
     * The pricing plan selected for the specified geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @return The pricing plan selected for the specified geofence collection.</p>
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
     * The pricing plan selected for the specified geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan selected for the specified geofence collection.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public DescribeGeofenceCollectionResult withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * The pricing plan selected for the specified geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        The pricing plan selected for the specified geofence collection.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public DescribeGeofenceCollectionResult withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * The specified data provider for the geofence collection.
     * </p>
     * 
     * @param pricingPlanDataSource
     *        The specified data provider for the geofence collection.
     */

    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * The specified data provider for the geofence collection.
     * </p>
     * 
     * @return The specified data provider for the geofence collection.
     */

    public String getPricingPlanDataSource() {
        return this.pricingPlanDataSource;
    }

    /**
     * <p>
     * The specified data provider for the geofence collection.
     * </p>
     * 
     * @param pricingPlanDataSource
     *        The specified data provider for the geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeofenceCollectionResult withPricingPlanDataSource(String pricingPlanDataSource) {
        setPricingPlanDataSource(pricingPlanDataSource);
        return this;
    }

    /**
     * <p>
     * Displays the key, value pairs of tags associated with this resource.
     * </p>
     * 
     * @return Displays the key, value pairs of tags associated with this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Displays the key, value pairs of tags associated with this resource.
     * </p>
     * 
     * @param tags
     *        Displays the key, value pairs of tags associated with this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Displays the key, value pairs of tags associated with this resource.
     * </p>
     * 
     * @param tags
     *        Displays the key, value pairs of tags associated with this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeofenceCollectionResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeGeofenceCollectionResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeofenceCollectionResult addTagsEntry(String key, String value) {
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

    public DescribeGeofenceCollectionResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the geofence collection was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @return The timestamp for when the geofence collection was last updated in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the geofence collection was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGeofenceCollectionResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getCollectionArn() != null)
            sb.append("CollectionArn: ").append(getCollectionArn()).append(",");
        if (getCollectionName() != null)
            sb.append("CollectionName: ").append(getCollectionName()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
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
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGeofenceCollectionResult == false)
            return false;
        DescribeGeofenceCollectionResult other = (DescribeGeofenceCollectionResult) obj;
        if (other.getCollectionArn() == null ^ this.getCollectionArn() == null)
            return false;
        if (other.getCollectionArn() != null && other.getCollectionArn().equals(this.getCollectionArn()) == false)
            return false;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
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
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionArn() == null) ? 0 : getCollectionArn().hashCode());
        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGeofenceCollectionResult clone() {
        try {
            return (DescribeGeofenceCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
