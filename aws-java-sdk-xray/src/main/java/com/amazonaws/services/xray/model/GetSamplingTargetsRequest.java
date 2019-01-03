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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetSamplingTargets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSamplingTargetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Information about rules that the service is using to sample requests.
     * </p>
     */
    private java.util.List<SamplingStatisticsDocument> samplingStatisticsDocuments;

    /**
     * <p>
     * Information about rules that the service is using to sample requests.
     * </p>
     * 
     * @return Information about rules that the service is using to sample requests.
     */

    public java.util.List<SamplingStatisticsDocument> getSamplingStatisticsDocuments() {
        return samplingStatisticsDocuments;
    }

    /**
     * <p>
     * Information about rules that the service is using to sample requests.
     * </p>
     * 
     * @param samplingStatisticsDocuments
     *        Information about rules that the service is using to sample requests.
     */

    public void setSamplingStatisticsDocuments(java.util.Collection<SamplingStatisticsDocument> samplingStatisticsDocuments) {
        if (samplingStatisticsDocuments == null) {
            this.samplingStatisticsDocuments = null;
            return;
        }

        this.samplingStatisticsDocuments = new java.util.ArrayList<SamplingStatisticsDocument>(samplingStatisticsDocuments);
    }

    /**
     * <p>
     * Information about rules that the service is using to sample requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSamplingStatisticsDocuments(java.util.Collection)} or
     * {@link #withSamplingStatisticsDocuments(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param samplingStatisticsDocuments
     *        Information about rules that the service is using to sample requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingTargetsRequest withSamplingStatisticsDocuments(SamplingStatisticsDocument... samplingStatisticsDocuments) {
        if (this.samplingStatisticsDocuments == null) {
            setSamplingStatisticsDocuments(new java.util.ArrayList<SamplingStatisticsDocument>(samplingStatisticsDocuments.length));
        }
        for (SamplingStatisticsDocument ele : samplingStatisticsDocuments) {
            this.samplingStatisticsDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about rules that the service is using to sample requests.
     * </p>
     * 
     * @param samplingStatisticsDocuments
     *        Information about rules that the service is using to sample requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSamplingTargetsRequest withSamplingStatisticsDocuments(java.util.Collection<SamplingStatisticsDocument> samplingStatisticsDocuments) {
        setSamplingStatisticsDocuments(samplingStatisticsDocuments);
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
        if (getSamplingStatisticsDocuments() != null)
            sb.append("SamplingStatisticsDocuments: ").append(getSamplingStatisticsDocuments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSamplingTargetsRequest == false)
            return false;
        GetSamplingTargetsRequest other = (GetSamplingTargetsRequest) obj;
        if (other.getSamplingStatisticsDocuments() == null ^ this.getSamplingStatisticsDocuments() == null)
            return false;
        if (other.getSamplingStatisticsDocuments() != null && other.getSamplingStatisticsDocuments().equals(this.getSamplingStatisticsDocuments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSamplingStatisticsDocuments() == null) ? 0 : getSamplingStatisticsDocuments().hashCode());
        return hashCode;
    }

    @Override
    public GetSamplingTargetsRequest clone() {
        return (GetSamplingTargetsRequest) super.clone();
    }

}
