/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/UpdateDatasetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDatasetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the dataset group.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
     * </p>
     */
    private java.util.List<String> datasetArns;

    /**
     * <p>
     * The ARN of the dataset group.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group.
     * </p>
     * 
     * @return The ARN of the dataset group.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetGroupRequest withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
     * </p>
     * 
     * @return An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
     */

    public java.util.List<String> getDatasetArns() {
        return datasetArns;
    }

    /**
     * <p>
     * An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
     * </p>
     * 
     * @param datasetArns
     *        An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
     */

    public void setDatasetArns(java.util.Collection<String> datasetArns) {
        if (datasetArns == null) {
            this.datasetArns = null;
            return;
        }

        this.datasetArns = new java.util.ArrayList<String>(datasetArns);
    }

    /**
     * <p>
     * An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatasetArns(java.util.Collection)} or {@link #withDatasetArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param datasetArns
     *        An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetGroupRequest withDatasetArns(String... datasetArns) {
        if (this.datasetArns == null) {
            setDatasetArns(new java.util.ArrayList<String>(datasetArns.length));
        }
        for (String ele : datasetArns) {
            this.datasetArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
     * </p>
     * 
     * @param datasetArns
     *        An array of the Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDatasetGroupRequest withDatasetArns(java.util.Collection<String> datasetArns) {
        setDatasetArns(datasetArns);
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
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getDatasetArns() != null)
            sb.append("DatasetArns: ").append(getDatasetArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDatasetGroupRequest == false)
            return false;
        UpdateDatasetGroupRequest other = (UpdateDatasetGroupRequest) obj;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getDatasetArns() == null ^ this.getDatasetArns() == null)
            return false;
        if (other.getDatasetArns() != null && other.getDatasetArns().equals(this.getDatasetArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetArns() == null) ? 0 : getDatasetArns().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDatasetGroupRequest clone() {
        return (UpdateDatasetGroupRequest) super.clone();
    }

}
