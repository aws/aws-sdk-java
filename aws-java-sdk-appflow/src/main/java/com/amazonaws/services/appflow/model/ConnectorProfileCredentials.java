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
 * The connector-specific credentials required by a connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connector-specific credentials required when using Amplitude.
     * </p>
     */
    private AmplitudeConnectorProfileCredentials amplitude;
    /**
     * <p>
     * The connector-specific credentials required when using Datadog.
     * </p>
     */
    private DatadogConnectorProfileCredentials datadog;
    /**
     * <p>
     * The connector-specific credentials required when using Dynatrace.
     * </p>
     */
    private DynatraceConnectorProfileCredentials dynatrace;
    /**
     * <p>
     * The connector-specific credentials required when using Google Analytics.
     * </p>
     */
    private GoogleAnalyticsConnectorProfileCredentials googleAnalytics;
    /**
     * <p>
     * The connector-specific credentials required when using Amazon Honeycode.
     * </p>
     */
    private HoneycodeConnectorProfileCredentials honeycode;
    /**
     * <p>
     * The connector-specific credentials required when using Infor Nexus.
     * </p>
     */
    private InforNexusConnectorProfileCredentials inforNexus;
    /**
     * <p>
     * The connector-specific credentials required when using Marketo.
     * </p>
     */
    private MarketoConnectorProfileCredentials marketo;
    /**
     * <p>
     * The connector-specific credentials required when using Amazon Redshift.
     * </p>
     */
    private RedshiftConnectorProfileCredentials redshift;
    /**
     * <p>
     * The connector-specific credentials required when using Salesforce.
     * </p>
     */
    private SalesforceConnectorProfileCredentials salesforce;
    /**
     * <p>
     * The connector-specific credentials required when using ServiceNow.
     * </p>
     */
    private ServiceNowConnectorProfileCredentials serviceNow;
    /**
     * <p>
     * The connector-specific credentials required when using Singular.
     * </p>
     */
    private SingularConnectorProfileCredentials singular;
    /**
     * <p>
     * The connector-specific credentials required when using Slack.
     * </p>
     */
    private SlackConnectorProfileCredentials slack;
    /**
     * <p>
     * The connector-specific credentials required when using Snowflake.
     * </p>
     */
    private SnowflakeConnectorProfileCredentials snowflake;
    /**
     * <p>
     * The connector-specific credentials required when using Trend Micro.
     * </p>
     */
    private TrendmicroConnectorProfileCredentials trendmicro;
    /**
     * <p>
     * The connector-specific credentials required when using Veeva.
     * </p>
     */
    private VeevaConnectorProfileCredentials veeva;
    /**
     * <p>
     * The connector-specific credentials required when using Zendesk.
     * </p>
     */
    private ZendeskConnectorProfileCredentials zendesk;

    /**
     * <p>
     * The connector-specific credentials required when using Amplitude.
     * </p>
     * 
     * @param amplitude
     *        The connector-specific credentials required when using Amplitude.
     */

    public void setAmplitude(AmplitudeConnectorProfileCredentials amplitude) {
        this.amplitude = amplitude;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Amplitude.
     * </p>
     * 
     * @return The connector-specific credentials required when using Amplitude.
     */

    public AmplitudeConnectorProfileCredentials getAmplitude() {
        return this.amplitude;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Amplitude.
     * </p>
     * 
     * @param amplitude
     *        The connector-specific credentials required when using Amplitude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withAmplitude(AmplitudeConnectorProfileCredentials amplitude) {
        setAmplitude(amplitude);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Datadog.
     * </p>
     * 
     * @param datadog
     *        The connector-specific credentials required when using Datadog.
     */

    public void setDatadog(DatadogConnectorProfileCredentials datadog) {
        this.datadog = datadog;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Datadog.
     * </p>
     * 
     * @return The connector-specific credentials required when using Datadog.
     */

    public DatadogConnectorProfileCredentials getDatadog() {
        return this.datadog;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Datadog.
     * </p>
     * 
     * @param datadog
     *        The connector-specific credentials required when using Datadog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withDatadog(DatadogConnectorProfileCredentials datadog) {
        setDatadog(datadog);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Dynatrace.
     * </p>
     * 
     * @param dynatrace
     *        The connector-specific credentials required when using Dynatrace.
     */

    public void setDynatrace(DynatraceConnectorProfileCredentials dynatrace) {
        this.dynatrace = dynatrace;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Dynatrace.
     * </p>
     * 
     * @return The connector-specific credentials required when using Dynatrace.
     */

    public DynatraceConnectorProfileCredentials getDynatrace() {
        return this.dynatrace;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Dynatrace.
     * </p>
     * 
     * @param dynatrace
     *        The connector-specific credentials required when using Dynatrace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withDynatrace(DynatraceConnectorProfileCredentials dynatrace) {
        setDynatrace(dynatrace);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Google Analytics.
     * </p>
     * 
     * @param googleAnalytics
     *        The connector-specific credentials required when using Google Analytics.
     */

    public void setGoogleAnalytics(GoogleAnalyticsConnectorProfileCredentials googleAnalytics) {
        this.googleAnalytics = googleAnalytics;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Google Analytics.
     * </p>
     * 
     * @return The connector-specific credentials required when using Google Analytics.
     */

    public GoogleAnalyticsConnectorProfileCredentials getGoogleAnalytics() {
        return this.googleAnalytics;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Google Analytics.
     * </p>
     * 
     * @param googleAnalytics
     *        The connector-specific credentials required when using Google Analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withGoogleAnalytics(GoogleAnalyticsConnectorProfileCredentials googleAnalytics) {
        setGoogleAnalytics(googleAnalytics);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Amazon Honeycode.
     * </p>
     * 
     * @param honeycode
     *        The connector-specific credentials required when using Amazon Honeycode.
     */

    public void setHoneycode(HoneycodeConnectorProfileCredentials honeycode) {
        this.honeycode = honeycode;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Amazon Honeycode.
     * </p>
     * 
     * @return The connector-specific credentials required when using Amazon Honeycode.
     */

    public HoneycodeConnectorProfileCredentials getHoneycode() {
        return this.honeycode;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Amazon Honeycode.
     * </p>
     * 
     * @param honeycode
     *        The connector-specific credentials required when using Amazon Honeycode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withHoneycode(HoneycodeConnectorProfileCredentials honeycode) {
        setHoneycode(honeycode);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Infor Nexus.
     * </p>
     * 
     * @param inforNexus
     *        The connector-specific credentials required when using Infor Nexus.
     */

    public void setInforNexus(InforNexusConnectorProfileCredentials inforNexus) {
        this.inforNexus = inforNexus;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Infor Nexus.
     * </p>
     * 
     * @return The connector-specific credentials required when using Infor Nexus.
     */

    public InforNexusConnectorProfileCredentials getInforNexus() {
        return this.inforNexus;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Infor Nexus.
     * </p>
     * 
     * @param inforNexus
     *        The connector-specific credentials required when using Infor Nexus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withInforNexus(InforNexusConnectorProfileCredentials inforNexus) {
        setInforNexus(inforNexus);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Marketo.
     * </p>
     * 
     * @param marketo
     *        The connector-specific credentials required when using Marketo.
     */

    public void setMarketo(MarketoConnectorProfileCredentials marketo) {
        this.marketo = marketo;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Marketo.
     * </p>
     * 
     * @return The connector-specific credentials required when using Marketo.
     */

    public MarketoConnectorProfileCredentials getMarketo() {
        return this.marketo;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Marketo.
     * </p>
     * 
     * @param marketo
     *        The connector-specific credentials required when using Marketo.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withMarketo(MarketoConnectorProfileCredentials marketo) {
        setMarketo(marketo);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Amazon Redshift.
     * </p>
     * 
     * @param redshift
     *        The connector-specific credentials required when using Amazon Redshift.
     */

    public void setRedshift(RedshiftConnectorProfileCredentials redshift) {
        this.redshift = redshift;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Amazon Redshift.
     * </p>
     * 
     * @return The connector-specific credentials required when using Amazon Redshift.
     */

    public RedshiftConnectorProfileCredentials getRedshift() {
        return this.redshift;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Amazon Redshift.
     * </p>
     * 
     * @param redshift
     *        The connector-specific credentials required when using Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withRedshift(RedshiftConnectorProfileCredentials redshift) {
        setRedshift(redshift);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Salesforce.
     * </p>
     * 
     * @param salesforce
     *        The connector-specific credentials required when using Salesforce.
     */

    public void setSalesforce(SalesforceConnectorProfileCredentials salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Salesforce.
     * </p>
     * 
     * @return The connector-specific credentials required when using Salesforce.
     */

    public SalesforceConnectorProfileCredentials getSalesforce() {
        return this.salesforce;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Salesforce.
     * </p>
     * 
     * @param salesforce
     *        The connector-specific credentials required when using Salesforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withSalesforce(SalesforceConnectorProfileCredentials salesforce) {
        setSalesforce(salesforce);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using ServiceNow.
     * </p>
     * 
     * @param serviceNow
     *        The connector-specific credentials required when using ServiceNow.
     */

    public void setServiceNow(ServiceNowConnectorProfileCredentials serviceNow) {
        this.serviceNow = serviceNow;
    }

    /**
     * <p>
     * The connector-specific credentials required when using ServiceNow.
     * </p>
     * 
     * @return The connector-specific credentials required when using ServiceNow.
     */

    public ServiceNowConnectorProfileCredentials getServiceNow() {
        return this.serviceNow;
    }

    /**
     * <p>
     * The connector-specific credentials required when using ServiceNow.
     * </p>
     * 
     * @param serviceNow
     *        The connector-specific credentials required when using ServiceNow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withServiceNow(ServiceNowConnectorProfileCredentials serviceNow) {
        setServiceNow(serviceNow);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Singular.
     * </p>
     * 
     * @param singular
     *        The connector-specific credentials required when using Singular.
     */

    public void setSingular(SingularConnectorProfileCredentials singular) {
        this.singular = singular;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Singular.
     * </p>
     * 
     * @return The connector-specific credentials required when using Singular.
     */

    public SingularConnectorProfileCredentials getSingular() {
        return this.singular;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Singular.
     * </p>
     * 
     * @param singular
     *        The connector-specific credentials required when using Singular.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withSingular(SingularConnectorProfileCredentials singular) {
        setSingular(singular);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Slack.
     * </p>
     * 
     * @param slack
     *        The connector-specific credentials required when using Slack.
     */

    public void setSlack(SlackConnectorProfileCredentials slack) {
        this.slack = slack;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Slack.
     * </p>
     * 
     * @return The connector-specific credentials required when using Slack.
     */

    public SlackConnectorProfileCredentials getSlack() {
        return this.slack;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Slack.
     * </p>
     * 
     * @param slack
     *        The connector-specific credentials required when using Slack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withSlack(SlackConnectorProfileCredentials slack) {
        setSlack(slack);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Snowflake.
     * </p>
     * 
     * @param snowflake
     *        The connector-specific credentials required when using Snowflake.
     */

    public void setSnowflake(SnowflakeConnectorProfileCredentials snowflake) {
        this.snowflake = snowflake;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Snowflake.
     * </p>
     * 
     * @return The connector-specific credentials required when using Snowflake.
     */

    public SnowflakeConnectorProfileCredentials getSnowflake() {
        return this.snowflake;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Snowflake.
     * </p>
     * 
     * @param snowflake
     *        The connector-specific credentials required when using Snowflake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withSnowflake(SnowflakeConnectorProfileCredentials snowflake) {
        setSnowflake(snowflake);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Trend Micro.
     * </p>
     * 
     * @param trendmicro
     *        The connector-specific credentials required when using Trend Micro.
     */

    public void setTrendmicro(TrendmicroConnectorProfileCredentials trendmicro) {
        this.trendmicro = trendmicro;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Trend Micro.
     * </p>
     * 
     * @return The connector-specific credentials required when using Trend Micro.
     */

    public TrendmicroConnectorProfileCredentials getTrendmicro() {
        return this.trendmicro;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Trend Micro.
     * </p>
     * 
     * @param trendmicro
     *        The connector-specific credentials required when using Trend Micro.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withTrendmicro(TrendmicroConnectorProfileCredentials trendmicro) {
        setTrendmicro(trendmicro);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Veeva.
     * </p>
     * 
     * @param veeva
     *        The connector-specific credentials required when using Veeva.
     */

    public void setVeeva(VeevaConnectorProfileCredentials veeva) {
        this.veeva = veeva;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Veeva.
     * </p>
     * 
     * @return The connector-specific credentials required when using Veeva.
     */

    public VeevaConnectorProfileCredentials getVeeva() {
        return this.veeva;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Veeva.
     * </p>
     * 
     * @param veeva
     *        The connector-specific credentials required when using Veeva.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withVeeva(VeevaConnectorProfileCredentials veeva) {
        setVeeva(veeva);
        return this;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Zendesk.
     * </p>
     * 
     * @param zendesk
     *        The connector-specific credentials required when using Zendesk.
     */

    public void setZendesk(ZendeskConnectorProfileCredentials zendesk) {
        this.zendesk = zendesk;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Zendesk.
     * </p>
     * 
     * @return The connector-specific credentials required when using Zendesk.
     */

    public ZendeskConnectorProfileCredentials getZendesk() {
        return this.zendesk;
    }

    /**
     * <p>
     * The connector-specific credentials required when using Zendesk.
     * </p>
     * 
     * @param zendesk
     *        The connector-specific credentials required when using Zendesk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileCredentials withZendesk(ZendeskConnectorProfileCredentials zendesk) {
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
        if (getHoneycode() != null)
            sb.append("Honeycode: ").append(getHoneycode()).append(",");
        if (getInforNexus() != null)
            sb.append("InforNexus: ").append(getInforNexus()).append(",");
        if (getMarketo() != null)
            sb.append("Marketo: ").append(getMarketo()).append(",");
        if (getRedshift() != null)
            sb.append("Redshift: ").append(getRedshift()).append(",");
        if (getSalesforce() != null)
            sb.append("Salesforce: ").append(getSalesforce()).append(",");
        if (getServiceNow() != null)
            sb.append("ServiceNow: ").append(getServiceNow()).append(",");
        if (getSingular() != null)
            sb.append("Singular: ").append(getSingular()).append(",");
        if (getSlack() != null)
            sb.append("Slack: ").append(getSlack()).append(",");
        if (getSnowflake() != null)
            sb.append("Snowflake: ").append(getSnowflake()).append(",");
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

        if (obj instanceof ConnectorProfileCredentials == false)
            return false;
        ConnectorProfileCredentials other = (ConnectorProfileCredentials) obj;
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
        if (other.getHoneycode() == null ^ this.getHoneycode() == null)
            return false;
        if (other.getHoneycode() != null && other.getHoneycode().equals(this.getHoneycode()) == false)
            return false;
        if (other.getInforNexus() == null ^ this.getInforNexus() == null)
            return false;
        if (other.getInforNexus() != null && other.getInforNexus().equals(this.getInforNexus()) == false)
            return false;
        if (other.getMarketo() == null ^ this.getMarketo() == null)
            return false;
        if (other.getMarketo() != null && other.getMarketo().equals(this.getMarketo()) == false)
            return false;
        if (other.getRedshift() == null ^ this.getRedshift() == null)
            return false;
        if (other.getRedshift() != null && other.getRedshift().equals(this.getRedshift()) == false)
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
        if (other.getSnowflake() == null ^ this.getSnowflake() == null)
            return false;
        if (other.getSnowflake() != null && other.getSnowflake().equals(this.getSnowflake()) == false)
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
        hashCode = prime * hashCode + ((getHoneycode() == null) ? 0 : getHoneycode().hashCode());
        hashCode = prime * hashCode + ((getInforNexus() == null) ? 0 : getInforNexus().hashCode());
        hashCode = prime * hashCode + ((getMarketo() == null) ? 0 : getMarketo().hashCode());
        hashCode = prime * hashCode + ((getRedshift() == null) ? 0 : getRedshift().hashCode());
        hashCode = prime * hashCode + ((getSalesforce() == null) ? 0 : getSalesforce().hashCode());
        hashCode = prime * hashCode + ((getServiceNow() == null) ? 0 : getServiceNow().hashCode());
        hashCode = prime * hashCode + ((getSingular() == null) ? 0 : getSingular().hashCode());
        hashCode = prime * hashCode + ((getSlack() == null) ? 0 : getSlack().hashCode());
        hashCode = prime * hashCode + ((getSnowflake() == null) ? 0 : getSnowflake().hashCode());
        hashCode = prime * hashCode + ((getTrendmicro() == null) ? 0 : getTrendmicro().hashCode());
        hashCode = prime * hashCode + ((getVeeva() == null) ? 0 : getVeeva().hashCode());
        hashCode = prime * hashCode + ((getZendesk() == null) ? 0 : getZendesk().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorProfileCredentials clone() {
        try {
            return (ConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
