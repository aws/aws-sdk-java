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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DescribeDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains information about the data set.
     * </p>
     */
    private Dataset dataset;

    /**
     * <p>
     * An object that contains information about the data set.
     * </p>
     * 
     * @param dataset
     *        An object that contains information about the data set.
     */

    public void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    /**
     * <p>
     * An object that contains information about the data set.
     * </p>
     * 
     * @return An object that contains information about the data set.
     */

    public Dataset getDataset() {
        return this.dataset;
    }

    /**
     * <p>
     * An object that contains information about the data set.
     * </p>
     * 
     * @param dataset
     *        An object that contains information about the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withDataset(Dataset dataset) {
        setDataset(dataset);
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
        if (getDataset() != null)
            sb.append("Dataset: ").append(getDataset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetResult == false)
            return false;
        DescribeDatasetResult other = (DescribeDatasetResult) obj;
        if (other.getDataset() == null ^ this.getDataset() == null)
            return false;
        if (other.getDataset() != null && other.getDataset().equals(this.getDataset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataset() == null) ? 0 : getDataset().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetResult clone() {
        try {
            return (DescribeDatasetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
