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

/**
 * <p>
 * Indicates whether an AWS resource that is evaluated according to one
 * or more AWS Config rules is compliant. A resource is compliant if it
 * complies with all of the rules that evaluate it, and it is
 * noncompliant if it does not comply with one or more of these rules.
 * </p>
 */
public class ComplianceByResource implements Serializable, Cloneable {

    /**
     * The type of the AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceType;

    /**
     * The ID of the AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceId;

    /**
     * Indicates whether the AWS resource complies with all of the AWS Config
     * rules that evaluated it.
     */
    private Compliance compliance;

    /**
     * The type of the AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The type of the AWS resource that was evaluated.
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of the AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType The type of the AWS resource that was evaluated.
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of the AWS resource that was evaluated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType The type of the AWS resource that was evaluated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ComplianceByResource withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The ID of the AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The ID of the AWS resource that was evaluated.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceId The ID of the AWS resource that was evaluated.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the AWS resource that was evaluated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceId The ID of the AWS resource that was evaluated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ComplianceByResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Indicates whether the AWS resource complies with all of the AWS Config
     * rules that evaluated it.
     *
     * @return Indicates whether the AWS resource complies with all of the AWS Config
     *         rules that evaluated it.
     */
    public Compliance getCompliance() {
        return compliance;
    }
    
    /**
     * Indicates whether the AWS resource complies with all of the AWS Config
     * rules that evaluated it.
     *
     * @param compliance Indicates whether the AWS resource complies with all of the AWS Config
     *         rules that evaluated it.
     */
    public void setCompliance(Compliance compliance) {
        this.compliance = compliance;
    }
    
    /**
     * Indicates whether the AWS resource complies with all of the AWS Config
     * rules that evaluated it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param compliance Indicates whether the AWS resource complies with all of the AWS Config
     *         rules that evaluated it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ComplianceByResource withCompliance(Compliance compliance) {
        this.compliance = compliance;
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
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getCompliance() != null) sb.append("Compliance: " + getCompliance() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getCompliance() == null) ? 0 : getCompliance().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ComplianceByResource == false) return false;
        ComplianceByResource other = (ComplianceByResource)obj;
        
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getCompliance() == null ^ this.getCompliance() == null) return false;
        if (other.getCompliance() != null && other.getCompliance().equals(this.getCompliance()) == false) return false; 
        return true;
    }
    
    @Override
    public ComplianceByResource clone() {
        try {
            return (ComplianceByResource) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    