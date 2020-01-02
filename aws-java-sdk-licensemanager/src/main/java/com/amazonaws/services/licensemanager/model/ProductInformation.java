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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes product information for a license configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ProductInformation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Resource type. The value is <code>SSM_MANAGED</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Product information filters. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Application Name</code> - The name of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Application Publisher</code> - The publisher of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Application Version</code> - The version of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Platform Name</code> - The name of the platform. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Platform Type</code> - The platform type. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>License Included</code> - The type of license included. Logical operators are <code>EQUALS</code> and
     * <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     * <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ProductInformationFilter> productInformationFilterList;

    /**
     * <p>
     * Resource type. The value is <code>SSM_MANAGED</code>.
     * </p>
     * 
     * @param resourceType
     *        Resource type. The value is <code>SSM_MANAGED</code>.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Resource type. The value is <code>SSM_MANAGED</code>.
     * </p>
     * 
     * @return Resource type. The value is <code>SSM_MANAGED</code>.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Resource type. The value is <code>SSM_MANAGED</code>.
     * </p>
     * 
     * @param resourceType
     *        Resource type. The value is <code>SSM_MANAGED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductInformation withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Product information filters. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Application Name</code> - The name of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Application Publisher</code> - The publisher of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Application Version</code> - The version of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Platform Name</code> - The name of the platform. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Platform Type</code> - The platform type. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>License Included</code> - The type of license included. Logical operators are <code>EQUALS</code> and
     * <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     * <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Product information filters. The following filters and logical operators are supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Application Name</code> - The name of the application. Logical operator is <code>EQUALS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Application Publisher</code> - The publisher of the application. Logical operator is
     *         <code>EQUALS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Application Version</code> - The version of the application. Logical operator is
     *         <code>EQUALS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Platform Name</code> - The name of the platform. Logical operator is <code>EQUALS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Platform Type</code> - The platform type. Logical operator is <code>EQUALS</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>License Included</code> - The type of license included. Logical operators are <code>EQUALS</code>
     *         and <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     *         <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     *         </p>
     *         </li>
     */

    public java.util.List<ProductInformationFilter> getProductInformationFilterList() {
        return productInformationFilterList;
    }

    /**
     * <p>
     * Product information filters. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Application Name</code> - The name of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Application Publisher</code> - The publisher of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Application Version</code> - The version of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Platform Name</code> - The name of the platform. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Platform Type</code> - The platform type. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>License Included</code> - The type of license included. Logical operators are <code>EQUALS</code> and
     * <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     * <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param productInformationFilterList
     *        Product information filters. The following filters and logical operators are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Application Name</code> - The name of the application. Logical operator is <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Application Publisher</code> - The publisher of the application. Logical operator is
     *        <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Application Version</code> - The version of the application. Logical operator is <code>EQUALS</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Platform Name</code> - The name of the platform. Logical operator is <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Platform Type</code> - The platform type. Logical operator is <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>License Included</code> - The type of license included. Logical operators are <code>EQUALS</code>
     *        and <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     *        <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     *        </p>
     *        </li>
     */

    public void setProductInformationFilterList(java.util.Collection<ProductInformationFilter> productInformationFilterList) {
        if (productInformationFilterList == null) {
            this.productInformationFilterList = null;
            return;
        }

        this.productInformationFilterList = new java.util.ArrayList<ProductInformationFilter>(productInformationFilterList);
    }

    /**
     * <p>
     * Product information filters. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Application Name</code> - The name of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Application Publisher</code> - The publisher of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Application Version</code> - The version of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Platform Name</code> - The name of the platform. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Platform Type</code> - The platform type. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>License Included</code> - The type of license included. Logical operators are <code>EQUALS</code> and
     * <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     * <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductInformationFilterList(java.util.Collection)} or
     * {@link #withProductInformationFilterList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param productInformationFilterList
     *        Product information filters. The following filters and logical operators are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Application Name</code> - The name of the application. Logical operator is <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Application Publisher</code> - The publisher of the application. Logical operator is
     *        <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Application Version</code> - The version of the application. Logical operator is <code>EQUALS</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Platform Name</code> - The name of the platform. Logical operator is <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Platform Type</code> - The platform type. Logical operator is <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>License Included</code> - The type of license included. Logical operators are <code>EQUALS</code>
     *        and <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     *        <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductInformation withProductInformationFilterList(ProductInformationFilter... productInformationFilterList) {
        if (this.productInformationFilterList == null) {
            setProductInformationFilterList(new java.util.ArrayList<ProductInformationFilter>(productInformationFilterList.length));
        }
        for (ProductInformationFilter ele : productInformationFilterList) {
            this.productInformationFilterList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Product information filters. The following filters and logical operators are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Application Name</code> - The name of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Application Publisher</code> - The publisher of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Application Version</code> - The version of the application. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Platform Name</code> - The name of the platform. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Platform Type</code> - The platform type. Logical operator is <code>EQUALS</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>License Included</code> - The type of license included. Logical operators are <code>EQUALS</code> and
     * <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     * <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param productInformationFilterList
     *        Product information filters. The following filters and logical operators are supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Application Name</code> - The name of the application. Logical operator is <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Application Publisher</code> - The publisher of the application. Logical operator is
     *        <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Application Version</code> - The version of the application. Logical operator is <code>EQUALS</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Platform Name</code> - The name of the platform. Logical operator is <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Platform Type</code> - The platform type. Logical operator is <code>EQUALS</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>License Included</code> - The type of license included. Logical operators are <code>EQUALS</code>
     *        and <code>NOT_EQUALS</code>. Possible values are <code>sql-server-enterprise</code> |
     *        <code>sql-server-standard</code> | <code>sql-server-web</code> | <code>windows-server-datacenter</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductInformation withProductInformationFilterList(java.util.Collection<ProductInformationFilter> productInformationFilterList) {
        setProductInformationFilterList(productInformationFilterList);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getProductInformationFilterList() != null)
            sb.append("ProductInformationFilterList: ").append(getProductInformationFilterList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductInformation == false)
            return false;
        ProductInformation other = (ProductInformation) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getProductInformationFilterList() == null ^ this.getProductInformationFilterList() == null)
            return false;
        if (other.getProductInformationFilterList() != null && other.getProductInformationFilterList().equals(this.getProductInformationFilterList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getProductInformationFilterList() == null) ? 0 : getProductInformationFilterList().hashCode());
        return hashCode;
    }

    @Override
    public ProductInformation clone() {
        try {
            return (ProductInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.ProductInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
