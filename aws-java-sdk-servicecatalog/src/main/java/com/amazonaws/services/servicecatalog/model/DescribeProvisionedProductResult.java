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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/DescribeProvisionedProduct"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProvisionedProductResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the provisioned product.
     * </p>
     */
    private ProvisionedProductDetail provisionedProductDetail;
    /**
     * <p>
     * Any CloudWatch dashboards that were created when provisioning the product.
     * </p>
     */
    private java.util.List<CloudWatchDashboard> cloudWatchDashboards;

    /**
     * <p>
     * Information about the provisioned product.
     * </p>
     * 
     * @param provisionedProductDetail
     *        Information about the provisioned product.
     */

    public void setProvisionedProductDetail(ProvisionedProductDetail provisionedProductDetail) {
        this.provisionedProductDetail = provisionedProductDetail;
    }

    /**
     * <p>
     * Information about the provisioned product.
     * </p>
     * 
     * @return Information about the provisioned product.
     */

    public ProvisionedProductDetail getProvisionedProductDetail() {
        return this.provisionedProductDetail;
    }

    /**
     * <p>
     * Information about the provisioned product.
     * </p>
     * 
     * @param provisionedProductDetail
     *        Information about the provisioned product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisionedProductResult withProvisionedProductDetail(ProvisionedProductDetail provisionedProductDetail) {
        setProvisionedProductDetail(provisionedProductDetail);
        return this;
    }

    /**
     * <p>
     * Any CloudWatch dashboards that were created when provisioning the product.
     * </p>
     * 
     * @return Any CloudWatch dashboards that were created when provisioning the product.
     */

    public java.util.List<CloudWatchDashboard> getCloudWatchDashboards() {
        return cloudWatchDashboards;
    }

    /**
     * <p>
     * Any CloudWatch dashboards that were created when provisioning the product.
     * </p>
     * 
     * @param cloudWatchDashboards
     *        Any CloudWatch dashboards that were created when provisioning the product.
     */

    public void setCloudWatchDashboards(java.util.Collection<CloudWatchDashboard> cloudWatchDashboards) {
        if (cloudWatchDashboards == null) {
            this.cloudWatchDashboards = null;
            return;
        }

        this.cloudWatchDashboards = new java.util.ArrayList<CloudWatchDashboard>(cloudWatchDashboards);
    }

    /**
     * <p>
     * Any CloudWatch dashboards that were created when provisioning the product.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchDashboards(java.util.Collection)} or {@link #withCloudWatchDashboards(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param cloudWatchDashboards
     *        Any CloudWatch dashboards that were created when provisioning the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisionedProductResult withCloudWatchDashboards(CloudWatchDashboard... cloudWatchDashboards) {
        if (this.cloudWatchDashboards == null) {
            setCloudWatchDashboards(new java.util.ArrayList<CloudWatchDashboard>(cloudWatchDashboards.length));
        }
        for (CloudWatchDashboard ele : cloudWatchDashboards) {
            this.cloudWatchDashboards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any CloudWatch dashboards that were created when provisioning the product.
     * </p>
     * 
     * @param cloudWatchDashboards
     *        Any CloudWatch dashboards that were created when provisioning the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProvisionedProductResult withCloudWatchDashboards(java.util.Collection<CloudWatchDashboard> cloudWatchDashboards) {
        setCloudWatchDashboards(cloudWatchDashboards);
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
        if (getProvisionedProductDetail() != null)
            sb.append("ProvisionedProductDetail: ").append(getProvisionedProductDetail()).append(",");
        if (getCloudWatchDashboards() != null)
            sb.append("CloudWatchDashboards: ").append(getCloudWatchDashboards());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProvisionedProductResult == false)
            return false;
        DescribeProvisionedProductResult other = (DescribeProvisionedProductResult) obj;
        if (other.getProvisionedProductDetail() == null ^ this.getProvisionedProductDetail() == null)
            return false;
        if (other.getProvisionedProductDetail() != null && other.getProvisionedProductDetail().equals(this.getProvisionedProductDetail()) == false)
            return false;
        if (other.getCloudWatchDashboards() == null ^ this.getCloudWatchDashboards() == null)
            return false;
        if (other.getCloudWatchDashboards() != null && other.getCloudWatchDashboards().equals(this.getCloudWatchDashboards()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProvisionedProductDetail() == null) ? 0 : getProvisionedProductDetail().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchDashboards() == null) ? 0 : getCloudWatchDashboards().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProvisionedProductResult clone() {
        try {
            return (DescribeProvisionedProductResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
