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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information for one billing record.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/BillingRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BillingRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the domain that the billing record applies to. If the domain name contains characters other than a-z,
     * 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode. For more
     * information, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS
     * Domain Name Format</a> in the <i>Amazon Route 53 Developer Guidezzz</i>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The ID of the invoice that is associated with the billing record.
     * </p>
     */
    private String invoiceId;
    /**
     * <p>
     * The date that the operation was billed, in Unix format.
     * </p>
     */
    private java.util.Date billDate;
    /**
     * <p>
     * The price that you were charged for the operation, in US dollars.
     * </p>
     * <p>
     * Example value: 12.0
     * </p>
     */
    private Double price;

    /**
     * <p>
     * The name of the domain that the billing record applies to. If the domain name contains characters other than a-z,
     * 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode. For more
     * information, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS
     * Domain Name Format</a> in the <i>Amazon Route 53 Developer Guidezzz</i>.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that the billing record applies to. If the domain name contains characters other
     *        than a-z, 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode.
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *        Format</a> in the <i>Amazon Route 53 Developer Guidezzz</i>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that the billing record applies to. If the domain name contains characters other than a-z,
     * 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode. For more
     * information, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS
     * Domain Name Format</a> in the <i>Amazon Route 53 Developer Guidezzz</i>.
     * </p>
     * 
     * @return The name of the domain that the billing record applies to. If the domain name contains characters other
     *         than a-z, 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode.
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *         Format</a> in the <i>Amazon Route 53 Developer Guidezzz</i>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that the billing record applies to. If the domain name contains characters other than a-z,
     * 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode. For more
     * information, see <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS
     * Domain Name Format</a> in the <i>Amazon Route 53 Developer Guidezzz</i>.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that the billing record applies to. If the domain name contains characters other
     *        than a-z, 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode.
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *        Format</a> in the <i>Amazon Route 53 Developer Guidezzz</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingRecord withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * 
     * @param operation
     *        The operation that you were charged for.
     * @see OperationType
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * 
     * @return The operation that you were charged for.
     * @see OperationType
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * 
     * @param operation
     *        The operation that you were charged for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public BillingRecord withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * 
     * @param operation
     *        The operation that you were charged for.
     * @see OperationType
     */

    public void setOperation(OperationType operation) {
        withOperation(operation);
    }

    /**
     * <p>
     * The operation that you were charged for.
     * </p>
     * 
     * @param operation
     *        The operation that you were charged for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public BillingRecord withOperation(OperationType operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the invoice that is associated with the billing record.
     * </p>
     * 
     * @param invoiceId
     *        The ID of the invoice that is associated with the billing record.
     */

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * <p>
     * The ID of the invoice that is associated with the billing record.
     * </p>
     * 
     * @return The ID of the invoice that is associated with the billing record.
     */

    public String getInvoiceId() {
        return this.invoiceId;
    }

    /**
     * <p>
     * The ID of the invoice that is associated with the billing record.
     * </p>
     * 
     * @param invoiceId
     *        The ID of the invoice that is associated with the billing record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingRecord withInvoiceId(String invoiceId) {
        setInvoiceId(invoiceId);
        return this;
    }

    /**
     * <p>
     * The date that the operation was billed, in Unix format.
     * </p>
     * 
     * @param billDate
     *        The date that the operation was billed, in Unix format.
     */

    public void setBillDate(java.util.Date billDate) {
        this.billDate = billDate;
    }

    /**
     * <p>
     * The date that the operation was billed, in Unix format.
     * </p>
     * 
     * @return The date that the operation was billed, in Unix format.
     */

    public java.util.Date getBillDate() {
        return this.billDate;
    }

    /**
     * <p>
     * The date that the operation was billed, in Unix format.
     * </p>
     * 
     * @param billDate
     *        The date that the operation was billed, in Unix format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingRecord withBillDate(java.util.Date billDate) {
        setBillDate(billDate);
        return this;
    }

    /**
     * <p>
     * The price that you were charged for the operation, in US dollars.
     * </p>
     * <p>
     * Example value: 12.0
     * </p>
     * 
     * @param price
     *        The price that you were charged for the operation, in US dollars.</p>
     *        <p>
     *        Example value: 12.0
     */

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * <p>
     * The price that you were charged for the operation, in US dollars.
     * </p>
     * <p>
     * Example value: 12.0
     * </p>
     * 
     * @return The price that you were charged for the operation, in US dollars.</p>
     *         <p>
     *         Example value: 12.0
     */

    public Double getPrice() {
        return this.price;
    }

    /**
     * <p>
     * The price that you were charged for the operation, in US dollars.
     * </p>
     * <p>
     * Example value: 12.0
     * </p>
     * 
     * @param price
     *        The price that you were charged for the operation, in US dollars.</p>
     *        <p>
     *        Example value: 12.0
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BillingRecord withPrice(Double price) {
        setPrice(price);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getInvoiceId() != null)
            sb.append("InvoiceId: ").append(getInvoiceId()).append(",");
        if (getBillDate() != null)
            sb.append("BillDate: ").append(getBillDate()).append(",");
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BillingRecord == false)
            return false;
        BillingRecord other = (BillingRecord) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getInvoiceId() == null ^ this.getInvoiceId() == null)
            return false;
        if (other.getInvoiceId() != null && other.getInvoiceId().equals(this.getInvoiceId()) == false)
            return false;
        if (other.getBillDate() == null ^ this.getBillDate() == null)
            return false;
        if (other.getBillDate() != null && other.getBillDate().equals(this.getBillDate()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getInvoiceId() == null) ? 0 : getInvoiceId().hashCode());
        hashCode = prime * hashCode + ((getBillDate() == null) ? 0 : getBillDate().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return hashCode;
    }

    @Override
    public BillingRecord clone() {
        try {
            return (BillingRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.BillingRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
