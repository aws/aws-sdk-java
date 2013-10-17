/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.support.model;

import java.io.Serializable;


/**
 * <p>
 * JSON-formatted object that represents an AWS Service returned by the <a
 * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"> DescribeServices </a> action.
 * </p>
 */
public class Service implements Serializable {

    /**
     * JSON-formatted string that represents a code for an AWS service
     * returned by <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     * title="DescribeServices">DescribeServices</a> response. Has a
     * corrsponding name represented by a service.name string.
     */
    private String code;

    /**
     * JSON-formatted string that represents the friendly name for an AWS
     * service. Has a corresponding code reprsented by a Service.code string.
     */
    private String name;

    /**
     * JSON-formatted list of categories that describe the type of support
     * issue a case describes. Categories are strings that represent a
     * category name and a category code. Category names and codes are passed
     * to AWS Support when you call <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Category> categories;

    /**
     * JSON-formatted string that represents a code for an AWS service
     * returned by <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     * title="DescribeServices">DescribeServices</a> response. Has a
     * corrsponding name represented by a service.name string.
     *
     * @return JSON-formatted string that represents a code for an AWS service
     *         returned by <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     *         title="DescribeServices">DescribeServices</a> response. Has a
     *         corrsponding name represented by a service.name string.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * JSON-formatted string that represents a code for an AWS service
     * returned by <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     * title="DescribeServices">DescribeServices</a> response. Has a
     * corrsponding name represented by a service.name string.
     *
     * @param code JSON-formatted string that represents a code for an AWS service
     *         returned by <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     *         title="DescribeServices">DescribeServices</a> response. Has a
     *         corrsponding name represented by a service.name string.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * JSON-formatted string that represents a code for an AWS service
     * returned by <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     * title="DescribeServices">DescribeServices</a> response. Has a
     * corrsponding name represented by a service.name string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code JSON-formatted string that represents a code for an AWS service
     *         returned by <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeServices.html"
     *         title="DescribeServices">DescribeServices</a> response. Has a
     *         corrsponding name represented by a service.name string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Service withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * JSON-formatted string that represents the friendly name for an AWS
     * service. Has a corresponding code reprsented by a Service.code string.
     *
     * @return JSON-formatted string that represents the friendly name for an AWS
     *         service. Has a corresponding code reprsented by a Service.code string.
     */
    public String getName() {
        return name;
    }
    
    /**
     * JSON-formatted string that represents the friendly name for an AWS
     * service. Has a corresponding code reprsented by a Service.code string.
     *
     * @param name JSON-formatted string that represents the friendly name for an AWS
     *         service. Has a corresponding code reprsented by a Service.code string.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * JSON-formatted string that represents the friendly name for an AWS
     * service. Has a corresponding code reprsented by a Service.code string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name JSON-formatted string that represents the friendly name for an AWS
     *         service. Has a corresponding code reprsented by a Service.code string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Service withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * JSON-formatted list of categories that describe the type of support
     * issue a case describes. Categories are strings that represent a
     * category name and a category code. Category names and codes are passed
     * to AWS Support when you call <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a>.
     *
     * @return JSON-formatted list of categories that describe the type of support
     *         issue a case describes. Categories are strings that represent a
     *         category name and a category code. Category names and codes are passed
     *         to AWS Support when you call <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     *         title="CreateCase">CreateCase</a>.
     */
    public java.util.List<Category> getCategories() {
        if (categories == null) {
              categories = new com.amazonaws.internal.ListWithAutoConstructFlag<Category>();
              categories.setAutoConstruct(true);
        }
        return categories;
    }
    
    /**
     * JSON-formatted list of categories that describe the type of support
     * issue a case describes. Categories are strings that represent a
     * category name and a category code. Category names and codes are passed
     * to AWS Support when you call <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a>.
     *
     * @param categories JSON-formatted list of categories that describe the type of support
     *         issue a case describes. Categories are strings that represent a
     *         category name and a category code. Category names and codes are passed
     *         to AWS Support when you call <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     *         title="CreateCase">CreateCase</a>.
     */
    public void setCategories(java.util.Collection<Category> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Category> categoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Category>(categories.size());
        categoriesCopy.addAll(categories);
        this.categories = categoriesCopy;
    }
    
    /**
     * JSON-formatted list of categories that describe the type of support
     * issue a case describes. Categories are strings that represent a
     * category name and a category code. Category names and codes are passed
     * to AWS Support when you call <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param categories JSON-formatted list of categories that describe the type of support
     *         issue a case describes. Categories are strings that represent a
     *         category name and a category code. Category names and codes are passed
     *         to AWS Support when you call <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     *         title="CreateCase">CreateCase</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Service withCategories(Category... categories) {
        if (getCategories() == null) setCategories(new java.util.ArrayList<Category>(categories.length));
        for (Category value : categories) {
            getCategories().add(value);
        }
        return this;
    }
    
    /**
     * JSON-formatted list of categories that describe the type of support
     * issue a case describes. Categories are strings that represent a
     * category name and a category code. Category names and codes are passed
     * to AWS Support when you call <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     * title="CreateCase">CreateCase</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param categories JSON-formatted list of categories that describe the type of support
     *         issue a case describes. Categories are strings that represent a
     *         category name and a category code. Category names and codes are passed
     *         to AWS Support when you call <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"
     *         title="CreateCase">CreateCase</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Service withCategories(java.util.Collection<Category> categories) {
        if (categories == null) {
            this.categories = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Category> categoriesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Category>(categories.size());
            categoriesCopy.addAll(categories);
            this.categories = categoriesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getCategories() != null) sb.append("Categories: " + getCategories() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Service == false) return false;
        Service other = (Service)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getCategories() == null ^ this.getCategories() == null) return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false) return false; 
        return true;
    }
    
}
    