/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * A complex type that describes the Amazon S3 bucket or the HTTP server (for
 * example, a web server) from which CloudFront gets your files.You must create
 * at least one origin.
 */
public class Origin implements Serializable, Cloneable {

    /**
     * A unique identifier for the origin. The value of Id must be unique within
     * the distribution. You use the value of Id when you create a cache
     * behavior. The Id identifies the origin that CloudFront routes a request to
     * when the request matches the path pattern for that cache behavior.
     */
    private String id;
    /**
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you
     * want CloudFront to get objects for this origin, for example,
     * myawsbucket.s3.amazonaws.com. Custom origins: The DNS domain name for the
     * HTTP server from which you want CloudFront to get objects for this origin,
     * for example, www.example.com.
     */
    private String domainName;
    /**
     * An optional element that causes CloudFront to request your content from a
     * directory in your Amazon S3 bucket or your custom origin. When you
     * include the OriginPath element, specify the directory name, beginning with
     * a /. CloudFront appends the directory name to the value of DomainName.
     */
    private String originPath;
    /**
     * A complex type that contains information about the custom headers
     * associated with this Origin.
     */
    private CustomHeaders customHeaders;
    /**
     * A complex type that contains information about the Amazon S3 origin. If
     * the origin is a custom origin, use the CustomOriginConfig element
     * instead.
     */
    private S3OriginConfig s3OriginConfig;
    /**
     * A complex type that contains information about a custom origin. If the
     * origin is an Amazon S3 bucket, use the S3OriginConfig element instead.
     */
    private CustomOriginConfig customOriginConfig;

    /**
     * A unique identifier for the origin. The value of Id must be unique within
     * the distribution. You use the value of Id when you create a cache
     * behavior. The Id identifies the origin that CloudFront routes a request to
     * when the request matches the path pattern for that cache behavior.
     * 
     * @param id
     *        A unique identifier for the origin. The value of Id must be unique
     *        within the distribution. You use the value of Id when you create a
     *        cache behavior. The Id identifies the origin that CloudFront
     *        routes a request to when the request matches the path pattern for
     *        that cache behavior.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A unique identifier for the origin. The value of Id must be unique within
     * the distribution. You use the value of Id when you create a cache
     * behavior. The Id identifies the origin that CloudFront routes a request to
     * when the request matches the path pattern for that cache behavior.
     * 
     * @return A unique identifier for the origin. The value of Id must be
     *         unique within the distribution. You use the value of Id when you
     *         create a cache behavior. The Id identifies the origin that
     *         CloudFront routes a request to when the request matches the path
     *         pattern for that cache behavior.
     */

    public String getId() {
        return this.id;
    }

