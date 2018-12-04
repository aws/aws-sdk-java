/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the method to use when code signing a file.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeSigning implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the AWSSignerJob which was created to sign the file.
     * </p>
     */
    private String awsSignerJobId;
    /**
     * <p>
     * A custom method for code signing a file.
     * </p>
     */
    private CustomCodeSigning customCodeSigning;

    /**
     * <p>
     * The ID of the AWSSignerJob which was created to sign the file.
     * </p>
     * 
     * @param awsSignerJobId
     *        The ID of the AWSSignerJob which was created to sign the file.
     */

    public void setAwsSignerJobId(String awsSignerJobId) {
        this.awsSignerJobId = awsSignerJobId;
    }

    /**
     * <p>
     * The ID of the AWSSignerJob which was created to sign the file.
     * </p>
     * 
     * @return The ID of the AWSSignerJob which was created to sign the file.
     */

    public String getAwsSignerJobId() {
        return this.awsSignerJobId;
    }

    /**
     * <p>
     * The ID of the AWSSignerJob which was created to sign the file.
     * </p>
     * 
     * @param awsSignerJobId
     *        The ID of the AWSSignerJob which was created to sign the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigning withAwsSignerJobId(String awsSignerJobId) {
        setAwsSignerJobId(awsSignerJobId);
        return this;
    }

    /**
     * <p>
     * A custom method for code signing a file.
     * </p>
     * 
     * @param customCodeSigning
     *        A custom method for code signing a file.
     */

    public void setCustomCodeSigning(CustomCodeSigning customCodeSigning) {
        this.customCodeSigning = customCodeSigning;
    }

    /**
     * <p>
     * A custom method for code signing a file.
     * </p>
     * 
     * @return A custom method for code signing a file.
     */

    public CustomCodeSigning getCustomCodeSigning() {
        return this.customCodeSigning;
    }

    /**
     * <p>
     * A custom method for code signing a file.
     * </p>
     * 
     * @param customCodeSigning
     *        A custom method for code signing a file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigning withCustomCodeSigning(CustomCodeSigning customCodeSigning) {
        setCustomCodeSigning(customCodeSigning);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAwsSignerJobId() != null)
            sb.append("AwsSignerJobId: ").append(getAwsSignerJobId()).append(",");
        if (getCustomCodeSigning() != null)
            sb.append("CustomCodeSigning: ").append(getCustomCodeSigning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeSigning == false)
            return false;
        CodeSigning other = (CodeSigning) obj;
        if (other.getAwsSignerJobId() == null ^ this.getAwsSignerJobId() == null)
            return false;
        if (other.getAwsSignerJobId() != null && other.getAwsSignerJobId().equals(this.getAwsSignerJobId()) == false)
            return false;
        if (other.getCustomCodeSigning() == null ^ this.getCustomCodeSigning() == null)
            return false;
        if (other.getCustomCodeSigning() != null && other.getCustomCodeSigning().equals(this.getCustomCodeSigning()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsSignerJobId() == null) ? 0 : getAwsSignerJobId().hashCode());
        hashCode = prime * hashCode + ((getCustomCodeSigning() == null) ? 0 : getCustomCodeSigning().hashCode());
        return hashCode;
    }

    @Override
    public CodeSigning clone() {
        try {
            return (CodeSigning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.CodeSigningMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
