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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DistributeDatasetEntriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARNS for the training dataset and test dataset that you want to use. The datasets must belong to the same
     * project. The test dataset must be empty.
     * </p>
     */
    private java.util.List<DistributeDataset> datasets;

    /**
     * <p>
     * The ARNS for the training dataset and test dataset that you want to use. The datasets must belong to the same
     * project. The test dataset must be empty.
     * </p>
     * 
     * @return The ARNS for the training dataset and test dataset that you want to use. The datasets must belong to the
     *         same project. The test dataset must be empty.
     */

    public java.util.List<DistributeDataset> getDatasets() {
        return datasets;
    }

    /**
     * <p>
     * The ARNS for the training dataset and test dataset that you want to use. The datasets must belong to the same
     * project. The test dataset must be empty.
     * </p>
     * 
     * @param datasets
     *        The ARNS for the training dataset and test dataset that you want to use. The datasets must belong to the
     *        same project. The test dataset must be empty.
     */

    public void setDatasets(java.util.Collection<DistributeDataset> datasets) {
        if (datasets == null) {
            this.datasets = null;
            return;
        }

        this.datasets = new java.util.ArrayList<DistributeDataset>(datasets);
    }

    /**
     * <p>
     * The ARNS for the training dataset and test dataset that you want to use. The datasets must belong to the same
     * project. The test dataset must be empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasets(java.util.Collection)} or {@link #withDatasets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param datasets
     *        The ARNS for the training dataset and test dataset that you want to use. The datasets must belong to the
     *        same project. The test dataset must be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributeDatasetEntriesRequest withDatasets(DistributeDataset... datasets) {
        if (this.datasets == null) {
            setDatasets(new java.util.ArrayList<DistributeDataset>(datasets.length));
        }
        for (DistributeDataset ele : datasets) {
            this.datasets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ARNS for the training dataset and test dataset that you want to use. The datasets must belong to the same
     * project. The test dataset must be empty.
     * </p>
     * 
     * @param datasets
     *        The ARNS for the training dataset and test dataset that you want to use. The datasets must belong to the
     *        same project. The test dataset must be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DistributeDatasetEntriesRequest withDatasets(java.util.Collection<DistributeDataset> datasets) {
        setDatasets(datasets);
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
        if (getDatasets() != null)
            sb.append("Datasets: ").append(getDatasets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DistributeDatasetEntriesRequest == false)
            return false;
        DistributeDatasetEntriesRequest other = (DistributeDatasetEntriesRequest) obj;
        if (other.getDatasets() == null ^ this.getDatasets() == null)
            return false;
        if (other.getDatasets() != null && other.getDatasets().equals(this.getDatasets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasets() == null) ? 0 : getDatasets().hashCode());
        return hashCode;
    }

    @Override
    public DistributeDatasetEntriesRequest clone() {
        return (DistributeDatasetEntriesRequest) super.clone();
    }

}
