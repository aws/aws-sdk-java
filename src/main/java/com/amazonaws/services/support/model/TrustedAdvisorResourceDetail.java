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
 * Structure that contains information about the resource to which the Trusted Advisor check pertains.
 * </p>
 */
public class TrustedAdvisorResourceDetail implements Serializable {

    /**
     * Status code for the resource identified in the Trusted Advisor check.
     */
    private String status;

    /**
     * AWS region in which the identified resource is located.
     */
    private String region;

    /**
     * Unique identifier for the identified resource.
     */
    private String resourceId;

    /**
     * Indicates whether the specified AWS resource has had its participation
     * in Trusted Advisor checks suppressed.
     */
    private Boolean isSuppressed;

    /**
     * Additional information about the identified resource. The exact
     * metadata and its order can be obtained by inspecting the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html"
     * title="TrustedAdvisorCheckDescription">TrustedAdvisorCheckDescription</a>
     * object returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     * title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> metadata;

    /**
     * Status code for the resource identified in the Trusted Advisor check.
     *
     * @return Status code for the resource identified in the Trusted Advisor check.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Status code for the resource identified in the Trusted Advisor check.
     *
     * @param status Status code for the resource identified in the Trusted Advisor check.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Status code for the resource identified in the Trusted Advisor check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Status code for the resource identified in the Trusted Advisor check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourceDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * AWS region in which the identified resource is located.
     *
     * @return AWS region in which the identified resource is located.
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * AWS region in which the identified resource is located.
     *
     * @param region AWS region in which the identified resource is located.
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * AWS region in which the identified resource is located.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region AWS region in which the identified resource is located.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourceDetail withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Unique identifier for the identified resource.
     *
     * @return Unique identifier for the identified resource.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * Unique identifier for the identified resource.
     *
     * @param resourceId Unique identifier for the identified resource.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * Unique identifier for the identified resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId Unique identifier for the identified resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourceDetail withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Indicates whether the specified AWS resource has had its participation
     * in Trusted Advisor checks suppressed.
     *
     * @return Indicates whether the specified AWS resource has had its participation
     *         in Trusted Advisor checks suppressed.
     */
    public Boolean isSuppressed() {
        return isSuppressed;
    }
    
    /**
     * Indicates whether the specified AWS resource has had its participation
     * in Trusted Advisor checks suppressed.
     *
     * @param isSuppressed Indicates whether the specified AWS resource has had its participation
     *         in Trusted Advisor checks suppressed.
     */
    public void setIsSuppressed(Boolean isSuppressed) {
        this.isSuppressed = isSuppressed;
    }
    
    /**
     * Indicates whether the specified AWS resource has had its participation
     * in Trusted Advisor checks suppressed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isSuppressed Indicates whether the specified AWS resource has had its participation
     *         in Trusted Advisor checks suppressed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourceDetail withIsSuppressed(Boolean isSuppressed) {
        this.isSuppressed = isSuppressed;
        return this;
    }

    /**
     * Indicates whether the specified AWS resource has had its participation
     * in Trusted Advisor checks suppressed.
     *
     * @return Indicates whether the specified AWS resource has had its participation
     *         in Trusted Advisor checks suppressed.
     */
    public Boolean getIsSuppressed() {
        return isSuppressed;
    }

    /**
     * Additional information about the identified resource. The exact
     * metadata and its order can be obtained by inspecting the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html"
     * title="TrustedAdvisorCheckDescription">TrustedAdvisorCheckDescription</a>
     * object returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     * title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     *
     * @return Additional information about the identified resource. The exact
     *         metadata and its order can be obtained by inspecting the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html"
     *         title="TrustedAdvisorCheckDescription">TrustedAdvisorCheckDescription</a>
     *         object returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     *         title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     */
    public java.util.List<String> getMetadata() {
        if (metadata == null) {
              metadata = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              metadata.setAutoConstruct(true);
        }
        return metadata;
    }
    
    /**
     * Additional information about the identified resource. The exact
     * metadata and its order can be obtained by inspecting the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html"
     * title="TrustedAdvisorCheckDescription">TrustedAdvisorCheckDescription</a>
     * object returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     * title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     *
     * @param metadata Additional information about the identified resource. The exact
     *         metadata and its order can be obtained by inspecting the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html"
     *         title="TrustedAdvisorCheckDescription">TrustedAdvisorCheckDescription</a>
     *         object returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     *         title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     */
    public void setMetadata(java.util.Collection<String> metadata) {
        if (metadata == null) {
            this.metadata = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> metadataCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(metadata.size());
        metadataCopy.addAll(metadata);
        this.metadata = metadataCopy;
    }
    
    /**
     * Additional information about the identified resource. The exact
     * metadata and its order can be obtained by inspecting the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html"
     * title="TrustedAdvisorCheckDescription">TrustedAdvisorCheckDescription</a>
     * object returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     * title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metadata Additional information about the identified resource. The exact
     *         metadata and its order can be obtained by inspecting the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html"
     *         title="TrustedAdvisorCheckDescription">TrustedAdvisorCheckDescription</a>
     *         object returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     *         title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourceDetail withMetadata(String... metadata) {
        if (getMetadata() == null) setMetadata(new java.util.ArrayList<String>(metadata.length));
        for (String value : metadata) {
            getMetadata().add(value);
        }
        return this;
    }
    
    /**
     * Additional information about the identified resource. The exact
     * metadata and its order can be obtained by inspecting the <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html"
     * title="TrustedAdvisorCheckDescription">TrustedAdvisorCheckDescription</a>
     * object returned by the call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     * title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metadata Additional information about the identified resource. The exact
     *         metadata and its order can be obtained by inspecting the <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_TrustedAdvisorCheckDescription.html"
     *         title="TrustedAdvisorCheckDescription">TrustedAdvisorCheckDescription</a>
     *         object returned by the call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_DescribeTrustedAdvisorChecks.html"
     *         title="DescribeTrustedAdvisorChecks">DescribeTrustedAdvisorChecks</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorResourceDetail withMetadata(java.util.Collection<String> metadata) {
        if (metadata == null) {
            this.metadata = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> metadataCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(metadata.size());
            metadataCopy.addAll(metadata);
            this.metadata = metadataCopy;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (isSuppressed() != null) sb.append("IsSuppressed: " + isSuppressed() + ",");
        if (getMetadata() != null) sb.append("Metadata: " + getMetadata() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((isSuppressed() == null) ? 0 : isSuppressed().hashCode()); 
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrustedAdvisorResourceDetail == false) return false;
        TrustedAdvisorResourceDetail other = (TrustedAdvisorResourceDetail)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.isSuppressed() == null ^ this.isSuppressed() == null) return false;
        if (other.isSuppressed() != null && other.isSuppressed().equals(this.isSuppressed()) == false) return false; 
        if (other.getMetadata() == null ^ this.getMetadata() == null) return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false) return false; 
        return true;
    }
    
}
    