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
public class S3OriginConfig implements Serializable, Cloneable {

    private String originAccessIdentity;

    /**
     * @param originAccessIdentity
     */
    public void setOriginAccessIdentity(String originAccessIdentity) {
        this.originAccessIdentity = originAccessIdentity;
    }

    /**
     * @return
     */
    public String getOriginAccessIdentity() {
        return this.originAccessIdentity;
    }

    /**
     * @param originAccessIdentity
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public S3OriginConfig withOriginAccessIdentity(String originAccessIdentity) {
        setOriginAccessIdentity(originAccessIdentity);
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
        if (getOriginAccessIdentity() != null)
            sb.append("OriginAccessIdentity: " + getOriginAccessIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3OriginConfig == false)
            return false;
        S3OriginConfig other = (S3OriginConfig) obj;
        if (other.getOriginAccessIdentity() == null
                ^ this.getOriginAccessIdentity() == null)
            return false;
        if (other.getOriginAccessIdentity() != null
                && other.getOriginAccessIdentity().equals(
                        this.getOriginAccessIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOriginAccessIdentity() == null) ? 0
                        : getOriginAccessIdentity().hashCode());
        return hashCode;
    }

    @Override
    public S3OriginConfig clone() {
        try {
            return (S3OriginConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}