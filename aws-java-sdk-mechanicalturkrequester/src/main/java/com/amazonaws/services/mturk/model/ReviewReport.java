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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains both ReviewResult and ReviewAction elements for a particular HIT.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ReviewReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewReport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of ReviewResults objects for each action specified in the Review Policy.
     * </p>
     */
    private java.util.List<ReviewResultDetail> reviewResults;
    /**
     * <p>
     * A list of ReviewAction objects for each action specified in the Review Policy.
     * </p>
     */
    private java.util.List<ReviewActionDetail> reviewActions;

    /**
     * <p>
     * A list of ReviewResults objects for each action specified in the Review Policy.
     * </p>
     * 
     * @return A list of ReviewResults objects for each action specified in the Review Policy.
     */

    public java.util.List<ReviewResultDetail> getReviewResults() {
        return reviewResults;
    }

    /**
     * <p>
     * A list of ReviewResults objects for each action specified in the Review Policy.
     * </p>
     * 
     * @param reviewResults
     *        A list of ReviewResults objects for each action specified in the Review Policy.
     */

    public void setReviewResults(java.util.Collection<ReviewResultDetail> reviewResults) {
        if (reviewResults == null) {
            this.reviewResults = null;
            return;
        }

        this.reviewResults = new java.util.ArrayList<ReviewResultDetail>(reviewResults);
    }

    /**
     * <p>
     * A list of ReviewResults objects for each action specified in the Review Policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReviewResults(java.util.Collection)} or {@link #withReviewResults(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param reviewResults
     *        A list of ReviewResults objects for each action specified in the Review Policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewReport withReviewResults(ReviewResultDetail... reviewResults) {
        if (this.reviewResults == null) {
            setReviewResults(new java.util.ArrayList<ReviewResultDetail>(reviewResults.length));
        }
        for (ReviewResultDetail ele : reviewResults) {
            this.reviewResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ReviewResults objects for each action specified in the Review Policy.
     * </p>
     * 
     * @param reviewResults
     *        A list of ReviewResults objects for each action specified in the Review Policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewReport withReviewResults(java.util.Collection<ReviewResultDetail> reviewResults) {
        setReviewResults(reviewResults);
        return this;
    }

    /**
     * <p>
     * A list of ReviewAction objects for each action specified in the Review Policy.
     * </p>
     * 
     * @return A list of ReviewAction objects for each action specified in the Review Policy.
     */

    public java.util.List<ReviewActionDetail> getReviewActions() {
        return reviewActions;
    }

    /**
     * <p>
     * A list of ReviewAction objects for each action specified in the Review Policy.
     * </p>
     * 
     * @param reviewActions
     *        A list of ReviewAction objects for each action specified in the Review Policy.
     */

    public void setReviewActions(java.util.Collection<ReviewActionDetail> reviewActions) {
        if (reviewActions == null) {
            this.reviewActions = null;
            return;
        }

        this.reviewActions = new java.util.ArrayList<ReviewActionDetail>(reviewActions);
    }

    /**
     * <p>
     * A list of ReviewAction objects for each action specified in the Review Policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReviewActions(java.util.Collection)} or {@link #withReviewActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param reviewActions
     *        A list of ReviewAction objects for each action specified in the Review Policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewReport withReviewActions(ReviewActionDetail... reviewActions) {
        if (this.reviewActions == null) {
            setReviewActions(new java.util.ArrayList<ReviewActionDetail>(reviewActions.length));
        }
        for (ReviewActionDetail ele : reviewActions) {
            this.reviewActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ReviewAction objects for each action specified in the Review Policy.
     * </p>
     * 
     * @param reviewActions
     *        A list of ReviewAction objects for each action specified in the Review Policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewReport withReviewActions(java.util.Collection<ReviewActionDetail> reviewActions) {
        setReviewActions(reviewActions);
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
        if (getReviewResults() != null)
            sb.append("ReviewResults: ").append(getReviewResults()).append(",");
        if (getReviewActions() != null)
            sb.append("ReviewActions: ").append(getReviewActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReviewReport == false)
            return false;
        ReviewReport other = (ReviewReport) obj;
        if (other.getReviewResults() == null ^ this.getReviewResults() == null)
            return false;
        if (other.getReviewResults() != null && other.getReviewResults().equals(this.getReviewResults()) == false)
            return false;
        if (other.getReviewActions() == null ^ this.getReviewActions() == null)
            return false;
        if (other.getReviewActions() != null && other.getReviewActions().equals(this.getReviewActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReviewResults() == null) ? 0 : getReviewResults().hashCode());
        hashCode = prime * hashCode + ((getReviewActions() == null) ? 0 : getReviewActions().hashCode());
        return hashCode;
    }

    @Override
    public ReviewReport clone() {
        try {
            return (ReviewReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.ReviewReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
