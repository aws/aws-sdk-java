/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies optional parameters to add to a policy. The set of valid parameters depends on the combination of policy
 * type and resource type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/Parameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Parameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from snapshots
     * created using <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSnapshots.html">CreateSnapshots</a>. The
     * default is false.
     * </p>
     */
    private Boolean excludeBootVolume;

    /**
     * <p>
     * [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from snapshots
     * created using <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSnapshots.html">CreateSnapshots</a>. The
     * default is false.
     * </p>
     * 
     * @param excludeBootVolume
     *        [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from
     *        snapshots created using <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSnapshots.html"
     *        >CreateSnapshots</a>. The default is false.
     */

    public void setExcludeBootVolume(Boolean excludeBootVolume) {
        this.excludeBootVolume = excludeBootVolume;
    }

    /**
     * <p>
     * [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from snapshots
     * created using <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSnapshots.html">CreateSnapshots</a>. The
     * default is false.
     * </p>
     * 
     * @return [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from
     *         snapshots created using <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSnapshots.html"
     *         >CreateSnapshots</a>. The default is false.
     */

    public Boolean getExcludeBootVolume() {
        return this.excludeBootVolume;
    }

    /**
     * <p>
     * [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from snapshots
     * created using <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSnapshots.html">CreateSnapshots</a>. The
     * default is false.
     * </p>
     * 
     * @param excludeBootVolume
     *        [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from
     *        snapshots created using <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSnapshots.html"
     *        >CreateSnapshots</a>. The default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Parameters withExcludeBootVolume(Boolean excludeBootVolume) {
        setExcludeBootVolume(excludeBootVolume);
        return this;
    }

    /**
     * <p>
     * [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from snapshots
     * created using <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSnapshots.html">CreateSnapshots</a>. The
     * default is false.
     * </p>
     * 
     * @return [EBS Snapshot Management – Instance policies only] Indicates whether to exclude the root volume from
     *         snapshots created using <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateSnapshots.html"
     *         >CreateSnapshots</a>. The default is false.
     */

    public Boolean isExcludeBootVolume() {
        return this.excludeBootVolume;
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
        if (getExcludeBootVolume() != null)
            sb.append("ExcludeBootVolume: ").append(getExcludeBootVolume());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Parameters == false)
            return false;
        Parameters other = (Parameters) obj;
        if (other.getExcludeBootVolume() == null ^ this.getExcludeBootVolume() == null)
            return false;
        if (other.getExcludeBootVolume() != null && other.getExcludeBootVolume().equals(this.getExcludeBootVolume()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcludeBootVolume() == null) ? 0 : getExcludeBootVolume().hashCode());
        return hashCode;
    }

    @Override
    public Parameters clone() {
        try {
            return (Parameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.ParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
