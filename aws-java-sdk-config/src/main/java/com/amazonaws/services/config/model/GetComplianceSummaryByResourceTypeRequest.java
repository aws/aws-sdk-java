/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.config.AmazonConfig#getComplianceSummaryByResourceType(GetComplianceSummaryByResourceTypeRequest) GetComplianceSummaryByResourceType operation}.
 * <p>
 * Returns the number of resources that are compliant and the number that
 * are noncompliant. You can specify one or more resource types to get
 * these numbers for each resource type. The maximum number returned is
 * 100.
 * </p>
 *
 * @see com.amazonaws.services.config.AmazonConfig#getComplianceSummaryByResourceType(GetComplianceSummaryByResourceTypeRequest)
 */
public class GetComplianceSummaryByResourceTypeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Specify one or more resource types to get the number of resources that
     * are compliant and the number that are noncompliant for each resource
     * type. <p>For this request, you can specify an AWS resource type such
     * as <code>AWS::EC2::Instance</code>, and you can specify that the
     * resource type is an AWS account by specifying
     * <code>AWS::::Account</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceTypes;

    /**
     * Specify one or more resource types to get the number of resources that
     * are compliant and the number that are noncompliant for each resource
     * type. <p>For this request, you can specify an AWS resource type such
     * as <code>AWS::EC2::Instance</code>, and you can specify that the
     * resource type is an AWS account by specifying
     * <code>AWS::::Account</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return Specify one or more resource types to get the number of resources that
     *         are compliant and the number that are noncompliant for each resource
     *         type. <p>For this request, you can specify an AWS resource type such
     *         as <code>AWS::EC2::Instance</code>, and you can specify that the
     *         resource type is an AWS account by specifying
     *         <code>AWS::::Account</code>.
     */
    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
              resourceTypes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              resourceTypes.setAutoConstruct(true);
        }
        return resourceTypes;
    }
    
    /**
     * Specify one or more resource types to get the number of resources that
     * are compliant and the number that are noncompliant for each resource
     * type. <p>For this request, you can specify an AWS resource type such
     * as <code>AWS::EC2::Instance</code>, and you can specify that the
     * resource type is an AWS account by specifying
     * <code>AWS::::Account</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param resourceTypes Specify one or more resource types to get the number of resources that
     *         are compliant and the number that are noncompliant for each resource
     *         type. <p>For this request, you can specify an AWS resource type such
     *         as <code>AWS::EC2::Instance</code>, and you can specify that the
     *         resource type is an AWS account by specifying
     *         <code>AWS::::Account</code>.
     */
    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceTypes.size());
        resourceTypesCopy.addAll(resourceTypes);
        this.resourceTypes = resourceTypesCopy;
    }
    
    /**
     * Specify one or more resource types to get the number of resources that
     * are compliant and the number that are noncompliant for each resource
     * type. <p>For this request, you can specify an AWS resource type such
     * as <code>AWS::EC2::Instance</code>, and you can specify that the
     * resource type is an AWS account by specifying
     * <code>AWS::::Account</code>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceTypes(java.util.Collection)} or {@link
     * #withResourceTypes(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param resourceTypes Specify one or more resource types to get the number of resources that
     *         are compliant and the number that are noncompliant for each resource
     *         type. <p>For this request, you can specify an AWS resource type such
     *         as <code>AWS::EC2::Instance</code>, and you can specify that the
     *         resource type is an AWS account by specifying
     *         <code>AWS::::Account</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetComplianceSummaryByResourceTypeRequest withResourceTypes(String... resourceTypes) {
        if (getResourceTypes() == null) setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        for (String value : resourceTypes) {
            getResourceTypes().add(value);
        }
        return this;
    }
    
    /**
     * Specify one or more resource types to get the number of resources that
     * are compliant and the number that are noncompliant for each resource
     * type. <p>For this request, you can specify an AWS resource type such
     * as <code>AWS::EC2::Instance</code>, and you can specify that the
     * resource type is an AWS account by specifying
     * <code>AWS::::Account</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param resourceTypes Specify one or more resource types to get the number of resources that
     *         are compliant and the number that are noncompliant for each resource
     *         type. <p>For this request, you can specify an AWS resource type such
     *         as <code>AWS::EC2::Instance</code>, and you can specify that the
     *         resource type is an AWS account by specifying
     *         <code>AWS::::Account</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetComplianceSummaryByResourceTypeRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> resourceTypesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(resourceTypes.size());
            resourceTypesCopy.addAll(resourceTypes);
            this.resourceTypes = resourceTypesCopy;
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
        if (getResourceTypes() != null) sb.append("ResourceTypes: " + getResourceTypes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetComplianceSummaryByResourceTypeRequest == false) return false;
        GetComplianceSummaryByResourceTypeRequest other = (GetComplianceSummaryByResourceTypeRequest)obj;
        
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null) return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false) return false; 
        return true;
    }
    
    @Override
    public GetComplianceSummaryByResourceTypeRequest clone() {
        
            return (GetComplianceSummaryByResourceTypeRequest) super.clone();
    }

}
    