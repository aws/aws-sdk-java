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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A finding aggregator. A finding aggregator contains the configuration for finding aggregation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/FindingAggregator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingAggregator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the finding aggregator. You use the finding aggregator ARN to retrieve details for, update, and delete
     * the finding aggregator.
     * </p>
     */
    private String findingAggregatorArn;

    /**
     * <p>
     * The ARN of the finding aggregator. You use the finding aggregator ARN to retrieve details for, update, and delete
     * the finding aggregator.
     * </p>
     * 
     * @param findingAggregatorArn
     *        The ARN of the finding aggregator. You use the finding aggregator ARN to retrieve details for, update, and
     *        delete the finding aggregator.
     */

    public void setFindingAggregatorArn(String findingAggregatorArn) {
        this.findingAggregatorArn = findingAggregatorArn;
    }

    /**
     * <p>
     * The ARN of the finding aggregator. You use the finding aggregator ARN to retrieve details for, update, and delete
     * the finding aggregator.
     * </p>
     * 
     * @return The ARN of the finding aggregator. You use the finding aggregator ARN to retrieve details for, update,
     *         and delete the finding aggregator.
     */

    public String getFindingAggregatorArn() {
        return this.findingAggregatorArn;
    }

    /**
     * <p>
     * The ARN of the finding aggregator. You use the finding aggregator ARN to retrieve details for, update, and delete
     * the finding aggregator.
     * </p>
     * 
     * @param findingAggregatorArn
     *        The ARN of the finding aggregator. You use the finding aggregator ARN to retrieve details for, update, and
     *        delete the finding aggregator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingAggregator withFindingAggregatorArn(String findingAggregatorArn) {
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

        if (obj instanceof FindingAggregator == false)
            return false;
        FindingAggregator other = (FindingAggregator) obj;
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
    public FindingAggregator clone() {
        try {
            return (FindingAggregator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.FindingAggregatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
