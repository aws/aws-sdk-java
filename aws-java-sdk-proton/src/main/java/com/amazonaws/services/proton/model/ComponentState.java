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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The detailed data about the current state of the component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ComponentState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the service instance that this component is attached to. Provided when a component is attached to a
     * service instance.
     * </p>
     */
    private String serviceInstanceName;
    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a component is
     * attached to a service instance.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The service spec that the component uses to access service inputs. Provided when a component is attached to a
     * service instance.
     * </p>
     */
    private String serviceSpec;
    /**
     * <p>
     * The template file used.
     * </p>
     */
    private String templateFile;

    /**
     * <p>
     * The name of the service instance that this component is attached to. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance that this component is attached to. Provided when a component is attached
     *        to a service instance.
     */

    public void setServiceInstanceName(String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance that this component is attached to. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @return The name of the service instance that this component is attached to. Provided when a component is
     *         attached to a service instance.
     */

    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance that this component is attached to. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance that this component is attached to. Provided when a component is attached
     *        to a service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentState withServiceInstanceName(String serviceInstanceName) {
        setServiceInstanceName(serviceInstanceName);
        return this;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a component is
     * attached to a service instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a
     *        component is attached to a service instance.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a component is
     * attached to a service instance.
     * </p>
     * 
     * @return The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a
     *         component is attached to a service instance.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a component is
     * attached to a service instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a
     *        component is attached to a service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentState withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The service spec that the component uses to access service inputs. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @param serviceSpec
     *        The service spec that the component uses to access service inputs. Provided when a component is attached
     *        to a service instance.
     */

    public void setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
    }

    /**
     * <p>
     * The service spec that the component uses to access service inputs. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @return The service spec that the component uses to access service inputs. Provided when a component is attached
     *         to a service instance.
     */

    public String getServiceSpec() {
        return this.serviceSpec;
    }

    /**
     * <p>
     * The service spec that the component uses to access service inputs. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @param serviceSpec
     *        The service spec that the component uses to access service inputs. Provided when a component is attached
     *        to a service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentState withServiceSpec(String serviceSpec) {
        setServiceSpec(serviceSpec);
        return this;
    }

    /**
     * <p>
     * The template file used.
     * </p>
     * 
     * @param templateFile
     *        The template file used.
     */

    public void setTemplateFile(String templateFile) {
        this.templateFile = templateFile;
    }

    /**
     * <p>
     * The template file used.
     * </p>
     * 
     * @return The template file used.
     */

    public String getTemplateFile() {
        return this.templateFile;
    }

    /**
     * <p>
     * The template file used.
     * </p>
     * 
     * @param templateFile
     *        The template file used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentState withTemplateFile(String templateFile) {
        setTemplateFile(templateFile);
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
        if (getServiceInstanceName() != null)
            sb.append("ServiceInstanceName: ").append(getServiceInstanceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceSpec() != null)
            sb.append("ServiceSpec: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateFile() != null)
            sb.append("TemplateFile: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentState == false)
            return false;
        ComponentState other = (ComponentState) obj;
        if (other.getServiceInstanceName() == null ^ this.getServiceInstanceName() == null)
            return false;
        if (other.getServiceInstanceName() != null && other.getServiceInstanceName().equals(this.getServiceInstanceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceSpec() == null ^ this.getServiceSpec() == null)
            return false;
        if (other.getServiceSpec() != null && other.getServiceSpec().equals(this.getServiceSpec()) == false)
            return false;
        if (other.getTemplateFile() == null ^ this.getTemplateFile() == null)
            return false;
        if (other.getTemplateFile() != null && other.getTemplateFile().equals(this.getTemplateFile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceInstanceName() == null) ? 0 : getServiceInstanceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceSpec() == null) ? 0 : getServiceSpec().hashCode());
        hashCode = prime * hashCode + ((getTemplateFile() == null) ? 0 : getTemplateFile().hashCode());
        return hashCode;
    }

    @Override
    public ComponentState clone() {
        try {
            return (ComponentState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ComponentStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
