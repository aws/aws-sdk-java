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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/UpdateOriginRequestPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOriginRequestPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An origin request policy configuration.
     * </p>
     */
    private OriginRequestPolicyConfig originRequestPolicyConfig;
    /**
     * <p>
     * The unique identifier for the origin request policy that you are updating. The identifier is returned in a cache
     * behavior’s <code>OriginRequestPolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The version of the origin request policy that you are updating. The version is returned in the origin request
     * policy’s <code>ETag</code> field in the response to <code>GetOriginRequestPolicyConfig</code>.
     * </p>
     */
    private String ifMatch;

    /**
     * <p>
     * An origin request policy configuration.
     * </p>
     * 
     * @param originRequestPolicyConfig
     *        An origin request policy configuration.
     */

    public void setOriginRequestPolicyConfig(OriginRequestPolicyConfig originRequestPolicyConfig) {
        this.originRequestPolicyConfig = originRequestPolicyConfig;
    }

    /**
     * <p>
     * An origin request policy configuration.
     * </p>
     * 
     * @return An origin request policy configuration.
     */

    public OriginRequestPolicyConfig getOriginRequestPolicyConfig() {
        return this.originRequestPolicyConfig;
    }

    /**
     * <p>
     * An origin request policy configuration.
     * </p>
     * 
     * @param originRequestPolicyConfig
     *        An origin request policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginRequestPolicyRequest withOriginRequestPolicyConfig(OriginRequestPolicyConfig originRequestPolicyConfig) {
        setOriginRequestPolicyConfig(originRequestPolicyConfig);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the origin request policy that you are updating. The identifier is returned in a cache
     * behavior’s <code>OriginRequestPolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     * </p>
     * 
     * @param id
     *        The unique identifier for the origin request policy that you are updating. The identifier is returned in a
     *        cache behavior’s <code>OriginRequestPolicyId</code> field in the response to
     *        <code>GetDistributionConfig</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the origin request policy that you are updating. The identifier is returned in a cache
     * behavior’s <code>OriginRequestPolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     * </p>
     * 
     * @return The unique identifier for the origin request policy that you are updating. The identifier is returned in
     *         a cache behavior’s <code>OriginRequestPolicyId</code> field in the response to
     *         <code>GetDistributionConfig</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the origin request policy that you are updating. The identifier is returned in a cache
     * behavior’s <code>OriginRequestPolicyId</code> field in the response to <code>GetDistributionConfig</code>.
     * </p>
     * 
     * @param id
     *        The unique identifier for the origin request policy that you are updating. The identifier is returned in a
     *        cache behavior’s <code>OriginRequestPolicyId</code> field in the response to
     *        <code>GetDistributionConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginRequestPolicyRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The version of the origin request policy that you are updating. The version is returned in the origin request
     * policy’s <code>ETag</code> field in the response to <code>GetOriginRequestPolicyConfig</code>.
     * </p>
     * 
     * @param ifMatch
     *        The version of the origin request policy that you are updating. The version is returned in the origin
     *        request policy’s <code>ETag</code> field in the response to <code>GetOriginRequestPolicyConfig</code>.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * <p>
     * The version of the origin request policy that you are updating. The version is returned in the origin request
     * policy’s <code>ETag</code> field in the response to <code>GetOriginRequestPolicyConfig</code>.
     * </p>
     * 
     * @return The version of the origin request policy that you are updating. The version is returned in the origin
     *         request policy’s <code>ETag</code> field in the response to <code>GetOriginRequestPolicyConfig</code>.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * <p>
     * The version of the origin request policy that you are updating. The version is returned in the origin request
     * policy’s <code>ETag</code> field in the response to <code>GetOriginRequestPolicyConfig</code>.
     * </p>
     * 
     * @param ifMatch
     *        The version of the origin request policy that you are updating. The version is returned in the origin
     *        request policy’s <code>ETag</code> field in the response to <code>GetOriginRequestPolicyConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOriginRequestPolicyRequest withIfMatch(String ifMatch) {
        setIfMatch(ifMatch);
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
        if (getOriginRequestPolicyConfig() != null)
            sb.append("OriginRequestPolicyConfig: ").append(getOriginRequestPolicyConfig()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIfMatch() != null)
            sb.append("IfMatch: ").append(getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOriginRequestPolicyRequest == false)
            return false;
        UpdateOriginRequestPolicyRequest other = (UpdateOriginRequestPolicyRequest) obj;
        if (other.getOriginRequestPolicyConfig() == null ^ this.getOriginRequestPolicyConfig() == null)
            return false;
        if (other.getOriginRequestPolicyConfig() != null && other.getOriginRequestPolicyConfig().equals(this.getOriginRequestPolicyConfig()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginRequestPolicyConfig() == null) ? 0 : getOriginRequestPolicyConfig().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOriginRequestPolicyRequest clone() {
        return (UpdateOriginRequestPolicyRequest) super.clone();
    }

}