    /**
     * A unique identifier for the origin. The value of Id must be unique within
     * the distribution. You use the value of Id when you create a cache
     * behavior. The Id identifies the origin that CloudFront routes a request to
     * when the request matches the path pattern for that cache behavior.
     * 
     * @param id
     *        A unique identifier for the origin. The value of Id must be unique
     *        within the distribution. You use the value of Id when you create a
     *        cache behavior. The Id identifies the origin that CloudFront
     *        routes a request to when the request matches the path pattern for
     *        that cache behavior.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Origin withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you
     * want CloudFront to get objects for this origin, for example,
     * myawsbucket.s3.amazonaws.com. Custom origins: The DNS domain name for the
     * HTTP server from which you want CloudFront to get objects for this origin,
     * for example, www.example.com.
     * 
     * @param domainName
     *        Amazon S3 origins: The DNS name of the Amazon S3 bucket from which
     *        you want CloudFront to get objects for this origin, for example,
     *        myawsbucket.s3.amazonaws.com. Custom origins: The DNS domain name
     *        for the HTTP server from which you want CloudFront to get objects
     *        for this origin, for example, www.example.com.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you
     * want CloudFront to get objects for this origin, for example,
     * myawsbucket.s3.amazonaws.com. Custom origins: The DNS domain name for the
     * HTTP server from which you want CloudFront to get objects for this origin,
     * for example, www.example.com.
     * 
     * @return Amazon S3 origins: The DNS name of the Amazon S3 bucket from
     *         which you want CloudFront to get objects for this origin, for
     *         example, myawsbucket.s3.amazonaws.com. Custom origins: The DNS
     *         domain name for the HTTP server from which you want CloudFront to
     *         get objects for this origin, for example, www.example.com.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Amazon S3 origins: The DNS name of the Amazon S3 bucket from which you
     * want CloudFront to get objects for this origin, for example,
     * myawsbucket.s3.amazonaws.com. Custom origins: The DNS domain name for the
     * HTTP server from which you want CloudFront to get objects for this origin,
     * for example, www.example.com.
     * 
     * @param domainName
     *        Amazon S3 origins: The DNS name of the Amazon S3 bucket from which
     *        you want CloudFront to get objects for this origin, for example,
     *        myawsbucket.s3.amazonaws.com. Custom origins: The DNS domain name
     *        for the HTTP server from which you want CloudFront to get objects
     *        for this origin, for example, www.example.com.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Origin withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * An optional element that causes CloudFront to request your content from a
     * directory in your Amazon S3 bucket or your custom origin. When you
     * include the OriginPath element, specify the directory name, beginning with
     * a /. CloudFront appends the directory name to the value of DomainName.
     * 
     * @param originPath
     *        An optional element that causes CloudFront to request your content
     *        from a directory in your Amazon S3 bucket or your custom origin.
     *        When you include the OriginPath element, specify the directory
     *        name, beginning with a /. CloudFront appends the directory name to
     *        the value of DomainName.
     */

    public void setOriginPath(String originPath) {
        this.originPath = originPath;
    }

    /**
     * An optional element that causes CloudFront to request your content from a
     * directory in your Amazon S3 bucket or your custom origin. When you
     * include the OriginPath element, specify the directory name, beginning with
     * a /. CloudFront appends the directory name to the value of DomainName.
     * 
     * @return An optional element that causes CloudFront to request your
     *         content from a directory in your Amazon S3 bucket or your custom
     *         origin. When you include the OriginPath element, specify the
     *         directory name, beginning with a /. CloudFront appends the
     *         directory name to the value of DomainName.
     */

    public String getOriginPath() {
        return this.originPath;
    }

    /**
     * An optional element that causes CloudFront to request your content from a
     * directory in your Amazon S3 bucket or your custom origin. When you
     * include the OriginPath element, specify the directory name, beginning with
     * a /. CloudFront appends the directory name to the value of DomainName.
     * 
     * @param originPath
     *        An optional element that causes CloudFront to request your content
     *        from a directory in your Amazon S3 bucket or your custom origin.
     *        When you include the OriginPath element, specify the directory
     *        name, beginning with a /. CloudFront appends the directory name to
     *        the value of DomainName.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Origin withOriginPath(String originPath) {
        setOriginPath(originPath);
        return this;
    }

    /**
     * A complex type that contains information about the custom headers
     * associated with this Origin.
     * 
     * @param customHeaders
     *        A complex type that contains information about the custom headers
     *        associated with this Origin.
     */

    public void setCustomHeaders(CustomHeaders customHeaders) {
        this.customHeaders = customHeaders;
    }

    /**
     * A complex type that contains information about the custom headers
     * associated with this Origin.
     * 
     * @return A complex type that contains information about the custom headers
     *         associated with this Origin.
     */

    public CustomHeaders getCustomHeaders() {
        return this.customHeaders;
    }

    /**
     * A complex type that contains information about the custom headers
     * associated with this Origin.
     * 
     * @param customHeaders
     *        A complex type that contains information about the custom headers
     *        associated with this Origin.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Origin withCustomHeaders(CustomHeaders customHeaders) {
        setCustomHeaders(customHeaders);
        return this;
    }

    /**
     * A complex type that contains information about the Amazon S3 origin. If
     * the origin is a custom origin, use the CustomOriginConfig element
     * instead.
     * 
     * @param s3OriginConfig
     *        A complex type that contains information about the Amazon S3
     *        origin. If the origin is a custom origin, use the
     *        CustomOriginConfig element instead.
     */

