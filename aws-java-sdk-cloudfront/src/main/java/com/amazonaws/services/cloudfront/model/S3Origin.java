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
 * A complex type that contains information about the Amazon S3 bucket from which you want CloudFront to get your media
 * files for distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/S3Origin" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Origin implements Serializable, Cloneable {

    /**
     * <p>
     * The DNS name of the Amazon S3 origin.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The CloudFront origin access identity to associate with the RTMP distribution. Use an origin access identity to
     * configure the distribution so that end users can only access objects in an Amazon S3 bucket through CloudFront.
     * </p>
     * <p>
     * If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL, specify
     * an empty <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To delete the origin access identity from an existing distribution, update the distribution configuration and
     * include an empty <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To replace the origin access identity, update the distribution configuration and specify the new origin access
     * identity.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     * >Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content</a> in the <i>Amazon Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     */
    private String originAccessIdentity;

    /**
     * Default constructor for S3Origin object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public S3Origin() {
    }

    /**
     * Constructs a new S3Origin object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param domainName
     *        The DNS name of the Amazon S3 origin.
     */
    public S3Origin(String domainName) {
        setDomainName(domainName);
    }

    /**
     * Constructs a new S3Origin object. Callers should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param domainName
     *        The DNS name of the Amazon S3 origin.
     * @param originAccessIdentity
     *        The CloudFront origin access identity to associate with the RTMP distribution. Use an origin access
     *        identity to configure the distribution so that end users can only access objects in an Amazon S3 bucket
     *        through CloudFront.</p>
     *        <p>
     *        If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL,
     *        specify an empty <code>OriginAccessIdentity</code> element.
     *        </p>
     *        <p>
     *        To delete the origin access identity from an existing distribution, update the distribution configuration
     *        and include an empty <code>OriginAccessIdentity</code> element.
     *        </p>
     *        <p>
     *        To replace the origin access identity, update the distribution configuration and specify the new origin
     *        access identity.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *        >Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content</a> in the <i>Amazon Amazon
     *        CloudFront Developer Guide</i>.
     */
    public S3Origin(String domainName, String originAccessIdentity) {
        setDomainName(domainName);
        setOriginAccessIdentity(originAccessIdentity);
    }

    /**
     * <p>
     * The DNS name of the Amazon S3 origin.
     * </p>
     * 
     * @param domainName
     *        The DNS name of the Amazon S3 origin.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The DNS name of the Amazon S3 origin.
     * </p>
     * 
     * @return The DNS name of the Amazon S3 origin.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The DNS name of the Amazon S3 origin.
     * </p>
     * 
     * @param domainName
     *        The DNS name of the Amazon S3 origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Origin withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The CloudFront origin access identity to associate with the RTMP distribution. Use an origin access identity to
     * configure the distribution so that end users can only access objects in an Amazon S3 bucket through CloudFront.
     * </p>
     * <p>
     * If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL, specify
     * an empty <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To delete the origin access identity from an existing distribution, update the distribution configuration and
     * include an empty <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To replace the origin access identity, update the distribution configuration and specify the new origin access
     * identity.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     * >Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content</a> in the <i>Amazon Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param originAccessIdentity
     *        The CloudFront origin access identity to associate with the RTMP distribution. Use an origin access
     *        identity to configure the distribution so that end users can only access objects in an Amazon S3 bucket
     *        through CloudFront.</p>
     *        <p>
     *        If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL,
     *        specify an empty <code>OriginAccessIdentity</code> element.
     *        </p>
     *        <p>
     *        To delete the origin access identity from an existing distribution, update the distribution configuration
     *        and include an empty <code>OriginAccessIdentity</code> element.
     *        </p>
     *        <p>
     *        To replace the origin access identity, update the distribution configuration and specify the new origin
     *        access identity.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *        >Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content</a> in the <i>Amazon Amazon
     *        CloudFront Developer Guide</i>.
     */

    public void setOriginAccessIdentity(String originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
    }

    /**
     * <p>
     * The CloudFront origin access identity to associate with the RTMP distribution. Use an origin access identity to
     * configure the distribution so that end users can only access objects in an Amazon S3 bucket through CloudFront.
     * </p>
     * <p>
     * If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL, specify
     * an empty <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To delete the origin access identity from an existing distribution, update the distribution configuration and
     * include an empty <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To replace the origin access identity, update the distribution configuration and specify the new origin access
     * identity.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     * >Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content</a> in the <i>Amazon Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * 
     * @return The CloudFront origin access identity to associate with the RTMP distribution. Use an origin access
     *         identity to configure the distribution so that end users can only access objects in an Amazon S3 bucket
     *         through CloudFront.</p>
     *         <p>
     *         If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL,
     *         specify an empty <code>OriginAccessIdentity</code> element.
     *         </p>
     *         <p>
     *         To delete the origin access identity from an existing distribution, update the distribution configuration
     *         and include an empty <code>OriginAccessIdentity</code> element.
     *         </p>
     *         <p>
     *         To replace the origin access identity, update the distribution configuration and specify the new origin
     *         access identity.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *         >Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content</a> in the <i>Amazon Amazon
     *         CloudFront Developer Guide</i>.
     */

    public String getOriginAccessIdentity() {
        return this.originAccessIdentity;
    }

    /**
     * <p>
     * The CloudFront origin access identity to associate with the RTMP distribution. Use an origin access identity to
     * configure the distribution so that end users can only access objects in an Amazon S3 bucket through CloudFront.
     * </p>
     * <p>
     * If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL, specify
     * an empty <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To delete the origin access identity from an existing distribution, update the distribution configuration and
     * include an empty <code>OriginAccessIdentity</code> element.
     * </p>
     * <p>
     * To replace the origin access identity, update the distribution configuration and specify the new origin access
     * identity.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     * >Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content</a> in the <i>Amazon Amazon
     * CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param originAccessIdentity
     *        The CloudFront origin access identity to associate with the RTMP distribution. Use an origin access
     *        identity to configure the distribution so that end users can only access objects in an Amazon S3 bucket
     *        through CloudFront.</p>
     *        <p>
     *        If you want end users to be able to access objects using either the CloudFront URL or the Amazon S3 URL,
     *        specify an empty <code>OriginAccessIdentity</code> element.
     *        </p>
     *        <p>
     *        To delete the origin access identity from an existing distribution, update the distribution configuration
     *        and include an empty <code>OriginAccessIdentity</code> element.
     *        </p>
     *        <p>
     *        To replace the origin access identity, update the distribution configuration and specify the new origin
     *        access identity.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html"
     *        >Using an Origin Access Identity to Restrict Access to Your Amazon S3 Content</a> in the <i>Amazon Amazon
     *        CloudFront Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Origin withOriginAccessIdentity(String originAccessIdentity) {
        setOriginAccessIdentity(originAccessIdentity);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getOriginAccessIdentity() != null)
            sb.append("OriginAccessIdentity: ").append(getOriginAccessIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Origin == false)
            return false;
        S3Origin other = (S3Origin) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getOriginAccessIdentity() == null ^ this.getOriginAccessIdentity() == null)
            return false;
        if (other.getOriginAccessIdentity() != null && other.getOriginAccessIdentity().equals(this.getOriginAccessIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getOriginAccessIdentity() == null) ? 0 : getOriginAccessIdentity().hashCode());
        return hashCode;
    }

    @Override
    public S3Origin clone() {
        try {
            return (S3Origin) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
