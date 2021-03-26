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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ConnectorOperator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorOperator implements Serializable, Cloneable, StructuredPojo {

    private String marketo;

    private String s3;

    private String salesforce;

    private String serviceNow;

    private String zendesk;

    /**
     * @param marketo
     * @see MarketoConnectorOperator
     */

    public void setMarketo(String marketo) {
        this.marketo = marketo;
    }

    /**
     * @return
     * @see MarketoConnectorOperator
     */

    public String getMarketo() {
        return this.marketo;
    }

    /**
     * @param marketo
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketoConnectorOperator
     */

    public ConnectorOperator withMarketo(String marketo) {
        setMarketo(marketo);
        return this;
    }

    /**
     * @param marketo
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketoConnectorOperator
     */

    public ConnectorOperator withMarketo(MarketoConnectorOperator marketo) {
        this.marketo = marketo.toString();
        return this;
    }

    /**
     * @param s3
     * @see S3ConnectorOperator
     */

    public void setS3(String s3) {
        this.s3 = s3;
    }

    /**
     * @return
     * @see S3ConnectorOperator
     */

    public String getS3() {
        return this.s3;
    }

    /**
     * @param s3
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ConnectorOperator
     */

    public ConnectorOperator withS3(String s3) {
        setS3(s3);
        return this;
    }

    /**
     * @param s3
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ConnectorOperator
     */

    public ConnectorOperator withS3(S3ConnectorOperator s3) {
        this.s3 = s3.toString();
        return this;
    }

    /**
     * @param salesforce
     * @see SalesforceConnectorOperator
     */

    public void setSalesforce(String salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * @return
     * @see SalesforceConnectorOperator
     */

    public String getSalesforce() {
        return this.salesforce;
    }

    /**
     * @param salesforce
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceConnectorOperator
     */

    public ConnectorOperator withSalesforce(String salesforce) {
        setSalesforce(salesforce);
        return this;
    }

    /**
     * @param salesforce
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceConnectorOperator
     */

    public ConnectorOperator withSalesforce(SalesforceConnectorOperator salesforce) {
        this.salesforce = salesforce.toString();
        return this;
    }

    /**
     * @param serviceNow
     * @see ServiceNowConnectorOperator
     */

    public void setServiceNow(String serviceNow) {
        this.serviceNow = serviceNow;
    }

    /**
     * @return
     * @see ServiceNowConnectorOperator
     */

    public String getServiceNow() {
        return this.serviceNow;
    }

    /**
     * @param serviceNow
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNowConnectorOperator
     */

    public ConnectorOperator withServiceNow(String serviceNow) {
        setServiceNow(serviceNow);
        return this;
    }

    /**
     * @param serviceNow
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNowConnectorOperator
     */

    public ConnectorOperator withServiceNow(ServiceNowConnectorOperator serviceNow) {
        this.serviceNow = serviceNow.toString();
        return this;
    }

    /**
     * @param zendesk
     * @see ZendeskConnectorOperator
     */

    public void setZendesk(String zendesk) {
        this.zendesk = zendesk;
    }

    /**
     * @return
     * @see ZendeskConnectorOperator
     */

    public String getZendesk() {
        return this.zendesk;
    }

    /**
     * @param zendesk
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZendeskConnectorOperator
     */

    public ConnectorOperator withZendesk(String zendesk) {
        setZendesk(zendesk);
        return this;
    }

    /**
     * @param zendesk
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZendeskConnectorOperator
     */

    public ConnectorOperator withZendesk(ZendeskConnectorOperator zendesk) {
        this.zendesk = zendesk.toString();
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
        if (getMarketo() != null)
            sb.append("Marketo: ").append(getMarketo()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
        if (getSalesforce() != null)
            sb.append("Salesforce: ").append(getSalesforce()).append(",");
        if (getServiceNow() != null)
            sb.append("ServiceNow: ").append(getServiceNow()).append(",");
        if (getZendesk() != null)
            sb.append("Zendesk: ").append(getZendesk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorOperator == false)
            return false;
        ConnectorOperator other = (ConnectorOperator) obj;
        if (other.getMarketo() == null ^ this.getMarketo() == null)
            return false;
        if (other.getMarketo() != null && other.getMarketo().equals(this.getMarketo()) == false)
            return false;
        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        if (other.getSalesforce() == null ^ this.getSalesforce() == null)
            return false;
        if (other.getSalesforce() != null && other.getSalesforce().equals(this.getSalesforce()) == false)
            return false;
        if (other.getServiceNow() == null ^ this.getServiceNow() == null)
            return false;
        if (other.getServiceNow() != null && other.getServiceNow().equals(this.getServiceNow()) == false)
            return false;
        if (other.getZendesk() == null ^ this.getZendesk() == null)
            return false;
        if (other.getZendesk() != null && other.getZendesk().equals(this.getZendesk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarketo() == null) ? 0 : getMarketo().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getSalesforce() == null) ? 0 : getSalesforce().hashCode());
        hashCode = prime * hashCode + ((getServiceNow() == null) ? 0 : getServiceNow().hashCode());
        hashCode = prime * hashCode + ((getZendesk() == null) ? 0 : getZendesk().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorOperator clone() {
        try {
            return (ConnectorOperator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ConnectorOperatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
