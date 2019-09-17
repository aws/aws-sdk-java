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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Contains details about the output groups specified in the job settings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/OutputGroupDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputGroupDetail implements Serializable, Cloneable, StructuredPojo {

    /** Details about the output */
    private java.util.List<OutputDetail> outputDetails;

    /**
     * Details about the output
     * 
     * @return Details about the output
     */

    public java.util.List<OutputDetail> getOutputDetails() {
        return outputDetails;
    }

    /**
     * Details about the output
     * 
     * @param outputDetails
     *        Details about the output
     */

    public void setOutputDetails(java.util.Collection<OutputDetail> outputDetails) {
        if (outputDetails == null) {
            this.outputDetails = null;
            return;
        }

        this.outputDetails = new java.util.ArrayList<OutputDetail>(outputDetails);
    }

    /**
     * Details about the output
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputDetails(java.util.Collection)} or {@link #withOutputDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputDetails
     *        Details about the output
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupDetail withOutputDetails(OutputDetail... outputDetails) {
        if (this.outputDetails == null) {
            setOutputDetails(new java.util.ArrayList<OutputDetail>(outputDetails.length));
        }
        for (OutputDetail ele : outputDetails) {
            this.outputDetails.add(ele);
        }
        return this;
    }

    /**
     * Details about the output
     * 
     * @param outputDetails
     *        Details about the output
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputGroupDetail withOutputDetails(java.util.Collection<OutputDetail> outputDetails) {
        setOutputDetails(outputDetails);
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
        if (getOutputDetails() != null)
            sb.append("OutputDetails: ").append(getOutputDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputGroupDetail == false)
            return false;
        OutputGroupDetail other = (OutputGroupDetail) obj;
        if (other.getOutputDetails() == null ^ this.getOutputDetails() == null)
            return false;
        if (other.getOutputDetails() != null && other.getOutputDetails().equals(this.getOutputDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputDetails() == null) ? 0 : getOutputDetails().hashCode());
        return hashCode;
    }

    @Override
    public OutputGroupDetail clone() {
        try {
            return (OutputGroupDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.OutputGroupDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
