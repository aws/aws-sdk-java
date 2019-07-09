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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAnomalyDetectors"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAnomalyDetectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of anomaly detection models returned by the operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AnomalyDetector> anomalyDetectors;
    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of anomaly detection models returned by the operation.
     * </p>
     * 
     * @return The list of anomaly detection models returned by the operation.
     */

    public java.util.List<AnomalyDetector> getAnomalyDetectors() {
        if (anomalyDetectors == null) {
            anomalyDetectors = new com.amazonaws.internal.SdkInternalList<AnomalyDetector>();
        }
        return anomalyDetectors;
    }

    /**
     * <p>
     * The list of anomaly detection models returned by the operation.
     * </p>
     * 
     * @param anomalyDetectors
     *        The list of anomaly detection models returned by the operation.
     */

    public void setAnomalyDetectors(java.util.Collection<AnomalyDetector> anomalyDetectors) {
        if (anomalyDetectors == null) {
            this.anomalyDetectors = null;
            return;
        }

        this.anomalyDetectors = new com.amazonaws.internal.SdkInternalList<AnomalyDetector>(anomalyDetectors);
    }

    /**
     * <p>
     * The list of anomaly detection models returned by the operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnomalyDetectors(java.util.Collection)} or {@link #withAnomalyDetectors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param anomalyDetectors
     *        The list of anomaly detection models returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorsResult withAnomalyDetectors(AnomalyDetector... anomalyDetectors) {
        if (this.anomalyDetectors == null) {
            setAnomalyDetectors(new com.amazonaws.internal.SdkInternalList<AnomalyDetector>(anomalyDetectors.length));
        }
        for (AnomalyDetector ele : anomalyDetectors) {
            this.anomalyDetectors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of anomaly detection models returned by the operation.
     * </p>
     * 
     * @param anomalyDetectors
     *        The list of anomaly detection models returned by the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorsResult withAnomalyDetectors(java.util.Collection<AnomalyDetector> anomalyDetectors) {
        setAnomalyDetectors(anomalyDetectors);
        return this;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that you can use in a subsequent operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAnomalyDetectors() != null)
            sb.append("AnomalyDetectors: ").append(getAnomalyDetectors()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAnomalyDetectorsResult == false)
            return false;
        DescribeAnomalyDetectorsResult other = (DescribeAnomalyDetectorsResult) obj;
        if (other.getAnomalyDetectors() == null ^ this.getAnomalyDetectors() == null)
            return false;
        if (other.getAnomalyDetectors() != null && other.getAnomalyDetectors().equals(this.getAnomalyDetectors()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectors() == null) ? 0 : getAnomalyDetectors().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAnomalyDetectorsResult clone() {
        try {
            return (DescribeAnomalyDetectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
