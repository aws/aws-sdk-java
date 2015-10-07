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
 * Provides the AWS Config rule owner (AWS or customer), the rule
 * identifier, and the events that trigger the evaluation of your AWS
 * resources.
 * </p>
 */
public class Source implements Serializable, Cloneable {

    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config
     * rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOM_LAMBDA, AWS
     */
    private String owner;

    /**
     * For AWS managed Config rules, a pre-defined identifier from a list. To
     * reference the list, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using
     * AWS Managed Config Rules</a>. <p>For customer managed Config rules,
     * the identifier is the Amazon Resource Name (ARN) of the rule's AWS
     * Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String sourceIdentifier;

    /**
     * Provides the source and type of the event that causes AWS Config to
     * evaluate your AWS resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SourceDetail> sourceDetails;

    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config
     * rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOM_LAMBDA, AWS
     *
     * @return Indicates whether AWS or the customer owns and manages the AWS Config
     *         rule.
     *
     * @see Owner
     */
    public String getOwner() {
        return owner;
    }
    
    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config
     * rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOM_LAMBDA, AWS
     *
     * @param owner Indicates whether AWS or the customer owns and manages the AWS Config
     *         rule.
     *
     * @see Owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config
     * rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOM_LAMBDA, AWS
     *
     * @param owner Indicates whether AWS or the customer owns and manages the AWS Config
     *         rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Owner
     */
    public Source withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config
     * rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOM_LAMBDA, AWS
     *
     * @param owner Indicates whether AWS or the customer owns and manages the AWS Config
     *         rule.
     *
     * @see Owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner.toString();
    }
    
    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config
     * rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CUSTOM_LAMBDA, AWS
     *
     * @param owner Indicates whether AWS or the customer owns and manages the AWS Config
     *         rule.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Owner
     */
    public Source withOwner(Owner owner) {
        this.owner = owner.toString();
        return this;
    }

    /**
     * For AWS managed Config rules, a pre-defined identifier from a list. To
     * reference the list, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using
     * AWS Managed Config Rules</a>. <p>For customer managed Config rules,
     * the identifier is the Amazon Resource Name (ARN) of the rule's AWS
     * Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return For AWS managed Config rules, a pre-defined identifier from a list. To
     *         reference the list, see <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using
     *         AWS Managed Config Rules</a>. <p>For customer managed Config rules,
     *         the identifier is the Amazon Resource Name (ARN) of the rule's AWS
     *         Lambda function.
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }
    
    /**
     * For AWS managed Config rules, a pre-defined identifier from a list. To
     * reference the list, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using
     * AWS Managed Config Rules</a>. <p>For customer managed Config rules,
     * the identifier is the Amazon Resource Name (ARN) of the rule's AWS
     * Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param sourceIdentifier For AWS managed Config rules, a pre-defined identifier from a list. To
     *         reference the list, see <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using
     *         AWS Managed Config Rules</a>. <p>For customer managed Config rules,
     *         the identifier is the Amazon Resource Name (ARN) of the rule's AWS
     *         Lambda function.
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }
    
    /**
     * For AWS managed Config rules, a pre-defined identifier from a list. To
     * reference the list, see <a
     * href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using
     * AWS Managed Config Rules</a>. <p>For customer managed Config rules,
     * the identifier is the Amazon Resource Name (ARN) of the rule's AWS
     * Lambda function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param sourceIdentifier For AWS managed Config rules, a pre-defined identifier from a list. To
     *         reference the list, see <a
     *         href="http://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html">Using
     *         AWS Managed Config Rules</a>. <p>For customer managed Config rules,
     *         the identifier is the Amazon Resource Name (ARN) of the rule's AWS
     *         Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Source withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * Provides the source and type of the event that causes AWS Config to
     * evaluate your AWS resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @return Provides the source and type of the event that causes AWS Config to
     *         evaluate your AWS resources.
     */
    public java.util.List<SourceDetail> getSourceDetails() {
        if (sourceDetails == null) {
              sourceDetails = new com.amazonaws.internal.ListWithAutoConstructFlag<SourceDetail>();
              sourceDetails.setAutoConstruct(true);
        }
        return sourceDetails;
    }
    
    /**
     * Provides the source and type of the event that causes AWS Config to
     * evaluate your AWS resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @param sourceDetails Provides the source and type of the event that causes AWS Config to
     *         evaluate your AWS resources.
     */
    public void setSourceDetails(java.util.Collection<SourceDetail> sourceDetails) {
        if (sourceDetails == null) {
            this.sourceDetails = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SourceDetail> sourceDetailsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SourceDetail>(sourceDetails.size());
        sourceDetailsCopy.addAll(sourceDetails);
        this.sourceDetails = sourceDetailsCopy;
    }
    
    /**
     * Provides the source and type of the event that causes AWS Config to
     * evaluate your AWS resources.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSourceDetails(java.util.Collection)} or {@link
     * #withSourceDetails(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @param sourceDetails Provides the source and type of the event that causes AWS Config to
     *         evaluate your AWS resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Source withSourceDetails(SourceDetail... sourceDetails) {
        if (getSourceDetails() == null) setSourceDetails(new java.util.ArrayList<SourceDetail>(sourceDetails.length));
        for (SourceDetail value : sourceDetails) {
            getSourceDetails().add(value);
        }
        return this;
    }
    
    /**
     * Provides the source and type of the event that causes AWS Config to
     * evaluate your AWS resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 25<br/>
     *
     * @param sourceDetails Provides the source and type of the event that causes AWS Config to
     *         evaluate your AWS resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Source withSourceDetails(java.util.Collection<SourceDetail> sourceDetails) {
        if (sourceDetails == null) {
            this.sourceDetails = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SourceDetail> sourceDetailsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SourceDetail>(sourceDetails.size());
            sourceDetailsCopy.addAll(sourceDetails);
            this.sourceDetails = sourceDetailsCopy;
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
        if (getOwner() != null) sb.append("Owner: " + getOwner() + ",");
        if (getSourceIdentifier() != null) sb.append("SourceIdentifier: " + getSourceIdentifier() + ",");
        if (getSourceDetails() != null) sb.append("SourceDetails: " + getSourceDetails() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode()); 
        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSourceDetails() == null) ? 0 : getSourceDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Source == false) return false;
        Source other = (Source)obj;
        
        if (other.getOwner() == null ^ this.getOwner() == null) return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false) return false; 
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null) return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false) return false; 
        if (other.getSourceDetails() == null ^ this.getSourceDetails() == null) return false;
        if (other.getSourceDetails() != null && other.getSourceDetails().equals(this.getSourceDetails()) == false) return false; 
        return true;
    }
    
    @Override
    public Source clone() {
        try {
            return (Source) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    