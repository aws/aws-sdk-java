/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A complex type that describes the Amazon S3 bucket, HTTP server (for example, a web server), Amazon MediaStore, or
 * other server from which CloudFront gets your files. This can also be an origin group, if you've created an origin
 * group. You must specify at least one origin or origin group.
 * </p>
 * <p>
 * For the current limit on the number of origins or origin groups that you can specify for a distribution, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_cloudfront">Amazon CloudFront
 * Limits</a> in the <i>AWS General Reference</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/Origin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Origin implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the origin or origin group. The value of <code>Id</code> must be unique within the
     * distribution.
     * </p>
     * <p>
     * When you specify the value of <code>TargetOriginId</code> for the default cache behavior or for another cache
     * behavior, you indicate the origin to which you want the cache behavior to route requests by specifying the value
     * of the <code>Id</code> element for that origin. When a request matches the path pattern for that cache behavior,
     * CloudFront routes the request to the specified origin. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior"
     * >Cache Behavior Settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * <b>Amazon S3 origins</b>: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for
     * this origin, for example, <code>myawsbucket.s3.amazonaws.com</code>. If you set up your bucket to be configured
     * as a website endpoint, enter the Amazon S3 static website hosting endpoint for the bucket.
     * </p>
     * <p>
     * For more information about specifying this value for different types of origins, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     * >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Constraints for Amazon S3 origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you configured Amazon S3 Transfer Acceleration for your bucket, don't specify the <code>s3-accelerate</code>
     * endpoint for <code>DomainName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must be between 3 and 63 characters long (inclusive).
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must contain only lowercase characters, numbers, periods, underscores, and dashes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must not contain adjacent periods.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Custom Origins</b>: The DNS domain name for the HTTP server from which you want CloudFront to get objects for
     * this origin, for example, <code>www.example.com</code>.
     * </p>
     * <p>
     * Constraints for custom origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DomainName</code> must be a valid DNS name that contains only a-z, A-Z, 0-9, dot (.), hyphen (-), or
     * underscore (_) characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name cannot exceed 128 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String domainName;
    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or
     * your custom origin. When you include the <code>OriginPath</code> element, specify the directory name, beginning
     * with a <code>/</code>. CloudFront appends the directory name to the value of <code>DomainName</code>, for
     * example, <code>example.com/production</code>. Do not include a <code>/</code> at the end of the directory name.
     * </p>
     * <p>
     * For example, suppose you've specified the following values for your distribution:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DomainName</code>: An Amazon S3 bucket named <code>myawsbucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginPath</code>: <code>/production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>: <code>example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a user enters <code>example.com/index.html</code> in a browser, CloudFront sends a request to Amazon S3 for
     * <code>myawsbucket/production/index.html</code>.
     * </p>
     * <p>
     * When a user enters <code>example.com/acme/index.html</code> in a browser, CloudFront sends a request to Amazon S3
     * for <code>myawsbucket/production/acme/index.html</code>.
     * </p>
     */
    private String originPath;
    /**
     * <p>
     * A complex type that contains names and values for the custom headers that you want.
     * </p>
     */
    private CustomHeaders customHeaders;
    /**
     * <p>
     * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the
     * <code>CustomOriginConfig</code> element instead.
     * </p>
     */
    private S3OriginConfig s3OriginConfig;
    /**
     * <p>
     * A complex type that contains information about a custom origin. If the origin is an Amazon S3 bucket, use the
     * <code>S3OriginConfig</code> element instead.
     * </p>
     */
    private CustomOriginConfig customOriginConfig;

    /**
     * <p>
     * A unique identifier for the origin or origin group. The value of <code>Id</code> must be unique within the
     * distribution.
     * </p>
     * <p>
     * When you specify the value of <code>TargetOriginId</code> for the default cache behavior or for another cache
     * behavior, you indicate the origin to which you want the cache behavior to route requests by specifying the value
     * of the <code>Id</code> element for that origin. When a request matches the path pattern for that cache behavior,
     * CloudFront routes the request to the specified origin. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior"
     * >Cache Behavior Settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the origin or origin group. The value of <code>Id</code> must be unique within the
     *        distribution.</p>
     *        <p>
     *        When you specify the value of <code>TargetOriginId</code> for the default cache behavior or for another
     *        cache behavior, you indicate the origin to which you want the cache behavior to route requests by
     *        specifying the value of the <code>Id</code> element for that origin. When a request matches the path
     *        pattern for that cache behavior, CloudFront routes the request to the specified origin. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior"
     *        >Cache Behavior Settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the origin or origin group. The value of <code>Id</code> must be unique within the
     * distribution.
     * </p>
     * <p>
     * When you specify the value of <code>TargetOriginId</code> for the default cache behavior or for another cache
     * behavior, you indicate the origin to which you want the cache behavior to route requests by specifying the value
     * of the <code>Id</code> element for that origin. When a request matches the path pattern for that cache behavior,
     * CloudFront routes the request to the specified origin. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior"
     * >Cache Behavior Settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return A unique identifier for the origin or origin group. The value of <code>Id</code> must be unique within
     *         the distribution.</p>
     *         <p>
     *         When you specify the value of <code>TargetOriginId</code> for the default cache behavior or for another
     *         cache behavior, you indicate the origin to which you want the cache behavior to route requests by
     *         specifying the value of the <code>Id</code> element for that origin. When a request matches the path
     *         pattern for that cache behavior, CloudFront routes the request to the specified origin. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior"
     *         >Cache Behavior Settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * A unique identifier for the origin or origin group. The value of <code>Id</code> must be unique within the
     * distribution.
     * </p>
     * <p>
     * When you specify the value of <code>TargetOriginId</code> for the default cache behavior or for another cache
     * behavior, you indicate the origin to which you want the cache behavior to route requests by specifying the value
     * of the <code>Id</code> element for that origin. When a request matches the path pattern for that cache behavior,
     * CloudFront routes the request to the specified origin. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior"
     * >Cache Behavior Settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param id
     *        A unique identifier for the origin or origin group. The value of <code>Id</code> must be unique within the
     *        distribution.</p>
     *        <p>
     *        When you specify the value of <code>TargetOriginId</code> for the default cache behavior or for another
     *        cache behavior, you indicate the origin to which you want the cache behavior to route requests by
     *        specifying the value of the <code>Id</code> element for that origin. When a request matches the path
     *        pattern for that cache behavior, CloudFront routes the request to the specified origin. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior"
     *        >Cache Behavior Settings</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * <b>Amazon S3 origins</b>: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for
     * this origin, for example, <code>myawsbucket.s3.amazonaws.com</code>. If you set up your bucket to be configured
     * as a website endpoint, enter the Amazon S3 static website hosting endpoint for the bucket.
     * </p>
     * <p>
     * For more information about specifying this value for different types of origins, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     * >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Constraints for Amazon S3 origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you configured Amazon S3 Transfer Acceleration for your bucket, don't specify the <code>s3-accelerate</code>
     * endpoint for <code>DomainName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must be between 3 and 63 characters long (inclusive).
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must contain only lowercase characters, numbers, periods, underscores, and dashes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must not contain adjacent periods.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Custom Origins</b>: The DNS domain name for the HTTP server from which you want CloudFront to get objects for
     * this origin, for example, <code>www.example.com</code>.
     * </p>
     * <p>
     * Constraints for custom origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DomainName</code> must be a valid DNS name that contains only a-z, A-Z, 0-9, dot (.), hyphen (-), or
     * underscore (_) characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name cannot exceed 128 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param domainName
     *        <b>Amazon S3 origins</b>: The DNS name of the Amazon S3 bucket from which you want CloudFront to get
     *        objects for this origin, for example, <code>myawsbucket.s3.amazonaws.com</code>. If you set up your bucket
     *        to be configured as a website endpoint, enter the Amazon S3 static website hosting endpoint for the
     *        bucket.</p>
     *        <p>
     *        For more information about specifying this value for different types of origins, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     *        >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        Constraints for Amazon S3 origins:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you configured Amazon S3 Transfer Acceleration for your bucket, don't specify the
     *        <code>s3-accelerate</code> endpoint for <code>DomainName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket name must be between 3 and 63 characters long (inclusive).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket name must contain only lowercase characters, numbers, periods, underscores, and dashes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket name must not contain adjacent periods.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Custom Origins</b>: The DNS domain name for the HTTP server from which you want CloudFront to get
     *        objects for this origin, for example, <code>www.example.com</code>.
     *        </p>
     *        <p>
     *        Constraints for custom origins:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DomainName</code> must be a valid DNS name that contains only a-z, A-Z, 0-9, dot (.), hyphen (-), or
     *        underscore (_) characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name cannot exceed 128 characters.
     *        </p>
     *        </li>
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * <b>Amazon S3 origins</b>: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for
     * this origin, for example, <code>myawsbucket.s3.amazonaws.com</code>. If you set up your bucket to be configured
     * as a website endpoint, enter the Amazon S3 static website hosting endpoint for the bucket.
     * </p>
     * <p>
     * For more information about specifying this value for different types of origins, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     * >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Constraints for Amazon S3 origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you configured Amazon S3 Transfer Acceleration for your bucket, don't specify the <code>s3-accelerate</code>
     * endpoint for <code>DomainName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must be between 3 and 63 characters long (inclusive).
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must contain only lowercase characters, numbers, periods, underscores, and dashes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must not contain adjacent periods.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Custom Origins</b>: The DNS domain name for the HTTP server from which you want CloudFront to get objects for
     * this origin, for example, <code>www.example.com</code>.
     * </p>
     * <p>
     * Constraints for custom origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DomainName</code> must be a valid DNS name that contains only a-z, A-Z, 0-9, dot (.), hyphen (-), or
     * underscore (_) characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name cannot exceed 128 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <b>Amazon S3 origins</b>: The DNS name of the Amazon S3 bucket from which you want CloudFront to get
     *         objects for this origin, for example, <code>myawsbucket.s3.amazonaws.com</code>. If you set up your
     *         bucket to be configured as a website endpoint, enter the Amazon S3 static website hosting endpoint for
     *         the bucket.</p>
     *         <p>
     *         For more information about specifying this value for different types of origins, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     *         >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         Constraints for Amazon S3 origins:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you configured Amazon S3 Transfer Acceleration for your bucket, don't specify the
     *         <code>s3-accelerate</code> endpoint for <code>DomainName</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket name must be between 3 and 63 characters long (inclusive).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket name must contain only lowercase characters, numbers, periods, underscores, and dashes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The bucket name must not contain adjacent periods.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Custom Origins</b>: The DNS domain name for the HTTP server from which you want CloudFront to get
     *         objects for this origin, for example, <code>www.example.com</code>.
     *         </p>
     *         <p>
     *         Constraints for custom origins:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DomainName</code> must be a valid DNS name that contains only a-z, A-Z, 0-9, dot (.), hyphen (-),
     *         or underscore (_) characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name cannot exceed 128 characters.
     *         </p>
     *         </li>
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * <b>Amazon S3 origins</b>: The DNS name of the Amazon S3 bucket from which you want CloudFront to get objects for
     * this origin, for example, <code>myawsbucket.s3.amazonaws.com</code>. If you set up your bucket to be configured
     * as a website endpoint, enter the Amazon S3 static website hosting endpoint for the bucket.
     * </p>
     * <p>
     * For more information about specifying this value for different types of origins, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     * >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * Constraints for Amazon S3 origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you configured Amazon S3 Transfer Acceleration for your bucket, don't specify the <code>s3-accelerate</code>
     * endpoint for <code>DomainName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must be between 3 and 63 characters long (inclusive).
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must contain only lowercase characters, numbers, periods, underscores, and dashes.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bucket name must not contain adjacent periods.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Custom Origins</b>: The DNS domain name for the HTTP server from which you want CloudFront to get objects for
     * this origin, for example, <code>www.example.com</code>.
     * </p>
     * <p>
     * Constraints for custom origins:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DomainName</code> must be a valid DNS name that contains only a-z, A-Z, 0-9, dot (.), hyphen (-), or
     * underscore (_) characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name cannot exceed 128 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param domainName
     *        <b>Amazon S3 origins</b>: The DNS name of the Amazon S3 bucket from which you want CloudFront to get
     *        objects for this origin, for example, <code>myawsbucket.s3.amazonaws.com</code>. If you set up your bucket
     *        to be configured as a website endpoint, enter the Amazon S3 static website hosting endpoint for the
     *        bucket.</p>
     *        <p>
     *        For more information about specifying this value for different types of origins, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName"
     *        >Origin Domain Name</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        Constraints for Amazon S3 origins:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you configured Amazon S3 Transfer Acceleration for your bucket, don't specify the
     *        <code>s3-accelerate</code> endpoint for <code>DomainName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket name must be between 3 and 63 characters long (inclusive).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket name must contain only lowercase characters, numbers, periods, underscores, and dashes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The bucket name must not contain adjacent periods.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Custom Origins</b>: The DNS domain name for the HTTP server from which you want CloudFront to get
     *        objects for this origin, for example, <code>www.example.com</code>.
     *        </p>
     *        <p>
     *        Constraints for custom origins:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DomainName</code> must be a valid DNS name that contains only a-z, A-Z, 0-9, dot (.), hyphen (-), or
     *        underscore (_) characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name cannot exceed 128 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or
     * your custom origin. When you include the <code>OriginPath</code> element, specify the directory name, beginning
     * with a <code>/</code>. CloudFront appends the directory name to the value of <code>DomainName</code>, for
     * example, <code>example.com/production</code>. Do not include a <code>/</code> at the end of the directory name.
     * </p>
     * <p>
     * For example, suppose you've specified the following values for your distribution:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DomainName</code>: An Amazon S3 bucket named <code>myawsbucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginPath</code>: <code>/production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>: <code>example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a user enters <code>example.com/index.html</code> in a browser, CloudFront sends a request to Amazon S3 for
     * <code>myawsbucket/production/index.html</code>.
     * </p>
     * <p>
     * When a user enters <code>example.com/acme/index.html</code> in a browser, CloudFront sends a request to Amazon S3
     * for <code>myawsbucket/production/acme/index.html</code>.
     * </p>
     * 
     * @param originPath
     *        An optional element that causes CloudFront to request your content from a directory in your Amazon S3
     *        bucket or your custom origin. When you include the <code>OriginPath</code> element, specify the directory
     *        name, beginning with a <code>/</code>. CloudFront appends the directory name to the value of
     *        <code>DomainName</code>, for example, <code>example.com/production</code>. Do not include a <code>/</code>
     *        at the end of the directory name.</p>
     *        <p>
     *        For example, suppose you've specified the following values for your distribution:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DomainName</code>: An Amazon S3 bucket named <code>myawsbucket</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OriginPath</code>: <code>/production</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CNAME</code>: <code>example.com</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When a user enters <code>example.com/index.html</code> in a browser, CloudFront sends a request to Amazon
     *        S3 for <code>myawsbucket/production/index.html</code>.
     *        </p>
     *        <p>
     *        When a user enters <code>example.com/acme/index.html</code> in a browser, CloudFront sends a request to
     *        Amazon S3 for <code>myawsbucket/production/acme/index.html</code>.
     */

    public void setOriginPath(String originPath) {
        this.originPath = originPath;
    }

    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or
     * your custom origin. When you include the <code>OriginPath</code> element, specify the directory name, beginning
     * with a <code>/</code>. CloudFront appends the directory name to the value of <code>DomainName</code>, for
     * example, <code>example.com/production</code>. Do not include a <code>/</code> at the end of the directory name.
     * </p>
     * <p>
     * For example, suppose you've specified the following values for your distribution:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DomainName</code>: An Amazon S3 bucket named <code>myawsbucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginPath</code>: <code>/production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>: <code>example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a user enters <code>example.com/index.html</code> in a browser, CloudFront sends a request to Amazon S3 for
     * <code>myawsbucket/production/index.html</code>.
     * </p>
     * <p>
     * When a user enters <code>example.com/acme/index.html</code> in a browser, CloudFront sends a request to Amazon S3
     * for <code>myawsbucket/production/acme/index.html</code>.
     * </p>
     * 
     * @return An optional element that causes CloudFront to request your content from a directory in your Amazon S3
     *         bucket or your custom origin. When you include the <code>OriginPath</code> element, specify the directory
     *         name, beginning with a <code>/</code>. CloudFront appends the directory name to the value of
     *         <code>DomainName</code>, for example, <code>example.com/production</code>. Do not include a
     *         <code>/</code> at the end of the directory name.</p>
     *         <p>
     *         For example, suppose you've specified the following values for your distribution:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DomainName</code>: An Amazon S3 bucket named <code>myawsbucket</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OriginPath</code>: <code>/production</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CNAME</code>: <code>example.com</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When a user enters <code>example.com/index.html</code> in a browser, CloudFront sends a request to Amazon
     *         S3 for <code>myawsbucket/production/index.html</code>.
     *         </p>
     *         <p>
     *         When a user enters <code>example.com/acme/index.html</code> in a browser, CloudFront sends a request to
     *         Amazon S3 for <code>myawsbucket/production/acme/index.html</code>.
     */

    public String getOriginPath() {
        return this.originPath;
    }

    /**
     * <p>
     * An optional element that causes CloudFront to request your content from a directory in your Amazon S3 bucket or
     * your custom origin. When you include the <code>OriginPath</code> element, specify the directory name, beginning
     * with a <code>/</code>. CloudFront appends the directory name to the value of <code>DomainName</code>, for
     * example, <code>example.com/production</code>. Do not include a <code>/</code> at the end of the directory name.
     * </p>
     * <p>
     * For example, suppose you've specified the following values for your distribution:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DomainName</code>: An Amazon S3 bucket named <code>myawsbucket</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OriginPath</code>: <code>/production</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CNAME</code>: <code>example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When a user enters <code>example.com/index.html</code> in a browser, CloudFront sends a request to Amazon S3 for
     * <code>myawsbucket/production/index.html</code>.
     * </p>
     * <p>
     * When a user enters <code>example.com/acme/index.html</code> in a browser, CloudFront sends a request to Amazon S3
     * for <code>myawsbucket/production/acme/index.html</code>.
     * </p>
     * 
     * @param originPath
     *        An optional element that causes CloudFront to request your content from a directory in your Amazon S3
     *        bucket or your custom origin. When you include the <code>OriginPath</code> element, specify the directory
     *        name, beginning with a <code>/</code>. CloudFront appends the directory name to the value of
     *        <code>DomainName</code>, for example, <code>example.com/production</code>. Do not include a <code>/</code>
     *        at the end of the directory name.</p>
     *        <p>
     *        For example, suppose you've specified the following values for your distribution:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DomainName</code>: An Amazon S3 bucket named <code>myawsbucket</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OriginPath</code>: <code>/production</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CNAME</code>: <code>example.com</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When a user enters <code>example.com/index.html</code> in a browser, CloudFront sends a request to Amazon
     *        S3 for <code>myawsbucket/production/index.html</code>.
     *        </p>
     *        <p>
     *        When a user enters <code>example.com/acme/index.html</code> in a browser, CloudFront sends a request to
     *        Amazon S3 for <code>myawsbucket/production/acme/index.html</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withOriginPath(String originPath) {
        setOriginPath(originPath);
        return this;
    }

    /**
     * <p>
     * A complex type that contains names and values for the custom headers that you want.
     * </p>
     * 
     * @param customHeaders
     *        A complex type that contains names and values for the custom headers that you want.
     */

    public void setCustomHeaders(CustomHeaders customHeaders) {
        this.customHeaders = customHeaders;
    }

    /**
     * <p>
     * A complex type that contains names and values for the custom headers that you want.
     * </p>
     * 
     * @return A complex type that contains names and values for the custom headers that you want.
     */

    public CustomHeaders getCustomHeaders() {
        return this.customHeaders;
    }

    /**
     * <p>
     * A complex type that contains names and values for the custom headers that you want.
     * </p>
     * 
     * @param customHeaders
     *        A complex type that contains names and values for the custom headers that you want.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withCustomHeaders(CustomHeaders customHeaders) {
        setCustomHeaders(customHeaders);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the
     * <code>CustomOriginConfig</code> element instead.
     * </p>
     * 
     * @param s3OriginConfig
     *        A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use
     *        the <code>CustomOriginConfig</code> element instead.
     */

    public void setS3OriginConfig(S3OriginConfig s3OriginConfig) {
        this.s3OriginConfig = s3OriginConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the
     * <code>CustomOriginConfig</code> element instead.
     * </p>
     * 
     * @return A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin,
     *         use the <code>CustomOriginConfig</code> element instead.
     */

    public S3OriginConfig getS3OriginConfig() {
        return this.s3OriginConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use the
     * <code>CustomOriginConfig</code> element instead.
     * </p>
     * 
     * @param s3OriginConfig
     *        A complex type that contains information about the Amazon S3 origin. If the origin is a custom origin, use
     *        the <code>CustomOriginConfig</code> element instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withS3OriginConfig(S3OriginConfig s3OriginConfig) {
        setS3OriginConfig(s3OriginConfig);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about a custom origin. If the origin is an Amazon S3 bucket, use the
     * <code>S3OriginConfig</code> element instead.
     * </p>
     * 
     * @param customOriginConfig
     *        A complex type that contains information about a custom origin. If the origin is an Amazon S3 bucket, use
     *        the <code>S3OriginConfig</code> element instead.
     */

    public void setCustomOriginConfig(CustomOriginConfig customOriginConfig) {
        this.customOriginConfig = customOriginConfig;
    }

    /**
     * <p>
     * A complex type that contains information about a custom origin. If the origin is an Amazon S3 bucket, use the
     * <code>S3OriginConfig</code> element instead.
     * </p>
     * 
     * @return A complex type that contains information about a custom origin. If the origin is an Amazon S3 bucket, use
     *         the <code>S3OriginConfig</code> element instead.
     */

    public CustomOriginConfig getCustomOriginConfig() {
        return this.customOriginConfig;
    }

    /**
     * <p>
     * A complex type that contains information about a custom origin. If the origin is an Amazon S3 bucket, use the
     * <code>S3OriginConfig</code> element instead.
     * </p>
     * 
     * @param customOriginConfig
     *        A complex type that contains information about a custom origin. If the origin is an Amazon S3 bucket, use
     *        the <code>S3OriginConfig</code> element instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Origin withCustomOriginConfig(CustomOriginConfig customOriginConfig) {
        setCustomOriginConfig(customOriginConfig);
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
            sb.append("CustomOriginConfig: ").append(getCustomOriginConfig());
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
