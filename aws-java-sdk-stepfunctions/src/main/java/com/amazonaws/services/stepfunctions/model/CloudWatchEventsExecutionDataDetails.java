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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about execution input or output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CloudWatchEventsExecutionDataDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchEventsExecutionDataDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether input or output was included in the response. Always <code>true</code> for API calls.
     * </p>
     */
    private Boolean included;

    /**
     * <p>
     * Indicates whether input or output was included in the response. Always <code>true</code> for API calls.
     * </p>
     * 
     * @param included
     *        Indicates whether input or output was included in the response. Always <code>true</code> for API calls.
     */

    public void setIncluded(Boolean included) {
        this.included = included;
    }

    /**
     * <p>
     * Indicates whether input or output was included in the response. Always <code>true</code> for API calls.
     * </p>
     * 
     * @return Indicates whether input or output was included in the response. Always <code>true</code> for API calls.
     */

    public Boolean getIncluded() {
        return this.included;
    }

    /**
     * <p>
     * Indicates whether input or output was included in the response. Always <code>true</code> for API calls.
     * </p>
     * 
     * @param included
     *        Indicates whether input or output was included in the response. Always <code>true</code> for API calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchEventsExecutionDataDetails withIncluded(Boolean included) {
        setIncluded(included);
        return this;
    }

    /**
     * <p>
     * Indicates whether input or output was included in the response. Always <code>true</code> for API calls.
     * </p>
     * 
     * @return Indicates whether input or output was included in the response. Always <code>true</code> for API calls.
     */

    public Boolean isIncluded() {
        return this.included;
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
        if (getIncluded() != null)
            sb.append("Included: ").append(getIncluded());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchEventsExecutionDataDetails == false)
            return false;
        CloudWatchEventsExecutionDataDetails other = (CloudWatchEventsExecutionDataDetails) obj;
        if (other.getIncluded() == null ^ this.getIncluded() == null)
            return false;
        if (other.getIncluded() != null && other.getIncluded().equals(this.getIncluded()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIncluded() == null) ? 0 : getIncluded().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchEventsExecutionDataDetails clone() {
        try {
            return (CloudWatchEventsExecutionDataDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.CloudWatchEventsExecutionDataDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
