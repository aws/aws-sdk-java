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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/DescribeAssessmentRuns" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssessmentRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the assessment run.
     * </p>
     */
    private java.util.List<AssessmentRun> assessmentRuns;
    /**
     * <p>
     * Assessment run details that cannot be described. An error code is provided for each failed item.
     * </p>
     */
    private java.util.Map<String, FailedItemDetails> failedItems;

    /**
     * <p>
     * Information about the assessment run.
     * </p>
     * 
     * @return Information about the assessment run.
     */

    public java.util.List<AssessmentRun> getAssessmentRuns() {
        return assessmentRuns;
    }

    /**
     * <p>
     * Information about the assessment run.
     * </p>
     * 
     * @param assessmentRuns
     *        Information about the assessment run.
     */

    public void setAssessmentRuns(java.util.Collection<AssessmentRun> assessmentRuns) {
        if (assessmentRuns == null) {
            this.assessmentRuns = null;
            return;
        }

        this.assessmentRuns = new java.util.ArrayList<AssessmentRun>(assessmentRuns);
    }

    /**
     * <p>
     * Information about the assessment run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentRuns(java.util.Collection)} or {@link #withAssessmentRuns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param assessmentRuns
     *        Information about the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentRunsResult withAssessmentRuns(AssessmentRun... assessmentRuns) {
        if (this.assessmentRuns == null) {
            setAssessmentRuns(new java.util.ArrayList<AssessmentRun>(assessmentRuns.length));
        }
        for (AssessmentRun ele : assessmentRuns) {
            this.assessmentRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the assessment run.
     * </p>
     * 
     * @param assessmentRuns
     *        Information about the assessment run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentRunsResult withAssessmentRuns(java.util.Collection<AssessmentRun> assessmentRuns) {
        setAssessmentRuns(assessmentRuns);
        return this;
    }

    /**
     * <p>
     * Assessment run details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @return Assessment run details that cannot be described. An error code is provided for each failed item.
     */

    public java.util.Map<String, FailedItemDetails> getFailedItems() {
        return failedItems;
    }

    /**
     * <p>
     * Assessment run details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @param failedItems
     *        Assessment run details that cannot be described. An error code is provided for each failed item.
     */

    public void setFailedItems(java.util.Map<String, FailedItemDetails> failedItems) {
        this.failedItems = failedItems;
    }

    /**
     * <p>
     * Assessment run details that cannot be described. An error code is provided for each failed item.
     * </p>
     * 
     * @param failedItems
     *        Assessment run details that cannot be described. An error code is provided for each failed item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAssessmentRunsResult withFailedItems(java.util.Map<String, FailedItemDetails> failedItems) {
        setFailedItems(failedItems);
        return this;
    }

    public DescribeAssessmentRunsResult addFailedItemsEntry(String key, FailedItemDetails value) {
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

    public DescribeAssessmentRunsResult clearFailedItemsEntries() {
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
        if (getAssessmentRuns() != null)
            sb.append("AssessmentRuns: ").append(getAssessmentRuns()).append(",");
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

        if (obj instanceof DescribeAssessmentRunsResult == false)
            return false;
        DescribeAssessmentRunsResult other = (DescribeAssessmentRunsResult) obj;
        if (other.getAssessmentRuns() == null ^ this.getAssessmentRuns() == null)
            return false;
        if (other.getAssessmentRuns() != null && other.getAssessmentRuns().equals(this.getAssessmentRuns()) == false)
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

        hashCode = prime * hashCode + ((getAssessmentRuns() == null) ? 0 : getAssessmentRuns().hashCode());
        hashCode = prime * hashCode + ((getFailedItems() == null) ? 0 : getFailedItems().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAssessmentRunsResult clone() {
        try {
            return (DescribeAssessmentRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
