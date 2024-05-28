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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon Security Lake can collect logs and events from natively-supported Amazon Web Services services and custom
 * sources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/LogSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify the account from which you want to collect logs.
     * </p>
     */
    private String account;
    /**
     * <p>
     * Specify the Regions from which you want to collect logs.
     * </p>
     */
    private String region;
    /**
     * <p>
     * Specify the sources from which you want to collect logs.
     * </p>
     */
    private java.util.List<LogSourceResource> sources;

    /**
     * <p>
     * Specify the account from which you want to collect logs.
     * </p>
     * 
     * @param account
     *        Specify the account from which you want to collect logs.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * Specify the account from which you want to collect logs.
     * </p>
     * 
     * @return Specify the account from which you want to collect logs.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * Specify the account from which you want to collect logs.
     * </p>
     * 
     * @param account
     *        Specify the account from which you want to collect logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSource withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * Specify the Regions from which you want to collect logs.
     * </p>
     * 
     * @param region
     *        Specify the Regions from which you want to collect logs.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Specify the Regions from which you want to collect logs.
     * </p>
     * 
     * @return Specify the Regions from which you want to collect logs.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Specify the Regions from which you want to collect logs.
     * </p>
     * 
     * @param region
     *        Specify the Regions from which you want to collect logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSource withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * Specify the sources from which you want to collect logs.
     * </p>
     * 
     * @return Specify the sources from which you want to collect logs.
     */

    public java.util.List<LogSourceResource> getSources() {
        return sources;
    }

    /**
     * <p>
     * Specify the sources from which you want to collect logs.
     * </p>
     * 
     * @param sources
     *        Specify the sources from which you want to collect logs.
     */

    public void setSources(java.util.Collection<LogSourceResource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<LogSourceResource>(sources);
    }

    /**
     * <p>
     * Specify the sources from which you want to collect logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        Specify the sources from which you want to collect logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSource withSources(LogSourceResource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<LogSourceResource>(sources.length));
        }
        for (LogSourceResource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the sources from which you want to collect logs.
     * </p>
     * 
     * @param sources
     *        Specify the sources from which you want to collect logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LogSource withSources(java.util.Collection<LogSourceResource> sources) {
        setSources(sources);
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
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogSource == false)
            return false;
        LogSource other = (LogSource) obj;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public LogSource clone() {
        try {
            return (LogSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.LogSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
