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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/GetComplianceDetailsByResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComplianceDetailsByResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the AWS resource for which you want compliance information.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the AWS resource for which you want compliance information.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> complianceTypes;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The type of the AWS resource for which you want compliance information.
     * </p>
     * 
     * @param resourceType
     *        The type of the AWS resource for which you want compliance information.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the AWS resource for which you want compliance information.
     * </p>
     * 
     * @return The type of the AWS resource for which you want compliance information.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the AWS resource for which you want compliance information.
     * </p>
     * 
     * @param resourceType
     *        The type of the AWS resource for which you want compliance information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailsByResourceRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS resource for which you want compliance information.
     * </p>
     * 
     * @param resourceId
     *        The ID of the AWS resource for which you want compliance information.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the AWS resource for which you want compliance information.
     * </p>
     * 
     * @return The ID of the AWS resource for which you want compliance information.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the AWS resource for which you want compliance information.
     * </p>
     * 
     * @param resourceId
     *        The ID of the AWS resource for which you want compliance information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailsByResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     * 
     * @return Filters the results by compliance.</p>
     *         <p>
     *         The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and
     *         <code>NOT_APPLICABLE</code>.
     * @see ComplianceType
     */

    public java.util.List<String> getComplianceTypes() {
        if (complianceTypes == null) {
            complianceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return complianceTypes;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * @see ComplianceType
     */

    public void setComplianceTypes(java.util.Collection<String> complianceTypes) {
        if (complianceTypes == null) {
            this.complianceTypes = null;
            return;
        }

        this.complianceTypes = new com.amazonaws.internal.SdkInternalList<String>(complianceTypes);
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComplianceTypes(java.util.Collection)} or {@link #withComplianceTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public GetComplianceDetailsByResourceRequest withComplianceTypes(String... complianceTypes) {
        if (this.complianceTypes == null) {
            setComplianceTypes(new com.amazonaws.internal.SdkInternalList<String>(complianceTypes.length));
        }
        for (String ele : complianceTypes) {
            this.complianceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public GetComplianceDetailsByResourceRequest withComplianceTypes(java.util.Collection<String> complianceTypes) {
        setComplianceTypes(complianceTypes);
        return this;
    }

    /**
     * <p>
     * Filters the results by compliance.
     * </p>
     * <p>
     * The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * </p>
     * 
     * @param complianceTypes
     *        Filters the results by compliance.</p>
     *        <p>
     *        The allowed values are <code>COMPLIANT</code>, <code>NON_COMPLIANT</code>, and <code>NOT_APPLICABLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceType
     */

    public GetComplianceDetailsByResourceRequest withComplianceTypes(ComplianceType... complianceTypes) {
        com.amazonaws.internal.SdkInternalList<String> complianceTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(complianceTypes.length);
        for (ComplianceType value : complianceTypes) {
            complianceTypesCopy.add(value.toString());
        }
        if (getComplianceTypes() == null) {
            setComplianceTypes(complianceTypesCopy);
        } else {
            getComplianceTypes().addAll(complianceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page that you use to get the next page of
     *         results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you use to get the next page of results in a
     * paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that you use to get the next page of results
     *        in a paginated response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComplianceDetailsByResourceRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getComplianceTypes() != null)
            sb.append("ComplianceTypes: ").append(getComplianceTypes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceDetailsByResourceRequest == false)
            return false;
        GetComplianceDetailsByResourceRequest other = (GetComplianceDetailsByResourceRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getComplianceTypes() == null ^ this.getComplianceTypes() == null)
            return false;
        if (other.getComplianceTypes() != null && other.getComplianceTypes().equals(this.getComplianceTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getComplianceTypes() == null) ? 0 : getComplianceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetComplianceDetailsByResourceRequest clone() {
        return (GetComplianceDetailsByResourceRequest) super.clone();
    }

}
