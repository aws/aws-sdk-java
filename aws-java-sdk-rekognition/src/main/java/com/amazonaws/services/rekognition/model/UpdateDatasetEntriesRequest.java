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
public class UpdateDatasetEntriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that you want to update.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The changes that you want to make to the dataset.
     * </p>
     */
    private DatasetChanges changes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that you want to update.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset that you want to update.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that you want to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset that you want to update.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset that you want to update.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetEntriesRequest withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The changes that you want to make to the dataset.
     * </p>
     * 
     * @param changes
     *        The changes that you want to make to the dataset.
     */

    public void setChanges(DatasetChanges changes) {
        this.changes = changes;
    }

    /**
     * <p>
     * The changes that you want to make to the dataset.
     * </p>
     * 
     * @return The changes that you want to make to the dataset.
     */

    public DatasetChanges getChanges() {
        return this.changes;
    }

    /**
     * <p>
     * The changes that you want to make to the dataset.
     * </p>
     * 
     * @param changes
     *        The changes that you want to make to the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetEntriesRequest withChanges(DatasetChanges changes) {
        setChanges(changes);
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getChanges() != null)
            sb.append("Changes: ").append(getChanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDatasetEntriesRequest == false)
            return false;
        UpdateDatasetEntriesRequest other = (UpdateDatasetEntriesRequest) obj;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getChanges() == null ^ this.getChanges() == null)
            return false;
        if (other.getChanges() != null && other.getChanges().equals(this.getChanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getChanges() == null) ? 0 : getChanges().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDatasetEntriesRequest clone() {
        return (UpdateDatasetEntriesRequest) super.clone();
    }

}
