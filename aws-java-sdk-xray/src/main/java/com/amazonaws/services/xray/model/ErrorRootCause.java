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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The root cause of a trace summary error.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ErrorRootCause" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ErrorRootCause implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID,
     * type, and inferred flag.
     * </p>
     */
    private java.util.List<ErrorRootCauseService> services;

    /**
     * <p>
     * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID,
     * type, and inferred flag.
     * </p>
     * 
     * @return A list of services corresponding to an error. A service identifies a segment and it contains a name,
     *         account ID, type, and inferred flag.
     */

    public java.util.List<ErrorRootCauseService> getServices() {
        return services;
    }

    /**
     * <p>
     * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID,
     * type, and inferred flag.
     * </p>
     * 
     * @param services
     *        A list of services corresponding to an error. A service identifies a segment and it contains a name,
     *        account ID, type, and inferred flag.
     */

    public void setServices(java.util.Collection<ErrorRootCauseService> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<ErrorRootCauseService>(services);
    }

    /**
     * <p>
     * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID,
     * type, and inferred flag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        A list of services corresponding to an error. A service identifies a segment and it contains a name,
     *        account ID, type, and inferred flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCause withServices(ErrorRootCauseService... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<ErrorRootCauseService>(services.length));
        }
        for (ErrorRootCauseService ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of services corresponding to an error. A service identifies a segment and it contains a name, account ID,
     * type, and inferred flag.
     * </p>
     * 
     * @param services
     *        A list of services corresponding to an error. A service identifies a segment and it contains a name,
     *        account ID, type, and inferred flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ErrorRootCause withServices(java.util.Collection<ErrorRootCauseService> services) {
        setServices(services);
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
        if (getServices() != null)
            sb.append("Services: ").append(getServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ErrorRootCause == false)
            return false;
        ErrorRootCause other = (ErrorRootCause) obj;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        return hashCode;
    }

    @Override
    public ErrorRootCause clone() {
        try {
            return (ErrorRootCause) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.ErrorRootCauseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
