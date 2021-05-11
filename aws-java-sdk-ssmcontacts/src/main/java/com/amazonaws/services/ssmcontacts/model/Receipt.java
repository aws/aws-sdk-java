/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmcontacts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Records events during an engagement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-contacts-2021-05-03/Receipt" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Receipt implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel Incident Manager engaged.
     * </p>
     */
    private String contactChannelArn;
    /**
     * <p>
     * The type follows the engagement cycle, <code>SENT</code>, <code>DELIVERED</code>, and <code>READ</code>.
     * </p>
     */
    private String receiptType;
    /**
     * <p>
     * Information provided during the page acknowledgement.
     * </p>
     */
    private String receiptInfo;
    /**
     * <p>
     * The time receipt was <code>SENT</code>, <code>DELIVERED</code>, or <code>READ</code>.
     * </p>
     */
    private java.util.Date receiptTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel Incident Manager engaged.
     * </p>
     * 
     * @param contactChannelArn
     *        The Amazon Resource Name (ARN) of the contact channel Incident Manager engaged.
     */

    public void setContactChannelArn(String contactChannelArn) {
        this.contactChannelArn = contactChannelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel Incident Manager engaged.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the contact channel Incident Manager engaged.
     */

    public String getContactChannelArn() {
        return this.contactChannelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the contact channel Incident Manager engaged.
     * </p>
     * 
     * @param contactChannelArn
     *        The Amazon Resource Name (ARN) of the contact channel Incident Manager engaged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Receipt withContactChannelArn(String contactChannelArn) {
        setContactChannelArn(contactChannelArn);
        return this;
    }

    /**
     * <p>
     * The type follows the engagement cycle, <code>SENT</code>, <code>DELIVERED</code>, and <code>READ</code>.
     * </p>
     * 
     * @param receiptType
     *        The type follows the engagement cycle, <code>SENT</code>, <code>DELIVERED</code>, and <code>READ</code>.
     * @see ReceiptType
     */

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    /**
     * <p>
     * The type follows the engagement cycle, <code>SENT</code>, <code>DELIVERED</code>, and <code>READ</code>.
     * </p>
     * 
     * @return The type follows the engagement cycle, <code>SENT</code>, <code>DELIVERED</code>, and <code>READ</code>.
     * @see ReceiptType
     */

    public String getReceiptType() {
        return this.receiptType;
    }

    /**
     * <p>
     * The type follows the engagement cycle, <code>SENT</code>, <code>DELIVERED</code>, and <code>READ</code>.
     * </p>
     * 
     * @param receiptType
     *        The type follows the engagement cycle, <code>SENT</code>, <code>DELIVERED</code>, and <code>READ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReceiptType
     */

    public Receipt withReceiptType(String receiptType) {
        setReceiptType(receiptType);
        return this;
    }

    /**
     * <p>
     * The type follows the engagement cycle, <code>SENT</code>, <code>DELIVERED</code>, and <code>READ</code>.
     * </p>
     * 
     * @param receiptType
     *        The type follows the engagement cycle, <code>SENT</code>, <code>DELIVERED</code>, and <code>READ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReceiptType
     */

    public Receipt withReceiptType(ReceiptType receiptType) {
        this.receiptType = receiptType.toString();
        return this;
    }

    /**
     * <p>
     * Information provided during the page acknowledgement.
     * </p>
     * 
     * @param receiptInfo
     *        Information provided during the page acknowledgement.
     */

    public void setReceiptInfo(String receiptInfo) {
        this.receiptInfo = receiptInfo;
    }

    /**
     * <p>
     * Information provided during the page acknowledgement.
     * </p>
     * 
     * @return Information provided during the page acknowledgement.
     */

    public String getReceiptInfo() {
        return this.receiptInfo;
    }

    /**
     * <p>
     * Information provided during the page acknowledgement.
     * </p>
     * 
     * @param receiptInfo
     *        Information provided during the page acknowledgement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Receipt withReceiptInfo(String receiptInfo) {
        setReceiptInfo(receiptInfo);
        return this;
    }

    /**
     * <p>
     * The time receipt was <code>SENT</code>, <code>DELIVERED</code>, or <code>READ</code>.
     * </p>
     * 
     * @param receiptTime
     *        The time receipt was <code>SENT</code>, <code>DELIVERED</code>, or <code>READ</code>.
     */

    public void setReceiptTime(java.util.Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    /**
     * <p>
     * The time receipt was <code>SENT</code>, <code>DELIVERED</code>, or <code>READ</code>.
     * </p>
     * 
     * @return The time receipt was <code>SENT</code>, <code>DELIVERED</code>, or <code>READ</code>.
     */

    public java.util.Date getReceiptTime() {
        return this.receiptTime;
    }

    /**
     * <p>
     * The time receipt was <code>SENT</code>, <code>DELIVERED</code>, or <code>READ</code>.
     * </p>
     * 
     * @param receiptTime
     *        The time receipt was <code>SENT</code>, <code>DELIVERED</code>, or <code>READ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Receipt withReceiptTime(java.util.Date receiptTime) {
        setReceiptTime(receiptTime);
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
        if (getContactChannelArn() != null)
            sb.append("ContactChannelArn: ").append(getContactChannelArn()).append(",");
        if (getReceiptType() != null)
            sb.append("ReceiptType: ").append(getReceiptType()).append(",");
        if (getReceiptInfo() != null)
            sb.append("ReceiptInfo: ").append(getReceiptInfo()).append(",");
        if (getReceiptTime() != null)
            sb.append("ReceiptTime: ").append(getReceiptTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Receipt == false)
            return false;
        Receipt other = (Receipt) obj;
        if (other.getContactChannelArn() == null ^ this.getContactChannelArn() == null)
            return false;
        if (other.getContactChannelArn() != null && other.getContactChannelArn().equals(this.getContactChannelArn()) == false)
            return false;
        if (other.getReceiptType() == null ^ this.getReceiptType() == null)
            return false;
        if (other.getReceiptType() != null && other.getReceiptType().equals(this.getReceiptType()) == false)
            return false;
        if (other.getReceiptInfo() == null ^ this.getReceiptInfo() == null)
            return false;
        if (other.getReceiptInfo() != null && other.getReceiptInfo().equals(this.getReceiptInfo()) == false)
            return false;
        if (other.getReceiptTime() == null ^ this.getReceiptTime() == null)
            return false;
        if (other.getReceiptTime() != null && other.getReceiptTime().equals(this.getReceiptTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactChannelArn() == null) ? 0 : getContactChannelArn().hashCode());
        hashCode = prime * hashCode + ((getReceiptType() == null) ? 0 : getReceiptType().hashCode());
        hashCode = prime * hashCode + ((getReceiptInfo() == null) ? 0 : getReceiptInfo().hashCode());
        hashCode = prime * hashCode + ((getReceiptTime() == null) ? 0 : getReceiptTime().hashCode());
        return hashCode;
    }

    @Override
    public Receipt clone() {
        try {
            return (Receipt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmcontacts.model.transform.ReceiptMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
