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
 * The operation to be performed on the provided source fields.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorOperator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorOperator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operation to be performed on the provided Amplitude source fields.
     * </p>
     */
    private String amplitude;
    /**
     * <p>
     * The operation to be performed on the provided Datadog source fields.
     * </p>
     */
    private String datadog;
    /**
     * <p>
     * The operation to be performed on the provided Dynatrace source fields.
     * </p>
     */
    private String dynatrace;
    /**
     * <p>
     * The operation to be performed on the provided Google Analytics source fields.
     * </p>
     */
    private String googleAnalytics;
    /**
     * <p>
     * The operation to be performed on the provided Infor Nexus source fields.
     * </p>
     */
    private String inforNexus;
    /**
     * <p>
     * The operation to be performed on the provided Marketo source fields.
     * </p>
     */
    private String marketo;
    /**
     * <p>
     * The operation to be performed on the provided Amazon S3 source fields.
     * </p>
     */
    private String s3;
    /**
     * <p>
     * The operation to be performed on the provided Salesforce source fields.
     * </p>
     */
    private String salesforce;
    /**
     * <p>
     * The operation to be performed on the provided ServiceNow source fields.
     * </p>
     */
    private String serviceNow;
    /**
     * <p>
     * The operation to be performed on the provided Singular source fields.
     * </p>
     */
    private String singular;
    /**
     * <p>
     * The operation to be performed on the provided Slack source fields.
     * </p>
     */
    private String slack;
    /**
     * <p>
     * The operation to be performed on the provided Trend Micro source fields.
     * </p>
     */
    private String trendmicro;
    /**
     * <p>
     * The operation to be performed on the provided Veeva source fields.
     * </p>
     */
    private String veeva;
    /**
     * <p>
     * The operation to be performed on the provided Zendesk source fields.
     * </p>
     */
    private String zendesk;

    /**
     * <p>
     * The operation to be performed on the provided Amplitude source fields.
     * </p>
     * 
     * @param amplitude
     *        The operation to be performed on the provided Amplitude source fields.
     * @see AmplitudeConnectorOperator
     */

    public void setAmplitude(String amplitude) {
        this.amplitude = amplitude;
    }

    /**
     * <p>
     * The operation to be performed on the provided Amplitude source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Amplitude source fields.
     * @see AmplitudeConnectorOperator
     */

    public String getAmplitude() {
        return this.amplitude;
    }

    /**
     * <p>
     * The operation to be performed on the provided Amplitude source fields.
     * </p>
     * 
     * @param amplitude
     *        The operation to be performed on the provided Amplitude source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmplitudeConnectorOperator
     */

    public ConnectorOperator withAmplitude(String amplitude) {
        setAmplitude(amplitude);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Amplitude source fields.
     * </p>
     * 
     * @param amplitude
     *        The operation to be performed on the provided Amplitude source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AmplitudeConnectorOperator
     */

    public ConnectorOperator withAmplitude(AmplitudeConnectorOperator amplitude) {
        this.amplitude = amplitude.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Datadog source fields.
     * </p>
     * 
     * @param datadog
     *        The operation to be performed on the provided Datadog source fields.
     * @see DatadogConnectorOperator
     */

    public void setDatadog(String datadog) {
        this.datadog = datadog;
    }

    /**
     * <p>
     * The operation to be performed on the provided Datadog source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Datadog source fields.
     * @see DatadogConnectorOperator
     */

    public String getDatadog() {
        return this.datadog;
    }

    /**
     * <p>
     * The operation to be performed on the provided Datadog source fields.
     * </p>
     * 
     * @param datadog
     *        The operation to be performed on the provided Datadog source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatadogConnectorOperator
     */

    public ConnectorOperator withDatadog(String datadog) {
        setDatadog(datadog);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Datadog source fields.
     * </p>
     * 
     * @param datadog
     *        The operation to be performed on the provided Datadog source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatadogConnectorOperator
     */

    public ConnectorOperator withDatadog(DatadogConnectorOperator datadog) {
        this.datadog = datadog.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Dynatrace source fields.
     * </p>
     * 
     * @param dynatrace
     *        The operation to be performed on the provided Dynatrace source fields.
     * @see DynatraceConnectorOperator
     */

    public void setDynatrace(String dynatrace) {
        this.dynatrace = dynatrace;
    }

    /**
     * <p>
     * The operation to be performed on the provided Dynatrace source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Dynatrace source fields.
     * @see DynatraceConnectorOperator
     */

    public String getDynatrace() {
        return this.dynatrace;
    }

    /**
     * <p>
     * The operation to be performed on the provided Dynatrace source fields.
     * </p>
     * 
     * @param dynatrace
     *        The operation to be performed on the provided Dynatrace source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DynatraceConnectorOperator
     */

    public ConnectorOperator withDynatrace(String dynatrace) {
        setDynatrace(dynatrace);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Dynatrace source fields.
     * </p>
     * 
     * @param dynatrace
     *        The operation to be performed on the provided Dynatrace source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DynatraceConnectorOperator
     */

    public ConnectorOperator withDynatrace(DynatraceConnectorOperator dynatrace) {
        this.dynatrace = dynatrace.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Google Analytics source fields.
     * </p>
     * 
     * @param googleAnalytics
     *        The operation to be performed on the provided Google Analytics source fields.
     * @see GoogleAnalyticsConnectorOperator
     */

    public void setGoogleAnalytics(String googleAnalytics) {
        this.googleAnalytics = googleAnalytics;
    }

    /**
     * <p>
     * The operation to be performed on the provided Google Analytics source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Google Analytics source fields.
     * @see GoogleAnalyticsConnectorOperator
     */

    public String getGoogleAnalytics() {
        return this.googleAnalytics;
    }

    /**
     * <p>
     * The operation to be performed on the provided Google Analytics source fields.
     * </p>
     * 
     * @param googleAnalytics
     *        The operation to be performed on the provided Google Analytics source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GoogleAnalyticsConnectorOperator
     */

    public ConnectorOperator withGoogleAnalytics(String googleAnalytics) {
        setGoogleAnalytics(googleAnalytics);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Google Analytics source fields.
     * </p>
     * 
     * @param googleAnalytics
     *        The operation to be performed on the provided Google Analytics source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GoogleAnalyticsConnectorOperator
     */

    public ConnectorOperator withGoogleAnalytics(GoogleAnalyticsConnectorOperator googleAnalytics) {
        this.googleAnalytics = googleAnalytics.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Infor Nexus source fields.
     * </p>
     * 
     * @param inforNexus
     *        The operation to be performed on the provided Infor Nexus source fields.
     * @see InforNexusConnectorOperator
     */

    public void setInforNexus(String inforNexus) {
        this.inforNexus = inforNexus;
    }

    /**
     * <p>
     * The operation to be performed on the provided Infor Nexus source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Infor Nexus source fields.
     * @see InforNexusConnectorOperator
     */

    public String getInforNexus() {
        return this.inforNexus;
    }

    /**
     * <p>
     * The operation to be performed on the provided Infor Nexus source fields.
     * </p>
     * 
     * @param inforNexus
     *        The operation to be performed on the provided Infor Nexus source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InforNexusConnectorOperator
     */

    public ConnectorOperator withInforNexus(String inforNexus) {
        setInforNexus(inforNexus);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Infor Nexus source fields.
     * </p>
     * 
     * @param inforNexus
     *        The operation to be performed on the provided Infor Nexus source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InforNexusConnectorOperator
     */

    public ConnectorOperator withInforNexus(InforNexusConnectorOperator inforNexus) {
        this.inforNexus = inforNexus.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Marketo source fields.
     * </p>
     * 
     * @param marketo
     *        The operation to be performed on the provided Marketo source fields.
     * @see MarketoConnectorOperator
     */

    public void setMarketo(String marketo) {
        this.marketo = marketo;
    }

    /**
     * <p>
     * The operation to be performed on the provided Marketo source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Marketo source fields.
     * @see MarketoConnectorOperator
     */

    public String getMarketo() {
        return this.marketo;
    }

    /**
     * <p>
     * The operation to be performed on the provided Marketo source fields.
     * </p>
     * 
     * @param marketo
     *        The operation to be performed on the provided Marketo source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketoConnectorOperator
     */

    public ConnectorOperator withMarketo(String marketo) {
        setMarketo(marketo);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Marketo source fields.
     * </p>
     * 
     * @param marketo
     *        The operation to be performed on the provided Marketo source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketoConnectorOperator
     */

    public ConnectorOperator withMarketo(MarketoConnectorOperator marketo) {
        this.marketo = marketo.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Amazon S3 source fields.
     * </p>
     * 
     * @param s3
     *        The operation to be performed on the provided Amazon S3 source fields.
     * @see S3ConnectorOperator
     */

    public void setS3(String s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * The operation to be performed on the provided Amazon S3 source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Amazon S3 source fields.
     * @see S3ConnectorOperator
     */

    public String getS3() {
        return this.s3;
    }

    /**
     * <p>
     * The operation to be performed on the provided Amazon S3 source fields.
     * </p>
     * 
     * @param s3
     *        The operation to be performed on the provided Amazon S3 source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ConnectorOperator
     */

    public ConnectorOperator withS3(String s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Amazon S3 source fields.
     * </p>
     * 
     * @param s3
     *        The operation to be performed on the provided Amazon S3 source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ConnectorOperator
     */

    public ConnectorOperator withS3(S3ConnectorOperator s3) {
        this.s3 = s3.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Salesforce source fields.
     * </p>
     * 
     * @param salesforce
     *        The operation to be performed on the provided Salesforce source fields.
     * @see SalesforceConnectorOperator
     */

    public void setSalesforce(String salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * <p>
     * The operation to be performed on the provided Salesforce source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Salesforce source fields.
     * @see SalesforceConnectorOperator
     */

    public String getSalesforce() {
        return this.salesforce;
    }

    /**
     * <p>
     * The operation to be performed on the provided Salesforce source fields.
     * </p>
     * 
     * @param salesforce
     *        The operation to be performed on the provided Salesforce source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceConnectorOperator
     */

    public ConnectorOperator withSalesforce(String salesforce) {
        setSalesforce(salesforce);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Salesforce source fields.
     * </p>
     * 
     * @param salesforce
     *        The operation to be performed on the provided Salesforce source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SalesforceConnectorOperator
     */

    public ConnectorOperator withSalesforce(SalesforceConnectorOperator salesforce) {
        this.salesforce = salesforce.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided ServiceNow source fields.
     * </p>
     * 
     * @param serviceNow
     *        The operation to be performed on the provided ServiceNow source fields.
     * @see ServiceNowConnectorOperator
     */

    public void setServiceNow(String serviceNow) {
        this.serviceNow = serviceNow;
    }

    /**
     * <p>
     * The operation to be performed on the provided ServiceNow source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided ServiceNow source fields.
     * @see ServiceNowConnectorOperator
     */

    public String getServiceNow() {
        return this.serviceNow;
    }

    /**
     * <p>
     * The operation to be performed on the provided ServiceNow source fields.
     * </p>
     * 
     * @param serviceNow
     *        The operation to be performed on the provided ServiceNow source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNowConnectorOperator
     */

    public ConnectorOperator withServiceNow(String serviceNow) {
        setServiceNow(serviceNow);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided ServiceNow source fields.
     * </p>
     * 
     * @param serviceNow
     *        The operation to be performed on the provided ServiceNow source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceNowConnectorOperator
     */

    public ConnectorOperator withServiceNow(ServiceNowConnectorOperator serviceNow) {
        this.serviceNow = serviceNow.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Singular source fields.
     * </p>
     * 
     * @param singular
     *        The operation to be performed on the provided Singular source fields.
     * @see SingularConnectorOperator
     */

    public void setSingular(String singular) {
        this.singular = singular;
    }

    /**
     * <p>
     * The operation to be performed on the provided Singular source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Singular source fields.
     * @see SingularConnectorOperator
     */

    public String getSingular() {
        return this.singular;
    }

    /**
     * <p>
     * The operation to be performed on the provided Singular source fields.
     * </p>
     * 
     * @param singular
     *        The operation to be performed on the provided Singular source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SingularConnectorOperator
     */

    public ConnectorOperator withSingular(String singular) {
        setSingular(singular);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Singular source fields.
     * </p>
     * 
     * @param singular
     *        The operation to be performed on the provided Singular source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SingularConnectorOperator
     */

    public ConnectorOperator withSingular(SingularConnectorOperator singular) {
        this.singular = singular.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Slack source fields.
     * </p>
     * 
     * @param slack
     *        The operation to be performed on the provided Slack source fields.
     * @see SlackConnectorOperator
     */

    public void setSlack(String slack) {
        this.slack = slack;
    }

    /**
     * <p>
     * The operation to be performed on the provided Slack source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Slack source fields.
     * @see SlackConnectorOperator
     */

    public String getSlack() {
        return this.slack;
    }

    /**
     * <p>
     * The operation to be performed on the provided Slack source fields.
     * </p>
     * 
     * @param slack
     *        The operation to be performed on the provided Slack source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlackConnectorOperator
     */

    public ConnectorOperator withSlack(String slack) {
        setSlack(slack);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Slack source fields.
     * </p>
     * 
     * @param slack
     *        The operation to be performed on the provided Slack source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SlackConnectorOperator
     */

    public ConnectorOperator withSlack(SlackConnectorOperator slack) {
        this.slack = slack.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Trend Micro source fields.
     * </p>
     * 
     * @param trendmicro
     *        The operation to be performed on the provided Trend Micro source fields.
     * @see TrendmicroConnectorOperator
     */

    public void setTrendmicro(String trendmicro) {
        this.trendmicro = trendmicro;
    }

    /**
     * <p>
     * The operation to be performed on the provided Trend Micro source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Trend Micro source fields.
     * @see TrendmicroConnectorOperator
     */

    public String getTrendmicro() {
        return this.trendmicro;
    }

    /**
     * <p>
     * The operation to be performed on the provided Trend Micro source fields.
     * </p>
     * 
     * @param trendmicro
     *        The operation to be performed on the provided Trend Micro source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrendmicroConnectorOperator
     */

    public ConnectorOperator withTrendmicro(String trendmicro) {
        setTrendmicro(trendmicro);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Trend Micro source fields.
     * </p>
     * 
     * @param trendmicro
     *        The operation to be performed on the provided Trend Micro source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrendmicroConnectorOperator
     */

    public ConnectorOperator withTrendmicro(TrendmicroConnectorOperator trendmicro) {
        this.trendmicro = trendmicro.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Veeva source fields.
     * </p>
     * 
     * @param veeva
     *        The operation to be performed on the provided Veeva source fields.
     * @see VeevaConnectorOperator
     */

    public void setVeeva(String veeva) {
        this.veeva = veeva;
    }

    /**
     * <p>
     * The operation to be performed on the provided Veeva source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Veeva source fields.
     * @see VeevaConnectorOperator
     */

    public String getVeeva() {
        return this.veeva;
    }

    /**
     * <p>
     * The operation to be performed on the provided Veeva source fields.
     * </p>
     * 
     * @param veeva
     *        The operation to be performed on the provided Veeva source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VeevaConnectorOperator
     */

    public ConnectorOperator withVeeva(String veeva) {
        setVeeva(veeva);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Veeva source fields.
     * </p>
     * 
     * @param veeva
     *        The operation to be performed on the provided Veeva source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VeevaConnectorOperator
     */

    public ConnectorOperator withVeeva(VeevaConnectorOperator veeva) {
        this.veeva = veeva.toString();
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Zendesk source fields.
     * </p>
     * 
     * @param zendesk
     *        The operation to be performed on the provided Zendesk source fields.
     * @see ZendeskConnectorOperator
     */

    public void setZendesk(String zendesk) {
        this.zendesk = zendesk;
    }

    /**
     * <p>
     * The operation to be performed on the provided Zendesk source fields.
     * </p>
     * 
     * @return The operation to be performed on the provided Zendesk source fields.
     * @see ZendeskConnectorOperator
     */

    public String getZendesk() {
        return this.zendesk;
    }

    /**
     * <p>
     * The operation to be performed on the provided Zendesk source fields.
     * </p>
     * 
     * @param zendesk
     *        The operation to be performed on the provided Zendesk source fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZendeskConnectorOperator
     */

    public ConnectorOperator withZendesk(String zendesk) {
        setZendesk(zendesk);
        return this;
    }

    /**
     * <p>
     * The operation to be performed on the provided Zendesk source fields.
     * </p>
     * 
     * @param zendesk
     *        The operation to be performed on the provided Zendesk source fields.
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

        if (obj instanceof ConnectorOperator == false)
            return false;
        ConnectorOperator other = (ConnectorOperator) obj;
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
        com.amazonaws.services.appflow.model.transform.ConnectorOperatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
