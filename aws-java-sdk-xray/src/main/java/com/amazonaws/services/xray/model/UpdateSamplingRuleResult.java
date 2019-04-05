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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/UpdateSamplingRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSamplingRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated rule definition and metadata.
     * </p>
     */
    private SamplingRuleRecord samplingRuleRecord;

    /**
     * <p>
     * The updated rule definition and metadata.
     * </p>
     * 
     * @param samplingRuleRecord
     *        The updated rule definition and metadata.
     */

    public void setSamplingRuleRecord(SamplingRuleRecord samplingRuleRecord) {
        this.samplingRuleRecord = samplingRuleRecord;
    }

    /**
     * <p>
     * The updated rule definition and metadata.
     * </p>
     * 
     * @return The updated rule definition and metadata.
     */

    public SamplingRuleRecord getSamplingRuleRecord() {
        return this.samplingRuleRecord;
    }

    /**
     * <p>
     * The updated rule definition and metadata.
     * </p>
     * 
     * @param samplingRuleRecord
     *        The updated rule definition and metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSamplingRuleResult withSamplingRuleRecord(SamplingRuleRecord samplingRuleRecord) {
        setSamplingRuleRecord(samplingRuleRecord);
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
        if (getSamplingRuleRecord() != null)
            sb.append("SamplingRuleRecord: ").append(getSamplingRuleRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSamplingRuleResult == false)
            return false;
        UpdateSamplingRuleResult other = (UpdateSamplingRuleResult) obj;
        if (other.getSamplingRuleRecord() == null ^ this.getSamplingRuleRecord() == null)
            return false;
        if (other.getSamplingRuleRecord() != null && other.getSamplingRuleRecord().equals(this.getSamplingRuleRecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSamplingRuleRecord() == null) ? 0 : getSamplingRuleRecord().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSamplingRuleResult clone() {
        try {
            return (UpdateSamplingRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
