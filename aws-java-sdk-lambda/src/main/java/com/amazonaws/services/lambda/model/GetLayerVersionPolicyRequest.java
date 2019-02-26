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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetLayerVersionPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLayerVersionPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     */
    private String layerName;
    /**
     * <p>
     * The version number.
     * </p>
     */
    private Long versionNumber;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @param layerName
     *        The name or Amazon Resource Name (ARN) of the layer.
     */

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the layer.
     */

    public String getLayerName() {
        return this.layerName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the layer.
     * </p>
     * 
     * @param layerName
     *        The name or Amazon Resource Name (ARN) of the layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLayerVersionPolicyRequest withLayerName(String layerName) {
        setLayerName(layerName);
        return this;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param versionNumber
     *        The version number.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @return The version number.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * 
     * @param versionNumber
     *        The version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLayerVersionPolicyRequest withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
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
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLayerVersionPolicyRequest == false)
            return false;
        GetLayerVersionPolicyRequest other = (GetLayerVersionPolicyRequest) obj;
        if (other.getLayerName() == null ^ this.getLayerName() == null)
            return false;
        if (other.getLayerName() != null && other.getLayerName().equals(this.getLayerName()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLayerName() == null) ? 0 : getLayerName().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public GetLayerVersionPolicyRequest clone() {
        return (GetLayerVersionPolicyRequest) super.clone();
    }

}
