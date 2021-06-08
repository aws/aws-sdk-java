/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetExportJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job to describe.
     * </p>
     */
    private String datasetExportJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job to describe.
     * </p>
     * 
     * @param datasetExportJobArn
     *        The Amazon Resource Name (ARN) of the dataset export job to describe.
     */

    public void setDatasetExportJobArn(String datasetExportJobArn) {
        this.datasetExportJobArn = datasetExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job to describe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset export job to describe.
     */

    public String getDatasetExportJobArn() {
        return this.datasetExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset export job to describe.
     * </p>
     * 
     * @param datasetExportJobArn
     *        The Amazon Resource Name (ARN) of the dataset export job to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetExportJobRequest withDatasetExportJobArn(String datasetExportJobArn) {
        setDatasetExportJobArn(datasetExportJobArn);
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
        if (getDatasetExportJobArn() != null)
            sb.append("DatasetExportJobArn: ").append(getDatasetExportJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetExportJobRequest == false)
            return false;
        DescribeDatasetExportJobRequest other = (DescribeDatasetExportJobRequest) obj;
        if (other.getDatasetExportJobArn() == null ^ this.getDatasetExportJobArn() == null)
            return false;
        if (other.getDatasetExportJobArn() != null && other.getDatasetExportJobArn().equals(this.getDatasetExportJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetExportJobArn() == null) ? 0 : getDatasetExportJobArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetExportJobRequest clone() {
        return (DescribeDatasetExportJobRequest) super.clone();
    }

}
