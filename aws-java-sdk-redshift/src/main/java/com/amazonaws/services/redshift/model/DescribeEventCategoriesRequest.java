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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeEventCategories" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventCategoriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The source type, such as cluster or parameter group, to which the described event categories apply.
     * </p>
     * <p>
     * Valid values: cluster, cluster-snapshot, cluster-parameter-group, and cluster-security-group.
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * The source type, such as cluster or parameter group, to which the described event categories apply.
     * </p>
     * <p>
     * Valid values: cluster, cluster-snapshot, cluster-parameter-group, and cluster-security-group.
     * </p>
     * 
     * @param sourceType
     *        The source type, such as cluster or parameter group, to which the described event categories apply.</p>
     *        <p>
     *        Valid values: cluster, cluster-snapshot, cluster-parameter-group, and cluster-security-group.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type, such as cluster or parameter group, to which the described event categories apply.
     * </p>
     * <p>
     * Valid values: cluster, cluster-snapshot, cluster-parameter-group, and cluster-security-group.
     * </p>
     * 
     * @return The source type, such as cluster or parameter group, to which the described event categories apply.</p>
     *         <p>
     *         Valid values: cluster, cluster-snapshot, cluster-parameter-group, and cluster-security-group.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type, such as cluster or parameter group, to which the described event categories apply.
     * </p>
     * <p>
     * Valid values: cluster, cluster-snapshot, cluster-parameter-group, and cluster-security-group.
     * </p>
     * 
     * @param sourceType
     *        The source type, such as cluster or parameter group, to which the described event categories apply.</p>
     *        <p>
     *        Valid values: cluster, cluster-snapshot, cluster-parameter-group, and cluster-security-group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventCategoriesRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
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
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventCategoriesRequest == false)
            return false;
        DescribeEventCategoriesRequest other = (DescribeEventCategoriesRequest) obj;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventCategoriesRequest clone() {
        return (DescribeEventCategoriesRequest) super.clone();
    }

}
