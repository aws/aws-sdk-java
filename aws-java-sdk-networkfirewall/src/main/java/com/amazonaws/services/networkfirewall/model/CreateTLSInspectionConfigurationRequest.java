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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CreateTLSInspectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTLSInspectionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     */
    private String tLSInspectionConfigurationName;
    /**
     * <p>
     * The object that defines a TLS inspection configuration. This, along with
     * <a>TLSInspectionConfigurationResponse</a>, define the TLS inspection configuration. You can retrieve all objects
     * for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     * <p>
     * Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the traffic
     * before sending it to its destination.
     * </p>
     * <p>
     * To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy, then you apply the
     * firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect the traffic
     * traveling through your firewalls. You can reference a TLS inspection configuration from more than one firewall
     * policy, and you can use a firewall policy in more than one firewall. For more information about using TLS
     * inspection configurations, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html">Inspecting SSL/TLS
     * traffic with TLS inspection configurations</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     */
    private TLSInspectionConfiguration tLSInspectionConfiguration;
    /**
     * <p>
     * A description of the TLS inspection configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    private EncryptionConfiguration encryptionConfiguration;

    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     * 
     * @param tLSInspectionConfigurationName
     *        The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     *        configuration after you create it.
     */

    public void setTLSInspectionConfigurationName(String tLSInspectionConfigurationName) {
        this.tLSInspectionConfigurationName = tLSInspectionConfigurationName;
    }

    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     * 
     * @return The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     *         configuration after you create it.
     */

    public String getTLSInspectionConfigurationName() {
        return this.tLSInspectionConfigurationName;
    }

    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     * 
     * @param tLSInspectionConfigurationName
     *        The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     *        configuration after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTLSInspectionConfigurationRequest withTLSInspectionConfigurationName(String tLSInspectionConfigurationName) {
        setTLSInspectionConfigurationName(tLSInspectionConfigurationName);
        return this;
    }

    /**
     * <p>
     * The object that defines a TLS inspection configuration. This, along with
     * <a>TLSInspectionConfigurationResponse</a>, define the TLS inspection configuration. You can retrieve all objects
     * for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     * <p>
     * Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the traffic
     * before sending it to its destination.
     * </p>
     * <p>
     * To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy, then you apply the
     * firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect the traffic
     * traveling through your firewalls. You can reference a TLS inspection configuration from more than one firewall
     * policy, and you can use a firewall policy in more than one firewall. For more information about using TLS
     * inspection configurations, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html">Inspecting SSL/TLS
     * traffic with TLS inspection configurations</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * 
     * @param tLSInspectionConfiguration
     *        The object that defines a TLS inspection configuration. This, along with
     *        <a>TLSInspectionConfigurationResponse</a>, define the TLS inspection configuration. You can retrieve all
     *        objects for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>. </p>
     *        <p>
     *        Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the
     *        traffic before sending it to its destination.
     *        </p>
     *        <p>
     *        To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy, then you
     *        apply the firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect
     *        the traffic traveling through your firewalls. You can reference a TLS inspection configuration from more
     *        than one firewall policy, and you can use a firewall policy in more than one firewall. For more
     *        information about using TLS inspection configurations, see <a
     *        href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html">Inspecting
     *        SSL/TLS traffic with TLS inspection configurations</a> in the <i>Network Firewall Developer Guide</i>.
     */

    public void setTLSInspectionConfiguration(TLSInspectionConfiguration tLSInspectionConfiguration) {
        this.tLSInspectionConfiguration = tLSInspectionConfiguration;
    }

    /**
     * <p>
     * The object that defines a TLS inspection configuration. This, along with
     * <a>TLSInspectionConfigurationResponse</a>, define the TLS inspection configuration. You can retrieve all objects
     * for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     * <p>
     * Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the traffic
     * before sending it to its destination.
     * </p>
     * <p>
     * To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy, then you apply the
     * firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect the traffic
     * traveling through your firewalls. You can reference a TLS inspection configuration from more than one firewall
     * policy, and you can use a firewall policy in more than one firewall. For more information about using TLS
     * inspection configurations, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html">Inspecting SSL/TLS
     * traffic with TLS inspection configurations</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * 
     * @return The object that defines a TLS inspection configuration. This, along with
     *         <a>TLSInspectionConfigurationResponse</a>, define the TLS inspection configuration. You can retrieve all
     *         objects for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>. </p>
     *         <p>
     *         Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the
     *         traffic before sending it to its destination.
     *         </p>
     *         <p>
     *         To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy, then you
     *         apply the firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect
     *         the traffic traveling through your firewalls. You can reference a TLS inspection configuration from more
     *         than one firewall policy, and you can use a firewall policy in more than one firewall. For more
     *         information about using TLS inspection configurations, see <a
     *         href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html">Inspecting
     *         SSL/TLS traffic with TLS inspection configurations</a> in the <i>Network Firewall Developer Guide</i>.
     */

    public TLSInspectionConfiguration getTLSInspectionConfiguration() {
        return this.tLSInspectionConfiguration;
    }

    /**
     * <p>
     * The object that defines a TLS inspection configuration. This, along with
     * <a>TLSInspectionConfigurationResponse</a>, define the TLS inspection configuration. You can retrieve all objects
     * for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>.
     * </p>
     * <p>
     * Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the traffic
     * before sending it to its destination.
     * </p>
     * <p>
     * To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy, then you apply the
     * firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect the traffic
     * traveling through your firewalls. You can reference a TLS inspection configuration from more than one firewall
     * policy, and you can use a firewall policy in more than one firewall. For more information about using TLS
     * inspection configurations, see <a
     * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html">Inspecting SSL/TLS
     * traffic with TLS inspection configurations</a> in the <i>Network Firewall Developer Guide</i>.
     * </p>
     * 
     * @param tLSInspectionConfiguration
     *        The object that defines a TLS inspection configuration. This, along with
     *        <a>TLSInspectionConfigurationResponse</a>, define the TLS inspection configuration. You can retrieve all
     *        objects for a TLS inspection configuration by calling <a>DescribeTLSInspectionConfiguration</a>. </p>
     *        <p>
     *        Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the
     *        traffic before sending it to its destination.
     *        </p>
     *        <p>
     *        To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy, then you
     *        apply the firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect
     *        the traffic traveling through your firewalls. You can reference a TLS inspection configuration from more
     *        than one firewall policy, and you can use a firewall policy in more than one firewall. For more
     *        information about using TLS inspection configurations, see <a
     *        href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html">Inspecting
     *        SSL/TLS traffic with TLS inspection configurations</a> in the <i>Network Firewall Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTLSInspectionConfigurationRequest withTLSInspectionConfiguration(TLSInspectionConfiguration tLSInspectionConfiguration) {
        setTLSInspectionConfiguration(tLSInspectionConfiguration);
        return this;
    }

    /**
     * <p>
     * A description of the TLS inspection configuration.
     * </p>
     * 
     * @param description
     *        A description of the TLS inspection configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the TLS inspection configuration.
     * </p>
     * 
     * @return A description of the TLS inspection configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the TLS inspection configuration.
     * </p>
     * 
     * @param description
     *        A description of the TLS inspection configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTLSInspectionConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @return The key:value pairs to associate with the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTLSInspectionConfigurationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTLSInspectionConfigurationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * @param encryptionConfiguration
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * @return
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * @param encryptionConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTLSInspectionConfigurationRequest withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
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
        if (getTLSInspectionConfigurationName() != null)
            sb.append("TLSInspectionConfigurationName: ").append(getTLSInspectionConfigurationName()).append(",");
        if (getTLSInspectionConfiguration() != null)
            sb.append("TLSInspectionConfiguration: ").append(getTLSInspectionConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTLSInspectionConfigurationRequest == false)
            return false;
        CreateTLSInspectionConfigurationRequest other = (CreateTLSInspectionConfigurationRequest) obj;
        if (other.getTLSInspectionConfigurationName() == null ^ this.getTLSInspectionConfigurationName() == null)
            return false;
        if (other.getTLSInspectionConfigurationName() != null
                && other.getTLSInspectionConfigurationName().equals(this.getTLSInspectionConfigurationName()) == false)
            return false;
        if (other.getTLSInspectionConfiguration() == null ^ this.getTLSInspectionConfiguration() == null)
            return false;
        if (other.getTLSInspectionConfiguration() != null && other.getTLSInspectionConfiguration().equals(this.getTLSInspectionConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTLSInspectionConfigurationName() == null) ? 0 : getTLSInspectionConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getTLSInspectionConfiguration() == null) ? 0 : getTLSInspectionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateTLSInspectionConfigurationRequest clone() {
        return (CreateTLSInspectionConfigurationRequest) super.clone();
    }

}
