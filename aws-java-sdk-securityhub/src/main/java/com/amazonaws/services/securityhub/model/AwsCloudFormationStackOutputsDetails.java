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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the CloudFormation stack output.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFormationStackOutputsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFormationStackOutputsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A user-defined description associated with the output.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The key associated with the output.
     * </p>
     */
    private String outputKey;
    /**
     * <p>
     * The value associated with the output.
     * </p>
     */
    private String outputValue;

    /**
     * <p>
     * A user-defined description associated with the output.
     * </p>
     * 
     * @param description
     *        A user-defined description associated with the output.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-defined description associated with the output.
     * </p>
     * 
     * @return A user-defined description associated with the output.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-defined description associated with the output.
     * </p>
     * 
     * @param description
     *        A user-defined description associated with the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackOutputsDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The key associated with the output.
     * </p>
     * 
     * @param outputKey
     *        The key associated with the output.
     */

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    /**
     * <p>
     * The key associated with the output.
     * </p>
     * 
     * @return The key associated with the output.
     */

    public String getOutputKey() {
        return this.outputKey;
    }

    /**
     * <p>
     * The key associated with the output.
     * </p>
     * 
     * @param outputKey
     *        The key associated with the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackOutputsDetails withOutputKey(String outputKey) {
        setOutputKey(outputKey);
        return this;
    }

    /**
     * <p>
     * The value associated with the output.
     * </p>
     * 
     * @param outputValue
     *        The value associated with the output.
     */

    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue;
    }

    /**
     * <p>
     * The value associated with the output.
     * </p>
     * 
     * @return The value associated with the output.
     */

    public String getOutputValue() {
        return this.outputValue;
    }

    /**
     * <p>
     * The value associated with the output.
     * </p>
     * 
     * @param outputValue
     *        The value associated with the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFormationStackOutputsDetails withOutputValue(String outputValue) {
        setOutputValue(outputValue);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOutputKey() != null)
            sb.append("OutputKey: ").append(getOutputKey()).append(",");
        if (getOutputValue() != null)
            sb.append("OutputValue: ").append(getOutputValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFormationStackOutputsDetails == false)
            return false;
        AwsCloudFormationStackOutputsDetails other = (AwsCloudFormationStackOutputsDetails) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOutputKey() == null ^ this.getOutputKey() == null)
            return false;
        if (other.getOutputKey() != null && other.getOutputKey().equals(this.getOutputKey()) == false)
            return false;
        if (other.getOutputValue() == null ^ this.getOutputValue() == null)
            return false;
        if (other.getOutputValue() != null && other.getOutputValue().equals(this.getOutputValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOutputKey() == null) ? 0 : getOutputKey().hashCode());
        hashCode = prime * hashCode + ((getOutputValue() == null) ? 0 : getOutputValue().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFormationStackOutputsDetails clone() {
        try {
            return (AwsCloudFormationStackOutputsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFormationStackOutputsDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
