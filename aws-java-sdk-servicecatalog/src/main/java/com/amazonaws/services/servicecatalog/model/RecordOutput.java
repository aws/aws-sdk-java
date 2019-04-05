/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The output for the product created as the result of a request. For example, the output for a CloudFormation-backed
 * product that creates an S3 bucket would include the S3 bucket URL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/RecordOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The output key.
     * </p>
     */
    private String outputKey;
    /**
     * <p>
     * The output value.
     * </p>
     */
    private String outputValue;
    /**
     * <p>
     * The description of the output.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The output key.
     * </p>
     * 
     * @param outputKey
     *        The output key.
     */

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    /**
     * <p>
     * The output key.
     * </p>
     * 
     * @return The output key.
     */

    public String getOutputKey() {
        return this.outputKey;
    }

    /**
     * <p>
     * The output key.
     * </p>
     * 
     * @param outputKey
     *        The output key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordOutput withOutputKey(String outputKey) {
        setOutputKey(outputKey);
        return this;
    }

    /**
     * <p>
     * The output value.
     * </p>
     * 
     * @param outputValue
     *        The output value.
     */

    public void setOutputValue(String outputValue) {
        this.outputValue = outputValue;
    }

    /**
     * <p>
     * The output value.
     * </p>
     * 
     * @return The output value.
     */

    public String getOutputValue() {
        return this.outputValue;
    }

    /**
     * <p>
     * The output value.
     * </p>
     * 
     * @param outputValue
     *        The output value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordOutput withOutputValue(String outputValue) {
        setOutputValue(outputValue);
        return this;
    }

    /**
     * <p>
     * The description of the output.
     * </p>
     * 
     * @param description
     *        The description of the output.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the output.
     * </p>
     * 
     * @return The description of the output.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the output.
     * </p>
     * 
     * @param description
     *        The description of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordOutput withDescription(String description) {
        setDescription(description);
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
        if (getOutputKey() != null)
            sb.append("OutputKey: ").append(getOutputKey()).append(",");
        if (getOutputValue() != null)
            sb.append("OutputValue: ").append(getOutputValue()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordOutput == false)
            return false;
        RecordOutput other = (RecordOutput) obj;
        if (other.getOutputKey() == null ^ this.getOutputKey() == null)
            return false;
        if (other.getOutputKey() != null && other.getOutputKey().equals(this.getOutputKey()) == false)
            return false;
        if (other.getOutputValue() == null ^ this.getOutputValue() == null)
            return false;
        if (other.getOutputValue() != null && other.getOutputValue().equals(this.getOutputValue()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputKey() == null) ? 0 : getOutputKey().hashCode());
        hashCode = prime * hashCode + ((getOutputValue() == null) ? 0 : getOutputValue().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public RecordOutput clone() {
        try {
            return (RecordOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.RecordOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
