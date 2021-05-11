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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/StartEngagement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartEngagementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the engagement.
     * </p>
     */
    private String engagementArn;

    /**
     * <p>
     * The ARN of the engagement.
     * </p>
     * 
     * @param engagementArn
     *        The ARN of the engagement.
     */

    public void setEngagementArn(String engagementArn) {
        this.engagementArn = engagementArn;
    }

    /**
     * <p>
     * The ARN of the engagement.
     * </p>
     * 
     * @return The ARN of the engagement.
     */

    public String getEngagementArn() {
        return this.engagementArn;
    }

    /**
     * <p>
     * The ARN of the engagement.
     * </p>
     * 
     * @param engagementArn
     *        The ARN of the engagement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartEngagementResult withEngagementArn(String engagementArn) {
        setEngagementArn(engagementArn);
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
        if (getEngagementArn() != null)
            sb.append("EngagementArn: ").append(getEngagementArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartEngagementResult == false)
            return false;
        StartEngagementResult other = (StartEngagementResult) obj;
        if (other.getEngagementArn() == null ^ this.getEngagementArn() == null)
            return false;
        if (other.getEngagementArn() != null && other.getEngagementArn().equals(this.getEngagementArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngagementArn() == null) ? 0 : getEngagementArn().hashCode());
        return hashCode;
    }

    @Override
    public StartEngagementResult clone() {
        try {
            return (StartEngagementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
