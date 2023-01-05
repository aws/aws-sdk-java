/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The data source configuration object of a streaming media pipeline.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/LiveConnectorSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LiveConnectorSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source configuration's media source type.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The configuration settings of the connector pipeline.
     * </p>
     */
    private ChimeSdkMeetingLiveConnectorConfiguration chimeSdkMeetingLiveConnectorConfiguration;

    /**
     * <p>
     * The source configuration's media source type.
     * </p>
     * 
     * @param sourceType
     *        The source configuration's media source type.
     * @see LiveConnectorSourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source configuration's media source type.
     * </p>
     * 
     * @return The source configuration's media source type.
     * @see LiveConnectorSourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source configuration's media source type.
     * </p>
     * 
     * @param sourceType
     *        The source configuration's media source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LiveConnectorSourceType
     */

    public LiveConnectorSourceConfiguration withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The source configuration's media source type.
     * </p>
     * 
     * @param sourceType
     *        The source configuration's media source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LiveConnectorSourceType
     */

    public LiveConnectorSourceConfiguration withSourceType(LiveConnectorSourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * The configuration settings of the connector pipeline.
     * </p>
     * 
     * @param chimeSdkMeetingLiveConnectorConfiguration
     *        The configuration settings of the connector pipeline.
     */

    public void setChimeSdkMeetingLiveConnectorConfiguration(ChimeSdkMeetingLiveConnectorConfiguration chimeSdkMeetingLiveConnectorConfiguration) {
        this.chimeSdkMeetingLiveConnectorConfiguration = chimeSdkMeetingLiveConnectorConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the connector pipeline.
     * </p>
     * 
     * @return The configuration settings of the connector pipeline.
     */

    public ChimeSdkMeetingLiveConnectorConfiguration getChimeSdkMeetingLiveConnectorConfiguration() {
        return this.chimeSdkMeetingLiveConnectorConfiguration;
    }

    /**
     * <p>
     * The configuration settings of the connector pipeline.
     * </p>
     * 
     * @param chimeSdkMeetingLiveConnectorConfiguration
     *        The configuration settings of the connector pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LiveConnectorSourceConfiguration withChimeSdkMeetingLiveConnectorConfiguration(
            ChimeSdkMeetingLiveConnectorConfiguration chimeSdkMeetingLiveConnectorConfiguration) {
        setChimeSdkMeetingLiveConnectorConfiguration(chimeSdkMeetingLiveConnectorConfiguration);
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
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getChimeSdkMeetingLiveConnectorConfiguration() != null)
            sb.append("ChimeSdkMeetingLiveConnectorConfiguration: ").append(getChimeSdkMeetingLiveConnectorConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LiveConnectorSourceConfiguration == false)
            return false;
        LiveConnectorSourceConfiguration other = (LiveConnectorSourceConfiguration) obj;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getChimeSdkMeetingLiveConnectorConfiguration() == null ^ this.getChimeSdkMeetingLiveConnectorConfiguration() == null)
            return false;
        if (other.getChimeSdkMeetingLiveConnectorConfiguration() != null
                && other.getChimeSdkMeetingLiveConnectorConfiguration().equals(this.getChimeSdkMeetingLiveConnectorConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode
                + ((getChimeSdkMeetingLiveConnectorConfiguration() == null) ? 0 : getChimeSdkMeetingLiveConnectorConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public LiveConnectorSourceConfiguration clone() {
        try {
            return (LiveConnectorSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.LiveConnectorSourceConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
