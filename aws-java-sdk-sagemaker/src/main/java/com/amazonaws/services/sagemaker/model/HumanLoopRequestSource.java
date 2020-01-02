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
 * Container for configuring the source of human task requests.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HumanLoopRequestSource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopRequestSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default field
     * settings and JSON parsing rules are different based on the integration source. Valid values:
     * </p>
     */
    private String awsManagedHumanLoopRequestSource;

    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default field
     * settings and JSON parsing rules are different based on the integration source. Valid values:
     * </p>
     * 
     * @param awsManagedHumanLoopRequestSource
     *        Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default
     *        field settings and JSON parsing rules are different based on the integration source. Valid values:
     * @see AwsManagedHumanLoopRequestSource
     */

    public void setAwsManagedHumanLoopRequestSource(String awsManagedHumanLoopRequestSource) {
        this.awsManagedHumanLoopRequestSource = awsManagedHumanLoopRequestSource;
    }

    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default field
     * settings and JSON parsing rules are different based on the integration source. Valid values:
     * </p>
     * 
     * @return Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default
     *         field settings and JSON parsing rules are different based on the integration source. Valid values:
     * @see AwsManagedHumanLoopRequestSource
     */

    public String getAwsManagedHumanLoopRequestSource() {
        return this.awsManagedHumanLoopRequestSource;
    }

    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default field
     * settings and JSON parsing rules are different based on the integration source. Valid values:
     * </p>
     * 
     * @param awsManagedHumanLoopRequestSource
     *        Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default
     *        field settings and JSON parsing rules are different based on the integration source. Valid values:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsManagedHumanLoopRequestSource
     */

    public HumanLoopRequestSource withAwsManagedHumanLoopRequestSource(String awsManagedHumanLoopRequestSource) {
        setAwsManagedHumanLoopRequestSource(awsManagedHumanLoopRequestSource);
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default field
     * settings and JSON parsing rules are different based on the integration source. Valid values:
     * </p>
     * 
     * @param awsManagedHumanLoopRequestSource
     *        Specifies whether Amazon Rekognition or Amazon Textract are used as the integration source. The default
     *        field settings and JSON parsing rules are different based on the integration source. Valid values:
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsManagedHumanLoopRequestSource
     */

    public HumanLoopRequestSource withAwsManagedHumanLoopRequestSource(AwsManagedHumanLoopRequestSource awsManagedHumanLoopRequestSource) {
        this.awsManagedHumanLoopRequestSource = awsManagedHumanLoopRequestSource.toString();
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
        if (getAwsManagedHumanLoopRequestSource() != null)
            sb.append("AwsManagedHumanLoopRequestSource: ").append(getAwsManagedHumanLoopRequestSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopRequestSource == false)
            return false;
        HumanLoopRequestSource other = (HumanLoopRequestSource) obj;
        if (other.getAwsManagedHumanLoopRequestSource() == null ^ this.getAwsManagedHumanLoopRequestSource() == null)
            return false;
        if (other.getAwsManagedHumanLoopRequestSource() != null
                && other.getAwsManagedHumanLoopRequestSource().equals(this.getAwsManagedHumanLoopRequestSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsManagedHumanLoopRequestSource() == null) ? 0 : getAwsManagedHumanLoopRequestSource().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopRequestSource clone() {
        try {
            return (HumanLoopRequestSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HumanLoopRequestSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
