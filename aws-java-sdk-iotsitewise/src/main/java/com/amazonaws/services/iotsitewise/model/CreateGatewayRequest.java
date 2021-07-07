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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/CreateGateway" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, friendly name for the gateway.
     * </p>
     */
    private String gatewayName;
    /**
     * <p>
     * The gateway's platform. You can only specify one platform in a gateway.
     * </p>
     */
    private GatewayPlatform gatewayPlatform;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the gateway. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, friendly name for the gateway.
     * </p>
     * 
     * @param gatewayName
     *        A unique, friendly name for the gateway.
     */

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * A unique, friendly name for the gateway.
     * </p>
     * 
     * @return A unique, friendly name for the gateway.
     */

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * <p>
     * A unique, friendly name for the gateway.
     * </p>
     * 
     * @param gatewayName
     *        A unique, friendly name for the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withGatewayName(String gatewayName) {
        setGatewayName(gatewayName);
        return this;
    }

    /**
     * <p>
     * The gateway's platform. You can only specify one platform in a gateway.
     * </p>
     * 
     * @param gatewayPlatform
     *        The gateway's platform. You can only specify one platform in a gateway.
     */

    public void setGatewayPlatform(GatewayPlatform gatewayPlatform) {
        this.gatewayPlatform = gatewayPlatform;
    }

    /**
     * <p>
     * The gateway's platform. You can only specify one platform in a gateway.
     * </p>
     * 
     * @return The gateway's platform. You can only specify one platform in a gateway.
     */

    public GatewayPlatform getGatewayPlatform() {
        return this.gatewayPlatform;
    }

    /**
     * <p>
     * The gateway's platform. You can only specify one platform in a gateway.
     * </p>
     * 
     * @param gatewayPlatform
     *        The gateway's platform. You can only specify one platform in a gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withGatewayPlatform(GatewayPlatform gatewayPlatform) {
        setGatewayPlatform(gatewayPlatform);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the gateway. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the gateway. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *         SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the gateway. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the gateway. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *        SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the gateway. For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT SiteWise
     * resources</a> in the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the gateway. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html">Tagging your IoT
     *        SiteWise resources</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateGatewayRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRequest clearTagsEntries() {
        this.tags = null;
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
        if (getGatewayName() != null)
            sb.append("GatewayName: ").append(getGatewayName()).append(",");
        if (getGatewayPlatform() != null)
            sb.append("GatewayPlatform: ").append(getGatewayPlatform()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGatewayRequest == false)
            return false;
        CreateGatewayRequest other = (CreateGatewayRequest) obj;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getGatewayPlatform() == null ^ this.getGatewayPlatform() == null)
            return false;
        if (other.getGatewayPlatform() != null && other.getGatewayPlatform().equals(this.getGatewayPlatform()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime * hashCode + ((getGatewayPlatform() == null) ? 0 : getGatewayPlatform().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateGatewayRequest clone() {
        return (CreateGatewayRequest) super.clone();
    }

}
