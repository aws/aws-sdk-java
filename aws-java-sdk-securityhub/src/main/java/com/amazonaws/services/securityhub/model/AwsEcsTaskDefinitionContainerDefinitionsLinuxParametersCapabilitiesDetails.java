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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Linux capabilities for the container that are added to or dropped from the default configuration provided by
 * Docker.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Linux capabilities for the container that are added to the default configuration provided by Docker.
     * </p>
     */
    private java.util.List<String> add;
    /**
     * <p>
     * The Linux capabilities for the container that are dropped from the default configuration provided by Docker.
     * </p>
     */
    private java.util.List<String> drop;

    /**
     * <p>
     * The Linux capabilities for the container that are added to the default configuration provided by Docker.
     * </p>
     * 
     * @return The Linux capabilities for the container that are added to the default configuration provided by Docker.
     */

    public java.util.List<String> getAdd() {
        return add;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are added to the default configuration provided by Docker.
     * </p>
     * 
     * @param add
     *        The Linux capabilities for the container that are added to the default configuration provided by Docker.
     */

    public void setAdd(java.util.Collection<String> add) {
        if (add == null) {
            this.add = null;
            return;
        }

        this.add = new java.util.ArrayList<String>(add);
    }

    /**
     * <p>
     * The Linux capabilities for the container that are added to the default configuration provided by Docker.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdd(java.util.Collection)} or {@link #withAdd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param add
     *        The Linux capabilities for the container that are added to the default configuration provided by Docker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails withAdd(String... add) {
        if (this.add == null) {
            setAdd(new java.util.ArrayList<String>(add.length));
        }
        for (String ele : add) {
            this.add.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are added to the default configuration provided by Docker.
     * </p>
     * 
     * @param add
     *        The Linux capabilities for the container that are added to the default configuration provided by Docker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails withAdd(java.util.Collection<String> add) {
        setAdd(add);
        return this;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are dropped from the default configuration provided by Docker.
     * </p>
     * 
     * @return The Linux capabilities for the container that are dropped from the default configuration provided by
     *         Docker.
     */

    public java.util.List<String> getDrop() {
        return drop;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are dropped from the default configuration provided by Docker.
     * </p>
     * 
     * @param drop
     *        The Linux capabilities for the container that are dropped from the default configuration provided by
     *        Docker.
     */

    public void setDrop(java.util.Collection<String> drop) {
        if (drop == null) {
            this.drop = null;
            return;
        }

        this.drop = new java.util.ArrayList<String>(drop);
    }

    /**
     * <p>
     * The Linux capabilities for the container that are dropped from the default configuration provided by Docker.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDrop(java.util.Collection)} or {@link #withDrop(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param drop
     *        The Linux capabilities for the container that are dropped from the default configuration provided by
     *        Docker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails withDrop(String... drop) {
        if (this.drop == null) {
            setDrop(new java.util.ArrayList<String>(drop.length));
        }
        for (String ele : drop) {
            this.drop.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Linux capabilities for the container that are dropped from the default configuration provided by Docker.
     * </p>
     * 
     * @param drop
     *        The Linux capabilities for the container that are dropped from the default configuration provided by
     *        Docker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails withDrop(java.util.Collection<String> drop) {
        setDrop(drop);
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
        if (getAdd() != null)
            sb.append("Add: ").append(getAdd()).append(",");
        if (getDrop() != null)
            sb.append("Drop: ").append(getDrop());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails == false)
            return false;
        AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails other = (AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails) obj;
        if (other.getAdd() == null ^ this.getAdd() == null)
            return false;
        if (other.getAdd() != null && other.getAdd().equals(this.getAdd()) == false)
            return false;
        if (other.getDrop() == null ^ this.getDrop() == null)
            return false;
        if (other.getDrop() != null && other.getDrop().equals(this.getDrop()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdd() == null) ? 0 : getAdd().hashCode());
        hashCode = prime * hashCode + ((getDrop() == null) ? 0 : getDrop().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails clone() {
        try {
            return (AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetailsMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
