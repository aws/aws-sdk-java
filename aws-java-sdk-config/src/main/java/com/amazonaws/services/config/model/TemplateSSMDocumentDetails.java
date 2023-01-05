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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This API allows you to create a conformance pack template with an Amazon Web Services Systems Manager document (SSM
 * document). To deploy a conformance pack using an SSM document, first create an SSM document with conformance pack
 * content, and then provide the <code>DocumentName</code> in the <a
 * href="https://docs.aws.amazon.com/config/latest/APIReference/API_PutConformancePack.html">PutConformancePack API</a>.
 * You can also provide the <code>DocumentVersion</code>.
 * </p>
 * <p>
 * The <code>TemplateSSMDocumentDetails</code> object contains the name of the SSM document and the version of the SSM
 * document.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/TemplateSSMDocumentDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateSSMDocumentDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the SSM document to use to create a conformance pack. If you use the
     * document name, Config checks only your account and Amazon Web Services Region for the SSM document. If you want
     * to use an SSM document from another Region or account, you must provide the ARN.
     * </p>
     */
    private String documentName;
    /**
     * <p>
     * The version of the SSM document to use to create a conformance pack. By default, Config uses the latest version.
     * </p>
     * <note>
     * <p>
     * This field is optional.
     * </p>
     * </note>
     */
    private String documentVersion;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the SSM document to use to create a conformance pack. If you use the
     * document name, Config checks only your account and Amazon Web Services Region for the SSM document. If you want
     * to use an SSM document from another Region or account, you must provide the ARN.
     * </p>
     * 
     * @param documentName
     *        The name or Amazon Resource Name (ARN) of the SSM document to use to create a conformance pack. If you use
     *        the document name, Config checks only your account and Amazon Web Services Region for the SSM document. If
     *        you want to use an SSM document from another Region or account, you must provide the ARN.
     */

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the SSM document to use to create a conformance pack. If you use the
     * document name, Config checks only your account and Amazon Web Services Region for the SSM document. If you want
     * to use an SSM document from another Region or account, you must provide the ARN.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the SSM document to use to create a conformance pack. If you
     *         use the document name, Config checks only your account and Amazon Web Services Region for the SSM
     *         document. If you want to use an SSM document from another Region or account, you must provide the ARN.
     */

    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the SSM document to use to create a conformance pack. If you use the
     * document name, Config checks only your account and Amazon Web Services Region for the SSM document. If you want
     * to use an SSM document from another Region or account, you must provide the ARN.
     * </p>
     * 
     * @param documentName
     *        The name or Amazon Resource Name (ARN) of the SSM document to use to create a conformance pack. If you use
     *        the document name, Config checks only your account and Amazon Web Services Region for the SSM document. If
     *        you want to use an SSM document from another Region or account, you must provide the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSSMDocumentDetails withDocumentName(String documentName) {
        setDocumentName(documentName);
        return this;
    }

    /**
     * <p>
     * The version of the SSM document to use to create a conformance pack. By default, Config uses the latest version.
     * </p>
     * <note>
     * <p>
     * This field is optional.
     * </p>
     * </note>
     * 
     * @param documentVersion
     *        The version of the SSM document to use to create a conformance pack. By default, Config uses the latest
     *        version.</p> <note>
     *        <p>
     *        This field is optional.
     *        </p>
     */

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    /**
     * <p>
     * The version of the SSM document to use to create a conformance pack. By default, Config uses the latest version.
     * </p>
     * <note>
     * <p>
     * This field is optional.
     * </p>
     * </note>
     * 
     * @return The version of the SSM document to use to create a conformance pack. By default, Config uses the latest
     *         version.</p> <note>
     *         <p>
     *         This field is optional.
     *         </p>
     */

    public String getDocumentVersion() {
        return this.documentVersion;
    }

    /**
     * <p>
     * The version of the SSM document to use to create a conformance pack. By default, Config uses the latest version.
     * </p>
     * <note>
     * <p>
     * This field is optional.
     * </p>
     * </note>
     * 
     * @param documentVersion
     *        The version of the SSM document to use to create a conformance pack. By default, Config uses the latest
     *        version.</p> <note>
     *        <p>
     *        This field is optional.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateSSMDocumentDetails withDocumentVersion(String documentVersion) {
        setDocumentVersion(documentVersion);
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
        if (getDocumentName() != null)
            sb.append("DocumentName: ").append(getDocumentName()).append(",");
        if (getDocumentVersion() != null)
            sb.append("DocumentVersion: ").append(getDocumentVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateSSMDocumentDetails == false)
            return false;
        TemplateSSMDocumentDetails other = (TemplateSSMDocumentDetails) obj;
        if (other.getDocumentName() == null ^ this.getDocumentName() == null)
            return false;
        if (other.getDocumentName() != null && other.getDocumentName().equals(this.getDocumentName()) == false)
            return false;
        if (other.getDocumentVersion() == null ^ this.getDocumentVersion() == null)
            return false;
        if (other.getDocumentVersion() != null && other.getDocumentVersion().equals(this.getDocumentVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentName() == null) ? 0 : getDocumentName().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersion() == null) ? 0 : getDocumentVersion().hashCode());
        return hashCode;
    }

    @Override
    public TemplateSSMDocumentDetails clone() {
        try {
            return (TemplateSSMDocumentDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.TemplateSSMDocumentDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
