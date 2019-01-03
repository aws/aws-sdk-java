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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the total (metered or unmetered) minutes used by the resource to run tests. Contains the sum of minutes
 * consumed by all children.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/DeviceMinutes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceMinutes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When specified, represents the total minutes used by the resource to run tests.
     * </p>
     */
    private Double total;
    /**
     * <p>
     * When specified, represents only the sum of metered minutes used by the resource to run tests.
     * </p>
     */
    private Double metered;
    /**
     * <p>
     * When specified, represents only the sum of unmetered minutes used by the resource to run tests.
     * </p>
     */
    private Double unmetered;

    /**
     * <p>
     * When specified, represents the total minutes used by the resource to run tests.
     * </p>
     * 
     * @param total
     *        When specified, represents the total minutes used by the resource to run tests.
     */

    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * <p>
     * When specified, represents the total minutes used by the resource to run tests.
     * </p>
     * 
     * @return When specified, represents the total minutes used by the resource to run tests.
     */

    public Double getTotal() {
        return this.total;
    }

    /**
     * <p>
     * When specified, represents the total minutes used by the resource to run tests.
     * </p>
     * 
     * @param total
     *        When specified, represents the total minutes used by the resource to run tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceMinutes withTotal(Double total) {
        setTotal(total);
        return this;
    }

    /**
     * <p>
     * When specified, represents only the sum of metered minutes used by the resource to run tests.
     * </p>
     * 
     * @param metered
     *        When specified, represents only the sum of metered minutes used by the resource to run tests.
     */

    public void setMetered(Double metered) {
        this.metered = metered;
    }

    /**
     * <p>
     * When specified, represents only the sum of metered minutes used by the resource to run tests.
     * </p>
     * 
     * @return When specified, represents only the sum of metered minutes used by the resource to run tests.
     */

    public Double getMetered() {
        return this.metered;
    }

    /**
     * <p>
     * When specified, represents only the sum of metered minutes used by the resource to run tests.
     * </p>
     * 
     * @param metered
     *        When specified, represents only the sum of metered minutes used by the resource to run tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceMinutes withMetered(Double metered) {
        setMetered(metered);
        return this;
    }

    /**
     * <p>
     * When specified, represents only the sum of unmetered minutes used by the resource to run tests.
     * </p>
     * 
     * @param unmetered
     *        When specified, represents only the sum of unmetered minutes used by the resource to run tests.
     */

    public void setUnmetered(Double unmetered) {
        this.unmetered = unmetered;
    }

    /**
     * <p>
     * When specified, represents only the sum of unmetered minutes used by the resource to run tests.
     * </p>
     * 
     * @return When specified, represents only the sum of unmetered minutes used by the resource to run tests.
     */

    public Double getUnmetered() {
        return this.unmetered;
    }

    /**
     * <p>
     * When specified, represents only the sum of unmetered minutes used by the resource to run tests.
     * </p>
     * 
     * @param unmetered
     *        When specified, represents only the sum of unmetered minutes used by the resource to run tests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceMinutes withUnmetered(Double unmetered) {
        setUnmetered(unmetered);
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
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getMetered() != null)
            sb.append("Metered: ").append(getMetered()).append(",");
        if (getUnmetered() != null)
            sb.append("Unmetered: ").append(getUnmetered());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceMinutes == false)
            return false;
        DeviceMinutes other = (DeviceMinutes) obj;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getMetered() == null ^ this.getMetered() == null)
            return false;
        if (other.getMetered() != null && other.getMetered().equals(this.getMetered()) == false)
            return false;
        if (other.getUnmetered() == null ^ this.getUnmetered() == null)
            return false;
        if (other.getUnmetered() != null && other.getUnmetered().equals(this.getUnmetered()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getMetered() == null) ? 0 : getMetered().hashCode());
        hashCode = prime * hashCode + ((getUnmetered() == null) ? 0 : getUnmetered().hashCode());
        return hashCode;
    }

    @Override
    public DeviceMinutes clone() {
        try {
            return (DeviceMinutes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.DeviceMinutesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
