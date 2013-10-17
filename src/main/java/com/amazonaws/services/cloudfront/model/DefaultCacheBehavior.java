/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * A complex type that describes the default cache behavior if you do not specify a CacheBehavior element or if files don't match any of the values of
 * PathPattern in CacheBehavior elements.You must create exactly one default cache behavior.
 * </p>
 */
public class DefaultCacheBehavior implements Serializable {

    /**
     * The value of ID for the origin that you want CloudFront to route
     * requests to when a request matches the path pattern either for a cache
     * behavior or for the default cache behavior.
     */
    private String targetOriginId;

    /**
     * A complex type that specifies how CloudFront handles query strings and
     * cookies.
     */
    private ForwardedValues forwardedValues;

    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     */
    private TrustedSigners trustedSigners;

    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     */
    private String viewerProtocolPolicy;

    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000
     * seconds (100 years).
     */
    private Long minTTL;

    /**
     * A complex type that controls which HTTP methods CloudFront processes
     * and forwards to your Amazon S3 bucket or your custom origin. There are
     * two options: - CloudFront forwards only GET and HEAD requests. -
     * CloudFront forwards DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT
     * requests. If you choose the second option, you may need to restrict
     * access to your Amazon S3 bucket or to your custom origin so users
     * can't perform operations that you don't want them to. For example, you
     * may not want users to have permission to delete objects from your
     * origin.
     */
    private AllowedMethods allowedMethods;

    /**
     * The value of ID for the origin that you want CloudFront to route
     * requests to when a request matches the path pattern either for a cache
     * behavior or for the default cache behavior.
     *
     * @return The value of ID for the origin that you want CloudFront to route
     *         requests to when a request matches the path pattern either for a cache
     *         behavior or for the default cache behavior.
     */
    public String getTargetOriginId() {
        return targetOriginId;
    }
    
    /**
     * The value of ID for the origin that you want CloudFront to route
     * requests to when a request matches the path pattern either for a cache
     * behavior or for the default cache behavior.
     *
     * @param targetOriginId The value of ID for the origin that you want CloudFront to route
     *         requests to when a request matches the path pattern either for a cache
     *         behavior or for the default cache behavior.
     */
    public void setTargetOriginId(String targetOriginId) {
        this.targetOriginId = targetOriginId;
    }
    
    /**
     * The value of ID for the origin that you want CloudFront to route
     * requests to when a request matches the path pattern either for a cache
     * behavior or for the default cache behavior.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetOriginId The value of ID for the origin that you want CloudFront to route
     *         requests to when a request matches the path pattern either for a cache
     *         behavior or for the default cache behavior.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DefaultCacheBehavior withTargetOriginId(String targetOriginId) {
        this.targetOriginId = targetOriginId;
        return this;
    }

    /**
     * A complex type that specifies how CloudFront handles query strings and
     * cookies.
     *
     * @return A complex type that specifies how CloudFront handles query strings and
     *         cookies.
     */
    public ForwardedValues getForwardedValues() {
        return forwardedValues;
    }
    
