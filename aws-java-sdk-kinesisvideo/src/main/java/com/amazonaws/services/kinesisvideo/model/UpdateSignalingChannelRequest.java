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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateSignalingChannel"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSignalingChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the signaling channel that you want to update.
     * </p>
     */
    private String channelARN;
    /**
     * <p>
     * The current version of the signaling channel that you want to update.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * The structure containing the configuration for the <code>SINGLE_MASTER</code> type of the signaling channel that
     * you want to update.
     * </p>
     */
    private SingleMasterConfiguration singleMasterConfiguration;

    /**
     * <p>
     * The ARN of the signaling channel that you want to update.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel that you want to update.
     */

    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel that you want to update.
     * </p>
     * 
     * @return The ARN of the signaling channel that you want to update.
     */

    public String getChannelARN() {
        return this.channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel that you want to update.
     * </p>
     * 
     * @param channelARN
     *        The ARN of the signaling channel that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalingChannelRequest withChannelARN(String channelARN) {
        setChannelARN(channelARN);
        return this;
    }

    /**
     * <p>
     * The current version of the signaling channel that you want to update.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the signaling channel that you want to update.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The current version of the signaling channel that you want to update.
     * </p>
     * 
     * @return The current version of the signaling channel that you want to update.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The current version of the signaling channel that you want to update.
     * </p>
     * 
     * @param currentVersion
     *        The current version of the signaling channel that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalingChannelRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * The structure containing the configuration for the <code>SINGLE_MASTER</code> type of the signaling channel that
     * you want to update.
     * </p>
     * 
     * @param singleMasterConfiguration
     *        The structure containing the configuration for the <code>SINGLE_MASTER</code> type of the signaling
     *        channel that you want to update.
     */

    public void setSingleMasterConfiguration(SingleMasterConfiguration singleMasterConfiguration) {
        this.singleMasterConfiguration = singleMasterConfiguration;
    }

    /**
     * <p>
     * The structure containing the configuration for the <code>SINGLE_MASTER</code> type of the signaling channel that
     * you want to update.
     * </p>
     * 
     * @return The structure containing the configuration for the <code>SINGLE_MASTER</code> type of the signaling
     *         channel that you want to update.
     */

    public SingleMasterConfiguration getSingleMasterConfiguration() {
        return this.singleMasterConfiguration;
    }

    /**
     * <p>
     * The structure containing the configuration for the <code>SINGLE_MASTER</code> type of the signaling channel that
     * you want to update.
     * </p>
     * 
     * @param singleMasterConfiguration
     *        The structure containing the configuration for the <code>SINGLE_MASTER</code> type of the signaling
     *        channel that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSignalingChannelRequest withSingleMasterConfiguration(SingleMasterConfiguration singleMasterConfiguration) {
        setSingleMasterConfiguration(singleMasterConfiguration);
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
        if (getChannelARN() != null)
            sb.append("ChannelARN: ").append(getChannelARN()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getSingleMasterConfiguration() != null)
            sb.append("SingleMasterConfiguration: ").append(getSingleMasterConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSignalingChannelRequest == false)
            return false;
        UpdateSignalingChannelRequest other = (UpdateSignalingChannelRequest) obj;
        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getSingleMasterConfiguration() == null ^ this.getSingleMasterConfiguration() == null)
            return false;
        if (other.getSingleMasterConfiguration() != null && other.getSingleMasterConfiguration().equals(this.getSingleMasterConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getSingleMasterConfiguration() == null) ? 0 : getSingleMasterConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSignalingChannelRequest clone() {
        return (UpdateSignalingChannelRequest) super.clone();
    }

}
