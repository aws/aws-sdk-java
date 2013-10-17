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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#describeServices(DescribeServicesRequest) DescribeServices operation}.
 * <p>
 * Returns the current list of AWS services and a list of service categories that applies to each one. You then use service names and categories in your
 * <a href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_CreateCase.html"> CreateCase </a> requests. Each AWS service has its own set
 * of categories.
 * </p>
 * <p>
 * The service codes and category codes correspond to the values that are displayed in the <b>Service</b> and <b>Category</b> drop-down lists on the AWS
 * Support Center <a href="https://aws.amazon.com/support/createCase"> Open a new case </a> page. The values in those fields, however, do not
 * necessarily match the service codes and categories returned by the <code>DescribeServices</code> request. Always use the service codes and categories
 * obtained programmatically. This practice ensures that you always have the most recent set of service and category codes.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#describeServices(DescribeServicesRequest)
 */
public class DescribeServicesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * List in JSON format of service codes available for AWS services.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceCodeList;

    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     */
    private String language;

    /**
     * List in JSON format of service codes available for AWS services.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return List in JSON format of service codes available for AWS services.
     */
    public java.util.List<String> getServiceCodeList() {
        if (serviceCodeList == null) {
              serviceCodeList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              serviceCodeList.setAutoConstruct(true);
        }
        return serviceCodeList;
    }
    
    /**
     * List in JSON format of service codes available for AWS services.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param serviceCodeList List in JSON format of service codes available for AWS services.
     */
    public void setServiceCodeList(java.util.Collection<String> serviceCodeList) {
        if (serviceCodeList == null) {
            this.serviceCodeList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceCodeListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(serviceCodeList.size());
        serviceCodeListCopy.addAll(serviceCodeList);
        this.serviceCodeList = serviceCodeListCopy;
    }
    
    /**
     * List in JSON format of service codes available for AWS services.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param serviceCodeList List in JSON format of service codes available for AWS services.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServicesRequest withServiceCodeList(String... serviceCodeList) {
        if (getServiceCodeList() == null) setServiceCodeList(new java.util.ArrayList<String>(serviceCodeList.length));
        for (String value : serviceCodeList) {
            getServiceCodeList().add(value);
        }
        return this;
    }
    
    /**
     * List in JSON format of service codes available for AWS services.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param serviceCodeList List in JSON format of service codes available for AWS services.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServicesRequest withServiceCodeList(java.util.Collection<String> serviceCodeList) {
        if (serviceCodeList == null) {
            this.serviceCodeList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceCodeListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(serviceCodeList.size());
            serviceCodeListCopy.addAll(serviceCodeList);
            this.serviceCodeList = serviceCodeListCopy;
        }

        return this;
    }

    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     *
     * @return Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     */
    public String getLanguage() {
        return language;
    }
    
    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     *
     * @param language Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     */
    public void setLanguage(String language) {
        this.language = language;
    }
    
    /**
     * Specifies the ISO 639-1 code for the language in which AWS provides
     * support. AWS Support currently supports English and Japanese, for
     * which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     * parameters must be passed explicitly for operations that take them.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param language Specifies the ISO 639-1 code for the language in which AWS provides
     *         support. AWS Support currently supports English and Japanese, for
     *         which the codes are <i>en</i> and <i>ja</i>, respectively. Language
     *         parameters must be passed explicitly for operations that take them.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServicesRequest withLanguage(String language) {
        this.language = language;
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
        if (getServiceCodeList() != null) sb.append("ServiceCodeList: " + getServiceCodeList() + ",");
        if (getLanguage() != null) sb.append("Language: " + getLanguage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServiceCodeList() == null) ? 0 : getServiceCodeList().hashCode()); 
        hashCode = prime * hashCode + ((getLanguage() == null) ? 0 : getLanguage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeServicesRequest == false) return false;
        DescribeServicesRequest other = (DescribeServicesRequest)obj;
        
        if (other.getServiceCodeList() == null ^ this.getServiceCodeList() == null) return false;
        if (other.getServiceCodeList() != null && other.getServiceCodeList().equals(this.getServiceCodeList()) == false) return false; 
        if (other.getLanguage() == null ^ this.getLanguage() == null) return false;
        if (other.getLanguage() != null && other.getLanguage().equals(this.getLanguage()) == false) return false; 
        return true;
    }
    
}
    