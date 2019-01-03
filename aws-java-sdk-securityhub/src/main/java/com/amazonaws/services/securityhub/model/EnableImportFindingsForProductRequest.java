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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableImportFindingsForProductRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the product that generates findings that you want to import into Security Hub.
     * </p>
     */
    private String productArn;

    /**
     * <p>
     * The ARN of the product that generates findings that you want to import into Security Hub.
     * </p>
     * 
     * @param productArn
     *        The ARN of the product that generates findings that you want to import into Security Hub.
     */

    public void setProductArn(String productArn) {
        this.productArn = productArn;
    }

    /**
     * <p>
     * The ARN of the product that generates findings that you want to import into Security Hub.
     * </p>
     * 
     * @return The ARN of the product that generates findings that you want to import into Security Hub.
     */

    public String getProductArn() {
        return this.productArn;
    }

    /**
     * <p>
     * The ARN of the product that generates findings that you want to import into Security Hub.
     * </p>
     * 
     * @param productArn
     *        The ARN of the product that generates findings that you want to import into Security Hub.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableImportFindingsForProductRequest withProductArn(String productArn) {
        setProductArn(productArn);
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
        if (getProductArn() != null)
            sb.append("ProductArn: ").append(getProductArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableImportFindingsForProductRequest == false)
            return false;
        EnableImportFindingsForProductRequest other = (EnableImportFindingsForProductRequest) obj;
        if (other.getProductArn() == null ^ this.getProductArn() == null)
            return false;
        if (other.getProductArn() != null && other.getProductArn().equals(this.getProductArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductArn() == null) ? 0 : getProductArn().hashCode());
        return hashCode;
    }

    @Override
    public EnableImportFindingsForProductRequest clone() {
        return (EnableImportFindingsForProductRequest) super.clone();
    }

}
