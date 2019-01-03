/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for DescribeInputSecurityGroupRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputSecurityGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInputSecurityGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The id of the Input Security Group to describe */
    private String inputSecurityGroupId;

    /**
     * The id of the Input Security Group to describe
     * 
     * @param inputSecurityGroupId
     *        The id of the Input Security Group to describe
     */

    public void setInputSecurityGroupId(String inputSecurityGroupId) {
        this.inputSecurityGroupId = inputSecurityGroupId;
    }

    /**
     * The id of the Input Security Group to describe
     * 
     * @return The id of the Input Security Group to describe
     */

    public String getInputSecurityGroupId() {
        return this.inputSecurityGroupId;
    }

    /**
     * The id of the Input Security Group to describe
     * 
     * @param inputSecurityGroupId
     *        The id of the Input Security Group to describe
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputSecurityGroupRequest withInputSecurityGroupId(String inputSecurityGroupId) {
        setInputSecurityGroupId(inputSecurityGroupId);
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
        if (getInputSecurityGroupId() != null)
            sb.append("InputSecurityGroupId: ").append(getInputSecurityGroupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInputSecurityGroupRequest == false)
            return false;
        DescribeInputSecurityGroupRequest other = (DescribeInputSecurityGroupRequest) obj;
        if (other.getInputSecurityGroupId() == null ^ this.getInputSecurityGroupId() == null)
            return false;
        if (other.getInputSecurityGroupId() != null && other.getInputSecurityGroupId().equals(this.getInputSecurityGroupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputSecurityGroupId() == null) ? 0 : getInputSecurityGroupId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInputSecurityGroupRequest clone() {
        return (DescribeInputSecurityGroupRequest) super.clone();
    }

}