    public void setS3OriginConfig(S3OriginConfig s3OriginConfig) {
        this.s3OriginConfig = s3OriginConfig;
    }

    /**
     * A complex type that contains information about the Amazon S3 origin. If
     * the origin is a custom origin, use the CustomOriginConfig element
     * instead.
     * 
     * @return A complex type that contains information about the Amazon S3
     *         origin. If the origin is a custom origin, use the
     *         CustomOriginConfig element instead.
     */

    public S3OriginConfig getS3OriginConfig() {
        return this.s3OriginConfig;
    }

    /**
     * A complex type that contains information about the Amazon S3 origin. If
     * the origin is a custom origin, use the CustomOriginConfig element
     * instead.
     * 
     * @param s3OriginConfig
     *        A complex type that contains information about the Amazon S3
     *        origin. If the origin is a custom origin, use the
     *        CustomOriginConfig element instead.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Origin withS3OriginConfig(S3OriginConfig s3OriginConfig) {
        setS3OriginConfig(s3OriginConfig);
        return this;
    }

    /**
     * A complex type that contains information about a custom origin. If the
     * origin is an Amazon S3 bucket, use the S3OriginConfig element instead.
     * 
     * @param customOriginConfig
     *        A complex type that contains information about a custom origin. If
     *        the origin is an Amazon S3 bucket, use the S3OriginConfig element
     *        instead.
     */

    public void setCustomOriginConfig(CustomOriginConfig customOriginConfig) {
        this.customOriginConfig = customOriginConfig;
    }

    /**
     * A complex type that contains information about a custom origin. If the
     * origin is an Amazon S3 bucket, use the S3OriginConfig element instead.
     * 
     * @return A complex type that contains information about a custom origin.
     *         If the origin is an Amazon S3 bucket, use the S3OriginConfig
     *         element instead.
     */

    public CustomOriginConfig getCustomOriginConfig() {
        return this.customOriginConfig;
    }

    /**
     * A complex type that contains information about a custom origin. If the
     * origin is an Amazon S3 bucket, use the S3OriginConfig element instead.
     * 
     * @param customOriginConfig
     *        A complex type that contains information about a custom origin. If
     *        the origin is an Amazon S3 bucket, use the S3OriginConfig element
     *        instead.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Origin withCustomOriginConfig(CustomOriginConfig customOriginConfig) {
        setCustomOriginConfig(customOriginConfig);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Id: " + getId() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getOriginPath() != null)
            sb.append("OriginPath: " + getOriginPath() + ",");
        if (getCustomHeaders() != null)
            sb.append("CustomHeaders: " + getCustomHeaders() + ",");
        if (getS3OriginConfig() != null)
            sb.append("S3OriginConfig: " + getS3OriginConfig() + ",");
        if (getCustomOriginConfig() != null)
            sb.append("CustomOriginConfig: " + getCustomOriginConfig());
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
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getOriginPath() == null ^ this.getOriginPath() == null)
            return false;
        if (other.getOriginPath() != null
                && other.getOriginPath().equals(this.getOriginPath()) == false)
            return false;
        if (other.getCustomHeaders() == null ^ this.getCustomHeaders() == null)
            return false;
        if (other.getCustomHeaders() != null
                && other.getCustomHeaders().equals(this.getCustomHeaders()) == false)
            return false;
        if (other.getS3OriginConfig() == null
                ^ this.getS3OriginConfig() == null)
            return false;
        if (other.getS3OriginConfig() != null
                && other.getS3OriginConfig().equals(this.getS3OriginConfig()) == false)
            return false;
        if (other.getCustomOriginConfig() == null
                ^ this.getCustomOriginConfig() == null)
            return false;
        if (other.getCustomOriginConfig() != null
                && other.getCustomOriginConfig().equals(
                        this.getCustomOriginConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getOriginPath() == null) ? 0 : getOriginPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomHeaders() == null) ? 0 : getCustomHeaders()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getS3OriginConfig() == null) ? 0 : getS3OriginConfig()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomOriginConfig() == null) ? 0
                        : getCustomOriginConfig().hashCode());
        return hashCode;
    }

    @Override
    public Origin clone() {
        try {
            return (Origin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
