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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/DescribeEngagement" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEngagementRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement you want the details of.
     * </p>
     */
    private String engagementId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement you want the details of.
     * </p>
     * 
     * @param engagementId
     *        The Amazon Resource Name (ARN) of the engagement you want the details of.
     */

    public void setEngagementId(String engagementId) {
        this.engagementId = engagementId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement you want the details of.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the engagement you want the details of.
     */

    public String getEngagementId() {
        return this.engagementId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the engagement you want the details of.
     * </p>
     * 
     * @param engagementId
     *        The Amazon Resource Name (ARN) of the engagement you want the details of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEngagementRequest withEngagementId(String engagementId) {
        setEngagementId(engagementId);
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
        if (getEngagementId() != null)
            sb.append("EngagementId: ").append(getEngagementId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEngagementRequest == false)
            return false;
        DescribeEngagementRequest other = (DescribeEngagementRequest) obj;
        if (other.getEngagementId() == null ^ this.getEngagementId() == null)
            return false;
        if (other.getEngagementId() != null && other.getEngagementId().equals(this.getEngagementId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngagementId() == null) ? 0 : getEngagementId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEngagementRequest clone() {
        return (DescribeEngagementRequest) super.clone();
    }

}
