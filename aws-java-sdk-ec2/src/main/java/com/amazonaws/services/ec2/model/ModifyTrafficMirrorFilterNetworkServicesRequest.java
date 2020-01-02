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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyTrafficMirrorFilterNetworkServicesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTrafficMirrorFilterNetworkServicesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyTrafficMirrorFilterNetworkServicesRequest> {

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     */
    private String trafficMirrorFilterId;
    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addNetworkServices;
    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to mirror.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeNetworkServices;

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     * 
     * @param trafficMirrorFilterId
     *        The ID of the Traffic Mirror filter.
     */

    public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
        this.trafficMirrorFilterId = trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     * 
     * @return The ID of the Traffic Mirror filter.
     */

    public String getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     * 
     * @param trafficMirrorFilterId
     *        The ID of the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTrafficMirrorFilterNetworkServicesRequest withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        setTrafficMirrorFilterId(trafficMirrorFilterId);
        return this;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     * 
     * @return The network service, for example Amazon DNS, that you want to mirror.
     * @see TrafficMirrorNetworkService
     */

    public java.util.List<String> getAddNetworkServices() {
        if (addNetworkServices == null) {
            addNetworkServices = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addNetworkServices;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     * 
     * @param addNetworkServices
     *        The network service, for example Amazon DNS, that you want to mirror.
     * @see TrafficMirrorNetworkService
     */

    public void setAddNetworkServices(java.util.Collection<String> addNetworkServices) {
        if (addNetworkServices == null) {
            this.addNetworkServices = null;
            return;
        }

        this.addNetworkServices = new com.amazonaws.internal.SdkInternalList<String>(addNetworkServices);
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddNetworkServices(java.util.Collection)} or {@link #withAddNetworkServices(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param addNetworkServices
     *        The network service, for example Amazon DNS, that you want to mirror.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorNetworkService
     */

    public ModifyTrafficMirrorFilterNetworkServicesRequest withAddNetworkServices(String... addNetworkServices) {
        if (this.addNetworkServices == null) {
            setAddNetworkServices(new com.amazonaws.internal.SdkInternalList<String>(addNetworkServices.length));
        }
        for (String ele : addNetworkServices) {
            this.addNetworkServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     * 
     * @param addNetworkServices
     *        The network service, for example Amazon DNS, that you want to mirror.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorNetworkService
     */

    public ModifyTrafficMirrorFilterNetworkServicesRequest withAddNetworkServices(java.util.Collection<String> addNetworkServices) {
        setAddNetworkServices(addNetworkServices);
        return this;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you want to mirror.
     * </p>
     * 
     * @param addNetworkServices
     *        The network service, for example Amazon DNS, that you want to mirror.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorNetworkService
     */

    public ModifyTrafficMirrorFilterNetworkServicesRequest withAddNetworkServices(TrafficMirrorNetworkService... addNetworkServices) {
        com.amazonaws.internal.SdkInternalList<String> addNetworkServicesCopy = new com.amazonaws.internal.SdkInternalList<String>(addNetworkServices.length);
        for (TrafficMirrorNetworkService value : addNetworkServices) {
            addNetworkServicesCopy.add(value.toString());
        }
        if (getAddNetworkServices() == null) {
            setAddNetworkServices(addNetworkServicesCopy);
        } else {
            getAddNetworkServices().addAll(addNetworkServicesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to mirror.
     * </p>
     * 
     * @return The network service, for example Amazon DNS, that you no longer want to mirror.
     * @see TrafficMirrorNetworkService
     */

    public java.util.List<String> getRemoveNetworkServices() {
        if (removeNetworkServices == null) {
            removeNetworkServices = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeNetworkServices;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to mirror.
     * </p>
     * 
     * @param removeNetworkServices
     *        The network service, for example Amazon DNS, that you no longer want to mirror.
     * @see TrafficMirrorNetworkService
     */

    public void setRemoveNetworkServices(java.util.Collection<String> removeNetworkServices) {
        if (removeNetworkServices == null) {
            this.removeNetworkServices = null;
            return;
        }

        this.removeNetworkServices = new com.amazonaws.internal.SdkInternalList<String>(removeNetworkServices);
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to mirror.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveNetworkServices(java.util.Collection)} or
     * {@link #withRemoveNetworkServices(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeNetworkServices
     *        The network service, for example Amazon DNS, that you no longer want to mirror.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorNetworkService
     */

    public ModifyTrafficMirrorFilterNetworkServicesRequest withRemoveNetworkServices(String... removeNetworkServices) {
        if (this.removeNetworkServices == null) {
            setRemoveNetworkServices(new com.amazonaws.internal.SdkInternalList<String>(removeNetworkServices.length));
        }
        for (String ele : removeNetworkServices) {
            this.removeNetworkServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to mirror.
     * </p>
     * 
     * @param removeNetworkServices
     *        The network service, for example Amazon DNS, that you no longer want to mirror.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorNetworkService
     */

    public ModifyTrafficMirrorFilterNetworkServicesRequest withRemoveNetworkServices(java.util.Collection<String> removeNetworkServices) {
        setRemoveNetworkServices(removeNetworkServices);
        return this;
    }

    /**
     * <p>
     * The network service, for example Amazon DNS, that you no longer want to mirror.
     * </p>
     * 
     * @param removeNetworkServices
     *        The network service, for example Amazon DNS, that you no longer want to mirror.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorNetworkService
     */

    public ModifyTrafficMirrorFilterNetworkServicesRequest withRemoveNetworkServices(TrafficMirrorNetworkService... removeNetworkServices) {
        com.amazonaws.internal.SdkInternalList<String> removeNetworkServicesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                removeNetworkServices.length);
        for (TrafficMirrorNetworkService value : removeNetworkServices) {
            removeNetworkServicesCopy.add(value.toString());
        }
        if (getRemoveNetworkServices() == null) {
            setRemoveNetworkServices(removeNetworkServicesCopy);
        } else {
            getRemoveNetworkServices().addAll(removeNetworkServicesCopy);
        }
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyTrafficMirrorFilterNetworkServicesRequest> getDryRunRequest() {
        Request<ModifyTrafficMirrorFilterNetworkServicesRequest> request = new ModifyTrafficMirrorFilterNetworkServicesRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: ").append(getTrafficMirrorFilterId()).append(",");
        if (getAddNetworkServices() != null)
            sb.append("AddNetworkServices: ").append(getAddNetworkServices()).append(",");
        if (getRemoveNetworkServices() != null)
            sb.append("RemoveNetworkServices: ").append(getRemoveNetworkServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTrafficMirrorFilterNetworkServicesRequest == false)
            return false;
        ModifyTrafficMirrorFilterNetworkServicesRequest other = (ModifyTrafficMirrorFilterNetworkServicesRequest) obj;
        if (other.getTrafficMirrorFilterId() == null ^ this.getTrafficMirrorFilterId() == null)
            return false;
        if (other.getTrafficMirrorFilterId() != null && other.getTrafficMirrorFilterId().equals(this.getTrafficMirrorFilterId()) == false)
            return false;
        if (other.getAddNetworkServices() == null ^ this.getAddNetworkServices() == null)
            return false;
        if (other.getAddNetworkServices() != null && other.getAddNetworkServices().equals(this.getAddNetworkServices()) == false)
            return false;
        if (other.getRemoveNetworkServices() == null ^ this.getRemoveNetworkServices() == null)
            return false;
        if (other.getRemoveNetworkServices() != null && other.getRemoveNetworkServices().equals(this.getRemoveNetworkServices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode + ((getAddNetworkServices() == null) ? 0 : getAddNetworkServices().hashCode());
        hashCode = prime * hashCode + ((getRemoveNetworkServices() == null) ? 0 : getRemoveNetworkServices().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTrafficMirrorFilterNetworkServicesRequest clone() {
        return (ModifyTrafficMirrorFilterNetworkServicesRequest) super.clone();
    }
}
