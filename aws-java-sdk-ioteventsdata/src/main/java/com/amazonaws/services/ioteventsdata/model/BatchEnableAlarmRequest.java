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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/BatchEnableAlarm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchEnableAlarmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of enable action requests. You can specify up to 10 requests per operation.
     * </p>
     */
    private java.util.List<EnableAlarmActionRequest> enableActionRequests;

    /**
     * <p>
     * The list of enable action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @return The list of enable action requests. You can specify up to 10 requests per operation.
     */

    public java.util.List<EnableAlarmActionRequest> getEnableActionRequests() {
        return enableActionRequests;
    }

    /**
     * <p>
     * The list of enable action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @param enableActionRequests
     *        The list of enable action requests. You can specify up to 10 requests per operation.
     */

    public void setEnableActionRequests(java.util.Collection<EnableAlarmActionRequest> enableActionRequests) {
        if (enableActionRequests == null) {
            this.enableActionRequests = null;
            return;
        }

        this.enableActionRequests = new java.util.ArrayList<EnableAlarmActionRequest>(enableActionRequests);
    }

    /**
     * <p>
     * The list of enable action requests. You can specify up to 10 requests per operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableActionRequests(java.util.Collection)} or {@link #withEnableActionRequests(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param enableActionRequests
     *        The list of enable action requests. You can specify up to 10 requests per operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEnableAlarmRequest withEnableActionRequests(EnableAlarmActionRequest... enableActionRequests) {
        if (this.enableActionRequests == null) {
            setEnableActionRequests(new java.util.ArrayList<EnableAlarmActionRequest>(enableActionRequests.length));
        }
        for (EnableAlarmActionRequest ele : enableActionRequests) {
            this.enableActionRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of enable action requests. You can specify up to 10 requests per operation.
     * </p>
     * 
     * @param enableActionRequests
     *        The list of enable action requests. You can specify up to 10 requests per operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEnableAlarmRequest withEnableActionRequests(java.util.Collection<EnableAlarmActionRequest> enableActionRequests) {
        setEnableActionRequests(enableActionRequests);
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
        if (getEnableActionRequests() != null)
            sb.append("EnableActionRequests: ").append(getEnableActionRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchEnableAlarmRequest == false)
            return false;
        BatchEnableAlarmRequest other = (BatchEnableAlarmRequest) obj;
        if (other.getEnableActionRequests() == null ^ this.getEnableActionRequests() == null)
            return false;
        if (other.getEnableActionRequests() != null && other.getEnableActionRequests().equals(this.getEnableActionRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableActionRequests() == null) ? 0 : getEnableActionRequests().hashCode());
        return hashCode;
    }

    @Override
    public BatchEnableAlarmRequest clone() {
        return (BatchEnableAlarmRequest) super.clone();
    }

}
