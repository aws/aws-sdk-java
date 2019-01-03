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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the destination of the message, consisting of To:, CC:, and BCC: fields.
 * </p>
 * <note>
 * <p>
 * Amazon SES does not support the SMTPUTF8 extension, as described in <a
 * href="https://tools.ietf.org/html/rfc6531">RFC6531</a>. For this reason, the <i>local part</i> of a destination email
 * address (the part of the email address that precedes the @ sign) may only contain <a
 * href="https://en.wikipedia.org/wiki/Email_address#Local-part">7-bit ASCII characters</a>. If the <i>domain part</i>
 * of an address (the part after the @ sign) contains non-ASCII characters, they must be encoded using Punycode, as
 * described in <a href="https://tools.ietf.org/html/rfc3492.html">RFC3492</a>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Destination implements Serializable, Cloneable {

    /**
     * <p>
     * The To: field(s) of the message.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> toAddresses;
    /**
     * <p>
     * The CC: field(s) of the message.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ccAddresses;
    /**
     * <p>
     * The BCC: field(s) of the message.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> bccAddresses;

    /**
     * Default constructor for Destination object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public Destination() {
    }

    /**
     * Constructs a new Destination object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param toAddresses
     *        The To: field(s) of the message.
     */
    public Destination(java.util.List<String> toAddresses) {
        setToAddresses(toAddresses);
    }

    /**
     * <p>
     * The To: field(s) of the message.
     * </p>
     * 
     * @return The To: field(s) of the message.
     */

    public java.util.List<String> getToAddresses() {
        if (toAddresses == null) {
            toAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return toAddresses;
    }

    /**
     * <p>
     * The To: field(s) of the message.
     * </p>
     * 
     * @param toAddresses
     *        The To: field(s) of the message.
     */

    public void setToAddresses(java.util.Collection<String> toAddresses) {
        if (toAddresses == null) {
            this.toAddresses = null;
            return;
        }

        this.toAddresses = new com.amazonaws.internal.SdkInternalList<String>(toAddresses);
    }

    /**
     * <p>
     * The To: field(s) of the message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setToAddresses(java.util.Collection)} or {@link #withToAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param toAddresses
     *        The To: field(s) of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withToAddresses(String... toAddresses) {
        if (this.toAddresses == null) {
            setToAddresses(new com.amazonaws.internal.SdkInternalList<String>(toAddresses.length));
        }
        for (String ele : toAddresses) {
            this.toAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The To: field(s) of the message.
     * </p>
     * 
     * @param toAddresses
     *        The To: field(s) of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withToAddresses(java.util.Collection<String> toAddresses) {
        setToAddresses(toAddresses);
        return this;
    }

    /**
     * <p>
     * The CC: field(s) of the message.
     * </p>
     * 
     * @return The CC: field(s) of the message.
     */

    public java.util.List<String> getCcAddresses() {
        if (ccAddresses == null) {
            ccAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ccAddresses;
    }

    /**
     * <p>
     * The CC: field(s) of the message.
     * </p>
     * 
     * @param ccAddresses
     *        The CC: field(s) of the message.
     */

    public void setCcAddresses(java.util.Collection<String> ccAddresses) {
        if (ccAddresses == null) {
            this.ccAddresses = null;
            return;
        }

        this.ccAddresses = new com.amazonaws.internal.SdkInternalList<String>(ccAddresses);
    }

    /**
     * <p>
     * The CC: field(s) of the message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCcAddresses(java.util.Collection)} or {@link #withCcAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ccAddresses
     *        The CC: field(s) of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withCcAddresses(String... ccAddresses) {
        if (this.ccAddresses == null) {
            setCcAddresses(new com.amazonaws.internal.SdkInternalList<String>(ccAddresses.length));
        }
        for (String ele : ccAddresses) {
            this.ccAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The CC: field(s) of the message.
     * </p>
     * 
     * @param ccAddresses
     *        The CC: field(s) of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withCcAddresses(java.util.Collection<String> ccAddresses) {
        setCcAddresses(ccAddresses);
        return this;
    }

    /**
     * <p>
     * The BCC: field(s) of the message.
     * </p>
     * 
     * @return The BCC: field(s) of the message.
     */

    public java.util.List<String> getBccAddresses() {
        if (bccAddresses == null) {
            bccAddresses = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return bccAddresses;
    }

    /**
     * <p>
     * The BCC: field(s) of the message.
     * </p>
     * 
     * @param bccAddresses
     *        The BCC: field(s) of the message.
     */

    public void setBccAddresses(java.util.Collection<String> bccAddresses) {
        if (bccAddresses == null) {
            this.bccAddresses = null;
            return;
        }

        this.bccAddresses = new com.amazonaws.internal.SdkInternalList<String>(bccAddresses);
    }

    /**
     * <p>
     * The BCC: field(s) of the message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBccAddresses(java.util.Collection)} or {@link #withBccAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bccAddresses
     *        The BCC: field(s) of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Destination withBccAddresses(String... bccAddresses) {
        if (this.bccAddresses == null) {
            setBccAddresses(new com.amazonaws.internal.SdkInternalList<String>(bccAddresses.length));
        }
        for (String ele : bccAddresses) {
            this.bccAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The BCC: field(s) of the message.
     * </p>
     * 
     * @param bccAddresses
     *        The BCC: field(s) of the message.
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

}
