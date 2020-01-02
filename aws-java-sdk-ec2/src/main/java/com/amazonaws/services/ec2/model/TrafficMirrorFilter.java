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

/**
 * <p>
 * Describes the Traffic Mirror filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TrafficMirrorFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficMirrorFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Traffic Mirror filter.
     * </p>
     */
    private String trafficMirrorFilterId;
    /**
     * <p>
     * Information about the ingress rules that are associated with the Traffic Mirror filter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule> ingressFilterRules;
    /**
     * <p>
     * Information about the egress rules that are associated with the Traffic Mirror filter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule> egressFilterRules;
    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror filter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkServices;
    /**
     * <p>
     * The description of the Traffic Mirror filter.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags assigned to the Traffic Mirror filter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

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

    public TrafficMirrorFilter withTrafficMirrorFilterId(String trafficMirrorFilterId) {
        setTrafficMirrorFilterId(trafficMirrorFilterId);
        return this;
    }

    /**
     * <p>
     * Information about the ingress rules that are associated with the Traffic Mirror filter.
     * </p>
     * 
     * @return Information about the ingress rules that are associated with the Traffic Mirror filter.
     */

    public java.util.List<TrafficMirrorFilterRule> getIngressFilterRules() {
        if (ingressFilterRules == null) {
            ingressFilterRules = new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule>();
        }
        return ingressFilterRules;
    }

    /**
     * <p>
     * Information about the ingress rules that are associated with the Traffic Mirror filter.
     * </p>
     * 
     * @param ingressFilterRules
     *        Information about the ingress rules that are associated with the Traffic Mirror filter.
     */

    public void setIngressFilterRules(java.util.Collection<TrafficMirrorFilterRule> ingressFilterRules) {
        if (ingressFilterRules == null) {
            this.ingressFilterRules = null;
            return;
        }

        this.ingressFilterRules = new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule>(ingressFilterRules);
    }

    /**
     * <p>
     * Information about the ingress rules that are associated with the Traffic Mirror filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIngressFilterRules(java.util.Collection)} or {@link #withIngressFilterRules(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param ingressFilterRules
     *        Information about the ingress rules that are associated with the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilter withIngressFilterRules(TrafficMirrorFilterRule... ingressFilterRules) {
        if (this.ingressFilterRules == null) {
            setIngressFilterRules(new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule>(ingressFilterRules.length));
        }
        for (TrafficMirrorFilterRule ele : ingressFilterRules) {
            this.ingressFilterRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the ingress rules that are associated with the Traffic Mirror filter.
     * </p>
     * 
     * @param ingressFilterRules
     *        Information about the ingress rules that are associated with the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilter withIngressFilterRules(java.util.Collection<TrafficMirrorFilterRule> ingressFilterRules) {
        setIngressFilterRules(ingressFilterRules);
        return this;
    }

    /**
     * <p>
     * Information about the egress rules that are associated with the Traffic Mirror filter.
     * </p>
     * 
     * @return Information about the egress rules that are associated with the Traffic Mirror filter.
     */

    public java.util.List<TrafficMirrorFilterRule> getEgressFilterRules() {
        if (egressFilterRules == null) {
            egressFilterRules = new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule>();
        }
        return egressFilterRules;
    }

    /**
     * <p>
     * Information about the egress rules that are associated with the Traffic Mirror filter.
     * </p>
     * 
     * @param egressFilterRules
     *        Information about the egress rules that are associated with the Traffic Mirror filter.
     */

    public void setEgressFilterRules(java.util.Collection<TrafficMirrorFilterRule> egressFilterRules) {
        if (egressFilterRules == null) {
            this.egressFilterRules = null;
            return;
        }

        this.egressFilterRules = new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule>(egressFilterRules);
    }

    /**
     * <p>
     * Information about the egress rules that are associated with the Traffic Mirror filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEgressFilterRules(java.util.Collection)} or {@link #withEgressFilterRules(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param egressFilterRules
     *        Information about the egress rules that are associated with the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilter withEgressFilterRules(TrafficMirrorFilterRule... egressFilterRules) {
        if (this.egressFilterRules == null) {
            setEgressFilterRules(new com.amazonaws.internal.SdkInternalList<TrafficMirrorFilterRule>(egressFilterRules.length));
        }
        for (TrafficMirrorFilterRule ele : egressFilterRules) {
            this.egressFilterRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the egress rules that are associated with the Traffic Mirror filter.
     * </p>
     * 
     * @param egressFilterRules
     *        Information about the egress rules that are associated with the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilter withEgressFilterRules(java.util.Collection<TrafficMirrorFilterRule> egressFilterRules) {
        setEgressFilterRules(egressFilterRules);
        return this;
    }

    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror filter.
     * </p>
     * 
     * @return The network service traffic that is associated with the Traffic Mirror filter.
     * @see TrafficMirrorNetworkService
     */

    public java.util.List<String> getNetworkServices() {
        if (networkServices == null) {
            networkServices = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkServices;
    }

    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror filter.
     * </p>
     * 
     * @param networkServices
     *        The network service traffic that is associated with the Traffic Mirror filter.
     * @see TrafficMirrorNetworkService
     */

    public void setNetworkServices(java.util.Collection<String> networkServices) {
        if (networkServices == null) {
            this.networkServices = null;
            return;
        }

        this.networkServices = new com.amazonaws.internal.SdkInternalList<String>(networkServices);
    }

    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkServices(java.util.Collection)} or {@link #withNetworkServices(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param networkServices
     *        The network service traffic that is associated with the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorNetworkService
     */

    public TrafficMirrorFilter withNetworkServices(String... networkServices) {
        if (this.networkServices == null) {
            setNetworkServices(new com.amazonaws.internal.SdkInternalList<String>(networkServices.length));
        }
        for (String ele : networkServices) {
            this.networkServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror filter.
     * </p>
     * 
     * @param networkServices
     *        The network service traffic that is associated with the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorNetworkService
     */

    public TrafficMirrorFilter withNetworkServices(java.util.Collection<String> networkServices) {
        setNetworkServices(networkServices);
        return this;
    }

    /**
     * <p>
     * The network service traffic that is associated with the Traffic Mirror filter.
     * </p>
     * 
     * @param networkServices
     *        The network service traffic that is associated with the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficMirrorNetworkService
     */

    public TrafficMirrorFilter withNetworkServices(TrafficMirrorNetworkService... networkServices) {
        com.amazonaws.internal.SdkInternalList<String> networkServicesCopy = new com.amazonaws.internal.SdkInternalList<String>(networkServices.length);
        for (TrafficMirrorNetworkService value : networkServices) {
            networkServicesCopy.add(value.toString());
        }
        if (getNetworkServices() == null) {
            setNetworkServices(networkServicesCopy);
        } else {
            getNetworkServices().addAll(networkServicesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The description of the Traffic Mirror filter.
     * </p>
     * 
     * @param description
     *        The description of the Traffic Mirror filter.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror filter.
     * </p>
     * 
     * @return The description of the Traffic Mirror filter.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Traffic Mirror filter.
     * </p>
     * 
     * @param description
     *        The description of the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilter withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror filter.
     * </p>
     * 
     * @return The tags assigned to the Traffic Mirror filter.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror filter.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Traffic Mirror filter.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilter withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the Traffic Mirror filter.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the Traffic Mirror filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficMirrorFilter withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTrafficMirrorFilterId() != null)
            sb.append("TrafficMirrorFilterId: ").append(getTrafficMirrorFilterId()).append(",");
        if (getIngressFilterRules() != null)
            sb.append("IngressFilterRules: ").append(getIngressFilterRules()).append(",");
        if (getEgressFilterRules() != null)
            sb.append("EgressFilterRules: ").append(getEgressFilterRules()).append(",");
        if (getNetworkServices() != null)
            sb.append("NetworkServices: ").append(getNetworkServices()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficMirrorFilter == false)
            return false;
        TrafficMirrorFilter other = (TrafficMirrorFilter) obj;
        if (other.getTrafficMirrorFilterId() == null ^ this.getTrafficMirrorFilterId() == null)
            return false;
        if (other.getTrafficMirrorFilterId() != null && other.getTrafficMirrorFilterId().equals(this.getTrafficMirrorFilterId()) == false)
            return false;
        if (other.getIngressFilterRules() == null ^ this.getIngressFilterRules() == null)
            return false;
        if (other.getIngressFilterRules() != null && other.getIngressFilterRules().equals(this.getIngressFilterRules()) == false)
            return false;
        if (other.getEgressFilterRules() == null ^ this.getEgressFilterRules() == null)
            return false;
        if (other.getEgressFilterRules() != null && other.getEgressFilterRules().equals(this.getEgressFilterRules()) == false)
            return false;
        if (other.getNetworkServices() == null ^ this.getNetworkServices() == null)
            return false;
        if (other.getNetworkServices() != null && other.getNetworkServices().equals(this.getNetworkServices()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficMirrorFilterId() == null) ? 0 : getTrafficMirrorFilterId().hashCode());
        hashCode = prime * hashCode + ((getIngressFilterRules() == null) ? 0 : getIngressFilterRules().hashCode());
        hashCode = prime * hashCode + ((getEgressFilterRules() == null) ? 0 : getEgressFilterRules().hashCode());
        hashCode = prime * hashCode + ((getNetworkServices() == null) ? 0 : getNetworkServices().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TrafficMirrorFilter clone() {
        try {
            return (TrafficMirrorFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
