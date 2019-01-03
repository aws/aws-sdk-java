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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an AWS service returned by the <a>DescribeServices</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/Service" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Service implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The code for an AWS service returned by the <a>DescribeServices</a> response. The <code>name</code> element
     * contains the corresponding friendly name.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The friendly name for an AWS service. The <code>code</code> element contains the corresponding code.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of categories that describe the type of support issue a case describes. Categories consist of a category
     * name and a category code. Category names and codes are passed to AWS Support when you call <a>CreateCase</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Category> categories;

    /**
     * <p>
     * The code for an AWS service returned by the <a>DescribeServices</a> response. The <code>name</code> element
     * contains the corresponding friendly name.
     * </p>
     * 
     * @param code
     *        The code for an AWS service returned by the <a>DescribeServices</a> response. The <code>name</code>
     *        element contains the corresponding friendly name.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code for an AWS service returned by the <a>DescribeServices</a> response. The <code>name</code> element
     * contains the corresponding friendly name.
     * </p>
     * 
     * @return The code for an AWS service returned by the <a>DescribeServices</a> response. The <code>name</code>
     *         element contains the corresponding friendly name.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code for an AWS service returned by the <a>DescribeServices</a> response. The <code>name</code> element
     * contains the corresponding friendly name.
     * </p>
     * 
     * @param code
     *        The code for an AWS service returned by the <a>DescribeServices</a> response. The <code>name</code>
     *        element contains the corresponding friendly name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The friendly name for an AWS service. The <code>code</code> element contains the corresponding code.
     * </p>
     * 
     * @param name
     *        The friendly name for an AWS service. The <code>code</code> element contains the corresponding code.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name for an AWS service. The <code>code</code> element contains the corresponding code.
     * </p>
     * 
     * @return The friendly name for an AWS service. The <code>code</code> element contains the corresponding code.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The friendly name for an AWS service. The <code>code</code> element contains the corresponding code.
     * </p>
     * 
     * @param name
     *        The friendly name for an AWS service. The <code>code</code> element contains the corresponding code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of categories that describe the type of support issue a case describes. Categories consist of a category
     * name and a category code. Category names and codes are passed to AWS Support when you call <a>CreateCase</a>.
     * </p>
     * 
     * @return A list of categories that describe the type of support issue a case describes. Categories consist of a
     *         category name and a category code. Category names and codes are passed to AWS Support when you call
     *         <a>CreateCase</a>.
     */

    public java.util.List<Category> getCategories() {
        if (categories == null) {
            categories = new com.amazonaws.internal.SdkInternalList<Category>();
        }
        return categories;
    }

    /**
     * <p>
     * A list of categories that describe the type of support issue a case describes. Categories consist of a category
     * name and a category code. Category names and codes are passed to AWS Support when you call <a>CreateCase</a>.
     * </p>
     * 
     * @param categories
     *        A list of categories that describe the type of support issue a case describes. Categories consist of a
     *        category name and a category code. Category names and codes are passed to AWS Support when you call
     *        <a>CreateCase</a>.
     */

    public void setCategories(java.util.Collection<Category> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new com.amazonaws.internal.SdkInternalList<Category>(categories);
    }

    /**
     * <p>
     * A list of categories that describe the type of support issue a case describes. Categories consist of a category
     * name and a category code. Category names and codes are passed to AWS Support when you call <a>CreateCase</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategories(java.util.Collection)} or {@link #withCategories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categories
     *        A list of categories that describe the type of support issue a case describes. Categories consist of a
     *        category name and a category code. Category names and codes are passed to AWS Support when you call
     *        <a>CreateCase</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withCategories(Category... categories) {
        if (this.categories == null) {
            setCategories(new com.amazonaws.internal.SdkInternalList<Category>(categories.length));
        }
        for (Category ele : categories) {
            this.categories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of categories that describe the type of support issue a case describes. Categories consist of a category
     * name and a category code. Category names and codes are passed to AWS Support when you call <a>CreateCase</a>.
     * </p>
     * 
     * @param categories
     *        A list of categories that describe the type of support issue a case describes. Categories consist of a
     *        category name and a category code. Category names and codes are passed to AWS Support when you call
     *        <a>CreateCase</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Service withCategories(java.util.Collection<Category> categories) {
        setCategories(categories);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCategories() != null)
            sb.append("Categories: ").append(getCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        return hashCode;
    }

    @Override
    public Service clone() {
        try {
            return (Service) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.support.model.transform.ServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
