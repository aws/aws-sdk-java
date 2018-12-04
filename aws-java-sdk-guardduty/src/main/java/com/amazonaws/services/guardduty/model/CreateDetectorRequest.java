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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * CreateDetector request body.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** A boolean value that specifies whether the detector is to be enabled. */
    private Boolean enable;

    /**
     * A boolean value that specifies whether the detector is to be enabled.
     * 
     * @param enable
     *        A boolean value that specifies whether the detector is to be enabled.
     */

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * A boolean value that specifies whether the detector is to be enabled.
     * 
     * @return A boolean value that specifies whether the detector is to be enabled.
     */

    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * A boolean value that specifies whether the detector is to be enabled.
     * 
     * @param enable
     *        A boolean value that specifies whether the detector is to be enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDetectorRequest withEnable(Boolean enable) {
        setEnable(enable);
        return this;
    }

    /**
     * A boolean value that specifies whether the detector is to be enabled.
     * 
     * @return A boolean value that specifies whether the detector is to be enabled.
     */

    public Boolean isEnable() {
        return this.enable;
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
        if (getEnable() != null)
            sb.append("Enable: ").append(getEnable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDetectorRequest == false)
            return false;
        CreateDetectorRequest other = (CreateDetectorRequest) obj;
        if (other.getEnable() == null ^ this.getEnable() == null)
            return false;
        if (other.getEnable() != null && other.getEnable().equals(this.getEnable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnable() == null) ? 0 : getEnable().hashCode());
        return hashCode;
    }

    @Override
    public CreateDetectorRequest clone() {
        return (CreateDetectorRequest) super.clone();
    }

}
