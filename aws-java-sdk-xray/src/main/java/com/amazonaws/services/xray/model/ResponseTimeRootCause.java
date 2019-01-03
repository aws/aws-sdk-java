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
 * The root cause information for a response time warning.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/ResponseTimeRootCause" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseTimeRootCause implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of corresponding services. A service identifies a segment and contains a name, account ID, type, and
     * inferred flag.
     * </p>
     */
    private java.util.List<ResponseTimeRootCauseService> services;

    /**
     * <p>
     * A list of corresponding services. A service identifies a segment and contains a name, account ID, type, and
     * inferred flag.
     * </p>
     * 
     * @return A list of corresponding services. A service identifies a segment and contains a name, account ID, type,
     *         and inferred flag.
     */

    public java.util.List<ResponseTimeRootCauseService> getServices() {
        return services;
    }

    /**
     * <p>
     * A list of corresponding services. A service identifies a segment and contains a name, account ID, type, and
     * inferred flag.
     * </p>
     * 
     * @param services
     *        A list of corresponding services. A service identifies a segment and contains a name, account ID, type,
     *        and inferred flag.
     */

    public void setServices(java.util.Collection<ResponseTimeRootCauseService> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<ResponseTimeRootCauseService>(services);
    }

    /**
     * <p>
     * A list of corresponding services. A service identifies a segment and contains a name, account ID, type, and
     * inferred flag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        A list of corresponding services. A service identifies a segment and contains a name, account ID, type,
     *        and inferred flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseTimeRootCause withServices(ResponseTimeRootCauseService... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<ResponseTimeRootCauseService>(services.length));
        }
        for (ResponseTimeRootCauseService ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of corresponding services. A service identifies a segment and contains a name, account ID, type, and
     * inferred flag.
     * </p>
     * 
     * @param services
     *        A list of corresponding services. A service identifies a segment and contains a name, account ID, type,
     *        and inferred flag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseTimeRootCause withServices(java.util.Collection<ResponseTimeRootCauseService> services) {
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

        if (obj instanceof ResponseTimeRootCause == false)
            return false;
        ResponseTimeRootCause other = (ResponseTimeRootCause) obj;
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
    public ResponseTimeRootCause clone() {
        try {
            return (ResponseTimeRootCause) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.ResponseTimeRootCauseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
