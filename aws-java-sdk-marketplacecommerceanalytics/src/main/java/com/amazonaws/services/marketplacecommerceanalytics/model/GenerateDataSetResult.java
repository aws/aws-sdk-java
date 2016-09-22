/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplacecommerceanalytics.model;

import java.io.Serializable;

/**
 * Container for the result of the GenerateDataSet operation.
 */
public class GenerateDataSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * A unique identifier representing a specific request to the GenerateDataSet operation. This identifier can be used
     * to correlate a request with notifications from the SNS topic.
     */
    private String dataSetRequestId;

    /**
     * A unique identifier representing a specific request to the GenerateDataSet operation. This identifier can be used
     * to correlate a request with notifications from the SNS topic.
     * 
     * @param dataSetRequestId
     *        A unique identifier representing a specific request to the GenerateDataSet operation. This identifier can
     *        be used to correlate a request with notifications from the SNS topic.
     */

    public void setDataSetRequestId(String dataSetRequestId) {
        this.dataSetRequestId = dataSetRequestId;
    }

    /**
     * A unique identifier representing a specific request to the GenerateDataSet operation. This identifier can be used
     * to correlate a request with notifications from the SNS topic.
     * 
     * @return A unique identifier representing a specific request to the GenerateDataSet operation. This identifier can
     *         be used to correlate a request with notifications from the SNS topic.
     */

    public String getDataSetRequestId() {
        return this.dataSetRequestId;
    }

    /**
     * A unique identifier representing a specific request to the GenerateDataSet operation. This identifier can be used
     * to correlate a request with notifications from the SNS topic.
     * 
     * @param dataSetRequestId
     *        A unique identifier representing a specific request to the GenerateDataSet operation. This identifier can
     *        be used to correlate a request with notifications from the SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateDataSetResult withDataSetRequestId(String dataSetRequestId) {
        setDataSetRequestId(dataSetRequestId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataSetRequestId() != null)
            sb.append("DataSetRequestId: " + getDataSetRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateDataSetResult == false)
            return false;
        GenerateDataSetResult other = (GenerateDataSetResult) obj;
        if (other.getDataSetRequestId() == null ^ this.getDataSetRequestId() == null)
            return false;
        if (other.getDataSetRequestId() != null && other.getDataSetRequestId().equals(this.getDataSetRequestId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetRequestId() == null) ? 0 : getDataSetRequestId().hashCode());
        return hashCode;
    }

    @Override
    public GenerateDataSetResult clone() {
        try {
            return (GenerateDataSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
