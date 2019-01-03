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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/CreateSamplingRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSamplingRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The rule definition.
     * </p>
     */
    private SamplingRule samplingRule;

    /**
     * <p>
     * The rule definition.
     * </p>
     * 
     * @param samplingRule
     *        The rule definition.
     */

    public void setSamplingRule(SamplingRule samplingRule) {
        this.samplingRule = samplingRule;
    }

    /**
     * <p>
     * The rule definition.
     * </p>
     * 
     * @return The rule definition.
     */

    public SamplingRule getSamplingRule() {
        return this.samplingRule;
    }

    /**
     * <p>
     * The rule definition.
     * </p>
     * 
     * @param samplingRule
     *        The rule definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSamplingRuleRequest withSamplingRule(SamplingRule samplingRule) {
        setSamplingRule(samplingRule);
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
        if (getSamplingRule() != null)
            sb.append("SamplingRule: ").append(getSamplingRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSamplingRuleRequest == false)
            return false;
        CreateSamplingRuleRequest other = (CreateSamplingRuleRequest) obj;
        if (other.getSamplingRule() == null ^ this.getSamplingRule() == null)
            return false;
        if (other.getSamplingRule() != null && other.getSamplingRule().equals(this.getSamplingRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSamplingRule() == null) ? 0 : getSamplingRule().hashCode());
        return hashCode;
    }

    @Override
    public CreateSamplingRuleRequest clone() {
        return (CreateSamplingRuleRequest) super.clone();
    }

}
