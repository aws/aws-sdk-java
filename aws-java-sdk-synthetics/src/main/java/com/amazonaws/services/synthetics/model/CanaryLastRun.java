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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure contains information about the most recent run of a single canary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/CanaryLastRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CanaryLastRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the canary.
     * </p>
     */
    private String canaryName;
    /**
     * <p>
     * The results from this canary's most recent run.
     * </p>
     */
    private CanaryRun lastRun;

    /**
     * <p>
     * The name of the canary.
     * </p>
     * 
     * @param canaryName
     *        The name of the canary.
     */

    public void setCanaryName(String canaryName) {
        this.canaryName = canaryName;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * 
     * @return The name of the canary.
     */

    public String getCanaryName() {
        return this.canaryName;
    }

    /**
     * <p>
     * The name of the canary.
     * </p>
     * 
     * @param canaryName
     *        The name of the canary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryLastRun withCanaryName(String canaryName) {
        setCanaryName(canaryName);
        return this;
    }

    /**
     * <p>
     * The results from this canary's most recent run.
     * </p>
     * 
     * @param lastRun
     *        The results from this canary's most recent run.
     */

    public void setLastRun(CanaryRun lastRun) {
        this.lastRun = lastRun;
    }

    /**
     * <p>
     * The results from this canary's most recent run.
     * </p>
     * 
     * @return The results from this canary's most recent run.
     */

    public CanaryRun getLastRun() {
        return this.lastRun;
    }

    /**
     * <p>
     * The results from this canary's most recent run.
     * </p>
     * 
     * @param lastRun
     *        The results from this canary's most recent run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CanaryLastRun withLastRun(CanaryRun lastRun) {
        setLastRun(lastRun);
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
        if (getCanaryName() != null)
            sb.append("CanaryName: ").append(getCanaryName()).append(",");
        if (getLastRun() != null)
            sb.append("LastRun: ").append(getLastRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryLastRun == false)
            return false;
        CanaryLastRun other = (CanaryLastRun) obj;
        if (other.getCanaryName() == null ^ this.getCanaryName() == null)
            return false;
        if (other.getCanaryName() != null && other.getCanaryName().equals(this.getCanaryName()) == false)
            return false;
        if (other.getLastRun() == null ^ this.getLastRun() == null)
            return false;
        if (other.getLastRun() != null && other.getLastRun().equals(this.getLastRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCanaryName() == null) ? 0 : getCanaryName().hashCode());
        hashCode = prime * hashCode + ((getLastRun() == null) ? 0 : getLastRun().hashCode());
        return hashCode;
    }

    @Override
    public CanaryLastRun clone() {
        try {
            return (CanaryLastRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.CanaryLastRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
