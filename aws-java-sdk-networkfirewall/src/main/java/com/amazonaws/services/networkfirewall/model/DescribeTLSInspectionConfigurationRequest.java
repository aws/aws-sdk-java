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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DescribeTLSInspectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTLSInspectionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String tLSInspectionConfigurationArn;
    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     */
    private String tLSInspectionConfigurationName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param tLSInspectionConfigurationArn
     *        The Amazon Resource Name (ARN) of the TLS inspection configuration.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setTLSInspectionConfigurationArn(String tLSInspectionConfigurationArn) {
        this.tLSInspectionConfigurationArn = tLSInspectionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the TLS inspection configuration.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getTLSInspectionConfigurationArn() {
        return this.tLSInspectionConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the TLS inspection configuration.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param tLSInspectionConfigurationArn
     *        The Amazon Resource Name (ARN) of the TLS inspection configuration.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTLSInspectionConfigurationRequest withTLSInspectionConfigurationArn(String tLSInspectionConfigurationArn) {
        setTLSInspectionConfigurationArn(tLSInspectionConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param tLSInspectionConfigurationName
     *        The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     *        configuration after you create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     */

    public void setTLSInspectionConfigurationName(String tLSInspectionConfigurationName) {
        this.tLSInspectionConfigurationName = tLSInspectionConfigurationName;
    }

    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @return The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     *         configuration after you create it.</p>
     *         <p>
     *         You must specify the ARN or the name, and you can specify both.
     */

    public String getTLSInspectionConfigurationName() {
        return this.tLSInspectionConfigurationName;
    }

    /**
     * <p>
     * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     * configuration after you create it.
     * </p>
     * <p>
     * You must specify the ARN or the name, and you can specify both.
     * </p>
     * 
     * @param tLSInspectionConfigurationName
     *        The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection
     *        configuration after you create it.</p>
     *        <p>
     *        You must specify the ARN or the name, and you can specify both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTLSInspectionConfigurationRequest withTLSInspectionConfigurationName(String tLSInspectionConfigurationName) {
        setTLSInspectionConfigurationName(tLSInspectionConfigurationName);
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
            sb.append("TLSInspectionConfigurationName: ").append(getTLSInspectionConfigurationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTLSInspectionConfigurationRequest == false)
            return false;
        DescribeTLSInspectionConfigurationRequest other = (DescribeTLSInspectionConfigurationRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTLSInspectionConfigurationArn() == null) ? 0 : getTLSInspectionConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getTLSInspectionConfigurationName() == null) ? 0 : getTLSInspectionConfigurationName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTLSInspectionConfigurationRequest clone() {
        return (DescribeTLSInspectionConfigurationRequest) super.clone();
    }

}
