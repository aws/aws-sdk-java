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
 * This stores the information that is required to query a particular connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DestinationConnectorProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationConnectorProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The properties required to query Amazon Redshift.
     * </p>
     */
    private RedshiftDestinationProperties redshift;
    /**
     * <p>
     * The properties required to query Amazon S3.
     * </p>
     */
    private S3DestinationProperties s3;
    /**
     * <p>
     * The properties required to query Salesforce.
     * </p>
     */
    private SalesforceDestinationProperties salesforce;
    /**
     * <p>
     * The properties required to query Snowflake.
     * </p>
     */
    private SnowflakeDestinationProperties snowflake;
    /**
     * <p>
     * The properties required to query Amazon EventBridge.
     * </p>
     */
    private EventBridgeDestinationProperties eventBridge;
    /**
     * <p>
     * The properties required to query Amazon Lookout for Metrics.
     * </p>
     */
    private LookoutMetricsDestinationProperties lookoutMetrics;
    /**
     * <p>
     * The properties required to query Upsolver.
     * </p>
     */
    private UpsolverDestinationProperties upsolver;
    /**
     * <p>
     * The properties required to query Amazon Honeycode.
     * </p>
     */
    private HoneycodeDestinationProperties honeycode;
    /**
     * <p>
     * The properties required to query Amazon Connect Customer Profiles.
     * </p>
     */
    private CustomerProfilesDestinationProperties customerProfiles;
    /**
     * <p>
     * The properties required to query Zendesk.
     * </p>
     */
    private ZendeskDestinationProperties zendesk;

    /**
     * <p>
     * The properties required to query Amazon Redshift.
     * </p>
     * 
     * @param redshift
     *        The properties required to query Amazon Redshift.
     */

    public void setRedshift(RedshiftDestinationProperties redshift) {
        this.redshift = redshift;
    }

    /**
     * <p>
     * The properties required to query Amazon Redshift.
     * </p>
     * 
     * @return The properties required to query Amazon Redshift.
     */

    public RedshiftDestinationProperties getRedshift() {
        return this.redshift;
    }

    /**
     * <p>
     * The properties required to query Amazon Redshift.
     * </p>
     * 
     * @param redshift
     *        The properties required to query Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withRedshift(RedshiftDestinationProperties redshift) {
        setRedshift(redshift);
        return this;
    }

    /**
     * <p>
     * The properties required to query Amazon S3.
     * </p>
     * 
     * @param s3
     *        The properties required to query Amazon S3.
     */

    public void setS3(S3DestinationProperties s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * The properties required to query Amazon S3.
     * </p>
     * 
     * @return The properties required to query Amazon S3.
     */

    public S3DestinationProperties getS3() {
        return this.s3;
    }

    /**
     * <p>
     * The properties required to query Amazon S3.
     * </p>
     * 
     * @param s3
     *        The properties required to query Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withS3(S3DestinationProperties s3) {
        setS3(s3);
        return this;
    }

    /**
     * <p>
     * The properties required to query Salesforce.
     * </p>
     * 
     * @param salesforce
     *        The properties required to query Salesforce.
     */

    public void setSalesforce(SalesforceDestinationProperties salesforce) {
        this.salesforce = salesforce;
    }

    /**
     * <p>
     * The properties required to query Salesforce.
     * </p>
     * 
     * @return The properties required to query Salesforce.
     */

    public SalesforceDestinationProperties getSalesforce() {
        return this.salesforce;
    }

    /**
     * <p>
     * The properties required to query Salesforce.
     * </p>
     * 
     * @param salesforce
     *        The properties required to query Salesforce.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withSalesforce(SalesforceDestinationProperties salesforce) {
        setSalesforce(salesforce);
        return this;
    }

    /**
     * <p>
     * The properties required to query Snowflake.
     * </p>
     * 
     * @param snowflake
     *        The properties required to query Snowflake.
     */

    public void setSnowflake(SnowflakeDestinationProperties snowflake) {
        this.snowflake = snowflake;
    }

    /**
     * <p>
     * The properties required to query Snowflake.
     * </p>
     * 
     * @return The properties required to query Snowflake.
     */

    public SnowflakeDestinationProperties getSnowflake() {
        return this.snowflake;
    }

    /**
     * <p>
     * The properties required to query Snowflake.
     * </p>
     * 
     * @param snowflake
     *        The properties required to query Snowflake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withSnowflake(SnowflakeDestinationProperties snowflake) {
        setSnowflake(snowflake);
        return this;
    }

    /**
     * <p>
     * The properties required to query Amazon EventBridge.
     * </p>
     * 
     * @param eventBridge
     *        The properties required to query Amazon EventBridge.
     */

    public void setEventBridge(EventBridgeDestinationProperties eventBridge) {
        this.eventBridge = eventBridge;
    }

    /**
     * <p>
     * The properties required to query Amazon EventBridge.
     * </p>
     * 
     * @return The properties required to query Amazon EventBridge.
     */

    public EventBridgeDestinationProperties getEventBridge() {
        return this.eventBridge;
    }

    /**
     * <p>
     * The properties required to query Amazon EventBridge.
     * </p>
     * 
     * @param eventBridge
     *        The properties required to query Amazon EventBridge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withEventBridge(EventBridgeDestinationProperties eventBridge) {
        setEventBridge(eventBridge);
        return this;
    }

    /**
     * <p>
     * The properties required to query Amazon Lookout for Metrics.
     * </p>
     * 
     * @param lookoutMetrics
     *        The properties required to query Amazon Lookout for Metrics.
     */

    public void setLookoutMetrics(LookoutMetricsDestinationProperties lookoutMetrics) {
        this.lookoutMetrics = lookoutMetrics;
    }

    /**
     * <p>
     * The properties required to query Amazon Lookout for Metrics.
     * </p>
     * 
     * @return The properties required to query Amazon Lookout for Metrics.
     */

    public LookoutMetricsDestinationProperties getLookoutMetrics() {
        return this.lookoutMetrics;
    }

    /**
     * <p>
     * The properties required to query Amazon Lookout for Metrics.
     * </p>
     * 
     * @param lookoutMetrics
     *        The properties required to query Amazon Lookout for Metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withLookoutMetrics(LookoutMetricsDestinationProperties lookoutMetrics) {
        setLookoutMetrics(lookoutMetrics);
        return this;
    }

    /**
     * <p>
     * The properties required to query Upsolver.
     * </p>
     * 
     * @param upsolver
     *        The properties required to query Upsolver.
     */

    public void setUpsolver(UpsolverDestinationProperties upsolver) {
        this.upsolver = upsolver;
    }

    /**
     * <p>
     * The properties required to query Upsolver.
     * </p>
     * 
     * @return The properties required to query Upsolver.
     */

    public UpsolverDestinationProperties getUpsolver() {
        return this.upsolver;
    }

    /**
     * <p>
     * The properties required to query Upsolver.
     * </p>
     * 
     * @param upsolver
     *        The properties required to query Upsolver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withUpsolver(UpsolverDestinationProperties upsolver) {
        setUpsolver(upsolver);
        return this;
    }

    /**
     * <p>
     * The properties required to query Amazon Honeycode.
     * </p>
     * 
     * @param honeycode
     *        The properties required to query Amazon Honeycode.
     */

    public void setHoneycode(HoneycodeDestinationProperties honeycode) {
        this.honeycode = honeycode;
    }

    /**
     * <p>
     * The properties required to query Amazon Honeycode.
     * </p>
     * 
     * @return The properties required to query Amazon Honeycode.
     */

    public HoneycodeDestinationProperties getHoneycode() {
        return this.honeycode;
    }

    /**
     * <p>
     * The properties required to query Amazon Honeycode.
     * </p>
     * 
     * @param honeycode
     *        The properties required to query Amazon Honeycode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withHoneycode(HoneycodeDestinationProperties honeycode) {
        setHoneycode(honeycode);
        return this;
    }

    /**
     * <p>
     * The properties required to query Amazon Connect Customer Profiles.
     * </p>
     * 
     * @param customerProfiles
     *        The properties required to query Amazon Connect Customer Profiles.
     */

    public void setCustomerProfiles(CustomerProfilesDestinationProperties customerProfiles) {
        this.customerProfiles = customerProfiles;
    }

    /**
     * <p>
     * The properties required to query Amazon Connect Customer Profiles.
     * </p>
     * 
     * @return The properties required to query Amazon Connect Customer Profiles.
     */

    public CustomerProfilesDestinationProperties getCustomerProfiles() {
        return this.customerProfiles;
    }

    /**
     * <p>
     * The properties required to query Amazon Connect Customer Profiles.
     * </p>
     * 
     * @param customerProfiles
     *        The properties required to query Amazon Connect Customer Profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withCustomerProfiles(CustomerProfilesDestinationProperties customerProfiles) {
        setCustomerProfiles(customerProfiles);
        return this;
    }

    /**
     * <p>
     * The properties required to query Zendesk.
     * </p>
     * 
     * @param zendesk
     *        The properties required to query Zendesk.
     */

    public void setZendesk(ZendeskDestinationProperties zendesk) {
        this.zendesk = zendesk;
    }

    /**
     * <p>
     * The properties required to query Zendesk.
     * </p>
     * 
     * @return The properties required to query Zendesk.
     */

    public ZendeskDestinationProperties getZendesk() {
        return this.zendesk;
    }

    /**
     * <p>
     * The properties required to query Zendesk.
     * </p>
     * 
     * @param zendesk
     *        The properties required to query Zendesk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConnectorProperties withZendesk(ZendeskDestinationProperties zendesk) {
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
        if (getRedshift() != null)
            sb.append("Redshift: ").append(getRedshift()).append(",");
        if (getS3() != null)
            sb.append("S3: ").append(getS3()).append(",");
        if (getSalesforce() != null)
            sb.append("Salesforce: ").append(getSalesforce()).append(",");
        if (getSnowflake() != null)
            sb.append("Snowflake: ").append(getSnowflake()).append(",");
        if (getEventBridge() != null)
            sb.append("EventBridge: ").append(getEventBridge()).append(",");
        if (getLookoutMetrics() != null)
            sb.append("LookoutMetrics: ").append(getLookoutMetrics()).append(",");
        if (getUpsolver() != null)
            sb.append("Upsolver: ").append(getUpsolver()).append(",");
        if (getHoneycode() != null)
            sb.append("Honeycode: ").append(getHoneycode()).append(",");
        if (getCustomerProfiles() != null)
            sb.append("CustomerProfiles: ").append(getCustomerProfiles()).append(",");
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

        if (obj instanceof DestinationConnectorProperties == false)
            return false;
        DestinationConnectorProperties other = (DestinationConnectorProperties) obj;
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
        if (other.getSnowflake() == null ^ this.getSnowflake() == null)
            return false;
        if (other.getSnowflake() != null && other.getSnowflake().equals(this.getSnowflake()) == false)
            return false;
        if (other.getEventBridge() == null ^ this.getEventBridge() == null)
            return false;
        if (other.getEventBridge() != null && other.getEventBridge().equals(this.getEventBridge()) == false)
            return false;
        if (other.getLookoutMetrics() == null ^ this.getLookoutMetrics() == null)
            return false;
        if (other.getLookoutMetrics() != null && other.getLookoutMetrics().equals(this.getLookoutMetrics()) == false)
            return false;
        if (other.getUpsolver() == null ^ this.getUpsolver() == null)
            return false;
        if (other.getUpsolver() != null && other.getUpsolver().equals(this.getUpsolver()) == false)
            return false;
        if (other.getHoneycode() == null ^ this.getHoneycode() == null)
            return false;
        if (other.getHoneycode() != null && other.getHoneycode().equals(this.getHoneycode()) == false)
            return false;
        if (other.getCustomerProfiles() == null ^ this.getCustomerProfiles() == null)
            return false;
        if (other.getCustomerProfiles() != null && other.getCustomerProfiles().equals(this.getCustomerProfiles()) == false)
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

        hashCode = prime * hashCode + ((getRedshift() == null) ? 0 : getRedshift().hashCode());
        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        hashCode = prime * hashCode + ((getSalesforce() == null) ? 0 : getSalesforce().hashCode());
        hashCode = prime * hashCode + ((getSnowflake() == null) ? 0 : getSnowflake().hashCode());
        hashCode = prime * hashCode + ((getEventBridge() == null) ? 0 : getEventBridge().hashCode());
        hashCode = prime * hashCode + ((getLookoutMetrics() == null) ? 0 : getLookoutMetrics().hashCode());
        hashCode = prime * hashCode + ((getUpsolver() == null) ? 0 : getUpsolver().hashCode());
        hashCode = prime * hashCode + ((getHoneycode() == null) ? 0 : getHoneycode().hashCode());
        hashCode = prime * hashCode + ((getCustomerProfiles() == null) ? 0 : getCustomerProfiles().hashCode());
        hashCode = prime * hashCode + ((getZendesk() == null) ? 0 : getZendesk().hashCode());
        return hashCode;
    }

    @Override
    public DestinationConnectorProperties clone() {
        try {
            return (DestinationConnectorProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.DestinationConnectorPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
