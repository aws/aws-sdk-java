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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UpdateSamplingRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSamplingRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The rule and fields to change.
     * </p>
     */
    private SamplingRuleUpdate samplingRuleUpdate;

    /**
     * <p>
     * The rule and fields to change.
     * </p>
     * 
     * @param samplingRuleUpdate
     *        The rule and fields to change.
     */

    public void setSamplingRuleUpdate(SamplingRuleUpdate samplingRuleUpdate) {
        this.samplingRuleUpdate = samplingRuleUpdate;
    }

    /**
     * <p>
     * The rule and fields to change.
     * </p>
     * 
     * @return The rule and fields to change.
     */

    public SamplingRuleUpdate getSamplingRuleUpdate() {
        return this.samplingRuleUpdate;
    }

    /**
     * <p>
     * The rule and fields to change.
     * </p>
     * 
     * @param samplingRuleUpdate
     *        The rule and fields to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSamplingRuleRequest withSamplingRuleUpdate(SamplingRuleUpdate samplingRuleUpdate) {
        setSamplingRuleUpdate(samplingRuleUpdate);
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
        if (getSamplingRuleUpdate() != null)
            sb.append("SamplingRuleUpdate: ").append(getSamplingRuleUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSamplingRuleRequest == false)
            return false;
        UpdateSamplingRuleRequest other = (UpdateSamplingRuleRequest) obj;
        if (other.getSamplingRuleUpdate() == null ^ this.getSamplingRuleUpdate() == null)
            return false;
        if (other.getSamplingRuleUpdate() != null && other.getSamplingRuleUpdate().equals(this.getSamplingRuleUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSamplingRuleUpdate() == null) ? 0 : getSamplingRuleUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSamplingRuleRequest clone() {
        return (UpdateSamplingRuleRequest) super.clone();
    }

}
