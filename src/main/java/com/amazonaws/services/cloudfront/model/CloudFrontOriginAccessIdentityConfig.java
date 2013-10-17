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
 * Origin access identity configuration.
 * </p>
 */
public class CloudFrontOriginAccessIdentityConfig implements Serializable {

    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the
     * CloudFrontOriginAccessIdentityConfig object), a new origin access
     * identity is created. If the CallerReference is a value you already
     * sent in a previous request to create an identity, and the content of
     * the CloudFrontOriginAccessIdentityConfig is identical to the original
     * request (ignoring white space), the response includes the same
     * information returned to the original request. If the CallerReference
     * is a value you already sent in a previous request to create an
     * identity but the content of the CloudFrontOriginAccessIdentityConfig
     * is different from the original request, CloudFront returns a
     * CloudFrontOriginAccessIdentityAlreadyExists error.
     */
    private String callerReference;

    /**
     * Any comments you want to include about the origin access identity.
     */
    private String comment;

    /**
     * Default constructor for a new CloudFrontOriginAccessIdentityConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CloudFrontOriginAccessIdentityConfig() {}
    
    /**
     * Constructs a new CloudFrontOriginAccessIdentityConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param callerReference A unique number that ensures the request can't
     * be replayed. If the CallerReference is new (no matter the content of
     * the CloudFrontOriginAccessIdentityConfig object), a new origin access
     * identity is created. If the CallerReference is a value you already
     * sent in a previous request to create an identity, and the content of
     * the CloudFrontOriginAccessIdentityConfig is identical to the original
     * request (ignoring white space), the response includes the same
     * information returned to the original request. If the CallerReference
     * is a value you already sent in a previous request to create an
     * identity but the content of the CloudFrontOriginAccessIdentityConfig
     * is different from the original request, CloudFront returns a
     * CloudFrontOriginAccessIdentityAlreadyExists error.
     */
    public CloudFrontOriginAccessIdentityConfig(String callerReference) {
        setCallerReference(callerReference);
    }

    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the
     * CloudFrontOriginAccessIdentityConfig object), a new origin access
     * identity is created. If the CallerReference is a value you already
     * sent in a previous request to create an identity, and the content of
     * the CloudFrontOriginAccessIdentityConfig is identical to the original
     * request (ignoring white space), the response includes the same
     * information returned to the original request. If the CallerReference
     * is a value you already sent in a previous request to create an
     * identity but the content of the CloudFrontOriginAccessIdentityConfig
     * is different from the original request, CloudFront returns a
     * CloudFrontOriginAccessIdentityAlreadyExists error.
     *
     * @return A unique number that ensures the request can't be replayed. If the
     *         CallerReference is new (no matter the content of the
     *         CloudFrontOriginAccessIdentityConfig object), a new origin access
     *         identity is created. If the CallerReference is a value you already
     *         sent in a previous request to create an identity, and the content of
     *         the CloudFrontOriginAccessIdentityConfig is identical to the original
     *         request (ignoring white space), the response includes the same
     *         information returned to the original request. If the CallerReference
     *         is a value you already sent in a previous request to create an
     *         identity but the content of the CloudFrontOriginAccessIdentityConfig
     *         is different from the original request, CloudFront returns a
     *         CloudFrontOriginAccessIdentityAlreadyExists error.
     */
    public String getCallerReference() {
        return callerReference;
    }
    
    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the
     * CloudFrontOriginAccessIdentityConfig object), a new origin access
     * identity is created. If the CallerReference is a value you already
     * sent in a previous request to create an identity, and the content of
     * the CloudFrontOriginAccessIdentityConfig is identical to the original
     * request (ignoring white space), the response includes the same
     * information returned to the original request. If the CallerReference
     * is a value you already sent in a previous request to create an
     * identity but the content of the CloudFrontOriginAccessIdentityConfig
     * is different from the original request, CloudFront returns a
     * CloudFrontOriginAccessIdentityAlreadyExists error.
     *
     * @param callerReference A unique number that ensures the request can't be replayed. If the
     *         CallerReference is new (no matter the content of the
     *         CloudFrontOriginAccessIdentityConfig object), a new origin access
     *         identity is created. If the CallerReference is a value you already
     *         sent in a previous request to create an identity, and the content of
     *         the CloudFrontOriginAccessIdentityConfig is identical to the original
     *         request (ignoring white space), the response includes the same
     *         information returned to the original request. If the CallerReference
     *         is a value you already sent in a previous request to create an
     *         identity but the content of the CloudFrontOriginAccessIdentityConfig
     *         is different from the original request, CloudFront returns a
     *         CloudFrontOriginAccessIdentityAlreadyExists error.
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }
    
    /**
     * A unique number that ensures the request can't be replayed. If the
     * CallerReference is new (no matter the content of the
     * CloudFrontOriginAccessIdentityConfig object), a new origin access
     * identity is created. If the CallerReference is a value you already
     * sent in a previous request to create an identity, and the content of
     * the CloudFrontOriginAccessIdentityConfig is identical to the original
     * request (ignoring white space), the response includes the same
     * information returned to the original request. If the CallerReference
     * is a value you already sent in a previous request to create an
     * identity but the content of the CloudFrontOriginAccessIdentityConfig
     * is different from the original request, CloudFront returns a
     * CloudFrontOriginAccessIdentityAlreadyExists error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param callerReference A unique number that ensures the request can't be replayed. If the
     *         CallerReference is new (no matter the content of the
     *         CloudFrontOriginAccessIdentityConfig object), a new origin access
     *         identity is created. If the CallerReference is a value you already
     *         sent in a previous request to create an identity, and the content of
     *         the CloudFrontOriginAccessIdentityConfig is identical to the original
     *         request (ignoring white space), the response includes the same
     *         information returned to the original request. If the CallerReference
     *         is a value you already sent in a previous request to create an
     *         identity but the content of the CloudFrontOriginAccessIdentityConfig
     *         is different from the original request, CloudFront returns a
     *         CloudFrontOriginAccessIdentityAlreadyExists error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CloudFrontOriginAccessIdentityConfig withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * Any comments you want to include about the origin access identity.
     *
     * @return Any comments you want to include about the origin access identity.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * Any comments you want to include about the origin access identity.
     *
     * @param comment Any comments you want to include about the origin access identity.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * Any comments you want to include about the origin access identity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param comment Any comments you want to include about the origin access identity.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CloudFrontOriginAccessIdentityConfig withComment(String comment) {
        this.comment = comment;
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
        if (getCallerReference() != null) sb.append("CallerReference: " + getCallerReference() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CloudFrontOriginAccessIdentityConfig == false) return false;
        CloudFrontOriginAccessIdentityConfig other = (CloudFrontOriginAccessIdentityConfig)obj;
        
        if (other.getCallerReference() == null ^ this.getCallerReference() == null) return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        return true;
    }
    
}
    