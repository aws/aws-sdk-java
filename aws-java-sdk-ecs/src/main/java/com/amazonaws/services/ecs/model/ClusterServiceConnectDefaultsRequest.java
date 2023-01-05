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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use this parameter to set a default Service Connect namespace. After you set a default Service Connect namespace, any
 * new services with Service Connect turned on that are created in the cluster are added as client services in the
 * namespace. This setting only applies to new services that set the <code>enabled</code> parameter to <code>true</code>
 * in the <code>ServiceConnectConfiguration</code>. You can set the namespace of each service individually in the
 * <code>ServiceConnectConfiguration</code> to override this default parameter.
 * </p>
 * <p>
 * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
 * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that collects
 * logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported with Service
 * Connect. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in the
 * <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ClusterServiceConnectDefaultsRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterServiceConnectDefaultsRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace that's used when you create a
     * service and don't specify a Service Connect configuration. The namespace name can include up to 1024 characters.
     * The name is case-sensitive. The name can't include hyphens (-), tilde (~), greater than (&gt;), less than (&lt;),
     * or slash (/).
     * </p>
     * <p>
     * If you enter an existing namespace name or ARN, then that namespace will be used. Any namespace type is
     * supported. The namespace must be in this account and this Amazon Web Services Region.
     * </p>
     * <p>
     * If you enter a new name, a Cloud Map namespace will be created. Amazon ECS creates a Cloud Map namespace with the
     * "API calls" method of instance discovery only. This instance discovery method is the "HTTP" namespace type in the
     * Command Line Interface. Other types of instance discovery aren't used by Service Connect.
     * </p>
     * <p>
     * If you update the service with an empty string <code>""</code> for the namespace name, the cluster configuration
     * for Service Connect is removed. Note that the namespace will remain in Cloud Map and must be deleted separately.
     * </p>
     * <p>
     * For more information about Cloud Map, see <a href="https://docs.aws.amazon.com/">Working with Services</a> in the
     * <i>Cloud Map Developer Guide</i>.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace that's used when you create a
     * service and don't specify a Service Connect configuration. The namespace name can include up to 1024 characters.
     * The name is case-sensitive. The name can't include hyphens (-), tilde (~), greater than (&gt;), less than (&lt;),
     * or slash (/).
     * </p>
     * <p>
     * If you enter an existing namespace name or ARN, then that namespace will be used. Any namespace type is
     * supported. The namespace must be in this account and this Amazon Web Services Region.
     * </p>
     * <p>
     * If you enter a new name, a Cloud Map namespace will be created. Amazon ECS creates a Cloud Map namespace with the
     * "API calls" method of instance discovery only. This instance discovery method is the "HTTP" namespace type in the
     * Command Line Interface. Other types of instance discovery aren't used by Service Connect.
     * </p>
     * <p>
     * If you update the service with an empty string <code>""</code> for the namespace name, the cluster configuration
     * for Service Connect is removed. Note that the namespace will remain in Cloud Map and must be deleted separately.
     * </p>
     * <p>
     * For more information about Cloud Map, see <a href="https://docs.aws.amazon.com/">Working with Services</a> in the
     * <i>Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param namespace
     *        The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace that's used when you
     *        create a service and don't specify a Service Connect configuration. The namespace name can include up to
     *        1024 characters. The name is case-sensitive. The name can't include hyphens (-), tilde (~), greater than
     *        (&gt;), less than (&lt;), or slash (/).</p>
     *        <p>
     *        If you enter an existing namespace name or ARN, then that namespace will be used. Any namespace type is
     *        supported. The namespace must be in this account and this Amazon Web Services Region.
     *        </p>
     *        <p>
     *        If you enter a new name, a Cloud Map namespace will be created. Amazon ECS creates a Cloud Map namespace
     *        with the "API calls" method of instance discovery only. This instance discovery method is the "HTTP"
     *        namespace type in the Command Line Interface. Other types of instance discovery aren't used by Service
     *        Connect.
     *        </p>
     *        <p>
     *        If you update the service with an empty string <code>""</code> for the namespace name, the cluster
     *        configuration for Service Connect is removed. Note that the namespace will remain in Cloud Map and must be
     *        deleted separately.
     *        </p>
     *        <p>
     *        For more information about Cloud Map, see <a href="https://docs.aws.amazon.com/">Working with Services</a>
     *        in the <i>Cloud Map Developer Guide</i>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace that's used when you create a
     * service and don't specify a Service Connect configuration. The namespace name can include up to 1024 characters.
     * The name is case-sensitive. The name can't include hyphens (-), tilde (~), greater than (&gt;), less than (&lt;),
     * or slash (/).
     * </p>
     * <p>
     * If you enter an existing namespace name or ARN, then that namespace will be used. Any namespace type is
     * supported. The namespace must be in this account and this Amazon Web Services Region.
     * </p>
     * <p>
     * If you enter a new name, a Cloud Map namespace will be created. Amazon ECS creates a Cloud Map namespace with the
     * "API calls" method of instance discovery only. This instance discovery method is the "HTTP" namespace type in the
     * Command Line Interface. Other types of instance discovery aren't used by Service Connect.
     * </p>
     * <p>
     * If you update the service with an empty string <code>""</code> for the namespace name, the cluster configuration
     * for Service Connect is removed. Note that the namespace will remain in Cloud Map and must be deleted separately.
     * </p>
     * <p>
     * For more information about Cloud Map, see <a href="https://docs.aws.amazon.com/">Working with Services</a> in the
     * <i>Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @return The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace that's used when you
     *         create a service and don't specify a Service Connect configuration. The namespace name can include up to
     *         1024 characters. The name is case-sensitive. The name can't include hyphens (-), tilde (~), greater than
     *         (&gt;), less than (&lt;), or slash (/).</p>
     *         <p>
     *         If you enter an existing namespace name or ARN, then that namespace will be used. Any namespace type is
     *         supported. The namespace must be in this account and this Amazon Web Services Region.
     *         </p>
     *         <p>
     *         If you enter a new name, a Cloud Map namespace will be created. Amazon ECS creates a Cloud Map namespace
     *         with the "API calls" method of instance discovery only. This instance discovery method is the "HTTP"
     *         namespace type in the Command Line Interface. Other types of instance discovery aren't used by Service
     *         Connect.
     *         </p>
     *         <p>
     *         If you update the service with an empty string <code>""</code> for the namespace name, the cluster
     *         configuration for Service Connect is removed. Note that the namespace will remain in Cloud Map and must
     *         be deleted separately.
     *         </p>
     *         <p>
     *         For more information about Cloud Map, see <a href="https://docs.aws.amazon.com/">Working with
     *         Services</a> in the <i>Cloud Map Developer Guide</i>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace that's used when you create a
     * service and don't specify a Service Connect configuration. The namespace name can include up to 1024 characters.
     * The name is case-sensitive. The name can't include hyphens (-), tilde (~), greater than (&gt;), less than (&lt;),
     * or slash (/).
     * </p>
     * <p>
     * If you enter an existing namespace name or ARN, then that namespace will be used. Any namespace type is
     * supported. The namespace must be in this account and this Amazon Web Services Region.
     * </p>
     * <p>
     * If you enter a new name, a Cloud Map namespace will be created. Amazon ECS creates a Cloud Map namespace with the
     * "API calls" method of instance discovery only. This instance discovery method is the "HTTP" namespace type in the
     * Command Line Interface. Other types of instance discovery aren't used by Service Connect.
     * </p>
     * <p>
     * If you update the service with an empty string <code>""</code> for the namespace name, the cluster configuration
     * for Service Connect is removed. Note that the namespace will remain in Cloud Map and must be deleted separately.
     * </p>
     * <p>
     * For more information about Cloud Map, see <a href="https://docs.aws.amazon.com/">Working with Services</a> in the
     * <i>Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param namespace
     *        The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace that's used when you
     *        create a service and don't specify a Service Connect configuration. The namespace name can include up to
     *        1024 characters. The name is case-sensitive. The name can't include hyphens (-), tilde (~), greater than
     *        (&gt;), less than (&lt;), or slash (/).</p>
     *        <p>
     *        If you enter an existing namespace name or ARN, then that namespace will be used. Any namespace type is
     *        supported. The namespace must be in this account and this Amazon Web Services Region.
     *        </p>
     *        <p>
     *        If you enter a new name, a Cloud Map namespace will be created. Amazon ECS creates a Cloud Map namespace
     *        with the "API calls" method of instance discovery only. This instance discovery method is the "HTTP"
     *        namespace type in the Command Line Interface. Other types of instance discovery aren't used by Service
     *        Connect.
     *        </p>
     *        <p>
     *        If you update the service with an empty string <code>""</code> for the namespace name, the cluster
     *        configuration for Service Connect is removed. Note that the namespace will remain in Cloud Map and must be
     *        deleted separately.
     *        </p>
     *        <p>
     *        For more information about Cloud Map, see <a href="https://docs.aws.amazon.com/">Working with Services</a>
     *        in the <i>Cloud Map Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterServiceConnectDefaultsRequest withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterServiceConnectDefaultsRequest == false)
            return false;
        ClusterServiceConnectDefaultsRequest other = (ClusterServiceConnectDefaultsRequest) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public ClusterServiceConnectDefaultsRequest clone() {
        try {
            return (ClusterServiceConnectDefaultsRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ClusterServiceConnectDefaultsRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
