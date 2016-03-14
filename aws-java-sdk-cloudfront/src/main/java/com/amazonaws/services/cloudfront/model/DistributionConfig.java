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
 * A distribution Configuration.
 */
public class DistributionConfig implements Serializable, Cloneable {

    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the DistributionConfig
     * object), a new distribution is created. If the CallerReference is a value
     * you already sent in a previous request to create a distribution, and the
     * content of the DistributionConfig is identical to the original request
     * (ignoring white space), the response includes the same information
     * returned to the original request. If the CallerReference is a value you
     * already sent in a previous request to create a distribution but the
     * content of the DistributionConfig is different from the original request,
     * CloudFront returns a DistributionAlreadyExists error.
     */
    private String callerReference;
    /**
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     */
    private Aliases aliases;
    /**
     * The object that you want CloudFront to return (for example, index.html)
     * when an end user requests the root URL for your distribution
     * (http://www.example.com) instead of an object in your distribution
     * (http://www.example.com/index.html). Specifying a default root object
     * avoids exposing the contents of your distribution. If you don't want to
     * specify a default root object when you create a distribution, include an
     * empty DefaultRootObject element. To delete the default root object from an
     * existing distribution, update the distribution configuration and include
     * an empty DefaultRootObject element. To replace the default root object,
     * update the distribution configuration and specify the new object.
     */
    private String defaultRootObject;
    /**
     * A complex type that contains information about origins for this
     * distribution.
     */
    private Origins origins;
    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the values
     * of PathPattern in CacheBehavior elements.You must create exactly one
     * default cache behavior.
     */
    private DefaultCacheBehavior defaultCacheBehavior;
    /** A complex type that contains zero or more CacheBehavior elements. */
    private CacheBehaviors cacheBehaviors;
    /** A complex type that contains zero or more CustomErrorResponse elements. */
    private CustomErrorResponses customErrorResponses;
    /** Any comments you want to include about the distribution. */
    private String comment;
    /**
     * A complex type that controls whether access logs are written for the
     * distribution.
     */
    private LoggingConfig logging;
    /**
     * A complex type that contains information about price class for this
     * distribution.
     */
    private String priceClass;
    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     */
    private Boolean enabled;

    private ViewerCertificate viewerCertificate;

    private Restrictions restrictions;
    /**
     * (Optional) If you're using AWS WAF to filter CloudFront requests, the Id
     * of the AWS WAF web ACL that is associated with the distribution.
     */
    private String webACLId;

    /**
     * Default constructor for DistributionConfig object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public DistributionConfig() {
    }

    /**
     * Constructs a new DistributionConfig object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param callerReference
     *        A unique number that ensures the request can't be replayed. If the
     *        CallerReference is new (no matter the content of the
     *        DistributionConfig object), a new distribution is created. If the
     *        CallerReference is a value you already sent in a previous request
     *        to create a distribution, and the content of the
     *        DistributionConfig is identical to the original request (ignoring
     *        white space), the response includes the same information returned
     *        to the original request. If the CallerReference is a value you
     *        already sent in a previous request to create a distribution but
     *        the content of the DistributionConfig is different from the
     *        original request, CloudFront returns a DistributionAlreadyExists
     *        error.
     * @param enabled
     *        Whether the distribution is enabled to accept end user requests
     *        for content.
     */
    public DistributionConfig(String callerReference, Boolean enabled) {
        setCallerReference(callerReference);
        setEnabled(enabled);
    }

    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the DistributionConfig
     * object), a new distribution is created. If the CallerReference is a value
     * you already sent in a previous request to create a distribution, and the
     * content of the DistributionConfig is identical to the original request
     * (ignoring white space), the response includes the same information
     * returned to the original request. If the CallerReference is a value you
     * already sent in a previous request to create a distribution but the
     * content of the DistributionConfig is different from the original request,
     * CloudFront returns a DistributionAlreadyExists error.
     * 
     * @param callerReference
     *        A unique number that ensures the request can't be replayed. If the
     *        CallerReference is new (no matter the content of the
     *        DistributionConfig object), a new distribution is created. If the
     *        CallerReference is a value you already sent in a previous request
     *        to create a distribution, and the content of the
     *        DistributionConfig is identical to the original request (ignoring
     *        white space), the response includes the same information returned
     *        to the original request. If the CallerReference is a value you
     *        already sent in a previous request to create a distribution but
     *        the content of the DistributionConfig is different from the
     *        original request, CloudFront returns a DistributionAlreadyExists
     *        error.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the DistributionConfig
     * object), a new distribution is created. If the CallerReference is a value
     * you already sent in a previous request to create a distribution, and the
     * content of the DistributionConfig is identical to the original request
     * (ignoring white space), the response includes the same information
     * returned to the original request. If the CallerReference is a value you
     * already sent in a previous request to create a distribution but the
     * content of the DistributionConfig is different from the original request,
     * CloudFront returns a DistributionAlreadyExists error.
     * 
     * @return A unique number that ensures the request can't be replayed. If
     *         the CallerReference is new (no matter the content of the
     *         DistributionConfig object), a new distribution is created. If the
     *         CallerReference is a value you already sent in a previous request
     *         to create a distribution, and the content of the
     *         DistributionConfig is identical to the original request (ignoring
     *         white space), the response includes the same information returned
     *         to the original request. If the CallerReference is a value you
     *         already sent in a previous request to create a distribution but
     *         the content of the DistributionConfig is different from the
     *         original request, CloudFront returns a DistributionAlreadyExists
     *         error.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the DistributionConfig
     * object), a new distribution is created. If the CallerReference is a value
     * you already sent in a previous request to create a distribution, and the
     * content of the DistributionConfig is identical to the original request
     * (ignoring white space), the response includes the same information
     * returned to the original request. If the CallerReference is a value you
     * already sent in a previous request to create a distribution but the
     * content of the DistributionConfig is different from the original request,
     * CloudFront returns a DistributionAlreadyExists error.
     * 
     * @param callerReference
     *        A unique number that ensures the request can't be replayed. If the
     *        CallerReference is new (no matter the content of the
     *        DistributionConfig object), a new distribution is created. If the
     *        CallerReference is a value you already sent in a previous request
     *        to create a distribution, and the content of the
     *        DistributionConfig is identical to the original request (ignoring
     *        white space), the response includes the same information returned
     *        to the original request. If the CallerReference is a value you
     *        already sent in a previous request to create a distribution but
     *        the content of the DistributionConfig is different from the
     *        original request, CloudFront returns a DistributionAlreadyExists
     *        error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * 
     * @param aliases
     *        A complex type that contains information about CNAMEs (alternate
     *        domain names), if any, for this distribution.
     */

    public void setAliases(Aliases aliases) {
        this.aliases = aliases;
    }

    /**
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * 
     * @return A complex type that contains information about CNAMEs (alternate
     *         domain names), if any, for this distribution.
     */

    public Aliases getAliases() {
        return this.aliases;
    }

    /**
     * A complex type that contains information about CNAMEs (alternate domain
     * names), if any, for this distribution.
     * 
     * @param aliases
     *        A complex type that contains information about CNAMEs (alternate
     *        domain names), if any, for this distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withAliases(Aliases aliases) {
        setAliases(aliases);
        return this;
    }

    /**
     * The object that you want CloudFront to return (for example, index.html)
     * when an end user requests the root URL for your distribution
     * (http://www.example.com) instead of an object in your distribution
     * (http://www.example.com/index.html). Specifying a default root object
     * avoids exposing the contents of your distribution. If you don't want to
     * specify a default root object when you create a distribution, include an
     * empty DefaultRootObject element. To delete the default root object from an
     * existing distribution, update the distribution configuration and include
     * an empty DefaultRootObject element. To replace the default root object,
     * update the distribution configuration and specify the new object.
     * 
     * @param defaultRootObject
     *        The object that you want CloudFront to return (for example,
     *        index.html) when an end user requests the root URL for your
     *        distribution (http://www.example.com) instead of an object in your
     *        distribution (http://www.example.com/index.html). Specifying a
     *        default root object avoids exposing the contents of your
     *        distribution. If you don't want to specify a default root object
     *        when you create a distribution, include an empty DefaultRootObject
     *        element. To delete the default root object from an existing
     *        distribution, update the distribution configuration and include an
     *        empty DefaultRootObject element. To replace the default root
     *        object, update the distribution configuration and specify the new
     *        object.
     */

    public void setDefaultRootObject(String defaultRootObject) {
        this.defaultRootObject = defaultRootObject;
    }

    /**
     * The object that you want CloudFront to return (for example, index.html)
     * when an end user requests the root URL for your distribution
     * (http://www.example.com) instead of an object in your distribution
     * (http://www.example.com/index.html). Specifying a default root object
     * avoids exposing the contents of your distribution. If you don't want to
     * specify a default root object when you create a distribution, include an
     * empty DefaultRootObject element. To delete the default root object from an
     * existing distribution, update the distribution configuration and include
     * an empty DefaultRootObject element. To replace the default root object,
     * update the distribution configuration and specify the new object.
     * 
     * @return The object that you want CloudFront to return (for example,
     *         index.html) when an end user requests the root URL for your
     *         distribution (http://www.example.com) instead of an object in
     *         your distribution (http://www.example.com/index.html). Specifying
     *         a default root object avoids exposing the contents of your
     *         distribution. If you don't want to specify a default root object
     *         when you create a distribution, include an empty
     *         DefaultRootObject element. To delete the default root object from
     *         an existing distribution, update the distribution configuration
     *         and include an empty DefaultRootObject element. To replace the
     *         default root object, update the distribution configuration and
     *         specify the new object.
     */

    public String getDefaultRootObject() {
        return this.defaultRootObject;
    }

    /**
     * The object that you want CloudFront to return (for example, index.html)
     * when an end user requests the root URL for your distribution
     * (http://www.example.com) instead of an object in your distribution
     * (http://www.example.com/index.html). Specifying a default root object
     * avoids exposing the contents of your distribution. If you don't want to
     * specify a default root object when you create a distribution, include an
     * empty DefaultRootObject element. To delete the default root object from an
     * existing distribution, update the distribution configuration and include
     * an empty DefaultRootObject element. To replace the default root object,
     * update the distribution configuration and specify the new object.
     * 
     * @param defaultRootObject
     *        The object that you want CloudFront to return (for example,
     *        index.html) when an end user requests the root URL for your
     *        distribution (http://www.example.com) instead of an object in your
     *        distribution (http://www.example.com/index.html). Specifying a
     *        default root object avoids exposing the contents of your
     *        distribution. If you don't want to specify a default root object
     *        when you create a distribution, include an empty DefaultRootObject
     *        element. To delete the default root object from an existing
     *        distribution, update the distribution configuration and include an
     *        empty DefaultRootObject element. To replace the default root
     *        object, update the distribution configuration and specify the new
     *        object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withDefaultRootObject(String defaultRootObject) {
        setDefaultRootObject(defaultRootObject);
        return this;
    }

    /**
     * A complex type that contains information about origins for this
     * distribution.
     * 
     * @param origins
     *        A complex type that contains information about origins for this
     *        distribution.
     */

    public void setOrigins(Origins origins) {
        this.origins = origins;
    }

    /**
     * A complex type that contains information about origins for this
     * distribution.
     * 
     * @return A complex type that contains information about origins for this
     *         distribution.
     */

    public Origins getOrigins() {
        return this.origins;
    }

    /**
     * A complex type that contains information about origins for this
     * distribution.
     * 
     * @param origins
     *        A complex type that contains information about origins for this
     *        distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withOrigins(Origins origins) {
        setOrigins(origins);
        return this;
    }

    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the values
     * of PathPattern in CacheBehavior elements.You must create exactly one
     * default cache behavior.
     * 
     * @param defaultCacheBehavior
     *        A complex type that describes the default cache behavior if you do
     *        not specify a CacheBehavior element or if files don't match any of
     *        the values of PathPattern in CacheBehavior elements.You must
     *        create exactly one default cache behavior.
     */

    public void setDefaultCacheBehavior(
            DefaultCacheBehavior defaultCacheBehavior) {
        this.defaultCacheBehavior = defaultCacheBehavior;
    }

    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the values
     * of PathPattern in CacheBehavior elements.You must create exactly one
     * default cache behavior.
     * 
     * @return A complex type that describes the default cache behavior if you
     *         do not specify a CacheBehavior element or if files don't match
     *         any of the values of PathPattern in CacheBehavior elements.You
     *         must create exactly one default cache behavior.
     */

    public DefaultCacheBehavior getDefaultCacheBehavior() {
        return this.defaultCacheBehavior;
    }

    /**
     * A complex type that describes the default cache behavior if you do not
     * specify a CacheBehavior element or if files don't match any of the values
     * of PathPattern in CacheBehavior elements.You must create exactly one
     * default cache behavior.
     * 
     * @param defaultCacheBehavior
     *        A complex type that describes the default cache behavior if you do
     *        not specify a CacheBehavior element or if files don't match any of
     *        the values of PathPattern in CacheBehavior elements.You must
     *        create exactly one default cache behavior.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withDefaultCacheBehavior(
            DefaultCacheBehavior defaultCacheBehavior) {
        setDefaultCacheBehavior(defaultCacheBehavior);
        return this;
    }

    /**
     * A complex type that contains zero or more CacheBehavior elements.
     * 
     * @param cacheBehaviors
     *        A complex type that contains zero or more CacheBehavior elements.
     */

    public void setCacheBehaviors(CacheBehaviors cacheBehaviors) {
        this.cacheBehaviors = cacheBehaviors;
    }

    /**
     * A complex type that contains zero or more CacheBehavior elements.
     * 
     * @return A complex type that contains zero or more CacheBehavior elements.
     */

    public CacheBehaviors getCacheBehaviors() {
        return this.cacheBehaviors;
    }

    /**
     * A complex type that contains zero or more CacheBehavior elements.
     * 
     * @param cacheBehaviors
     *        A complex type that contains zero or more CacheBehavior elements.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withCacheBehaviors(CacheBehaviors cacheBehaviors) {
        setCacheBehaviors(cacheBehaviors);
        return this;
    }

    /**
     * A complex type that contains zero or more CustomErrorResponse elements.
     * 
     * @param customErrorResponses
     *        A complex type that contains zero or more CustomErrorResponse
     *        elements.
     */

    public void setCustomErrorResponses(
            CustomErrorResponses customErrorResponses) {
        this.customErrorResponses = customErrorResponses;
    }

    /**
     * A complex type that contains zero or more CustomErrorResponse elements.
     * 
     * @return A complex type that contains zero or more CustomErrorResponse
     *         elements.
     */

    public CustomErrorResponses getCustomErrorResponses() {
        return this.customErrorResponses;
    }

    /**
     * A complex type that contains zero or more CustomErrorResponse elements.
     * 
     * @param customErrorResponses
     *        A complex type that contains zero or more CustomErrorResponse
     *        elements.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withCustomErrorResponses(
            CustomErrorResponses customErrorResponses) {
        setCustomErrorResponses(customErrorResponses);
        return this;
    }

    /**
     * Any comments you want to include about the distribution.
     * 
     * @param comment
     *        Any comments you want to include about the distribution.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Any comments you want to include about the distribution.
     * 
     * @return Any comments you want to include about the distribution.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * Any comments you want to include about the distribution.
     * 
     * @param comment
     *        Any comments you want to include about the distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * A complex type that controls whether access logs are written for the
     * distribution.
     * 
     * @param logging
     *        A complex type that controls whether access logs are written for
     *        the distribution.
     */

    public void setLogging(LoggingConfig logging) {
        this.logging = logging;
    }

    /**
     * A complex type that controls whether access logs are written for the
     * distribution.
     * 
     * @return A complex type that controls whether access logs are written for
     *         the distribution.
     */

    public LoggingConfig getLogging() {
        return this.logging;
    }

    /**
     * A complex type that controls whether access logs are written for the
     * distribution.
     * 
     * @param logging
     *        A complex type that controls whether access logs are written for
     *        the distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withLogging(LoggingConfig logging) {
        setLogging(logging);
        return this;
    }

    /**
     * A complex type that contains information about price class for this
     * distribution.
     * 
     * @param priceClass
     *        A complex type that contains information about price class for
     *        this distribution.
     * @see PriceClass
     */

    public void setPriceClass(String priceClass) {
        this.priceClass = priceClass;
    }

    /**
     * A complex type that contains information about price class for this
     * distribution.
     * 
     * @return A complex type that contains information about price class for
     *         this distribution.
     * @see PriceClass
     */

    public String getPriceClass() {
        return this.priceClass;
    }

    /**
     * A complex type that contains information about price class for this
     * distribution.
     * 
     * @param priceClass
     *        A complex type that contains information about price class for
     *        this distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PriceClass
     */

    public DistributionConfig withPriceClass(String priceClass) {
        setPriceClass(priceClass);
        return this;
    }

    /**
     * A complex type that contains information about price class for this
     * distribution.
     * 
     * @param priceClass
     *        A complex type that contains information about price class for
     *        this distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PriceClass
     */

    public void setPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass.toString();
    }

    /**
     * A complex type that contains information about price class for this
     * distribution.
     * 
     * @param priceClass
     *        A complex type that contains information about price class for
     *        this distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PriceClass
     */

    public DistributionConfig withPriceClass(PriceClass priceClass) {
        setPriceClass(priceClass);
        return this;
    }

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * 
     * @param enabled
     *        Whether the distribution is enabled to accept end user requests
     *        for content.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * 
     * @return Whether the distribution is enabled to accept end user requests
     *         for content.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * 
     * @param enabled
     *        Whether the distribution is enabled to accept end user requests
     *        for content.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * Whether the distribution is enabled to accept end user requests for
     * content.
     * 
     * @return Whether the distribution is enabled to accept end user requests
     *         for content.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * @param viewerCertificate
     */

    public void setViewerCertificate(ViewerCertificate viewerCertificate) {
        this.viewerCertificate = viewerCertificate;
    }

    /**
     * @return
     */

    public ViewerCertificate getViewerCertificate() {
        return this.viewerCertificate;
    }

    /**
     * @param viewerCertificate
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withViewerCertificate(
            ViewerCertificate viewerCertificate) {
        setViewerCertificate(viewerCertificate);
        return this;
    }

    /**
     * @param restrictions
     */

    public void setRestrictions(Restrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * @return
     */

    public Restrictions getRestrictions() {
        return this.restrictions;
    }

    /**
     * @param restrictions
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withRestrictions(Restrictions restrictions) {
        setRestrictions(restrictions);
        return this;
    }

    /**
     * (Optional) If you're using AWS WAF to filter CloudFront requests, the Id
     * of the AWS WAF web ACL that is associated with the distribution.
     * 
     * @param webACLId
     *        (Optional) If you're using AWS WAF to filter CloudFront requests,
     *        the Id of the AWS WAF web ACL that is associated with the
     *        distribution.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * (Optional) If you're using AWS WAF to filter CloudFront requests, the Id
     * of the AWS WAF web ACL that is associated with the distribution.
     * 
     * @return (Optional) If you're using AWS WAF to filter CloudFront requests,
     *         the Id of the AWS WAF web ACL that is associated with the
     *         distribution.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * (Optional) If you're using AWS WAF to filter CloudFront requests, the Id
     * of the AWS WAF web ACL that is associated with the distribution.
     * 
     * @param webACLId
     *        (Optional) If you're using AWS WAF to filter CloudFront requests,
     *        the Id of the AWS WAF web ACL that is associated with the
     *        distribution.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DistributionConfig withWebACLId(String webACLId) {
        setWebACLId(webACLId);
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
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference() + ",");
        if (getAliases() != null)
            sb.append("Aliases: " + getAliases() + ",");
        if (getDefaultRootObject() != null)
            sb.append("DefaultRootObject: " + getDefaultRootObject() + ",");
        if (getOrigins() != null)
            sb.append("Origins: " + getOrigins() + ",");
        if (getDefaultCacheBehavior() != null)
            sb.append("DefaultCacheBehavior: " + getDefaultCacheBehavior()
                    + ",");
        if (getCacheBehaviors() != null)
            sb.append("CacheBehaviors: " + getCacheBehaviors() + ",");
        if (getCustomErrorResponses() != null)
            sb.append("CustomErrorResponses: " + getCustomErrorResponses()
                    + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getLogging() != null)
            sb.append("Logging: " + getLogging() + ",");
        if (getPriceClass() != null)
            sb.append("PriceClass: " + getPriceClass() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getViewerCertificate() != null)
            sb.append("ViewerCertificate: " + getViewerCertificate() + ",");
        if (getRestrictions() != null)
            sb.append("Restrictions: " + getRestrictions() + ",");
        if (getWebACLId() != null)
            sb.append("WebACLId: " + getWebACLId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DistributionConfig == false)
            return false;
        DistributionConfig other = (DistributionConfig) obj;
        if (other.getCallerReference() == null
                ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getAliases() == null ^ this.getAliases() == null)
            return false;
        if (other.getAliases() != null
                && other.getAliases().equals(this.getAliases()) == false)
            return false;
        if (other.getDefaultRootObject() == null
                ^ this.getDefaultRootObject() == null)
            return false;
        if (other.getDefaultRootObject() != null
                && other.getDefaultRootObject().equals(
                        this.getDefaultRootObject()) == false)
            return false;
        if (other.getOrigins() == null ^ this.getOrigins() == null)
            return false;
        if (other.getOrigins() != null
                && other.getOrigins().equals(this.getOrigins()) == false)
            return false;
        if (other.getDefaultCacheBehavior() == null
                ^ this.getDefaultCacheBehavior() == null)
            return false;
        if (other.getDefaultCacheBehavior() != null
                && other.getDefaultCacheBehavior().equals(
                        this.getDefaultCacheBehavior()) == false)
            return false;
        if (other.getCacheBehaviors() == null
                ^ this.getCacheBehaviors() == null)
            return false;
        if (other.getCacheBehaviors() != null
                && other.getCacheBehaviors().equals(this.getCacheBehaviors()) == false)
            return false;
        if (other.getCustomErrorResponses() == null
                ^ this.getCustomErrorResponses() == null)
            return false;
        if (other.getCustomErrorResponses() != null
                && other.getCustomErrorResponses().equals(
                        this.getCustomErrorResponses()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null
                && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getPriceClass() == null ^ this.getPriceClass() == null)
            return false;
        if (other.getPriceClass() != null
                && other.getPriceClass().equals(this.getPriceClass()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null
                && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getViewerCertificate() == null
                ^ this.getViewerCertificate() == null)
            return false;
        if (other.getViewerCertificate() != null
                && other.getViewerCertificate().equals(
                        this.getViewerCertificate()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null
                && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null
                && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAliases() == null) ? 0 : getAliases().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultRootObject() == null) ? 0
                        : getDefaultRootObject().hashCode());
        hashCode = prime * hashCode
                + ((getOrigins() == null) ? 0 : getOrigins().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultCacheBehavior() == null) ? 0
                        : getDefaultCacheBehavior().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheBehaviors() == null) ? 0 : getCacheBehaviors()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomErrorResponses() == null) ? 0
                        : getCustomErrorResponses().hashCode());
        hashCode = prime * hashCode
                + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode
                + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode
                + ((getPriceClass() == null) ? 0 : getPriceClass().hashCode());
        hashCode = prime * hashCode
                + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getViewerCertificate() == null) ? 0
                        : getViewerCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getRestrictions() == null) ? 0 : getRestrictions()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        return hashCode;
    }

    @Override
    public DistributionConfig clone() {
        try {
            return (DistributionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
