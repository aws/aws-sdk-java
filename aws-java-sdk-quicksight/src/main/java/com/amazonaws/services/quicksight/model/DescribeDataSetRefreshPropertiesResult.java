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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDataSetRefreshProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataSetRefreshPropertiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;
    /**
     * <p>
     * The dataset refresh properties.
     * </p>
     */
    private DataSetRefreshProperties dataSetRefreshProperties;

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @return The Amazon Web Services request ID for this operation.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The Amazon Web Services request ID for this operation.
     * </p>
     * 
     * @param requestId
     *        The Amazon Web Services request ID for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSetRefreshPropertiesResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     */

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @return The HTTP status of the request.
     */

    public Integer getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * 
     * @param status
     *        The HTTP status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSetRefreshPropertiesResult withStatus(Integer status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The dataset refresh properties.
     * </p>
     * 
     * @param dataSetRefreshProperties
     *        The dataset refresh properties.
     */

    public void setDataSetRefreshProperties(DataSetRefreshProperties dataSetRefreshProperties) {
        this.dataSetRefreshProperties = dataSetRefreshProperties;
    }

    /**
     * <p>
     * The dataset refresh properties.
     * </p>
     * 
     * @return The dataset refresh properties.
     */

    public DataSetRefreshProperties getDataSetRefreshProperties() {
        return this.dataSetRefreshProperties;
    }

    /**
     * <p>
     * The dataset refresh properties.
     * </p>
     * 
     * @param dataSetRefreshProperties
     *        The dataset refresh properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDataSetRefreshPropertiesResult withDataSetRefreshProperties(DataSetRefreshProperties dataSetRefreshProperties) {
        setDataSetRefreshProperties(dataSetRefreshProperties);
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
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDataSetRefreshProperties() != null)
            sb.append("DataSetRefreshProperties: ").append(getDataSetRefreshProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDataSetRefreshPropertiesResult == false)
            return false;
        DescribeDataSetRefreshPropertiesResult other = (DescribeDataSetRefreshPropertiesResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDataSetRefreshProperties() == null ^ this.getDataSetRefreshProperties() == null)
            return false;
        if (other.getDataSetRefreshProperties() != null && other.getDataSetRefreshProperties().equals(this.getDataSetRefreshProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDataSetRefreshProperties() == null) ? 0 : getDataSetRefreshProperties().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDataSetRefreshPropertiesResult clone() {
        try {
            return (DescribeDataSetRefreshPropertiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
