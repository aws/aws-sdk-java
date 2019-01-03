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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an association status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/AssociationStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date when the status changed.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The reason for the status.
     * </p>
     */
    private String message;
    /**
     * <p>
     * A user-defined string.
     * </p>
     */
    private String additionalInfo;

    /**
     * <p>
     * The date when the status changed.
     * </p>
     * 
     * @param date
     *        The date when the status changed.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date when the status changed.
     * </p>
     * 
     * @return The date when the status changed.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date when the status changed.
     * </p>
     * 
     * @param date
     *        The date when the status changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationStatus withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param name
     *        The status.
     * @see AssociationStatusName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see AssociationStatusName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param name
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatusName
     */

    public AssociationStatus withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param name
     *        The status.
     * @see AssociationStatusName
     */

    public void setName(AssociationStatusName name) {
        withName(name);
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param name
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationStatusName
     */

    public AssociationStatus withName(AssociationStatusName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the status.
     * </p>
     * 
     * @param message
     *        The reason for the status.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The reason for the status.
     * </p>
     * 
     * @return The reason for the status.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The reason for the status.
     * </p>
     * 
     * @param message
     *        The reason for the status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationStatus withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * A user-defined string.
     * </p>
     * 
     * @param additionalInfo
     *        A user-defined string.
     */

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * A user-defined string.
     * </p>
     * 
     * @return A user-defined string.
     */

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * <p>
     * A user-defined string.
     * </p>
     * 
     * @param additionalInfo
     *        A user-defined string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationStatus withAdditionalInfo(String additionalInfo) {
        setAdditionalInfo(additionalInfo);
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
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationStatus == false)
            return false;
        AssociationStatus other = (AssociationStatus) obj;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        return hashCode;
    }

    @Override
    public AssociationStatus clone() {
        try {
            return (AssociationStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.AssociationStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
