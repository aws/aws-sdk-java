/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/UpdateAdmChannel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAdmChannelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private ADMChannelRequest aDMChannelRequest;

    private String applicationId;

    /**
     * @param aDMChannelRequest
     */

    public void setADMChannelRequest(ADMChannelRequest aDMChannelRequest) {
        this.aDMChannelRequest = aDMChannelRequest;
    }

    /**
     * @return
     */

    public ADMChannelRequest getADMChannelRequest() {
        return this.aDMChannelRequest;
    }

    /**
     * @param aDMChannelRequest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAdmChannelRequest withADMChannelRequest(ADMChannelRequest aDMChannelRequest) {
        setADMChannelRequest(aDMChannelRequest);
        return this;
    }

    /**
     * @param applicationId
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * @return
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @param applicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAdmChannelRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getADMChannelRequest() != null)
            sb.append("ADMChannelRequest: ").append(getADMChannelRequest()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAdmChannelRequest == false)
            return false;
        UpdateAdmChannelRequest other = (UpdateAdmChannelRequest) obj;
        if (other.getADMChannelRequest() == null ^ this.getADMChannelRequest() == null)
            return false;
        if (other.getADMChannelRequest() != null && other.getADMChannelRequest().equals(this.getADMChannelRequest()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getADMChannelRequest() == null) ? 0 : getADMChannelRequest().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAdmChannelRequest clone() {
        return (UpdateAdmChannelRequest) super.clone();
    }

}
