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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html">AWS Lambda
 * layer</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/LayersListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LayersListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the layer.
     * </p>
     */
    private String layerName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     */
    private String layerArn;
    /**
     * <p>
     * The newest version of the layer.
     * </p>
     */
    private LayerVersionsListItem latestMatchingVersion;

    /**
     * <p>
     * The name of the layer.
     * </p>
     * 
     * @param layerName
     *        The name of the layer.
     */

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    /**
     * <p>
     * The name of the layer.
     * </p>
     * 
     * @return The name of the layer.
     */

    public String getLayerName() {
        return this.layerName;
    }

    /**
     * <p>
     * The name of the layer.
     * </p>
     * 
     * @param layerName
     *        The name of the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayersListItem withLayerName(String layerName) {
        setLayerName(layerName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     * 
     * @param layerArn
     *        The Amazon Resource Name (ARN) of the function layer.
     */

    public void setLayerArn(String layerArn) {
        this.layerArn = layerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the function layer.
     */

    public String getLayerArn() {
        return this.layerArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the function layer.
     * </p>
     * 
     * @param layerArn
     *        The Amazon Resource Name (ARN) of the function layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayersListItem withLayerArn(String layerArn) {
        setLayerArn(layerArn);
        return this;
    }

    /**
     * <p>
     * The newest version of the layer.
     * </p>
     * 
     * @param latestMatchingVersion
     *        The newest version of the layer.
     */

    public void setLatestMatchingVersion(LayerVersionsListItem latestMatchingVersion) {
        this.latestMatchingVersion = latestMatchingVersion;
    }

    /**
     * <p>
     * The newest version of the layer.
     * </p>
     * 
     * @return The newest version of the layer.
     */

    public LayerVersionsListItem getLatestMatchingVersion() {
        return this.latestMatchingVersion;
    }

    /**
     * <p>
     * The newest version of the layer.
     * </p>
     * 
     * @param latestMatchingVersion
     *        The newest version of the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LayersListItem withLatestMatchingVersion(LayerVersionsListItem latestMatchingVersion) {
        setLatestMatchingVersion(latestMatchingVersion);
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
        if (getLayerName() != null)
            sb.append("LayerName: ").append(getLayerName()).append(",");
        if (getLayerArn() != null)
            sb.append("LayerArn: ").append(getLayerArn()).append(",");
        if (getLatestMatchingVersion() != null)
            sb.append("LatestMatchingVersion: ").append(getLatestMatchingVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LayersListItem == false)
            return false;
        LayersListItem other = (LayersListItem) obj;
        if (other.getLayerName() == null ^ this.getLayerName() == null)
            return false;
        if (other.getLayerName() != null && other.getLayerName().equals(this.getLayerName()) == false)
            return false;
        if (other.getLayerArn() == null ^ this.getLayerArn() == null)
            return false;
        if (other.getLayerArn() != null && other.getLayerArn().equals(this.getLayerArn()) == false)
            return false;
        if (other.getLatestMatchingVersion() == null ^ this.getLatestMatchingVersion() == null)
            return false;
        if (other.getLatestMatchingVersion() != null && other.getLatestMatchingVersion().equals(this.getLatestMatchingVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerName() == null) ? 0 : getLayerName().hashCode());
        hashCode = prime * hashCode + ((getLayerArn() == null) ? 0 : getLayerArn().hashCode());
        hashCode = prime * hashCode + ((getLatestMatchingVersion() == null) ? 0 : getLatestMatchingVersion().hashCode());
        return hashCode;
    }

    @Override
    public LayersListItem clone() {
        try {
            return (LayersListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.LayersListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
