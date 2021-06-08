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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the information that is required to query a particular connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SourceConnectorProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceConnectorProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the information that is required for querying Amplitude.
     * </p>
     */
    private AmplitudeSourceProperties amplitude;
    /**
     * <p>
     * Specifies the information that is required for querying Datadog.
     * </p>
     */
    private DatadogSourceProperties datadog;
    /**
     * <p>
     * Specifies the information that is required for querying Dynatrace.
     * </p>
     */
    private DynatraceSourceProperties dynatrace;
    /**
     * <p>
     * Specifies the information that is required for querying Google Analytics.
     * </p>
     */
    private GoogleAnalyticsSourceProperties googleAnalytics;
    /**
     * <p>
     * Specifies the information that is required for querying Infor Nexus.
     * </p>
     */
    private InforNexusSourceProperties inforNexus;
    /**
     * <p>
     * Specifies the information that is required for querying Marketo.
     * </p>
     */
    private MarketoSourceProperties marketo;
    /**
     * <p>
     * Specifies the information that is required for querying Amazon S3.
     * </p>
     */
    private S3SourceProperties s3;
    /**
     * <p>
     * Specifies the information that is required for querying Salesforce.
     * </p>
     */
    private SalesforceSourceProperties salesforce;
    /**
     * <p>
     * Specifies the information that is required for querying ServiceNow.
     * </p>
     */
    private ServiceNowSourceProperties serviceNow;
    /**
     * <p>
     * Specifies the information that is required for querying Singular.
     * </p>
     */
    private SingularSourceProperties singular;
    /**
     * <p>
     * Specifies the information that is required for querying Slack.
     * </p>
     */
    private SlackSourceProperties slack;
    /**
     * <p>
     * Specifies the information that is required for querying Trend Micro.
     * </p>
     */
    private TrendmicroSourceProperties trendmicro;
    /**
     * <p>
     * Specifies the information that is required for querying Veeva.
     * </p>
     */
    private VeevaSourceProperties veeva;
    /**
     * <p>
     * Specifies the information that is required for querying Zendesk.
     * </p>
     */
    private ZendeskSourceProperties zendesk;

    /**
     * <p>
     * Specifies the information that is required for querying Amplitude.
     * </p>
     * 
     * @param amplitude
     *        Specifies the information that is required for querying Amplitude.
     */

    public void setAmplitude(AmplitudeSourceProperties amplitude) {
        this.amplitude = amplitude;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Amplitude.
     * </p>
     * 
     * @return Specifies the information that is required for querying Amplitude.
     */

    public AmplitudeSourceProperties getAmplitude() {
        return this.amplitude;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Amplitude.
     * </p>
     * 
     * @param amplitude
     *        Specifies the information that is required for querying Amplitude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withAmplitude(AmplitudeSourceProperties amplitude) {
        setAmplitude(amplitude);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Datadog.
     * </p>
     * 
     * @param datadog
     *        Specifies the information that is required for querying Datadog.
     */

    public void setDatadog(DatadogSourceProperties datadog) {
        this.datadog = datadog;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Datadog.
     * </p>
     * 
     * @return Specifies the information that is required for querying Datadog.
     */

    public DatadogSourceProperties getDatadog() {
        return this.datadog;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Datadog.
     * </p>
     * 
     * @param datadog
     *        Specifies the information that is required for querying Datadog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withDatadog(DatadogSourceProperties datadog) {
        setDatadog(datadog);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Dynatrace.
     * </p>
     * 
     * @param dynatrace
     *        Specifies the information that is required for querying Dynatrace.
     */

    public void setDynatrace(DynatraceSourceProperties dynatrace) {
        this.dynatrace = dynatrace;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Dynatrace.
     * </p>
     * 
     * @return Specifies the information that is required for querying Dynatrace.
     */

    public DynatraceSourceProperties getDynatrace() {
        return this.dynatrace;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Dynatrace.
     * </p>
     * 
     * @param dynatrace
     *        Specifies the information that is required for querying Dynatrace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withDynatrace(DynatraceSourceProperties dynatrace) {
        setDynatrace(dynatrace);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Google Analytics.
     * </p>
     * 
     * @param googleAnalytics
     *        Specifies the information that is required for querying Google Analytics.
     */

    public void setGoogleAnalytics(GoogleAnalyticsSourceProperties googleAnalytics) {
        this.googleAnalytics = googleAnalytics;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Google Analytics.
     * </p>
     * 
     * @return Specifies the information that is required for querying Google Analytics.
     */

    public GoogleAnalyticsSourceProperties getGoogleAnalytics() {
        return this.googleAnalytics;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Google Analytics.
     * </p>
     * 
     * @param googleAnalytics
     *        Specifies the information that is required for querying Google Analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withGoogleAnalytics(GoogleAnalyticsSourceProperties googleAnalytics) {
        setGoogleAnalytics(googleAnalytics);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Infor Nexus.
     * </p>
     * 
     * @param inforNexus
     *        Specifies the information that is required for querying Infor Nexus.
     */

    public void setInforNexus(InforNexusSourceProperties inforNexus) {
        this.inforNexus = inforNexus;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Infor Nexus.
     * </p>
     * 
     * @return Specifies the information that is required for querying Infor Nexus.
     */

    public InforNexusSourceProperties getInforNexus() {
        return this.inforNexus;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Infor Nexus.
     * </p>
     * 
     * @param inforNexus
     *        Specifies the information that is required for querying Infor Nexus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withInforNexus(InforNexusSourceProperties inforNexus) {
        setInforNexus(inforNexus);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Marketo.
     * </p>
     * 
     * @param marketo
     *        Specifies the information that is required for querying Marketo.
     */

    public void setMarketo(MarketoSourceProperties marketo) {
        this.marketo = marketo;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Marketo.
     * </p>
     * 
     * @return Specifies the information that is required for querying Marketo.
     */

    public MarketoSourceProperties getMarketo() {
        return this.marketo;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Marketo.
     * </p>
     * 
     * @param marketo
     *        Specifies the information that is required for querying Marketo.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withMarketo(MarketoSourceProperties marketo) {
        setMarketo(marketo);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Amazon S3.
     * </p>
     * 
     * @param s3
     *        Specifies the information that is required for querying Amazon S3.
     */

    public void setS3(S3SourceProperties s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Amazon S3.
     * </p>
     * 
     * @return Specifies the information that is required for querying Amazon S3.
     */

    public S3SourceProperties getS3() {
        return this.s3;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Amazon S3.
     * </p>
     * 
     * @param s3
     *        Specifies the information that is required for querying Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withS3(S3SourceProperties s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Salesforce.
     * </p>
     * 
     * @param salesforce
     *        Specifies the information that is required for querying Salesforce.
     */

    public void setSalesforce(SalesforceSourceProperties salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Salesforce.
     * </p>
     * 
     * @return Specifies the information that is required for querying Salesforce.
     */

    public SalesforceSourceProperties getSalesforce() {
        return this.salesforce;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Salesforce.
     * </p>
     * 
     * @param salesforce
     *        Specifies the information that is required for querying Salesforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withSalesforce(SalesforceSourceProperties salesforce) {
        setSalesforce(salesforce);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying ServiceNow.
     * </p>
     * 
     * @param serviceNow
     *        Specifies the information that is required for querying ServiceNow.
     */

    public void setServiceNow(ServiceNowSourceProperties serviceNow) {
        this.serviceNow = serviceNow;
    }

    /**
     * <p>
     * Specifies the information that is required for querying ServiceNow.
     * </p>
     * 
     * @return Specifies the information that is required for querying ServiceNow.
     */

    public ServiceNowSourceProperties getServiceNow() {
        return this.serviceNow;
    }

    /**
     * <p>
     * Specifies the information that is required for querying ServiceNow.
     * </p>
     * 
     * @param serviceNow
     *        Specifies the information that is required for querying ServiceNow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withServiceNow(ServiceNowSourceProperties serviceNow) {
        setServiceNow(serviceNow);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Singular.
     * </p>
     * 
     * @param singular
     *        Specifies the information that is required for querying Singular.
     */

    public void setSingular(SingularSourceProperties singular) {
        this.singular = singular;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Singular.
     * </p>
     * 
     * @return Specifies the information that is required for querying Singular.
     */

    public SingularSourceProperties getSingular() {
        return this.singular;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Singular.
     * </p>
     * 
     * @param singular
     *        Specifies the information that is required for querying Singular.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withSingular(SingularSourceProperties singular) {
        setSingular(singular);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Slack.
     * </p>
     * 
     * @param slack
     *        Specifies the information that is required for querying Slack.
     */

    public void setSlack(SlackSourceProperties slack) {
        this.slack = slack;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Slack.
     * </p>
     * 
     * @return Specifies the information that is required for querying Slack.
     */

    public SlackSourceProperties getSlack() {
        return this.slack;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Slack.
     * </p>
     * 
     * @param slack
     *        Specifies the information that is required for querying Slack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withSlack(SlackSourceProperties slack) {
        setSlack(slack);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Trend Micro.
     * </p>
     * 
     * @param trendmicro
     *        Specifies the information that is required for querying Trend Micro.
     */

    public void setTrendmicro(TrendmicroSourceProperties trendmicro) {
        this.trendmicro = trendmicro;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Trend Micro.
     * </p>
     * 
     * @return Specifies the information that is required for querying Trend Micro.
     */

    public TrendmicroSourceProperties getTrendmicro() {
        return this.trendmicro;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Trend Micro.
     * </p>
     * 
     * @param trendmicro
     *        Specifies the information that is required for querying Trend Micro.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withTrendmicro(TrendmicroSourceProperties trendmicro) {
        setTrendmicro(trendmicro);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Veeva.
     * </p>
     * 
     * @param veeva
     *        Specifies the information that is required for querying Veeva.
     */

    public void setVeeva(VeevaSourceProperties veeva) {
        this.veeva = veeva;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Veeva.
     * </p>
     * 
     * @return Specifies the information that is required for querying Veeva.
     */

    public VeevaSourceProperties getVeeva() {
        return this.veeva;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Veeva.
     * </p>
     * 
     * @param veeva
     *        Specifies the information that is required for querying Veeva.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceConnectorProperties withVeeva(VeevaSourceProperties veeva) {
        setVeeva(veeva);
        return this;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Zendesk.
     * </p>
     * 
     * @param zendesk
     *        Specifies the information that is required for querying Zendesk.
     */

    public void setZendesk(ZendeskSourceProperties zendesk) {
        this.zendesk = zendesk;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Zendesk.
     * </p>
     * 
     * @return Specifies the information that is required for querying Zendesk.
     */

    public ZendeskSourceProperties getZendesk() {
        return this.zendesk;
    }

    /**
     * <p>
     * Specifies the information that is required for querying Zendesk.
     * </p>
     * 
     * @param zendesk
     *        Specifies the information that is required for querying Zendesk.
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
        if (getAmplitude() != null)
            sb.append("Amplitude: ").append(getAmplitude()).append(",");
        if (getDatadog() != null)
            sb.append("Datadog: ").append(getDatadog()).append(",");
        if (getDynatrace() != null)
            sb.append("Dynatrace: ").append(getDynatrace()).append(",");
        if (getGoogleAnalytics() != null)
            sb.append("GoogleAnalytics: ").append(getGoogleAnalytics()).append(",");
        if (getInforNexus() != null)
            sb.append("InforNexus: ").append(getInforNexus()).append(",");
        if (getMarketo() != null)
            sb.append("Marketo: ").append(getMarketo()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
        if (getSalesforce() != null)
            sb.append("Salesforce: ").append(getSalesforce()).append(",");
        if (getServiceNow() != null)
            sb.append("ServiceNow: ").append(getServiceNow()).append(",");
        if (getSingular() != null)
            sb.append("Singular: ").append(getSingular()).append(",");
        if (getSlack() != null)
            sb.append("Slack: ").append(getSlack()).append(",");
        if (getTrendmicro() != null)
            sb.append("Trendmicro: ").append(getTrendmicro()).append(",");
        if (getVeeva() != null)
            sb.append("Veeva: ").append(getVeeva()).append(",");
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
        if (other.getAmplitude() == null ^ this.getAmplitude() == null)
            return false;
        if (other.getAmplitude() != null && other.getAmplitude().equals(this.getAmplitude()) == false)
            return false;
        if (other.getDatadog() == null ^ this.getDatadog() == null)
            return false;
        if (other.getDatadog() != null && other.getDatadog().equals(this.getDatadog()) == false)
            return false;
        if (other.getDynatrace() == null ^ this.getDynatrace() == null)
            return false;
        if (other.getDynatrace() != null && other.getDynatrace().equals(this.getDynatrace()) == false)
            return false;
        if (other.getGoogleAnalytics() == null ^ this.getGoogleAnalytics() == null)
            return false;
        if (other.getGoogleAnalytics() != null && other.getGoogleAnalytics().equals(this.getGoogleAnalytics()) == false)
            return false;
        if (other.getInforNexus() == null ^ this.getInforNexus() == null)
            return false;
        if (other.getInforNexus() != null && other.getInforNexus().equals(this.getInforNexus()) == false)
            return false;
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
        if (other.getSingular() == null ^ this.getSingular() == null)
            return false;
        if (other.getSingular() != null && other.getSingular().equals(this.getSingular()) == false)
            return false;
        if (other.getSlack() == null ^ this.getSlack() == null)
            return false;
        if (other.getSlack() != null && other.getSlack().equals(this.getSlack()) == false)
            return false;
        if (other.getTrendmicro() == null ^ this.getTrendmicro() == null)
            return false;
        if (other.getTrendmicro() != null && other.getTrendmicro().equals(this.getTrendmicro()) == false)
            return false;
        if (other.getVeeva() == null ^ this.getVeeva() == null)
            return false;
        if (other.getVeeva() != null && other.getVeeva().equals(this.getVeeva()) == false)
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

        hashCode = prime * hashCode + ((getAmplitude() == null) ? 0 : getAmplitude().hashCode());
        hashCode = prime * hashCode + ((getDatadog() == null) ? 0 : getDatadog().hashCode());
        hashCode = prime * hashCode + ((getDynatrace() == null) ? 0 : getDynatrace().hashCode());
        hashCode = prime * hashCode + ((getGoogleAnalytics() == null) ? 0 : getGoogleAnalytics().hashCode());
        hashCode = prime * hashCode + ((getInforNexus() == null) ? 0 : getInforNexus().hashCode());
        hashCode = prime * hashCode + ((getMarketo() == null) ? 0 : getMarketo().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getSalesforce() == null) ? 0 : getSalesforce().hashCode());
        hashCode = prime * hashCode + ((getServiceNow() == null) ? 0 : getServiceNow().hashCode());
        hashCode = prime * hashCode + ((getSingular() == null) ? 0 : getSingular().hashCode());
        hashCode = prime * hashCode + ((getSlack() == null) ? 0 : getSlack().hashCode());
        hashCode = prime * hashCode + ((getTrendmicro() == null) ? 0 : getTrendmicro().hashCode());
        hashCode = prime * hashCode + ((getVeeva() == null) ? 0 : getVeeva().hashCode());
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
        com.amazonaws.services.appflow.model.transform.SourceConnectorPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
