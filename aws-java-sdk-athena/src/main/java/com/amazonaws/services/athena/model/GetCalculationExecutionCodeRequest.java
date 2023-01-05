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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/GetCalculationExecutionCode" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCalculationExecutionCodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     */
    private String calculationExecutionId;

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @param calculationExecutionId
     *        The calculation execution UUID.
     */

    public void setCalculationExecutionId(String calculationExecutionId) {
        this.calculationExecutionId = calculationExecutionId;
    }

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @return The calculation execution UUID.
     */

    public String getCalculationExecutionId() {
        return this.calculationExecutionId;
    }

    /**
     * <p>
     * The calculation execution UUID.
     * </p>
     * 
     * @param calculationExecutionId
     *        The calculation execution UUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCalculationExecutionCodeRequest withCalculationExecutionId(String calculationExecutionId) {
        setCalculationExecutionId(calculationExecutionId);
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
        if (getCalculationExecutionId() != null)
            sb.append("CalculationExecutionId: ").append(getCalculationExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCalculationExecutionCodeRequest == false)
            return false;
        GetCalculationExecutionCodeRequest other = (GetCalculationExecutionCodeRequest) obj;
        if (other.getCalculationExecutionId() == null ^ this.getCalculationExecutionId() == null)
            return false;
        if (other.getCalculationExecutionId() != null && other.getCalculationExecutionId().equals(this.getCalculationExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalculationExecutionId() == null) ? 0 : getCalculationExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public GetCalculationExecutionCodeRequest clone() {
        return (GetCalculationExecutionCodeRequest) super.clone();
    }

}
