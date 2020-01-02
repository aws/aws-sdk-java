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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetImportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job to describe.
     * </p>
     */
    private String datasetImportJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job to describe.
     * </p>
     * 
     * @param datasetImportJobArn
     *        The Amazon Resource Name (ARN) of the dataset import job to describe.
     */

    public void setDatasetImportJobArn(String datasetImportJobArn) {
        this.datasetImportJobArn = datasetImportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job to describe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset import job to describe.
     */

    public String getDatasetImportJobArn() {
        return this.datasetImportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset import job to describe.
     * </p>
     * 
     * @param datasetImportJobArn
     *        The Amazon Resource Name (ARN) of the dataset import job to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetImportJobRequest withDatasetImportJobArn(String datasetImportJobArn) {
        setDatasetImportJobArn(datasetImportJobArn);
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
        if (getDatasetImportJobArn() != null)
            sb.append("DatasetImportJobArn: ").append(getDatasetImportJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetImportJobRequest == false)
            return false;
        DescribeDatasetImportJobRequest other = (DescribeDatasetImportJobRequest) obj;
        if (other.getDatasetImportJobArn() == null ^ this.getDatasetImportJobArn() == null)
            return false;
        if (other.getDatasetImportJobArn() != null && other.getDatasetImportJobArn().equals(this.getDatasetImportJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetImportJobArn() == null) ? 0 : getDatasetImportJobArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetImportJobRequest clone() {
        return (DescribeDatasetImportJobRequest) super.clone();
    }

}
