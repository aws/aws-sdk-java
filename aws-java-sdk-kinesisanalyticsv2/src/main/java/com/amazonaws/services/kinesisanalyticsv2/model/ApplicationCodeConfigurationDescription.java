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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes code configuration for a Java-based Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationCodeConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationCodeConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether the code content is in text or zip format.
     * </p>
     */
    private String codeContentType;
    /**
     * <p>
     * Describes details about the location and format of the application code.
     * </p>
     */
    private CodeContentDescription codeContentDescription;

    /**
     * <p>
     * Specifies whether the code content is in text or zip format.
     * </p>
     * 
     * @param codeContentType
     *        Specifies whether the code content is in text or zip format.
     * @see CodeContentType
     */

    public void setCodeContentType(String codeContentType) {
        this.codeContentType = codeContentType;
    }

    /**
     * <p>
     * Specifies whether the code content is in text or zip format.
     * </p>
     * 
     * @return Specifies whether the code content is in text or zip format.
     * @see CodeContentType
     */

    public String getCodeContentType() {
        return this.codeContentType;
    }

    /**
     * <p>
     * Specifies whether the code content is in text or zip format.
     * </p>
     * 
     * @param codeContentType
     *        Specifies whether the code content is in text or zip format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodeContentType
     */

    public ApplicationCodeConfigurationDescription withCodeContentType(String codeContentType) {
        setCodeContentType(codeContentType);
        return this;
    }

    /**
     * <p>
     * Specifies whether the code content is in text or zip format.
     * </p>
     * 
     * @param codeContentType
     *        Specifies whether the code content is in text or zip format.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodeContentType
     */

    public ApplicationCodeConfigurationDescription withCodeContentType(CodeContentType codeContentType) {
        this.codeContentType = codeContentType.toString();
        return this;
    }

    /**
     * <p>
     * Describes details about the location and format of the application code.
     * </p>
     * 
     * @param codeContentDescription
     *        Describes details about the location and format of the application code.
     */

    public void setCodeContentDescription(CodeContentDescription codeContentDescription) {
        this.codeContentDescription = codeContentDescription;
    }

    /**
     * <p>
     * Describes details about the location and format of the application code.
     * </p>
     * 
     * @return Describes details about the location and format of the application code.
     */

    public CodeContentDescription getCodeContentDescription() {
        return this.codeContentDescription;
    }

    /**
     * <p>
     * Describes details about the location and format of the application code.
     * </p>
     * 
     * @param codeContentDescription
     *        Describes details about the location and format of the application code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationCodeConfigurationDescription withCodeContentDescription(CodeContentDescription codeContentDescription) {
        setCodeContentDescription(codeContentDescription);
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
        if (getCodeContentType() != null)
            sb.append("CodeContentType: ").append(getCodeContentType()).append(",");
        if (getCodeContentDescription() != null)
            sb.append("CodeContentDescription: ").append(getCodeContentDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationCodeConfigurationDescription == false)
            return false;
        ApplicationCodeConfigurationDescription other = (ApplicationCodeConfigurationDescription) obj;
        if (other.getCodeContentType() == null ^ this.getCodeContentType() == null)
            return false;
        if (other.getCodeContentType() != null && other.getCodeContentType().equals(this.getCodeContentType()) == false)
            return false;
        if (other.getCodeContentDescription() == null ^ this.getCodeContentDescription() == null)
            return false;
        if (other.getCodeContentDescription() != null && other.getCodeContentDescription().equals(this.getCodeContentDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeContentType() == null) ? 0 : getCodeContentType().hashCode());
        hashCode = prime * hashCode + ((getCodeContentDescription() == null) ? 0 : getCodeContentDescription().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationCodeConfigurationDescription clone() {
        try {
            return (ApplicationCodeConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationCodeConfigurationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
