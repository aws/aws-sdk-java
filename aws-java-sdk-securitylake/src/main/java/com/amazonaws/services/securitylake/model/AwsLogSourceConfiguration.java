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
 * The Security Lake logs source configuration file describes the information needed to generate Security Lake logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/AwsLogSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsLogSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify the Amazon Web Services account information where you want to enable Security Lake.
     * </p>
     */
    private java.util.List<String> accounts;
    /**
     * <p>
     * Specify the Regions where you want to enable Security Lake.
     * </p>
     */
    private java.util.List<String> regions;
    /**
     * <p>
     * The name for a Amazon Web Services source. This must be a Regionally unique value.
     * </p>
     */
    private String sourceName;
    /**
     * <p>
     * The version for a Amazon Web Services source. This must be a Regionally unique value.
     * </p>
     */
    private String sourceVersion;

    /**
     * <p>
     * Specify the Amazon Web Services account information where you want to enable Security Lake.
     * </p>
     * 
     * @return Specify the Amazon Web Services account information where you want to enable Security Lake.
     */

    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * Specify the Amazon Web Services account information where you want to enable Security Lake.
     * </p>
     * 
     * @param accounts
     *        Specify the Amazon Web Services account information where you want to enable Security Lake.
     */

    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<String>(accounts);
    }

    /**
     * <p>
     * Specify the Amazon Web Services account information where you want to enable Security Lake.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccounts(java.util.Collection)} or {@link #withAccounts(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param accounts
     *        Specify the Amazon Web Services account information where you want to enable Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLogSourceConfiguration withAccounts(String... accounts) {
        if (this.accounts == null) {
            setAccounts(new java.util.ArrayList<String>(accounts.length));
        }
        for (String ele : accounts) {
            this.accounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the Amazon Web Services account information where you want to enable Security Lake.
     * </p>
     * 
     * @param accounts
     *        Specify the Amazon Web Services account information where you want to enable Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLogSourceConfiguration withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * Specify the Regions where you want to enable Security Lake.
     * </p>
     * 
     * @return Specify the Regions where you want to enable Security Lake.
     */

    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * Specify the Regions where you want to enable Security Lake.
     * </p>
     * 
     * @param regions
     *        Specify the Regions where you want to enable Security Lake.
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * Specify the Regions where you want to enable Security Lake.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        Specify the Regions where you want to enable Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLogSourceConfiguration withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new java.util.ArrayList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify the Regions where you want to enable Security Lake.
     * </p>
     * 
     * @param regions
     *        Specify the Regions where you want to enable Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLogSourceConfiguration withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * The name for a Amazon Web Services source. This must be a Regionally unique value.
     * </p>
     * 
     * @param sourceName
     *        The name for a Amazon Web Services source. This must be a Regionally unique value.
     * @see AwsLogSourceName
     */

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * <p>
     * The name for a Amazon Web Services source. This must be a Regionally unique value.
     * </p>
     * 
     * @return The name for a Amazon Web Services source. This must be a Regionally unique value.
     * @see AwsLogSourceName
     */

    public String getSourceName() {
        return this.sourceName;
    }

    /**
     * <p>
     * The name for a Amazon Web Services source. This must be a Regionally unique value.
     * </p>
     * 
     * @param sourceName
     *        The name for a Amazon Web Services source. This must be a Regionally unique value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsLogSourceName
     */

    public AwsLogSourceConfiguration withSourceName(String sourceName) {
        setSourceName(sourceName);
        return this;
    }

    /**
     * <p>
     * The name for a Amazon Web Services source. This must be a Regionally unique value.
     * </p>
     * 
     * @param sourceName
     *        The name for a Amazon Web Services source. This must be a Regionally unique value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AwsLogSourceName
     */

    public AwsLogSourceConfiguration withSourceName(AwsLogSourceName sourceName) {
        this.sourceName = sourceName.toString();
        return this;
    }

    /**
     * <p>
     * The version for a Amazon Web Services source. This must be a Regionally unique value.
     * </p>
     * 
     * @param sourceVersion
     *        The version for a Amazon Web Services source. This must be a Regionally unique value.
     */

    public void setSourceVersion(String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
     * <p>
     * The version for a Amazon Web Services source. This must be a Regionally unique value.
     * </p>
     * 
     * @return The version for a Amazon Web Services source. This must be a Regionally unique value.
     */

    public String getSourceVersion() {
        return this.sourceVersion;
    }

    /**
     * <p>
     * The version for a Amazon Web Services source. This must be a Regionally unique value.
     * </p>
     * 
     * @param sourceVersion
     *        The version for a Amazon Web Services source. This must be a Regionally unique value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLogSourceConfiguration withSourceVersion(String sourceVersion) {
        setSourceVersion(sourceVersion);
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
        if (getAccounts() != null)
            sb.append("Accounts: ").append(getAccounts()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getSourceName() != null)
            sb.append("SourceName: ").append(getSourceName()).append(",");
        if (getSourceVersion() != null)
            sb.append("SourceVersion: ").append(getSourceVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLogSourceConfiguration == false)
            return false;
        AwsLogSourceConfiguration other = (AwsLogSourceConfiguration) obj;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getSourceName() == null ^ this.getSourceName() == null)
            return false;
        if (other.getSourceName() != null && other.getSourceName().equals(this.getSourceName()) == false)
            return false;
        if (other.getSourceVersion() == null ^ this.getSourceVersion() == null)
            return false;
        if (other.getSourceVersion() != null && other.getSourceVersion().equals(this.getSourceVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getSourceName() == null) ? 0 : getSourceName().hashCode());
        hashCode = prime * hashCode + ((getSourceVersion() == null) ? 0 : getSourceVersion().hashCode());
        return hashCode;
    }

    @Override
    public AwsLogSourceConfiguration clone() {
        try {
            return (AwsLogSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.AwsLogSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