    /**
     * A complex type that specifies how CloudFront handles query strings and
     * cookies.
     *
     * @param forwardedValues A complex type that specifies how CloudFront handles query strings and
     *         cookies.
     */
    public void setForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
    }
    
    /**
     * A complex type that specifies how CloudFront handles query strings and
     * cookies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param forwardedValues A complex type that specifies how CloudFront handles query strings and
     *         cookies.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DefaultCacheBehavior withForwardedValues(ForwardedValues forwardedValues) {
        this.forwardedValues = forwardedValues;
        return this;
    }

    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     *
     * @return A complex type that specifies the AWS accounts, if any, that you want
     *         to allow to create signed URLs for private content. If you want to
     *         require signed URLs in requests for objects in the target origin that
     *         match the PathPattern for this cache behavior, specify true for
     *         Enabled, and specify the applicable values for Quantity and Items. For
     *         more information, go to Using a Signed URL to Serve Private Content in
     *         the Amazon CloudFront Developer Guide. If you don't want to require
     *         signed URLs in requests for objects that match PathPattern, specify
     *         false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     *         remove one or more trusted signers, change Enabled to true (if it's
     *         currently false), change Quantity as applicable, and specify all of
     *         the trusted signers that you want to include in the updated
     *         distribution.
     */
    public TrustedSigners getTrustedSigners() {
        return trustedSigners;
    }
    
    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     *
     * @param trustedSigners A complex type that specifies the AWS accounts, if any, that you want
     *         to allow to create signed URLs for private content. If you want to
     *         require signed URLs in requests for objects in the target origin that
     *         match the PathPattern for this cache behavior, specify true for
     *         Enabled, and specify the applicable values for Quantity and Items. For
     *         more information, go to Using a Signed URL to Serve Private Content in
     *         the Amazon CloudFront Developer Guide. If you don't want to require
     *         signed URLs in requests for objects that match PathPattern, specify
     *         false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     *         remove one or more trusted signers, change Enabled to true (if it's
     *         currently false), change Quantity as applicable, and specify all of
     *         the trusted signers that you want to include in the updated
     *         distribution.
     */
    public void setTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
    }
    
    /**
     * A complex type that specifies the AWS accounts, if any, that you want
     * to allow to create signed URLs for private content. If you want to
     * require signed URLs in requests for objects in the target origin that
     * match the PathPattern for this cache behavior, specify true for
     * Enabled, and specify the applicable values for Quantity and Items. For
     * more information, go to Using a Signed URL to Serve Private Content in
     * the Amazon CloudFront Developer Guide. If you don't want to require
     * signed URLs in requests for objects that match PathPattern, specify
     * false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     * remove one or more trusted signers, change Enabled to true (if it's
     * currently false), change Quantity as applicable, and specify all of
     * the trusted signers that you want to include in the updated
     * distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trustedSigners A complex type that specifies the AWS accounts, if any, that you want
     *         to allow to create signed URLs for private content. If you want to
     *         require signed URLs in requests for objects in the target origin that
     *         match the PathPattern for this cache behavior, specify true for
     *         Enabled, and specify the applicable values for Quantity and Items. For
     *         more information, go to Using a Signed URL to Serve Private Content in
     *         the Amazon CloudFront Developer Guide. If you don't want to require
     *         signed URLs in requests for objects that match PathPattern, specify
     *         false for Enabled and 0 for Quantity. Omit Items. To add, change, or
     *         remove one or more trusted signers, change Enabled to true (if it's
     *         currently false), change Quantity as applicable, and specify all of
     *         the trusted signers that you want to include in the updated
     *         distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DefaultCacheBehavior withTrustedSigners(TrustedSigners trustedSigners) {
        this.trustedSigners = trustedSigners;
        return this;
    }

    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     *
     * @return Use this element to specify the protocol that users can use to access
     *         the files in the origin specified by TargetOriginId when a request
     *         matches the path pattern in PathPattern. If you want CloudFront to
     *         allow end users to use any available protocol, specify allow-all. If
     *         you want CloudFront to require HTTPS, specify https.
     *
     * @see ViewerProtocolPolicy
     */
    public String getViewerProtocolPolicy() {
        return viewerProtocolPolicy;
    }
    
    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     *
     * @param viewerProtocolPolicy Use this element to specify the protocol that users can use to access
     *         the files in the origin specified by TargetOriginId when a request
     *         matches the path pattern in PathPattern. If you want CloudFront to
     *         allow end users to use any available protocol, specify allow-all. If
     *         you want CloudFront to require HTTPS, specify https.
     *
     * @see ViewerProtocolPolicy
     */
    public void setViewerProtocolPolicy(String viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
    }
    
    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     *
     * @param viewerProtocolPolicy Use this element to specify the protocol that users can use to access
     *         the files in the origin specified by TargetOriginId when a request
     *         matches the path pattern in PathPattern. If you want CloudFront to
     *         allow end users to use any available protocol, specify allow-all. If
     *         you want CloudFront to require HTTPS, specify https.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ViewerProtocolPolicy
     */
    public DefaultCacheBehavior withViewerProtocolPolicy(String viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy;
        return this;
    }

    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     *
     * @param viewerProtocolPolicy Use this element to specify the protocol that users can use to access
     *         the files in the origin specified by TargetOriginId when a request
     *         matches the path pattern in PathPattern. If you want CloudFront to
     *         allow end users to use any available protocol, specify allow-all. If
     *         you want CloudFront to require HTTPS, specify https.
     *
     * @see ViewerProtocolPolicy
     */
    public void setViewerProtocolPolicy(ViewerProtocolPolicy viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy.toString();
    }
    
    /**
     * Use this element to specify the protocol that users can use to access
     * the files in the origin specified by TargetOriginId when a request
     * matches the path pattern in PathPattern. If you want CloudFront to
     * allow end users to use any available protocol, specify allow-all. If
     * you want CloudFront to require HTTPS, specify https.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>allow-all, https-only
     *
     * @param viewerProtocolPolicy Use this element to specify the protocol that users can use to access
     *         the files in the origin specified by TargetOriginId when a request
     *         matches the path pattern in PathPattern. If you want CloudFront to
     *         allow end users to use any available protocol, specify allow-all. If
     *         you want CloudFront to require HTTPS, specify https.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ViewerProtocolPolicy
     */
    public DefaultCacheBehavior withViewerProtocolPolicy(ViewerProtocolPolicy viewerProtocolPolicy) {
        this.viewerProtocolPolicy = viewerProtocolPolicy.toString();
        return this;
    }

    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000
     * seconds (100 years).
     *
     * @return The minimum amount of time that you want objects to stay in CloudFront
     *         caches before CloudFront queries your origin to see whether the object
     *         has been updated.You can specify a value from 0 to 3,153,600,000
     *         seconds (100 years).
     */
    public Long getMinTTL() {
        return minTTL;
    }
    
    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000
     * seconds (100 years).
     *
     * @param minTTL The minimum amount of time that you want objects to stay in CloudFront
     *         caches before CloudFront queries your origin to see whether the object
     *         has been updated.You can specify a value from 0 to 3,153,600,000
     *         seconds (100 years).
     */
    public void setMinTTL(Long minTTL) {
        this.minTTL = minTTL;
    }
    
    /**
     * The minimum amount of time that you want objects to stay in CloudFront
     * caches before CloudFront queries your origin to see whether the object
     * has been updated.You can specify a value from 0 to 3,153,600,000
     * seconds (100 years).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minTTL The minimum amount of time that you want objects to stay in CloudFront
     *         caches before CloudFront queries your origin to see whether the object
     *         has been updated.You can specify a value from 0 to 3,153,600,000
     *         seconds (100 years).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DefaultCacheBehavior withMinTTL(Long minTTL) {
        this.minTTL = minTTL;
        return this;
    }

    /**
     * A complex type that controls which HTTP methods CloudFront processes
     * and forwards to your Amazon S3 bucket or your custom origin. There are
     * two options: - CloudFront forwards only GET and HEAD requests. -
     * CloudFront forwards DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT
     * requests. If you choose the second option, you may need to restrict
     * access to your Amazon S3 bucket or to your custom origin so users
     * can't perform operations that you don't want them to. For example, you
     * may not want users to have permission to delete objects from your
     * origin.
     *
     * @return A complex type that controls which HTTP methods CloudFront processes
     *         and forwards to your Amazon S3 bucket or your custom origin. There are
     *         two options: - CloudFront forwards only GET and HEAD requests. -
     *         CloudFront forwards DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT
     *         requests. If you choose the second option, you may need to restrict
     *         access to your Amazon S3 bucket or to your custom origin so users
     *         can't perform operations that you don't want them to. For example, you
     *         may not want users to have permission to delete objects from your
     *         origin.
     */
    public AllowedMethods getAllowedMethods() {
        return allowedMethods;
    }
    
    /**
     * A complex type that controls which HTTP methods CloudFront processes
     * and forwards to your Amazon S3 bucket or your custom origin. There are
     * two options: - CloudFront forwards only GET and HEAD requests. -
     * CloudFront forwards DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT
     * requests. If you choose the second option, you may need to restrict
     * access to your Amazon S3 bucket or to your custom origin so users
     * can't perform operations that you don't want them to. For example, you
     * may not want users to have permission to delete objects from your
     * origin.
     *
     * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
     *         and forwards to your Amazon S3 bucket or your custom origin. There are
     *         two options: - CloudFront forwards only GET and HEAD requests. -
     *         CloudFront forwards DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT
     *         requests. If you choose the second option, you may need to restrict
     *         access to your Amazon S3 bucket or to your custom origin so users
     *         can't perform operations that you don't want them to. For example, you
     *         may not want users to have permission to delete objects from your
     *         origin.
     */
    public void setAllowedMethods(AllowedMethods allowedMethods) {
        this.allowedMethods = allowedMethods;
    }
    
    /**
     * A complex type that controls which HTTP methods CloudFront processes
     * and forwards to your Amazon S3 bucket or your custom origin. There are
     * two options: - CloudFront forwards only GET and HEAD requests. -
     * CloudFront forwards DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT
     * requests. If you choose the second option, you may need to restrict
     * access to your Amazon S3 bucket or to your custom origin so users
     * can't perform operations that you don't want them to. For example, you
     * may not want users to have permission to delete objects from your
     * origin.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
     *         and forwards to your Amazon S3 bucket or your custom origin. There are
     *         two options: - CloudFront forwards only GET and HEAD requests. -
     *         CloudFront forwards DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT
     *         requests. If you choose the second option, you may need to restrict
     *         access to your Amazon S3 bucket or to your custom origin so users
     *         can't perform operations that you don't want them to. For example, you
     *         may not want users to have permission to delete objects from your
     *         origin.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DefaultCacheBehavior withAllowedMethods(AllowedMethods allowedMethods) {
        this.allowedMethods = allowedMethods;
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
        if (getTargetOriginId() != null) sb.append("TargetOriginId: " + getTargetOriginId() + ",");
        if (getForwardedValues() != null) sb.append("ForwardedValues: " + getForwardedValues() + ",");
        if (getTrustedSigners() != null) sb.append("TrustedSigners: " + getTrustedSigners() + ",");
        if (getViewerProtocolPolicy() != null) sb.append("ViewerProtocolPolicy: " + getViewerProtocolPolicy() + ",");
        if (getMinTTL() != null) sb.append("MinTTL: " + getMinTTL() + ",");
        if (getAllowedMethods() != null) sb.append("AllowedMethods: " + getAllowedMethods() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTargetOriginId() == null) ? 0 : getTargetOriginId().hashCode()); 
        hashCode = prime * hashCode + ((getForwardedValues() == null) ? 0 : getForwardedValues().hashCode()); 
        hashCode = prime * hashCode + ((getTrustedSigners() == null) ? 0 : getTrustedSigners().hashCode()); 
        hashCode = prime * hashCode + ((getViewerProtocolPolicy() == null) ? 0 : getViewerProtocolPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getMinTTL() == null) ? 0 : getMinTTL().hashCode()); 
        hashCode = prime * hashCode + ((getAllowedMethods() == null) ? 0 : getAllowedMethods().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DefaultCacheBehavior == false) return false;
        DefaultCacheBehavior other = (DefaultCacheBehavior)obj;
        
        if (other.getTargetOriginId() == null ^ this.getTargetOriginId() == null) return false;
        if (other.getTargetOriginId() != null && other.getTargetOriginId().equals(this.getTargetOriginId()) == false) return false; 
        if (other.getForwardedValues() == null ^ this.getForwardedValues() == null) return false;
        if (other.getForwardedValues() != null && other.getForwardedValues().equals(this.getForwardedValues()) == false) return false; 
        if (other.getTrustedSigners() == null ^ this.getTrustedSigners() == null) return false;
        if (other.getTrustedSigners() != null && other.getTrustedSigners().equals(this.getTrustedSigners()) == false) return false; 
        if (other.getViewerProtocolPolicy() == null ^ this.getViewerProtocolPolicy() == null) return false;
        if (other.getViewerProtocolPolicy() != null && other.getViewerProtocolPolicy().equals(this.getViewerProtocolPolicy()) == false) return false; 
        if (other.getMinTTL() == null ^ this.getMinTTL() == null) return false;
        if (other.getMinTTL() != null && other.getMinTTL().equals(this.getMinTTL()) == false) return false; 
        if (other.getAllowedMethods() == null ^ this.getAllowedMethods() == null) return false;
        if (other.getAllowedMethods() != null && other.getAllowedMethods().equals(this.getAllowedMethods()) == false) return false; 
        return true;
    }
    
}
    