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
 * Origin access identity configuration. Send a <code>GET</code> request to the
 * <code>/<i>CloudFront API version</i>/CloudFront/identity ID/config</code> resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CloudFrontOriginAccessIdentityConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudFrontOriginAccessIdentityConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> object), a new origin access identity is created.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value already sent in a previous identity request, and the content of
     * the <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the original request (ignoring white
     * space), the response includes the same information returned to the original request.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value you already sent in a previous request to create an identity, but
     * the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the original request,
     * CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * </p>
     */
    private String callerReference;
    /**
     * <p>
     * Any comments you want to include about the origin access identity.
     * </p>
     */
    private String comment;

    /**
     * Default constructor for CloudFrontOriginAccessIdentityConfig object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public CloudFrontOriginAccessIdentityConfig() {
    }

    /**
     * Constructs a new CloudFrontOriginAccessIdentityConfig object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param callerReference
     *        A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.</p>
     *        <p>
     *        If the value of <code>CallerReference</code> is new (regardless of the content of the
     *        <code>CloudFrontOriginAccessIdentityConfig</code> object), a new origin access identity is created.
     *        </p>
     *        <p>
     *        If the <code>CallerReference</code> is a value already sent in a previous identity request, and the
     *        content of the <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the original request
     *        (ignoring white space), the response includes the same information returned to the original request.
     *        </p>
     *        <p>
     *        If the <code>CallerReference</code> is a value you already sent in a previous request to create an
     *        identity, but the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     *        original request, CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     */
    public CloudFrontOriginAccessIdentityConfig(String callerReference) {
        setCallerReference(callerReference);
    }

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> object), a new origin access identity is created.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value already sent in a previous identity request, and the content of
     * the <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the original request (ignoring white
     * space), the response includes the same information returned to the original request.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value you already sent in a previous request to create an identity, but
     * the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the original request,
     * CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * </p>
     * 
     * @param callerReference
     *        A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.</p>
     *        <p>
     *        If the value of <code>CallerReference</code> is new (regardless of the content of the
     *        <code>CloudFrontOriginAccessIdentityConfig</code> object), a new origin access identity is created.
     *        </p>
     *        <p>
     *        If the <code>CallerReference</code> is a value already sent in a previous identity request, and the
     *        content of the <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the original request
     *        (ignoring white space), the response includes the same information returned to the original request.
     *        </p>
     *        <p>
     *        If the <code>CallerReference</code> is a value you already sent in a previous request to create an
     *        identity, but the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     *        original request, CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     */

    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> object), a new origin access identity is created.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value already sent in a previous identity request, and the content of
     * the <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the original request (ignoring white
     * space), the response includes the same information returned to the original request.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value you already sent in a previous request to create an identity, but
     * the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the original request,
     * CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * </p>
     * 
     * @return A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.</p>
     *         <p>
     *         If the value of <code>CallerReference</code> is new (regardless of the content of the
     *         <code>CloudFrontOriginAccessIdentityConfig</code> object), a new origin access identity is created.
     *         </p>
     *         <p>
     *         If the <code>CallerReference</code> is a value already sent in a previous identity request, and the
     *         content of the <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the original request
     *         (ignoring white space), the response includes the same information returned to the original request.
     *         </p>
     *         <p>
     *         If the <code>CallerReference</code> is a value you already sent in a previous request to create an
     *         identity, but the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     *         original request, CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     */

    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * <p>
     * A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.
     * </p>
     * <p>
     * If the value of <code>CallerReference</code> is new (regardless of the content of the
     * <code>CloudFrontOriginAccessIdentityConfig</code> object), a new origin access identity is created.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value already sent in a previous identity request, and the content of
     * the <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the original request (ignoring white
     * space), the response includes the same information returned to the original request.
     * </p>
     * <p>
     * If the <code>CallerReference</code> is a value you already sent in a previous request to create an identity, but
     * the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the original request,
     * CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * </p>
     * 
     * @param callerReference
     *        A unique value (for example, a date-time stamp) that ensures that the request can't be replayed.</p>
     *        <p>
     *        If the value of <code>CallerReference</code> is new (regardless of the content of the
     *        <code>CloudFrontOriginAccessIdentityConfig</code> object), a new origin access identity is created.
     *        </p>
     *        <p>
     *        If the <code>CallerReference</code> is a value already sent in a previous identity request, and the
     *        content of the <code>CloudFrontOriginAccessIdentityConfig</code> is identical to the original request
     *        (ignoring white space), the response includes the same information returned to the original request.
     *        </p>
     *        <p>
     *        If the <code>CallerReference</code> is a value you already sent in a previous request to create an
     *        identity, but the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     *        original request, CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFrontOriginAccessIdentityConfig withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * <p>
     * Any comments you want to include about the origin access identity.
     * </p>
     * 
     * @param comment
     *        Any comments you want to include about the origin access identity.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Any comments you want to include about the origin access identity.
     * </p>
     * 
     * @return Any comments you want to include about the origin access identity.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * Any comments you want to include about the origin access identity.
     * </p>
     * 
     * @param comment
     *        Any comments you want to include about the origin access identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudFrontOriginAccessIdentityConfig withComment(String comment) {
        setComment(comment);
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
        if (getCallerReference() != null)
            sb.append("CallerReference: ").append(getCallerReference()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudFrontOriginAccessIdentityConfig == false)
            return false;
        CloudFrontOriginAccessIdentityConfig other = (CloudFrontOriginAccessIdentityConfig) obj;
        if (other.getCallerReference() == null ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
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
    public CloudFrontOriginAccessIdentityConfig clone() {
        try {
            return (CloudFrontOriginAccessIdentityConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
