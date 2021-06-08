/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/PutFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The feedback from customers is about the recommendations in this insight.
     * </p>
     */
    private InsightFeedback insightFeedback;

    /**
     * <p>
     * The feedback from customers is about the recommendations in this insight.
     * </p>
     * 
     * @param insightFeedback
     *        The feedback from customers is about the recommendations in this insight.
     */

    public void setInsightFeedback(InsightFeedback insightFeedback) {
        this.insightFeedback = insightFeedback;
    }

    /**
     * <p>
     * The feedback from customers is about the recommendations in this insight.
     * </p>
     * 
     * @return The feedback from customers is about the recommendations in this insight.
     */

    public InsightFeedback getInsightFeedback() {
        return this.insightFeedback;
    }

    /**
     * <p>
     * The feedback from customers is about the recommendations in this insight.
     * </p>
     * 
     * @param insightFeedback
     *        The feedback from customers is about the recommendations in this insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutFeedbackRequest withInsightFeedback(InsightFeedback insightFeedback) {
        setInsightFeedback(insightFeedback);
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
        if (getInsightFeedback() != null)
            sb.append("InsightFeedback: ").append(getInsightFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutFeedbackRequest == false)
            return false;
        PutFeedbackRequest other = (PutFeedbackRequest) obj;
        if (other.getInsightFeedback() == null ^ this.getInsightFeedback() == null)
            return false;
        if (other.getInsightFeedback() != null && other.getInsightFeedback().equals(this.getInsightFeedback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightFeedback() == null) ? 0 : getInsightFeedback().hashCode());
        return hashCode;
    }

    @Override
    public PutFeedbackRequest clone() {
        return (PutFeedbackRequest) super.clone();
    }

}
