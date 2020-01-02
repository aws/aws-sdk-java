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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the AWS Cloud Map service discovery information for your virtual node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/AwsCloudMapServiceDiscovery"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudMapServiceDiscovery implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute
     * that you specified when you registered the instance. Only instances that match all of the specified key/value
     * pairs will be returned.
     * </p>
     */
    private java.util.List<AwsCloudMapInstanceAttribute> attributes;
    /**
     * <p>
     * The name of the AWS Cloud Map namespace to use.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The name of the AWS Cloud Map service to use.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute
     * that you specified when you registered the instance. Only instances that match all of the specified key/value
     * pairs will be returned.
     * </p>
     * 
     * @return A string map that contains attributes with values that you can use to filter instances by any custom
     *         attribute that you specified when you registered the instance. Only instances that match all of the
     *         specified key/value pairs will be returned.
     */

    public java.util.List<AwsCloudMapInstanceAttribute> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute
     * that you specified when you registered the instance. Only instances that match all of the specified key/value
     * pairs will be returned.
     * </p>
     * 
     * @param attributes
     *        A string map that contains attributes with values that you can use to filter instances by any custom
     *        attribute that you specified when you registered the instance. Only instances that match all of the
     *        specified key/value pairs will be returned.
     */

    public void setAttributes(java.util.Collection<AwsCloudMapInstanceAttribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<AwsCloudMapInstanceAttribute>(attributes);
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute
     * that you specified when you registered the instance. Only instances that match all of the specified key/value
     * pairs will be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        A string map that contains attributes with values that you can use to filter instances by any custom
     *        attribute that you specified when you registered the instance. Only instances that match all of the
     *        specified key/value pairs will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudMapServiceDiscovery withAttributes(AwsCloudMapInstanceAttribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<AwsCloudMapInstanceAttribute>(attributes.length));
        }
        for (AwsCloudMapInstanceAttribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A string map that contains attributes with values that you can use to filter instances by any custom attribute
     * that you specified when you registered the instance. Only instances that match all of the specified key/value
     * pairs will be returned.
     * </p>
     * 
     * @param attributes
     *        A string map that contains attributes with values that you can use to filter instances by any custom
     *        attribute that you specified when you registered the instance. Only instances that match all of the
     *        specified key/value pairs will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudMapServiceDiscovery withAttributes(java.util.Collection<AwsCloudMapInstanceAttribute> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map namespace to use.
     * </p>
     * 
     * @param namespaceName
     *        The name of the AWS Cloud Map namespace to use.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map namespace to use.
     * </p>
     * 
     * @return The name of the AWS Cloud Map namespace to use.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map namespace to use.
     * </p>
     * 
     * @param namespaceName
     *        The name of the AWS Cloud Map namespace to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudMapServiceDiscovery withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map service to use.
     * </p>
     * 
     * @param serviceName
     *        The name of the AWS Cloud Map service to use.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map service to use.
     * </p>
     * 
     * @return The name of the AWS Cloud Map service to use.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the AWS Cloud Map service to use.
     * </p>
     * 
     * @param serviceName
     *        The name of the AWS Cloud Map service to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudMapServiceDiscovery withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudMapServiceDiscovery == false)
            return false;
        AwsCloudMapServiceDiscovery other = (AwsCloudMapServiceDiscovery) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudMapServiceDiscovery clone() {
        try {
            return (AwsCloudMapServiceDiscovery) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.AwsCloudMapServiceDiscoveryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
