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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * connectivity info request
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateConnectivityInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectivityInfoRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Connectivity info list */
    private java.util.List<ConnectivityInfo> connectivityInfo;
    /** Thing Name */
    private String thingName;

    /**
     * Connectivity info list
     * 
     * @return Connectivity info list
     */

    public java.util.List<ConnectivityInfo> getConnectivityInfo() {
        return connectivityInfo;
    }

    /**
     * Connectivity info list
     * 
     * @param connectivityInfo
     *        Connectivity info list
     */

    public void setConnectivityInfo(java.util.Collection<ConnectivityInfo> connectivityInfo) {
        if (connectivityInfo == null) {
            this.connectivityInfo = null;
            return;
        }

        this.connectivityInfo = new java.util.ArrayList<ConnectivityInfo>(connectivityInfo);
    }

    /**
     * Connectivity info list
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectivityInfo(java.util.Collection)} or {@link #withConnectivityInfo(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param connectivityInfo
     *        Connectivity info list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectivityInfoRequest withConnectivityInfo(ConnectivityInfo... connectivityInfo) {
        if (this.connectivityInfo == null) {
            setConnectivityInfo(new java.util.ArrayList<ConnectivityInfo>(connectivityInfo.length));
        }
        for (ConnectivityInfo ele : connectivityInfo) {
            this.connectivityInfo.add(ele);
        }
        return this;
    }

    /**
     * Connectivity info list
     * 
     * @param connectivityInfo
     *        Connectivity info list
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectivityInfoRequest withConnectivityInfo(java.util.Collection<ConnectivityInfo> connectivityInfo) {
        setConnectivityInfo(connectivityInfo);
        return this;
    }

    /**
     * Thing Name
     * 
     * @param thingName
     *        Thing Name
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * Thing Name
     * 
     * @return Thing Name
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * Thing Name
     * 
     * @param thingName
     *        Thing Name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectivityInfoRequest withThingName(String thingName) {
        setThingName(thingName);
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
        if (getConnectivityInfo() != null)
            sb.append("ConnectivityInfo: ").append(getConnectivityInfo()).append(",");
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectivityInfoRequest == false)
            return false;
        UpdateConnectivityInfoRequest other = (UpdateConnectivityInfoRequest) obj;
        if (other.getConnectivityInfo() == null ^ this.getConnectivityInfo() == null)
            return false;
        if (other.getConnectivityInfo() != null && other.getConnectivityInfo().equals(this.getConnectivityInfo()) == false)
            return false;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectivityInfo() == null) ? 0 : getConnectivityInfo().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectivityInfoRequest clone() {
        return (UpdateConnectivityInfoRequest) super.clone();
    }

}
