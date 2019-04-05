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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Returns information about the XML element or attribute that was sanitized in the configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/SanitizationWarning" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SanitizationWarning implements Serializable, Cloneable, StructuredPojo {

    /** The name of the XML attribute that has been sanitized. */
    private String attributeName;
    /** The name of the XML element that has been sanitized. */
    private String elementName;
    /** Required. The reason for which the XML elements or attributes were sanitized. */
    private String reason;

    /**
     * The name of the XML attribute that has been sanitized.
     * 
     * @param attributeName
     *        The name of the XML attribute that has been sanitized.
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * The name of the XML attribute that has been sanitized.
     * 
     * @return The name of the XML attribute that has been sanitized.
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * The name of the XML attribute that has been sanitized.
     * 
     * @param attributeName
     *        The name of the XML attribute that has been sanitized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SanitizationWarning withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * The name of the XML element that has been sanitized.
     * 
     * @param elementName
     *        The name of the XML element that has been sanitized.
     */

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    /**
     * The name of the XML element that has been sanitized.
     * 
     * @return The name of the XML element that has been sanitized.
     */

    public String getElementName() {
        return this.elementName;
    }

    /**
     * The name of the XML element that has been sanitized.
     * 
     * @param elementName
     *        The name of the XML element that has been sanitized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SanitizationWarning withElementName(String elementName) {
        setElementName(elementName);
        return this;
    }

    /**
     * Required. The reason for which the XML elements or attributes were sanitized.
     * 
     * @param reason
     *        Required. The reason for which the XML elements or attributes were sanitized.
     * @see SanitizationWarningReason
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Required. The reason for which the XML elements or attributes were sanitized.
     * 
     * @return Required. The reason for which the XML elements or attributes were sanitized.
     * @see SanitizationWarningReason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * Required. The reason for which the XML elements or attributes were sanitized.
     * 
     * @param reason
     *        Required. The reason for which the XML elements or attributes were sanitized.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SanitizationWarningReason
     */

    public SanitizationWarning withReason(String reason) {
        setReason(reason);
        return this;
    }

    /**
     * Required. The reason for which the XML elements or attributes were sanitized.
     * 
     * @param reason
     *        Required. The reason for which the XML elements or attributes were sanitized.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SanitizationWarningReason
     */

    public SanitizationWarning withReason(SanitizationWarningReason reason) {
        this.reason = reason.toString();
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
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getElementName() != null)
            sb.append("ElementName: ").append(getElementName()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SanitizationWarning == false)
            return false;
        SanitizationWarning other = (SanitizationWarning) obj;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getElementName() == null ^ this.getElementName() == null)
            return false;
        if (other.getElementName() != null && other.getElementName().equals(this.getElementName()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getElementName() == null) ? 0 : getElementName().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public SanitizationWarning clone() {
        try {
            return (SanitizationWarning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.SanitizationWarningMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
