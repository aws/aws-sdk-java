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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/StartWirelessDeviceImportTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartWirelessDeviceImportTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Sidewalk destination that describes the IoT rule to route messages from the devices in the import
     * task that are onboarded to AWS IoT Wireless.
     * </p>
     */
    private String destinationName;

    private String clientRequestToken;

    private java.util.List<Tag> tags;
    /**
     * <p>
     * The Sidewalk-related parameters for importing wireless devices that need to be provisioned in bulk.
     * </p>
     */
    private SidewalkStartImportInfo sidewalk;

    /**
     * <p>
     * The name of the Sidewalk destination that describes the IoT rule to route messages from the devices in the import
     * task that are onboarded to AWS IoT Wireless.
     * </p>
     * 
     * @param destinationName
     *        The name of the Sidewalk destination that describes the IoT rule to route messages from the devices in the
     *        import task that are onboarded to AWS IoT Wireless.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of the Sidewalk destination that describes the IoT rule to route messages from the devices in the import
     * task that are onboarded to AWS IoT Wireless.
     * </p>
     * 
     * @return The name of the Sidewalk destination that describes the IoT rule to route messages from the devices in
     *         the import task that are onboarded to AWS IoT Wireless.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of the Sidewalk destination that describes the IoT rule to route messages from the devices in the import
     * task that are onboarded to AWS IoT Wireless.
     * </p>
     * 
     * @param destinationName
     *        The name of the Sidewalk destination that describes the IoT rule to route messages from the devices in the
     *        import task that are onboarded to AWS IoT Wireless.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWirelessDeviceImportTaskRequest withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWirelessDeviceImportTaskRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWirelessDeviceImportTaskRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWirelessDeviceImportTaskRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Sidewalk-related parameters for importing wireless devices that need to be provisioned in bulk.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk-related parameters for importing wireless devices that need to be provisioned in bulk.
     */

    public void setSidewalk(SidewalkStartImportInfo sidewalk) {
        this.sidewalk = sidewalk;
    }

    /**
     * <p>
     * The Sidewalk-related parameters for importing wireless devices that need to be provisioned in bulk.
     * </p>
     * 
     * @return The Sidewalk-related parameters for importing wireless devices that need to be provisioned in bulk.
     */

    public SidewalkStartImportInfo getSidewalk() {
        return this.sidewalk;
    }

    /**
     * <p>
     * The Sidewalk-related parameters for importing wireless devices that need to be provisioned in bulk.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk-related parameters for importing wireless devices that need to be provisioned in bulk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWirelessDeviceImportTaskRequest withSidewalk(SidewalkStartImportInfo sidewalk) {
        setSidewalk(sidewalk);
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
        if (getDestinationName() != null)
            sb.append("DestinationName: ").append(getDestinationName()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartWirelessDeviceImportTaskRequest == false)
            return false;
        StartWirelessDeviceImportTaskRequest other = (StartWirelessDeviceImportTaskRequest) obj;
        if (other.getDestinationName() == null ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationName() == null) ? 0 : getDestinationName().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        return hashCode;
    }

    @Override
    public StartWirelessDeviceImportTaskRequest clone() {
        return (StartWirelessDeviceImportTaskRequest) super.clone();
    }

}
