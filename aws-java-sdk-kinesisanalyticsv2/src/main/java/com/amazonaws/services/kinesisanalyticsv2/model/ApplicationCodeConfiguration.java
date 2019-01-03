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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationCodeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationCodeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The location and type of the application code.
     * </p>
     */
    private CodeContent codeContent;
    /**
     * <p>
     * Specifies whether the code content is in text or zip format.
     * </p>
     */
    private String codeContentType;

    /**
     * <p>
     * The location and type of the application code.
     * </p>
     * 
     * @param codeContent
     *        The location and type of the application code.
     */

    public void setCodeContent(CodeContent codeContent) {
        this.codeContent = codeContent;
    }

    /**
     * <p>
     * The location and type of the application code.
     * </p>
     * 
     * @return The location and type of the application code.
     */

    public CodeContent getCodeContent() {
        return this.codeContent;
    }

    /**
     * <p>
     * The location and type of the application code.
     * </p>
     * 
     * @param codeContent
     *        The location and type of the application code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationCodeConfiguration withCodeContent(CodeContent codeContent) {
        setCodeContent(codeContent);
        return this;
    }

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

    public ApplicationCodeConfiguration withCodeContentType(String codeContentType) {
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

    public ApplicationCodeConfiguration withCodeContentType(CodeContentType codeContentType) {
        this.codeContentType = codeContentType.toString();
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
        if (getCodeContent() != null)
            sb.append("CodeContent: ").append(getCodeContent()).append(",");
        if (getCodeContentType() != null)
            sb.append("CodeContentType: ").append(getCodeContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationCodeConfiguration == false)
            return false;
        ApplicationCodeConfiguration other = (ApplicationCodeConfiguration) obj;
        if (other.getCodeContent() == null ^ this.getCodeContent() == null)
            return false;
        if (other.getCodeContent() != null && other.getCodeContent().equals(this.getCodeContent()) == false)
            return false;
        if (other.getCodeContentType() == null ^ this.getCodeContentType() == null)
            return false;
        if (other.getCodeContentType() != null && other.getCodeContentType().equals(this.getCodeContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeContent() == null) ? 0 : getCodeContent().hashCode());
        hashCode = prime * hashCode + ((getCodeContentType() == null) ? 0 : getCodeContentType().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationCodeConfiguration clone() {
        try {
            return (ApplicationCodeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationCodeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
