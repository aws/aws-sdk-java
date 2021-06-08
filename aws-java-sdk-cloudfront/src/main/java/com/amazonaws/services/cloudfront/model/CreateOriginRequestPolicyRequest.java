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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/CreateOriginRequestPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOriginRequestPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An origin request policy configuration.
     * </p>
     */
    private OriginRequestPolicyConfig originRequestPolicyConfig;

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

    public CreateOriginRequestPolicyRequest withOriginRequestPolicyConfig(OriginRequestPolicyConfig originRequestPolicyConfig) {
        setOriginRequestPolicyConfig(originRequestPolicyConfig);
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
            sb.append("OriginRequestPolicyConfig: ").append(getOriginRequestPolicyConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOriginRequestPolicyRequest == false)
            return false;
        CreateOriginRequestPolicyRequest other = (CreateOriginRequestPolicyRequest) obj;
        if (other.getOriginRequestPolicyConfig() == null ^ this.getOriginRequestPolicyConfig() == null)
            return false;
        if (other.getOriginRequestPolicyConfig() != null && other.getOriginRequestPolicyConfig().equals(this.getOriginRequestPolicyConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginRequestPolicyConfig() == null) ? 0 : getOriginRequestPolicyConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateOriginRequestPolicyRequest clone() {
        return (CreateOriginRequestPolicyRequest) super.clone();
    }

}
