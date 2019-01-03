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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeAssessmentTemplates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssessmentTemplatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the assessment templates.
     * </p>
     */
    private java.util.List<AssessmentTemplate> assessmentTemplates;
    /**
     * <p>
     * Assessment template details that cannot be described. An error code is provided for each failed item.
     * </p>
     */
    private java.util.Map<String, FailedItemDetails> failedItems;

    /**
     * <p>
     * Information about the assessment templates.
     * </p>
     * 
     * @return Information about the assessment templates.
     */

    public java.util.List<AssessmentTemplate> getAssessmentTemplates() {
        return assessmentTemplates;
    }

    /**
     * <p>
     * Information about the assessment templates.
     * </p>
     * 
     * @param assessmentTemplates
     *        Information about the assessment templates.
     */

    public void setAssessmentTemplates(java.util.Collection<AssessmentTemplate> assessmentTemplates) {
        if (assessmentTemplates == null) {
            this.assessmentTemplates = null;
            return;
        }

        this.assessmentTemplates = new java.util.ArrayList<AssessmentTemplate>(assessmentTemplates);
    }

    /**
     * <p>
     * Information about the assessment templates.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentTemplates(java.util.Collection)} or {@link #withAssessmentTemplates(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param assessmentTemplates
     *        Information about the assessment templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentTemplatesResult withAssessmentTemplates(AssessmentTemplate... assessmentTemplates) {
        if (this.assessmentTemplates == null) {
            setAssessmentTemplates(new java.util.ArrayList<AssessmentTemplate>(assessmentTemplates.length));
        }
        for (AssessmentTemplate ele : assessmentTemplates) {
            this.assessmentTemplates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the assessment templates.
     * </p>
     * 
     * @param assessmentTemplates
     *        Information about the assessment templates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentTemplatesResult withAssessmentTemplates(java.util.Collection<AssessmentTemplate> assessmentTemplates) {
        setAssessmentTemplates(assessmentTemplates);
        return this;
    }

    /**
     * <p>
     * Assessment template details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @return Assessment template details that cannot be described. An error code is provided for each failed item.
     */

    public java.util.Map<String, FailedItemDetails> getFailedItems() {
        return failedItems;
    }

    /**
     * <p>
     * Assessment template details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @param failedItems
     *        Assessment template details that cannot be described. An error code is provided for each failed item.
     */

    public void setFailedItems(java.util.Map<String, FailedItemDetails> failedItems) {
        this.failedItems = failedItems;
    }

    /**
     * <p>
     * Assessment template details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @param failedItems
     *        Assessment template details that cannot be described. An error code is provided for each failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentTemplatesResult withFailedItems(java.util.Map<String, FailedItemDetails> failedItems) {
        setFailedItems(failedItems);
        return this;
    }

    public DescribeAssessmentTemplatesResult addFailedItemsEntry(String key, FailedItemDetails value) {
        if (null == this.failedItems) {
            this.failedItems = new java.util.HashMap<String, FailedItemDetails>();
        }
        if (this.failedItems.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.failedItems.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FailedItems.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentTemplatesResult clearFailedItemsEntries() {
        this.failedItems = null;
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
        if (getAssessmentTemplates() != null)
            sb.append("AssessmentTemplates: ").append(getAssessmentTemplates()).append(",");
        if (getFailedItems() != null)
            sb.append("FailedItems: ").append(getFailedItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssessmentTemplatesResult == false)
            return false;
        DescribeAssessmentTemplatesResult other = (DescribeAssessmentTemplatesResult) obj;
        if (other.getAssessmentTemplates() == null ^ this.getAssessmentTemplates() == null)
            return false;
        if (other.getAssessmentTemplates() != null && other.getAssessmentTemplates().equals(this.getAssessmentTemplates()) == false)
            return false;
        if (other.getFailedItems() == null ^ this.getFailedItems() == null)
            return false;
        if (other.getFailedItems() != null && other.getFailedItems().equals(this.getFailedItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentTemplates() == null) ? 0 : getAssessmentTemplates().hashCode());
        hashCode = prime * hashCode + ((getFailedItems() == null) ? 0 : getFailedItems().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssessmentTemplatesResult clone() {
        try {
            return (DescribeAssessmentTemplatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
