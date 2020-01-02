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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A listing of the dataset group's properties.
     * </p>
     */
    private DatasetGroup datasetGroup;

    /**
     * <p>
     * A listing of the dataset group's properties.
     * </p>
     * 
     * @param datasetGroup
     *        A listing of the dataset group's properties.
     */

    public void setDatasetGroup(DatasetGroup datasetGroup) {
        this.datasetGroup = datasetGroup;
    }

    /**
     * <p>
     * A listing of the dataset group's properties.
     * </p>
     * 
     * @return A listing of the dataset group's properties.
     */

    public DatasetGroup getDatasetGroup() {
        return this.datasetGroup;
    }

    /**
     * <p>
     * A listing of the dataset group's properties.
     * </p>
     * 
     * @param datasetGroup
     *        A listing of the dataset group's properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetGroupResult withDatasetGroup(DatasetGroup datasetGroup) {
        setDatasetGroup(datasetGroup);
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
        if (getDatasetGroup() != null)
            sb.append("DatasetGroup: ").append(getDatasetGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetGroupResult == false)
            return false;
        DescribeDatasetGroupResult other = (DescribeDatasetGroupResult) obj;
        if (other.getDatasetGroup() == null ^ this.getDatasetGroup() == null)
            return false;
        if (other.getDatasetGroup() != null && other.getDatasetGroup().equals(this.getDatasetGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetGroup() == null) ? 0 : getDatasetGroup().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetGroupResult clone() {
        try {
            return (DescribeDatasetGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
