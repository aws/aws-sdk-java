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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/GetOriginRequestPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOriginRequestPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The origin request policy.
     * </p>
     */
    private OriginRequestPolicy originRequestPolicy;
    /**
     * <p>
     * The current version of the origin request policy.
     * </p>
     */
    private String eTag;

    /**
     * <p>
     * The origin request policy.
     * </p>
     * 
     * @param originRequestPolicy
     *        The origin request policy.
     */

    public void setOriginRequestPolicy(OriginRequestPolicy originRequestPolicy) {
        this.originRequestPolicy = originRequestPolicy;
    }

    /**
     * <p>
     * The origin request policy.
     * </p>
     * 
     * @return The origin request policy.
     */

    public OriginRequestPolicy getOriginRequestPolicy() {
        return this.originRequestPolicy;
    }

    /**
     * <p>
     * The origin request policy.
     * </p>
     * 
     * @param originRequestPolicy
     *        The origin request policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginRequestPolicyResult withOriginRequestPolicy(OriginRequestPolicy originRequestPolicy) {
        setOriginRequestPolicy(originRequestPolicy);
        return this;
    }

    /**
     * <p>
     * The current version of the origin request policy.
     * </p>
     * 
     * @param eTag
     *        The current version of the origin request policy.
     */

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    /**
     * <p>
     * The current version of the origin request policy.
     * </p>
     * 
     * @return The current version of the origin request policy.
     */

    public String getETag() {
        return this.eTag;
    }

    /**
     * <p>
     * The current version of the origin request policy.
     * </p>
     * 
     * @param eTag
     *        The current version of the origin request policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOriginRequestPolicyResult withETag(String eTag) {
        setETag(eTag);
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
        if (getOriginRequestPolicy() != null)
            sb.append("OriginRequestPolicy: ").append(getOriginRequestPolicy()).append(",");
        if (getETag() != null)
            sb.append("ETag: ").append(getETag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOriginRequestPolicyResult == false)
            return false;
        GetOriginRequestPolicyResult other = (GetOriginRequestPolicyResult) obj;
        if (other.getOriginRequestPolicy() == null ^ this.getOriginRequestPolicy() == null)
            return false;
        if (other.getOriginRequestPolicy() != null && other.getOriginRequestPolicy().equals(this.getOriginRequestPolicy()) == false)
            return false;
        if (other.getETag() == null ^ this.getETag() == null)
            return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginRequestPolicy() == null) ? 0 : getOriginRequestPolicy().hashCode());
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode());
        return hashCode;
    }

    @Override
    public GetOriginRequestPolicyResult clone() {
        try {
            return (GetOriginRequestPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
