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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An origin.
 * </p>
 * <p>
 * An origin is the location where content is stored, and from which CloudFront gets content to serve to viewers. To
 * specify an origin:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use <code>S3OriginConfig</code> to specify an Amazon S3 bucket that is not configured with static website hosting.
 * </p>
 * </li>
 * <li>
 * <p>
 * Use <code>CustomOriginConfig</code> to specify all other kinds of origins, including:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An Amazon S3 bucket that is configured with static website hosting
 * </p>
 * </li>
 * <li>
 * <p>
 * An Elastic Load Balancing load balancer
 * </p>
 * </li>
 * <li>
 * <p>
 * An AWS Elemental MediaPackage endpoint
 * </p>
 * </li>
 * <li>
 * <p>
 * An AWS Elemental MediaStore container
 * </p>
 * </li>
 * <li>
 * <p>
 * Any other HTTP server, running on an Amazon EC2 instance or any other kind of host
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * For the current maximum number of origins that you can specify per distribution, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html#limits-web-distributions"
 * >General Quotas on Web Distributions</a> in the <i>Amazon CloudFront Developer Guide</i> (quotas were formerly
 * referred to as limits).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/Origin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Origin implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the origin. This value must be unique within the distribution.
     * </p>
     * <p>
     * Use this value to specify the <code>TargetOriginId</code> in a <code>CacheBehavior</code> or
     * <code>DefaultCacheBehavior</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The domain name for the origin.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     * >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * An optional path that CloudFront appends to the origin domain name when CloudFront requests content from the
     * origin.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath"
     * >Origin Path</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String originPath;
    /**
     * <p>
     * A list of HTTP header names and values that CloudFront adds to the requests that it sends to the origin.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html">Adding
     * Custom Headers to Origin Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private CustomHeaders customHeaders;
    /**
     * <p>
     * Use this type to specify an origin that is an Amazon S3 bucket that is not configured with static website
     * hosting. To specify any other type of origin, including an Amazon S3 bucket that is configured with static
     * website hosting, use the <code>CustomOriginConfig</code> type instead.
     * </p>
     */
    private S3OriginConfig s3OriginConfig;
    /**
     * <p>
     * Use this type to specify an origin that is not an Amazon S3 bucket, with one exception. If the Amazon S3 bucket
     * is configured with static website hosting, use this type. If the Amazon S3 bucket is not configured with static
     * website hosting, use the <code>S3OriginConfig</code> type instead.
     * </p>
     */
    private CustomOriginConfig customOriginConfig;
    /**
     * <p>
     * The number of times that CloudFront attempts to connect to the origin. The minimum number is 1, the maximum is 3,
     * and the default (if you don’t specify otherwise) is 3.
     * </p>
     * <p>
     * For a custom origin (including an Amazon S3 bucket that’s configured with static website hosting), this value
     * also specifies the number of times that CloudFront attempts to get a response from the origin, in the case of an
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     * >Origin Response Timeout</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts"
     * >Origin Connection Attempts</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private Integer connectionAttempts;
    /**
     * <p>
     * The number of seconds that CloudFront waits when trying to establish a connection to the origin. The minimum
     * timeout is 1 second, the maximum is 10 seconds, and the default (if you don’t specify otherwise) is 10 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout"
     * >Origin Connection Timeout</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private Integer connectionTimeout;
    /**
     * <p>
     * CloudFront Origin Shield. Using Origin Shield can help reduce the load on your origin.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html">Using Origin
     * Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private OriginShield originShield;

    /**
     * <p>
     * A unique identifier for the origin. This value must be unique within the distribution.
     * </p>
     * <p>
     * Use this value to specify the <code>TargetOriginId</code> in a <code>CacheBehavior</code> or
     * <code>DefaultCacheBehavior</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the origin. This value must be unique within the distribution.</p>
     *        <p>
     *        Use this value to specify the <code>TargetOriginId</code> in a <code>CacheBehavior</code> or
     *        <code>DefaultCacheBehavior</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the origin. This value must be unique within the distribution.
     * </p>
     * <p>
     * Use this value to specify the <code>TargetOriginId</code> in a <code>CacheBehavior</code> or
     * <code>DefaultCacheBehavior</code>.
     * </p>
     * 
     * @return A unique identifier for the origin. This value must be unique within the distribution.</p>
     *         <p>
     *         Use this value to specify the <code>TargetOriginId</code> in a <code>CacheBehavior</code> or
     *         <code>DefaultCacheBehavior</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the origin. This value must be unique within the distribution.
     * </p>
     * <p>
     * Use this value to specify the <code>TargetOriginId</code> in a <code>CacheBehavior</code> or
     * <code>DefaultCacheBehavior</code>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the origin. This value must be unique within the distribution.</p>
     *        <p>
     *        Use this value to specify the <code>TargetOriginId</code> in a <code>CacheBehavior</code> or
     *        <code>DefaultCacheBehavior</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The domain name for the origin.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     * >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param domainName
     *        The domain name for the origin.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     *        >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name for the origin.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     * >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The domain name for the origin.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     *         >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name for the origin.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     * >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param domainName
     *        The domain name for the origin.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     *        >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * An optional path that CloudFront appends to the origin domain name when CloudFront requests content from the
     * origin.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath"
     * >Origin Path</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param originPath
     *        An optional path that CloudFront appends to the origin domain name when CloudFront requests content from
     *        the origin.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath"
     *        >Origin Path</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setOriginPath(String originPath) {
        this.originPath = originPath;
    }

    /**
     * <p>
     * An optional path that CloudFront appends to the origin domain name when CloudFront requests content from the
     * origin.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath"
     * >Origin Path</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return An optional path that CloudFront appends to the origin domain name when CloudFront requests content from
     *         the origin.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath"
     *         >Origin Path</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public String getOriginPath() {
        return this.originPath;
    }

    /**
     * <p>
     * An optional path that CloudFront appends to the origin domain name when CloudFront requests content from the
     * origin.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath"
     * >Origin Path</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param originPath
     *        An optional path that CloudFront appends to the origin domain name when CloudFront requests content from
     *        the origin.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath"
     *        >Origin Path</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withOriginPath(String originPath) {
        setOriginPath(originPath);
        return this;
    }

    /**
     * <p>
     * A list of HTTP header names and values that CloudFront adds to the requests that it sends to the origin.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html">Adding
     * Custom Headers to Origin Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param customHeaders
     *        A list of HTTP header names and values that CloudFront adds to the requests that it sends to the
     *        origin.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html"
     *        >Adding Custom Headers to Origin Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setCustomHeaders(CustomHeaders customHeaders) {
        this.customHeaders = customHeaders;
    }

    /**
     * <p>
     * A list of HTTP header names and values that CloudFront adds to the requests that it sends to the origin.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html">Adding
     * Custom Headers to Origin Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return A list of HTTP header names and values that CloudFront adds to the requests that it sends to the
     *         origin.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html"
     *         >Adding Custom Headers to Origin Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public CustomHeaders getCustomHeaders() {
        return this.customHeaders;
    }

    /**
     * <p>
     * A list of HTTP header names and values that CloudFront adds to the requests that it sends to the origin.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html">Adding
     * Custom Headers to Origin Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param customHeaders
     *        A list of HTTP header names and values that CloudFront adds to the requests that it sends to the
     *        origin.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html"
     *        >Adding Custom Headers to Origin Requests</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withCustomHeaders(CustomHeaders customHeaders) {
        setCustomHeaders(customHeaders);
        return this;
    }

    /**
     * <p>
     * Use this type to specify an origin that is an Amazon S3 bucket that is not configured with static website
     * hosting. To specify any other type of origin, including an Amazon S3 bucket that is configured with static
     * website hosting, use the <code>CustomOriginConfig</code> type instead.
     * </p>
     * 
     * @param s3OriginConfig
     *        Use this type to specify an origin that is an Amazon S3 bucket that is not configured with static website
     *        hosting. To specify any other type of origin, including an Amazon S3 bucket that is configured with static
     *        website hosting, use the <code>CustomOriginConfig</code> type instead.
     */

    public void setS3OriginConfig(S3OriginConfig s3OriginConfig) {
        this.s3OriginConfig = s3OriginConfig;
    }

    /**
     * <p>
     * Use this type to specify an origin that is an Amazon S3 bucket that is not configured with static website
     * hosting. To specify any other type of origin, including an Amazon S3 bucket that is configured with static
     * website hosting, use the <code>CustomOriginConfig</code> type instead.
     * </p>
     * 
     * @return Use this type to specify an origin that is an Amazon S3 bucket that is not configured with static website
     *         hosting. To specify any other type of origin, including an Amazon S3 bucket that is configured with
     *         static website hosting, use the <code>CustomOriginConfig</code> type instead.
     */

    public S3OriginConfig getS3OriginConfig() {
        return this.s3OriginConfig;
    }

    /**
     * <p>
     * Use this type to specify an origin that is an Amazon S3 bucket that is not configured with static website
     * hosting. To specify any other type of origin, including an Amazon S3 bucket that is configured with static
     * website hosting, use the <code>CustomOriginConfig</code> type instead.
     * </p>
     * 
     * @param s3OriginConfig
     *        Use this type to specify an origin that is an Amazon S3 bucket that is not configured with static website
     *        hosting. To specify any other type of origin, including an Amazon S3 bucket that is configured with static
     *        website hosting, use the <code>CustomOriginConfig</code> type instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withS3OriginConfig(S3OriginConfig s3OriginConfig) {
        setS3OriginConfig(s3OriginConfig);
        return this;
    }

    /**
     * <p>
     * Use this type to specify an origin that is not an Amazon S3 bucket, with one exception. If the Amazon S3 bucket
     * is configured with static website hosting, use this type. If the Amazon S3 bucket is not configured with static
     * website hosting, use the <code>S3OriginConfig</code> type instead.
     * </p>
     * 
     * @param customOriginConfig
     *        Use this type to specify an origin that is not an Amazon S3 bucket, with one exception. If the Amazon S3
     *        bucket is configured with static website hosting, use this type. If the Amazon S3 bucket is not configured
     *        with static website hosting, use the <code>S3OriginConfig</code> type instead.
     */

    public void setCustomOriginConfig(CustomOriginConfig customOriginConfig) {
        this.customOriginConfig = customOriginConfig;
    }

    /**
     * <p>
     * Use this type to specify an origin that is not an Amazon S3 bucket, with one exception. If the Amazon S3 bucket
     * is configured with static website hosting, use this type. If the Amazon S3 bucket is not configured with static
     * website hosting, use the <code>S3OriginConfig</code> type instead.
     * </p>
     * 
     * @return Use this type to specify an origin that is not an Amazon S3 bucket, with one exception. If the Amazon S3
     *         bucket is configured with static website hosting, use this type. If the Amazon S3 bucket is not
     *         configured with static website hosting, use the <code>S3OriginConfig</code> type instead.
     */

    public CustomOriginConfig getCustomOriginConfig() {
        return this.customOriginConfig;
    }

    /**
     * <p>
     * Use this type to specify an origin that is not an Amazon S3 bucket, with one exception. If the Amazon S3 bucket
     * is configured with static website hosting, use this type. If the Amazon S3 bucket is not configured with static
     * website hosting, use the <code>S3OriginConfig</code> type instead.
     * </p>
     * 
     * @param customOriginConfig
     *        Use this type to specify an origin that is not an Amazon S3 bucket, with one exception. If the Amazon S3
     *        bucket is configured with static website hosting, use this type. If the Amazon S3 bucket is not configured
     *        with static website hosting, use the <code>S3OriginConfig</code> type instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withCustomOriginConfig(CustomOriginConfig customOriginConfig) {
        setCustomOriginConfig(customOriginConfig);
        return this;
    }

    /**
     * <p>
     * The number of times that CloudFront attempts to connect to the origin. The minimum number is 1, the maximum is 3,
     * and the default (if you don’t specify otherwise) is 3.
     * </p>
     * <p>
     * For a custom origin (including an Amazon S3 bucket that’s configured with static website hosting), this value
     * also specifies the number of times that CloudFront attempts to get a response from the origin, in the case of an
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     * >Origin Response Timeout</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts"
     * >Origin Connection Attempts</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param connectionAttempts
     *        The number of times that CloudFront attempts to connect to the origin. The minimum number is 1, the
     *        maximum is 3, and the default (if you don’t specify otherwise) is 3.</p>
     *        <p>
     *        For a custom origin (including an Amazon S3 bucket that’s configured with static website hosting), this
     *        value also specifies the number of times that CloudFront attempts to get a response from the origin, in
     *        the case of an <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     *        >Origin Response Timeout</a>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts"
     *        >Origin Connection Attempts</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setConnectionAttempts(Integer connectionAttempts) {
        this.connectionAttempts = connectionAttempts;
    }

    /**
     * <p>
     * The number of times that CloudFront attempts to connect to the origin. The minimum number is 1, the maximum is 3,
     * and the default (if you don’t specify otherwise) is 3.
     * </p>
     * <p>
     * For a custom origin (including an Amazon S3 bucket that’s configured with static website hosting), this value
     * also specifies the number of times that CloudFront attempts to get a response from the origin, in the case of an
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     * >Origin Response Timeout</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts"
     * >Origin Connection Attempts</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The number of times that CloudFront attempts to connect to the origin. The minimum number is 1, the
     *         maximum is 3, and the default (if you don’t specify otherwise) is 3.</p>
     *         <p>
     *         For a custom origin (including an Amazon S3 bucket that’s configured with static website hosting), this
     *         value also specifies the number of times that CloudFront attempts to get a response from the origin, in
     *         the case of an <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     *         >Origin Response Timeout</a>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts"
     *         >Origin Connection Attempts</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public Integer getConnectionAttempts() {
        return this.connectionAttempts;
    }

    /**
     * <p>
     * The number of times that CloudFront attempts to connect to the origin. The minimum number is 1, the maximum is 3,
     * and the default (if you don’t specify otherwise) is 3.
     * </p>
     * <p>
     * For a custom origin (including an Amazon S3 bucket that’s configured with static website hosting), this value
     * also specifies the number of times that CloudFront attempts to get a response from the origin, in the case of an
     * <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     * >Origin Response Timeout</a>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts"
     * >Origin Connection Attempts</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param connectionAttempts
     *        The number of times that CloudFront attempts to connect to the origin. The minimum number is 1, the
     *        maximum is 3, and the default (if you don’t specify otherwise) is 3.</p>
     *        <p>
     *        For a custom origin (including an Amazon S3 bucket that’s configured with static website hosting), this
     *        value also specifies the number of times that CloudFront attempts to get a response from the origin, in
     *        the case of an <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout"
     *        >Origin Response Timeout</a>.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts"
     *        >Origin Connection Attempts</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withConnectionAttempts(Integer connectionAttempts) {
        setConnectionAttempts(connectionAttempts);
        return this;
    }

    /**
     * <p>
     * The number of seconds that CloudFront waits when trying to establish a connection to the origin. The minimum
     * timeout is 1 second, the maximum is 10 seconds, and the default (if you don’t specify otherwise) is 10 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout"
     * >Origin Connection Timeout</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param connectionTimeout
     *        The number of seconds that CloudFront waits when trying to establish a connection to the origin. The
     *        minimum timeout is 1 second, the maximum is 10 seconds, and the default (if you don’t specify otherwise)
     *        is 10 seconds.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout"
     *        >Origin Connection Timeout</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * <p>
     * The number of seconds that CloudFront waits when trying to establish a connection to the origin. The minimum
     * timeout is 1 second, the maximum is 10 seconds, and the default (if you don’t specify otherwise) is 10 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout"
     * >Origin Connection Timeout</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The number of seconds that CloudFront waits when trying to establish a connection to the origin. The
     *         minimum timeout is 1 second, the maximum is 10 seconds, and the default (if you don’t specify otherwise)
     *         is 10 seconds.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout"
     *         >Origin Connection Timeout</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public Integer getConnectionTimeout() {
        return this.connectionTimeout;
    }

    /**
     * <p>
     * The number of seconds that CloudFront waits when trying to establish a connection to the origin. The minimum
     * timeout is 1 second, the maximum is 10 seconds, and the default (if you don’t specify otherwise) is 10 seconds.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout"
     * >Origin Connection Timeout</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param connectionTimeout
     *        The number of seconds that CloudFront waits when trying to establish a connection to the origin. The
     *        minimum timeout is 1 second, the maximum is 10 seconds, and the default (if you don’t specify otherwise)
     *        is 10 seconds.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout"
     *        >Origin Connection Timeout</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withConnectionTimeout(Integer connectionTimeout) {
        setConnectionTimeout(connectionTimeout);
        return this;
    }

    /**
     * <p>
     * CloudFront Origin Shield. Using Origin Shield can help reduce the load on your origin.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html">Using Origin
     * Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param originShield
     *        CloudFront Origin Shield. Using Origin Shield can help reduce the load on your origin.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html">Using Origin
     *        Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setOriginShield(OriginShield originShield) {
        this.originShield = originShield;
    }

    /**
     * <p>
     * CloudFront Origin Shield. Using Origin Shield can help reduce the load on your origin.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html">Using Origin
     * Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return CloudFront Origin Shield. Using Origin Shield can help reduce the load on your origin.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html">Using Origin
     *         Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public OriginShield getOriginShield() {
        return this.originShield;
    }

    /**
     * <p>
     * CloudFront Origin Shield. Using Origin Shield can help reduce the load on your origin.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html">Using Origin
     * Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param originShield
     *        CloudFront Origin Shield. Using Origin Shield can help reduce the load on your origin.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html">Using Origin
     *        Shield</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withOriginShield(OriginShield originShield) {
        setOriginShield(originShield);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getOriginPath() != null)
            sb.append("OriginPath: ").append(getOriginPath()).append(",");
        if (getCustomHeaders() != null)
            sb.append("CustomHeaders: ").append(getCustomHeaders()).append(",");
        if (getS3OriginConfig() != null)
            sb.append("S3OriginConfig: ").append(getS3OriginConfig()).append(",");
        if (getCustomOriginConfig() != null)
            sb.append("CustomOriginConfig: ").append(getCustomOriginConfig()).append(",");
        if (getConnectionAttempts() != null)
            sb.append("ConnectionAttempts: ").append(getConnectionAttempts()).append(",");
        if (getConnectionTimeout() != null)
            sb.append("ConnectionTimeout: ").append(getConnectionTimeout()).append(",");
        if (getOriginShield() != null)
            sb.append("OriginShield: ").append(getOriginShield());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Origin == false)
            return false;
        Origin other = (Origin) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getOriginPath() == null ^ this.getOriginPath() == null)
            return false;
        if (other.getOriginPath() != null && other.getOriginPath().equals(this.getOriginPath()) == false)
            return false;
        if (other.getCustomHeaders() == null ^ this.getCustomHeaders() == null)
            return false;
        if (other.getCustomHeaders() != null && other.getCustomHeaders().equals(this.getCustomHeaders()) == false)
            return false;
        if (other.getS3OriginConfig() == null ^ this.getS3OriginConfig() == null)
            return false;
        if (other.getS3OriginConfig() != null && other.getS3OriginConfig().equals(this.getS3OriginConfig()) == false)
            return false;
        if (other.getCustomOriginConfig() == null ^ this.getCustomOriginConfig() == null)
            return false;
        if (other.getCustomOriginConfig() != null && other.getCustomOriginConfig().equals(this.getCustomOriginConfig()) == false)
            return false;
        if (other.getConnectionAttempts() == null ^ this.getConnectionAttempts() == null)
            return false;
        if (other.getConnectionAttempts() != null && other.getConnectionAttempts().equals(this.getConnectionAttempts()) == false)
            return false;
        if (other.getConnectionTimeout() == null ^ this.getConnectionTimeout() == null)
            return false;
        if (other.getConnectionTimeout() != null && other.getConnectionTimeout().equals(this.getConnectionTimeout()) == false)
            return false;
        if (other.getOriginShield() == null ^ this.getOriginShield() == null)
            return false;
        if (other.getOriginShield() != null && other.getOriginShield().equals(this.getOriginShield()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getOriginPath() == null) ? 0 : getOriginPath().hashCode());
        hashCode = prime * hashCode + ((getCustomHeaders() == null) ? 0 : getCustomHeaders().hashCode());
        hashCode = prime * hashCode + ((getS3OriginConfig() == null) ? 0 : getS3OriginConfig().hashCode());
        hashCode = prime * hashCode + ((getCustomOriginConfig() == null) ? 0 : getCustomOriginConfig().hashCode());
        hashCode = prime * hashCode + ((getConnectionAttempts() == null) ? 0 : getConnectionAttempts().hashCode());
        hashCode = prime * hashCode + ((getConnectionTimeout() == null) ? 0 : getConnectionTimeout().hashCode());
        hashCode = prime * hashCode + ((getOriginShield() == null) ? 0 : getOriginShield().hashCode());
        return hashCode;
    }

    @Override
    public Origin clone() {
        try {
            return (Origin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
