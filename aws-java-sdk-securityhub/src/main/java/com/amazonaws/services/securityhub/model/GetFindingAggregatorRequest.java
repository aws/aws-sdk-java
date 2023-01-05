/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindingAggregator" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingAggregatorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the finding aggregator to return details for. To obtain the ARN, use
     * <code>ListFindingAggregators</code>.
     * </p>
     */
    private String findingAggregatorArn;

    /**
     * <p>
     * The ARN of the finding aggregator to return details for. To obtain the ARN, use
     * <code>ListFindingAggregators</code>.
     * </p>
     * 
     * @param findingAggregatorArn
     *        The ARN of the finding aggregator to return details for. To obtain the ARN, use
     *        <code>ListFindingAggregators</code>.
     */

    public void setFindingAggregatorArn(String findingAggregatorArn) {
        this.findingAggregatorArn = findingAggregatorArn;
    }

    /**
     * <p>
     * The ARN of the finding aggregator to return details for. To obtain the ARN, use
     * <code>ListFindingAggregators</code>.
     * </p>
     * 
     * @return The ARN of the finding aggregator to return details for. To obtain the ARN, use
     *         <code>ListFindingAggregators</code>.
     */

    public String getFindingAggregatorArn() {
        return this.findingAggregatorArn;
    }

    /**
     * <p>
     * The ARN of the finding aggregator to return details for. To obtain the ARN, use
     * <code>ListFindingAggregators</code>.
     * </p>
     * 
     * @param findingAggregatorArn
     *        The ARN of the finding aggregator to return details for. To obtain the ARN, use
     *        <code>ListFindingAggregators</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingAggregatorRequest withFindingAggregatorArn(String findingAggregatorArn) {
        setFindingAggregatorArn(findingAggregatorArn);
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
        if (getFindingAggregatorArn() != null)
            sb.append("FindingAggregatorArn: ").append(getFindingAggregatorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFindingAggregatorRequest == false)
            return false;
        GetFindingAggregatorRequest other = (GetFindingAggregatorRequest) obj;
        if (other.getFindingAggregatorArn() == null ^ this.getFindingAggregatorArn() == null)
            return false;
        if (other.getFindingAggregatorArn() != null && other.getFindingAggregatorArn().equals(this.getFindingAggregatorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingAggregatorArn() == null) ? 0 : getFindingAggregatorArn().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingAggregatorRequest clone() {
        return (GetFindingAggregatorRequest) super.clone();
    }

}
