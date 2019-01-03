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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInsightResultsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the insight whose results you want to see.
     * </p>
     */
    private String insightArn;

    /**
     * <p>
     * The ARN of the insight whose results you want to see.
     * </p>
     * 
     * @param insightArn
     *        The ARN of the insight whose results you want to see.
     */

    public void setInsightArn(String insightArn) {
        this.insightArn = insightArn;
    }

    /**
     * <p>
     * The ARN of the insight whose results you want to see.
     * </p>
     * 
     * @return The ARN of the insight whose results you want to see.
     */

    public String getInsightArn() {
        return this.insightArn;
    }

    /**
     * <p>
     * The ARN of the insight whose results you want to see.
     * </p>
     * 
     * @param insightArn
     *        The ARN of the insight whose results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInsightResultsRequest withInsightArn(String insightArn) {
        setInsightArn(insightArn);
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
        if (getInsightArn() != null)
            sb.append("InsightArn: ").append(getInsightArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInsightResultsRequest == false)
            return false;
        GetInsightResultsRequest other = (GetInsightResultsRequest) obj;
        if (other.getInsightArn() == null ^ this.getInsightArn() == null)
            return false;
        if (other.getInsightArn() != null && other.getInsightArn().equals(this.getInsightArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightArn() == null) ? 0 : getInsightArn().hashCode());
        return hashCode;
    }

    @Override
    public GetInsightResultsRequest clone() {
        return (GetInsightResultsRequest) super.clone();
    }

}
