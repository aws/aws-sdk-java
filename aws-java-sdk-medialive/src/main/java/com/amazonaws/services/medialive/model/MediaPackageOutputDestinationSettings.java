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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Media Package Output Destination Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/MediaPackageOutputDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaPackageOutputDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * ID of the channel in MediaPackage that is the destination for this output group. You do not need to specify the
     * individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive pipelines to the two
     * MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the same region.
     */
    private String channelId;

    /**
     * ID of the channel in MediaPackage that is the destination for this output group. You do not need to specify the
     * individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive pipelines to the two
     * MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the same region.
     * 
     * @param channelId
     *        ID of the channel in MediaPackage that is the destination for this output group. You do not need to
     *        specify the individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive
     *        pipelines to the two MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the
     *        same region.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * ID of the channel in MediaPackage that is the destination for this output group. You do not need to specify the
     * individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive pipelines to the two
     * MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the same region.
     * 
     * @return ID of the channel in MediaPackage that is the destination for this output group. You do not need to
     *         specify the individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive
     *         pipelines to the two MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the
     *         same region.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * ID of the channel in MediaPackage that is the destination for this output group. You do not need to specify the
     * individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive pipelines to the two
     * MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the same region.
     * 
     * @param channelId
     *        ID of the channel in MediaPackage that is the destination for this output group. You do not need to
     *        specify the individual inputs in MediaPackage; MediaLive will handle the connection of the two MediaLive
     *        pipelines to the two MediaPackage inputs. The MediaPackage channel and MediaLive channel must be in the
     *        same region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaPackageOutputDestinationSettings withChannelId(String channelId) {
        setChannelId(channelId);
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
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaPackageOutputDestinationSettings == false)
            return false;
        MediaPackageOutputDestinationSettings other = (MediaPackageOutputDestinationSettings) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        return hashCode;
    }

    @Override
    public MediaPackageOutputDestinationSettings clone() {
        try {
            return (MediaPackageOutputDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.MediaPackageOutputDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
