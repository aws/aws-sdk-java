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
package com.amazonaws.services.augmentedairuntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/StartHumanLoop"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartHumanLoopRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the human loop.
     * </p>
     */
    private String humanLoopName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     */
    private String flowDefinitionArn;
    /**
     * <p>
     * An object containing information about the human loop.
     * </p>
     */
    private HumanLoopInput humanLoopInput;
    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     */
    private HumanLoopDataAttributes dataAttributes;

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * 
     * @param humanLoopName
     *        The name of the human loop.
     */

    public void setHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * 
     * @return The name of the human loop.
     */

    public String getHumanLoopName() {
        return this.humanLoopName;
    }

    /**
     * <p>
     * The name of the human loop.
     * </p>
     * 
     * @param humanLoopName
     *        The name of the human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartHumanLoopRequest withHumanLoopName(String humanLoopName) {
        setHumanLoopName(humanLoopName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * 
     * @param flowDefinitionArn
     *        The Amazon Resource Name (ARN) of the flow definition.
     */

    public void setFlowDefinitionArn(String flowDefinitionArn) {
        this.flowDefinitionArn = flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the flow definition.
     */

    public String getFlowDefinitionArn() {
        return this.flowDefinitionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the flow definition.
     * </p>
     * 
     * @param flowDefinitionArn
     *        The Amazon Resource Name (ARN) of the flow definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartHumanLoopRequest withFlowDefinitionArn(String flowDefinitionArn) {
        setFlowDefinitionArn(flowDefinitionArn);
        return this;
    }

    /**
     * <p>
     * An object containing information about the human loop.
     * </p>
     * 
     * @param humanLoopInput
     *        An object containing information about the human loop.
     */

    public void setHumanLoopInput(HumanLoopInput humanLoopInput) {
        this.humanLoopInput = humanLoopInput;
    }

    /**
     * <p>
     * An object containing information about the human loop.
     * </p>
     * 
     * @return An object containing information about the human loop.
     */

    public HumanLoopInput getHumanLoopInput() {
        return this.humanLoopInput;
    }

    /**
     * <p>
     * An object containing information about the human loop.
     * </p>
     * 
     * @param humanLoopInput
     *        An object containing information about the human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartHumanLoopRequest withHumanLoopInput(HumanLoopInput humanLoopInput) {
        setHumanLoopInput(humanLoopInput);
        return this;
    }

    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     * 
     * @param dataAttributes
     *        Attributes of the data specified by the customer.
     */

    public void setDataAttributes(HumanLoopDataAttributes dataAttributes) {
        this.dataAttributes = dataAttributes;
    }

    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     * 
     * @return Attributes of the data specified by the customer.
     */

    public HumanLoopDataAttributes getDataAttributes() {
        return this.dataAttributes;
    }

    /**
     * <p>
     * Attributes of the data specified by the customer.
     * </p>
     * 
     * @param dataAttributes
     *        Attributes of the data specified by the customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartHumanLoopRequest withDataAttributes(HumanLoopDataAttributes dataAttributes) {
        setDataAttributes(dataAttributes);
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
        if (getHumanLoopName() != null)
            sb.append("HumanLoopName: ").append(getHumanLoopName()).append(",");
        if (getFlowDefinitionArn() != null)
            sb.append("FlowDefinitionArn: ").append(getFlowDefinitionArn()).append(",");
        if (getHumanLoopInput() != null)
            sb.append("HumanLoopInput: ").append(getHumanLoopInput()).append(",");
        if (getDataAttributes() != null)
            sb.append("DataAttributes: ").append(getDataAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartHumanLoopRequest == false)
            return false;
        StartHumanLoopRequest other = (StartHumanLoopRequest) obj;
        if (other.getHumanLoopName() == null ^ this.getHumanLoopName() == null)
            return false;
        if (other.getHumanLoopName() != null && other.getHumanLoopName().equals(this.getHumanLoopName()) == false)
            return false;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
            return false;
        if (other.getHumanLoopInput() == null ^ this.getHumanLoopInput() == null)
            return false;
        if (other.getHumanLoopInput() != null && other.getHumanLoopInput().equals(this.getHumanLoopInput()) == false)
            return false;
        if (other.getDataAttributes() == null ^ this.getDataAttributes() == null)
            return false;
        if (other.getDataAttributes() != null && other.getDataAttributes().equals(this.getDataAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanLoopName() == null) ? 0 : getHumanLoopName().hashCode());
        hashCode = prime * hashCode + ((getFlowDefinitionArn() == null) ? 0 : getFlowDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopInput() == null) ? 0 : getHumanLoopInput().hashCode());
        hashCode = prime * hashCode + ((getDataAttributes() == null) ? 0 : getDataAttributes().hashCode());
        return hashCode;
    }

    @Override
    public StartHumanLoopRequest clone() {
        return (StartHumanLoopRequest) super.clone();
    }

}
