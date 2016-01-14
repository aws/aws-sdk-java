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
 * 
 */
public class CloudFrontOriginAccessIdentityConfig implements Serializable,
        Cloneable {

    private String callerReference;

    private String comment;

    /**
     * Default constructor for CloudFrontOriginAccessIdentityConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public CloudFrontOriginAccessIdentityConfig() {
    }

    /**
     * Constructs a new CloudFrontOriginAccessIdentityConfig object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param callerReference
     */
    public CloudFrontOriginAccessIdentityConfig(String callerReference) {
        setCallerReference(callerReference);
    }

    /**
     * @param callerReference
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * @return
     */
    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * @param callerReference
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityConfig withCallerReference(
            String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @param comment
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CloudFrontOriginAccessIdentityConfig withComment(String comment) {
        setComment(comment);
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
        if (getComment() != null)
            sb.append("Comment: " + getComment());
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
        if (other.getCallerReference() == null
                ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
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
                + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public CloudFrontOriginAccessIdentityConfig clone() {
        try {
            return (CloudFrontOriginAccessIdentityConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}