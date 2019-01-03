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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that describes the recipients for an email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array that contains the email addresses of the "To" recipients for the email.
     * </p>
     */
    private java.util.List<String> toAddresses;
    /**
     * <p>
     * An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
     * </p>
     */
    private java.util.List<String> ccAddresses;
    /**
     * <p>
     * An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
     * </p>
     */
    private java.util.List<String> bccAddresses;

    /**
     * <p>
     * An array that contains the email addresses of the "To" recipients for the email.
     * </p>
     * 
     * @return An array that contains the email addresses of the "To" recipients for the email.
     */

    public java.util.List<String> getToAddresses() {
        return toAddresses;
    }

    /**
     * <p>
     * An array that contains the email addresses of the "To" recipients for the email.
     * </p>
     * 
     * @param toAddresses
     *        An array that contains the email addresses of the "To" recipients for the email.
     */

    public void setToAddresses(java.util.Collection<String> toAddresses) {
        if (toAddresses == null) {
            this.toAddresses = null;
            return;
        }

        this.toAddresses = new java.util.ArrayList<String>(toAddresses);
    }

    /**
     * <p>
     * An array that contains the email addresses of the "To" recipients for the email.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setToAddresses(java.util.Collection)} or {@link #withToAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param toAddresses
     *        An array that contains the email addresses of the "To" recipients for the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withToAddresses(String... toAddresses) {
        if (this.toAddresses == null) {
            setToAddresses(new java.util.ArrayList<String>(toAddresses.length));
        }
        for (String ele : toAddresses) {
            this.toAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the email addresses of the "To" recipients for the email.
     * </p>
     * 
     * @param toAddresses
     *        An array that contains the email addresses of the "To" recipients for the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withToAddresses(java.util.Collection<String> toAddresses) {
        setToAddresses(toAddresses);
        return this;
    }

    /**
     * <p>
     * An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
     * </p>
     * 
     * @return An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
     */

    public java.util.List<String> getCcAddresses() {
        return ccAddresses;
    }

    /**
     * <p>
     * An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
     * </p>
     * 
     * @param ccAddresses
     *        An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
     */

    public void setCcAddresses(java.util.Collection<String> ccAddresses) {
        if (ccAddresses == null) {
            this.ccAddresses = null;
            return;
        }

        this.ccAddresses = new java.util.ArrayList<String>(ccAddresses);
    }

    /**
     * <p>
     * An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCcAddresses(java.util.Collection)} or {@link #withCcAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ccAddresses
     *        An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withCcAddresses(String... ccAddresses) {
        if (this.ccAddresses == null) {
            setCcAddresses(new java.util.ArrayList<String>(ccAddresses.length));
        }
        for (String ele : ccAddresses) {
            this.ccAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
     * </p>
     * 
     * @param ccAddresses
     *        An array that contains the email addresses of the "CC" (carbon copy) recipients for the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withCcAddresses(java.util.Collection<String> ccAddresses) {
        setCcAddresses(ccAddresses);
        return this;
    }

    /**
     * <p>
     * An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
     * </p>
     * 
     * @return An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
     */

    public java.util.List<String> getBccAddresses() {
        return bccAddresses;
    }

    /**
     * <p>
     * An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
     * </p>
     * 
     * @param bccAddresses
     *        An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
     */

    public void setBccAddresses(java.util.Collection<String> bccAddresses) {
        if (bccAddresses == null) {
            this.bccAddresses = null;
            return;
        }

        this.bccAddresses = new java.util.ArrayList<String>(bccAddresses);
    }

    /**
     * <p>
     * An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBccAddresses(java.util.Collection)} or {@link #withBccAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bccAddresses
     *        An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withBccAddresses(String... bccAddresses) {
        if (this.bccAddresses == null) {
            setBccAddresses(new java.util.ArrayList<String>(bccAddresses.length));
        }
        for (String ele : bccAddresses) {
            this.bccAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
     * </p>
     * 
     * @param bccAddresses
     *        An array that contains the email addresses of the "BCC" (blind carbon copy) recipients for the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withBccAddresses(java.util.Collection<String> bccAddresses) {
        setBccAddresses(bccAddresses);
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
        if (getToAddresses() != null)
            sb.append("ToAddresses: ").append(getToAddresses()).append(",");
        if (getCcAddresses() != null)
            sb.append("CcAddresses: ").append(getCcAddresses()).append(",");
        if (getBccAddresses() != null)
            sb.append("BccAddresses: ").append(getBccAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;
        if (other.getToAddresses() == null ^ this.getToAddresses() == null)
            return false;
        if (other.getToAddresses() != null && other.getToAddresses().equals(this.getToAddresses()) == false)
            return false;
        if (other.getCcAddresses() == null ^ this.getCcAddresses() == null)
            return false;
        if (other.getCcAddresses() != null && other.getCcAddresses().equals(this.getCcAddresses()) == false)
            return false;
        if (other.getBccAddresses() == null ^ this.getBccAddresses() == null)
            return false;
        if (other.getBccAddresses() != null && other.getBccAddresses().equals(this.getBccAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getToAddresses() == null) ? 0 : getToAddresses().hashCode());
        hashCode = prime * hashCode + ((getCcAddresses() == null) ? 0 : getCcAddresses().hashCode());
        hashCode = prime * hashCode + ((getBccAddresses() == null) ? 0 : getBccAddresses().hashCode());
        return hashCode;
    }

    @Override
    public Destination clone() {
        try {
            return (Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
