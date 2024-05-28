/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the Amazon MSK cluster used as the source for a Firehose delivery stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/MSKSourceDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MSKSourceDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Amazon MSK cluster.
     * </p>
     */
    private String mSKClusterARN;
    /**
     * <p>
     * The topic name within the Amazon MSK cluster.
     * </p>
     */
    private String topicName;
    /**
     * <p>
     * The authentication configuration of the Amazon MSK cluster.
     * </p>
     */
    private AuthenticationConfiguration authenticationConfiguration;
    /**
     * <p>
     * Firehose starts retrieving records from the topic within the Amazon MSK cluster starting with this timestamp.
     * </p>
     */
    private java.util.Date deliveryStartTimestamp;

    /**
     * <p>
     * The ARN of the Amazon MSK cluster.
     * </p>
     * 
     * @param mSKClusterARN
     *        The ARN of the Amazon MSK cluster.
     */

    public void setMSKClusterARN(String mSKClusterARN) {
        this.mSKClusterARN = mSKClusterARN;
    }

    /**
     * <p>
     * The ARN of the Amazon MSK cluster.
     * </p>
     * 
     * @return The ARN of the Amazon MSK cluster.
     */

    public String getMSKClusterARN() {
        return this.mSKClusterARN;
    }

    /**
     * <p>
     * The ARN of the Amazon MSK cluster.
     * </p>
     * 
     * @param mSKClusterARN
     *        The ARN of the Amazon MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MSKSourceDescription withMSKClusterARN(String mSKClusterARN) {
        setMSKClusterARN(mSKClusterARN);
        return this;
    }

    /**
     * <p>
     * The topic name within the Amazon MSK cluster.
     * </p>
     * 
     * @param topicName
     *        The topic name within the Amazon MSK cluster.
     */

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The topic name within the Amazon MSK cluster.
     * </p>
     * 
     * @return The topic name within the Amazon MSK cluster.
     */

    public String getTopicName() {
        return this.topicName;
    }

    /**
     * <p>
     * The topic name within the Amazon MSK cluster.
     * </p>
     * 
     * @param topicName
     *        The topic name within the Amazon MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MSKSourceDescription withTopicName(String topicName) {
        setTopicName(topicName);
        return this;
    }

    /**
     * <p>
     * The authentication configuration of the Amazon MSK cluster.
     * </p>
     * 
     * @param authenticationConfiguration
     *        The authentication configuration of the Amazon MSK cluster.
     */

    public void setAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    /**
     * <p>
     * The authentication configuration of the Amazon MSK cluster.
     * </p>
     * 
     * @return The authentication configuration of the Amazon MSK cluster.
     */

    public AuthenticationConfiguration getAuthenticationConfiguration() {
        return this.authenticationConfiguration;
    }

    /**
     * <p>
     * The authentication configuration of the Amazon MSK cluster.
     * </p>
     * 
     * @param authenticationConfiguration
     *        The authentication configuration of the Amazon MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MSKSourceDescription withAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration) {
        setAuthenticationConfiguration(authenticationConfiguration);
        return this;
    }

    /**
     * <p>
     * Firehose starts retrieving records from the topic within the Amazon MSK cluster starting with this timestamp.
     * </p>
     * 
     * @param deliveryStartTimestamp
     *        Firehose starts retrieving records from the topic within the Amazon MSK cluster starting with this
     *        timestamp.
     */

    public void setDeliveryStartTimestamp(java.util.Date deliveryStartTimestamp) {
        this.deliveryStartTimestamp = deliveryStartTimestamp;
    }

    /**
     * <p>
     * Firehose starts retrieving records from the topic within the Amazon MSK cluster starting with this timestamp.
     * </p>
     * 
     * @return Firehose starts retrieving records from the topic within the Amazon MSK cluster starting with this
     *         timestamp.
     */

    public java.util.Date getDeliveryStartTimestamp() {
        return this.deliveryStartTimestamp;
    }

    /**
     * <p>
     * Firehose starts retrieving records from the topic within the Amazon MSK cluster starting with this timestamp.
     * </p>
     * 
     * @param deliveryStartTimestamp
     *        Firehose starts retrieving records from the topic within the Amazon MSK cluster starting with this
     *        timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MSKSourceDescription withDeliveryStartTimestamp(java.util.Date deliveryStartTimestamp) {
        setDeliveryStartTimestamp(deliveryStartTimestamp);
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
        if (getMSKClusterARN() != null)
            sb.append("MSKClusterARN: ").append(getMSKClusterARN()).append(",");
        if (getTopicName() != null)
            sb.append("TopicName: ").append(getTopicName()).append(",");
        if (getAuthenticationConfiguration() != null)
            sb.append("AuthenticationConfiguration: ").append(getAuthenticationConfiguration()).append(",");
        if (getDeliveryStartTimestamp() != null)
            sb.append("DeliveryStartTimestamp: ").append(getDeliveryStartTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MSKSourceDescription == false)
            return false;
        MSKSourceDescription other = (MSKSourceDescription) obj;
        if (other.getMSKClusterARN() == null ^ this.getMSKClusterARN() == null)
            return false;
        if (other.getMSKClusterARN() != null && other.getMSKClusterARN().equals(this.getMSKClusterARN()) == false)
            return false;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        if (other.getAuthenticationConfiguration() == null ^ this.getAuthenticationConfiguration() == null)
            return false;
        if (other.getAuthenticationConfiguration() != null && other.getAuthenticationConfiguration().equals(this.getAuthenticationConfiguration()) == false)
            return false;
        if (other.getDeliveryStartTimestamp() == null ^ this.getDeliveryStartTimestamp() == null)
            return false;
        if (other.getDeliveryStartTimestamp() != null && other.getDeliveryStartTimestamp().equals(this.getDeliveryStartTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMSKClusterARN() == null) ? 0 : getMSKClusterARN().hashCode());
        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationConfiguration() == null) ? 0 : getAuthenticationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStartTimestamp() == null) ? 0 : getDeliveryStartTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public MSKSourceDescription clone() {
        try {
            return (MSKSourceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.MSKSourceDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
