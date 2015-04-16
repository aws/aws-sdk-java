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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful ListPolicyVersions request.
 * </p>
 */
public class ListPolicyVersionsResult implements Serializable, Cloneable {

    /**
     * A list of policy versions. <p>For more information about managed
     * policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion> versions;

    /**
     * A flag that indicates whether there are more policy versions to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policy versions in the list.
     */
    private Boolean isTruncated;

    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     */
    private String marker;

    /**
     * A list of policy versions. <p>For more information about managed
     * policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     *
     * @return A list of policy versions. <p>For more information about managed
     *         policy versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     */
    public java.util.List<PolicyVersion> getVersions() {
        if (versions == null) {
              versions = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion>();
              versions.setAutoConstruct(true);
        }
        return versions;
    }
    
    /**
     * A list of policy versions. <p>For more information about managed
     * policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     *
     * @param versions A list of policy versions. <p>For more information about managed
     *         policy versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     */
    public void setVersions(java.util.Collection<PolicyVersion> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion> versionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion>(versions.size());
        versionsCopy.addAll(versions);
        this.versions = versionsCopy;
    }
    
    /**
     * A list of policy versions. <p>For more information about managed
     * policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVersions(java.util.Collection)} or {@link
     * #withVersions(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions A list of policy versions. <p>For more information about managed
     *         policy versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPolicyVersionsResult withVersions(PolicyVersion... versions) {
        if (getVersions() == null) setVersions(new java.util.ArrayList<PolicyVersion>(versions.length));
        for (PolicyVersion value : versions) {
            getVersions().add(value);
        }
        return this;
    }
    
    /**
     * A list of policy versions. <p>For more information about managed
     * policy versions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     * for Managed Policies</a> in the <i>Using IAM</i> guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions A list of policy versions. <p>For more information about managed
     *         policy versions, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html">Versioning
     *         for Managed Policies</a> in the <i>Using IAM</i> guide.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPolicyVersionsResult withVersions(java.util.Collection<PolicyVersion> versions) {
        if (versions == null) {
            this.versions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion> versionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PolicyVersion>(versions.size());
            versionsCopy.addAll(versions);
            this.versions = versionsCopy;
        }

        return this;
    }

    /**
     * A flag that indicates whether there are more policy versions to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policy versions in the list.
     *
     * @return A flag that indicates whether there are more policy versions to list.
     *         If your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policy versions in the list.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more policy versions to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policy versions in the list.
     *
     * @param isTruncated A flag that indicates whether there are more policy versions to list.
     *         If your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policy versions in the list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more policy versions to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policy versions in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more policy versions to list.
     *         If your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policy versions in the list.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPolicyVersionsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more policy versions to list.
     * If your results were truncated, you can make a subsequent pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policy versions in the list.
     *
     * @return A flag that indicates whether there are more policy versions to list.
     *         If your results were truncated, you can make a subsequent pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policy versions in the list.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @return If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPolicyVersionsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getVersions() != null) sb.append("Versions: " + getVersions() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPolicyVersionsResult == false) return false;
        ListPolicyVersionsResult other = (ListPolicyVersionsResult)obj;
        
        if (other.getVersions() == null ^ this.getVersions() == null) return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public ListPolicyVersionsResult clone() {
        try {
            return (ListPolicyVersionsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    