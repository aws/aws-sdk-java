/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Gathers information about when a particular result was clicked by a user. Your application uses the
 * <a>SubmitFeedback</a> operation to provide click information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ClickFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClickFeedback implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the search result that was clicked.
     * </p>
     */
    private String resultId;
    /**
     * <p>
     * The Unix timestamp of the data and time that the result was clicked.
     * </p>
     */
    private java.util.Date clickTime;

    /**
     * <p>
     * The unique identifier of the search result that was clicked.
     * </p>
     * 
     * @param resultId
     *        The unique identifier of the search result that was clicked.
     */

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    /**
     * <p>
     * The unique identifier of the search result that was clicked.
     * </p>
     * 
     * @return The unique identifier of the search result that was clicked.
     */

    public String getResultId() {
        return this.resultId;
    }

    /**
     * <p>
     * The unique identifier of the search result that was clicked.
     * </p>
     * 
     * @param resultId
     *        The unique identifier of the search result that was clicked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClickFeedback withResultId(String resultId) {
        setResultId(resultId);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp of the data and time that the result was clicked.
     * </p>
     * 
     * @param clickTime
     *        The Unix timestamp of the data and time that the result was clicked.
     */

    public void setClickTime(java.util.Date clickTime) {
        this.clickTime = clickTime;
    }

    /**
     * <p>
     * The Unix timestamp of the data and time that the result was clicked.
     * </p>
     * 
     * @return The Unix timestamp of the data and time that the result was clicked.
     */

    public java.util.Date getClickTime() {
        return this.clickTime;
    }

    /**
     * <p>
     * The Unix timestamp of the data and time that the result was clicked.
     * </p>
     * 
     * @param clickTime
     *        The Unix timestamp of the data and time that the result was clicked.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClickFeedback withClickTime(java.util.Date clickTime) {
        setClickTime(clickTime);
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
        if (getResultId() != null)
            sb.append("ResultId: ").append(getResultId()).append(",");
        if (getClickTime() != null)
            sb.append("ClickTime: ").append(getClickTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClickFeedback == false)
            return false;
        ClickFeedback other = (ClickFeedback) obj;
        if (other.getResultId() == null ^ this.getResultId() == null)
            return false;
        if (other.getResultId() != null && other.getResultId().equals(this.getResultId()) == false)
            return false;
        if (other.getClickTime() == null ^ this.getClickTime() == null)
            return false;
        if (other.getClickTime() != null && other.getClickTime().equals(this.getClickTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultId() == null) ? 0 : getResultId().hashCode());
        hashCode = prime * hashCode + ((getClickTime() == null) ? 0 : getClickTime().hashCode());
        return hashCode;
    }

    @Override
    public ClickFeedback clone() {
        try {
            return (ClickFeedback) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.ClickFeedbackMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
