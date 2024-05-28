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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * CreateLocationS3Request
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationS3" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationS3Request extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on whether the bucket is a
     * source or destination location).
     * </p>
     * <note>
     * <p>
     * DataSync can't transfer objects with a prefix that begins with a slash (<code>/</code>) or includes
     * <code>//</code>, <code>/./</code>, or <code>/../</code> patterns. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/photos</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos//2006/January</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos/./2006/February</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos/../2006/March</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private String subdirectory;
    /**
     * <p>
     * Specifies the ARN of the S3 bucket that you want to use as a location. (When creating your DataSync task later,
     * you specify whether this location is a transfer source or destination.)
     * </p>
     * <p>
     * If your S3 bucket is located on an Outposts resource, you must specify an Amazon S3 access point. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing data
     * access with Amazon S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     */
    private String s3BucketArn;
    /**
     * <p>
     * Specifies the storage class that you want your objects to use when Amazon S3 is a transfer destination.
     * </p>
     * <p>
     * For buckets in Amazon Web Services Regions, the storage class defaults to <code>STANDARD</code>. For buckets on
     * Outposts, the storage class defaults to <code>OUTPOSTS</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 transfers</a>.
     * </p>
     */
    private String s3StorageClass;

    private S3Config s3Config;
    /**
     * <p>
     * (Amazon S3 on Outposts only) Specifies the Amazon Resource Name (ARN) of the DataSync agent on your Outpost.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/deploy-agents.html#outposts-agent">Deploy your
     * DataSync agent on Outposts</a>.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your transfer location.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on whether the bucket is a
     * source or destination location).
     * </p>
     * <note>
     * <p>
     * DataSync can't transfer objects with a prefix that begins with a slash (<code>/</code>) or includes
     * <code>//</code>, <code>/./</code>, or <code>/../</code> patterns. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/photos</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos//2006/January</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos/./2006/February</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos/../2006/March</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param subdirectory
     *        Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on whether the bucket
     *        is a source or destination location).</p> <note>
     *        <p>
     *        DataSync can't transfer objects with a prefix that begins with a slash (<code>/</code>) or includes
     *        <code>//</code>, <code>/./</code>, or <code>/../</code> patterns. For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>/photos</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>photos//2006/January</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>photos/./2006/February</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>photos/../2006/March</code>
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on whether the bucket is a
     * source or destination location).
     * </p>
     * <note>
     * <p>
     * DataSync can't transfer objects with a prefix that begins with a slash (<code>/</code>) or includes
     * <code>//</code>, <code>/./</code>, or <code>/../</code> patterns. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/photos</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos//2006/January</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos/./2006/February</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos/../2006/March</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @return Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on whether the
     *         bucket is a source or destination location).</p> <note>
     *         <p>
     *         DataSync can't transfer objects with a prefix that begins with a slash (<code>/</code>) or includes
     *         <code>//</code>, <code>/./</code>, or <code>/../</code> patterns. For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>/photos</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>photos//2006/January</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>photos/./2006/February</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>photos/../2006/March</code>
     *         </p>
     *         </li>
     *         </ul>
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on whether the bucket is a
     * source or destination location).
     * </p>
     * <note>
     * <p>
     * DataSync can't transfer objects with a prefix that begins with a slash (<code>/</code>) or includes
     * <code>//</code>, <code>/./</code>, or <code>/../</code> patterns. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>/photos</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos//2006/January</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos/./2006/February</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>photos/../2006/March</code>
     * </p>
     * </li>
     * </ul>
     * </note>
     * 
     * @param subdirectory
     *        Specifies a prefix in the S3 bucket that DataSync reads from or writes to (depending on whether the bucket
     *        is a source or destination location).</p> <note>
     *        <p>
     *        DataSync can't transfer objects with a prefix that begins with a slash (<code>/</code>) or includes
     *        <code>//</code>, <code>/./</code>, or <code>/../</code> patterns. For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>/photos</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>photos//2006/January</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>photos/./2006/February</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>photos/../2006/March</code>
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the S3 bucket that you want to use as a location. (When creating your DataSync task later,
     * you specify whether this location is a transfer source or destination.)
     * </p>
     * <p>
     * If your S3 bucket is located on an Outposts resource, you must specify an Amazon S3 access point. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing data
     * access with Amazon S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param s3BucketArn
     *        Specifies the ARN of the S3 bucket that you want to use as a location. (When creating your DataSync task
     *        later, you specify whether this location is a transfer source or destination.) </p>
     *        <p>
     *        If your S3 bucket is located on an Outposts resource, you must specify an Amazon S3 access point. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing data access with
     *        Amazon S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     */

    public void setS3BucketArn(String s3BucketArn) {
        this.s3BucketArn = s3BucketArn;
    }

    /**
     * <p>
     * Specifies the ARN of the S3 bucket that you want to use as a location. (When creating your DataSync task later,
     * you specify whether this location is a transfer source or destination.)
     * </p>
     * <p>
     * If your S3 bucket is located on an Outposts resource, you must specify an Amazon S3 access point. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing data
     * access with Amazon S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @return Specifies the ARN of the S3 bucket that you want to use as a location. (When creating your DataSync task
     *         later, you specify whether this location is a transfer source or destination.) </p>
     *         <p>
     *         If your S3 bucket is located on an Outposts resource, you must specify an Amazon S3 access point. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing data access with
     *         Amazon S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     */

    public String getS3BucketArn() {
        return this.s3BucketArn;
    }

    /**
     * <p>
     * Specifies the ARN of the S3 bucket that you want to use as a location. (When creating your DataSync task later,
     * you specify whether this location is a transfer source or destination.)
     * </p>
     * <p>
     * If your S3 bucket is located on an Outposts resource, you must specify an Amazon S3 access point. For more
     * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing data
     * access with Amazon S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     * </p>
     * 
     * @param s3BucketArn
     *        Specifies the ARN of the S3 bucket that you want to use as a location. (When creating your DataSync task
     *        later, you specify whether this location is a transfer source or destination.) </p>
     *        <p>
     *        If your S3 bucket is located on an Outposts resource, you must specify an Amazon S3 access point. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">Managing data access with
     *        Amazon S3 access points</a> in the <i>Amazon S3 User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withS3BucketArn(String s3BucketArn) {
        setS3BucketArn(s3BucketArn);
        return this;
    }

    /**
     * <p>
     * Specifies the storage class that you want your objects to use when Amazon S3 is a transfer destination.
     * </p>
     * <p>
     * For buckets in Amazon Web Services Regions, the storage class defaults to <code>STANDARD</code>. For buckets on
     * Outposts, the storage class defaults to <code>OUTPOSTS</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 transfers</a>.
     * </p>
     * 
     * @param s3StorageClass
     *        Specifies the storage class that you want your objects to use when Amazon S3 is a transfer
     *        destination.</p>
     *        <p>
     *        For buckets in Amazon Web Services Regions, the storage class defaults to <code>STANDARD</code>. For
     *        buckets on Outposts, the storage class defaults to <code>OUTPOSTS</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 transfers</a>.
     * @see S3StorageClass
     */

    public void setS3StorageClass(String s3StorageClass) {
        this.s3StorageClass = s3StorageClass;
    }

    /**
     * <p>
     * Specifies the storage class that you want your objects to use when Amazon S3 is a transfer destination.
     * </p>
     * <p>
     * For buckets in Amazon Web Services Regions, the storage class defaults to <code>STANDARD</code>. For buckets on
     * Outposts, the storage class defaults to <code>OUTPOSTS</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 transfers</a>.
     * </p>
     * 
     * @return Specifies the storage class that you want your objects to use when Amazon S3 is a transfer
     *         destination.</p>
     *         <p>
     *         For buckets in Amazon Web Services Regions, the storage class defaults to <code>STANDARD</code>. For
     *         buckets on Outposts, the storage class defaults to <code>OUTPOSTS</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Storage class considerations with Amazon S3 transfers</a>.
     * @see S3StorageClass
     */

    public String getS3StorageClass() {
        return this.s3StorageClass;
    }

    /**
     * <p>
     * Specifies the storage class that you want your objects to use when Amazon S3 is a transfer destination.
     * </p>
     * <p>
     * For buckets in Amazon Web Services Regions, the storage class defaults to <code>STANDARD</code>. For buckets on
     * Outposts, the storage class defaults to <code>OUTPOSTS</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 transfers</a>.
     * </p>
     * 
     * @param s3StorageClass
     *        Specifies the storage class that you want your objects to use when Amazon S3 is a transfer
     *        destination.</p>
     *        <p>
     *        For buckets in Amazon Web Services Regions, the storage class defaults to <code>STANDARD</code>. For
     *        buckets on Outposts, the storage class defaults to <code>OUTPOSTS</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 transfers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3StorageClass
     */

    public CreateLocationS3Request withS3StorageClass(String s3StorageClass) {
        setS3StorageClass(s3StorageClass);
        return this;
    }

    /**
     * <p>
     * Specifies the storage class that you want your objects to use when Amazon S3 is a transfer destination.
     * </p>
     * <p>
     * For buckets in Amazon Web Services Regions, the storage class defaults to <code>STANDARD</code>. For buckets on
     * Outposts, the storage class defaults to <code>OUTPOSTS</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Storage class considerations with Amazon S3 transfers</a>.
     * </p>
     * 
     * @param s3StorageClass
     *        Specifies the storage class that you want your objects to use when Amazon S3 is a transfer
     *        destination.</p>
     *        <p>
     *        For buckets in Amazon Web Services Regions, the storage class defaults to <code>STANDARD</code>. For
     *        buckets on Outposts, the storage class defaults to <code>OUTPOSTS</code>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Storage class considerations with Amazon S3 transfers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3StorageClass
     */

    public CreateLocationS3Request withS3StorageClass(S3StorageClass s3StorageClass) {
        this.s3StorageClass = s3StorageClass.toString();
        return this;
    }

    /**
     * @param s3Config
     */

    public void setS3Config(S3Config s3Config) {
        this.s3Config = s3Config;
    }

    /**
     * @return
     */

    public S3Config getS3Config() {
        return this.s3Config;
    }

    /**
     * @param s3Config
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withS3Config(S3Config s3Config) {
        setS3Config(s3Config);
        return this;
    }

    /**
     * <p>
     * (Amazon S3 on Outposts only) Specifies the Amazon Resource Name (ARN) of the DataSync agent on your Outpost.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/deploy-agents.html#outposts-agent">Deploy your
     * DataSync agent on Outposts</a>.
     * </p>
     * 
     * @return (Amazon S3 on Outposts only) Specifies the Amazon Resource Name (ARN) of the DataSync agent on your
     *         Outpost.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/deploy-agents.html#outposts-agent">Deploy
     *         your DataSync agent on Outposts</a>.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * (Amazon S3 on Outposts only) Specifies the Amazon Resource Name (ARN) of the DataSync agent on your Outpost.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/deploy-agents.html#outposts-agent">Deploy your
     * DataSync agent on Outposts</a>.
     * </p>
     * 
     * @param agentArns
     *        (Amazon S3 on Outposts only) Specifies the Amazon Resource Name (ARN) of the DataSync agent on your
     *        Outpost.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/deploy-agents.html#outposts-agent">Deploy your
     *        DataSync agent on Outposts</a>.
     */

    public void setAgentArns(java.util.Collection<String> agentArns) {
        if (agentArns == null) {
            this.agentArns = null;
            return;
        }

        this.agentArns = new java.util.ArrayList<String>(agentArns);
    }

    /**
     * <p>
     * (Amazon S3 on Outposts only) Specifies the Amazon Resource Name (ARN) of the DataSync agent on your Outpost.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/deploy-agents.html#outposts-agent">Deploy your
     * DataSync agent on Outposts</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        (Amazon S3 on Outposts only) Specifies the Amazon Resource Name (ARN) of the DataSync agent on your
     *        Outpost.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/deploy-agents.html#outposts-agent">Deploy your
     *        DataSync agent on Outposts</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withAgentArns(String... agentArns) {
        if (this.agentArns == null) {
            setAgentArns(new java.util.ArrayList<String>(agentArns.length));
        }
        for (String ele : agentArns) {
            this.agentArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Amazon S3 on Outposts only) Specifies the Amazon Resource Name (ARN) of the DataSync agent on your Outpost.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/deploy-agents.html#outposts-agent">Deploy your
     * DataSync agent on Outposts</a>.
     * </p>
     * 
     * @param agentArns
     *        (Amazon S3 on Outposts only) Specifies the Amazon Resource Name (ARN) of the DataSync agent on your
     *        Outpost.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/deploy-agents.html#outposts-agent">Deploy your
     *        DataSync agent on Outposts</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your transfer location.
     * </p>
     * 
     * @return Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *         recommend creating at least a name tag for your transfer location.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your transfer location.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your transfer location.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your transfer location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your transfer location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your transfer location.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your transfer location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationS3Request withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
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
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getS3BucketArn() != null)
            sb.append("S3BucketArn: ").append(getS3BucketArn()).append(",");
        if (getS3StorageClass() != null)
            sb.append("S3StorageClass: ").append(getS3StorageClass()).append(",");
        if (getS3Config() != null)
            sb.append("S3Config: ").append(getS3Config()).append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
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

        if (obj instanceof CreateLocationS3Request == false)
            return false;
        CreateLocationS3Request other = (CreateLocationS3Request) obj;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getS3BucketArn() == null ^ this.getS3BucketArn() == null)
            return false;
        if (other.getS3BucketArn() != null && other.getS3BucketArn().equals(this.getS3BucketArn()) == false)
            return false;
        if (other.getS3StorageClass() == null ^ this.getS3StorageClass() == null)
            return false;
        if (other.getS3StorageClass() != null && other.getS3StorageClass().equals(this.getS3StorageClass()) == false)
            return false;
        if (other.getS3Config() == null ^ this.getS3Config() == null)
            return false;
        if (other.getS3Config() != null && other.getS3Config().equals(this.getS3Config()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
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

        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getS3BucketArn() == null) ? 0 : getS3BucketArn().hashCode());
        hashCode = prime * hashCode + ((getS3StorageClass() == null) ? 0 : getS3StorageClass().hashCode());
        hashCode = prime * hashCode + ((getS3Config() == null) ? 0 : getS3Config().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationS3Request clone() {
        return (CreateLocationS3Request) super.clone();
    }

}
