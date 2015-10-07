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
 * Identifies an AWS Config rule that evaluated an AWS resource, and
 * provides the type and ID of the resource that the rule evaluated.
 * </p>
 */
public class EvaluationResultQualifier implements Serializable, Cloneable {

    /**
     * The name of the AWS Config rule that was used in the evaluation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String configRuleName;

    /**
     * The type of AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceType;

    /**
     * The ID of the evaluated AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceId;

    /**
     * The name of the AWS Config rule that was used in the evaluation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The name of the AWS Config rule that was used in the evaluation.
     */
    public String getConfigRuleName() {
        return configRuleName;
    }
    
    /**
     * The name of the AWS Config rule that was used in the evaluation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configRuleName The name of the AWS Config rule that was used in the evaluation.
     */
    public void setConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
    }
    
    /**
     * The name of the AWS Config rule that was used in the evaluation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param configRuleName The name of the AWS Config rule that was used in the evaluation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResultQualifier withConfigRuleName(String configRuleName) {
        this.configRuleName = configRuleName;
        return this;
    }

    /**
     * The type of AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The type of AWS resource that was evaluated.
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The type of AWS resource that was evaluated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType The type of AWS resource that was evaluated.
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The type of AWS resource that was evaluated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceType The type of AWS resource that was evaluated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResultQualifier withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The ID of the evaluated AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The ID of the evaluated AWS resource.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The ID of the evaluated AWS resource.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceId The ID of the evaluated AWS resource.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The ID of the evaluated AWS resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceId The ID of the evaluated AWS resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EvaluationResultQualifier withResourceId(String resourceId) {
        this.resourceId = resourceId;
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
        if (getConfigRuleName() != null) sb.append("ConfigRuleName: " + getConfigRuleName() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConfigRuleName() == null) ? 0 : getConfigRuleName().hashCode()); 
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EvaluationResultQualifier == false) return false;
        EvaluationResultQualifier other = (EvaluationResultQualifier)obj;
        
        if (other.getConfigRuleName() == null ^ this.getConfigRuleName() == null) return false;
        if (other.getConfigRuleName() != null && other.getConfigRuleName().equals(this.getConfigRuleName()) == false) return false; 
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        return true;
    }
    
    @Override
    public EvaluationResultQualifier clone() {
        try {
            return (EvaluationResultQualifier) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    