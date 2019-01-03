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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/GetMetricStatistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A label for the specified metric.
     * </p>
     */
    private String label;
    /**
     * <p>
     * The data points for the specified metric.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Datapoint> datapoints;

    /**
     * <p>
     * A label for the specified metric.
     * </p>
     * 
     * @param label
     *        A label for the specified metric.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * A label for the specified metric.
     * </p>
     * 
     * @return A label for the specified metric.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * A label for the specified metric.
     * </p>
     * 
     * @param label
     *        A label for the specified metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsResult withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * The data points for the specified metric.
     * </p>
     * 
     * @return The data points for the specified metric.
     */

    public java.util.List<Datapoint> getDatapoints() {
        if (datapoints == null) {
            datapoints = new com.amazonaws.internal.SdkInternalList<Datapoint>();
        }
        return datapoints;
    }

    /**
     * <p>
     * The data points for the specified metric.
     * </p>
     * 
     * @param datapoints
     *        The data points for the specified metric.
     */

    public void setDatapoints(java.util.Collection<Datapoint> datapoints) {
        if (datapoints == null) {
            this.datapoints = null;
            return;
        }

        this.datapoints = new com.amazonaws.internal.SdkInternalList<Datapoint>(datapoints);
    }

    /**
     * <p>
     * The data points for the specified metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatapoints(java.util.Collection)} or {@link #withDatapoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param datapoints
     *        The data points for the specified metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsResult withDatapoints(Datapoint... datapoints) {
        if (this.datapoints == null) {
            setDatapoints(new com.amazonaws.internal.SdkInternalList<Datapoint>(datapoints.length));
        }
        for (Datapoint ele : datapoints) {
            this.datapoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data points for the specified metric.
     * </p>
     * 
     * @param datapoints
     *        The data points for the specified metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricStatisticsResult withDatapoints(java.util.Collection<Datapoint> datapoints) {
        setDatapoints(datapoints);
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
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getDatapoints() != null)
            sb.append("Datapoints: ").append(getDatapoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricStatisticsResult == false)
            return false;
        GetMetricStatisticsResult other = (GetMetricStatisticsResult) obj;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getDatapoints() == null ^ this.getDatapoints() == null)
            return false;
        if (other.getDatapoints() != null && other.getDatapoints().equals(this.getDatapoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getDatapoints() == null) ? 0 : getDatapoints().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricStatisticsResult clone() {
        try {
            return (GetMetricStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
