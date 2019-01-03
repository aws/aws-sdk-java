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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceSummaryByResourceType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComplianceSummaryByResourceTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify one or more resource types to get the number of resources that are compliant and the number that are
     * noncompliant for each resource type.
     * </p>
     * <p>
     * For this request, you can specify an AWS resource type such as <code>AWS::EC2::Instance</code>. You can specify
     * that the resource type is an AWS account by specifying <code>AWS::::Account</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;

    /**
     * <p>
     * Specify one or more resource types to get the number of resources that are compliant and the number that are
     * noncompliant for each resource type.
     * </p>
     * <p>
     * For this request, you can specify an AWS resource type such as <code>AWS::EC2::Instance</code>. You can specify
     * that the resource type is an AWS account by specifying <code>AWS::::Account</code>.
     * </p>
     * 
     * @return Specify one or more resource types to get the number of resources that are compliant and the number that
     *         are noncompliant for each resource type.</p>
     *         <p>
     *         For this request, you can specify an AWS resource type such as <code>AWS::EC2::Instance</code>. You can
     *         specify that the resource type is an AWS account by specifying <code>AWS::::Account</code>.
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * Specify one or more resource types to get the number of resources that are compliant and the number that are
     * noncompliant for each resource type.
     * </p>
     * <p>
     * For this request, you can specify an AWS resource type such as <code>AWS::EC2::Instance</code>. You can specify
     * that the resource type is an AWS account by specifying <code>AWS::::Account</code>.
     * </p>
     * 
     * @param resourceTypes
     *        Specify one or more resource types to get the number of resources that are compliant and the number that
     *        are noncompliant for each resource type.</p>
     *        <p>
     *        For this request, you can specify an AWS resource type such as <code>AWS::EC2::Instance</code>. You can
     *        specify that the resource type is an AWS account by specifying <code>AWS::::Account</code>.
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * Specify one or more resource types to get the number of resources that are compliant and the number that are
     * noncompliant for each resource type.
     * </p>
     * <p>
     * For this request, you can specify an AWS resource type such as <code>AWS::EC2::Instance</code>. You can specify
     * that the resource type is an AWS account by specifying <code>AWS::::Account</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        Specify one or more resource types to get the number of resources that are compliant and the number that
     *        are noncompliant for each resource type.</p>
     *        <p>
     *        For this request, you can specify an AWS resource type such as <code>AWS::EC2::Instance</code>. You can
     *        specify that the resource type is an AWS account by specifying <code>AWS::::Account</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryByResourceTypeRequest withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify one or more resource types to get the number of resources that are compliant and the number that are
     * noncompliant for each resource type.
     * </p>
     * <p>
     * For this request, you can specify an AWS resource type such as <code>AWS::EC2::Instance</code>. You can specify
     * that the resource type is an AWS account by specifying <code>AWS::::Account</code>.
     * </p>
     * 
     * @param resourceTypes
     *        Specify one or more resource types to get the number of resources that are compliant and the number that
     *        are noncompliant for each resource type.</p>
     *        <p>
     *        For this request, you can specify an AWS resource type such as <code>AWS::EC2::Instance</code>. You can
     *        specify that the resource type is an AWS account by specifying <code>AWS::::Account</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceSummaryByResourceTypeRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
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
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceSummaryByResourceTypeRequest == false)
            return false;
        GetComplianceSummaryByResourceTypeRequest other = (GetComplianceSummaryByResourceTypeRequest) obj;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        return hashCode;
    }

    @Override
    public GetComplianceSummaryByResourceTypeRequest clone() {
        return (GetComplianceSummaryByResourceTypeRequest) super.clone();
    }

}
