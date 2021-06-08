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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFlowLogsIntegrationTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The generated CloudFormation template.
     * </p>
     */
    private String result;

    /**
     * <p>
     * The generated CloudFormation template.
     * </p>
     * 
     * @param result
     *        The generated CloudFormation template.
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * The generated CloudFormation template.
     * </p>
     * 
     * @return The generated CloudFormation template.
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * The generated CloudFormation template.
     * </p>
     * 
     * @param result
     *        The generated CloudFormation template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowLogsIntegrationTemplateResult withResult(String result) {
        setResult(result);
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
        if (getResult() != null)
            sb.append("Result: ").append(getResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFlowLogsIntegrationTemplateResult == false)
            return false;
        GetFlowLogsIntegrationTemplateResult other = (GetFlowLogsIntegrationTemplateResult) obj;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        return hashCode;
    }

    @Override
    public GetFlowLogsIntegrationTemplateResult clone() {
        try {
            return (GetFlowLogsIntegrationTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
