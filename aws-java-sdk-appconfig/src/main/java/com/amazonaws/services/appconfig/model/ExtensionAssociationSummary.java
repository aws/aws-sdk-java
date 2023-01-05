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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an association between an extension and an AppConfig resource such as an application, environment,
 * or configuration profile. Call <code>GetExtensionAssociation</code> to get more information about an association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ExtensionAssociationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExtensionAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The extension association ID. This ID is used to call other <code>ExtensionAssociation</code> API actions such as
     * <code>GetExtensionAssociation</code> or <code>DeleteExtensionAssociation</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     */
    private String extensionArn;
    /**
     * <p>
     * The ARNs of applications, configuration profiles, or environments defined in the association.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The extension association ID. This ID is used to call other <code>ExtensionAssociation</code> API actions such as
     * <code>GetExtensionAssociation</code> or <code>DeleteExtensionAssociation</code>.
     * </p>
     * 
     * @param id
     *        The extension association ID. This ID is used to call other <code>ExtensionAssociation</code> API actions
     *        such as <code>GetExtensionAssociation</code> or <code>DeleteExtensionAssociation</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The extension association ID. This ID is used to call other <code>ExtensionAssociation</code> API actions such as
     * <code>GetExtensionAssociation</code> or <code>DeleteExtensionAssociation</code>.
     * </p>
     * 
     * @return The extension association ID. This ID is used to call other <code>ExtensionAssociation</code> API actions
     *         such as <code>GetExtensionAssociation</code> or <code>DeleteExtensionAssociation</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The extension association ID. This ID is used to call other <code>ExtensionAssociation</code> API actions such as
     * <code>GetExtensionAssociation</code> or <code>DeleteExtensionAssociation</code>.
     * </p>
     * 
     * @param id
     *        The extension association ID. This ID is used to call other <code>ExtensionAssociation</code> API actions
     *        such as <code>GetExtensionAssociation</code> or <code>DeleteExtensionAssociation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionAssociationSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     * 
     * @param extensionArn
     *        The system-generated Amazon Resource Name (ARN) for the extension.
     */

    public void setExtensionArn(String extensionArn) {
        this.extensionArn = extensionArn;
    }

    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     * 
     * @return The system-generated Amazon Resource Name (ARN) for the extension.
     */

    public String getExtensionArn() {
        return this.extensionArn;
    }

    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     * 
     * @param extensionArn
     *        The system-generated Amazon Resource Name (ARN) for the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionAssociationSummary withExtensionArn(String extensionArn) {
        setExtensionArn(extensionArn);
        return this;
    }

    /**
     * <p>
     * The ARNs of applications, configuration profiles, or environments defined in the association.
     * </p>
     * 
     * @param resourceArn
     *        The ARNs of applications, configuration profiles, or environments defined in the association.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARNs of applications, configuration profiles, or environments defined in the association.
     * </p>
     * 
     * @return The ARNs of applications, configuration profiles, or environments defined in the association.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARNs of applications, configuration profiles, or environments defined in the association.
     * </p>
     * 
     * @param resourceArn
     *        The ARNs of applications, configuration profiles, or environments defined in the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExtensionAssociationSummary withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getExtensionArn() != null)
            sb.append("ExtensionArn: ").append(getExtensionArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtensionAssociationSummary == false)
            return false;
        ExtensionAssociationSummary other = (ExtensionAssociationSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getExtensionArn() == null ^ this.getExtensionArn() == null)
            return false;
        if (other.getExtensionArn() != null && other.getExtensionArn().equals(this.getExtensionArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getExtensionArn() == null) ? 0 : getExtensionArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public ExtensionAssociationSummary clone() {
        try {
            return (ExtensionAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appconfig.model.transform.ExtensionAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
