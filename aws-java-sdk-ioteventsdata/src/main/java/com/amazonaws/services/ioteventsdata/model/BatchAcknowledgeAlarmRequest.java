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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchAcknowledgeAlarm"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchAcknowledgeAlarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of acknowledge action requests. You can specify up to 10 requests per operation.
     * </p>
     */
    private java.util.List<AcknowledgeAlarmActionRequest> acknowledgeActionRequests;

    /**
     * <p>
     * The list of acknowledge action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @return The list of acknowledge action requests. You can specify up to 10 requests per operation.
     */

    public java.util.List<AcknowledgeAlarmActionRequest> getAcknowledgeActionRequests() {
        return acknowledgeActionRequests;
    }

    /**
     * <p>
     * The list of acknowledge action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @param acknowledgeActionRequests
     *        The list of acknowledge action requests. You can specify up to 10 requests per operation.
     */

    public void setAcknowledgeActionRequests(java.util.Collection<AcknowledgeAlarmActionRequest> acknowledgeActionRequests) {
        if (acknowledgeActionRequests == null) {
            this.acknowledgeActionRequests = null;
            return;
        }

        this.acknowledgeActionRequests = new java.util.ArrayList<AcknowledgeAlarmActionRequest>(acknowledgeActionRequests);
    }

    /**
     * <p>
     * The list of acknowledge action requests. You can specify up to 10 requests per operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcknowledgeActionRequests(java.util.Collection)} or
     * {@link #withAcknowledgeActionRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param acknowledgeActionRequests
     *        The list of acknowledge action requests. You can specify up to 10 requests per operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAcknowledgeAlarmRequest withAcknowledgeActionRequests(AcknowledgeAlarmActionRequest... acknowledgeActionRequests) {
        if (this.acknowledgeActionRequests == null) {
            setAcknowledgeActionRequests(new java.util.ArrayList<AcknowledgeAlarmActionRequest>(acknowledgeActionRequests.length));
        }
        for (AcknowledgeAlarmActionRequest ele : acknowledgeActionRequests) {
            this.acknowledgeActionRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of acknowledge action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @param acknowledgeActionRequests
     *        The list of acknowledge action requests. You can specify up to 10 requests per operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchAcknowledgeAlarmRequest withAcknowledgeActionRequests(java.util.Collection<AcknowledgeAlarmActionRequest> acknowledgeActionRequests) {
        setAcknowledgeActionRequests(acknowledgeActionRequests);
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
        if (getAcknowledgeActionRequests() != null)
            sb.append("AcknowledgeActionRequests: ").append(getAcknowledgeActionRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchAcknowledgeAlarmRequest == false)
            return false;
        BatchAcknowledgeAlarmRequest other = (BatchAcknowledgeAlarmRequest) obj;
        if (other.getAcknowledgeActionRequests() == null ^ this.getAcknowledgeActionRequests() == null)
            return false;
        if (other.getAcknowledgeActionRequests() != null && other.getAcknowledgeActionRequests().equals(this.getAcknowledgeActionRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcknowledgeActionRequests() == null) ? 0 : getAcknowledgeActionRequests().hashCode());
        return hashCode;
    }

    @Override
    public BatchAcknowledgeAlarmRequest clone() {
        return (BatchAcknowledgeAlarmRequest) super.clone();
    }

}
