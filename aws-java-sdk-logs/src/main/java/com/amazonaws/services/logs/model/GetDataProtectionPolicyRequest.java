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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetDataProtectionPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataProtectionPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or ARN of the log group that contains the data protection policy that you want to see.
     * </p>
     */
    private String logGroupIdentifier;

    /**
     * <p>
     * The name or ARN of the log group that contains the data protection policy that you want to see.
     * </p>
     * 
     * @param logGroupIdentifier
     *        The name or ARN of the log group that contains the data protection policy that you want to see.
     */

    public void setLogGroupIdentifier(String logGroupIdentifier) {
        this.logGroupIdentifier = logGroupIdentifier;
    }

    /**
     * <p>
     * The name or ARN of the log group that contains the data protection policy that you want to see.
     * </p>
     * 
     * @return The name or ARN of the log group that contains the data protection policy that you want to see.
     */

    public String getLogGroupIdentifier() {
        return this.logGroupIdentifier;
    }

    /**
     * <p>
     * The name or ARN of the log group that contains the data protection policy that you want to see.
     * </p>
     * 
     * @param logGroupIdentifier
     *        The name or ARN of the log group that contains the data protection policy that you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataProtectionPolicyRequest withLogGroupIdentifier(String logGroupIdentifier) {
        setLogGroupIdentifier(logGroupIdentifier);
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
        if (getLogGroupIdentifier() != null)
            sb.append("LogGroupIdentifier: ").append(getLogGroupIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataProtectionPolicyRequest == false)
            return false;
        GetDataProtectionPolicyRequest other = (GetDataProtectionPolicyRequest) obj;
        if (other.getLogGroupIdentifier() == null ^ this.getLogGroupIdentifier() == null)
            return false;
        if (other.getLogGroupIdentifier() != null && other.getLogGroupIdentifier().equals(this.getLogGroupIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupIdentifier() == null) ? 0 : getLogGroupIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetDataProtectionPolicyRequest clone() {
        return (GetDataProtectionPolicyRequest) super.clone();
    }

}
