/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * the option to configure log subscription.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/ConfigureLogs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigureLogsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private EgressAccessLogs egressAccessLogs;
    /** The ID of the channel to log subscription. */
    private String id;

    private IngressAccessLogs ingressAccessLogs;

    /**
     * @param egressAccessLogs
     */

    public void setEgressAccessLogs(EgressAccessLogs egressAccessLogs) {
        this.egressAccessLogs = egressAccessLogs;
    }

    /**
     * @return
     */

    public EgressAccessLogs getEgressAccessLogs() {
        return this.egressAccessLogs;
    }

    /**
     * @param egressAccessLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureLogsRequest withEgressAccessLogs(EgressAccessLogs egressAccessLogs) {
        setEgressAccessLogs(egressAccessLogs);
        return this;
    }

    /**
     * The ID of the channel to log subscription.
     * 
     * @param id
     *        The ID of the channel to log subscription.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the channel to log subscription.
     * 
     * @return The ID of the channel to log subscription.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the channel to log subscription.
     * 
     * @param id
     *        The ID of the channel to log subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureLogsRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param ingressAccessLogs
     */

    public void setIngressAccessLogs(IngressAccessLogs ingressAccessLogs) {
        this.ingressAccessLogs = ingressAccessLogs;
    }

    /**
     * @return
     */

    public IngressAccessLogs getIngressAccessLogs() {
        return this.ingressAccessLogs;
    }

    /**
     * @param ingressAccessLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigureLogsRequest withIngressAccessLogs(IngressAccessLogs ingressAccessLogs) {
        setIngressAccessLogs(ingressAccessLogs);
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
        if (getEgressAccessLogs() != null)
            sb.append("EgressAccessLogs: ").append(getEgressAccessLogs()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIngressAccessLogs() != null)
            sb.append("IngressAccessLogs: ").append(getIngressAccessLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigureLogsRequest == false)
            return false;
        ConfigureLogsRequest other = (ConfigureLogsRequest) obj;
        if (other.getEgressAccessLogs() == null ^ this.getEgressAccessLogs() == null)
            return false;
        if (other.getEgressAccessLogs() != null && other.getEgressAccessLogs().equals(this.getEgressAccessLogs()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIngressAccessLogs() == null ^ this.getIngressAccessLogs() == null)
            return false;
        if (other.getIngressAccessLogs() != null && other.getIngressAccessLogs().equals(this.getIngressAccessLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEgressAccessLogs() == null) ? 0 : getEgressAccessLogs().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIngressAccessLogs() == null) ? 0 : getIngressAccessLogs().hashCode());
        return hashCode;
    }

    @Override
    public ConfigureLogsRequest clone() {
        return (ConfigureLogsRequest) super.clone();
    }

}
