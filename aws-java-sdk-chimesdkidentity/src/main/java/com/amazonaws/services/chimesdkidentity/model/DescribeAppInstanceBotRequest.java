/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-identity-2021-04-20/DescribeAppInstanceBot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppInstanceBotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     */
    private String appInstanceBotArn;

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param appInstanceBotArn
     *        The ARN of the <code>AppInstanceBot</code>.
     */

    public void setAppInstanceBotArn(String appInstanceBotArn) {
        this.appInstanceBotArn = appInstanceBotArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @return The ARN of the <code>AppInstanceBot</code>.
     */

    public String getAppInstanceBotArn() {
        return this.appInstanceBotArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceBot</code>.
     * </p>
     * 
     * @param appInstanceBotArn
     *        The ARN of the <code>AppInstanceBot</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppInstanceBotRequest withAppInstanceBotArn(String appInstanceBotArn) {
        setAppInstanceBotArn(appInstanceBotArn);
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
        if (getAppInstanceBotArn() != null)
            sb.append("AppInstanceBotArn: ").append(getAppInstanceBotArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAppInstanceBotRequest == false)
            return false;
        DescribeAppInstanceBotRequest other = (DescribeAppInstanceBotRequest) obj;
        if (other.getAppInstanceBotArn() == null ^ this.getAppInstanceBotArn() == null)
            return false;
        if (other.getAppInstanceBotArn() != null && other.getAppInstanceBotArn().equals(this.getAppInstanceBotArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppInstanceBotArn() == null) ? 0 : getAppInstanceBotArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppInstanceBotRequest clone() {
        return (DescribeAppInstanceBotRequest) super.clone();
    }

}
