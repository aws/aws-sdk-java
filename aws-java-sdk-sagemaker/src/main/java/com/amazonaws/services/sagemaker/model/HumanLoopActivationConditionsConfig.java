/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines under what conditions SageMaker creates a human loop. Used within .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HumanLoopActivationConditionsConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopActivationConditionsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are created
     * against the configured work team. The set of conditions is different for Rekognition and Textract.
     * </p>
     */
    private String humanLoopActivationConditions;

    /**
     * <p>
     * JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are created
     * against the configured work team. The set of conditions is different for Rekognition and Textract.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param humanLoopActivationConditions
     *        JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are
     *        created against the configured work team. The set of conditions is different for Rekognition and Textract.
     */

    public void setHumanLoopActivationConditions(String humanLoopActivationConditions) {
        this.humanLoopActivationConditions = humanLoopActivationConditions;
    }

    /**
     * <p>
     * JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are created
     * against the configured work team. The set of conditions is different for Rekognition and Textract.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are
     *         created against the configured work team. The set of conditions is different for Rekognition and
     *         Textract.
     */

    public String getHumanLoopActivationConditions() {
        return this.humanLoopActivationConditions;
    }

    /**
     * <p>
     * JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are created
     * against the configured work team. The set of conditions is different for Rekognition and Textract.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param humanLoopActivationConditions
     *        JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are
     *        created against the configured work team. The set of conditions is different for Rekognition and Textract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopActivationConditionsConfig withHumanLoopActivationConditions(String humanLoopActivationConditions) {
        setHumanLoopActivationConditions(humanLoopActivationConditions);
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
        if (getHumanLoopActivationConditions() != null)
            sb.append("HumanLoopActivationConditions: ").append(getHumanLoopActivationConditions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopActivationConditionsConfig == false)
            return false;
        HumanLoopActivationConditionsConfig other = (HumanLoopActivationConditionsConfig) obj;
        if (other.getHumanLoopActivationConditions() == null ^ this.getHumanLoopActivationConditions() == null)
            return false;
        if (other.getHumanLoopActivationConditions() != null
                && other.getHumanLoopActivationConditions().equals(this.getHumanLoopActivationConditions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanLoopActivationConditions() == null) ? 0 : getHumanLoopActivationConditions().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopActivationConditionsConfig clone() {
        try {
            return (HumanLoopActivationConditionsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HumanLoopActivationConditionsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
