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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an Amazon Lightsail bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/Bucket" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bucket implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Lightsail resource type of the bucket (for example, <code>Bucket</code>).
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * An object that describes the access rules of the bucket.
     * </p>
     */
    private AccessRules accessRules;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the bundle currently applied to the bucket.
     * </p>
     * <p>
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change the bundle of a bucket.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The timestamp when the distribution was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The URL of the bucket.
     * </p>
     */
    private String url;

    private ResourceLocation location;
    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The support code for a bucket. Include this code in your email to support when you have questions about a
     * Lightsail bucket. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;
    /**
     * <p>
     * The tag keys and optional values for the bucket. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Tags in Amazon Lightsail</a> in
     * the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Indicates whether object versioning is enabled for the bucket.
     * </p>
     * <p>
     * The following options can be configured:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Enabled</code> - Object versioning is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Suspended</code> - Object versioning was previously enabled but is currently suspended. Existing object
     * versions are retained.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NeverEnabled</code> - Object versioning has never been enabled.
     * </p>
     * </li>
     * </ul>
     */
    private String objectVersioning;
    /**
     * <p>
     * Indicates whether the bundle that is currently applied to a bucket can be changed to another bundle.
     * </p>
     * <p>
     * You can update a bucket's bundle only one time within a monthly AWS billing cycle.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change a bucket's bundle.
     * </p>
     */
    private Boolean ableToUpdateBundle;
    /**
     * <p>
     * An array of strings that specify the AWS account IDs that have read-only access to the bucket.
     * </p>
     */
    private java.util.List<String> readonlyAccessAccounts;
    /**
     * <p>
     * An array of objects that describe Lightsail instances that have access to the bucket.
     * </p>
     * <p>
     * Use the <a>SetResourceAccessForBucket</a> action to update the instances that have access to a bucket.
     * </p>
     */
    private java.util.List<ResourceReceivingAccess> resourcesReceivingAccess;
    /**
     * <p>
     * An object that describes the state of the bucket.
     * </p>
     */
    private BucketState state;

    /**
     * <p>
     * The Lightsail resource type of the bucket (for example, <code>Bucket</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type of the bucket (for example, <code>Bucket</code>).
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type of the bucket (for example, <code>Bucket</code>).
     * </p>
     * 
     * @return The Lightsail resource type of the bucket (for example, <code>Bucket</code>).
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The Lightsail resource type of the bucket (for example, <code>Bucket</code>).
     * </p>
     * 
     * @param resourceType
     *        The Lightsail resource type of the bucket (for example, <code>Bucket</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * An object that describes the access rules of the bucket.
     * </p>
     * 
     * @param accessRules
     *        An object that describes the access rules of the bucket.
     */

    public void setAccessRules(AccessRules accessRules) {
        this.accessRules = accessRules;
    }

    /**
     * <p>
     * An object that describes the access rules of the bucket.
     * </p>
     * 
     * @return An object that describes the access rules of the bucket.
     */

    public AccessRules getAccessRules() {
        return this.accessRules;
    }

    /**
     * <p>
     * An object that describes the access rules of the bucket.
     * </p>
     * 
     * @param accessRules
     *        An object that describes the access rules of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withAccessRules(AccessRules accessRules) {
        setAccessRules(accessRules);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the bucket.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bucket.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bucket.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the bundle currently applied to the bucket.
     * </p>
     * <p>
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change the bundle of a bucket.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle currently applied to the bucket.</p>
     *        <p>
     *        A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     *        </p>
     *        <p>
     *        Use the <a>UpdateBucketBundle</a> action to change the bundle of a bucket.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The ID of the bundle currently applied to the bucket.
     * </p>
     * <p>
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change the bundle of a bucket.
     * </p>
     * 
     * @return The ID of the bundle currently applied to the bucket.</p>
     *         <p>
     *         A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     *         </p>
     *         <p>
     *         Use the <a>UpdateBucketBundle</a> action to change the bundle of a bucket.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The ID of the bundle currently applied to the bucket.
     * </p>
     * <p>
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change the bundle of a bucket.
     * </p>
     * 
     * @param bundleId
     *        The ID of the bundle currently applied to the bucket.</p>
     *        <p>
     *        A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket.
     *        </p>
     *        <p>
     *        Use the <a>UpdateBucketBundle</a> action to change the bundle of a bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The timestamp when the distribution was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the distribution was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the distribution was created.
     * </p>
     * 
     * @return The timestamp when the distribution was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the distribution was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the distribution was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The URL of the bucket.
     * </p>
     * 
     * @param url
     *        The URL of the bucket.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the bucket.
     * </p>
     * 
     * @return The URL of the bucket.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the bucket.
     * </p>
     * 
     * @param url
     *        The URL of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * @param location
     */

    public void setLocation(ResourceLocation location) {
        this.location = location;
    }

    /**
     * @return
     */

    public ResourceLocation getLocation() {
        return this.location;
    }

    /**
     * @param location
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withLocation(ResourceLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param name
     *        The name of the bucket.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @return The name of the bucket.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param name
     *        The name of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The support code for a bucket. Include this code in your email to support when you have questions about a
     * Lightsail bucket. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code for a bucket. Include this code in your email to support when you have questions about a
     *        Lightsail bucket. This code enables our support team to look up your Lightsail information more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code for a bucket. Include this code in your email to support when you have questions about a
     * Lightsail bucket. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code for a bucket. Include this code in your email to support when you have questions about a
     *         Lightsail bucket. This code enables our support team to look up your Lightsail information more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code for a bucket. Include this code in your email to support when you have questions about a
     * Lightsail bucket. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code for a bucket. Include this code in your email to support when you have questions about a
     *        Lightsail bucket. This code enables our support team to look up your Lightsail information more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withSupportCode(String supportCode) {
        setSupportCode(supportCode);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the bucket. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Tags in Amazon Lightsail</a> in
     * the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * 
     * @return The tag keys and optional values for the bucket. For more information, see <a
     *         href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Tags in Amazon
     *         Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the bucket. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Tags in Amazon Lightsail</a> in
     * the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the bucket. For more information, see <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Tags in Amazon
     *        Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values for the bucket. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Tags in Amazon Lightsail</a> in
     * the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the bucket. For more information, see <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Tags in Amazon
     *        Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the bucket. For more information, see <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Tags in Amazon Lightsail</a> in
     * the <i>Amazon Lightsail Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the bucket. For more information, see <a
     *        href="https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-tags">Tags in Amazon
     *        Lightsail</a> in the <i>Amazon Lightsail Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether object versioning is enabled for the bucket.
     * </p>
     * <p>
     * The following options can be configured:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Enabled</code> - Object versioning is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Suspended</code> - Object versioning was previously enabled but is currently suspended. Existing object
     * versions are retained.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NeverEnabled</code> - Object versioning has never been enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectVersioning
     *        Indicates whether object versioning is enabled for the bucket.</p>
     *        <p>
     *        The following options can be configured:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Enabled</code> - Object versioning is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Suspended</code> - Object versioning was previously enabled but is currently suspended. Existing
     *        object versions are retained.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NeverEnabled</code> - Object versioning has never been enabled.
     *        </p>
     *        </li>
     */

    public void setObjectVersioning(String objectVersioning) {
        this.objectVersioning = objectVersioning;
    }

    /**
     * <p>
     * Indicates whether object versioning is enabled for the bucket.
     * </p>
     * <p>
     * The following options can be configured:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Enabled</code> - Object versioning is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Suspended</code> - Object versioning was previously enabled but is currently suspended. Existing object
     * versions are retained.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NeverEnabled</code> - Object versioning has never been enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether object versioning is enabled for the bucket.</p>
     *         <p>
     *         The following options can be configured:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Enabled</code> - Object versioning is enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Suspended</code> - Object versioning was previously enabled but is currently suspended. Existing
     *         object versions are retained.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NeverEnabled</code> - Object versioning has never been enabled.
     *         </p>
     *         </li>
     */

    public String getObjectVersioning() {
        return this.objectVersioning;
    }

    /**
     * <p>
     * Indicates whether object versioning is enabled for the bucket.
     * </p>
     * <p>
     * The following options can be configured:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Enabled</code> - Object versioning is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Suspended</code> - Object versioning was previously enabled but is currently suspended. Existing object
     * versions are retained.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NeverEnabled</code> - Object versioning has never been enabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectVersioning
     *        Indicates whether object versioning is enabled for the bucket.</p>
     *        <p>
     *        The following options can be configured:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Enabled</code> - Object versioning is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Suspended</code> - Object versioning was previously enabled but is currently suspended. Existing
     *        object versions are retained.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NeverEnabled</code> - Object versioning has never been enabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withObjectVersioning(String objectVersioning) {
        setObjectVersioning(objectVersioning);
        return this;
    }

    /**
     * <p>
     * Indicates whether the bundle that is currently applied to a bucket can be changed to another bundle.
     * </p>
     * <p>
     * You can update a bucket's bundle only one time within a monthly AWS billing cycle.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change a bucket's bundle.
     * </p>
     * 
     * @param ableToUpdateBundle
     *        Indicates whether the bundle that is currently applied to a bucket can be changed to another bundle.</p>
     *        <p>
     *        You can update a bucket's bundle only one time within a monthly AWS billing cycle.
     *        </p>
     *        <p>
     *        Use the <a>UpdateBucketBundle</a> action to change a bucket's bundle.
     */

    public void setAbleToUpdateBundle(Boolean ableToUpdateBundle) {
        this.ableToUpdateBundle = ableToUpdateBundle;
    }

    /**
     * <p>
     * Indicates whether the bundle that is currently applied to a bucket can be changed to another bundle.
     * </p>
     * <p>
     * You can update a bucket's bundle only one time within a monthly AWS billing cycle.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change a bucket's bundle.
     * </p>
     * 
     * @return Indicates whether the bundle that is currently applied to a bucket can be changed to another bundle.</p>
     *         <p>
     *         You can update a bucket's bundle only one time within a monthly AWS billing cycle.
     *         </p>
     *         <p>
     *         Use the <a>UpdateBucketBundle</a> action to change a bucket's bundle.
     */

    public Boolean getAbleToUpdateBundle() {
        return this.ableToUpdateBundle;
    }

    /**
     * <p>
     * Indicates whether the bundle that is currently applied to a bucket can be changed to another bundle.
     * </p>
     * <p>
     * You can update a bucket's bundle only one time within a monthly AWS billing cycle.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change a bucket's bundle.
     * </p>
     * 
     * @param ableToUpdateBundle
     *        Indicates whether the bundle that is currently applied to a bucket can be changed to another bundle.</p>
     *        <p>
     *        You can update a bucket's bundle only one time within a monthly AWS billing cycle.
     *        </p>
     *        <p>
     *        Use the <a>UpdateBucketBundle</a> action to change a bucket's bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withAbleToUpdateBundle(Boolean ableToUpdateBundle) {
        setAbleToUpdateBundle(ableToUpdateBundle);
        return this;
    }

    /**
     * <p>
     * Indicates whether the bundle that is currently applied to a bucket can be changed to another bundle.
     * </p>
     * <p>
     * You can update a bucket's bundle only one time within a monthly AWS billing cycle.
     * </p>
     * <p>
     * Use the <a>UpdateBucketBundle</a> action to change a bucket's bundle.
     * </p>
     * 
     * @return Indicates whether the bundle that is currently applied to a bucket can be changed to another bundle.</p>
     *         <p>
     *         You can update a bucket's bundle only one time within a monthly AWS billing cycle.
     *         </p>
     *         <p>
     *         Use the <a>UpdateBucketBundle</a> action to change a bucket's bundle.
     */

    public Boolean isAbleToUpdateBundle() {
        return this.ableToUpdateBundle;
    }

    /**
     * <p>
     * An array of strings that specify the AWS account IDs that have read-only access to the bucket.
     * </p>
     * 
     * @return An array of strings that specify the AWS account IDs that have read-only access to the bucket.
     */

    public java.util.List<String> getReadonlyAccessAccounts() {
        return readonlyAccessAccounts;
    }

    /**
     * <p>
     * An array of strings that specify the AWS account IDs that have read-only access to the bucket.
     * </p>
     * 
     * @param readonlyAccessAccounts
     *        An array of strings that specify the AWS account IDs that have read-only access to the bucket.
     */

    public void setReadonlyAccessAccounts(java.util.Collection<String> readonlyAccessAccounts) {
        if (readonlyAccessAccounts == null) {
            this.readonlyAccessAccounts = null;
            return;
        }

        this.readonlyAccessAccounts = new java.util.ArrayList<String>(readonlyAccessAccounts);
    }

    /**
     * <p>
     * An array of strings that specify the AWS account IDs that have read-only access to the bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadonlyAccessAccounts(java.util.Collection)} or
     * {@link #withReadonlyAccessAccounts(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param readonlyAccessAccounts
     *        An array of strings that specify the AWS account IDs that have read-only access to the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withReadonlyAccessAccounts(String... readonlyAccessAccounts) {
        if (this.readonlyAccessAccounts == null) {
            setReadonlyAccessAccounts(new java.util.ArrayList<String>(readonlyAccessAccounts.length));
        }
        for (String ele : readonlyAccessAccounts) {
            this.readonlyAccessAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the AWS account IDs that have read-only access to the bucket.
     * </p>
     * 
     * @param readonlyAccessAccounts
     *        An array of strings that specify the AWS account IDs that have read-only access to the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withReadonlyAccessAccounts(java.util.Collection<String> readonlyAccessAccounts) {
        setReadonlyAccessAccounts(readonlyAccessAccounts);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe Lightsail instances that have access to the bucket.
     * </p>
     * <p>
     * Use the <a>SetResourceAccessForBucket</a> action to update the instances that have access to a bucket.
     * </p>
     * 
     * @return An array of objects that describe Lightsail instances that have access to the bucket.</p>
     *         <p>
     *         Use the <a>SetResourceAccessForBucket</a> action to update the instances that have access to a bucket.
     */

    public java.util.List<ResourceReceivingAccess> getResourcesReceivingAccess() {
        return resourcesReceivingAccess;
    }

    /**
     * <p>
     * An array of objects that describe Lightsail instances that have access to the bucket.
     * </p>
     * <p>
     * Use the <a>SetResourceAccessForBucket</a> action to update the instances that have access to a bucket.
     * </p>
     * 
     * @param resourcesReceivingAccess
     *        An array of objects that describe Lightsail instances that have access to the bucket.</p>
     *        <p>
     *        Use the <a>SetResourceAccessForBucket</a> action to update the instances that have access to a bucket.
     */

    public void setResourcesReceivingAccess(java.util.Collection<ResourceReceivingAccess> resourcesReceivingAccess) {
        if (resourcesReceivingAccess == null) {
            this.resourcesReceivingAccess = null;
            return;
        }

        this.resourcesReceivingAccess = new java.util.ArrayList<ResourceReceivingAccess>(resourcesReceivingAccess);
    }

    /**
     * <p>
     * An array of objects that describe Lightsail instances that have access to the bucket.
     * </p>
     * <p>
     * Use the <a>SetResourceAccessForBucket</a> action to update the instances that have access to a bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourcesReceivingAccess(java.util.Collection)} or
     * {@link #withResourcesReceivingAccess(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param resourcesReceivingAccess
     *        An array of objects that describe Lightsail instances that have access to the bucket.</p>
     *        <p>
     *        Use the <a>SetResourceAccessForBucket</a> action to update the instances that have access to a bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withResourcesReceivingAccess(ResourceReceivingAccess... resourcesReceivingAccess) {
        if (this.resourcesReceivingAccess == null) {
            setResourcesReceivingAccess(new java.util.ArrayList<ResourceReceivingAccess>(resourcesReceivingAccess.length));
        }
        for (ResourceReceivingAccess ele : resourcesReceivingAccess) {
            this.resourcesReceivingAccess.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe Lightsail instances that have access to the bucket.
     * </p>
     * <p>
     * Use the <a>SetResourceAccessForBucket</a> action to update the instances that have access to a bucket.
     * </p>
     * 
     * @param resourcesReceivingAccess
     *        An array of objects that describe Lightsail instances that have access to the bucket.</p>
     *        <p>
     *        Use the <a>SetResourceAccessForBucket</a> action to update the instances that have access to a bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withResourcesReceivingAccess(java.util.Collection<ResourceReceivingAccess> resourcesReceivingAccess) {
        setResourcesReceivingAccess(resourcesReceivingAccess);
        return this;
    }

    /**
     * <p>
     * An object that describes the state of the bucket.
     * </p>
     * 
     * @param state
     *        An object that describes the state of the bucket.
     */

    public void setState(BucketState state) {
        this.state = state;
    }

    /**
     * <p>
     * An object that describes the state of the bucket.
     * </p>
     * 
     * @return An object that describes the state of the bucket.
     */

    public BucketState getState() {
        return this.state;
    }

    /**
     * <p>
     * An object that describes the state of the bucket.
     * </p>
     * 
     * @param state
     *        An object that describes the state of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bucket withState(BucketState state) {
        setState(state);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getAccessRules() != null)
            sb.append("AccessRules: ").append(getAccessRules()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getObjectVersioning() != null)
            sb.append("ObjectVersioning: ").append(getObjectVersioning()).append(",");
        if (getAbleToUpdateBundle() != null)
            sb.append("AbleToUpdateBundle: ").append(getAbleToUpdateBundle()).append(",");
        if (getReadonlyAccessAccounts() != null)
            sb.append("ReadonlyAccessAccounts: ").append(getReadonlyAccessAccounts()).append(",");
        if (getResourcesReceivingAccess() != null)
            sb.append("ResourcesReceivingAccess: ").append(getResourcesReceivingAccess()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bucket == false)
            return false;
        Bucket other = (Bucket) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getAccessRules() == null ^ this.getAccessRules() == null)
            return false;
        if (other.getAccessRules() != null && other.getAccessRules().equals(this.getAccessRules()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getObjectVersioning() == null ^ this.getObjectVersioning() == null)
            return false;
        if (other.getObjectVersioning() != null && other.getObjectVersioning().equals(this.getObjectVersioning()) == false)
            return false;
        if (other.getAbleToUpdateBundle() == null ^ this.getAbleToUpdateBundle() == null)
            return false;
        if (other.getAbleToUpdateBundle() != null && other.getAbleToUpdateBundle().equals(this.getAbleToUpdateBundle()) == false)
            return false;
        if (other.getReadonlyAccessAccounts() == null ^ this.getReadonlyAccessAccounts() == null)
            return false;
        if (other.getReadonlyAccessAccounts() != null && other.getReadonlyAccessAccounts().equals(this.getReadonlyAccessAccounts()) == false)
            return false;
        if (other.getResourcesReceivingAccess() == null ^ this.getResourcesReceivingAccess() == null)
            return false;
        if (other.getResourcesReceivingAccess() != null && other.getResourcesReceivingAccess().equals(this.getResourcesReceivingAccess()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getAccessRules() == null) ? 0 : getAccessRules().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getObjectVersioning() == null) ? 0 : getObjectVersioning().hashCode());
        hashCode = prime * hashCode + ((getAbleToUpdateBundle() == null) ? 0 : getAbleToUpdateBundle().hashCode());
        hashCode = prime * hashCode + ((getReadonlyAccessAccounts() == null) ? 0 : getReadonlyAccessAccounts().hashCode());
        hashCode = prime * hashCode + ((getResourcesReceivingAccess() == null) ? 0 : getResourcesReceivingAccess().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public Bucket clone() {
        try {
            return (Bucket) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.BucketMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
