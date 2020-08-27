/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A structure to specify connector-specific metadata such as <code>oAuthScopes</code>, <code>supportedRegions</code>,
 * <code>privateLinkServiceUrl</code>, and so on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ConnectorMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The connector metadata specific to Amplitude.
     * </p>
     */
    private AmplitudeMetadata amplitude;
    /**
     * <p>
     * The connector metadata specific to Datadog.
     * </p>
     */
    private DatadogMetadata datadog;
    /**
     * <p>
     * The connector metadata specific to Dynatrace.
     * </p>
     */
    private DynatraceMetadata dynatrace;
    /**
     * <p>
     * The connector metadata specific to Google Analytics.
     * </p>
     */
    private GoogleAnalyticsMetadata googleAnalytics;
    /**
     * <p>
     * The connector metadata specific to Infor Nexus.
     * </p>
     */
    private InforNexusMetadata inforNexus;
    /**
     * <p>
     * The connector metadata specific to Marketo.
     * </p>
     */
    private MarketoMetadata marketo;
    /**
     * <p>
     * The connector metadata specific to Amazon Redshift.
     * </p>
     */
    private RedshiftMetadata redshift;
    /**
     * <p>
     * The connector metadata specific to Amazon S3.
     * </p>
     */
    private S3Metadata s3;
    /**
     * <p>
     * The connector metadata specific to Salesforce.
     * </p>
     */
    private SalesforceMetadata salesforce;
    /**
     * <p>
     * The connector metadata specific to ServiceNow.
     * </p>
     */
    private ServiceNowMetadata serviceNow;
    /**
     * <p>
     * The connector metadata specific to Singular.
     * </p>
     */
    private SingularMetadata singular;
    /**
     * <p>
     * The connector metadata specific to Slack.
     * </p>
     */
    private SlackMetadata slack;
    /**
     * <p>
     * The connector metadata specific to Snowflake.
     * </p>
     */
    private SnowflakeMetadata snowflake;
    /**
     * <p>
     * The connector metadata specific to Trend Micro.
     * </p>
     */
    private TrendmicroMetadata trendmicro;
    /**
     * <p>
     * The connector metadata specific to Veeva.
     * </p>
     */
    private VeevaMetadata veeva;
    /**
     * <p>
     * The connector metadata specific to Zendesk.
     * </p>
     */
    private ZendeskMetadata zendesk;
    /**
     * <p>
     * The connector metadata specific to Amazon EventBridge.
     * </p>
     */
    private EventBridgeMetadata eventBridge;

    /**
     * <p>
     * The connector metadata specific to Amplitude.
     * </p>
     * 
     * @param amplitude
     *        The connector metadata specific to Amplitude.
     */

    public void setAmplitude(AmplitudeMetadata amplitude) {
        this.amplitude = amplitude;
    }

    /**
     * <p>
     * The connector metadata specific to Amplitude.
     * </p>
     * 
     * @return The connector metadata specific to Amplitude.
     */

    public AmplitudeMetadata getAmplitude() {
        return this.amplitude;
    }

    /**
     * <p>
     * The connector metadata specific to Amplitude.
     * </p>
     * 
     * @param amplitude
     *        The connector metadata specific to Amplitude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withAmplitude(AmplitudeMetadata amplitude) {
        setAmplitude(amplitude);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Datadog.
     * </p>
     * 
     * @param datadog
     *        The connector metadata specific to Datadog.
     */

    public void setDatadog(DatadogMetadata datadog) {
        this.datadog = datadog;
    }

    /**
     * <p>
     * The connector metadata specific to Datadog.
     * </p>
     * 
     * @return The connector metadata specific to Datadog.
     */

    public DatadogMetadata getDatadog() {
        return this.datadog;
    }

    /**
     * <p>
     * The connector metadata specific to Datadog.
     * </p>
     * 
     * @param datadog
     *        The connector metadata specific to Datadog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withDatadog(DatadogMetadata datadog) {
        setDatadog(datadog);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Dynatrace.
     * </p>
     * 
     * @param dynatrace
     *        The connector metadata specific to Dynatrace.
     */

    public void setDynatrace(DynatraceMetadata dynatrace) {
        this.dynatrace = dynatrace;
    }

    /**
     * <p>
     * The connector metadata specific to Dynatrace.
     * </p>
     * 
     * @return The connector metadata specific to Dynatrace.
     */

    public DynatraceMetadata getDynatrace() {
        return this.dynatrace;
    }

    /**
     * <p>
     * The connector metadata specific to Dynatrace.
     * </p>
     * 
     * @param dynatrace
     *        The connector metadata specific to Dynatrace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withDynatrace(DynatraceMetadata dynatrace) {
        setDynatrace(dynatrace);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Google Analytics.
     * </p>
     * 
     * @param googleAnalytics
     *        The connector metadata specific to Google Analytics.
     */

    public void setGoogleAnalytics(GoogleAnalyticsMetadata googleAnalytics) {
        this.googleAnalytics = googleAnalytics;
    }

    /**
     * <p>
     * The connector metadata specific to Google Analytics.
     * </p>
     * 
     * @return The connector metadata specific to Google Analytics.
     */

    public GoogleAnalyticsMetadata getGoogleAnalytics() {
        return this.googleAnalytics;
    }

    /**
     * <p>
     * The connector metadata specific to Google Analytics.
     * </p>
     * 
     * @param googleAnalytics
     *        The connector metadata specific to Google Analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withGoogleAnalytics(GoogleAnalyticsMetadata googleAnalytics) {
        setGoogleAnalytics(googleAnalytics);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Infor Nexus.
     * </p>
     * 
     * @param inforNexus
     *        The connector metadata specific to Infor Nexus.
     */

    public void setInforNexus(InforNexusMetadata inforNexus) {
        this.inforNexus = inforNexus;
    }

    /**
     * <p>
     * The connector metadata specific to Infor Nexus.
     * </p>
     * 
     * @return The connector metadata specific to Infor Nexus.
     */

    public InforNexusMetadata getInforNexus() {
        return this.inforNexus;
    }

    /**
     * <p>
     * The connector metadata specific to Infor Nexus.
     * </p>
     * 
     * @param inforNexus
     *        The connector metadata specific to Infor Nexus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withInforNexus(InforNexusMetadata inforNexus) {
        setInforNexus(inforNexus);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Marketo.
     * </p>
     * 
     * @param marketo
     *        The connector metadata specific to Marketo.
     */

    public void setMarketo(MarketoMetadata marketo) {
        this.marketo = marketo;
    }

    /**
     * <p>
     * The connector metadata specific to Marketo.
     * </p>
     * 
     * @return The connector metadata specific to Marketo.
     */

    public MarketoMetadata getMarketo() {
        return this.marketo;
    }

    /**
     * <p>
     * The connector metadata specific to Marketo.
     * </p>
     * 
     * @param marketo
     *        The connector metadata specific to Marketo.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withMarketo(MarketoMetadata marketo) {
        setMarketo(marketo);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Amazon Redshift.
     * </p>
     * 
     * @param redshift
     *        The connector metadata specific to Amazon Redshift.
     */

    public void setRedshift(RedshiftMetadata redshift) {
        this.redshift = redshift;
    }

    /**
     * <p>
     * The connector metadata specific to Amazon Redshift.
     * </p>
     * 
     * @return The connector metadata specific to Amazon Redshift.
     */

    public RedshiftMetadata getRedshift() {
        return this.redshift;
    }

    /**
     * <p>
     * The connector metadata specific to Amazon Redshift.
     * </p>
     * 
     * @param redshift
     *        The connector metadata specific to Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withRedshift(RedshiftMetadata redshift) {
        setRedshift(redshift);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Amazon S3.
     * </p>
     * 
     * @param s3
     *        The connector metadata specific to Amazon S3.
     */

    public void setS3(S3Metadata s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * The connector metadata specific to Amazon S3.
     * </p>
     * 
     * @return The connector metadata specific to Amazon S3.
     */

    public S3Metadata getS3() {
        return this.s3;
    }

    /**
     * <p>
     * The connector metadata specific to Amazon S3.
     * </p>
     * 
     * @param s3
     *        The connector metadata specific to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withS3(S3Metadata s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Salesforce.
     * </p>
     * 
     * @param salesforce
     *        The connector metadata specific to Salesforce.
     */

    public void setSalesforce(SalesforceMetadata salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * <p>
     * The connector metadata specific to Salesforce.
     * </p>
     * 
     * @return The connector metadata specific to Salesforce.
     */

    public SalesforceMetadata getSalesforce() {
        return this.salesforce;
    }

    /**
     * <p>
     * The connector metadata specific to Salesforce.
     * </p>
     * 
     * @param salesforce
     *        The connector metadata specific to Salesforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withSalesforce(SalesforceMetadata salesforce) {
        setSalesforce(salesforce);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to ServiceNow.
     * </p>
     * 
     * @param serviceNow
     *        The connector metadata specific to ServiceNow.
     */

    public void setServiceNow(ServiceNowMetadata serviceNow) {
        this.serviceNow = serviceNow;
    }

    /**
     * <p>
     * The connector metadata specific to ServiceNow.
     * </p>
     * 
     * @return The connector metadata specific to ServiceNow.
     */

    public ServiceNowMetadata getServiceNow() {
        return this.serviceNow;
    }

    /**
     * <p>
     * The connector metadata specific to ServiceNow.
     * </p>
     * 
     * @param serviceNow
     *        The connector metadata specific to ServiceNow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withServiceNow(ServiceNowMetadata serviceNow) {
        setServiceNow(serviceNow);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Singular.
     * </p>
     * 
     * @param singular
     *        The connector metadata specific to Singular.
     */

    public void setSingular(SingularMetadata singular) {
        this.singular = singular;
    }

    /**
     * <p>
     * The connector metadata specific to Singular.
     * </p>
     * 
     * @return The connector metadata specific to Singular.
     */

    public SingularMetadata getSingular() {
        return this.singular;
    }

    /**
     * <p>
     * The connector metadata specific to Singular.
     * </p>
     * 
     * @param singular
     *        The connector metadata specific to Singular.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withSingular(SingularMetadata singular) {
        setSingular(singular);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Slack.
     * </p>
     * 
     * @param slack
     *        The connector metadata specific to Slack.
     */

    public void setSlack(SlackMetadata slack) {
        this.slack = slack;
    }

    /**
     * <p>
     * The connector metadata specific to Slack.
     * </p>
     * 
     * @return The connector metadata specific to Slack.
     */

    public SlackMetadata getSlack() {
        return this.slack;
    }

    /**
     * <p>
     * The connector metadata specific to Slack.
     * </p>
     * 
     * @param slack
     *        The connector metadata specific to Slack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withSlack(SlackMetadata slack) {
        setSlack(slack);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Snowflake.
     * </p>
     * 
     * @param snowflake
     *        The connector metadata specific to Snowflake.
     */

    public void setSnowflake(SnowflakeMetadata snowflake) {
        this.snowflake = snowflake;
    }

    /**
     * <p>
     * The connector metadata specific to Snowflake.
     * </p>
     * 
     * @return The connector metadata specific to Snowflake.
     */

    public SnowflakeMetadata getSnowflake() {
        return this.snowflake;
    }

    /**
     * <p>
     * The connector metadata specific to Snowflake.
     * </p>
     * 
     * @param snowflake
     *        The connector metadata specific to Snowflake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withSnowflake(SnowflakeMetadata snowflake) {
        setSnowflake(snowflake);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Trend Micro.
     * </p>
     * 
     * @param trendmicro
     *        The connector metadata specific to Trend Micro.
     */

    public void setTrendmicro(TrendmicroMetadata trendmicro) {
        this.trendmicro = trendmicro;
    }

    /**
     * <p>
     * The connector metadata specific to Trend Micro.
     * </p>
     * 
     * @return The connector metadata specific to Trend Micro.
     */

    public TrendmicroMetadata getTrendmicro() {
        return this.trendmicro;
    }

    /**
     * <p>
     * The connector metadata specific to Trend Micro.
     * </p>
     * 
     * @param trendmicro
     *        The connector metadata specific to Trend Micro.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withTrendmicro(TrendmicroMetadata trendmicro) {
        setTrendmicro(trendmicro);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Veeva.
     * </p>
     * 
     * @param veeva
     *        The connector metadata specific to Veeva.
     */

    public void setVeeva(VeevaMetadata veeva) {
        this.veeva = veeva;
    }

    /**
     * <p>
     * The connector metadata specific to Veeva.
     * </p>
     * 
     * @return The connector metadata specific to Veeva.
     */

    public VeevaMetadata getVeeva() {
        return this.veeva;
    }

    /**
     * <p>
     * The connector metadata specific to Veeva.
     * </p>
     * 
     * @param veeva
     *        The connector metadata specific to Veeva.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withVeeva(VeevaMetadata veeva) {
        setVeeva(veeva);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Zendesk.
     * </p>
     * 
     * @param zendesk
     *        The connector metadata specific to Zendesk.
     */

    public void setZendesk(ZendeskMetadata zendesk) {
        this.zendesk = zendesk;
    }

    /**
     * <p>
     * The connector metadata specific to Zendesk.
     * </p>
     * 
     * @return The connector metadata specific to Zendesk.
     */

    public ZendeskMetadata getZendesk() {
        return this.zendesk;
    }

    /**
     * <p>
     * The connector metadata specific to Zendesk.
     * </p>
     * 
     * @param zendesk
     *        The connector metadata specific to Zendesk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withZendesk(ZendeskMetadata zendesk) {
        setZendesk(zendesk);
        return this;
    }

    /**
     * <p>
     * The connector metadata specific to Amazon EventBridge.
     * </p>
     * 
     * @param eventBridge
     *        The connector metadata specific to Amazon EventBridge.
     */

    public void setEventBridge(EventBridgeMetadata eventBridge) {
        this.eventBridge = eventBridge;
    }

    /**
     * <p>
     * The connector metadata specific to Amazon EventBridge.
     * </p>
     * 
     * @return The connector metadata specific to Amazon EventBridge.
     */

    public EventBridgeMetadata getEventBridge() {
        return this.eventBridge;
    }

    /**
     * <p>
     * The connector metadata specific to Amazon EventBridge.
     * </p>
     * 
     * @param eventBridge
     *        The connector metadata specific to Amazon EventBridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectorMetadata withEventBridge(EventBridgeMetadata eventBridge) {
        setEventBridge(eventBridge);
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
        if (getRedshift() != null)
            sb.append("Redshift: ").append(getRedshift()).append(",");
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
        if (getSnowflake() != null)
            sb.append("Snowflake: ").append(getSnowflake()).append(",");
        if (getTrendmicro() != null)
            sb.append("Trendmicro: ").append(getTrendmicro()).append(",");
        if (getVeeva() != null)
            sb.append("Veeva: ").append(getVeeva()).append(",");
        if (getZendesk() != null)
            sb.append("Zendesk: ").append(getZendesk()).append(",");
        if (getEventBridge() != null)
            sb.append("EventBridge: ").append(getEventBridge());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectorMetadata == false)
            return false;
        ConnectorMetadata other = (ConnectorMetadata) obj;
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
        if (other.getRedshift() == null ^ this.getRedshift() == null)
            return false;
        if (other.getRedshift() != null && other.getRedshift().equals(this.getRedshift()) == false)
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
        if (other.getEventBridge() == null ^ this.getEventBridge() == null)
            return false;
        if (other.getEventBridge() != null && other.getEventBridge().equals(this.getEventBridge()) == false)
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
        hashCode = prime * hashCode + ((getRedshift() == null) ? 0 : getRedshift().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getSalesforce() == null) ? 0 : getSalesforce().hashCode());
        hashCode = prime * hashCode + ((getServiceNow() == null) ? 0 : getServiceNow().hashCode());
        hashCode = prime * hashCode + ((getSingular() == null) ? 0 : getSingular().hashCode());
        hashCode = prime * hashCode + ((getSlack() == null) ? 0 : getSlack().hashCode());
        hashCode = prime * hashCode + ((getSnowflake() == null) ? 0 : getSnowflake().hashCode());
        hashCode = prime * hashCode + ((getTrendmicro() == null) ? 0 : getTrendmicro().hashCode());
        hashCode = prime * hashCode + ((getVeeva() == null) ? 0 : getVeeva().hashCode());
        hashCode = prime * hashCode + ((getZendesk() == null) ? 0 : getZendesk().hashCode());
        hashCode = prime * hashCode + ((getEventBridge() == null) ? 0 : getEventBridge().hashCode());
        return hashCode;
    }

    @Override
    public ConnectorMetadata clone() {
        try {
            return (ConnectorMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ConnectorMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
