/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/DeleteCallAnalyticsJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCallAnalyticsJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Call Analytics job you want to delete. Job names are case sensitive.
     * </p>
     */
    private String callAnalyticsJobName;

    /**
     * <p>
     * The name of the Call Analytics job you want to delete. Job names are case sensitive.
     * </p>
     * 
     * @param callAnalyticsJobName
     *        The name of the Call Analytics job you want to delete. Job names are case sensitive.
     */

    public void setCallAnalyticsJobName(String callAnalyticsJobName) {
        this.callAnalyticsJobName = callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the Call Analytics job you want to delete. Job names are case sensitive.
     * </p>
     * 
     * @return The name of the Call Analytics job you want to delete. Job names are case sensitive.
     */

    public String getCallAnalyticsJobName() {
        return this.callAnalyticsJobName;
    }

    /**
     * <p>
     * The name of the Call Analytics job you want to delete. Job names are case sensitive.
     * </p>
     * 
     * @param callAnalyticsJobName
     *        The name of the Call Analytics job you want to delete. Job names are case sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCallAnalyticsJobRequest withCallAnalyticsJobName(String callAnalyticsJobName) {
        setCallAnalyticsJobName(callAnalyticsJobName);
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
        if (getCallAnalyticsJobName() != null)
            sb.append("CallAnalyticsJobName: ").append(getCallAnalyticsJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCallAnalyticsJobRequest == false)
            return false;
        DeleteCallAnalyticsJobRequest other = (DeleteCallAnalyticsJobRequest) obj;
        if (other.getCallAnalyticsJobName() == null ^ this.getCallAnalyticsJobName() == null)
            return false;
        if (other.getCallAnalyticsJobName() != null && other.getCallAnalyticsJobName().equals(this.getCallAnalyticsJobName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCallAnalyticsJobName() == null) ? 0 : getCallAnalyticsJobName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCallAnalyticsJobRequest clone() {
        return (DeleteCallAnalyticsJobRequest) super.clone();
    }

}
