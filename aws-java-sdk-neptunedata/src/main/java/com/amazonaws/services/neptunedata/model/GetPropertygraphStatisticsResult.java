/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/GetPropertygraphStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPropertygraphStatisticsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The HTTP return code of the request. If the request succeeded, the code is 200. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-dfe-statistics.html#neptune-dfe-statistics-errors"
     * >Common error codes for DFE statistics request</a> for a list of common errors.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Statistics for property-graph data.
     * </p>
     */
    private Statistics payload;

    /**
     * <p>
     * The HTTP return code of the request. If the request succeeded, the code is 200. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-dfe-statistics.html#neptune-dfe-statistics-errors"
     * >Common error codes for DFE statistics request</a> for a list of common errors.
     * </p>
     * 
     * @param status
     *        The HTTP return code of the request. If the request succeeded, the code is 200. See <a href=
     *        "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-dfe-statistics.html#neptune-dfe-statistics-errors"
     *        >Common error codes for DFE statistics request</a> for a list of common errors.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP return code of the request. If the request succeeded, the code is 200. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-dfe-statistics.html#neptune-dfe-statistics-errors"
     * >Common error codes for DFE statistics request</a> for a list of common errors.
     * </p>
     * 
     * @return The HTTP return code of the request. If the request succeeded, the code is 200. See <a href=
     *         "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-dfe-statistics.html#neptune-dfe-statistics-errors"
     *         >Common error codes for DFE statistics request</a> for a list of common errors.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP return code of the request. If the request succeeded, the code is 200. See <a href=
     * "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-dfe-statistics.html#neptune-dfe-statistics-errors"
     * >Common error codes for DFE statistics request</a> for a list of common errors.
     * </p>
     * 
     * @param status
     *        The HTTP return code of the request. If the request succeeded, the code is 200. See <a href=
     *        "https://docs.aws.amazon.com/neptune/latest/userguide/neptune-dfe-statistics.html#neptune-dfe-statistics-errors"
     *        >Common error codes for DFE statistics request</a> for a list of common errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertygraphStatisticsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Statistics for property-graph data.
     * </p>
     * 
     * @param payload
     *        Statistics for property-graph data.
     */

    public void setPayload(Statistics payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * Statistics for property-graph data.
     * </p>
     * 
     * @return Statistics for property-graph data.
     */

    public Statistics getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * Statistics for property-graph data.
     * </p>
     * 
     * @param payload
     *        Statistics for property-graph data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPropertygraphStatisticsResult withPayload(Statistics payload) {
        setPayload(payload);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPropertygraphStatisticsResult == false)
            return false;
        GetPropertygraphStatisticsResult other = (GetPropertygraphStatisticsResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public GetPropertygraphStatisticsResult clone() {
        try {
            return (GetPropertygraphStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
