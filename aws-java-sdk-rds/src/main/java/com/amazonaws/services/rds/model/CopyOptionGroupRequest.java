/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#copyOptionGroup(CopyOptionGroupRequest) CopyOptionGroup operation}.
 * <p>
 * Copies the specified option group.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#copyOptionGroup(CopyOptionGroupRequest)
 */
public class CopyOptionGroupRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier or ARN for the source option group. For information
     * about creating an ARN, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>. <p>Constraints:
     * <ul> <li>Must specify a valid option group.</li> <li>If the source
     * option group is in the same region as the copy, specify a valid option
     * group identifier, for example <code>my-option-group</code>, or a valid
     * ARN.</li> <li>If the source option group is in a different region than
     * the copy, specify a valid option group ARN, for example
     * <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.</li>
     * </ul>
     */
    private String sourceOptionGroupIdentifier;

    /**
     * The identifier for the copied option group. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example:
     * <code>my-option-group</code>
     */
    private String targetOptionGroupIdentifier;

    /**
     * The description for the copied option group.
     */
    private String targetOptionGroupDescription;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The identifier or ARN for the source option group. For information
     * about creating an ARN, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>. <p>Constraints:
     * <ul> <li>Must specify a valid option group.</li> <li>If the source
     * option group is in the same region as the copy, specify a valid option
     * group identifier, for example <code>my-option-group</code>, or a valid
     * ARN.</li> <li>If the source option group is in a different region than
     * the copy, specify a valid option group ARN, for example
     * <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.</li>
     * </ul>
     *
     * @return The identifier or ARN for the source option group. For information
     *         about creating an ARN, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>. <p>Constraints:
     *         <ul> <li>Must specify a valid option group.</li> <li>If the source
     *         option group is in the same region as the copy, specify a valid option
     *         group identifier, for example <code>my-option-group</code>, or a valid
     *         ARN.</li> <li>If the source option group is in a different region than
     *         the copy, specify a valid option group ARN, for example
     *         <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.</li>
     *         </ul>
     */
    public String getSourceOptionGroupIdentifier() {
        return sourceOptionGroupIdentifier;
    }
    
    /**
     * The identifier or ARN for the source option group. For information
     * about creating an ARN, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>. <p>Constraints:
     * <ul> <li>Must specify a valid option group.</li> <li>If the source
     * option group is in the same region as the copy, specify a valid option
     * group identifier, for example <code>my-option-group</code>, or a valid
     * ARN.</li> <li>If the source option group is in a different region than
     * the copy, specify a valid option group ARN, for example
     * <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.</li>
     * </ul>
     *
     * @param sourceOptionGroupIdentifier The identifier or ARN for the source option group. For information
     *         about creating an ARN, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>. <p>Constraints:
     *         <ul> <li>Must specify a valid option group.</li> <li>If the source
     *         option group is in the same region as the copy, specify a valid option
     *         group identifier, for example <code>my-option-group</code>, or a valid
     *         ARN.</li> <li>If the source option group is in a different region than
     *         the copy, specify a valid option group ARN, for example
     *         <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.</li>
     *         </ul>
     */
    public void setSourceOptionGroupIdentifier(String sourceOptionGroupIdentifier) {
        this.sourceOptionGroupIdentifier = sourceOptionGroupIdentifier;
    }
    
    /**
     * The identifier or ARN for the source option group. For information
     * about creating an ARN, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>. <p>Constraints:
     * <ul> <li>Must specify a valid option group.</li> <li>If the source
     * option group is in the same region as the copy, specify a valid option
     * group identifier, for example <code>my-option-group</code>, or a valid
     * ARN.</li> <li>If the source option group is in a different region than
     * the copy, specify a valid option group ARN, for example
     * <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceOptionGroupIdentifier The identifier or ARN for the source option group. For information
     *         about creating an ARN, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>. <p>Constraints:
     *         <ul> <li>Must specify a valid option group.</li> <li>If the source
     *         option group is in the same region as the copy, specify a valid option
     *         group identifier, for example <code>my-option-group</code>, or a valid
     *         ARN.</li> <li>If the source option group is in a different region than
     *         the copy, specify a valid option group ARN, for example
     *         <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyOptionGroupRequest withSourceOptionGroupIdentifier(String sourceOptionGroupIdentifier) {
        this.sourceOptionGroupIdentifier = sourceOptionGroupIdentifier;
        return this;
    }

    /**
     * The identifier for the copied option group. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example:
     * <code>my-option-group</code>
     *
     * @return The identifier for the copied option group. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-option-group</code>
     */
    public String getTargetOptionGroupIdentifier() {
        return targetOptionGroupIdentifier;
    }
    
    /**
     * The identifier for the copied option group. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example:
     * <code>my-option-group</code>
     *
     * @param targetOptionGroupIdentifier The identifier for the copied option group. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-option-group</code>
     */
    public void setTargetOptionGroupIdentifier(String targetOptionGroupIdentifier) {
        this.targetOptionGroupIdentifier = targetOptionGroupIdentifier;
    }
    
    /**
     * The identifier for the copied option group. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example:
     * <code>my-option-group</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetOptionGroupIdentifier The identifier for the copied option group. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-option-group</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyOptionGroupRequest withTargetOptionGroupIdentifier(String targetOptionGroupIdentifier) {
        this.targetOptionGroupIdentifier = targetOptionGroupIdentifier;
        return this;
    }

    /**
     * The description for the copied option group.
     *
     * @return The description for the copied option group.
     */
    public String getTargetOptionGroupDescription() {
        return targetOptionGroupDescription;
    }
    
    /**
     * The description for the copied option group.
     *
     * @param targetOptionGroupDescription The description for the copied option group.
     */
    public void setTargetOptionGroupDescription(String targetOptionGroupDescription) {
        this.targetOptionGroupDescription = targetOptionGroupDescription;
    }
    
    /**
     * The description for the copied option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetOptionGroupDescription The description for the copied option group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyOptionGroupRequest withTargetOptionGroupDescription(String targetOptionGroupDescription) {
        this.targetOptionGroupDescription = targetOptionGroupDescription;
        return this;
    }

    /**
     * A list of tags.
     *
     * @return A list of tags.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags.
     *
     * @param tags A list of tags.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyOptionGroupRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyOptionGroupRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
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
        if (getSourceOptionGroupIdentifier() != null) sb.append("SourceOptionGroupIdentifier: " + getSourceOptionGroupIdentifier() + ",");
        if (getTargetOptionGroupIdentifier() != null) sb.append("TargetOptionGroupIdentifier: " + getTargetOptionGroupIdentifier() + ",");
        if (getTargetOptionGroupDescription() != null) sb.append("TargetOptionGroupDescription: " + getTargetOptionGroupDescription() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceOptionGroupIdentifier() == null) ? 0 : getSourceOptionGroupIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTargetOptionGroupIdentifier() == null) ? 0 : getTargetOptionGroupIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTargetOptionGroupDescription() == null) ? 0 : getTargetOptionGroupDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CopyOptionGroupRequest == false) return false;
        CopyOptionGroupRequest other = (CopyOptionGroupRequest)obj;
        
        if (other.getSourceOptionGroupIdentifier() == null ^ this.getSourceOptionGroupIdentifier() == null) return false;
        if (other.getSourceOptionGroupIdentifier() != null && other.getSourceOptionGroupIdentifier().equals(this.getSourceOptionGroupIdentifier()) == false) return false; 
        if (other.getTargetOptionGroupIdentifier() == null ^ this.getTargetOptionGroupIdentifier() == null) return false;
        if (other.getTargetOptionGroupIdentifier() != null && other.getTargetOptionGroupIdentifier().equals(this.getTargetOptionGroupIdentifier()) == false) return false; 
        if (other.getTargetOptionGroupDescription() == null ^ this.getTargetOptionGroupDescription() == null) return false;
        if (other.getTargetOptionGroupDescription() != null && other.getTargetOptionGroupDescription().equals(this.getTargetOptionGroupDescription()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CopyOptionGroupRequest clone() {
        
            return (CopyOptionGroupRequest) super.clone();
    }

}
    