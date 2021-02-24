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
 * The connector-specific profile properties required by each connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorProfileProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorProfileProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connector-specific properties required by Amplitude.
     * </p>
     */
    private AmplitudeConnectorProfileProperties amplitude;
    /**
     * <p>
     * The connector-specific properties required by Datadog.
     * </p>
     */
    private DatadogConnectorProfileProperties datadog;
    /**
     * <p>
     * The connector-specific properties required by Dynatrace.
     * </p>
     */
    private DynatraceConnectorProfileProperties dynatrace;
    /**
     * <p>
     * The connector-specific properties required Google Analytics.
     * </p>
     */
    private GoogleAnalyticsConnectorProfileProperties googleAnalytics;

    private HoneycodeConnectorProfileProperties honeycode;
    /**
     * <p>
     * The connector-specific properties required by Infor Nexus.
     * </p>
     */
    private InforNexusConnectorProfileProperties inforNexus;
    /**
     * <p>
     * The connector-specific properties required by Marketo.
     * </p>
     */
    private MarketoConnectorProfileProperties marketo;
    /**
     * <p>
     * The connector-specific properties required by Amazon Redshift.
     * </p>
     */
    private RedshiftConnectorProfileProperties redshift;
    /**
     * <p>
     * The connector-specific properties required by Salesforce.
     * </p>
     */
    private SalesforceConnectorProfileProperties salesforce;
    /**
     * <p>
     * The connector-specific properties required by serviceNow.
     * </p>
     */
    private ServiceNowConnectorProfileProperties serviceNow;
    /**
     * <p>
     * The connector-specific properties required by Singular.
     * </p>
     */
    private SingularConnectorProfileProperties singular;
    /**
     * <p>
     * The connector-specific properties required by Slack.
     * </p>
     */
    private SlackConnectorProfileProperties slack;
    /**
     * <p>
     * The connector-specific properties required by Snowflake.
     * </p>
     */
    private SnowflakeConnectorProfileProperties snowflake;
    /**
     * <p>
     * The connector-specific properties required by Trend Micro.
     * </p>
     */
    private TrendmicroConnectorProfileProperties trendmicro;
    /**
     * <p>
     * The connector-specific properties required by Veeva.
     * </p>
     */
    private VeevaConnectorProfileProperties veeva;
    /**
     * <p>
     * The connector-specific properties required by Zendesk.
     * </p>
     */
    private ZendeskConnectorProfileProperties zendesk;

    /**
     * <p>
     * The connector-specific properties required by Amplitude.
     * </p>
     * 
     * @param amplitude
     *        The connector-specific properties required by Amplitude.
     */

    public void setAmplitude(AmplitudeConnectorProfileProperties amplitude) {
        this.amplitude = amplitude;
    }

    /**
     * <p>
     * The connector-specific properties required by Amplitude.
     * </p>
     * 
     * @return The connector-specific properties required by Amplitude.
     */

    public AmplitudeConnectorProfileProperties getAmplitude() {
        return this.amplitude;
    }

    /**
     * <p>
     * The connector-specific properties required by Amplitude.
     * </p>
     * 
     * @param amplitude
     *        The connector-specific properties required by Amplitude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withAmplitude(AmplitudeConnectorProfileProperties amplitude) {
        setAmplitude(amplitude);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Datadog.
     * </p>
     * 
     * @param datadog
     *        The connector-specific properties required by Datadog.
     */

    public void setDatadog(DatadogConnectorProfileProperties datadog) {
        this.datadog = datadog;
    }

    /**
     * <p>
     * The connector-specific properties required by Datadog.
     * </p>
     * 
     * @return The connector-specific properties required by Datadog.
     */

    public DatadogConnectorProfileProperties getDatadog() {
        return this.datadog;
    }

    /**
     * <p>
     * The connector-specific properties required by Datadog.
     * </p>
     * 
     * @param datadog
     *        The connector-specific properties required by Datadog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withDatadog(DatadogConnectorProfileProperties datadog) {
        setDatadog(datadog);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Dynatrace.
     * </p>
     * 
     * @param dynatrace
     *        The connector-specific properties required by Dynatrace.
     */

    public void setDynatrace(DynatraceConnectorProfileProperties dynatrace) {
        this.dynatrace = dynatrace;
    }

    /**
     * <p>
     * The connector-specific properties required by Dynatrace.
     * </p>
     * 
     * @return The connector-specific properties required by Dynatrace.
     */

    public DynatraceConnectorProfileProperties getDynatrace() {
        return this.dynatrace;
    }

    /**
     * <p>
     * The connector-specific properties required by Dynatrace.
     * </p>
     * 
     * @param dynatrace
     *        The connector-specific properties required by Dynatrace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withDynatrace(DynatraceConnectorProfileProperties dynatrace) {
        setDynatrace(dynatrace);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required Google Analytics.
     * </p>
     * 
     * @param googleAnalytics
     *        The connector-specific properties required Google Analytics.
     */

    public void setGoogleAnalytics(GoogleAnalyticsConnectorProfileProperties googleAnalytics) {
        this.googleAnalytics = googleAnalytics;
    }

    /**
     * <p>
     * The connector-specific properties required Google Analytics.
     * </p>
     * 
     * @return The connector-specific properties required Google Analytics.
     */

    public GoogleAnalyticsConnectorProfileProperties getGoogleAnalytics() {
        return this.googleAnalytics;
    }

    /**
     * <p>
     * The connector-specific properties required Google Analytics.
     * </p>
     * 
     * @param googleAnalytics
     *        The connector-specific properties required Google Analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withGoogleAnalytics(GoogleAnalyticsConnectorProfileProperties googleAnalytics) {
        setGoogleAnalytics(googleAnalytics);
        return this;
    }

    /**
     * @param honeycode
     */

    public void setHoneycode(HoneycodeConnectorProfileProperties honeycode) {
        this.honeycode = honeycode;
    }

    /**
     * @return
     */

    public HoneycodeConnectorProfileProperties getHoneycode() {
        return this.honeycode;
    }

    /**
     * @param honeycode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withHoneycode(HoneycodeConnectorProfileProperties honeycode) {
        setHoneycode(honeycode);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Infor Nexus.
     * </p>
     * 
     * @param inforNexus
     *        The connector-specific properties required by Infor Nexus.
     */

    public void setInforNexus(InforNexusConnectorProfileProperties inforNexus) {
        this.inforNexus = inforNexus;
    }

    /**
     * <p>
     * The connector-specific properties required by Infor Nexus.
     * </p>
     * 
     * @return The connector-specific properties required by Infor Nexus.
     */

    public InforNexusConnectorProfileProperties getInforNexus() {
        return this.inforNexus;
    }

    /**
     * <p>
     * The connector-specific properties required by Infor Nexus.
     * </p>
     * 
     * @param inforNexus
     *        The connector-specific properties required by Infor Nexus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withInforNexus(InforNexusConnectorProfileProperties inforNexus) {
        setInforNexus(inforNexus);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Marketo.
     * </p>
     * 
     * @param marketo
     *        The connector-specific properties required by Marketo.
     */

    public void setMarketo(MarketoConnectorProfileProperties marketo) {
        this.marketo = marketo;
    }

    /**
     * <p>
     * The connector-specific properties required by Marketo.
     * </p>
     * 
     * @return The connector-specific properties required by Marketo.
     */

    public MarketoConnectorProfileProperties getMarketo() {
        return this.marketo;
    }

    /**
     * <p>
     * The connector-specific properties required by Marketo.
     * </p>
     * 
     * @param marketo
     *        The connector-specific properties required by Marketo.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withMarketo(MarketoConnectorProfileProperties marketo) {
        setMarketo(marketo);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Amazon Redshift.
     * </p>
     * 
     * @param redshift
     *        The connector-specific properties required by Amazon Redshift.
     */

    public void setRedshift(RedshiftConnectorProfileProperties redshift) {
        this.redshift = redshift;
    }

    /**
     * <p>
     * The connector-specific properties required by Amazon Redshift.
     * </p>
     * 
     * @return The connector-specific properties required by Amazon Redshift.
     */

    public RedshiftConnectorProfileProperties getRedshift() {
        return this.redshift;
    }

    /**
     * <p>
     * The connector-specific properties required by Amazon Redshift.
     * </p>
     * 
     * @param redshift
     *        The connector-specific properties required by Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withRedshift(RedshiftConnectorProfileProperties redshift) {
        setRedshift(redshift);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Salesforce.
     * </p>
     * 
     * @param salesforce
     *        The connector-specific properties required by Salesforce.
     */

    public void setSalesforce(SalesforceConnectorProfileProperties salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * <p>
     * The connector-specific properties required by Salesforce.
     * </p>
     * 
     * @return The connector-specific properties required by Salesforce.
     */

    public SalesforceConnectorProfileProperties getSalesforce() {
        return this.salesforce;
    }

    /**
     * <p>
     * The connector-specific properties required by Salesforce.
     * </p>
     * 
     * @param salesforce
     *        The connector-specific properties required by Salesforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withSalesforce(SalesforceConnectorProfileProperties salesforce) {
        setSalesforce(salesforce);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by serviceNow.
     * </p>
     * 
     * @param serviceNow
     *        The connector-specific properties required by serviceNow.
     */

    public void setServiceNow(ServiceNowConnectorProfileProperties serviceNow) {
        this.serviceNow = serviceNow;
    }

    /**
     * <p>
     * The connector-specific properties required by serviceNow.
     * </p>
     * 
     * @return The connector-specific properties required by serviceNow.
     */

    public ServiceNowConnectorProfileProperties getServiceNow() {
        return this.serviceNow;
    }

    /**
     * <p>
     * The connector-specific properties required by serviceNow.
     * </p>
     * 
     * @param serviceNow
     *        The connector-specific properties required by serviceNow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withServiceNow(ServiceNowConnectorProfileProperties serviceNow) {
        setServiceNow(serviceNow);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Singular.
     * </p>
     * 
     * @param singular
     *        The connector-specific properties required by Singular.
     */

    public void setSingular(SingularConnectorProfileProperties singular) {
        this.singular = singular;
    }

    /**
     * <p>
     * The connector-specific properties required by Singular.
     * </p>
     * 
     * @return The connector-specific properties required by Singular.
     */

    public SingularConnectorProfileProperties getSingular() {
        return this.singular;
    }

    /**
     * <p>
     * The connector-specific properties required by Singular.
     * </p>
     * 
     * @param singular
     *        The connector-specific properties required by Singular.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withSingular(SingularConnectorProfileProperties singular) {
        setSingular(singular);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Slack.
     * </p>
     * 
     * @param slack
     *        The connector-specific properties required by Slack.
     */

    public void setSlack(SlackConnectorProfileProperties slack) {
        this.slack = slack;
    }

    /**
     * <p>
     * The connector-specific properties required by Slack.
     * </p>
     * 
     * @return The connector-specific properties required by Slack.
     */

    public SlackConnectorProfileProperties getSlack() {
        return this.slack;
    }

    /**
     * <p>
     * The connector-specific properties required by Slack.
     * </p>
     * 
     * @param slack
     *        The connector-specific properties required by Slack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withSlack(SlackConnectorProfileProperties slack) {
        setSlack(slack);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Snowflake.
     * </p>
     * 
     * @param snowflake
     *        The connector-specific properties required by Snowflake.
     */

    public void setSnowflake(SnowflakeConnectorProfileProperties snowflake) {
        this.snowflake = snowflake;
    }

    /**
     * <p>
     * The connector-specific properties required by Snowflake.
     * </p>
     * 
     * @return The connector-specific properties required by Snowflake.
     */

    public SnowflakeConnectorProfileProperties getSnowflake() {
        return this.snowflake;
    }

    /**
     * <p>
     * The connector-specific properties required by Snowflake.
     * </p>
     * 
     * @param snowflake
     *        The connector-specific properties required by Snowflake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withSnowflake(SnowflakeConnectorProfileProperties snowflake) {
        setSnowflake(snowflake);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Trend Micro.
     * </p>
     * 
     * @param trendmicro
     *        The connector-specific properties required by Trend Micro.
     */

    public void setTrendmicro(TrendmicroConnectorProfileProperties trendmicro) {
        this.trendmicro = trendmicro;
    }

    /**
     * <p>
     * The connector-specific properties required by Trend Micro.
     * </p>
     * 
     * @return The connector-specific properties required by Trend Micro.
     */

    public TrendmicroConnectorProfileProperties getTrendmicro() {
        return this.trendmicro;
    }

    /**
     * <p>
     * The connector-specific properties required by Trend Micro.
     * </p>
     * 
     * @param trendmicro
     *        The connector-specific properties required by Trend Micro.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withTrendmicro(TrendmicroConnectorProfileProperties trendmicro) {
        setTrendmicro(trendmicro);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Veeva.
     * </p>
     * 
     * @param veeva
     *        The connector-specific properties required by Veeva.
     */

    public void setVeeva(VeevaConnectorProfileProperties veeva) {
        this.veeva = veeva;
    }

    /**
     * <p>
     * The connector-specific properties required by Veeva.
     * </p>
     * 
     * @return The connector-specific properties required by Veeva.
     */

    public VeevaConnectorProfileProperties getVeeva() {
        return this.veeva;
    }

    /**
     * <p>
     * The connector-specific properties required by Veeva.
     * </p>
     * 
     * @param veeva
     *        The connector-specific properties required by Veeva.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withVeeva(VeevaConnectorProfileProperties veeva) {
        setVeeva(veeva);
        return this;
    }

    /**
     * <p>
     * The connector-specific properties required by Zendesk.
     * </p>
     * 
     * @param zendesk
     *        The connector-specific properties required by Zendesk.
     */

    public void setZendesk(ZendeskConnectorProfileProperties zendesk) {
        this.zendesk = zendesk;
    }

    /**
     * <p>
     * The connector-specific properties required by Zendesk.
     * </p>
     * 
     * @return The connector-specific properties required by Zendesk.
     */

    public ZendeskConnectorProfileProperties getZendesk() {
        return this.zendesk;
    }

    /**
     * <p>
     * The connector-specific properties required by Zendesk.
     * </p>
     * 
     * @param zendesk
     *        The connector-specific properties required by Zendesk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorProfileProperties withZendesk(ZendeskConnectorProfileProperties zendesk) {
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

        if (obj instanceof ConnectorProfileProperties == false)
            return false;
        ConnectorProfileProperties other = (ConnectorProfileProperties) obj;
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
    public ConnectorProfileProperties clone() {
        try {
            return (ConnectorProfileProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorProfilePropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
