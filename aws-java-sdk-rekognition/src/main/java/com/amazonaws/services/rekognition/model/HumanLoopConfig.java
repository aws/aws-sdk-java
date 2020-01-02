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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sets up the flow definition the image will be sent to if one of the conditions is met. You can also set certain
 * attributes of the image before review.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the human review used for this image. This should be kept unique within a region.
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
     * Sets attributes of the input data.
     * </p>
     */
    private HumanLoopDataAttributes dataAttributes;

    /**
     * <p>
     * The name of the human review used for this image. This should be kept unique within a region.
     * </p>
     * 
     * @param humanLoopName
     *        The name of the human review used for this image. This should be kept unique within a region.
     */

    public void setHumanLoopName(String humanLoopName) {
        this.humanLoopName = humanLoopName;
    }

    /**
     * <p>
     * The name of the human review used for this image. This should be kept unique within a region.
     * </p>
     * 
     * @return The name of the human review used for this image. This should be kept unique within a region.
     */

    public String getHumanLoopName() {
        return this.humanLoopName;
    }

    /**
     * <p>
     * The name of the human review used for this image. This should be kept unique within a region.
     * </p>
     * 
     * @param humanLoopName
     *        The name of the human review used for this image. This should be kept unique within a region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withHumanLoopName(String humanLoopName) {
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

    public HumanLoopConfig withFlowDefinitionArn(String flowDefinitionArn) {
        setFlowDefinitionArn(flowDefinitionArn);
        return this;
    }

    /**
     * <p>
     * Sets attributes of the input data.
     * </p>
     * 
     * @param dataAttributes
     *        Sets attributes of the input data.
     */

    public void setDataAttributes(HumanLoopDataAttributes dataAttributes) {
        this.dataAttributes = dataAttributes;
    }

    /**
     * <p>
     * Sets attributes of the input data.
     * </p>
     * 
     * @return Sets attributes of the input data.
     */

    public HumanLoopDataAttributes getDataAttributes() {
        return this.dataAttributes;
    }

    /**
     * <p>
     * Sets attributes of the input data.
     * </p>
     * 
     * @param dataAttributes
     *        Sets attributes of the input data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopConfig withDataAttributes(HumanLoopDataAttributes dataAttributes) {
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

        if (obj instanceof HumanLoopConfig == false)
            return false;
        HumanLoopConfig other = (HumanLoopConfig) obj;
        if (other.getHumanLoopName() == null ^ this.getHumanLoopName() == null)
            return false;
        if (other.getHumanLoopName() != null && other.getHumanLoopName().equals(this.getHumanLoopName()) == false)
            return false;
        if (other.getFlowDefinitionArn() == null ^ this.getFlowDefinitionArn() == null)
            return false;
        if (other.getFlowDefinitionArn() != null && other.getFlowDefinitionArn().equals(this.getFlowDefinitionArn()) == false)
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
        hashCode = prime * hashCode + ((getDataAttributes() == null) ? 0 : getDataAttributes().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopConfig clone() {
        try {
            return (HumanLoopConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.HumanLoopConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
