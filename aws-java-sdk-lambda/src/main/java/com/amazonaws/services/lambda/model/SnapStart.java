/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The function's SnapStart setting. Set <code>ApplyOn</code> to <code>PublishedVersions</code> to create a snapshot of
 * the initialized execution environment when you publish a function version. For more information, see <a
 * href="https://docs.aws.amazon.com/lambda/latest/dg/snapstart.html">Reducing startup time with Lambda SnapStart</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/SnapStart" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapStart implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set to <code>PublishedVersions</code> to create a snapshot of the initialized execution environment when you
     * publish a function version.
     * </p>
     */
    private String applyOn;

    /**
     * <p>
     * Set to <code>PublishedVersions</code> to create a snapshot of the initialized execution environment when you
     * publish a function version.
     * </p>
     * 
     * @param applyOn
     *        Set to <code>PublishedVersions</code> to create a snapshot of the initialized execution environment when
     *        you publish a function version.
     * @see SnapStartApplyOn
     */

    public void setApplyOn(String applyOn) {
        this.applyOn = applyOn;
    }

    /**
     * <p>
     * Set to <code>PublishedVersions</code> to create a snapshot of the initialized execution environment when you
     * publish a function version.
     * </p>
     * 
     * @return Set to <code>PublishedVersions</code> to create a snapshot of the initialized execution environment when
     *         you publish a function version.
     * @see SnapStartApplyOn
     */

    public String getApplyOn() {
        return this.applyOn;
    }

    /**
     * <p>
     * Set to <code>PublishedVersions</code> to create a snapshot of the initialized execution environment when you
     * publish a function version.
     * </p>
     * 
     * @param applyOn
     *        Set to <code>PublishedVersions</code> to create a snapshot of the initialized execution environment when
     *        you publish a function version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapStartApplyOn
     */

    public SnapStart withApplyOn(String applyOn) {
        setApplyOn(applyOn);
        return this;
    }

    /**
     * <p>
     * Set to <code>PublishedVersions</code> to create a snapshot of the initialized execution environment when you
     * publish a function version.
     * </p>
     * 
     * @param applyOn
     *        Set to <code>PublishedVersions</code> to create a snapshot of the initialized execution environment when
     *        you publish a function version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapStartApplyOn
     */

    public SnapStart withApplyOn(SnapStartApplyOn applyOn) {
        this.applyOn = applyOn.toString();
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
        if (getApplyOn() != null)
            sb.append("ApplyOn: ").append(getApplyOn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnapStart == false)
            return false;
        SnapStart other = (SnapStart) obj;
        if (other.getApplyOn() == null ^ this.getApplyOn() == null)
            return false;
        if (other.getApplyOn() != null && other.getApplyOn().equals(this.getApplyOn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplyOn() == null) ? 0 : getApplyOn().hashCode());
        return hashCode;
    }

    @Override
    public SnapStart clone() {
        try {
            return (SnapStart) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.SnapStartMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
