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
 * <p>
 * Specifies the information that is required to query a particular Amazon AppFlow connector. Customer Profiles supports
 * Salesforce, Zendesk, Marketo, ServiceNow and Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/SourceConnectorProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceConnectorProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The properties that are applied when Marketo is being used as a source.
     * </p>
     */
    private MarketoSourceProperties marketo;
    /**
     * <p>
     * The properties that are applied when Amazon S3 is being used as the flow source.
     * </p>
     */
    private S3SourceProperties s3;
    /**
     * <p>
     * The properties that are applied when Salesforce is being used as a source.
     * </p>
     */
    private SalesforceSourceProperties salesforce;
    /**
     * <p>
     * The properties that are applied when ServiceNow is being used as a source.
     * </p>
     */
    private ServiceNowSourceProperties serviceNow;
    /**
     * <p>
     * The properties that are applied when using Zendesk as a flow source.
     * </p>
     */
    private ZendeskSourceProperties zendesk;

    /**
     * <p>
     * The properties that are applied when Marketo is being used as a source.
     * </p>
     * 
     * @param marketo
     *        The properties that are applied when Marketo is being used as a source.
     */

    public void setMarketo(MarketoSourceProperties marketo) {
        this.marketo = marketo;
    }

    /**
     * <p>
     * The properties that are applied when Marketo is being used as a source.
     * </p>
     * 
     * @return The properties that are applied when Marketo is being used as a source.
     */

    public MarketoSourceProperties getMarketo() {
        return this.marketo;
    }

    /**
     * <p>
     * The properties that are applied when Marketo is being used as a source.
     * </p>
     * 
     * @param marketo
     *        The properties that are applied when Marketo is being used as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withMarketo(MarketoSourceProperties marketo) {
        setMarketo(marketo);
        return this;
    }

    /**
     * <p>
     * The properties that are applied when Amazon S3 is being used as the flow source.
     * </p>
     * 
     * @param s3
     *        The properties that are applied when Amazon S3 is being used as the flow source.
     */

    public void setS3(S3SourceProperties s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * The properties that are applied when Amazon S3 is being used as the flow source.
     * </p>
     * 
     * @return The properties that are applied when Amazon S3 is being used as the flow source.
     */

    public S3SourceProperties getS3() {
        return this.s3;
    }

    /**
     * <p>
     * The properties that are applied when Amazon S3 is being used as the flow source.
     * </p>
     * 
     * @param s3
     *        The properties that are applied when Amazon S3 is being used as the flow source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withS3(S3SourceProperties s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * The properties that are applied when Salesforce is being used as a source.
     * </p>
     * 
     * @param salesforce
     *        The properties that are applied when Salesforce is being used as a source.
     */

    public void setSalesforce(SalesforceSourceProperties salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * <p>
     * The properties that are applied when Salesforce is being used as a source.
     * </p>
     * 
     * @return The properties that are applied when Salesforce is being used as a source.
     */

    public SalesforceSourceProperties getSalesforce() {
        return this.salesforce;
    }

    /**
     * <p>
     * The properties that are applied when Salesforce is being used as a source.
     * </p>
     * 
     * @param salesforce
     *        The properties that are applied when Salesforce is being used as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withSalesforce(SalesforceSourceProperties salesforce) {
        setSalesforce(salesforce);
        return this;
    }

    /**
     * <p>
     * The properties that are applied when ServiceNow is being used as a source.
     * </p>
     * 
     * @param serviceNow
     *        The properties that are applied when ServiceNow is being used as a source.
     */

    public void setServiceNow(ServiceNowSourceProperties serviceNow) {
        this.serviceNow = serviceNow;
    }

    /**
     * <p>
     * The properties that are applied when ServiceNow is being used as a source.
     * </p>
     * 
     * @return The properties that are applied when ServiceNow is being used as a source.
     */

    public ServiceNowSourceProperties getServiceNow() {
        return this.serviceNow;
    }

    /**
     * <p>
     * The properties that are applied when ServiceNow is being used as a source.
     * </p>
     * 
     * @param serviceNow
     *        The properties that are applied when ServiceNow is being used as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withServiceNow(ServiceNowSourceProperties serviceNow) {
        setServiceNow(serviceNow);
        return this;
    }

    /**
     * <p>
     * The properties that are applied when using Zendesk as a flow source.
     * </p>
     * 
     * @param zendesk
     *        The properties that are applied when using Zendesk as a flow source.
     */

    public void setZendesk(ZendeskSourceProperties zendesk) {
        this.zendesk = zendesk;
    }

    /**
     * <p>
     * The properties that are applied when using Zendesk as a flow source.
     * </p>
     * 
     * @return The properties that are applied when using Zendesk as a flow source.
     */

    public ZendeskSourceProperties getZendesk() {
        return this.zendesk;
    }

    /**
     * <p>
     * The properties that are applied when using Zendesk as a flow source.
     * </p>
     * 
     * @param zendesk
     *        The properties that are applied when using Zendesk as a flow source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withZendesk(ZendeskSourceProperties zendesk) {
        setZendesk(zendesk);
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

        if (obj instanceof SourceConnectorProperties == false)
            return false;
        SourceConnectorProperties other = (SourceConnectorProperties) obj;
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
    public SourceConnectorProperties clone() {
        try {
            return (SourceConnectorProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.SourceConnectorPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
