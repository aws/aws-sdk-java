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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/UpdateTLSInspectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTLSInspectionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     */
    private String tLSInspectionConfigurationArn;
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
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     * inspection configuration.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     * inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of
     * the request.
     * </p>
     * <p>
     * To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses
     * the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has
     * changed, the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the TLS
     * inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed,
     * then try the operation again using the new token.
     * </p>
     */
    private String updateToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     * 
     * @param tLSInspectionConfigurationArn
     *        The Amazon Resource Name (ARN) of the TLS inspection configuration.
     */

    public void setTLSInspectionConfigurationArn(String tLSInspectionConfigurationArn) {
        this.tLSInspectionConfigurationArn = tLSInspectionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the TLS inspection configuration.
     */

    public String getTLSInspectionConfigurationArn() {
        return this.tLSInspectionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     * 
     * @param tLSInspectionConfigurationArn
     *        The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTLSInspectionConfigurationRequest withTLSInspectionConfigurationArn(String tLSInspectionConfigurationArn) {
        setTLSInspectionConfigurationArn(tLSInspectionConfigurationArn);
        return this;
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

    public UpdateTLSInspectionConfigurationRequest withTLSInspectionConfigurationName(String tLSInspectionConfigurationName) {
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

    public UpdateTLSInspectionConfigurationRequest withTLSInspectionConfiguration(TLSInspectionConfiguration tLSInspectionConfiguration) {
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

    public UpdateTLSInspectionConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     * inspection configuration.
     * </p>
     * 
     * @param encryptionConfiguration
     *        A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     *        inspection configuration.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     * inspection configuration.
     * </p>
     * 
     * @return A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     *         inspection configuration.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     * inspection configuration.
     * </p>
     * 
     * @param encryptionConfiguration
     *        A complex type that contains the Amazon Web Services KMS encryption configuration settings for your TLS
     *        inspection configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTLSInspectionConfigurationRequest withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     * inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of
     * the request.
     * </p>
     * <p>
     * To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses
     * the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has
     * changed, the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the TLS
     * inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed,
     * then try the operation again using the new token.
     * </p>
     * 
     * @param updateToken
     *        A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     *        inspection configuration. The token marks the state of the TLS inspection configuration resource at the
     *        time of the request. </p>
     *        <p>
     *        To make changes to the TLS inspection configuration, you provide the token in your request. Network
     *        Firewall uses the token to ensure that the TLS inspection configuration hasn't changed since you last
     *        retrieved it. If it has changed, the operation fails with an <code>InvalidTokenException</code>. If this
     *        happens, retrieve the TLS inspection configuration again to get a current copy of it with a current token.
     *        Reapply your changes as needed, then try the operation again using the new token.
     */

    public void setUpdateToken(String updateToken) {
        this.updateToken = updateToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     * inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of
     * the request.
     * </p>
     * <p>
     * To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses
     * the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has
     * changed, the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the TLS
     * inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed,
     * then try the operation again using the new token.
     * </p>
     * 
     * @return A token used for optimistic locking. Network Firewall returns a token to your requests that access the
     *         TLS inspection configuration. The token marks the state of the TLS inspection configuration resource at
     *         the time of the request. </p>
     *         <p>
     *         To make changes to the TLS inspection configuration, you provide the token in your request. Network
     *         Firewall uses the token to ensure that the TLS inspection configuration hasn't changed since you last
     *         retrieved it. If it has changed, the operation fails with an <code>InvalidTokenException</code>. If this
     *         happens, retrieve the TLS inspection configuration again to get a current copy of it with a current
     *         token. Reapply your changes as needed, then try the operation again using the new token.
     */

    public String getUpdateToken() {
        return this.updateToken;
    }

    /**
     * <p>
     * A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     * inspection configuration. The token marks the state of the TLS inspection configuration resource at the time of
     * the request.
     * </p>
     * <p>
     * To make changes to the TLS inspection configuration, you provide the token in your request. Network Firewall uses
     * the token to ensure that the TLS inspection configuration hasn't changed since you last retrieved it. If it has
     * changed, the operation fails with an <code>InvalidTokenException</code>. If this happens, retrieve the TLS
     * inspection configuration again to get a current copy of it with a current token. Reapply your changes as needed,
     * then try the operation again using the new token.
     * </p>
     * 
     * @param updateToken
     *        A token used for optimistic locking. Network Firewall returns a token to your requests that access the TLS
     *        inspection configuration. The token marks the state of the TLS inspection configuration resource at the
     *        time of the request. </p>
     *        <p>
     *        To make changes to the TLS inspection configuration, you provide the token in your request. Network
     *        Firewall uses the token to ensure that the TLS inspection configuration hasn't changed since you last
     *        retrieved it. If it has changed, the operation fails with an <code>InvalidTokenException</code>. If this
     *        happens, retrieve the TLS inspection configuration again to get a current copy of it with a current token.
     *        Reapply your changes as needed, then try the operation again using the new token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTLSInspectionConfigurationRequest withUpdateToken(String updateToken) {
        setUpdateToken(updateToken);
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
        if (getTLSInspectionConfigurationArn() != null)
            sb.append("TLSInspectionConfigurationArn: ").append(getTLSInspectionConfigurationArn()).append(",");
        if (getTLSInspectionConfigurationName() != null)
            sb.append("TLSInspectionConfigurationName: ").append(getTLSInspectionConfigurationName()).append(",");
        if (getTLSInspectionConfiguration() != null)
            sb.append("TLSInspectionConfiguration: ").append(getTLSInspectionConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getUpdateToken() != null)
            sb.append("UpdateToken: ").append(getUpdateToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTLSInspectionConfigurationRequest == false)
            return false;
        UpdateTLSInspectionConfigurationRequest other = (UpdateTLSInspectionConfigurationRequest) obj;
        if (other.getTLSInspectionConfigurationArn() == null ^ this.getTLSInspectionConfigurationArn() == null)
            return false;
        if (other.getTLSInspectionConfigurationArn() != null
                && other.getTLSInspectionConfigurationArn().equals(this.getTLSInspectionConfigurationArn()) == false)
            return false;
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
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getUpdateToken() == null ^ this.getUpdateToken() == null)
            return false;
        if (other.getUpdateToken() != null && other.getUpdateToken().equals(this.getUpdateToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTLSInspectionConfigurationArn() == null) ? 0 : getTLSInspectionConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getTLSInspectionConfigurationName() == null) ? 0 : getTLSInspectionConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getTLSInspectionConfiguration() == null) ? 0 : getTLSInspectionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdateToken() == null) ? 0 : getUpdateToken().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTLSInspectionConfigurationRequest clone() {
        return (UpdateTLSInspectionConfigurationRequest) super.clone();
    }

}
