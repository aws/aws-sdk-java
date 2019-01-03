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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/GetConfigurationSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConfigurationSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     */
    private String configurationSetName;
    /**
     * <p>
     * An object that defines the open and click tracking options for emails that you send using the configuration set.
     * </p>
     */
    private TrackingOptions trackingOptions;
    /**
     * <p>
     * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration
     * set.
     * </p>
     */
    private DeliveryOptions deliveryOptions;
    /**
     * <p>
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you send
     * that use the configuration set.
     * </p>
     */
    private ReputationOptions reputationOptions;
    /**
     * <p>
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration set.
     * </p>
     */
    private SendingOptions sendingOptions;

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set.
     */

    public void setConfigurationSetName(String configurationSetName) {
        this.configurationSetName = configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     * 
     * @return The name of the configuration set.
     */

    public String getConfigurationSetName() {
        return this.configurationSetName;
    }

    /**
     * <p>
     * The name of the configuration set.
     * </p>
     * 
     * @param configurationSetName
     *        The name of the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationSetResult withConfigurationSetName(String configurationSetName) {
        setConfigurationSetName(configurationSetName);
        return this;
    }

    /**
     * <p>
     * An object that defines the open and click tracking options for emails that you send using the configuration set.
     * </p>
     * 
     * @param trackingOptions
     *        An object that defines the open and click tracking options for emails that you send using the
     *        configuration set.
     */

    public void setTrackingOptions(TrackingOptions trackingOptions) {
        this.trackingOptions = trackingOptions;
    }

    /**
     * <p>
     * An object that defines the open and click tracking options for emails that you send using the configuration set.
     * </p>
     * 
     * @return An object that defines the open and click tracking options for emails that you send using the
     *         configuration set.
     */

    public TrackingOptions getTrackingOptions() {
        return this.trackingOptions;
    }

    /**
     * <p>
     * An object that defines the open and click tracking options for emails that you send using the configuration set.
     * </p>
     * 
     * @param trackingOptions
     *        An object that defines the open and click tracking options for emails that you send using the
     *        configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationSetResult withTrackingOptions(TrackingOptions trackingOptions) {
        setTrackingOptions(trackingOptions);
        return this;
    }

    /**
     * <p>
     * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration
     * set.
     * </p>
     * 
     * @param deliveryOptions
     *        An object that defines the dedicated IP pool that is used to send emails that you send using the
     *        configuration set.
     */

    public void setDeliveryOptions(DeliveryOptions deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
    }

    /**
     * <p>
     * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration
     * set.
     * </p>
     * 
     * @return An object that defines the dedicated IP pool that is used to send emails that you send using the
     *         configuration set.
     */

    public DeliveryOptions getDeliveryOptions() {
        return this.deliveryOptions;
    }

    /**
     * <p>
     * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration
     * set.
     * </p>
     * 
     * @param deliveryOptions
     *        An object that defines the dedicated IP pool that is used to send emails that you send using the
     *        configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationSetResult withDeliveryOptions(DeliveryOptions deliveryOptions) {
        setDeliveryOptions(deliveryOptions);
        return this;
    }

    /**
     * <p>
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you send
     * that use the configuration set.
     * </p>
     * 
     * @param reputationOptions
     *        An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you
     *        send that use the configuration set.
     */

    public void setReputationOptions(ReputationOptions reputationOptions) {
        this.reputationOptions = reputationOptions;
    }

    /**
     * <p>
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you send
     * that use the configuration set.
     * </p>
     * 
     * @return An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you
     *         send that use the configuration set.
     */

    public ReputationOptions getReputationOptions() {
        return this.reputationOptions;
    }

    /**
     * <p>
     * An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you send
     * that use the configuration set.
     * </p>
     * 
     * @param reputationOptions
     *        An object that defines whether or not Amazon Pinpoint collects reputation metrics for the emails that you
     *        send that use the configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationSetResult withReputationOptions(ReputationOptions reputationOptions) {
        setReputationOptions(reputationOptions);
        return this;
    }

    /**
     * <p>
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration set.
     * </p>
     * 
     * @param sendingOptions
     *        An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration
     *        set.
     */

    public void setSendingOptions(SendingOptions sendingOptions) {
        this.sendingOptions = sendingOptions;
    }

    /**
     * <p>
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration set.
     * </p>
     * 
     * @return An object that defines whether or not Amazon Pinpoint can send email that you send using the
     *         configuration set.
     */

    public SendingOptions getSendingOptions() {
        return this.sendingOptions;
    }

    /**
     * <p>
     * An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration set.
     * </p>
     * 
     * @param sendingOptions
     *        An object that defines whether or not Amazon Pinpoint can send email that you send using the configuration
     *        set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConfigurationSetResult withSendingOptions(SendingOptions sendingOptions) {
        setSendingOptions(sendingOptions);
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
        if (getConfigurationSetName() != null)
            sb.append("ConfigurationSetName: ").append(getConfigurationSetName()).append(",");
        if (getTrackingOptions() != null)
            sb.append("TrackingOptions: ").append(getTrackingOptions()).append(",");
        if (getDeliveryOptions() != null)
            sb.append("DeliveryOptions: ").append(getDeliveryOptions()).append(",");
        if (getReputationOptions() != null)
            sb.append("ReputationOptions: ").append(getReputationOptions()).append(",");
        if (getSendingOptions() != null)
            sb.append("SendingOptions: ").append(getSendingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConfigurationSetResult == false)
            return false;
        GetConfigurationSetResult other = (GetConfigurationSetResult) obj;
        if (other.getConfigurationSetName() == null ^ this.getConfigurationSetName() == null)
            return false;
        if (other.getConfigurationSetName() != null && other.getConfigurationSetName().equals(this.getConfigurationSetName()) == false)
            return false;
        if (other.getTrackingOptions() == null ^ this.getTrackingOptions() == null)
            return false;
        if (other.getTrackingOptions() != null && other.getTrackingOptions().equals(this.getTrackingOptions()) == false)
            return false;
        if (other.getDeliveryOptions() == null ^ this.getDeliveryOptions() == null)
            return false;
        if (other.getDeliveryOptions() != null && other.getDeliveryOptions().equals(this.getDeliveryOptions()) == false)
            return false;
        if (other.getReputationOptions() == null ^ this.getReputationOptions() == null)
            return false;
        if (other.getReputationOptions() != null && other.getReputationOptions().equals(this.getReputationOptions()) == false)
            return false;
        if (other.getSendingOptions() == null ^ this.getSendingOptions() == null)
            return false;
        if (other.getSendingOptions() != null && other.getSendingOptions().equals(this.getSendingOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationSetName() == null) ? 0 : getConfigurationSetName().hashCode());
        hashCode = prime * hashCode + ((getTrackingOptions() == null) ? 0 : getTrackingOptions().hashCode());
        hashCode = prime * hashCode + ((getDeliveryOptions() == null) ? 0 : getDeliveryOptions().hashCode());
        hashCode = prime * hashCode + ((getReputationOptions() == null) ? 0 : getReputationOptions().hashCode());
        hashCode = prime * hashCode + ((getSendingOptions() == null) ? 0 : getSendingOptions().hashCode());
        return hashCode;
    }

    @Override
    public GetConfigurationSetResult clone() {
        try {
            return (GetConfigurationSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
