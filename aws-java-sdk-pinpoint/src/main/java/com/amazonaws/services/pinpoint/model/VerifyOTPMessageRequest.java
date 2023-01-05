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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/VerifyOTPMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyOTPMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of your Amazon Pinpoint application.
     * </p>
     */
    private String applicationId;

    private VerifyOTPMessageRequestParameters verifyOTPMessageRequestParameters;

    /**
     * <p>
     * The unique ID of your Amazon Pinpoint application.
     * </p>
     * 
     * @param applicationId
     *        The unique ID of your Amazon Pinpoint application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique ID of your Amazon Pinpoint application.
     * </p>
     * 
     * @return The unique ID of your Amazon Pinpoint application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique ID of your Amazon Pinpoint application.
     * </p>
     * 
     * @param applicationId
     *        The unique ID of your Amazon Pinpoint application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyOTPMessageRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * @param verifyOTPMessageRequestParameters
     */

    public void setVerifyOTPMessageRequestParameters(VerifyOTPMessageRequestParameters verifyOTPMessageRequestParameters) {
        this.verifyOTPMessageRequestParameters = verifyOTPMessageRequestParameters;
    }

    /**
     * @return
     */

    public VerifyOTPMessageRequestParameters getVerifyOTPMessageRequestParameters() {
        return this.verifyOTPMessageRequestParameters;
    }

    /**
     * @param verifyOTPMessageRequestParameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyOTPMessageRequest withVerifyOTPMessageRequestParameters(VerifyOTPMessageRequestParameters verifyOTPMessageRequestParameters) {
        setVerifyOTPMessageRequestParameters(verifyOTPMessageRequestParameters);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getVerifyOTPMessageRequestParameters() != null)
            sb.append("VerifyOTPMessageRequestParameters: ").append(getVerifyOTPMessageRequestParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyOTPMessageRequest == false)
            return false;
        VerifyOTPMessageRequest other = (VerifyOTPMessageRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getVerifyOTPMessageRequestParameters() == null ^ this.getVerifyOTPMessageRequestParameters() == null)
            return false;
        if (other.getVerifyOTPMessageRequestParameters() != null
                && other.getVerifyOTPMessageRequestParameters().equals(this.getVerifyOTPMessageRequestParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getVerifyOTPMessageRequestParameters() == null) ? 0 : getVerifyOTPMessageRequestParameters().hashCode());
        return hashCode;
    }

    @Override
    public VerifyOTPMessageRequest clone() {
        return (VerifyOTPMessageRequest) super.clone();
    }

}
