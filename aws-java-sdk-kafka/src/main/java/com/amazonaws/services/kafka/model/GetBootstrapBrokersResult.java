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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/GetBootstrapBrokers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBootstrapBrokersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string containing one or more hostname:port pairs.
     * </p>
     */
    private String bootstrapBrokerString;
    /**
     * <p>
     * A string containing one or more DNS names (or IP) and TLS port pairs.
     * </p>
     */
    private String bootstrapBrokerStringTls;
    /**
     * <p>
     * A string containing one or more DNS names (or IP) and Sasl Scram port pairs.
     * </p>
     */
    private String bootstrapBrokerStringSaslScram;
    /**
     * <p>
     * A string that contains one or more DNS names (or IP addresses) and SASL IAM port pairs.
     * </p>
     */
    private String bootstrapBrokerStringSaslIam;

    /**
     * <p>
     * A string containing one or more hostname:port pairs.
     * </p>
     * 
     * @param bootstrapBrokerString
     *        <p>
     *        A string containing one or more hostname:port pairs.
     *        </p>
     */

    public void setBootstrapBrokerString(String bootstrapBrokerString) {
        this.bootstrapBrokerString = bootstrapBrokerString;
    }

    /**
     * <p>
     * A string containing one or more hostname:port pairs.
     * </p>
     * 
     * @return <p>
     *         A string containing one or more hostname:port pairs.
     *         </p>
     */

    public String getBootstrapBrokerString() {
        return this.bootstrapBrokerString;
    }

    /**
     * <p>
     * A string containing one or more hostname:port pairs.
     * </p>
     * 
     * @param bootstrapBrokerString
     *        <p>
     *        A string containing one or more hostname:port pairs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBootstrapBrokersResult withBootstrapBrokerString(String bootstrapBrokerString) {
        setBootstrapBrokerString(bootstrapBrokerString);
        return this;
    }

    /**
     * <p>
     * A string containing one or more DNS names (or IP) and TLS port pairs.
     * </p>
     * 
     * @param bootstrapBrokerStringTls
     *        <p>
     *        A string containing one or more DNS names (or IP) and TLS port pairs.
     *        </p>
     */

    public void setBootstrapBrokerStringTls(String bootstrapBrokerStringTls) {
        this.bootstrapBrokerStringTls = bootstrapBrokerStringTls;
    }

    /**
     * <p>
     * A string containing one or more DNS names (or IP) and TLS port pairs.
     * </p>
     * 
     * @return <p>
     *         A string containing one or more DNS names (or IP) and TLS port pairs.
     *         </p>
     */

    public String getBootstrapBrokerStringTls() {
        return this.bootstrapBrokerStringTls;
    }

    /**
     * <p>
     * A string containing one or more DNS names (or IP) and TLS port pairs.
     * </p>
     * 
     * @param bootstrapBrokerStringTls
     *        <p>
     *        A string containing one or more DNS names (or IP) and TLS port pairs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBootstrapBrokersResult withBootstrapBrokerStringTls(String bootstrapBrokerStringTls) {
        setBootstrapBrokerStringTls(bootstrapBrokerStringTls);
        return this;
    }

    /**
     * <p>
     * A string containing one or more DNS names (or IP) and Sasl Scram port pairs.
     * </p>
     * 
     * @param bootstrapBrokerStringSaslScram
     *        <p>
     *        A string containing one or more DNS names (or IP) and Sasl Scram port pairs.
     *        </p>
     */

    public void setBootstrapBrokerStringSaslScram(String bootstrapBrokerStringSaslScram) {
        this.bootstrapBrokerStringSaslScram = bootstrapBrokerStringSaslScram;
    }

    /**
     * <p>
     * A string containing one or more DNS names (or IP) and Sasl Scram port pairs.
     * </p>
     * 
     * @return <p>
     *         A string containing one or more DNS names (or IP) and Sasl Scram port pairs.
     *         </p>
     */

    public String getBootstrapBrokerStringSaslScram() {
        return this.bootstrapBrokerStringSaslScram;
    }

    /**
     * <p>
     * A string containing one or more DNS names (or IP) and Sasl Scram port pairs.
     * </p>
     * 
     * @param bootstrapBrokerStringSaslScram
     *        <p>
     *        A string containing one or more DNS names (or IP) and Sasl Scram port pairs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBootstrapBrokersResult withBootstrapBrokerStringSaslScram(String bootstrapBrokerStringSaslScram) {
        setBootstrapBrokerStringSaslScram(bootstrapBrokerStringSaslScram);
        return this;
    }

    /**
     * <p>
     * A string that contains one or more DNS names (or IP addresses) and SASL IAM port pairs.
     * </p>
     * 
     * @param bootstrapBrokerStringSaslIam
     *        <p>
     *        A string that contains one or more DNS names (or IP addresses) and SASL IAM port pairs.
     *        </p>
     */

    public void setBootstrapBrokerStringSaslIam(String bootstrapBrokerStringSaslIam) {
        this.bootstrapBrokerStringSaslIam = bootstrapBrokerStringSaslIam;
    }

    /**
     * <p>
     * A string that contains one or more DNS names (or IP addresses) and SASL IAM port pairs.
     * </p>
     * 
     * @return <p>
     *         A string that contains one or more DNS names (or IP addresses) and SASL IAM port pairs.
     *         </p>
     */

    public String getBootstrapBrokerStringSaslIam() {
        return this.bootstrapBrokerStringSaslIam;
    }

    /**
     * <p>
     * A string that contains one or more DNS names (or IP addresses) and SASL IAM port pairs.
     * </p>
     * 
     * @param bootstrapBrokerStringSaslIam
     *        <p>
     *        A string that contains one or more DNS names (or IP addresses) and SASL IAM port pairs.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBootstrapBrokersResult withBootstrapBrokerStringSaslIam(String bootstrapBrokerStringSaslIam) {
        setBootstrapBrokerStringSaslIam(bootstrapBrokerStringSaslIam);
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
        if (getBootstrapBrokerString() != null)
            sb.append("BootstrapBrokerString: ").append(getBootstrapBrokerString()).append(",");
        if (getBootstrapBrokerStringTls() != null)
            sb.append("BootstrapBrokerStringTls: ").append(getBootstrapBrokerStringTls()).append(",");
        if (getBootstrapBrokerStringSaslScram() != null)
            sb.append("BootstrapBrokerStringSaslScram: ").append(getBootstrapBrokerStringSaslScram()).append(",");
        if (getBootstrapBrokerStringSaslIam() != null)
            sb.append("BootstrapBrokerStringSaslIam: ").append(getBootstrapBrokerStringSaslIam());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBootstrapBrokersResult == false)
            return false;
        GetBootstrapBrokersResult other = (GetBootstrapBrokersResult) obj;
        if (other.getBootstrapBrokerString() == null ^ this.getBootstrapBrokerString() == null)
            return false;
        if (other.getBootstrapBrokerString() != null && other.getBootstrapBrokerString().equals(this.getBootstrapBrokerString()) == false)
            return false;
        if (other.getBootstrapBrokerStringTls() == null ^ this.getBootstrapBrokerStringTls() == null)
            return false;
        if (other.getBootstrapBrokerStringTls() != null && other.getBootstrapBrokerStringTls().equals(this.getBootstrapBrokerStringTls()) == false)
            return false;
        if (other.getBootstrapBrokerStringSaslScram() == null ^ this.getBootstrapBrokerStringSaslScram() == null)
            return false;
        if (other.getBootstrapBrokerStringSaslScram() != null
                && other.getBootstrapBrokerStringSaslScram().equals(this.getBootstrapBrokerStringSaslScram()) == false)
            return false;
        if (other.getBootstrapBrokerStringSaslIam() == null ^ this.getBootstrapBrokerStringSaslIam() == null)
            return false;
        if (other.getBootstrapBrokerStringSaslIam() != null && other.getBootstrapBrokerStringSaslIam().equals(this.getBootstrapBrokerStringSaslIam()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBootstrapBrokerString() == null) ? 0 : getBootstrapBrokerString().hashCode());
        hashCode = prime * hashCode + ((getBootstrapBrokerStringTls() == null) ? 0 : getBootstrapBrokerStringTls().hashCode());
        hashCode = prime * hashCode + ((getBootstrapBrokerStringSaslScram() == null) ? 0 : getBootstrapBrokerStringSaslScram().hashCode());
        hashCode = prime * hashCode + ((getBootstrapBrokerStringSaslIam() == null) ? 0 : getBootstrapBrokerStringSaslIam().hashCode());
        return hashCode;
    }

    @Override
    public GetBootstrapBrokersResult clone() {
        try {
            return (GetBootstrapBrokersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
