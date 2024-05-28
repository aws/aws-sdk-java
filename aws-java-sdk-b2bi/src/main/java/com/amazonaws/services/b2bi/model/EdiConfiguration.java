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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the details for the EDI (electronic data interchange) transformation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/EdiConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdiConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     */
    private EdiType type;
    /**
     * <p>
     * Contains the Amazon S3 bucket and prefix for the location of the input file, which is contained in an
     * <code>S3Location</code> object.
     * </p>
     */
    private S3Location inputLocation;
    /**
     * <p>
     * Contains the Amazon S3 bucket and prefix for the location of the output file, which is contained in an
     * <code>S3Location</code> object.
     * </p>
     */
    private S3Location outputLocation;
    /**
     * <p>
     * Returns the system-assigned unique identifier for the transformer.
     * </p>
     */
    private String transformerId;

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Returns the type of the capability. Currently, only <code>edi</code> is supported.
     */

    public void setType(EdiType type) {
        this.type = type;
    }

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @return Returns the type of the capability. Currently, only <code>edi</code> is supported.
     */

    public EdiType getType() {
        return this.type;
    }

    /**
     * <p>
     * Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * </p>
     * 
     * @param type
     *        Returns the type of the capability. Currently, only <code>edi</code> is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdiConfiguration withType(EdiType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Contains the Amazon S3 bucket and prefix for the location of the input file, which is contained in an
     * <code>S3Location</code> object.
     * </p>
     * 
     * @param inputLocation
     *        Contains the Amazon S3 bucket and prefix for the location of the input file, which is contained in an
     *        <code>S3Location</code> object.
     */

    public void setInputLocation(S3Location inputLocation) {
        this.inputLocation = inputLocation;
    }

    /**
     * <p>
     * Contains the Amazon S3 bucket and prefix for the location of the input file, which is contained in an
     * <code>S3Location</code> object.
     * </p>
     * 
     * @return Contains the Amazon S3 bucket and prefix for the location of the input file, which is contained in an
     *         <code>S3Location</code> object.
     */

    public S3Location getInputLocation() {
        return this.inputLocation;
    }

    /**
     * <p>
     * Contains the Amazon S3 bucket and prefix for the location of the input file, which is contained in an
     * <code>S3Location</code> object.
     * </p>
     * 
     * @param inputLocation
     *        Contains the Amazon S3 bucket and prefix for the location of the input file, which is contained in an
     *        <code>S3Location</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdiConfiguration withInputLocation(S3Location inputLocation) {
        setInputLocation(inputLocation);
        return this;
    }

    /**
     * <p>
     * Contains the Amazon S3 bucket and prefix for the location of the output file, which is contained in an
     * <code>S3Location</code> object.
     * </p>
     * 
     * @param outputLocation
     *        Contains the Amazon S3 bucket and prefix for the location of the output file, which is contained in an
     *        <code>S3Location</code> object.
     */

    public void setOutputLocation(S3Location outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * Contains the Amazon S3 bucket and prefix for the location of the output file, which is contained in an
     * <code>S3Location</code> object.
     * </p>
     * 
     * @return Contains the Amazon S3 bucket and prefix for the location of the output file, which is contained in an
     *         <code>S3Location</code> object.
     */

    public S3Location getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * Contains the Amazon S3 bucket and prefix for the location of the output file, which is contained in an
     * <code>S3Location</code> object.
     * </p>
     * 
     * @param outputLocation
     *        Contains the Amazon S3 bucket and prefix for the location of the output file, which is contained in an
     *        <code>S3Location</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdiConfiguration withOutputLocation(S3Location outputLocation) {
        setOutputLocation(outputLocation);
        return this;
    }

    /**
     * <p>
     * Returns the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @param transformerId
     *        Returns the system-assigned unique identifier for the transformer.
     */

    public void setTransformerId(String transformerId) {
        this.transformerId = transformerId;
    }

    /**
     * <p>
     * Returns the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @return Returns the system-assigned unique identifier for the transformer.
     */

    public String getTransformerId() {
        return this.transformerId;
    }

    /**
     * <p>
     * Returns the system-assigned unique identifier for the transformer.
     * </p>
     * 
     * @param transformerId
     *        Returns the system-assigned unique identifier for the transformer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdiConfiguration withTransformerId(String transformerId) {
        setTransformerId(transformerId);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getInputLocation() != null)
            sb.append("InputLocation: ").append(getInputLocation()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation()).append(",");
        if (getTransformerId() != null)
            sb.append("TransformerId: ").append(getTransformerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EdiConfiguration == false)
            return false;
        EdiConfiguration other = (EdiConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getInputLocation() == null ^ this.getInputLocation() == null)
            return false;
        if (other.getInputLocation() != null && other.getInputLocation().equals(this.getInputLocation()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        if (other.getTransformerId() == null ^ this.getTransformerId() == null)
            return false;
        if (other.getTransformerId() != null && other.getTransformerId().equals(this.getTransformerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getInputLocation() == null) ? 0 : getInputLocation().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        hashCode = prime * hashCode + ((getTransformerId() == null) ? 0 : getTransformerId().hashCode());
        return hashCode;
    }

    @Override
    public EdiConfiguration clone() {
        try {
            return (EdiConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.b2bi.model.transform.EdiConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
