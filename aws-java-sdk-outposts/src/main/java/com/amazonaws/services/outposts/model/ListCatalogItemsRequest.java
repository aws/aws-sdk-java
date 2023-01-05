/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListCatalogItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCatalogItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String nextToken;

    private Integer maxResults;
    /**
     * <p>
     * Filters the results by item class.
     * </p>
     */
    private java.util.List<String> itemClassFilter;
    /**
     * <p>
     * Filters the results by storage option.
     * </p>
     */
    private java.util.List<String> supportedStorageFilter;
    /**
     * <p>
     * Filters the results by EC2 family (for example, M5).
     * </p>
     */
    private java.util.List<String> eC2FamilyFilter;

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCatalogItemsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCatalogItemsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters the results by item class.
     * </p>
     * 
     * @return Filters the results by item class.
     * @see CatalogItemClass
     */

    public java.util.List<String> getItemClassFilter() {
        return itemClassFilter;
    }

    /**
     * <p>
     * Filters the results by item class.
     * </p>
     * 
     * @param itemClassFilter
     *        Filters the results by item class.
     * @see CatalogItemClass
     */

    public void setItemClassFilter(java.util.Collection<String> itemClassFilter) {
        if (itemClassFilter == null) {
            this.itemClassFilter = null;
            return;
        }

        this.itemClassFilter = new java.util.ArrayList<String>(itemClassFilter);
    }

    /**
     * <p>
     * Filters the results by item class.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItemClassFilter(java.util.Collection)} or {@link #withItemClassFilter(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param itemClassFilter
     *        Filters the results by item class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CatalogItemClass
     */

    public ListCatalogItemsRequest withItemClassFilter(String... itemClassFilter) {
        if (this.itemClassFilter == null) {
            setItemClassFilter(new java.util.ArrayList<String>(itemClassFilter.length));
        }
        for (String ele : itemClassFilter) {
            this.itemClassFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by item class.
     * </p>
     * 
     * @param itemClassFilter
     *        Filters the results by item class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CatalogItemClass
     */

    public ListCatalogItemsRequest withItemClassFilter(java.util.Collection<String> itemClassFilter) {
        setItemClassFilter(itemClassFilter);
        return this;
    }

    /**
     * <p>
     * Filters the results by item class.
     * </p>
     * 
     * @param itemClassFilter
     *        Filters the results by item class.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CatalogItemClass
     */

    public ListCatalogItemsRequest withItemClassFilter(CatalogItemClass... itemClassFilter) {
        java.util.ArrayList<String> itemClassFilterCopy = new java.util.ArrayList<String>(itemClassFilter.length);
        for (CatalogItemClass value : itemClassFilter) {
            itemClassFilterCopy.add(value.toString());
        }
        if (getItemClassFilter() == null) {
            setItemClassFilter(itemClassFilterCopy);
        } else {
            getItemClassFilter().addAll(itemClassFilterCopy);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by storage option.
     * </p>
     * 
     * @return Filters the results by storage option.
     * @see SupportedStorageEnum
     */

    public java.util.List<String> getSupportedStorageFilter() {
        return supportedStorageFilter;
    }

    /**
     * <p>
     * Filters the results by storage option.
     * </p>
     * 
     * @param supportedStorageFilter
     *        Filters the results by storage option.
     * @see SupportedStorageEnum
     */

    public void setSupportedStorageFilter(java.util.Collection<String> supportedStorageFilter) {
        if (supportedStorageFilter == null) {
            this.supportedStorageFilter = null;
            return;
        }

        this.supportedStorageFilter = new java.util.ArrayList<String>(supportedStorageFilter);
    }

    /**
     * <p>
     * Filters the results by storage option.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedStorageFilter(java.util.Collection)} or
     * {@link #withSupportedStorageFilter(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedStorageFilter
     *        Filters the results by storage option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedStorageEnum
     */

    public ListCatalogItemsRequest withSupportedStorageFilter(String... supportedStorageFilter) {
        if (this.supportedStorageFilter == null) {
            setSupportedStorageFilter(new java.util.ArrayList<String>(supportedStorageFilter.length));
        }
        for (String ele : supportedStorageFilter) {
            this.supportedStorageFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by storage option.
     * </p>
     * 
     * @param supportedStorageFilter
     *        Filters the results by storage option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedStorageEnum
     */

    public ListCatalogItemsRequest withSupportedStorageFilter(java.util.Collection<String> supportedStorageFilter) {
        setSupportedStorageFilter(supportedStorageFilter);
        return this;
    }

    /**
     * <p>
     * Filters the results by storage option.
     * </p>
     * 
     * @param supportedStorageFilter
     *        Filters the results by storage option.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SupportedStorageEnum
     */

    public ListCatalogItemsRequest withSupportedStorageFilter(SupportedStorageEnum... supportedStorageFilter) {
        java.util.ArrayList<String> supportedStorageFilterCopy = new java.util.ArrayList<String>(supportedStorageFilter.length);
        for (SupportedStorageEnum value : supportedStorageFilter) {
            supportedStorageFilterCopy.add(value.toString());
        }
        if (getSupportedStorageFilter() == null) {
            setSupportedStorageFilter(supportedStorageFilterCopy);
        } else {
            getSupportedStorageFilter().addAll(supportedStorageFilterCopy);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by EC2 family (for example, M5).
     * </p>
     * 
     * @return Filters the results by EC2 family (for example, M5).
     */

    public java.util.List<String> getEC2FamilyFilter() {
        return eC2FamilyFilter;
    }

    /**
     * <p>
     * Filters the results by EC2 family (for example, M5).
     * </p>
     * 
     * @param eC2FamilyFilter
     *        Filters the results by EC2 family (for example, M5).
     */

    public void setEC2FamilyFilter(java.util.Collection<String> eC2FamilyFilter) {
        if (eC2FamilyFilter == null) {
            this.eC2FamilyFilter = null;
            return;
        }

        this.eC2FamilyFilter = new java.util.ArrayList<String>(eC2FamilyFilter);
    }

    /**
     * <p>
     * Filters the results by EC2 family (for example, M5).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEC2FamilyFilter(java.util.Collection)} or {@link #withEC2FamilyFilter(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eC2FamilyFilter
     *        Filters the results by EC2 family (for example, M5).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCatalogItemsRequest withEC2FamilyFilter(String... eC2FamilyFilter) {
        if (this.eC2FamilyFilter == null) {
            setEC2FamilyFilter(new java.util.ArrayList<String>(eC2FamilyFilter.length));
        }
        for (String ele : eC2FamilyFilter) {
            this.eC2FamilyFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by EC2 family (for example, M5).
     * </p>
     * 
     * @param eC2FamilyFilter
     *        Filters the results by EC2 family (for example, M5).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCatalogItemsRequest withEC2FamilyFilter(java.util.Collection<String> eC2FamilyFilter) {
        setEC2FamilyFilter(eC2FamilyFilter);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getItemClassFilter() != null)
            sb.append("ItemClassFilter: ").append(getItemClassFilter()).append(",");
        if (getSupportedStorageFilter() != null)
            sb.append("SupportedStorageFilter: ").append(getSupportedStorageFilter()).append(",");
        if (getEC2FamilyFilter() != null)
            sb.append("EC2FamilyFilter: ").append(getEC2FamilyFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCatalogItemsRequest == false)
            return false;
        ListCatalogItemsRequest other = (ListCatalogItemsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getItemClassFilter() == null ^ this.getItemClassFilter() == null)
            return false;
        if (other.getItemClassFilter() != null && other.getItemClassFilter().equals(this.getItemClassFilter()) == false)
            return false;
        if (other.getSupportedStorageFilter() == null ^ this.getSupportedStorageFilter() == null)
            return false;
        if (other.getSupportedStorageFilter() != null && other.getSupportedStorageFilter().equals(this.getSupportedStorageFilter()) == false)
            return false;
        if (other.getEC2FamilyFilter() == null ^ this.getEC2FamilyFilter() == null)
            return false;
        if (other.getEC2FamilyFilter() != null && other.getEC2FamilyFilter().equals(this.getEC2FamilyFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getItemClassFilter() == null) ? 0 : getItemClassFilter().hashCode());
        hashCode = prime * hashCode + ((getSupportedStorageFilter() == null) ? 0 : getSupportedStorageFilter().hashCode());
        hashCode = prime * hashCode + ((getEC2FamilyFilter() == null) ? 0 : getEC2FamilyFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListCatalogItemsRequest clone() {
        return (ListCatalogItemsRequest) super.clone();
    }

}
