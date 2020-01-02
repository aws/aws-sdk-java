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
package com.amazonaws.services.iotsecuretunneling.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The destination configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsecuretunneling-2018-10-05/DestinationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DestinationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the IoT thing to which you want to connect.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * A list of service names that identity the target application. Currently, you can only specify a single name. The
     * AWS IoT client running on the destination device reads this value and uses it to look up a port or an IP address
     * and a port. The AWS IoT client instantiates the local proxy which uses this information to connect to the
     * destination application.
     * </p>
     */
    private java.util.List<String> services;

    /**
     * <p>
     * The name of the IoT thing to which you want to connect.
     * </p>
     * 
     * @param thingName
     *        The name of the IoT thing to which you want to connect.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the IoT thing to which you want to connect.
     * </p>
     * 
     * @return The name of the IoT thing to which you want to connect.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the IoT thing to which you want to connect.
     * </p>
     * 
     * @param thingName
     *        The name of the IoT thing to which you want to connect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfig withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * A list of service names that identity the target application. Currently, you can only specify a single name. The
     * AWS IoT client running on the destination device reads this value and uses it to look up a port or an IP address
     * and a port. The AWS IoT client instantiates the local proxy which uses this information to connect to the
     * destination application.
     * </p>
     * 
     * @return A list of service names that identity the target application. Currently, you can only specify a single
     *         name. The AWS IoT client running on the destination device reads this value and uses it to look up a port
     *         or an IP address and a port. The AWS IoT client instantiates the local proxy which uses this information
     *         to connect to the destination application.
     */

    public java.util.List<String> getServices() {
        return services;
    }

    /**
     * <p>
     * A list of service names that identity the target application. Currently, you can only specify a single name. The
     * AWS IoT client running on the destination device reads this value and uses it to look up a port or an IP address
     * and a port. The AWS IoT client instantiates the local proxy which uses this information to connect to the
     * destination application.
     * </p>
     * 
     * @param services
     *        A list of service names that identity the target application. Currently, you can only specify a single
     *        name. The AWS IoT client running on the destination device reads this value and uses it to look up a port
     *        or an IP address and a port. The AWS IoT client instantiates the local proxy which uses this information
     *        to connect to the destination application.
     */

    public void setServices(java.util.Collection<String> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new java.util.ArrayList<String>(services);
    }

    /**
     * <p>
     * A list of service names that identity the target application. Currently, you can only specify a single name. The
     * AWS IoT client running on the destination device reads this value and uses it to look up a port or an IP address
     * and a port. The AWS IoT client instantiates the local proxy which uses this information to connect to the
     * destination application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        A list of service names that identity the target application. Currently, you can only specify a single
     *        name. The AWS IoT client running on the destination device reads this value and uses it to look up a port
     *        or an IP address and a port. The AWS IoT client instantiates the local proxy which uses this information
     *        to connect to the destination application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfig withServices(String... services) {
        if (this.services == null) {
            setServices(new java.util.ArrayList<String>(services.length));
        }
        for (String ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of service names that identity the target application. Currently, you can only specify a single name. The
     * AWS IoT client running on the destination device reads this value and uses it to look up a port or an IP address
     * and a port. The AWS IoT client instantiates the local proxy which uses this information to connect to the
     * destination application.
     * </p>
     * 
     * @param services
     *        A list of service names that identity the target application. Currently, you can only specify a single
     *        name. The AWS IoT client running on the destination device reads this value and uses it to look up a port
     *        or an IP address and a port. The AWS IoT client instantiates the local proxy which uses this information
     *        to connect to the destination application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DestinationConfig withServices(java.util.Collection<String> services) {
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
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

        if (obj instanceof DestinationConfig == false)
            return false;
        DestinationConfig other = (DestinationConfig) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        return hashCode;
    }

    @Override
    public DestinationConfig clone() {
        try {
            return (DestinationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsecuretunneling.model.transform.DestinationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
