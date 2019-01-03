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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetDeviceDefinitionVersion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeviceDefinitionVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the device definition. */
    private String deviceDefinitionId;
    /** The ID of the device definition version. */
    private String deviceDefinitionVersionId;
    /** The token for the next set of results, or ''null'' if there are no additional results. */
    private String nextToken;

    /**
     * The ID of the device definition.
     * 
     * @param deviceDefinitionId
     *        The ID of the device definition.
     */

    public void setDeviceDefinitionId(String deviceDefinitionId) {
        this.deviceDefinitionId = deviceDefinitionId;
    }

    /**
     * The ID of the device definition.
     * 
     * @return The ID of the device definition.
     */

    public String getDeviceDefinitionId() {
        return this.deviceDefinitionId;
    }

    /**
     * The ID of the device definition.
     * 
     * @param deviceDefinitionId
     *        The ID of the device definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceDefinitionVersionRequest withDeviceDefinitionId(String deviceDefinitionId) {
        setDeviceDefinitionId(deviceDefinitionId);
        return this;
    }

    /**
     * The ID of the device definition version.
     * 
     * @param deviceDefinitionVersionId
     *        The ID of the device definition version.
     */

    public void setDeviceDefinitionVersionId(String deviceDefinitionVersionId) {
        this.deviceDefinitionVersionId = deviceDefinitionVersionId;
    }

    /**
     * The ID of the device definition version.
     * 
     * @return The ID of the device definition version.
     */

    public String getDeviceDefinitionVersionId() {
        return this.deviceDefinitionVersionId;
    }

    /**
     * The ID of the device definition version.
     * 
     * @param deviceDefinitionVersionId
     *        The ID of the device definition version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceDefinitionVersionRequest withDeviceDefinitionVersionId(String deviceDefinitionVersionId) {
        setDeviceDefinitionVersionId(deviceDefinitionVersionId);
        return this;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @return The token for the next set of results, or ''null'' if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token for the next set of results, or ''null'' if there are no additional results.
     * 
     * @param nextToken
     *        The token for the next set of results, or ''null'' if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeviceDefinitionVersionRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDeviceDefinitionId() != null)
            sb.append("DeviceDefinitionId: ").append(getDeviceDefinitionId()).append(",");
        if (getDeviceDefinitionVersionId() != null)
            sb.append("DeviceDefinitionVersionId: ").append(getDeviceDefinitionVersionId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeviceDefinitionVersionRequest == false)
            return false;
        GetDeviceDefinitionVersionRequest other = (GetDeviceDefinitionVersionRequest) obj;
        if (other.getDeviceDefinitionId() == null ^ this.getDeviceDefinitionId() == null)
            return false;
        if (other.getDeviceDefinitionId() != null && other.getDeviceDefinitionId().equals(this.getDeviceDefinitionId()) == false)
            return false;
        if (other.getDeviceDefinitionVersionId() == null ^ this.getDeviceDefinitionVersionId() == null)
            return false;
        if (other.getDeviceDefinitionVersionId() != null && other.getDeviceDefinitionVersionId().equals(this.getDeviceDefinitionVersionId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceDefinitionId() == null) ? 0 : getDeviceDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getDeviceDefinitionVersionId() == null) ? 0 : getDeviceDefinitionVersionId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetDeviceDefinitionVersionRequest clone() {
        return (GetDeviceDefinitionVersionRequest) super.clone();
    }

}
