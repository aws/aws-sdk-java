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
 * Describes updates to a Java-based Amazon Kinesis Data Analytics application.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ApplicationCodeConfigurationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationCodeConfigurationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes updates to the code content type.
     * </p>
     */
    private String codeContentTypeUpdate;
    /**
     * <p>
     * Describes updates to the code content of an application.
     * </p>
     */
    private CodeContentUpdate codeContentUpdate;

    /**
     * <p>
     * Describes updates to the code content type.
     * </p>
     * 
     * @param codeContentTypeUpdate
     *        Describes updates to the code content type.
     * @see CodeContentType
     */

    public void setCodeContentTypeUpdate(String codeContentTypeUpdate) {
        this.codeContentTypeUpdate = codeContentTypeUpdate;
    }

    /**
     * <p>
     * Describes updates to the code content type.
     * </p>
     * 
     * @return Describes updates to the code content type.
     * @see CodeContentType
     */

    public String getCodeContentTypeUpdate() {
        return this.codeContentTypeUpdate;
    }

    /**
     * <p>
     * Describes updates to the code content type.
     * </p>
     * 
     * @param codeContentTypeUpdate
     *        Describes updates to the code content type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodeContentType
     */

    public ApplicationCodeConfigurationUpdate withCodeContentTypeUpdate(String codeContentTypeUpdate) {
        setCodeContentTypeUpdate(codeContentTypeUpdate);
        return this;
    }

    /**
     * <p>
     * Describes updates to the code content type.
     * </p>
     * 
     * @param codeContentTypeUpdate
     *        Describes updates to the code content type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CodeContentType
     */

    public ApplicationCodeConfigurationUpdate withCodeContentTypeUpdate(CodeContentType codeContentTypeUpdate) {
        this.codeContentTypeUpdate = codeContentTypeUpdate.toString();
        return this;
    }

    /**
     * <p>
     * Describes updates to the code content of an application.
     * </p>
     * 
     * @param codeContentUpdate
     *        Describes updates to the code content of an application.
     */

    public void setCodeContentUpdate(CodeContentUpdate codeContentUpdate) {
        this.codeContentUpdate = codeContentUpdate;
    }

    /**
     * <p>
     * Describes updates to the code content of an application.
     * </p>
     * 
     * @return Describes updates to the code content of an application.
     */

    public CodeContentUpdate getCodeContentUpdate() {
        return this.codeContentUpdate;
    }

    /**
     * <p>
     * Describes updates to the code content of an application.
     * </p>
     * 
     * @param codeContentUpdate
     *        Describes updates to the code content of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationCodeConfigurationUpdate withCodeContentUpdate(CodeContentUpdate codeContentUpdate) {
        setCodeContentUpdate(codeContentUpdate);
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
        if (getCodeContentTypeUpdate() != null)
            sb.append("CodeContentTypeUpdate: ").append(getCodeContentTypeUpdate()).append(",");
        if (getCodeContentUpdate() != null)
            sb.append("CodeContentUpdate: ").append(getCodeContentUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationCodeConfigurationUpdate == false)
            return false;
        ApplicationCodeConfigurationUpdate other = (ApplicationCodeConfigurationUpdate) obj;
        if (other.getCodeContentTypeUpdate() == null ^ this.getCodeContentTypeUpdate() == null)
            return false;
        if (other.getCodeContentTypeUpdate() != null && other.getCodeContentTypeUpdate().equals(this.getCodeContentTypeUpdate()) == false)
            return false;
        if (other.getCodeContentUpdate() == null ^ this.getCodeContentUpdate() == null)
            return false;
        if (other.getCodeContentUpdate() != null && other.getCodeContentUpdate().equals(this.getCodeContentUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeContentTypeUpdate() == null) ? 0 : getCodeContentTypeUpdate().hashCode());
        hashCode = prime * hashCode + ((getCodeContentUpdate() == null) ? 0 : getCodeContentUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationCodeConfigurationUpdate clone() {
        try {
            return (ApplicationCodeConfigurationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ApplicationCodeConfigurationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
