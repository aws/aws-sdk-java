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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about insight feedback received from a customer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/InsightFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightFeedback implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The insight feedback ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The feedback provided by the customer.
     * </p>
     */
    private String feedback;

    /**
     * <p>
     * The insight feedback ID.
     * </p>
     * 
     * @param id
     *        The insight feedback ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The insight feedback ID.
     * </p>
     * 
     * @return The insight feedback ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The insight feedback ID.
     * </p>
     * 
     * @param id
     *        The insight feedback ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightFeedback withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The feedback provided by the customer.
     * </p>
     * 
     * @param feedback
     *        The feedback provided by the customer.
     * @see InsightFeedbackOption
     */

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * <p>
     * The feedback provided by the customer.
     * </p>
     * 
     * @return The feedback provided by the customer.
     * @see InsightFeedbackOption
     */

    public String getFeedback() {
        return this.feedback;
    }

    /**
     * <p>
     * The feedback provided by the customer.
     * </p>
     * 
     * @param feedback
     *        The feedback provided by the customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightFeedbackOption
     */

    public InsightFeedback withFeedback(String feedback) {
        setFeedback(feedback);
        return this;
    }

    /**
     * <p>
     * The feedback provided by the customer.
     * </p>
     * 
     * @param feedback
     *        The feedback provided by the customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightFeedbackOption
     */

    public InsightFeedback withFeedback(InsightFeedbackOption feedback) {
        this.feedback = feedback.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getFeedback() != null)
            sb.append("Feedback: ").append(getFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightFeedback == false)
            return false;
        InsightFeedback other = (InsightFeedback) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFeedback() == null ^ this.getFeedback() == null)
            return false;
        if (other.getFeedback() != null && other.getFeedback().equals(this.getFeedback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        return hashCode;
    }

    @Override
    public InsightFeedback clone() {
        try {
            return (InsightFeedback) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.InsightFeedbackMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
