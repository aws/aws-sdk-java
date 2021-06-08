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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Output from validating an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/AppValidationOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppValidationOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Output from using SSM to validate the application.
     * </p>
     */
    private SSMOutput ssmOutput;

    /**
     * <p>
     * Output from using SSM to validate the application.
     * </p>
     * 
     * @param ssmOutput
     *        Output from using SSM to validate the application.
     */

    public void setSsmOutput(SSMOutput ssmOutput) {
        this.ssmOutput = ssmOutput;
    }

    /**
     * <p>
     * Output from using SSM to validate the application.
     * </p>
     * 
     * @return Output from using SSM to validate the application.
     */

    public SSMOutput getSsmOutput() {
        return this.ssmOutput;
    }

    /**
     * <p>
     * Output from using SSM to validate the application.
     * </p>
     * 
     * @param ssmOutput
     *        Output from using SSM to validate the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppValidationOutput withSsmOutput(SSMOutput ssmOutput) {
        setSsmOutput(ssmOutput);
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
        if (getSsmOutput() != null)
            sb.append("SsmOutput: ").append(getSsmOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppValidationOutput == false)
            return false;
        AppValidationOutput other = (AppValidationOutput) obj;
        if (other.getSsmOutput() == null ^ this.getSsmOutput() == null)
            return false;
        if (other.getSsmOutput() != null && other.getSsmOutput().equals(this.getSsmOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSsmOutput() == null) ? 0 : getSsmOutput().hashCode());
        return hashCode;
    }

    @Override
    public AppValidationOutput clone() {
        try {
            return (AppValidationOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.AppValidationOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
