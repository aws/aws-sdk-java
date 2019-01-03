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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to enable or disable the automatic IP address warm-up feature.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutAccountDedicatedIpWarmupAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccountDedicatedIpWarmupAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your Amazon
     * Pinpoint account in the current AWS Region. Set to <code>true</code> to enable the automatic warm-up feature, or
     * set to <code>false</code> to disable it.
     * </p>
     */
    private Boolean autoWarmupEnabled;

    /**
     * <p>
     * Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your Amazon
     * Pinpoint account in the current AWS Region. Set to <code>true</code> to enable the automatic warm-up feature, or
     * set to <code>false</code> to disable it.
     * </p>
     * 
     * @param autoWarmupEnabled
     *        Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your
     *        Amazon Pinpoint account in the current AWS Region. Set to <code>true</code> to enable the automatic
     *        warm-up feature, or set to <code>false</code> to disable it.
     */

    public void setAutoWarmupEnabled(Boolean autoWarmupEnabled) {
        this.autoWarmupEnabled = autoWarmupEnabled;
    }

    /**
     * <p>
     * Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your Amazon
     * Pinpoint account in the current AWS Region. Set to <code>true</code> to enable the automatic warm-up feature, or
     * set to <code>false</code> to disable it.
     * </p>
     * 
     * @return Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with
     *         your Amazon Pinpoint account in the current AWS Region. Set to <code>true</code> to enable the automatic
     *         warm-up feature, or set to <code>false</code> to disable it.
     */

    public Boolean getAutoWarmupEnabled() {
        return this.autoWarmupEnabled;
    }

    /**
     * <p>
     * Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your Amazon
     * Pinpoint account in the current AWS Region. Set to <code>true</code> to enable the automatic warm-up feature, or
     * set to <code>false</code> to disable it.
     * </p>
     * 
     * @param autoWarmupEnabled
     *        Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your
     *        Amazon Pinpoint account in the current AWS Region. Set to <code>true</code> to enable the automatic
     *        warm-up feature, or set to <code>false</code> to disable it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountDedicatedIpWarmupAttributesRequest withAutoWarmupEnabled(Boolean autoWarmupEnabled) {
        setAutoWarmupEnabled(autoWarmupEnabled);
        return this;
    }

    /**
     * <p>
     * Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your Amazon
     * Pinpoint account in the current AWS Region. Set to <code>true</code> to enable the automatic warm-up feature, or
     * set to <code>false</code> to disable it.
     * </p>
     * 
     * @return Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with
     *         your Amazon Pinpoint account in the current AWS Region. Set to <code>true</code> to enable the automatic
     *         warm-up feature, or set to <code>false</code> to disable it.
     */

    public Boolean isAutoWarmupEnabled() {
        return this.autoWarmupEnabled;
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
        if (getAutoWarmupEnabled() != null)
            sb.append("AutoWarmupEnabled: ").append(getAutoWarmupEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountDedicatedIpWarmupAttributesRequest == false)
            return false;
        PutAccountDedicatedIpWarmupAttributesRequest other = (PutAccountDedicatedIpWarmupAttributesRequest) obj;
        if (other.getAutoWarmupEnabled() == null ^ this.getAutoWarmupEnabled() == null)
            return false;
        if (other.getAutoWarmupEnabled() != null && other.getAutoWarmupEnabled().equals(this.getAutoWarmupEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoWarmupEnabled() == null) ? 0 : getAutoWarmupEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PutAccountDedicatedIpWarmupAttributesRequest clone() {
        return (PutAccountDedicatedIpWarmupAttributesRequest) super.clone();
    }

}
