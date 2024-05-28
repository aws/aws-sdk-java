/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Cybersecurity and Infrastructure Security Agency (CISA) details for a specific vulnerability.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisaData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisaData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The remediation action recommended by CISA for this vulnerability.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The date and time CISA added this vulnerability to their catalogue.
     * </p>
     */
    private java.util.Date dateAdded;
    /**
     * <p>
     * The date and time CISA expects a fix to have been provided vulnerability.
     * </p>
     */
    private java.util.Date dateDue;

    /**
     * <p>
     * The remediation action recommended by CISA for this vulnerability.
     * </p>
     * 
     * @param action
     *        The remediation action recommended by CISA for this vulnerability.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The remediation action recommended by CISA for this vulnerability.
     * </p>
     * 
     * @return The remediation action recommended by CISA for this vulnerability.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The remediation action recommended by CISA for this vulnerability.
     * </p>
     * 
     * @param action
     *        The remediation action recommended by CISA for this vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisaData withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The date and time CISA added this vulnerability to their catalogue.
     * </p>
     * 
     * @param dateAdded
     *        The date and time CISA added this vulnerability to their catalogue.
     */

    public void setDateAdded(java.util.Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    /**
     * <p>
     * The date and time CISA added this vulnerability to their catalogue.
     * </p>
     * 
     * @return The date and time CISA added this vulnerability to their catalogue.
     */

    public java.util.Date getDateAdded() {
        return this.dateAdded;
    }

    /**
     * <p>
     * The date and time CISA added this vulnerability to their catalogue.
     * </p>
     * 
     * @param dateAdded
     *        The date and time CISA added this vulnerability to their catalogue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisaData withDateAdded(java.util.Date dateAdded) {
        setDateAdded(dateAdded);
        return this;
    }

    /**
     * <p>
     * The date and time CISA expects a fix to have been provided vulnerability.
     * </p>
     * 
     * @param dateDue
     *        The date and time CISA expects a fix to have been provided vulnerability.
     */

    public void setDateDue(java.util.Date dateDue) {
        this.dateDue = dateDue;
    }

    /**
     * <p>
     * The date and time CISA expects a fix to have been provided vulnerability.
     * </p>
     * 
     * @return The date and time CISA expects a fix to have been provided vulnerability.
     */

    public java.util.Date getDateDue() {
        return this.dateDue;
    }

    /**
     * <p>
     * The date and time CISA expects a fix to have been provided vulnerability.
     * </p>
     * 
     * @param dateDue
     *        The date and time CISA expects a fix to have been provided vulnerability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisaData withDateDue(java.util.Date dateDue) {
        setDateDue(dateDue);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getDateAdded() != null)
            sb.append("DateAdded: ").append(getDateAdded()).append(",");
        if (getDateDue() != null)
            sb.append("DateDue: ").append(getDateDue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisaData == false)
            return false;
        CisaData other = (CisaData) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getDateAdded() == null ^ this.getDateAdded() == null)
            return false;
        if (other.getDateAdded() != null && other.getDateAdded().equals(this.getDateAdded()) == false)
            return false;
        if (other.getDateDue() == null ^ this.getDateDue() == null)
            return false;
        if (other.getDateDue() != null && other.getDateDue().equals(this.getDateDue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getDateAdded() == null) ? 0 : getDateAdded().hashCode());
        hashCode = prime * hashCode + ((getDateDue() == null) ? 0 : getDateDue().hashCode());
        return hashCode;
    }

    @Override
    public CisaData clone() {
        try {
            return (CisaData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisaDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
