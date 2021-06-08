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
package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the GetThingShadow operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetThingShadowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the thing.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The name of the shadow.
     * </p>
     */
    private String shadowName;

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @return The name of the thing.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * 
     * @param thingName
     *        The name of the thing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetThingShadowRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The name of the shadow.
     * </p>
     * 
     * @param shadowName
     *        The name of the shadow.
     */

    public void setShadowName(String shadowName) {
        this.shadowName = shadowName;
    }

    /**
     * <p>
     * The name of the shadow.
     * </p>
     * 
     * @return The name of the shadow.
     */

    public String getShadowName() {
        return this.shadowName;
    }

    /**
     * <p>
     * The name of the shadow.
     * </p>
     * 
     * @param shadowName
     *        The name of the shadow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetThingShadowRequest withShadowName(String shadowName) {
        setShadowName(shadowName);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getShadowName() != null)
            sb.append("ShadowName: ").append(getShadowName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetThingShadowRequest == false)
            return false;
        GetThingShadowRequest other = (GetThingShadowRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getShadowName() == null ^ this.getShadowName() == null)
            return false;
        if (other.getShadowName() != null && other.getShadowName().equals(this.getShadowName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getShadowName() == null) ? 0 : getShadowName().hashCode());
        return hashCode;
    }

    @Override
    public GetThingShadowRequest clone() {
        return (GetThingShadowRequest) super.clone();
    }

}
