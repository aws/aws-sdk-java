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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Filter criteria to use in determining which extensions to return.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/TypeFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeFilters implements Serializable, Cloneable {

    /**
     * <p>
     * The category of extensions to return.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code>: Private extensions that have been registered for this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATED</code>: Public extensions that have been activated for this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRD-PARTY</code>: Extensions available for use from publishers other than Amazon. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Private extensions registered in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Public extensions from publishers other than Amazon, whether activated or not.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>AWS-TYPES</code>: Extensions available for use from Amazon.
     * </p>
     * </li>
     * </ul>
     */
    private String category;
    /**
     * <p>
     * The id of the publisher of the extension.
     * </p>
     * <p>
     * Extensions published by Amazon are not assigned a publisher ID. Use the <code>AWS-TYPES</code> category to
     * specify a list of types published by Amazon.
     * </p>
     */
    private String publisherId;
    /**
     * <p>
     * A prefix to use as a filter for results.
     * </p>
     */
    private String typeNamePrefix;

    /**
     * <p>
     * The category of extensions to return.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code>: Private extensions that have been registered for this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATED</code>: Public extensions that have been activated for this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRD-PARTY</code>: Extensions available for use from publishers other than Amazon. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Private extensions registered in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Public extensions from publishers other than Amazon, whether activated or not.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>AWS-TYPES</code>: Extensions available for use from Amazon.
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        The category of extensions to return.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code>: Private extensions that have been registered for this account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATED</code>: Public extensions that have been activated for this account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIRD-PARTY</code>: Extensions available for use from publishers other than Amazon. This includes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Private extensions registered in the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Public extensions from publishers other than Amazon, whether activated or not.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS-TYPES</code>: Extensions available for use from Amazon.
     *        </p>
     *        </li>
     * @see Category
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of extensions to return.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code>: Private extensions that have been registered for this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATED</code>: Public extensions that have been activated for this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRD-PARTY</code>: Extensions available for use from publishers other than Amazon. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Private extensions registered in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Public extensions from publishers other than Amazon, whether activated or not.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>AWS-TYPES</code>: Extensions available for use from Amazon.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The category of extensions to return.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REGISTERED</code>: Private extensions that have been registered for this account and region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVATED</code>: Public extensions that have been activated for this account and region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>THIRD-PARTY</code>: Extensions available for use from publishers other than Amazon. This includes:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Private extensions registered in the account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Public extensions from publishers other than Amazon, whether activated or not.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS-TYPES</code>: Extensions available for use from Amazon.
     *         </p>
     *         </li>
     * @see Category
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of extensions to return.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code>: Private extensions that have been registered for this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATED</code>: Public extensions that have been activated for this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRD-PARTY</code>: Extensions available for use from publishers other than Amazon. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Private extensions registered in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Public extensions from publishers other than Amazon, whether activated or not.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>AWS-TYPES</code>: Extensions available for use from Amazon.
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        The category of extensions to return.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code>: Private extensions that have been registered for this account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATED</code>: Public extensions that have been activated for this account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIRD-PARTY</code>: Extensions available for use from publishers other than Amazon. This includes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Private extensions registered in the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Public extensions from publishers other than Amazon, whether activated or not.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS-TYPES</code>: Extensions available for use from Amazon.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Category
     */

    public TypeFilters withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of extensions to return.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REGISTERED</code>: Private extensions that have been registered for this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVATED</code>: Public extensions that have been activated for this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRD-PARTY</code>: Extensions available for use from publishers other than Amazon. This includes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Private extensions registered in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * Public extensions from publishers other than Amazon, whether activated or not.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>AWS-TYPES</code>: Extensions available for use from Amazon.
     * </p>
     * </li>
     * </ul>
     * 
     * @param category
     *        The category of extensions to return.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REGISTERED</code>: Private extensions that have been registered for this account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVATED</code>: Public extensions that have been activated for this account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIRD-PARTY</code>: Extensions available for use from publishers other than Amazon. This includes:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Private extensions registered in the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Public extensions from publishers other than Amazon, whether activated or not.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS-TYPES</code>: Extensions available for use from Amazon.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Category
     */

    public TypeFilters withCategory(Category category) {
        this.category = category.toString();
        return this;
    }

    /**
     * <p>
     * The id of the publisher of the extension.
     * </p>
     * <p>
     * Extensions published by Amazon are not assigned a publisher ID. Use the <code>AWS-TYPES</code> category to
     * specify a list of types published by Amazon.
     * </p>
     * 
     * @param publisherId
     *        The id of the publisher of the extension. </p>
     *        <p>
     *        Extensions published by Amazon are not assigned a publisher ID. Use the <code>AWS-TYPES</code> category to
     *        specify a list of types published by Amazon.
     */

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    /**
     * <p>
     * The id of the publisher of the extension.
     * </p>
     * <p>
     * Extensions published by Amazon are not assigned a publisher ID. Use the <code>AWS-TYPES</code> category to
     * specify a list of types published by Amazon.
     * </p>
     * 
     * @return The id of the publisher of the extension. </p>
     *         <p>
     *         Extensions published by Amazon are not assigned a publisher ID. Use the <code>AWS-TYPES</code> category
     *         to specify a list of types published by Amazon.
     */

    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * <p>
     * The id of the publisher of the extension.
     * </p>
     * <p>
     * Extensions published by Amazon are not assigned a publisher ID. Use the <code>AWS-TYPES</code> category to
     * specify a list of types published by Amazon.
     * </p>
     * 
     * @param publisherId
     *        The id of the publisher of the extension. </p>
     *        <p>
     *        Extensions published by Amazon are not assigned a publisher ID. Use the <code>AWS-TYPES</code> category to
     *        specify a list of types published by Amazon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeFilters withPublisherId(String publisherId) {
        setPublisherId(publisherId);
        return this;
    }

    /**
     * <p>
     * A prefix to use as a filter for results.
     * </p>
     * 
     * @param typeNamePrefix
     *        A prefix to use as a filter for results.
     */

    public void setTypeNamePrefix(String typeNamePrefix) {
        this.typeNamePrefix = typeNamePrefix;
    }

    /**
     * <p>
     * A prefix to use as a filter for results.
     * </p>
     * 
     * @return A prefix to use as a filter for results.
     */

    public String getTypeNamePrefix() {
        return this.typeNamePrefix;
    }

    /**
     * <p>
     * A prefix to use as a filter for results.
     * </p>
     * 
     * @param typeNamePrefix
     *        A prefix to use as a filter for results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TypeFilters withTypeNamePrefix(String typeNamePrefix) {
        setTypeNamePrefix(typeNamePrefix);
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getPublisherId() != null)
            sb.append("PublisherId: ").append(getPublisherId()).append(",");
        if (getTypeNamePrefix() != null)
            sb.append("TypeNamePrefix: ").append(getTypeNamePrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TypeFilters == false)
            return false;
        TypeFilters other = (TypeFilters) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getPublisherId() == null ^ this.getPublisherId() == null)
            return false;
        if (other.getPublisherId() != null && other.getPublisherId().equals(this.getPublisherId()) == false)
            return false;
        if (other.getTypeNamePrefix() == null ^ this.getTypeNamePrefix() == null)
            return false;
        if (other.getTypeNamePrefix() != null && other.getTypeNamePrefix().equals(this.getTypeNamePrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getPublisherId() == null) ? 0 : getPublisherId().hashCode());
        hashCode = prime * hashCode + ((getTypeNamePrefix() == null) ? 0 : getTypeNamePrefix().hashCode());
        return hashCode;
    }

    @Override
    public TypeFilters clone() {
        try {
            return (TypeFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
