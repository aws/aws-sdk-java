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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchDisableAlarm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisableAlarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of disable action requests. You can specify up to 10 requests per operation.
     * </p>
     */
    private java.util.List<DisableAlarmActionRequest> disableActionRequests;

    /**
     * <p>
     * The list of disable action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @return The list of disable action requests. You can specify up to 10 requests per operation.
     */

    public java.util.List<DisableAlarmActionRequest> getDisableActionRequests() {
        return disableActionRequests;
    }

    /**
     * <p>
     * The list of disable action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @param disableActionRequests
     *        The list of disable action requests. You can specify up to 10 requests per operation.
     */

    public void setDisableActionRequests(java.util.Collection<DisableAlarmActionRequest> disableActionRequests) {
        if (disableActionRequests == null) {
            this.disableActionRequests = null;
            return;
        }

        this.disableActionRequests = new java.util.ArrayList<DisableAlarmActionRequest>(disableActionRequests);
    }

    /**
     * <p>
     * The list of disable action requests. You can specify up to 10 requests per operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisableActionRequests(java.util.Collection)} or
     * {@link #withDisableActionRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param disableActionRequests
     *        The list of disable action requests. You can specify up to 10 requests per operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisableAlarmRequest withDisableActionRequests(DisableAlarmActionRequest... disableActionRequests) {
        if (this.disableActionRequests == null) {
            setDisableActionRequests(new java.util.ArrayList<DisableAlarmActionRequest>(disableActionRequests.length));
        }
        for (DisableAlarmActionRequest ele : disableActionRequests) {
            this.disableActionRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of disable action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @param disableActionRequests
     *        The list of disable action requests. You can specify up to 10 requests per operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisableAlarmRequest withDisableActionRequests(java.util.Collection<DisableAlarmActionRequest> disableActionRequests) {
        setDisableActionRequests(disableActionRequests);
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
        if (getDisableActionRequests() != null)
            sb.append("DisableActionRequests: ").append(getDisableActionRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisableAlarmRequest == false)
            return false;
        BatchDisableAlarmRequest other = (BatchDisableAlarmRequest) obj;
        if (other.getDisableActionRequests() == null ^ this.getDisableActionRequests() == null)
            return false;
        if (other.getDisableActionRequests() != null && other.getDisableActionRequests().equals(this.getDisableActionRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisableActionRequests() == null) ? 0 : getDisableActionRequests().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisableAlarmRequest clone() {
        return (BatchDisableAlarmRequest) super.clone();
    }

}
