/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DiscoverInstancesRevision"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscoverInstancesRevisionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of the
     * <code>Properties</code> member of the namespace.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of the
     * <code>Properties</code> member of the namespace.
     * </p>
     * 
     * @param namespaceName
     *        The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of
     *        the <code>Properties</code> member of the namespace.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of the
     * <code>Properties</code> member of the namespace.
     * </p>
     * 
     * @return The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of
     *         the <code>Properties</code> member of the namespace.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of the
     * <code>Properties</code> member of the namespace.
     * </p>
     * 
     * @param namespaceName
     *        The <code>HttpName</code> name of the namespace. It's found in the <code>HttpProperties</code> member of
     *        the <code>Properties</code> member of the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRevisionRequest withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that you specified when you registered the instance.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     * 
     * @return The name of the service that you specified when you registered the instance.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that you specified when you registered the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverInstancesRevisionRequest withServiceName(String serviceName) {
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

        if (obj instanceof DiscoverInstancesRevisionRequest == false)
            return false;
        DiscoverInstancesRevisionRequest other = (DiscoverInstancesRevisionRequest) obj;
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

        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public DiscoverInstancesRevisionRequest clone() {
        return (DiscoverInstancesRevisionRequest) super.clone();
    }

}
