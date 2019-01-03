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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <p>
 * Identity information for the EC2 instance that is hosting the task runner. You can get this value by calling a
 * metadata URI from the EC2 instance. For more information, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html">Instance Metadata</a> in
 * the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your task runner is running on
 * an EC2 instance, and ensures the proper AWS Data Pipeline service charges are applied to your pipeline.
 * </p>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/InstanceIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of an EC2 instance that is generated when the instance is launched and exposed to the instance via
     * the instance metadata service in the form of a JSON representation of an object.
     * </p>
     */
    private String document;
    /**
     * <p>
     * A signature which can be used to verify the accuracy and authenticity of the information provided in the instance
     * identity document.
     * </p>
     */
    private String signature;

    /**
     * <p>
     * A description of an EC2 instance that is generated when the instance is launched and exposed to the instance via
     * the instance metadata service in the form of a JSON representation of an object.
     * </p>
     * 
     * @param document
     *        A description of an EC2 instance that is generated when the instance is launched and exposed to the
     *        instance via the instance metadata service in the form of a JSON representation of an object.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * A description of an EC2 instance that is generated when the instance is launched and exposed to the instance via
     * the instance metadata service in the form of a JSON representation of an object.
     * </p>
     * 
     * @return A description of an EC2 instance that is generated when the instance is launched and exposed to the
     *         instance via the instance metadata service in the form of a JSON representation of an object.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * A description of an EC2 instance that is generated when the instance is launched and exposed to the instance via
     * the instance metadata service in the form of a JSON representation of an object.
     * </p>
     * 
     * @param document
     *        A description of an EC2 instance that is generated when the instance is launched and exposed to the
     *        instance via the instance metadata service in the form of a JSON representation of an object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceIdentity withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * A signature which can be used to verify the accuracy and authenticity of the information provided in the instance
     * identity document.
     * </p>
     * 
     * @param signature
     *        A signature which can be used to verify the accuracy and authenticity of the information provided in the
     *        instance identity document.
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * A signature which can be used to verify the accuracy and authenticity of the information provided in the instance
     * identity document.
     * </p>
     * 
     * @return A signature which can be used to verify the accuracy and authenticity of the information provided in the
     *         instance identity document.
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * A signature which can be used to verify the accuracy and authenticity of the information provided in the instance
     * identity document.
     * </p>
     * 
     * @param signature
     *        A signature which can be used to verify the accuracy and authenticity of the information provided in the
     *        instance identity document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceIdentity withSignature(String signature) {
        setSignature(signature);
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
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceIdentity == false)
            return false;
        InstanceIdentity other = (InstanceIdentity) obj;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode());
        return hashCode;
    }

    @Override
    public InstanceIdentity clone() {
        try {
            return (InstanceIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datapipeline.model.transform.InstanceIdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
