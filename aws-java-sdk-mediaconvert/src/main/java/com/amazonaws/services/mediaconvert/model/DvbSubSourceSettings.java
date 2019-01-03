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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * DVB Sub Source Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DvbSubSourceSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DvbSubSourceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough.
     * All DVB-Sub content is passed through, regardless of selectors.
     */
    private Integer pid;

    /**
     * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough.
     * All DVB-Sub content is passed through, regardless of selectors.
     * 
     * @param pid
     *        When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub
     *        passthrough. All DVB-Sub content is passed through, regardless of selectors.
     */

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough.
     * All DVB-Sub content is passed through, regardless of selectors.
     * 
     * @return When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub
     *         passthrough. All DVB-Sub content is passed through, regardless of selectors.
     */

    public Integer getPid() {
        return this.pid;
    }

    /**
     * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough.
     * All DVB-Sub content is passed through, regardless of selectors.
     * 
     * @param pid
     *        When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub
     *        passthrough. All DVB-Sub content is passed through, regardless of selectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbSubSourceSettings withPid(Integer pid) {
        setPid(pid);
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
        if (getPid() != null)
            sb.append("Pid: ").append(getPid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DvbSubSourceSettings == false)
            return false;
        DvbSubSourceSettings other = (DvbSubSourceSettings) obj;
        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        return hashCode;
    }

    @Override
    public DvbSubSourceSettings clone() {
        try {
            return (DvbSubSourceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.DvbSubSourceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
